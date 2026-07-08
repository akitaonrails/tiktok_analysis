package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Svt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737190Svt {
    public static final C737190Svt LIZ = new C737190Svt();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2314));

    public static int LIZLLL() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static boolean LIZ() {
        return LIZLLL() == 4;
    }

    public static boolean LIZIZ() {
        return LIZLLL() != 0;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (!LIZIZ() || aweme == null || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || AwemeExtKt.isProhibited(aweme) || !aweme.isCanPlay() || AwemeExtKt.isDelete(aweme) || C0OAD.LIZIZ(aweme)) {
            return false;
        }
        return true;
    }
}
