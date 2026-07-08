package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC720070SMj {
    public static final C0SN6 Companion;
    public static final EnumC720070SMj FROM_DISKCACHE;
    public static final EnumC720070SMj FROM_MEMORYCACHE;
    public static final EnumC720070SMj FROM_NETWORK;
    public static final EnumC720070SMj FROM_UNKNOWN;
    public static final /* synthetic */ EnumC720070SMj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC720070SMj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC720070SMj enumC720070SMj = new EnumC720070SMj("FROM_NETWORK", 0, 0);
        FROM_NETWORK = enumC720070SMj;
        EnumC720070SMj enumC720070SMj2 = new EnumC720070SMj("FROM_MEMORYCACHE", 1, 1);
        FROM_MEMORYCACHE = enumC720070SMj2;
        EnumC720070SMj enumC720070SMj3 = new EnumC720070SMj("FROM_DISKCACHE", 2, 2);
        FROM_DISKCACHE = enumC720070SMj3;
        EnumC720070SMj enumC720070SMj4 = new EnumC720070SMj("FROM_UNKNOWN", 3, -1);
        FROM_UNKNOWN = enumC720070SMj4;
        EnumC720070SMj[] enumC720070SMjArr = {enumC720070SMj, enumC720070SMj2, enumC720070SMj3, enumC720070SMj4};
        LLILLJJLI = enumC720070SMjArr;
        LLILLL = new C2254308sP(enumC720070SMjArr);
        Companion = new C0SN6();
    }

    public static EnumC720070SMj[] values() {
        return (EnumC720070SMj[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC720070SMj valueOf(String str) {
        return (EnumC720070SMj) C08FF.LIZ(EnumC720070SMj.class, str);
    }

    public EnumC720070SMj(String str, int i, int i2) {
        this.LL = i2;
    }
}
