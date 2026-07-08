package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1240630iOD {
    public static final EnumC1240630iOD CLEAR_HISTORY;
    public static final EnumC1240630iOD ENTER_AGGREGATE_MESSAGE;
    public static final EnumC1240630iOD ENTER_CHAT;
    public static final EnumC1240630iOD ENTER_PROFILE;
    public static final /* synthetic */ EnumC1240630iOD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1240630iOD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1240630iOD enumC1240630iOD = new EnumC1240630iOD("ENTER_CHAT", 0, "enter_chat");
        ENTER_CHAT = enumC1240630iOD;
        EnumC1240630iOD enumC1240630iOD2 = new EnumC1240630iOD("ENTER_PROFILE", 1, "enter_profile");
        ENTER_PROFILE = enumC1240630iOD2;
        EnumC1240630iOD enumC1240630iOD3 = new EnumC1240630iOD("CLEAR_HISTORY", 2, "clear_history");
        CLEAR_HISTORY = enumC1240630iOD3;
        EnumC1240630iOD enumC1240630iOD4 = new EnumC1240630iOD("ENTER_AGGREGATE_MESSAGE", 3, "enter_aggregate_message");
        ENTER_AGGREGATE_MESSAGE = enumC1240630iOD4;
        EnumC1240630iOD[] enumC1240630iODArr = {enumC1240630iOD, enumC1240630iOD2, enumC1240630iOD3, enumC1240630iOD4};
        LLILLJJLI = enumC1240630iODArr;
        LLILLL = new C2254308sP(enumC1240630iODArr);
    }

    public static EnumC1240630iOD[] values() {
        return (EnumC1240630iOD[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1240630iOD valueOf(String str) {
        return (EnumC1240630iOD) C08FF.LIZ(EnumC1240630iOD.class, str);
    }

    public EnumC1240630iOD(String str, int i, String str2) {
        this.LL = str2;
    }
}
