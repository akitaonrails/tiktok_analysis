package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC345660Dgq {
    public static final /* synthetic */ EnumC345660Dgq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC345660Dgq STATUS_COMPLETED;
    public static final EnumC345660Dgq STATUS_NEXT;
    public static final EnumC345660Dgq STATUS_UN_STARTED;

    public static InterfaceC2044707zh<EnumC345660Dgq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC345660Dgq enumC345660Dgq = new EnumC345660Dgq("STATUS_COMPLETED", 0);
        STATUS_COMPLETED = enumC345660Dgq;
        EnumC345660Dgq enumC345660Dgq2 = new EnumC345660Dgq("STATUS_UN_STARTED", 1);
        STATUS_UN_STARTED = enumC345660Dgq2;
        EnumC345660Dgq enumC345660Dgq3 = new EnumC345660Dgq("STATUS_NEXT", 2);
        STATUS_NEXT = enumC345660Dgq3;
        EnumC345660Dgq[] enumC345660DgqArr = {enumC345660Dgq, enumC345660Dgq2, enumC345660Dgq3};
        LL = enumC345660DgqArr;
        LLILLJJLI = new C2254308sP(enumC345660DgqArr);
    }

    public static EnumC345660Dgq[] values() {
        return (EnumC345660Dgq[]) LL.clone();
    }

    public static EnumC345660Dgq valueOf(String str) {
        return (EnumC345660Dgq) C08FF.LIZ(EnumC345660Dgq.class, str);
    }

    public EnumC345660Dgq(String str, int i) {
    }
}
