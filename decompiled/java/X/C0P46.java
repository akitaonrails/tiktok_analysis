package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0P46, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P46 extends ViewOutlineProvider {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
                getOutline$0(this, view, outline);
                break;
            case 1:
                getOutline$1(this, view, outline);
                break;
            case 2:
                getOutline$2(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C0P46(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void getOutline$0(C0P46 c0p46, View view, Outline outline) {
        C0OV6 c0ov6 = ((C623660OdA) c0p46.l0).LIZJ;
        if (c0ov6 == null) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C626640Ohy.LJFF(new float[]{c0ov6.LIZIZ, c0ov6.LIZLLL, c0ov6.LIZJ}, c0ov6.LIZ));
    }

    public static final void getOutline$1(C0P46 c0p46, View view, Outline outline) {
        C0OV6 c0ov6 = ((C623650Od9) c0p46.l0).LJII;
        if (c0ov6 == null) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C626640Ohy.LJFF(new float[]{c0ov6.LIZIZ, c0ov6.LIZLLL, c0ov6.LIZJ}, c0ov6.LIZ));
    }

    public static final void getOutline$2(C0P46 c0p46, View view, Outline outline) {
        C0OV6 c0ov6 = ((C0OVB) c0p46.l0).LJIIL;
        if (c0ov6 == null) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C626640Ohy.LJFF(new float[]{c0ov6.LIZIZ, c0ov6.LIZLLL, c0ov6.LIZJ}, c0ov6.LIZ));
    }
}
