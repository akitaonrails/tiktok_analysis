package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2182608gq {
    public static final EnumC2182608gq LL;
    public static final EnumC2182608gq LLILLJJLI;
    public static final /* synthetic */ EnumC2182608gq[] LLILLL;

    static {
        EnumC2182608gq enumC2182608gq = new EnumC2182608gq("PULL_REFRESH", 0);
        LL = enumC2182608gq;
        EnumC2182608gq enumC2182608gq2 = new EnumC2182608gq("VISIBILITY_CHANGE", 1);
        LLILLJJLI = enumC2182608gq2;
        EnumC2182608gq[] enumC2182608gqArr = {enumC2182608gq, enumC2182608gq2};
        LLILLL = enumC2182608gqArr;
        new C2254308sP(enumC2182608gqArr);
    }

    public static EnumC2182608gq[] values() {
        return (EnumC2182608gq[]) LLILLL.clone();
    }

    public static EnumC2182608gq valueOf(String str) {
        return (EnumC2182608gq) C08FF.LIZ(EnumC2182608gq.class, str);
    }

    public EnumC2182608gq(String str, int i) {
    }
}
