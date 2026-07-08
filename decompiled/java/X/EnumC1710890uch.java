package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1710890uch {
    public static final EnumC1710890uch ERROR;
    public static final EnumC1710890uch INIT;
    public static final /* synthetic */ EnumC1710890uch[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1710890uch LOADING;
    public static final EnumC1710890uch SUCCESS;

    public static InterfaceC2044707zh<EnumC1710890uch> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1710890uch enumC1710890uch = new EnumC1710890uch("INIT", 0);
        INIT = enumC1710890uch;
        EnumC1710890uch enumC1710890uch2 = new EnumC1710890uch("LOADING", 1);
        LOADING = enumC1710890uch2;
        EnumC1710890uch enumC1710890uch3 = new EnumC1710890uch("ERROR", 2);
        ERROR = enumC1710890uch3;
        EnumC1710890uch enumC1710890uch4 = new EnumC1710890uch("SUCCESS", 3);
        SUCCESS = enumC1710890uch4;
        EnumC1710890uch[] enumC1710890uchArr = {enumC1710890uch, enumC1710890uch2, enumC1710890uch3, enumC1710890uch4};
        LL = enumC1710890uchArr;
        LLILLJJLI = new C2254308sP(enumC1710890uchArr);
    }

    public static EnumC1710890uch[] values() {
        return (EnumC1710890uch[]) LL.clone();
    }

    public static EnumC1710890uch valueOf(String str) {
        return (EnumC1710890uch) C08FF.LIZ(EnumC1710890uch.class, str);
    }

    public EnumC1710890uch(String str, int i) {
    }
}
