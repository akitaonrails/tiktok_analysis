package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoApi;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoMessageApiDefault;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0pEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503800pEg {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static TakoApi LIZLLL;
    public static TakoApi LJ;
    public static List<C1503750pEb> LJFF;

    static {
        TakoApi takoApi;
        TakoApi takoApi2;
        List<C1503750pEb> arrayList;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(549));
        LIZ = c01gwLIZIZ;
        LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(551));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(550));
        LIZJ = c01gwLIZIZ2;
        C1503780pEe c1503780pEe = C1503760pEc.LIZ;
        if (c1503780pEe.LIZ.LIZIZ) {
            takoApi = (TakoApi) c01gwLIZIZ.getValue();
            InterfaceC1631630sYr<Boolean, String, Boolean, String, Unit> interfaceC1631630sYr = c1503780pEe.LIZIZ.LIZ;
            if (interfaceC1631630sYr != null) {
                Boolean bool = Boolean.FALSE;
                interfaceC1631630sYr.invoke(bool, "stage_create_api_fix", bool, null);
            }
        } else {
            takoApi = TakoMessageApiDefault.LIZ;
        }
        LIZLLL = takoApi;
        if (c1503780pEe.LIZ.LIZIZ) {
            takoApi2 = (TakoApi) c01gwLIZIZ2.getValue();
            InterfaceC1631630sYr<Boolean, String, Boolean, String, Unit> interfaceC1631630sYr2 = c1503780pEe.LIZIZ.LIZ;
            if (interfaceC1631630sYr2 != null) {
                interfaceC1631630sYr2.invoke(Boolean.TRUE, "stage_create_api_fix", Boolean.FALSE, null);
            }
        } else {
            takoApi2 = TakoMessageApiDefault.LIZ;
        }
        LJ = takoApi2;
        if (c1503780pEe.LIZ.LIZIZ) {
            InterfaceC1631630sYr<Boolean, String, Boolean, String, Unit> interfaceC1631630sYr3 = c1503780pEe.LIZIZ.LIZ;
            if (interfaceC1631630sYr3 != null) {
                interfaceC1631630sYr3.invoke(Boolean.TRUE, "stage_create_api_fix", Boolean.FALSE, null);
            }
            arrayList = (List) C1503740pEa.LIZ.getValue();
        } else {
            arrayList = new ArrayList<>();
        }
        LJFF = arrayList;
    }
}
