package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC965730bEp {
    public static final EnumC965730bEp CROSS;
    public static final EnumC965730bEp INNER;
    public static final /* synthetic */ EnumC965730bEp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC965730bEp UNKNOWN;
    public final C1AZU LL;

    public static InterfaceC2044707zh<EnumC965730bEp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC965730bEp enumC965730bEp = new EnumC965730bEp("UNKNOWN", 0, C1AZU.Unknown);
        UNKNOWN = enumC965730bEp;
        EnumC965730bEp enumC965730bEp2 = new EnumC965730bEp("INNER", 1, C1AZU.Inner);
        INNER = enumC965730bEp2;
        EnumC965730bEp enumC965730bEp3 = new EnumC965730bEp("CROSS", 2, C1AZU.Cross);
        CROSS = enumC965730bEp3;
        EnumC965730bEp[] enumC965730bEpArr = {enumC965730bEp, enumC965730bEp2, enumC965730bEp3};
        LLILLJJLI = enumC965730bEpArr;
        LLILLL = new C2254308sP(enumC965730bEpArr);
    }

    public static EnumC965730bEp[] values() {
        return (EnumC965730bEp[]) LLILLJJLI.clone();
    }

    public final C1AZU getLinkArchType() {
        return this.LL;
    }

    public static EnumC965730bEp valueOf(String str) {
        return (EnumC965730bEp) C08FF.LIZ(EnumC965730bEp.class, str);
    }

    public EnumC965730bEp(String str, int i, C1AZU c1azu) {
        this.LL = c1azu;
    }
}
