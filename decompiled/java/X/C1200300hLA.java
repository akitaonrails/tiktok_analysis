package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200300hLA extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200300hLA(boolean z) {
        super(1);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LL)), "has_poi");
        c1196140hES2.LIZIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LLILLJJLI)), "need_show_recommend_poi");
        return Unit.LIZ;
    }
}
