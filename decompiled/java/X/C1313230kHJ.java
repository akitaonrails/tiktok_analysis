package X;

import android.renderscript.Matrix4f;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.lynx.base.log.LynxLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0kHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313230kHJ {
    public float LIZ;
    public float LIZIZ;
    public final LinkedHashMap<String, Float> LIZJ;

    public final float LIZJ() {
        Float f = this.LIZJ.get("rotate");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LIZLLL() {
        Float f = this.LIZJ.get("rotateX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJ() {
        Float f = this.LIZJ.get("rotateY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJFF() {
        Float f = this.LIZJ.get("scaleX");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final float LJI() {
        Float f = this.LIZJ.get("scaleY");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final float LJII() {
        Float f = this.LIZJ.get("skewX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJIIIIZZ() {
        Float f = this.LIZJ.get("skewY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJIIIZ() {
        Float f = this.LIZJ.get("translateX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJIIJ() {
        Float f = this.LIZJ.get("translateY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJIIJJI() {
        Float f = this.LIZJ.get("translateZ");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final Matrix4f LJIILLIIL() {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.translate(LJIIIZ(), LJIIJ(), LJIIJJI());
        matrix4f.rotate(LIZLLL(), 1.0f, 0.0f, 0.0f);
        matrix4f.rotate(LJ(), 0.0f, 1.0f, 0.0f);
        matrix4f.rotate(LIZJ(), 0.0f, 0.0f, 1.0f);
        matrix4f.scale(LJFF(), LJI(), 1.0f);
        float fLJII = LJII();
        float fLJIIIIZZ = LJIIIIZZ();
        Matrix4f matrix4f2 = new Matrix4f();
        matrix4f2.set(0, 1, fLJII);
        Matrix4f matrix4f3 = new Matrix4f();
        matrix4f3.set(1, 0, fLJIIIIZZ);
        matrix4f.multiply(matrix4f2);
        matrix4f.multiply(matrix4f3);
        return matrix4f;
    }

    public C1313230kHJ() {
        LinkedHashMap<String, Float> linkedHashMap = new LinkedHashMap<>();
        this.LIZJ = linkedHashMap;
        linkedHashMap.clear();
    }

    public static double[] LIZIZ(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        double[] dArr = new double[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            dArr[i] = fArr[i];
        }
        return dArr;
    }

    public final void LJIILIIL(C1314310kJ3 c1314310kJ3) {
        this.LIZJ.put("translateX", Float.valueOf(C1314000kIY.LIZIZ((float) c1314310kJ3.LIZLLL[0])));
        this.LIZJ.put("translateY", Float.valueOf(C1314000kIY.LIZIZ((float) c1314310kJ3.LIZLLL[1])));
        this.LIZJ.put("translateZ", Float.valueOf(C1314000kIY.LIZIZ((float) c1314310kJ3.LIZLLL[2])));
        this.LIZJ.put("rotate", Float.valueOf(C1314000kIY.LIZIZ((float) c1314310kJ3.LJ[2])));
        this.LIZJ.put("rotateX", Float.valueOf(C1314000kIY.LIZIZ((float) c1314310kJ3.LJ[0])));
        this.LIZJ.put("rotateY", Float.valueOf(C1314000kIY.LIZIZ((float) c1314310kJ3.LJ[1])));
        this.LIZJ.put("scaleX", Float.valueOf(C1314000kIY.LIZIZ((float) c1314310kJ3.LIZIZ[0])));
        this.LIZJ.put("scaleY", Float.valueOf(C1314000kIY.LIZIZ((float) c1314310kJ3.LIZIZ[1])));
    }

    public final void LJIILJJIL(float f) {
        this.LIZJ.put("skewX", Float.valueOf((float) Math.tan(f)));
    }

    public final void LJIILL(float f) {
        this.LIZJ.put("skewY", Float.valueOf((float) Math.tan(f)));
    }

    public static float LIZ(C1313280kHO c1313280kHO, int i, float f) {
        int iRound;
        if (i == 0) {
            float fLIZIZ = c1313280kHO.LIZJ.LIZIZ(f);
            if (c1313280kHO.LIZLLL == 1) {
                iRound = Math.round(fLIZIZ);
            } else {
                return fLIZIZ;
            }
        } else if (i == 1) {
            float fLIZIZ2 = c1313280kHO.LJFF.LIZIZ(f);
            if (c1313280kHO.LJI != 1) {
                return fLIZIZ2;
            }
            iRound = Math.round(fLIZIZ2);
        } else if (i == 2) {
            float fLIZIZ3 = c1313280kHO.LJII.LIZIZ(f);
            if (c1313280kHO.LJIIIIZZ != 1) {
                return fLIZIZ3;
            }
            iRound = Math.round(fLIZIZ3);
        } else {
            return 0.0f;
        }
        return iRound;
    }

    public static C1313230kHJ LJIIL(List list, int i, int i2) {
        C1313230kHJ c1313230kHJ = new C1313230kHJ();
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1313280kHO c1313280kHO = (C1313280kHO) it2.next();
                int i3 = c1313280kHO.LIZ;
                if (i3 != 1) {
                    if (i3 != 2) {
                        switch (i3) {
                            case 4:
                                c1313230kHJ.LIZJ.put("translateY", Float.valueOf(LIZ(c1313280kHO, 0, i2)));
                                continue;
                            case 8:
                                c1313230kHJ.LIZJ.put("translateZ", Float.valueOf(LIZ(c1313280kHO, 0, 0.0f)));
                                continue;
                            case 16:
                                break;
                            case 32:
                            case 256:
                                c1313230kHJ.LIZJ.put("rotate", Float.valueOf(c1313280kHO.LIZIZ));
                                continue;
                            case 64:
                                c1313230kHJ.LIZJ.put("rotateX", Float.valueOf(c1313280kHO.LIZIZ));
                                continue;
                            case 128:
                                c1313230kHJ.LIZJ.put("rotateY", Float.valueOf(c1313280kHO.LIZIZ));
                                continue;
                            case 512:
                                c1313230kHJ.LIZJ.put("scaleX", Float.valueOf(c1313280kHO.LIZIZ));
                                c1313230kHJ.LIZJ.put("scaleY", Float.valueOf(c1313280kHO.LJ));
                                continue;
                            case 1024:
                                c1313230kHJ.LIZJ.put("scaleX", Float.valueOf(c1313280kHO.LIZIZ));
                                continue;
                            case SpeechEngineDefines.ASR_WORK_MODE_OFFLINE /* 2048 */:
                                c1313230kHJ.LIZJ.put("scaleY", Float.valueOf(c1313280kHO.LIZIZ));
                                continue;
                            case SpeechEngineDefines.TTS_WORK_MODE_BOTH /* 4096 */:
                                c1313230kHJ.LJIILJJIL((float) C1313440kHe.LIZIZ(c1313280kHO.LIZIZ));
                                c1313230kHJ.LJIILL((float) C1313440kHe.LIZIZ(c1313280kHO.LJ));
                                continue;
                            case 8192:
                                c1313230kHJ.LJIILJJIL((float) C1313440kHe.LIZIZ(c1313280kHO.LIZIZ));
                                continue;
                            case 16384:
                                c1313230kHJ.LJIILL((float) C1313440kHe.LIZIZ(c1313280kHO.LIZIZ));
                                continue;
                            case 32768:
                            case 65536:
                                Matrix4f matrix4f = new Matrix4f(c1313280kHO.LJIIIZ);
                                C1314310kJ3 c1314310kJ3 = new C1314310kJ3();
                                c1314310kJ3.LIZ();
                                C1313440kHe.LIZ(LIZIZ(matrix4f.getArray()), c1314310kJ3);
                                c1313230kHJ.LJIILIIL(c1314310kJ3);
                                continue;
                            default:
                                LynxLog.DTHROW(null);
                                return null;
                        }
                    } else {
                        c1313230kHJ.LIZJ.put("translateX", Float.valueOf(LIZ(c1313280kHO, 0, i)));
                    }
                }
                c1313230kHJ.LIZJ.put("translateX", Float.valueOf(LIZ(c1313280kHO, 0, i)));
                c1313230kHJ.LIZJ.put("translateY", Float.valueOf(LIZ(c1313280kHO, 1, i2)));
                c1313230kHJ.LIZJ.put("translateZ", Float.valueOf(LIZ(c1313280kHO, 2, 0.0f)));
            }
        }
        return c1313230kHJ;
    }
}
