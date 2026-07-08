package X;

import android.net.Uri;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20110413mQ {
    public static final /* synthetic */ InterfaceC2217461Bqa[] LJFF;
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 399));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 397));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 398));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 396));
    public final String LJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(C20110413mQ.class), "uri", "getUri()Landroid/net/Uri;");
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C13LE.LIZ(C20110413mQ.class), "host", "getHost()Ljava/lang/String;"), new C2217381BqS(C13LE.LIZ(C20110413mQ.class), "queryMap", "getQueryMap()Ljava/util/SortedMap;"), new C2217381BqS(C13LE.LIZ(C20110413mQ.class), "hash", "getHash()Ljava/lang/String;")};
    }

    public final Uri LIZ() {
        C01GW c01gw = this.LIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = LJFF;
        return (Uri) c01gw.getValue();
    }

    public C20110413mQ(String str) {
        this.LJ = str;
    }
}
