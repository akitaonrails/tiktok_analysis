package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ze0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC904460Ze0 {
    public static final EnumC904460Ze0 GROUP;
    public static final /* synthetic */ EnumC904460Ze0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC904460Ze0 PRIVATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC904460Ze0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC904460Ze0 enumC904460Ze0 = new EnumC904460Ze0("PRIVATE", 0, "private");
        PRIVATE = enumC904460Ze0;
        EnumC904460Ze0 enumC904460Ze02 = new EnumC904460Ze0("GROUP", 1, "group");
        GROUP = enumC904460Ze02;
        EnumC904460Ze0[] enumC904460Ze0Arr = {enumC904460Ze0, enumC904460Ze02};
        LLILLJJLI = enumC904460Ze0Arr;
        LLILLL = new C2254308sP(enumC904460Ze0Arr);
    }

    public static EnumC904460Ze0[] values() {
        return (EnumC904460Ze0[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC904460Ze0 valueOf(String str) {
        return (EnumC904460Ze0) C08FF.LIZ(EnumC904460Ze0.class, str);
    }

    public EnumC904460Ze0(String str, int i, String str2) {
        this.LL = str2;
    }
}
