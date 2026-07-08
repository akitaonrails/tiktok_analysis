package X;

import android.app.Activity;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.draft.IDraftEditService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS212S0300000_3;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LCF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LCF extends C1619110sEf implements C0LCE {
    public final Map<String, C0LCH> LL = new LinkedHashMap();
    public final C01GW LLILLJJLI;

    public C0LCF() {
        int[] iArr = {2472, 2473, LSPassThroughRecordSizeConfig.DEFAULT};
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 406));
        this.LLILLJJLI = c01gwLIZIZ;
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        c1908480zlO.LJ((C538970LBv) c01gwLIZIZ.getValue());
        c1908480zlO.LJIILL(this, iArr);
    }

    public static C0LCN LJIILIIL(InnerPushMessage innerPushMessage) {
        String str;
        Boolean boolLJLI;
        if (innerPushMessage != null) {
            try {
                InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                if (uiTemplate != null && (str = uiTemplate.globalSchemaUrl) != null) {
                    Uri uri = UriProtector.parse(str);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "task_id");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_success");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                        boolLJLI = a0.LJLI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    } else {
                        boolLJLI = null;
                    }
                    return new C0LCN(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, boolLJLI, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "entrance"));
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldAcceptMessage, parsePushMessage null,");
                sbLIZ.append(innerPushMessage);
                C201955140j.LJFF("TextImageInnerPush", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return null;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        String str;
        C0LCH c0lch;
        AwemeDraft awemeDraft;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        IDraftEditService iDraftEditService;
        LifecycleOwner lifecycleOwnerLJFF;
        C0LCN c0lcnLJIILIIL = LJIILIIL(innerPushMessage);
        if (c0lcnLJIILIIL != null && (str = c0lcnLJIILIIL.LIZ) != null && (c0lch = (C0LCH) ((LinkedHashMap) this.LL).get(str)) != null && (awemeDraft = c0lch.LIZIZ) != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && (iDraftEditService = (IDraftEditService) PluggableExtentionKt.pluggableSpi$default(IDraftEditService.class, false, false, false, 14, null)) != null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ2 != null) {
                lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ2.LJFF();
            } else {
                lifecycleOwnerLJFF = null;
            }
            iDraftEditService.LIZIZ(awemeDraft, activityLIZ, lifecycleOwnerLJFF, new AwS212S0300000_3(activityLIZ, awemeDraft, c0lcnLJIILIIL, 7));
        }
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        this.LLILLJJLI.getValue().getClass();
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
        this.LL.put((String) objLJJJLL, new C0LCH(enumC545550LaT, awemeDraftLJI, 28));
        C0LCM c0lcm = C0LCM.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update draft status, draftId: ");
        sbLIZ.append(str);
        sbLIZ.append(", status: ");
        sbLIZ.append(enumC545550LaT);
        C201955140j.LIZLLL(c0lcm, "TextImageInnerPush", C2188811AlT.LIZIZ(sbLIZ));
    }
}
