package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Od3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC623590Od3 {
    public static final EnumC623590Od3 EMPTY_RESULT;
    public static final EnumC623590Od3 ERROR;
    public static final /* synthetic */ EnumC623590Od3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC623590Od3 LOADING;
    public static final EnumC623590Od3 SUCCESS;

    public static InterfaceC2044707zh<EnumC623590Od3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC623590Od3 enumC623590Od3 = new EnumC623590Od3("LOADING", 0);
        LOADING = enumC623590Od3;
        EnumC623590Od3 enumC623590Od32 = new EnumC623590Od3("SUCCESS", 1);
        SUCCESS = enumC623590Od32;
        EnumC623590Od3 enumC623590Od33 = new EnumC623590Od3("ERROR", 2);
        ERROR = enumC623590Od33;
        EnumC623590Od3 enumC623590Od34 = new EnumC623590Od3("EMPTY_RESULT", 3);
        EMPTY_RESULT = enumC623590Od34;
        EnumC623590Od3[] enumC623590Od3Arr = {enumC623590Od3, enumC623590Od32, enumC623590Od33, enumC623590Od34};
        LL = enumC623590Od3Arr;
        LLILLJJLI = new C2254308sP(enumC623590Od3Arr);
    }

    public static EnumC623590Od3[] values() {
        return (EnumC623590Od3[]) LL.clone();
    }

    public static EnumC623590Od3 valueOf(String str) {
        return (EnumC623590Od3) C08FF.LIZ(EnumC623590Od3.class, str);
    }

    public EnumC623590Od3(String str, int i) {
    }
}
