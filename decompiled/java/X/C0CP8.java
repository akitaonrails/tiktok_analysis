package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CP8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CP8 {
    public static final C0CP8 COLD_BOOT_BEGIN;
    public static final C0CP8 COLD_BOOT_END;
    public static final /* synthetic */ C0CP8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CP8 WARM_BOOT_BEGIN;
    public static final C0CP8 WARM_BOOT_END;

    public static InterfaceC2044707zh<C0CP8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CP8 c0cp8 = new C0CP8("COLD_BOOT_BEGIN", 0);
        COLD_BOOT_BEGIN = c0cp8;
        C0CP8 c0cp82 = new C0CP8("COLD_BOOT_END", 1);
        COLD_BOOT_END = c0cp82;
        C0CP8 c0cp83 = new C0CP8("WARM_BOOT_BEGIN", 2);
        WARM_BOOT_BEGIN = c0cp83;
        C0CP8 c0cp84 = new C0CP8("WARM_BOOT_END", 3);
        WARM_BOOT_END = c0cp84;
        C0CP8[] c0cp8Arr = {c0cp8, c0cp82, c0cp83, c0cp84};
        LL = c0cp8Arr;
        LLILLJJLI = new C2254308sP(c0cp8Arr);
    }

    public static C0CP8[] values() {
        return (C0CP8[]) LL.clone();
    }

    public static C0CP8 valueOf(String str) {
        return (C0CP8) C08FF.LIZ(C0CP8.class, str);
    }

    public C0CP8(String str, int i) {
    }
}
