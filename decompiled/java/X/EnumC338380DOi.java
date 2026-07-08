package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC338380DOi {
    public static final EnumC338380DOi EMPTY_KEYWORD;
    public static final EnumC338380DOi EMPTY_RESULT;
    public static final /* synthetic */ EnumC338380DOi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC338380DOi TIMEOUT;

    public static InterfaceC2044707zh<EnumC338380DOi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC338380DOi enumC338380DOi = new EnumC338380DOi("EMPTY_KEYWORD", 0);
        EMPTY_KEYWORD = enumC338380DOi;
        EnumC338380DOi enumC338380DOi2 = new EnumC338380DOi("EMPTY_RESULT", 1);
        EMPTY_RESULT = enumC338380DOi2;
        EnumC338380DOi enumC338380DOi3 = new EnumC338380DOi("TIMEOUT", 2);
        TIMEOUT = enumC338380DOi3;
        EnumC338380DOi[] enumC338380DOiArr = {enumC338380DOi, enumC338380DOi2, enumC338380DOi3};
        LL = enumC338380DOiArr;
        LLILLJJLI = new C2254308sP(enumC338380DOiArr);
    }

    public static EnumC338380DOi[] values() {
        return (EnumC338380DOi[]) LL.clone();
    }

    public static EnumC338380DOi valueOf(String str) {
        return (EnumC338380DOi) C08FF.LIZ(EnumC338380DOi.class, str);
    }

    public EnumC338380DOi(String str, int i) {
    }
}
