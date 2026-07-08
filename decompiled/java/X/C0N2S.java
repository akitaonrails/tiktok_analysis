package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2S implements InterfaceC593520NPq<Integer> {
    public static final C0N2S DEFAULT;
    public static final /* synthetic */ C0N2S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N2S PARTIAL_LOAD;
    public static final C0N2S TOPVIEW_JSON_SPILT;
    public final int LL;

    public static InterfaceC2044707zh<C0N2S> getEntries() {
        return LLILLL;
    }

    static {
        C0N2S c0n2s = new C0N2S(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0n2s;
        C0N2S c0n2s2 = new C0N2S("TOPVIEW_JSON_SPILT", 1, 1);
        TOPVIEW_JSON_SPILT = c0n2s2;
        C0N2S c0n2s3 = new C0N2S("PARTIAL_LOAD", 2, 2);
        PARTIAL_LOAD = c0n2s3;
        C0N2S[] c0n2sArr = {c0n2s, c0n2s2, c0n2s3};
        LLILLJJLI = c0n2sArr;
        LLILLL = new C2254308sP(c0n2sArr);
    }

    public static C0N2S[] values() {
        return (C0N2S[]) LLILLJJLI.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC593520NPq
    public Integer getParamValue() {
        return Integer.valueOf(this.LL);
    }

    public static C0N2S valueOf(String str) {
        return (C0N2S) C08FF.LIZ(C0N2S.class, str);
    }

    public C0N2S(String str, int i, int i2) {
        this.LL = i2;
    }
}
