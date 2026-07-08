package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC654440Pli {
    public static final EnumC654440Pli COMMON;
    public static final C654450Plj Companion;
    public static final /* synthetic */ EnumC654440Pli[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC654440Pli OVERLAY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC654440Pli> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Plj] */
    static {
        EnumC654440Pli enumC654440Pli = new EnumC654440Pli("COMMON", 0, "common");
        COMMON = enumC654440Pli;
        EnumC654440Pli enumC654440Pli2 = new EnumC654440Pli("OVERLAY", 1, "overlay");
        OVERLAY = enumC654440Pli2;
        EnumC654440Pli[] enumC654440PliArr = {enumC654440Pli, enumC654440Pli2};
        LLILLJJLI = enumC654440PliArr;
        LLILLL = new C2254308sP(enumC654440PliArr);
        Companion = new Object() { // from class: X.0Plj
        };
    }

    public static EnumC654440Pli[] values() {
        return (EnumC654440Pli[]) LLILLJJLI.clone();
    }

    public final String getMobType() {
        return this.LL;
    }

    public static EnumC654440Pli valueOf(String str) {
        return (EnumC654440Pli) C08FF.LIZ(EnumC654440Pli.class, str);
    }

    public EnumC654440Pli(String str, int i, String str2) {
        this.LL = str2;
    }
}
