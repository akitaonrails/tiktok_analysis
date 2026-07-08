package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1641906bp {
    public static final EnumC1641906bp CHAT_NOTICE;
    public static final /* synthetic */ EnumC1641906bp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641906bp MESSAGE;

    public static InterfaceC2044707zh<EnumC1641906bp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641906bp enumC1641906bp = new EnumC1641906bp("CHAT_NOTICE", 0);
        CHAT_NOTICE = enumC1641906bp;
        EnumC1641906bp enumC1641906bp2 = new EnumC1641906bp("MESSAGE", 1);
        MESSAGE = enumC1641906bp2;
        EnumC1641906bp[] enumC1641906bpArr = {enumC1641906bp, enumC1641906bp2};
        LL = enumC1641906bpArr;
        LLILLJJLI = new C2254308sP(enumC1641906bpArr);
    }

    public static EnumC1641906bp[] values() {
        return (EnumC1641906bp[]) LL.clone();
    }

    public static EnumC1641906bp valueOf(String str) {
        return (EnumC1641906bp) C08FF.LIZ(EnumC1641906bp.class, str);
    }

    public EnumC1641906bp(String str, int i) {
    }
}
