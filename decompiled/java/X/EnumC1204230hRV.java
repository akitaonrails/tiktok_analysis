package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1204230hRV {
    public static final EnumC1204230hRV EMPTY_DATA;
    public static final /* synthetic */ EnumC1204230hRV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1204230hRV LOADING;
    public static final EnumC1204230hRV LOC_UNAVAILABLE;
    public static final EnumC1204230hRV NO_NETWORK;
    public static final EnumC1204230hRV OTHER_EXCEPTION;

    public static InterfaceC2044707zh<EnumC1204230hRV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1204230hRV enumC1204230hRV = new EnumC1204230hRV("LOADING", 0);
        LOADING = enumC1204230hRV;
        EnumC1204230hRV enumC1204230hRV2 = new EnumC1204230hRV("NO_NETWORK", 1);
        NO_NETWORK = enumC1204230hRV2;
        EnumC1204230hRV enumC1204230hRV3 = new EnumC1204230hRV("EMPTY_DATA", 2);
        EMPTY_DATA = enumC1204230hRV3;
        EnumC1204230hRV enumC1204230hRV4 = new EnumC1204230hRV("LOC_UNAVAILABLE", 3);
        LOC_UNAVAILABLE = enumC1204230hRV4;
        EnumC1204230hRV enumC1204230hRV5 = new EnumC1204230hRV("OTHER_EXCEPTION", 4);
        OTHER_EXCEPTION = enumC1204230hRV5;
        EnumC1204230hRV[] enumC1204230hRVArr = {enumC1204230hRV, enumC1204230hRV2, enumC1204230hRV3, enumC1204230hRV4, enumC1204230hRV5};
        LL = enumC1204230hRVArr;
        LLILLJJLI = new C2254308sP(enumC1204230hRVArr);
    }

    public static EnumC1204230hRV[] values() {
        return (EnumC1204230hRV[]) LL.clone();
    }

    public static EnumC1204230hRV valueOf(String str) {
        return (EnumC1204230hRV) C08FF.LIZ(EnumC1204230hRV.class, str);
    }

    public EnumC1204230hRV(String str, int i) {
    }
}
