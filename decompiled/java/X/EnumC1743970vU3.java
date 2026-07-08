package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1743970vU3 {
    public static final EnumC1743970vU3 LL;
    public static final EnumC1743970vU3 LLILLJJLI;
    public static final EnumC1743970vU3 LLILLL;
    public static final /* synthetic */ EnumC1743970vU3[] LLILZ;

    static {
        EnumC1743970vU3 enumC1743970vU3 = new EnumC1743970vU3("FIT_CENTER", 0);
        LL = enumC1743970vU3;
        EnumC1743970vU3 enumC1743970vU32 = new EnumC1743970vU3("FIT_WIDTH", 1);
        LLILLJJLI = enumC1743970vU32;
        EnumC1743970vU3 enumC1743970vU33 = new EnumC1743970vU3("FILL", 2);
        LLILLL = enumC1743970vU33;
        EnumC1743970vU3[] enumC1743970vU3Arr = {enumC1743970vU3, enumC1743970vU32, enumC1743970vU33};
        LLILZ = enumC1743970vU3Arr;
        new C2254308sP(enumC1743970vU3Arr);
    }

    public static EnumC1743970vU3[] values() {
        return (EnumC1743970vU3[]) LLILZ.clone();
    }

    public static EnumC1743970vU3 valueOf(String str) {
        return (EnumC1743970vU3) C08FF.LIZ(EnumC1743970vU3.class, str);
    }

    public EnumC1743970vU3(String str, int i) {
    }
}
