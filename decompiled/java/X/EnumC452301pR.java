package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01pR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC452301pR {
    public static final /* synthetic */ EnumC452301pR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC452301pR NONE;
    public static final EnumC452301pR PUBLICATION;
    public static final EnumC452301pR SYNCHRONIZED;

    public static InterfaceC2044707zh<EnumC452301pR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC452301pR enumC452301pR = new EnumC452301pR("SYNCHRONIZED", 0);
        SYNCHRONIZED = enumC452301pR;
        EnumC452301pR enumC452301pR2 = new EnumC452301pR("PUBLICATION", 1);
        PUBLICATION = enumC452301pR2;
        EnumC452301pR enumC452301pR3 = new EnumC452301pR("NONE", 2);
        NONE = enumC452301pR3;
        EnumC452301pR[] enumC452301pRArr = {enumC452301pR, enumC452301pR2, enumC452301pR3};
        LL = enumC452301pRArr;
        LLILLJJLI = new C2254308sP(enumC452301pRArr);
    }

    public static EnumC452301pR[] values() {
        return (EnumC452301pR[]) LL.clone();
    }

    public static EnumC452301pR valueOf(String str) {
        return (EnumC452301pR) C08FF.LIZ(EnumC452301pR.class, str);
    }

    public EnumC452301pR(String str, int i) {
    }
}
