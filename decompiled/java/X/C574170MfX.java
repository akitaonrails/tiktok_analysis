package X;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.vesdk.ROTATE_DEGREE;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C574170MfX extends AbstractC1452680nuE {
    public final C01GW LJJIJIIJIL;

    public C574210Mfb LJJIJIIJIL() {
        C574210Mfb c574210Mfb = new C574210Mfb();
        ((ArrayList) c574210Mfb.LIZ).add(new InterfaceC574240Mfe() { // from class: X.0MfY
            @Override // X.InterfaceC574240Mfe
            public final AbstractC574600MgE LIZIZ(InterfaceC574340Mfo interfaceC574340Mfo) {
                ROTATE_DEGREE rotate_degree;
                ROTATE_DEGREE[] rotate_degreeArr = null;
                if (interfaceC574340Mfo.getVTrimIn() == null || interfaceC574340Mfo.getVTrimOut() == null) {
                    return null;
                }
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
                }
                C1DOU c1dou = new C1DOU(interfaceC574340Mfo.getVideoPaths());
                c1dou.LIZIZ = interfaceC574340Mfo.getVTrimIn();
                c1dou.LIZJ = interfaceC574340Mfo.getVTrimOut();
                c1dou.LJ = interfaceC574340Mfo.getAudioPaths();
                c1dou.LJIIIIZZ = interfaceC574340Mfo.getSpeedArray();
                c1dou.LJIIIZ = rotate_degreeArr;
                c1dou.LJIIJ = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
                return c1dou;
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
        return c574210Mfb;
    }

    public C574170MfX(C1441900ncq c1441900ncq) {
        super(c1441900ncq);
        this.LJJIJIIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 819));
    }

    @Override // X.AbstractC1452680nuE
    public NLEEditor LJII(VEPreviewParams vEPreviewParams) {
        NLEEditor nLEEditorLIZ = C349920Dni.LIZ();
        C391360FWc.LIZJ(this, new AwS252S0300000_8(nLEEditorLIZ, this, vEPreviewParams, 28));
        return nLEEditorLIZ;
    }

    @Override // X.AbstractC1452680nuE
    public final int LJJII(Context context, InterfaceC574340Mfo interfaceC574340Mfo, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
        super.LJJII(context, interfaceC574340Mfo, surfaceView, lifecycleOwner);
        return 0;
    }
}
