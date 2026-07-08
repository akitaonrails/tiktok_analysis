package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10LT, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LT {
    public static final C10LT AVATAR;
    public static final C10LT COVER;
    public static final C10LT LABEL;
    public static final /* synthetic */ C10LT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C10LT> getEntries() {
        return LLILLL;
    }

    static {
        C10LT c10lt = new C10LT("AVATAR", 0, "avatar");
        AVATAR = c10lt;
        C10LT c10lt2 = new C10LT("LABEL", 1, "label");
        LABEL = c10lt2;
        C10LT c10lt3 = new C10LT("COVER", 2, "cover");
        COVER = c10lt3;
        C10LT[] c10ltArr = {c10lt, c10lt2, c10lt3};
        LLILLJJLI = c10ltArr;
        LLILLL = new C2254308sP(c10ltArr);
    }

    public static C10LT[] values() {
        return (C10LT[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static C10LT valueOf(String str) {
        return (C10LT) C08FF.LIZ(C10LT.class, str);
    }

    public C10LT(String str, int i, String str2) {
        this.LL = str2;
    }
}
