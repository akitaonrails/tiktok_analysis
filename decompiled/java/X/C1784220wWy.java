package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.b2c.replies.api.IMQuickReplyNetAPI;
import com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplyListRequestBody;
import com.ss.android.ugc.aweme.im.b2c.replies.api.QuickReplyListResponse;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM$fetchLatestData$1", f = "BusinessQuickReplyPanelVM.kt", l = {163}, m = "invokeSuspend")
public final class C1784220wWy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ BusinessQuickReplyPanelVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784220wWy(String str, BusinessQuickReplyPanelVM businessQuickReplyPanelVM, InterfaceC1364105Vn<? super C1784220wWy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = businessQuickReplyPanelVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784220wWy(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int errorCode;
        String str;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        long jLongValue;
        Integer numLJ;
        C1C7U.LIZ("BusinessQuickReplyPanelVM@3515.fetchLatestData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    jLongValue = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                Long lLJIILIIL = C2095008Iq.LJIILIIL(this.LLILLL);
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                    IMQuickReplyNetAPI.LIZ.getClass();
                    IMQuickReplyNetAPI iMQuickReplyNetAPI = C1798930wuh.LIZIZ;
                    QuickReplyListRequestBody quickReplyListRequestBody = new QuickReplyListRequestBody(jLongValue);
                    this.LL = jLongValue;
                    this.LLILLJJLI = 1;
                    obj = iMQuickReplyNetAPI.fetchQuickReplyList(quickReplyListRequestBody, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("BusinessQuickReplyPanelVM@3515.fetchLatestData$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BusinessQuickReplyPanelVM@3515.fetchLatestData$1");
                    return unit;
                }
            }
            QuickReplyListResponse quickReplyListResponse = (QuickReplyListResponse) obj;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchLatestData resp: status: ");
            sbLIZ.append(quickReplyListResponse.status_code);
            sbLIZ.append(", msg: ");
            sbLIZ.append(quickReplyListResponse.status_msg);
            sbLIZ.append(", list size: ");
            List<IMQuickReply> list = quickReplyListResponse.list;
            if (list != null) {
                numLJ = C2286608xc.LJ(list.size());
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (quickReplyListResponse.status_code == 0) {
                this.LLILZ.LL.setValue(quickReplyListResponse.list);
                this.LLILZ.LLILLL.setValue(quickReplyListResponse.list);
                BusinessQuickReplyPanelVM businessQuickReplyPanelVM = this.LLILZ;
                String strValueOf = String.valueOf(jLongValue);
                List<IMQuickReply> list2 = quickReplyListResponse.list;
                businessQuickReplyPanelVM.getClass();
                C051N.LIZIZ(strValueOf, list2);
            } else {
                this.LLILZ.LLILLL.setValue(C13BV.INSTANCE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZ.LLILLL.setValue(C13BV.INSTANCE);
            e.getMessage();
            if (!((C1753306tn) this.LLILZ.LLILZIL.getValue()).LIZ) {
                boolean z = e instanceof C0XIR;
                if (z) {
                    errorCode = ((C23112093u) e).getErrorCode();
                } else {
                    errorCode = -1;
                }
                if (z) {
                    Object rawResponse = ((C0XIR) e).getRawResponse();
                    if (rawResponse instanceof BaseResponse) {
                        baseResponse = (BaseResponse) rawResponse;
                    } else {
                        baseResponse = null;
                    }
                    if (baseResponse != null && (serverTimeExtra = baseResponse.extra) != null) {
                        str = serverTimeExtra.logid;
                    } else {
                        str = null;
                    }
                } else {
                    str = "";
                }
                ((C1753306tn) this.LLILZ.LLILZIL.getValue()).LIZ(C2286608xc.LJ(errorCode), null, str, false);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BusinessQuickReplyPanelVM@3515.fetchLatestData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
