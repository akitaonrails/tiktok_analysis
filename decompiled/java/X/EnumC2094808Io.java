package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2094808Io {
    public static final EnumC2094808Io BACKGROUND;
    public static final /* synthetic */ EnumC2094808Io[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2094808Io PRECISE_OFF;
    public static final EnumC2094808Io PRECISE_ON;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2094808Io> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2094808Io enumC2094808Io = new EnumC2094808Io("PRECISE_OFF", 0, 0);
        PRECISE_OFF = enumC2094808Io;
        EnumC2094808Io enumC2094808Io2 = new EnumC2094808Io("PRECISE_ON", 1, 1);
        PRECISE_ON = enumC2094808Io2;
        EnumC2094808Io enumC2094808Io3 = new EnumC2094808Io("BACKGROUND", 2, 2);
        BACKGROUND = enumC2094808Io3;
        EnumC2094808Io[] enumC2094808IoArr = {enumC2094808Io, enumC2094808Io2, enumC2094808Io3};
        LLILLJJLI = enumC2094808IoArr;
        LLILLL = new C2254308sP(enumC2094808IoArr);
    }

    public static EnumC2094808Io[] values() {
        return (EnumC2094808Io[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2094808Io valueOf(String str) {
        return (EnumC2094808Io) C08FF.LIZ(EnumC2094808Io.class, str);
    }

    public EnumC2094808Io(String str, int i, int i2) {
        this.LL = i2;
    }
}
