package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.14Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20283114Yb extends AbstractC20284914Yt implements InterfaceC690000R4s {
    public boolean LLJI;

    @Override // X.AbstractC20284914Yt
    public final void LJIIZILJ() {
        if (this.LLJI) {
            LJIJI(EnumC20283814Yi.CLICK_VIDEO, null, null);
        } else {
            super.LJIIZILJ();
        }
    }

    public final void LJIJJLI() {
        Question question;
        Option[] optionArr;
        int i;
        Option option;
        Question question2;
        Object objLJJIIZ;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        C14XX c14xxLIZJ = c20285414YyLIZ.LIZJ(aweme != null ? aweme.getAid() : null);
        if (c14xxLIZJ == null || (question = this.LLILZLL) == null || (optionArr = question.options) == null || (i = c14xxLIZJ.LIZ) < 0 || i >= optionArr.length || (option = optionArr[i]) == null) {
            return;
        }
        if (!this.LLJI) {
            super.LJIILLIIL(option);
            return;
        }
        Question[] questionArr = option.questions;
        if (questionArr == null || (question2 = (Question) C13LQ.LJJIFFI(questionArr)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (long j = c14xxLIZJ.LIZLLL; j > 0; j >>= 1) {
            if ((j & 1) == 1) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2++;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Option[] optionArr2 = question2.options;
            if (optionArr2 != null && (objLJJIIZ = C13LQ.LJJIIZ(iIntValue, optionArr2)) != null) {
                arrayList2.add(objLJJIIZ);
            }
        }
        EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.SUBMIT;
        LJIJI(enumC20283814Yi, option, arrayList2);
        C692060RCq.LIZIZ(this.LL);
        C20287114Zp c20287114Zp = C20287114Zp.LIZ;
        Aweme aweme2 = this.LL;
        int type = enumC20283814Yi.getType();
        Option[] optionArr3 = (Option[]) arrayList2.toArray(new Option[0]);
        c20287114Zp.getClass();
        C20287114Zp.LIZJ(type, aweme2, optionArr3);
    }

    @Override // X.AbstractC20284914Yt
    @InterfaceC1294060jmO
    public final void LJIILLIIL(Option option) {
        if (this.LLJI) {
            LJIJI(EnumC20283814Yi.SUBMIT, null, null);
        } else {
            super.LJIILLIIL(option);
        }
    }

    public final void LJIJJ(int i) {
        String aid;
        String aid2;
        String aid3;
        String aid4;
        String str;
        String aid5;
        String aid6;
        int i2;
        String aid7;
        String authorUid;
        String requestId;
        String str2;
        Option[] optionArr;
        Option option;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LL;
        String aid8 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C14XX c14xxLIZJ = c20285414YyLIZ.LIZJ(aid);
        if (c14xxLIZJ == null) {
            c14xxLIZJ = new C14XX();
        }
        c14xxLIZJ.LIZ = i;
        C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        } else {
            aid2 = null;
        }
        c20285414YyLIZ2.LJI(aid2, c14xxLIZJ);
        C20285414Yy c20285414YyLIZ3 = C988000bok.LIZ();
        Aweme aweme3 = this.LL;
        if (aweme3 != null) {
            aid3 = aweme3.getAid();
        } else {
            aid3 = null;
        }
        C20283314Yd c20283314YdLIZIZ = c20285414YyLIZ3.LIZIZ(aid3);
        if (c20283314YdLIZIZ == null) {
            c20283314YdLIZIZ = new C20283314Yd();
        }
        if (!c20283314YdLIZIZ.LIZIZ) {
            c20283314YdLIZIZ.LIZIZ = true;
            C20285414Yy c20285414YyLIZ4 = C988000bok.LIZ();
            Aweme aweme4 = this.LL;
            if (aweme4 != null) {
                aid5 = aweme4.getAid();
            } else {
                aid5 = null;
            }
            c20285414YyLIZ4.LJFF(aid5, c20283314YdLIZIZ);
            if (this.LL != null && this.LLILLJJLI != null) {
                C20285414Yy c20285414YyLIZ5 = C988000bok.LIZ();
                Aweme aweme5 = this.LL;
                if (aweme5 != null) {
                    aid6 = aweme5.getAid();
                } else {
                    aid6 = null;
                }
                C14XX c14xxLIZJ2 = c20285414YyLIZ5.LIZJ(aid6);
                int i3 = -1;
                if (c14xxLIZJ2 != null) {
                    i2 = c14xxLIZJ2.LIZ;
                } else {
                    i2 = -1;
                }
                C14ZT c14zt = C14ZT.LIZ;
                Aweme aweme6 = this.LL;
                if (aweme6 != null) {
                    aid7 = aweme6.getAid();
                } else {
                    aid7 = null;
                }
                Aweme aweme7 = this.LL;
                if (aweme7 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme7);
                } else {
                    authorUid = null;
                }
                Aweme aweme8 = this.LL;
                if (aweme8 != null) {
                    requestId = aweme8.getRequestId();
                } else {
                    requestId = null;
                }
                Question question = this.LLILZLL;
                if (question != null && (optionArr = question.options) != null && (option = (Option) C13LQ.LJJIIZ(i2, optionArr)) != null) {
                    i3 = option.id;
                }
                FeedSurvey feedSurvey = this.LLILLJJLI;
                if (feedSurvey != null) {
                    str2 = feedSurvey.id;
                } else {
                    str2 = null;
                }
                C14Z0 c14z0LIZ = C14Z4.LIZ(this.LL);
                Question question2 = this.LLILZLL;
                Integer numValueOf = Integer.valueOf(i3);
                c14zt.getClass();
                C14ZT.LJIIJJI(aweme6, str2, aid7, authorUid, numValueOf, c14z0LIZ, requestId, question2);
            }
        }
        C20285414Yy c20285414YyLIZ6 = C988000bok.LIZ();
        Aweme aweme9 = this.LL;
        if (aweme9 != null) {
            aid4 = aweme9.getAid();
        } else {
            aid4 = null;
        }
        c20285414YyLIZ6.LJII(aid4, new C14Z2(this.LLILZ, true));
        C20285414Yy c20285414YyLIZ7 = C988000bok.LIZ();
        Aweme aweme10 = this.LL;
        if (aweme10 != null) {
            aid8 = aweme10.getAid();
        }
        if (c20285414YyLIZ7.LIZLLL(C14Z5.BACKGROUND.getType(), aid8) && !C20552315bV.LIZIZ) {
            Aweme aweme11 = this.LL;
            C14ZW.LIZ.getClass();
            FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme11);
            if (feedSurveyLJ == null || (str = feedSurveyLJ.surveyKey) == null) {
                str = "-3";
            }
            C20552315bV.LIZLLL(aweme11, str);
            C20552315bV.LIZIZ = true;
        }
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
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
        if (!c20285414YyLIZ.LIZLLL(this.LLILZ, aid)) {
            return;
        }
        if (this.LLJI) {
            if (!z) {
                C20285414Yy c20285414YyLIZ2 = C988000bok.LIZ();
                Aweme aweme3 = this.LL;
                if (aweme3 != null) {
                    aid2 = aweme3.getAid();
                } else {
                    aid2 = null;
                }
                if (c20285414YyLIZ2.LIZLLL(this.LLILZ, aid2)) {
                    LJIJI(EnumC20283814Yi.BACKGROUND, null, null);
                    return;
                }
                return;
            }
            return;
        }
        super.LJ(aweme, z);
    }

    @Override // X.AbstractC20284914Yt, X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        String aid;
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (!c20285414YyLIZ.LIZLLL(this.LLILZ, aid)) {
            return;
        }
        if (this.LLJI) {
            LJIJI(EnumC20283814Yi.SWIPE, null, null);
        } else {
            super.LJIIJJI(enumC20283814Yi, aweme, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105 A[PHI: r9
      0x0105: PHI (r9v4 boolean) = (r9v1 boolean), (r9v0 boolean), (r9v0 boolean) binds: [B:86:0x0103, B:138:0x01cf, B:136:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.EnumC20283814Yi r29, com.ss.android.ugc.aweme.feed.model.survey.Option r30, java.util.List<com.ss.android.ugc.aweme.feed.model.survey.Option> r31) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20283114Yb.LJIJI(X.14Yi, com.ss.android.ugc.aweme.feed.model.survey.Option, java.util.List):void");
    }
}
