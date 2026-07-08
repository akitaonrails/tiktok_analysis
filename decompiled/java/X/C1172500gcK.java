package X;

import com.ss.android.ugc.aweme.poi.collect.slash.PoiCollectListViewModelForSlashCell;

/* JADX INFO: renamed from: X.0gcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.collect.slash.PoiCollectListViewModelForSlashCell", f = "PoiCollectListViewModelForSlashCell.kt", l = {78}, m = "sendRequest")
public final class C1172500gcK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiCollectListViewModelForSlashCell LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172500gcK(PoiCollectListViewModelForSlashCell poiCollectListViewModelForSlashCell, InterfaceC1364105Vn<? super C1172500gcK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiCollectListViewModelForSlashCell;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCollectListViewModelForSlashCell@e675.sendRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(null, this);
        C1C7U.LIZIZ("PoiCollectListViewModelForSlashCell@e675.sendRequest$1");
        return objVQ2;
    }
}
