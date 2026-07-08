package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375080EnC extends AbstractC375270EnV implements InterfaceC379610EuV {
    public final C1DRG LLIZLLLIL;
    public final C375140EnI LLJ;

    @Override // X.InterfaceC375340Enc
    public final void LJIJ() {
    }

    public final C363110ELl LJJ() {
        EnumC375190EnN cropMode;
        C375140EnI c375140EnI = this.LLJ;
        C389830FQf c389830FQf = c375140EnI.LLJILJIL;
        if (c389830FQf == null || (cropMode = c389830FQf.getCropMode()) == null) {
            cropMode = EnumC375190EnN.FREE;
        }
        NLETrackSlot nLETrackSlot = c375140EnI.LLJI;
        if (nLETrackSlot == null) {
            return new C363110ELl(null, cropMode.ordinal());
        }
        int iIntValue = c375140EnI.LLJIJIL.getFirst().intValue();
        int iIntValue2 = c375140EnI.LLJIJIL.getSecond().intValue();
        float[] fArr = new float[8];
        C389830FQf c389830FQf2 = c375140EnI.LLJILJIL;
        if (c389830FQf2 == null) {
            return new C363110ELl(null, cropMode.ordinal());
        }
        Rect rect = c389830FQf2.getRect();
        if (c375140EnI.LLJJIJI.width() <= 0 || c375140EnI.LLJJIJI.height() <= 0) {
            return new C363110ELl(null, cropMode.ordinal());
        }
        float f = iIntValue;
        float f2 = iIntValue2;
        Pair pairLIZ = C375260EnU.LIZ(c375140EnI.LLJJIJI.width() / c375140EnI.LLJJIJI.height(), f, f2);
        float f3 = 2;
        int iFloatValue = (int) ((f - ((Number) pairLIZ.getFirst()).floatValue()) / f3);
        int iFloatValue2 = (int) ((f2 - ((Number) pairLIZ.getSecond()).floatValue()) / f3);
        Rect rect2 = new Rect(iFloatValue, iFloatValue2, ((int) ((Number) pairLIZ.getFirst()).floatValue()) + iFloatValue, ((int) ((Number) pairLIZ.getSecond()).floatValue()) + iFloatValue2);
        Matrix matrix = new Matrix();
        matrix.postScale(nLETrackSlot.getScale(), nLETrackSlot.getScale(), rect2.width() / 2.0f, rect2.height() / 2.0f);
        matrix.postTranslate(nLETrackSlot.getTransformX() * f, nLETrackSlot.getTransformY() * f2);
        float[] fArr2 = new float[8];
        int i = rect.left;
        int i2 = rect2.left;
        float f4 = i - i2;
        int i3 = rect.top;
        int i4 = rect2.top;
        float f5 = i3 - i4;
        float f6 = rect.right - i2;
        float f7 = rect.bottom - i4;
        float[] fArr3 = {f4, f5, f6, f5, f4, f7, f6, f7};
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr2, fArr3);
        fArr[0] = fArr2[0] / ((Number) pairLIZ.getFirst()).floatValue();
        fArr[1] = fArr2[1] / ((Number) pairLIZ.getSecond()).floatValue();
        fArr[2] = fArr2[2] / ((Number) pairLIZ.getFirst()).floatValue();
        fArr[3] = fArr2[3] / ((Number) pairLIZ.getSecond()).floatValue();
        fArr[4] = fArr2[4] / ((Number) pairLIZ.getFirst()).floatValue();
        fArr[5] = fArr2[5] / ((Number) pairLIZ.getSecond()).floatValue();
        fArr[6] = fArr2[6] / ((Number) pairLIZ.getFirst()).floatValue();
        fArr[7] = fArr2[7] / ((Number) pairLIZ.getSecond()).floatValue();
        int i5 = 0;
        do {
            float f8 = fArr[i5];
            if (f8 < 0.0f) {
                fArr[i5] = 0.0f;
            } else if (f8 > 1.0f) {
                fArr[i5] = 1.0f;
            }
            i5++;
        } while (i5 < 8);
        return new C363110ELl(new C355010Dvv(new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7]), nLETrackSlot.getScale(), nLETrackSlot.getTransformX(), nLETrackSlot.getTransformY(), nLETrackSlot.getRotation(), c389830FQf2.LIZJ(c389830FQf2.LLJJIII)), c389830FQf2.getCropMode().ordinal());
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZLLLIL;
    }

    public C375080EnC(C1DRG c1drg) {
        this.LLIZLLLIL = c1drg;
        this.LLJ = new C375140EnI(c1drg);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    @Override // X.InterfaceC375350End
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Float, java.lang.Float> LJFF(com.bytedance.ies.nle.editor_jni.NLETrackSlot r9) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375080EnC.LJFF(com.bytedance.ies.nle.editor_jni.NLETrackSlot):kotlin.Pair");
    }

    public final void LJIL(EnumC375190EnN enumC375190EnN) {
        C375140EnI c375140EnI = this.LLJ;
        if (c375140EnI.LLJJJ != enumC375190EnN && enumC375190EnN != EnumC375190EnN.FREE) {
            C389830FQf c389830FQf = c375140EnI.LLJILJIL;
            if (c389830FQf != null) {
                c375140EnI.LJJ(c389830FQf.LIZIZ(c389830FQf.LIZJ(enumC375190EnN)), enumC375190EnN);
                return;
            }
            return;
        }
        c375140EnI.LLJJJ = enumC375190EnN;
        C389830FQf c389830FQf2 = c375140EnI.LLJILJIL;
        if (c389830FQf2 != null) {
            c389830FQf2.setCropMode(enumC375190EnN);
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ep_crop_free_mode_slot_update_switch", true, true)) {
            return;
        }
        c375140EnI.LJJIFFI();
    }

    @Override // X.InterfaceC375350End
    public final boolean LJI(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        if (nLETrack.getTrackType() == NLETrackType.VIDEO && !C351220Dpo.LLJJI(nLETrackSlot)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC375350End
    public final void LJIJJ(C19EG c19eg, C2260311DdV c2260311DdV) {
        this.LL = c19eg;
        this.LLILLJJLI = c2260311DdV;
        this.LLILZLL = this.LLJ;
    }
}
