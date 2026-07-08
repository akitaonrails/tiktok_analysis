package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0spt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1642190spt {
    public static final EnumC1642190spt LL;
    public static final EnumC1642190spt LLILLJJLI;
    public static final EnumC1642190spt LLILLL;
    public static final /* synthetic */ EnumC1642190spt[] LLILZ;

    static {
        EnumC1642190spt enumC1642190spt = new EnumC1642190spt("FILTER_BOX_SHOW", 0);
        LL = enumC1642190spt;
        EnumC1642190spt enumC1642190spt2 = new EnumC1642190spt("FILTER_VIEW_SHOW", 1);
        LLILLJJLI = enumC1642190spt2;
        EnumC1642190spt enumC1642190spt3 = new EnumC1642190spt("HIDE", 2);
        LLILLL = enumC1642190spt3;
        EnumC1642190spt[] enumC1642190sptArr = {enumC1642190spt, enumC1642190spt2, enumC1642190spt3};
        LLILZ = enumC1642190sptArr;
        new C2254308sP(enumC1642190sptArr);
    }

    public static EnumC1642190spt[] values() {
        return (EnumC1642190spt[]) LLILZ.clone();
    }

    public static EnumC1642190spt valueOf(String str) {
        return (EnumC1642190spt) C08FF.LIZ(EnumC1642190spt.class, str);
    }

    public EnumC1642190spt(String str, int i) {
    }
}
