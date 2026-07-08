package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ljB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1368950ljB {
    public static final EnumC1368950ljB ERROR;
    public static final EnumC1368950ljB INIT;
    public static final /* synthetic */ EnumC1368950ljB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1368950ljB LOADED;
    public static final EnumC1368950ljB LOADING;
    public static final EnumC1368950ljB SEARCH_LOADING;

    public static InterfaceC2044707zh<EnumC1368950ljB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1368950ljB enumC1368950ljB = new EnumC1368950ljB("INIT", 0);
        INIT = enumC1368950ljB;
        EnumC1368950ljB enumC1368950ljB2 = new EnumC1368950ljB("LOADING", 1);
        LOADING = enumC1368950ljB2;
        EnumC1368950ljB enumC1368950ljB3 = new EnumC1368950ljB("SEARCH_LOADING", 2);
        SEARCH_LOADING = enumC1368950ljB3;
        EnumC1368950ljB enumC1368950ljB4 = new EnumC1368950ljB("ERROR", 3);
        ERROR = enumC1368950ljB4;
        EnumC1368950ljB enumC1368950ljB5 = new EnumC1368950ljB("LOADED", 4);
        LOADED = enumC1368950ljB5;
        EnumC1368950ljB[] enumC1368950ljBArr = {enumC1368950ljB, enumC1368950ljB2, enumC1368950ljB3, enumC1368950ljB4, enumC1368950ljB5};
        LL = enumC1368950ljBArr;
        LLILLJJLI = new C2254308sP(enumC1368950ljBArr);
    }

    public static EnumC1368950ljB[] values() {
        return (EnumC1368950ljB[]) LL.clone();
    }

    public static EnumC1368950ljB valueOf(String str) {
        return (EnumC1368950ljB) C08FF.LIZ(EnumC1368950ljB.class, str);
    }

    public EnumC1368950ljB(String str, int i) {
    }
}
