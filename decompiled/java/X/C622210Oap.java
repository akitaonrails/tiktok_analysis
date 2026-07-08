package X;

import com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Oap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622210Oap {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ;
    public final InterfaceC622260Oau LIZIZ;
    public final long LIZJ = System.currentTimeMillis();

    public C622210Oap(String str, InterfaceC622260Oau interfaceC622260Oau) {
        this.LIZ = str;
        this.LIZIZ = interfaceC622260Oau;
    }

    public final void LIZ(EnumC622250Oat enumC622250Oat, String str, String str2) {
        InterfaceC622450ObD eventTracker;
        String strJ3;
        IBulletinClientBridge iBulletinClientBridgeLIZIZ = this.LIZIZ.LIZIZ();
        if (iBulletinClientBridgeLIZIZ != null && (eventTracker = iBulletinClientBridgeLIZIZ.getEventTracker()) != null) {
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZLLL("scene_name", this.LIZ);
            c2241008qG.LIZIZ(Integer.valueOf(enumC622250Oat.getValue()), "status_code");
            this.LIZIZ.LIZJ().getClass();
            c2241008qG.LIZIZ(3, "db_version");
            c2241008qG.LIZJ(Long.valueOf(System.currentTimeMillis() - this.LIZJ), "cost");
            if (enumC622250Oat == EnumC622250Oat.DB_SCENE_FAIL) {
                c2241008qG.LIZLLL("error_msg", str);
            }
            if (str2 != null) {
                c2241008qG.LIZLLL("reason", str2);
            }
            JSONObject jSONObjectLJ = c2241008qG.LJ();
            this.LIZIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportTrackData: ");
            if (jSONObjectLJ != null) {
                strJ3 = C786410Ut5.J3(jSONObjectLJ);
            } else {
                strJ3 = null;
            }
            sbLIZ.append(strJ3);
            C2188811AlT.LIZIZ(sbLIZ);
            eventTracker.LIZ(jSONObjectLJ);
        }
    }
}
