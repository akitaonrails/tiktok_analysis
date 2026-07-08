package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Ldk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547580Ldk {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(481));

    public static boolean LIZ() {
        Integer num;
        C546890Lcd.LIZ.getClass();
        AIQuotaService aIQuotaServiceLIZIZ = C546890Lcd.LIZIZ();
        Source source = Source.AI_PORTRAIT;
        QuotaResult quotaResult = aIQuotaServiceLIZIZ.LIZIZ(source).quotaResult;
        if (quotaResult == null || (num = quotaResult.quotaRemain) == null) {
            return true;
        }
        num.intValue();
        return C546890Lcd.LIZIZ().LIZ(source);
    }

    public static void LIZIZ(Activity activity) {
        int iLJIJ;
        Integer num;
        if (activity == null) {
            return;
        }
        C546890Lcd.LIZ.getClass();
        QuotaResult quotaResult = C546890Lcd.LIZIZ().LIZIZ(Source.AI_PORTRAIT).quotaResult;
        if (quotaResult != null && (num = quotaResult.quota) != null) {
            iLJIJ = num.intValue();
        } else {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 20, "studio_ai_portrait_quota_count", true);
        }
        C1390390mHl c1390390mHl = C1390390mHl.LIZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(activity.getResources().getQuantityString(2131755089, iLJIJ, Integer.valueOf(iLJIJ)));
        ((C1390360mHi) c1390390mHl.createToast(activity, 12001, creativeToastBuilder)).show();
    }

    public static void LIZJ(Integer num, Integer num2) {
        String str = C545870Laz.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitQuotaManager -> updateQuotaCache:quota = ");
        sbLIZ.append(num);
        sbLIZ.append("; quotaRemain = ");
        sbLIZ.append(num2);
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C546890Lcd.LIZ.getClass();
        C546890Lcd.LIZIZ().LJ(Source.AI_PORTRAIT, num, num2);
    }
}
