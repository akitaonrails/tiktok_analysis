package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pMB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1508450pMB {
    public static final EnumC1508450pMB HORIZONTAL;
    public static final /* synthetic */ EnumC1508450pMB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1508450pMB PORTRAIT;
    public static final EnumC1508450pMB PREVIEW;

    public static InterfaceC2044707zh<EnumC1508450pMB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1508450pMB enumC1508450pMB = new EnumC1508450pMB("PREVIEW", 0);
        PREVIEW = enumC1508450pMB;
        EnumC1508450pMB enumC1508450pMB2 = new EnumC1508450pMB("PORTRAIT", 1);
        PORTRAIT = enumC1508450pMB2;
        EnumC1508450pMB enumC1508450pMB3 = new EnumC1508450pMB("HORIZONTAL", 2);
        HORIZONTAL = enumC1508450pMB3;
        EnumC1508450pMB[] enumC1508450pMBArr = {enumC1508450pMB, enumC1508450pMB2, enumC1508450pMB3};
        LL = enumC1508450pMBArr;
        LLILLJJLI = new C2254308sP(enumC1508450pMBArr);
    }

    public static EnumC1508450pMB[] values() {
        return (EnumC1508450pMB[]) LL.clone();
    }

    public static EnumC1508450pMB valueOf(String str) {
        return (EnumC1508450pMB) C08FF.LIZ(EnumC1508450pMB.class, str);
    }

    public EnumC1508450pMB(String str, int i) {
    }
}
