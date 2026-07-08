package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS0S1010000_2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364630lcD {
    public static final AwS0S1010000_2 LJ(SharePackage sharePackage) {
        boolean z;
        String string = sharePackage.extras.getString("streak_panel_scene");
        if (string == null) {
            return null;
        }
        Bundle bundle = sharePackage.extras;
        if (bundle != null) {
            z = bundle.getBoolean("streak_use_scene_as_feature_key");
        } else {
            z = false;
        }
        return new AwS0S1010000_2(string, z, 0);
    }

    public static final AwS0S1010000_2 LJFF(SharePackage sharePackage) {
        boolean z;
        String string = sharePackage.extras.getString("streak_panel_scene");
        if (string == null) {
            return null;
        }
        Bundle bundle = sharePackage.extras;
        if (bundle != null) {
            z = bundle.getBoolean("streak_use_scene_as_feature_key");
        } else {
            z = false;
        }
        return new AwS0S1010000_2(string, z, 1);
    }

    public static final void LIZIZ(Bundle bundle, Object obj) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11 = null;
        if (bundle == null) {
            string = null;
        } else {
            try {
                string = bundle.getString("comment_id");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        if (C703302op.LIZ(string)) {
            LIZ(obj, "comment_id", string);
        }
        if (bundle == null) {
            string2 = null;
        } else {
            string2 = bundle.getString("comment_category");
        }
        if (C703302op.LIZ(string2)) {
            LIZ(obj, "comment_category", string2);
        }
        if (bundle == null) {
            string3 = null;
        } else {
            string3 = bundle.getString("comment_message_type");
        }
        if (C703302op.LIZ(string3)) {
            LIZ(obj, "comment_message_type", string3);
        }
        if (bundle == null) {
            string4 = null;
        } else {
            string4 = bundle.getString("comment_follow_status_to_user");
        }
        if (C703302op.LIZ(string4)) {
            LIZ(obj, "comment_follow_status_to_user", string4);
        }
        if (bundle == null) {
            string5 = null;
        } else {
            string5 = bundle.getString("channel");
        }
        if (C703302op.LIZ(string5)) {
            LIZ(obj, "channel", string5);
        }
        if (bundle == null) {
            string6 = null;
        } else {
            string6 = bundle.getString("channel");
        }
        if (C703302op.LIZ(string6)) {
            LIZ(obj, "comment_channel", string6);
        }
        if (bundle == null) {
            string7 = null;
        } else {
            string7 = bundle.getString("audio_duration");
        }
        if (C703302op.LIZ(string7)) {
            LIZ(obj, "audio_duration", string7);
        }
        if (bundle == null) {
            string8 = null;
        } else {
            string8 = bundle.getString("audio_volume");
        }
        if (C703302op.LIZ(string8)) {
            LIZ(obj, "audio_volume", string8);
        }
        if (bundle == null) {
            string9 = null;
        } else {
            string9 = bundle.getString("audio_ori_loudness");
        }
        if (C703302op.LIZ(string9)) {
            LIZ(obj, "audio_ori_loudness", string9);
        }
        if (bundle == null) {
            string10 = null;
        } else {
            string10 = bundle.getString("audio_ori_peak_loudness");
        }
        if (C703302op.LIZ(string10)) {
            LIZ(obj, "audio_ori_peak_loudness", string10);
        }
        if (bundle != null) {
            string11 = bundle.getString("sub_photo_type");
        }
        if (C703302op.LIZ(string11)) {
            LIZ(obj, "sub_photo_type", string11);
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    public static final void LIZJ(Bundle bundle, Map map) {
        String string;
        String string2;
        String string3;
        String string4 = null;
        if (bundle != null) {
            string = bundle.getString("comment_id");
        } else {
            string = null;
        }
        if (C703302op.LIZ(string)) {
            map.put("comment_id", string);
        }
        if (bundle != null) {
            string2 = bundle.getString("comment_category");
        } else {
            string2 = null;
        }
        if (C703302op.LIZ(string2)) {
            map.put("comment_category", string2);
        }
        if (bundle != null) {
            string3 = bundle.getString("comment_message_type");
        } else {
            string3 = null;
        }
        if (C703302op.LIZ(string3)) {
            map.put("comment_message_type", string3);
        }
        if (bundle != null) {
            string4 = bundle.getString("comment_follow_status_to_user");
        }
        if (C703302op.LIZ(string4)) {
            map.put("comment_follow_status_to_user", string4);
        }
    }

    public static final void LIZLLL(Bundle bundle, Object obj) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12 = null;
        if (bundle != null) {
            try {
                string12 = bundle.getString("shoot_way");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        String str = "";
        if (string12 == null) {
            string12 = "";
        }
        LIZ(obj, "shoot_way", string12);
        if (bundle == null || (string = bundle.getString("creation_id")) == null) {
            string = "";
        }
        LIZ(obj, "creation_id", string);
        if (bundle == null || (string2 = bundle.getString("enter_from")) == null) {
            string2 = "";
        }
        LIZ(obj, "enter_from", string2);
        if (bundle == null || (string3 = bundle.getString("prop_id")) == null) {
            string3 = "";
        }
        LIZ(obj, "prop_id", string3);
        if (bundle == null || (string4 = bundle.getString("prop_resource_id")) == null) {
            string4 = "";
        }
        LIZ(obj, "prop_resource_id", string4);
        if (bundle == null || (string5 = bundle.getString("prop_panel_model_request_id")) == null) {
            string5 = "";
        }
        LIZ(obj, "prop_panel_model_request_id", string5);
        if (bundle == null || (string6 = bundle.getString("tab_key")) == null) {
            string6 = "";
        }
        LIZ(obj, "tab_key", string6);
        if (bundle == null || (string7 = bundle.getString("tab_name")) == null) {
            string7 = "";
        }
        LIZ(obj, "tab_name", string7);
        if (bundle == null || (string8 = bundle.getString("impr_position")) == null) {
            string8 = "";
        }
        LIZ(obj, "impr_position", string8);
        if (bundle == null || (string9 = bundle.getString("prop_category")) == null) {
            string9 = "";
        }
        LIZ(obj, "prop_category", string9);
        if (bundle == null || (string10 = bundle.getString("fav_source")) == null) {
            string10 = "";
        }
        LIZ(obj, "fav_source", string10);
        if (bundle != null && (string11 = bundle.getString("enter_method")) != null) {
            str = string11;
        }
        LIZ(obj, "enter_method", str);
        C189200o6.m2constructorimpl(obj);
    }

    public static final void LIZ(Object obj, String str, String str2) {
        Object objAppendQueryParameter;
        try {
            if (obj instanceof AbstractC1386130mAt) {
                AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) obj;
                abstractC1386130mAt.LJFF(str, str2, InterfaceC1210900hcG.LIZ);
                objAppendQueryParameter = abstractC1386130mAt;
            } else if (obj instanceof C2241008qG) {
                C2241008qG c2241008qG = (C2241008qG) obj;
                c2241008qG.LIZ.put(str, str2);
                objAppendQueryParameter = c2241008qG;
            } else if (obj instanceof C2344009Gk) {
                C2344009Gk c2344009Gk = (C2344009Gk) obj;
                c2344009Gk.LJIIIIZZ(str, str2);
                objAppendQueryParameter = c2344009Gk;
            } else if (obj instanceof C0LAB) {
                C0LAB c0lab = (C0LAB) obj;
                c0lab.LJ(str, str2);
                objAppendQueryParameter = c0lab;
            } else if (obj instanceof JSONObject) {
                objAppendQueryParameter = ((JSONObject) obj).put(str, str2);
            } else if (obj instanceof Uri.Builder) {
                objAppendQueryParameter = ((Uri.Builder) obj).appendQueryParameter(str, str2);
            } else {
                objAppendQueryParameter = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objAppendQueryParameter);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
