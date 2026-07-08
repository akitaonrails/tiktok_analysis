package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LRE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LRE implements AIGC<Integer> {
    public static final C0LRE AFTER_MENTION;
    public static final /* synthetic */ C0LRE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LRE UPON_INPUT;
    public final int LL;

    public static InterfaceC2044707zh<C0LRE> getEntries() {
        return LLILLL;
    }

    static {
        C0LRE c0lre = new C0LRE("UPON_INPUT", 0, 1);
        UPON_INPUT = c0lre;
        C0LRE c0lre2 = new C0LRE("AFTER_MENTION", 1, 2);
        AFTER_MENTION = c0lre2;
        C0LRE[] c0lreArr = {c0lre, c0lre2};
        LLILLJJLI = c0lreArr;
        LLILLL = new C2254308sP(c0lreArr);
    }

    public static C0LRE[] values() {
        return (C0LRE[]) LLILLJJLI.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC
    public Integer getValue() {
        return Integer.valueOf(this.LL);
    }

    public static C0LRE valueOf(String str) {
        return (C0LRE) C08FF.LIZ(C0LRE.class, str);
    }

    public boolean isFromChat(AIGC.AICreationSceneName aICreationSceneName) {
        return C549110LgD.LIZ(aICreationSceneName);
    }

    public C0LRE(String str, int i, int i2) {
        this.LL = i2;
    }
}
