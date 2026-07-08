package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1415880mws {
    public static final EnumC1415880mws GO_DRAFT_BOX;
    public static final EnumC1415880mws GO_EDIT;
    public static final EnumC1415880mws GO_EDIT_OR_DRAFT_BOX;
    public static final /* synthetic */ EnumC1415880mws[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1415880mws> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1415880mws enumC1415880mws = new EnumC1415880mws("GO_EDIT", 0);
        GO_EDIT = enumC1415880mws;
        EnumC1415880mws enumC1415880mws2 = new EnumC1415880mws("GO_DRAFT_BOX", 1);
        GO_DRAFT_BOX = enumC1415880mws2;
        EnumC1415880mws enumC1415880mws3 = new EnumC1415880mws("GO_EDIT_OR_DRAFT_BOX", 2);
        GO_EDIT_OR_DRAFT_BOX = enumC1415880mws3;
        EnumC1415880mws[] enumC1415880mwsArr = {enumC1415880mws, enumC1415880mws2, enumC1415880mws3};
        LL = enumC1415880mwsArr;
        LLILLJJLI = new C2254308sP(enumC1415880mwsArr);
    }

    public static EnumC1415880mws[] values() {
        return (EnumC1415880mws[]) LL.clone();
    }

    public static EnumC1415880mws valueOf(String str) {
        return (EnumC1415880mws) C08FF.LIZ(EnumC1415880mws.class, str);
    }

    public EnumC1415880mws(String str, int i) {
    }
}
