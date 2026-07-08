package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.tablet.impl.experiment.TabletsScanLoginModel;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.051F, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051F {
    public static final n LIZ = new n();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(683));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(682));

    public static String LIZ() {
        String str = ((TabletsScanLoginModel) LIZJ.getValue()).urls.get("eu-ttp");
        return str == null ? "" : str;
    }

    public static String LIZIZ() {
        return ((TabletsScanLoginModel) LIZJ.getValue()).host;
    }

    public static String LIZJ() {
        String str = ((TabletsScanLoginModel) LIZJ.getValue()).urls.get("row");
        return str == null ? "" : str;
    }

    public static String LIZLLL() {
        String str = ((TabletsScanLoginModel) LIZJ.getValue()).urls.get("ttp");
        return str == null ? "" : str;
    }

    public static Map LJ() {
        return ((TabletsScanLoginModel) LIZJ.getValue()).urls;
    }
}
