package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1454140nwa {
    public static final EnumC1454140nwa CANCELED;
    public static final EnumC1454140nwa FAILED;
    public static final EnumC1454140nwa GENERATING;
    public static final EnumC1454140nwa IDLE;
    public static final /* synthetic */ EnumC1454140nwa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1454140nwa SUCCESS;

    public static InterfaceC2044707zh<EnumC1454140nwa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1454140nwa enumC1454140nwa = new EnumC1454140nwa("IDLE", 0);
        IDLE = enumC1454140nwa;
        EnumC1454140nwa enumC1454140nwa2 = new EnumC1454140nwa("GENERATING", 1);
        GENERATING = enumC1454140nwa2;
        EnumC1454140nwa enumC1454140nwa3 = new EnumC1454140nwa("SUCCESS", 2);
        SUCCESS = enumC1454140nwa3;
        EnumC1454140nwa enumC1454140nwa4 = new EnumC1454140nwa("FAILED", 3);
        FAILED = enumC1454140nwa4;
        EnumC1454140nwa enumC1454140nwa5 = new EnumC1454140nwa("CANCELED", 4);
        CANCELED = enumC1454140nwa5;
        EnumC1454140nwa[] enumC1454140nwaArr = {enumC1454140nwa, enumC1454140nwa2, enumC1454140nwa3, enumC1454140nwa4, enumC1454140nwa5};
        LL = enumC1454140nwaArr;
        LLILLJJLI = new C2254308sP(enumC1454140nwaArr);
    }

    public static EnumC1454140nwa[] values() {
        return (EnumC1454140nwa[]) LL.clone();
    }

    public static EnumC1454140nwa valueOf(String str) {
        return (EnumC1454140nwa) C08FF.LIZ(EnumC1454140nwa.class, str);
    }

    public EnumC1454140nwa(String str, int i) {
    }
}
