package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1005390cGn {
    public static final EnumC1005390cGn ASKING;
    public static final EnumC1005390cGn CHECKED;
    public static final EnumC1005390cGn DONE;
    public static final EnumC1005390cGn INITIAL;
    public static final /* synthetic */ EnumC1005390cGn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1005390cGn SYNCED;

    public static InterfaceC2044707zh<EnumC1005390cGn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1005390cGn enumC1005390cGn = new EnumC1005390cGn("INITIAL", 0);
        INITIAL = enumC1005390cGn;
        EnumC1005390cGn enumC1005390cGn2 = new EnumC1005390cGn("ASKING", 1);
        ASKING = enumC1005390cGn2;
        EnumC1005390cGn enumC1005390cGn3 = new EnumC1005390cGn("CHECKED", 2);
        CHECKED = enumC1005390cGn3;
        EnumC1005390cGn enumC1005390cGn4 = new EnumC1005390cGn("SYNCED", 3);
        SYNCED = enumC1005390cGn4;
        EnumC1005390cGn enumC1005390cGn5 = new EnumC1005390cGn("DONE", 4);
        DONE = enumC1005390cGn5;
        EnumC1005390cGn[] enumC1005390cGnArr = {enumC1005390cGn, enumC1005390cGn2, enumC1005390cGn3, enumC1005390cGn4, enumC1005390cGn5};
        LL = enumC1005390cGnArr;
        LLILLJJLI = new C2254308sP(enumC1005390cGnArr);
    }

    public static EnumC1005390cGn[] values() {
        return (EnumC1005390cGn[]) LL.clone();
    }

    public static EnumC1005390cGn valueOf(String str) {
        return (EnumC1005390cGn) C08FF.LIZ(EnumC1005390cGn.class, str);
    }

    public EnumC1005390cGn(String str, int i) {
    }
}
