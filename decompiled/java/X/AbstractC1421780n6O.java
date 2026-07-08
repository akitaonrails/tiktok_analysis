package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelGroupLayout;

/* JADX INFO: renamed from: X.0n6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1421780n6O extends LinearLayout implements InterfaceC1421820n6S {
    public InterfaceC1421750n6L LL;

    public abstract /* synthetic */ void setData(IconLabelGroupLayout iconLabelGroupLayout);

    public final InterfaceC1421750n6L getActionListener() {
        return this.LL;
    }

    public final void setActionListener(InterfaceC1421750n6L interfaceC1421750n6L) {
        this.LL = interfaceC1421750n6L;
    }

    public void setListener(InterfaceC1421750n6L interfaceC1421750n6L) {
        this.LL = interfaceC1421750n6L;
    }

    public AbstractC1421780n6O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
