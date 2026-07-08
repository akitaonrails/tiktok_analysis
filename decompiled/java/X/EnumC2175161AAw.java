package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2175161AAw {
    public static final /* synthetic */ EnumC2175161AAw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2175161AAw PAUSE;
    public static final EnumC2175161AAw UNBIND;
    public static final EnumC2175161AAw UNSELECTED;

    public static InterfaceC2044707zh<EnumC2175161AAw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2175161AAw enumC2175161AAw = new EnumC2175161AAw("UNSELECTED", 0);
        UNSELECTED = enumC2175161AAw;
        EnumC2175161AAw enumC2175161AAw2 = new EnumC2175161AAw("UNBIND", 1);
        UNBIND = enumC2175161AAw2;
        EnumC2175161AAw enumC2175161AAw3 = new EnumC2175161AAw("PAUSE", 2);
        PAUSE = enumC2175161AAw3;
        EnumC2175161AAw[] enumC2175161AAwArr = {enumC2175161AAw, enumC2175161AAw2, enumC2175161AAw3};
        LL = enumC2175161AAwArr;
        LLILLJJLI = new C2254308sP(enumC2175161AAwArr);
    }

    public static EnumC2175161AAw[] values() {
        return (EnumC2175161AAw[]) LL.clone();
    }

    public static EnumC2175161AAw valueOf(String str) {
        return (EnumC2175161AAw) C08FF.LIZ(EnumC2175161AAw.class, str);
    }

    public EnumC2175161AAw(String str, int i) {
    }
}
