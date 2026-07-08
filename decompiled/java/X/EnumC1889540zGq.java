package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1889540zGq {
    public static final /* synthetic */ EnumC1889540zGq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1889540zGq SHOW_ERROR;
    public static final EnumC1889540zGq SHOW_LOADING;
    public static final EnumC1889540zGq SHOW_SUCCESS;

    public static InterfaceC2044707zh<EnumC1889540zGq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1889540zGq enumC1889540zGq = new EnumC1889540zGq("SHOW_SUCCESS", 0);
        SHOW_SUCCESS = enumC1889540zGq;
        EnumC1889540zGq enumC1889540zGq2 = new EnumC1889540zGq("SHOW_LOADING", 1);
        SHOW_LOADING = enumC1889540zGq2;
        EnumC1889540zGq enumC1889540zGq3 = new EnumC1889540zGq("SHOW_ERROR", 2);
        SHOW_ERROR = enumC1889540zGq3;
        EnumC1889540zGq[] enumC1889540zGqArr = {enumC1889540zGq, enumC1889540zGq2, enumC1889540zGq3};
        LL = enumC1889540zGqArr;
        LLILLJJLI = new C2254308sP(enumC1889540zGqArr);
    }

    public static EnumC1889540zGq[] values() {
        return (EnumC1889540zGq[]) LL.clone();
    }

    public static EnumC1889540zGq valueOf(String str) {
        return (EnumC1889540zGq) C08FF.LIZ(EnumC1889540zGq.class, str);
    }

    public EnumC1889540zGq(String str, int i) {
    }
}
