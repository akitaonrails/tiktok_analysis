package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188160h1a extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188160h1a(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LJ("type_level", this.LL);
        c1196140hES2.LIZ(this.LLILLJJLI ? 1 : 0, "poi_page_multi_post_tabs");
        c1196140hES2.LIZIZ(this.LLILLL ? 1 : 0, "poi_detail_post_container_opt");
        c1196140hES2.LIZJ(this.LLILZ ? 1 : 0, "poi_detail_non_regional_post_water_full");
        c1196140hES2.LIZLLL(this.LLILZIL ? 1 : 0, "is_waterfall_in_post");
        return Unit.LIZ;
    }
}
