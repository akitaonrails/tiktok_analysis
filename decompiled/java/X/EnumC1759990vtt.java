package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vtt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1759990vtt {
    public static final EnumC1759990vtt BOTTOM_END;
    public static final EnumC1759990vtt BOTTOM_START;
    public static final /* synthetic */ EnumC1759990vtt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1759990vtt TOP_END;
    public static final EnumC1759990vtt TOP_START;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1759990vtt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1759990vtt enumC1759990vtt = new EnumC1759990vtt("BOTTOM_END", 0, 0);
        BOTTOM_END = enumC1759990vtt;
        EnumC1759990vtt enumC1759990vtt2 = new EnumC1759990vtt("BOTTOM_START", 1, 1);
        BOTTOM_START = enumC1759990vtt2;
        EnumC1759990vtt enumC1759990vtt3 = new EnumC1759990vtt("TOP_END", 2, 2);
        TOP_END = enumC1759990vtt3;
        EnumC1759990vtt enumC1759990vtt4 = new EnumC1759990vtt("TOP_START", 3, 3);
        TOP_START = enumC1759990vtt4;
        EnumC1759990vtt[] enumC1759990vttArr = {enumC1759990vtt, enumC1759990vtt2, enumC1759990vtt3, enumC1759990vtt4};
        LLILLJJLI = enumC1759990vttArr;
        LLILLL = new C2254308sP(enumC1759990vttArr);
    }

    public static EnumC1759990vtt[] values() {
        return (EnumC1759990vtt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1759990vtt valueOf(String str) {
        return (EnumC1759990vtt) C08FF.LIZ(EnumC1759990vtt.class, str);
    }

    public EnumC1759990vtt(String str, int i, int i2) {
        this.LL = i2;
    }
}
