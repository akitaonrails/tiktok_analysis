package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411890mqR {
    public static final C1411890mqR LIZ = new C1411890mqR();
    public static String LIZIZ = "default";
    public static final Keva LIZJ = KevaImpl.getRepo("block_sticker_list", 1);

    public static void LIZ(CreativeModel creativeModel) {
        int size;
        List<String> listLJIILJJIL;
        List listLJJJJI;
        ArrayList<String> arrayList = creativeModel.recordData.resourceId;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            size = 0;
        }
        if (size == 1) {
            C13SS.LIZ.getClass();
            C13SS.LIZ("DraftMobHelper", "report save draft result, image file");
            listLJIILJJIL = C1697810uHb.LJIILJJIL(creativeModel.recordData.applyEffectId);
        } else {
            C13SS.LIZ.getClass();
            C13SS.LIZ("DraftMobHelper", "report save draft result, video file");
            listLJIILJJIL = creativeModel.effectData.resourceId;
        }
        if (C1402560mbO.LIZ() == 3 && C0C64.LJIILLIIL().LJIIIZ(31744, "recent_use_effect_local_draft", true, false) && listLJIILJJIL != null && (listLJJJJI = C13LP.LJJJJI(listLJIILJJIL)) != null && (!listLJJJJI.isEmpty()) && listLJJJJI != null) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(listLJJJJI, ",", null, null, 0, null, null, 62);
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("save media to local gallery, report effectId: ");
            sbLIZ.append(strLJJLIIIJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("RecentUpdateHelper", strLIZIZ);
            LIZ.getClass();
            LIZIZ(strLJJLIIIJ, "post_video");
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (str != null && str.length() != 0) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().updateRecentEffect(LIZIZ, a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6), C2097908Jt.LIZJ(new Pair("use_type", str2)));
        }
    }

    public static void LIZJ(Effect effect, String str) {
        String effectId;
        if (effect != null && (effectId = effect.getEffectId()) != null) {
            LIZIZ(effectId, str);
        }
    }
}
