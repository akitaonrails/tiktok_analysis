package X;

import Y.ACListenerS111S0200000_7;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.VoteInfo;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AwS551S0100000_7;
import wh6.AbS324S0300000_7;

/* JADX INFO: renamed from: X.0K35, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K35 extends C0K3V {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final CardView LLIZLLLIL;
    public final C01GW LLJ;

    public C0K35(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (TextView) view.findViewById(R.id.rfe);
        this.LLILZ = (TextView) view.findViewById(R.id.rfy);
        this.LLILZIL = view.findViewById(R.id.vote_percentage);
        this.LLILZLL = view.findViewById(R.id.rfa);
        this.LLIZ = view.findViewById(R.id.j8g);
        this.LLIZLLLIL = (CardView) view.findViewById(R.id.ut_);
        this.LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 734));
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K34 c0k34;
        Boolean boolValueOf;
        float f;
        C19ME c19me;
        boolean z;
        int iIntValue;
        Integer numLIZJ;
        int iIntValue2;
        Integer numLIZJ2;
        if ((abstractC511160K2w instanceof C0K34) && (c0k34 = (C0K34) abstractC511160K2w) != null) {
            SpacePollOption spacePollOption = c0k34.LIZIZ;
            TextView textView = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0k34.LIZJ);
            sbLIZ.append(". ");
            sbLIZ.append(spacePollOption.text);
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            SpacePoll spacePoll = c0k34.LIZ.pollInfo;
            if (spacePoll == null) {
                return;
            }
            boolean z2 = spacePoll.isEnd;
            int iIntValue3 = 0;
            this.LLIZLLLIL.setBackground(C510570K0p.LIZ(C511520K4g.LIZ(8.0f), C426930God.LIZ(R.attr.f8h, this.LL.getContext()), 0, 0));
            VoteInfo voteInfo = spacePoll.voteInfo;
            if (voteInfo != null) {
                boolValueOf = Boolean.valueOf(voteInfo.hasVoted);
            } else {
                boolValueOf = null;
            }
            if (C0K51.LJI(boolValueOf)) {
                C786410Ut5.LLIL(this.LLILZ, 0);
                C786410Ut5.LJLLLLLL(0, this.LLIZ);
                C786410Ut5.LJLLLLLL(0, this.LLILZIL);
                long j = spacePollOption.votes;
                Iterator<SpacePollOption> it2 = spacePoll.optionList.iterator();
                long j2 = 0;
                while (it2.hasNext()) {
                    j2 += it2.next().votes;
                }
                if (j2 > 0) {
                    f = j / j2;
                } else {
                    f = 0.0f;
                }
                ViewGroup.LayoutParams layoutParams = this.LLILZIL.getLayoutParams();
                if (layoutParams instanceof C19ME) {
                    c19me = (C19ME) layoutParams;
                    if (c19me != null) {
                        c19me.matchConstraintPercentWidth = f;
                    }
                } else {
                    c19me = null;
                }
                C786410Ut5.W5(this.LLILZIL, c19me);
                this.LLILZIL.requestLayout();
                TextView textView2 = this.LLILZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((char) 65372);
                sbLIZ2.append((int) (100 * f));
                sbLIZ2.append('%');
                textView2.setText(C2188811AlT.LIZIZ(sbLIZ2));
                C786410Ut5.I7(new ACListenerS111S0200000_7(this, c0k34, 44), this.LLIZ);
                VoteInfo voteInfo2 = spacePoll.voteInfo;
                if (voteInfo2 != null && voteInfo2.votedOptionId == spacePollOption.optionId) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !z2) {
                    View view = this.LLILZIL;
                    Context context = this.LL.getContext();
                    if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.f_b, context)) != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    view.setBackgroundColor(iIntValue2);
                    C786410Ut5.T4(this.LLILZIL, 0.3f);
                    U5(1.0f, R.attr.f_b);
                } else {
                    View view2 = this.LLILZIL;
                    Context context2 = this.LL.getContext();
                    if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.f8g, context2)) != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    view2.setBackgroundColor(iIntValue);
                    C786410Ut5.T4(this.LLILZIL, 1.0f);
                    U5(1.0f, R.attr.f8d);
                }
                ((C0JCI) this.LLJ.getValue()).LIZ(spacePollOption.pollUserList);
                C786410Ut5.I7(new ACListenerS111S0200000_7(this, c0k34, 45), this.LL);
            } else {
                C786410Ut5.LLIL(this.LLILZ, 8);
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
                C786410Ut5.LJLLLLLL(8, this.LLILZIL);
                C786410Ut5.I7(new AbS324S0300000_7(spacePoll, this, c0k34, 12), this.LL);
                U5(0.5f, R.attr.f8d);
            }
            if (z2) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.f_j, this.LL.getContext());
                if (numLIZJ3 != null) {
                    iIntValue3 = numLIZJ3.intValue();
                }
            } else {
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.f_f, this.LL.getContext());
                if (numLIZJ4 != null) {
                    iIntValue3 = numLIZJ4.intValue();
                }
            }
            this.LLILLL.setTextColor(iIntValue3);
            this.LLILZ.setTextColor(iIntValue3);
        }
    }

    public final void U5(float f, int i) {
        int iIntValue;
        Integer numLIZJ;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        gradientDrawable.setColor(C446980Hfs.LIZ(this.LL.getContext(), android.R.color.transparent));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
        Context context = this.LL.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setStroke(iLIZIZ, iIntValue);
        this.LLILZLL.setBackground(gradientDrawable);
    }
}
