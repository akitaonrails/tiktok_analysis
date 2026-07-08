package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20001813Nw extends C13OD<List<? extends Effect>, EffectListResponse> {
    public final C13RD LIZ;
    public final List<String> LIZIZ;
    public final Map<String, String> LIZJ;
    public final InterfaceC20000813Nm LIZLLL;

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        C13R7 c13r7;
        String strConvertObjToJson;
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        Map<String, String> map = this.LIZJ;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        List<String> list = this.LIZIZ;
        if (list != null && (c13r7 = this.LIZ.LJIJI) != null && (strConvertObjToJson = c13r7.LIZ.convertObjToJson(list)) != null) {
            mapLIZ.put("effect_ids", strConvertObjToJson);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ.append("/effect/api");
        sbLIZ.append("/v3/effect/list");
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, EffectListResponse.class);
    }

    @Override // X.C13OD
    public final void onSuccess(final long j, final long j2, final long j3, C13OE c13oe) {
        final EffectListResponse effectListResponse = (EffectListResponse) c13oe;
        List<Effect> effect_list = effectListResponse.getEffect_list();
        if (effect_list != null) {
            for (Effect effect : effect_list) {
                effect.setId(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
            }
        }
        C13LD c13ld = C13LD.LIZ;
        String str = this.LIZ.LJII;
        List<Effect> effect_list2 = effectListResponse.getEffect_list();
        c13ld.getClass();
        C13LD.LJIIIZ(str, effect_list2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(effectListResponse.getEffect_list());
        arrayList.addAll(effectListResponse.getBind_effects());
        arrayList.addAll(effectListResponse.getCollection_list());
        if (arrayList.isEmpty()) {
            super.onSuccess(j, j2, j3, effectListResponse);
        } else {
            C13LD.LJIILLIIL(null, arrayList);
            this.LIZLLL.LIZ(arrayList, new InterfaceC20000513Nj() { // from class: X.0tJY
                @Override // X.InterfaceC20000513Nj
                public final void onSuccess() {
                    String str2;
                    List<String> list = this.LIZ.LIZIZ;
                    if (list != null && (str2 = (String) C13LP.LJJJLL(list)) != null && this.LIZ.LIZIZ.size() == 1 && !C04QV.LIZ()) {
                        C1398060mU8.LIZIZ(str2, effectListResponse);
                    }
                    super/*X.13OD*/.onSuccess(j, j2, j3, effectListResponse);
                }

                @Override // X.InterfaceC20000513Nj
                public final void LIZ(C1662010tLr c1662010tLr) {
                    super/*X.13OD*/.onFailure(null, null, c1662010tLr);
                }
            });
        }
    }

    public C20001813Nw(C13RD c13rd, List list, String str, Map map, C20000713Nl c20000713Nl) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str, null);
        this.LIZ = c13rd;
        this.LIZIZ = list;
        this.LIZJ = map;
        this.LIZLLL = c20000713Nl;
    }
}
