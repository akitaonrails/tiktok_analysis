package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HXD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXD {
    public static final /* synthetic */ C0HXD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HXD QR_SCAN;
    public static final C0HXD TAKE_PHOTO;

    public static InterfaceC2044707zh<C0HXD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HXD c0hxd = new C0HXD("TAKE_PHOTO", 0);
        TAKE_PHOTO = c0hxd;
        C0HXD c0hxd2 = new C0HXD("QR_SCAN", 1);
        QR_SCAN = c0hxd2;
        C0HXD[] c0hxdArr = {c0hxd, c0hxd2};
        LL = c0hxdArr;
        LLILLJJLI = new C2254308sP(c0hxdArr);
    }

    public static C0HXD[] values() {
        return (C0HXD[]) LL.clone();
    }

    public static C0HXD valueOf(String str) {
        return (C0HXD) C08FF.LIZ(C0HXD.class, str);
    }

    public C0HXD(String str, int i) {
    }
}
