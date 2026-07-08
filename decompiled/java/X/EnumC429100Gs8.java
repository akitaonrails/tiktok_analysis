package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429100Gs8 {
    public static final /* synthetic */ EnumC429100Gs8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429100Gs8 PROGRESS;
    public static final EnumC429100Gs8 ROTATE;

    public static InterfaceC2044707zh<EnumC429100Gs8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429100Gs8 enumC429100Gs8 = new EnumC429100Gs8("ROTATE", 0);
        ROTATE = enumC429100Gs8;
        EnumC429100Gs8 enumC429100Gs82 = new EnumC429100Gs8("PROGRESS", 1);
        PROGRESS = enumC429100Gs82;
        EnumC429100Gs8[] enumC429100Gs8Arr = {enumC429100Gs8, enumC429100Gs82};
        LL = enumC429100Gs8Arr;
        LLILLJJLI = new C2254308sP(enumC429100Gs8Arr);
    }

    public static EnumC429100Gs8[] values() {
        return (EnumC429100Gs8[]) LL.clone();
    }

    public static EnumC429100Gs8 valueOf(String str) {
        return (EnumC429100Gs8) C08FF.LIZ(EnumC429100Gs8.class, str);
    }

    public EnumC429100Gs8(String str, int i) {
    }
}
