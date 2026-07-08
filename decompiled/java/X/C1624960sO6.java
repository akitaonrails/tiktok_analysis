package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS71S0200000_2;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.aigc.IAigcStateHolder;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0sO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624960sO6 extends AbstractC2255721DQs<InterfaceC1624980sO8> implements InterfaceC379610EuV, InterfaceC1624980sO8 {
    public static final C1624970sO7 LLIZ = new Object() { // from class: X.0sO7
    };
    public static final int LLIZLLLIL = 8;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final C0LGA LLILZ = new C0LGA(getDiContainer());
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(301));
    public final InterfaceC1441305kZ<C0TBE> LLILZLL = new AObjectS246S0100000_25(this, 552);

    public InterfaceC1624980sO8 X1() {
        return this;
    }

    private final IAigcStateHolder W1() {
        return (IAigcStateHolder) this.LLILZIL.getValue();
    }

    private final void Z1() {
        if (this.LLILLJJLI.isAdded(this.LLILZ)) {
            return;
        }
        this.LLILLJJLI.add(this.LLILLL, this.LLILZ, "AigcRecordingInProgressComponent");
    }

    @Override // X.InterfaceC1624980sO8
    public void Xk2() {
        TuxTextView tuxTextView = this.LLILZ.LLJILJIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    @Override // X.InterfaceC1624980sO8
    public void fG0() {
        if (C0BMP.LIZ()) {
            Z1();
        }
        C0LGA c0lga = this.LLILZ;
        TuxTextView tuxTextView = c0lga.LLJILJIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 1;
        BPEAHandler bPEAHandler = c0lga.LLJIJIL;
        if (bPEAHandler != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS71S0200000_2(c118300cf, c0lga, 8));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!C0BMP.LIZ()) {
            Z1();
        }
        W1().LIZIZ().LIZ(this, this.LLILZLL);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        W1().LIZIZ().LIZIZ(this.LLILZLL);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    public C1624960sO6(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }
}
