package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06my, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1711006my {
    public static final EnumC1711006my INITIATE;
    public static final EnumC1711006my JOIN;
    public static final /* synthetic */ EnumC1711006my[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1711006my START_GROUP_CHAT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1711006my> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1711006my enumC1711006my = new EnumC1711006my("INITIATE", 0, "initiate_group_shot");
        INITIATE = enumC1711006my;
        EnumC1711006my enumC1711006my2 = new EnumC1711006my("JOIN", 1, "join_group_shot");
        JOIN = enumC1711006my2;
        EnumC1711006my enumC1711006my3 = new EnumC1711006my("START_GROUP_CHAT", 2, "start_group_chat");
        START_GROUP_CHAT = enumC1711006my3;
        EnumC1711006my[] enumC1711006myArr = {enumC1711006my, enumC1711006my2, enumC1711006my3};
        LLILLJJLI = enumC1711006myArr;
        LLILLL = new C2254308sP(enumC1711006myArr);
    }

    public static EnumC1711006my[] values() {
        return (EnumC1711006my[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1711006my valueOf(String str) {
        return (EnumC1711006my) C08FF.LIZ(EnumC1711006my.class, str);
    }

    public EnumC1711006my(String str, int i, String str2) {
        this.LL = str2;
    }
}
