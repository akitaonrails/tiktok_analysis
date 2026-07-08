package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b5K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC959840b5K {
    public static final EnumC959840b5K COHOST_DISCONNECTED;
    public static final /* synthetic */ EnumC959840b5K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC959840b5K TIMEOUT;

    public static InterfaceC2044707zh<EnumC959840b5K> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC959840b5K enumC959840b5K = new EnumC959840b5K("COHOST_DISCONNECTED", 0);
        COHOST_DISCONNECTED = enumC959840b5K;
        EnumC959840b5K enumC959840b5K2 = new EnumC959840b5K("TIMEOUT", 1);
        TIMEOUT = enumC959840b5K2;
        EnumC959840b5K[] enumC959840b5KArr = {enumC959840b5K, enumC959840b5K2};
        LL = enumC959840b5KArr;
        LLILLJJLI = new C2254308sP(enumC959840b5KArr);
    }

    public static EnumC959840b5K[] values() {
        return (EnumC959840b5K[]) LL.clone();
    }

    public static EnumC959840b5K valueOf(String str) {
        return (EnumC959840b5K) C08FF.LIZ(EnumC959840b5K.class, str);
    }

    public EnumC959840b5K(String str, int i) {
    }
}
