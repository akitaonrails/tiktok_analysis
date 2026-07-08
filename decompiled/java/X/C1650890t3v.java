package X;

import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650890t3v extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final EnumC1651770t5L LLIZLLLIL;
    public final AwS569S0100000_25 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1650890t3v.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1650890t3v.class, "hdrCameraApiComponent", "getHdrCameraApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/hdr/HDRCameraApiComponent;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC1651450t4p
    public final void LJIIJ() {
        LJIILIIL().bW1(!LJFF().LLIZ);
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLIZLLLIL;
    }

    public C1650890t3v(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1649220t1E.class, null);
        this.LLIZLLLIL = EnumC1651770t5L.HDR;
        this.LLJ = new AwS569S0100000_25(this, 806);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        super.LIZ(c1654400t9a, i3Var);
        boolean z = !i3Var.LLIZ;
        LJIIJJI(new AwS111S0110000_25(z, this, 16));
        LJIILIIL().bW1(!z);
        InterfaceC1649220t1E interfaceC1649220t1E = (InterfaceC1649220t1E) this.LLIZ.getValue(this, LLJI[1]);
        if (interfaceC1649220t1E != null) {
            interfaceC1649220t1E.nQ1(z);
        }
    }
}
