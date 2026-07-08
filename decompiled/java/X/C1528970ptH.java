package X;

import android.net.Uri;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ptH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528970ptH {
    public static final C1528970ptH LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C1528980ptI LIZLLL;
    public volatile C09U0 LIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ptI] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1528970ptH.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZIZ = new C1528970ptH();
        LIZLLL = new InterfaceC1848330yCN() { // from class: X.0ptI
            @Override // X.InterfaceC1848330yCN
            public final void LIZ() {
            }

            @Override // X.InterfaceC1848330yCN
            public final void LIZIZ(InterfaceC1553650qX5 interfaceC1553650qX5) {
            }
        };
    }

    public static String LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (!u.LJJIIJZLJL(str, "http", false)) {
            Uri uriLJ = C1537540q76.LJ(str);
            if (!uriLJ.isHierarchical()) {
                return null;
            }
            String strLIZIZ = C1942307jB.LIZIZ(uriLJ, "url");
            if (strLIZIZ == null) {
                String strLIZIZ2 = C1942307jB.LIZIZ(uriLJ, "surl");
                if (strLIZIZ2 == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C1942307jB.LIZIZ(uriLJ, "channel"));
                    sbLIZ.append('/');
                    sbLIZ.append(C1942307jB.LIZIZ(uriLJ, "bundle"));
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return strLIZIZ2;
            }
            return strLIZIZ;
        }
        return str;
    }
}
