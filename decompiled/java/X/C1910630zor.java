package X;

import Y.ACallableS98S0101000_28;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.donation.DonateResponse;
import com.ss.android.ugc.aweme.donation.DonorStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910630zor extends AbstractC1255880imo<DonorStruct, DonateResponse> {
    public final String LL;
    public final Integer LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Long LLILZLL;
    public final Integer LLIZ;
    public final String LLIZLLLIL;
    public final InterfaceC1910610zop LLJ;
    public final InterfaceC1910610zop LLJI;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<DonorStruct> getItems() {
        List<DonorStruct> list;
        DonateResponse donateResponse = (DonateResponse) this.mData;
        if (donateResponse == null || (list = donateResponse.donorList) == null) {
            return null;
        }
        return new ArrayList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        DonateResponse donateResponse = (DonateResponse) this.mData;
        if (donateResponse != null) {
            return Intrinsics.LJFF(donateResponse.hasMore, Boolean.TRUE);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, com.ss.android.ugc.aweme.donation.DonateResponse] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.ss.android.ugc.aweme.donation.DonateResponse, java.lang.Object] */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        ?? r8 = (DonateResponse) obj;
        if (this.mListQueryType == 4) {
            if (r8 != 0) {
                T t = this.mData;
                if (t == 0) {
                    this.mData = r8;
                    return;
                }
                if (r8.donorList == null) {
                    return;
                }
                Collection arrayList = ((DonateResponse) t).donorList;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                Collection collection = r8.donorList;
                if (collection == null) {
                    collection = C13BV.INSTANCE;
                }
                arrayList2.addAll(collection);
                DonateResponse donateResponse = (DonateResponse) this.mData;
                this.mData = new DonateResponse(donateResponse.ngo, arrayList2, r8.cursor, r8.hasMore, donateResponse.banner, donateResponse.donationSummary);
                return;
            }
            return;
        }
        super.handleData(r8);
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        int iIntValue;
        Integer num = getData().cursor;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS98S0101000_28(this, iIntValue, 0), 0);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS98S0101000_28(this, 0, 0), 0);
    }

    public C1910630zor(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Long l) {
        this.LL = str;
        this.LLILLJJLI = num;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = l;
        this.LLIZ = num2;
        this.LLIZLLLIL = str5;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        String str6 = C0CQT.LIZJ;
        this.LLJ = (InterfaceC1910610zop) iRetrofitFactory.createBuilder(str6).build().retrofit.LIZ(InterfaceC1910610zop.class);
        this.LLJI = (InterfaceC1910610zop) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str6).build().retrofit.LIZ(InterfaceC1910610zop.class);
    }
}
