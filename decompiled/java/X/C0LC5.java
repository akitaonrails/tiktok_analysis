package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0LC5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LC5 extends C1619110sEf implements C0LCE {
    public final Map<String, C538810LBf> LL = new LinkedHashMap();
    public final C01GW LLILLJJLI;

    public C0LC5() {
        int[] iArr = {120, LSPassThroughRecordSizeConfig.DEFAULT};
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0LC6(this));
        this.LLILLJJLI = c01gwLIZIZ;
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        c1908480zlO.LJ((C538980LBw) c01gwLIZIZ.getValue());
        c1908480zlO.LJIILL(this, iArr);
    }

    public static C0LCA LJIILIIL(InnerPushMessage innerPushMessage) {
        String str;
        if (innerPushMessage != null) {
            try {
                InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                if (uiTemplate != null && (str = uiTemplate.globalSchemaUrl) != null) {
                    Uri uri = UriProtector.parse(str);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_type");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "task_id");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                    }
                    return new C0LCA(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                }
                return null;
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldAcceptMessage, parsePushMessage null,");
                sbLIZ.append(innerPushMessage);
                C201955140j.LJFF("AILivePhotoInnerPush", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        return null;
    }

    @Override // X.C0LCE
    public final void LJIIIIZZ(List list, String str, List list2, boolean z) {
        EnumC545550LaT enumC545550LaT;
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str, 0, null, 6, null), false, true, true, 2));
        if (awemeDraftLJI == null) {
            return;
        }
        if (z) {
            enumC545550LaT = EnumC545550LaT.COMPLETE;
        } else {
            enumC545550LaT = EnumC545550LaT.FAILED;
        }
        Object objLJJJLL = C13LP.LJJJLL(list2);
        if (objLJJJLL == null) {
            return;
        }
        this.LL.put((String) objLJJJLL, new C538810LBf(enumC545550LaT, awemeDraftLJI, null, 28));
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update draft status, draftId: ");
        sbLIZ.append(str);
        sbLIZ.append(", status: ");
        sbLIZ.append(enumC545550LaT);
        C201955140j.LIZLLL(c0l76, "AILivePhotoInnerPush", C2188811AlT.LIZIZ(sbLIZ));
    }
}
