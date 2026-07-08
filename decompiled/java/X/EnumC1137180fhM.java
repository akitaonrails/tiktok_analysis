package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1137180fhM {
    public static final /* synthetic */ EnumC1137180fhM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1137180fhM NONE;
    public static final EnumC1137180fhM NORMAL_TRAY_NO_ANIM;
    public static final EnumC1137180fhM NORMAL_TRAY_WITH_ANIM;
    public static final EnumC1137180fhM SMALL_TRAY_NEED_ANIM;
    public static final EnumC1137180fhM SMALL_TRAY_NO_ANIM;

    public static InterfaceC2044707zh<EnumC1137180fhM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1137180fhM enumC1137180fhM = new EnumC1137180fhM("NORMAL_TRAY_WITH_ANIM", 0);
        NORMAL_TRAY_WITH_ANIM = enumC1137180fhM;
        EnumC1137180fhM enumC1137180fhM2 = new EnumC1137180fhM("NORMAL_TRAY_NO_ANIM", 1);
        NORMAL_TRAY_NO_ANIM = enumC1137180fhM2;
        EnumC1137180fhM enumC1137180fhM3 = new EnumC1137180fhM("SMALL_TRAY_NEED_ANIM", 2);
        SMALL_TRAY_NEED_ANIM = enumC1137180fhM3;
        EnumC1137180fhM enumC1137180fhM4 = new EnumC1137180fhM("SMALL_TRAY_NO_ANIM", 3);
        SMALL_TRAY_NO_ANIM = enumC1137180fhM4;
        EnumC1137180fhM enumC1137180fhM5 = new EnumC1137180fhM("NONE", 4);
        NONE = enumC1137180fhM5;
        EnumC1137180fhM[] enumC1137180fhMArr = {enumC1137180fhM, enumC1137180fhM2, enumC1137180fhM3, enumC1137180fhM4, enumC1137180fhM5};
        LL = enumC1137180fhMArr;
        LLILLJJLI = new C2254308sP(enumC1137180fhMArr);
    }

    public static EnumC1137180fhM[] values() {
        return (EnumC1137180fhM[]) LL.clone();
    }

    public static EnumC1137180fhM valueOf(String str) {
        return (EnumC1137180fhM) C08FF.LIZ(EnumC1137180fhM.class, str);
    }

    public EnumC1137180fhM(String str, int i) {
    }
}
