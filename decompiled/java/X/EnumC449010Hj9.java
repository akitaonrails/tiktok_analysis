package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC449010Hj9 {
    public static final /* synthetic */ EnumC449010Hj9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC449010Hj9 USE_DEEP_LINK;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC449010Hj9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC449010Hj9 enumC449010Hj9 = new EnumC449010Hj9();
        USE_DEEP_LINK = enumC449010Hj9;
        EnumC449010Hj9[] enumC449010Hj9Arr = {enumC449010Hj9};
        LLILLJJLI = enumC449010Hj9Arr;
        LLILLL = new C2254308sP(enumC449010Hj9Arr);
    }

    public static EnumC449010Hj9[] values() {
        return (EnumC449010Hj9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC449010Hj9 valueOf(String str) {
        return (EnumC449010Hj9) C08FF.LIZ(EnumC449010Hj9.class, str);
    }
}
