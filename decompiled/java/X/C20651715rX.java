package X;

import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15rX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20651715rX {
    public boolean LIZ;
    public C20610615ku LIZIZ;
    public Function2<? super String, ? super String, Unit> LIZLLL;
    public C20625815nM LJ;
    public Function1<? super Context, String> LJFF;
    public InterfaceC20658115sZ LJII;
    public InterfaceC20655515s9 LJIIIIZZ;
    public final C20652315rd LIZJ = new C20652315rd();
    public Function1<? super String, Unit> LJI = new C798200VSw();
    public boolean LJIIIZ = true;
    public boolean LJIIJ = true;
    public ExecutorService LJIIJJI = C786410Ut5.c4(new ThreadFactory() { // from class: X.0VSu
        public final AtomicInteger LL = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable);
            ThreadMethodProxy.setName(bPEAThread, C786410Ut5.j4("pop_layer_thread_%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.LL.getAndIncrement())}, 1)));
            return bPEAThread;
        }
    });
}
