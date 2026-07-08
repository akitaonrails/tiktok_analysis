package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4H {
    public static final C0N4H HOME_PAGE;
    public static final /* synthetic */ C0N4H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4H NON_HOME_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<C0N4H> getEntries() {
        return LLILLL;
    }

    static {
        C0N4H c0n4h = new C0N4H("NON_HOME_PAGE", 0, CardStruct.IStatusCode.DEFAULT);
        NON_HOME_PAGE = c0n4h;
        C0N4H c0n4h2 = new C0N4H("HOME_PAGE", 1, "1");
        HOME_PAGE = c0n4h2;
        C0N4H[] c0n4hArr = {c0n4h, c0n4h2};
        LLILLJJLI = c0n4hArr;
        LLILLL = new C2254308sP(c0n4hArr);
    }

    public static C0N4H[] values() {
        return (C0N4H[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N4H valueOf(String str) {
        return (C0N4H) C08FF.LIZ(C0N4H.class, str);
    }

    public C0N4H(String str, int i, String str2) {
        this.LL = str2;
    }
}
