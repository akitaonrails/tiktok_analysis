package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FHI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FHI {
    public static final C0FHI ATTACHED;
    public static final C0FHI CREATED;
    public static final C0FHI DESTROYED;
    public static final C0FHI DETACHED;
    public static final /* synthetic */ C0FHI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0FHI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FHI c0fhi = new C0FHI("CREATED", 0);
        CREATED = c0fhi;
        C0FHI c0fhi2 = new C0FHI("ATTACHED", 1);
        ATTACHED = c0fhi2;
        C0FHI c0fhi3 = new C0FHI("DETACHED", 2);
        DETACHED = c0fhi3;
        C0FHI c0fhi4 = new C0FHI("DESTROYED", 3);
        DESTROYED = c0fhi4;
        C0FHI[] c0fhiArr = {c0fhi, c0fhi2, c0fhi3, c0fhi4};
        LL = c0fhiArr;
        LLILLJJLI = new C2254308sP(c0fhiArr);
    }

    public static C0FHI[] values() {
        return (C0FHI[]) LL.clone();
    }

    public static C0FHI valueOf(String str) {
        return (C0FHI) C08FF.LIZ(C0FHI.class, str);
    }

    public C0FHI(String str, int i) {
    }
}
