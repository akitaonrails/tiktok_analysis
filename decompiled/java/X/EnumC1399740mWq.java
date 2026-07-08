package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1399740mWq {
    public static final EnumC1399740mWq GONE;
    public static final /* synthetic */ EnumC1399740mWq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1399740mWq VISIBLE;
    public static final EnumC1399740mWq VISIBLE_AFTER_5S;

    public static InterfaceC2044707zh<EnumC1399740mWq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1399740mWq enumC1399740mWq = new EnumC1399740mWq("GONE", 0);
        GONE = enumC1399740mWq;
        EnumC1399740mWq enumC1399740mWq2 = new EnumC1399740mWq("VISIBLE", 1);
        VISIBLE = enumC1399740mWq2;
        EnumC1399740mWq enumC1399740mWq3 = new EnumC1399740mWq("VISIBLE_AFTER_5S", 2);
        VISIBLE_AFTER_5S = enumC1399740mWq3;
        EnumC1399740mWq[] enumC1399740mWqArr = {enumC1399740mWq, enumC1399740mWq2, enumC1399740mWq3};
        LL = enumC1399740mWqArr;
        LLILLJJLI = new C2254308sP(enumC1399740mWqArr);
    }

    public static EnumC1399740mWq[] values() {
        return (EnumC1399740mWq[]) LL.clone();
    }

    public static EnumC1399740mWq valueOf(String str) {
        return (EnumC1399740mWq) C08FF.LIZ(EnumC1399740mWq.class, str);
    }

    public EnumC1399740mWq(String str, int i) {
    }
}
