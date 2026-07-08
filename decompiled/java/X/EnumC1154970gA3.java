package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154970gA3 {
    public static final EnumC1154970gA3 CHECK_ALIVE_STATE_END;
    public static final EnumC1154970gA3 CHECK_ALIVE_STATE_NONE;
    public static final EnumC1154970gA3 CHECK_ALIVE_STATE_NO_STREAM;
    public static final EnumC1154970gA3 CHECK_ALIVE_STATE_NR;
    public static final EnumC1154970gA3 CHECK_ALIVE_STATE_PAUSE;
    public static final /* synthetic */ EnumC1154970gA3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1154970gA3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154970gA3 enumC1154970gA3 = new EnumC1154970gA3("CHECK_ALIVE_STATE_NONE", 0);
        CHECK_ALIVE_STATE_NONE = enumC1154970gA3;
        EnumC1154970gA3 enumC1154970gA32 = new EnumC1154970gA3("CHECK_ALIVE_STATE_NR", 1);
        CHECK_ALIVE_STATE_NR = enumC1154970gA32;
        EnumC1154970gA3 enumC1154970gA33 = new EnumC1154970gA3("CHECK_ALIVE_STATE_PAUSE", 2);
        CHECK_ALIVE_STATE_PAUSE = enumC1154970gA33;
        EnumC1154970gA3 enumC1154970gA34 = new EnumC1154970gA3("CHECK_ALIVE_STATE_NO_STREAM", 3);
        CHECK_ALIVE_STATE_NO_STREAM = enumC1154970gA34;
        EnumC1154970gA3 enumC1154970gA35 = new EnumC1154970gA3("CHECK_ALIVE_STATE_END", 4);
        CHECK_ALIVE_STATE_END = enumC1154970gA35;
        EnumC1154970gA3[] enumC1154970gA3Arr = {enumC1154970gA3, enumC1154970gA32, enumC1154970gA33, enumC1154970gA34, enumC1154970gA35};
        LL = enumC1154970gA3Arr;
        LLILLJJLI = new C2254308sP(enumC1154970gA3Arr);
    }

    public static EnumC1154970gA3[] values() {
        return (EnumC1154970gA3[]) LL.clone();
    }

    public static EnumC1154970gA3 valueOf(String str) {
        return (EnumC1154970gA3) C08FF.LIZ(EnumC1154970gA3.class, str);
    }

    public EnumC1154970gA3(String str, int i) {
    }
}
