package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20226614Ci {
    public static final EnumC20226614Ci EDITOR_PRO;
    public static final /* synthetic */ EnumC20226614Ci[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20226614Ci NORMAL_EDIT;
    public static final EnumC20226614Ci STRIP_MUSIC_PREVIEW;

    public static InterfaceC2044707zh<EnumC20226614Ci> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20226614Ci enumC20226614Ci = new EnumC20226614Ci("NORMAL_EDIT", 0);
        NORMAL_EDIT = enumC20226614Ci;
        EnumC20226614Ci enumC20226614Ci2 = new EnumC20226614Ci("EDITOR_PRO", 1);
        EDITOR_PRO = enumC20226614Ci2;
        EnumC20226614Ci enumC20226614Ci3 = new EnumC20226614Ci("STRIP_MUSIC_PREVIEW", 2);
        STRIP_MUSIC_PREVIEW = enumC20226614Ci3;
        EnumC20226614Ci[] enumC20226614CiArr = {enumC20226614Ci, enumC20226614Ci2, enumC20226614Ci3};
        LL = enumC20226614CiArr;
        LLILLJJLI = new C2254308sP(enumC20226614CiArr);
    }

    public static EnumC20226614Ci[] values() {
        return (EnumC20226614Ci[]) LL.clone();
    }

    public static EnumC20226614Ci valueOf(String str) {
        return (EnumC20226614Ci) C08FF.LIZ(EnumC20226614Ci.class, str);
    }

    public EnumC20226614Ci(String str, int i) {
    }
}
