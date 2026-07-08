package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC310820CGi {
    public static final /* synthetic */ EnumC310820CGi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC310820CGi TOKEN_REQUEST_FAILED;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC310820CGi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC310820CGi enumC310820CGi = new EnumC310820CGi();
        TOKEN_REQUEST_FAILED = enumC310820CGi;
        EnumC310820CGi[] enumC310820CGiArr = {enumC310820CGi};
        LLILLJJLI = enumC310820CGiArr;
        LLILLL = new C2254308sP(enumC310820CGiArr);
    }

    public static EnumC310820CGi[] values() {
        return (EnumC310820CGi[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC310820CGi valueOf(String str) {
        return (EnumC310820CGi) C08FF.LIZ(EnumC310820CGi.class, str);
    }
}
