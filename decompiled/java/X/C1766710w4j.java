package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonutils.CommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS466S0200000_31;

/* JADX INFO: renamed from: X.0w4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766710w4j {
    public static final C1766710w4j LIZ = new C1766710w4j();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(413));

    public static boolean LIZ(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return LIZJ(context, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
    }

    public static boolean LIZIZ(Context context) {
        return LIZJ(context, (String[]) LIZIZ.getValue());
    }

    public static boolean LIZJ(Context context, String[] strArr) {
        AnonymousClass0317 anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin;
        Integer numValueOf;
        boolean z;
        String name = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = CommonUtilsDependencyService.createICommonUtilsDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ICommonUtilsDependencyService.class.getName();
            if (anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonUtilsDependencyService.class);
        }
        ((ICommonUtilsDependencyService) anonymousClass0317CreateICommonUtilsDependencyServicebyMonsterPlugin).getConfigurationChangedManager();
        if (context == null) {
            return false;
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = (String) C13LQ.LJJIIZ(i, strArr);
            if (str == null || (numValueOf = Integer.valueOf(C838410Wul.LIZ(context, str))) == null || numValueOf.intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void LIZLLL(C1766710w4j c1766710w4j, Activity activity, String[] strArr, AwS394S0200000_28 awS394S0200000_28, AwS466S0200000_31 awS466S0200000_31, int i) {
        if ((i & 4) != 0) {
            awS394S0200000_28 = null;
        }
        if ((i & 8) != 0) {
            awS466S0200000_31 = null;
        }
        c1766710w4j.getClass();
        C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-photo_tryon_request_album_permission")).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C462970IDn(awS466S0200000_31, awS394S0200000_28, 1));
    }
}
