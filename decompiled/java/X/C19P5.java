package X;

import Y.ARunnableS37S0201000_33;
import Y.ARunnableS44S0101000_33;
import com.bytedance.android.livesdk.widget.OptSeekbarChangeSetting;

/* JADX INFO: renamed from: X.19P5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19P5 implements C19P8 {
    public final /* synthetic */ C19P8 LIZ;
    public final /* synthetic */ C19P4 LIZIZ;

    @Override // X.C19P8
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // X.C19P8
    public final void onStart() {
        this.LIZ.onStart();
    }

    @Override // X.C19P8
    public final void LIZ(int i) {
        if (OptSeekbarChangeSetting.INSTANCE.enable()) {
            C786410Ut5.LJLIIL(100L, this.LIZIZ.LLLLILI, new ARunnableS44S0101000_33(i, this.LIZ, 7));
        } else {
            this.LIZ.LIZ(i);
        }
    }

    @Override // X.C19P8
    public final void LIZJ(int i) {
        if (OptSeekbarChangeSetting.INSTANCE.enable()) {
            C19P4 c19p4 = this.LIZIZ;
            c19p4.LLLLILI.removeCallbacks(c19p4.LLLLJI);
            C19P4 c19p42 = this.LIZIZ;
            ARunnableS37S0201000_33 aRunnableS37S0201000_33 = new ARunnableS37S0201000_33(this, i, this.LIZ, 4);
            c19p42.LLLLJI = aRunnableS37S0201000_33;
            C786410Ut5.LJLIIL(100L, c19p42.LLLLILI, aRunnableS37S0201000_33);
            return;
        }
        C19P4 c19p43 = this.LIZIZ;
        c19p43.LLLLILI.removeCallbacks(c19p43.LLLLJ);
        C19P4 c19p44 = this.LIZIZ;
        if (c19p44.LLLLIILL != null && i == c19p44.LLLIZZ) {
            C786410Ut5.LJLIIL(100L, c19p44.LLLLILI, c19p44.LLLLJ);
        }
        this.LIZ.LIZJ(i);
    }

    public C19P5(C19P4 c19p4, C19P8 c19p8) {
        this.LIZIZ = c19p4;
        this.LIZ = c19p8;
    }
}
