package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC321290Cid {
    public static final EnumC321290Cid FIXED;
    public static final /* synthetic */ EnumC321290Cid[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC321290Cid ORIGINAL;

    public static InterfaceC2044707zh<EnumC321290Cid> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC321290Cid enumC321290Cid = new EnumC321290Cid("ORIGINAL", 0);
        ORIGINAL = enumC321290Cid;
        EnumC321290Cid enumC321290Cid2 = new EnumC321290Cid("FIXED", 1);
        FIXED = enumC321290Cid2;
        EnumC321290Cid[] enumC321290CidArr = {enumC321290Cid, enumC321290Cid2};
        LL = enumC321290CidArr;
        LLILLJJLI = new C2254308sP(enumC321290CidArr);
    }

    public static EnumC321290Cid[] values() {
        return (EnumC321290Cid[]) LL.clone();
    }

    public static EnumC321290Cid valueOf(String str) {
        return (EnumC321290Cid) C08FF.LIZ(EnumC321290Cid.class, str);
    }

    public EnumC321290Cid(String str, int i) {
    }
}
