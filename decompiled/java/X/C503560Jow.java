package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.VoteInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.PollVoteResponse;

/* JADX INFO: renamed from: X.0Jow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503560Jow extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final TextView LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final CardView LLIZLLLIL;
    public final C01GW LLJ;

    public C503560Jow(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.rfe);
        this.LLILZ = (TextView) view.findViewById(R.id.rfy);
        this.LLILZIL = view.findViewById(R.id.vote_percentage);
        this.LLILZLL = view.findViewById(R.id.rfa);
        this.LLIZ = view.findViewById(R.id.j8g);
        this.LLIZLLLIL = (CardView) view.findViewById(R.id.ut_);
        this.LLJ = C452501pT.LIZIZ(new C503610Jp1(this));
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C503080JoA c503080JoA;
        float f;
        C19ME c19me;
        boolean z;
        int iIntValue;
        Integer numLIZJ;
        int iIntValue2;
        Integer numLIZJ2;
        if ((abstractC503810JpL instanceof C503080JoA) && (c503080JoA = (C503080JoA) abstractC503810JpL) != null) {
            SpacePollOption spacePollOption = c503080JoA.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c503080JoA.LIZJ);
            sbLIZ.append(". ");
            sbLIZ.append(spacePollOption.text);
            this.LLILLL.setText(C2188811AlT.LIZIZ(sbLIZ));
            final SpacePoll spacePoll = c503080JoA.LIZ.pollInfo;
            if (spacePoll == null) {
                return;
            }
            boolean z2 = spacePoll.isEnd;
            int iIntValue3 = 0;
            this.LLIZLLLIL.setBackground(C507390Jv7.LIZ(C497740JfY.LIZIZ(8.0f), C20736316Cj.LIZIZ(R.attr.c63, this.LL.getContext()), 0, 0));
            VoteInfo voteInfo = spacePoll.voteInfo;
            if (voteInfo != null && C500260Jjc.LJJJI(Boolean.valueOf(voteInfo.hasVoted))) {
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
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((char) 65372);
                sbLIZ2.append((int) (100 * f));
                sbLIZ2.append('%');
                this.LLILZ.setText(C2188811AlT.LIZIZ(sbLIZ2));
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Joz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SubSpaceFeedVM subSpaceFeedVM = this.LL.LLILLJJLI;
                        C503080JoA c503080JoA2 = c503080JoA;
                        subSpaceFeedVM.getClass();
                        if (c503080JoA2 != null) {
                            subSpaceFeedVM.setState(new C504300Jq8(c503080JoA2));
                        }
                        this.LL.LLILLJJLI.wQ2().LIZ(c503080JoA.LIZ, "vote_list");
                    }
                }, this.LLIZ);
                VoteInfo voteInfo2 = spacePoll.voteInfo;
                if (voteInfo2 != null && voteInfo2.votedOptionId == spacePollOption.optionId) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !z2) {
                    View view = this.LLILZIL;
                    Context context = this.LL.getContext();
                    if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.eus, context)) != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    view.setBackgroundColor(iIntValue2);
                    C786410Ut5.T4(this.LLILZIL, 0.3f);
                    U5(1.0f, R.attr.eus);
                } else {
                    View view2 = this.LLILZIL;
                    Context context2 = this.LL.getContext();
                    if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c62, context2)) != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    view2.setBackgroundColor(iIntValue);
                    C786410Ut5.T4(this.LLILZIL, 1.0f);
                    U5(1.0f, R.attr.c5y);
                }
                ((C474280Iio) this.LLJ.getValue()).LIZ(spacePollOption.pollUserList);
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Jox
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.LL.LLILLJJLI.AQ2(c503080JoA.LIZ);
                    }
                }, this.LL);
            } else {
                C786410Ut5.LLIL(this.LLILZ, 8);
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
                C786410Ut5.LJLLLLLL(8, this.LLILZIL);
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jp0
                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view3) {
                        long j3;
                        C0J1N c0j1n;
                        if (view3 != null) {
                            if (spacePoll.isEnd) {
                                C766270U4b.LIZLLL(2131856532);
                                return;
                            }
                            C503560Jow c503560Jow = this;
                            final SubSpaceFeedVM subSpaceFeedVM = c503560Jow.LLILLJJLI;
                            final C503080JoA c503080JoA2 = c503080JoA;
                            final C503690Jp9 c503690Jp9 = new C503690Jp9();
                            final C503580Joy c503580Joy = new C503580Joy(c503560Jow);
                            subSpaceFeedVM.getClass();
                            SpacePost spacePost = c503080JoA2.LIZ;
                            long j4 = spacePost.postId;
                            SpacePoll spacePoll2 = spacePost.pollInfo;
                            if (spacePoll2 != null) {
                                j3 = spacePoll2.pollId;
                            } else {
                                j3 = 0;
                            }
                            long j5 = c503080JoA2.LIZIZ.optionId;
                            C480460Ism.LIZ().getClass();
                            C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).pollVote(j4, j3, j5).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "SubSpaceFeedVM", "sub/space/poll/vote", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
                            if (c11nzLJIILJJIL != null && (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceFeedVM))) != null) {
                                c0j1n.LIZ(new C09JN() { // from class: X.0JpB
                                    @Override // X.C09JN
                                    public final void accept(Object obj) {
                                        SpacePoll spacePoll3;
                                        C1C7U.LIZ("SubSpaceFeedVM@e7dc.votePoll$1");
                                        PollVoteResponse.ResponseData responseData = (PollVoteResponse.ResponseData) ((BaseResponse) obj).data;
                                        if (responseData != null && (spacePoll3 = responseData.poll) != null) {
                                            c503080JoA2.LIZ.pollInfo = spacePoll3;
                                        }
                                        C503760JpG c503760JpG = subSpaceFeedVM.LLILZIL;
                                        if (c503760JpG != null) {
                                            c503760JpG.LIZLLL(c503080JoA2.LIZ);
                                        }
                                        c503690Jp9.invoke();
                                        C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.votePoll$1");
                                    }
                                }, new C09JN() { // from class: X.07xy
                                    @Override // X.C09JN
                                    public final void accept(Object obj) {
                                        C1C7U.LIZ("SubSpaceFeedVM@e7dc.votePoll$2");
                                        c503580Joy.invoke(obj);
                                        C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.votePoll$2");
                                    }
                                });
                            }
                            this.LLILLJJLI.wQ2().LIZ(c503080JoA.LIZ, "vote");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, this.LL);
                U5(0.5f, R.attr.c5y);
            }
            if (z2) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ex7, this.LL.getContext());
                if (numLIZJ3 != null) {
                    iIntValue3 = numLIZJ3.intValue();
                }
            } else {
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ewy, this.LL.getContext());
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
