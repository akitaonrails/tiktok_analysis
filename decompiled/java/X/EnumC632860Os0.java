package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Os0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC632860Os0 {
    public static final C632870Os1 Companion;
    public static final EnumC632860Os0 FOLLOWING;
    public static final /* synthetic */ EnumC632860Os0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC632860Os0 REQUESTED;
    public static final EnumC632860Os0 TO_FOLLOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC632860Os0> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Os1] */
    static {
        EnumC632860Os0 enumC632860Os0 = new EnumC632860Os0("TO_FOLLOW", 0, 0);
        TO_FOLLOW = enumC632860Os0;
        EnumC632860Os0 enumC632860Os02 = new EnumC632860Os0("FOLLOWING", 1, 1);
        FOLLOWING = enumC632860Os02;
        EnumC632860Os0 enumC632860Os03 = new EnumC632860Os0("REQUESTED", 2, 4);
        REQUESTED = enumC632860Os03;
        EnumC632860Os0[] enumC632860Os0Arr = {enumC632860Os0, enumC632860Os02, enumC632860Os03};
        LLILLJJLI = enumC632860Os0Arr;
        LLILLL = new C2254308sP(enumC632860Os0Arr);
        Companion = new Object() { // from class: X.0Os1
        };
    }

    public static EnumC632860Os0[] values() {
        return (EnumC632860Os0[]) LLILLJJLI.clone();
    }

    public final int getStatusInt() {
        return this.LL;
    }

    public static EnumC632860Os0 valueOf(String str) {
        return (EnumC632860Os0) C08FF.LIZ(EnumC632860Os0.class, str);
    }

    public EnumC632860Os0(String str, int i, int i2) {
        this.LL = i2;
    }
}
