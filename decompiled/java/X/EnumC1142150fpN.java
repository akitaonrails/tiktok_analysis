package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142150fpN {
    public static final EnumC1142150fpN COMPLETED;
    public static final EnumC1142150fpN ERROR;
    public static final EnumC1142150fpN IDLE;
    public static final /* synthetic */ EnumC1142150fpN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1142150fpN LOADING;
    public static final EnumC1142150fpN PAUSED;
    public static final EnumC1142150fpN PLAYING;

    public static InterfaceC2044707zh<EnumC1142150fpN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142150fpN enumC1142150fpN = new EnumC1142150fpN("IDLE", 0);
        IDLE = enumC1142150fpN;
        EnumC1142150fpN enumC1142150fpN2 = new EnumC1142150fpN("LOADING", 1);
        LOADING = enumC1142150fpN2;
        EnumC1142150fpN enumC1142150fpN3 = new EnumC1142150fpN("PLAYING", 2);
        PLAYING = enumC1142150fpN3;
        EnumC1142150fpN enumC1142150fpN4 = new EnumC1142150fpN("PAUSED", 3);
        PAUSED = enumC1142150fpN4;
        EnumC1142150fpN enumC1142150fpN5 = new EnumC1142150fpN("COMPLETED", 4);
        COMPLETED = enumC1142150fpN5;
        EnumC1142150fpN enumC1142150fpN6 = new EnumC1142150fpN("ERROR", 5);
        ERROR = enumC1142150fpN6;
        EnumC1142150fpN[] enumC1142150fpNArr = {enumC1142150fpN, enumC1142150fpN2, enumC1142150fpN3, enumC1142150fpN4, enumC1142150fpN5, enumC1142150fpN6};
        LL = enumC1142150fpNArr;
        LLILLJJLI = new C2254308sP(enumC1142150fpNArr);
    }

    public static EnumC1142150fpN[] values() {
        return (EnumC1142150fpN[]) LL.clone();
    }

    public static EnumC1142150fpN valueOf(String str) {
        return (EnumC1142150fpN) C08FF.LIZ(EnumC1142150fpN.class, str);
    }

    public EnumC1142150fpN(String str, int i) {
    }
}
