package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1478905qd {
    public static final /* synthetic */ EnumC1478905qd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1478905qd RECENT_SENT;
    public static final EnumC1478905qd RECENT_SHARED;

    public static InterfaceC2044707zh<EnumC1478905qd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1478905qd enumC1478905qd = new EnumC1478905qd("RECENT_SENT", 0);
        RECENT_SENT = enumC1478905qd;
        EnumC1478905qd enumC1478905qd2 = new EnumC1478905qd("RECENT_SHARED", 1);
        RECENT_SHARED = enumC1478905qd2;
        EnumC1478905qd[] enumC1478905qdArr = {enumC1478905qd, enumC1478905qd2};
        LL = enumC1478905qdArr;
        LLILLJJLI = new C2254308sP(enumC1478905qdArr);
    }

    public static EnumC1478905qd[] values() {
        return (EnumC1478905qd[]) LL.clone();
    }

    public static EnumC1478905qd valueOf(String str) {
        return (EnumC1478905qd) C08FF.LIZ(EnumC1478905qd.class, str);
    }

    public EnumC1478905qd(String str, int i) {
    }
}
