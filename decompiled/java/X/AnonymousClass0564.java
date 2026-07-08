package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0564, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0564 {
    public static final /* synthetic */ AnonymousClass0564[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0564 SORT_FIELD_CREATE_TIME;
    public static final AnonymousClass0564 SORT_FIELD_DISCOUNT_PRICE;
    public static final AnonymousClass0564 SORT_FIELD_POPULAR;
    public static final AnonymousClass0564 SORT_FIELD_PRICE;
    public static final AnonymousClass0564 SORT_FIELD_SALES;
    public final int LL;

    public static InterfaceC2044707zh<AnonymousClass0564> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0564 anonymousClass0564 = new AnonymousClass0564("SORT_FIELD_POPULAR", 0, 1);
        SORT_FIELD_POPULAR = anonymousClass0564;
        AnonymousClass0564 anonymousClass05642 = new AnonymousClass0564("SORT_FIELD_PRICE", 1, 2);
        SORT_FIELD_PRICE = anonymousClass05642;
        AnonymousClass0564 anonymousClass05643 = new AnonymousClass0564("SORT_FIELD_CREATE_TIME", 2, 3);
        SORT_FIELD_CREATE_TIME = anonymousClass05643;
        AnonymousClass0564 anonymousClass05644 = new AnonymousClass0564("SORT_FIELD_SALES", 3, 4);
        SORT_FIELD_SALES = anonymousClass05644;
        AnonymousClass0564 anonymousClass05645 = new AnonymousClass0564("SORT_FIELD_DISCOUNT_PRICE", 4, 5);
        SORT_FIELD_DISCOUNT_PRICE = anonymousClass05645;
        AnonymousClass0564[] anonymousClass0564Arr = {anonymousClass0564, anonymousClass05642, anonymousClass05643, anonymousClass05644, anonymousClass05645};
        LLILLJJLI = anonymousClass0564Arr;
        LLILLL = new C2254308sP(anonymousClass0564Arr);
    }

    public static AnonymousClass0564[] values() {
        return (AnonymousClass0564[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static AnonymousClass0564 valueOf(String str) {
        return (AnonymousClass0564) C08FF.LIZ(AnonymousClass0564.class, str);
    }

    public AnonymousClass0564(String str, int i, int i2) {
        this.LL = i2;
    }
}
