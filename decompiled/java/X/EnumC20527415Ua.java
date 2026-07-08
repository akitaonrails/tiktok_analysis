package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20527415Ua {
    public static final C20527915Uf Companion;
    public static final EnumC20527415Ua FIRST_FULL_DATA;
    public static final EnumC20527415Ua FIRST_LIGHT_WEIGHT;
    public static final /* synthetic */ EnumC20527415Ua[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20527415Ua SECOND_FULL_DATA;

    public static InterfaceC2044707zh<EnumC20527415Ua> getEntries() {
        return LLILLJJLI;
    }

    public static final EnumC20527415Ua increment(EnumC20527415Ua enumC20527415Ua) {
        Companion.getClass();
        return C20527915Uf.LIZ(enumC20527415Ua);
    }

    static {
        EnumC20527415Ua enumC20527415Ua = new EnumC20527415Ua("FIRST_LIGHT_WEIGHT", 0);
        FIRST_LIGHT_WEIGHT = enumC20527415Ua;
        EnumC20527415Ua enumC20527415Ua2 = new EnumC20527415Ua("FIRST_FULL_DATA", 1);
        FIRST_FULL_DATA = enumC20527415Ua2;
        EnumC20527415Ua enumC20527415Ua3 = new EnumC20527415Ua("SECOND_FULL_DATA", 2);
        SECOND_FULL_DATA = enumC20527415Ua3;
        EnumC20527415Ua[] enumC20527415UaArr = {enumC20527415Ua, enumC20527415Ua2, enumC20527415Ua3};
        LL = enumC20527415UaArr;
        LLILLJJLI = new C2254308sP(enumC20527415UaArr);
        Companion = new C20527915Uf();
    }

    public static EnumC20527415Ua[] values() {
        return (EnumC20527415Ua[]) LL.clone();
    }

    public static EnumC20527415Ua valueOf(String str) {
        return (EnumC20527415Ua) C08FF.LIZ(EnumC20527415Ua.class, str);
    }

    public EnumC20527415Ua(String str, int i) {
    }
}
