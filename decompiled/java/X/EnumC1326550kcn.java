package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1326550kcn {
    public static final EnumC1326550kcn FIRST_REFRESH_CACHE;
    public static final /* synthetic */ EnumC1326550kcn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1326550kcn NOT_ENTERED;
    public static final EnumC1326550kcn SECOND_REFRESH_DONE;
    public static final EnumC1326550kcn SECOND_REFRESH_RENDER;

    public static InterfaceC2044707zh<EnumC1326550kcn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1326550kcn enumC1326550kcn = new EnumC1326550kcn("NOT_ENTERED", 0);
        NOT_ENTERED = enumC1326550kcn;
        EnumC1326550kcn enumC1326550kcn2 = new EnumC1326550kcn("FIRST_REFRESH_CACHE", 1);
        FIRST_REFRESH_CACHE = enumC1326550kcn2;
        EnumC1326550kcn enumC1326550kcn3 = new EnumC1326550kcn("SECOND_REFRESH_RENDER", 2);
        SECOND_REFRESH_RENDER = enumC1326550kcn3;
        EnumC1326550kcn enumC1326550kcn4 = new EnumC1326550kcn("SECOND_REFRESH_DONE", 3);
        SECOND_REFRESH_DONE = enumC1326550kcn4;
        EnumC1326550kcn[] enumC1326550kcnArr = {enumC1326550kcn, enumC1326550kcn2, enumC1326550kcn3, enumC1326550kcn4};
        LL = enumC1326550kcnArr;
        LLILLJJLI = new C2254308sP(enumC1326550kcnArr);
    }

    public static EnumC1326550kcn[] values() {
        return (EnumC1326550kcn[]) LL.clone();
    }

    public static EnumC1326550kcn valueOf(String str) {
        return (EnumC1326550kcn) C08FF.LIZ(EnumC1326550kcn.class, str);
    }

    public EnumC1326550kcn(String str, int i) {
    }
}
