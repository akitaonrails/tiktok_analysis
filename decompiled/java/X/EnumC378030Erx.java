package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Erx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC378030Erx {
    public static final EnumC378030Erx FL2V;
    public static final EnumC378030Erx I2I;
    public static final EnumC378030Erx I2V;
    public static final /* synthetic */ EnumC378030Erx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC378030Erx NONE;
    public static final EnumC378030Erx T2I;
    public static final EnumC378030Erx T2V;
    public static final EnumC378030Erx V2V;

    public static InterfaceC2044707zh<EnumC378030Erx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC378030Erx enumC378030Erx = new EnumC378030Erx("NONE", 0);
        NONE = enumC378030Erx;
        EnumC378030Erx enumC378030Erx2 = new EnumC378030Erx("T2I", 1);
        T2I = enumC378030Erx2;
        EnumC378030Erx enumC378030Erx3 = new EnumC378030Erx("I2I", 2);
        I2I = enumC378030Erx3;
        EnumC378030Erx enumC378030Erx4 = new EnumC378030Erx("T2V", 3);
        T2V = enumC378030Erx4;
        EnumC378030Erx enumC378030Erx5 = new EnumC378030Erx("I2V", 4);
        I2V = enumC378030Erx5;
        EnumC378030Erx enumC378030Erx6 = new EnumC378030Erx("FL2V", 5);
        FL2V = enumC378030Erx6;
        EnumC378030Erx enumC378030Erx7 = new EnumC378030Erx("V2V", 6);
        V2V = enumC378030Erx7;
        EnumC378030Erx[] enumC378030ErxArr = {enumC378030Erx, enumC378030Erx2, enumC378030Erx3, enumC378030Erx4, enumC378030Erx5, enumC378030Erx6, enumC378030Erx7};
        LL = enumC378030ErxArr;
        LLILLJJLI = new C2254308sP(enumC378030ErxArr);
    }

    public static EnumC378030Erx[] values() {
        return (EnumC378030Erx[]) LL.clone();
    }

    public static EnumC378030Erx valueOf(String str) {
        return (EnumC378030Erx) C08FF.LIZ(EnumC378030Erx.class, str);
    }

    public EnumC378030Erx(String str, int i) {
    }
}
