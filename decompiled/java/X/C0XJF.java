package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XJF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJF {
    public static final C0XJF DB;
    public static final C0XJF FILE;
    public static final C0XJF KV;
    public static final /* synthetic */ C0XJF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0XJF> getEntries() {
        return LLILLL;
    }

    static {
        C0XJF c0xjf = new C0XJF("KV", 0, "kv");
        KV = c0xjf;
        C0XJF c0xjf2 = new C0XJF("FILE", 1, "file");
        FILE = c0xjf2;
        C0XJF c0xjf3 = new C0XJF("DB", 2, "db");
        DB = c0xjf3;
        C0XJF[] c0xjfArr = {c0xjf, c0xjf2, c0xjf3};
        LLILLJJLI = c0xjfArr;
        LLILLL = new C2254308sP(c0xjfArr);
    }

    public static C0XJF[] values() {
        return (C0XJF[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C0XJF valueOf(String str) {
        return (C0XJF) C08FF.LIZ(C0XJF.class, str);
    }

    public C0XJF(String str, int i, String str2) {
        this.LL = str2;
    }
}
