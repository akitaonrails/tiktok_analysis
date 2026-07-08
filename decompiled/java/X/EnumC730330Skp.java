package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Skp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC730330Skp {
    public static final EnumC730330Skp HAS_DATA;
    public static final /* synthetic */ EnumC730330Skp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC730330Skp NO_DATA;
    public static final EnumC730330Skp NULL;

    public static InterfaceC2044707zh<EnumC730330Skp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC730330Skp enumC730330Skp = new EnumC730330Skp("HAS_DATA", 0);
        HAS_DATA = enumC730330Skp;
        EnumC730330Skp enumC730330Skp2 = new EnumC730330Skp("NO_DATA", 1);
        NO_DATA = enumC730330Skp2;
        EnumC730330Skp enumC730330Skp3 = new EnumC730330Skp("NULL", 2);
        NULL = enumC730330Skp3;
        EnumC730330Skp[] enumC730330SkpArr = {enumC730330Skp, enumC730330Skp2, enumC730330Skp3};
        LL = enumC730330SkpArr;
        LLILLJJLI = new C2254308sP(enumC730330SkpArr);
    }

    public static EnumC730330Skp[] values() {
        return (EnumC730330Skp[]) LL.clone();
    }

    public static EnumC730330Skp valueOf(String str) {
        return (EnumC730330Skp) C08FF.LIZ(EnumC730330Skp.class, str);
    }

    public EnumC730330Skp(String str, int i) {
    }
}
