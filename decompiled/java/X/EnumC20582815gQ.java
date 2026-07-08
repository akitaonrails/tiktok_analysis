package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15gQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20582815gQ {
    public static final /* synthetic */ EnumC20582815gQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20582815gQ QUOTA_FAIL;
    public static final EnumC20582815gQ SERVER_FAIL;
    public static final EnumC20582815gQ THROTTLE_FAIL;
    public static final EnumC20582815gQ TNS_FAIL;

    public static InterfaceC2044707zh<EnumC20582815gQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20582815gQ enumC20582815gQ = new EnumC20582815gQ("SERVER_FAIL", 0);
        SERVER_FAIL = enumC20582815gQ;
        EnumC20582815gQ enumC20582815gQ2 = new EnumC20582815gQ("QUOTA_FAIL", 1);
        QUOTA_FAIL = enumC20582815gQ2;
        EnumC20582815gQ enumC20582815gQ3 = new EnumC20582815gQ("THROTTLE_FAIL", 2);
        THROTTLE_FAIL = enumC20582815gQ3;
        EnumC20582815gQ enumC20582815gQ4 = new EnumC20582815gQ("TNS_FAIL", 3);
        TNS_FAIL = enumC20582815gQ4;
        EnumC20582815gQ[] enumC20582815gQArr = {enumC20582815gQ, enumC20582815gQ2, enumC20582815gQ3, enumC20582815gQ4};
        LL = enumC20582815gQArr;
        LLILLJJLI = new C2254308sP(enumC20582815gQArr);
    }

    public static EnumC20582815gQ[] values() {
        return (EnumC20582815gQ[]) LL.clone();
    }

    public static EnumC20582815gQ valueOf(String str) {
        return (EnumC20582815gQ) C08FF.LIZ(EnumC20582815gQ.class, str);
    }

    public EnumC20582815gQ(String str, int i) {
    }
}
