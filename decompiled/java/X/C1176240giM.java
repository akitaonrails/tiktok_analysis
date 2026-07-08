package X;

import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM;

/* JADX INFO: renamed from: X.0giM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailPageVM", f = "PoiMapDetailPageVM.kt", l = {407, 428}, m = "loadPoiListData")
public final class C1176240giM extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ PoiMapDetailPageVM LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176240giM(PoiMapDetailPageVM poiMapDetailPageVM, InterfaceC1364105Vn<? super C1176240giM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = poiMapDetailPageVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapDetailPageVM@b8ac.loadPoiListData$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLJ.CQ2(null, false, false, 0L, this);
        C1C7U.LIZIZ("PoiMapDetailPageVM@b8ac.loadPoiListData$1");
        return objCQ2;
    }
}
