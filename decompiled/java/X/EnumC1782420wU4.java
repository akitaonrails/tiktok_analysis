package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782420wU4 {
    public static final /* synthetic */ EnumC1782420wU4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782420wU4 closed;
    public final String LL = "closed";

    public static InterfaceC2044707zh<EnumC1782420wU4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782420wU4 enumC1782420wU4 = new EnumC1782420wU4();
        closed = enumC1782420wU4;
        EnumC1782420wU4[] enumC1782420wU4Arr = {enumC1782420wU4};
        LLILLJJLI = enumC1782420wU4Arr;
        LLILLL = new C2254308sP(enumC1782420wU4Arr);
    }

    public static EnumC1782420wU4[] values() {
        return (EnumC1782420wU4[]) LLILLJJLI.clone();
    }

    public final String getActionType() {
        return this.LL;
    }

    public static EnumC1782420wU4 valueOf(String str) {
        return (EnumC1782420wU4) C08FF.LIZ(EnumC1782420wU4.class, str);
    }
}
