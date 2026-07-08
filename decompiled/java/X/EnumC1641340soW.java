package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641340soW {
    public static final EnumC1641340soW FILTER_STATE_DOWNLOADING;
    public static final EnumC1641340soW FILTER_STATE_DOWNLOAD_FAILED;
    public static final EnumC1641340soW FILTER_STATE_DOWNLOAD_SUCCESS;
    public static final EnumC1641340soW FILTER_STATE_NOT_DOWNLOAD;
    public static final EnumC1641340soW FILTER_STATE_UNKNOWN;
    public static final /* synthetic */ EnumC1641340soW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1641340soW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641340soW enumC1641340soW = new EnumC1641340soW("FILTER_STATE_UNKNOWN", 0);
        FILTER_STATE_UNKNOWN = enumC1641340soW;
        EnumC1641340soW enumC1641340soW2 = new EnumC1641340soW("FILTER_STATE_NOT_DOWNLOAD", 1);
        FILTER_STATE_NOT_DOWNLOAD = enumC1641340soW2;
        EnumC1641340soW enumC1641340soW3 = new EnumC1641340soW("FILTER_STATE_DOWNLOADING", 2);
        FILTER_STATE_DOWNLOADING = enumC1641340soW3;
        EnumC1641340soW enumC1641340soW4 = new EnumC1641340soW("FILTER_STATE_DOWNLOAD_SUCCESS", 3);
        FILTER_STATE_DOWNLOAD_SUCCESS = enumC1641340soW4;
        EnumC1641340soW enumC1641340soW5 = new EnumC1641340soW("FILTER_STATE_DOWNLOAD_FAILED", 4);
        FILTER_STATE_DOWNLOAD_FAILED = enumC1641340soW5;
        EnumC1641340soW[] enumC1641340soWArr = {enumC1641340soW, enumC1641340soW2, enumC1641340soW3, enumC1641340soW4, enumC1641340soW5};
        LL = enumC1641340soWArr;
        LLILLJJLI = new C2254308sP(enumC1641340soWArr);
    }

    public static EnumC1641340soW[] values() {
        return (EnumC1641340soW[]) LL.clone();
    }

    public static EnumC1641340soW valueOf(String str) {
        return (EnumC1641340soW) C08FF.LIZ(EnumC1641340soW.class, str);
    }

    public EnumC1641340soW(String str, int i) {
    }
}
