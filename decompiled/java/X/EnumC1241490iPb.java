package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1241490iPb {
    public static final EnumC1241490iPb ERROR;
    public static final EnumC1241490iPb INIT;
    public static final /* synthetic */ EnumC1241490iPb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1241490iPb LOADING;
    public static final EnumC1241490iPb NO_RESULT;
    public static final EnumC1241490iPb REFRESH;
    public static final EnumC1241490iPb SUCCESS;

    public static InterfaceC2044707zh<EnumC1241490iPb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1241490iPb enumC1241490iPb = new EnumC1241490iPb("LOADING", 0);
        LOADING = enumC1241490iPb;
        EnumC1241490iPb enumC1241490iPb2 = new EnumC1241490iPb("SUCCESS", 1);
        SUCCESS = enumC1241490iPb2;
        EnumC1241490iPb enumC1241490iPb3 = new EnumC1241490iPb("REFRESH", 2);
        REFRESH = enumC1241490iPb3;
        EnumC1241490iPb enumC1241490iPb4 = new EnumC1241490iPb("NO_RESULT", 3);
        NO_RESULT = enumC1241490iPb4;
        EnumC1241490iPb enumC1241490iPb5 = new EnumC1241490iPb("ERROR", 4);
        ERROR = enumC1241490iPb5;
        EnumC1241490iPb enumC1241490iPb6 = new EnumC1241490iPb("INIT", 5);
        INIT = enumC1241490iPb6;
        EnumC1241490iPb[] enumC1241490iPbArr = {enumC1241490iPb, enumC1241490iPb2, enumC1241490iPb3, enumC1241490iPb4, enumC1241490iPb5, enumC1241490iPb6};
        LL = enumC1241490iPbArr;
        LLILLJJLI = new C2254308sP(enumC1241490iPbArr);
    }

    public static EnumC1241490iPb[] values() {
        return (EnumC1241490iPb[]) LL.clone();
    }

    public static EnumC1241490iPb valueOf(String str) {
        return (EnumC1241490iPb) C08FF.LIZ(EnumC1241490iPb.class, str);
    }

    public EnumC1241490iPb(String str, int i) {
    }
}
