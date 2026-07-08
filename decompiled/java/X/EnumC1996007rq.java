package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1996007rq implements C0Q0Q {
    public static final /* synthetic */ EnumC1996007rq[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1996007rq VISUAL_SEARCH_INIT;
    public final String LL;
    public final String LLILLJJLI;

    public EnumC1996007rq() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1996007rq> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1996007rq enumC1996007rq = new EnumC1996007rq(0);
        VISUAL_SEARCH_INIT = enumC1996007rq;
        EnumC1996007rq[] enumC1996007rqArr = {enumC1996007rq};
        LLILLL = enumC1996007rqArr;
        LLILZ = new C2254308sP(enumC1996007rqArr);
    }

    public static EnumC1996007rq[] values() {
        return (EnumC1996007rq[]) LLILLL.clone();
    }

    @Override // X.InterfaceC664500Q4q
    public String getCatalog() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC664500Q4q
    public String getSubcategory() {
        return this.LL;
    }

    public EnumC1996007rq(int i) {
        this.LL = "visual_search_init";
        this.LLILLJJLI = "api_request";
    }

    public static EnumC1996007rq valueOf(String str) {
        return (EnumC1996007rq) C08FF.LIZ(EnumC1996007rq.class, str);
    }
}
