package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCR {
    public static final /* synthetic */ C0NCR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NCR VIEW_INVISIBLE;
    public final String LL = "view_invisible";

    public static InterfaceC2044707zh<C0NCR> getEntries() {
        return LLILLL;
    }

    static {
        C0NCR c0ncr = new C0NCR();
        VIEW_INVISIBLE = c0ncr;
        C0NCR[] c0ncrArr = {c0ncr};
        LLILLJJLI = c0ncrArr;
        LLILLL = new C2254308sP(c0ncrArr);
    }

    public static C0NCR[] values() {
        return (C0NCR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0NCR valueOf(String str) {
        return (C0NCR) C08FF.LIZ(C0NCR.class, str);
    }
}
