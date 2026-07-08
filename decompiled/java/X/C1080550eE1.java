package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eE1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080550eE1 extends AbstractC1080560eE2 {
    public final int LJIIL;

    @Override // X.AbstractC1080560eE2
    public final int LIZ() {
        return C1152540g68.LJIIIIZZ(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementContext
    public final boolean isAnchor() {
        return false;
    }

    public C1080550eE1(Context context, ViewGroup viewGroup, DataChannel dataChannel, BaseLayeredElementManager<C1080550eE1> baseLayeredElementManager) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super(context, viewGroup, dataChannel, baseLayeredElementManager);
        ViewGroup.LayoutParams layoutParams = viewGroup.findViewById(R.id.cci).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i2 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.findViewById(R.id.cdt).getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams2.bottomMargin;
        }
        this.LJIIL = i + i2;
    }
}
