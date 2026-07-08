package X;

import android.animation.Animator;
import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18NR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NR extends AbstractC21274918Nn {
    public ConstraintLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public C1735630vGb LLIZLLLIL;
    public C1735630vGb LLJ;
    public View LLJI;
    public ConstraintLayout LLJIJIL;
    public LinearLayout LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxIconView LLJJ;
    public TuxIconView LLJJI;
    public SmartImageView LLJJIII;
    public View LLJJIJI;
    public SmartImageView LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public String LLJJJ;
    public boolean LLJJJIL;
    public Boolean LLJJJJ;
    public Animator LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public C18QL LLJJL;
    public Boolean LLJJLIIIJLLLLLLLZ;

    private final C18QK getAnchorViewHolder() {
        return (C18QK) this.LLJJJJLIIL.getValue();
    }

    public final ConstraintLayout getAnchorBackContent() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azd);
            this.LLJILJILJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final SmartImageView getAnchorBubbleImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azi);
            this.LLJJIII = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final ConstraintLayout getAnchorContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azo);
            this.LLILLJJLI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final LinearLayout getAnchorDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azp);
            this.LLJILJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final View getAnchorDividerFromXml() {
        View view = this.LLJJIJI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.azq);
        this.LLJJIJI = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxIconView getAnchorIconMoreFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azz);
            this.LLJJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final FrameLayout getAnchorImgContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b01);
            this.LLJJIJIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView getAnchorImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b00);
            this.LLJJI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getAnchorPreTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1f);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final View getAnchorPrivilegeDivFromXml() {
        View view = this.LLJI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.b1l);
        this.LLJI = viewFindViewById;
        return viewFindViewById;
    }

    public final C1735630vGb getAnchorPrivilegeFirstFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1m);
            this.LLIZLLLIL = (C1735630vGb) callbackFindViewById;
        }
        return (C1735630vGb) callbackFindViewById;
    }

    public final C1735630vGb getAnchorPrivilegeSecondFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1n);
            this.LLJ = (C1735630vGb) callbackFindViewById;
        }
        return (C1735630vGb) callbackFindViewById;
    }

    public final SmartImageView getAnchorProductImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1r);
            this.LLJJIJIIJIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final ConstraintLayout getAnchorPromotionFlowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1u);
            this.LLJIJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView getAnchorSufTitleDivFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b2d);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorSufTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b2c);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorSuffixFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b2e);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorTitleDivFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b32);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b31);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZJ() {
        if (t1.LIZ()) {
            Animator animator = this.LLJJJJJIL;
            if (animator != null) {
                animator.cancel();
            }
            ViewGroup.LayoutParams layoutParams = getAnchorImgFromXml().getLayoutParams();
            layoutParams.width = C0H9H.LIZIZ(20);
            layoutParams.height = C0H9H.LIZIZ(20);
            C786410Ut5.M6(getAnchorImgFromXml(), layoutParams);
            C786410Ut5.x5(getAnchorImgFromXml(), 1.0f);
            C03DZ.LIZ(getAnchorProductImgFromXml());
        }
        C03DZ.LIZ(getAnchorPromotionFlowFromXml());
        C12ES.LJIILL(0, getAnchorDescFromXml());
    }

    public final void LIZLLL() {
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonFeedDependService.class.getName(), anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).tryUnifyECommerceAnchorBackground(getAnchorContentFromXml());
    }

    @Override // X.AbstractC21274918Nn
    public SmartImageView getBubbleIconView() {
        return getAnchorBubbleImgFromXml();
    }

    @Override // X.AbstractC21274918Nn
    public TuxIconView getIconView() {
        return getAnchorImgFromXml();
    }

    public final SmartImageView getImgCoverIconView$ecommerce_video_release() {
        return getAnchorProductImgFromXml();
    }

    public final boolean getIsPrefixShown$ecommerce_video_release() {
        return getAnchorPreTitleFromXml().getVisibility() == 0;
    }

    public final boolean getIsSuftitleShown$ecommerce_video_release() {
        return getAnchorSufTitleFromXml().getVisibility() == 0;
    }

    public final Pair<Boolean, Integer> getTitleShowStateInfo$ecommerce_video_release() {
        int ellipsisCount;
        int lineCount = getAnchorTitleFromXml().getLineCount();
        if (lineCount <= 0) {
            return new Pair<>(Boolean.FALSE, 0);
        }
        Layout layout = getAnchorTitleFromXml().getLayout();
        return (layout == null || (ellipsisCount = layout.getEllipsisCount(lineCount + (-1))) <= 0) ? new Pair<>(Boolean.FALSE, Integer.valueOf(getAnchorTitleFromXml().getText().length())) : new Pair<>(Boolean.TRUE, Integer.valueOf(getAnchorTitleFromXml().getText().length() - ellipsisCount));
    }

    @Override // X.AbstractC21274918Nn
    public String getPromotionInfo() {
        return this.LLJJJ;
    }

    public final String getPromotionStyleInfo() {
        return this.LLJJJ;
    }

    public C18NR(Context context) {
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        super(context, null);
        this.LLJJJJ = Boolean.FALSE;
        FrameLayout.inflate(context, R.layout.akm, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonFeedDependService.class.getName(), anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).tryAnchorChangeBackgroundWithRadiusV2(findViewById(R.id.azo), 4);
        ConstraintLayout anchorContentFromXml = getAnchorContentFromXml();
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        Context context2 = getContext();
        anchorBizUtils.getClass();
        anchorContentFromXml.setMaxWidth(AnchorBizUtils.LJIIIZ(context2));
        this.LLJJJJLIIL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS576S0100000_32(this, 901));
        this.LLJJLIIIJLLLLLLLZ = Boolean.TRUE;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View anchorDividerFromXml = getAnchorDividerFromXml();
        boolean z = true;
        if (anchorDividerFromXml != null && anchorDividerFromXml.isAttachedToWindow() && anchorDividerFromXml.getVisibility() == 0) {
            anchorDividerFromXml.getLocationInWindow(new int[2]);
            float rawX = Float.MAX_VALUE;
            if (C1744760vVK.LIZ()) {
                if (motionEvent != null) {
                    rawX = motionEvent.getRawX();
                }
                if (rawX < r2[0]) {
                    z = false;
                }
                this.LLJJJIL = z;
            } else {
                if (motionEvent != null) {
                    rawX = motionEvent.getRawX();
                }
                if (rawX > r2[0]) {
                    z = false;
                }
                this.LLJJJIL = z;
            }
        } else {
            this.LLJJJIL = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAnchorBackContent(ConstraintLayout constraintLayout) {
        this.LLJILJILJ = constraintLayout;
    }

    public final void setAnchorBubbleImgFromXml(SmartImageView smartImageView) {
        this.LLJJIII = smartImageView;
    }

    public final void setAnchorContentFromXml(ConstraintLayout constraintLayout) {
        this.LLILLJJLI = constraintLayout;
    }

    public final void setAnchorDescFromXml(LinearLayout linearLayout) {
        this.LLJILJIL = linearLayout;
    }

    public final void setAnchorDividerFromXml(View view) {
        this.LLJJIJI = view;
    }

    public final void setAnchorIconMoreFromXml(TuxIconView tuxIconView) {
        this.LLJJ = tuxIconView;
    }

    public final void setAnchorImgContainerFromXml(FrameLayout frameLayout) {
        this.LLJJIJIL = frameLayout;
    }

    public final void setAnchorImgFromXml(TuxIconView tuxIconView) {
        this.LLJJI = tuxIconView;
    }

    public final void setAnchorPreTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setAnchorPrivilegeDivFromXml(View view) {
        this.LLJI = view;
    }

    public final void setAnchorPrivilegeFirstFromXml(C1735630vGb c1735630vGb) {
        this.LLIZLLLIL = c1735630vGb;
    }

    public final void setAnchorPrivilegeSecondFromXml(C1735630vGb c1735630vGb) {
        this.LLJ = c1735630vGb;
    }

    public final void setAnchorProductImgFromXml(SmartImageView smartImageView) {
        this.LLJJIJIIJIL = smartImageView;
    }

    public final void setAnchorPromotionFlowFromXml(ConstraintLayout constraintLayout) {
        this.LLJIJIL = constraintLayout;
    }

    public final void setAnchorSufTitleDivFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setAnchorSufTitleFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setAnchorSuffixFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setAnchorTitleDivFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setAnchorTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setImageCoverUrlLoaded(Boolean bool) {
        this.LLJJJJ = bool;
    }

    @Override // X.AbstractC21274918Nn
    public void setPreTitle(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            getAnchorPreTitleFromXml().setText(charSequence);
            C12ES.LJIILL(0, getAnchorPreTitleFromXml());
            C12ES.LJIILL(0, getAnchorTitleDivFromXml());
        }
    }

    public final void setPrefixSuffixPriority(Boolean bool) {
        this.LLJJLIIIJLLLLLLLZ = Boolean.valueOf(!Intrinsics.LJFF(bool, Boolean.FALSE));
    }

    public final void setPromotionStyleInfo(String str) {
        this.LLJJJ = str;
    }

    public final void setSufTitle(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            getAnchorSufTitleFromXml().setText(charSequence);
            C12ES.LJIILL(0, getAnchorSufTitleFromXml());
            C12ES.LJIILL(0, getAnchorSufTitleDivFromXml());
        }
    }

    @Override // X.AbstractC21274918Nn
    public void setSuffix(int i) {
        if (i > 1) {
            getAnchorSuffixFromXml().setText(String.valueOf(i));
            C12ES.LJIILL(0, getAnchorDividerFromXml());
            C12ES.LJIILL(0, getAnchorSuffixFromXml());
            C12ES.LJIILL(0, getAnchorIconMoreFromXml());
        }
    }

    @Override // X.AbstractC21274918Nn
    public final void LIZIZ(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            getAnchorTitleFromXml().setText(charSequence);
        }
        setPreTitle(charSequence2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout r6 = r7.getAnchorContentFromXml()
            boolean r0 = defpackage.t1.LIZ()
            r3 = 0
            if (r0 == 0) goto L6b
            android.widget.FrameLayout r0 = r7.getAnchorImgContainerFromXml()
            if (r0 == 0) goto L76
            int r5 = r0.getMeasuredWidth()
        L15:
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r1 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            android.content.Context r0 = r7.getContext()
            r1.getClass()
            int r4 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJIIIZ(r0)
            int r2 = r6.getPaddingStart()
            int r0 = r6.getPaddingEnd()
            int r2 = r2 + r0
            int r2 = r2 + r5
            android.widget.LinearLayout r0 = r7.getAnchorDescFromXml()
            if (r0 == 0) goto L69
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L69
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
        L40:
            int r2 = r2 + r0
            int r4 = r4 - r2
            X.18QL r0 = r7.LLJJL
            if (r0 != 0) goto L51
            X.18QL r1 = new X.18QL
            X.18QK r0 = r7.getAnchorViewHolder()
            r1.<init>(r0)
            r7.LLJJL = r1
        L51:
            X.18QL r2 = r7.LLJJL
            if (r2 == 0) goto L65
            if (r4 < 0) goto L58
            r3 = r4
        L58:
            java.lang.Boolean r1 = r7.LLJJLIIIJLLLLLLLZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            r2.LIZ(r3, r0)
        L65:
            super.onMeasure(r8, r9)
            return
        L69:
            r0 = 0
            goto L40
        L6b:
            com.bytedance.tux.icon.TuxIconView r0 = r7.getAnchorImgFromXml()
            if (r0 == 0) goto L76
            int r5 = r0.getMeasuredWidth()
            goto L15
        L76:
            r5 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18NR.onMeasure(int, int):void");
    }

    @Override // X.AbstractC21274918Nn
    public final void LIZ(AnchorPrivilegeItem anchorPrivilegeItem, AnchorPrivilegeItem anchorPrivilegeItem2, String str) {
        if (anchorPrivilegeItem != null) {
            getAnchorPrivilegeFirstFromXml().LIZIZ(anchorPrivilegeItem, false, null, null);
        }
        if (anchorPrivilegeItem2 != null) {
            getAnchorPrivilegeSecondFromXml().LIZIZ(anchorPrivilegeItem2, false, null, null);
            if (anchorPrivilegeItem != null) {
                C12ES.LJIILL(0, getAnchorPrivilegeDivFromXml());
            }
        }
        if (str != null && !a0.LJJJIL(str)) {
            this.LLJJJ = str;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
