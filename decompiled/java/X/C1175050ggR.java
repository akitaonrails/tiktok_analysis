package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0ggR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.api.PoiMapModeRepository$operator$1", f = "PoiMapModeRepository.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT}, m = "fetchMapAndPoiList")
public final class C1175050ggR extends AbstractC23140094w {
    public C1175060ggS LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1175040ggQ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1175050ggR(C1175040ggQ c1175040ggQ, InterfaceC1364105Vn<? super C1175050ggR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1175040ggQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapModeRepository@190d.operator$1$fetchMapAndPoiList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("PoiMapModeRepository@190d.operator$1$fetchMapAndPoiList$1");
        return objLJJJLIIL;
    }
}
