package X;

import com.ss.android.ugc.aweme.ab.EcSearchDiversionEntranceConfigModel;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Qq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682620Qq4 {
    public static final EcSearchDiversionEntranceConfigModel LIZ = new EcSearchDiversionEntranceConfigModel(0, 0, null, 0, null, 0, null, 0, 0, 511, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(40));
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final List<String> LJ;
    public static final boolean LJFF;
    public static final List<String> LJI;

    static {
        LIZJ = LIZ().enableAll == 1;
        LIZLLL = LIZ().enable == 1;
        LJ = LIZ().enterFromFilter;
        LJFF = LIZ().ignoreUserActionEnable == 1;
        LJI = LIZ().ignoreUserActionEnterFromFilter;
        LIZ();
    }

    public static EcSearchDiversionEntranceConfigModel LIZ() {
        return (EcSearchDiversionEntranceConfigModel) LIZIZ.getValue();
    }
}
