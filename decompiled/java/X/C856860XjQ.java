package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0XjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856860XjQ {
    public final C19EG LIZ;
    public final C0ZI0 LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public String LJFF;
    public boolean LJI;
    public int LJII = -1;
    public C855530XhH LJIIIIZZ = new C855530XhH();

    public static boolean LIZJ() {
        return C0CHQ.LIZ().getPublishService().LJJJJZ().LIZJ();
    }

    public final void LIZ(List<? extends AVChallenge> list) {
        String strValueOf;
        int totalHashtagCount;
        if (C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null)) != null && (strValueOf = String.valueOf(C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null)))) != null) {
            ArrayList<String> arrayListLIZLLL = C856940XjY.LIZLLL(strValueOf);
            int length = strValueOf.length();
            if (!C086I.LIZIZ(list)) {
                if (LIZJ()) {
                    totalHashtagCount = this.LIZIZ.getTotalHashtagCount();
                } else {
                    totalHashtagCount = 0;
                }
                for (AVChallenge aVChallenge : list) {
                    if (aVChallenge != null) {
                        if (arrayListLIZLLL.contains("#" + aVChallenge.getChallengeName())) {
                            ((HashSet) this.LIZIZ.LLJLILLLLZIIL).add("#" + aVChallenge.challengeName);
                        } else if (!LIZJ() || totalHashtagCount < C0CHQ.LIZ().getPublishService().LJJJJZ().LIZ()) {
                            ((HashSet) this.LIZIZ.LLJLILLLLZIIL).add("#" + aVChallenge.challengeName);
                            C857030Xjh c857030XjhLIZ = C856940XjY.LIZ(length, aVChallenge.getChallengeName());
                            arrayListLIZLLL.add("#" + aVChallenge.getChallengeName());
                            if (c857030XjhLIZ.LIZIZ <= this.LJIIIIZZ.LIZIZ() + C855380Xh2.LIZ) {
                                C0ZI0 c0zi0 = this.LIZIZ;
                                c0zi0.LLLLIILLL = false;
                                Editable editableP = C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null));
                                if (editableP != null) {
                                    editableP.insert(c857030XjhLIZ.LIZ, c857030XjhLIZ.LIZJ);
                                }
                                length = c857030XjhLIZ.LIZIZ;
                                totalHashtagCount++;
                            }
                            this.LIZIZ.LJJJI(true);
                        }
                    }
                }
            }
        }
    }

    public final void LIZIZ(List<String> list) {
        int totalHashtagCount;
        if (C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null)) != null && !C086I.LIZIZ(list)) {
            if (LIZJ()) {
                totalHashtagCount = this.LIZIZ.getTotalHashtagCount();
            } else {
                totalHashtagCount = 0;
            }
            for (String str : list) {
                if (str != null) {
                    String strValueOf = String.valueOf(C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null)));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(str);
                    sbLIZ.append(' ');
                    if (!a0.LJJIIZI(strValueOf, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        String strValueOf2 = String.valueOf(C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null)));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('#');
                        sbLIZ2.append(str);
                        sbLIZ2.append(this.LIZ.getString(2131848665));
                        if (!a0.LJJIIZI(strValueOf2, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                            if (!LIZJ() || totalHashtagCount < C0CHQ.LIZ().getPublishService().LJJJJZ().LIZ()) {
                                Set<String> set = this.LIZIZ.LLJLILLLLZIIL;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append('#');
                                sbLIZ3.append(str);
                                ((HashSet) set).add(C2188811AlT.LIZIZ(sbLIZ3));
                                C857030Xjh c857030XjhLIZIZ = C856940XjY.LIZIZ(String.valueOf(C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null))), str);
                                if (c857030XjhLIZIZ.LIZIZ <= this.LJIIIIZZ.LIZIZ() + C855380Xh2.LIZ) {
                                    C0ZI0 c0zi0 = this.LIZIZ;
                                    c0zi0.LLLLIILLL = false;
                                    Editable editableP = C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null));
                                    if (editableP != null) {
                                        editableP.insert(c857030XjhLIZIZ.LIZ, c857030XjhLIZIZ.LIZJ);
                                    }
                                    totalHashtagCount++;
                                }
                                this.LIZIZ.LJJJI(true);
                            }
                        }
                    }
                }
                Set<String> set2 = this.LIZIZ.LLJLILLLLZIIL;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append('#');
                sbLIZ4.append(str);
                ((HashSet) set2).add(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }

    public C856860XjQ(C19EG c19eg, C0ZI0 c0zi0, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = c19eg;
        this.LIZIZ = c0zi0;
        this.LIZJ = videoPublishEditModel;
        c0zi0.setVideoPublishEditModel(videoPublishEditModel);
        c0zi0.setEnterFrom("edit_post_page");
        C855380Xh2.LIZ = 0;
    }
}
