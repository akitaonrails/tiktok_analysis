package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC887600Yru {
    public static final EnumC887600Yru EMPTY;
    public static final /* synthetic */ EnumC887600Yru[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC887600Yru LOADING;
    public static final EnumC887600Yru SUCCESS;

    public static InterfaceC2044707zh<EnumC887600Yru> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC887600Yru enumC887600Yru = new EnumC887600Yru("LOADING", 0);
        LOADING = enumC887600Yru;
        EnumC887600Yru enumC887600Yru2 = new EnumC887600Yru("EMPTY", 1);
        EMPTY = enumC887600Yru2;
        EnumC887600Yru enumC887600Yru3 = new EnumC887600Yru("SUCCESS", 2);
        SUCCESS = enumC887600Yru3;
        EnumC887600Yru[] enumC887600YruArr = {enumC887600Yru, enumC887600Yru2, enumC887600Yru3};
        LL = enumC887600YruArr;
        LLILLJJLI = new C2254308sP(enumC887600YruArr);
    }

    public static EnumC887600Yru[] values() {
        return (EnumC887600Yru[]) LL.clone();
    }

    public static EnumC887600Yru valueOf(String str) {
        return (EnumC887600Yru) C08FF.LIZ(EnumC887600Yru.class, str);
    }

    public EnumC887600Yru(String str, int i) {
    }
}
