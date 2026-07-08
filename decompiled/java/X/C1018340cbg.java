package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018340cbg {
    public final AwemeRawAd LIZ;
    public final String LIZIZ;
    public final AnoleLogInfo LIZJ;
    public final String LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 20));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 21));

    public final C1018400cbm LIZ() {
        return (C1018400cbm) this.LJFF.getValue();
    }

    public final boolean LIZIZ() {
        return Intrinsics.LJFF(EnumC1008920cMU.SEARCH_EASTER_EGG.getType(), this.LIZIZ);
    }

    public final void LIZJ(Aweme aweme) {
        String authorUid;
        if (LIZIZ()) {
            C1018400cbm c1018400cbmLIZ = LIZ();
            c1018400cbmLIZ.logAd(c1018400cbmLIZ.LJ, new AwS595S0100000_16(c1018400cbmLIZ, 55));
            return;
        }
        C1018380cbk c1018380cbk = (C1018380cbk) this.LJ.getValue();
        String str = this.LIZLLL;
        c1018380cbk.getClass();
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            c1018380cbk.logAd(c1018380cbk.LIZJ, AFwS252S0000000_16.get$arr$(20));
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String aid = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(1, "nova_like_effect_type");
        C20684815ws.LJIILLIIL("nova_like_effect_view", c2344009Gk.LIZ);
    }

    public C1018340cbg(AwemeRawAd awemeRawAd, String str, AnoleLogInfo anoleLogInfo, String str2) {
        this.LIZ = awemeRawAd;
        this.LIZIZ = str;
        this.LIZJ = anoleLogInfo;
        this.LIZLLL = str2;
    }
}
