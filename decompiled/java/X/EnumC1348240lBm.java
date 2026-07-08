package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1348240lBm {
    public static final EnumC1348240lBm GROUP;
    public static final /* synthetic */ EnumC1348240lBm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "group";

    public static InterfaceC2044707zh<EnumC1348240lBm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1348240lBm enumC1348240lBm = new EnumC1348240lBm();
        GROUP = enumC1348240lBm;
        EnumC1348240lBm[] enumC1348240lBmArr = {enumC1348240lBm};
        LLILLJJLI = enumC1348240lBmArr;
        LLILLL = new C2254308sP(enumC1348240lBmArr);
    }

    public static EnumC1348240lBm[] values() {
        return (EnumC1348240lBm[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1348240lBm valueOf(String str) {
        return (EnumC1348240lBm) C08FF.LIZ(EnumC1348240lBm.class, str);
    }
}
