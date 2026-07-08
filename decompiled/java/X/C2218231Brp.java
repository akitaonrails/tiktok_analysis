package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1Brp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218231Brp implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Function1<? super byte[], Unit> LLILZIL = AFwS281S0000000_34.get$arr$(70);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 182));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 181));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2218231Brp.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void LIZ() {
        this.LLILLL = false;
        this.LLILZ = false;
        ((C0EZE) this.LLILZLL.getValue()).LIZLLL(C1462900oAi.LIZIZ);
        ((C0EZE) this.LLILZLL.getValue()).LIZJ.setRecorderListener(null);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C2218231Brp(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
    }
}
