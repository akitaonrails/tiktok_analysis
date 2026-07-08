package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0izQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1263700izQ {
    public static final EnumC1263700izQ FIRST_REFRESH_ERROR;
    public static final /* synthetic */ EnumC1263700izQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1263700izQ LOAD_MORE_ERROR;
    public static final EnumC1263700izQ MUF_LIST_COMPLETE;
    public static final EnumC1263700izQ MUF_LIST_EMPTY;
    public static final EnumC1263700izQ MUF_LIST_FIRST_LOADING;
    public static final EnumC1263700izQ MUF_LIST_LOADING_MORE;
    public static final EnumC1263700izQ UNINITIALIZED;

    public static InterfaceC2044707zh<EnumC1263700izQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1263700izQ enumC1263700izQ = new EnumC1263700izQ("UNINITIALIZED", 0);
        UNINITIALIZED = enumC1263700izQ;
        EnumC1263700izQ enumC1263700izQ2 = new EnumC1263700izQ("MUF_LIST_FIRST_LOADING", 1);
        MUF_LIST_FIRST_LOADING = enumC1263700izQ2;
        EnumC1263700izQ enumC1263700izQ3 = new EnumC1263700izQ("MUF_LIST_LOADING_MORE", 2);
        MUF_LIST_LOADING_MORE = enumC1263700izQ3;
        EnumC1263700izQ enumC1263700izQ4 = new EnumC1263700izQ("MUF_LIST_COMPLETE", 3);
        MUF_LIST_COMPLETE = enumC1263700izQ4;
        EnumC1263700izQ enumC1263700izQ5 = new EnumC1263700izQ("MUF_LIST_EMPTY", 4);
        MUF_LIST_EMPTY = enumC1263700izQ5;
        EnumC1263700izQ enumC1263700izQ6 = new EnumC1263700izQ("FIRST_REFRESH_ERROR", 5);
        FIRST_REFRESH_ERROR = enumC1263700izQ6;
        EnumC1263700izQ enumC1263700izQ7 = new EnumC1263700izQ("LOAD_MORE_ERROR", 6);
        LOAD_MORE_ERROR = enumC1263700izQ7;
        EnumC1263700izQ[] enumC1263700izQArr = {enumC1263700izQ, enumC1263700izQ2, enumC1263700izQ3, enumC1263700izQ4, enumC1263700izQ5, enumC1263700izQ6, enumC1263700izQ7};
        LL = enumC1263700izQArr;
        LLILLJJLI = new C2254308sP(enumC1263700izQArr);
    }

    public static EnumC1263700izQ[] values() {
        return (EnumC1263700izQ[]) LL.clone();
    }

    public static EnumC1263700izQ valueOf(String str) {
        return (EnumC1263700izQ) C08FF.LIZ(EnumC1263700izQ.class, str);
    }

    public EnumC1263700izQ(String str, int i) {
    }
}
