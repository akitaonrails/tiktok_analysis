package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09EP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09EP {
    public static final C09EP BOOLEAN;
    public static final /* synthetic */ C09EP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09EP LONG;
    public static final C09EP STRING;

    public static InterfaceC2044707zh<C09EP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C09EP c09ep = new C09EP("LONG", 0);
        LONG = c09ep;
        C09EP c09ep2 = new C09EP("STRING", 1);
        STRING = c09ep2;
        C09EP c09ep3 = new C09EP("BOOLEAN", 2);
        BOOLEAN = c09ep3;
        C09EP[] c09epArr = {c09ep, c09ep2, c09ep3};
        LL = c09epArr;
        LLILLJJLI = new C2254308sP(c09epArr);
    }

    public static C09EP[] values() {
        return (C09EP[]) LL.clone();
    }

    public static C09EP valueOf(String str) {
        return (C09EP) C08FF.LIZ(C09EP.class, str);
    }

    public C09EP(String str, int i) {
    }
}
