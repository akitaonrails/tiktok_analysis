package X;

import com.bytedance.goda.v2.model.dto.GlobalStruct;
import com.bytedance.goda.v2.model.dto.GodaV2Extension;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpPageDataModel;
import java.util.Map;

/* JADX INFO: renamed from: X.04Aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1055604Aw implements InterfaceC1053704Ad {
    public C04FG LIZ;
    public C04FG LIZIZ;
    public final C04FH LIZJ;

    @Override // X.InterfaceC1053704Ad
    public final PdpPageDataModel LIZLLL() {
        return null;
    }

    public C1055604Aw() {
        C04BK c04bk = new C04BK();
        C04D2.LIZ = c04bk;
        C04FH c04fh = new C04FH(c04bk);
        c04fh.LIZLLL((n) C1068204Fs.LIZIZ.getValue());
        this.LIZJ = c04fh;
    }

    @Override // X.InterfaceC1053704Ad
    public final C04FG LJ() {
        return this.LIZIZ;
    }

    public static GodaV2Protocol LIZ(GodaV2Protocol godaV2Protocol) {
        GodaV2Extension godaV2Extension;
        Map<String, Object> map;
        Object obj;
        Map map2;
        GodaV2Protocol godaV2Protocol2;
        if (godaV2Protocol == null || (godaV2Extension = godaV2Protocol.extension) == null || (map = godaV2Extension.pages) == null || (obj = map.get("sku_panel")) == null) {
            return null;
        }
        try {
            Gson gson = C04DJ.LIZ;
            if (!(obj instanceof Map) || (map2 = (Map) obj) == null) {
                return null;
            }
            Gson gson2 = C04DJ.LIZ;
            Object objFromJson = GsonProtectorUtils.fromJson(gson2, GsonProtectorUtils.toJson(gson2, map2), (Class<Object>) GodaV2Protocol.class);
            if (objFromJson instanceof GodaV2Protocol) {
                godaV2Protocol2 = (GodaV2Protocol) objFromJson;
            } else {
                godaV2Protocol2 = null;
            }
            GlobalStruct globalStruct = godaV2Protocol.global;
            if (!(globalStruct instanceof GlobalStruct)) {
                globalStruct = null;
            }
            if (godaV2Protocol2 == null) {
                return null;
            }
            GlobalStruct globalStruct2 = godaV2Protocol2.global;
            if (globalStruct2 != null) {
                globalStruct = globalStruct2;
            }
            GodaV2Protocol godaV2ProtocolLIZ = GodaV2Protocol.LIZ(godaV2Protocol2, globalStruct, null, null, null, 62);
            godaV2ProtocolLIZ.localExtra = godaV2Protocol2.localExtra;
            return godaV2ProtocolLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SKUGodaManager | extractSkuPanelProtocol failed: ");
            sbLIZ.append(e.getMessage());
            C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public final C04FG LIZIZ(GodaV2Protocol<?> godaV2Protocol, C04CV c04cv) {
        GodaV2Protocol<?> godaV2ProtocolLIZ = LIZ(godaV2Protocol);
        if (godaV2ProtocolLIZ == null) {
            return null;
        }
        C04FG c04fgLIZ = this.LIZJ.LIZ(godaV2ProtocolLIZ, c04cv);
        this.LIZ = c04fgLIZ;
        this.LIZIZ = c04fgLIZ;
        return c04fgLIZ;
    }

    public final C04FG LIZJ(GodaV2Protocol<?> godaV2Protocol, C04CV c04cv, boolean z) {
        C04FG c04fgLIZJ;
        GodaV2Protocol<?> godaV2ProtocolLIZ = LIZ(godaV2Protocol);
        if (godaV2ProtocolLIZ != null && z) {
            c04fgLIZJ = this.LIZJ.LIZJ(this.LIZ, godaV2ProtocolLIZ, c04cv);
        } else {
            c04fgLIZJ = this.LIZ;
        }
        this.LIZIZ = c04fgLIZJ;
        return c04fgLIZJ;
    }
}
