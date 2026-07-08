package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1399820mWy {
    public static final EnumC1399820mWy GONE;
    public static final /* synthetic */ EnumC1399820mWy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1399820mWy VISIBLE;
    public static final EnumC1399820mWy VISIBLE_AFTER_5S;

    public static InterfaceC2044707zh<EnumC1399820mWy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1399820mWy enumC1399820mWy = new EnumC1399820mWy("GONE", 0);
        GONE = enumC1399820mWy;
        EnumC1399820mWy enumC1399820mWy2 = new EnumC1399820mWy("VISIBLE", 1);
        VISIBLE = enumC1399820mWy2;
        EnumC1399820mWy enumC1399820mWy3 = new EnumC1399820mWy("VISIBLE_AFTER_5S", 2);
        VISIBLE_AFTER_5S = enumC1399820mWy3;
        EnumC1399820mWy[] enumC1399820mWyArr = {enumC1399820mWy, enumC1399820mWy2, enumC1399820mWy3};
        LL = enumC1399820mWyArr;
        LLILLJJLI = new C2254308sP(enumC1399820mWyArr);
    }

    public static EnumC1399820mWy[] values() {
        return (EnumC1399820mWy[]) LL.clone();
    }

    public static EnumC1399820mWy valueOf(String str) {
        return (EnumC1399820mWy) C08FF.LIZ(EnumC1399820mWy.class, str);
    }

    public EnumC1399820mWy(String str, int i) {
    }
}
