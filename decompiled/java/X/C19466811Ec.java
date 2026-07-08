package X;

import Y.ATListenerS461S0100000_29;
import android.content.Context;
import android.os.Message;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.11Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19466811Ec implements WeakHandler.IHandler {
    public final long LL;
    public final boolean LLILLJJLI;
    public int LLILLL;
    public final ViewPager LLILZIL;
    public boolean LLILZLL;
    public final Method LLIZLLLIL;
    public final boolean LLILZ = true;
    public final ATListenerS461S0100000_29 LLJ = new ATListenerS461S0100000_29(this, 21);
    public final WeakHandler LLIZ = new WeakHandler(this);

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public final void LIZ() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        this.LLIZ.removeCallbacksAndMessages(null);
        WeakHandler weakHandler = this.LLIZ;
        final long j = this.LL;
        C786410Ut5.LJLIIL(this.LL, weakHandler, new Runnable(this, j) { // from class: X.11Eb
            public final long LL;
            public final WeakReference<C19466811Ec> LLILLJJLI;

            public final void LIZ() throws Throwable {
                C19466811Ec c19466811Ec;
                WeakReference<C19466811Ec> weakReference = this.LLILLJJLI;
                if (weakReference == null || weakReference.get() == null || (c19466811Ec = this.LLILLJJLI.get()) == null || c19466811Ec.LLIZ == null || !c19466811Ec.LLILZLL) {
                    return;
                }
                int currentItem = c19466811Ec.LLILZIL.getCurrentItem() + (c19466811Ec.LLILLJJLI ? -1 : 1);
                if (currentItem < 0) {
                    currentItem += c19466811Ec.LLILLL;
                }
                Method method = c19466811Ec.LLIZLLLIL;
                if (method != null) {
                    try {
                        ViewPager viewPager = c19466811Ec.LLILZIL;
                        Boolean bool = Boolean.TRUE;
                        C2204961BRm.a0(method, viewPager, new Object[]{Integer.valueOf(currentItem), bool, bool, 1}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6hcJzByjdkkyKeX/i3MSDxB+5F2988IQZ7cLgOn1aO0OcLHis=", null));
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c19466811Ec.LLILZIL.setCurrentItem(currentItem, true);
                    } catch (InvocationTargetException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        c19466811Ec.LLILZIL.setCurrentItem(currentItem, true);
                    }
                } else {
                    c19466811Ec.LLILZIL.setCurrentItem(currentItem, true);
                }
                if (c19466811Ec.LLILZLL) {
                    C786410Ut5.LJLIIL(this.LL, c19466811Ec.LLIZ, this);
                } else {
                    c19466811Ec.LLIZ.removeCallbacksAndMessages(null);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ViewPagerSwitchHelper$AutoSwitchRunnable@89ef.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ViewPagerSwitchHelper$AutoSwitchRunnable@89ef.run");
            }

            {
                this.LLILLJJLI = new WeakReference<>(this);
                this.LL = j;
            }
        });
    }

    public C19466811Ec(ViewPager viewPager, long j) {
        this.LL = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLILZIL = viewPager;
        this.LL = j;
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", cls, cls2, cls2, cls);
            this.LLIZLLLIL = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        viewPager.setOnTouchListener(this.LLJ);
        Context context = viewPager.getContext();
        this.LLILLJJLI = context != null && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
