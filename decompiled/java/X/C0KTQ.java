package X;

import android.os.SystemClock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KTQ extends C0KTO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1791930wjP interfaceC1791930wjPLLFZ;
        String strLIZ;
        long jLongValue;
        C0KTP c0ktp = (C0KTP) xBaseParamModel;
        String containerID = null;
        final long jLIZLLL = C518170KTv.LIZLLL(null, "requestPrecheck", 6);
        final long jLJ = C518170KTv.LJ("precheck", null, null, null, null, 62);
        List<String> productIDs = c0ktp.getProductIDs();
        ArrayList arrayList = new ArrayList();
        for (String str : productIDs) {
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        final List listLJJJJI = C13LP.LJJJJI(arrayList);
        if (listLJJJJI.isEmpty()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C518170KTv.LIZJ("requestPrecheck", "fail", jElapsedRealtime - jLIZLLL, CardStruct.IStatusCode.DEFAULT, "empty productIDs", "client", null, 136);
            C518170KTv.LIZIZ("precheck", "fail", jElapsedRealtime - jLJ, null, null, null, CardStruct.IStatusCode.DEFAULT, "empty productIDs", "client", null, 1144);
            C2382909Vj.LIZ(completionBlock, 0, "empty productIDs", null, 4);
            return;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC1791930wjPLLFZ = interfaceC20673515v3K4.LLFZ()) != null) {
            C1616790sAv c1616790sAv = EnumC1616780sAu.Companion;
            int iIntValue = c0ktp.getBizLine().intValue();
            c1616790sAv.getClass();
            if (C1616790sAv.LIZ(iIntValue) == EnumC1616780sAu.SHORT_DRAMA) {
                strLIZ = C2540209xQ.LIZ();
            } else {
                strLIZ = "80UJVV6Y1101";
            }
            if (strLIZ.length() == 0) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                C518170KTv.LIZJ("requestPrecheck", "fail", jElapsedRealtime2 - jLIZLLL, CardStruct.IStatusCode.DEFAULT, "empty merchantId", "client", null, 136);
                C518170KTv.LIZIZ("precheck", "fail", jElapsedRealtime2 - jLJ, null, null, null, CardStruct.IStatusCode.DEFAULT, "empty merchantId", "client", null, 1144);
                C2382909Vj.LIZ(completionBlock, 0, "empty merchantId", null, 4);
                return;
            }
            Long lLJIILIIL = C2095008Iq.LJIILIIL(c0ktp.getFromUserID());
            long jLongValue2 = 0;
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            String subMerchantID = c0ktp.getSubMerchantID();
            if (subMerchantID == null) {
                subMerchantID = "";
            }
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(c0ktp.getToUserID());
            if (lLJIILIIL2 != null) {
                jLongValue2 = lLJIILIIL2.longValue();
            }
            C1789940wgC c1789940wgC = new C1789940wgC(jLongValue, strLIZ, listLJJJJI, subMerchantID, jLongValue2, 32);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            final String str2 = containerID;
            interfaceC1791930wjPLLFZ.LIZJ(new InterfaceC518100KTo() { // from class: X.0KTK
                @Override // X.InterfaceC518100KTo
                public final void LIZ(Map<String, C517630KRt> map) {
                    C517630KRt c517630KRt = map.get(C13LP.LJJJJZI(listLJJJJI));
                    if (c517630KRt == null) {
                        c517630KRt = (C517630KRt) C13LP.LJJJLIIL(map.values());
                    }
                    C0KTN c0ktn = null;
                    if (c517630KRt == null) {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        C518170KTv.LIZJ("requestPrecheck", "fail", jElapsedRealtime3 - jLIZLLL, CardStruct.IStatusCode.DEFAULT, "empty precheck result", "server", null, 136);
                        C518170KTv.LIZIZ("precheck", "fail", jElapsedRealtime3 - jLJ, null, null, null, CardStruct.IStatusCode.DEFAULT, "empty precheck result", "server", null, 1144);
                        C2382909Vj.LIZ(completionBlock, 0, "empty precheck result", null, 4);
                        return;
                    }
                    C0KQW c0kqw = c517630KRt.LIZIZ;
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                    if (c0kqw != null) {
                        C518170KTv.LIZJ("requestPrecheck", "fail", jElapsedRealtime4 - jLIZLLL, String.valueOf(c0kqw.LIZ.getValue()), c0kqw.LIZIZ, "server", null, 136);
                        C518170KTv.LIZIZ("precheck", "fail", jElapsedRealtime4 - jLJ, null, null, null, String.valueOf(c0kqw.LIZ.getValue()), c0kqw.LIZIZ, "server", null, 1144);
                    } else {
                        C518170KTv.LIZJ("requestPrecheck", "success", jElapsedRealtime4 - jLIZLLL, null, null, null, null, 248);
                        C518170KTv.LIZIZ("precheck", "success", jElapsedRealtime4 - jLJ, null, null, null, null, null, null, null, 2040);
                    }
                    CompletionBlock<C0KTM> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0KTM.class, str2);
                    String str3 = str2;
                    C0KTM c0ktm = (C0KTM) xBaseModelLIZJ;
                    C0KTL c0ktl = (C0KTL) C1909107dp.LIZJ(C0KTL.class, str3);
                    List<C0KQD> list = c517630KRt.LIZJ;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C0KQD> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(it2.next().getValue()));
                    }
                    c0ktl.setAllowedPath(arrayList2);
                    c0ktl.setPrecheckStatus(Integer.valueOf(c517630KRt.LIZ.getValue()));
                    c0ktl.setProductID(c517630KRt.LIZLLL);
                    c0ktl.setMessage(c517630KRt.LJI);
                    c0ktl.setEntitlementState(Integer.valueOf(c517630KRt.LJFF.getValue()));
                    c0ktm.setResult(c0ktl);
                    if (c0kqw != null) {
                        c0ktn = (C0KTN) C1909107dp.LIZJ(C0KTN.class, str3);
                        c0ktn.setErrorCode(Integer.valueOf(c0kqw.LIZ.getValue()));
                        c0ktn.setErrorMessage(c0kqw.LIZIZ);
                    }
                    c0ktm.setError(c0ktn);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }
            }, c1789940wgC);
            return;
        }
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        C518170KTv.LIZJ("requestPrecheck", "fail", jElapsedRealtime3 - jLIZLLL, CardStruct.IStatusCode.DEFAULT, "iap service unavailable", "client", null, 136);
        C518170KTv.LIZIZ("precheck", "fail", jElapsedRealtime3 - jLJ, null, null, null, CardStruct.IStatusCode.DEFAULT, "iap service unavailable", "client", null, 1144);
        C2382909Vj.LIZ(completionBlock, 0, "iap service unavailable", null, 4);
    }
}
