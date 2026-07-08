package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SW9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SW9 {
    public final C0SRL LIZ;
    public View LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1569));

    public final CommentContextSource LIZ() {
        return (CommentContextSource) this.LIZJ.getValue();
    }

    public C0SW9(C0SRL c0srl) {
        Aweme aweme;
        User author;
        Aweme aweme2;
        Aweme aweme3;
        String strEventType;
        C1331070kk5 hierarchy;
        C1331100kk8 c1331100kk8;
        int iIntValue;
        this.LIZ = c0srl;
        ViewGroup viewGroupLJIIIIZZ = c0srl.LJIIIIZZ();
        Aweme aweme4 = c0srl.LIZJ;
        if (viewGroupLJIIIIZZ != null && aweme4 != null) {
            Fragment fragment = c0srl.LIZ;
            this.LIZIZ = viewGroupLJIIIIZZ.findViewById(R.id.mh9);
            SmartImageView smartImageView = (SmartImageView) viewGroupLJIIIIZZ.findViewById(R.id.user_avatar);
            TextView textView = (TextView) viewGroupLJIIIIZZ.findViewById(R.id.user_name);
            C1908730zln c1908730zln = (C1908730zln) viewGroupLJIIIIZZ.findViewById(R.id.user_follow);
            if (smartImageView != null && (hierarchy = smartImageView.getHierarchy()) != null && (c1331100kk8 = hierarchy.LIZJ) != null) {
                c1331100kk8.LJFF(C341940Daq.LIZ(0.5d));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nf, viewGroupLJIIIIZZ.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                c1331100kk8.LJFF = iIntValue;
            }
            if (textView != null) {
                C786410Ut5.I7(new C738700SyK(this, 6), textView);
            }
            if (smartImageView != null) {
                C786410Ut5.I7(new C738700SyK(this, 7), smartImageView);
            }
            CommentContextSource commentContextSourceLIZ = LIZ();
            if (commentContextSourceLIZ != null && (aweme = CommentContextSourceKt.aweme(commentContextSourceLIZ)) != null && (author = aweme.getAuthor()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(author.getAvatarThumb()));
                c1331670kl3LJIIIIZZ.LJJIIZI(C0HD4.LIZ(32.0f, viewGroupLJIIIIZZ.getContext()));
                c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
                c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
                c1331670kl3LJIIIIZZ.LJJIJLIJ = false;
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                if (textView != null) {
                    CommentContextSource commentContextSourceLIZ2 = LIZ();
                    if (commentContextSourceLIZ2 != null) {
                        strEventType = CommentContextSourceKt.eventType(commentContextSourceLIZ2);
                    } else {
                        strEventType = null;
                    }
                    textView.setText(C1342220l24.LJ(author, strEventType, true, true));
                }
                C1908030zkf.LJI(viewGroupLJIIIIZZ.getContext(), author.getCustomVerify(), author.getEnterpriseVerifyReason(), textView);
                CommentContextSource commentContextSourceLIZ3 = LIZ();
                if (commentContextSourceLIZ3 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSourceLIZ3)) != null && AwemeExtKt.isTextMoreAd(aweme2)) {
                    CommentContextSource commentContextSourceLIZ4 = LIZ();
                    if (commentContextSourceLIZ4 != null && (aweme3 = CommentContextSourceKt.aweme(commentContextSourceLIZ4)) != null && C1017070cZd.LL(aweme3)) {
                        if (c1908730zln != null) {
                            C786410Ut5.u0(c1908730zln, 8);
                            C0SWE c0swe = new C0SWE(author);
                            c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
                            c0swe.LJFF = fragment;
                            c0swe.LIZJ = true;
                            c0swe.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 62), new Pair(Boolean.TRUE, 62));
                            c1908730zln.LLLLZIL(c0swe.LIZ());
                        }
                    } else if (c1908730zln != null) {
                        C786410Ut5.u0(c1908730zln, 0);
                        C0SWE c0swe2 = new C0SWE(author);
                        c0swe2.LIZIZ = EnumC1357230lQH.NORMAL;
                        c0swe2.LJFF = fragment;
                        c0swe2.LIZJ = true;
                        c0swe2.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 62), new Pair(Boolean.TRUE, 62));
                        c1908730zln.LLLLZIL(c0swe2.LIZ());
                    }
                } else if (c1908730zln != null) {
                    C0SWE c0swe22 = new C0SWE(author);
                    c0swe22.LIZIZ = EnumC1357230lQH.NORMAL;
                    c0swe22.LJFF = fragment;
                    c0swe22.LIZJ = true;
                    c0swe22.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Boolean.FALSE, 62), new Pair(Boolean.TRUE, 62));
                    c1908730zln.LLLLZIL(c0swe22.LIZ());
                }
                PostModeDetailParams postModeDetailParams = c0srl.LJII;
                if (c1908730zln != null) {
                    c1908730zln.setTracker(new AwS412S0200000_11(aweme4, postModeDetailParams, 86));
                    c1908730zln.setFollowClickInterceptor(new C437740HEm(this, null));
                }
            }
        }
    }
}
