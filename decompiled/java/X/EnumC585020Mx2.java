package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585020Mx2 {
    public static final EnumC585020Mx2 BY_TYPE;
    public static final /* synthetic */ EnumC585020Mx2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585020Mx2 TOTAL;

    public static InterfaceC2044707zh<EnumC585020Mx2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585020Mx2 enumC585020Mx2 = new EnumC585020Mx2("BY_TYPE", 0);
        BY_TYPE = enumC585020Mx2;
        EnumC585020Mx2 enumC585020Mx22 = new EnumC585020Mx2("TOTAL", 1);
        TOTAL = enumC585020Mx22;
        EnumC585020Mx2[] enumC585020Mx2Arr = {enumC585020Mx2, enumC585020Mx22};
        LL = enumC585020Mx2Arr;
        LLILLJJLI = new C2254308sP(enumC585020Mx2Arr);
    }

    public static EnumC585020Mx2[] values() {
        return (EnumC585020Mx2[]) LL.clone();
    }

    public static EnumC585020Mx2 valueOf(String str) {
        return (EnumC585020Mx2) C08FF.LIZ(EnumC585020Mx2.class, str);
    }

    public EnumC585020Mx2(String str, int i) {
    }
}
