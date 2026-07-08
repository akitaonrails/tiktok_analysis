package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1131970fYx {
    public static final EnumC1131970fYx CANCELLED;
    public static final EnumC1131970fYx FAILED;
    public static final /* synthetic */ EnumC1131970fYx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1131970fYx TIMED_OUT;

    public static InterfaceC2044707zh<EnumC1131970fYx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1131970fYx enumC1131970fYx = new EnumC1131970fYx("TIMED_OUT", 0);
        TIMED_OUT = enumC1131970fYx;
        EnumC1131970fYx enumC1131970fYx2 = new EnumC1131970fYx("FAILED", 1);
        FAILED = enumC1131970fYx2;
        EnumC1131970fYx enumC1131970fYx3 = new EnumC1131970fYx("CANCELLED", 2);
        CANCELLED = enumC1131970fYx3;
        EnumC1131970fYx[] enumC1131970fYxArr = {enumC1131970fYx, enumC1131970fYx2, enumC1131970fYx3};
        LL = enumC1131970fYxArr;
        LLILLJJLI = new C2254308sP(enumC1131970fYxArr);
    }

    public static EnumC1131970fYx[] values() {
        return (EnumC1131970fYx[]) LL.clone();
    }

    public static EnumC1131970fYx valueOf(String str) {
        return (EnumC1131970fYx) C08FF.LIZ(EnumC1131970fYx.class, str);
    }

    public EnumC1131970fYx(String str, int i) {
    }
}
