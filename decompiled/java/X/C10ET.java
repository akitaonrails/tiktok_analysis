package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.10ET, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ET {
    public final User LIZ;
    public final Activity LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final InterfaceC19225710Jj LJFF;
    public final String LJI;
    public final AwemeRawAd LJII;
    public final boolean LJIIIIZZ;
    public final C10EW LJIIIZ;
    public final Integer LJIIJ;

    public C10ET(User user, Activity activity, String str, String str2, String str3, InterfaceC19225710Jj interfaceC19225710Jj, String str4, AwemeRawAd awemeRawAd, boolean z, C10EW c10ew, Integer num) {
        this.LIZ = user;
        this.LIZIZ = activity;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = interfaceC19225710Jj;
        this.LJI = str4;
        this.LJII = awemeRawAd;
        this.LJIIIIZZ = z;
        this.LJIIIZ = c10ew;
        this.LJIIJ = num;
    }

    public /* synthetic */ C10ET(User user, Activity activity, String str, String str2, String str3, InterfaceC19225710Jj interfaceC19225710Jj, String str4, AwemeRawAd awemeRawAd, boolean z, C10EW c10ew, Integer num, int i) {
        this(user, activity, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : interfaceC19225710Jj, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? null : awemeRawAd, (i & 256) != 0 ? true : z, (i & 512) != 0 ? null : c10ew, (i & 1024) == 0 ? num : null);
    }
}
