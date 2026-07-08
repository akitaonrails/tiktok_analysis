package X;

import Y.ATListenerS451S0100000_18;
import android.content.Context;
import android.os.Message;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0hGE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197240hGE implements WeakHandler.IHandler {
    public final ViewPager LL;
    public final boolean LLILLL;
    public int LLILZ;
    public Boolean LLILZLL;
    public boolean LLIZ;
    public final Method LLJ;
    public final long LLILLJJLI = Mp4ScreenVideoLoadTimeout.CONTROL;
    public final boolean LLILZIL = true;
    public final ATListenerS451S0100000_18 LLJI = new ATListenerS451S0100000_18(this, 12);
    public final WeakHandler LLIZLLLIL = new WeakHandler(this);

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public final void LIZ() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        WeakHandler weakHandler = this.LLIZLLLIL;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        WeakHandler weakHandler2 = this.LLIZLLLIL;
        if (weakHandler2 != null) {
            final long j = this.LLILLJJLI;
            C786410Ut5.LJLIIL(this.LLILLJJLI, weakHandler2, new Runnable(this, j) { // from class: X.0hGD
                public final long LL;
                public final WeakReference<C1197240hGE> LLILLJJLI;

                public final void LIZ() throws Throwable {
                    C1197240hGE c1197240hGE;
                    WeakReference<C1197240hGE> weakReference = this.LLILLJJLI;
                    if (weakReference == null || weakReference.get() == null || (c1197240hGE = this.LLILLJJLI.get()) == null || c1197240hGE.LLIZLLLIL == null || !c1197240hGE.LLIZ) {
                        return;
                    }
                    c1197240hGE.LLILZLL = Boolean.FALSE;
                    int iLIZJ = C1175120ggY.LIZJ(Integer.valueOf(c1197240hGE.LL.getCurrentItem())) + (c1197240hGE.LLILLL ? -1 : 1);
                    if (iLIZJ < 0) {
                        iLIZJ += c1197240hGE.LLILZ;
                    }
                    Method method = c1197240hGE.LLJ;
                    if (method != null) {
                        try {
                            ViewPager viewPager = c1197240hGE.LL;
                            Boolean bool = Boolean.TRUE;
                            C2204961BRm.a0(method, viewPager, new Object[]{Integer.valueOf(iLIZJ), bool, bool, 1}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHb1SWFY0Xe2xg7sdQOjLck2Evbo3qm3Hig+q8cE3WkPLb1+AnM", null));
                        } catch (IllegalAccessException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1197240hGE.LL.setCurrentItem(iLIZJ, true);
                        } catch (InvocationTargetException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c1197240hGE.LL.setCurrentItem(iLIZJ, true);
                        }
                    } else {
                        c1197240hGE.LL.setCurrentItem(iLIZJ, true);
                    }
                    if (c1197240hGE.LLIZ) {
                        WeakHandler weakHandler3 = c1197240hGE.LLIZLLLIL;
                        if (weakHandler3 != null) {
                            C786410Ut5.LJLIIL(this.LL, weakHandler3, this);
                            return;
                        }
                        return;
                    }
                    WeakHandler weakHandler4 = c1197240hGE.LLIZLLLIL;
                    if (weakHandler4 != null) {
                        weakHandler4.removeCallbacksAndMessages(null);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ViewPagerSwitchHelper$AutoSwitchRunnable@e757.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ViewPagerSwitchHelper$AutoSwitchRunnable@e757.run");
                }

                {
                    this.LL = j;
                    this.LLILLJJLI = new WeakReference<>(this);
                }
            });
        }
    }

    public C1197240hGE(ViewPager viewPager) {
        this.LL = viewPager;
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", cls, cls2, cls2, cls);
            this.LLJ = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LL.setOnTouchListener(this.LLJI);
        Context context = this.LL.getContext();
        this.LLILLL = context != null && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
