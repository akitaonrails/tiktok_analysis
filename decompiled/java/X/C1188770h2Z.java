package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188770h2Z extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188770h2Z(float f, int i, String str, boolean z, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = f;
        this.LLILZ = i;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LL)), "1:need to preload;0:need not to preload");
        c1196140hES2.LIZIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LLILLJJLI)), "1:duplicate click action; 0:click only once");
        c1196140hES2.LJI((int) (this.LLILLL * 10000), "ctr predict score");
        c1196140hES2.LIZLLL = new Pair<>("time gap between anchor show and clicked", Integer.valueOf(this.LLILZ));
        c1196140hES2.LJIIIIZZ = new Pair<>("ctr predict strategy", "feed_ctr");
        c1196140hES2.LJIIIZ = new Pair<>("enter from", this.LLILZIL);
        return Unit.LIZ;
    }
}
