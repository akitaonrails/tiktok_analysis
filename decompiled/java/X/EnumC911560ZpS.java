package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC911560ZpS {
    public static final EnumC911560ZpS GROUP_CHAT;
    public static final /* synthetic */ EnumC911560ZpS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC911560ZpS PRIVATE_CHAT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC911560ZpS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC911560ZpS enumC911560ZpS = new EnumC911560ZpS("PRIVATE_CHAT", 0, "single");
        PRIVATE_CHAT = enumC911560ZpS;
        EnumC911560ZpS enumC911560ZpS2 = new EnumC911560ZpS("GROUP_CHAT", 1, "group");
        GROUP_CHAT = enumC911560ZpS2;
        EnumC911560ZpS[] enumC911560ZpSArr = {enumC911560ZpS, enumC911560ZpS2};
        LLILLJJLI = enumC911560ZpSArr;
        LLILLL = new C2254308sP(enumC911560ZpSArr);
    }

    public static EnumC911560ZpS[] values() {
        return (EnumC911560ZpS[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC911560ZpS valueOf(String str) {
        return (EnumC911560ZpS) C08FF.LIZ(EnumC911560ZpS.class, str);
    }

    public EnumC911560ZpS(String str, int i, String str2) {
        this.LL = str2;
    }
}
