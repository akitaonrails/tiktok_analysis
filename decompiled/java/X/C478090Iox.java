package X;

import Y.ARunnableS76S0200000_7;
import Y.AsS34S0100000_7;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkHangoutSampleDelaySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Iox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478090Iox {
    public final String LIZ;
    public final Function0<Window> LIZIZ;
    public final Handler LIZJ;
    public final AtomicInteger LIZLLL;
    public final CopyOnWriteArraySet<Runnable> LJ;
    public final CopyOnWriteArraySet<Runnable> LJFF;
    public volatile boolean LJI;
    public volatile long LJII;
    public volatile int LJIIIIZZ;
    public final AsS34S0100000_7 LJIIIZ;

    public C478090Iox() {
        throw null;
    }

    public final void LIZIZ() {
        Iterator<Runnable> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            this.LIZJ.removeCallbacks(it2.next());
        }
        this.LJ.clear();
        this.LJII = 0L;
    }

    public final void LIZJ() {
        Iterator<Runnable> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            this.LIZJ.removeCallbacks(it2.next());
        }
        this.LJFF.clear();
    }

    public final void LJI() {
        if (this.LIZLLL.decrementAndGet() <= 0) {
            this.LIZLLL.set(0);
            LIZIZ();
            LIZJ();
            if (this.LJI) {
                C1EOY.LIZ.LJJII(this.LIZ);
                this.LJI = false;
            }
        }
    }

    public final void LIZLLL() {
        LIZIZ();
        LIZJ();
        this.LJIIIIZZ = 0;
        if (this.LIZLLL.get() > 0 || this.LJI) {
            this.LIZLLL.set(0);
            if (this.LJI) {
                C1EOY.LIZ.LJJII(this.LIZ);
                this.LJI = false;
            }
        }
    }

    public final void LIZ(RecyclerView recyclerView) {
        this.LJIIIIZZ = recyclerView.getScrollState();
        if (this.LJIIIIZZ != 0) {
            LJFF(0L, true);
        }
        recyclerView.addOnScrollListener(this.LJIIIZ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, Y.ARunnableS76S0200000_7, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJ(long j) {
        Runnable runnable;
        long value = LiveSdkHangoutSampleDelaySetting.INSTANCE.getValue();
        LJFF(value, false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LJI) {
            value = 0;
        } else if (this.LJII > jCurrentTimeMillis) {
            value = this.LJII - jCurrentTimeMillis;
        }
        C259800zU c259800zU = new C259800zU();
        ?? aRunnableS76S0200000_7 = new ARunnableS76S0200000_7(this, c259800zU, 80);
        c259800zU.element = aRunnableS76S0200000_7;
        this.LJFF.add((Runnable) aRunnableS76S0200000_7);
        Handler handler = this.LIZJ;
        T t = c259800zU.element;
        if (t == 0) {
            runnable = null;
        } else {
            runnable = (Runnable) t;
        }
        if (j > Mp4ScreenVideoLoadTimeout.CONTROL) {
            j = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        C786410Ut5.LJLIIL(value + j, handler, runnable);
    }

    public C478090Iox(String str, Function0 function0) {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZ = str;
        this.LIZIZ = function0;
        this.LIZJ = bPEAHandler;
        this.LIZLLL = new AtomicInteger(0);
        this.LJ = new CopyOnWriteArraySet<>();
        this.LJFF = new CopyOnWriteArraySet<>();
        this.LJIIIZ = new AsS34S0100000_7(this, 12);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, Y.ARunnableS76S0200000_7, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJFF(long j, boolean z) {
        int iIncrementAndGet = this.LIZLLL.incrementAndGet();
        Runnable runnable = null;
        Window windowInvoke = null;
        if (z) {
            LIZIZ();
            if (this.LIZLLL.get() > 0 && !this.LJI) {
                C1EOY c1eoy = C1EOY.LIZ;
                String str = this.LIZ;
                Function0<Window> function0 = this.LIZIZ;
                if (function0 != null) {
                    windowInvoke = function0.invoke();
                }
                c1eoy.LJIJI(windowInvoke, str);
                this.LJI = true;
                return;
            }
            return;
        }
        if (iIncrementAndGet == 1) {
            LIZIZ();
            this.LJII = System.currentTimeMillis() + j;
            C259800zU c259800zU = new C259800zU();
            ?? aRunnableS76S0200000_7 = new ARunnableS76S0200000_7(this, c259800zU, 81);
            c259800zU.element = aRunnableS76S0200000_7;
            this.LJ.add((Runnable) aRunnableS76S0200000_7);
            Handler handler = this.LIZJ;
            T t = c259800zU.element;
            if (t != 0) {
                runnable = (Runnable) t;
            }
            C786410Ut5.LJLIIL(j, handler, runnable);
        }
    }
}
