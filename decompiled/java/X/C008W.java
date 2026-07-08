package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008W, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008W {
    public static final /* synthetic */ C008W[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008W SILENCE;
    public static final C008W SPEECH_ACTIVE;
    public static final C008W SPEECH_BEGIN;
    public static final C008W SPEECH_END;

    public static InterfaceC2044707zh<C008W> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008W c008w = new C008W("SPEECH_BEGIN", 0);
        SPEECH_BEGIN = c008w;
        C008W c008w2 = new C008W("SPEECH_ACTIVE", 1);
        SPEECH_ACTIVE = c008w2;
        C008W c008w3 = new C008W("SILENCE", 2);
        SILENCE = c008w3;
        C008W c008w4 = new C008W("SPEECH_END", 3);
        SPEECH_END = c008w4;
        C008W[] c008wArr = {c008w, c008w2, c008w3, c008w4};
        LL = c008wArr;
        LLILLJJLI = new C2254308sP(c008wArr);
    }

    public static C008W[] values() {
        return (C008W[]) LL.clone();
    }

    public static C008W valueOf(String str) {
        return (C008W) C08FF.LIZ(C008W.class, str);
    }

    public C008W(String str, int i) {
    }
}
