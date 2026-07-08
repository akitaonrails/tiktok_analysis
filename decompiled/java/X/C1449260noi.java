package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0noi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449260noi {
    public static final String LIZIZ(int i) {
        return i != 0 ? i != 1 ? "" : "front" : "back";
    }

    public static final HashMap<String, String> LIZ(ShortVideoContext shortVideoContext, Pair<String, String>... pairArr) {
        Pair[] pairArr2 = new Pair[4];
        pairArr2[0] = new Pair("enter_from", "video_shoot_page");
        pairArr2[1] = new Pair("creation_id", shortVideoContext.getCreationId());
        String str = shortVideoContext.shootWay;
        if (str == null) {
            str = "";
        }
        pairArr2[2] = new Pair("shoot_way", str);
        pairArr2[3] = new Pair("shoot_tab_name", shortVideoContext.LJIJJLI());
        HashMap<String, String> mapLJI = C2097608Jq.LJI(pairArr2);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            mapLJI.put("draft_id", String.valueOf(i));
        }
        if (shortVideoContext.newDraftId.length() > 0) {
            mapLJI.put("new_draft_id", shortVideoContext.newDraftId);
        }
        String str2 = shortVideoContext.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str2 != null && str2.length() > 0) {
            mapLJI.put("enter_dm", str2);
        }
        String str3 = shortVideoContext.creativeModel.initialModel.dmCameraModel.searchSessionId;
        if (str3 != null) {
            mapLJI.put("search_session_id", str3);
        }
        if (shortVideoContext.creativeModel.initialModel.dmCameraModel.isFromEffectButton) {
            mapLJI.put("is_chat_page_icon_effect", "1");
        }
        for (Pair<String, String> pair : pairArr) {
            mapLJI.put(pair.getFirst(), pair.getSecond());
        }
        return mapLJI;
    }

    public static final void LJ(String str, Map<String, String> map) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c0lab.LJ(entry.getKey(), entry.getValue());
        }
        C2341909Fp.LIZ(str, c0lab.LIZ);
    }

    public static final String LIZJ(C1449000noI c1449000noI, ShortVideoContext shortVideoContext, InterfaceC1624480sNK interfaceC1624480sNK) {
        String key;
        String str;
        if (c1449000noI == null || (str = c1449000noI.LJIIIZ) == null) {
            if (EffectFullWidthHorizontalCarouselAB.isEnabled()) {
                return "carousel_rec";
            }
            if (C579450Mo3.LIZ(shortVideoContext)) {
                return "carousel";
            }
            EffectCategoryModel effectCategoryModelLIZIZ = C23117093z.LIZIZ(interfaceC1624480sNK.getStickerRepository().LJFF(), interfaceC1624480sNK.LLILIL());
            if (effectCategoryModelLIZIZ != null && (key = effectCategoryModelLIZIZ.getKey()) != null) {
                return key;
            }
            return "other";
        }
        return str;
    }

    public static final String LIZLLL(C1449000noI c1449000noI, ShortVideoContext shortVideoContext, InterfaceC1624480sNK interfaceC1624480sNK) {
        String name;
        String str;
        if (c1449000noI == null || (str = c1449000noI.LJIIIIZZ) == null) {
            if (EffectFullWidthHorizontalCarouselAB.isEnabled()) {
                return "carousel_rec";
            }
            if (C579450Mo3.LIZ(shortVideoContext)) {
                return "carousel";
            }
            EffectCategoryModel effectCategoryModelLIZIZ = C23117093z.LIZIZ(interfaceC1624480sNK.getStickerRepository().LJFF(), interfaceC1624480sNK.LLILIL());
            if (effectCategoryModelLIZIZ != null && (name = effectCategoryModelLIZIZ.getName()) != null) {
                return name;
            }
            return "other";
        }
        return str;
    }
}
