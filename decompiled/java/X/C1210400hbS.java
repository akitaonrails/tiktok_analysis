package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210400hbS extends C1210330hbL {
    public final C1106210etP LLILLJJLI;

    @Override // X.C1210330hbL, X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_2pt_broken_heart;
    }

    public C1210400hbS(C1106210etP c1106210etP) {
        super(c1106210etP);
        this.LLILLJJLI = c1106210etP;
    }

    @Override // X.C1210330hbL, X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        Object c098200Yq;
        try {
            c098200Yq = this.LLILLJJLI.LJJJI;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1047660dMy.LIZIZ.T2(context, (AdLiveEnterRoomConfig) c098200Yq, new AwS563S0100000_19(this, 3299), new AwS563S0100000_19(this, 3300));
    }
}
