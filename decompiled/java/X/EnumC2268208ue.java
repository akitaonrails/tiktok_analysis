package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2268208ue {
    public static final EnumC2268208ue FAIL;
    public static final /* synthetic */ EnumC2268208ue[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2268208ue SUCCESS;
    public static final EnumC2268208ue TIMEOUT_CANCEL;

    public static InterfaceC2044707zh<EnumC2268208ue> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2268208ue enumC2268208ue = new EnumC2268208ue("SUCCESS", 0);
        SUCCESS = enumC2268208ue;
        EnumC2268208ue enumC2268208ue2 = new EnumC2268208ue("FAIL", 1);
        FAIL = enumC2268208ue2;
        EnumC2268208ue enumC2268208ue3 = new EnumC2268208ue("TIMEOUT_CANCEL", 2);
        TIMEOUT_CANCEL = enumC2268208ue3;
        EnumC2268208ue[] enumC2268208ueArr = {enumC2268208ue, enumC2268208ue2, enumC2268208ue3};
        LL = enumC2268208ueArr;
        LLILLJJLI = new C2254308sP(enumC2268208ueArr);
    }

    public static EnumC2268208ue[] values() {
        return (EnumC2268208ue[]) LL.clone();
    }

    public static EnumC2268208ue valueOf(String str) {
        return (EnumC2268208ue) C08FF.LIZ(EnumC2268208ue.class, str);
    }

    public EnumC2268208ue(String str, int i) {
    }
}
