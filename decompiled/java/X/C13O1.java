package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13O1, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13O1 extends C13OD<List<? extends Effect>, EffectListResponse> {
    public final C13RD LIZ;
    public final Map<String, String> LIZIZ;
    public final String LIZJ;

    @Override // X.C13OD
    public final int getFailCode() {
        return 10003;
    }

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        Map<String, String> map = this.LIZIZ;
        if (map != null && (true ^ map.isEmpty())) {
            mapLIZ.putAll(this.LIZIZ);
        }
        C0XSV c0xsv = C0XSV.GET;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ.append("/effect/api");
        sbLIZ.append("/user/usedSticker");
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, c0xsv, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, EffectListResponse.class);
    }

    public C13O1(C13RD c13rd, String str, Map map) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str, null);
        this.LIZ = c13rd;
        this.LIZIZ = map;
        this.LIZJ = str;
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
        EffectListResponse effectListResponse = (EffectListResponse) c13oe;
        String str = this.LIZ.LJII;
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
        List<Effect> effect_list2 = effectListResponse.getEffect_list();
        c13ld.getClass();
        C13LD.LJIIIZ(str, effect_list2);
        C13LD.LJIIIZ(str, effectListResponse.getCollection_list());
        runOnMainThread(new AwS431S0200000_30(this, effectListResponse, 74));
    }
}
