package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AsT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193151AsT {
    public static final EnumC2193151AsT CLICK_PUBLISH;
    public static final EnumC2193151AsT DELETE_POST;
    public static final EnumC2193151AsT DRAFT_DELETED;
    public static final EnumC2193151AsT DRAFT_SAVED;
    public static final EnumC2193151AsT INIT;
    public static final /* synthetic */ EnumC2193151AsT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2193151AsT PULL_TO_REFRESH;
    public static final EnumC2193151AsT VISIBILITY_CHANGE;

    public static InterfaceC2044707zh<EnumC2193151AsT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2193151AsT enumC2193151AsT = new EnumC2193151AsT("INIT", 0);
        INIT = enumC2193151AsT;
        EnumC2193151AsT enumC2193151AsT2 = new EnumC2193151AsT("PULL_TO_REFRESH", 1);
        PULL_TO_REFRESH = enumC2193151AsT2;
        EnumC2193151AsT enumC2193151AsT3 = new EnumC2193151AsT("VISIBILITY_CHANGE", 2);
        VISIBILITY_CHANGE = enumC2193151AsT3;
        EnumC2193151AsT enumC2193151AsT4 = new EnumC2193151AsT("CLICK_PUBLISH", 3);
        CLICK_PUBLISH = enumC2193151AsT4;
        EnumC2193151AsT enumC2193151AsT5 = new EnumC2193151AsT("DRAFT_SAVED", 4);
        DRAFT_SAVED = enumC2193151AsT5;
        EnumC2193151AsT enumC2193151AsT6 = new EnumC2193151AsT("DRAFT_DELETED", 5);
        DRAFT_DELETED = enumC2193151AsT6;
        EnumC2193151AsT enumC2193151AsT7 = new EnumC2193151AsT("DELETE_POST", 6);
        DELETE_POST = enumC2193151AsT7;
        EnumC2193151AsT[] enumC2193151AsTArr = {enumC2193151AsT, enumC2193151AsT2, enumC2193151AsT3, enumC2193151AsT4, enumC2193151AsT5, enumC2193151AsT6, enumC2193151AsT7};
        LL = enumC2193151AsTArr;
        LLILLJJLI = new C2254308sP(enumC2193151AsTArr);
    }

    public static EnumC2193151AsT[] values() {
        return (EnumC2193151AsT[]) LL.clone();
    }

    public static EnumC2193151AsT valueOf(String str) {
        return (EnumC2193151AsT) C08FF.LIZ(EnumC2193151AsT.class, str);
    }

    public EnumC2193151AsT(String str, int i) {
    }
}
