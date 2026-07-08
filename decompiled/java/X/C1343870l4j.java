package X;

import Y.ACListenerS155S0100000_21;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0l4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343870l4j {
    public static final List<EnumC1343880l4k> LJIIJJI = C1697810uHb.LJIIJJI(EnumC1343880l4k.FOLLOW, EnumC1343880l4k.MUTUAL_FOLLOW, EnumC1343880l4k.MATCHED_FRIEND);
    public static final List<String> LJIIL = C1697810uHb.LJIIJJI("homepage_hot", "homepage_follow", "homepage_friends", "others_homepage");
    public final View LIZ;
    public Aweme LIZIZ;
    public String LIZJ;
    public final boolean LIZLLL;
    public CommentContextSource LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1226));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1227));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1224));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1225));
    public C1908730zln LJIIIZ;
    public RelationLabelTextView LJIIJ;

    public final RelationLabelTextView LIZIZ() {
        if (this.LJIIJ == null) {
            this.LJIIJ = (RelationLabelTextView) C1090570eUB.LIZ(R.id.mi0, R.id.t4q, this.LIZ);
        }
        return this.LJIIJ;
    }

    public final TuxTextView LIZJ() {
        return (TuxTextView) this.LJII.getValue();
    }

    public final TuxTextView LIZLLL() {
        return (TuxTextView) this.LJIIIIZZ.getValue();
    }

    public final TuxIconView LJ() {
        return (TuxIconView) this.LJFF.getValue();
    }

    public final TuxTextView LJFF() {
        return (TuxTextView) this.LJI.getValue();
    }

    public final void LJI() {
        View viewFindViewById = this.LIZ.findViewById(R.id.e_9);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = this.LIZ.findViewById(R.id.t4q);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
    }

    public final void LIZ(Comment comment) {
        MatchedFriendStruct matchedFriendStruct;
        RelationLabelTextView relationLabelTextViewLIZIZ;
        Fragment fragmentLIZ;
        int i;
        String strLIZJ;
        if (C1341070l0D.LIZLLL(comment) && this.LIZLLL) {
            TuxIconView tuxIconViewLJ = LJ();
            if (tuxIconViewLJ != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewLJ, 0);
            }
            TuxTextView tuxTextViewLJFF = LJFF();
            if (tuxTextViewLJFF != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJFF, 0);
            }
            C786410Ut5.LLLLZLL(LIZJ(), 8);
            C786410Ut5.LLLLZLL(LIZLLL(), 8);
            LJI();
            String strLJIIJ = C1349280lDS.LJIIJ(comment.getReplyToNickName(), comment.getReplyToUserName(), this.LIZJ);
            String replyToUserId = comment.getReplyToUserId();
            if (replyToUserId != null) {
                C1243240iSQ.LIZ.getClass();
                if (C343230Dcv.LIZ() && (strLIZJ = C1247000iYU.LIZJ(replyToUserId)) != null) {
                    strLJIIJ = strLIZJ;
                }
            }
            TuxTextView tuxTextViewLJFF2 = LJFF();
            if (tuxTextViewLJFF2 != null) {
                tuxTextViewLJFF2.setText(strLJIIJ);
                return;
            }
            return;
        }
        if (comment.getIsTakoGenerated()) {
            TuxIconView tuxIconViewLJ2 = LJ();
            if (tuxIconViewLJ2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewLJ2, 8);
            }
            TuxTextView tuxTextViewLJFF3 = LJFF();
            if (tuxTextViewLJFF3 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJFF3, 8);
            }
            C1908730zln c1908730zln = this.LJIIIZ;
            if (c1908730zln != null) {
                C786410Ut5.u0(c1908730zln, 8);
            }
            RelationLabelTextView relationLabelTextView = this.LJIIJ;
            if (relationLabelTextView != null) {
                C786410Ut5.v0(relationLabelTextView, 8);
            }
            C1341060l0C.LIZIZ(comment, LIZJ());
            C1341060l0C.LIZ(comment, LIZLLL());
            return;
        }
        if (C1341070l0D.LJ(comment)) {
            TuxIconView tuxIconViewLJ3 = LJ();
            if (tuxIconViewLJ3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewLJ3, 8);
            }
            TuxTextView tuxTextViewLJFF4 = LJFF();
            if (tuxTextViewLJFF4 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJFF4, 8);
            }
            LJI();
            C1341060l0C.LIZIZ(comment, LIZJ());
            C1341060l0C.LIZ(comment, LIZLLL());
            return;
        }
        if (C1341070l0D.LIZIZ(comment)) {
            TuxIconView tuxIconViewLJ4 = LJ();
            if (tuxIconViewLJ4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewLJ4, 8);
            }
            TuxTextView tuxTextViewLJFF5 = LJFF();
            if (tuxTextViewLJFF5 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJFF5, 8);
            }
            LJI();
            C1341060l0C.LIZIZ(comment, LIZJ());
            C1341060l0C.LIZ(comment, LIZLLL());
            return;
        }
        if (C1341070l0D.LIZJ(comment, this.LIZIZ, this.LIZJ)) {
            if (this.LJIIIZ == null) {
                this.LJIIIZ = (C1908730zln) C1090570eUB.LIZ(R.id.mhq, R.id.e_9, this.LIZ);
            }
            C1908730zln c1908730zln2 = this.LJIIIZ;
            if (c1908730zln2 != null) {
                C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
                CommentContextSource commentContextSource = this.LJ;
                c1340510kzJ.getClass();
                if (C1340510kzJ.LIZIZ(commentContextSource)) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.u0(c1908730zln2, i);
            }
            RelationLabelTextView relationLabelTextViewLIZIZ2 = LIZIZ();
            if (relationLabelTextViewLIZIZ2 != null) {
                C786410Ut5.v0(relationLabelTextViewLIZIZ2, 0);
            }
            TuxIconView tuxIconViewLJ5 = LJ();
            if (tuxIconViewLJ5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewLJ5, 8);
            }
            TuxTextView tuxTextViewLJFF6 = LJFF();
            if (tuxTextViewLJFF6 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJFF6, 8);
            }
            C786410Ut5.LLLLZLL(LIZJ(), 8);
            C786410Ut5.LLLLZLL(LIZLLL(), 8);
            C1340510kzJ c1340510kzJ2 = C1340510kzJ.LIZ;
            CommentContextSource commentContextSource2 = this.LJ;
            c1340510kzJ2.getClass();
            if (!C1340510kzJ.LIZIZ(commentContextSource2)) {
                if (this.LJIIIZ == null) {
                    this.LJIIIZ = (C1908730zln) C1090570eUB.LIZ(R.id.mhq, R.id.e_9, this.LIZ);
                }
                C1908730zln c1908730zln3 = this.LJIIIZ;
                if (c1908730zln3 != null) {
                    User user = comment.getUser();
                    if (user != null) {
                        C0SWE c0swe = new C0SWE(user);
                        c0swe.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 61), new Pair(Boolean.TRUE, 62));
                        c0swe.LJ = true;
                        if (IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor()) {
                            fragmentLIZ = C946803n0.LIZ(this.LIZ);
                        } else {
                            fragmentLIZ = null;
                        }
                        c0swe.LJFF = fragmentLIZ;
                        c1908730zln3.LLLLZIL(c0swe.LIZ());
                    }
                    c1908730zln3.setTracker(new AwS422S0200000_21(this, comment, 78));
                }
            }
            User user2 = comment.getUser();
            if (user2 != null && (matchedFriendStruct = user2.getMatchedFriendStruct()) != null && (relationLabelTextViewLIZIZ = LIZIZ()) != null) {
                RelationLabelTextView.LJJJJL(relationLabelTextViewLIZIZ, matchedFriendStruct, C1264070j01.LJIIIZ);
            }
            AwS387S0200000_21 awS387S0200000_21 = new AwS387S0200000_21(this, comment, 54);
            RelationLabelTextView relationLabelTextViewLIZIZ3 = LIZIZ();
            if (relationLabelTextViewLIZIZ3 == null) {
                return;
            }
            C786410Ut5.qa(relationLabelTextViewLIZIZ3, new ACListenerS155S0100000_21(awS387S0200000_21, 137));
            return;
        }
        if (!C1341070l0D.LIZJ(comment, this.LIZIZ, this.LIZJ) && !C1341070l0D.LIZIZ(comment) && !C1341070l0D.LJ(comment) && !C1341070l0D.LIZLLL(comment) && comment.getLabelText() != null && comment.getLabelType() == 22) {
            TuxIconView tuxIconViewLJ6 = LJ();
            if (tuxIconViewLJ6 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewLJ6, 8);
            }
            TuxTextView tuxTextViewLJFF7 = LJFF();
            if (tuxTextViewLJFF7 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJFF7, 8);
            }
            LJI();
            C1341060l0C.LIZIZ(comment, LIZJ());
            C1341060l0C.LIZ(comment, LIZLLL());
            return;
        }
        TuxIconView tuxIconViewLJ7 = LJ();
        if (tuxIconViewLJ7 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconViewLJ7, 8);
        }
        TuxTextView tuxTextViewLJFF8 = LJFF();
        if (tuxTextViewLJFF8 != null) {
            C786410Ut5.LLLLZLL(tuxTextViewLJFF8, 8);
        }
        LJI();
        C1341060l0C.LIZIZ(comment, LIZJ());
        C1341060l0C.LIZ(comment, LIZLLL());
    }

    public C1343870l4j(View view, Aweme aweme, String str, boolean z) {
        this.LIZ = view;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = z;
    }
}
