package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ybq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC877640Ybq implements InterfaceC877650Ybr {
    public static final /* synthetic */ EnumC877640Ybq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC877640Ybq SORT_BY_FOLLOWER_HIGH_TO_LOW;
    public static final EnumC877640Ybq SORT_BY_TIME_RECENT;

    public static InterfaceC2044707zh<EnumC877640Ybq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC877640Ybq enumC877640Ybq = new EnumC877640Ybq("SORT_BY_TIME_RECENT", 0);
        SORT_BY_TIME_RECENT = enumC877640Ybq;
        EnumC877640Ybq enumC877640Ybq2 = new EnumC877640Ybq("SORT_BY_FOLLOWER_HIGH_TO_LOW", 1);
        SORT_BY_FOLLOWER_HIGH_TO_LOW = enumC877640Ybq2;
        EnumC877640Ybq[] enumC877640YbqArr = {enumC877640Ybq, enumC877640Ybq2};
        LL = enumC877640YbqArr;
        LLILLJJLI = new C2254308sP(enumC877640YbqArr);
    }

    public static EnumC877640Ybq[] values() {
        return (EnumC877640Ybq[]) LL.clone();
    }

    public static EnumC877640Ybq valueOf(String str) {
        return (EnumC877640Ybq) C08FF.LIZ(EnumC877640Ybq.class, str);
    }

    public EnumC877640Ybq(String str, int i) {
    }
}
