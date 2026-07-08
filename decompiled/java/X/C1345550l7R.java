package X;

import Y.AAListenerS332S0100000_21;
import Y.AObserverS224S0100000_21;
import Y.ATListenerS454S0100000_21;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.ICommentPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import u4.q0;

/* JADX INFO: renamed from: X.0l7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345550l7R extends FrameLayout implements InterfaceC724530SbT, LifecycleOwner, ViewModelStoreOwner {
    public final LifecycleRegistry LL;
    public final C01GW LLILLJJLI;
    public Comment LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public Aweme LLIZ;
    public WeakReference<AbsFragment> LLIZLLLIL;
    public final boolean LLJ;
    public C1340400kz8 LLJI;
    public boolean LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public RelativeLayout LLJILLL;
    public TuxTextView LLJJ;
    public TuxIconView LLJJI;
    public TuxIconView LLJJIII;
    public RelativeLayout LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public AnimatorSet LLJJJ;
    public AnimatorSet LLJJJIL;
    public AnimatorSet LLJJJJ;
    public AnimatorSet LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public AnimatorSet LLJJLIIIJLLLLLLLZ;
    public AnimatorSet LLJL;
    public AnimatorSet LLJLIL;
    public AnimatorSet LLJLILLLLZIIL;
    public String LLJLL;
    public FypExposedCommentMobParams LLJLLIL;
    public InterfaceC1345590l7V LLJLLL;
    public Function0<Boolean> LLJZ;
    public final CommentLikeViewModel LLJZIJLIL;
    public final boolean LLL;
    public CommentContextSource LLLF;
    public InterfaceC1339900kyK LLLFF;

    private final String getCommentTag() {
        return "";
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    private final String getEnterFrom() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        CommentContextSource commentContextSource = this.LLLF;
        if (commentContextSource == null && ((interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this, null), "source_default_key", CommentContextSource.class, null)) == null || (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) == null)) {
            return null;
        }
        return CommentContextSourceKt.enterFrom(commentContextSource);
    }

    private final String getFromPage() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        CommentContextSource commentContextSource = this.LLLF;
        if (commentContextSource == null && ((interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this, null), "source_default_key", CommentContextSource.class, null)) == null || (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) == null)) {
            return null;
        }
        return CommentContextSourceKt.fromPage(commentContextSource);
    }

    public final void LIZIZ() {
        AnimatorSet animatorSetLIZJ;
        AnimatorSet animatorSetLIZIZ = C1342140l1w.LIZIZ(this.LLJILJILJ);
        this.LLJJJIL = animatorSetLIZIZ;
        animatorSetLIZIZ.addListener(new AAListenerS332S0100000_21(this, 72));
        AnimatorSet animatorSetLIZIZ2 = C1342140l1w.LIZIZ(this.LLJILJIL);
        this.LLJJJ = animatorSetLIZIZ2;
        animatorSetLIZIZ2.addListener(new AAListenerS332S0100000_21(this, 73));
        AnimatorSet animatorSetLIZLLL = C1342140l1w.LIZLLL(this.LLJILJIL, this.LLJILJILJ);
        this.LLJJJJJIL = animatorSetLIZLLL;
        animatorSetLIZLLL.addListener(new AAListenerS332S0100000_21(this, 74));
        AnimatorSet animatorSetLIZJ2 = C1342140l1w.LIZJ(this.LLJILJILJ, this.LLJILJIL);
        this.LLJJJJ = animatorSetLIZJ2;
        animatorSetLIZJ2.addListener(new AAListenerS332S0100000_21(this, 75));
        if (!C294180Bg0.LIZ()) {
            AnimatorSet animatorSetLIZIZ3 = C1342140l1w.LIZIZ(this.LLJJIII);
            this.LLJL = animatorSetLIZIZ3;
            animatorSetLIZIZ3.addListener(new AAListenerS332S0100000_21(this, 76));
            AnimatorSet animatorSetLIZIZ4 = C1342140l1w.LIZIZ(this.LLJJI);
            this.LLJJLIIIJLLLLLLLZ = animatorSetLIZIZ4;
            animatorSetLIZIZ4.addListener(new AAListenerS332S0100000_21(this, 77));
        }
        AnimatorSet animatorSetLIZLLL2 = C1342140l1w.LIZLLL(this.LLJJI, this.LLJJIII);
        this.LLJLILLLLZIIL = animatorSetLIZLLL2;
        animatorSetLIZLLL2.addListener(new AAListenerS332S0100000_21(this, 78));
        if (C294180Bg0.LIZ()) {
            TuxIconView tuxIconView = this.LLJJIII;
            TuxIconView tuxIconView2 = this.LLJJI;
            if (tuxIconView == null || tuxIconView2 == null) {
                animatorSetLIZJ = new AnimatorSet();
            } else {
                Object parent = tuxIconView2.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    view.setPivotX(view.getLayoutDirection() == 1 ? 0.0f : C0HD5.LIZIZ(view, Float.valueOf(25.0f)));
                    view.setPivotY(C0HD5.LIZIZ(view, Float.valueOf(12.0f)));
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -10.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(valueAnimatorOfFloat.getDuration());
                valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.45f, 0.0f, 0.55f, 1.0f));
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 71));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView2, "rotation", 180.0f, 160.0f, 180.0f);
                objectAnimatorOfFloat.setDuration(240L);
                objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.45f, 0.0f, 0.55f, 1.0f));
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView2, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(120L);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat3.setDuration(120L);
                objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                animatorSetLIZJ = new AnimatorSet();
                animatorSetLIZJ.play(valueAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
            }
        } else {
            animatorSetLIZJ = C1342140l1w.LIZJ(this.LLJJIII, this.LLJJI);
        }
        this.LLJLIL = animatorSetLIZJ;
        animatorSetLIZJ.addListener(new AAListenerS332S0100000_21(this, 79));
        RelativeLayout relativeLayout = this.LLJILLL;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(new ATListenerS454S0100000_21(this, 9));
        }
        RelativeLayout relativeLayout2 = this.LLJJIJI;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnTouchListener(new ATListenerS454S0100000_21(this, 10));
        }
    }

    public final boolean LIZJ() {
        C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
        CommentContextSource commentContextSource = this.LLLF;
        if (commentContextSource == null) {
            commentContextSource = null;
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this, null), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
        }
        c1340510kzJ.getClass();
        return C1340510kzJ.LIZIZ(commentContextSource);
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x055b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 1422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345550l7R.LIZLLL():void");
    }

    public final void LJII() {
        TuxIconView tuxIconView = this.LLJJI;
        if (tuxIconView != null) {
            tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
        TuxIconView tuxIconView2 = this.LLJJIII;
        if (tuxIconView2 != null) {
            tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
    }

    public final void LJIIIIZZ() {
        TuxIconView tuxIconView = this.LLJILJIL;
        if (tuxIconView != null) {
            tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
        TuxIconView tuxIconView2 = this.LLJILJILJ;
        if (tuxIconView2 != null) {
            tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return (ViewModelStore) this.LLILLJJLI.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C622680Oba.LIZJ(this);
        this.LL.setCurrentState(Lifecycle.State.CREATED);
        this.LLJZIJLIL.LLILLJJLI.observe(this, new AObserverS224S0100000_21(this, 25));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.setCurrentState(Lifecycle.State.DESTROYED);
        getViewModelStore().clear();
        C622680Oba.LIZLLL(this);
    }

    public final Aweme getAweme() {
        return this.LLIZ;
    }

    public final CommentContextSource getCommentContextSource() {
        return this.LLLF;
    }

    public final WeakReference<AbsFragment> getFragmentReference() {
        return this.LLIZLLLIL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LL;
    }

    public final CommentLikeViewModel getLikeVM() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final CommentLikeViewModel getVM() {
        return this.LLJZIJLIL;
    }

    public final void LJ(String str) {
        Comment comment;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean zLJI = MethodIDManager.LJI(202324);
        CommentPerfMonitorUtil.LIZ.getClass();
        C1345420l7E c1345420l7E = CommentPerfMonitorUtil.LJFF;
        c1345420l7E.LIZIZ();
        c1345420l7E.LIZIZ = System.currentTimeMillis();
        String cid = null;
        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(C946803n0.LIZ(this), C1558360qeg.LJ(this, null));
        if (iCommentListAssemAbilityLIZLLL != null) {
            iCommentListAssemAbilityLIZLLL.yE1(EnumC1341670l1B.LIKE_COMMENT);
        }
        if (this.LLJZIJLIL.LLILLL) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!C1345890l7z.LIZ(this.LLILLL) && (comment = this.LLILLL) != null && comment.getCid() != null) {
            RelativeLayout relativeLayout = this.LLJILLL;
            int i3 = 1;
            if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                boolean zLIZJ = LIZJ();
                if (!zLIZJ) {
                    getContext();
                    try {
                        if (C036E.LIZ.LIZIZ()) {
                            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                                LJIIIIZZ();
                                Activity activityLJFF = C2214201BlK.LJFF();
                                String str2 = this.LLILZ;
                                C627150Oin c627150Oin = new C627150Oin();
                                C786410Ut5.LJJJI("login_title", "", c627150Oin.LIZ);
                                C786410Ut5.LJJJI("group_id", this.LLILZIL, c627150Oin.LIZ);
                                C786410Ut5.LJJJI("author_id", this.LLILZLL, c627150Oin.LIZ);
                                C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(this.LLILZIL), c627150Oin.LIZ);
                                C0XPD.LIZIZ(activityLJFF, str2, "like_comment", c627150Oin.LIZ, null);
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                    return;
                                }
                                return;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    LJIIIIZZ();
                    C1389890mGx c1389890mGx = new C1389890mGx(this);
                    c1389890mGx.LJIIIZ(2131837962);
                    c1389890mGx.LJIIJJI();
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    LJIIIIZZ();
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                if (C1345570l7T.LIZ(this.LLILLL)) {
                    Comment comment2 = this.LLILLL;
                    if (comment2 != null && comment2.isUserDigged()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = !z;
                    Comment comment3 = this.LLILLL;
                    if (comment3 != null) {
                        int diggCount = comment3.getDiggCount();
                        if (z3) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        i = diggCount + i2;
                    } else {
                        i = 0;
                    }
                    Comment comment4 = this.LLILLL;
                    if (comment4 != null && comment4.isAuthorDigged()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (TextUtils.equals(this.LLILZLL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                        z2 = z3;
                    }
                    if (z2) {
                        C1350920lG6.LJLLL("show");
                    }
                    if (z3) {
                        AnimatorSet animatorSet = this.LLJJJJ;
                        if (animatorSet != null) {
                            animatorSet.start();
                        }
                        InterfaceC1345590l7V interfaceC1345590l7V = this.LLJLLL;
                        if (interfaceC1345590l7V != null) {
                            interfaceC1345590l7V.H4();
                        }
                        ICommentListAssemAbility iCommentListAssemAbilityLIZLLL2 = C1345760l7m.LIZLLL(C946803n0.LIZ(this), C1558360qeg.LJ(this, null));
                        if (iCommentListAssemAbilityLIZLLL2 != null) {
                            iCommentListAssemAbilityLIZLLL2.xn2(Boolean.FALSE);
                        }
                    } else {
                        AnimatorSet animatorSet2 = this.LLJJJJJIL;
                        if (animatorSet2 != null) {
                            animatorSet2.start();
                        }
                    }
                    LJIIJ(Boolean.valueOf(z3), Boolean.valueOf(z2), Integer.valueOf(i), false, true);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLikeClicked: comment id ");
                    Comment comment5 = this.LLILLL;
                    if (comment5 != null) {
                        cid = comment5.getCid();
                    }
                    sbLIZ.append(cid);
                    sbLIZ.append(", toDiggState ");
                    sbLIZ.append(z3);
                    sbLIZ.append(", toDiggCount ");
                    sbLIZ.append(i);
                    C1344030l4z.LIZJ("LikeAndHateView", C2188811AlT.LIZIZ(sbLIZ));
                    if (z3) {
                        Comment comment6 = this.LLILLL;
                        if (comment6 != null && comment6.isUserBuried()) {
                            LJIIIZ(Boolean.FALSE);
                        }
                    } else {
                        i3 = 2;
                    }
                    if (zLIZJ) {
                        this.LLJZIJLIL.vQ2(i3, str, z2);
                        C1340510kzJ.LIZ.getClass();
                        C1340510kzJ.LIZJ(this);
                    } else {
                        this.LLJZIJLIL.zQ2(i3, str, z2);
                    }
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIIIZ(Boolean bool) {
        CommentContextSource commentContextSource = this.LLLF;
        if (commentContextSource == null) {
            commentContextSource = null;
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this, null), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null) {
                commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
            }
        }
        if (commentContextSource != null && commentContextSource.isSplitMode()) {
            RelativeLayout relativeLayout = this.LLJJIJI;
            if (relativeLayout != null) {
                C1206770hVb.LIZJ(C0HD5.LIZ(relativeLayout, 4), relativeLayout);
            }
        } else {
            RelativeLayout relativeLayout2 = this.LLJJIJI;
            if (relativeLayout2 != null) {
                C1206770hVb.LIZJ(C0HD5.LIZ(relativeLayout2, 0), relativeLayout2);
            }
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            TuxIconView tuxIconView = this.LLJJI;
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 1.0f);
            }
            TuxIconView tuxIconView2 = this.LLJJIII;
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, 0.0f);
            }
            RelativeLayout relativeLayout3 = this.LLJJIJI;
            if (relativeLayout3 != null) {
                q0.LJJIFFI(relativeLayout3, getContext().getString(2131823220));
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLJJI;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 0.0f);
        }
        TuxIconView tuxIconView4 = this.LLJJIII;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, 1.0f);
        }
        RelativeLayout relativeLayout4 = this.LLJJIJI;
        if (relativeLayout4 == null) {
            return;
        }
        q0.LJJIFFI(relativeLayout4, getContext().getString(2131823223));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLikeClick(C1339680kxy c1339680kxy) {
        String cid;
        Comment comment = c1339680kxy.LIZ;
        String cid2 = null;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        Comment comment2 = this.LLILLL;
        if (comment2 != null) {
            cid2 = comment2.getCid();
        }
        if (Intrinsics.LJFF(cid, cid2)) {
            LJ("double_tap");
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            if (i != 4 && i != 8) {
                return;
            }
            this.LL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            this.LL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            return;
        }
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    public final void setAweme(Aweme aweme) {
        this.LLIZ = aweme;
    }

    public final void setCommentContextSource(CommentContextSource commentContextSource) {
        this.LLLF = commentContextSource;
    }

    public final void setFragmentReference(WeakReference<AbsFragment> weakReference) {
        this.LLIZLLLIL = weakReference;
    }

    public final void setHateChangeListener(InterfaceC1339900kyK interfaceC1339900kyK) {
        this.LLLFF = interfaceC1339900kyK;
    }

    public final void setHateHideWhenAnimation(boolean z) {
        if (z) {
            RelativeLayout relativeLayout = this.LLJJIJI;
            if (relativeLayout != null) {
                C786410Ut5.LLIIL(relativeLayout, 4);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.LLJJIJI;
        if (relativeLayout2 == null) {
            return;
        }
        C786410Ut5.LLIIL(relativeLayout2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setHateVisibility(boolean r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L56
            android.widget.RelativeLayout r0 = r4.LLJJIJI
            r3 = 0
            X.C12ES.LJIILL(r3, r0)
            com.bytedance.tux.input.TuxTextView r2 = r4.LLJJ
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r4.LLILLL
            if (r0 == 0) goto L47
            int r0 = r0.getDiggCount()
            if (r0 != 0) goto L47
        L14:
            r0 = 4
        L15:
            X.C12ES.LJIILL(r0, r2)
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0l7U r0 = r0.LJIIZILJ()
            r0.LIZ()
            android.widget.RelativeLayout r0 = r4.LLJILLL
            r2 = 0
            if (r0 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L2e:
            boolean r0 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r0 == 0) goto L46
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            if (r2 == 0) goto L46
            r0 = 21
            r2.removeRule(r0)
            r1 = 2131374959(0x7f0a336f, float:1.8370052E38)
            r0 = 16
            r2.addRule(r0, r1)
            r2.setMarginEnd(r3)
        L46:
            return
        L47:
            X.0l0N r1 = X.C1341170l0N.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLIZ
            r1.getClass()
            boolean r0 = X.C1341170l0N.LIZ(r0)
            if (r0 != 0) goto L14
            r0 = 0
            goto L15
        L56:
            android.widget.RelativeLayout r1 = r4.LLJJIJI
            r0 = 8
            X.C12ES.LJIILL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345550l7R.setHateVisibility(boolean):void");
    }

    public final void setIsHateAnimating(boolean z) {
        this.LLJJJJLIIL = z;
    }

    public C1345550l7R(Context context, AttributeSet attributeSet) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        RelativeLayout.LayoutParams layoutParams;
        super(context, attributeSet, 0);
        this.LL = new LifecycleRegistry(this);
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(678));
        this.LLILZ = "";
        this.LLILZIL = "";
        this.LLILZLL = "";
        boolean zBooleanValue = ((Boolean) C305060BxY.LIZ.getValue()).booleanValue();
        this.LLJ = zBooleanValue;
        this.LLJZ = AFwS209S0000000_21.get$arr$(677);
        this.LLJZIJLIL = (CommentLikeViewModel) new ViewModelProvider(this).get(CommentLikeViewModel.class);
        boolean zLIZIZ = C19252910Tv.LIZIZ.LIZLLL().LJIIZILJ().LIZIZ();
        this.LLL = zLIZIZ;
        FrameLayout.inflate(context, R.layout.a1z, this);
        this.LLJILJIL = (TuxIconView) findViewById(R.id.lmj);
        this.LLJILJILJ = (TuxIconView) findViewById(R.id.lf0);
        this.LLJILLL = (RelativeLayout) findViewById(R.id.mo0);
        this.LLJJ = (TuxTextView) findViewById(R.id.zts);
        this.LLJJI = (TuxIconView) findViewById(R.id.ljd);
        this.LLJJIII = (TuxIconView) findViewById(R.id.lyt);
        this.LLJJIJI = (RelativeLayout) findViewById(R.id.jhi);
        TuxIconView tuxIconView2 = this.LLJILJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, 0.0f);
        }
        TuxIconView tuxIconView3 = this.LLJILJILJ;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 1.0f);
        }
        TuxIconView tuxIconView4 = this.LLJJI;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, 0.0f);
        }
        TuxIconView tuxIconView5 = this.LLJJIII;
        if (tuxIconView5 != null) {
            C786410Ut5.x5(tuxIconView5, 1.0f);
        }
        RelativeLayout relativeLayout = this.LLJILLL;
        if (relativeLayout != null) {
            q0.LJJI(relativeLayout, true);
            q0.LJIJ(relativeLayout, new C786390Ut3(18));
        }
        RelativeLayout relativeLayout2 = this.LLJJIJI;
        if (relativeLayout2 != null) {
            q0.LJJI(relativeLayout2, true);
            q0.LJIJ(relativeLayout2, new C786390Ut3(19));
        }
        if (zLIZIZ) {
            C12ES.LJIILL(8, this.LLJJIJI);
            RelativeLayout relativeLayout3 = this.LLJILLL;
            ViewGroup.LayoutParams layoutParams2 = relativeLayout3 != null ? relativeLayout3.getLayoutParams() : null;
            if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.removeRule(16);
                layoutParams.addRule(21);
            }
        }
        if (C1339960kyQ.LIZ() && (tuxTextView = this.LLJJ) != null) {
            tuxTextView.setTuxFont(62);
        }
        if (C294180Bg0.LIZ() && (tuxIconView = this.LLJJI) != null) {
            tuxIconView.setTintColorRes(R.attr.a1k);
        }
        if (C294180Bg0.LIZJ() >= 3) {
            TuxIconView tuxIconView6 = this.LLJILJIL;
            if (tuxIconView6 != null) {
                C1206770hVb.LIZLLL(C0HD5.LIZ(tuxIconView6, 3), tuxIconView6);
                C1206770hVb.LIZIZ(C0HD5.LIZ(tuxIconView6, 11), tuxIconView6);
                C1351950lHl.LJIJI(C0HD5.LIZ(tuxIconView6, 32), tuxIconView6);
            }
            TuxIconView tuxIconView7 = this.LLJILJILJ;
            if (tuxIconView7 != null) {
                C1206770hVb.LIZLLL(C0HD5.LIZ(tuxIconView7, 3), tuxIconView7);
                C1206770hVb.LIZIZ(C0HD5.LIZ(tuxIconView7, 11), tuxIconView7);
                C1351950lHl.LJIJI(C0HD5.LIZ(tuxIconView7, 32), tuxIconView7);
            }
            TuxIconView tuxIconView8 = this.LLJJI;
            if (tuxIconView8 != null) {
                C1206770hVb.LIZLLL(C0HD5.LIZ(tuxIconView8, 11), tuxIconView8);
                C1206770hVb.LIZIZ(C0HD5.LIZ(tuxIconView8, 3), tuxIconView8);
                C1351950lHl.LJIJI(C0HD5.LIZ(tuxIconView8, 32), tuxIconView8);
            }
            TuxIconView tuxIconView9 = this.LLJJIII;
            if (tuxIconView9 != null) {
                C1206770hVb.LIZLLL(C0HD5.LIZ(tuxIconView9, 11), tuxIconView9);
                C1206770hVb.LIZIZ(C0HD5.LIZ(tuxIconView9, 3), tuxIconView9);
                C1351950lHl.LJIJI(C0HD5.LIZ(tuxIconView9, 32), tuxIconView9);
            }
        }
        if (C294180Bg0.LIZ() && C07CE.LIZ()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_heart_cracked;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            TuxIconView tuxIconView10 = this.LLJJIII;
            if (tuxIconView10 != null) {
                tuxIconView10.setTuxIcon(c419910GdJ);
            }
            TuxIconView tuxIconView11 = this.LLJJIII;
            if (tuxIconView11 != null) {
                C786410Ut5.Fb(tuxIconView11, 0.0f);
            }
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_heart_cracked_fill;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1p);
            TuxIconView tuxIconView12 = this.LLJJI;
            if (tuxIconView12 != null) {
                tuxIconView12.setTuxIcon(c419910GdJ2);
            }
            TuxIconView tuxIconView13 = this.LLJJI;
            if (tuxIconView13 != null) {
                C786410Ut5.Fb(tuxIconView13, 0.0f);
            }
        }
        if (zBooleanValue) {
            LIZIZ();
        }
    }

    public final void LJI(EnumC1345510l7N enumC1345510l7N, Throwable th) {
        Integer num;
        C23112093u c23112093u;
        C23112093u c23112093u2;
        CommentContextSource commentContextSource;
        C23112093u c23112093u3;
        C23112093u c23112093u4;
        int i = C1345530l7P.LIZ[enumC1345510l7N.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        num = 2131828360;
                        if ((th instanceof C0XIR) && (c23112093u4 = (C23112093u) th) != null && c23112093u4.getErrorCode() == 3002043) {
                            num = 2131828361;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    num = 2131828360;
                }
            } else {
                num = 2131857729;
                if ((th instanceof C0XIR) && (c23112093u3 = (C23112093u) th) != null && c23112093u3.getErrorCode() == 3002043) {
                    num = 2131829239;
                }
            }
        } else {
            num = 2131830649;
            if ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null && c23112093u.getErrorCode() == 3002043) {
                num = 2131829238;
            }
        }
        C1354920lMY.LIZLLL(getContext(), th, num.intValue());
        if ((th instanceof C0XIR) && (c23112093u2 = (C23112093u) th) != null && c23112093u2.getErrorCode() == 3002043) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this, null), "source_default_key", CommentContextSource.class, null);
            if (interfaceC1555100qZQLIZIZ != null && (commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource()) != null) {
                commentContextSource.innerRefreshCommentStatus(true);
            }
            ICommentPageAbility iCommentPageAbility = (ICommentPageAbility) C1558520qew.LIZ(C1558360qeg.LJ(this, null), ICommentPageAbility.class, null);
            if (iCommentPageAbility != null) {
                iCommentPageAbility.LP0();
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.lang.Boolean r7, java.lang.Boolean r8, java.lang.Integer r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345550l7R.LJIIJ(java.lang.Boolean, java.lang.Boolean, java.lang.Integer, boolean, boolean):void");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[PHI: r7
      0x00c1: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v5 java.lang.String) binds: [B:34:0x00bf, B:32:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[PHI: r7
      0x00c5: PHI (r7v3 java.lang.String) = (r7v1 java.lang.String), (r7v4 java.lang.String) binds: [B:34:0x00bf, B:36:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb A[PHI: r11 r12 r13 r14 r15
      0x00eb: PHI (r11v2 java.lang.String) = (r11v4 java.lang.String), (r11v5 java.lang.String) binds: [B:48:0x00e9, B:46:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r12v2 java.lang.String) = (r12v4 java.lang.String), (r12v5 java.lang.String) binds: [B:48:0x00e9, B:46:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r13v2 java.lang.String) = (r13v4 java.lang.String), (r13v5 java.lang.String) binds: [B:48:0x00e9, B:46:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r14v2 java.util.Map<java.lang.String, java.lang.Object>) = (r14v4 java.util.Map<java.lang.String, java.lang.Object>), (r14v5 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:48:0x00e9, B:46:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r15v1 java.lang.String) = (r15v3 java.lang.String), (r15v4 java.lang.String) binds: [B:48:0x00e9, B:46:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C1345550l7R r8, com.ss.android.ugc.aweme.comment.model.Comment r9, java.lang.String r10, java.lang.String r11, com.ss.android.ugc.aweme.feed.model.Aweme r12, X.C1340400kz8 r13, java.lang.String r14, X.InterfaceC1345590l7V r15, com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams r16, kotlin.jvm.internal.AwS565S0100000_21 r17) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345550l7R.LIZ(X.0l7R, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, X.0kz8, java.lang.String, X.0l7V, com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams, kotlin.jvm.internal.AwS565S0100000_21):void");
    }
}
