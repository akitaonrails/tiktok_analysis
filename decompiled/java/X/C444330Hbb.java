package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Hbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444330Hbb extends AbstractC444320Hba implements InterfaceC19717212Ck {
    public boolean LLJILLL;
    public final float LLJJ;

    @Override // X.AbstractC444320Hba
    public int getDotIndicatorBackground() {
        return this.LLJILLL ? R.drawable.ab0 : R.drawable.aaz;
    }

    @Override // X.AbstractC444320Hba
    public int getDotIndicatorSelectedBackground() {
        return this.LLJILLL ? R.drawable.aay : R.drawable.aax;
    }

    @Override // X.InterfaceC19717212Ck
    public final void hide() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    @Override // X.InterfaceC19717212Ck
    public final void show() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    @Override // X.AbstractC444320Hba
    public float getDotIndicatorBackgroundAlpha() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC19717212Ck
    public final void LIZ(int i) {
        setSelectedIndex(i);
    }

    public final void setLightBgMode(boolean z) {
        this.LLJILLL = z;
    }

    public C444330Hbb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJ = 0.16f;
    }
}
