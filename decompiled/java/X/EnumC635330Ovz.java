package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ovz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC635330Ovz {
    public static final EnumC635330Ovz FIRST;
    public static final EnumC635330Ovz LAST;
    public static final /* synthetic */ EnumC635330Ovz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC635330Ovz MIDDLE;
    public static final EnumC635330Ovz ONLY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC635330Ovz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC635330Ovz enumC635330Ovz = new EnumC635330Ovz("MIDDLE", 0, 0);
        MIDDLE = enumC635330Ovz;
        EnumC635330Ovz enumC635330Ovz2 = new EnumC635330Ovz("FIRST", 1, 1);
        FIRST = enumC635330Ovz2;
        EnumC635330Ovz enumC635330Ovz3 = new EnumC635330Ovz("LAST", 2, 2);
        LAST = enumC635330Ovz3;
        EnumC635330Ovz enumC635330Ovz4 = new EnumC635330Ovz("ONLY", 3, 3);
        ONLY = enumC635330Ovz4;
        EnumC635330Ovz[] enumC635330OvzArr = {enumC635330Ovz, enumC635330Ovz2, enumC635330Ovz3, enumC635330Ovz4};
        LLILLJJLI = enumC635330OvzArr;
        LLILLL = new C2254308sP(enumC635330OvzArr);
    }

    public static EnumC635330Ovz[] values() {
        return (EnumC635330Ovz[]) LLILLJJLI.clone();
    }

    public final int getPos() {
        return this.LL;
    }

    public static EnumC635330Ovz valueOf(String str) {
        return (EnumC635330Ovz) C08FF.LIZ(EnumC635330Ovz.class, str);
    }

    public EnumC635330Ovz(String str, int i, int i2) {
        this.LL = i2;
    }
}
