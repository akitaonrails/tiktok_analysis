package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC615370OBr {
    public static final EnumC615370OBr DELETING_ERROR;
    public static final EnumC615370OBr FEATURE_VIDEO_DELETED;
    public static final EnumC615370OBr IN_PROGRESS;
    public static final /* synthetic */ EnumC615370OBr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC615370OBr START;
    public static final EnumC615370OBr STOP;

    public static InterfaceC2044707zh<EnumC615370OBr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC615370OBr enumC615370OBr = new EnumC615370OBr("IN_PROGRESS", 0);
        IN_PROGRESS = enumC615370OBr;
        EnumC615370OBr enumC615370OBr2 = new EnumC615370OBr("FEATURE_VIDEO_DELETED", 1);
        FEATURE_VIDEO_DELETED = enumC615370OBr2;
        EnumC615370OBr enumC615370OBr3 = new EnumC615370OBr("DELETING_ERROR", 2);
        DELETING_ERROR = enumC615370OBr3;
        EnumC615370OBr enumC615370OBr4 = new EnumC615370OBr("START", 3);
        START = enumC615370OBr4;
        EnumC615370OBr enumC615370OBr5 = new EnumC615370OBr("STOP", 4);
        STOP = enumC615370OBr5;
        EnumC615370OBr[] enumC615370OBrArr = {enumC615370OBr, enumC615370OBr2, enumC615370OBr3, enumC615370OBr4, enumC615370OBr5};
        LL = enumC615370OBrArr;
        LLILLJJLI = new C2254308sP(enumC615370OBrArr);
    }

    public static EnumC615370OBr[] values() {
        return (EnumC615370OBr[]) LL.clone();
    }

    public static EnumC615370OBr valueOf(String str) {
        return (EnumC615370OBr) C08FF.LIZ(EnumC615370OBr.class, str);
    }

    public EnumC615370OBr(String str, int i) {
    }
}
