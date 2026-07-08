package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.Locale;

/* JADX INFO: renamed from: X.14Yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20285214Yw implements InterfaceC690000R4s {
    public Aweme LL;
    public FeedSurvey LLILLJJLI;
    public C14Z0 LLILLL = C14Z0.FEED_TYPE;

    @Override // X.InterfaceC690000R4s
    public final void LJIILIIL() {
        FeedSurvey feedSurvey;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ.LIZIZ(aweme != null ? aweme.getAid() : null);
        if (c20283314YdLIZIZ == null) {
            c20283314YdLIZIZ = new C20283314Yd();
        }
        if (!c20283314YdLIZIZ.LIZ) {
            c20283314YdLIZIZ.LIZ = true;
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            c20285414YyLIZ2.LJFF(aweme2 != null ? aweme2.getAid() : null, c20283314YdLIZIZ);
            Aweme aweme3 = this.LL;
            if (aweme3 != null && (feedSurvey = this.LLILLJJLI) != null) {
                C14ZT c14zt = C14ZT.LIZ;
                String str = feedSurvey.id;
                c14zt.getClass();
                C14ZT.LJIIL(aweme3, str, "SINGLE_CHOICE".toLowerCase(Locale.ENGLISH));
            }
        }
        C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
        Aweme aweme4 = this.LL;
        c20285414YyLIZ3.LJII(aweme4 != null ? aweme4.getAid() : null, new C14Z2(C14Z5.BOTTOM.getType(), true));
    }

    @Override // X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
        String aid;
        String aid2;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZLLL(C14Z5.BOTTOM.getType(), aid)) {
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme3 = this.LL;
            if (aweme3 != null) {
                aid2 = aweme3.getAid();
            } else {
                aid2 = null;
            }
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ2.LIZIZ(aid2);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            LIZIZ(c20283314YdLIZIZ, EnumC20283814Yi.BACKGROUND, null);
        }
    }

    public final void LIZIZ(C20283314Yd c20283314Yd, EnumC20283814Yi enumC20283814Yi, Option option) {
        String aid;
        String str;
        int i = C20283914Yj.LIZ[enumC20283814Yi.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || c20283314Yd.LJIIIIZZ) {
                    return;
                } else {
                    c20283314Yd.LJIIIIZZ = true;
                }
            } else if (c20283314Yd.LJ) {
                return;
            } else {
                c20283314Yd.LJ = true;
            }
        } else {
            if (c20283314Yd.LJII) {
                return;
            }
            c20283314Yd.LJII = true;
            c20283314Yd.LJ = true;
            c20283314Yd.LJIIIIZZ = true;
        }
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        Integer numValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c20285414YyLIZ.LJFF(aid, c20283314Yd);
        Aweme aweme2 = this.LL;
        if (aweme2 != null && this.LLILLJJLI != null) {
            C14ZT c14zt = C14ZT.LIZ;
            C14Z0 c14z0 = this.LLILLL;
            String lowerCase = enumC20283814Yi.name().toLowerCase(Locale.ENGLISH);
            FeedSurvey feedSurvey = this.LLILLJJLI;
            if (feedSurvey != null) {
                str = feedSurvey.id;
            } else {
                str = null;
            }
            if (option != null) {
                numValueOf = Integer.valueOf(option.id);
            }
            C14ZT.LJIIIIZZ(c14zt, aweme2, c14z0, lowerCase, str, String.valueOf(numValueOf), null, null, 224);
        }
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        String aid;
        String aid2;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZLLL(C14Z5.BOTTOM.getType(), aid)) {
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme3 = this.LL;
            if (aweme3 != null) {
                aid2 = aweme3.getAid();
            } else {
                aid2 = null;
            }
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ2.LIZIZ(aid2);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            LIZIZ(c20283314YdLIZIZ, EnumC20283814Yi.SWIPE, null);
        }
    }
}
