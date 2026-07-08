package X;

import com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM;

/* JADX INFO: renamed from: X.0ClW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.amusement.PoiAmusementListSharedVM", f = "PoiAmusementListSharedVM.kt", l = {188}, m = "loadVideoList")
public final class C323080ClW extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiAmusementListSharedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323080ClW(PoiAmusementListSharedVM poiAmusementListSharedVM, InterfaceC1364105Vn<? super C323080ClW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiAmusementListSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiAmusementListSharedVM@e0b1.loadVideoList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.CQ2(null, this);
        C1C7U.LIZIZ("PoiAmusementListSharedVM@e0b1.loadVideoList$1");
        return objCQ2;
    }
}
