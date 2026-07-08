package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LGK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LGK {
    public static final /* synthetic */ C0LGK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LGK PHOTO;
    public static final C0LGK PHOTO_AND_VIDEO;
    public static final C0LGK VIDEO;

    public static InterfaceC2044707zh<C0LGK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LGK c0lgk = new C0LGK("PHOTO", 0);
        PHOTO = c0lgk;
        C0LGK c0lgk2 = new C0LGK("PHOTO_AND_VIDEO", 1);
        PHOTO_AND_VIDEO = c0lgk2;
        C0LGK c0lgk3 = new C0LGK("VIDEO", 2);
        VIDEO = c0lgk3;
        C0LGK[] c0lgkArr = {c0lgk, c0lgk2, c0lgk3};
        LL = c0lgkArr;
        LLILLJJLI = new C2254308sP(c0lgkArr);
    }

    public static C0LGK[] values() {
        return (C0LGK[]) LL.clone();
    }

    public static C0LGK valueOf(String str) {
        return (C0LGK) C08FF.LIZ(C0LGK.class, str);
    }

    public C0LGK(String str, int i) {
    }
}
