package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009L {
    public static final /* synthetic */ C009L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009L TypeFeature;
    public static final C009L TypeNormal;
    public static final C009L TypeTime;

    public static InterfaceC2044707zh<C009L> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009L c009l = new C009L("TypeNormal", 0);
        TypeNormal = c009l;
        C009L c009l2 = new C009L("TypeTime", 1);
        TypeTime = c009l2;
        C009L c009l3 = new C009L("TypeFeature", 2);
        TypeFeature = c009l3;
        C009L[] c009lArr = {c009l, c009l2, c009l3};
        LL = c009lArr;
        LLILLJJLI = new C2254308sP(c009lArr);
    }

    public static C009L[] values() {
        return (C009L[]) LL.clone();
    }

    public static C009L valueOf(String str) {
        return (C009L) C08FF.LIZ(C009L.class, str);
    }

    public C009L(String str, int i) {
    }
}
