package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CreatorVideoModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.04BG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04BG {
    public final PdpViewModel LIZ;
    public String LIZIZ;
    public String LIZJ;
    public CreatorVideoModel LIZLLL;
    public boolean LJ;
    public volatile boolean LJFF;
    public volatile String LJI = "";

    public final CreatorVideoModel LIZ() {
        CreatorVideoModel creatorVideoModel = this.LIZLLL;
        if (creatorVideoModel != null) {
            return creatorVideoModel;
        }
        String str = this.LIZJ;
        if (str == null) {
            return null;
        }
        try {
            Gson gson = C051O.LIZ;
            CreatorVideoModel creatorVideoModel2 = (CreatorVideoModel) C051O.LJ(CreatorVideoModel.class, str);
            this.LIZLLL = creatorVideoModel2;
            return creatorVideoModel2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PdpCreatorVideoManager, deserialize error: ");
            sbLIZ.append(e.getMessage());
            C1326490kch.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public final void LIZIZ() {
        String str;
        Type type;
        if (this.LIZJ != null || Intrinsics.LJFF(this.LJI, "error")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PdpCreatorVideoManager, response already exists or error occurred: ");
            sbLIZ.append(this.LJI);
            C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (Intrinsics.LJFF(this.LJI, "loading")) {
            C1326490kch.LJI("PdpCreatorVideoManager, an existing request is loading right now");
            return;
        }
        if (!C123100dR.LIZ(this.LIZIZ) || (str = this.LIZIZ) == null) {
            return;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ == null) {
            C1326490kch.LIZLLL("PdpCreatorVideoManager, request body is null");
            C1326490kch.LIZLLL("PdpCreatorVideoManager, request body is null");
            return;
        }
        String strJR2 = this.LIZ.JR2();
        if (strJR2 != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                    type = new TypeToken<HashMap<String, Object>>() { // from class: X.04Cb
                    }.getType();
                } else {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class))));
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strJR2, type);
                if (!(objFromJson instanceof HashMap)) {
                    objFromJson = null;
                }
                HashMap map = (HashMap) objFromJson;
                if (map != null) {
                    map.put("source_previous_page", "pdp_creator_video");
                    mapLJIIJ.put("entrance_info", C1741890vQh.LJIIIIZZ(map));
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZ.withState(new AwS367S0200000_1(this, (C04BG) mapLJIIJ, (HashMap<String, Object>) 5));
    }

    public C04BG(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }
}
