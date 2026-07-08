package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ISearchAdPreloadModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: renamed from: X.0cKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007830cKj implements C0PPD {
    public long LIZ = -1;
    public long LIZIZ = -1;
    public String LIZJ = "";
    public EnumC658110Prd LIZLLL;
    public long LJ;
    public long LJFF;
    public boolean LJI;
    public Boolean LJII;
    public long LJIIIIZZ;

    @Override // X.C0PPD
    public final void LIZ() {
        this.LIZ = System.currentTimeMillis() - this.LJ;
    }

    @Override // X.C0PPD
    public final void LIZJ() {
        this.LJFF = System.currentTimeMillis();
    }

    @Override // X.C0PPD
    public final void LIZLLL() {
        this.LIZIZ = System.currentTimeMillis() - this.LJFF;
    }

    @Override // X.C0PPD
    public final void LJ() {
        Object c098200Yq;
        try {
            c098200Yq = C13LP.LLIIII(((ISearchAdPreloadModule) ServiceManager.get().getService(ISearchAdPreloadModule.class)).LIZIZ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1007840cKk(this, (List) c098200Yq, null), 3);
    }

    @Override // X.C0PPD
    public final void LIZIZ(boolean z) {
        this.LJIIIIZZ = System.currentTimeMillis() - this.LJFF;
        this.LJII = Boolean.valueOf(z);
    }

    @Override // X.C0PPD
    public final void LJFF(Aweme aweme, EnumC658110Prd enumC658110Prd, String str) {
        String creativeIdStr;
        this.LJI = true;
        this.LJ = System.currentTimeMillis();
        AwemeRawAd awemeRawAdLJIIIIZZ = null;
        if (!C1010120cOQ.LJJIJ(aweme)) {
            if (aweme != null) {
                awemeRawAdLJIIIIZZ = aweme.getAwemeRawAd();
            }
        } else if (aweme != null) {
            awemeRawAdLJIIIIZZ = C1010120cOQ.LJIIIIZZ(aweme);
        }
        this.LIZLLL = enumC658110Prd;
        if (awemeRawAdLJIIIIZZ != null && (creativeIdStr = awemeRawAdLJIIIIZZ.getCreativeIdStr()) != null) {
            str = creativeIdStr;
        } else if (str == null) {
            str = "";
        }
        this.LIZJ = str;
    }
}
