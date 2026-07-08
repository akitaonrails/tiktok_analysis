package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC328260Cts {
    public static final EnumC328260Cts INIT;
    public static final /* synthetic */ EnumC328260Cts[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC328260Cts SENDING;
    public static final EnumC328260Cts SENT;

    public static InterfaceC2044707zh<EnumC328260Cts> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC328260Cts enumC328260Cts = new EnumC328260Cts("INIT", 0);
        INIT = enumC328260Cts;
        EnumC328260Cts enumC328260Cts2 = new EnumC328260Cts("SENDING", 1);
        SENDING = enumC328260Cts2;
        EnumC328260Cts enumC328260Cts3 = new EnumC328260Cts("SENT", 2);
        SENT = enumC328260Cts3;
        EnumC328260Cts[] enumC328260CtsArr = {enumC328260Cts, enumC328260Cts2, enumC328260Cts3};
        LL = enumC328260CtsArr;
        LLILLJJLI = new C2254308sP(enumC328260CtsArr);
    }

    public static EnumC328260Cts[] values() {
        return (EnumC328260Cts[]) LL.clone();
    }

    public static EnumC328260Cts valueOf(String str) {
        return (EnumC328260Cts) C08FF.LIZ(EnumC328260Cts.class, str);
    }

    public EnumC328260Cts(String str, int i) {
    }
}
