package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: renamed from: X.1DpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267561DpC extends C09AY implements Function1<C2267501Dp6, Unit> {
    public final /* synthetic */ C2267581DpE LL;
    public final /* synthetic */ C2267581DpE LLILLJJLI;
    public final /* synthetic */ EnumC1679580toC LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C2267581DpE LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2267561DpC(C2267581DpE c2267581DpE, C2267581DpE c2267581DpE2, EnumC1679580toC enumC1679580toC, boolean z, C2267581DpE c2267581DpE3) {
        super(1);
        this.LL = c2267581DpE;
        this.LLILLJJLI = c2267581DpE2;
        this.LLILLL = enumC1679580toC;
        this.LLILZ = z;
        this.LLILZIL = c2267581DpE3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2267501Dp6 c2267501Dp6) {
        boolean z;
        C2267541DpA c2267541DpA;
        C2267501Dp6 c2267501Dp62 = c2267501Dp6;
        float f = 8;
        C2267471Dp3.LIZ(c2267501Dp62.LJI, this.LL.LIZJ, f, 4);
        float f2 = 12;
        C2267491Dp5.LIZ(c2267501Dp62.LIZLLL, this.LLILLJJLI.LIZIZ, f2, 4);
        InterfaceC2267531Dp9.LIZ.getClass();
        c2267501Dp62.LIZJ(C2267521Dp8.LIZ());
        c2267501Dp62.LIZ(new C2267511Dp7(AFwS283S0000000_35.get$arr$(192)));
        EnumC1679580toC enumC1679580toC = this.LLILLL;
        EnumC1679580toC enumC1679580toC2 = EnumC1679580toC.TEXT;
        if (enumC1679580toC == enumC1679580toC2 && this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        EnumC1679580toC enumC1679580toC3 = EnumC1679580toC.TEXT_INPUTTING;
        if (enumC1679580toC != enumC1679580toC3 && !z) {
            C2267491Dp5.LIZ(c2267501Dp62.LJFF, this.LLILLJJLI.LIZLLL, f2, 4);
        } else {
            C2267491Dp5.LIZ(c2267501Dp62.LJFF, this.LLILZIL.LIZIZ, f, 4);
        }
        EnumC1679580toC enumC1679580toC4 = this.LLILLL;
        if (enumC1679580toC4 != enumC1679580toC2 && enumC1679580toC4 != enumC1679580toC3) {
            c2267541DpA = C2267541DpA.LIZLLL;
        } else {
            c2267541DpA = C2267541DpA.LIZIZ;
        }
        c2267501Dp62.LIZIZ(c2267541DpA);
        return Unit.LIZ;
    }
}
