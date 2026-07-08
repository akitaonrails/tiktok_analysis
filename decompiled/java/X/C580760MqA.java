package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0MqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580760MqA extends ViewOutlineProvider {
    public final int $t;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
                outline.setRect(0, 0, 0, 0);
                break;
            case 1:
                getOutline$1(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C580760MqA(int i) {
        this.$t = i;
    }

    public static final void getOutline$1(C580760MqA c580760MqA, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(12));
    }
}
