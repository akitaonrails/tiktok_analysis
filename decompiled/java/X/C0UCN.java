package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UCN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCN {
    public static final C0UCN ALBUM;
    public static final C0UCN AVATAR;
    public static final C0UCN GREEN_SCREEN;
    public static final /* synthetic */ C0UCN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0UCN NORMAL;

    public static InterfaceC2044707zh<C0UCN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0UCN c0ucn = new C0UCN("GREEN_SCREEN", 0);
        GREEN_SCREEN = c0ucn;
        C0UCN c0ucn2 = new C0UCN("ALBUM", 1);
        ALBUM = c0ucn2;
        C0UCN c0ucn3 = new C0UCN("AVATAR", 2);
        AVATAR = c0ucn3;
        C0UCN c0ucn4 = new C0UCN("NORMAL", 3);
        NORMAL = c0ucn4;
        C0UCN[] c0ucnArr = {c0ucn, c0ucn2, c0ucn3, c0ucn4};
        LL = c0ucnArr;
        LLILLJJLI = new C2254308sP(c0ucnArr);
    }

    public static C0UCN[] values() {
        return (C0UCN[]) LL.clone();
    }

    public static C0UCN valueOf(String str) {
        return (C0UCN) C08FF.LIZ(C0UCN.class, str);
    }

    public C0UCN(String str, int i) {
    }
}
