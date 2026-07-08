package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS15S0400000_6;
import Y.ARunnableS29S0400000_21;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ViewOnTouchListenerC1351130lGR extends C19GU implements InterfaceC1348780lCe, View.OnTouchListener, InterfaceC487330J9f, InterfaceC713360RyY {
    public final Aweme LLILZLL;
    public final Context LLIZ;
    public final Fragment LLIZLLLIL;
    public final int[] LLJ;
    public final String LLJI;
    public View LLJIJIL;
    public LinearLayout LLJILJIL;
    public final List<CommentPersonalizedEmoji> LLJILJILJ;
    public final C01GW LLJILLL;
    public int LLJJ;
    public List<? extends RectF> LLJJI;
    public List<? extends RectF> LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final ARunnableS106S0100000_6 LLJJL;
    public final ARunnableS106S0100000_6 LLJJLIIIJLLLLLLLZ;
    public final C1348730lCZ LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final InterfaceC665370Q7z LLJLL;

    @Override // X.InterfaceC1348780lCe
    public final boolean checkCommentInputable() {
        return true;
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        LinearLayout linearLayout = this.LLJILJIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        HandlerHook.viewRemoveCallbacks(linearLayout, this.LLJJL);
        HandlerHook.viewRemoveCallbacks(linearLayout, this.LLJJLIIIJLLLLLLLZ);
        View view = this.LLJIJIL;
        if (view == null) {
            view = null;
        }
        C21616519il c21616519ilLJIILLIIL = C1619980sG4.LJIILLIIL(view, AbstractC21616419ik.LJIILL, 0.3f);
        c21616519ilLJIILLIIL.LJI(1.0f);
        View view2 = this.LLJIJIL;
        if (view2 == null) {
            view2 = null;
        }
        C21616519il c21616519ilLJIILLIIL2 = C1619980sG4.LJIILLIIL(view2, AbstractC21616419ik.LJIILLIIL, 0.3f);
        c21616519ilLJIILLIIL2.LJI(1.0f);
        View view3 = this.LLJIJIL;
        if (view3 == null) {
            view3 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        View view4 = this.LLJIJIL;
        if (view4 == null) {
            view4 = null;
        }
        if (view4.getParent() != null) {
            View view5 = this.LLJIJIL;
            HandlerHook.viewPost(view5 != null ? view5 : null, new ARunnableS29S0400000_21(objectAnimatorOfFloat, c21616519ilLJIILLIIL, c21616519ilLJIILLIIL2, this, 2));
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ Comment getCommentInputReplyComment() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final int getCommentInputViewType() {
        return 1;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final String getEventType() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputClick() {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputKeyboardDismiss(boolean z, C1347310lAH c1347310lAH) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputKeyboardShow(boolean z, String str, C1347310lAH c1347310lAH) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiClick(String str, int i, int i2) {
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiToKeyboard(String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public void onEvent(C1346240l8Y c1346240l8Y) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void publishCommentPost(Comment comment, Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void tryTriggerEasterEgg(CommentSurpriseStruct commentSurpriseStruct) {
    }

    public final void LJJZZIII() {
        if (C1388190mED.LIZ(this.LLIZ) != null) {
            Activity activityLIZ = C1388190mED.LIZ(this.LLIZ);
            if (activityLIZ == null || !activityLIZ.isFinishing()) {
                try {
                    super.dismiss();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final int LJL() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1351130lGR.LJLI():void");
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC1348780lCe
    public final Aweme getCommentInputAweme() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1348780lCe
    public final EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.LONG_PRESS_EMOJI;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLJLL;
    }

    public static void LJLIIIL(View view) {
        C1351160lGU c1351160lGU;
        AnimatorSet animatorSet;
        if ((view instanceof C1351160lGU) && (c1351160lGU = (C1351160lGU) view) != null) {
            AnimatorSet animatorSet2 = c1351160lGU.LLILLJJLI;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = c1351160lGU.LLILLJJLI) != null) {
                animatorSet.cancel();
            }
            TuxTextView tuxTextView = c1351160lGU.LL;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, "scaleX", tuxTextView.getScaleX(), 1.0f);
            TuxTextView tuxTextView2 = c1351160lGU.LL;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView2, "scaleY", tuxTextView2.getScaleY(), 1.0f);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setInterpolator(C1619980sG4.LIZLLL());
            animatorSet3.setDuration(200L);
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet3.start();
            c1351160lGU.LLILLL = animatorSet3;
        }
    }

    public final void LJJ(boolean z) throws Throwable {
        DialogC19728412Gs dialogC19728412Gs;
        Object obj;
        long commentCount;
        int iLIZLLL;
        View view = null;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaM6bNaTo/2Oa3m2KR30HSuaSWhPEtxToLzvDhcCIrWXAeow==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null && (obj = objArr2[0]) != null) {
                dialogC19728412Gs = (DialogC19728412Gs) obj;
            } else {
                dialogC19728412Gs = this;
            }
            super.show();
            c0wst.LIZ(300000, "androidx/appcompat/app/AppCompatDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
        }
        View view2 = this.LLJIJIL;
        if (view2 == null) {
            view2 = null;
        }
        C21616519il c21616519ilLJIILLIIL = C1619980sG4.LJIILLIIL(view2, AbstractC21616419ik.LJIILL, 1.0f);
        c21616519ilLJIILLIIL.LJI(0.3f);
        c21616519ilLJIILLIIL.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0HfO
            @Override // X.InterfaceC1427630nFp
            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z2, float f, float f2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("springScaleInX animation=");
                sbLIZ.append(abstractC21616419ik);
                sbLIZ.append(", canceled=");
                sbLIZ.append(z2);
                sbLIZ.append(", value=");
                sbLIZ.append(f);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        View view3 = this.LLJIJIL;
        if (view3 == null) {
            view3 = null;
        }
        C21616519il c21616519ilLJIILLIIL2 = C1619980sG4.LJIILLIIL(view3, AbstractC21616419ik.LJIILLIIL, 1.0f);
        c21616519ilLJIILLIIL2.LJI(0.3f);
        c21616519ilLJIILLIIL2.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0HfP
            @Override // X.InterfaceC1427630nFp
            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z2, float f, float f2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("springScaleInY animation=");
                sbLIZ.append(abstractC21616419ik);
                sbLIZ.append(", canceled=");
                sbLIZ.append(z2);
                sbLIZ.append(", value=");
                sbLIZ.append(f);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        View view4 = this.LLJIJIL;
        if (view4 == null) {
            view4 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view4, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(150L);
        View view5 = this.LLJIJIL;
        if (view5 == null) {
            view5 = null;
        }
        if (view5.getParent() != null) {
            View view6 = this.LLJIJIL;
            if (view6 != null) {
                view = view6;
            }
            HandlerHook.viewPost(view, new ARunnableS15S0400000_6(objectAnimatorOfFloat, c21616519ilLJIILLIIL, c21616519ilLJIILLIIL2, this, 2));
        }
        C1348610lCN.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_comment_long_press_tooltip_first_show_prefix");
        sbLIZ.append(curUserId);
        C0TSK.LJFF(C2188811AlT.LIZIZ(sbLIZ), Boolean.TRUE);
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        String aid = this.LLILZLL.getAid();
        String str = this.LLJI;
        String authorUid = AwemeExtKt.getAuthorUid(this.LLILZLL);
        boolean zLJIIIIZZ = C729980SkG.LJIIIIZZ(this.LLILZLL);
        AwemeStatistics statistics = this.LLILZLL.getStatistics();
        if (statistics != null) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = 0;
        }
        User author = this.LLILZLL.getAuthor();
        if (author != null) {
            iLIZLLL = C1351950lHl.LIZLLL(author);
        } else {
            iLIZLLL = 0;
        }
        c1350920lG6.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (aid == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LIZJ(zLJIIIIZZ ? 1 : 0, "is_video_author");
        c2344009Gk.LIZLLL(commentCount, "visible_comment_cnt");
        c2344009Gk.LIZJ(iLIZLLL, "follow_status");
        C1350920lG6.LJJJ(c2344009Gk, "show_emoji_dialog");
        C1440005kM.LIZ(new C453940Hr6(true, false, 4));
        new C0ZDN(this.LLIZ).LIZ(0);
    }

    public final void LJLIIL(int i) {
        int i2;
        C1351160lGU c1351160lGU;
        AnimatorSet animatorSet;
        if (C444960Hcc.LIZIZ()) {
            i2 = (4 - i) - 1;
        } else {
            i2 = i;
        }
        if (i != -1) {
            if (i2 != this.LLJJ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("  highlight item");
                sbLIZ.append(i2);
                sbLIZ.append(", resetHighLight item");
                sbLIZ.append(this.LLJJ);
                C2188811AlT.LIZIZ(sbLIZ);
                int i3 = this.LLJJ;
                LinearLayout linearLayout = this.LLJILJIL;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                View childAt = linearLayout.getChildAt(i3);
                if (childAt != null && (childAt instanceof C1351160lGU)) {
                    LJLIIIL(childAt);
                }
                LinearLayout linearLayout2 = this.LLJILJIL;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                View childAt2 = linearLayout2.getChildAt(i2);
                if (childAt2 != null && (childAt2 instanceof C1351160lGU) && (childAt2 instanceof C1351160lGU) && (c1351160lGU = (C1351160lGU) childAt2) != null) {
                    AnimatorSet animatorSet2 = c1351160lGU.LLILLL;
                    if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = c1351160lGU.LLILLL) != null) {
                        animatorSet.cancel();
                    }
                    new C0ZDN(c1351160lGU.getContext()).LIZ(0);
                    TuxTextView tuxTextView = c1351160lGU.LL;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, "scaleX", tuxTextView.getScaleX(), 1.4f);
                    TuxTextView tuxTextView2 = c1351160lGU.LL;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView2, "scaleY", tuxTextView2.getScaleY(), 1.4f);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.setInterpolator(C1619980sG4.LIZLLL());
                    animatorSet3.setDuration(200L);
                    animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet3.start();
                    c1351160lGU.LLILLJJLI = animatorSet3;
                }
                this.LLJJ = i2;
                return;
            }
            if (i != -1) {
                return;
            }
        }
        if (this.LLJJ == -1) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" resetHighLight item");
        sbLIZ2.append(this.LLJJ);
        C2188811AlT.LIZIZ(sbLIZ2);
        int i4 = this.LLJJ;
        LinearLayout linearLayout3 = this.LLJILJIL;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        View childAt3 = linearLayout3.getChildAt(i4);
        if (childAt3 != null && (childAt3 instanceof C1351160lGU)) {
            LJLIIIL(childAt3);
        }
        this.LLJJ = i;
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishStart(Comment comment) {
        boolean z;
        String awemeId;
        if (comment == null) {
            return;
        }
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 != null && awemeId2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Aweme aweme = this.LLILZLL;
            if (aweme == null || (awemeId = aweme.getAid()) == null) {
                awemeId = "";
            }
        } else {
            awemeId = comment.getAwemeId();
        }
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(this.LLIZLLLIL, this.LLIZLLLIL.getActivity());
        if (listLJJIZ != null) {
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).ei(comment);
            }
        }
        C0RSR c0rsr = new C0RSR(0, null);
        c0rsr.LIZJ = awemeId;
        C1440005kM.LIZ(c0rsr);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        dismiss();
        C785410UrT.LIZ(this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                }
            }
            LJLI();
            return true;
        }
        LJJZZI(this.LLJJIII, motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final void LJJZZI(List list, float f, float f2) {
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((RectF) it2.next()).contains(f, f2)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            LJLIIL(i);
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        int iLJIIL;
        if (comment == null) {
            return;
        }
        if (comment.getPublishScenario() != 1) {
            CommentService.LIZ.getClass();
            C523420Kfs.LIZ().LLD(this.LLIZ, exc);
        }
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(this.LLIZLLLIL, this.LLIZLLLIL.getActivity());
        if (listLJJIZ != null) {
            comment.setIgnoreToast(true);
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).vz(comment);
            }
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Aweme aweme = this.LLILZLL;
        String str = this.LLJI;
        List<CommentImageStruct> imageList = comment.getImageList();
        if (imageList != null) {
            iLJIIL = C1351950lHl.LJIIL(imageList);
        } else {
            iLJIIL = 0;
        }
        Integer numValueOf = Integer.valueOf(iLJIIL);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        c1350920lG6.getClass();
        C1350920lG6.LJZ(str, "press_comment_icon", aweme, null, false, comment, null, bool, null, null, null, null, null, null, null, numValueOf, bool2, null, null, null, null, 0, null, null);
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishSuccess(Comment comment, boolean z, CommentResponse commentResponse) {
        String aid;
        String awemeId = comment.getAwemeId();
        int iLJIIL = 0;
        if (awemeId != null && awemeId.length() != 0) {
            aid = comment.getAwemeId();
        } else {
            Aweme aweme = this.LLILZLL;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
        }
        C1440005kM.LIZ(new C1209980ham(3, new Object[]{aid, comment.m169clone()}));
        CommentService.LIZ.getClass();
        List listLJJIZ = C523420Kfs.LIZ().LJJIZ(this.LLIZLLLIL, this.LLIZLLLIL.getActivity());
        if (listLJJIZ != null) {
            comment.setIgnoreToast(true);
            Iterator it2 = listLJJIZ.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1351090lGN) it2.next()).LO(comment);
            }
        }
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        Aweme aweme2 = this.LLILZLL;
        String str = this.LLJI;
        List<CommentImageStruct> imageList = comment.getImageList();
        if (imageList != null) {
            iLJIIL = C1351950lHl.LJIIL(imageList);
        }
        Integer numValueOf = Integer.valueOf(iLJIIL);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.FALSE;
        c1350920lG6.getClass();
        C1350920lG6.LJZ(str, "press_comment_icon", aweme2, null, true, comment, null, bool, null, null, null, null, null, null, null, numValueOf, bool2, null, null, null, null, 0, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a3, code lost:
    
        if (r3 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a5, code lost:
    
        r0 = r3.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ab, code lost:
    
        if ((r0 instanceof android.view.ViewGroup) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ad, code lost:
    
        r3 = r3.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b3, code lost:
    
        if ((r3 instanceof android.view.ViewGroup) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b5, code lost:
    
        r3 = (android.view.ViewGroup) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b7, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b9, code lost:
    
        r3.setClipChildren(false);
        r3.setClipToPadding(false);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c0, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c1, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01b9 -> B:36:0x01a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnTouchListenerC1351130lGR(android.content.Context r11, androidx.fragment.app.Fragment r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, java.lang.String r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1351130lGR.<init>(android.content.Context, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int[]):void");
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishClick(int i, int i2, CharSequence charSequence, String str, String str2, boolean z, C1347310lAH c1347310lAH) {
        long commentCount;
        CharSequence charSequence2 = charSequence;
        Aweme aweme = this.LLILZLL;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        String str3 = this.LLJI;
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = -1;
        }
        C1347300lAG.LIZLLL(aweme, charSequence2, str3, null, null, null, null, "press_comment_icon", str3, str, i, null, c1347310lAH, commentCount, null, null, null, -1074561392, 1021);
    }
}
