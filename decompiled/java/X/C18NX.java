package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18NX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NX extends AbstractC21274918Nn {
    public LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public SmartImageView LLIZ;

    @Override // X.AbstractC21274918Nn
    public void setSuffix(int i) {
    }

    public final SmartImageView getAnchorBubbleImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azi);
            this.LLIZ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final LinearLayout getAnchorContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.azo);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getAnchorImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b00);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
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

    public final TuxTextView getAnchorTitleDivFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b32);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getAnchorTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b31);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.AbstractC21274918Nn
    public SmartImageView getBubbleIconView() {
        return getAnchorBubbleImgFromXml();
    }

    @Override // X.AbstractC21274918Nn
    public TuxIconView getIconView() {
        return getAnchorImgFromXml();
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

    public C18NX(Context context) {
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2;
        boolean z;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        super(context, null);
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
            C20673215v0.LIZLLL(R.layout.akl, C1388190mED.LIZ(context), this, true);
        } else {
            FrameLayout.inflate(context, R.layout.akl, this);
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
        ((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin2).tryAnchorInflaterOptRecycleEnable(getAnchorContentFromXml(), R.layout.akl, new AwS576S0100000_32(this, 900));
    }

    public final void setAnchorBubbleImgFromXml(SmartImageView smartImageView) {
        this.LLIZ = smartImageView;
    }

    public final void setAnchorContentFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setAnchorImgFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setAnchorPreTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setAnchorTitleDivFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setAnchorTitleFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    @Override // X.AbstractC21274918Nn
    public void setPreTitle(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            getAnchorPreTitleFromXml().setText(charSequence);
            C03DZ.LIZJ(getAnchorPreTitleFromXml());
            C03DZ.LIZJ(getAnchorTitleDivFromXml());
        }
    }

    @Override // X.AbstractC21274918Nn
    public final void LIZIZ(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null) {
            getAnchorTitleFromXml().setText(charSequence);
        }
        setPreTitle(charSequence2);
    }
}
