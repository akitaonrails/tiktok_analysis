package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20295414bA {
    public static final EnumC20295414bA LL;
    public static final EnumC20295414bA LLILLJJLI;
    public static final /* synthetic */ EnumC20295414bA[] LLILLL;

    static {
        EnumC20295414bA enumC20295414bA = new EnumC20295414bA("STATE_PREVIEW", 0);
        LL = enumC20295414bA;
        EnumC20295414bA enumC20295414bA2 = new EnumC20295414bA("STATE_WAITING_PRECAPTURE", 1);
        LLILLJJLI = enumC20295414bA2;
        EnumC20295414bA[] enumC20295414bAArr = {enumC20295414bA, enumC20295414bA2};
        LLILLL = enumC20295414bAArr;
        new C2254308sP(enumC20295414bAArr);
    }

    public static EnumC20295414bA[] values() {
        return (EnumC20295414bA[]) LLILLL.clone();
    }

    public static EnumC20295414bA valueOf(String str) {
        return (EnumC20295414bA) C08FF.LIZ(EnumC20295414bA.class, str);
    }

    public EnumC20295414bA(String str, int i) {
    }
}
