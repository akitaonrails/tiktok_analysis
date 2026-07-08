package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1801970wzb {
    public static final /* synthetic */ EnumC1801970wzb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1801970wzb V0;
    public static final EnumC1801970wzb V1;
    public static final EnumC1801970wzb V2;
    public static final EnumC1801970wzb V3;

    public static InterfaceC2044707zh<EnumC1801970wzb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1801970wzb enumC1801970wzb = new EnumC1801970wzb("V0", 0);
        V0 = enumC1801970wzb;
        EnumC1801970wzb enumC1801970wzb2 = new EnumC1801970wzb("V1", 1);
        V1 = enumC1801970wzb2;
        EnumC1801970wzb enumC1801970wzb3 = new EnumC1801970wzb("V2", 2);
        V2 = enumC1801970wzb3;
        EnumC1801970wzb enumC1801970wzb4 = new EnumC1801970wzb("V3", 3);
        V3 = enumC1801970wzb4;
        EnumC1801970wzb[] enumC1801970wzbArr = {enumC1801970wzb, enumC1801970wzb2, enumC1801970wzb3, enumC1801970wzb4};
        LL = enumC1801970wzbArr;
        LLILLJJLI = new C2254308sP(enumC1801970wzbArr);
    }

    public static EnumC1801970wzb[] values() {
        return (EnumC1801970wzb[]) LL.clone();
    }

    public static EnumC1801970wzb valueOf(String str) {
        return (EnumC1801970wzb) C08FF.LIZ(EnumC1801970wzb.class, str);
    }

    public EnumC1801970wzb(String str, int i) {
    }
}
