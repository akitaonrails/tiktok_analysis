package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0niZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1445450niZ {
    public static final EnumC1445450niZ CLICK_EDIT;
    public static final EnumC1445450niZ CLICK_PREVIEW;
    public static final EnumC1445450niZ CLICK_PREVIEW_WITHOUT_IMAGE;
    public static final EnumC1445450niZ CLICK_SELECT_COVER;
    public static final /* synthetic */ EnumC1445450niZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1445450niZ NO_CLICK;

    public static InterfaceC2044707zh<EnumC1445450niZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1445450niZ enumC1445450niZ = new EnumC1445450niZ("NO_CLICK", 0);
        NO_CLICK = enumC1445450niZ;
        EnumC1445450niZ enumC1445450niZ2 = new EnumC1445450niZ("CLICK_PREVIEW", 1);
        CLICK_PREVIEW = enumC1445450niZ2;
        EnumC1445450niZ enumC1445450niZ3 = new EnumC1445450niZ("CLICK_SELECT_COVER", 2);
        CLICK_SELECT_COVER = enumC1445450niZ3;
        EnumC1445450niZ enumC1445450niZ4 = new EnumC1445450niZ("CLICK_PREVIEW_WITHOUT_IMAGE", 3);
        CLICK_PREVIEW_WITHOUT_IMAGE = enumC1445450niZ4;
        EnumC1445450niZ enumC1445450niZ5 = new EnumC1445450niZ("CLICK_EDIT", 4);
        CLICK_EDIT = enumC1445450niZ5;
        EnumC1445450niZ[] enumC1445450niZArr = {enumC1445450niZ, enumC1445450niZ2, enumC1445450niZ3, enumC1445450niZ4, enumC1445450niZ5};
        LL = enumC1445450niZArr;
        LLILLJJLI = new C2254308sP(enumC1445450niZArr);
    }

    public static EnumC1445450niZ[] values() {
        return (EnumC1445450niZ[]) LL.clone();
    }

    public static EnumC1445450niZ valueOf(String str) {
        return (EnumC1445450niZ) C08FF.LIZ(EnumC1445450niZ.class, str);
    }

    public EnumC1445450niZ(String str, int i) {
    }
}
