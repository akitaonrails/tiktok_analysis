package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1178550gm5 {
    public static final EnumC1178550gm5 INITIAL_POSITION;
    public static final EnumC1178550gm5 INVALID_POSITION;
    public static final /* synthetic */ EnumC1178550gm5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1178550gm5 POSITION_CHANGED;

    public static InterfaceC2044707zh<EnumC1178550gm5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1178550gm5 enumC1178550gm5 = new EnumC1178550gm5("INITIAL_POSITION", 0);
        INITIAL_POSITION = enumC1178550gm5;
        EnumC1178550gm5 enumC1178550gm52 = new EnumC1178550gm5("POSITION_CHANGED", 1);
        POSITION_CHANGED = enumC1178550gm52;
        EnumC1178550gm5 enumC1178550gm53 = new EnumC1178550gm5("INVALID_POSITION", 2);
        INVALID_POSITION = enumC1178550gm53;
        EnumC1178550gm5[] enumC1178550gm5Arr = {enumC1178550gm5, enumC1178550gm52, enumC1178550gm53};
        LL = enumC1178550gm5Arr;
        LLILLJJLI = new C2254308sP(enumC1178550gm5Arr);
    }

    public static EnumC1178550gm5[] values() {
        return (EnumC1178550gm5[]) LL.clone();
    }

    public static EnumC1178550gm5 valueOf(String str) {
        return (EnumC1178550gm5) C08FF.LIZ(EnumC1178550gm5.class, str);
    }

    public EnumC1178550gm5(String str, int i) {
    }
}
