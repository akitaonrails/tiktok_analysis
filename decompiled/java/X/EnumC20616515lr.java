package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20616515lr {
    public static final /* synthetic */ EnumC20616515lr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20616515lr NOT_SEND;
    public static final EnumC20616515lr SENDING;
    public static final EnumC20616515lr SENT;

    public static InterfaceC2044707zh<EnumC20616515lr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20616515lr enumC20616515lr = new EnumC20616515lr("NOT_SEND", 0);
        NOT_SEND = enumC20616515lr;
        EnumC20616515lr enumC20616515lr2 = new EnumC20616515lr("SENDING", 1);
        SENDING = enumC20616515lr2;
        EnumC20616515lr enumC20616515lr3 = new EnumC20616515lr("SENT", 2);
        SENT = enumC20616515lr3;
        EnumC20616515lr[] enumC20616515lrArr = {enumC20616515lr, enumC20616515lr2, enumC20616515lr3};
        LL = enumC20616515lrArr;
        LLILLJJLI = new C2254308sP(enumC20616515lrArr);
    }

    public static EnumC20616515lr[] values() {
        return (EnumC20616515lr[]) LL.clone();
    }

    public static EnumC20616515lr valueOf(String str) {
        return (EnumC20616515lr) C08FF.LIZ(EnumC20616515lr.class, str);
    }

    public EnumC20616515lr(String str, int i) {
    }
}
