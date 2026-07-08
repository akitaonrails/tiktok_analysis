package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0svB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1645470svB {
    public static final EnumC1645470svB CAMERA_FIRST_FRAME;
    public static final /* synthetic */ EnumC1645470svB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1645470svB UI_FIRST_FRAME;

    public static InterfaceC2044707zh<EnumC1645470svB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1645470svB enumC1645470svB = new EnumC1645470svB("CAMERA_FIRST_FRAME", 0);
        CAMERA_FIRST_FRAME = enumC1645470svB;
        EnumC1645470svB enumC1645470svB2 = new EnumC1645470svB("UI_FIRST_FRAME", 1);
        UI_FIRST_FRAME = enumC1645470svB2;
        EnumC1645470svB[] enumC1645470svBArr = {enumC1645470svB, enumC1645470svB2};
        LL = enumC1645470svBArr;
        LLILLJJLI = new C2254308sP(enumC1645470svBArr);
    }

    public static EnumC1645470svB[] values() {
        return (EnumC1645470svB[]) LL.clone();
    }

    public static EnumC1645470svB valueOf(String str) {
        return (EnumC1645470svB) C08FF.LIZ(EnumC1645470svB.class, str);
    }

    public EnumC1645470svB(String str, int i) {
    }
}
