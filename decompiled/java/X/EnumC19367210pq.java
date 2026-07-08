package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19367210pq {
    public static final EnumC19367210pq LINK_CHANGE;
    public static final /* synthetic */ EnumC19367210pq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19367210pq TITLE_CHANGE;

    public static InterfaceC2044707zh<EnumC19367210pq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19367210pq enumC19367210pq = new EnumC19367210pq("TITLE_CHANGE", 0);
        TITLE_CHANGE = enumC19367210pq;
        EnumC19367210pq enumC19367210pq2 = new EnumC19367210pq("LINK_CHANGE", 1);
        LINK_CHANGE = enumC19367210pq2;
        EnumC19367210pq[] enumC19367210pqArr = {enumC19367210pq, enumC19367210pq2};
        LL = enumC19367210pqArr;
        LLILLJJLI = new C2254308sP(enumC19367210pqArr);
    }

    public static EnumC19367210pq[] values() {
        return (EnumC19367210pq[]) LL.clone();
    }

    public static EnumC19367210pq valueOf(String str) {
        return (EnumC19367210pq) C08FF.LIZ(EnumC19367210pq.class, str);
    }

    public EnumC19367210pq(String str, int i) {
    }
}
