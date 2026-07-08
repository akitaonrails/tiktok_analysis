package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC765560U1i {
    public static final EnumC765560U1i FAIL;
    public static final /* synthetic */ EnumC765560U1i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC765560U1i QUEUE_FULL;
    public static final EnumC765560U1i SUCCESS;

    public static InterfaceC2044707zh<EnumC765560U1i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC765560U1i enumC765560U1i = new EnumC765560U1i("FAIL", 0);
        FAIL = enumC765560U1i;
        EnumC765560U1i enumC765560U1i2 = new EnumC765560U1i("SUCCESS", 1);
        SUCCESS = enumC765560U1i2;
        EnumC765560U1i enumC765560U1i3 = new EnumC765560U1i("QUEUE_FULL", 2);
        QUEUE_FULL = enumC765560U1i3;
        EnumC765560U1i[] enumC765560U1iArr = {enumC765560U1i, enumC765560U1i2, enumC765560U1i3};
        LL = enumC765560U1iArr;
        LLILLJJLI = new C2254308sP(enumC765560U1iArr);
    }

    public static EnumC765560U1i[] values() {
        return (EnumC765560U1i[]) LL.clone();
    }

    public static EnumC765560U1i valueOf(String str) {
        return (EnumC765560U1i) C08FF.LIZ(EnumC765560U1i.class, str);
    }

    public EnumC765560U1i(String str, int i) {
    }
}
