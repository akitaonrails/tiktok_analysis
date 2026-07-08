package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.163V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163V {
    public static final C207139163t Companion;
    public static final /* synthetic */ C163V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C163V TRANSLATION_PROTOCOL_PLAIN_TEXT;
    public static final C163V TRANSLATION_PROTOCOL_V1;
    public static final C163V TRANSLATION_PROTOCOL_V2;
    public final int status;

    public static InterfaceC2044707zh<C163V> getEntries() {
        return LLILLJJLI;
    }

    static {
        C163V c163v = new C163V("TRANSLATION_PROTOCOL_PLAIN_TEXT", 0, 0);
        TRANSLATION_PROTOCOL_PLAIN_TEXT = c163v;
        C163V c163v2 = new C163V("TRANSLATION_PROTOCOL_V1", 1, 1);
        TRANSLATION_PROTOCOL_V1 = c163v2;
        C163V c163v3 = new C163V("TRANSLATION_PROTOCOL_V2", 2, 2);
        TRANSLATION_PROTOCOL_V2 = c163v3;
        C163V[] c163vArr = {c163v, c163v2, c163v3};
        LL = c163vArr;
        LLILLJJLI = new C2254308sP(c163vArr);
        Companion = new C207139163t();
    }

    public static C163V[] values() {
        return (C163V[]) LL.clone();
    }

    public static C163V valueOf(String str) {
        return (C163V) C08FF.LIZ(C163V.class, str);
    }

    public C163V(String str, int i, int i2) {
        this.status = i2;
    }
}
