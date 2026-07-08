package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC035300Al {
    public static final EnumC035300Al HINT_TYPE_ICON;
    public static final EnumC035300Al HINT_TYPE_NAME;
    public static final /* synthetic */ EnumC035300Al[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC035300Al> getEntries() {
        return LLILLL;
    }

    static {
        EnumC035300Al enumC035300Al = new EnumC035300Al("HINT_TYPE_ICON", 0, 0);
        HINT_TYPE_ICON = enumC035300Al;
        EnumC035300Al enumC035300Al2 = new EnumC035300Al("HINT_TYPE_NAME", 1, 1);
        HINT_TYPE_NAME = enumC035300Al2;
        EnumC035300Al[] enumC035300AlArr = {enumC035300Al, enumC035300Al2};
        LLILLJJLI = enumC035300AlArr;
        LLILLL = new C2254308sP(enumC035300AlArr);
    }

    public static EnumC035300Al[] values() {
        return (EnumC035300Al[]) LLILLJJLI.clone();
    }

    public final int getTypeVal() {
        return this.LL;
    }

    public static EnumC035300Al valueOf(String str) {
        return (EnumC035300Al) C08FF.LIZ(EnumC035300Al.class, str);
    }

    public EnumC035300Al(String str, int i, int i2) {
        this.LL = i2;
    }
}
