package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeCommerceRenewSetting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U3Q {
    public static final C0U3Q BGM;
    public static final C0U3Q COMMERCE;
    public static final C0U3Q COMMERCE_GOODS;
    public static final C0U3Q KARAOKE;
    public static final /* synthetic */ C0U3Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0U3Q LOCAL_SERVICE_GOODS;
    public static final C0U3Q PAID_LIVE_EVENT;
    public static final C0U3Q SUB_ONLY;
    public static final C0U3Q VOICE_EFFECT;
    public final int LL;

    public static InterfaceC2044707zh<C0U3Q> getEntries() {
        return LLILLL;
    }

    static {
        LiveKaraokeCommerceRenewSetting.INSTANCE.getValue();
        C0U3Q c0u3q = new C0U3Q("KARAOKE", 0, 19);
        KARAOKE = c0u3q;
        C0U3Q c0u3q2 = new C0U3Q("BGM", 1, 3);
        BGM = c0u3q2;
        C0U3Q c0u3q3 = new C0U3Q("VOICE_EFFECT", 2, 1);
        VOICE_EFFECT = c0u3q3;
        C0U3Q c0u3q4 = new C0U3Q("PAID_LIVE_EVENT", 3, 2);
        PAID_LIVE_EVENT = c0u3q4;
        C0U3Q c0u3q5 = new C0U3Q("SUB_ONLY", 4, 2);
        SUB_ONLY = c0u3q5;
        C0U3Q c0u3q6 = new C0U3Q("COMMERCE", 5, 4);
        COMMERCE = c0u3q6;
        C0U3Q c0u3q7 = new C0U3Q("COMMERCE_GOODS", 6, 8);
        COMMERCE_GOODS = c0u3q7;
        C0U3Q c0u3q8 = new C0U3Q("LOCAL_SERVICE_GOODS", 7, 16);
        LOCAL_SERVICE_GOODS = c0u3q8;
        C0U3Q[] c0u3qArr = {c0u3q, c0u3q2, c0u3q3, c0u3q4, c0u3q5, c0u3q6, c0u3q7, c0u3q8};
        LLILLJJLI = c0u3qArr;
        LLILLL = new C2254308sP(c0u3qArr);
    }

    public static C0U3Q[] values() {
        return (C0U3Q[]) LLILLJJLI.clone();
    }

    public final boolean canCoexist() {
        return !C0U3P.LIZ(this);
    }

    public final boolean checkExclusive() {
        return C0U3P.LIZ(this);
    }

    public final int getFlag() {
        return this.LL;
    }

    public static C0U3Q valueOf(String str) {
        return (C0U3Q) C08FF.LIZ(C0U3Q.class, str);
    }

    public C0U3Q(String str, int i, int i2) {
        this.LL = i2;
    }
}
