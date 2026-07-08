package X;

import Y.AfS152S0200000_16;
import Y.AfS179S0100000_10;
import Y.AfS185S0100000_16;
import android.app.Activity;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0dq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065740dq8 extends AbstractC1255880imo<Aweme, FeedsResponse> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final String LL;
    public final InterfaceC1065730dq7 LLILLJJLI;
    public final C11NJ LLILLL;
    public Activity LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return ((FeedsResponse) this.mData).list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((FeedsResponse) t).hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public final void handleData(FeedsResponse feedsResponse) {
        boolean z = true;
        this.LLILZLL++;
        if (feedsResponse != null) {
            this.mIsNewDataEmpty = feedsResponse.list.isEmpty();
            T t = this.mData;
            ((FeedsResponse) t).hasMore = feedsResponse.hasMore;
            ((FeedsResponse) t).list.addAll(feedsResponse.list);
            FeedsResponse feedsResponse2 = (FeedsResponse) this.mData;
            if (feedsResponse.list.size() <= 0) {
                z = false;
            }
            feedsResponse2.hasMore = z;
            ((FeedsResponse) this.mData).isNewUser = feedsResponse.isNewUser;
        }
    }

    public final void LJIIL(boolean z) {
        int i;
        this.mIsLoading = true;
        C11NJ c11nj = this.LLILLL;
        C1065760dqA c1065760dqA = InterfaceC1065750dq9.LIZ;
        String str = this.LLILZIL;
        String str2 = null;
        if (str == null) {
            str = null;
        }
        c1065760dqA.getClass();
        InterfaceC1065750dq9 interfaceC1065750dq9 = (InterfaceC1065750dq9) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(str).create(InterfaceC1065750dq9.class);
        String str3 = this.LLILZIL;
        if (str3 != null) {
            str2 = str3;
        }
        HashMap map = new HashMap();
        if (z) {
            i = 0;
        } else {
            i = this.LLILZLL;
        }
        map.put("page", String.valueOf(i));
        map.put("size", String.valueOf(this.LLIZ));
        c11nj.LIZ(interfaceC1065750dq9.LIZ(str2, map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 3), new AfS179S0100000_10(this, 0)));
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        LJIIL(false);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        LJIIL(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1065740dq8(FeedsResponse feedsResponse, String str, InterfaceC1065730dq7 interfaceC1065730dq7) {
        this.LL = str;
        this.LLILLJJLI = interfaceC1065730dq7;
        this.mData = feedsResponse;
        this.LLILLL = new C11NJ();
        this.LLIZ = 20;
    }

    public final void LJIIJ(int i, int i2, Activity activity, String str) {
        this.LLILZIL = str;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLILZ = activity;
        C11NJ c11nj = this.LLILLL;
        InterfaceC1065750dq9.LIZ.getClass();
        InterfaceC1065750dq9 interfaceC1065750dq9 = (InterfaceC1065750dq9) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(str).create(InterfaceC1065750dq9.class);
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        map.put("size", String.valueOf(i2));
        c11nj.LIZ(interfaceC1065750dq9.LIZ(str, map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS152S0200000_16(this, activity, 2), new AfS185S0100000_16(this, 4)));
    }
}
