package Y;

import X.C1612650s4F;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS0S3221101_9 implements Callable {
    public final int $t;
    public float f9;
    public int i7;
    public long j8;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public boolean z5;
    public boolean z6;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS0S3221101_9 aCallableS0S3221101_9) {
        String groupId;
        String str;
        String str2;
        String str3;
        String authorUid;
        C1C7U.LIZ("ClearModeMobHelper@d9bb.mobEnterEvent$1");
        Aweme aweme = (Aweme) aCallableS0S3221101_9.l3;
        String str4 = "";
        if (aweme == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        Aweme aweme2 = (Aweme) aCallableS0S3221101_9.l3;
        if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
            str4 = authorUid;
        }
        String str5 = aCallableS0S3221101_9.s0;
        if (str5 != null && str5.length() != 0) {
            str = aCallableS0S3221101_9.s0;
        } else {
            str = "long_press";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aCallableS0S3221101_9.z5) {
            str2 = str;
        } else {
            str2 = "slide";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("panel_source", str);
        if (aCallableS0S3221101_9.z5) {
            str3 = "stable";
        } else {
            str3 = "unstable";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS0S3221101_9.s1);
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        c2344009Gk.LIZIZ(aCallableS0S3221101_9.f9, "vPct");
        c2344009Gk.LIZLLL(aCallableS0S3221101_9.j8, "vDuration");
        c2344009Gk.LIZJ(aCallableS0S3221101_9.i7, "vLoops");
        c2344009Gk.LIZJ(aCallableS0S3221101_9.z6 ? 1 : 0, "is_clear_mode");
        c2344009Gk.LJIIIIZZ("from_page", aCallableS0S3221101_9.s2);
        c2344009Gk.LJII((Map) aCallableS0S3221101_9.l4);
        C20684815ws.LJIILLIIL("enter_clear_screen", ((C2344009Gk) C1612650s4F.LIZIZ(c2344009Gk, (Aweme) aCallableS0S3221101_9.l3)).LIZ);
        C1C7U.LIZIZ("ClearModeMobHelper@d9bb.mobEnterEvent$1");
        return null;
    }

    public static final Object call$1(ACallableS0S3221101_9 aCallableS0S3221101_9) {
        String groupId;
        String str;
        String authorUid;
        C1C7U.LIZ("ClearModeMobHelper@d9bb.mobExitEvent$1");
        Aweme aweme = (Aweme) aCallableS0S3221101_9.l3;
        String str2 = "";
        if (aweme == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        Aweme aweme2 = (Aweme) aCallableS0S3221101_9.l3;
        if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
            str2 = authorUid;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", aCallableS0S3221101_9.s0);
        if (aCallableS0S3221101_9.z5) {
            str = "stable";
        } else {
            str = "unstable";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS0S3221101_9.s1);
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        c2344009Gk.LJIIIIZZ("author_id", str2);
        c2344009Gk.LIZIZ(aCallableS0S3221101_9.f9, "vPct");
        c2344009Gk.LIZLLL(aCallableS0S3221101_9.j8, "vDuration");
        c2344009Gk.LIZJ(aCallableS0S3221101_9.i7, "vLoops");
        c2344009Gk.LIZJ(aCallableS0S3221101_9.z6 ? 1 : 0, "is_clear_mode");
        c2344009Gk.LJIIIIZZ("from_page", aCallableS0S3221101_9.s2);
        c2344009Gk.LJII((Map) aCallableS0S3221101_9.l4);
        C20684815ws.LJIILLIIL("exit_clear_screen", c2344009Gk.LIZ);
        C1C7U.LIZIZ("ClearModeMobHelper@d9bb.mobExitEvent$1");
        return null;
    }

    public ACallableS0S3221101_9(float f, int i, long j, Aweme aweme, String str, String str2, String str3, Map map, boolean z, boolean z2, int i2) {
        this.$t = i2;
        this.l3 = aweme;
        this.s0 = str;
        this.z5 = z;
        this.s1 = str2;
        this.f9 = f;
        this.j8 = j;
        this.i7 = i;
        this.z6 = z2;
        this.s2 = str3;
        this.l4 = map;
    }
}
