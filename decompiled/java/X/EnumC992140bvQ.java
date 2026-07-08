package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992140bvQ {
    public static final EnumC992140bvQ FAILED;
    public static final /* synthetic */ EnumC992140bvQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992140bvQ NONE;
    public static final EnumC992140bvQ START;
    public static final EnumC992140bvQ SUCCESS;

    public static InterfaceC2044707zh<EnumC992140bvQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992140bvQ enumC992140bvQ = new EnumC992140bvQ("START", 0);
        START = enumC992140bvQ;
        EnumC992140bvQ enumC992140bvQ2 = new EnumC992140bvQ("SUCCESS", 1);
        SUCCESS = enumC992140bvQ2;
        EnumC992140bvQ enumC992140bvQ3 = new EnumC992140bvQ("FAILED", 2);
        FAILED = enumC992140bvQ3;
        EnumC992140bvQ enumC992140bvQ4 = new EnumC992140bvQ("NONE", 3);
        NONE = enumC992140bvQ4;
        EnumC992140bvQ[] enumC992140bvQArr = {enumC992140bvQ, enumC992140bvQ2, enumC992140bvQ3, enumC992140bvQ4};
        LL = enumC992140bvQArr;
        LLILLJJLI = new C2254308sP(enumC992140bvQArr);
    }

    public static EnumC992140bvQ[] values() {
        return (EnumC992140bvQ[]) LL.clone();
    }

    public static EnumC992140bvQ valueOf(String str) {
        return (EnumC992140bvQ) C08FF.LIZ(EnumC992140bvQ.class, str);
    }

    public EnumC992140bvQ(String str, int i) {
    }
}
