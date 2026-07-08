package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20640115pf {
    public static String LIZ(String str) {
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        if (a0.LJJIIZI(str, "enter_from", false)) {
            str = LIZIZ(str, "enter_from");
            builderBuildUpon = UriProtector.parse(str).buildUpon();
        } else {
            builderBuildUpon.appendQueryParameter("enter_from", "inner_push");
        }
        if (a0.LJJIIZI(str, "enter_from_merge", false)) {
            str = LIZIZ(str, "enter_from_merge");
            builderBuildUpon = UriProtector.parse(str).buildUpon();
        } else {
            builderBuildUpon.appendQueryParameter("enter_from_merge", "inner_push");
        }
        if (!a0.LJJIIZI(str, "enter_method", false)) {
            builderBuildUpon.appendQueryParameter("enter_method", "inner_push");
        }
        return builderBuildUpon.toString();
    }

    public static TuxTextView LIZLLL(Context context) {
        String strLIZ;
        try {
            strLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIIJZLJL().LIZ(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZ = null;
        }
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(strLIZ);
        tuxTextView.setTextColor(-1);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setPadding((int) C654910PmT.LIZ(4.0f, context), 0, (int) C654910PmT.LIZ(4.0f, context), 0);
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(52);
        tuxTextView.setMinTextSize(6.0f);
        tuxTextView.LJJJJI(7.5f);
        tuxTextView.setBackgroundResource(R.drawable.cj9);
        return tuxTextView;
    }

    public static String LIZIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(str2);
            sbLIZ.append("=[^&]*)");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append('=');
            sbLIZ2.append("inner_push");
            return PatternProtector.compile(strLIZIZ).matcher(str).replaceAll(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.optString("event")) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0385 A[Catch: Exception -> 0x039c, TryCatch #0 {Exception -> 0x039c, blocks: (B:93:0x0347, B:95:0x036a, B:97:0x0370, B:98:0x037f, B:100:0x0385, B:102:0x0389, B:104:0x038f, B:107:0x0397), top: B:120:0x0347 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x036a A[Catch: Exception -> 0x039c, TryCatch #0 {Exception -> 0x039c, blocks: (B:93:0x0347, B:95:0x036a, B:97:0x0370, B:98:0x037f, B:100:0x0385, B:102:0x0389, B:104:0x038f, B:107:0x0397), top: B:120:0x0347 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage LIZJ(X.EnumC19331110k1 r104, org.json.JSONObject r105) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20640115pf.LIZJ(X.10k1, org.json.JSONObject):com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage");
    }
}
