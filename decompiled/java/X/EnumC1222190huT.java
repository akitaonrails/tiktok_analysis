package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0huT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1222190huT {
    public static final EnumC1222190huT CANCEL;
    public static final EnumC1222190huT FAIL;
    public static final /* synthetic */ EnumC1222190huT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1222190huT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1222190huT enumC1222190huT = new EnumC1222190huT("FAIL", 0, "fail");
        FAIL = enumC1222190huT;
        EnumC1222190huT enumC1222190huT2 = new EnumC1222190huT("CANCEL", 1, "cancel");
        CANCEL = enumC1222190huT2;
        EnumC1222190huT[] enumC1222190huTArr = {enumC1222190huT, enumC1222190huT2};
        LLILLJJLI = enumC1222190huTArr;
        LLILLL = new C2254308sP(enumC1222190huTArr);
    }

    public static EnumC1222190huT[] values() {
        return (EnumC1222190huT[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1222190huT valueOf(String str) {
        return (EnumC1222190huT) C08FF.LIZ(EnumC1222190huT.class, str);
    }

    public EnumC1222190huT(String str, int i, String str2) {
        this.LL = str2;
    }
}
