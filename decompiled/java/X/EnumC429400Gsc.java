package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gsc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429400Gsc {
    public static final /* synthetic */ EnumC429400Gsc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429400Gsc Large;
    public static final EnumC429400Gsc Small;

    public static InterfaceC2044707zh<EnumC429400Gsc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429400Gsc enumC429400Gsc = new EnumC429400Gsc("Small", 0);
        Small = enumC429400Gsc;
        EnumC429400Gsc enumC429400Gsc2 = new EnumC429400Gsc("Large", 1);
        Large = enumC429400Gsc2;
        EnumC429400Gsc[] enumC429400GscArr = {enumC429400Gsc, enumC429400Gsc2};
        LL = enumC429400GscArr;
        LLILLJJLI = new C2254308sP(enumC429400GscArr);
    }

    public static EnumC429400Gsc[] values() {
        return (EnumC429400Gsc[]) LL.clone();
    }

    public static EnumC429400Gsc valueOf(String str) {
        return (EnumC429400Gsc) C08FF.LIZ(EnumC429400Gsc.class, str);
    }

    public EnumC429400Gsc(String str, int i) {
    }
}
