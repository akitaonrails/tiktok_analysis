package X;

import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q4F, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q4F {
    public static final C0Q4F GLOBAL;
    public static final C0Q4F GROUP_ID;
    public static final /* synthetic */ C0Q4F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0Q4F SESSION_ID;
    public final Function1<C650960Pg6, Object> LL;

    public static InterfaceC2044707zh<C0Q4F> getEntries() {
        return LLILLL;
    }

    static {
        C0Q4F c0q4f = new C0Q4F(0, "SESSION_ID", new C0Q4G());
        SESSION_ID = c0q4f;
        C0Q4F c0q4f2 = new C0Q4F(1, "GROUP_ID", new C0Q4H());
        GROUP_ID = c0q4f2;
        C0Q4F c0q4f3 = new C0Q4F(2, "GLOBAL", new C0Q4I());
        GLOBAL = c0q4f3;
        C0Q4F[] c0q4fArr = {c0q4f, c0q4f2, c0q4f3};
        LLILLJJLI = c0q4fArr;
        LLILLL = new C2254308sP(c0q4fArr);
    }

    public static C0Q4F[] values() {
        return (C0Q4F[]) LLILLJJLI.clone();
    }

    public final Function1<C650960Pg6, Object> getSignalBinder() {
        return this.LL;
    }

    public static C0Q4F valueOf(String str) {
        return (C0Q4F) C08FF.LIZ(C0Q4F.class, str);
    }

    public C0Q4F(int i, String str, Function1 function1) {
        this.LL = function1;
    }
}
