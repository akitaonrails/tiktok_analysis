package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06HR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06HR {
    public static final /* synthetic */ C06HR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06HR NOT_SHOWING;
    public static final C06HR SHOWING;
    public static final C06HR UNDECIDED;

    public static InterfaceC2044707zh<C06HR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06HR c06hr = new C06HR("UNDECIDED", 0);
        UNDECIDED = c06hr;
        C06HR c06hr2 = new C06HR("SHOWING", 1);
        SHOWING = c06hr2;
        C06HR c06hr3 = new C06HR("NOT_SHOWING", 2);
        NOT_SHOWING = c06hr3;
        C06HR[] c06hrArr = {c06hr, c06hr2, c06hr3};
        LL = c06hrArr;
        LLILLJJLI = new C2254308sP(c06hrArr);
    }

    public static C06HR[] values() {
        return (C06HR[]) LL.clone();
    }

    public static C06HR valueOf(String str) {
        return (C06HR) C08FF.LIZ(C06HR.class, str);
    }

    public C06HR(String str, int i) {
    }
}
