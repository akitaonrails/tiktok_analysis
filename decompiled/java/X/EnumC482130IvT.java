package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC482130IvT {
    public static final EnumC482130IvT BACKGROUND_MG_APPLY_ACCEPTED;
    public static final EnumC482130IvT BACKGROUND_MG_INVITE_VIEWER_LINK;
    public static final C482180IvY Companion;
    public static final /* synthetic */ EnumC482130IvT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC482130IvT> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0IvY] */
    static {
        EnumC482130IvT enumC482130IvT = new EnumC482130IvT("BACKGROUND_MG_APPLY_ACCEPTED", 0, "bg_mg_apply_accepted");
        BACKGROUND_MG_APPLY_ACCEPTED = enumC482130IvT;
        EnumC482130IvT enumC482130IvT2 = new EnumC482130IvT("BACKGROUND_MG_INVITE_VIEWER_LINK", 1, "bg_mg_invited");
        BACKGROUND_MG_INVITE_VIEWER_LINK = enumC482130IvT2;
        EnumC482130IvT[] enumC482130IvTArr = {enumC482130IvT, enumC482130IvT2};
        LLILLJJLI = enumC482130IvTArr;
        LLILLL = new C2254308sP(enumC482130IvTArr);
        Companion = new Object() { // from class: X.0IvY
        };
    }

    public static EnumC482130IvT[] values() {
        return (EnumC482130IvT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC482130IvT valueOf(String str) {
        return (EnumC482130IvT) C08FF.LIZ(EnumC482130IvT.class, str);
    }

    public EnumC482130IvT(String str, int i, String str2) {
        this.LL = str2;
    }
}
