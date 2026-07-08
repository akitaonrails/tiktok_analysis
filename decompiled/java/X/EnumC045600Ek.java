package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC045600Ek {
    public static final /* synthetic */ EnumC045600Ek[] LL;

    static {
        EnumC045600Ek[] enumC045600EkArr = {new EnumC045600Ek("BAD_CREATOR", 0), new EnumC045600Ek("NOT_NO_RELATION", 1)};
        LL = enumC045600EkArr;
        new C2254308sP(enumC045600EkArr);
    }

    public static EnumC045600Ek[] values() {
        return (EnumC045600Ek[]) LL.clone();
    }

    public static EnumC045600Ek valueOf(String str) {
        return (EnumC045600Ek) C08FF.LIZ(EnumC045600Ek.class, str);
    }

    public EnumC045600Ek(String str, int i) {
    }
}
