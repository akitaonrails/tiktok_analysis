package X;

import com.bytedance.forest.Forest;
import com.bytedance.keva.Keva;
import java.io.File;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS192S1100000_13;
import kotlin.jvm.internal.AwS627S0100000_13;

/* JADX INFO: renamed from: X.0XAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844350XAj implements InterfaceC684380Qsu {
    public static boolean LIZIZ;
    public static final C844350XAj LIZ = new C844350XAj();
    public static final Keva LIZJ = Keva.getRepo("tako_gecko_entrance");
    public static final String LIZLLL = ((Forest) C844360XAk.LIZ.getValue()).openSession(null);

    public static Object LIZJ(InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C844350XAj c844350XAj = LIZ;
        AwS627S0100000_13 awS627S0100000_13 = new AwS627S0100000_13(c2252611DEt, 0);
        c844350XAj.getClass();
        LIZLLL("tikbot_aivideo_resource", "lottie/tako_bk_logo_loading.json", awS627S0100000_13, true);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC684380Qsu
    public final void LIZ(boolean z) {
        LIZJ.storeBoolean("dynamic_clicked", z);
    }

    @Override // X.InterfaceC684380Qsu
    public final void LIZIZ(Function2 function2, boolean z) {
        String str;
        if (C07IF.LIZ()) {
            if (z) {
                str = "tikbot_avatar_dark_new.png";
            } else {
                str = "tikbot_avatar_light_new.png";
            }
        } else if (z) {
            str = "tikbot_avatar_dark.png";
        } else {
            str = "tikbot_avatar_light.png";
        }
        getClass();
        LIZLLL("tiktok_bot_avatar_resource", str, function2, false);
    }

    public final void LJFF(Function2 function2, boolean z) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onboarding/");
        if (z) {
            str = "tako_icon_magicwand_dark_tux_lottie.json";
        } else {
            str = "tako_icon_magicwand_light_tux_lottie.json";
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        getClass();
        LIZLLL("tiktok_bot_avatar_resource", strLIZIZ, function2, false);
    }

    public static void LIZLLL(String str, String str2, Function2 function2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(File.separator);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str3 = LIZLLL;
        AwS192S1100000_13 awS192S1100000_13 = new AwS192S1100000_13(str2, str, function2, 0);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C366001bW(new C487401v6((Forest) C844360XAk.LIZ.getValue()), "", str3, str, strLIZIZ, z, awS192S1100000_13, null), 3);
    }
}
