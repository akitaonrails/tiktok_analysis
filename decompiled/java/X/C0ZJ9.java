package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyImpl;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJ9 implements C0ZJA {
    public static final C0ZJ9 LIZ = new C0ZJ9();
    public static final Map<EnumC1910440zoY, ActivityStatusAccuracyImpl> LIZIZ = new LinkedHashMap();
    public static final PrivacySettingsFeature LIZJ = PrivacySettingsFeature.LIZ.LIZ();

    public static final void LIZLLL(InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("trigger_activity_status_guidance_popup", new C830490Whz());
    }

    public static void LJ(EnumC1910440zoY enumC1910440zoY, List list) {
        ActivityStatusAccuracyImpl activityStatusAccuracyImpl;
        if (C1867550yhN.LIZ() && (activityStatusAccuracyImpl = (ActivityStatusAccuracyImpl) ((LinkedHashMap) LIZIZ).get(enumC1910440zoY)) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C0ZJ8 c0zj8 = (C0ZJ8) it2.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0zj8.LIZ);
                sbLIZ.append('_');
                sbLIZ.append(c0zj8.LIZIZ);
                sbLIZ.append('_');
                sbLIZ.append(c0zj8.LIZJ);
                activityStatusAccuracyImpl.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                LIZ.LIZ(activityStatusAccuracyImpl.LIZ.getValue(), c0zj8.LIZIZ, c0zj8.LIZ, c0zj8.LIZJ, "type_show", C0I0B.LJFF.LIZIZ());
            }
        }
    }

    public static final void LIZJ(int i, boolean z, InterfaceC1493105sv interfaceC1493105sv) {
        String str;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("app_status", String.valueOf(i));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("has_ack_activity_status", str);
        interfaceC1493105sv.sendEvent("activity_status_guidance_request_event", c830490Whz);
    }

    public static final void LJFF(long j, InterfaceC1493105sv interfaceC1493105sv, String str, String str2) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("user_id", str);
        c830490Whz.put("latency", String.valueOf(j));
        c830490Whz.put("source", str2);
        interfaceC1493105sv.sendEvent("activity_status_latency", c830490Whz);
    }

    @Override // X.C0ZJA
    public final C0ZJD LIZIZ(EnumC1910440zoY enumC1910440zoY, View view, LifecycleOwner lifecycleOwner, Context context, View view2) {
        if (lifecycleOwner == null || !C1867550yhN.LIZ()) {
            return null;
        }
        return new C0ZJD(enumC1910440zoY, view, lifecycleOwner, context, view2);
    }

    @Override // X.C0ZJA
    public final void LIZ(String str, boolean z, String str2, Integer num, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        String str4;
        if (!C1867550yhN.LIZ() || !((Boolean) C0Z5L.LIZ().LIZ.getValue()).booleanValue() || !C896370ZEl.LIZ() || !C0ZH6.LIZIZ(LIZJ) || str == null || str2 == null) {
            return;
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("position", str);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("is_active", str4);
        c830490Whz.put("to_user_id", str2);
        if (num != null) {
            c830490Whz.put("rank_index", String.valueOf(num.intValue()));
        }
        c830490Whz.put("activity_status_accuracy_type", str3);
        interfaceC1493105sv.sendEvent("activity_status_accuracy", c830490Whz);
        C0I0B.LJFF.LIZJ();
        if (C894660Z7w.LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_activity_status_accuracy");
            interfaceC1493105sv.sendEvent(C2188811AlT.LIZIZ(sbLIZ), c830490Whz);
        }
    }
}
