package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ewh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108250ewh extends C09AY implements Function1<C1081600eFi, Unit> {
    public final /* synthetic */ C1108220ewe LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108250ewh(C1108220ewe c1108220ewe) {
        super(1);
        this.LL = c1108220ewe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1081600eFi c1081600eFi) {
        boolean z;
        C1081600eFi c1081600eFi2 = c1081600eFi;
        C1108220ewe c1108220ewe = this.LL;
        EnumC918970a1P enumC918970a1P = c1081600eFi2.LIZ;
        if ((enumC918970a1P != EnumC918970a1P.FLOATING || c1081600eFi2.LIZIZ <= 0) && enumC918970a1P != EnumC918970a1P.FLOATING_FIX) {
            z = false;
        } else {
            z = true;
        }
        c1108220ewe.LIZ(z);
        return Unit.LIZ;
    }
}
