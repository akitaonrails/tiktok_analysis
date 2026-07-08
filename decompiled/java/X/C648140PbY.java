package X;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.view.View;
import com.ss.android.ugc.aweme.search.lynx.core.ui.viewholder.DynamicViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648140PbY implements InterfaceC648220Pbg {
    public final C648160Pba LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 920));
    public final int LLILLL = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 4, Resources.getSystem().getDisplayMetrics()));

    @Override // X.InterfaceC648220Pbg
    public final void LIZ() {
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZJ() {
    }

    public final DynamicViewHolder LIZLLL() {
        return (DynamicViewHolder) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC648220Pbg
    public final void bind() {
        GradientDrawable gradientDrawable;
        Integer numLIZJ;
        if (this.LL.LJIIL.LIZ().booleanValue() && C650240Pew.LIZ()) {
            boolean zBooleanValue = this.LL.LJIILIIL.LIZ().booleanValue();
            C659720PuE.LIZ.getClass();
            if (!C659720PuE.LIZ()) {
                if (zBooleanValue) {
                    View view = LIZLLL().itemView;
                    int i = this.LLILLL;
                    view.setPadding(i, i, i / 2, 0);
                } else {
                    View view2 = LIZLLL().itemView;
                    int i2 = this.LLILLL;
                    view2.setPadding(i2 / 2, i2, i2, 0);
                }
            }
            boolean zBooleanValue2 = this.LL.LJIILIIL.LIZ().booleanValue();
            C650240Pew.LIZ.getClass();
            int i3 = C650240Pew.LIZJ;
            float fLIZ = C1839807Im.LIZ();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, LIZLLL().itemView.getContext());
            GradientDrawable gradientDrawable2 = null;
            if (numLIZJ2 != null) {
                int iIntValue = numLIZJ2.intValue();
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iIntValue);
            } else {
                gradientDrawable = null;
            }
            if (C07GI.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.ok, LIZLLL().itemView.getContext())) != null) {
                int iIntValue2 = numLIZJ.intValue();
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(iIntValue2);
                }
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ol, LIZLLL().itemView.getContext());
            if (numLIZJ3 != null) {
                int iIntValue3 = numLIZJ3.intValue();
                gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(iIntValue3);
                gradientDrawable2.setCornerRadius(fLIZ);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
            if (!C659720PuE.LIZ()) {
                if (zBooleanValue2) {
                    layerDrawable.setLayerInsetStart(1, i3);
                    layerDrawable.setLayerInsetEnd(1, i3 / 2);
                } else {
                    layerDrawable.setLayerInsetStart(1, i3 / 2);
                    layerDrawable.setLayerInsetEnd(1, i3);
                }
                layerDrawable.setLayerInsetTop(1, i3);
            }
            LIZLLL().itemView.setBackground(layerDrawable);
        }
    }

    public C648140PbY(C648160Pba c648160Pba) {
        this.LL = c648160Pba;
    }
}
