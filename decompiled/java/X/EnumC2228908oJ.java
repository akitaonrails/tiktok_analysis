package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2228908oJ {
    public static final EnumC2228908oJ AUTO_TERMINATE;
    public static final EnumC2228908oJ CLICK_PAUSE;
    public static final EnumC2228908oJ DELETE;
    public static final EnumC2228908oJ LEAVE;
    public static final /* synthetic */ EnumC2228908oJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2228908oJ SEND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2228908oJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2228908oJ enumC2228908oJ = new EnumC2228908oJ("SEND", 0, "send");
        SEND = enumC2228908oJ;
        EnumC2228908oJ enumC2228908oJ2 = new EnumC2228908oJ("CLICK_PAUSE", 1, "click_pause");
        CLICK_PAUSE = enumC2228908oJ2;
        EnumC2228908oJ enumC2228908oJ3 = new EnumC2228908oJ("AUTO_TERMINATE", 2, "auto_terminate");
        AUTO_TERMINATE = enumC2228908oJ3;
        EnumC2228908oJ enumC2228908oJ4 = new EnumC2228908oJ("DELETE", 3, "delete");
        DELETE = enumC2228908oJ4;
        EnumC2228908oJ enumC2228908oJ5 = new EnumC2228908oJ("LEAVE", 4, "leave");
        LEAVE = enumC2228908oJ5;
        EnumC2228908oJ[] enumC2228908oJArr = {enumC2228908oJ, enumC2228908oJ2, enumC2228908oJ3, enumC2228908oJ4, enumC2228908oJ5};
        LLILLJJLI = enumC2228908oJArr;
        LLILLL = new C2254308sP(enumC2228908oJArr);
    }

    public static EnumC2228908oJ[] values() {
        return (EnumC2228908oJ[]) LLILLJJLI.clone();
    }

    public final String getEventValue() {
        return this.LL;
    }

    public static EnumC2228908oJ valueOf(String str) {
        return (EnumC2228908oJ) C08FF.LIZ(EnumC2228908oJ.class, str);
    }

    public EnumC2228908oJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
