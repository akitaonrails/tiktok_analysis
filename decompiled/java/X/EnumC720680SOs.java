package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SOs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC720680SOs {
    public static final EnumC720680SOs BLUR_PLACEHOLDER;
    public static final EnumC720680SOs COVER_PLACEHOLDER;
    public static final /* synthetic */ EnumC720680SOs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC720680SOs NONE;

    public static InterfaceC2044707zh<EnumC720680SOs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC720680SOs enumC720680SOs = new EnumC720680SOs("NONE", 0);
        NONE = enumC720680SOs;
        EnumC720680SOs enumC720680SOs2 = new EnumC720680SOs("BLUR_PLACEHOLDER", 1);
        BLUR_PLACEHOLDER = enumC720680SOs2;
        EnumC720680SOs enumC720680SOs3 = new EnumC720680SOs("COVER_PLACEHOLDER", 2);
        COVER_PLACEHOLDER = enumC720680SOs3;
        EnumC720680SOs[] enumC720680SOsArr = {enumC720680SOs, enumC720680SOs2, enumC720680SOs3};
        LL = enumC720680SOsArr;
        LLILLJJLI = new C2254308sP(enumC720680SOsArr);
    }

    public static EnumC720680SOs[] values() {
        return (EnumC720680SOs[]) LL.clone();
    }

    public static EnumC720680SOs valueOf(String str) {
        return (EnumC720680SOs) C08FF.LIZ(EnumC720680SOs.class, str);
    }

    public EnumC720680SOs(String str, int i) {
    }
}
