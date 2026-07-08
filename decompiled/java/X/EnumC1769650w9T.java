package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w9T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1769650w9T {
    public static final EnumC1769650w9T HANDLE_BYTESYNC_DELAYED;
    public static final EnumC1769650w9T HANDLE_BYTESYNC_DISABLED;
    public static final EnumC1769650w9T HANDLE_BYTESYNC_IMMEDIATELY;
    public static final /* synthetic */ EnumC1769650w9T[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1769650w9T> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1769650w9T enumC1769650w9T = new EnumC1769650w9T("HANDLE_BYTESYNC_DELAYED", 0);
        HANDLE_BYTESYNC_DELAYED = enumC1769650w9T;
        EnumC1769650w9T enumC1769650w9T2 = new EnumC1769650w9T("HANDLE_BYTESYNC_IMMEDIATELY", 1);
        HANDLE_BYTESYNC_IMMEDIATELY = enumC1769650w9T2;
        EnumC1769650w9T enumC1769650w9T3 = new EnumC1769650w9T("HANDLE_BYTESYNC_DISABLED", 2);
        HANDLE_BYTESYNC_DISABLED = enumC1769650w9T3;
        EnumC1769650w9T[] enumC1769650w9TArr = {enumC1769650w9T, enumC1769650w9T2, enumC1769650w9T3};
        LL = enumC1769650w9TArr;
        LLILLJJLI = new C2254308sP(enumC1769650w9TArr);
    }

    public static EnumC1769650w9T[] values() {
        return (EnumC1769650w9T[]) LL.clone();
    }

    public static EnumC1769650w9T valueOf(String str) {
        return (EnumC1769650w9T) C08FF.LIZ(EnumC1769650w9T.class, str);
    }

    public EnumC1769650w9T(String str, int i) {
    }
}
