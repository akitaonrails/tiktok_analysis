package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zrd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC912910Zrd {
    public static final /* synthetic */ EnumC912910Zrd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC912910Zrd NINETY;
    public static final EnumC912910Zrd NONE;
    public static final EnumC912910Zrd SEVEN;
    public static final EnumC912910Zrd SIX;
    public final double LL;

    public static InterfaceC2044707zh<EnumC912910Zrd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC912910Zrd enumC912910Zrd = new EnumC912910Zrd("NINETY", 0, 0.95d);
        NINETY = enumC912910Zrd;
        EnumC912910Zrd enumC912910Zrd2 = new EnumC912910Zrd("SEVEN", 1, 0.73d);
        SEVEN = enumC912910Zrd2;
        EnumC912910Zrd enumC912910Zrd3 = new EnumC912910Zrd("SIX", 2, 0.6d);
        SIX = enumC912910Zrd3;
        EnumC912910Zrd enumC912910Zrd4 = new EnumC912910Zrd("NONE", 3, 0.0d);
        NONE = enumC912910Zrd4;
        EnumC912910Zrd[] enumC912910ZrdArr = {enumC912910Zrd, enumC912910Zrd2, enumC912910Zrd3, enumC912910Zrd4};
        LLILLJJLI = enumC912910ZrdArr;
        LLILLL = new C2254308sP(enumC912910ZrdArr);
    }

    public static EnumC912910Zrd[] values() {
        return (EnumC912910Zrd[]) LLILLJJLI.clone();
    }

    public final double getRatio() {
        return this.LL;
    }

    public static EnumC912910Zrd valueOf(String str) {
        return (EnumC912910Zrd) C08FF.LIZ(EnumC912910Zrd.class, str);
    }

    public EnumC912910Zrd(String str, int i, double d) {
        this.LL = d;
    }
}
