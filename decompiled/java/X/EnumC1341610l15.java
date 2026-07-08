package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1341610l15 {
    public static final EnumC1341610l15 FOLD;
    public static final EnumC1341610l15 HATE;
    public static final /* synthetic */ EnumC1341610l15[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1341610l15> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1341610l15 enumC1341610l15 = new EnumC1341610l15("HATE", 0);
        HATE = enumC1341610l15;
        EnumC1341610l15 enumC1341610l152 = new EnumC1341610l15("FOLD", 1);
        FOLD = enumC1341610l152;
        EnumC1341610l15[] enumC1341610l15Arr = {enumC1341610l15, enumC1341610l152};
        LL = enumC1341610l15Arr;
        LLILLJJLI = new C2254308sP(enumC1341610l15Arr);
    }

    public static EnumC1341610l15[] values() {
        return (EnumC1341610l15[]) LL.clone();
    }

    public static EnumC1341610l15 valueOf(String str) {
        return (EnumC1341610l15) C08FF.LIZ(EnumC1341610l15.class, str);
    }

    public EnumC1341610l15(String str, int i) {
    }
}
