package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01fH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC389301fH {
    public static final /* synthetic */ EnumC389301fH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC389301fH QUEUE;
    public static final EnumC389301fH WIDGET;

    public static InterfaceC2044707zh<EnumC389301fH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC389301fH enumC389301fH = new EnumC389301fH("QUEUE", 0);
        QUEUE = enumC389301fH;
        EnumC389301fH enumC389301fH2 = new EnumC389301fH("WIDGET", 1);
        WIDGET = enumC389301fH2;
        EnumC389301fH[] enumC389301fHArr = {enumC389301fH, enumC389301fH2};
        LL = enumC389301fHArr;
        LLILLJJLI = new C2254308sP(enumC389301fHArr);
    }

    public static EnumC389301fH[] values() {
        return (EnumC389301fH[]) LL.clone();
    }

    public static EnumC389301fH valueOf(String str) {
        return (EnumC389301fH) C08FF.LIZ(EnumC389301fH.class, str);
    }

    public EnumC389301fH(String str, int i) {
    }
}
