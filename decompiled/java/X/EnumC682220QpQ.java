package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC682220QpQ {
    public static final EnumC682220QpQ APPENDING;
    public static final EnumC682220QpQ FINISH;
    public static final /* synthetic */ EnumC682220QpQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC682220QpQ LOADING;
    public static final EnumC682220QpQ UN_DEFINE;

    public static InterfaceC2044707zh<EnumC682220QpQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC682220QpQ enumC682220QpQ = new EnumC682220QpQ("UN_DEFINE", 0);
        UN_DEFINE = enumC682220QpQ;
        EnumC682220QpQ enumC682220QpQ2 = new EnumC682220QpQ("LOADING", 1);
        LOADING = enumC682220QpQ2;
        EnumC682220QpQ enumC682220QpQ3 = new EnumC682220QpQ("APPENDING", 2);
        APPENDING = enumC682220QpQ3;
        EnumC682220QpQ enumC682220QpQ4 = new EnumC682220QpQ("FINISH", 3);
        FINISH = enumC682220QpQ4;
        EnumC682220QpQ[] enumC682220QpQArr = {enumC682220QpQ, enumC682220QpQ2, enumC682220QpQ3, enumC682220QpQ4};
        LL = enumC682220QpQArr;
        LLILLJJLI = new C2254308sP(enumC682220QpQArr);
    }

    public static EnumC682220QpQ[] values() {
        return (EnumC682220QpQ[]) LL.clone();
    }

    public static EnumC682220QpQ valueOf(String str) {
        return (EnumC682220QpQ) C08FF.LIZ(EnumC682220QpQ.class, str);
    }

    public EnumC682220QpQ(String str, int i) {
    }
}
