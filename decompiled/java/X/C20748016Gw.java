package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.16Gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748016Gw extends ViewOutlineProvider {
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

    public C20748016Gw(int i) {
        this.$t = i;
    }

    public static final void getOutline$1(C20748016Gw c20748016Gw, View view, Outline outline) {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
