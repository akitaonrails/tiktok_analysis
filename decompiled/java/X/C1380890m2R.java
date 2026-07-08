package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380890m2R {
    public static final void LJIIIZ(Intent intent) {
        String stringExtra;
        String stringExtra2;
        int intExtra = intent.getIntExtra("is_from_push", 0);
        String stringExtra3 = null;
        try {
            stringExtra3 = intent.getStringExtra("push_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str = "";
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        try {
            stringExtra = intent.getStringExtra(FollowStatusChangeMethod.PARAM_UID);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            stringExtra2 = intent.getStringExtra("push_type");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        try {
            String stringExtra4 = intent.getStringExtra("push_user_id");
            if (stringExtra4 != null) {
                str = stringExtra4;
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        if (intExtra > 0 && !TextUtils.isEmpty(stringExtra3)) {
            HashMap<String, String> map = C1380900m2S.LIZ;
            map.put("is_from_push", String.valueOf(intExtra));
            map.put("push_id", stringExtra3);
            map.put("push_aid", stringExtra);
            map.put("push_type", stringExtra2);
            map.put("push_user_id", str);
        }
    }

    public static final void LIZ(String str, JSONObject jSONObject) throws JSONException {
        String strLIZ = C1380900m2S.LIZ();
        if (strLIZ != null && Intrinsics.LJFF(strLIZ, str) && C1380900m2S.LIZLLL() > 0) {
            jSONObject.put("is_from_push", C1380900m2S.LIZLLL());
            jSONObject.put("push_id", C1380900m2S.LIZIZ());
            jSONObject.put("push_type", C1380900m2S.LIZJ());
        }
    }

    public static final void LIZIZ(AbstractC1386130mAt abstractC1386130mAt, String str) {
        String strLIZ = C1380900m2S.LIZ();
        if (strLIZ != null && Intrinsics.LJFF(strLIZ, str) && C1380900m2S.LIZLLL() > 0) {
            abstractC1386130mAt.LIZLLL(C1380900m2S.LIZLLL(), "is_from_push");
            abstractC1386130mAt.LJ("push_id", C1380900m2S.LIZIZ());
            abstractC1386130mAt.LJ("push_type", C1380900m2S.LIZJ());
        }
    }

    public static final void LIZJ(C2344009Gk c2344009Gk, String str) {
        String strLIZ = C1380900m2S.LIZ();
        if (strLIZ != null && Intrinsics.LJFF(strLIZ, str) && C1380900m2S.LIZLLL() > 0) {
            c2344009Gk.LIZJ(C1380900m2S.LIZLLL(), "is_from_push");
            c2344009Gk.LJFF("push_id", C1380900m2S.LIZIZ());
            c2344009Gk.LJFF("push_type", C1380900m2S.LIZJ());
        }
    }

    public static final void LIZLLL(Bundle bundle, List list) {
        int i;
        String string;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) it2.next();
                if (bundle != null && (i = bundle.getInt("is_from_push", 0)) > 0) {
                    AwemeExtKt.appendMobParam(aweme, "is_from_push", String.valueOf(i));
                    String string2 = null;
                    if (bundle != null) {
                        string = bundle.getString("push_type");
                    } else {
                        string = null;
                    }
                    AwemeExtKt.appendMobParam(aweme, "push_type", string);
                    if (bundle != null) {
                        string2 = bundle.getString("push_id");
                    }
                    AwemeExtKt.appendMobParam(aweme, "push_id", string2);
                }
            }
        }
    }

    public static final void LJ(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            String str = mobParams.get("is_from_push");
            String str2 = str;
            if (str2 == null || !TextUtils.isDigitsOnly(str2)) {
                str = null;
            }
            String str3 = str;
            if (str3 == null) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            if (CastIntegerProtector.parseInt(str3) > 0) {
                abstractC1386130mAt.LIZLLL(1, "is_from_push");
                abstractC1386130mAt.LJ("push_id", mobParams.get("push_id"));
                abstractC1386130mAt.LJ("push_type", mobParams.get("push_type"));
            }
        }
    }

    public static final void LJFF(C2344009Gk c2344009Gk, Aweme aweme) {
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            String str = mobParams.get("is_from_push");
            String str2 = str;
            if (str2 == null || !TextUtils.isDigitsOnly(str2)) {
                str = null;
            }
            String str3 = str;
            if (str3 == null) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            if (CastIntegerProtector.parseInt(str3) > 0) {
                c2344009Gk.LIZJ(1, "is_from_push");
                c2344009Gk.LJFF("push_id", mobParams.get("push_id"));
                c2344009Gk.LJFF("push_type", mobParams.get("push_type"));
            }
        }
    }

    public static final void LJI(JSONObject jSONObject, Aweme aweme) {
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            String str = mobParams.get("is_from_push");
            String str2 = str;
            if (str2 == null || !TextUtils.isDigitsOnly(str2)) {
                str = null;
            }
            String str3 = str;
            if (str3 == null) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            if (CastIntegerProtector.parseInt(str3) > 0) {
                jSONObject.put("is_from_push", CastIntegerProtector.parseInt(str3));
                jSONObject.put("push_id", mobParams.get("push_id"));
                jSONObject.put("push_type", mobParams.get("push_type"));
            }
        }
    }

    public static final void LJII(C735410St1 c735410St1, Fragment fragment) {
        Bundle arguments;
        if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getInt("is_from_push", 0) > 0) {
            c735410St1.LIZLLL(1, "is_from_push");
            c735410St1.LJ("push_id", arguments.getString("push_id"));
            c735410St1.LJ("push_type", arguments.getString("push_type"));
        }
    }

    public static final void LJIIIIZZ(C2344009Gk c2344009Gk, Fragment fragment) {
        Bundle arguments;
        if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getInt("is_from_push", 0) > 0) {
            c2344009Gk.LIZJ(1, "is_from_push");
            c2344009Gk.LJFF("push_id", arguments.getString("push_id"));
            c2344009Gk.LJFF("push_type", arguments.getString("push_type"));
        }
    }
}
