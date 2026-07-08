package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0auX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953150auX extends C09AY implements Function2<String, String, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EnumC937290aUx LLILLJJLI;
    public final /* synthetic */ EnumC953330aup LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C917840Zza LLILZIL;
    public final /* synthetic */ EnumC952890au7 LLILZLL;
    public final /* synthetic */ C916750Zxp LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C953150auX(String str, EnumC937290aUx enumC937290aUx, EnumC953330aup enumC953330aup, String str2, C917840Zza c917840Zza, EnumC952890au7 enumC952890au7, C916750Zxp c916750Zxp, String str3, String str4) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = enumC937290aUx;
        this.LLILLL = enumC953330aup;
        this.LLILZ = str2;
        this.LLILZIL = c917840Zza;
        this.LLILZLL = enumC952890au7;
        this.LLIZ = c916750Zxp;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String str3 = str;
        if (str3.length() > 0) {
            C953620avI.LIZLLL(C953140auW.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, null, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null, null, null, this.LLJ, str3));
        } else {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131855118));
        }
        return Unit.LIZ;
    }
}
