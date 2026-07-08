package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.model.ShareConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0luN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375890luN {
    public static long LIZIZ;
    public static long LIZJ;
    public static final C1375890luN LIZ = new C1375890luN();
    public static final Map<String, EnumC1373410lqN> LIZLLL = ShareConfig.LIZ.getValue();

    public static String LIZ(String str) {
        if (str != null && str.length() != 0 && "enable_checksum".length() != 0) {
            C0XI4 c0xi4 = new C0XI4(str);
            c0xi4.LIZIZ(1, "enable_checksum");
            return c0xi4.LJFF();
        }
        return str;
    }

    public static int LIZJ(String str) {
        if (str.length() == 0) {
            return 1;
        }
        return C703302op.LIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "share_link_id")) ? 1 : 0;
    }

    public static String LIZIZ(String str, String str2) {
        if (str.length() != 0 && "checksum_invitation_scene".length() != 0 && str2.length() != 0) {
            C0XI4 c0xi4 = new C0XI4(str);
            c0xi4.LJ("checksum_invitation_scene", str2);
            return c0xi4.LJFF();
        }
        return str;
    }

    public static EnumC1373410lqN LIZLLL(String str, String str2) {
        Object c098200Yq;
        EnumC1373410lqN enumC1373410lqN = LIZLLL.get(str);
        if (enumC1373410lqN == null) {
            enumC1373410lqN = EnumC1373410lqN.SHARE_DEFAULT;
        }
        try {
            c098200Yq = UriProtector.parse(str2);
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
        if (uri != null) {
            if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "aweme_type"), "40") || Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_tiktok_story"), "true")) {
                return EnumC1373410lqN.SHARE_STORY;
            }
            return enumC1373410lqN;
        }
        return enumC1373410lqN;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(1:4)|5|(2:7|(2:89|90)(19:11|(1:13)|14|(1:16)|17|(0)(1:21)|22|(4:25|(1:27)|28|(1:30))|31|(2:33|(1:35))(1:81)|36|(1:80)(7:44|(1:46)|47|(1:49)|(1:79)(1:53)|54|(1:56)(2:75|(1:77)(1:78)))|57|(2:59|(1:61)(2:(1:66)|67))(3:68|(1:74)(1:72)|73)|62|91|84|87|88))(1:82)|83|22|(4:25|(0)|28|(0))|31|(0)(0)|36|(2:38|80)(0)|57|(0)(0)|62|91|84|87|88) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f2, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0 = 3000;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC19483511Kn LJ(int r18, final java.lang.String r19, final java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1375890luN.LJ(int, java.lang.String, java.lang.String, java.lang.String):X.11Kn");
    }
}
