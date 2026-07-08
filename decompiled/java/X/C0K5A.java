package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K5A, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5A {
    public static SubscriptionPrivilegeDetailFragment LIZ(SubscriptionSceneContext subscriptionSceneContext, String str, String str2, Map map, Boolean bool, EnumC510710K1d enumC510710K1d, String str3, String str4, String str5, String str6, AwS551S0100000_7 awS551S0100000_7, AwS586S0100000_7 awS586S0100000_7, int i) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Integer numLJIIJJI;
        String str7 = str6;
        Function0<Unit> function0 = awS551S0100000_7;
        Function1<? super Boolean, Unit> function1 = awS586S0100000_7;
        String str8 = null;
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            enumC510710K1d = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        String str9 = "";
        if ((i & 256) != 0) {
            str4 = "";
        }
        if ((i & 512) != 0) {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str7 = "";
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            function0 = AFwS193S0000000_7.get$arr$(180);
        }
        if ((i & 8192) != 0) {
            function1 = AFwS231S0000000_3.get$arr$(97);
        }
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = new SubscriptionPrivilegeDetailFragment();
        subscriptionPrivilegeDetailFragment.LLLIIIL = SystemClock.elapsedRealtime();
        if (bool != null) {
            subscriptionPrivilegeDetailFragment.LLILLJJLI = Boolean.valueOf(bool.booleanValue());
        }
        subscriptionPrivilegeDetailFragment.LLIZLLLIL = function1;
        subscriptionPrivilegeDetailFragment.LLILZIL = function0;
        subscriptionPrivilegeDetailFragment.LLJJI = subscriptionSceneContext;
        subscriptionPrivilegeDetailFragment.LLILZLL = str;
        subscriptionPrivilegeDetailFragment.LLIZ = str2;
        if (str3 == null && (subscriptionSceneContext == null || (str3 = subscriptionSceneContext.anchorSecUid) == null)) {
            str3 = "";
        }
        subscriptionPrivilegeDetailFragment.LLJJIII = str3;
        subscriptionPrivilegeDetailFragment.LLILZ = enumC510710K1d;
        subscriptionPrivilegeDetailFragment.LLJJIJIIJIL = str4;
        if (str5 != null) {
            str9 = str5;
        }
        if (str9.length() == 0) {
            if (subscriptionSceneContext != null) {
                str8 = subscriptionSceneContext.initPackageId;
            }
            str9 = str8;
        }
        subscriptionPrivilegeDetailFragment.LLLLLIL = str9;
        subscriptionPrivilegeDetailFragment.LLJIJIL = str7;
        subscriptionPrivilegeDetailFragment.LLJJIJI.putAll(map);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                subscriptionPrivilegeDetailFragment.LLJJIJIL.put((String) entry.getKey(), (String) value);
            }
        }
        subscriptionPrivilegeDetailFragment.LLLLL = Intrinsics.LJFF(str7, EnumC510620K0u.SUB_ONLY_VIDEO.getSource());
        if (subscriptionSceneContext != null && (uri = subscriptionSceneContext.schemaUri) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "link_id")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            subscriptionPrivilegeDetailFragment.LLJI = numLJIIJJI.intValue();
        }
        return subscriptionPrivilegeDetailFragment;
    }
}
