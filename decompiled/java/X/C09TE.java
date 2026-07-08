package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09TE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TE {
    public static final C09TE DESTROY;
    public static final /* synthetic */ C09TE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09TE READING;
    public static final C09TE STOP_READING;

    public static InterfaceC2044707zh<C09TE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C09TE c09te = new C09TE("READING", 0);
        READING = c09te;
        C09TE c09te2 = new C09TE("STOP_READING", 1);
        STOP_READING = c09te2;
        C09TE c09te3 = new C09TE("DESTROY", 2);
        DESTROY = c09te3;
        C09TE[] c09teArr = {c09te, c09te2, c09te3};
        LL = c09teArr;
        LLILLJJLI = new C2254308sP(c09teArr);
    }

    public static C09TE[] values() {
        return (C09TE[]) LL.clone();
    }

    public static C09TE valueOf(String str) {
        return (C09TE) C08FF.LIZ(C09TE.class, str);
    }

    public C09TE(String str, int i) {
    }
}
