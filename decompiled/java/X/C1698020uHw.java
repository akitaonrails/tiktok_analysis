package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0uHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698020uHw extends ViewOutlineProvider {
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

    public C1698020uHw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void getOutline$0(C1698020uHw c1698020uHw, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C1662870tNF) c1698020uHw.l0).getRoundRadiusForIcon());
    }

    public static final void getOutline$1(C1698020uHw c1698020uHw, View view, Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C1662860tNE) c1698020uHw.l0).getRoundRadiusForIcon());
    }

    public static final void getOutline$2(C1698020uHw c1698020uHw, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C1662860tNE) c1698020uHw.l0).getRoundRadiusForIcon());
    }
}
