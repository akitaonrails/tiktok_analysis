package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671640QWc {
    public static final EnumC671640QWc CANCEL;
    public static final EnumC671640QWc INTERCEPT;
    public static final /* synthetic */ EnumC671640QWc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC671640QWc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC671640QWc enumC671640QWc = new EnumC671640QWc("CANCEL", 0);
        CANCEL = enumC671640QWc;
        EnumC671640QWc enumC671640QWc2 = new EnumC671640QWc("INTERCEPT", 1);
        INTERCEPT = enumC671640QWc2;
        EnumC671640QWc[] enumC671640QWcArr = {enumC671640QWc, enumC671640QWc2};
        LL = enumC671640QWcArr;
        LLILLJJLI = new C2254308sP(enumC671640QWcArr);
    }

    public static EnumC671640QWc[] values() {
        return (EnumC671640QWc[]) LL.clone();
    }

    public static EnumC671640QWc valueOf(String str) {
        return (EnumC671640QWc) C08FF.LIZ(EnumC671640QWc.class, str);
    }

    public EnumC671640QWc(String str, int i) {
    }
}
