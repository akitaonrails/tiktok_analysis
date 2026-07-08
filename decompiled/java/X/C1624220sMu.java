package X;

import com.ss.android.ugc.aweme.sticker.l0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0sMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624220sMu extends AbstractC2255721DQs<InterfaceC1623680sM2> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final l0 LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1624220sMu.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC2255721DQs
    public final /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1624220sMu(C1DRG c1drg) {
        this.LL = c1drg;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(214));
        this.LLILLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(213));
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        this.LLILZ = new l0(((q) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).w4(), ((q) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).C0().LJII(), new C1624210sMt(this));
    }
}
