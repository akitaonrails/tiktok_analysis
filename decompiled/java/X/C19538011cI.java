package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.11cI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19538011cI {
    public static final /* synthetic */ int LJ = 0;
    public final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, C19538611cO> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();

    public static String LIZ(C19536311c1 c19536311c1) {
        String strLIZ = C349090DmN.LIZ(c19536311c1);
        if (strLIZ == null) {
            return null;
        }
        String strLJII = C1664460tPo.LJII(c19536311c1.LIZJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(strLJII);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ(C19536311c1 c19536311c1) {
        String strLIZ = LIZ(c19536311c1);
        if (strLIZ != null) {
            return this.LIZLLL.get(strLIZ);
        }
        return null;
    }
}
