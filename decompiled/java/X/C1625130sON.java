package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0sON, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625130sON extends AbstractC2255721DQs<InterfaceC1625140sOO> implements InterfaceC379610EuV, InterfaceC1625140sOO {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 664));
    public final C1625130sON LLILZIL = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1625130sON.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = 8;
    }

    private final C1664860tQS X1() {
        return (C1664860tQS) this.LLILZ.getValue();
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LL.add(R.id.sz5, X1(), "RecordComposeButtonScene");
    }

    public C1625130sON W1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C1625130sON(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
