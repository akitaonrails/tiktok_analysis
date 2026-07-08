package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoCardDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoModuleDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.09YH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09YH {
    public final SeaPdpViewModel LIZ;
    public volatile String LIZIZ;
    public volatile Map<String, ? extends Object> LIZLLL;
    public List<String> LJ;
    public volatile String LJFF;
    public volatile String LJI;
    public volatile String LJII;
    public String LJIIIIZZ;
    public AnonymousClass0956 LJIIL;
    public volatile AbstractC1623806Xk<SeaPdpCreatorVideoModuleDTO> LIZJ = C491101vh.LIZ;
    public final Set<C090P> LJIIIZ = new LinkedHashSet();
    public final Set<String> LJIIJ = new LinkedHashSet();
    public final Set<C09YP> LJIIJJI = new LinkedHashSet();

    public C09YH(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    public final void LIZIZ(C090P c090p, Integer num) {
        Object obj;
        String str;
        Map<String, Object> map;
        if (!this.LJIIIZ.contains(c090p)) {
            this.LJIIIZ.add(c090p);
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLIZ;
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                obj = map.get("source_page_type");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZ), null, null, new C090O(c090p, str, num, null), 3);
        }
    }

    public static void LIZ(long j, Integer num, String str, AbstractC1623806Xk abstractC1623806Xk, String str2, String str3) {
        int i;
        SeaPdpCreatorVideoModuleDTO seaPdpCreatorVideoModuleDTO;
        List<SeaPdpCreatorVideoCardDTO> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("api_path", "/api/v1/shop/pdp_creator_video/recommend_card");
        linkedHashMap.put(Scene.SCENE_SERVICE, "pdp_creator_video_module");
        linkedHashMap.put("duration", Long.valueOf(j));
        if (num != null && num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        linkedHashMap.put("is_success", Integer.valueOf(i));
        if (num != null) {
            num.intValue();
            linkedHashMap.put("error_code", num);
        }
        if (str != null) {
            linkedHashMap.put("error_msg", str);
        }
        if (abstractC1623806Xk != null && (seaPdpCreatorVideoModuleDTO = (SeaPdpCreatorVideoModuleDTO) abstractC1623806Xk.LIZ()) != null && (list = seaPdpCreatorVideoModuleDTO.videos) != null) {
            linkedHashMap.put("video_cnt", Integer.valueOf(list.size()));
        }
        if (str2 != null) {
            linkedHashMap.put("source_page_type", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("log_id", str3);
        }
        C1018703yb.LJ("tiktokec_rd_creator_video_request_result", linkedHashMap);
    }
}
