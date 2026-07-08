package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC489460JHk {
    public static final EnumC489460JHk CHECK_ENCOUNTERED_ERROR;
    public static final EnumC489460JHk IN_PROGRESS;
    public static final /* synthetic */ EnumC489460JHk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC489460JHk NOT_STARTED;
    public static final EnumC489460JHk RESULT_PASS;
    public static final EnumC489460JHk RESULT_VIOLATION;

    public static InterfaceC2044707zh<EnumC489460JHk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC489460JHk enumC489460JHk = new EnumC489460JHk("NOT_STARTED", 0);
        NOT_STARTED = enumC489460JHk;
        EnumC489460JHk enumC489460JHk2 = new EnumC489460JHk("IN_PROGRESS", 1);
        IN_PROGRESS = enumC489460JHk2;
        EnumC489460JHk enumC489460JHk3 = new EnumC489460JHk("RESULT_VIOLATION", 2);
        RESULT_VIOLATION = enumC489460JHk3;
        EnumC489460JHk enumC489460JHk4 = new EnumC489460JHk("RESULT_PASS", 3);
        RESULT_PASS = enumC489460JHk4;
        EnumC489460JHk enumC489460JHk5 = new EnumC489460JHk("CHECK_ENCOUNTERED_ERROR", 4);
        CHECK_ENCOUNTERED_ERROR = enumC489460JHk5;
        EnumC489460JHk[] enumC489460JHkArr = {enumC489460JHk, enumC489460JHk2, enumC489460JHk3, enumC489460JHk4, enumC489460JHk5};
        LL = enumC489460JHkArr;
        LLILLJJLI = new C2254308sP(enumC489460JHkArr);
    }

    public static EnumC489460JHk[] values() {
        return (EnumC489460JHk[]) LL.clone();
    }

    public static EnumC489460JHk valueOf(String str) {
        return (EnumC489460JHk) C08FF.LIZ(EnumC489460JHk.class, str);
    }

    public EnumC489460JHk(String str, int i) {
    }
}
