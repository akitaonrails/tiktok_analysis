package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0R3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689710R3p extends ViewOutlineProvider {
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

    public C689710R3p(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void getOutline$0(C689710R3p c689710R3p, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(8.0f, ((C676190Qfh) c689710R3p.l0).getContext()));
    }

    public static final void getOutline$1(C689710R3p c689710R3p, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(4.0f, ((C676190Qfh) c689710R3p.l0).getContext()));
    }

    public static final void getOutline$2(C689710R3p c689710R3p, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C12ES.LIZJ(2.0f, ((C658530PsJ) c689710R3p.l0).getContext()));
    }
}
