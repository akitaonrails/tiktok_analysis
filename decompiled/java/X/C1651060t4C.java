package X;

import iyl.i3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t4C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651060t4C extends AbstractC1651430t4n {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1664740tQG LLILZLL;
    public final EnumC1651770t5L LLIZ;
    public final AwS569S0100000_25 LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1651060t4C.class, "duetLayoutApiComponent", "getDuetLayoutApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/duet/DuetLayoutApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1651450t4p
    public final Function0<i3> LJI() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC1651450t4p
    public final EnumC1651770t5L LJIIIZ() {
        return this.LLIZ;
    }

    public C1651060t4C(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1651180t4O.class, null);
        this.LLIZ = EnumC1651770t5L.DUET_LAYOUT;
        this.LLIZLLLIL = new AwS569S0100000_25(this, 801);
    }

    @Override // X.AbstractC1651430t4n, X.InterfaceC1659130tHD
    public final /* bridge */ /* synthetic */ void LIZ(C1654400t9a c1654400t9a, Object obj) {
        LIZ(c1654400t9a, (i3) obj);
    }

    @Override // X.AbstractC1651430t4n
    /* JADX INFO: renamed from: LJIJ */
    public final void LIZ(C1654400t9a c1654400t9a, i3 i3Var) {
        super.LIZ(c1654400t9a, i3Var);
        InterfaceC1651180t4O interfaceC1651180t4O = (InterfaceC1651180t4O) this.LLILZLL.getValue(this, LLJ[0]);
        if (interfaceC1651180t4O != null) {
            interfaceC1651180t4O.Uk0();
        }
    }
}
