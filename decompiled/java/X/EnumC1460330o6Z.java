package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1460330o6Z {
    public static final EnumC1460330o6Z INITIATION;
    public static final /* synthetic */ EnumC1460330o6Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1460330o6Z POST_TO_STORY;
    public static final EnumC1460330o6Z QUICK_PUBLISH;

    public static InterfaceC2044707zh<EnumC1460330o6Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1460330o6Z enumC1460330o6Z = new EnumC1460330o6Z("INITIATION", 0);
        INITIATION = enumC1460330o6Z;
        EnumC1460330o6Z enumC1460330o6Z2 = new EnumC1460330o6Z("QUICK_PUBLISH", 1);
        QUICK_PUBLISH = enumC1460330o6Z2;
        EnumC1460330o6Z enumC1460330o6Z3 = new EnumC1460330o6Z("POST_TO_STORY", 2);
        POST_TO_STORY = enumC1460330o6Z3;
        EnumC1460330o6Z[] enumC1460330o6ZArr = {enumC1460330o6Z, enumC1460330o6Z2, enumC1460330o6Z3};
        LL = enumC1460330o6ZArr;
        LLILLJJLI = new C2254308sP(enumC1460330o6ZArr);
    }

    public static EnumC1460330o6Z[] values() {
        return (EnumC1460330o6Z[]) LL.clone();
    }

    public static EnumC1460330o6Z valueOf(String str) {
        return (EnumC1460330o6Z) C08FF.LIZ(EnumC1460330o6Z.class, str);
    }

    public EnumC1460330o6Z(String str, int i) {
    }
}
