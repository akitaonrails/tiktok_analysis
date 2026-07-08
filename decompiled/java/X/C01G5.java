package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01G5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01G5 {
    public static final C01G5 ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME;
    public static final /* synthetic */ C01G5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 1;

    public static InterfaceC2044707zh<C01G5> getEntries() {
        return LLILLL;
    }

    static {
        C01G5 c01g5 = new C01G5();
        ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME = c01g5;
        C01G5[] c01g5Arr = {c01g5};
        LLILLJJLI = c01g5Arr;
        LLILLL = new C2254308sP(c01g5Arr);
    }

    public static C01G5[] values() {
        return (C01G5[]) LLILLJJLI.clone();
    }

    public final int getFlag() {
        return this.LL;
    }

    public static C01G5 valueOf(String str) {
        return (C01G5) C08FF.LIZ(C01G5.class, str);
    }
}
