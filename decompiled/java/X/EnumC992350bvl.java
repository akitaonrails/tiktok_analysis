package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992350bvl {
    public static final /* synthetic */ EnumC992350bvl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992350bvl RETURN_TO_BIZ;
    public static final EnumC992350bvl STANDARD;

    public static InterfaceC2044707zh<EnumC992350bvl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992350bvl enumC992350bvl = new EnumC992350bvl("STANDARD", 0);
        STANDARD = enumC992350bvl;
        EnumC992350bvl enumC992350bvl2 = new EnumC992350bvl("RETURN_TO_BIZ", 1);
        RETURN_TO_BIZ = enumC992350bvl2;
        EnumC992350bvl[] enumC992350bvlArr = {enumC992350bvl, enumC992350bvl2};
        LL = enumC992350bvlArr;
        LLILLJJLI = new C2254308sP(enumC992350bvlArr);
    }

    public static EnumC992350bvl[] values() {
        return (EnumC992350bvl[]) LL.clone();
    }

    public static EnumC992350bvl valueOf(String str) {
        return (EnumC992350bvl) C08FF.LIZ(EnumC992350bvl.class, str);
    }

    public EnumC992350bvl(String str, int i) {
    }
}
