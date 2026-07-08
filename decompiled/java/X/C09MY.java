package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09MY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09MY {
    public static final C09MY CACHE;
    public static final /* synthetic */ C09MY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "y+2T0brqfIqkZDbYHfFiN/8XI5fyqrwX5cSWeGVK0ys=";

    public static InterfaceC2044707zh<C09MY> getEntries() {
        return LLILLL;
    }

    static {
        C09MY c09my = new C09MY();
        CACHE = c09my;
        C09MY[] c09myArr = {c09my};
        LLILLJJLI = c09myArr;
        LLILLL = new C2254308sP(c09myArr);
    }

    public static C09MY[] values() {
        return (C09MY[]) LLILLJJLI.clone();
    }

    public final String getToken() {
        return this.LL;
    }

    public static C09MY valueOf(String str) {
        return (C09MY) C08FF.LIZ(C09MY.class, str);
    }
}
