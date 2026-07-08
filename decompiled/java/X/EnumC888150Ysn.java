package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ysn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC888150Ysn {
    public static final /* synthetic */ EnumC888150Ysn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC888150Ysn PRIORITY;
    public static final EnumC888150Ysn REQUESTS;

    public static InterfaceC2044707zh<EnumC888150Ysn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC888150Ysn enumC888150Ysn = new EnumC888150Ysn("PRIORITY", 0);
        PRIORITY = enumC888150Ysn;
        EnumC888150Ysn enumC888150Ysn2 = new EnumC888150Ysn("REQUESTS", 1);
        REQUESTS = enumC888150Ysn2;
        EnumC888150Ysn[] enumC888150YsnArr = {enumC888150Ysn, enumC888150Ysn2};
        LL = enumC888150YsnArr;
        LLILLJJLI = new C2254308sP(enumC888150YsnArr);
    }

    public static EnumC888150Ysn[] values() {
        return (EnumC888150Ysn[]) LL.clone();
    }

    public static EnumC888150Ysn valueOf(String str) {
        return (EnumC888150Ysn) C08FF.LIZ(EnumC888150Ysn.class, str);
    }

    public EnumC888150Ysn(String str, int i) {
    }
}
