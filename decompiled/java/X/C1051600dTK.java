package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051600dTK {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1421));
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS204S0000000_16.get$arr$(546));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(544));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(539));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(540));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(542));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(543));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(538));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(537));
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(545));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(541));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(536));

    public static boolean LIZ(int i) {
        if ((((Number) LIZ.getValue()).intValue() & i) == i) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(Runnable runnable) {
        if (!((Boolean) LJII.getValue()).booleanValue()) {
            runnable.run();
        } else {
            C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), C0PEM.LIZJ, null, new C375601d4(runnable, null), 2);
        }
    }

    public static boolean LIZIZ(Aweme aweme, boolean z) {
        String awesomeSplashId;
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        if (z) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (splashInfo = awemeRawAd.getSplashInfo()) != null) {
                awesomeSplashId = splashInfo.getAwesomeSplashId();
            } else {
                awesomeSplashId = null;
            }
            if (!(!TextUtils.isEmpty(awesomeSplashId))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
