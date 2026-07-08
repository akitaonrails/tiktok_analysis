package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTJ {
    public static final C0OTJ END;
    public static final /* synthetic */ C0OTJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OTJ NONE;
    public static final C0OTJ NONE_MIRROR;
    public static final C0OTJ START;

    public static InterfaceC2044707zh<C0OTJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OTJ c0otj = new C0OTJ("START", 0);
        START = c0otj;
        C0OTJ c0otj2 = new C0OTJ("END", 1);
        END = c0otj2;
        C0OTJ c0otj3 = new C0OTJ("NONE", 2);
        NONE = c0otj3;
        C0OTJ c0otj4 = new C0OTJ("NONE_MIRROR", 3);
        NONE_MIRROR = c0otj4;
        C0OTJ[] c0otjArr = {c0otj, c0otj2, c0otj3, c0otj4};
        LL = c0otjArr;
        LLILLJJLI = new C2254308sP(c0otjArr);
    }

    public static C0OTJ[] values() {
        return (C0OTJ[]) LL.clone();
    }

    public final boolean hasTail() {
        return this == START || this == END;
    }

    public final boolean isMirror() {
        return this == END || this == NONE_MIRROR;
    }

    public final boolean isSubscriberMirror() {
        return this == START || this == NONE_MIRROR;
    }

    public static C0OTJ valueOf(String str) {
        return (C0OTJ) C08FF.LIZ(C0OTJ.class, str);
    }

    public C0OTJ(String str, int i) {
    }
}
