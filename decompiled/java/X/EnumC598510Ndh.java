package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ndh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC598510Ndh {
    public static final /* synthetic */ EnumC598510Ndh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC598510Ndh MESSAGE_REFRESH;
    public static final EnumC598510Ndh REQUEST_SCENE_DEFAULT;
    public static final EnumC598510Ndh ROOM_ENTER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC598510Ndh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC598510Ndh enumC598510Ndh = new EnumC598510Ndh("REQUEST_SCENE_DEFAULT", 0, 0);
        REQUEST_SCENE_DEFAULT = enumC598510Ndh;
        EnumC598510Ndh enumC598510Ndh2 = new EnumC598510Ndh("ROOM_ENTER", 1, 1);
        ROOM_ENTER = enumC598510Ndh2;
        EnumC598510Ndh enumC598510Ndh3 = new EnumC598510Ndh("MESSAGE_REFRESH", 2, 2);
        MESSAGE_REFRESH = enumC598510Ndh3;
        EnumC598510Ndh[] enumC598510NdhArr = {enumC598510Ndh, enumC598510Ndh2, enumC598510Ndh3};
        LLILLJJLI = enumC598510NdhArr;
        LLILLL = new C2254308sP(enumC598510NdhArr);
    }

    public static EnumC598510Ndh[] values() {
        return (EnumC598510Ndh[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC598510Ndh valueOf(String str) {
        return (EnumC598510Ndh) C08FF.LIZ(EnumC598510Ndh.class, str);
    }

    public EnumC598510Ndh(String str, int i, int i2) {
        this.LL = i2;
    }
}
