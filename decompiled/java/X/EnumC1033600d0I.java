package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d0I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1033600d0I {
    public static final EnumC1033600d0I GET;
    public static final /* synthetic */ EnumC1033600d0I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1033600d0I POST;

    public static InterfaceC2044707zh<EnumC1033600d0I> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1033600d0I enumC1033600d0I = new EnumC1033600d0I("GET", 0);
        GET = enumC1033600d0I;
        EnumC1033600d0I enumC1033600d0I2 = new EnumC1033600d0I("POST", 1);
        POST = enumC1033600d0I2;
        EnumC1033600d0I[] enumC1033600d0IArr = {enumC1033600d0I, enumC1033600d0I2};
        LL = enumC1033600d0IArr;
        LLILLJJLI = new C2254308sP(enumC1033600d0IArr);
    }

    public static EnumC1033600d0I[] values() {
        return (EnumC1033600d0I[]) LL.clone();
    }

    public static EnumC1033600d0I valueOf(String str) {
        return (EnumC1033600d0I) C08FF.LIZ(EnumC1033600d0I.class, str);
    }

    public EnumC1033600d0I(String str, int i) {
    }
}
