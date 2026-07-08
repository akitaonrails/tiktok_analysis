package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.topic.book.favorite.api.BookCollectionListApi;

/* JADX INFO: renamed from: X.0CqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326060CqK implements InterfaceC736910SvR<InterfaceC326040CqI> {
    public final BookCollectionListApi LL;
    public final C326050CqJ LLILLJJLI;

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0CqJ] */
    public C326060CqK() {
        BookCollectionListApi.LIZ.getClass();
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        this.LL = (BookCollectionListApi) iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(BookCollectionListApi.class);
        this.LLILLJJLI = new InterfaceC326040CqI() { // from class: X.0CqJ
            @Override // X.InterfaceC326040CqI
            public final Object LLFII(long j, C326030CqH c326030CqH) {
                return this.LL.LL.getBookCollectionList(j, 7, c326030CqH);
            }
        };
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
