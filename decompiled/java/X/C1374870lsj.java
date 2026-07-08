package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374870lsj {
    public static final C1374870lsj LIZ = new C1374870lsj();
    public static boolean LIZIZ;
    public static final User LIZJ;
    public static final C01GW LIZLLL;
    public static final C1391870mK9<String> LJ;
    public static final C1391870mK9<String> LJFF;

    static {
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJJIIJZLJL();
        LIZJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        LIZLLL = C452501pT.LIZIZ(new C1375140ltA());
        LJ = new C1391870mK9<>(10);
        LJFF = new C1391870mK9<>(3);
    }

    public static Keva LIZIZ() {
        return (Keva) LIZLLL.getValue();
    }

    public static boolean LIZJ(Aweme aweme) {
        String authorUid;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        return Intrinsics.LJFF(authorUid, LIZJ.getUid());
    }

    public static boolean LIZLLL(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return Intrinsics.LJFF(simpleDateFormat.format(new Date(j)), simpleDateFormat.format(new Date(System.currentTimeMillis())));
    }

    public static boolean LIZ(Aweme aweme, String str) {
        long createTime;
        String aid;
        if (!Intrinsics.LJFF(str, "homepage_friends") || !LIZJ(aweme)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (aweme != null) {
            createTime = aweme.getCreateTime();
        } else {
            createTime = 0;
        }
        if ((jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - createTime > 86400) {
            return false;
        }
        C1391870mK9<String> c1391870mK9 = LJFF;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        return c1391870mK9.LIZIZ.contains(aid);
    }

    public static void LJ(String str, String str2, String str3, Aweme aweme) {
        String str4;
        if (Intrinsics.LJFF(str, "publish_then_share")) {
            str4 = "after_post";
        } else {
            str4 = "share_head_panel";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("show_reason", str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("panel_source_v2", str4);
        C1357660lQy.LJI(c2344009Gk, aweme);
        C1357660lQy.LJIIIIZZ(c2344009Gk, aweme);
        C1357660lQy.LIZLLL(c2344009Gk, aweme);
        C20684815ws.LJIILLIIL("share_head_panel_show", c2344009Gk.LIZ);
    }
}
