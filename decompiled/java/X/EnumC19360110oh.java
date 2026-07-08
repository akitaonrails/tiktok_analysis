package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19360110oh {
    public static final EnumC19360110oh EDITING;
    public static final EnumC19360110oh EDIT_CLOSING;
    public static final EnumC19360110oh EDIT_OPENING;
    public static final EnumC19360110oh EDIT_QUITED;
    public static final /* synthetic */ EnumC19360110oh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19360110oh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19360110oh enumC19360110oh = new EnumC19360110oh("EDIT_OPENING", 0);
        EDIT_OPENING = enumC19360110oh;
        EnumC19360110oh enumC19360110oh2 = new EnumC19360110oh("EDITING", 1);
        EDITING = enumC19360110oh2;
        EnumC19360110oh enumC19360110oh3 = new EnumC19360110oh("EDIT_CLOSING", 2);
        EDIT_CLOSING = enumC19360110oh3;
        EnumC19360110oh enumC19360110oh4 = new EnumC19360110oh("EDIT_QUITED", 3);
        EDIT_QUITED = enumC19360110oh4;
        EnumC19360110oh[] enumC19360110ohArr = {enumC19360110oh, enumC19360110oh2, enumC19360110oh3, enumC19360110oh4};
        LL = enumC19360110ohArr;
        LLILLJJLI = new C2254308sP(enumC19360110ohArr);
    }

    public static EnumC19360110oh[] values() {
        return (EnumC19360110oh[]) LL.clone();
    }

    public static EnumC19360110oh valueOf(String str) {
        return (EnumC19360110oh) C08FF.LIZ(EnumC19360110oh.class, str);
    }

    public EnumC19360110oh(String str, int i) {
    }
}
