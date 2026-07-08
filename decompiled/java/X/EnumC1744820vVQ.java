package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1744820vVQ {
    public static final EnumC1744820vVQ APPROVED;
    public static final EnumC1744820vVQ INIT;
    public static final /* synthetic */ EnumC1744820vVQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1744820vVQ PENDING;
    public static final EnumC1744820vVQ REJECTED;

    public static InterfaceC2044707zh<EnumC1744820vVQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1744820vVQ enumC1744820vVQ = new EnumC1744820vVQ("INIT", 0);
        INIT = enumC1744820vVQ;
        EnumC1744820vVQ enumC1744820vVQ2 = new EnumC1744820vVQ("PENDING", 1);
        PENDING = enumC1744820vVQ2;
        EnumC1744820vVQ enumC1744820vVQ3 = new EnumC1744820vVQ("APPROVED", 2);
        APPROVED = enumC1744820vVQ3;
        EnumC1744820vVQ enumC1744820vVQ4 = new EnumC1744820vVQ("REJECTED", 3);
        REJECTED = enumC1744820vVQ4;
        EnumC1744820vVQ[] enumC1744820vVQArr = {enumC1744820vVQ, enumC1744820vVQ2, enumC1744820vVQ3, enumC1744820vVQ4};
        LL = enumC1744820vVQArr;
        LLILLJJLI = new C2254308sP(enumC1744820vVQArr);
    }

    public static EnumC1744820vVQ[] values() {
        return (EnumC1744820vVQ[]) LL.clone();
    }

    public static EnumC1744820vVQ valueOf(String str) {
        return (EnumC1744820vVQ) C08FF.LIZ(EnumC1744820vVQ.class, str);
    }

    public EnumC1744820vVQ(String str, int i) {
    }
}
