package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AN {
    public static final C00AN CreatorPlusStatusEnrollFailed;
    public static final C00AN CreatorPlusStatusEnrolled;
    public static final C00AN CreatorPlusStatusEvicted;
    public static final C00AN CreatorPlusStatusLeft;
    public static final C00AN CreatorPlusStatusMeetsAllRequirements;
    public static final C00AN CreatorPlusStatusMeetsSomeRequirements;
    public static final C00AN CreatorPlusStatusNeverEnrolled;
    public static final C00AN CreatorPlusStatusNoRights;
    public static final C00AN CreatorPlusStatusUnknown;
    public static final /* synthetic */ C00AN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C00AN> getEntries() {
        return LLILLL;
    }

    static {
        C00AN c00an = new C00AN("CreatorPlusStatusUnknown", 0, 0);
        CreatorPlusStatusUnknown = c00an;
        C00AN c00an2 = new C00AN("CreatorPlusStatusNoRights", 1, 1);
        CreatorPlusStatusNoRights = c00an2;
        C00AN c00an3 = new C00AN("CreatorPlusStatusNeverEnrolled", 2, 2);
        CreatorPlusStatusNeverEnrolled = c00an3;
        C00AN c00an4 = new C00AN("CreatorPlusStatusEnrolled", 3, 3);
        CreatorPlusStatusEnrolled = c00an4;
        C00AN c00an5 = new C00AN("CreatorPlusStatusMeetsAllRequirements", 4, 4);
        CreatorPlusStatusMeetsAllRequirements = c00an5;
        C00AN c00an6 = new C00AN("CreatorPlusStatusMeetsSomeRequirements", 5, 5);
        CreatorPlusStatusMeetsSomeRequirements = c00an6;
        C00AN c00an7 = new C00AN("CreatorPlusStatusEnrollFailed", 6, 6);
        CreatorPlusStatusEnrollFailed = c00an7;
        C00AN c00an8 = new C00AN("CreatorPlusStatusLeft", 7, 7);
        CreatorPlusStatusLeft = c00an8;
        C00AN c00an9 = new C00AN("CreatorPlusStatusEvicted", 8, 8);
        CreatorPlusStatusEvicted = c00an9;
        C00AN[] c00anArr = {c00an, c00an2, c00an3, c00an4, c00an5, c00an6, c00an7, c00an8, c00an9};
        LLILLJJLI = c00anArr;
        LLILLL = new C2254308sP(c00anArr);
    }

    public static C00AN[] values() {
        return (C00AN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00AN valueOf(String str) {
        return (C00AN) C08FF.LIZ(C00AN.class, str);
    }

    public C00AN(String str, int i, int i2) {
        this.LL = i2;
    }
}
