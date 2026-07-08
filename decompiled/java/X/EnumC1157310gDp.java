package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157310gDp {
    public static final /* synthetic */ EnumC1157310gDp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1157310gDp MANUAL;
    public static final EnumC1157310gDp PRELOADING;

    public static InterfaceC2044707zh<EnumC1157310gDp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1157310gDp enumC1157310gDp = new EnumC1157310gDp("MANUAL", 0);
        MANUAL = enumC1157310gDp;
        EnumC1157310gDp enumC1157310gDp2 = new EnumC1157310gDp("PRELOADING", 1);
        PRELOADING = enumC1157310gDp2;
        EnumC1157310gDp[] enumC1157310gDpArr = {enumC1157310gDp, enumC1157310gDp2};
        LL = enumC1157310gDpArr;
        LLILLJJLI = new C2254308sP(enumC1157310gDpArr);
    }

    public static EnumC1157310gDp[] values() {
        return (EnumC1157310gDp[]) LL.clone();
    }

    public static EnumC1157310gDp valueOf(String str) {
        return (EnumC1157310gDp) C08FF.LIZ(EnumC1157310gDp.class, str);
    }

    public EnumC1157310gDp(String str, int i) {
    }
}
