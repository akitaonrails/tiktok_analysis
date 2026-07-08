package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;

/* JADX INFO: renamed from: X.18Nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21274918Nn extends FrameLayout {
    public static final /* synthetic */ int LL = 0;

    public void LIZ(AnchorPrivilegeItem anchorPrivilegeItem, AnchorPrivilegeItem anchorPrivilegeItem2, String str) {
    }

    public abstract void LIZIZ(CharSequence charSequence, CharSequence charSequence2);

    public SmartImageView getBubbleIconView() {
        return null;
    }

    public abstract TuxIconView getIconView();

    public String getPromotionInfo() {
        return null;
    }

    public void setPreTitle(CharSequence charSequence) {
    }

    public void setSuffix(int i) {
    }

    public AbstractC21274918Nn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
