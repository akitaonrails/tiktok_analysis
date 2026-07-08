package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HHO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHO {
    public static final C0HHO FACE_DETECTION;
    public static final C0HHO INTERNAL;
    public static final /* synthetic */ C0HHO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HHO TNS_ERROR;

    public static InterfaceC2044707zh<C0HHO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HHO c0hho = new C0HHO("TNS_ERROR", 0);
        TNS_ERROR = c0hho;
        C0HHO c0hho2 = new C0HHO("FACE_DETECTION", 1);
        FACE_DETECTION = c0hho2;
        C0HHO c0hho3 = new C0HHO("INTERNAL", 2);
        INTERNAL = c0hho3;
        C0HHO[] c0hhoArr = {c0hho, c0hho2, c0hho3};
        LL = c0hhoArr;
        LLILLJJLI = new C2254308sP(c0hhoArr);
    }

    public static C0HHO[] values() {
        return (C0HHO[]) LL.clone();
    }

    public static C0HHO valueOf(String str) {
        return (C0HHO) C08FF.LIZ(C0HHO.class, str);
    }

    public C0HHO(String str, int i) {
    }
}
