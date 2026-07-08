package X;

import Y.ARunnableS17S0210000_16;
import Y.ARunnableS85S0200000_16;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0bpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988430bpR implements InterfaceC987470bnt {
    public final LinearLayout LL;
    public Aweme LLILLJJLI;
    public AbstractViewOnClickListenerC988440bpS LLILLL;
    public C987450bnr LLILZ;
    public RelativeLayout LLILZIL;

    @Override // X.InterfaceC987470bnt
    public final boolean LIZLLL() {
        return this.LL.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    @Override // X.InterfaceC987470bnt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C988430bpR.LJIIIIZZ():void");
    }

    public C988430bpR(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    @Override // X.InterfaceC987470bnt
    public final void LIZ(C987450bnr c987450bnr) {
        Aweme aweme = c987450bnr.LIZIZ;
        RelativeLayout relativeLayout = null;
        if (aweme == null) {
            aweme = null;
        }
        this.LLILLJJLI = aweme;
        RelativeLayout relativeLayout2 = c987450bnr.LIZLLL;
        if (relativeLayout2 != null) {
            relativeLayout = relativeLayout2;
        }
        this.LLILZIL = relativeLayout;
        this.LLILZ = c987450bnr;
    }

    @Override // X.InterfaceC987470bnt
    public final boolean LIZIZ(C987960bog c987960bog) {
        HashMap map;
        if (this.LLILLL == null) {
            return false;
        }
        Aweme aweme = this.LLILLJJLI;
        RelativeLayout relativeLayout = null;
        if (aweme == null) {
            aweme = null;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            HashMap map2 = new HashMap();
            map2.put("background_type", String.valueOf(awemeRawAd.getNativeCardType()));
            C988530bpb.LIZ.getClass();
            if (map2.size() != 0) {
                map = new HashMap();
                map.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map2));
            } else {
                map = null;
            }
            C1001140c9w c1001140c9w = new C1001140c9w();
            c1001140c9w.LIZ = awemeRawAd;
            c1001140c9w.LJ = map;
            c1001140c9w.LIZJ = false;
            C994130byd.LIZ("background_ad", "othershow", c1001140c9w.LIZ(), awemeRawAd);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("background_ad", "othershow", awemeRawAd);
            c1022820ciuLIZLLL.LIZIZ(String.valueOf(awemeRawAd.getNativeCardType()), "background_type");
            c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
        C786410Ut5.W4(this.LL, 0.0f);
        RelativeLayout relativeLayout2 = this.LLILZIL;
        if (relativeLayout2 == null) {
            relativeLayout2 = null;
        }
        C786410Ut5.Y4(relativeLayout2, 1.0f);
        RelativeLayout relativeLayout3 = this.LLILZIL;
        if (relativeLayout3 != null) {
            relativeLayout = relativeLayout3;
        }
        relativeLayout.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS85S0200000_16(this, c987960bog, 46)).start();
        return true;
    }

    @Override // X.InterfaceC987470bnt
    public final void LJI(boolean z, C987340bng c987340bng) {
        if (this.LLILLL == null) {
            return;
        }
        C786410Ut5.W4(this.LL, 1.0f);
        this.LL.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS17S0210000_16(this, z, c987340bng, 4)).start();
        if (!c987340bng.LIZ()) {
            RelativeLayout relativeLayout = this.LLILZIL;
            RelativeLayout relativeLayout2 = null;
            if (relativeLayout == null) {
                relativeLayout = null;
            }
            C786410Ut5.Y4(relativeLayout, 0.0f);
            RelativeLayout relativeLayout3 = this.LLILZIL;
            if (relativeLayout3 == null) {
                relativeLayout3 = null;
            }
            C786410Ut5.LLIIL(relativeLayout3, 0);
            RelativeLayout relativeLayout4 = this.LLILZIL;
            if (relativeLayout4 != null) {
                relativeLayout2 = relativeLayout4;
            }
            relativeLayout2.animate().alpha(1.0f).setDuration(150L).start();
        }
    }
}
