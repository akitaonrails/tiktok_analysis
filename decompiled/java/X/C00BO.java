package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BO {
    public static final C00BO LAST_PICTURE_SWIPE_LEFT;
    public static final /* synthetic */ C00BO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 6;

    public static InterfaceC2044707zh<C00BO> getEntries() {
        return LLILLL;
    }

    static {
        C00BO c00bo = new C00BO();
        LAST_PICTURE_SWIPE_LEFT = c00bo;
        C00BO[] c00boArr = {c00bo};
        LLILLJJLI = c00boArr;
        LLILLL = new C2254308sP(c00boArr);
    }

    public static C00BO[] values() {
        return (C00BO[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00BO valueOf(String str) {
        return (C00BO) C08FF.LIZ(C00BO.class, str);
    }
}
