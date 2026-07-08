package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MDI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MDI implements Serializable {
    public static final C0MDI IMAGE_EDITOR;
    public static final /* synthetic */ C0MDI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MDI SHOOT;
    public static final C0MDI VIDEO_EDITOR;

    public static InterfaceC2044707zh<C0MDI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MDI c0mdi = new C0MDI("IMAGE_EDITOR", 0);
        IMAGE_EDITOR = c0mdi;
        C0MDI c0mdi2 = new C0MDI("VIDEO_EDITOR", 1);
        VIDEO_EDITOR = c0mdi2;
        C0MDI c0mdi3 = new C0MDI("SHOOT", 2);
        SHOOT = c0mdi3;
        C0MDI[] c0mdiArr = {c0mdi, c0mdi2, c0mdi3};
        LL = c0mdiArr;
        LLILLJJLI = new C2254308sP(c0mdiArr);
    }

    public static C0MDI[] values() {
        return (C0MDI[]) LL.clone();
    }

    public static C0MDI valueOf(String str) {
        return (C0MDI) C08FF.LIZ(C0MDI.class, str);
    }

    public C0MDI(String str, int i) {
    }
}
