package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nJW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1429920nJW {
    public static final EnumC1429920nJW BEFORE_ENTER_RECORD;
    public static final EnumC1429920nJW BEFORE_REAL_PUBLISH;
    public static final EnumC1429920nJW DRAFT_BACK;
    public static final EnumC1429920nJW EDIT_DELETE_CLIP;
    public static final EnumC1429920nJW EDIT_PRO_ADJUST_CLIP;
    public static final EnumC1429920nJW ENTER_EDIT;
    public static final EnumC1429920nJW ENTER_PUBLISH;
    public static final EnumC1429920nJW ENTER_RECORD;
    public static final /* synthetic */ EnumC1429920nJW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1429920nJW REAL_PUBLISH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1429920nJW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1429920nJW enumC1429920nJW = new EnumC1429920nJW("BEFORE_ENTER_RECORD", 0, "before_enter_record");
        BEFORE_ENTER_RECORD = enumC1429920nJW;
        EnumC1429920nJW enumC1429920nJW2 = new EnumC1429920nJW("ENTER_RECORD", 1, "enter_record");
        ENTER_RECORD = enumC1429920nJW2;
        EnumC1429920nJW enumC1429920nJW3 = new EnumC1429920nJW("ENTER_EDIT", 2, "enter_edit");
        ENTER_EDIT = enumC1429920nJW3;
        EnumC1429920nJW enumC1429920nJW4 = new EnumC1429920nJW("ENTER_PUBLISH", 3, "enter_publish");
        ENTER_PUBLISH = enumC1429920nJW4;
        EnumC1429920nJW enumC1429920nJW5 = new EnumC1429920nJW("DRAFT_BACK", 4, "draft_back");
        DRAFT_BACK = enumC1429920nJW5;
        EnumC1429920nJW enumC1429920nJW6 = new EnumC1429920nJW("EDIT_DELETE_CLIP", 5, "edit_delete_clip");
        EDIT_DELETE_CLIP = enumC1429920nJW6;
        EnumC1429920nJW enumC1429920nJW7 = new EnumC1429920nJW("EDIT_PRO_ADJUST_CLIP", 6, "edit_prop_adjust_clip");
        EDIT_PRO_ADJUST_CLIP = enumC1429920nJW7;
        EnumC1429920nJW enumC1429920nJW8 = new EnumC1429920nJW("BEFORE_REAL_PUBLISH", 7, "before_real_publish");
        BEFORE_REAL_PUBLISH = enumC1429920nJW8;
        EnumC1429920nJW enumC1429920nJW9 = new EnumC1429920nJW("REAL_PUBLISH", 8, "real_publish");
        REAL_PUBLISH = enumC1429920nJW9;
        EnumC1429920nJW[] enumC1429920nJWArr = {enumC1429920nJW, enumC1429920nJW2, enumC1429920nJW3, enumC1429920nJW4, enumC1429920nJW5, enumC1429920nJW6, enumC1429920nJW7, enumC1429920nJW8, enumC1429920nJW9};
        LLILLJJLI = enumC1429920nJWArr;
        LLILLL = new C2254308sP(enumC1429920nJWArr);
    }

    public static EnumC1429920nJW[] values() {
        return (EnumC1429920nJW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1429920nJW valueOf(String str) {
        return (EnumC1429920nJW) C08FF.LIZ(EnumC1429920nJW.class, str);
    }

    public EnumC1429920nJW(String str, int i, String str2) {
        this.LL = str2;
    }
}
