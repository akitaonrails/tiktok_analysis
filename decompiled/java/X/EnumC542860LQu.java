package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC542860LQu {
    public static final EnumC542860LQu AI_REMIX;
    public static final EnumC542860LQu IM_CHAT_BOT;
    public static final /* synthetic */ EnumC542860LQu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC542860LQu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC542860LQu enumC542860LQu = new EnumC542860LQu("IM_CHAT_BOT", 0, "im_chat_bot");
        IM_CHAT_BOT = enumC542860LQu;
        EnumC542860LQu enumC542860LQu2 = new EnumC542860LQu("AI_REMIX", 1, "ai_remix");
        AI_REMIX = enumC542860LQu2;
        EnumC542860LQu[] enumC542860LQuArr = {enumC542860LQu, enumC542860LQu2};
        LLILLJJLI = enumC542860LQuArr;
        LLILLL = new C2254308sP(enumC542860LQuArr);
    }

    public static EnumC542860LQu[] values() {
        return (EnumC542860LQu[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC542860LQu valueOf(String str) {
        return (EnumC542860LQu) C08FF.LIZ(EnumC542860LQu.class, str);
    }

    public EnumC542860LQu(String str, int i, String str2) {
        this.LL = str2;
    }
}
