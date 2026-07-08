package X;

import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS132S1100000_18;
import kotlin.jvm.internal.AwS6S2110000_18;

/* JADX INFO: renamed from: X.0hH1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197730hH1 extends AbstractC1196150hET {
    public static final C1197730hH1 LIZ = new C1197730hH1();
    public static final String LIZIZ = "poi_search";
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(707));

    @Override // X.AbstractC1196150hET
    public final String LIZIZ() {
        return LIZIZ;
    }

    public final void LJ(EnumC1197740hH2 enumC1197740hH2, String str) {
        LIZJ("poi_search_empty", new AwS132S1100000_18(enumC1197740hH2, str, 17));
    }

    public static void LIZLLL(C1197730hH1 c1197730hH1, boolean z, String str, String str2, int i) {
        String str3 = str2;
        String str4 = str;
        if ((i & 2) != 0) {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c1197730hH1.getClass();
        c1197730hH1.LIZJ("poi_creator_invite_banner_load_lynx", new AwS6S2110000_18(z, (Integer) null, str4, str3, 2));
    }
}
