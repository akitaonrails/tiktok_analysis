package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0msQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1413120msQ {
    public static final EnumC1413120msQ AI_ALIVE_TEMPLATE;
    public static final EnumC1413120msQ AI_TEMPLATE;
    public static final EnumC1413120msQ EFFECT;
    public static final /* synthetic */ EnumC1413120msQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1413120msQ MANUAL_SELECT;
    public static final EnumC1413120msQ RECOVERY;
    public static final EnumC1413120msQ SOUND_SYNC;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1413120msQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1413120msQ enumC1413120msQ = new EnumC1413120msQ("RECOVERY", 0, "from_recovery");
        RECOVERY = enumC1413120msQ;
        EnumC1413120msQ enumC1413120msQ2 = new EnumC1413120msQ("EFFECT", 1, "from_effect");
        EFFECT = enumC1413120msQ2;
        EnumC1413120msQ enumC1413120msQ3 = new EnumC1413120msQ("SOUND_SYNC", 2, "from_sound_sync");
        SOUND_SYNC = enumC1413120msQ3;
        EnumC1413120msQ enumC1413120msQ4 = new EnumC1413120msQ("AI_TEMPLATE", 3, "from_ai_template");
        AI_TEMPLATE = enumC1413120msQ4;
        EnumC1413120msQ enumC1413120msQ5 = new EnumC1413120msQ("MANUAL_SELECT", 4, "manual_select");
        MANUAL_SELECT = enumC1413120msQ5;
        EnumC1413120msQ enumC1413120msQ6 = new EnumC1413120msQ("AI_ALIVE_TEMPLATE", 5, "from_ai_alive_template");
        AI_ALIVE_TEMPLATE = enumC1413120msQ6;
        EnumC1413120msQ[] enumC1413120msQArr = {enumC1413120msQ, enumC1413120msQ2, enumC1413120msQ3, enumC1413120msQ4, enumC1413120msQ5, enumC1413120msQ6};
        LLILLJJLI = enumC1413120msQArr;
        LLILLL = new C2254308sP(enumC1413120msQArr);
    }

    public static EnumC1413120msQ[] values() {
        return (EnumC1413120msQ[]) LLILLJJLI.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static EnumC1413120msQ valueOf(String str) {
        return (EnumC1413120msQ) C08FF.LIZ(EnumC1413120msQ.class, str);
    }

    public EnumC1413120msQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
