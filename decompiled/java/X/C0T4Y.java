package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0T4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0T4Y implements C0T2H {
    public final Set<String> LIZ = Collections.synchronizedSet(new LinkedHashSet());

    public final boolean LJII(Aweme aweme) {
        Long creativeId;
        if (!C1051600dTK.LIZIZ(aweme, ((Boolean) C1051600dTK.LJIIIZ.getValue()).booleanValue())) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            creativeId = awemeRawAd.getCreativeId();
        } else {
            creativeId = null;
        }
        sbLIZ.append(creativeId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ.contains(strLIZIZ)) {
            return false;
        }
        this.LIZ.add(strLIZIZ);
        return true;
    }

    @Override // X.C0T2H
    public final void LIZIZ(Context context, Aweme aweme) {
        synchronized (aweme) {
            try {
                LIZ(context, aweme);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0T2H
    public final void LIZJ(Context context, Aweme aweme) {
        synchronized (aweme) {
            try {
                if (LJIIJJI(aweme)) {
                    C811103Ev.LIZ("IAdHybridPreRender");
                    LJFF(context, aweme);
                    C811103Ev.LIZIZ(context, "superlike new prerender");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0T2H
    public final void LJI(int i, Context context, List list) {
        if (LIZLLL() && list != null && !list.isEmpty()) {
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
                            int i4 = i + 2;
                            if (i4 > listSynchronizedList.size() - 1) {
                                return;
                            }
                            int size = list.size();
                            while (i4 < size) {
                                Aweme aweme = (Aweme) list.get(i4);
                                if (LJIIJJI(aweme)) {
                                    C811103Ev.LIZ("IAdHybridPreRender");
                                    if (LJII(aweme)) {
                                        C811103Ev.LIZ("IAdHybridPreRender");
                                        LJFF(context, aweme);
                                    }
                                    C811103Ev.LIZIZ(context, "superlike new prerender");
                                    return;
                                }
                                i4++;
                            }
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
