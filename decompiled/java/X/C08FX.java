package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08FX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08FX {
    public static ArrayList<String> LIZ;
    public static final HashMap<String, ArrayList<C15MX>> LIZIZ = new HashMap<>();

    static {
        List<String> apiAlogWhiteList;
        LIZ = new ArrayList<>();
        try {
            apiAlogWhiteList = C0CLW.LIZIZ.LIZ.getApiAlogWhiteList();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            apiAlogWhiteList = null;
        }
        if (!C086I.LIZIZ(apiAlogWhiteList)) {
            LIZ = (ArrayList) apiAlogWhiteList;
            return;
        }
        ArrayList<String> arrayList = LIZ;
        C844470XAv.LIZ.getClass();
        C19719612Di.LJJII(arrayList, C844470XAv.LIZ().getResources().getStringArray(R.array.aa));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(String str, C0X52 c0x52) {
        BaseResponse baseResponse;
        C080U next;
        String str2;
        String str3;
        Uri uri = UriProtector.parse(str);
        if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "device_id")) && !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aid"))) {
            String path = uri.getPath();
            T t = c0x52.LIZIZ;
            Integer numValueOf = null;
            if (t instanceof BaseResponse) {
                baseResponse = (BaseResponse) t;
            } else {
                baseResponse = null;
            }
            Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, "x-tt-logid")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C080U c080u = next;
            if (c080u != null) {
                str2 = c080u.LIZIZ;
            } else {
                str2 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("code=");
            sbLIZ.append(c0x52.LIZ.LIZIZ);
            sbLIZ.append(" reason=");
            C2175508fh c2175508fh = c0x52.LIZ;
            if (c2175508fh != null) {
                str3 = c2175508fh.LIZJ;
            } else {
                str3 = null;
            }
            sbLIZ.append(str3);
            sbLIZ.append(" status_code=");
            if (baseResponse != null) {
                numValueOf = Integer.valueOf(baseResponse.status_code);
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(" path=");
            sbLIZ.append(path);
            sbLIZ.append(" log_id=");
            sbLIZ.append(str2);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("API_URL_HEADER", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
