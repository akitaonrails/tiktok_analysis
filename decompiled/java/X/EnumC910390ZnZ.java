package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC910390ZnZ {
    public static final /* synthetic */ EnumC910390ZnZ[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC910390ZnZ SEND;
    public static final EnumC910390ZnZ SENDER_ENTER;
    public static final EnumC910390ZnZ SWAP_TO_SENDER;
    public static final EnumC910390ZnZ VIEWER_ENTER;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC910390ZnZ> getEntries() {
        return LLILZ;
    }

    static {
        EnumC910390ZnZ enumC910390ZnZ = new EnumC910390ZnZ("VIEWER_ENTER", 0, EnumC910400Zna.OPEN_ANIMATION_JSON_PATH.getValue(), EnumC910400Zna.OPEN_ANIMATION_VIDEO_PATH.getValue());
        VIEWER_ENTER = enumC910390ZnZ;
        EnumC910390ZnZ enumC910390ZnZ2 = new EnumC910390ZnZ("SENDER_ENTER", 1, EnumC910400Zna.CREATE_ANIMATION_JSON_PATH.getValue(), EnumC910400Zna.CREATE_ANIMATION_VIDEO_PATH.getValue());
        SENDER_ENTER = enumC910390ZnZ2;
        EnumC910390ZnZ enumC910390ZnZ3 = new EnumC910390ZnZ("SWAP_TO_SENDER", 2, EnumC910400Zna.STATE_TRANSITION_ANIMATION_JSON_PATH.getValue(), EnumC910400Zna.STATE_TRANSITION_ANIMATION_VIDEO_PATH.getValue());
        SWAP_TO_SENDER = enumC910390ZnZ3;
        EnumC910390ZnZ enumC910390ZnZ4 = new EnumC910390ZnZ("SEND", 3, EnumC910400Zna.SENDER_SEND_ANIMATION_JSON_PATH.getValue(), EnumC910400Zna.SENDER_SEND_ANIMATION_VIDEO_PATH.getValue());
        SEND = enumC910390ZnZ4;
        EnumC910390ZnZ[] enumC910390ZnZArr = {enumC910390ZnZ, enumC910390ZnZ2, enumC910390ZnZ3, enumC910390ZnZ4};
        LLILLL = enumC910390ZnZArr;
        LLILZ = new C2254308sP(enumC910390ZnZArr);
    }

    public static EnumC910390ZnZ[] values() {
        return (EnumC910390ZnZ[]) LLILLL.clone();
    }

    public final String getJsonPath() {
        return this.LL;
    }

    public final String getVideoPath() {
        return this.LLILLJJLI;
    }

    public static EnumC910390ZnZ valueOf(String str) {
        return (EnumC910390ZnZ) C08FF.LIZ(EnumC910390ZnZ.class, str);
    }

    public EnumC910390ZnZ(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
