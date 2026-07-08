package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00XV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00XV {
    public static final C00XV DEFAULT;
    public static final C00XV ERROR;
    public static final /* synthetic */ C00XV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00XV LOADING;
    public static final C00XV SUCCESS;

    public static InterfaceC2044707zh<C00XV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00XV c00xv = new C00XV(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = c00xv;
        C00XV c00xv2 = new C00XV("LOADING", 1);
        LOADING = c00xv2;
        C00XV c00xv3 = new C00XV("SUCCESS", 2);
        SUCCESS = c00xv3;
        C00XV c00xv4 = new C00XV("ERROR", 3);
        ERROR = c00xv4;
        C00XV[] c00xvArr = {c00xv, c00xv2, c00xv3, c00xv4};
        LL = c00xvArr;
        LLILLJJLI = new C2254308sP(c00xvArr);
    }

    public static C00XV[] values() {
        return (C00XV[]) LL.clone();
    }

    public static C00XV valueOf(String str) {
        return (C00XV) C08FF.LIZ(C00XV.class, str);
    }

    public C00XV(String str, int i) {
    }
}
