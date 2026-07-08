package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0UdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776550UdB {
    public static final C776550UdB LIZJ = new C776550UdB(0, "");
    public static final C776550UdB LIZLLL = new C776550UdB(LSPassThroughRecordSizeConfig.DEFAULT, "Can not start speed test, the quality center should init first!");
    public static final C776550UdB LJ = new C776550UdB(1002, "Can not start auto speed test because the manual test is running, wait until the manual test finished!");
    public static final C776550UdB LJFF = new C776550UdB(1003, "Can not start manual speed test because the auto test is running, wait until the auto test finished!");
    public static final C776550UdB LJI = new C776550UdB(1004, "The speed test already started, wait the finish callback!");
    public static final C776550UdB LJII = new C776550UdB(1005, "The auto speed test is not running, no need to stop it!");
    public static final C776550UdB LJIIIIZZ = new C776550UdB(1006, "The manual speed test is not running, no need to stop it!");
    public static final C776550UdB LJIIIZ = new C776550UdB(2001, "Network error!");
    public static final C776550UdB LJIIJ = new C776550UdB(2002, "server error!");
    public static final C776550UdB LJIIJJI = new C776550UdB(2003, "parse response error!");
    public static final C776550UdB LJIIL = new C776550UdB(2004, "start failed, permission error!");
    public static final C776550UdB LJIILIIL = new C776550UdB(3001, "probe result error from pusher code=:");
    public static final C776550UdB LJIILJJIL = new C776550UdB(3002, "probe result error!");
    public static final C776550UdB LJIILL = new C776550UdB(4001, "stop speed detection because reaching speed test delay time!");
    public final int LIZ;
    public final String LIZIZ;

    public C776550UdB(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
