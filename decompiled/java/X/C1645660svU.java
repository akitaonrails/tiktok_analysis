package X;

import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0svU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645660svU extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final EnumC1651770t5L LLILZLL;
    public final EnumC1651310t4b LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final AwS569S0100000_25 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645660svU.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1645660svU.class, "recordGreenScreenUIApi", "getRecordGreenScreenUIApi()Lcom/ss/android/ugc/gamora/recorder/greenscreen/RecordGreenScreenUIApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651310t4b LJII() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1651450t4p
    public final /* bridge */ /* synthetic */ EnumC1651770t5L LJIIIZ() {
        return this.LLILZLL;
    }

    public C1645660svU(C1DRG c1drg) {
        super(c1drg);
        C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLILZLL = EnumC1651770t5L.GREEN_SCREEN;
        this.LLIZ = EnumC1651310t4b.SLIDE;
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1632360sa2.class, null);
        this.LLJ = new AwS569S0100000_25(this, 805);
    }

    @Override // X.AbstractC1651430t4n
    public final void LJIJI(C1654400t9a c1654400t9a) {
        InterfaceC1632360sa2 interfaceC1632360sa2 = (InterfaceC1632360sa2) this.LLIZLLLIL.getValue(this, LLJI[1]);
        if (interfaceC1632360sa2 != null) {
            interfaceC1632360sa2.wn0(LJFF().LLIZ, false);
        }
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZLLL(C1654400t9a c1654400t9a, Object obj) {
        LJIJI(c1654400t9a);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        super.LIZ(c1654400t9a, i3Var);
        InterfaceC1632360sa2 interfaceC1632360sa2 = (InterfaceC1632360sa2) this.LLIZLLLIL.getValue(this, LLJI[1]);
        if (interfaceC1632360sa2 != null) {
            interfaceC1632360sa2.wn0(LJFF().LLIZ, true);
        }
    }
}
