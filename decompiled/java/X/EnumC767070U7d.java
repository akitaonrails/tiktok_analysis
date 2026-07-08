package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC767070U7d {
    public static final EnumC767070U7d ANALYZING;
    public static final EnumC767070U7d APPLIED;
    public static final EnumC767070U7d CANCELED;
    public static final /* synthetic */ EnumC767070U7d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC767070U7d UNKNOWN;

    public static InterfaceC2044707zh<EnumC767070U7d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC767070U7d enumC767070U7d = new EnumC767070U7d("UNKNOWN", 0);
        UNKNOWN = enumC767070U7d;
        EnumC767070U7d enumC767070U7d2 = new EnumC767070U7d("APPLIED", 1);
        APPLIED = enumC767070U7d2;
        EnumC767070U7d enumC767070U7d3 = new EnumC767070U7d("ANALYZING", 2);
        ANALYZING = enumC767070U7d3;
        EnumC767070U7d enumC767070U7d4 = new EnumC767070U7d("CANCELED", 3);
        CANCELED = enumC767070U7d4;
        EnumC767070U7d[] enumC767070U7dArr = {enumC767070U7d, enumC767070U7d2, enumC767070U7d3, enumC767070U7d4};
        LL = enumC767070U7dArr;
        LLILLJJLI = new C2254308sP(enumC767070U7dArr);
    }

    public static EnumC767070U7d[] values() {
        return (EnumC767070U7d[]) LL.clone();
    }

    public static EnumC767070U7d valueOf(String str) {
        return (EnumC767070U7d) C08FF.LIZ(EnumC767070U7d.class, str);
    }

    public EnumC767070U7d(String str, int i) {
    }
}
