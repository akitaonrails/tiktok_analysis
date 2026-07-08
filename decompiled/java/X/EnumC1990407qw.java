package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990407qw {
    public static final /* synthetic */ EnumC1990407qw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1990407qw LOAD_DONE;
    public static final EnumC1990407qw LOAD_IDLE;
    public static final EnumC1990407qw LOAD_ING;

    public static InterfaceC2044707zh<EnumC1990407qw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1990407qw enumC1990407qw = new EnumC1990407qw("LOAD_IDLE", 0);
        LOAD_IDLE = enumC1990407qw;
        EnumC1990407qw enumC1990407qw2 = new EnumC1990407qw("LOAD_ING", 1);
        LOAD_ING = enumC1990407qw2;
        EnumC1990407qw enumC1990407qw3 = new EnumC1990407qw("LOAD_DONE", 2);
        LOAD_DONE = enumC1990407qw3;
        EnumC1990407qw[] enumC1990407qwArr = {enumC1990407qw, enumC1990407qw2, enumC1990407qw3};
        LL = enumC1990407qwArr;
        LLILLJJLI = new C2254308sP(enumC1990407qwArr);
    }

    public static EnumC1990407qw[] values() {
        return (EnumC1990407qw[]) LL.clone();
    }

    public static EnumC1990407qw valueOf(String str) {
        return (EnumC1990407qw) C08FF.LIZ(EnumC1990407qw.class, str);
    }

    public EnumC1990407qw(String str, int i) {
    }
}
