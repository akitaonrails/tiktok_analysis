package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14ZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZJ {
    public static final C14ZJ CLA_SURVEY_STRATEGY;
    public static final C14ZJ CONTENT_DIVERSITY_SURVEY_STRATEGY;
    public static final /* synthetic */ C14ZJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C14ZJ MAX_SUBMIT_TIME_STRATEGY;
    public static final C14ZJ MAX_UNSUBMIT_SHOW_TIME_STRATEGY;
    public static final C14ZJ SURVEY_FREQUENCY_STEATEGY;
    public static final C14ZJ SURVEY_HAS_SUBMIT_STRATEGY;
    public static final C14ZJ SURVEY_NOT_EMPTY_STRATEGY;
    public static final C14ZJ SURVEY_TURNSGROUP_STRATEGY;
    public final Function1<Aweme, Boolean> LL;

    public static InterfaceC2044707zh<C14ZJ> getEntries() {
        return LLILLL;
    }

    static {
        C14ZJ c14zj = new C14ZJ(0, "SURVEY_NOT_EMPTY_STRATEGY", new C14ZC());
        SURVEY_NOT_EMPTY_STRATEGY = c14zj;
        C14ZJ c14zj2 = new C14ZJ(1, "SURVEY_HAS_SUBMIT_STRATEGY", new C14ZN());
        SURVEY_HAS_SUBMIT_STRATEGY = c14zj2;
        C14ZJ c14zj3 = new C14ZJ(2, "SURVEY_TURNSGROUP_STRATEGY", new C14ZB());
        SURVEY_TURNSGROUP_STRATEGY = c14zj3;
        C14ZJ c14zj4 = new C14ZJ(3, "SURVEY_FREQUENCY_STEATEGY", new C14YY());
        SURVEY_FREQUENCY_STEATEGY = c14zj4;
        C14ZJ c14zj5 = new C14ZJ(4, "CLA_SURVEY_STRATEGY", new C14ZM());
        CLA_SURVEY_STRATEGY = c14zj5;
        C14ZJ c14zj6 = new C14ZJ(5, "CONTENT_DIVERSITY_SURVEY_STRATEGY", new C14ZL());
        CONTENT_DIVERSITY_SURVEY_STRATEGY = c14zj6;
        C14ZJ c14zj7 = new C14ZJ(6, "MAX_SUBMIT_TIME_STRATEGY", new C14ZI());
        MAX_SUBMIT_TIME_STRATEGY = c14zj7;
        C14ZJ c14zj8 = new C14ZJ(7, "MAX_UNSUBMIT_SHOW_TIME_STRATEGY", new C14ZK());
        MAX_UNSUBMIT_SHOW_TIME_STRATEGY = c14zj8;
        C14ZJ[] c14zjArr = {c14zj, c14zj2, c14zj3, c14zj4, c14zj5, c14zj6, c14zj7, c14zj8};
        LLILLJJLI = c14zjArr;
        LLILLL = new C2254308sP(c14zjArr);
    }

    public static C14ZJ[] values() {
        return (C14ZJ[]) LLILLJJLI.clone();
    }

    public final Function1<Aweme, Boolean> getStrategy() {
        return this.LL;
    }

    public static C14ZJ valueOf(String str) {
        return (C14ZJ) C08FF.LIZ(C14ZJ.class, str);
    }

    public C14ZJ(int i, String str, Function1 function1) {
        this.LL = function1;
    }
}
