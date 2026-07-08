package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21698319vx {
    public static final EnumC21698319vx ALREADY_EXISTS;
    public static final EnumC21698319vx FAILED;
    public static final /* synthetic */ EnumC21698319vx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21698319vx REPLACED;
    public static final EnumC21698319vx SHOWN;

    public static InterfaceC2044707zh<EnumC21698319vx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21698319vx enumC21698319vx = new EnumC21698319vx("SHOWN", 0);
        SHOWN = enumC21698319vx;
        EnumC21698319vx enumC21698319vx2 = new EnumC21698319vx("ALREADY_EXISTS", 1);
        ALREADY_EXISTS = enumC21698319vx2;
        EnumC21698319vx enumC21698319vx3 = new EnumC21698319vx("REPLACED", 2);
        REPLACED = enumC21698319vx3;
        EnumC21698319vx enumC21698319vx4 = new EnumC21698319vx("FAILED", 3);
        FAILED = enumC21698319vx4;
        EnumC21698319vx[] enumC21698319vxArr = {enumC21698319vx, enumC21698319vx2, enumC21698319vx3, enumC21698319vx4};
        LL = enumC21698319vxArr;
        LLILLJJLI = new C2254308sP(enumC21698319vxArr);
    }

    public static EnumC21698319vx[] values() {
        return (EnumC21698319vx[]) LL.clone();
    }

    public static EnumC21698319vx valueOf(String str) {
        return (EnumC21698319vx) C08FF.LIZ(EnumC21698319vx.class, str);
    }

    public EnumC21698319vx(String str, int i) {
    }
}
