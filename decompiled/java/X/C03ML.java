package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03ML, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ML {
    public static final C03ML BNPL_ACTIVATE;
    public static final C03ML COMBINED_PAYMENT;
    public static final C03ML DEFAULT;
    public static final /* synthetic */ C03ML[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C03ML> getEntries() {
        return LLILLL;
    }

    static {
        C03ML c03ml = new C03ML(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "-1");
        DEFAULT = c03ml;
        C03ML c03ml2 = new C03ML("COMBINED_PAYMENT", 1, "1");
        COMBINED_PAYMENT = c03ml2;
        C03ML c03ml3 = new C03ML("BNPL_ACTIVATE", 2, "3");
        BNPL_ACTIVATE = c03ml3;
        C03ML[] c03mlArr = {c03ml, c03ml2, c03ml3};
        LLILLJJLI = c03mlArr;
        LLILLL = new C2254308sP(c03mlArr);
    }

    public static C03ML[] values() {
        return (C03ML[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C03ML valueOf(String str) {
        return (C03ML) C08FF.LIZ(C03ML.class, str);
    }

    public C03ML(String str, int i, String str2) {
        this.LL = str2;
    }
}
