package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05xS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1521205xS {
    public static final EnumC1521205xS INBOX;
    public static final /* synthetic */ EnumC1521205xS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1521205xS SERIES_DISCOVER;
    public static final EnumC1521205xS SHOP;

    public static InterfaceC2044707zh<EnumC1521205xS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1521205xS enumC1521205xS = new EnumC1521205xS("INBOX", 0);
        INBOX = enumC1521205xS;
        EnumC1521205xS enumC1521205xS2 = new EnumC1521205xS("SHOP", 1);
        SHOP = enumC1521205xS2;
        EnumC1521205xS enumC1521205xS3 = new EnumC1521205xS("SERIES_DISCOVER", 2);
        SERIES_DISCOVER = enumC1521205xS3;
        EnumC1521205xS[] enumC1521205xSArr = {enumC1521205xS, enumC1521205xS2, enumC1521205xS3};
        LL = enumC1521205xSArr;
        LLILLJJLI = new C2254308sP(enumC1521205xSArr);
    }

    public static EnumC1521205xS[] values() {
        return (EnumC1521205xS[]) LL.clone();
    }

    public static EnumC1521205xS valueOf(String str) {
        return (EnumC1521205xS) C08FF.LIZ(EnumC1521205xS.class, str);
    }

    public EnumC1521205xS(String str, int i) {
    }
}
