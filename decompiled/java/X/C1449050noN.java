package X;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0noN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449050noN implements InterfaceC1625220sOW {
    public final ShortVideoContext LIZ;
    public final InterfaceC1449160noY LIZIZ;
    public final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZ);

    @Override // X.InterfaceC1625220sOW
    public final void LIZIZ(String str, boolean z) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZLLL(Effect effect, String str, Bundle bundle, String str2, String str3, String str4) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJ(int i, long j) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJFF(Effect effect, int i, String str, String str2, Bundle bundle) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJI(Effect effect, boolean z, String str, Map<String, String> map) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIJJI(String str, String str2) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIL(long j, String str) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIILIIL(Effect effect, int i, String str, String str2, long j, Bundle bundle) {
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIILJJIL(String str, String str2, String str3, int i, int i2, LinearLayoutManager linearLayoutManager) {
    }

    @Override // X.InterfaceC1625220sOW
    public final InterfaceC1623120sL8 LJIIIZ() {
        return C1449070noP.LIZ;
    }

    public C1449050noN(ShortVideoContext shortVideoContext, InterfaceC1449160noY interfaceC1449160noY) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = interfaceC1449160noY;
    }

    public final HashMap<String, String> LJIILL(Effect effect, String str) {
        List<String> v2Tags;
        String strLJJLIIIJ;
        ShortVideoContext shortVideoContext = this.LIZ;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_method", str);
        pairArr[1] = new Pair("prop_id", effect.getEffectId());
        String parentId = effect.getParentId();
        String str2 = "";
        if (parentId == null) {
            parentId = "";
        }
        pairArr[2] = new Pair("parent_pop_id", parentId);
        pairArr[3] = new Pair("prop_index", effect.getGradeKey());
        HashMap<String, String> mapLIZ = C1449260noi.LIZ(shortVideoContext, pairArr);
        EffectLabel effectLabel = effect.getEffectLabel();
        if (effectLabel != null && (v2Tags = effectLabel.getV2Tags()) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(v2Tags, ",", null, null, 0, null, null, 62)) != null) {
            str2 = strLJJLIIIJ;
        }
        mapLIZ.put("prop_category", str2);
        return mapLIZ;
    }

    @Override // X.InterfaceC1625220sOW
    public final void LIZ(Effect effect, boolean z, String str, String str2, int i, Bundle bundle, PropFromGroupModel propFromGroupModel) {
        LJIILLIIL(effect, z, "click_main_panel", i, false, bundle, "prop_auto_click", propFromGroupModel);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJII(int i, Bundle bundle, PropFromGroupModel propFromGroupModel, Effect effect, String str, String str2, String str3, String str4) {
        C23250099c.LIZLLL(this.LIZJ, null, null, new C1449020noK(this, effect, str3, i, propFromGroupModel, null), 3);
    }

    public final void LJIILLIIL(Effect effect, boolean z, String str, int i, boolean z2, Bundle bundle, String str2, PropFromGroupModel propFromGroupModel) {
        String str3;
        String str4;
        String strLJIJJLI;
        HashMap<String, String> mapLJIILL = LJIILL(effect, str);
        mapLJIILL.put("tab_name", "creator_detail");
        mapLJIILL.put("tab_key", "creator_detail");
        if (!z) {
            mapLJIILL.remove("parent_pop_id");
        }
        if (C1624200sMs.LJIIIIZZ(effect)) {
            mapLJIILL.put("order", String.valueOf(i - 1));
        }
        if (z2) {
            mapLJIILL.put("prop_selected_from", "outer_rec");
        } else {
            mapLJIILL.put("prop_selected_from", "other");
        }
        String str5 = "1";
        mapLJIILL.put("is_original_prop", "1");
        mapLJIILL.put("prop_author_id", ViewOnClickListenerC1638020sjA.LLLIL);
        String recId = effect.getRecId();
        if (recId == null) {
            recId = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIILL.put("prop_rec_id", recId);
        mapLJIILL.put("impr_position", String.valueOf(i));
        String strLJIIIZ = this.LIZ.LJIIIZ();
        if (strLJIIIZ == null) {
            strLJIIIZ = "";
        }
        mapLJIILL.put("from_prop_id", strLJIIIZ);
        if (Intrinsics.LJFF(this.LIZ.LJIIIZ(), effect.getEffectId())) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIILL.put("is_default_prop", str3);
        if (!effect.isBusiness()) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIILL.put("is_commercial_prop", str5);
        if (this.LIZ.isStory) {
            str4 = "story_shoot_page";
        } else {
            str4 = "video_shoot_page";
        }
        mapLJIILL.put("shoot_page", str4);
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext.isStory) {
            strLJIJJLI = "story";
        } else {
            strLJIJJLI = shortVideoContext.LJIJJLI();
        }
        mapLJIILL.put("shoot_tab_name", strLJIJJLI);
        if (bundle != null) {
            String string = bundle.getString("prop_tab_name");
            if (string != null && string.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prop_panel_");
                sbLIZ.append(string);
                mapLJIILL.put("prop_selected_from", C2188811AlT.LIZIZ(sbLIZ));
            }
            String string2 = bundle.getString("prop_tab_order");
            if (string2 != null && string2.length() != 0) {
                mapLJIILL.put("prop_tab_order", string2);
            }
        }
        mapLJIILL.put("camera", C1449260noi.LIZIZ(C0CHQ.LIZ().LJJIIZI().LJJJJZI(1)));
        mapLJIILL.put("tab_id", "1000002");
        C1665200tR0.LIZ.getClass();
        mapLJIILL.put("is_met_music_reuse", String.valueOf(C1665200tR0.LIZJ(effect) ? 1 : 0));
        C1448620nng.LIZIZ(new C1449060noO(mapLJIILL), effect.getEffectId(), this.LIZ.creativeModel.feedPropPinModel);
        if (propFromGroupModel != null) {
            C1934507hv.LIZ(new C1449040noM(mapLJIILL), propFromGroupModel, effect.getEffectId());
        }
        mapLJIILL.put("is_prop_panel_cache", String.valueOf(effect.is_cached_data() ? 1 : 0));
        if (C212600rs.LIZ()) {
            mapLJIILL.put("prop_panel_delivery_source", String.valueOf(effect.getFrom_source()));
        }
        C1449260noi.LJ(str2, mapLJIILL);
    }

    @Override // X.InterfaceC1625220sOW
    public final void LJIIJ(Effect effect, boolean z, String str, String str2, String str3, int i, boolean z2, Bundle bundle, PropFromGroupModel propFromGroupModel) {
        LJIILLIIL(effect, z, str3, i, z2, bundle, "prop_click", propFromGroupModel);
    }
}
