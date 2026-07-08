package X;

import android.util.LruCache;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0KvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532980KvI extends AbstractC532930KvD {
    public final C054G LIZJ;
    public final LruCache<String, Asset> LIZLLL;
    public final String LJ;

    public C532980KvI() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LIZLLL = new LruCache<>(12);
        this.LJ = "WuZhuiDownloader AssetHandler";
    }

    @Override // X.AbstractC532930KvD
    public final String LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
    public final void LIZIZ(String str, InterfaceC531800KtO interfaceC531800KtO) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadResource: ");
        sbLIZ.append(str);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        C297501Dh c297501Dh = new C297501Dh(str);
        if (!LJIIIIZZ(c297501Dh, "asset", interfaceC531800KtO, str, -5001)) {
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c297501Dh.LIZIZ;
        String str2 = (String) linkedHashMap.get("resource_id");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = (String) linkedHashMap.get("asset_type");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) linkedHashMap.get("panel_key");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) linkedHashMap.get("asset_id");
        if (str6 != null) {
            str3 = str6;
        }
        C533030KvN c533030KvN = new C533030KvN(str2, str4, str5, str3);
        if (!LJIIIZ(str4, "asset_type", interfaceC531800KtO, str, -5002)) {
            return;
        }
        String strLIZJ = LIZJ(str);
        if (strLIZJ.length() > 0 && new C0VSJ(strLIZJ).exists()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cache hit: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" -> ");
            sbLIZ2.append(strLIZJ);
            LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC531800KtO.LJJI(str, strLIZJ);
            return;
        }
        EffectManager effectManager = (EffectManager) this.LIZIZ.getValue();
        if (effectManager == null) {
            interfaceC531800KtO.onError(str, -5003, "effectManager not available");
        } else {
            C23250099c.LIZLLL(this.LIZJ, null, null, new C532860Kv6(this, effectManager, str, c533030KvN, interfaceC531800KtO, null), 3);
        }
    }

    public final InterfaceC346201Wa<Asset> LJIIJ(EffectManager effectManager, String str, C533030KvN c533030KvN) {
        Asset asset = this.LIZLLL.get(str);
        if (asset != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("asset info cache hit: ");
            sbLIZ.append(str);
            sbLIZ.append(" assetId=");
            sbLIZ.append(asset.getAsset_id());
            LJFF(C2188811AlT.LIZIZ(sbLIZ));
            return new C516501zn(asset, 1);
        }
        return C09IC.LJ(new C533040KvO(c533030KvN, effectManager, this, str, null));
    }
}
