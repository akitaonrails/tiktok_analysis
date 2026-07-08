package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC041600Cw {
    public static final EnumC041600Cw END;
    public static final /* synthetic */ EnumC041600Cw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC041600Cw START;

    public static InterfaceC2044707zh<EnumC041600Cw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC041600Cw enumC041600Cw = new EnumC041600Cw("START", 0);
        START = enumC041600Cw;
        EnumC041600Cw enumC041600Cw2 = new EnumC041600Cw("END", 1);
        END = enumC041600Cw2;
        EnumC041600Cw[] enumC041600CwArr = {enumC041600Cw, enumC041600Cw2};
        LL = enumC041600CwArr;
        LLILLJJLI = new C2254308sP(enumC041600CwArr);
    }

    public static EnumC041600Cw[] values() {
        return (EnumC041600Cw[]) LL.clone();
    }

    public static EnumC041600Cw valueOf(String str) {
        return (EnumC041600Cw) C08FF.LIZ(EnumC041600Cw.class, str);
    }

    public EnumC041600Cw(String str, int i) {
    }
}
