package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19202910Ap {
    public static final EnumC19202910Ap EVENT_CLOSE;
    public static final EnumC19202910Ap EVENT_NEXT;
    public static final EnumC19202910Ap EVENT_PREVIOUS;
    public static final /* synthetic */ EnumC19202910Ap[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19202910Ap> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19202910Ap enumC19202910Ap = new EnumC19202910Ap("EVENT_NEXT", 0);
        EVENT_NEXT = enumC19202910Ap;
        EnumC19202910Ap enumC19202910Ap2 = new EnumC19202910Ap("EVENT_PREVIOUS", 1);
        EVENT_PREVIOUS = enumC19202910Ap2;
        EnumC19202910Ap enumC19202910Ap3 = new EnumC19202910Ap("EVENT_CLOSE", 2);
        EVENT_CLOSE = enumC19202910Ap3;
        EnumC19202910Ap[] enumC19202910ApArr = {enumC19202910Ap, enumC19202910Ap2, enumC19202910Ap3};
        LL = enumC19202910ApArr;
        LLILLJJLI = new C2254308sP(enumC19202910ApArr);
    }

    public static EnumC19202910Ap[] values() {
        return (EnumC19202910Ap[]) LL.clone();
    }

    public static EnumC19202910Ap valueOf(String str) {
        return (EnumC19202910Ap) C08FF.LIZ(EnumC19202910Ap.class, str);
    }

    public EnumC19202910Ap(String str, int i) {
    }
}
