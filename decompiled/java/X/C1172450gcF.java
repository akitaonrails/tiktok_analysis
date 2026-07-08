package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectListViewModel;

/* JADX INFO: renamed from: X.0gcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.collect.PoiCollectListViewModel", f = "PoiCollectListViewModel.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "sendRequest")
public final class C1172450gcF extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PoiCollectListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172450gcF(PoiCollectListViewModel poiCollectListViewModel, InterfaceC1364105Vn<? super C1172450gcF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = poiCollectListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCollectListViewModel@bc1f.sendRequest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, this);
        C1C7U.LIZIZ("PoiCollectListViewModel@bc1f.sendRequest$1");
        return objVQ2;
    }
}
