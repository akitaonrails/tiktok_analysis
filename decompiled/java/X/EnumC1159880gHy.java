package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1159880gHy {
    public static final EnumC1159880gHy HIDDEN;
    public static final /* synthetic */ EnumC1159880gHy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1159880gHy PRE_HIDE;
    public static final EnumC1159880gHy PRE_SHOW;
    public static final EnumC1159880gHy SHOWN;

    public static InterfaceC2044707zh<EnumC1159880gHy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1159880gHy enumC1159880gHy = new EnumC1159880gHy("PRE_SHOW", 0);
        PRE_SHOW = enumC1159880gHy;
        EnumC1159880gHy enumC1159880gHy2 = new EnumC1159880gHy("SHOWN", 1);
        SHOWN = enumC1159880gHy2;
        EnumC1159880gHy enumC1159880gHy3 = new EnumC1159880gHy("PRE_HIDE", 2);
        PRE_HIDE = enumC1159880gHy3;
        EnumC1159880gHy enumC1159880gHy4 = new EnumC1159880gHy("HIDDEN", 3);
        HIDDEN = enumC1159880gHy4;
        EnumC1159880gHy[] enumC1159880gHyArr = {enumC1159880gHy, enumC1159880gHy2, enumC1159880gHy3, enumC1159880gHy4};
        LL = enumC1159880gHyArr;
        LLILLJJLI = new C2254308sP(enumC1159880gHyArr);
    }

    public static EnumC1159880gHy[] values() {
        return (EnumC1159880gHy[]) LL.clone();
    }

    public static EnumC1159880gHy valueOf(String str) {
        return (EnumC1159880gHy) C08FF.LIZ(EnumC1159880gHy.class, str);
    }

    public EnumC1159880gHy(String str, int i) {
    }
}
