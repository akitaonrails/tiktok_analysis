package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2275961E6o extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ AnoleComponentModel LL;
    public final /* synthetic */ C1015310cWn LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2275961E6o(AnoleComponentModel anoleComponentModel, C1015310cWn c1015310cWn, boolean z, String str, String str2, String str3) {
        super(1);
        this.LL = anoleComponentModel;
        this.LLILLJJLI = c1015310cWn;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String string;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2275891E6h.LIZ.getClass();
        c1023640ckE2.withParam(C2275891E6h.LIZJ, Long.valueOf(this.LL.getID()));
        c1023640ckE2.withParam(C2275891E6h.LIZLLL, this.LL.type);
        c1023640ckE2.withParam(C2275891E6h.LJ, C1015310cWn.LJJIIZ(this.LL));
        c1023640ckE2.withParam(C2275891E6h.LJII, Boolean.valueOf(this.LLILLL));
        c1023640ckE2.withParam(C2275891E6h.LJIIIIZZ, this.LLILZ);
        C1002190cBd c1002190cBd = C2275891E6h.LJIIIZ;
        C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
        AnoleComponentModel anoleComponentModel = this.LL;
        c1015450cX1.getClass();
        Integer numLJ = C1015450cX1.LJ(anoleComponentModel);
        Long lValueOf = null;
        if (numLJ != null) {
            string = numLJ.toString();
        } else {
            string = null;
        }
        c1023640ckE2.withParam(c1002190cBd, string);
        c1023640ckE2.withParam(C2275891E6h.LJIIJ, C1015450cX1.LJFF(this.LL));
        c1023640ckE2.withParam(C2275891E6h.LJIIJJI, C1015450cX1.LJI(this.LL));
        C1002190cBd c1002190cBd2 = C2275891E6h.LJIIL;
        if (C1015450cX1.LIZJ(this.LL) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        }
        c1023640ckE2.withParam(c1002190cBd2, lValueOf);
        c1023640ckE2.withParam(C2275891E6h.LJIILIIL, C1015450cX1.LIZLLL(this.LL));
        c1023640ckE2.withParam(C2275891E6h.LJIJ, this.LLILZIL);
        c1023640ckE2.withParam(C2275891E6h.LJJIJL, this.LLILZLL);
        c1023640ckE2.withParam(C2275891E6h.LJIILJJIL, C1015450cX1.LJIIIZ(this.LL));
        c1023640ckE2.withParam(C2275891E6h.LJJIJLIJ, this.LL.containerType);
        return Unit.LIZ;
    }
}
