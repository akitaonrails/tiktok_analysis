package X;

import Y.ARunnableS104S0100000_4;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS10S1100100_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C29, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C29 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3797));

    public static void LIZ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS104S0100000_4(function0, 90));
        }
    }

    public static void LIZIZ(Activity activity, String str) {
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Debug: ");
            sbLIZ.append(str);
            LIZ(new AwS10S1100100_4(C2188811AlT.LIZIZ(sbLIZ), activity, 2000L, 2));
        }
    }

    public static void LIZJ(TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment, String str) {
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Debug: ");
            sbLIZ.append(str);
            LIZ(new AwS10S1100100_4(takoAiVideoDetailPageFragment, C2188811AlT.LIZIZ(sbLIZ), 2000L, 1));
        }
    }
}
