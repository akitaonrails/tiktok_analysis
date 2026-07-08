package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.055t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12971055t {
    public static final EnumC12971055t DID;
    public static final /* synthetic */ EnumC12971055t[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12971055t UID;
    public final int LL;

    public static InterfaceC2044707zh<EnumC12971055t> getEntries() {
        return LLILLL;
    }

    static {
        EnumC12971055t enumC12971055t = new EnumC12971055t("UID", 0, 1);
        UID = enumC12971055t;
        EnumC12971055t enumC12971055t2 = new EnumC12971055t("DID", 1, 2);
        DID = enumC12971055t2;
        EnumC12971055t[] enumC12971055tArr = {enumC12971055t, enumC12971055t2};
        LLILLJJLI = enumC12971055tArr;
        LLILLL = new C2254308sP(enumC12971055tArr);
    }

    public static EnumC12971055t[] values() {
        return (EnumC12971055t[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC12971055t valueOf(String str) {
        return (EnumC12971055t) C08FF.LIZ(EnumC12971055t.class, str);
    }

    public EnumC12971055t(String str, int i, int i2) {
        this.LL = i2;
    }
}
