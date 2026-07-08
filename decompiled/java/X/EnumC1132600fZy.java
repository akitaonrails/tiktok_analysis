package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1132600fZy {
    public static final /* synthetic */ EnumC1132600fZy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1132600fZy SCENE_1_GIFT_PANEL;
    public static final EnumC1132600fZy SCENE_2_QUICK_GIFT;
    public static final EnumC1132600fZy SCENE_3_LIVE_GOAL;

    public static InterfaceC2044707zh<EnumC1132600fZy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1132600fZy enumC1132600fZy = new EnumC1132600fZy("SCENE_1_GIFT_PANEL", 0);
        SCENE_1_GIFT_PANEL = enumC1132600fZy;
        EnumC1132600fZy enumC1132600fZy2 = new EnumC1132600fZy("SCENE_2_QUICK_GIFT", 1);
        SCENE_2_QUICK_GIFT = enumC1132600fZy2;
        EnumC1132600fZy enumC1132600fZy3 = new EnumC1132600fZy("SCENE_3_LIVE_GOAL", 2);
        SCENE_3_LIVE_GOAL = enumC1132600fZy3;
        EnumC1132600fZy[] enumC1132600fZyArr = {enumC1132600fZy, enumC1132600fZy2, enumC1132600fZy3};
        LL = enumC1132600fZyArr;
        LLILLJJLI = new C2254308sP(enumC1132600fZyArr);
    }

    public static EnumC1132600fZy[] values() {
        return (EnumC1132600fZy[]) LL.clone();
    }

    public static EnumC1132600fZy valueOf(String str) {
        return (EnumC1132600fZy) C08FF.LIZ(EnumC1132600fZy.class, str);
    }

    public EnumC1132600fZy(String str, int i) {
    }
}
