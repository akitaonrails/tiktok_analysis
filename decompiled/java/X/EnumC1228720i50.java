package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1228720i50 {
    public static final EnumC1228720i50 CHAT_ROOM;
    public static final EnumC1228720i50 FAN_GROUP_ANCHOR_CREATOR_GROUP;
    public static final EnumC1228720i50 GROUP_LIST;
    public static final /* synthetic */ EnumC1228720i50[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1228720i50 NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1228720i50> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1228720i50 enumC1228720i50 = new EnumC1228720i50("CHAT_ROOM", 0, 0);
        CHAT_ROOM = enumC1228720i50;
        EnumC1228720i50 enumC1228720i502 = new EnumC1228720i50("NONE", 1, 1);
        NONE = enumC1228720i502;
        EnumC1228720i50 enumC1228720i503 = new EnumC1228720i50("GROUP_LIST", 2, 2);
        GROUP_LIST = enumC1228720i503;
        EnumC1228720i50 enumC1228720i504 = new EnumC1228720i50("FAN_GROUP_ANCHOR_CREATOR_GROUP", 3, 3);
        FAN_GROUP_ANCHOR_CREATOR_GROUP = enumC1228720i504;
        EnumC1228720i50[] enumC1228720i50Arr = {enumC1228720i50, enumC1228720i502, enumC1228720i503, enumC1228720i504};
        LLILLJJLI = enumC1228720i50Arr;
        LLILLL = new C2254308sP(enumC1228720i50Arr);
    }

    public static EnumC1228720i50[] values() {
        return (EnumC1228720i50[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1228720i50 valueOf(String str) {
        return (EnumC1228720i50) C08FF.LIZ(EnumC1228720i50.class, str);
    }

    public EnumC1228720i50(String str, int i, int i2) {
        this.LL = i2;
    }
}
