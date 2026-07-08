package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0zgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1905450zgV extends ViewOutlineProvider {
    public float LIZ;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), Math.min((Math.min(view.getWidth(), view.getHeight()) / 2) + 1, this.LIZ));
    }
}
