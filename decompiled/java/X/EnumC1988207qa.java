package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1988207qa {
    public static final EnumC1988207qa LIVE_BALANCE;
    public static final /* synthetic */ EnumC1988207qa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 100;

    public static InterfaceC2044707zh<EnumC1988207qa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1988207qa enumC1988207qa = new EnumC1988207qa();
        LIVE_BALANCE = enumC1988207qa;
        EnumC1988207qa[] enumC1988207qaArr = {enumC1988207qa};
        LLILLJJLI = enumC1988207qaArr;
        LLILLL = new C2254308sP(enumC1988207qaArr);
    }

    public static EnumC1988207qa[] values() {
        return (EnumC1988207qa[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1988207qa valueOf(String str) {
        return (EnumC1988207qa) C08FF.LIZ(EnumC1988207qa.class, str);
    }
}
