package X;

import Y.ALAdapterS1S0300000_6;
import Y.ALAdapterS3S0200000_6;
import Y.AUListenerS1S0200001_6;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS2S0101001_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.experiment.RepostBubbleOptConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Grn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428890Grn extends AbstractC429340GsW implements InterfaceC428910Grp {
    public static final /* synthetic */ int LLLIIIIL = 0;
    public int LLJJI;
    public int LLJJIII;
    public final C428890Grn LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public TuxIconView LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public final Rect LLJLL;
    public boolean LLJLLIL;
    public final ViewTreeObserverOnPreDrawListenerC462850IDb LLJLLL;
    public Drawable LLJZ;
    public Drawable LLJZIJLIL;
    public Drawable LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public final C01GW LLLFFI;
    public boolean LLLFZ;
    public Function1<? super String, Unit> LLLI;
    public String LLLII;
    public boolean LLLIIII;

    public C428890Grn(Context context) {
        this(context, null, 6, 0);
    }

    public C428890Grn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final TuxTextView getFollowBtnText() {
        return (TuxTextView) this.LLJJJJ.getValue();
    }

    private final Drawable getFollowDraw() {
        Drawable drawable = this.LLJZ;
        return drawable == null ? getFollowBtnBackground() : drawable;
    }

    private final C428860Grk getNewStyleHost() {
        return (C428860Grk) this.LLLFFI.getValue();
    }

    private final Drawable getRepostDraw() {
        Drawable drawable = this.LLJZIJLIL;
        return drawable == null ? getRepostDrawable() : drawable;
    }

    private final LayerDrawable getRepostDrawable() {
        return (LayerDrawable) this.LLJJJJLIIL.getValue();
    }

    private final Drawable getTextInputDraw() {
        Drawable drawable = this.LLL;
        return drawable == null ? getTextInputDrawable() : drawable;
    }

    private final LayerDrawable getTextInputDrawable() {
        return (LayerDrawable) this.LLJJL.getValue();
    }

    private final TuxIconDrawable getTextInputDrawableWithoutBG() {
        return (TuxIconDrawable) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[EDGE_INSN: B:52:0x002f->B:18:0x002f BREAK  A[LOOP:0: B:11:0x001a->B:17:0x002a]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C428890Grn.O0():void");
    }

    public final void P0() {
        C0GUT c0gut;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(AbstractC429340GsW.LLJILLL)));
        FrameLayout avatarLL = getAvatarLL();
        Integer numValueOf = Integer.valueOf(iLIZIZ);
        ViewGroup.LayoutParams layoutParams = avatarLL.getLayoutParams();
        if (numValueOf != null) {
            layoutParams.height = numValueOf.intValue();
        }
        C786410Ut5.W5(avatarLL, layoutParams);
        FrameLayout avatarLL2 = getAvatarLL();
        if ((avatarLL2 instanceof C0GUT) && (c0gut = (C0GUT) avatarLL2) != null) {
            Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(AbstractC429340GsW.LLJJ))));
            if (numValueOf2 != null) {
                numValueOf2.intValue();
                c0gut.LL = numValueOf2.intValue();
            }
            c0gut.requestLayout();
        }
        TuxIconView followBtn = getFollowBtn();
        if (followBtn != null) {
            Integer numValueOf3 = Integer.valueOf(iLIZIZ);
            Integer numValueOf4 = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams2 = followBtn.getLayoutParams();
            if (numValueOf3 != null) {
                layoutParams2.width = numValueOf3.intValue();
            }
            if (numValueOf4 != null) {
                layoutParams2.height = numValueOf4.intValue();
            }
            C786410Ut5.W5(followBtn, layoutParams2);
        }
        View infoArea = getInfoArea();
        Integer numValueOf5 = Integer.valueOf(iLIZIZ);
        ViewGroup.LayoutParams layoutParams3 = infoArea.getLayoutParams();
        if (numValueOf5 != null) {
            layoutParams3.height = numValueOf5.intValue();
        }
        C786410Ut5.W5(infoArea, layoutParams3);
        if (C07NU.LIZ()) {
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = -2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(layoutParams4);
            }
        } else {
            Integer numValueOf6 = Integer.valueOf(iLIZIZ);
            ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
            if (numValueOf6 != null) {
                layoutParams5.height = numValueOf6.intValue();
            }
            C786410Ut5.W5(this, layoutParams5);
        }
        if (((Number) C0BWS.LIZ.getValue()).intValue() == 2) {
            getUpvoteTV().setTextColorRes(R.attr.ee);
        } else {
            getUpvoteTV().setTextColorRes(R.attr.ej);
        }
    }

    public final void S0() {
        if (this.LLJLLIL) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                ViewTreeObserverOnPreDrawListenerC462850IDb viewTreeObserverOnPreDrawListenerC462850IDb = this.LLJLLL;
                viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC462850IDb);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC462850IDb, ViewTreeObserver.OnPreDrawListener.class);
            }
            this.LLJLLIL = false;
        }
    }

    @Override // X.AbstractC429340GsW
    public FrameLayout getAvatarLL() {
        return (FrameLayout) this.LLJJIJIIJIL.getValue();
    }

    public final TuxIconView getFollowBtn() {
        return (TuxIconView) this.LLJJJ.getValue();
    }

    public final Drawable getFollowBtnBackground() {
        return (Drawable) this.LLJJJJJIL.getValue();
    }

    public final LinearLayout getFollowBtnContainer() {
        return (LinearLayout) this.LLJJJIL.getValue();
    }

    public final View getInfoArea() {
        return (View) this.LLJJIJIL.getValue();
    }

    @Override // X.AbstractC429340GsW
    public int getUpvoteTVMaxWidth() {
        if (this.LLJJI != 1) {
            return (((getMaxWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(AbstractC429340GsW.LLJILJILJ)))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
        return (((getMaxWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((getAvatarLL().getChildCount() * AbstractC429340GsW.LLJILJILJ) + 2) - ((getAvatarLL().getChildCount() - 1) * 10))))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    @Override // X.InterfaceC428910Grp
    public final boolean LLLLLIL() {
        TuxIconView followBtn = getFollowBtn();
        return followBtn != null && followBtn.getVisibility() == 0;
    }

    public final void N0() {
        LinearLayout followBtnContainer = getFollowBtnContainer();
        if (followBtnContainer != null) {
            followBtnContainer.setBackground(null);
        }
        TuxTextView followBtnText = getFollowBtnText();
        if (followBtnText != null) {
            C786410Ut5.LLLLZLL(followBtnText, 8);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        if (C07NU.LIZ()) {
            return false;
        }
        return super.hasOverlappingRendering();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TuxIconView tuxIconView = this.LLJLIL;
        if (!this.LLLFF || tuxIconView == null) {
            return;
        }
        L0(tuxIconView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewGroup viewGroup;
        super.onDetachedFromWindow();
        S0();
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView == null || (viewGroup = this.LLJLILLLLZIIL) == null) {
            return;
        }
        viewGroup.getOverlay().remove(tuxIconView);
        this.LLJLILLLLZIIL = null;
    }

    public final int getBarStyle() {
        return this.LLJJI;
    }

    public final int getFollowBtnStyle() {
        return this.LLJJIII;
    }

    public final boolean getLastRenderedAsNoteGuide() {
        return this.LLLIIII;
    }

    public final Function1<String, Unit> getOnNoteGuideClick() {
        return this.LLLI;
    }

    public final boolean getShouGuideAddText() {
        return this.LLJL;
    }

    @Override // X.AbstractC420810Gel
    public View getTouchArea() {
        return this.LLJJIJI;
    }

    private final void setQuickRepostButton(TuxIconView tuxIconView) {
        Drawable drawable;
        Drawable repostDraw = getRepostDraw();
        if (tuxIconView != null) {
            drawable = tuxIconView.getDrawable();
        } else {
            drawable = null;
        }
        if (!Intrinsics.LJFF(drawable, repostDraw) && tuxIconView != null) {
            tuxIconView.setImageDrawable(repostDraw);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(com.bytedance.tux.icon.TuxIconView r5) {
        /*
            r4 = this;
            android.view.ViewParent r2 = r4.getParent()
            r3 = 0
            r1 = 0
        L6:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L20
            r0 = 8
            if (r1 >= r0) goto L20
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 != 0) goto L20
            boolean r0 = r2 instanceof X.C20632315oP
            if (r0 != 0) goto L20
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.ViewParent r2 = r3.getParent()
            int r1 = r1 + 1
            goto L6
        L20:
            android.view.ViewGroup r1 = r4.LLJLILLLLZIIL
            r2 = 1
            if (r3 == 0) goto L43
            if (r3 != r1) goto L43
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L7a
            boolean r0 = r4.LLJLLIL
            if (r0 != 0) goto L42
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L42
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            X.0IDb r0 = r4.LLJLLL
            X.C786410Ut5.y3(r1, r0)
            r4.LLJLLIL = r2
        L42:
            return
        L43:
            if (r1 != 0) goto L7a
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L56
            android.view.ViewParent r0 = r5.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C786410Ut5.LJJJLZIJ(r5, r0)
        L56:
            r4.LLJLILLLLZIIL = r3
            if (r3 == 0) goto L79
            android.view.ViewGroupOverlay r0 = r3.getOverlay()
            r0.add(r5)
            boolean r0 = r4.LLJLLIL
            if (r0 != 0) goto L76
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L76
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            X.0IDb r0 = r4.LLJLLL
            X.C786410Ut5.y3(r1, r0)
            r4.LLJLLIL = r2
        L76:
            r4.O0()
        L79:
            return
        L7a:
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.remove(r5)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C428890Grn.L0(com.bytedance.tux.icon.TuxIconView):void");
    }

    public final void setBarStyle(int i) {
        this.LLJJI = i;
    }

    public final void setDarkIcon(boolean z) {
        TuxIconView followBtn;
        TuxIconView followBtn2;
        TuxIconView followBtn3;
        LinearLayout followBtnContainer;
        if (this.LLLF != z) {
            if (!z) {
                this.LLJZ = null;
                this.LLJZIJLIL = null;
                this.LLL = null;
            } else {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.atk);
                c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                Drawable drawableLIZ = c384050F3z.LIZ(getContext());
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZ = R.raw.icon_repost_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.afx);
                this.LLJZIJLIL = C426750GoL.LJIILIIL(c419910GdJ.LIZ(getContext()), drawableLIZ);
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ2.LIZ = R.raw.icon_pen_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.afx);
                this.LLL = C426750GoL.LJIILIIL(c419910GdJ2.LIZ(getContext()), drawableLIZ);
                this.LLJZ = drawableLIZ;
            }
            int i = this.LLJJIII;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (followBtn3 = getFollowBtn()) != null && followBtn3.getVisibility() == 0 && (followBtnContainer = getFollowBtnContainer()) != null) {
                        followBtnContainer.setBackground(getFollowDraw());
                    }
                } else {
                    TuxIconView followBtn4 = getFollowBtn();
                    if (followBtn4 != null && followBtn4.getVisibility() == 0 && (followBtn2 = getFollowBtn()) != null) {
                        followBtn2.setImageDrawable(getTextInputDraw());
                    }
                }
            } else {
                TuxIconView followBtn5 = getFollowBtn();
                if (followBtn5 != null && followBtn5.getVisibility() == 0 && (followBtn = getFollowBtn()) != null) {
                    followBtn.setImageDrawable(getRepostDraw());
                }
            }
        }
        this.LLLF = z;
    }

    public final void setFifaEasterEgg(boolean z) {
        this.LLLFF = z;
        if (!C07NU.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "social_repost_fifa_easter_egg", true, false)) {
            if (!z) {
                S0();
                TuxIconView tuxIconView = this.LLJLIL;
                if (tuxIconView != null) {
                    ViewGroup viewGroup = this.LLJLILLLLZIIL;
                    if (viewGroup != null) {
                        viewGroup.getOverlay().remove(tuxIconView);
                    } else if (tuxIconView.getParent() instanceof ViewGroup) {
                        C786410Ut5.LJJJLZIJ(tuxIconView, (ViewGroup) tuxIconView.getParent());
                    }
                    this.LLJLILLLLZIIL = null;
                    this.LLJLIL = null;
                    return;
                }
                return;
            }
            TuxIconView tuxIconView2 = this.LLJLIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = new TuxIconView(getContext(), null, 0, 6, null);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_bitmap_fifa_soccerball;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                tuxIconView2.setImageDrawable(c419910GdJ.LIZ(tuxIconView2.getContext()));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 1073741824);
                tuxIconView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.LLJLIL = tuxIconView2;
            }
            L0(tuxIconView2);
        }
    }

    public final void setFollowBtnStyle(int i) {
        this.LLJJIII = i;
    }

    public final void setOnNoteGuideClick(Function1<? super String, Unit> function1) {
        this.LLLI = function1;
    }

    public final void setShouGuideAddText(boolean z) {
        this.LLJL = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    @Override // X.AbstractC429340GsW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(int r8, com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C428890Grn.j0(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C428890Grn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJIJI = this;
        C21146717pB.LIZIZ(context, R.layout.i73, this, true);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJJIJIIJIL = C452501pT.LIZ(enumC452301pR, new C421160GfK(this));
        this.LLJJIJIL = C452501pT.LIZ(enumC452301pR, new C420830Gen(this));
        this.LLJJJ = C452501pT.LIZ(enumC452301pR, new C418080GaM(this));
        this.LLJJJIL = C452501pT.LIZ(enumC452301pR, new C421170GfL(this));
        this.LLJJJJ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 864));
        this.LLJJJJJIL = C452501pT.LIZ(enumC452301pR, new C420360Ge2(context));
        this.LLJJJJLIIL = C452501pT.LIZ(enumC452301pR, new C421080GfC(context, this));
        this.LLJJL = C452501pT.LIZ(enumC452301pR, new C421090GfD(context, this));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(enumC452301pR, new C0GXV(context));
        this.LLJLL = new Rect();
        this.LLJLLL = new ViewTreeObserverOnPreDrawListenerC462850IDb(this, 3);
        this.LLLFFI = C452501pT.LIZ(enumC452301pR, new AwS407S0200000_6(context, this, 44));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    @Override // X.AbstractC429340GsW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(com.ss.android.ugc.aweme.feed.model.Aweme r12, java.util.List r13, long r14) {
        /*
            r11 = this;
            r0 = 0
            r5 = r11
            r5.LLJL = r0
            java.util.Iterator r2 = r13.iterator()
        L8:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto Lb4
            java.lang.Object r3 = r2.next()
            r0 = r3
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 == 0) goto Lb1
            java.lang.String r1 = r0.getUid()
        L1e:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r0 = r0.getCurUserId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8
        L2e:
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r3 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r3
            int r0 = r5.LLJJI
            r2 = 2
            r1 = 1
            if (r0 != r1) goto L8b
            if (r3 != 0) goto L8b
            java.lang.Object r0 = X.C13LP.LJJJLL(r13)
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r0
            if (r0 == 0) goto L42
            java.lang.String r4 = r0.itemId
        L42:
            boolean r0 = X.C0HZ9.LIZ(r4)
            if (r0 != 0) goto L8b
            X.0lVU r0 = X.C1360460lVU.LIZIZ
            boolean r0 = r0.LJIJJLI(r12)
            if (r0 != 0) goto L8b
            r5.j0(r1, r12)
        L53:
            X.01GW r0 = X.C0BWS.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L6b
            com.bytedance.tux.input.TuxTextView r1 = r5.getUpvoteTV()
            r0 = 2131099768(0x7f060078, float:1.7811899E38)
            r1.setTextColorRes(r0)
        L6b:
            super.C0(r12, r13, r14)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r13.iterator()
        L77:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 == 0) goto L77
            r6.add(r0)
            goto L77
        L8b:
            int r0 = r5.LLJJI
            if (r0 != r1) goto La5
            boolean r0 = X.C263730AVf.LIZ()
            if (r0 == 0) goto La5
            boolean r0 = X.C1359720lUI.LJ(r3)
            if (r0 != 0) goto La5
            boolean r0 = X.C0CHP.LIZ()
            if (r0 == 0) goto La5
            r5.j0(r2, r12)
            goto L53
        La5:
            com.bytedance.tux.icon.TuxIconView r1 = r5.getFollowBtn()
            if (r1 == 0) goto L53
            r0 = 8
            X.C786410Ut5.LLLLLLZZ(r1, r0)
            goto L53
        Lb1:
            r1 = r4
            goto L1e
        Lb4:
            r3 = r4
            goto L2e
        Lb7:
            int r8 = r5.LLJJIII
            r7 = 0
            r9 = 0
            r10 = r9
            r5.I0(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C428890Grn.C0(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.List, long):void");
    }

    @Override // X.AbstractC429340GsW
    public final void E0(int i, long j, List list) {
        boolean z;
        super.E0(i, j, list);
        if (C07NU.LIZ()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                User user = ((UpvoteStruct) it2.next()).user;
                if (user != null) {
                    arrayList.add(user);
                }
            }
            int i2 = this.LLJJIII;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            I0(arrayList, null, i2, false, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(X.C1360050lUp r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C428890Grn.M0(X.0lUp, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }

    public /* synthetic */ C428890Grn(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final boolean I0(List list, String str, int i, boolean z, boolean z2) {
        int i2;
        UrlModel avatarThumb;
        Object next;
        boolean z3;
        List listLJLILLLLZI;
        boolean z4;
        boolean z5;
        EnumC429010Grz enumC429010Grz;
        boolean z6;
        RepostBubbleOptConfig repostBubbleOptConfig;
        Object objLJJLIIIJL;
        boolean z7;
        boolean z8;
        float f;
        float f2;
        RepostBubbleOptConfig repostBubbleOptConfig2;
        String str2 = str;
        boolean z9 = false;
        this.LLLIIII = false;
        if (!C07NU.LIZ()) {
            return false;
        }
        C0GYD c0gyd = EnumC428920Grq.Companion;
        RepostBubbleOptConfig repostBubbleOptConfig3 = (RepostBubbleOptConfig) C07NU.LIZ.getValue();
        if (repostBubbleOptConfig3 != null) {
            i2 = repostBubbleOptConfig3.bubbleColorStyle;
        } else {
            i2 = 0;
        }
        c0gyd.getClass();
        EnumC428920Grq enumC428920GrqLIZ = C0GYD.LIZ(i2);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Iterator it2 = list.iterator();
        while (true) {
            avatarThumb = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((User) next).getUid(), curUserId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        User user = (User) next;
        if (user != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (user != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.LJFF(((User) obj).getUid(), curUserId)) {
                    arrayList.add(obj);
                }
            }
            listLJLILLLLZI = C13LP.LJLILLLLZI(user, C13LP.LL(arrayList, 2));
        } else {
            listLJLILLLLZI = list;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLILLLLZI, 10));
        Iterator it3 = listLJLILLLLZI.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((User) it3.next()).getAvatarThumb());
        }
        C786410Ut5.LJLLLLLL(0, getInfoArea());
        getInfoArea().setBackground(null);
        C786410Ut5.LJZ(4, getAvatarLL());
        C786410Ut5.LLLLZLL(getUpvoteTV(), 4);
        TuxIconView followBtn = getFollowBtn();
        if (followBtn != null) {
            C786410Ut5.LLLLLLZZ(followBtn, 8);
        }
        LinearLayout followBtnContainer = getFollowBtnContainer();
        if (followBtnContainer != null) {
            C786410Ut5.LJZL(8, followBtnContainer);
        }
        C428860Grk newStyleHost = getNewStyleHost();
        int visibility = newStyleHost.getVisibility();
        newStyleHost.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, newStyleHost);
        if (list.size() == 1 && user != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z || ((repostBubbleOptConfig2 = (RepostBubbleOptConfig) C07NU.LIZ.getValue()) != null && repostBubbleOptConfig2.enableNoteGuide && ((str2 == null || str2.length() == 0) && z4 && (i == 3 || i == 2)))) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.LLLIIII = z5;
        if (i != 1) {
            if (i != 2 && i != 3) {
                enumC429010Grz = EnumC429010Grz.NONE;
            } else {
                enumC429010Grz = EnumC429010Grz.PEN;
            }
        } else {
            enumC429010Grz = EnumC429010Grz.REPOST;
        }
        if (str2 != null && str2.length() != 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        boolean z10 = !z6;
        CharSequence text = str2;
        if (!z10) {
            text = getUpvoteTV().getText();
        }
        if (z2 && z3 && !this.LLLFZ && !z5 && !z10) {
            if (getNewStyleHost().getCurrentAvatarCount() >= 3) {
                C428860Grk newStyleHost2 = getNewStyleHost();
                if (user != null) {
                    avatarThumb = user.getAvatarThumb();
                }
                newStyleHost2.LLJJI = enumC429010Grz;
                newStyleHost2.LLJJIII = false;
                newStyleHost2.LLJJIJI = EnumC429210GsJ.LL;
                C0GY4 c0gy4 = newStyleHost2.LLJJ;
                int visibility2 = c0gy4.getVisibility();
                c0gy4.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c0gy4);
                C417330GXz c417330GXz = newStyleHost2.LLJILJILJ;
                int visibility3 = c417330GXz.getVisibility();
                c417330GXz.setVisibility(0);
                C1602160rnK.LIZIZ(visibility3, 0, c417330GXz);
                newStyleHost2.LIZJ();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(110L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(newStyleHost2, 150));
                valueAnimatorOfFloat.addListener(new ALAdapterS3S0200000_6(text, newStyleHost2, 34));
                valueAnimatorOfFloat.start();
                if (enumC429010Grz == EnumC429010Grz.NONE) {
                    C786410Ut5.h2(newStyleHost2.LLJILLL, 8);
                } else {
                    C786410Ut5.h2(newStyleHost2.LLJILLL, 0);
                    C0GY5 c0gy5 = newStyleHost2.LLJILLL;
                    if (enumC429010Grz == EnumC429010Grz.PEN) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    c0gy5.LIZ(z7, true);
                }
                C425830Gmr c425830Gmr = newStyleHost2.LLJILJIL;
                if (((ArrayList) c425830Gmr.LLILZ).isEmpty()) {
                    c425830Gmr.setAvatars(Collections.singletonList(avatarThumb));
                } else {
                    int size = ((ArrayList) c425830Gmr.LLILZ).size();
                    if (c425830Gmr.getLayoutDirection() == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        f = 1.0f;
                    } else {
                        f = -1.0f;
                    }
                    C425820Gmq c425820Gmq = new C425820Gmq(c425830Gmr, c425830Gmr.getContext());
                    c425820Gmq.LIZ(avatarThumb);
                    c425820Gmq.LIZIZ(true);
                    c425830Gmr.addView(c425820Gmq);
                    if (z8) {
                        f2 = 0.0f;
                    } else {
                        f2 = (size - 1) * c425830Gmr.LLILLL;
                    }
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) c425830Gmr.LLILLJJLI, 1073741824);
                    c425820Gmq.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    float f3 = c425830Gmr.LLILLJJLI;
                    c425820Gmq.layout((int) f2, 0, (int) (f2 + f3), (int) f3);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425820Gmq);
                    c425820Gmq.setScaleX(1.0f);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425820Gmq);
                    c425820Gmq.setScaleY(1.0f);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425820Gmq);
                    c425820Gmq.setTranslationX(0.0f);
                    for (int i3 = 1; i3 < size; i3++) {
                        ((C425820Gmq) ListProtector.get(c425830Gmr.LLILZ, i3)).LIZIZ(false);
                    }
                    C425820Gmq c425820Gmq2 = (C425820Gmq) C13LP.LJJJLZIJ(size - 1, c425830Gmr.LLILZ);
                    if (c425820Gmq2 != null) {
                        c425820Gmq2.LIZIZ(false);
                    }
                    c425830Gmr.LLILZLL = true;
                    C425820Gmq c425820Gmq3 = (C425820Gmq) ListProtector.get(c425830Gmr.LLILZ, 0);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(180L);
                    valueAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS1S0200001_6(c425820Gmq3, c425830Gmr, f, 2));
                    valueAnimatorOfFloat2.start();
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat3.setDuration(380L);
                    valueAnimatorOfFloat3.setInterpolator(new OvershootInterpolator());
                    valueAnimatorOfFloat3.addUpdateListener(new AUListenerS2S0101001_6(size, c425830Gmr, f, 1));
                    valueAnimatorOfFloat3.addListener(new ALAdapterS1S0300000_6(c425830Gmr, c425820Gmq3, c425820Gmq, 11));
                    valueAnimatorOfFloat3.start();
                }
                newStyleHost2.requestLayout();
                newStyleHost2.invalidate();
            } else {
                getNewStyleHost().LIZ(arrayList2, text, enumC429010Grz, enumC428920GrqLIZ, false, false);
                C428860Grk newStyleHost3 = getNewStyleHost();
                C425830Gmr c425830Gmr2 = newStyleHost3.LLJILJIL;
                if (!((ArrayList) c425830Gmr2.LLILZIL).isEmpty()) {
                    List<View> listLLIIII = C13LP.LLIIII(c425830Gmr2.LLILZIL);
                    ((ArrayList) c425830Gmr2.LLILZIL).clear();
                    for (View view : listLLIIII) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
                        view.setScaleX(0.01f);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
                        view.setScaleY(0.01f);
                    }
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.01f, 1.0f);
                    valueAnimatorOfFloat4.setDuration(380L);
                    valueAnimatorOfFloat4.setInterpolator(new OvershootInterpolator());
                    valueAnimatorOfFloat4.addUpdateListener(new AUListenerS256S0100000_6(listLLIIII, 152));
                    valueAnimatorOfFloat4.start();
                }
                EnumC429010Grz enumC429010Grz2 = newStyleHost3.LLJJI;
                if (enumC429010Grz2 != EnumC429010Grz.NONE) {
                    C0GY5 c0gy52 = newStyleHost3.LLJILLL;
                    if (enumC429010Grz2 == EnumC429010Grz.PEN) {
                        z9 = true;
                    }
                    c0gy52.LIZ(z9, true);
                }
            }
        } else if (z5) {
            C428860Grk newStyleHost4 = getNewStyleHost();
            if (user == null || (objLJJLIIIJL = user.getAvatarThumb()) == null) {
                objLJJLIIIJL = C13LP.LJJLIIIJL(arrayList2);
            }
            newStyleHost4.LIZIZ(Collections.singletonList(objLJJLIIIJL), enumC428920GrqLIZ);
        } else {
            C428860Grk newStyleHost5 = getNewStyleHost();
            if (z10 && (repostBubbleOptConfig = (RepostBubbleOptConfig) C07NU.LIZ.getValue()) != null && repostBubbleOptConfig.enableTwoLineNote) {
                z9 = true;
            }
            newStyleHost5.LIZ(arrayList2, text, enumC429010Grz, enumC428920GrqLIZ, z10, z9);
        }
        this.LLLFZ = z3;
        return true;
    }
}
