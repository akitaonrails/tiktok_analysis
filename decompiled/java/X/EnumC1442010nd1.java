package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1442010nd1 {
    public static final C1442030nd3 Companion;
    public static final /* synthetic */ EnumC1442010nd1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1442010nd1 RECORD;
    public static final EnumC1442010nd1 UNKNOWED;
    public static final EnumC1442010nd1 UPLOAD_ONE_IMAGE;
    public static final EnumC1442010nd1 UPLOAD_ONLY_IMAGE;
    public static final EnumC1442010nd1 UPLOAD_OTHER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1442010nd1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1442010nd1 enumC1442010nd1 = new EnumC1442010nd1("UNKNOWED", 0, 0);
        UNKNOWED = enumC1442010nd1;
        EnumC1442010nd1 enumC1442010nd12 = new EnumC1442010nd1("RECORD", 1, 1);
        RECORD = enumC1442010nd12;
        EnumC1442010nd1 enumC1442010nd13 = new EnumC1442010nd1("UPLOAD_ONE_IMAGE", 2, 2);
        UPLOAD_ONE_IMAGE = enumC1442010nd13;
        EnumC1442010nd1 enumC1442010nd14 = new EnumC1442010nd1("UPLOAD_OTHER", 3, 3);
        UPLOAD_OTHER = enumC1442010nd14;
        EnumC1442010nd1 enumC1442010nd15 = new EnumC1442010nd1("UPLOAD_ONLY_IMAGE", 4, 4);
        UPLOAD_ONLY_IMAGE = enumC1442010nd15;
        EnumC1442010nd1[] enumC1442010nd1Arr = {enumC1442010nd1, enumC1442010nd12, enumC1442010nd13, enumC1442010nd14, enumC1442010nd15};
        LLILLJJLI = enumC1442010nd1Arr;
        LLILLL = new C2254308sP(enumC1442010nd1Arr);
        Companion = new C1442030nd3();
    }

    public static EnumC1442010nd1[] values() {
        return (EnumC1442010nd1[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C1442020nd2.LIZ[ordinal()];
        if (i == 1) {
            return "UNKNOWED";
        }
        if (i == 2) {
            return "RECORD";
        }
        if (i == 3) {
            return "UPLOAD_ONE_IMAGE";
        }
        if (i == 4) {
            return "UPLOAD_OTHER";
        }
        if (i == 5) {
            return "UPLOAD_ONLY_IMAGE";
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1442010nd1 valueOf(String str) {
        return (EnumC1442010nd1) C08FF.LIZ(EnumC1442010nd1.class, str);
    }

    public EnumC1442010nd1(String str, int i, int i2) {
        this.LL = i2;
    }
}
