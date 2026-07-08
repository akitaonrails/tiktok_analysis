package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData;
import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0z4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881940z4a implements InterfaceC2098308Jx<C470590Icr<RawGameDetailHomeResponse$ResponseData>> {
    public final Map<String, String> LIZ;

    @Override // X.InterfaceC2098308Jx
    public final String getPath() {
        return "/game_station/game_detail/home/v2";
    }

    @Override // X.InterfaceC2098308Jx
    public final AbstractC19484711Kz<C470590Icr<RawGameDetailHomeResponse$ResponseData>> LIZ() {
        Integer numLJIIJJI;
        C480460Ism.LIZ().getClass();
        GameDetailPageApi gameDetailPageApi = (GameDetailPageApi) C480460Ism.LIZLLL(GameDetailPageApi.class);
        String str = (String) ((LinkedHashMap) this.LIZ).get(Scene.SCENE_SERVICE);
        return gameDetailPageApi.requestAnchorGameDetailHomeV2((str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) ? 99 : numLJIIJJI.intValue(), String.valueOf(((LinkedHashMap) this.LIZ).get("game_id")), String.valueOf(((LinkedHashMap) this.LIZ).get("room_id")), String.valueOf(((LinkedHashMap) this.LIZ).get("ad_id")), String.valueOf(((LinkedHashMap) this.LIZ).get("item_id")), String.valueOf(((LinkedHashMap) this.LIZ).get("author_id")), String.valueOf(((LinkedHashMap) this.LIZ).get("game_tag_id")), String.valueOf(((LinkedHashMap) this.LIZ).get("task_id")), String.valueOf(((LinkedHashMap) this.LIZ).get("promote_task_type")), String.valueOf(((LinkedHashMap) this.LIZ).get("log_extra")), String.valueOf(((LinkedHashMap) this.LIZ).get("extra_params"))).LJJIII(2L).LJJIJIIJI(C11S5.LIZ());
    }

    @Override // X.InterfaceC2098308Jx
    public final String getRequestId() {
        return C2098108Jv.LIZ(this);
    }

    @Override // X.InterfaceC2098308Jx
    public final Map<String, String> getParams() {
        return this.LIZ;
    }

    public C1881940z4a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        linkedHashMap.put(Scene.SCENE_SERVICE, String.valueOf(i));
        linkedHashMap.put("game_id", str);
        linkedHashMap.put("room_id", str2);
        linkedHashMap.put("ad_id", str3);
        linkedHashMap.put("item_id", str4);
        linkedHashMap.put("author_id", str5);
        linkedHashMap.put("game_tag_id", str6);
        linkedHashMap.put("task_id", str7);
        linkedHashMap.put("promote_task_type", str8);
        linkedHashMap.put("log_extra", str9);
        linkedHashMap.put("extra_params", str10);
    }
}
