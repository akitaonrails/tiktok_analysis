package X;

import X.C1C7U;
import X.C2210511BfN;
import Y.ARunnableS134S0100000_34;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.applog.store.DbStore;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.1BfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210511BfN {
    public static final List<String> LJIIL = Collections.singletonList("TaskPresenter");
    public boolean LIZ;
    public volatile boolean LIZIZ;
    public C2210121Bek LJ;
    public Handler LJFF;
    public final C2209951BeT LJI;
    public final C2209901BeO LJIIIZ;
    public boolean LIZJ = true;
    public long LIZLLL = System.currentTimeMillis();
    public final List<C2210121Bek> LJII = new ArrayList();
    public boolean LJIIIIZZ = false;
    public final ARunnableS134S0100000_34 LJIIJ = new ARunnableS134S0100000_34(this, 5);
    public final ARunnableS134S0100000_34 LJIIJJI = new ARunnableS134S0100000_34(this, 6);

    public final Handler LIZ() {
        if (this.LJFF == null) {
            synchronized (this) {
                try {
                    if (this.LJFF == null) {
                        final Looper looper = C0V1A.LIZJ().getLooper();
                        this.LJFF = new BPEAHandler(looper) { // from class: com.bytedance.applog.task.TaskPresenter$1
                            @Override // android.os.Handler
                            public final void handleMessage(Message message) {
                                C1C7U.LIZ("TaskPresenter@6a7b.createHandler$1");
                                super.handleMessage(message);
                                boolean z = true;
                                if (message.what == 1) {
                                    if (this.LL.LJ != null) {
                                        Object messageObj = HandlerHook.getMessageObj(message.obj);
                                        if (messageObj instanceof String) {
                                            String str = (String) messageObj;
                                            boolean zEquals = Objects.equals(str, this.LL.LJ.LIZIZ);
                                            C2210511BfN c2210511BfN = this.LL;
                                            if (!c2210511BfN.LIZJ || !c2210511BfN.LIZIZ) {
                                                z = false;
                                            }
                                            if (zEquals && z) {
                                                this.LL.LJ.LJII = System.currentTimeMillis();
                                                C2210511BfN c2210511BfN2 = this.LL;
                                                c2210511BfN2.LJI.LIZLLL(c2210511BfN2.LJ);
                                                this.LL.LIZIZ(str);
                                                this.LL.getClass();
                                                C1C7U.LIZIZ("TaskPresenter@6a7b.createHandler$1");
                                                return;
                                            }
                                        }
                                    }
                                    this.LL.LJI.LIZ();
                                    this.LL.getClass();
                                }
                                C1C7U.LIZIZ("TaskPresenter@6a7b.createHandler$1");
                            }
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJFF;
    }

    public final void LIZIZ(String str) {
        Handler handlerLIZ = LIZ();
        handlerLIZ.removeMessages(1);
        C786410Ut5.LJLJLJ(handlerLIZ, Message.obtain(handlerLIZ, 1, str), Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public C2210511BfN(C2209901BeO c2209901BeO, DbStore dbStore, C2209771BeB c2209771BeB) {
        this.LJIIIZ = c2209901BeO;
        this.LJI = new C2209951BeT(c2209901BeO, dbStore, c2209771BeB);
    }
}
