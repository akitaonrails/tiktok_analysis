package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Era, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377800Era extends C09AY implements Function1<C377830Erd, C377830Erd> {
    public final /* synthetic */ C377730ErT LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC378720Et4 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377800Era(C377730ErT c377730ErT, String str, EnumC378720Et4 enumC378720Et4, boolean z, boolean z2) {
        super(1);
        this.LL = c377730ErT;
        this.LLILLJJLI = str;
        this.LLILLL = enumC378720Et4;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C377830Erd invoke(C377830Erd c377830Erd) {
        EnumC378320EsQ enumC378320EsQ;
        C377830Erd c377830Erd2 = c377830Erd;
        C377730ErT c377730ErT = this.LL;
        C375830EoP c375830EoP = new C375830EoP(c377730ErT.R5(this.LLILLJJLI, c377730ErT.d6(this.LLILLL)));
        if (this.LLILZ) {
            enumC378320EsQ = EnumC378320EsQ.SHOW_WITH_ANIMATION;
        } else {
            enumC378320EsQ = EnumC378320EsQ.SHOW;
        }
        return C377830Erd.LIZ(c377830Erd2, this.LLILZIL, this.LLILLL, enumC378320EsQ, c375830EoP, null, null, null, null, null, null, null, this.LLILLJJLI, false, 196578);
    }
}
