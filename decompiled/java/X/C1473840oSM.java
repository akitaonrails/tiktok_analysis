package X;

import android.graphics.SurfaceTexture;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.playerkit.videoview.texturepool.FixTexturePoolParam;
import com.ss.android.ugc.playerkit.videoview.texturepool.FixedTexturePoolConfig;
import com.ss.android.ugc.playerkit.videoview.texturepool.OtherTexturePoolConfig;
import com.ss.android.ugc.playerkit.videoview.texturepool.SurfaceTexturePoolConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oSM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473840oSM {
    public static boolean LIZ;
    public static int LIZIZ = 1;
    public static List<? extends FixTexturePoolParam> LIZJ = C13BV.INSTANCE;
    public static final CopyOnWriteArrayList<C1473830oSL> LIZLLL = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<C1473830oSL> LJ = new CopyOnWriteArrayList<>();

    public static void LIZ() {
        List<? extends FixTexturePoolParam> list;
        if (!LIZ) {
            SurfaceTexturePoolConfig surfaceTexturePoolConfig = (SurfaceTexturePoolConfig) GsonProtectorUtils.fromJson(new Gson(), (String) C1474810oTv.U4.getValue(), SurfaceTexturePoolConfig.class);
            if (surfaceTexturePoolConfig != null) {
                OtherTexturePoolConfig otherTexturePoolConfig = surfaceTexturePoolConfig.otherTexturePoolConfig;
                LIZIZ = otherTexturePoolConfig != null ? otherTexturePoolConfig.maxSize : 1;
                FixedTexturePoolConfig fixedTexturePoolConfig = surfaceTexturePoolConfig.fixedPoolConfig;
                if (fixedTexturePoolConfig == null || (list = fixedTexturePoolConfig.list) == null) {
                    list = C13BV.INSTANCE;
                }
                LIZJ = list;
            }
        }
        LIZ = true;
    }

    public static boolean LIZIZ(SurfaceTexture surfaceTexture, int i, int i2) {
        C1473830oSL c1473830oSLRemove;
        SurfaceTexture surfaceTexture2;
        LIZ();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("storeSurfaceTexture, width:");
            sbLIZ.append(i);
            sbLIZ.append(", height:");
            sbLIZ.append(i2);
            sbLIZ.append(", surfaceTexture:");
            sbLIZ.append(surfaceTexture);
            C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("storeSurfaceTexture, storedFixedTextureList size:");
            CopyOnWriteArrayList<C1473830oSL> copyOnWriteArrayList = LIZLLL;
            sbLIZ2.append(copyOnWriteArrayList.size());
            sbLIZ2.append(", storedOtherTextureList size:");
            sbLIZ2.append(copyOnWriteArrayList.size());
            C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ2));
            for (C1473830oSL c1473830oSL : copyOnWriteArrayList) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("storeSurfaceTexture. storedFixedTextureList  it:");
                sbLIZ3.append(c1473830oSL);
                C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ3));
            }
            for (C1473830oSL c1473830oSL2 : LJ) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("storeSurfaceTexture. storedOtherTextureList it:");
                sbLIZ4.append(c1473830oSL2);
                C1481110oe5.LIZIZ("SurfaceTexturePool", C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        if (i < 0 || i2 < 0) {
            return false;
        }
        boolean z = false;
        int i3 = 0;
        for (FixTexturePoolParam fixTexturePoolParam : LIZJ) {
            if (fixTexturePoolParam.width == i && fixTexturePoolParam.height == i2) {
                i3 = fixTexturePoolParam.maxSize;
                z = true;
            }
        }
        if (z) {
            int i4 = 0;
            for (C1473830oSL c1473830oSL3 : LIZLLL) {
                if (c1473830oSL3.LIZ == i && c1473830oSL3.LIZIZ == i2) {
                    i4++;
                }
            }
            if (i4 >= i3) {
                return false;
            }
            LIZLLL.add(new C1473830oSL(surfaceTexture, i, i2));
            return true;
        }
        if (LIZIZ <= 0) {
            return false;
        }
        CopyOnWriteArrayList<C1473830oSL> copyOnWriteArrayList2 = LJ;
        if (copyOnWriteArrayList2.size() >= LIZIZ && (c1473830oSLRemove = copyOnWriteArrayList2.remove(0)) != null && (surfaceTexture2 = c1473830oSLRemove.LIZJ) != null) {
            surfaceTexture2.release();
        }
        copyOnWriteArrayList2.add(new C1473830oSL(surfaceTexture, i, i2));
        return true;
    }
}
