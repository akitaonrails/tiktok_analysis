package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS31S0000100_16;

/* JADX INFO: renamed from: X.0cbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018380cbk extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;
    public final C1023960ckk LIZIZ;
    public final C1023960ckk LIZJ;
    public final C1023960ckk LIZLLL;
    public final C1023960ckk LJ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1018380cbk(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        C1018390cbl.LIZ.getClass();
        C1002190cBd c1002190cBd = C1018390cbl.LIZLLL;
        C1002190cBd c1002190cBd2 = C1018390cbl.LJ;
        C1002190cBd c1002190cBd3 = C1018390cbl.LJFF;
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(c1002190cBd, AFwS252S0000000_16.get$arr$(16)), new C1023630ckD<>(c1002190cBd2, AFwS252S0000000_16.get$arr$(17)), new C1023630ckD<>(c1002190cBd3, AFwS252S0000000_16.get$arr$(18))};
        C1009980cOC c1009980cOC = C1009980cOC.LIZ;
        C1023500ck0.LIZJ("draw_ad", "realtime_click", "nova_like_premium_fullscreen", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LIZIZ = C1023500ck0.LIZJ("draw_ad", "close", "nova_like_premium_fullscreen", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LIZJ = C1023500ck0.LIZJ("draw_ad", "othershow", "nova_like_premium_fullscreen", new InterfaceC1023650ckF[]{c1009980cOC.LJI(c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LIZLLL = C1023500ck0.LIZJ("draw_ad", "othershow_fail", "nova_like_premium_fullscreen", new InterfaceC1023650ckF[]{c1009980cOC.LJI(C1018390cbl.LIZIZ, c1002190cBd, c1002190cBd2, c1002190cBd3)});
        this.LJ = C1023500ck0.LIZJ("draw_ad", "othershow_end", "nova_like_premium_fullscreen", new InterfaceC1023650ckF[]{c1009980cOC.LJI(C1018390cbl.LIZJ, c1002190cBd, c1002190cBd2, c1002190cBd3)});
    }

    public final void LJJIIZ(long j, String str, Aweme aweme) {
        String authorUid;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            logAd(this.LJ, new AwS31S0000100_16(j, 10));
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
        c2344009Gk.LIZLLL(j, "duration");
        C20684815ws.LJIILLIIL("nova_like_effect_view_end", c2344009Gk.LIZ);
    }
}
