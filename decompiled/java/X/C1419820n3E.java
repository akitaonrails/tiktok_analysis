package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaResourceManager;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

/* JADX INFO: renamed from: X.0n3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419820n3E {
    public static final C1419820n3E LIZ = new C1419820n3E();
    public static boolean LIZIZ;
    public static NLEResourceManager LIZJ;

    public final synchronized void LIZ() {
        if (!LIZIZ) {
            TENativeLibsLoader.loadLibrary();
            if (NLE.INSTANCE.getLibraryLoader().onLoadNativeLibs(C1697810uHb.LJ("NLEMediaPublicJni", "NLEMediaJni"))) {
                if (!LIZIZ && LIZJ != null) {
                    NLEMediaResourceManager.obtain().setDelegate(LIZJ);
                }
                LIZIZ = true;
            }
        }
    }
}
