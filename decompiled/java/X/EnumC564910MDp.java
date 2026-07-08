package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC564910MDp {
    public static final EnumC564910MDp FAIL_TNS_PROMPT;
    public static final EnumC564910MDp FINISH_GENERATE_SHEET;
    public static final /* synthetic */ EnumC564910MDp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC564910MDp TOOLBAR;

    public static InterfaceC2044707zh<EnumC564910MDp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC564910MDp enumC564910MDp = new EnumC564910MDp("TOOLBAR", 0);
        TOOLBAR = enumC564910MDp;
        EnumC564910MDp enumC564910MDp2 = new EnumC564910MDp("FINISH_GENERATE_SHEET", 1);
        FINISH_GENERATE_SHEET = enumC564910MDp2;
        EnumC564910MDp enumC564910MDp3 = new EnumC564910MDp("FAIL_TNS_PROMPT", 2);
        FAIL_TNS_PROMPT = enumC564910MDp3;
        EnumC564910MDp[] enumC564910MDpArr = {enumC564910MDp, enumC564910MDp2, enumC564910MDp3};
        LL = enumC564910MDpArr;
        LLILLJJLI = new C2254308sP(enumC564910MDpArr);
    }

    public static EnumC564910MDp[] values() {
        return (EnumC564910MDp[]) LL.clone();
    }

    public static EnumC564910MDp valueOf(String str) {
        return (EnumC564910MDp) C08FF.LIZ(EnumC564910MDp.class, str);
    }

    public EnumC564910MDp(String str, int i) {
    }
}
