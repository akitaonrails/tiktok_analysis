package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2008407tq {
    public static final EnumC2008407tq CARD_PROMOTION;
    public static final /* synthetic */ EnumC2008407tq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC2008407tq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2008407tq enumC2008407tq = new EnumC2008407tq();
        CARD_PROMOTION = enumC2008407tq;
        EnumC2008407tq[] enumC2008407tqArr = {enumC2008407tq};
        LLILLJJLI = enumC2008407tqArr;
        LLILLL = new C2254308sP(enumC2008407tqArr);
    }

    public static EnumC2008407tq[] values() {
        return (EnumC2008407tq[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2008407tq valueOf(String str) {
        return (EnumC2008407tq) C08FF.LIZ(EnumC2008407tq.class, str);
    }
}
