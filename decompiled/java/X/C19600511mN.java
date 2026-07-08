package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11mN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19600511mN extends AbstractC19580211j6 {
    public final C19600811mQ LJ;
    public final Aweme LJFF;
    public final C19606111nH LJI;
    public final C01GW LJII;
    public boolean LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;

    public final boolean LJIILJJIL() {
        User author;
        Aweme aweme = this.LJFF;
        return Intrinsics.LJFF(C0CHQ.LIZ().getAccountService().getCurrentUserID(), (aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getUid());
    }

    public final void LJIILL(View view) {
        List<NormalTrackTimeStamp> listLIZIZ;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() != 0 && view.getHeight() != 0 && (listLIZIZ = C19580611jA.LIZIZ(this.LIZJ)) != null && (normalTrackTimeStamp = (NormalTrackTimeStamp) C13LP.LJJJLZIJ(0, listLIZIZ)) != null) {
            RectF rectFLIZ = LIZ(normalTrackTimeStamp);
            view.setPivotX(view.getWidth() / 2.0f);
            view.setPivotY(view.getHeight() / 2.0f);
            C786410Ut5.Jc(view, rectFLIZ.left + ((rectFLIZ.width() - view.getWidth()) / 2.0f));
            C786410Ut5.ed(view, rectFLIZ.top + ((rectFLIZ.height() - view.getHeight()) / 2.0f));
            C786410Ut5.Ob(view, rectFLIZ.width() / view.getWidth());
            C786410Ut5.pc(view, rectFLIZ.width() / view.getWidth());
            C786410Ut5.Ab(view, normalTrackTimeStamp.getRotation());
            C786410Ut5.LJLLLLLL(0, view);
            view.invalidate();
        }
    }

    @Override // X.AbstractC19580211j6
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct) {
        return C19580611jA.LIZJ(j, interactStickerStruct);
    }

    public static void LJIILIIL(float f, float f2, View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), f2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(C1619980sG4.LJI());
        animatorSet.setDuration(150L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.0Hs3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C1440005kM.LIZ(new C453940Hr6(false, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
            }
        });
        animatorSet2.play(animatorSet);
        animatorSet2.start();
    }

    @Override // X.AbstractC19580211j6
    public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        boolean z;
        long playCount;
        if (this.LIZJ.getInteractiveEmojiStickerStruct() != null && LJIILJJIL()) {
            C19600811mQ c19600811mQ = (C19600811mQ) this.LIZIZ;
            Activity activityLIZ = C1388190mED.LIZ(c19600811mQ.LIZ);
            int i = 1;
            if (activityLIZ != null) {
                C450860Hm8 c450860Hm8 = new C450860Hm8(activityLIZ);
                c450860Hm8.LLILLJJLI.LJII = -1001L;
                c450860Hm8.LJIIJ(new AwS608S0100000_29(c19600811mQ, 896));
                c450860Hm8.LIZJ(AFwS257S0000000_19.get$arr$(804));
                int[] iArr = new int[2];
                c19600811mQ.LIZIZ.getLocationOnScreen(iArr);
                c450860Hm8.LJI(C417170GXj.LIZ(activityLIZ));
                c450860Hm8.LLILLJJLI.LIZLLL = EnumC1235690iGF.TOP;
                c450860Hm8.LIZ(((int) f) + iArr[0], ((int) f2) + iArr[1]);
                C0P0T c0p0tLIZIZ = c450860Hm8.LIZIZ();
                c19600811mQ.LJFF = c0p0tLIZIZ;
                c0p0tLIZIZ.show();
                z = true;
            } else {
                z = false;
            }
            interfaceC19579211iw.LIZ(z);
            Aweme aweme = this.LJFF;
            if (aweme != null) {
                if (aweme.getIsTikTokStory()) {
                    if (C281310B0v.LIZ()) {
                        i = 2;
                    }
                } else {
                    i = 0;
                }
                C0LAB c0lab = new C0LAB();
                c0lab.LIZ(i, "story_type");
                c0lab.LJ("group_id", this.LJFF.getAid());
                c0lab.LJ("author_id", C1017070cZd.LJIJ(this.LJFF));
                c0lab.LJ("sticker_type", C1894907bX.LIZ(this.LJFF));
                AwemeStatistics statistics = this.LJFF.getStatistics();
                if (statistics != null) {
                    playCount = statistics.getPlayCount();
                } else {
                    playCount = 0;
                }
                c0lab.LIZIZ(playCount, "vv_cnt");
                C20684815ws.LJIILLIIL("enter_interactive_sticker_result_list", c0lab.LIZ);
            }
        }
    }

    public C19600511mN(final Context context, C19600811mQ c19600811mQ, final InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme, View view) {
        float scaleX;
        final C19602311mf view2;
        C19602311mf view3;
        C19602311mf view4;
        C19600111mJ c19600111mJ;
        ViewGroup viewGroup;
        super(context, c19600811mQ, interactStickerStruct, c705930RmZ);
        this.LJ = c19600811mQ;
        this.LJFF = aweme;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS430S0200000_29(context, c705930RmZ, 138));
        this.LJII = c01gwLIZIZ;
        EmojiAnimPlayground emojiAnimPlayground = new EmojiAnimPlayground(context);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(emojiAnimPlayground, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        this.LJI = new C19606111nH(emojiAnimPlayground);
        if (LJIILJJIL()) {
            ((InterfaceC19599811mG) c01gwLIZIZ.getValue()).LJLJJI(aweme);
            if (c705930RmZ != null && (c19600111mJ = c705930RmZ.LJIJJ) != null && c19600111mJ.LIZ == 1) {
                ((InterfaceC19599811mG) c01gwLIZIZ.getValue()).LJLJJL(C19600011mI.LIZ(c19600111mJ));
            }
        }
        InterfaceC1701620uNk interfaceC1701620uNk = c19600811mQ.LJIILIIL;
        float scaleY = 1.0f;
        if (interfaceC1701620uNk != null && (view4 = interfaceC1701620uNk.getView()) != null) {
            scaleX = view4.getScaleX();
        } else {
            scaleX = 1.0f;
        }
        this.LJIIIZ = scaleX;
        InterfaceC1701620uNk interfaceC1701620uNk2 = c19600811mQ.LJIILIIL;
        if (interfaceC1701620uNk2 != null && (view3 = interfaceC1701620uNk2.getView()) != null) {
            scaleY = view3.getScaleY();
        }
        this.LJIIJ = scaleY;
        InterfaceC1701620uNk interfaceC1701620uNk3 = c19600811mQ.LJIILIIL;
        if (interfaceC1701620uNk3 != null && (view2 = interfaceC1701620uNk3.getView()) != null && !LJIILJJIL() && !C19595311lX.LIZ(interactStickerStruct, aweme, "pan")) {
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.11mP
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view5, MotionEvent motionEvent) {
                    String aid;
                    User author;
                    String aid2;
                    View view6 = this.LL.LJ.getView();
                    if (view6 == null) {
                        return false;
                    }
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 3) {
                                C19600511mN c19600511mN = this.LL;
                                C19600511mN.LJIILIIL(c19600511mN.LJIIIZ, c19600511mN.LJIIJ, view6);
                            }
                            return true;
                        }
                        view2.performClick();
                        C19600511mN c19600511mN2 = this.LL;
                        C19600511mN.LJIILIIL(c19600511mN2.LJIIIZ, c19600511mN2.LJIIJ, view6);
                        C19600511mN c19600511mN3 = this.LL;
                        if (!c19600511mN3.LJIIIIZZ) {
                            InterfaceC19599811mG interfaceC19599811mG = (InterfaceC19599811mG) c19600511mN3.LJII.getValue();
                            Aweme aweme2 = this.LL.LJFF;
                            if (aweme2 == null || (aid2 = aweme2.getAid()) == null) {
                                aid2 = "";
                            }
                            interfaceC19599811mG.LIZ(aid2, interactStickerStruct.getInteractiveEmojiStickerStruct().getEmojiContent());
                            this.LL.LJIIIIZZ = true;
                        }
                        if (C1388190mED.LIZ(context) != null) {
                            this.LL.LJI.LIZIZ(interactStickerStruct.getInteractiveEmojiStickerStruct().getEmojiContent());
                        }
                        C19600511mN c19600511mN4 = this.LL;
                        c19600511mN4.getClass();
                        C0LAB c0lab = new C0LAB();
                        c0lab.LIZ(C729510SjV.LJJIJIL(c19600511mN4.LJFF) ? 1 : 0, "is_story");
                        Aweme aweme3 = c19600511mN4.LJFF;
                        String uid = null;
                        if (aweme3 != null) {
                            aid = aweme3.getAid();
                        } else {
                            aid = null;
                        }
                        c0lab.LJ("group_id", aid);
                        Aweme aweme4 = c19600511mN4.LJFF;
                        if (aweme4 != null && (author = aweme4.getAuthor()) != null) {
                            uid = author.getUid();
                        }
                        c0lab.LJ("author_id", uid);
                        c0lab.LJ("sticker_type", C1894907bX.LIZ(c19600511mN4.LJFF));
                        c0lab.LJ("action_type", "click");
                        C20684815ws.LJIILLIIL("interact_with_sticker", c0lab.LIZ);
                        return true;
                    }
                    C19600511mN c19600511mN5 = this.LL;
                    C19600511mN.LJIILIIL(c19600511mN5.LJIIIZ * 0.85f, c19600511mN5.LJIIJ * 0.85f, view6);
                    return true;
                }
            });
        }
    }
}
