package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X65, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X65 {
    public static final /* synthetic */ C0X65[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0X65 TTNet_Android;
    public static final C0X65 TTNet_Native;
    public static final C0X65 UNKNOWN;

    public static InterfaceC2044707zh<C0X65> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0X65 c0x65 = new C0X65("TTNet_Android", 0);
        TTNet_Android = c0x65;
        C0X65 c0x652 = new C0X65("TTNet_Native", 1);
        TTNet_Native = c0x652;
        C0X65 c0x653 = new C0X65("UNKNOWN", 2);
        UNKNOWN = c0x653;
        C0X65[] c0x65Arr = {c0x65, c0x652, c0x653};
        LL = c0x65Arr;
        LLILLJJLI = new C2254308sP(c0x65Arr);
    }

    public static C0X65[] values() {
        return (C0X65[]) LL.clone();
    }

    public static C0X65 valueOf(String str) {
        return (C0X65) C08FF.LIZ(C0X65.class, str);
    }

    public C0X65(String str, int i) {
    }
}
