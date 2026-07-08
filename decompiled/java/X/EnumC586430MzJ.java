package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586430MzJ {
    public static final EnumC586430MzJ GIFT_MESSAGE_NULL;
    public static final /* synthetic */ EnumC586430MzJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586430MzJ SEND_EVENT_ERROR;
    public int LL;

    public static InterfaceC2044707zh<EnumC586430MzJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586430MzJ enumC586430MzJ = new EnumC586430MzJ("GIFT_MESSAGE_NULL", 0, 10);
        GIFT_MESSAGE_NULL = enumC586430MzJ;
        EnumC586430MzJ enumC586430MzJ2 = new EnumC586430MzJ("SEND_EVENT_ERROR", 1, 20);
        SEND_EVENT_ERROR = enumC586430MzJ2;
        EnumC586430MzJ[] enumC586430MzJArr = {enumC586430MzJ, enumC586430MzJ2};
        LLILLJJLI = enumC586430MzJArr;
        LLILLL = new C2254308sP(enumC586430MzJArr);
    }

    public static EnumC586430MzJ[] values() {
        return (EnumC586430MzJ[]) LLILLJJLI.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public static EnumC586430MzJ valueOf(String str) {
        return (EnumC586430MzJ) C08FF.LIZ(EnumC586430MzJ.class, str);
    }

    public final void setErrorCode(int i) {
        this.LL = i;
    }

    public EnumC586430MzJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
