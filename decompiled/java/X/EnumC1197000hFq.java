package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1197000hFq {
    public static final EnumC1197000hFq CTA;
    public static final /* synthetic */ EnumC1197000hFq[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1197000hFq MIDDLE_TAG;
    public static final EnumC1197000hFq NORMAL;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1197000hFq> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1197000hFq enumC1197000hFq = new EnumC1197000hFq("NORMAL", 0, "normal", "c1480.d62881");
        NORMAL = enumC1197000hFq;
        EnumC1197000hFq enumC1197000hFq2 = new EnumC1197000hFq("MIDDLE_TAG", 1, "middle_tag", "c1480.d32553");
        MIDDLE_TAG = enumC1197000hFq2;
        EnumC1197000hFq enumC1197000hFq3 = new EnumC1197000hFq("CTA", 2, "cta", "c1480.d59146");
        CTA = enumC1197000hFq3;
        EnumC1197000hFq[] enumC1197000hFqArr = {enumC1197000hFq, enumC1197000hFq2, enumC1197000hFq3};
        LLILLL = enumC1197000hFqArr;
        LLILZ = new C2254308sP(enumC1197000hFqArr);
    }

    public static EnumC1197000hFq[] values() {
        return (EnumC1197000hFq[]) LLILLL.clone();
    }

    public final String getAreaName() {
        return this.LL;
    }

    public final String getBtm() {
        return this.LLILLJJLI;
    }

    public static EnumC1197000hFq valueOf(String str) {
        return (EnumC1197000hFq) C08FF.LIZ(EnumC1197000hFq.class, str);
    }

    public EnumC1197000hFq(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
