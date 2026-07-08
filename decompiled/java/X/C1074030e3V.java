package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerpage.FakeFragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074030e3V {
    public static Class<? extends C19EG> LIZJ;
    public static boolean LIZLLL;
    public static final C1074030e3V LIZ = new C1074030e3V();
    public static String LIZIZ = "";
    public static final CopyOnWriteArraySet<InterfaceC1074040e3W> LJ = new CopyOnWriteArraySet<>();

    public final void LIZIZ() {
        LIZIZ = "com.ss.android.ugc.aweme.host.TikTokHostActivity";
        if (LIZLLL) {
            return;
        }
        synchronized (this) {
            try {
                if (!LIZLLL) {
                    LIZJ = Class.forName(LIZIZ);
                    LIZLLL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final Intent LIZ(Context context, Class<? extends Fragment> cls, Bundle bundle, Integer num) {
        LIZIZ();
        InterfaceC836760Ws6 interfaceC836760Ws6 = (InterfaceC836760Ws6) cls.getAnnotation(InterfaceC836760Ws6.class);
        if (interfaceC836760Ws6 != null) {
            Intent intent = new Intent();
            if (Intrinsics.LJFF(C13LE.LIZ(interfaceC836760Ws6.attachActivity()), C13LE.LIZ(C19EG.class))) {
                Class<? extends C19EG> cls2 = LIZJ;
                if (cls2 == null || intent.setClass(context, cls2) == null) {
                    throw new RuntimeException("No default FragmentActivity!!!");
                }
            } else {
                if (num != null) {
                    intent.setFlags(num.intValue());
                }
                intent.setClass(context, interfaceC836760Ws6.attachActivity());
            }
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("POWER_FRAGMENT_CLASS_NAME", cls.getName());
            return intent;
        }
        return null;
    }

    public final Intent LIZJ(Context context, Class<? extends Fragment> cls, Bundle bundle, int i, InterfaceC891260Yxo interfaceC891260Yxo, Uri uri, Integer num) {
        Activity activity;
        Intent intent;
        Fragment fragment;
        int iIntValue = i;
        Intent intentLIZ = LIZ(context, cls, bundle, num);
        if (intentLIZ == null) {
            return null;
        }
        intentLIZ.setData(uri);
        Iterator<InterfaceC1074040e3W> it2 = LJ.iterator();
        while (it2.hasNext()) {
            it2.next().onOpen(intentLIZ);
        }
        if (iIntValue == Integer.MIN_VALUE) {
            if (context instanceof Application) {
                intentLIZ.addFlags(268435456);
            }
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZ, context);
            C2204961BRm.LJJJJJL(context, intentLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngffP6WtgZAeMc5XgOuw==", null));
        } else if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            if (interfaceC891260Yxo != null && (activity instanceof C19EG)) {
                FakeFragment fakeFragment = new FakeFragment();
                fakeFragment.LL = interfaceC891260Yxo;
                C19EH c19ehLJIIJ = ((C19EG) activity).getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZLLL(fakeFragment, String.valueOf(System.currentTimeMillis()));
                c19ehLJIIJ.LJIIJJI();
                C1701330uNH.LIZ(intentLIZ, fakeFragment);
                C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngffP6WtgZAeMc5XgOuw==", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {intentLIZ, Integer.valueOf(iIntValue)};
                C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11087, "com/bytedance/ies/powerpage/FakeFragment", "startActivityForResult", fakeFragment, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11087, "com/bytedance/ies/powerpage/FakeFragment", "startActivityForResult", null, objArr, fakeFragment, c0wzw, false);
                    return intentLIZ;
                }
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                if (objArr2 != null) {
                    Object obj = objArr2[0];
                    Fragment fragment2 = fakeFragment;
                    if (obj != null) {
                        fragment2 = (Fragment) obj;
                    }
                    Object obj2 = objArr2[1];
                    if (obj2 != null) {
                        intent = (Intent) obj2;
                    } else {
                        intent = intentLIZ;
                    }
                    Object obj3 = objArr2[2];
                    fragment = fragment2;
                    if (obj3 != null) {
                        iIntValue = ((Integer) obj3).intValue();
                        fragment = fragment2;
                    }
                } else {
                    intent = intentLIZ;
                    fragment = fakeFragment;
                }
                fragment.startActivityForResult(intent, iIntValue);
                c0wst.LIZ(11087, "com/bytedance/ies/powerpage/FakeFragment", "startActivityForResult", null, objArr, fragment, c0wzw, true);
                return intentLIZ;
            }
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intentLIZ, activity);
            C2204961BRm.LJIIZILJ(iIntValue, activity, intentLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngffP6WtgZAeMc5XgOuw==", null));
            return intentLIZ;
        }
        return intentLIZ;
    }
}
