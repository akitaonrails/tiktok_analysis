package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.anchor.MovieTokAnchorBusinessService$handleIconClick$1$1$3", f = "MovieTokAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
public final class C613090O2x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O7A<? extends C0O3E> LL;
    public final /* synthetic */ C613440O4g LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ AnchorCommonStruct LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613090O2x(C0O7A c0o7a, AnchorCommonStruct anchorCommonStruct, C613440O4g c613440O4g, String str, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC497601wk interfaceC497601wk, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o7a;
        this.LLILLJJLI = c613440O4g;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = anchorCommonStruct;
        this.LLILZLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613090O2x(this.LL, this.LLILZIL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, this.LLILZLL, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2276411E8h.LIZIZ.LIZLLL("topic", ((C0O78) this.LL).LJFF);
        C613440O4g c613440O4g = this.LLILLJJLI;
        String str = this.LLILLL;
        Boolean bool = c613440O4g.LIZIZ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = this.LLILZ;
        }
        c613440O4g.LJIIL(Boolean.valueOf(zBooleanValue), str);
        C613440O4g c613440O4g2 = this.LLILLJJLI;
        C613440O4g.LJIJ(this.LLILZIL, this.LLILLL, Intrinsics.LJFF(c613440O4g2.LIZIZ, true));
        C2296808zG.LIZJ(this.LLILZLL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieTokAnchorBusinessService@ff9f.handleIconClick$1$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
