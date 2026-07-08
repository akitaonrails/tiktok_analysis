package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TCB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TCB {
    public static final C0TCB AD_ACE_SURVEY_STRATEGY;
    public static final C0TCB AD_EXT_LAYER_STRATEGY;
    public static final C0TCB AVOID_AD_STRATEGY;
    public static final C0TCB AVOID_ALL_AD_STRATEGY;
    public static final C0TCB AVOID_AUTH_DIALOG_STRATEGY;
    public static final C0TCB AVOID_AUTOSCROLL_STRATEGY;
    public static final C0TCB AVOID_CCTEMPLATE_STRATEGY;
    public static final C0TCB AVOID_DISABLE_CONDITION_STRATEGY;
    public static final C0TCB AVOID_DUPLICATE_SUB_AWEME_STRATEGY;
    public static final C0TCB AVOID_STORY_STRATEGY;
    public static final C0TCB AVOID_SUB_AWEME_STRATEGY;
    public static final /* synthetic */ C0TCB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final Function1<Aweme, Boolean> LL;

    public static InterfaceC2044707zh<C0TCB> getEntries() {
        return LLILLL;
    }

    static {
        C0TCB c0tcb = new C0TCB(0, "AD_ACE_SURVEY_STRATEGY", new C0TCD());
        AD_ACE_SURVEY_STRATEGY = c0tcb;
        C0TCB c0tcb2 = new C0TCB(1, "AD_EXT_LAYER_STRATEGY", new C0TCC());
        AD_EXT_LAYER_STRATEGY = c0tcb2;
        C0TCB c0tcb3 = new C0TCB(2, "AVOID_AD_STRATEGY", new C14ZE());
        AVOID_AD_STRATEGY = c0tcb3;
        C0TCB c0tcb4 = new C0TCB(3, "AVOID_ALL_AD_STRATEGY", new C14Z6());
        AVOID_ALL_AD_STRATEGY = c0tcb4;
        C0TCB c0tcb5 = new C0TCB(4, "AVOID_STORY_STRATEGY", new C0T3Y());
        AVOID_STORY_STRATEGY = c0tcb5;
        C0TCB c0tcb6 = new C0TCB(5, "AVOID_SUB_AWEME_STRATEGY", new C0T3Z());
        AVOID_SUB_AWEME_STRATEGY = c0tcb6;
        C0TCB c0tcb7 = new C0TCB(6, "AVOID_DUPLICATE_SUB_AWEME_STRATEGY", new C0T3W());
        AVOID_DUPLICATE_SUB_AWEME_STRATEGY = c0tcb7;
        C0TCB c0tcb8 = new C0TCB(7, "AVOID_AUTOSCROLL_STRATEGY", new C740520T3a());
        AVOID_AUTOSCROLL_STRATEGY = c0tcb8;
        C0TCB c0tcb9 = new C0TCB(8, "AVOID_CCTEMPLATE_STRATEGY", new C0TCE());
        AVOID_CCTEMPLATE_STRATEGY = c0tcb9;
        C0TCB c0tcb10 = new C0TCB(9, "AVOID_DISABLE_CONDITION_STRATEGY", new C0T3X());
        AVOID_DISABLE_CONDITION_STRATEGY = c0tcb10;
        C0TCB c0tcb11 = new C0TCB(10, "AVOID_AUTH_DIALOG_STRATEGY", AFwS257S0000000_19.get$arr$(550));
        AVOID_AUTH_DIALOG_STRATEGY = c0tcb11;
        C0TCB[] c0tcbArr = {c0tcb, c0tcb2, c0tcb3, c0tcb4, c0tcb5, c0tcb6, c0tcb7, c0tcb8, c0tcb9, c0tcb10, c0tcb11};
        LLILLJJLI = c0tcbArr;
        LLILLL = new C2254308sP(c0tcbArr);
    }

    public static C0TCB[] values() {
        return (C0TCB[]) LLILLJJLI.clone();
    }

    public final Function1<Aweme, Boolean> getStrategy() {
        return this.LL;
    }

    public static C0TCB valueOf(String str) {
        return (C0TCB) C08FF.LIZ(C0TCB.class, str);
    }

    public C0TCB(int i, String str, Function1 function1) {
        this.LL = function1;
    }
}
