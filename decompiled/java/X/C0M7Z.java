package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M7Z {
    public static final /* synthetic */ C0M7Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0M7Z LongPress;
    public static final C0M7Z ShareButton;

    public static InterfaceC2044707zh<C0M7Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0M7Z c0m7z = new C0M7Z("ShareButton", 0);
        ShareButton = c0m7z;
        C0M7Z c0m7z2 = new C0M7Z("LongPress", 1);
        LongPress = c0m7z2;
        C0M7Z[] c0m7zArr = {c0m7z, c0m7z2};
        LL = c0m7zArr;
        LLILLJJLI = new C2254308sP(c0m7zArr);
    }

    public static C0M7Z[] values() {
        return (C0M7Z[]) LL.clone();
    }

    public static C0M7Z valueOf(String str) {
        return (C0M7Z) C08FF.LIZ(C0M7Z.class, str);
    }

    public C0M7Z(String str, int i) {
    }
}
