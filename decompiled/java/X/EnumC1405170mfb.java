package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1405170mfb {
    public static final /* synthetic */ EnumC1405170mfb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1405170mfb NOT_RETRY;
    public static final EnumC1405170mfb RETRY_BY_PUBLISHER;
    public static final EnumC1405170mfb RETRY_BY_USER;

    public static InterfaceC2044707zh<EnumC1405170mfb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1405170mfb enumC1405170mfb = new EnumC1405170mfb("NOT_RETRY", 0);
        NOT_RETRY = enumC1405170mfb;
        EnumC1405170mfb enumC1405170mfb2 = new EnumC1405170mfb("RETRY_BY_USER", 1);
        RETRY_BY_USER = enumC1405170mfb2;
        EnumC1405170mfb enumC1405170mfb3 = new EnumC1405170mfb("RETRY_BY_PUBLISHER", 2);
        RETRY_BY_PUBLISHER = enumC1405170mfb3;
        EnumC1405170mfb[] enumC1405170mfbArr = {enumC1405170mfb, enumC1405170mfb2, enumC1405170mfb3};
        LL = enumC1405170mfbArr;
        LLILLJJLI = new C2254308sP(enumC1405170mfbArr);
    }

    public static EnumC1405170mfb[] values() {
        return (EnumC1405170mfb[]) LL.clone();
    }

    public static EnumC1405170mfb valueOf(String str) {
        return (EnumC1405170mfb) C08FF.LIZ(EnumC1405170mfb.class, str);
    }

    public EnumC1405170mfb(String str, int i) {
    }
}
