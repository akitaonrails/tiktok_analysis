package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557210LtH {
    public final InterfaceC497601wk LIZ;
    public AnonymousClass0956 LIZLLL;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 6));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(18));
    public final C11PQ<Integer> LJ = new C11PQ<>();
    public final String LJFF = "";
    public final C01GW LJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(19));

    public C557210LtH(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZ(String str) {
        switch (str.hashCode()) {
            case -2084521848:
                if (!str.equals("DOWNLOAD")) {
                    return -1;
                }
                return 4;
            case -2032180703:
                if (!str.equals(LivePreviewCTASmartDisplayManager.DEFAULT)) {
                    return -1;
                }
                return 0;
            case -1852497085:
                if (!str.equals("SERVER")) {
                    return -1;
                }
                return 2;
            case 1456113029:
                if (!str.equals("IMAGE_UPLOAD")) {
                    return -1;
                }
                return 1;
            default:
                return -1;
        }
    }
}
