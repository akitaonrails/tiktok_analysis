package X;

import Y.ARunnableS12S1200000_7;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0Isu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480540Isu {
    public static final C480630It3 LJIIIIZZ = new C480630It3();
    public int LIZ;
    public final InterfaceC480520Iss LIZJ;
    public Context LJI;
    public String LJII;
    public final C480530Ist LIZIZ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.0Ist
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            C480540Isu c480540Isu = this.LL;
            c480540Isu.LIZ = i;
            if (!c480540Isu.LIZLLL || c480540Isu.LJFF) {
                return;
            }
            if (i != -2 && i != -3 && i != -1) {
                if (i == 1) {
                    c480540Isu.getClass();
                    IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    if (C464660IKa.LIZ()) {
                        AbstractC1387200mCc topPage = iHostAction.getTopPage();
                        if (!iHostAction.isLivePlayActivity(topPage) && !iHostAction.isLivePlayRootFragment(topPage)) {
                            return;
                        }
                    } else {
                        Activity topActivity = iHostAction.getTopActivity();
                        Class<?> livePlayActivityClass = iHostAction.getLivePlayActivityClass();
                        if (topActivity == null || livePlayActivityClass == null || topActivity.getClass() != livePlayActivityClass) {
                            return;
                        }
                    }
                    C480540Isu c480540Isu2 = this.LL;
                    c480540Isu2.LJ = -1L;
                    c480540Isu2.LIZIZ(c480540Isu2.LJI, c480540Isu2.LJII, false);
                    C784440Upu.LIZ().LIZIZ(new C463510IFp(false, true));
                    return;
                }
                return;
            }
            c480540Isu.LJ = System.currentTimeMillis();
            C480540Isu c480540Isu3 = this.LL;
            c480540Isu3.LIZIZ(c480540Isu3.LJI, c480540Isu3.LJII, true);
            C784440Upu.LIZ().LIZIZ(new C463510IFp(true, true));
        }
    };
    public boolean LIZLLL = false;
    public long LJ = -1;
    public boolean LJFF = false;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ist] */
    public C480540Isu(InterfaceC480510Isr interfaceC480510Isr) {
        this.LIZJ = interfaceC480510Isr;
    }

    public final void LIZ(boolean z) {
        this.LIZLLL = z;
        if (z && this.LIZ != 1 && !C463690IGh.LIZ) {
            this.LJ = System.currentTimeMillis();
            LIZIZ(this.LJI, this.LJII, true);
            C784440Upu.LIZ().LIZIZ(new C463510IFp(true, true));
        }
    }

    public final void LIZJ(Context context, String str) {
        C480630It3 c480630It3 = LJIIIIZZ;
        if (c480630It3.LIZ == null) {
            synchronized (C480630It3.class) {
                try {
                    if (c480630It3.LIZ == null) {
                        c480630It3.LIZ = C786410Ut5.i4(new ThreadFactory() { // from class: X.0It4
                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new BPEAThread(runnable, "audio-focus-controller-thread");
                            }
                        });
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c480630It3.LIZ.execute(new ARunnableS12S1200000_7(this, context, str, 2));
    }

    public final void LIZIZ(Context context, String str, boolean z) {
        InterfaceC480520Iss interfaceC480520Iss = this.LIZJ;
        if (interfaceC480520Iss != null) {
            if (interfaceC480520Iss instanceof InterfaceC480510Isr) {
                ((InterfaceC480510Isr) interfaceC480520Iss).t0(str, "audio focus", z);
            } else {
                interfaceC480520Iss.LJJJJ(context, "audio focus", z);
            }
            C784440Upu.LIZ().LIZIZ(new C463510IFp(z, true));
        }
    }
}
