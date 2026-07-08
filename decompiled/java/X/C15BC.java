package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownShowScreenShotSetting;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS466S0200000_31;

/* JADX INFO: renamed from: X.15BC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BC {
    public static final boolean LIZ = MultiGuestGuestShowdownShowScreenShotSetting.INSTANCE.getValue();
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final Pair<Integer, Integer> LIZLLL;
    public static final String LJ;
    public static final C15BF LJFF;
    public static final C15BF LJI;

    static {
        LIZIZ = C01ZC.LIZIZ() ? "guest_showdown_over_animation.zip" : "multi_guest_guest_showdown_timesup.zip";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.LOTTIE;
        sbLIZ.append(enumC20476415Ak);
        sbLIZ.append("_winner_avatar");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(EnumC20476415Ak.LABEL);
        sbLIZ2.append("_guest_showdown_board");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        LIZLLL = new Pair<>(292, 117);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(enumC20476415Ak);
        sbLIZ3.append("_timeup");
        LJ = C2188811AlT.LIZIZ(sbLIZ3);
        LJFF = new C15BF(strLIZIZ, "multi_guest_guest_showdown_champion_winner_avatar_0421.zip", (Pair<Integer, Integer>) new Pair(576, 576), (Pair<Integer, Integer>) new Pair(176, 176), (List<String>) Collections.singletonList("avatar_0.png"), new C20345814jI(-1, new Pair(Float.valueOf(0.6818182f), Float.valueOf(1.0f))), new C20345714jH(EnumC20439114yL.GECKO, C1143780fs0.LJIIJ("tiktok_live_interaction_guest_showdown", "guest_showdown_champion_state_winner_avatar.png"), new Pair(576, 576), new Pair(176, 176)));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(enumC20476415Ak);
        sbLIZ4.append("_loser_avatar_star");
        LJI = new C15BF(C2188811AlT.LIZIZ(sbLIZ4), "guest_showdown_champion_loser_avatar_star.zip", new Pair(320, 140), new Pair(108, 108), Collections.singletonList("avatar_3.png"), C20345914jJ.LIZ(), 64);
    }

    public static String LIZ(String str) {
        return C1143780fs0.LJIIJ("tiktok_live_interaction_guest_showdown", str);
    }

    public static C15AO LIZIZ(C15BF c15bf, ImageModel imageModel) {
        String uri;
        if (imageModel != null && (uri = imageModel.getUri()) != null && !C934690aQl.LIZ.LIZJ(uri)) {
            C934690aQl.LJFF(imageModel, uri, 192.0f, false, C497740JfY.LJJ(), new C1485690olT(uri));
        }
        return new C15AO("tiktok_live_interaction_guest_showdown", c15bf.LIZIZ, (Function2) new AwS466S0200000_31(c15bf, imageModel, 11), (Map) null, c15bf.LJFF, 0L, false, c15bf.LJI, (List) c15bf.LJ, (Map) null, 1256);
    }
}
