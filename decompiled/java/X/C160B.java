package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.160B, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160B {
    public static final C160B EXPANDED;
    public static final C160B HIDDEN;
    public static final /* synthetic */ C160B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C160B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C160B c160b = new C160B("HIDDEN", 0);
        HIDDEN = c160b;
        C160B c160b2 = new C160B("EXPANDED", 1);
        EXPANDED = c160b2;
        C160B[] c160bArr = {c160b, c160b2};
        LL = c160bArr;
        LLILLJJLI = new C2254308sP(c160bArr);
    }

    public static C160B[] values() {
        return (C160B[]) LL.clone();
    }

    public final String getCaptionShowType() {
        int i = C160F.LIZ[ordinal()];
        if (i == 1) {
            return "hidden";
        }
        if (i == 2) {
            return "captions";
        }
        throw new C1954807lC();
    }

    public static C160B valueOf(String str) {
        return (C160B) C08FF.LIZ(C160B.class, str);
    }

    public C160B(String str, int i) {
    }
}
