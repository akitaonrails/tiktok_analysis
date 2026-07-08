package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioUseFriendsIDExpConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0HSG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HSG {
    public static final C0HSG LIZ = new C0HSG();
    public static final Map<Integer, Integer> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(1, 3), new Pair(2, 7));
    public static final int LIZJ = MixStudioSettings.INSTANCE.typingIconEntranceCount();
    public static final Map<String, InterfaceC332260D0u<Boolean>> LIZLLL = new LinkedHashMap();

    public static boolean LIZ() {
        int i = LIZIZ().getInt("generate_mix_sticker_without_social_avatar", 0);
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        MixStudioUseFriendsIDExpConfig mixStudioUseFriendsIDExpConfig = C0HSE.LIZ;
        MixStudioUseFriendsIDExpConfig mixStudioUseFriendsIDExpConfig2 = (MixStudioUseFriendsIDExpConfig) c0c64LJIILLIIL.LJJII(MixStudioUseFriendsIDExpConfig.class, mixStudioUseFriendsIDExpConfig, "mix_studio_use_friends_id", true);
        if (mixStudioUseFriendsIDExpConfig2 != null) {
            mixStudioUseFriendsIDExpConfig = mixStudioUseFriendsIDExpConfig2;
        }
        return i >= mixStudioUseFriendsIDExpConfig.generateMixStickerWithoutSALimit;
    }

    public static Keva LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("imagine_studio_keva_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 1);
    }

    public static InterfaceC332260D0u LIZJ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZLLL;
        Object objLIZ = linkedHashMap.get(str);
        if (objLIZ == null) {
            LIZ.getClass();
            Keva kevaLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sticker_panel_entrance_clicked_");
            sbLIZ.append(str);
            objLIZ = C1BNE.LIZ(Boolean.valueOf(!((Boolean) C12848051a.LIZ(kevaLIZIZ, Boolean.FALSE, C2188811AlT.LIZIZ(sbLIZ))).booleanValue()));
            linkedHashMap.put(str, objLIZ);
        }
        return (InterfaceC332260D0u) objLIZ;
    }
}
