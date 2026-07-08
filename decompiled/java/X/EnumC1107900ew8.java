package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ew8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1107900ew8 {
    public static final EnumC1107900ew8 HYBRID;
    public static final /* synthetic */ EnumC1107900ew8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1107900ew8 NATIVE;

    public static InterfaceC2044707zh<EnumC1107900ew8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1107900ew8 enumC1107900ew8 = new EnumC1107900ew8("NATIVE", 0);
        NATIVE = enumC1107900ew8;
        EnumC1107900ew8 enumC1107900ew82 = new EnumC1107900ew8("HYBRID", 1);
        HYBRID = enumC1107900ew82;
        EnumC1107900ew8[] enumC1107900ew8Arr = {enumC1107900ew8, enumC1107900ew82};
        LL = enumC1107900ew8Arr;
        LLILLJJLI = new C2254308sP(enumC1107900ew8Arr);
    }

    public static EnumC1107900ew8[] values() {
        return (EnumC1107900ew8[]) LL.clone();
    }

    public static EnumC1107900ew8 valueOf(String str) {
        return (EnumC1107900ew8) C08FF.LIZ(EnumC1107900ew8.class, str);
    }

    public EnumC1107900ew8(String str, int i) {
    }
}
