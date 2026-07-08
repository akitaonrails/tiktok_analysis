package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC507460JvE {
    public static final /* synthetic */ EnumC507460JvE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC507460JvE POLL;
    public static final EnumC507460JvE SUB_VIDEO;
    public static final EnumC507460JvE TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC507460JvE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC507460JvE enumC507460JvE = new EnumC507460JvE("TEXT", 0, 0);
        TEXT = enumC507460JvE;
        EnumC507460JvE enumC507460JvE2 = new EnumC507460JvE("POLL", 1, 1);
        POLL = enumC507460JvE2;
        EnumC507460JvE enumC507460JvE3 = new EnumC507460JvE("SUB_VIDEO", 2, 2);
        SUB_VIDEO = enumC507460JvE3;
        EnumC507460JvE[] enumC507460JvEArr = {enumC507460JvE, enumC507460JvE2, enumC507460JvE3};
        LLILLJJLI = enumC507460JvEArr;
        LLILLL = new C2254308sP(enumC507460JvEArr);
    }

    public static EnumC507460JvE[] values() {
        return (EnumC507460JvE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC507460JvE valueOf(String str) {
        return (EnumC507460JvE) C08FF.LIZ(EnumC507460JvE.class, str);
    }

    public EnumC507460JvE(String str, int i, int i2) {
        this.LL = i2;
    }
}
