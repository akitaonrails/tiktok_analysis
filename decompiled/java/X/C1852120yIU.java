package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0yIU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852120yIU extends FrameLayout {
    public final TuxAlertBadgeLayout LL;
    public final TuxIconView LLILLJJLI;
    public EnumC1852100yIS LLILLL;

    public final EnumC1852100yIS getCurrentViewState() {
        return this.LLILLL;
    }

    public final void LIZ(EnumC1852100yIS enumC1852100yIS) {
        TuxAlertBadgeLayout tuxAlertBadgeLayout;
        if (enumC1852100yIS == getCurrentViewState()) {
            return;
        }
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            int i = C1852110yIT.LIZ[enumC1852100yIS.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new C1954807lC();
                    }
                    c419910GdJ.LIZ = R.raw.icon_image_square;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                } else {
                    c419910GdJ.LIZ = R.raw.icon_image_square;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                }
            } else {
                c419910GdJ.LIZ = R.raw.icon_x_mark_circle;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            }
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        if (enumC1852100yIS == EnumC1852100yIS.PHOTO_PICKER_PANEL_FORBIDDEN) {
            TuxAlertBadgeLayout tuxAlertBadgeLayout2 = this.LL;
            if (tuxAlertBadgeLayout2 != null) {
                tuxAlertBadgeLayout2.LIZIZ();
            }
        } else {
            C1860520yW2.LIZ.getClass();
            if (!C1860520yW2.LJIIL().getBoolean("has_showed_tako_photo_picker_entrance_badge", false) && (tuxAlertBadgeLayout = this.LL) != null) {
                tuxAlertBadgeLayout.LIZJ();
            }
        }
        this.LLILLL = enumC1852100yIS;
    }

    public C1852120yIU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = EnumC1852100yIS.PHOTO_PICKER_PANEL_CLOSE;
        C786410Ut5.Sd(R.layout.fpu, C786410Ut5.ne(context), this);
        TuxAlertBadgeLayout tuxAlertBadgeLayout = (TuxAlertBadgeLayout) findViewById(R.id.xao);
        tuxAlertBadgeLayout.LIZIZ();
        this.LL = tuxAlertBadgeLayout;
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.xav);
    }
}
