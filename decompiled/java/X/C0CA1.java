package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CA1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CA1 {
    public static final C0CA1 HOME_TAB;
    public static final /* synthetic */ C0CA1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CA1 NONE;
    public static final C0CA1 NOT_HOME_TAB;
    public final String LL;

    public static InterfaceC2044707zh<C0CA1> getEntries() {
        return LLILLL;
    }

    static {
        C0CA1 c0ca1 = new C0CA1("HOME_TAB", 0, "1");
        HOME_TAB = c0ca1;
        C0CA1 c0ca12 = new C0CA1("NOT_HOME_TAB", 1, CardStruct.IStatusCode.DEFAULT);
        NOT_HOME_TAB = c0ca12;
        C0CA1 c0ca13 = new C0CA1("NONE", 2, "-1");
        NONE = c0ca13;
        C0CA1[] c0ca1Arr = {c0ca1, c0ca12, c0ca13};
        LLILLJJLI = c0ca1Arr;
        LLILLL = new C2254308sP(c0ca1Arr);
    }

    public static C0CA1[] values() {
        return (C0CA1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0CA1 valueOf(String str) {
        return (C0CA1) C08FF.LIZ(C0CA1.class, str);
    }

    public C0CA1(String str, int i, String str2) {
        this.LL = str2;
    }
}
