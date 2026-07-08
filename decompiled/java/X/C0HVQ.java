package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HVQ {
    public static final C0HVQ ALBUM_PERMISSION_CHECK;
    public static final C0HVQ ALBUM_SHOW;
    public static final /* synthetic */ C0HVQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HVQ PHOTO_SHOW;

    public static InterfaceC2044707zh<C0HVQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HVQ c0hvq = new C0HVQ("ALBUM_PERMISSION_CHECK", 0);
        ALBUM_PERMISSION_CHECK = c0hvq;
        C0HVQ c0hvq2 = new C0HVQ("PHOTO_SHOW", 1);
        PHOTO_SHOW = c0hvq2;
        C0HVQ c0hvq3 = new C0HVQ("ALBUM_SHOW", 2);
        ALBUM_SHOW = c0hvq3;
        C0HVQ[] c0hvqArr = {c0hvq, c0hvq2, c0hvq3};
        LL = c0hvqArr;
        LLILLJJLI = new C2254308sP(c0hvqArr);
    }

    public static C0HVQ[] values() {
        return (C0HVQ[]) LL.clone();
    }

    public static C0HVQ valueOf(String str) {
        return (C0HVQ) C08FF.LIZ(C0HVQ.class, str);
    }

    public C0HVQ(String str, int i) {
    }
}
