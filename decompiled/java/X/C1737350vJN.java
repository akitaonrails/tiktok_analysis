package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vJN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737350vJN extends C09AY implements Function1<C1736830vIX, C1736830vIX> {
    public final /* synthetic */ EnumC1736950vIj LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737350vJN(float f, EnumC1736950vIj enumC1736950vIj) {
        super(1);
        this.LL = enumC1736950vIj;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1736830vIX invoke(C1736830vIX c1736830vIX) {
        C1736830vIX c1736830vIX2 = c1736830vIX;
        int i = C1737370vJP.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C1736830vIX.LIZ(c1736830vIX2, null, null, null, null, null, null, null, null, null, 0L, null, null, Pair.copy$default(c1736830vIX2.LLJJJ, null, Float.valueOf(this.LLILLJJLI), 1, null), null, 3145727);
            }
            return c1736830vIX2;
        }
        return C1736830vIX.LIZ(c1736830vIX2, null, null, null, null, null, null, null, null, null, 0L, null, null, Pair.copy$default(c1736830vIX2.LLJJJ, Float.valueOf(this.LLILLJJLI), null, 2, null), null, 3145727);
    }
}
