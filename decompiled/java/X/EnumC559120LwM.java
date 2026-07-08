package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC559120LwM {
    public static final /* synthetic */ EnumC559120LwM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC559120LwM LOADING;
    public static final EnumC559120LwM RETRY;

    public static InterfaceC2044707zh<EnumC559120LwM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC559120LwM enumC559120LwM = new EnumC559120LwM("LOADING", 0);
        LOADING = enumC559120LwM;
        EnumC559120LwM enumC559120LwM2 = new EnumC559120LwM("RETRY", 1);
        RETRY = enumC559120LwM2;
        EnumC559120LwM[] enumC559120LwMArr = {enumC559120LwM, enumC559120LwM2};
        LL = enumC559120LwMArr;
        LLILLJJLI = new C2254308sP(enumC559120LwMArr);
    }

    public static EnumC559120LwM[] values() {
        return (EnumC559120LwM[]) LL.clone();
    }

    public static EnumC559120LwM valueOf(String str) {
        return (EnumC559120LwM) C08FF.LIZ(EnumC559120LwM.class, str);
    }

    public EnumC559120LwM(String str, int i) {
    }
}
