package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0c6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999090c6d {
    public static void LIZ(InterfaceC990700bt6 interfaceC990700bt6, List<? extends Aweme> list, int i) {
        if (list != null && !list.isEmpty()) {
            List listSynchronizedList = Collections.synchronizedList(list);
            synchronized (listSynchronizedList) {
                if (i >= 0) {
                    try {
                        if (i <= listSynchronizedList.size() - 1) {
                            if (((Aweme) listSynchronizedList.get(i)).isAd()) {
                                return;
                            }
                            int i2 = i + 1;
                            if (i2 <= listSynchronizedList.size() - 1 && ((Aweme) listSynchronizedList.get(i2)).isAd()) {
                                return;
                            }
                            int i3 = i - 1;
                            if (i3 >= 0 && ((Aweme) listSynchronizedList.get(i3)).isAd()) {
                                return;
                            }
                            if (i + 2 > listSynchronizedList.size() - 1) {
                                return;
                            }
                            interfaceC990700bt6.LJIILLIIL(i, list);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }
}
