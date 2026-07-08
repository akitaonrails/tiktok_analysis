package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZDI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDI {
    public static final /* synthetic */ C0ZDI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZDI NOTICE_FREQUENCY_CONTROL;
    public static final C0ZDI NO_FREQUENCY_CONTROL;
    public static final C0ZDI RELATION_BUTTON_COMBINE;
    public static final C0ZDI SEPARATE_FREQUENCY_CONTROL;

    public static InterfaceC2044707zh<C0ZDI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZDI c0zdi = new C0ZDI("NO_FREQUENCY_CONTROL", 0);
        NO_FREQUENCY_CONTROL = c0zdi;
        C0ZDI c0zdi2 = new C0ZDI("RELATION_BUTTON_COMBINE", 1);
        RELATION_BUTTON_COMBINE = c0zdi2;
        C0ZDI c0zdi3 = new C0ZDI("SEPARATE_FREQUENCY_CONTROL", 2);
        SEPARATE_FREQUENCY_CONTROL = c0zdi3;
        C0ZDI c0zdi4 = new C0ZDI("NOTICE_FREQUENCY_CONTROL", 3);
        NOTICE_FREQUENCY_CONTROL = c0zdi4;
        C0ZDI[] c0zdiArr = {c0zdi, c0zdi2, c0zdi3, c0zdi4};
        LL = c0zdiArr;
        LLILLJJLI = new C2254308sP(c0zdiArr);
    }

    public static C0ZDI[] values() {
        return (C0ZDI[]) LL.clone();
    }

    public static C0ZDI valueOf(String str) {
        return (C0ZDI) C08FF.LIZ(C0ZDI.class, str);
    }

    public C0ZDI(String str, int i) {
    }
}
