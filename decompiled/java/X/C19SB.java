package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19SB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19SB extends View {
    public C19SA LL;

    public C19SB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abstract /* synthetic */ ArrayList<C807880Vmc> getCurrentLyrics();

    public final C19SA getConfig() {
        return this.LL;
    }

    public C19SA getDisplayConfig() {
        return this.LL;
    }

    public final void setConfig(C19SA c19sa) {
        this.LL = c19sa;
    }

    public C19SB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.LL = new C19SA();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C19SA c19sa = this.LL;
        if (c19sa.LIZ == 0.0f) {
            c19sa.LIZ = i - c19sa.LJFF.measureText("   ");
        }
        C19SA c19sa2 = this.LL;
        if (c19sa2.LIZ <= 0.0f) {
            float f = C19SA.LJIIIZ;
            c19sa2.LIZ = C19SA.LJIIIZ;
        }
    }
}
