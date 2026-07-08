package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC982850bgR {
    public static final EnumC982850bgR COUNT_DOWN;
    public static final EnumC982850bgR COUNT_UP;
    public static final EnumC982850bgR INVITING;
    public static final /* synthetic */ EnumC982850bgR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC982850bgR PLAYING;
    public static final EnumC982850bgR PUNISHING;
    public static final EnumC982850bgR REMOVE;
    public static final EnumC982850bgR SETTLEMENT;

    public static InterfaceC2044707zh<EnumC982850bgR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC982850bgR enumC982850bgR = new EnumC982850bgR("INVITING", 0);
        INVITING = enumC982850bgR;
        EnumC982850bgR enumC982850bgR2 = new EnumC982850bgR("PLAYING", 1);
        PLAYING = enumC982850bgR2;
        EnumC982850bgR enumC982850bgR3 = new EnumC982850bgR("SETTLEMENT", 2);
        SETTLEMENT = enumC982850bgR3;
        EnumC982850bgR enumC982850bgR4 = new EnumC982850bgR("PUNISHING", 3);
        PUNISHING = enumC982850bgR4;
        EnumC982850bgR enumC982850bgR5 = new EnumC982850bgR("COUNT_DOWN", 4);
        COUNT_DOWN = enumC982850bgR5;
        EnumC982850bgR enumC982850bgR6 = new EnumC982850bgR("COUNT_UP", 5);
        COUNT_UP = enumC982850bgR6;
        EnumC982850bgR enumC982850bgR7 = new EnumC982850bgR("REMOVE", 6);
        REMOVE = enumC982850bgR7;
        EnumC982850bgR[] enumC982850bgRArr = {enumC982850bgR, enumC982850bgR2, enumC982850bgR3, enumC982850bgR4, enumC982850bgR5, enumC982850bgR6, enumC982850bgR7};
        LL = enumC982850bgRArr;
        LLILLJJLI = new C2254308sP(enumC982850bgRArr);
    }

    public static EnumC982850bgR[] values() {
        return (EnumC982850bgR[]) LL.clone();
    }

    public static EnumC982850bgR valueOf(String str) {
        return (EnumC982850bgR) C08FF.LIZ(EnumC982850bgR.class, str);
    }

    public EnumC982850bgR(String str, int i) {
    }
}
