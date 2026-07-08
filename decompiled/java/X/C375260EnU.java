package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375260EnU {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(NLEModel nLEModel) {
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.setModel(nLEModel);
        nLEEditorLIZ.commit();
        nLEEditorLIZ.done();
        return nLEEditorLIZ.store();
    }

    public static Pair LIZ(float f, float f2, float f3) {
        float f4 = f2 / f3;
        Float fValueOf = Float.valueOf(1280.0f);
        Float fValueOf2 = Float.valueOf(720.0f);
        if (f4 > f) {
            float f5 = f * f3;
            if (Math.abs(f5) <= Float.MAX_VALUE && Math.abs(f3) <= Float.MAX_VALUE) {
                return new Pair(Float.valueOf(f5), Float.valueOf(f3));
            }
            return new Pair(fValueOf2, fValueOf);
        }
        float f6 = f2 / f;
        if (Math.abs(f2) <= Float.MAX_VALUE && Math.abs(f6) <= Float.MAX_VALUE) {
            return new Pair(Float.valueOf(f2), Float.valueOf(f6));
        }
        return new Pair(fValueOf2, fValueOf);
    }

    public static void LJ(NLETrackSlot nLETrackSlot, float f, float f2) {
        EnumC356070Dxd enumC356070Dxd = EnumC356070Dxd.NONE;
        nLETrackSlot.setTransformX(nLETrackSlot.getTransformX() + f);
        nLETrackSlot.setTransformY(nLETrackSlot.getTransformY() + f2);
        int[] iArr = C350940DpM.LIZ;
        enumC356070Dxd.ordinal();
    }

    public static void LIZLLL(NLETrackSlot nLETrackSlot, float f, float f2, float f3) {
        EnumC356070Dxd enumC356070Dxd = EnumC356070Dxd.NONE;
        nLETrackSlot.setTransformX(nLETrackSlot.getTransformX() + f);
        nLETrackSlot.setTransformY(nLETrackSlot.getTransformY() + f2);
        nLETrackSlot.setScale(nLETrackSlot.getScale() * f3);
        int[] iArr = C350940DpM.LIZ;
        enumC356070Dxd.ordinal();
    }

    public static C375170EnL LIZIZ(InterfaceC375350End interfaceC375350End, NLETrackSlot nLETrackSlot, Float f, Pair pair, Integer num, Integer num2) {
        float transformX;
        float transformY;
        float rotation;
        if (nLETrackSlot != null && f != null && pair != null && num != null && num2 != null) {
            float fFloatValue = ((Number) pair.getFirst()).floatValue();
            float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
            if (interfaceC375350End.LJIIJJI() == EnumC375280EnW.RIGHT) {
                transformX = nLETrackSlot.getTransformX();
            } else {
                transformX = -nLETrackSlot.getTransformX();
            }
            if (interfaceC375350End.LJIILL() == EnumC375290EnX.DOWN) {
                transformY = nLETrackSlot.getTransformY();
            } else {
                transformY = -nLETrackSlot.getTransformY();
            }
            interfaceC375350End.LJIJ();
            float fIntValue = ((fFloatValue * transformX) / 1.0f) + (num.intValue() * 0.5f);
            interfaceC375350End.LJIJ();
            float fIntValue2 = ((fFloatValue2 * transformY) / 1.0f) + (num2.intValue() * 0.5f);
            Pair<Float, Float> pairLJFF = interfaceC375350End.LJFF(nLETrackSlot);
            if (interfaceC375350End.LJIIL() == C00B8.ANTICLOCKWISE) {
                rotation = -nLETrackSlot.getRotation();
            } else {
                rotation = nLETrackSlot.getRotation();
            }
            return new C375170EnL(((int) pairLJFF.getFirst().floatValue()) * nLETrackSlot.getScale(), ((int) pairLJFF.getSecond().floatValue()) * nLETrackSlot.getScale(), fIntValue, fIntValue2, (int) rotation);
        }
        return null;
    }
}
