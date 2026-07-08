package X;

import com.ss.android.ugc.aweme.ab.EcSearchNoCartDiversionConfigModel;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0qqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565820qqi {
    public static final EcSearchNoCartDiversionConfigModel LIZ = new EcSearchNoCartDiversionConfigModel(0, 0, null, null, null, null, 63, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(42));
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        LIZJ = LIZ().pauseScreenshotEnable == 1;
        LIZLLL = LIZ().requestControl == 1;
    }

    public static EcSearchNoCartDiversionConfigModel LIZ() {
        return (EcSearchNoCartDiversionConfigModel) LIZIZ.getValue();
    }
}
