package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0Vek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803000Vek extends C802970Veh {
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;

    @Override // X.C802970Veh
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pollSecond=");
        sbLIZ.append(this.LJII);
        sbLIZ.append("\nwaterLineMB=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append("\ncollectSizeMB=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append("\nneedDumpMemInfo=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append("\ndebug=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append("\nmonitorSize=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append("\nmonitorType=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append("\nbtFlag=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append("\nbtSize=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append("\n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C803000Vek(JSONArray jSONArray) {
        super(21, 35, 1);
        this.LJIIL = 3;
        this.LJIILIIL = 500;
        if (C802300Vdc.LIZIZ()) {
            this.LJIIJJI = 0;
            this.LJIIIIZZ = 30;
            this.LJIIIZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            this.LJII = 1;
            this.LJIILJJIL = false;
            this.LJIIJ = 2;
            this.LJIILL = true;
            this.LJIILIIL = 4;
            this.LJIIL = 3;
            return;
        }
        int iOptInt = jSONArray.optInt(0);
        this.LJII = iOptInt;
        this.LJIIIIZZ = jSONArray.optInt(1);
        this.LJIIIZ = jSONArray.optInt(2);
        this.LJIILJJIL = jSONArray.optBoolean(3);
        this.LJIIJ = jSONArray.optInt(5);
        this.LJIIJJI = jSONArray.optInt(6);
        if (jSONArray.length() >= 9) {
            this.LJIIL = jSONArray.optInt(7);
            this.LJIILIIL = jSONArray.optInt(8);
        }
        this.LJII = Math.max(4, iOptInt);
    }
}
