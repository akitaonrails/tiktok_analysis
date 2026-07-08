package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0GZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417770GZr extends ViewOutlineProvider {
    public final /* synthetic */ Integer LIZ;
    public final /* synthetic */ Integer LIZIZ;

    public C417770GZr(Integer num, Integer num2) {
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
