package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0auZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC953170auZ {
    public static final EnumC953170auZ API_CALL_FAIL;
    public static final /* synthetic */ EnumC953170auZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC953170auZ NOTICEBOARD_PROCESS_END;
    public static final EnumC953170auZ REVIEW_NOT_PASSED;
    public static final EnumC953170auZ SAVE_FAIL;
    public static final EnumC953170auZ UPLOAD_FAIL;

    public static InterfaceC2044707zh<EnumC953170auZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC953170auZ enumC953170auZ = new EnumC953170auZ("SAVE_FAIL", 0);
        SAVE_FAIL = enumC953170auZ;
        EnumC953170auZ enumC953170auZ2 = new EnumC953170auZ("UPLOAD_FAIL", 1);
        UPLOAD_FAIL = enumC953170auZ2;
        EnumC953170auZ enumC953170auZ3 = new EnumC953170auZ("API_CALL_FAIL", 2);
        API_CALL_FAIL = enumC953170auZ3;
        EnumC953170auZ enumC953170auZ4 = new EnumC953170auZ("REVIEW_NOT_PASSED", 3);
        REVIEW_NOT_PASSED = enumC953170auZ4;
        EnumC953170auZ enumC953170auZ5 = new EnumC953170auZ("NOTICEBOARD_PROCESS_END", 4);
        NOTICEBOARD_PROCESS_END = enumC953170auZ5;
        EnumC953170auZ[] enumC953170auZArr = {enumC953170auZ, enumC953170auZ2, enumC953170auZ3, enumC953170auZ4, enumC953170auZ5};
        LL = enumC953170auZArr;
        LLILLJJLI = new C2254308sP(enumC953170auZArr);
    }

    public static EnumC953170auZ[] values() {
        return (EnumC953170auZ[]) LL.clone();
    }

    public static EnumC953170auZ valueOf(String str) {
        return (EnumC953170auZ) C08FF.LIZ(EnumC953170auZ.class, str);
    }

    public EnumC953170auZ(String str, int i) {
    }
}
