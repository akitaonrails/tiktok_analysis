package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import com.ss.ugc.effectplatform.model.DiffEffect;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13O2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13O2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str, String str2, Asset asset) {
        String uri;
        UrlModel diff_url;
        DiffEffect file_diff = asset.getBusiness_extra().getFile_diff();
        String md5 = null;
        if (file_diff != null && (diff_url = file_diff.getDiff_url()) != null) {
            md5 = diff_url.getMd5();
        }
        if (EffectKt.containDiffInfo(asset) && !C504670Jqj.LIZIZ(md5)) {
            BusinessExtra business_extra = asset.getBusiness_extra();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            String str3 = C13SB.LIZ;
            sbLIZ.append(str3);
            sbLIZ.append(md5);
            sbLIZ.append(".zip");
            business_extra.setZip_path(C2188811AlT.LIZIZ(sbLIZ));
            BusinessExtra business_extra2 = asset.getBusiness_extra();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str3);
            sbLIZ2.append(md5);
            business_extra2.setUnzip_path(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            BusinessExtra business_extra3 = asset.getBusiness_extra();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            String str4 = C13SB.LIZ;
            sbLIZ3.append(str4);
            sbLIZ3.append(asset.getBusiness_extra().getGenerated_id());
            sbLIZ3.append(".zip");
            business_extra3.setZip_path(C2188811AlT.LIZIZ(sbLIZ3));
            BusinessExtra business_extra4 = asset.getBusiness_extra();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(str4);
            sbLIZ4.append(asset.getBusiness_extra().getGenerated_id());
            business_extra4.setUnzip_path(C2188811AlT.LIZIZ(sbLIZ4));
        }
        BusinessExtra business_extra5 = asset.getBusiness_extra();
        if (str2 == null) {
            str2 = "";
        }
        business_extra5.setPanel(str2);
        UrlModel trans_file_url = asset.getBusiness_extra().getTrans_file_url();
        if (trans_file_url != null && (uri = trans_file_url.getUri()) != null && !a0.LJJJIL(uri)) {
            BusinessExtra business_extra6 = asset.getBusiness_extra();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append(C13SB.LIZ);
            sbLIZ5.append(asset.getBusiness_extra().getId());
            sbLIZ5.append("_trans_");
            sbLIZ5.append(uri);
            business_extra6.setTrans_res_path(C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public static AssetCategoryResponse LIZ(String str, String str2, int i, int i2, C13RD c13rd) {
        C20008813Qo c20008813QoLJIILIIL;
        String strLIZ = C13OQ.LIZ(i, i2, str, str2);
        InterfaceC20004513Ox interfaceC20004513Ox = c13rd.LJJIFFI;
        AssetCategoryResponse assetCategoryResponse = null;
        if (interfaceC20004513Ox == null || (c20008813QoLJIILIIL = interfaceC20004513Ox.LJIILIIL(strLIZ)) == null) {
            return null;
        }
        try {
            String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
            C13R7 c13r7 = c13rd.LJIJI;
            if (c13r7 != null) {
                assetCategoryResponse = (AssetCategoryResponse) c13r7.LIZ.convertJsonToObj(strLJIIIZ, AssetCategoryResponse.class);
            }
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            return assetCategoryResponse;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            throw th;
        }
    }

    public static AssetPanelResponse LIZIZ(String str, String str2, int i, int i2, C13RD c13rd) {
        C20008813Qo c20008813QoLJIILIIL;
        String strLIZJ = C13OQ.LIZJ(i, i2, str, str2);
        InterfaceC20004513Ox interfaceC20004513Ox = c13rd.LJJIFFI;
        AssetPanelResponse assetPanelResponse = null;
        if (interfaceC20004513Ox == null || (c20008813QoLJIILIIL = interfaceC20004513Ox.LJIILIIL(strLIZJ)) == null) {
            return null;
        }
        try {
            String strLJIIIZ = C13SB.LJIIIZ(c20008813QoLJIILIIL);
            C13R7 c13r7 = c13rd.LJIJI;
            if (c13r7 != null) {
                assetPanelResponse = (AssetPanelResponse) c13r7.LIZ.convertJsonToObj(strLJIIIZ, AssetPanelResponse.class);
            }
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            return assetPanelResponse;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13SB.LIZIZ(c20008813QoLJIILIIL);
            throw th;
        }
    }
}
