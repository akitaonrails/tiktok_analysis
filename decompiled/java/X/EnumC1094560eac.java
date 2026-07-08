package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1094560eac {
    public static final EnumC1094560eac ACTIVE;
    public static final EnumC1094560eac INACTIVE;
    public static final /* synthetic */ EnumC1094560eac[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1094560eac> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1094560eac enumC1094560eac = new EnumC1094560eac("ACTIVE", 0, 1L);
        ACTIVE = enumC1094560eac;
        EnumC1094560eac enumC1094560eac2 = new EnumC1094560eac("INACTIVE", 1, 2L);
        INACTIVE = enumC1094560eac2;
        EnumC1094560eac[] enumC1094560eacArr = {enumC1094560eac, enumC1094560eac2};
        LLILLJJLI = enumC1094560eacArr;
        LLILLL = new C2254308sP(enumC1094560eacArr);
    }

    public static EnumC1094560eac[] values() {
        return (EnumC1094560eac[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1094560eac valueOf(String str) {
        return (EnumC1094560eac) C08FF.LIZ(EnumC1094560eac.class, str);
    }

    public EnumC1094560eac(String str, int i, long j) {
        this.LL = j;
    }
}
