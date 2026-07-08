package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.ROTATE_DEGREE;

/* JADX INFO: renamed from: X.0Mfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574220Mfc extends C574170MfX {
    @Override // X.C574170MfX
    public final C574210Mfb LJJIJIIJIL() {
        C574210Mfb c574210MfbLJJIJIIJIL = super.LJJIJIIJIL();
        ListProtector.add(c574210MfbLJJIJIIJIL.LIZ, 0, new InterfaceC574240Mfe() { // from class: X.0MfZ
            @Override // X.InterfaceC574240Mfe
            public final AbstractC574600MgE LIZIZ(InterfaceC574340Mfo interfaceC574340Mfo) {
                return null;
            }

            @Override // X.InterfaceC574240Mfe
            public final C348390DlF LIZ(NLEEditor nLEEditor, InterfaceC574340Mfo interfaceC574340Mfo) {
                ROTATE_DEGREE[] rotate_degreeArr;
                ROTATE_DEGREE rotate_degree;
                int[] rotateArray = interfaceC574340Mfo.getRotateArray();
                if (rotateArray != null) {
                    int length = rotateArray.length;
                    rotate_degreeArr = new ROTATE_DEGREE[length];
                    for (int i = 0; i < length; i++) {
                        int i2 = (rotateArray[i] + 360) % 360;
                        if (i2 != 90) {
                            if (i2 != 180) {
                                if (i2 != 270) {
                                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                                } else {
                                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                                }
                            } else {
                                rotate_degree = ROTATE_DEGREE.ROTATE_180;
                            }
                        } else {
                            rotate_degree = ROTATE_DEGREE.ROTATE_90;
                        }
                        rotate_degreeArr[i] = rotate_degree;
                    }
                } else {
                    rotate_degreeArr = null;
                }
                C1DOU c1dou = new C1DOU(interfaceC574340Mfo.getVideoPaths());
                c1dou.LIZIZ = interfaceC574340Mfo.getVTrimIn();
                c1dou.LIZJ = interfaceC574340Mfo.getVTrimOut();
                c1dou.LJ = interfaceC574340Mfo.getAudioPaths();
                c1dou.LJIIIIZZ = interfaceC574340Mfo.getSpeedArray();
                c1dou.LJIIIZ = rotate_degreeArr;
                c1dou.LJIIJ = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
                return C574130MfT.LIZ(c1dou, nLEEditor);
            }
        });
        return c574210MfbLJJIJIIJIL;
    }

    public C574220Mfc(C1441900ncq c1441900ncq) {
        super(c1441900ncq);
    }
}
