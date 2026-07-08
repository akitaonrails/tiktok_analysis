package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FJS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJS {
    public static final C0FJS DOWNLOAD;
    public static final C0FJS FETCH;
    public static final /* synthetic */ C0FJS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0FJS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FJS c0fjs = new C0FJS("FETCH", 0);
        FETCH = c0fjs;
        C0FJS c0fjs2 = new C0FJS("DOWNLOAD", 1);
        DOWNLOAD = c0fjs2;
        C0FJS[] c0fjsArr = {c0fjs, c0fjs2};
        LL = c0fjsArr;
        LLILLJJLI = new C2254308sP(c0fjsArr);
    }

    public static C0FJS[] values() {
        return (C0FJS[]) LL.clone();
    }

    public static C0FJS valueOf(String str) {
        return (C0FJS) C08FF.LIZ(C0FJS.class, str);
    }

    public C0FJS(String str, int i) {
    }
}
