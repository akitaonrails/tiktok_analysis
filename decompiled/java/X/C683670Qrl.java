package X;

import Y.ACallableS242S0200000_10;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Qrl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683670Qrl extends AbstractC1255880imo<Aweme, BatchDetailList> {
    public final int LL = 1;
    public int LLILLJJLI;
    public final List<String> LLILLL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        List<Aweme> list;
        BatchDetailList batchDetailList = (BatchDetailList) this.mData;
        return (batchDetailList == null || (list = batchDetailList.items) == null) ? new ArrayList() : list;
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return this.LLILLJJLI < ((ArrayList) this.LLILLL).size() - 1;
    }

    public C683670Qrl(String str) {
        this.LLILLL = new ArrayList(a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6));
    }

    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        return C729980SkG.LIZIZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        List<Aweme> list;
        LogPbBean logPbBean;
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        if (batchDetailList != null && (list = batchDetailList.items) != null) {
            int size = list.size();
            String imprId = batchDetailList.requestId;
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) ListProtector.get(batchDetailList.items, i);
                aweme.setLogPbBean(batchDetailList.logPbBean);
                Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                if (TextUtils.isEmpty(imprId) && (logPbBean = batchDetailList.logPbBean) != null) {
                    imprId = logPbBean.getImprId();
                }
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(awemeLLILLL.getAid());
                sbLIZ.append(this.LL);
                iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), imprId);
                ListProtector.set(batchDetailList.items, i, awemeLLILLL);
                List<Aweme> list2 = batchDetailList.items;
                if (list2 != null) {
                    C1360460lVU.LIZIZ.LJJI(list2, EnumC1359020lTA.OTHERS, null);
                }
            }
            T t = this.mData;
            if (t == 0) {
                super.handleData(batchDetailList);
            } else {
                ((BatchDetailList) t).items.addAll(batchDetailList.items);
            }
            this.LLILLJJLI += C683680Qrm.LIZ + 1;
        }
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        sendRequest(objArr);
    }

    @Override // X.AbstractC1255880imo, X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        if (this.LLILLJJLI > 0) {
            this.mListQueryType = 4;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS242S0200000_10(objArr, this, 3), 0);
        return true;
    }
}
