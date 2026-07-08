package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779870wPx {
    public static final EnumC1779870wPx FOLDED;
    public static final /* synthetic */ EnumC1779870wPx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779870wPx UNFOLDED;
    public static final EnumC1779870wPx UNKNOWN;

    public static InterfaceC2044707zh<EnumC1779870wPx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779870wPx enumC1779870wPx = new EnumC1779870wPx("UNFOLDED", 0);
        UNFOLDED = enumC1779870wPx;
        EnumC1779870wPx enumC1779870wPx2 = new EnumC1779870wPx("FOLDED", 1);
        FOLDED = enumC1779870wPx2;
        EnumC1779870wPx enumC1779870wPx3 = new EnumC1779870wPx("UNKNOWN", 2);
        UNKNOWN = enumC1779870wPx3;
        EnumC1779870wPx[] enumC1779870wPxArr = {enumC1779870wPx, enumC1779870wPx2, enumC1779870wPx3};
        LL = enumC1779870wPxArr;
        LLILLJJLI = new C2254308sP(enumC1779870wPxArr);
    }

    public static EnumC1779870wPx[] values() {
        return (EnumC1779870wPx[]) LL.clone();
    }

    public static EnumC1779870wPx valueOf(String str) {
        return (EnumC1779870wPx) C08FF.LIZ(EnumC1779870wPx.class, str);
    }

    public EnumC1779870wPx(String str, int i) {
    }
}
