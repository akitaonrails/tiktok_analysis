package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZQT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQT {
    public static final C0ZQU Companion;
    public static final C0ZQT DM_INLINE;
    public static final C0ZQT FAVOURITE_TAB;
    public static final /* synthetic */ C0ZQT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ZQT LONG_PRESS;
    public final String LL;

    public static InterfaceC2044707zh<C0ZQT> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ZQU] */
    static {
        C0ZQT c0zqt = new C0ZQT("FAVOURITE_TAB", 0, "favourite_tab");
        FAVOURITE_TAB = c0zqt;
        C0ZQT c0zqt2 = new C0ZQT("DM_INLINE", 1, "dm_inline");
        DM_INLINE = c0zqt2;
        C0ZQT c0zqt3 = new C0ZQT("LONG_PRESS", 2, "long_press");
        LONG_PRESS = c0zqt3;
        C0ZQT[] c0zqtArr = {c0zqt, c0zqt2, c0zqt3};
        LLILLJJLI = c0zqtArr;
        LLILLL = new C2254308sP(c0zqtArr);
        Companion = new Object() { // from class: X.0ZQU
            public static C0ZQT LIZ(String str) {
                C0ZQT c0zqt4 = C0ZQT.FAVOURITE_TAB;
                if (!Intrinsics.LJFF(str, c0zqt4.getEtString())) {
                    C0ZQT c0zqt5 = C0ZQT.DM_INLINE;
                    if (!Intrinsics.LJFF(str, c0zqt5.getEtString())) {
                        c0zqt5 = C0ZQT.LONG_PRESS;
                        if (Intrinsics.LJFF(str, c0zqt5.getEtString())) {
                        }
                    }
                    return c0zqt5;
                }
                return c0zqt4;
            }
        };
    }

    public static C0ZQT[] values() {
        return (C0ZQT[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static C0ZQT valueOf(String str) {
        return (C0ZQT) C08FF.LIZ(C0ZQT.class, str);
    }

    public C0ZQT(String str, int i, String str2) {
        this.LL = str2;
    }
}
