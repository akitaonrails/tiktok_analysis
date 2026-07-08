package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ci4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC320940Ci4 {
    public static final EnumC320940Ci4 BACKGROUND;
    public static final EnumC320940Ci4 IMMEDIATE;
    public static final /* synthetic */ EnumC320940Ci4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC320940Ci4 QUEUE;

    public static InterfaceC2044707zh<EnumC320940Ci4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC320940Ci4 enumC320940Ci4 = new EnumC320940Ci4("QUEUE", 0);
        QUEUE = enumC320940Ci4;
        EnumC320940Ci4 enumC320940Ci42 = new EnumC320940Ci4("IMMEDIATE", 1);
        IMMEDIATE = enumC320940Ci42;
        EnumC320940Ci4 enumC320940Ci43 = new EnumC320940Ci4("BACKGROUND", 2);
        BACKGROUND = enumC320940Ci43;
        EnumC320940Ci4[] enumC320940Ci4Arr = {enumC320940Ci4, enumC320940Ci42, enumC320940Ci43};
        LL = enumC320940Ci4Arr;
        LLILLJJLI = new C2254308sP(enumC320940Ci4Arr);
    }

    public static EnumC320940Ci4[] values() {
        return (EnumC320940Ci4[]) LL.clone();
    }

    public static EnumC320940Ci4 valueOf(String str) {
        return (EnumC320940Ci4) C08FF.LIZ(EnumC320940Ci4.class, str);
    }

    public EnumC320940Ci4(String str, int i) {
    }
}
