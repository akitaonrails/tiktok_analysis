package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gAC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155060gAC {
    public static final EnumC1155060gAC CLOUD_CONTENT_UNDERSTANDING;
    public static final /* synthetic */ EnumC1155060gAC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1155060gAC TOS_URI;

    public static InterfaceC2044707zh<EnumC1155060gAC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1155060gAC enumC1155060gAC = new EnumC1155060gAC("TOS_URI", 0);
        TOS_URI = enumC1155060gAC;
        EnumC1155060gAC enumC1155060gAC2 = new EnumC1155060gAC("CLOUD_CONTENT_UNDERSTANDING", 1);
        CLOUD_CONTENT_UNDERSTANDING = enumC1155060gAC2;
        EnumC1155060gAC[] enumC1155060gACArr = {enumC1155060gAC, enumC1155060gAC2};
        LL = enumC1155060gACArr;
        LLILLJJLI = new C2254308sP(enumC1155060gACArr);
    }

    public static EnumC1155060gAC[] values() {
        return (EnumC1155060gAC[]) LL.clone();
    }

    public static EnumC1155060gAC valueOf(String str) {
        return (EnumC1155060gAC) C08FF.LIZ(EnumC1155060gAC.class, str);
    }

    public EnumC1155060gAC(String str, int i) {
    }
}
