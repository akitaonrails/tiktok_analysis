package X;

import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglBase10;
import com.bytedance.realx.video.EglBase14;
import com.bytedance.realx.video.EglBaseCheckerHelper;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: X.0jQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1280730jQt {
    public static EglBase LIZ() {
        return LIZJ(null, LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN));
    }

    public static void LJIIIIZZ() {
        EglBaseCheckerHelper.EglContextDestoryEnd();
    }

    public static void LJIIIZ() {
        EglBaseCheckerHelper.EglContextDestoryStart();
    }

    public static EglBase LIZIZ(EglBase.Context context) {
        return LIZJ(context, LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN));
    }

    public static EglBase LJ(int[] iArr) {
        return new EglBase10(null, iArr);
    }

    public static EglBase LJI(int[] iArr) {
        return new EglBase14(EglBase.EglVersion.getPreferredEglVersion(), null, iArr);
    }

    public static void LJIIJJI(EglBase.EglContextChecker eglContextChecker) {
        EglBaseCheckerHelper.setEglContextChecker(eglContextChecker);
    }

    public static EglBase LIZJ(EglBase.Context context, int[] iArr) {
        if (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) {
            return new EglBase14(EglBase.EglVersion.getPreferredEglVersion(), (EglBase14.Context) context, iArr);
        }
        return new EglBase10((EglBase10.Context) context, iArr);
    }

    public static EglBase LIZLLL(EGLContext eGLContext, int[] iArr) {
        return new EglBase10(new EglBase10.Context(eGLContext), LJII(iArr, 12352, 64, 4));
    }

    public static EglBase LJFF(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14(EglBase.EglVersion.getPreferredEglVersion(), new EglBase14.Context(eGLContext, EglBase.EglVersion.getPreferredEglVersion()), iArr);
    }

    public static int[] LJIIJ(int i, EglBase.Config config) {
        int i2 = EglBase.AnonymousClass1.$SwitchMap$com$bytedance$realx$video$EglBase$Config[config.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i == 3) {
                            return EglBase.ES3_CONFIG_PLAIN;
                        }
                        return EglBase.ES2_CONFIG_PLAIN;
                    }
                    if (i == 3) {
                        return EglBase.ES3_CONFIG_RECORDABLE;
                    }
                    return EglBase.ES2_CONFIG_RECORDABLE;
                }
                if (i == 3) {
                    return EglBase.ES3_CONFIG_PIXEL_RGBA_BUFFER;
                }
                return EglBase.ES2_CONFIG_PIXEL_RGBA_BUFFER;
            }
            if (i == 3) {
                return EglBase.ES3_CONFIG_PIXEL_BUFFER;
            }
            return EglBase.ES2_CONFIG_PIXEL_BUFFER;
        }
        if (i == 3) {
            return EglBase.ES3_CONFIG_RGBA;
        }
        return EglBase.ES2_CONFIG_RGBA;
    }

    public static int[] LJII(int[] iArr, int i, int i2, int i3) {
        int i4;
        int[] iArr2 = (int[]) iArr.clone();
        int i5 = 0;
        while (true) {
            if (i5 < iArr2.length) {
                if (iArr2[i5] == i && (i4 = i5 + 1) < iArr2.length && iArr2[i4] == i2) {
                    iArr2[i4] = i3;
                    break;
                }
                i5++;
            } else {
                break;
            }
        }
        return iArr2;
    }
}
