package X;

import Y.ACallableS417S0100000_10;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: renamed from: X.0Qrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683690Qrn extends AbstractC666100QAu<BatchDetailList> {
    public final C0S4J LL = new C0S4J("BatchDetailModel");
    public int LLILLJJLI;

    public C683690Qrn(int i) {
        this.LLILLJJLI = i;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final void handleData(BatchDetailList batchDetailList) {
        LogPbBean logPbBean;
        BatchDetailList batchDetailList2 = batchDetailList;
        if (batchDetailList2 != null && batchDetailList2.items != null) {
            super.handleData(batchDetailList2);
            int size = batchDetailList2.items.size();
            String imprId = batchDetailList2.requestId;
            for (int i = 0; i < size; i++) {
                Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL((Aweme) ListProtector.get(batchDetailList2.items, i));
                if (TextUtils.isEmpty(imprId) && (logPbBean = batchDetailList2.logPbBean) != null) {
                    imprId = logPbBean.getImprId();
                }
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(awemeLLILLL.getAid());
                sbLIZ.append(this.LLILLJJLI);
                iRequestIdService.LIZIZ(i, C2188811AlT.LIZIZ(sbLIZ), imprId);
                ListProtector.set(batchDetailList2.items, i, awemeLLILLL);
                List<Aweme> list = batchDetailList2.items;
                if (list != null) {
                    C1360460lVU.LIZIZ.LJJI(list, EnumC1359020lTA.OTHERS, null);
                }
            }
            C0S4J c0s4j = this.LL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[handleData] ");
            sbLIZ2.append(size);
            sbLIZ2.append(",");
            sbLIZ2.append(imprId);
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LL.LJ("data is null or items null!");
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        boolean zLJI = MethodIDManager.LJI(137839);
        if (!super.sendRequest(objArr)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        this.LL.LJIIIZ("[sendRequest]");
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS417S0100000_10(objArr, 0), 0);
        if (zLJI) {
            MethodIDManager.LJ();
            return true;
        }
        return true;
    }
}
