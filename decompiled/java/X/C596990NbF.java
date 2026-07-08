package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0NbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596990NbF {
    public static final C596990NbF LIZ = new C596990NbF();
    public static InterfaceC625970Ogt LIZIZ;
    public static LinkedHashMap<String, String> LIZJ;

    static {
        C2214201BlK.LIZ().LJJIL(new InterfaceC19483011Ki() { // from class: X.0NbG
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C08B7;
            }
        }).LIZIZ(new C639040P4s(0));
    }

    public static String LIZ(String str) {
        String str2;
        LinkedHashMap<String, String> linkedHashMap = LIZJ;
        if (linkedHashMap == null) {
            C589140N8u.LJ.LJIL(str, "failed", "watch history doesn't exist");
        }
        if (linkedHashMap != null && (str2 = linkedHashMap.get(str)) != null) {
            C589140N8u.LJ.LJIL(str, "success", null);
            return str2;
        }
        C589140N8u.LJ.LJIL(str, "failed", "no watch history for this playlist");
        return "";
    }
}
