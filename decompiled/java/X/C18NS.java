package X;

import Y.ARunnableS85S0200000_16;
import android.animation.Animator;
import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18NS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NS extends AbstractC21274918Nn {
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
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxIconView LLJJ;
    public SmartImageView LLJJI;
    public SmartImageView LLJJIII;
    public FrameLayout LLJJIJI;
    public String LLJJIJIIJIL;
    public Boolean LLJJIJIL;
    public Animator LLJJJ;
    public Boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public C18QL LLJJJJJIL;

    private final C18QK getAnchorViewHolder() {
        return (C18QK) this.LLJJJJ.getValue();
    }

    public final SmartImageView getAnchorBubbleImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azi);
            this.LLJJI = (SmartImageView) callbackFindViewById;
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

    public final TuxIconView getAnchorIconMoreFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azz);
            this.LLJILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final FrameLayout getAnchorImgContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b01);
            this.LLJJIJI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxIconView getAnchorImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b00);
            this.LLJJ = (TuxIconView) callbackFindViewById;
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
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1r);
            this.LLJJIII = (SmartImageView) callbackFindViewById;
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
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b2e);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
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
            Animator animator = this.LLJJJ;
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
        if (C770702zh.LIZIZ(getAnchorPrivilegeFirstFromXml().getPrivilegeText$ecommerce_video_release()) || C770702zh.LIZIZ(getAnchorPrivilegeSecondFromXml().getPrivilegeText$ecommerce_video_release())) {
            setPivotX(0.0f);
            setPivotY(getHeight());
            ConstraintLayout anchorPromotionFlowFromXml = getAnchorPromotionFlowFromXml();
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(anchorPromotionFlowFromXml, new ARunnableS85S0200000_16(anchorPromotionFlowFromXml, this, 78));
        }
    }

    public final void LJ() {
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

    public final String getPromotionStyleInfo() {
        return this.LLJJIJIIJIL;
    }

    public C18NS(Context context) {
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2;
        boolean z;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        super(context, null);
        this.LLJJIJIL = Boolean.FALSE;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        if (((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).anchorInflaterOptEnable() && C1388190mED.LIZ(context) != null) {
            C20673215v0.LIZLLL(R.layout.akk, C1388190mED.LIZ(context), this, true);
        } else {
            FrameLayout.inflate(context, R.layout.akk, this);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = ICommonFeedDependService.class.getName();
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).tryAnchorChangeBackgroundWithRadiusV2(findViewById(R.id.azo), 4);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2 = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2 != null) {
                z = true;
            } else {
                z = false;
            }
            C1AQS.LIZJ(jElapsedRealtime3, 1, IAnchorDependencyService.class.getName(), anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2.getClass().getName() : null, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        ((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2).tryAnchorInflaterOptRecycleEnable(getAnchorContentFromXml(), R.layout.akk, new AwS576S0100000_32(this, 897));
        ConstraintLayout anchorContentFromXml = getAnchorContentFromXml();
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        Context context2 = getContext();
        anchorBizUtils.getClass();
        anchorContentFromXml.setMaxWidth(AnchorBizUtils.LJIIIZ(context2));
        this.LLJJJIL = Boolean.TRUE;
        this.LLJJJJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS576S0100000_32(this, 899));
    }

    public final void setAnchorBubbleImgFromXml(SmartImageView smartImageView) {
        this.LLJJI = smartImageView;
    }

    public final void setAnchorContentFromXml(ConstraintLayout constraintLayout) {
        this.LLILLJJLI = constraintLayout;
    }

    public final void setAnchorDescFromXml(LinearLayout linearLayout) {
        this.LLJILJIL = linearLayout;
    }

    public final void setAnchorIconMoreFromXml(TuxIconView tuxIconView) {
        this.LLJILLL = tuxIconView;
    }

    public final void setAnchorImgContainerFromXml(FrameLayout frameLayout) {
        this.LLJJIJI = frameLayout;
    }

    public final void setAnchorImgFromXml(TuxIconView tuxIconView) {
        this.LLJJ = tuxIconView;
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
        this.LLJJIII = smartImageView;
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
        this.LLJILJILJ = tuxTextView;
    }

    public final void setAnchorTitleDivFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setAnchorTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setImageCoverUrlLoaded(Boolean bool) {
        this.LLJJIJIL = bool;
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
        this.LLJJJIL = Boolean.valueOf(!Intrinsics.LJFF(bool, Boolean.FALSE));
    }

    public final void setPromotionStyleInfo(String str) {
        this.LLJJIJIIJIL = str;
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
            TuxTextView anchorSuffixFromXml = getAnchorSuffixFromXml();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" (");
            sbLIZ.append(i);
            sbLIZ.append(')');
            anchorSuffixFromXml.setText(C2188811AlT.LIZIZ(sbLIZ));
            C12ES.LJIILL(0, getAnchorSuffixFromXml());
            C12ES.LJIILL(0, getAnchorIconMoreFromXml());
        }
    }

    @Override // X.AbstractC21274918Nn
    public final void LIZIZ(CharSequence charSequence, CharSequence charSequence2) {
        C12ES.LJIILL(0, getAnchorDescFromXml());
        if (charSequence != null) {
            getAnchorTitleFromXml().setText(charSequence);
        }
        setPreTitle(charSequence2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout r7 = r8.getAnchorContentFromXml()
            boolean r0 = defpackage.t1.LIZ()
            r3 = 0
            if (r0 == 0) goto L7e
            android.widget.FrameLayout r0 = r8.getAnchorImgContainerFromXml()
            if (r0 == 0) goto L89
            int r6 = r0.getMeasuredWidth()
        L15:
            android.widget.LinearLayout r5 = r8.getAnchorDescFromXml()
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r1 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            android.content.Context r0 = r8.getContext()
            r1.getClass()
            int r4 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJIIIZ(r0)
            int r2 = r7.getPaddingStart()
            int r0 = r7.getPaddingEnd()
            int r2 = r2 + r0
            int r2 = r2 + r6
            if (r5 == 0) goto L7c
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L7c
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginStart()
        L40:
            int r2 = r2 + r0
            if (r5 == 0) goto L7a
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L7a
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.getMarginEnd()
        L51:
            int r2 = r2 + r0
            int r4 = r4 - r2
            X.18QL r0 = r8.LLJJJJJIL
            if (r0 != 0) goto L62
            X.18QL r1 = new X.18QL
            X.18QK r0 = r8.getAnchorViewHolder()
            r1.<init>(r0)
            r8.LLJJJJJIL = r1
        L62:
            X.18QL r2 = r8.LLJJJJJIL
            if (r2 == 0) goto L76
            if (r4 < 0) goto L69
            r3 = r4
        L69:
            java.lang.Boolean r1 = r8.LLJJJIL
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            r2.LIZ(r3, r0)
        L76:
            super.onMeasure(r9, r10)
            return
        L7a:
            r0 = 0
            goto L51
        L7c:
            r0 = 0
            goto L40
        L7e:
            com.bytedance.tux.icon.TuxIconView r0 = r8.getAnchorImgFromXml()
            if (r0 == 0) goto L89
            int r6 = r0.getMeasuredWidth()
            goto L15
        L89:
            r6 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18NS.onMeasure(int, int):void");
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
            this.LLJJIJIIJIL = str;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
