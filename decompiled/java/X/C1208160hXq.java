package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208160hXq {
    public final C1208350hY9 LIZ;
    public final C1208350hY9 LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final EnumC2192761Arq LJ;
    public final C1208270hY1 LJFF;
    public final C1208270hY1 LJI;
    public final List<C1208410hYF> LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1208160hXq)) {
            return false;
        }
        C1208160hXq c1208160hXq = (C1208160hXq) obj;
        return Intrinsics.LJFF(this.LIZ, c1208160hXq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1208160hXq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1208160hXq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1208160hXq.LIZLLL) && this.LJ == c1208160hXq.LJ && Intrinsics.LJFF(this.LJFF, c1208160hXq.LJFF) && Intrinsics.LJFF(this.LJI, c1208160hXq.LJI) && Intrinsics.LJFF(this.LJII, c1208160hXq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1208160hXq.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1208350hY9 c1208350hY9 = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (c1208350hY9 == null ? 0 : c1208350hY9.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        C1208270hY1 c1208270hY1 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (c1208270hY1 == null ? 0 : c1208270hY1.hashCode())) * 31;
        C1208270hY1 c1208270hY12 = this.LJI;
        int iHashCode4 = (iHashCode3 + (c1208270hY12 == null ? 0 : c1208270hY12.hashCode())) * 31;
        List<C1208410hYF> list = this.LJII;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LJIIIIZZ;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermissionConfig(rationaleConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", systemSettingsConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", biz=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", triggerType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sysConversionConfig=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", inAppConversionConfig=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", freqParams=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dialogName=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C1208350hY9 c1208350hY9 = this.LIZ;
        if (c1208350hY9 != null) {
            jSONObject.put("show_preinstructions", c1208350hY9.LIZLLL);
            jSONObject.put("popup_ui_type", c1208350hY9.LIZ.ordinal());
        }
        C1208350hY9 c1208350hY92 = this.LIZIZ;
        if (c1208350hY92 != null) {
            jSONObject.put("show_open_settings", c1208350hY92.LIZLLL);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C1208160hXq(C1208350hY9 c1208350hY9, C1208350hY9 c1208350hY92, String str, String str2, EnumC2192761Arq enumC2192761Arq, C1208270hY1 c1208270hY1, C1208270hY1 c1208270hY12, List<C1208410hYF> list, String str3) {
        this.LIZ = c1208350hY9;
        this.LIZIZ = c1208350hY92;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = enumC2192761Arq;
        this.LJFF = c1208270hY1;
        this.LJI = c1208270hY12;
        this.LJII = list;
        this.LJIIIIZZ = str3;
    }
}
