package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HVW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HVW {
    public static final /* synthetic */ C0HVW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HVW NOT_NEED_TAKE_PHOTO_PERMISSION;
    public static final C0HVW NO_TAKE_PHOTO_PERMISSION;
    public static final C0HVW TAKE_PHOTO_PERMISSION;

    public static InterfaceC2044707zh<C0HVW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HVW c0hvw = new C0HVW("TAKE_PHOTO_PERMISSION", 0);
        TAKE_PHOTO_PERMISSION = c0hvw;
        C0HVW c0hvw2 = new C0HVW("NO_TAKE_PHOTO_PERMISSION", 1);
        NO_TAKE_PHOTO_PERMISSION = c0hvw2;
        C0HVW c0hvw3 = new C0HVW("NOT_NEED_TAKE_PHOTO_PERMISSION", 2);
        NOT_NEED_TAKE_PHOTO_PERMISSION = c0hvw3;
        C0HVW[] c0hvwArr = {c0hvw, c0hvw2, c0hvw3};
        LL = c0hvwArr;
        LLILLJJLI = new C2254308sP(c0hvwArr);
    }

    public static C0HVW[] values() {
        return (C0HVW[]) LL.clone();
    }

    public static C0HVW valueOf(String str) {
        return (C0HVW) C08FF.LIZ(C0HVW.class, str);
    }

    public C0HVW(String str, int i) {
    }
}
