package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1225150hzF {
    public static final EnumC1225150hzF ADD_TO_POST;
    public static final EnumC1225150hzF ADD_TO_PROFILE;
    public static final EnumC1225150hzF ADD_TO_STORY;
    public static final /* synthetic */ EnumC1225150hzF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1225150hzF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1225150hzF enumC1225150hzF = new EnumC1225150hzF("ADD_TO_POST", 0);
        ADD_TO_POST = enumC1225150hzF;
        EnumC1225150hzF enumC1225150hzF2 = new EnumC1225150hzF("ADD_TO_STORY", 1);
        ADD_TO_STORY = enumC1225150hzF2;
        EnumC1225150hzF enumC1225150hzF3 = new EnumC1225150hzF("ADD_TO_PROFILE", 2);
        ADD_TO_PROFILE = enumC1225150hzF3;
        EnumC1225150hzF[] enumC1225150hzFArr = {enumC1225150hzF, enumC1225150hzF2, enumC1225150hzF3};
        LL = enumC1225150hzFArr;
        LLILLJJLI = new C2254308sP(enumC1225150hzFArr);
    }

    public static EnumC1225150hzF[] values() {
        return (EnumC1225150hzF[]) LL.clone();
    }

    public static EnumC1225150hzF valueOf(String str) {
        return (EnumC1225150hzF) C08FF.LIZ(EnumC1225150hzF.class, str);
    }

    public EnumC1225150hzF(String str, int i) {
    }
}
