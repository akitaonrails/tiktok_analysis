package X;

import Y.ACallableS431S0100000_28;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0zlA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908340zlA {
    public static C1908350zlB LIZ;

    static {
        C622680Oba.LIZJ(new C1908340zlA());
    }

    public static void LIZIZ() {
        C1908350zlB c1908350zlB = LIZ;
        if (c1908350zlB != null) {
            String str = c1908350zlB.LIZ;
            int i = c1908350zlB.LIZIZ;
            String str2 = c1908350zlB.LIZJ;
            boolean z = c1908350zlB.LIZLLL;
            long j = c1908350zlB.LJ;
            long j2 = c1908350zlB.LJFF;
            String str3 = c1908350zlB.LJI;
            C15O7.LIZJ(new ACallableS431S0100000_28(new C1908350zlB(str, j, j2, c1908350zlB.LJIIIZ, i, z, str2, c1908350zlB.LJII, str3, c1908350zlB.LJIIIIZZ), 23));
            LIZ = null;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDetailAwemeEvent(C0N3N c0n3n) {
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(c0n3n, 181);
        C1908350zlB c1908350zlB = LIZ;
        if (c1908350zlB != null) {
            awS607S0100000_28.invoke(c1908350zlB);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDetailFirstFrameEvent(C2037707yZ c2037707yZ) {
        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(c2037707yZ, 182);
        C1908350zlB c1908350zlB = LIZ;
        if (c1908350zlB != null) {
            awS607S0100000_28.invoke(c1908350zlB);
        }
    }

    public static void LIZ(Integer num, String str, String str2) {
        boolean z;
        String str3 = str2;
        int iIntValue = 0;
        if (str != null && a0.LJJIIZI(str, "aweme://aweme/detail/", false)) {
            try {
                Uri uri = UriProtector.parse(str);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, FollowStatusChangeMethod.PARAM_UID);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str4 = null;
                if (z) {
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments != null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = pathSegments.get(1);
                    } else {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                    }
                }
                if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    C1908350zlB c1908350zlB = LIZ;
                    if (c1908350zlB != null) {
                        str4 = c1908350zlB.LIZ;
                    }
                    C1908350zlB c1908350zlB2 = new C1908350zlB(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 0L, 0L, 0L, iIntValue, Intrinsics.LJFF(str4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), str3, 0, null, null);
                    c1908350zlB2.LJ = SystemClock.uptimeMillis();
                    LIZ = c1908350zlB2;
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
