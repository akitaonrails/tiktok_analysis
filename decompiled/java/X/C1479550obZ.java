package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0obZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1479550obZ implements InterfaceC1481730of5 {
    public final InterfaceC1479560oba LIZ;
    public final AbstractC1479520obW LIZIZ;
    public final C1480040ocM LIZJ;

    @Override // X.InterfaceC1481730of5
    public final Map<String, Object> LIZ() {
        return this.LIZIZ.LJJIII();
    }

    @Override // X.InterfaceC1481730of5
    public final String LIZIZ() {
        return this.LIZ.LJLJLJ();
    }

    @Override // X.InterfaceC1481730of5
    public final C1479510obV LIZJ() {
        return this.LIZIZ.LJI;
    }

    @Override // X.InterfaceC1481730of5
    public final int LIZLLL() {
        C1471500oOa videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LIZ;
        }
        return 0;
    }

    @Override // X.InterfaceC1481730of5
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // X.InterfaceC1481730of5
    public final float LJI() {
        return this.LIZ.LJFF(10);
    }

    @Override // X.InterfaceC1481730of5
    public final float LJII() {
        return this.LIZ.LJFF(2);
    }

    @Override // X.InterfaceC1481730of5
    public final boolean LJIIIZ() {
        C1479510obV c1479510obV = this.LIZIZ.LJI;
        if (c1479510obV == null) {
            return false;
        }
        return c1479510obV.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1481730of5
    public final int LJIIJ() {
        return (int) this.LIZ.LJFF(9);
    }

    @Override // X.InterfaceC1481730of5
    public final String LJIJJ() {
        this.LIZ.getVideoInfo();
        return "";
    }

    @Override // X.InterfaceC1481730of5
    public final int LJIJJLI() {
        C1471500oOa videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LIZIZ;
        }
        return -1;
    }

    @Override // X.InterfaceC1481730of5
    public final int LJJ() {
        C1471500oOa videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LIZJ;
        }
        return -1;
    }

    @Override // X.InterfaceC1481730of5
    public final String LJJI() {
        String str = (String) this.LIZ.LIZIZ(C1472640oQQ.LIZLLL);
        return str == null ? "Unknown" : str;
    }

    @Override // X.InterfaceC1481730of5
    public final SimVideoUrlModel LJJIII() {
        return this.LIZIZ.LIZJ;
    }

    @Override // X.InterfaceC1481730of5
    public void LJJIIZ() {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJIIZ();
        }
    }

    @Override // X.InterfaceC1481730of5
    public void LJJIIZI() {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJIIZI();
        }
    }

    @Override // X.InterfaceC1481730of5
    public final int LJJIJIL() {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            return interfaceC1479560oba.LJJIJIL();
        }
        return -1;
    }

    @Override // X.InterfaceC1481730of5
    public final int LJJLIIJ() {
        return this.LIZ.LJJLIIJ();
    }

    @Override // X.InterfaceC1481730of5
    public final float getBitrate() {
        return this.LIZ.LJFF(8);
    }

    @Override // X.InterfaceC1481730of5
    public final long getCurrentPosition() {
        return this.LIZ.getCurrentPosition();
    }

    @Override // X.InterfaceC1481730of5
    public final long getDuration() {
        return this.LIZ.getDuration();
    }

    @Override // X.InterfaceC1481730of5
    public final int getHeight() {
        C1471500oOa videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LJ;
        }
        return 0;
    }

    @Override // X.InterfaceC1481730of5
    public final float getSpeed() {
        return this.LIZJ.LIZ;
    }

    @Override // X.InterfaceC1481730of5
    public final C1471500oOa getVideoInfo() {
        return this.LIZ.getVideoInfo();
    }

    @Override // X.InterfaceC1481730of5
    public final int getWidth() {
        C1471500oOa videoInfo = this.LIZ.getVideoInfo();
        if (videoInfo != null) {
            return videoInfo.LIZLLL;
        }
        return 0;
    }

    @Override // X.InterfaceC1481730of5
    public final boolean isMute() {
        return this.LIZ.isMute();
    }

    @Override // X.InterfaceC1481730of5
    public final EnumC1479760obu getPlayerType() {
        return EnumC1479760obu.TT;
    }

    @Override // X.InterfaceC1481730of5
    public final float LJFF(int i) {
        return this.LIZ.LJFF(i);
    }

    @Override // X.InterfaceC1481730of5
    public final String LJIIIIZZ(String str) {
        return C1477400oY6.LJJJJI.LJIILJJIL(str);
    }

    @Override // X.InterfaceC1481730of5
    public final C1480660odM LJIJ(String str) {
        AbstractC1479520obW abstractC1479520obW;
        if (!TextUtils.isEmpty(str) && (abstractC1479520obW = this.LIZIZ) != null) {
            return abstractC1479520obW.LJJJJI(str);
        }
        return new C1480660odM();
    }

    @Override // X.InterfaceC1481730of5
    public final Object LJIJI(AbstractC1472270oPp abstractC1472270oPp) {
        AbstractC1479520obW abstractC1479520obW = this.LIZIZ;
        if (abstractC1479520obW != null) {
            return abstractC1479520obW.LIZIZ(abstractC1472270oPp);
        }
        return abstractC1472270oPp.LIZIZ;
    }

    @Override // X.InterfaceC1481730of5
    public final C1479860oc4 LJJIFFI(String str) {
        AbstractC1479520obW abstractC1479520obW = this.LIZIZ;
        if (abstractC1479520obW != null && str != null) {
            C1284270jWb c1284270jWb = abstractC1479520obW.LJIILL;
            if (c1284270jWb != null) {
                JSONObject jSONObjectLIZ = c1284270jWb.LIZ(str);
                boolean z = C1479290ob9.LIZ;
                C1479860oc4 c1479860oc4 = new C1479860oc4();
                if (jSONObjectLIZ != null) {
                    c1479860oc4.LIZ = jSONObjectLIZ.optLong("format_open_input", 0L);
                    c1479860oc4.LIZIZ = jSONObjectLIZ.optLong("tran_connect", 0L);
                    c1479860oc4.LIZJ = jSONObjectLIZ.optLong("http_response", 0L);
                    c1479860oc4.LIZLLL = jSONObjectLIZ.optLong("receive_first_video_frame", 0L);
                    c1479860oc4.LJ = jSONObjectLIZ.optLong("decode_first_video_frame", 0L);
                    c1479860oc4.LJFF = jSONObjectLIZ.optLong("render_first_video_frame", 0L);
                    c1479860oc4.LJI = jSONObjectLIZ.optLong("prepared", 0L);
                }
                return c1479860oc4;
            }
            return new C1479860oc4();
        }
        return new C1479860oc4();
    }

    @Override // X.InterfaceC1481730of5
    public final SimVideoUrlModel LJJII(String str) {
        AbstractC1479520obW abstractC1479520obW;
        C1479790obx c1479790obx;
        if (str == null || (abstractC1479520obW = this.LIZIZ) == null || (c1479790obx = abstractC1479520obW.LJJI) == null) {
            return null;
        }
        return c1479790obx.get(str);
    }

    @Override // X.InterfaceC1481730of5
    public void LJJIJIIJI(int i) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJIJIIJI(i);
        }
    }

    public C1479550obZ(InterfaceC1479560oba interfaceC1479560oba, AbstractC1479520obW abstractC1479520obW, C1480040ocM c1480040ocM) {
        this.LIZ = interfaceC1479560oba;
        this.LIZIZ = abstractC1479520obW;
        this.LIZJ = c1480040ocM;
    }

    @Override // X.InterfaceC1481730of5
    public final int LJIL(EnumC1479760obu enumC1479760obu, boolean z, boolean z2) {
        C1480980ods playerConfig;
        AbstractC1479520obW abstractC1479520obW = this.LIZIZ;
        abstractC1479520obW.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1479760obu.toString());
        sbLIZ.append("_");
        sbLIZ.append(false);
        sbLIZ.append("_");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ == null || !abstractC1479520obW.LJJIFFI.containsKey(strLIZIZ) || (playerConfig = abstractC1479520obW.LJJIFFI.get(strLIZIZ)) == null) {
            playerConfig = C607330Nrv.LIZ.LIZ().getPlayerConfig(enumC1479760obu, false, z);
            if (strLIZIZ != null) {
                if (playerConfig == null) {
                    return 0;
                }
                abstractC1479520obW.LJJIFFI.put(strLIZIZ, playerConfig);
            } else if (playerConfig == null) {
                return 0;
            }
        }
        C1473340oRY c1473340oRY = playerConfig.LJJJJIZL;
        if (c1473340oRY == null) {
            return 0;
        }
        if (z2) {
            return c1473340oRY.LIZ;
        }
        return c1473340oRY.LIZIZ;
    }
}
