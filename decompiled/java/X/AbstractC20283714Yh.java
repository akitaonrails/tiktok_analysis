package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;

/* JADX INFO: renamed from: X.14Yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20283714Yh implements InterfaceC690000R4s {
    public Aweme LL;
    public FeedSurvey LLILLJJLI;
    public C14Z0 LLILLL = C14Z0.FEED_TYPE;
    public int LLILZ = C14Z5.BACKGROUND.getType();
    public Question LLILZIL;
    public Integer LLILZLL;

    @Override // X.InterfaceC690000R4s
    public final void LJIILIIL() {
        String str;
        Option[] optionArr;
        Option option;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ.LIZIZ(aweme != null ? aweme.getAid() : null);
        if (c20283314YdLIZIZ == null) {
            c20283314YdLIZIZ = new C20283314Yd();
        }
        if (!c20283314YdLIZIZ.LIZIZ) {
            c20283314YdLIZIZ.LIZIZ = true;
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            c20285414YyLIZ2.LJFF(aweme2 != null ? aweme2.getAid() : null, c20283314YdLIZIZ);
            Aweme aweme3 = this.LL;
            if (aweme3 != null && this.LLILLJJLI != null) {
                C14ZT c14zt = C14ZT.LIZ;
                String aid = aweme3.getAid();
                Aweme aweme4 = this.LL;
                String authorUid = aweme4 != null ? AwemeExtKt.getAuthorUid(aweme4) : null;
                Aweme aweme5 = this.LL;
                String requestId = aweme5 != null ? aweme5.getRequestId() : null;
                Question question = this.LLILZIL;
                int i = ((question == null || (optionArr = question.options) == null || (option = (Option) C13LQ.LJIL(optionArr)) == null) ? 0 : option.id) - 1;
                FeedSurvey feedSurvey = this.LLILLJJLI;
                String str2 = feedSurvey != null ? feedSurvey.id : null;
                C14Z0 c14z0LIZ = C14Z4.LIZ(this.LL);
                Question question2 = this.LLILZIL;
                Integer numValueOf = Integer.valueOf(i);
                c14zt.getClass();
                C14ZT.LJIIJJI(aweme3, str2, aid, authorUid, numValueOf, c14z0LIZ, requestId, question2);
            }
        }
        C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
        Aweme aweme6 = this.LL;
        c20285414YyLIZ3.LJII(aweme6 != null ? aweme6.getAid() : null, new C14Z2(this.LLILZ, true));
        C20285414Yy c20285414YyLIZ4 = C988000bok.LIZ();
        Aweme aweme7 = this.LL;
        if (!c20285414YyLIZ4.LIZLLL(C14Z5.BACKGROUND.getType(), aweme7 != null ? aweme7.getAid() : null) || C20552315bV.LIZIZ) {
            return;
        }
        Aweme aweme8 = this.LL;
        FeedSurvey feedSurvey2 = this.LLILLJJLI;
        if (feedSurvey2 == null || (str = feedSurvey2.surveyKey) == null) {
            str = "-1";
        }
        C20552315bV.LIZLLL(aweme8, str);
        C20552315bV.LIZIZ = true;
    }

    public AbstractC20283714Yh() {
        new C20293414aq(getClass().getSimpleName());
    }

    public final void LJII(EnumC20283814Yi enumC20283814Yi) {
        String aid;
        String aid2;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZLLL(this.LLILZ, aid)) {
            C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ2.LIZIZ(aid2);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            LJFF(c20283314YdLIZIZ, enumC20283814Yi, null);
        }
    }

    @Override // X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
        String aid;
        String aid2;
        String aid3 = null;
        if (z) {
            C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
            C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                aid3 = aweme2.getAid();
            }
            if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid3) && !C20552315bV.LIZIZ) {
                C20552315bV.LIZ = System.currentTimeMillis();
                C20552315bV.LIZIZ = true;
                return;
            }
            return;
        }
        C01GW<C20285414Yy> c01gw2 = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
        Aweme aweme3 = this.LL;
        if (aweme3 != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ2.LIZLLL(this.LLILZ, aid)) {
            C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
            Aweme aweme4 = this.LL;
            if (aweme4 != null) {
                aid2 = aweme4.getAid();
            } else {
                aid2 = null;
            }
            C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ3.LIZIZ(aid2);
            if (c20283314YdLIZIZ == null) {
                c20283314YdLIZIZ = new C20283314Yd();
            }
            LJFF(c20283314YdLIZIZ, EnumC20283814Yi.BACKGROUND, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0072 A[PHI: r7
      0x0072: PHI (r7v11 boolean) = (r7v6 boolean), (r7v7 boolean), (r7v8 boolean), (r7v12 boolean) binds: [B:97:0x0121, B:87:0x0108, B:73:0x00dd, B:37:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.EnumC20283814Yi r30, com.ss.android.ugc.aweme.feed.model.survey.Option r31) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20283714Yh.LJIIIZ(X.14Yi, com.ss.android.ugc.aweme.feed.model.survey.Option):void");
    }

    public final void LJFF(C20283314Yd c20283314Yd, EnumC20283814Yi enumC20283814Yi, Option option) {
        String aid;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid) && C20552315bV.LIZIZ && (EnumC20283814Yi.SECONDARY_SUBMIT == enumC20283814Yi || EnumC20283814Yi.SWIPE == enumC20283814Yi || EnumC20283814Yi.BACKGROUND == enumC20283814Yi || EnumC20283814Yi.CLICK_VIDEO == enumC20283814Yi || EnumC20283814Yi.CANCEL == enumC20283814Yi)) {
            C20552315bV.LJ(System.currentTimeMillis() - C20552315bV.LIZ, this.LL);
        }
        switch (C20283614Yg.LIZ[enumC20283814Yi.ordinal()]) {
            case 1:
                if (c20283314Yd.LJII) {
                    return;
                }
                c20283314Yd.LJII = true;
                c20283314Yd.LJFF = true;
                c20283314Yd.LJIIIZ = true;
                c20283314Yd.LJIIJJI = true;
                LJIIIZ(enumC20283814Yi, option);
                break;
                break;
            case 2:
                if (c20283314Yd.LJFF) {
                    return;
                }
                c20283314Yd.LJFF = true;
                LJIIIZ(enumC20283814Yi, null);
                break;
                break;
            case 3:
                if (c20283314Yd.LJIIIZ) {
                    return;
                }
                c20283314Yd.LJIIIZ = true;
                LJIIIZ(enumC20283814Yi, null);
                break;
                break;
            case 4:
                if (c20283314Yd.LJIIJJI) {
                    return;
                }
                c20283314Yd.LJIIJJI = true;
                LJIIIZ(enumC20283814Yi, null);
                break;
                break;
            case 5:
                if (c20283314Yd.LJI) {
                    return;
                }
                c20283314Yd.LJI = true;
                LJIIIZ(enumC20283814Yi, null);
                break;
                break;
            case 6:
                if (c20283314Yd.LIZJ) {
                    return;
                }
                c20283314Yd.LIZJ = true;
                c20283314Yd.LJFF = true;
                c20283314Yd.LJ = true;
                LJIIIZ(enumC20283814Yi, null);
                break;
                break;
            case 7:
                if (c20283314Yd.LIZLLL) {
                    return;
                }
                c20283314Yd.LIZLLL = true;
                c20283314Yd.LJFF = true;
                c20283314Yd.LJ = true;
                LJIIIZ(enumC20283814Yi, null);
                break;
                break;
            default:
                return;
        }
        C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        c20285414YyLIZ2.LJFF(aid2, c20283314Yd);
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
        if (c20285414YyLIZ.LIZLLL(this.LLILZ, aid)) {
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
            LJFF(c20283314YdLIZIZ, EnumC20283814Yi.SWIPE, null);
        }
    }
}
