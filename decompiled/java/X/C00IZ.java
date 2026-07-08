package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IZ {
    public static final /* synthetic */ C00IZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00IZ PUBLISH_BUTTON;
    public static final C00IZ SHUTTER_BUTTON;
    public static final C00IZ SOCIAL_AVATAR_CAMERA_BOTTOM_SHUTTER_GUIDE_VIEW;
    public static final C00IZ SOCIAL_AVATAR_UPLOAD_BUTTON;

    public static InterfaceC2044707zh<C00IZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00IZ c00iz = new C00IZ("SOCIAL_AVATAR_CAMERA_BOTTOM_SHUTTER_GUIDE_VIEW", 0);
        SOCIAL_AVATAR_CAMERA_BOTTOM_SHUTTER_GUIDE_VIEW = c00iz;
        C00IZ c00iz2 = new C00IZ("SHUTTER_BUTTON", 1);
        SHUTTER_BUTTON = c00iz2;
        C00IZ c00iz3 = new C00IZ("PUBLISH_BUTTON", 2);
        PUBLISH_BUTTON = c00iz3;
        C00IZ c00iz4 = new C00IZ("SOCIAL_AVATAR_UPLOAD_BUTTON", 3);
        SOCIAL_AVATAR_UPLOAD_BUTTON = c00iz4;
        C00IZ[] c00izArr = {c00iz, c00iz2, c00iz3, c00iz4};
        LL = c00izArr;
        LLILLJJLI = new C2254308sP(c00izArr);
    }

    public static C00IZ[] values() {
        return (C00IZ[]) LL.clone();
    }

    public static C00IZ valueOf(String str) {
        return (C00IZ) C08FF.LIZ(C00IZ.class, str);
    }

    public C00IZ(String str, int i) {
    }
}
