package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.VEUtils;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1CMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229261CMy {
    public static InterfaceC2239161CkU LIZ;

    public static InterfaceC2239161CkU LIZ() {
        InterfaceC2239161CkU interfaceC2239161CkU = LIZ;
        if (interfaceC2239161CkU != null) {
            return interfaceC2239161CkU;
        }
        throw new IllegalStateException("Media service not initialized");
    }

    public static C2229251CMx LIZIZ(String str) {
        VEUtils.VEVideoFileInfo videoFileInfo;
        C2229251CMx c2229251CMxLJFF = LIZ().LJFF(str);
        if ((c2229251CMxLJFF.LJ == 0 || c2229251CMxLJFF.LIZLLL == 0 || c2229251CMxLJFF.LIZJ == 0) && (videoFileInfo = VEUtils.getVideoFileInfo(str)) != null) {
            c2229251CMxLJFF.LIZ = TEVideoUtils.nativeGetMimeType(str);
            c2229251CMxLJFF.LIZJ = videoFileInfo.width;
            c2229251CMxLJFF.LIZLLL = videoFileInfo.height;
            c2229251CMxLJFF.LJ = videoFileInfo.duration;
            c2229251CMxLJFF.LJFF = videoFileInfo.fps;
            c2229251CMxLJFF.LJI = videoFileInfo.bitrate;
            c2229251CMxLJFF.LJII = videoFileInfo.rotation;
            c2229251CMxLJFF.LJIIIIZZ = videoFileInfo.maxDuration;
            c2229251CMxLJFF.LJIIIZ = videoFileInfo.codec;
        }
        return c2229251CMxLJFF;
    }

    public static Pair LIZJ(C2229251CMx c2229251CMx) {
        int i = c2229251CMx.LIZJ;
        int i2 = c2229251CMx.LIZLLL;
        int i3 = c2229251CMx.LJII;
        if (i3 == 90 || i3 == 270) {
            i2 = i;
            i = i2;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
