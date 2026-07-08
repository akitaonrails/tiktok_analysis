package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZZ {
    public static final C03ZZ EXPAND;
    public static final C03ZZ HIDE;
    public static final /* synthetic */ C03ZZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C03ZZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03ZZ c03zz = new C03ZZ("EXPAND", 0);
        EXPAND = c03zz;
        C03ZZ c03zz2 = new C03ZZ("HIDE", 1);
        HIDE = c03zz2;
        C03ZZ[] c03zzArr = {c03zz, c03zz2};
        LL = c03zzArr;
        LLILLJJLI = new C2254308sP(c03zzArr);
    }

    public static C03ZZ[] values() {
        return (C03ZZ[]) LL.clone();
    }

    public static C03ZZ valueOf(String str) {
        return (C03ZZ) C08FF.LIZ(C03ZZ.class, str);
    }

    public C03ZZ(String str, int i) {
    }
}
