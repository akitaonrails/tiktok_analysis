package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQC {
    public static final C0RQC ACE_SURVEY;
    public static final C0RQC AD_EXT_LAYER;
    public static final C0RQC AD_SURVEY;
    public static final C0RQC FEED_SURVEY;
    public static final /* synthetic */ C0RQC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0RQC PROMPT_SURVEY;

    public static InterfaceC2044707zh<C0RQC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0RQC c0rqc = new C0RQC("ACE_SURVEY", 0);
        ACE_SURVEY = c0rqc;
        C0RQC c0rqc2 = new C0RQC("AD_SURVEY", 1);
        AD_SURVEY = c0rqc2;
        C0RQC c0rqc3 = new C0RQC("FEED_SURVEY", 2);
        FEED_SURVEY = c0rqc3;
        C0RQC c0rqc4 = new C0RQC("PROMPT_SURVEY", 3);
        PROMPT_SURVEY = c0rqc4;
        C0RQC c0rqc5 = new C0RQC("AD_EXT_LAYER", 4);
        AD_EXT_LAYER = c0rqc5;
        C0RQC[] c0rqcArr = {c0rqc, c0rqc2, c0rqc3, c0rqc4, c0rqc5};
        LL = c0rqcArr;
        LLILLJJLI = new C2254308sP(c0rqcArr);
    }

    public static C0RQC[] values() {
        return (C0RQC[]) LL.clone();
    }

    public static C0RQC valueOf(String str) {
        return (C0RQC) C08FF.LIZ(C0RQC.class, str);
    }

    public C0RQC(String str, int i) {
    }
}
