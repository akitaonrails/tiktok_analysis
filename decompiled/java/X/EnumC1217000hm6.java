package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1217000hm6 {
    public static final C1217010hm7 Companion;
    public static final EnumC1217000hm6 GO_LIVE;
    public static final /* synthetic */ EnumC1217000hm6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC1217000hm6> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0hm7] */
    static {
        EnumC1217000hm6 enumC1217000hm6 = new EnumC1217000hm6();
        GO_LIVE = enumC1217000hm6;
        EnumC1217000hm6[] enumC1217000hm6Arr = {enumC1217000hm6};
        LLILLJJLI = enumC1217000hm6Arr;
        LLILLL = new C2254308sP(enumC1217000hm6Arr);
        Companion = new Object() { // from class: X.0hm7
        };
    }

    public static EnumC1217000hm6[] values() {
        return (EnumC1217000hm6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1217000hm6 valueOf(String str) {
        return (EnumC1217000hm6) C08FF.LIZ(EnumC1217000hm6.class, str);
    }
}
