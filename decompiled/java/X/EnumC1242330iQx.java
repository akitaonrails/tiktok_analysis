package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1242330iQx {
    public static final EnumC1242330iQx COLLAPSE;
    public static final EnumC1242330iQx EXPAND;
    public static final /* synthetic */ EnumC1242330iQx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1242330iQx UNKNOWN;

    public static InterfaceC2044707zh<EnumC1242330iQx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1242330iQx enumC1242330iQx = new EnumC1242330iQx("UNKNOWN", 0);
        UNKNOWN = enumC1242330iQx;
        EnumC1242330iQx enumC1242330iQx2 = new EnumC1242330iQx("COLLAPSE", 1);
        COLLAPSE = enumC1242330iQx2;
        EnumC1242330iQx enumC1242330iQx3 = new EnumC1242330iQx("EXPAND", 2);
        EXPAND = enumC1242330iQx3;
        EnumC1242330iQx[] enumC1242330iQxArr = {enumC1242330iQx, enumC1242330iQx2, enumC1242330iQx3};
        LL = enumC1242330iQxArr;
        LLILLJJLI = new C2254308sP(enumC1242330iQxArr);
    }

    public static EnumC1242330iQx[] values() {
        return (EnumC1242330iQx[]) LL.clone();
    }

    public static EnumC1242330iQx valueOf(String str) {
        return (EnumC1242330iQx) C08FF.LIZ(EnumC1242330iQx.class, str);
    }

    public EnumC1242330iQx(String str, int i) {
    }
}
