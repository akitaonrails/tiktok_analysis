package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1013870cUT {
    public static final EnumC1013870cUT FILLED_TAG;
    public static final EnumC1013870cUT LINK;
    public static final /* synthetic */ EnumC1013870cUT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1013870cUT STAR;
    public static final EnumC1013870cUT TEXT_PRIMARY;
    public static final EnumC1013870cUT TEXT_SECONDARY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1013870cUT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1013870cUT enumC1013870cUT = new EnumC1013870cUT("STAR", 0, 1);
        STAR = enumC1013870cUT;
        EnumC1013870cUT enumC1013870cUT2 = new EnumC1013870cUT("TEXT_PRIMARY", 1, 2);
        TEXT_PRIMARY = enumC1013870cUT2;
        EnumC1013870cUT enumC1013870cUT3 = new EnumC1013870cUT("TEXT_SECONDARY", 2, 3);
        TEXT_SECONDARY = enumC1013870cUT3;
        EnumC1013870cUT enumC1013870cUT4 = new EnumC1013870cUT("LINK", 3, 4);
        LINK = enumC1013870cUT4;
        EnumC1013870cUT enumC1013870cUT5 = new EnumC1013870cUT("FILLED_TAG", 4, 5);
        FILLED_TAG = enumC1013870cUT5;
        EnumC1013870cUT[] enumC1013870cUTArr = {enumC1013870cUT, enumC1013870cUT2, enumC1013870cUT3, enumC1013870cUT4, enumC1013870cUT5};
        LLILLJJLI = enumC1013870cUTArr;
        LLILLL = new C2254308sP(enumC1013870cUTArr);
    }

    public static EnumC1013870cUT[] values() {
        return (EnumC1013870cUT[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1013870cUT valueOf(String str) {
        return (EnumC1013870cUT) C08FF.LIZ(EnumC1013870cUT.class, str);
    }

    public EnumC1013870cUT(String str, int i, int i2) {
        this.LL = i2;
    }
}
