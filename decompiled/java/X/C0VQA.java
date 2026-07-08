package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0VQA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQA {
    public static final C0VQA LIZ = new C0VQA();

    public static String LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = C0XQ7.LIZIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? CardStruct.IStatusCode.DEFAULT : str;
    }
}
