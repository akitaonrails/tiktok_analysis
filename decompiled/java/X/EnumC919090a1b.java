package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC919090a1b {
    public static final EnumC919090a1b CLICK;
    public static final /* synthetic */ EnumC919090a1b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC919090a1b SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC919090a1b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC919090a1b enumC919090a1b = new EnumC919090a1b("CLICK", 0, "click");
        CLICK = enumC919090a1b;
        EnumC919090a1b enumC919090a1b2 = new EnumC919090a1b("SHOW", 1, "show");
        SHOW = enumC919090a1b2;
        EnumC919090a1b[] enumC919090a1bArr = {enumC919090a1b, enumC919090a1b2};
        LLILLJJLI = enumC919090a1bArr;
        LLILLL = new C2254308sP(enumC919090a1bArr);
    }

    public static EnumC919090a1b[] values() {
        return (EnumC919090a1b[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC919090a1b valueOf(String str) {
        return (EnumC919090a1b) C08FF.LIZ(EnumC919090a1b.class, str);
    }

    public EnumC919090a1b(String str, int i, String str2) {
        this.LL = str2;
    }
}
