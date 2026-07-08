package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC707330Rop {
    public static final EnumC707330Rop LL;
    public static final EnumC707330Rop LLILLJJLI;
    public static final EnumC707330Rop LLILLL;
    public static final /* synthetic */ EnumC707330Rop[] LLILZ;

    static {
        EnumC707330Rop enumC707330Rop = new EnumC707330Rop("REGULAR", 0);
        LL = enumC707330Rop;
        EnumC707330Rop enumC707330Rop2 = new EnumC707330Rop("BOUNDARY_SMALL", 1);
        LLILLJJLI = enumC707330Rop2;
        EnumC707330Rop enumC707330Rop3 = new EnumC707330Rop("BOUNDARY_SECONDARY", 2);
        LLILLL = enumC707330Rop3;
        EnumC707330Rop[] enumC707330RopArr = {enumC707330Rop, enumC707330Rop2, enumC707330Rop3};
        LLILZ = enumC707330RopArr;
        new C2254308sP(enumC707330RopArr);
    }

    public static EnumC707330Rop[] values() {
        return (EnumC707330Rop[]) LLILZ.clone();
    }

    public static EnumC707330Rop valueOf(String str) {
        return (EnumC707330Rop) C08FF.LIZ(EnumC707330Rop.class, str);
    }

    public EnumC707330Rop(String str, int i) {
    }
}
