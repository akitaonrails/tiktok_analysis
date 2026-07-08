package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0geU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1173840geU {
    public static final EnumC1173840geU CLOSE_BUTTON;
    public static final /* synthetic */ EnumC1173840geU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1173840geU POST_BUTTON;

    public static InterfaceC2044707zh<EnumC1173840geU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1173840geU enumC1173840geU = new EnumC1173840geU("CLOSE_BUTTON", 0);
        CLOSE_BUTTON = enumC1173840geU;
        EnumC1173840geU enumC1173840geU2 = new EnumC1173840geU("POST_BUTTON", 1);
        POST_BUTTON = enumC1173840geU2;
        EnumC1173840geU[] enumC1173840geUArr = {enumC1173840geU, enumC1173840geU2};
        LL = enumC1173840geUArr;
        LLILLJJLI = new C2254308sP(enumC1173840geUArr);
    }

    public static EnumC1173840geU[] values() {
        return (EnumC1173840geU[]) LL.clone();
    }

    public static EnumC1173840geU valueOf(String str) {
        return (EnumC1173840geU) C08FF.LIZ(EnumC1173840geU.class, str);
    }

    public EnumC1173840geU(String str, int i) {
    }
}
