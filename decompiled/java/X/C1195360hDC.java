package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS41S2100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hDC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.anchor.eventtrack.PoiAnchorQualityTracker$poiVideoAnchorShow$1", f = "PoiAnchorQualityTracker.kt", l = {}, m = "invokeSuspend")
public final class C1195360hDC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1195400hDG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1195360hDC(C1195400hDG c1195400hDG, String str, String str2, InterfaceC1364105Vn<? super C1195360hDC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1195400hDG;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1195360hDC(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiAnchorQualityTracker@2c2d.poiVideoAnchorShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1195400hDG c1195400hDG = this.LL;
        if (c1195400hDG.LIZ != null && c1195400hDG.LIZIZ != null) {
            EnumC1195310hD7 enumC1195310hD7 = c1195400hDG.LIZJ;
        }
        C1195370hDD.LIZ.LIZJ("poi_anchor_feed_show", new AwS41S2100000_18(c1195400hDG, this.LLILLJJLI, this.LLILLL, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiAnchorQualityTracker@2c2d.poiVideoAnchorShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
