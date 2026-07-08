package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056Y {
    public static final /* synthetic */ C056Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C056Y SINGLE_CONV;
    public static final C056Y WHOLE;
    public final String LL;

    public static InterfaceC2044707zh<C056Y> getEntries() {
        return LLILLL;
    }

    static {
        C056Y c056y = new C056Y("SINGLE_CONV", 0, "single_conv");
        SINGLE_CONV = c056y;
        C056Y c056y2 = new C056Y("WHOLE", 1, "whole");
        WHOLE = c056y2;
        C056Y[] c056yArr = {c056y, c056y2};
        LLILLJJLI = c056yArr;
        LLILLL = new C2254308sP(c056yArr);
    }

    public static C056Y[] values() {
        return (C056Y[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static C056Y valueOf(String str) {
        return (C056Y) C08FF.LIZ(C056Y.class, str);
    }

    public C056Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
