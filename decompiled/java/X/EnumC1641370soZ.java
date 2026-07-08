package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641370soZ {
    public static final EnumC1641370soZ FINISH;
    public static final /* synthetic */ EnumC1641370soZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641370soZ PAUSE;
    public static final EnumC1641370soZ RELOAD;
    public static final EnumC1641370soZ RESUME;
    public static final EnumC1641370soZ START;

    public static InterfaceC2044707zh<EnumC1641370soZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641370soZ enumC1641370soZ = new EnumC1641370soZ("START", 0);
        START = enumC1641370soZ;
        EnumC1641370soZ enumC1641370soZ2 = new EnumC1641370soZ("PAUSE", 1);
        PAUSE = enumC1641370soZ2;
        EnumC1641370soZ enumC1641370soZ3 = new EnumC1641370soZ("FINISH", 2);
        FINISH = enumC1641370soZ3;
        EnumC1641370soZ enumC1641370soZ4 = new EnumC1641370soZ("RELOAD", 3);
        RELOAD = enumC1641370soZ4;
        EnumC1641370soZ enumC1641370soZ5 = new EnumC1641370soZ("RESUME", 4);
        RESUME = enumC1641370soZ5;
        EnumC1641370soZ[] enumC1641370soZArr = {enumC1641370soZ, enumC1641370soZ2, enumC1641370soZ3, enumC1641370soZ4, enumC1641370soZ5};
        LL = enumC1641370soZArr;
        LLILLJJLI = new C2254308sP(enumC1641370soZArr);
    }

    public static EnumC1641370soZ[] values() {
        return (EnumC1641370soZ[]) LL.clone();
    }

    public static EnumC1641370soZ valueOf(String str) {
        return (EnumC1641370soZ) C08FF.LIZ(EnumC1641370soZ.class, str);
    }

    public EnumC1641370soZ(String str, int i) {
    }
}
