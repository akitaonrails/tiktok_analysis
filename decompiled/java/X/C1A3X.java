package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1A3X, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3X {
    public static boolean LIZIZ;
    public static final C1A3X LIZ = new C1A3X();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(603));

    public static boolean LIZ(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return LIZLLL(context, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
    }

    public static boolean LIZIZ(Context context) {
        return LIZLLL(context, (String[]) LIZJ.getValue());
    }

    public static boolean LIZJ(Context context) {
        return LIZLLL(context, new String[]{"android.permission.CAMERA"});
    }

    public static boolean LIZLLL(Context context, String[] strArr) {
        Integer numValueOf;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = (String) C13LQ.LJJIIZ(i, strArr);
            if (str == null || (numValueOf = Integer.valueOf(C838410Wul.LIZ(context, str))) == null || numValueOf.intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void LJ(Activity activity, String[] strArr, TokenCert tokenCert, Function2 function2) {
        if (LIZIZ) {
            return;
        }
        C19514711Wn.LIZIZ.LIZIZ(activity, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C462980IDo(function2, 3));
    }

    public static void LJFF(C1A3X c1a3x, EcTakePhotoActivity ecTakePhotoActivity, String str, String str2, AwS577S0100000_33 awS577S0100000_33, AwS577S0100000_33 awS577S0100000_332, int i) {
        AFwS224S0000000_33 aFwS224S0000000_33;
        AFwS224S0000000_33 aFwS224S0000000_332 = null;
        if ((i & 8) != 0) {
            aFwS224S0000000_33 = AFwS224S0000000_33.get$arr$(604);
        } else {
            aFwS224S0000000_33 = null;
        }
        Function0 function0 = awS577S0100000_33;
        if ((i & 16) != 0) {
            function0 = AFwS224S0000000_33.get$arr$(605);
        }
        if ((i & 32) != 0) {
            aFwS224S0000000_332 = AFwS224S0000000_33.get$arr$(606);
        }
        Function0 awS573S0100000_29 = awS577S0100000_332;
        if ((i & 64) != 0) {
            awS573S0100000_29 = new AwS573S0100000_29(ecTakePhotoActivity, 1043);
        }
        c1a3x.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(ecTakePhotoActivity);
        c1397580mTM.LJI(str);
        c1397580mTM.LIZIZ(str2);
        c1397580mTM.LJII = true;
        C985403tE.LIZ(c1397580mTM, new AwS240S0300000_31(awS573S0100000_29, (Function0<Unit>) aFwS224S0000000_33, (Function0<Unit>) function0, (Function0<Unit>) 40));
        c1397580mTM.LIZLLL(new AwS612S0100000_33(aFwS224S0000000_332, (Function0<Unit>) 220));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        C1391850mK7.LIZIZ(c1397510mTF, "673");
        c1397510mTF.LIZLLL();
        LIZIZ = true;
    }
}
