package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0idK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1250000idK {
    public static final /* synthetic */ EnumC1250000idK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1250000idK LOGOUT;
    public final String LL = "logout";

    public static InterfaceC2044707zh<EnumC1250000idK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1250000idK enumC1250000idK = new EnumC1250000idK();
        LOGOUT = enumC1250000idK;
        EnumC1250000idK[] enumC1250000idKArr = {enumC1250000idK};
        LLILLJJLI = enumC1250000idKArr;
        LLILLL = new C2254308sP(enumC1250000idKArr);
    }

    public static EnumC1250000idK[] values() {
        return (EnumC1250000idK[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1250000idK valueOf(String str) {
        return (EnumC1250000idK) C08FF.LIZ(EnumC1250000idK.class, str);
    }
}
