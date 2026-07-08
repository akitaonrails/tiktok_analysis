package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154880g9u {
    public static final EnumC1154880g9u GECKO;
    public static final EnumC1154880g9u IMAGE_MODEL;
    public static final /* synthetic */ EnumC1154880g9u[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154880g9u RES_ID;

    public static InterfaceC2044707zh<EnumC1154880g9u> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154880g9u enumC1154880g9u = new EnumC1154880g9u("GECKO", 0);
        GECKO = enumC1154880g9u;
        EnumC1154880g9u enumC1154880g9u2 = new EnumC1154880g9u("RES_ID", 1);
        RES_ID = enumC1154880g9u2;
        EnumC1154880g9u enumC1154880g9u3 = new EnumC1154880g9u("IMAGE_MODEL", 2);
        IMAGE_MODEL = enumC1154880g9u3;
        EnumC1154880g9u[] enumC1154880g9uArr = {enumC1154880g9u, enumC1154880g9u2, enumC1154880g9u3};
        LL = enumC1154880g9uArr;
        LLILLJJLI = new C2254308sP(enumC1154880g9uArr);
    }

    public static EnumC1154880g9u[] values() {
        return (EnumC1154880g9u[]) LL.clone();
    }

    public static EnumC1154880g9u valueOf(String str) {
        return (EnumC1154880g9u) C08FF.LIZ(EnumC1154880g9u.class, str);
    }

    public EnumC1154880g9u(String str, int i) {
    }
}
