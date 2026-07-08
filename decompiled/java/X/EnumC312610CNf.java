package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC312610CNf implements InterfaceC1702080uOU {
    public static final EnumC312610CNf FLUENCY;
    public static final /* synthetic */ EnumC312610CNf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC312610CNf SATRTUP;

    public static InterfaceC2044707zh<EnumC312610CNf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC312610CNf enumC312610CNf = new EnumC312610CNf("FLUENCY", 0);
        FLUENCY = enumC312610CNf;
        EnumC312610CNf enumC312610CNf2 = new EnumC312610CNf("SATRTUP", 1);
        SATRTUP = enumC312610CNf2;
        EnumC312610CNf[] enumC312610CNfArr = {enumC312610CNf, enumC312610CNf2};
        LL = enumC312610CNfArr;
        LLILLJJLI = new C2254308sP(enumC312610CNfArr);
    }

    public static EnumC312610CNf[] values() {
        return (EnumC312610CNf[]) LL.clone();
    }

    public static EnumC312610CNf valueOf(String str) {
        return (EnumC312610CNf) C08FF.LIZ(EnumC312610CNf.class, str);
    }

    public EnumC312610CNf(String str, int i) {
    }
}
