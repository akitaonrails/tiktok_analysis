package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202050hNz extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202050hNz(String str, int i, int i2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        int iIntValue;
        C1196140hES c1196140hES2 = c1196140hES;
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(this.LL);
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        c1196140hES2.LIZ(iIntValue, "status_code");
        c1196140hES2.LJ("card_type", String.valueOf(this.LLILLJJLI));
        c1196140hES2.LIZIZ(this.LLILLL, "request_count");
        return Unit.LIZ;
    }
}
