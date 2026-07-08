package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6T, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6T {
    public static SubPrivilegeDetailFullPage LIZ(Bundle bundle, String str, String str2, String str3) {
        Uri uri;
        long jLongValue;
        long jLongValue2;
        boolean z;
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = new SubPrivilegeDetailFullPage();
        subPrivilegeDetailFullPage.LLJJJIL = str;
        subPrivilegeDetailFullPage.LLJJJJ = str3;
        subPrivilegeDetailFullPage.LLJJJJJIL = str2;
        subPrivilegeDetailFullPage.setArguments(bundle);
        String str4 = "";
        subPrivilegeDetailFullPage.LLJL = bundle.getString("enter_type", "");
        boolean zLJFF = Intrinsics.LJFF(bundle.getString("use_new_style", ""), "true");
        String string = bundle.getString("log_param", "");
        String string2 = bundle.getString("extra_log_pb", "");
        String string3 = bundle.getString("scenario", "live");
        try {
            uri = UriProtector.parse(bundle.getString("original_url", ""));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            uri = null;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(bundle.getString("room_id", CardStruct.IStatusCode.DEFAULT));
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(bundle.getString("anchor_id", CardStruct.IStatusCode.DEFAULT));
        if (lLJIILIIL2 != null) {
            jLongValue2 = lLJIILIIL2.longValue();
        } else {
            jLongValue2 = 0;
        }
        if (jLongValue > 0) {
            z = true;
        } else {
            z = false;
        }
        String string4 = bundle.getString("package_id", "");
        String string5 = bundle.getString("previous_page");
        if (string5 != null) {
            str4 = string5;
        }
        subPrivilegeDetailFullPage.LLJLIL = new SubscriptionSceneContext(jLongValue, jLongValue2, str2, null, null, str, null, null, z, false, string3, zLJFF, string4, 0L, 0L, string, string2, false, str4, uri, 156376);
        return subPrivilegeDetailFullPage;
    }
}
