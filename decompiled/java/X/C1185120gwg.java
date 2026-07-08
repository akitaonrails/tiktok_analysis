package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185120gwg extends AbstractC1181700grA {
    public final Map<String, PoiDetailVideoListModel> LIZIZ = new LinkedHashMap();
    public final Map<String, PoiDetailVideoListModel> LIZJ = new LinkedHashMap();
    public String LIZLLL;

    public final PoiDetailVideoListModel LIZ() {
        PoiDetailVideoListModel poiDetailVideoListModel = (PoiDetailVideoListModel) ((LinkedHashMap) this.LIZIZ).get(this.LIZLLL);
        if (poiDetailVideoListModel != null) {
            return poiDetailVideoListModel;
        }
        return (PoiDetailVideoListModel) ((LinkedHashMap) this.LIZJ).get(this.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(C1185120gwg c1185120gwg, PoiDetailVideoListModel poiDetailVideoListModel, String str, int i) {
        boolean z;
        C1185410gx9 c1185410gx9;
        Fragment fragmentLJI;
        String strLIZLLL;
        C1185160gwk c1185160gwkLIZIZ;
        List<Aweme> listLIZ;
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = i & 4;
        String initialPoiFromGroupId = null;
        if (i2 != 0) {
            str = null;
        }
        c1185120gwg.LIZLLL = str;
        if (!Intrinsics.LJFF(((LinkedHashMap) c1185120gwg.LIZJ).get(str), poiDetailVideoListModel)) {
            if (((LinkedHashMap) c1185120gwg.LIZIZ).get(str) == null && z) {
                c1185120gwg.LIZIZ.put(str, poiDetailVideoListModel);
            }
            c1185120gwg.LIZJ.put(str, poiDetailVideoListModel);
            InterfaceC1181010gq3 interfaceC1181010gq3 = c1185120gwg.LIZ;
            if (interfaceC1181010gq3 != null && (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) != null && (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) != null) {
                c1185410gx9 = c1185600gxS.LJFF;
            } else {
                c1185410gx9 = null;
            }
            InterfaceC1181010gq3 interfaceC1181010gq32 = c1185120gwg.LIZ;
            if (interfaceC1181010gq32 != null && (fragmentLJI = C724240Sb0.LJI(interfaceC1181010gq32)) != null && (c1185160gwkLIZIZ = C1185180gwm.LIZIZ((strLIZLLL = C1181890grT.LIZLLL(fragmentLJI)))) != null && c1185160gwkLIZIZ.LIZIZ == null) {
                if (poiDetailVideoListModel != null) {
                    listLIZ = poiDetailVideoListModel.LIZ();
                } else {
                    listLIZ = null;
                }
                String initialEnterFrom = c1185160gwkLIZIZ.LIZLLL;
                if (initialEnterFrom == null) {
                    if (c1185410gx9 != null) {
                        initialEnterFrom = c1185410gx9.getInitialEnterFrom();
                    } else {
                        initialEnterFrom = null;
                    }
                }
                String initialEnterMethod = c1185160gwkLIZIZ.LJ;
                if (initialEnterMethod == null) {
                    if (c1185410gx9 != null) {
                        initialEnterMethod = c1185410gx9.getInitialEnterMethod();
                    } else {
                        initialEnterMethod = null;
                    }
                }
                String str2 = c1185160gwkLIZIZ.LJFF;
                if (str2 == null) {
                    if (c1185410gx9 != null) {
                        initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId();
                    }
                } else {
                    initialPoiFromGroupId = str2;
                }
                C1185180gwm.LIZ(strLIZLLL, new C1185160gwk(c1185160gwkLIZIZ.LIZJ, listLIZ, initialEnterFrom, initialEnterMethod, c1185160gwkLIZIZ.LIZ, initialPoiFromGroupId));
            }
        }
    }
}
