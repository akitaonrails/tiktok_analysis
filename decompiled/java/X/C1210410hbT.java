package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;

/* JADX INFO: renamed from: X.0hbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210410hbT extends C1210320hbK {
    public final C1106210etP LLILLL;

    public C1210410hbT(Activity activity, C1106210etP c1106210etP) {
        super(activity, c1106210etP);
        this.LLILLL = c1106210etP;
    }

    @Override // X.C1210320hbK, X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        Object c098200Yq;
        try {
            c098200Yq = this.LLILLL.LJJJI;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1047660dMy.LIZIZ.W2(context, (AdLiveEnterRoomConfig) c098200Yq, String.valueOf(this.LLILLL.LIZ));
    }
}
