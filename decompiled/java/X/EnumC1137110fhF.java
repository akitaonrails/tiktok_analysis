package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1137110fhF {
    public static final EnumC1137110fhF DYNAMIC_TAG;
    public static final EnumC1137110fhF FIRST_GIFT;
    public static final EnumC1137110fhF FOR_YOU;
    public static final /* synthetic */ EnumC1137110fhF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1137110fhF SPONSORED;
    public static final EnumC1137110fhF SPONSORED_VAULT;
    public static final EnumC1137110fhF VAULT;

    public static InterfaceC2044707zh<EnumC1137110fhF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1137110fhF enumC1137110fhF = new EnumC1137110fhF("FIRST_GIFT", 0);
        FIRST_GIFT = enumC1137110fhF;
        EnumC1137110fhF enumC1137110fhF2 = new EnumC1137110fhF("FOR_YOU", 1);
        FOR_YOU = enumC1137110fhF2;
        EnumC1137110fhF enumC1137110fhF3 = new EnumC1137110fhF("SPONSORED", 2);
        SPONSORED = enumC1137110fhF3;
        EnumC1137110fhF enumC1137110fhF4 = new EnumC1137110fhF("VAULT", 3);
        VAULT = enumC1137110fhF4;
        EnumC1137110fhF enumC1137110fhF5 = new EnumC1137110fhF("SPONSORED_VAULT", 4);
        SPONSORED_VAULT = enumC1137110fhF5;
        EnumC1137110fhF enumC1137110fhF6 = new EnumC1137110fhF("DYNAMIC_TAG", 5);
        DYNAMIC_TAG = enumC1137110fhF6;
        EnumC1137110fhF[] enumC1137110fhFArr = {enumC1137110fhF, enumC1137110fhF2, enumC1137110fhF3, enumC1137110fhF4, enumC1137110fhF5, enumC1137110fhF6};
        LL = enumC1137110fhFArr;
        LLILLJJLI = new C2254308sP(enumC1137110fhFArr);
    }

    public static EnumC1137110fhF[] values() {
        return (EnumC1137110fhF[]) LL.clone();
    }

    public static EnumC1137110fhF valueOf(String str) {
        return (EnumC1137110fhF) C08FF.LIZ(EnumC1137110fhF.class, str);
    }

    public EnumC1137110fhF(String str, int i) {
    }
}
