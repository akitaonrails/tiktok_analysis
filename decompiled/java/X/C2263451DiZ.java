package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DiZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263451DiZ extends AbstractC1114210f6J {
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public int LLJILJIL;

    @Override // X.AbstractC1114210f6J
    public View getLabelEnd() {
        return (View) this.LLJI.getValue();
    }

    @Override // X.AbstractC1114210f6J
    public View getLabelStart() {
        return (View) this.LLJIJIL.getValue();
    }

    @Override // X.AbstractC1114210f6J
    public View getName() {
        return (View) this.LLJ.getValue();
    }

    @Override // X.AbstractC1114210f6J
    public int getGap() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1114210f6J
    public void setGap(int i) {
        this.LLJILJIL = i;
    }

    public C2263451DiZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 190));
        this.LLJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 188));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 189));
        this.LLJILJIL = (int) C497740JfY.LIZIZ(2.0f);
    }
}
