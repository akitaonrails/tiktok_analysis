package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC041000Cq {
    public static final EnumC041000Cq HIDE;
    public static final /* synthetic */ EnumC041000Cq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC041000Cq SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC041000Cq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC041000Cq enumC041000Cq = new EnumC041000Cq("SHOW", 0, 0);
        SHOW = enumC041000Cq;
        EnumC041000Cq enumC041000Cq2 = new EnumC041000Cq("HIDE", 1, 1);
        HIDE = enumC041000Cq2;
        EnumC041000Cq[] enumC041000CqArr = {enumC041000Cq, enumC041000Cq2};
        LLILLJJLI = enumC041000CqArr;
        LLILLL = new C2254308sP(enumC041000CqArr);
    }

    public static EnumC041000Cq[] values() {
        return (EnumC041000Cq[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC041000Cq valueOf(String str) {
        return (EnumC041000Cq) C08FF.LIZ(EnumC041000Cq.class, str);
    }

    public EnumC041000Cq(String str, int i, int i2) {
        this.LL = i2;
    }
}
