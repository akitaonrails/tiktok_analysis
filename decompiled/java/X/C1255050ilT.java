package X;

import X.AbstractC1255880imo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ilT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255050ilT<T extends AbstractC1255880imo<Object, Object>> extends C1255920ims<T> {
    public final C1255060ilU<T> LLILZIL = new C1255060ilU<>();

    @Override // X.C1260870iur
    public final void LJIILJJIL() {
        C1255780ime c1255780ime;
        C11NJ c11nj;
        T t = this.LL;
        if ((t instanceof C1255780ime) && (c1255780ime = (C1255780ime) t) != null && (c11nj = c1255780ime.LLJJJIL) != null) {
            c11nj.LJ();
            c1255780ime.LLJJJIL = null;
        }
        super.LJIILJJIL();
        this.LLILZIL.LIZ.clear();
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        Aweme aweme;
        FeedItemList feedItemList;
        C1255780ime c1255780ime;
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        Integer numValueOf = (!(t instanceof C1255780ime) || (c1255780ime = (C1255780ime) t) == null) ? null : Integer.valueOf(c1255780ime.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSuccess type=");
        sbLIZ.append(numValueOf);
        C1248210iaR.LJ("MyProfileAwemePresenter", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.REQUEST, "TabListSuccess");
        if (numValueOf != null && numValueOf.intValue() == 4) {
            Object data = this.LL.getData();
            if ((data instanceof FeedItemList) && (feedItemList = (FeedItemList) data) != null) {
                BaseResponse baseResponse = new BaseResponse();
                baseResponse.status_code = feedItemList.status_code;
                baseResponse.status_msg = feedItemList.status_msg;
                BaseResponse.ServerTimeExtra serverTimeExtra = new BaseResponse.ServerTimeExtra();
                LogPbBean logPbBean = feedItemList.logPb;
                serverTimeExtra.logid = logPbBean != null ? logPbBean.getImprId() : null;
                baseResponse.extra = serverTimeExtra;
                C1206780hVc.LIZJ("/aweme/v1/aweme/listcollection/", "net", baseResponse);
            }
        }
        boolean z = false;
        if (numValueOf != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 14)) {
            T t2 = this.LL;
            AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) t2;
            C1255060ilU<T> c1255060ilU = this.LLILZIL;
            List items = ((AbstractC1255880imo) t2).getItems();
            if (!(items instanceof List)) {
                items = null;
            }
            c1255060ilU.getClass();
            if (items != null && !items.isEmpty() && (ListProtector.get(items, 0) instanceof Aweme) && !c1255060ilU.LIZ.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : items) {
                    if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (!c1255060ilU.LIZ.contains(C729980SkG.LIZJ(aweme)))) {
                        arrayList.add(obj);
                    }
                }
                items = arrayList;
            }
            abstractC1255880imo.setItems(items);
        }
        T t3 = this.LL;
        int i = ((AbstractC1255880imo) t3).mListQueryType;
        if (i == 1) {
            ((InterfaceC1212360hec) this.LLILLJJLI).LLJJJIL(((AbstractC1255880imo) t3).getItems(), ((AbstractC1255880imo) this.LL).isHasMore());
            return;
        }
        if (i == 2) {
            ((InterfaceC1212360hec) this.LLILLJJLI).mE(((AbstractC1255880imo) t3).getItems(), !((AbstractC1255880imo) this.LL).isNewDataEmpty());
            return;
        }
        if (i == 4) {
            InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI;
            List items2 = ((AbstractC1255880imo) t3).getItems();
            if (((AbstractC1255880imo) this.LL).isHasMore() && !((AbstractC1255880imo) this.LL).isNewDataEmpty()) {
                z = true;
            }
            interfaceC1212360hec.Pj(items2, z);
        }
    }

    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        C1255780ime c1255780ime;
        C1255780ime c1255780ime2;
        super.onFailed(exc);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed type=");
        T t = this.LL;
        Integer numValueOf = null;
        if ((t instanceof C1255780ime) && (c1255780ime2 = (C1255780ime) t) != null) {
            numValueOf = Integer.valueOf(c1255780ime2.LL);
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", error=");
        sbLIZ.append(exc);
        C1248210iaR.LIZJ("MyProfileAwemePresenter", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.REQUEST, "TabListFailed");
        T t2 = this.LL;
        if ((t2 instanceof C1255780ime) && (c1255780ime = (C1255780ime) t2) != null && c1255780ime.LL == 4) {
            Object data = t2.getData();
            if ((data instanceof FeedItemList) && data != null) {
                C1206780hVc.LIZIZ("/aweme/v1/aweme/listcollection/", exc);
            }
        }
    }
}
