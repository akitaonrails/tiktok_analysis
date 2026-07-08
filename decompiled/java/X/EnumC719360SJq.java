package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC719360SJq {
    public static final EnumC719360SJq END_MARKUP;
    public static final EnumC719360SJq END_TAG;
    public static final /* synthetic */ EnumC719360SJq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC719360SJq PLAIN_TEXT;
    public static final EnumC719360SJq START_MARKUP;
    public static final EnumC719360SJq START_TAG;

    public static InterfaceC2044707zh<EnumC719360SJq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC719360SJq enumC719360SJq = new EnumC719360SJq("START_MARKUP", 0);
        START_MARKUP = enumC719360SJq;
        EnumC719360SJq enumC719360SJq2 = new EnumC719360SJq("START_TAG", 1);
        START_TAG = enumC719360SJq2;
        EnumC719360SJq enumC719360SJq3 = new EnumC719360SJq("PLAIN_TEXT", 2);
        PLAIN_TEXT = enumC719360SJq3;
        EnumC719360SJq enumC719360SJq4 = new EnumC719360SJq("END_TAG", 3);
        END_TAG = enumC719360SJq4;
        EnumC719360SJq enumC719360SJq5 = new EnumC719360SJq("END_MARKUP", 4);
        END_MARKUP = enumC719360SJq5;
        EnumC719360SJq[] enumC719360SJqArr = {enumC719360SJq, enumC719360SJq2, enumC719360SJq3, enumC719360SJq4, enumC719360SJq5};
        LL = enumC719360SJqArr;
        LLILLJJLI = new C2254308sP(enumC719360SJqArr);
    }

    public static EnumC719360SJq[] values() {
        return (EnumC719360SJq[]) LL.clone();
    }

    public static EnumC719360SJq valueOf(String str) {
        return (EnumC719360SJq) C08FF.LIZ(EnumC719360SJq.class, str);
    }

    public EnumC719360SJq(String str, int i) {
    }
}
