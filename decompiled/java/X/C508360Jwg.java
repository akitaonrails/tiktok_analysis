package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508360Jwg {
    public static SubscriptionPrivilegeDetailFragment LIZ(DataChannel dataChannel, String str, String str2, Map map, InterfaceC508600Jx4 interfaceC508600Jx4, Boolean bool, EnumC507490JvH enumC507490JvH, String str3, String str4, String str5, long j, String str6, C508400Jwk c508400Jwk, C510230Jzh c510230Jzh, C510200Jze c510200Jze, int i) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Integer numLJIIJJI;
        String str7 = str3;
        EnumC507490JvH enumC507490JvH2 = enumC507490JvH;
        long j2 = j;
        String str8 = str4;
        Function1<? super Boolean, Unit> c07s3 = c510200Jze;
        Function0<Unit> c508610Jx5 = c510230Jzh;
        C508400Jwk c508400Jwk2 = c508400Jwk;
        String str9 = str6;
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            enumC507490JvH2 = null;
        }
        if ((i & 256) != 0) {
            str7 = null;
        }
        String str10 = "";
        if ((i & 512) != 0) {
            str8 = "";
        }
        if ((i & 1024) != 0) {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j2 = 0;
        }
        if ((i & 8192) != 0) {
            str9 = "";
        }
        if ((i & 16384) != 0) {
            c508400Jwk2 = null;
        }
        if ((32768 & i) != 0) {
            c508610Jx5 = new C508610Jx5();
        }
        if ((i & 65536) != 0) {
            c07s3 = new C07S3();
        }
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = new SubscriptionPrivilegeDetailFragment();
        subscriptionPrivilegeDetailFragment.LLLIILIL = SystemClock.elapsedRealtime();
        if (bool != null) {
            subscriptionPrivilegeDetailFragment.LL = Boolean.valueOf(bool.booleanValue());
        }
        subscriptionPrivilegeDetailFragment.LLIZ = c07s3;
        subscriptionPrivilegeDetailFragment.LLILZ = c508610Jx5;
        subscriptionPrivilegeDetailFragment.LLJJ = dataChannel;
        subscriptionPrivilegeDetailFragment.LLILZIL = str;
        subscriptionPrivilegeDetailFragment.LLILZLL = str2;
        if (str7 == null) {
            str7 = "";
        }
        subscriptionPrivilegeDetailFragment.LLJJI = str7;
        subscriptionPrivilegeDetailFragment.LLLLJ = interfaceC508600Jx4;
        subscriptionPrivilegeDetailFragment.LLILLL = enumC507490JvH2;
        subscriptionPrivilegeDetailFragment.LLJJIJIL = str8;
        subscriptionPrivilegeDetailFragment.LLJJIJIIJIL = j2;
        if (str5 != null) {
            str10 = str5;
        }
        if (str10.length() == 0) {
            if (c508400Jwk2 != null) {
                str10 = c508400Jwk2.LIZIZ;
            } else {
                str10 = null;
            }
        }
        subscriptionPrivilegeDetailFragment.LLLLLILLIL = str10;
        subscriptionPrivilegeDetailFragment.LLJIJIL = str9;
        subscriptionPrivilegeDetailFragment.LLJJIJI.putAll(map);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                subscriptionPrivilegeDetailFragment.LLJJJ.put((String) entry.getKey(), (String) value);
            }
        }
        subscriptionPrivilegeDetailFragment.LLLLLIL = Intrinsics.LJFF(str9, EnumC504050Jpj.SUB_ONLY_VIDEO.getSource());
        subscriptionPrivilegeDetailFragment.LLJJIII = c508400Jwk2;
        if (c508400Jwk2 != null && (uri = c508400Jwk2.LJI) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "link_id")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            subscriptionPrivilegeDetailFragment.LLJI = numLJIIJJI.intValue();
        }
        return subscriptionPrivilegeDetailFragment;
    }
}
