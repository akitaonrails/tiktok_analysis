package X;

import android.os.Build;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.AwS0S0001001_5;

/* JADX INFO: renamed from: X.0FM1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FM1 extends C0FM2<C385340F8y> implements C0F50 {
    public final C385340F8y LJI;
    public final C1664680tQA<TextStickerModel> LJII;

    @Override // X.C0F50
    public final void LIZ() {
        this.LIZIZ.LIZ(this.LIZ);
    }

    @Override // X.C0F50
    public final void LIZIZ() {
        C0FM0 c0fm0 = this.LIZIZ;
        float progress = c0fm0.LIZ.getProgress();
        float min = Build.VERSION.SDK_INT >= 26 ? c0fm0.LIZ.getMin() : 0;
        float max = c0fm0.LIZ.getMax();
        float f = c0fm0.LIZLLL;
        float f2 = c0fm0.LJ;
        if (progress > min) {
            f = progress >= max ? f2 : ((f * (max - progress)) + (f2 * (progress - min))) / (max - min);
        }
        if (LIZLLL() / LIZJ() != f) {
            LJI(LIZJ() * f);
        }
    }

    @Override // X.C0FM2
    public final float LIZJ() {
        return this.LJI.getDefaultTextSize();
    }

    @Override // X.C0FM2
    public final float LIZLLL() {
        return this.LJII.LIZ.getFontModel().fontSize;
    }

    @Override // X.C0FM2
    public final void LJ() {
        super.LJ();
        this.LJI.setFontTypeChangedListener(this);
    }

    @Override // X.C0FM2
    public final void LJFF() {
        super.LJFF();
        this.LJI.setFontTypeChangedListener(null);
    }

    @Override // X.C0FM2
    public final void LJI(float f) {
        int iLIZIZ = C814420VxA.LIZIZ(f);
        if (iLIZIZ != this.LJII.LIZ.getFontModel().fontSize) {
            this.LJII.LIZLLL(new AwS0S0001001_5(iLIZIZ, this.LJII.LIZ.getLineSpacingExtra(), 1), true);
        }
    }

    public C0FM1(C385340F8y c385340F8y, C0FM0 c0fm0, C0FM3 c0fm3, C1664680tQA c1664680tQA) {
        super(c385340F8y, c0fm0, c0fm3);
        this.LJI = c385340F8y;
        this.LJII = c1664680tQA;
    }
}
