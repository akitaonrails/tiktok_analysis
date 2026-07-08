package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188760h2Y extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188760h2Y(String str, float f, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = f;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LL)), "1:need to preload;0:need not to preload");
        c1196140hES2.LJI((int) (this.LLILLJJLI * 10000), "ctr predict score");
        c1196140hES2.LJ("ctr predict strategy", "feed_ctr");
        c1196140hES2.LJFF("enter from", this.LLILLL);
        return Unit.LIZ;
    }
}
