package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0guE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183600guE extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183600guE(boolean z, int i, int i2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LL)), "is request success");
        c1196140hES2.LIZIZ(this.LLILLJJLI, "response server error_code");
        c1196140hES2.LIZJ(this.LLILLL, "region list size of response");
        return Unit.LIZ;
    }
}
