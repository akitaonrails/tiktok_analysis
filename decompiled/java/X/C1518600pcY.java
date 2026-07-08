package X;

import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TTKUserCommunicationServiceImpl;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyNoticeUPSdk;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS198S1100000_23;

/* JADX INFO: renamed from: X.0pcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518600pcY extends C09AY implements Function1<NetworkUniversalPopupDispatchResponse, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC1518910pd3 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ TTKUserCommunicationServiceImpl LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1518600pcY(boolean z, int i, InterfaceC1518910pd3 interfaceC1518910pd3, String str, TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl, String str2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC1518910pd3;
        this.LLILZ = str;
        this.LLILZIL = tTKUserCommunicationServiceImpl;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse) {
        boolean z;
        List<PolicyNoticeUPSdk> list;
        NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse2 = networkUniversalPopupDispatchResponse;
        if (networkUniversalPopupDispatchResponse2 == null) {
            if (!this.LL) {
                C054G c054g = C1518590pcX.LIZ;
                int i = this.LLILLJJLI;
                InterfaceC1518910pd3 interfaceC1518910pd3 = this.LLILLL;
                AwS198S1100000_23 awS198S1100000_23 = new AwS198S1100000_23(this.LLILZIL, this.LLILZLL, 1);
                long jLJIJJ = C0C64.LJIILLIIL().LJIJJ(31744, 1, true, "uc_retry_time", -1L);
                if (jLJIJJ > 0) {
                    Map<Integer, C09AE> map = C1518590pcX.LIZIZ;
                    C09AE c09ae = (C09AE) ((LinkedHashMap) map).get(Integer.valueOf(i));
                    if (c09ae != null) {
                        c09ae.LIZIZ(null);
                    }
                    map.put(Integer.valueOf(i), C23250099c.LIZLLL(C1518590pcX.LIZ, null, null, new C328201Pc(jLJIJJ, i, awS198S1100000_23, interfaceC1518910pd3, null), 3));
                }
            }
        } else if (this.LLILZ != null) {
            TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl = this.LLILZIL;
            int i2 = this.LLILLJJLI;
            tTKUserCommunicationServiceImpl.getClass();
            boolean zLJIIIIZZ = C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "enable_n_swipes", true, false);
            List list2 = networkUniversalPopupDispatchResponse2.popupResponses;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            if (zLJIIIIZZ && !list2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (true) {
                    z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Integer num = ((NetworkUniversalPopupResponse) next).popupMeta.afterNSwipe;
                    if (num != null && num.intValue() > 0) {
                        arrayList2.add(next);
                    } else {
                        arrayList.add(next);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List<NetworkUniversalPopupResponse> list3 = (List) pair.getFirst();
                List<NetworkUniversalPopupResponse> list4 = (List) pair.getSecond();
                if ((!list3.isEmpty()) || ((list = networkUniversalPopupDispatchResponse2.policyNotices) != null && !list.isEmpty())) {
                    tTKUserCommunicationServiceImpl.LJIILJJIL(networkUniversalPopupDispatchResponse2.copy(networkUniversalPopupDispatchResponse2.policyNotices, list3, networkUniversalPopupDispatchResponse2.status_code, networkUniversalPopupDispatchResponse2.status_msg, networkUniversalPopupDispatchResponse2.mscConfig, networkUniversalPopupDispatchResponse2.log), i2);
                }
                if (!list4.isEmpty()) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(i2), bundle);
                    C786410Ut5.LJJJI("business", C1519120pdO.LIZ(networkUniversalPopupDispatchResponse2), bundle);
                    C786410Ut5.LJJJI("defer_amount", String.valueOf(list4.size()), bundle);
                    AppLogNewUtils.LJ("pns_uc_nswipe_deferred", bundle);
                    C1518550pcT c1518550pcTLJIILIIL = tTKUserCommunicationServiceImpl.LJIILIIL();
                    UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel("DynamicProcessor", networkUniversalPopupDispatchResponse2.copy(networkUniversalPopupDispatchResponse2.policyNotices, list4, networkUniversalPopupDispatchResponse2.status_code, networkUniversalPopupDispatchResponse2.status_msg, networkUniversalPopupDispatchResponse2.mscConfig, networkUniversalPopupDispatchResponse2.log), null);
                    Integer numValueOf = Integer.valueOf(i2);
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("enter_from", "get_config_with_scene");
                    if (i2 == EnumC1518670pcf.SCENE_POST_APP_LAUNCH.getValue()) {
                        z = true;
                    }
                    pairArr[1] = new Pair("isHotLaunch", Boolean.valueOf(z));
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    c1518550pcTLJIILIIL.getClass();
                    C1518550pcT.LJI(userCommunicationProcessorModel, numValueOf, mapLJIIIIZZ);
                }
            } else {
                tTKUserCommunicationServiceImpl.LJIILJJIL(networkUniversalPopupDispatchResponse2, i2);
            }
        }
        return Unit.LIZ;
    }
}
