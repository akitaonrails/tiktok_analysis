package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iin, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1253390iin {
    public static final EnumC1253390iin BIG_PACKAGE;
    public static final /* synthetic */ EnumC1253390iin[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1253390iin NO_CHUNK_END_FAILED;
    public static final EnumC1253390iin NO_CHUNK_END_SUCCESS;
    public static final EnumC1253390iin REQUEST_CATCH;
    public static final EnumC1253390iin REQUEST_PERIOD;
    public static final EnumC1253390iin REQUEST_RETRY;
    public static final EnumC1253390iin SMALL_PACKAGE;
    public static final EnumC1253390iin START_REQUEST;
    public static final EnumC1253390iin UNKNOWN;

    public static InterfaceC2044707zh<EnumC1253390iin> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1253390iin enumC1253390iin = new EnumC1253390iin("UNKNOWN", 0);
        UNKNOWN = enumC1253390iin;
        EnumC1253390iin enumC1253390iin2 = new EnumC1253390iin("SMALL_PACKAGE", 1);
        SMALL_PACKAGE = enumC1253390iin2;
        EnumC1253390iin enumC1253390iin3 = new EnumC1253390iin("BIG_PACKAGE", 2);
        BIG_PACKAGE = enumC1253390iin3;
        EnumC1253390iin enumC1253390iin4 = new EnumC1253390iin("REQUEST_PERIOD", 3);
        REQUEST_PERIOD = enumC1253390iin4;
        EnumC1253390iin enumC1253390iin5 = new EnumC1253390iin("REQUEST_CATCH", 4);
        REQUEST_CATCH = enumC1253390iin5;
        EnumC1253390iin enumC1253390iin6 = new EnumC1253390iin("REQUEST_RETRY", 5);
        REQUEST_RETRY = enumC1253390iin6;
        EnumC1253390iin enumC1253390iin7 = new EnumC1253390iin("START_REQUEST", 6);
        START_REQUEST = enumC1253390iin7;
        EnumC1253390iin enumC1253390iin8 = new EnumC1253390iin("NO_CHUNK_END_SUCCESS", 7);
        NO_CHUNK_END_SUCCESS = enumC1253390iin8;
        EnumC1253390iin enumC1253390iin9 = new EnumC1253390iin("NO_CHUNK_END_FAILED", 8);
        NO_CHUNK_END_FAILED = enumC1253390iin9;
        EnumC1253390iin[] enumC1253390iinArr = {enumC1253390iin, enumC1253390iin2, enumC1253390iin3, enumC1253390iin4, enumC1253390iin5, enumC1253390iin6, enumC1253390iin7, enumC1253390iin8, enumC1253390iin9};
        LL = enumC1253390iinArr;
        LLILLJJLI = new C2254308sP(enumC1253390iinArr);
    }

    public static EnumC1253390iin[] values() {
        return (EnumC1253390iin[]) LL.clone();
    }

    public static EnumC1253390iin valueOf(String str) {
        return (EnumC1253390iin) C08FF.LIZ(EnumC1253390iin.class, str);
    }

    public EnumC1253390iin(String str, int i) {
    }
}
