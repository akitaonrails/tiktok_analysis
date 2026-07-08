package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.15yA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20692815yA {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        return Keva.getRepo("TTSettingData").getBoolean("IsBackgroundAudioEnabled", false);
    }

    public static EnumC20692615y8 LIZ() {
        return EnumC20692615y8.values()[Keva.getRepo("TTSettingData").getInt("BackgroundAudioPlayOrder", ((C1488520oq2.LIZ() == 2 || C1488520oq2.LIZ() == 3) ? EnumC20692615y8.PLAY_IN_ORDER : EnumC20692615y8.REPEAT).ordinal())];
    }

    public static boolean LIZIZ() {
        return LIZJ() && C1488520oq2.LIZIZ();
    }
}
