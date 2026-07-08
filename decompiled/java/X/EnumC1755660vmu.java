package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1755660vmu {
    public static final C1755670vmv Companion;
    public static final /* synthetic */ EnumC1755660vmu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1755660vmu SCENE_LEAVE;
    public static final EnumC1755660vmu SCENE_READY;
    public static final EnumC1755660vmu SCROLL;
    public static final EnumC1755660vmu UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1755660vmu> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0vmv] */
    static {
        EnumC1755660vmu enumC1755660vmu = new EnumC1755660vmu("UNKNOWN", 0, -1);
        UNKNOWN = enumC1755660vmu;
        EnumC1755660vmu enumC1755660vmu2 = new EnumC1755660vmu("SCENE_READY", 1, 1);
        SCENE_READY = enumC1755660vmu2;
        EnumC1755660vmu enumC1755660vmu3 = new EnumC1755660vmu("SCROLL", 2, 2);
        SCROLL = enumC1755660vmu3;
        EnumC1755660vmu enumC1755660vmu4 = new EnumC1755660vmu("SCENE_LEAVE", 3, 3);
        SCENE_LEAVE = enumC1755660vmu4;
        EnumC1755660vmu[] enumC1755660vmuArr = {enumC1755660vmu, enumC1755660vmu2, enumC1755660vmu3, enumC1755660vmu4};
        LLILLJJLI = enumC1755660vmuArr;
        LLILLL = new C2254308sP(enumC1755660vmuArr);
        Companion = new Object() { // from class: X.0vmv
        };
    }

    public static EnumC1755660vmu[] values() {
        return (EnumC1755660vmu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1755660vmu valueOf(String str) {
        return (EnumC1755660vmu) C08FF.LIZ(EnumC1755660vmu.class, str);
    }

    public EnumC1755660vmu(String str, int i, int i2) {
        this.LL = i2;
    }
}
