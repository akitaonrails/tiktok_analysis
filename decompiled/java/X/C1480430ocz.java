package X;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ocz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480430ocz {
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;
    public Bundle LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final HashMap<String, Object> LJIIL;
    public Map<String, Object> LJIILIIL;
    public int LJIILJJIL;
    public long LJIILL;
    public boolean LJIILLIIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerEvent{id='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onRenderTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", elapsedRealtime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", currentTimeMillis=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enablePlayerSdkEventTracking=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isMute=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", gaussianPrams=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", urlProtocolType=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", requestType=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", prerenderType=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", firstFrameInfo=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", modelType=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1480430ocz(String str) {
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJIIIZ = -1;
        this.LJIIJJI = -1;
        this.LJIIL = new HashMap<>();
        this.LJIILJJIL = -1;
        this.LJIILL = -1L;
        this.LJIILLIIL = false;
        this.LIZ = str;
    }

    public final void LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJIIL.put("strategy_tokens", str);
        }
    }

    public C1480430ocz(String str, long j) {
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJIIIZ = -1;
        this.LJIIJJI = -1;
        this.LJIIL = new HashMap<>();
        this.LJIILJJIL = -1;
        this.LJIILL = -1L;
        this.LJIILLIIL = false;
        this.LIZ = str;
        this.LIZIZ = 0;
        this.LIZJ = j;
    }

    public C1480430ocz(int i, long j, String str, boolean z) {
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJIIIZ = -1;
        this.LJIIJJI = -1;
        this.LJIIL = new HashMap<>();
        this.LJIILJJIL = -1;
        this.LJIILL = -1L;
        this.LJIILLIIL = false;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LJI = z;
    }
}
