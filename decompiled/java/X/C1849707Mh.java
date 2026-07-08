package X;

import com.ss.android.ugc.aweme.ab.EcSearchMiddleHistoryRequestConfigModel;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07Mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1849707Mh {
    public static final EcSearchMiddleHistoryRequestConfigModel LIZ = new EcSearchMiddleHistoryRequestConfigModel(0, null, 3, null);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final List<String> LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(363));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((EcSearchMiddleHistoryRequestConfigModel) c01gwLIZIZ.getValue()).enable == 1;
        LIZLLL = ((EcSearchMiddleHistoryRequestConfigModel) c01gwLIZIZ.getValue()).requestKeys;
    }
}
