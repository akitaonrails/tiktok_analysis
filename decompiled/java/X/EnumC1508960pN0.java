package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pN0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1508960pN0 {
    public static final /* synthetic */ EnumC1508960pN0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1508960pN0 PLAYER_IDLE;
    public static final EnumC1508960pN0 PLAYER_PAUSE;
    public static final EnumC1508960pN0 PLAYER_START;

    public static InterfaceC2044707zh<EnumC1508960pN0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1508960pN0 enumC1508960pN0 = new EnumC1508960pN0("PLAYER_IDLE", 0);
        PLAYER_IDLE = enumC1508960pN0;
        EnumC1508960pN0 enumC1508960pN02 = new EnumC1508960pN0("PLAYER_START", 1);
        PLAYER_START = enumC1508960pN02;
        EnumC1508960pN0 enumC1508960pN03 = new EnumC1508960pN0("PLAYER_PAUSE", 2);
        PLAYER_PAUSE = enumC1508960pN03;
        EnumC1508960pN0[] enumC1508960pN0Arr = {enumC1508960pN0, enumC1508960pN02, enumC1508960pN03};
        LL = enumC1508960pN0Arr;
        LLILLJJLI = new C2254308sP(enumC1508960pN0Arr);
    }

    public static EnumC1508960pN0[] values() {
        return (EnumC1508960pN0[]) LL.clone();
    }

    public static EnumC1508960pN0 valueOf(String str) {
        return (EnumC1508960pN0) C08FF.LIZ(EnumC1508960pN0.class, str);
    }

    public EnumC1508960pN0(String str, int i) {
    }
}
