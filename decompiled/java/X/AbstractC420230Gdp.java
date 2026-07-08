package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC420230Gdp implements InterfaceC1657550tEf {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1147));

    public final void LIZIZ(boolean z) {
        Drawable drawable;
        View itemView = getItemView();
        if (z) {
            drawable = (Drawable) this.LIZ.getValue();
        } else {
            drawable = null;
        }
        itemView.setBackground(drawable);
    }
}
