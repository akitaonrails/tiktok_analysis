package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.anchor.MovieTokAnchorBusinessService$handleIconClick$1$1$1", f = "MovieTokAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
public final class C613080O2w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C613440O4g LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AnchorCommonStruct LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613080O2w(C613440O4g c613440O4g, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC1364105Vn<? super C613080O2w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c613440O4g;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = anchorCommonStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613080O2w(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIL(Boolean.valueOf(this.LLILLL), this.LLILLJJLI);
        C613440O4g.LJIJ(this.LLILZ, this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
