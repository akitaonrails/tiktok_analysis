package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1551610qTn {
    public static final EnumC1551610qTn DOWNLOADING;
    public static final EnumC1551610qTn FINISHED;
    public static final /* synthetic */ EnumC1551610qTn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1551610qTn PAUSED;
    public static final EnumC1551610qTn PENDING;

    public static InterfaceC2044707zh<EnumC1551610qTn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1551610qTn enumC1551610qTn = new EnumC1551610qTn("PENDING", 0);
        PENDING = enumC1551610qTn;
        EnumC1551610qTn enumC1551610qTn2 = new EnumC1551610qTn("DOWNLOADING", 1);
        DOWNLOADING = enumC1551610qTn2;
        EnumC1551610qTn enumC1551610qTn3 = new EnumC1551610qTn("PAUSED", 2);
        PAUSED = enumC1551610qTn3;
        EnumC1551610qTn enumC1551610qTn4 = new EnumC1551610qTn("FINISHED", 3);
        FINISHED = enumC1551610qTn4;
        EnumC1551610qTn[] enumC1551610qTnArr = {enumC1551610qTn, enumC1551610qTn2, enumC1551610qTn3, enumC1551610qTn4};
        LL = enumC1551610qTnArr;
        LLILLJJLI = new C2254308sP(enumC1551610qTnArr);
    }

    public static EnumC1551610qTn[] values() {
        return (EnumC1551610qTn[]) LL.clone();
    }

    public static EnumC1551610qTn valueOf(String str) {
        return (EnumC1551610qTn) C08FF.LIZ(EnumC1551610qTn.class, str);
    }

    public EnumC1551610qTn(String str, int i) {
    }
}
