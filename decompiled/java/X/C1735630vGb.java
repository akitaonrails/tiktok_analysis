package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.saas.ECLiveDependencyService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735630vGb extends FrameLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;

    public C1735630vGb(Context context) {
        this(context, null, 6);
    }

    public C1735630vGb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        setPrivilegeStar(false);
        setPrivilegeText(null);
    }

    public final TuxIconView getAnchorPrivilegeStarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1o);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getAnchorPrivilegeTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.b1p);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final String getPrivilegeText$ecommerce_video_release() {
        CharSequence text = getAnchorPrivilegeTextFromXml().getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TuxTextView getPrivilegeTextView$ecommerce_video_release() {
        return getAnchorPrivilegeTextFromXml();
    }

    private final void setPrivilegeStar(boolean z) {
        if (z) {
            C12ES.LJIILL(0, getAnchorPrivilegeStarFromXml());
        } else {
            C0H1U.LIZIZ(getAnchorPrivilegeStarFromXml());
        }
    }

    private final void setPrivilegeText(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            getAnchorPrivilegeTextFromXml().setText(charSequence);
            C12ES.LJIILL(0, getAnchorPrivilegeTextFromXml());
        } else {
            C0H1U.LIZIZ(getAnchorPrivilegeTextFromXml());
            C0H1U.LIZIZ(getAnchorPrivilegeStarFromXml());
            C0H1U.LIZIZ(this);
        }
    }

    public final void setAnchorPrivilegeStarFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setAnchorPrivilegeTextFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C1735630vGb(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ako, this, true);
    }

    public final void LIZIZ(AnchorPrivilegeItem anchorPrivilegeItem, boolean z, Integer num, Integer num2) {
        CharSequence optShowText;
        AnonymousClass0317 anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin;
        boolean z2;
        String name = null;
        if (z) {
            String optShowText2 = anchorPrivilegeItem.getOptShowText();
            if (optShowText2 != null) {
                optShowText = C1735020vFc.LIZLLL(C1735020vFc.LIZ, optShowText2, anchorPrivilegeItem.getBoldedText());
            } else {
                optShowText = null;
            }
        } else {
            optShowText = anchorPrivilegeItem.getOptShowText();
        }
        setPrivilegeText(optShowText);
        Integer itemType = anchorPrivilegeItem.getItemType();
        if (itemType != null && itemType.intValue() == 2) {
            Integer sellingItemType = anchorPrivilegeItem.getSellingItemType();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin = ECLiveDependencyService.createIECLiveDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IECLiveDependencyService.class.getName();
                if (anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECLiveDependencyService.class);
            }
            int sellingItemTypeRate = ((IECLiveDependencyService) anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin).getSellingItemTypeRate();
            if (sellingItemType != null && sellingItemType.intValue() == sellingItemTypeRate) {
                setPrivilegeStar(true);
            } else {
                setPrivilegeStar(false);
            }
        }
        if (num2 != null) {
            getAnchorPrivilegeTextFromXml().setTuxFont(num2.intValue());
        }
        if (num != null) {
            int iIntValue = num.intValue();
            getAnchorPrivilegeTextFromXml().setTextColorRes(iIntValue);
            getAnchorPrivilegeStarFromXml().setTintColorRes(iIntValue);
        }
    }
}
