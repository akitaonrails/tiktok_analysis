package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0giQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.api.PoiMapDetailRepository$operator$1", f = "PoiMapDetailRepository.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT}, m = "fetchMapAndPoiList")
public final class C1176280giQ extends AbstractC23140094w {
    public C1176220giK LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1176230giL LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176280giQ(C1176230giL c1176230giL, InterfaceC1364105Vn<? super C1176280giQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1176230giL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapDetailRepository@9ebd.operator$1$fetchMapAndPoiList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJZ = this.LLILLL.LJJJJZ(null, this);
        C1C7U.LIZIZ("PoiMapDetailRepository@9ebd.operator$1$fetchMapAndPoiList$1");
        return objLJJJJZ;
    }
}
