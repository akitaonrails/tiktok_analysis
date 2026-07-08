package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.powerpermissions.FakeActivity;
import com.bytedance.ies.powerpermissions.FakeFragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19514111Wh extends AbstractC19515011Wq {
    public final Activity LIZIZ;
    public final FakeFragment LIZJ = null;
    public final InterfaceC19515111Wr LIZLLL;

    public C19514111Wh(Activity activity, InterfaceC19515111Wr interfaceC19515111Wr) {
        this.LIZIZ = activity;
        this.LIZLLL = interfaceC19515111Wr;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.11Wi, java.lang.Object] */
    @Override // X.AbstractC19515011Wq
    public final void LIZ(final C19514611Wm c19514611Wm, final String... strArr) {
        boolean z;
        boolean z2;
        Boolean boolValueOf;
        List<AbstractC19515011Wq> list;
        int length = strArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i < length) {
                String str = strArr[i];
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                Activity activity = this.LIZIZ;
                c19741112Lp.getClass();
                if (!C19741112Lp.LIZLLL(activity, str)) {
                    z2 = false;
                    break;
                }
                i++;
            } else {
                z2 = true;
                break;
            }
        }
        if (c19514611Wm != null && (list = c19514611Wm.LIZJ) != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!(it2.next() instanceof C19514311Wj)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (z2 && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArr) {
                arrayList2.add(new C0HWO(str2, EnumC442280HVy.GRANTED));
            }
            C19514011Wg.LIZIZ(14);
            InterfaceC19515111Wr interfaceC19515111Wr = this.LIZLLL;
            C0HWO[] c0hwoArr = (C0HWO[]) arrayList2.toArray(new C0HWO[0]);
            interfaceC19515111Wr.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
            return;
        }
        if (c19514611Wm != null) {
            ?? r5 = new Function1<C19EG, Unit>() { // from class: X.11Wi
                public final void LIZ(C19EG c19eg) {
                    if (c19eg.getSupportFragmentManager().LJJJJZI("PermissionFragment") == null) {
                        FakeFragment fakeFragment = this.LL.LIZJ;
                        if (fakeFragment == null) {
                            fakeFragment = new FakeFragment();
                        }
                        C19514611Wm c19514611Wm2 = c19514611Wm;
                        InterfaceC19515111Wr interfaceC19515111Wr2 = c19514611Wm2.LJFF;
                        if (interfaceC19515111Wr2 == null) {
                            interfaceC19515111Wr2 = this.LL.LIZLLL;
                        }
                        fakeFragment.LLILLJJLI = interfaceC19515111Wr2;
                        fakeFragment.LLILZLL = c19514611Wm2;
                        c19514611Wm2.LIZLLL = new WeakReference<>(fakeFragment);
                        C19514111Wh c19514111Wh = this.LL;
                        C19EH c19ehLJIIJ = c19eg.getSupportFragmentManager().LJIIJ();
                        c19ehLJIIJ.LIZLLL(fakeFragment, "PermissionFragment");
                        if (c19514111Wh.LIZJ == null) {
                            c19ehLJIIJ.LJIIJ();
                            return;
                        } else {
                            c19ehLJIIJ.LJIIJJI();
                            return;
                        }
                    }
                    C19514111Wh c19514111Wh2 = this.LL;
                    InterfaceC19515111Wr interfaceC19515111Wr3 = c19514111Wh2.LIZLLL;
                    C0HWO[] c0hwoArr2 = (C0HWO[]) ((ArrayList) C19514011Wg.LIZ(c19514111Wh2.LIZIZ, Arrays.asList(strArr))).toArray(new C0HWO[0]);
                    interfaceC19515111Wr3.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr2, c0hwoArr2.length));
                    C19514011Wg.LIZIZ(16);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(C19EG c19eg) {
                    LIZ(c19eg);
                    return Unit.LIZ;
                }
            };
            Activity activity2 = this.LIZIZ;
            if (activity2 instanceof C19EG) {
                r5.LIZ((C19EG) activity2);
                return;
            }
            Intent intent = new Intent(this.LIZIZ, (Class<?>) FakeActivity.class);
            Activity activity3 = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("permission-request-key-");
            sbLIZ.append(activity3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0DIJ.LIZ.put(strLIZIZ, (Function1<C19EG, Unit>) r5);
            intent.putExtra("power_permission_request_key", strLIZIZ);
            Activity activity4 = this.LIZIZ;
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity4, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity4);
            C2204961BRm.LJIILLIIL(activity4, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngeebyHfsFH+mQi0dZOY6CkWsgVheopYeR6KXJiQDRWzq/TPJX3LW6QScFcEZ0LEWChPQ=", null));
            return;
        }
        InterfaceC19515111Wr interfaceC19515111Wr2 = this.LIZLLL;
        C0HWO[] c0hwoArr2 = (C0HWO[]) ((ArrayList) C19514011Wg.LIZ(this.LIZIZ, Arrays.asList(strArr))).toArray(new C0HWO[0]);
        interfaceC19515111Wr2.LIZ((C0HWO[]) Arrays.copyOf(c0hwoArr2, c0hwoArr2.length));
        C19514011Wg.LIZIZ(17);
    }
}
