package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X5B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X5B {
    public static final /* synthetic */ C0X5B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0X5B PLANB;
    public static final C0X5B TTNET;

    public static InterfaceC2044707zh<C0X5B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0X5B c0x5b = new C0X5B("TTNET", 0);
        TTNET = c0x5b;
        C0X5B c0x5b2 = new C0X5B("PLANB", 1);
        PLANB = c0x5b2;
        C0X5B[] c0x5bArr = {c0x5b, c0x5b2};
        LL = c0x5bArr;
        LLILLJJLI = new C2254308sP(c0x5bArr);
    }

    public static C0X5B[] values() {
        return (C0X5B[]) LL.clone();
    }

    public static C0X5B valueOf(String str) {
        return (C0X5B) C08FF.LIZ(C0X5B.class, str);
    }

    public C0X5B(String str, int i) {
    }
}
