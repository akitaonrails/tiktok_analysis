package X;

import java.util.Collections;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AFwS336S0000000_12;

/* JADX INFO: renamed from: X.0Umz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782630Umz {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final C01GW LIZJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(354));

    public static void LIZ() {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LIZIZ((String) LIZJ.getValue(), "live_broadcast_end", null);
    }

    public static void LIZIZ() {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        if (C1537060q6K.LJI("live_broadcast_end") != null) {
            return;
        }
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LIZ = "live_broadcast_end";
        c1097680efe.LJIJJLI = Collections.singletonList(LIZJ.getValue());
        c1097680efe.LJJ = true;
        c1097680efe.LJIJJ = AFwS336S0000000_12.get$arr$(4);
        c1097680efe.LJIIIIZZ = AFwS296S0000000_12.get$arr$(12);
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
    }

    public static void LIZJ() {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C01GW c01gw = LIZJ;
        if (C1537060q6K.LIZ("live_broadcast_end", (String) c01gw.getValue())) {
            return;
        }
        LIZ = true;
        C1537060q6K.LJIIJ((String) c01gw.getValue(), "live_broadcast_end", null, new C1537070q6L() { // from class: X.0Un0
            @Override // X.C1537070q6L
            public final void LIZJ(String str, String str2, C1537080q6M c1537080q6M) {
                C782630Umz.LIZIZ = true;
                C782630Umz.LIZ = false;
            }

            @Override // X.C1537070q6L
            public final void LIZLLL(String str, String str2, InterfaceC1105930esx interfaceC1105930esx) {
                C782630Umz.LIZ = false;
            }
        }, true, Boolean.FALSE);
    }
}
