package X;

import android.net.Uri;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.InvalidParameterException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FGD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGD {
    public static Function1<? super String, String> LIZ;

    public static final String LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            return NLEEditorJniJNI.NLEResourceIdConverter_convertMusicIdResource(str);
        }
        throw new InvalidParameterException("genMusicUrs but musicId is empty");
    }

    public static final Pair<String, String> LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (!Intrinsics.LJFF(uri.getHost(), "effect_platform")) {
                return null;
            }
            return new Pair<>(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "panel"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "resource_id"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2219091BtD.LIZLLL().LIZIZ(e);
            return null;
        }
    }

    public static final String LIZLLL(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (!Intrinsics.LJFF(uri.getHost(), "effect_platform")) {
                return null;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "effect_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                if (!(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter))) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "effectId");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                if (true ^ a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2219091BtD.LIZLLL().LIZIZ(e);
            return null;
        }
    }

    public static final String LJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (Intrinsics.LJFF(uri.getHost(), "music_resource")) {
                return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "clip_id");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2219091BtD.LIZLLL().LIZIZ(e);
        }
        return null;
    }

    public static final String LIZ(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return NLEEditorJniJNI.NLEResourceIdConverter_convertLokiResourceWithResourceId(str, str2);
        }
        C2219091BtD.LIZLLL().LIZ("genUrs but resId or panel is empty");
        return "";
    }
}
