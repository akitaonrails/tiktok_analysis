package X;

import android.app.Activity;
import android.app.Application;
import com.bytedance.amg.minigameruntime.api.ABSetting;
import com.bytedance.amg.minigameruntime.api.JsEngineType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304500k3E {
    public final Application LIZ;
    public final Activity LIZIZ;
    public final String LIZLLL;
    public final boolean LJFF;
    public final JsEngineType LJI;
    public final ABSetting LJII;
    public final String LIZJ = "TikTok";
    public final String LJ = "2.0.0";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1304500k3E)) {
            return false;
        }
        C1304500k3E c1304500k3E = (C1304500k3E) obj;
        return Intrinsics.LJFF(this.LIZ, c1304500k3E.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1304500k3E.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1304500k3E.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1304500k3E.LIZLLL) && Intrinsics.LJFF(this.LJ, c1304500k3E.LJ) && this.LJFF == c1304500k3E.LJFF && this.LJI == c1304500k3E.LJI && Intrinsics.LJFF(this.LJII, c1304500k3E.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31;
        ABSetting aBSetting = this.LJII;
        return iHashCode + (aBSetting == null ? 0 : aBSetting.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniGameRenderConfig(application=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", appVersion=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sdkVersion=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isDebugLocateJSMode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", jsEngineType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", abSetting=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1304500k3E(Application application, Activity activity, String str, boolean z, JsEngineType jsEngineType, ABSetting aBSetting) {
        this.LIZ = application;
        this.LIZIZ = activity;
        this.LIZLLL = str;
        this.LJFF = z;
        this.LJI = jsEngineType;
        this.LJII = aBSetting;
    }
}
