package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC559100LwK {
    public static final EnumC559100LwK FAIL;
    public static final /* synthetic */ EnumC559100LwK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC559100LwK PAUSE;
    public static final EnumC559100LwK SUCCESS;

    public static InterfaceC2044707zh<EnumC559100LwK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC559100LwK enumC559100LwK = new EnumC559100LwK("PAUSE", 0);
        PAUSE = enumC559100LwK;
        EnumC559100LwK enumC559100LwK2 = new EnumC559100LwK("SUCCESS", 1);
        SUCCESS = enumC559100LwK2;
        EnumC559100LwK enumC559100LwK3 = new EnumC559100LwK("FAIL", 2);
        FAIL = enumC559100LwK3;
        EnumC559100LwK[] enumC559100LwKArr = {enumC559100LwK, enumC559100LwK2, enumC559100LwK3};
        LL = enumC559100LwKArr;
        LLILLJJLI = new C2254308sP(enumC559100LwKArr);
    }

    public static EnumC559100LwK[] values() {
        return (EnumC559100LwK[]) LL.clone();
    }

    public static EnumC559100LwK valueOf(String str) {
        return (EnumC559100LwK) C08FF.LIZ(EnumC559100LwK.class, str);
    }

    public EnumC559100LwK(String str, int i) {
    }
}
