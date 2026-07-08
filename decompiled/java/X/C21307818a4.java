package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.setting.IMImageShowEventSamplingRateSetting;
import java.net.MalformedURLException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18a4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21307818a4 {
    public static final String LIZ(String str) {
        if (str != null && !Intrinsics.LJFF(str, "")) {
            if (LJ(str, "statusCode: 403")) {
                return "CronetIOException: 403";
            }
            if (LJ(str, "statusCode: 404")) {
                return "CronetIOException: 404";
            }
            if (a0.LJJIIZI(str, "CronetUrlRequest", false)) {
                String strLJLJLJ = C13LN.LJLJLJ(a0.LJJJ(str, "CronetUrlRequest", 0, false, 6), str);
                int length = strLJLJLJ.length();
                for (int i = 0; i < length; i++) {
                    if (strLJLJLJ.charAt(i) == ',') {
                        return strLJLJLJ.substring(0, i);
                    }
                }
                return strLJLJLJ;
            }
            if (!a0.LJJIJ(str, ',')) {
                return str;
            }
            return (String) ListProtector.get(a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6), 0);
        }
        return null;
    }

    public static final float LIZIZ(String str) {
        IMImageShowEventSamplingRateSetting.LIZ.getClass();
        Map<String, Float> map = ((IMImageShowEventSamplingRateSetting.IMImageCacheSizeConfig) IMImageShowEventSamplingRateSetting.LIZJ.getValue()).sampRateMap;
        for (String str2 : map.keySet()) {
            if (u.LJJIIJZLJL(str, str2, false)) {
                Float f = map.get(str2);
                if (f != null) {
                    return f.floatValue();
                }
                return 0.1f;
            }
        }
        return 0.1f;
    }

    public static final String LIZJ(String str) {
        String strLJZL = "";
        if (!Intrinsics.LJFF(str, "") && str != null) {
            String canonicalName = C1332270km1.class.getCanonicalName();
            if (canonicalName != null && a0.LJJIIZI(str, canonicalName, false)) {
                return "UrlExpiredException";
            }
            if (LJ(str, C1494690ozz.class.getCanonicalName())) {
                String canonicalName2 = C1494690ozz.class.getCanonicalName();
                if (canonicalName2 != null) {
                    strLJZL = C13LN.LJZL(3, C13LN.LJLJLJ(14, C13LN.LJLJLJ(canonicalName2.length(), str)));
                }
                if (Intrinsics.LJFF(strLJZL, CardStruct.IStatusCode.DEFAULT)) {
                    return LIZ(str);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CronetIOException: ");
                sbLIZ.append(strLJZL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            if (LJ(str, MalformedURLException.class.getCanonicalName())) {
                return "MalformedURLException";
            }
            if (LJ(str, IllegalArgumentException.class.getCanonicalName())) {
                return "IllegalArgumentException";
            }
            if (LJ(str, IllegalStateException.class.getCanonicalName())) {
                return "IllegalStateException";
            }
            if (LJ(str, OutOfMemoryError.class.getCanonicalName())) {
                return "OutOfMemoryError";
            }
            if (LJ(str, UnsatisfiedLinkError.class.getCanonicalName())) {
                return "UnsatisfiedLinkError";
            }
            if (LJ(str, C1494430ozZ.class.getCanonicalName())) {
                return "HttpResponseException";
            }
            if (LJ(str, C1494450ozb.class.getCanonicalName())) {
                return "NetworkNotAvailabeException";
            }
            if (LJ(str, C1329280khC.class.getCanonicalName())) {
                return "DecodeException";
            }
            if (LJ(str, C0V01.class.getCanonicalName())) {
                return "InvalidValueException";
            }
            if (LJ(str, C0VFX.class.getCanonicalName())) {
                return "InvalidSizeException";
            }
            if (LJ(str, C0VFY.class.getCanonicalName())) {
                return "SizeTooLargeException";
            }
            if (LJ(str, C0V02.class.getCanonicalName())) {
                return "PoolSizeViolationException";
            }
            return LIZ(str);
        }
        return null;
    }

    public static final int LIZLLL(C869590Y9l c869590Y9l, boolean z) {
        String str;
        String str2;
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        if (localExt != null && (str2 = localExt.get("is_cover_success_loaded")) != null && Boolean.parseBoolean(str2)) {
            return 0;
        }
        if (z) {
            C0YNY c0yny = InterfaceC874680YTa.LIZ;
            C869590Y9l c869590Y9lLIZLLL = C0YNY.LIZ(c0yny).LIZLLL(c869590Y9l.getUuid());
            if (c869590Y9lLIZLLL != null) {
                Map<String, String> localExt2 = c869590Y9lLIZLLL.getLocalExt();
                if (localExt2 != null && (str = localExt2.get("is_cover_success_loaded")) != null && Boolean.parseBoolean(str)) {
                    return 0;
                }
                if (c869590Y9lLIZLLL != null) {
                    c869590Y9l.getLocalExt().put("is_cover_success_loaded", "true");
                    c869590Y9lLIZLLL.getLocalExt().put("is_cover_success_loaded", "true");
                    C603540Nlo.LIZ(C0YNY.LIZ(c0yny).LIZIZ(), c869590Y9lLIZLLL, "is_cover_success_loaded", new C0Y3R("true"), new C0Y3I("mark this msg's thumbnail has been loaded successfully"));
                }
            }
            return 1;
        }
        return -1;
    }

    public static final boolean LJ(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return u.LJJIIJZLJL(str, str2, false);
    }
}
