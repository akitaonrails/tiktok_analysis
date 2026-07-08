package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586560MzW {
    public static final EnumC586560MzW DOWN;
    public static final /* synthetic */ EnumC586560MzW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586560MzW UP;

    public static InterfaceC2044707zh<EnumC586560MzW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586560MzW enumC586560MzW = new EnumC586560MzW("UP", 0);
        UP = enumC586560MzW;
        EnumC586560MzW enumC586560MzW2 = new EnumC586560MzW("DOWN", 1);
        DOWN = enumC586560MzW2;
        EnumC586560MzW[] enumC586560MzWArr = {enumC586560MzW, enumC586560MzW2};
        LL = enumC586560MzWArr;
        LLILLJJLI = new C2254308sP(enumC586560MzWArr);
    }

    public static EnumC586560MzW[] values() {
        return (EnumC586560MzW[]) LL.clone();
    }

    public static EnumC586560MzW valueOf(String str) {
        return (EnumC586560MzW) C08FF.LIZ(EnumC586560MzW.class, str);
    }

    public EnumC586560MzW(String str, int i) {
    }
}
