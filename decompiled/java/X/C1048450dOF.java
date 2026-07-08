package X;

import Y.ARunnableS49S0300000_16;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.commercialize.model.AdReportInfo;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0dOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048450dOF implements InterfaceC1010530cP5 {
    public final InterfaceC1048460dOG LL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final void LIZ() {
        HashMap map = new HashMap();
        String logExtra = this.LL.getLogExtra();
        if (logExtra == null) {
            logExtra = "";
        }
        map.put("log_extra", logExtra);
        String cid = this.LL.getCid();
        if (cid == null) {
            cid = "";
        }
        map.put("cid", cid);
        Object obj = this.LL.getExtraParam().get("custom_data");
        if (obj == null) {
            obj = "";
        }
        map.put("custom_data", obj);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "ad").appendQueryParameter("object_id", this.LL.getAid()).appendQueryParameter("item_id", this.LL.getAid()).appendQueryParameter("owner_id", this.LL.getAuthorId()).appendQueryParameter("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).appendQueryParameter("group_id", "").appendQueryParameter("report_from", this.LL.getReportFrom()).appendQueryParameter("app_language", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJ;
        if (str == null) {
            str = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("app_name", str).appendQueryParameter("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter("version", C844470XAv.LIZJ()).appendQueryParameter("install_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId()).appendQueryParameter("report_ad_type", String.valueOf(this.LL.LIZIZ())).appendQueryParameter("room_id", this.LL.getRoomId());
        AdReportInfo adReportInfoLIZ = this.LL.LIZ();
        if (adReportInfoLIZ != null) {
            builderAppendQueryParameter2.appendQueryParameter("report_info", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), adReportInfoLIZ));
        }
        Map<String, Object> extraParam = this.LL.getExtraParam();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : extraParam.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            Object value = entry2.getValue();
            builderAppendQueryParameter2.appendQueryParameter(str2, value != null ? value.toString() : null);
        }
        C823050WQl.LIZIZ().execute(new ARunnableS49S0300000_16(this, map, builderAppendQueryParameter2, 21));
        IReportService iReportServiceLJJ = ComplianceServiceProvider.LJJ();
        Context context = this.LL.getContext();
        iReportServiceLJJ.LIZJ(context != null ? C0J3A.LIZJ(context) : null, builderAppendQueryParameter2);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C1048450dOF(InterfaceC1048460dOG interfaceC1048460dOG) {
        this.LL = interfaceC1048460dOG;
    }
}
