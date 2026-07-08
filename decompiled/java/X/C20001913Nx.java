package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService;
import com.ss.ugc.effectplatform.model.DiffEffect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20001913Nx extends C13OD<List<? extends Effect>, EffectListResponse> {
    public final C13RD LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final boolean LJ;
    public final InterfaceC20000813Nm LJFF;

    @Override // X.C13OD
    public final int getFailCode() {
        return 10014;
    }

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        C13R7 c13r7;
        String strConvertObjToJson;
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        Map<String, String> map = this.LIZLLL;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        List<String> list = this.LIZIZ;
        if (list != null && (c13r7 = this.LIZ.LJIJI) != null && (strConvertObjToJson = c13r7.LIZ.convertObjToJson(list)) != null) {
            if (this.LJ) {
                mapLIZ.put("effect_ids", strConvertObjToJson);
            } else {
                mapLIZ.put("resource_ids", strConvertObjToJson);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ.append("/effect/api");
        sbLIZ.append(this.LJ ? "/v3/effect/list" : "/v3/effect/listByResourceId");
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        List<String> urlList;
        UrlModel diff_url;
        List<String> urlList2;
        EffectListResponse effectListResponse = (EffectListResponse) c13r7.LIZ.convertJsonToObj(str, EffectListResponse.class);
        if (effectListResponse == null) {
            return null;
        }
        if (C13O0.LIZ) {
            for (Effect effect : effectListResponse.getData()) {
                if (EffectKt.containDiffInfo(effect)) {
                    DiffEffect file_diff = effect.getFile_diff();
                    if (file_diff != null) {
                        UrlModel base_url = file_diff.getBase_url();
                        if (base_url != null) {
                            base_url.setUrl_prefix(effectListResponse.getUrlPrefix());
                        }
                        UrlModel diff_url2 = file_diff.getDiff_url();
                        if (diff_url2 != null) {
                            diff_url2.setUrl_prefix(effectListResponse.getUrlPrefix());
                        }
                        UrlModel base_url2 = file_diff.getBase_url();
                        if (base_url2 == null || (urlList = base_url2.getUrlList()) == null || urlList.isEmpty() || file_diff == null || (diff_url = file_diff.getDiff_url()) == null || (urlList2 = diff_url.getUrlList()) == null || urlList2.isEmpty()) {
                        }
                    }
                    Function1<? super String, Unit> function1 = C20002113Nz.LIZJ;
                    if (function1 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("diff url list is empty but uri is not empty logid: ");
                        sbLIZ.append(this.logId);
                        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
        return effectListResponse;
    }

    @Override // X.C13OD
    public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        runOnMainThread(new AwS431S0200000_30(this, c1662010tLr, 62));
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
        final EffectListResponse effectListResponse = (EffectListResponse) c13oe;
        List<Effect> effect_list = effectListResponse.getEffect_list();
        if (effect_list != null) {
            for (Effect effect : effect_list) {
                effect.setId(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        List<Effect> collection_list = effectListResponse.getCollection_list();
        if (collection_list != null) {
            for (Effect effect2 : collection_list) {
                effect2.setId(u.LJJIFFI(u.LJJIFFI(effect2.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        C13LD c13ld = C13LD.LIZ;
        List<String> url_prefix = effectListResponse.getUrl_prefix();
        List<Effect> effect_list2 = effectListResponse.getEffect_list();
        c13ld.getClass();
        C13LD.LJIILLIIL(url_prefix, effect_list2);
        C13LD.LJIILLIIL(effectListResponse.getUrl_prefix(), effectListResponse.getCollection_list());
        C13LD.LJIILLIIL(effectListResponse.getUrl_prefix(), effectListResponse.getBind_effects());
        C13LD.LJIIIZ(this.LIZ.LJII, effectListResponse.getEffect_list());
        C13LD.LJIIIZ(this.LIZ.LJII, effectListResponse.getCollection_list());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(effectListResponse.getEffect_list());
        arrayList.addAll(effectListResponse.getBind_effects());
        arrayList.addAll(effectListResponse.getCollection_list());
        if (arrayList.isEmpty()) {
            runOnMainThread(new AwS431S0200000_30(this, effectListResponse, 64));
        } else {
            C13LD.LJIILLIIL(null, arrayList);
            this.LJFF.LIZ(arrayList, new InterfaceC20000513Nj() { // from class: X.13Ny
                @Override // X.InterfaceC20000513Nj
                public final void onSuccess() {
                    C20001913Nx c20001913Nx = this.LIZ;
                    c20001913Nx.runOnMainThread(new AwS431S0200000_30(c20001913Nx, effectListResponse, 66));
                }

                @Override // X.InterfaceC20000513Nj
                public final void LIZ(C1662010tLr c1662010tLr) {
                    C20001913Nx c20001913Nx = this.LIZ;
                    c20001913Nx.runOnMainThread(new AwS431S0200000_30(c20001913Nx, c1662010tLr, 65));
                }
            });
        }
    }

    public C20001913Nx(C13RD c13rd, List list, String str, Map map, boolean z, C20000713Nl c20000713Nl, boolean z2) {
        ICKResourceVEPluginStatusService iCKResourceVEPluginStatusService;
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str, null);
        this.LIZ = c13rd;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = map;
        this.LJ = z;
        this.LJFF = c20000713Nl;
        if (!z2 && (iCKResourceVEPluginStatusService = (ICKResourceVEPluginStatusService) PluggableExtentionKt.pluggableSpi$default(ICKResourceVEPluginStatusService.class, false, false, false, 14, null)) != null) {
            iCKResourceVEPluginStatusService.LIZ();
        }
    }
}
