package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1445080nhy {
    public static final EnumC1445080nhy EDIT_BACK_TO_RECORD;
    public static final EnumC1445080nhy EDIT_FIRST_FRAME;
    public static final EnumC1445080nhy EDIT_PAGE_EXIT_CLICKED;
    public static final EnumC1445080nhy EDIT_PAGE_INITIATE;
    public static final /* synthetic */ EnumC1445080nhy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1445080nhy NEXT_BUTTON_CLICKED;
    public static final EnumC1445080nhy QUICK_LIVE_RESHOOT_CLICKED;

    public static InterfaceC2044707zh<EnumC1445080nhy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1445080nhy enumC1445080nhy = new EnumC1445080nhy("EDIT_PAGE_INITIATE", 0);
        EDIT_PAGE_INITIATE = enumC1445080nhy;
        EnumC1445080nhy enumC1445080nhy2 = new EnumC1445080nhy("EDIT_FIRST_FRAME", 1);
        EDIT_FIRST_FRAME = enumC1445080nhy2;
        EnumC1445080nhy enumC1445080nhy3 = new EnumC1445080nhy("EDIT_BACK_TO_RECORD", 2);
        EDIT_BACK_TO_RECORD = enumC1445080nhy3;
        EnumC1445080nhy enumC1445080nhy4 = new EnumC1445080nhy("NEXT_BUTTON_CLICKED", 3);
        NEXT_BUTTON_CLICKED = enumC1445080nhy4;
        EnumC1445080nhy enumC1445080nhy5 = new EnumC1445080nhy("EDIT_PAGE_EXIT_CLICKED", 4);
        EDIT_PAGE_EXIT_CLICKED = enumC1445080nhy5;
        EnumC1445080nhy enumC1445080nhy6 = new EnumC1445080nhy("QUICK_LIVE_RESHOOT_CLICKED", 5);
        QUICK_LIVE_RESHOOT_CLICKED = enumC1445080nhy6;
        EnumC1445080nhy[] enumC1445080nhyArr = {enumC1445080nhy, enumC1445080nhy2, enumC1445080nhy3, enumC1445080nhy4, enumC1445080nhy5, enumC1445080nhy6};
        LL = enumC1445080nhyArr;
        LLILLJJLI = new C2254308sP(enumC1445080nhyArr);
    }

    public static EnumC1445080nhy[] values() {
        return (EnumC1445080nhy[]) LL.clone();
    }

    public static EnumC1445080nhy valueOf(String str) {
        return (EnumC1445080nhy) C08FF.LIZ(EnumC1445080nhy.class, str);
    }

    public EnumC1445080nhy(String str, int i) {
    }
}
