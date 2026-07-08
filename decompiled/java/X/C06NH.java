package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06NH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06NH {
    public static final C06NH BOTTOM;
    public static final C06NH KEYBOARD_FLOATING;
    public static final /* synthetic */ C06NH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06NH TOP;

    public static InterfaceC2044707zh<C06NH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06NH c06nh = new C06NH("TOP", 0);
        TOP = c06nh;
        C06NH c06nh2 = new C06NH("BOTTOM", 1);
        BOTTOM = c06nh2;
        C06NH c06nh3 = new C06NH("KEYBOARD_FLOATING", 2);
        KEYBOARD_FLOATING = c06nh3;
        C06NH[] c06nhArr = {c06nh, c06nh2, c06nh3};
        LL = c06nhArr;
        LLILLJJLI = new C2254308sP(c06nhArr);
    }

    public static C06NH[] values() {
        return (C06NH[]) LL.clone();
    }

    public static C06NH valueOf(String str) {
        return (C06NH) C08FF.LIZ(C06NH.class, str);
    }

    public C06NH(String str, int i) {
    }
}
