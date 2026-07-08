package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0304008o {
    public static final EnumC0304008o CANCEL_NOTIFY_ME;
    public static final /* synthetic */ EnumC0304008o[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0304008o NOTIFY_ME;
    public static final EnumC0304008o ONLY_FIND_SIMILAR;
    public static final EnumC0304008o UNKNOWN;

    public static InterfaceC2044707zh<EnumC0304008o> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0304008o enumC0304008o = new EnumC0304008o("UNKNOWN", 0);
        UNKNOWN = enumC0304008o;
        EnumC0304008o enumC0304008o2 = new EnumC0304008o("NOTIFY_ME", 1);
        NOTIFY_ME = enumC0304008o2;
        EnumC0304008o enumC0304008o3 = new EnumC0304008o("CANCEL_NOTIFY_ME", 2);
        CANCEL_NOTIFY_ME = enumC0304008o3;
        EnumC0304008o enumC0304008o4 = new EnumC0304008o("ONLY_FIND_SIMILAR", 3);
        ONLY_FIND_SIMILAR = enumC0304008o4;
        EnumC0304008o[] enumC0304008oArr = {enumC0304008o, enumC0304008o2, enumC0304008o3, enumC0304008o4};
        LL = enumC0304008oArr;
        LLILLJJLI = new C2254308sP(enumC0304008oArr);
    }

    public static EnumC0304008o[] values() {
        return (EnumC0304008o[]) LL.clone();
    }

    public static EnumC0304008o valueOf(String str) {
        return (EnumC0304008o) C08FF.LIZ(EnumC0304008o.class, str);
    }

    public EnumC0304008o(String str, int i) {
    }
}
