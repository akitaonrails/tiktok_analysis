package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DAM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DAM {
    public static final /* synthetic */ C0DAM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DAM NOT_SHOWN;
    public static final C0DAM SHOWN;

    public static InterfaceC2044707zh<C0DAM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DAM c0dam = new C0DAM("NOT_SHOWN", 0);
        NOT_SHOWN = c0dam;
        C0DAM c0dam2 = new C0DAM("SHOWN", 1);
        SHOWN = c0dam2;
        C0DAM[] c0damArr = {c0dam, c0dam2};
        LL = c0damArr;
        LLILLJJLI = new C2254308sP(c0damArr);
    }

    public static C0DAM[] values() {
        return (C0DAM[]) LL.clone();
    }

    public static C0DAM valueOf(String str) {
        return (C0DAM) C08FF.LIZ(C0DAM.class, str);
    }

    public C0DAM(String str, int i) {
    }
}
