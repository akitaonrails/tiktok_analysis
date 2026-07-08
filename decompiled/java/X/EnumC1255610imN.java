package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0imN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1255610imN {
    public static final /* synthetic */ EnumC1255610imN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1255610imN TAKE_PHOTO;
    public static final EnumC1255610imN UPLOAD_PHOTO;

    public static InterfaceC2044707zh<EnumC1255610imN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1255610imN enumC1255610imN = new EnumC1255610imN("TAKE_PHOTO", 0);
        TAKE_PHOTO = enumC1255610imN;
        EnumC1255610imN enumC1255610imN2 = new EnumC1255610imN("UPLOAD_PHOTO", 1);
        UPLOAD_PHOTO = enumC1255610imN2;
        EnumC1255610imN[] enumC1255610imNArr = {enumC1255610imN, enumC1255610imN2};
        LL = enumC1255610imNArr;
        LLILLJJLI = new C2254308sP(enumC1255610imNArr);
    }

    public static EnumC1255610imN[] values() {
        return (EnumC1255610imN[]) LL.clone();
    }

    public static EnumC1255610imN valueOf(String str) {
        return (EnumC1255610imN) C08FF.LIZ(EnumC1255610imN.class, str);
    }

    public EnumC1255610imN(String str, int i) {
    }
}
