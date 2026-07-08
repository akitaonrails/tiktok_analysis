package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0XFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845580XFc {
    public static final int LIZ(C0XFZ c0xfz) {
        if (c0xfz instanceof C845560XFa) {
            return ((C845560XFa) c0xfz).LIZ.getErrorCode();
        }
        return 0;
    }

    public static final Long LIZIZ(C0XFZ c0xfz) {
        Object obj;
        Object obj2;
        Object obj3;
        if (c0xfz instanceof C0XFX) {
            Map<String, Object> map = ((C0XFX) c0xfz).LIZLLL;
            if (map != null) {
                obj3 = map.get("tt_launch_ahead");
            } else {
                obj3 = null;
            }
            if (!(obj3 instanceof Long)) {
                return null;
            }
            return (Long) obj3;
        }
        if (c0xfz instanceof C0XFY) {
            Map<String, Object> map2 = ((C0XFY) c0xfz).LIZLLL;
            if (map2 != null) {
                obj2 = map2.get("tt_launch_ahead");
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof Long)) {
                return null;
            }
            return (Long) obj2;
        }
        if (!(c0xfz instanceof C845560XFa)) {
            return null;
        }
        Map<String, Object> map3 = ((C845560XFa) c0xfz).LJFF;
        if (map3 != null) {
            obj = map3.get("tt_launch_ahead");
        } else {
            obj = null;
        }
        if (!(obj instanceof Long)) {
            return null;
        }
        return (Long) obj;
    }

    public static final boolean LIZJ(String str) {
        Object c098200Yq;
        Long lLJIILIIL;
        if (str == null || str.length() == 0) {
            return true;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return true;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "x-expires");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null && lLJIILIIL.longValue() < System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(OneTapLoginShareInfo oneTapLoginShareInfo) {
        if (oneTapLoginShareInfo.userId.length() > 0 && oneTapLoginShareInfo.idToken.length() > 0 && oneTapLoginShareInfo.deviceSecret.length() > 0 && oneTapLoginShareInfo.username.length() > 0) {
            return true;
        }
        return false;
    }
}
