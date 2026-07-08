package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.MessageFeatureControl;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1Bxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221981Bxs implements InterfaceC2222101By4 {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final HandlerThreadC2221801Bxa LIZ = new a() { // from class: X.1Bxa
        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
            try {
                bpea_origin_onLooperPrepared();
                if (zLJ) {
                    C0W9U.LJFF();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        public final void bpea_origin_onLooperPrepared() {
            super.onLooperPrepared();
            if (isAlive()) {
                Iterator<InterfaceC2222251ByJ> it2 = this.LL.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                C2222221ByG c2222221ByG = this.LL.LJIIJ;
                if (c2222221ByG.LIZ.compareTo(EnumC20103013lE.STARTED) >= 0) {
                    Iterator<InterfaceC2222251ByJ> it3 = this.LL.LJIIJJI.iterator();
                    while (it3.hasNext()) {
                        it3.next().onStart();
                    }
                }
            }
        }

        {
            super("MessagePortal");
        }
    };
    public final HandlerThread LIZIZ = new HandlerThread("MessagePortal-Request");
    public C2222081By2 LIZJ;
    public C2222341ByS LIZLLL;
    public final C2222271ByL LJ;
    public final C2222001Bxu LJFF;
    public final C2222041Bxy LJI;
    public final C2222051Bxz LJII;
    public MessageMonitor LJIIIIZZ;
    public final C2222171ByB LJIIIZ;
    public final C2222221ByG LJIIJ;
    public final List<InterfaceC2222251ByJ> LJIIJJI;
    public final MessageFeatureControl LJIIL;

    @Override // X.InterfaceC2222381ByW
    public final C2222081By2 LIZ() {
        C2222081By2 c2222081By2 = this.LIZJ;
        if (c2222081By2 == null) {
            return null;
        }
        return c2222081By2;
    }

    @Override // X.InterfaceC2222101By4
    public final MessageMonitor LIZIZ() {
        MessageMonitor messageMonitor = this.LJIIIIZZ;
        if (messageMonitor == null) {
            return null;
        }
        return messageMonitor;
    }

    public final C2222341ByS LJIIJ() {
        C2222341ByS c2222341ByS = this.LIZLLL;
        if (c2222341ByS != null) {
            return c2222341ByS;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Bxa] */
    public C2221981Bxs() {
        C2222271ByL c2222271ByL = new C2222271ByL();
        this.LJ = c2222271ByL;
        C2222001Bxu c2222001Bxu = new C2222001Bxu(this);
        this.LJFF = c2222001Bxu;
        C2222041Bxy c2222041Bxy = new C2222041Bxy(this);
        this.LJI = c2222041Bxy;
        C2222051Bxz c2222051Bxz = new C2222051Bxz(this);
        this.LJII = c2222051Bxz;
        C2222171ByB c2222171ByB = new C2222171ByB(this);
        this.LJIIIZ = c2222171ByB;
        C2222221ByG c2222221ByG = new C2222221ByG();
        this.LJIIJ = c2222221ByG;
        this.LJIIJJI = C1697810uHb.LJIILJJIL(c2222051Bxz, c2222271ByL, c2222041Bxy, c2222001Bxu, c2222221ByG, c2222171ByB);
        this.LJIIL = new MessageFeatureControl(this);
    }

    public final void LJIIL() {
        boolean zLJI = MethodIDManager.LJI(202531);
        LIZIZ().log("MessagePortal", "startMessage");
        if ((this.LJIIJ.LIZIZ(EnumC20103013lE.INITED) || this.LJIIJ.LIZIZ(EnumC20103013lE.READY) || this.LJIIJ.LIZIZ(EnumC20103013lE.STOPED) || this.LJIIJ.LIZIZ(EnumC20103013lE.RELEASED)) && C786410Ut5.W2(this.LIZ) != null) {
            Iterator<InterfaceC2222251ByJ> it2 = this.LJIIJJI.iterator();
            while (it2.hasNext()) {
                it2.next().onStart();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC2222101By4
    public final C2222341ByS context() {
        return LJIIJ();
    }

    @Override // X.InterfaceC2222101By4
    public final C2222171ByB LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC2222101By4
    public final C2222271ByL LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC2222101By4
    public final C2222051Bxz LJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC2222101By4
    public final C2222001Bxu LJIIIIZZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC2222101By4
    public final C2222221ByG e8() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC2222101By4
    public final BPEAHandler LJFF(Handler.Callback callback) {
        return new BPEAHandler(C786410Ut5.W2(this.LIZ), callback);
    }

    @Override // X.InterfaceC2222101By4
    public final BPEAHandler LJI(Handler.Callback callback) {
        return new BPEAHandler(Looper.getMainLooper(), callback);
    }

    @Override // X.InterfaceC2222101By4
    public final BPEAHandler LJII(C1D12 c1d12) {
        return new BPEAHandler(C786410Ut5.W2(this.LIZIZ), c1d12);
    }

    public final void LJIIIZ(C2222081By2 c2222081By2) {
        long roomId;
        IMessageWsClient iMessageWsClient;
        this.LIZJ = c2222081By2;
        C2221921Bxm c2221921Bxm = c2222081By2.LIZJ;
        C2222121By6 c2222121By6 = new C2222121By6(c2221921Bxm.LIZ, c2221921Bxm.LIZIZ, 1.0d);
        this.LJIIIIZZ = new MessageMonitor(c2222121By6);
        c2222121By6.LIZLLL = c2222081By2;
        this.LIZLLL = new C2222341ByS(this);
        C2222341ByS c2222341BySLJIIJ = LJIIJ();
        C2222241ByI c2222241ByI = c2222081By2.LIZIZ.LIZIZ;
        if (c2222241ByI != null && (iMessageWsClient = c2222241ByI.LIZ) != null) {
            roomId = iMessageWsClient.getRoomId();
        } else {
            roomId = 0;
        }
        c2222341BySLJIIJ.LIZJ = roomId;
        Iterator<InterfaceC2222251ByJ> it2 = this.LJIIJJI.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(c2222081By2);
        }
        if (C786410Ut5.W2(this.LIZ) != null) {
            Iterator<InterfaceC2222251ByJ> it3 = this.LJIIJJI.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ();
            }
        }
        if (C786410Ut5.W2(this.LIZIZ) == null) {
            this.LIZIZ.start();
        }
        if (C786410Ut5.W2(this.LIZ) == null) {
            start();
        }
    }

    public final void LJIIJJI(IMessage iMessage, boolean z) throws Exception {
        LIZIZ().log("MessagePortal", "insertMessage");
        C2222001Bxu c2222001Bxu = this.LJFF;
        c2222001Bxu.getClass();
        iMessage.getExtraParams().put("extra_message_is_client_insert", Boolean.TRUE);
        if (z) {
            c2222001Bxu.LIZLLL(iMessage);
        } else {
            c2222001Bxu.LJIIJ(iMessage);
        }
    }
}
