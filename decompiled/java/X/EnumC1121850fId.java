package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1121850fId {
    public static final EnumC1121850fId CLAIM;
    public static final EnumC1121850fId GET;
    public static final /* synthetic */ EnumC1121850fId[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1121850fId> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1121850fId enumC1121850fId = new EnumC1121850fId("CLAIM", 0);
        CLAIM = enumC1121850fId;
        EnumC1121850fId enumC1121850fId2 = new EnumC1121850fId("GET", 1);
        GET = enumC1121850fId2;
        EnumC1121850fId[] enumC1121850fIdArr = {enumC1121850fId, enumC1121850fId2};
        LL = enumC1121850fIdArr;
        LLILLJJLI = new C2254308sP(enumC1121850fIdArr);
    }

    public static EnumC1121850fId[] values() {
        return (EnumC1121850fId[]) LL.clone();
    }

    public static EnumC1121850fId valueOf(String str) {
        return (EnumC1121850fId) C08FF.LIZ(EnumC1121850fId.class, str);
    }

    public EnumC1121850fId(String str, int i) {
    }
}
