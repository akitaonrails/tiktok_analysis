package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779540wPQ {
    public static final EnumC1779540wPQ DOING;
    public static final EnumC1779540wPQ DONE;
    public static final /* synthetic */ EnumC1779540wPQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779540wPQ NONE;

    public static InterfaceC2044707zh<EnumC1779540wPQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779540wPQ enumC1779540wPQ = new EnumC1779540wPQ("NONE", 0);
        NONE = enumC1779540wPQ;
        EnumC1779540wPQ enumC1779540wPQ2 = new EnumC1779540wPQ("DOING", 1);
        DOING = enumC1779540wPQ2;
        EnumC1779540wPQ enumC1779540wPQ3 = new EnumC1779540wPQ("DONE", 2);
        DONE = enumC1779540wPQ3;
        EnumC1779540wPQ[] enumC1779540wPQArr = {enumC1779540wPQ, enumC1779540wPQ2, enumC1779540wPQ3};
        LL = enumC1779540wPQArr;
        LLILLJJLI = new C2254308sP(enumC1779540wPQArr);
    }

    public static EnumC1779540wPQ[] values() {
        return (EnumC1779540wPQ[]) LL.clone();
    }

    public static EnumC1779540wPQ valueOf(String str) {
        return (EnumC1779540wPQ) C08FF.LIZ(EnumC1779540wPQ.class, str);
    }

    public EnumC1779540wPQ(String str, int i) {
    }
}
