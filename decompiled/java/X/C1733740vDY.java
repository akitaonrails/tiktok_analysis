package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733740vDY {
    public static final String LIZ(String str, String str2) {
        String strValueOf;
        if (str2 != null && !a0.LJJJIL(str2) && (strValueOf = String.valueOf(C1976807ok.LIZ(UriProtector.parse(str), new Pair("source_btm_token", str2)))) != null) {
            return strValueOf;
        }
        return str;
    }

    public static final String LIZIZ(View view, String str) {
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = str;
        c21244318Bt.LIZIZ.view = view;
        return BtmSDK.INSTANCE.createJumpSourceBtmToken(c21244318Bt);
    }

    public static final String LIZJ(Fragment fragment, String str) {
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = str;
        c21244318Bt.LIZIZ.fragment = fragment;
        return BtmSDK.INSTANCE.createJumpSourceBtmToken(c21244318Bt);
    }

    public static final Map<String, String> LIZLLL(View view, String str) {
        if (view == null) {
            return C2097608Jq.LJ();
        }
        return LJFF(str, PageFinder.via(view));
    }

    public static final Map<String, String> LJ(Fragment fragment, String str) {
        if (fragment == null) {
            return C2097608Jq.LJ();
        }
        return LJFF(str, PageFinder.via(fragment));
    }

    public static final Map LJFF(String str, PageFinder pageFinder) {
        String string;
        HashMap map = new HashMap();
        for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, pageFinder, null, 4, null).entrySet()) {
            Object value = entry.getValue();
            if (value != null && (string = value.toString()) != null) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }
}
