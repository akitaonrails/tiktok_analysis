package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SAO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAO {
    public static final C0SAO FAIL;
    public static final /* synthetic */ C0SAO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SAO SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0SAO> getEntries() {
        return LLILLL;
    }

    static {
        C0SAO c0sao = new C0SAO("SUCCESS", 0, 1);
        SUCCESS = c0sao;
        C0SAO c0sao2 = new C0SAO("FAIL", 1, 0);
        FAIL = c0sao2;
        C0SAO[] c0saoArr = {c0sao, c0sao2};
        LLILLJJLI = c0saoArr;
        LLILLL = new C2254308sP(c0saoArr);
    }

    public static C0SAO[] values() {
        return (C0SAO[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C0SAO valueOf(String str) {
        return (C0SAO) C08FF.LIZ(C0SAO.class, str);
    }

    public C0SAO(String str, int i, int i2) {
        this.LL = i2;
    }
}
