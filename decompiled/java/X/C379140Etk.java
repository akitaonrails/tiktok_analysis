package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Etk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379140Etk {
    public static final C379140Etk LIZ = new C379140Etk();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(359));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(360));

    public static String LIZJ() {
        return (String) LIZIZ.getValue();
    }

    public static Keva LIZLLL() {
        return (Keva) LIZJ.getValue();
    }

    public static void LIZ() {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ep_ai_create_last_prompt_state_");
        sbLIZ.append(LIZJ());
        kevaLIZLLL.erase(C2188811AlT.LIZIZ(sbLIZ));
        Keva kevaLIZLLL2 = LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ep_ai_create_model_prompt_source_");
        sbLIZ2.append(LIZJ());
        kevaLIZLLL2.erase(C2188811AlT.LIZIZ(sbLIZ2));
        Keva kevaLIZLLL3 = LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ep_ai_create_selected_image_state_");
        sbLIZ3.append(LIZJ());
        kevaLIZLLL3.erase(C2188811AlT.LIZIZ(sbLIZ3));
        Keva kevaLIZLLL4 = LIZLLL();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("ep_ai_create_selected_media_type_state_");
        sbLIZ4.append(LIZJ());
        kevaLIZLLL4.erase(C2188811AlT.LIZIZ(sbLIZ4));
        Keva kevaLIZLLL5 = LIZLLL();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("ep_ai_create_selected_image_source_");
        sbLIZ5.append(LIZJ());
        kevaLIZLLL5.erase(C2188811AlT.LIZIZ(sbLIZ5));
        Keva kevaLIZLLL6 = LIZLLL();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("ep_ai_create_selected_image_ai_");
        sbLIZ6.append(LIZJ());
        kevaLIZLLL6.erase(C2188811AlT.LIZIZ(sbLIZ6));
        Keva kevaLIZLLL7 = LIZLLL();
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("ep_ai_create_selected_image_magic_");
        sbLIZ7.append(LIZJ());
        kevaLIZLLL7.erase(C2188811AlT.LIZIZ(sbLIZ7));
    }

    public static boolean LIZIZ() {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_shown_create_guide_");
        sbLIZ.append(LIZJ());
        return kevaLIZLLL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static int LJ() {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("number_of_shimmer_");
        sbLIZ.append(LIZJ());
        return kevaLIZLLL.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static boolean LJFF() {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auth_");
        sbLIZ.append(LIZJ());
        return kevaLIZLLL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static boolean LJI() {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ep_ai_create_panel_ui_type_");
        sbLIZ.append(LIZJ());
        return Intrinsics.LJFF(kevaLIZLLL.getString(C2188811AlT.LIZIZ(sbLIZ), ""), EnumC378720Et4.TEXT_TO_VIDEO_CREATION.toString());
    }

    public static void LJII() {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auth_");
        sbLIZ.append(LIZJ());
        kevaLIZLLL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }
}
