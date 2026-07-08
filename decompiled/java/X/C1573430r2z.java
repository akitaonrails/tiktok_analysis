package X;

import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaCategoryContentListModel;

/* JADX INFO: renamed from: X.0r2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minidrama.tab.v2.DramaCategoryContentListModel", f = "DramaCategoryContentListModel.kt", l = {105}, m = "requestDataWithPagination")
public final class C1573430r2z extends AbstractC23140094w {
    public boolean LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ DramaCategoryContentListModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573430r2z(DramaCategoryContentListModel dramaCategoryContentListModel, InterfaceC1364105Vn<? super C1573430r2z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = dramaCategoryContentListModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DramaCategoryContentListModel@46d.requestDataWithPagination$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZIL.wQ2(null, false, this);
        C1C7U.LIZIZ("DramaCategoryContentListModel@46d.requestDataWithPagination$1");
        return objWQ2;
    }
}
