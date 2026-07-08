package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20615215le {
    public static final /* synthetic */ EnumC20615215le[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20615215le NOT_SENT;
    public static final EnumC20615215le SENDING;
    public static final EnumC20615215le SENT;

    public static InterfaceC2044707zh<EnumC20615215le> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20615215le enumC20615215le = new EnumC20615215le("NOT_SENT", 0);
        NOT_SENT = enumC20615215le;
        EnumC20615215le enumC20615215le2 = new EnumC20615215le("SENDING", 1);
        SENDING = enumC20615215le2;
        EnumC20615215le enumC20615215le3 = new EnumC20615215le("SENT", 2);
        SENT = enumC20615215le3;
        EnumC20615215le[] enumC20615215leArr = {enumC20615215le, enumC20615215le2, enumC20615215le3};
        LL = enumC20615215leArr;
        LLILLJJLI = new C2254308sP(enumC20615215leArr);
    }

    public static EnumC20615215le[] values() {
        return (EnumC20615215le[]) LL.clone();
    }

    public static EnumC20615215le valueOf(String str) {
        return (EnumC20615215le) C08FF.LIZ(EnumC20615215le.class, str);
    }

    public EnumC20615215le(String str, int i) {
    }
}
