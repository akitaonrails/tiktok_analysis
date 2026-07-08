package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NO3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NO3 {
    public static final C0NO3 DEFAULT;
    public static final /* synthetic */ C0NO3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NO3 MAIN;

    public static InterfaceC2044707zh<C0NO3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NO3 c0no3 = new C0NO3("MAIN", 0);
        MAIN = c0no3;
        C0NO3 c0no32 = new C0NO3(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = c0no32;
        C0NO3[] c0no3Arr = {c0no3, c0no32};
        LL = c0no3Arr;
        LLILLJJLI = new C2254308sP(c0no3Arr);
    }

    public static C0NO3[] values() {
        return (C0NO3[]) LL.clone();
    }

    public static C0NO3 valueOf(String str) {
        return (C0NO3) C08FF.LIZ(C0NO3.class, str);
    }

    public C0NO3(String str, int i) {
    }
}
