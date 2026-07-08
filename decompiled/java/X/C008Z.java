package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008Z, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008Z {
    public static final C008Z EFFECT_COMPONENT_ALBUM_PICKER;
    public static final /* synthetic */ C008Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C008Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008Z c008z = new C008Z();
        EFFECT_COMPONENT_ALBUM_PICKER = c008z;
        C008Z[] c008zArr = {c008z};
        LL = c008zArr;
        LLILLJJLI = new C2254308sP(c008zArr);
    }

    public static C008Z[] values() {
        return (C008Z[]) LL.clone();
    }

    public static C008Z valueOf(String str) {
        return (C008Z) C08FF.LIZ(C008Z.class, str);
    }
}
