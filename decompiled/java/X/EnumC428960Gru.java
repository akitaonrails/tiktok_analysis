package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC428960Gru {
    public static final EnumC428960Gru ERROR;
    public static final /* synthetic */ EnumC428960Gru[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC428960Gru NONE;
    public static final EnumC428960Gru SUCCESS;

    public static InterfaceC2044707zh<EnumC428960Gru> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC428960Gru enumC428960Gru = new EnumC428960Gru("ERROR", 0);
        ERROR = enumC428960Gru;
        EnumC428960Gru enumC428960Gru2 = new EnumC428960Gru("SUCCESS", 1);
        SUCCESS = enumC428960Gru2;
        EnumC428960Gru enumC428960Gru3 = new EnumC428960Gru("NONE", 2);
        NONE = enumC428960Gru3;
        EnumC428960Gru[] enumC428960GruArr = {enumC428960Gru, enumC428960Gru2, enumC428960Gru3};
        LL = enumC428960GruArr;
        LLILLJJLI = new C2254308sP(enumC428960GruArr);
    }

    public static EnumC428960Gru[] values() {
        return (EnumC428960Gru[]) LL.clone();
    }

    public static EnumC428960Gru valueOf(String str) {
        return (EnumC428960Gru) C08FF.LIZ(EnumC428960Gru.class, str);
    }

    public EnumC428960Gru(String str, int i) {
    }
}
