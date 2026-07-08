package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1771600wCc {
    public static final EnumC1771600wCc ERROR_RETRY;
    public static final EnumC1771600wCc FIRST_REQUEST;
    public static final /* synthetic */ EnumC1771600wCc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1771600wCc REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1771600wCc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1771600wCc enumC1771600wCc = new EnumC1771600wCc("FIRST_REQUEST", 0, 0);
        FIRST_REQUEST = enumC1771600wCc;
        EnumC1771600wCc enumC1771600wCc2 = new EnumC1771600wCc("ERROR_RETRY", 1, 2);
        ERROR_RETRY = enumC1771600wCc2;
        EnumC1771600wCc enumC1771600wCc3 = new EnumC1771600wCc("REFRESH", 2, 3);
        REFRESH = enumC1771600wCc3;
        EnumC1771600wCc[] enumC1771600wCcArr = {enumC1771600wCc, enumC1771600wCc2, enumC1771600wCc3};
        LLILLJJLI = enumC1771600wCcArr;
        LLILLL = new C2254308sP(enumC1771600wCcArr);
    }

    public static EnumC1771600wCc[] values() {
        return (EnumC1771600wCc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1771600wCc valueOf(String str) {
        return (EnumC1771600wCc) C08FF.LIZ(EnumC1771600wCc.class, str);
    }

    public EnumC1771600wCc(String str, int i, int i2) {
        this.LL = i2;
    }
}
