package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.15AP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15AP extends ViewOutlineProvider {
    public final /* synthetic */ Integer LIZ;
    public final /* synthetic */ Integer LIZIZ;

    public C15AP(Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width;
        int height;
        Integer num = this.LIZ;
        if (num != null) {
            width = num.intValue();
        } else {
            width = view.getWidth();
        }
        Integer num2 = this.LIZIZ;
        if (num2 != null) {
            height = num2.intValue();
        } else {
            height = view.getHeight();
        }
        outline.setOval(0, 0, width, height);
    }
}
