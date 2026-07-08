package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC668740QKy {
    public static final EnumC668740QKy CANCEL;
    public static final EnumC668740QKy ENTER;
    public static final /* synthetic */ EnumC668740QKy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC668740QKy RETURN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC668740QKy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC668740QKy enumC668740QKy = new EnumC668740QKy("ENTER", 0, "enter");
        ENTER = enumC668740QKy;
        EnumC668740QKy enumC668740QKy2 = new EnumC668740QKy("RETURN", 1, "return");
        RETURN = enumC668740QKy2;
        EnumC668740QKy enumC668740QKy3 = new EnumC668740QKy("CANCEL", 2, "cancel");
        CANCEL = enumC668740QKy3;
        EnumC668740QKy[] enumC668740QKyArr = {enumC668740QKy, enumC668740QKy2, enumC668740QKy3};
        LLILLJJLI = enumC668740QKyArr;
        LLILLL = new C2254308sP(enumC668740QKyArr);
    }

    public static EnumC668740QKy[] values() {
        return (EnumC668740QKy[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC668740QKy valueOf(String str) {
        return (EnumC668740QKy) C08FF.LIZ(EnumC668740QKy.class, str);
    }

    public EnumC668740QKy(String str, int i, String str2) {
        this.LL = str2;
    }
}
