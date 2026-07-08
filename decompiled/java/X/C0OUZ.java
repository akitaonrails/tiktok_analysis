package X;

import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0OUZ {
    public final String LIZ;
    public volatile AtomicInteger LIZIZ = new AtomicInteger(EnumC620210OUh.INITIAL_TYPE.getValue());
    public volatile C620190OUf LIZJ = new C620190OUf(-1);
    public volatile C620190OUf LIZLLL = new C620190OUf(-1);
    public final C620150OUb LJ = new C620150OUb();
    public final C620190OUf LJFF = new C620190OUf(0);

    public void LJFF(C2241008qG c2241008qG) {
    }

    public final boolean LIZ() {
        return this.LIZIZ.get() == EnumC620210OUh.RECORDING_TYPE.getValue();
    }

    public void LJ() {
        if (this.LIZIZ.compareAndSet(EnumC620210OUh.INITIAL_TYPE.getValue(), EnumC620210OUh.RECORDING_TYPE.getValue())) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bulletin_board_sli_qualitySceneName:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(": onTrackStart");
            C1720106oR.LJI("BulletinBoardSliQualityEvent", C2188811AlT.LIZIZ(sbLIZ));
            this.LJ.LIZLLL();
        }
    }

    public final void LJI() {
        if (this.LIZIZ.compareAndSet(EnumC620210OUh.RECORDING_TYPE.getValue(), EnumC620210OUh.RECORD_FINISH_TYPE.getValue())) {
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZLLL("scene_name", this.LIZ);
            c2241008qG.LIZJ(Long.valueOf(this.LJ.LIZ()), "total_cost_time");
            c2241008qG.LIZIZ(Integer.valueOf(this.LJFF.LIZ), "trigger_report_type");
            c2241008qG.LIZIZ(Integer.valueOf(this.LIZJ.LIZ), "status_code");
            if (this.LIZJ.LIZ == 1) {
                c2241008qG.LIZIZ(Integer.valueOf(this.LIZLLL.LIZ), "error_code");
            }
            LJFF(c2241008qG);
            JSONObject jSONObjectLJ = c2241008qG.LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportTrackData: ");
            sbLIZ.append(jSONObjectLJ != null ? C786410Ut5.J3(jSONObjectLJ) : null);
            C2188811AlT.LIZIZ(sbLIZ);
            C20684815ws.LJIJ("bulletin_board_sli_quality", jSONObjectLJ);
            LJII();
        }
    }

    public void LJII() {
        C620150OUb c620150OUb = this.LJ;
        c620150OUb.LIZ = 0L;
        c620150OUb.LIZIZ = 0L;
        this.LIZIZ.set(EnumC620210OUh.INITIAL_TYPE.getValue());
        this.LIZLLL.LIZ = -1;
        this.LIZJ.LIZ = -1;
        this.LJFF.LIZ = -1;
    }

    public void LIZIZ() {
        if (LIZ()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bulletin_board_sli_qualitySceneName:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(": onTrackAbort");
            C1720106oR.LJI("BulletinBoardSliQualityEvent", C2188811AlT.LIZIZ(sbLIZ));
            if (LIZ()) {
                this.LJ.LIZJ();
                this.LJFF.LIZ = 1;
            }
            this.LIZJ.LIZ = 1;
            LJI();
        }
    }

    public final void LIZJ() {
        if (LIZ()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bulletin_board_sli_qualitySceneName:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(": onTrackComplete");
            C1720106oR.LJI("BulletinBoardSliQualityEvent", C2188811AlT.LIZIZ(sbLIZ));
            if (LIZ()) {
                this.LJ.LIZJ();
                this.LJFF.LIZ = 0;
            }
            this.LIZJ.LIZ = 0;
            LJI();
        }
    }

    public C0OUZ(String str) {
        this.LIZ = str;
    }

    public final void LIZLLL(int i) {
        if (LIZ()) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bulletin_board_sli_qualitySceneName:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(": onTrackError");
            C1720106oR.LJI("BulletinBoardSliQualityEvent", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZLLL.LIZ = i;
            if (LIZ()) {
                this.LJ.LIZJ();
                this.LJFF.LIZ = 0;
            }
            this.LIZJ.LIZ = 1;
            LJI();
        }
    }
}
