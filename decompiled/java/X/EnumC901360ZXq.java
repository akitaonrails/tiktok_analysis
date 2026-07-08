package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC901360ZXq {
    public static final /* synthetic */ EnumC901360ZXq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC901360ZXq PRIVATE;
    public static final EnumC901360ZXq PRIVATE_GROUP;
    public static final EnumC901360ZXq PUBLIC_GROUP;
    public static final EnumC901360ZXq UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC901360ZXq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC901360ZXq enumC901360ZXq = new EnumC901360ZXq("UNKNOWN", 0, 0);
        UNKNOWN = enumC901360ZXq;
        EnumC901360ZXq enumC901360ZXq2 = new EnumC901360ZXq("PRIVATE", 1, 1);
        PRIVATE = enumC901360ZXq2;
        EnumC901360ZXq enumC901360ZXq3 = new EnumC901360ZXq("PRIVATE_GROUP", 2, 2);
        PRIVATE_GROUP = enumC901360ZXq3;
        EnumC901360ZXq enumC901360ZXq4 = new EnumC901360ZXq("PUBLIC_GROUP", 3, 3);
        PUBLIC_GROUP = enumC901360ZXq4;
        EnumC901360ZXq[] enumC901360ZXqArr = {enumC901360ZXq, enumC901360ZXq2, enumC901360ZXq3, enumC901360ZXq4};
        LLILLJJLI = enumC901360ZXqArr;
        LLILLL = new C2254308sP(enumC901360ZXqArr);
    }

    public static EnumC901360ZXq[] values() {
        return (EnumC901360ZXq[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC901360ZXq valueOf(String str) {
        return (EnumC901360ZXq) C08FF.LIZ(EnumC901360ZXq.class, str);
    }

    public EnumC901360ZXq(String str, int i, int i2) {
        this.LL = i2;
    }
}
