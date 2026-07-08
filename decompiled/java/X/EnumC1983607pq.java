package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1983607pq {
    public static final EnumC1983607pq INNER;
    public static final /* synthetic */ EnumC1983607pq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1983607pq OUTER;

    public static InterfaceC2044707zh<EnumC1983607pq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1983607pq enumC1983607pq = new EnumC1983607pq("INNER", 0);
        INNER = enumC1983607pq;
        EnumC1983607pq enumC1983607pq2 = new EnumC1983607pq("OUTER", 1);
        OUTER = enumC1983607pq2;
        EnumC1983607pq[] enumC1983607pqArr = {enumC1983607pq, enumC1983607pq2};
        LL = enumC1983607pqArr;
        LLILLJJLI = new C2254308sP(enumC1983607pqArr);
    }

    public static EnumC1983607pq[] values() {
        return (EnumC1983607pq[]) LL.clone();
    }

    public static EnumC1983607pq valueOf(String str) {
        return (EnumC1983607pq) C08FF.LIZ(EnumC1983607pq.class, str);
    }

    public EnumC1983607pq(String str, int i) {
    }
}
