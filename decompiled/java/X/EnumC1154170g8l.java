package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154170g8l {
    public static final /* synthetic */ EnumC1154170g8l[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154170g8l PENDING;
    public static final EnumC1154170g8l PURCHASED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154170g8l> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154170g8l enumC1154170g8l = new EnumC1154170g8l("PENDING", 0, 2);
        PENDING = enumC1154170g8l;
        EnumC1154170g8l enumC1154170g8l2 = new EnumC1154170g8l("PURCHASED", 1, 1);
        PURCHASED = enumC1154170g8l2;
        EnumC1154170g8l[] enumC1154170g8lArr = {enumC1154170g8l, enumC1154170g8l2};
        LLILLJJLI = enumC1154170g8lArr;
        LLILLL = new C2254308sP(enumC1154170g8lArr);
    }

    public static EnumC1154170g8l[] values() {
        return (EnumC1154170g8l[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1154170g8l valueOf(String str) {
        return (EnumC1154170g8l) C08FF.LIZ(EnumC1154170g8l.class, str);
    }

    public EnumC1154170g8l(String str, int i, int i2) {
        this.LL = i2;
    }
}
