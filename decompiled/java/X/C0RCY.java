package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0RCY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RCY {
    public static final /* synthetic */ int LIZJ = 0;
    public final C0RCR LIZ;
    public C691910RCb LIZIZ;

    public C0RCY(C0RCR c0rcr, C0RCR c0rcr2) {
        this.LIZ = c0rcr2;
    }

    public static void LIZ(C0R73 c0r73, String str, AwS625S0100000_11 awS625S0100000_11) {
        awS625S0100000_11.invoke(c0r73, str);
        Iterator it2 = ((ArrayList) c0r73.LJFF).iterator();
        while (it2.hasNext()) {
            LIZ((C0R73) it2.next(), c0r73.LIZ, awS625S0100000_11);
        }
    }
}
