package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LXZ {
    public static final /* synthetic */ C0LXZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LXZ OFFLINE_PROCESSING;
    public final String LL = "AIGC_I2V";

    public static InterfaceC2044707zh<C0LXZ> getEntries() {
        return LLILLL;
    }

    static {
        C0LXZ c0lxz = new C0LXZ();
        OFFLINE_PROCESSING = c0lxz;
        C0LXZ[] c0lxzArr = {c0lxz};
        LLILLJJLI = c0lxzArr;
        LLILLL = new C2254308sP(c0lxzArr);
    }

    public static C0LXZ[] values() {
        return (C0LXZ[]) LLILLJJLI.clone();
    }

    public final String getTaskName() {
        return this.LL;
    }

    public static C0LXZ valueOf(String str) {
        return (C0LXZ) C08FF.LIZ(C0LXZ.class, str);
    }
}
