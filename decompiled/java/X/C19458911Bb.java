package X;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19458911Bb {
    public static final C19458911Bb LIZ = new C19458911Bb();

    public static long LIZIZ(Intent intent) {
        Object c098200Yq;
        String missionId;
        if (intent == null) {
            return -1L;
        }
        try {
            c098200Yq = (Mission) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LJII(LIZ(intent, "mission_data"), Mission.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Mission mission = (Mission) c098200Yq;
        if (mission == null || (missionId = mission.getMissionId()) == null) {
            return -1L;
        }
        return CastLongProtector.parseLong(missionId);
    }

    public static boolean LIZJ(Intent intent) {
        if (intent == null) {
            return false;
        }
        String strLIZ = LIZ(intent, "recordParam");
        String strLIZ2 = LIZ(intent, "type");
        if (!Intrinsics.LJFF(strLIZ, "mission") && !Intrinsics.LJFF(strLIZ2, "mission") && !Intrinsics.LJFF(strLIZ, "tcm")) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "recordParam");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "type");
        if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "mission") && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "mission") && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "tcm")) {
            return false;
        }
        return true;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
