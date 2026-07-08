package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216700hlc {
    public static final EnumC1216700hlc DESTRUCTIVE;
    public static final /* synthetic */ EnumC1216700hlc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1216700hlc NORMAL;

    public static InterfaceC2044707zh<EnumC1216700hlc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1216700hlc enumC1216700hlc = new EnumC1216700hlc("NORMAL", 0);
        NORMAL = enumC1216700hlc;
        EnumC1216700hlc enumC1216700hlc2 = new EnumC1216700hlc("DESTRUCTIVE", 1);
        DESTRUCTIVE = enumC1216700hlc2;
        EnumC1216700hlc[] enumC1216700hlcArr = {enumC1216700hlc, enumC1216700hlc2};
        LL = enumC1216700hlcArr;
        LLILLJJLI = new C2254308sP(enumC1216700hlcArr);
    }

    public static EnumC1216700hlc[] values() {
        return (EnumC1216700hlc[]) LL.clone();
    }

    public static EnumC1216700hlc valueOf(String str) {
        return (EnumC1216700hlc) C08FF.LIZ(EnumC1216700hlc.class, str);
    }

    public EnumC1216700hlc(String str, int i) {
    }
}
