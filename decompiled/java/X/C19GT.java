package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.19GT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19GT {
    public static final C19GV LL = new C19GV(new Executor() { // from class: X.0Wv8
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new PthreadThread(runnable, "AppCompatDelegate$ThreadPerTaskExecutor").start();
        }
    });
    public static int LLILLJJLI = -100;
    public static C838510Wuv LLILLL = null;
    public static C838510Wuv LLILZ = null;
    public static Boolean LLILZIL = null;
    public static boolean LLILZLL = false;
    public static final C835410Wpv<WeakReference<C19GT>> LLIZ = new C835410Wpv<>();
    public static final Object LLIZLLLIL = new Object();
    public static final Object LLJ = new Object();

    public abstract void LIZJ(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean LIZLLL();

    public Context LJ(Context context) {
        return context;
    }

    public abstract <T extends View> T LJFF(int i);

    public Context LJI() {
        return null;
    }

    public abstract C19GZ LJII();

    public int LJIIIIZZ() {
        return -100;
    }

    public abstract MenuInflater LJIIIZ();

    public abstract C19W7 LJIIJ();

    public abstract void LJIIJJI();

    public abstract void LJIIL();

    public abstract void LJIILJJIL(Configuration configuration);

    public abstract void LJIILL();

    public abstract void LJIILLIIL();

    public abstract void LJIIZILJ();

    public abstract void LJIJ();

    public abstract void LJIJI();

    public abstract void LJIJJ();

    public abstract void LJIJJLI();

    public abstract boolean LJJ(int i);

    public abstract void LJJI(int i);

    public abstract void LJJIFFI(View view);

    public abstract void LJJII(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void LJJIIJ();

    public abstract void LJJIIJZLJL(C19V8 c19v8);

    public void LJJIIZ(int i) {
    }

    public abstract void LJJIIZI(CharSequence charSequence);

    public abstract AbstractC21549319Vb LJJIJ(InterfaceC21549419Vc interfaceC21549419Vc);

    public static boolean LJIILIIL(Context context) {
        int iLIZ;
        if (LLILZIL == null) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    iLIZ = C2409409cK.LIZ() | 128;
                } else {
                    iLIZ = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), iLIZ).metaData;
                if (bundle != null) {
                    LLILZIL = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                LLILZIL = Boolean.FALSE;
            }
        }
        return LLILZIL.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIL(C19GT c19gt) {
        synchronized (LLIZLLLIL) {
            try {
                C835410Wpv<WeakReference<C19GT>> c835410Wpv = LLIZ;
                c835410Wpv.getClass();
                C835430Wpx c835430Wpx = new C835430Wpx(c835410Wpv);
                while (c835430Wpx.hasNext()) {
                    C19GT c19gt2 = (C19GT) ((WeakReference) c835430Wpx.next()).get();
                    if (c19gt2 == c19gt || c19gt2 == null) {
                        c835430Wpx.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIII(int i) {
        if ((i != -1 && i != 0 && i != 1 && i != 2 && i != 3) || LLILLJJLI == i) {
            return;
        }
        LLILLJJLI = i;
        synchronized (LLIZLLLIL) {
            try {
                C835410Wpv<WeakReference<C19GT>> c835410Wpv = LLIZ;
                c835410Wpv.getClass();
                C835430Wpx c835430Wpx = new C835430Wpx(c835410Wpv);
                while (c835430Wpx.hasNext()) {
                    C19GT c19gt = (C19GT) ((WeakReference) c835430Wpx.next()).get();
                    if (c19gt != null) {
                        c19gt.LIZLLL();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
