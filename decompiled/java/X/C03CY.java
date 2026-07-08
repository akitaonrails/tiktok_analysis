package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CY {
    public static final /* synthetic */ C03CY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03CY PICKUP_POINT_LOCATION;
    public static final C03CY RECOMMEND_LOGISTICS;
    public static final C03CY TOTAL_LOGISTICS;
    public final String LL;

    public static InterfaceC2044707zh<C03CY> getEntries() {
        return LLILLL;
    }

    static {
        C03CY c03cy = new C03CY("TOTAL_LOGISTICS", 0, "total_logistics");
        TOTAL_LOGISTICS = c03cy;
        C03CY c03cy2 = new C03CY("RECOMMEND_LOGISTICS", 1, "recommend_logistics");
        RECOMMEND_LOGISTICS = c03cy2;
        C03CY c03cy3 = new C03CY("PICKUP_POINT_LOCATION", 2, "pickup_point_location");
        PICKUP_POINT_LOCATION = c03cy3;
        C03CY[] c03cyArr = {c03cy, c03cy2, c03cy3};
        LLILLJJLI = c03cyArr;
        LLILLL = new C2254308sP(c03cyArr);
    }

    public static C03CY[] values() {
        return (C03CY[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C03CY valueOf(String str) {
        return (C03CY) C08FF.LIZ(C03CY.class, str);
    }

    public C03CY(String str, int i, String str2) {
        this.LL = str2;
    }
}
