package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1007380cK0 {
    public static final EnumC1007380cK0 ACTIVE;
    public static final EnumC1007380cK0 COUNT;
    public static final EnumC1007380cK0 COUNT_WITH_RED_DOT;
    public static final /* synthetic */ EnumC1007380cK0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1007380cK0 TOP_NEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1007380cK0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1007380cK0 enumC1007380cK0 = new EnumC1007380cK0("COUNT", 0, 1);
        COUNT = enumC1007380cK0;
        EnumC1007380cK0 enumC1007380cK02 = new EnumC1007380cK0("COUNT_WITH_RED_DOT", 1, 2);
        COUNT_WITH_RED_DOT = enumC1007380cK02;
        EnumC1007380cK0 enumC1007380cK03 = new EnumC1007380cK0("TOP_NEW", 2, 3);
        TOP_NEW = enumC1007380cK03;
        EnumC1007380cK0 enumC1007380cK04 = new EnumC1007380cK0("ACTIVE", 3, 4);
        ACTIVE = enumC1007380cK04;
        EnumC1007380cK0[] enumC1007380cK0Arr = {enumC1007380cK0, enumC1007380cK02, enumC1007380cK03, enumC1007380cK04};
        LLILLJJLI = enumC1007380cK0Arr;
        LLILLL = new C2254308sP(enumC1007380cK0Arr);
    }

    public static EnumC1007380cK0[] values() {
        return (EnumC1007380cK0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1007380cK0 valueOf(String str) {
        return (EnumC1007380cK0) C08FF.LIZ(EnumC1007380cK0.class, str);
    }

    public EnumC1007380cK0(String str, int i, int i2) {
        this.LL = i2;
    }
}
