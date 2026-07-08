package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0R3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689700R3o extends ViewOutlineProvider {
    public final int $t;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
                getOutline$0(this, view, outline);
                break;
            case 1:
                getOutline$1(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C689700R3o(int i) {
        this.$t = i;
    }

    public static final void getOutline$0(C689700R3o c689700R3o, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C418440Gaw.LIZIZ(10));
    }

    public static final void getOutline$1(C689700R3o c689700R3o, View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + 8, 8.0f);
    }
}
