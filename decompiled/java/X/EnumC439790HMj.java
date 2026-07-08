package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439790HMj {
    public static final EnumC439790HMj FRIENDS;
    public static final EnumC439790HMj INBOX;
    public static final /* synthetic */ EnumC439790HMj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC439790HMj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC439790HMj enumC439790HMj = new EnumC439790HMj("INBOX", 0, "inbox");
        INBOX = enumC439790HMj;
        EnumC439790HMj enumC439790HMj2 = new EnumC439790HMj("FRIENDS", 1, "friends");
        FRIENDS = enumC439790HMj2;
        EnumC439790HMj[] enumC439790HMjArr = {enumC439790HMj, enumC439790HMj2};
        LLILLJJLI = enumC439790HMjArr;
        LLILLL = new C2254308sP(enumC439790HMjArr);
    }

    public static EnumC439790HMj[] values() {
        return (EnumC439790HMj[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    public static EnumC439790HMj valueOf(String str) {
        return (EnumC439790HMj) C08FF.LIZ(EnumC439790HMj.class, str);
    }

    public EnumC439790HMj(String str, int i, String str2) {
        this.LL = str2;
    }
}
