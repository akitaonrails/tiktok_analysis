package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import zf9.a;

/* JADX INFO: renamed from: X.0cp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1026640cp4<PAYLOAD extends a> implements InterfaceC1026720cpC, InterfaceC1026870cpR {
    public List<InterfaceC1026740cpE> LJII;
    public List<InterfaceC1025840cnm> LJIIJ;
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 872));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 870));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 874));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 873));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 875));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 879));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 878));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(474));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(473));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 877));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 880));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 871));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS560S0100000_16((AbstractC1026640cp4) this, 876));

    @Override // X.InterfaceC1026720cpC
    public boolean LJFF() {
        return this instanceof C1022230chx;
    }

    public abstract PAYLOAD LJIILL();

    public abstract String LJIILLIIL();

    public boolean LJIJ() {
        return false;
    }

    public final C1025520cnG LJII() {
        return (C1025520cnG) this.LIZIZ.getValue();
    }

    public final int LJIIIIZZ() {
        return ((Number) this.LJIILIIL.getValue()).intValue();
    }

    public final C1025880cnq LJIIIZ() {
        return (C1025880cnq) this.LIZ.getValue();
    }

    public final Context LJIIJ() {
        return (Context) this.LIZLLL.getValue();
    }

    public final GMTBaseModel LJIIJJI() {
        return (GMTBaseModel) this.LIZJ.getValue();
    }

    public final Object LJIIL() {
        return this.LJ.getValue();
    }

    public final ICRouterAdapterDelegate LJIILIIL() {
        return (ICRouterAdapterDelegate) this.LJIIIZ.getValue();
    }

    public final ICRouterMainDelegate LJIILJJIL() {
        return (ICRouterMainDelegate) this.LJIIIIZZ.getValue();
    }

    public final String LJIIZILJ() {
        return (String) this.LJIIL.getValue();
    }

    public Fragment getFragment() {
        C03EJ.LIZ(LJIIJ(), "handle commerce router getPage()");
        return null;
    }

    @Override // X.InterfaceC1026720cpC
    public C1026830cpN LIZ() {
        return new C1026830cpN(LJIILLIIL(), LJIILL(), LJIJ(), this instanceof C1022230chx, 16);
    }

    @Override // X.InterfaceC1026870cpR
    public final C1026830cpN LIZJ() {
        return LIZ();
    }

    public final void LJI() {
        Activity activityLIZ = C1388190mED.LIZ(LJIIJ());
        if (activityLIZ != null) {
            int iLIZLLL = LJIILJJIL().LIZLLL();
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(iLIZLLL);
            c1389890mGx.LJIIJJI();
        }
    }

    public final C1026670cp7 LJIJI(Intent intent) {
        Object c098200Yq;
        if (!LJIIJ().getClass().isAssignableFrom(Activity.class)) {
            intent.addFlags(268435456);
        }
        try {
            Context contextLJIIJ = LJIIJ();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLJIIJ, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, contextLJIIJ);
            C2204961BRm.LJJJJJL(contextLJIIJ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMqm7thDKSX8Qu5gUqwkEmEyaVW75I1xBpkshxyC8uPqOcKv8wcHbRjfQ=", null));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return new C1026670cp7(-1, "fail_start_activity");
        }
        return C1026670cp7.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[PHI: r4
      0x0025: PHI (r4v5 java.lang.Object) = (r4v2 java.lang.Object), (r4v0 java.lang.Object) binds: [B:40:0x00dc, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    @Override // X.InterfaceC1026720cpC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1026630cp3 r9, X.InterfaceC1364105Vn r10) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1026640cp4.LIZIZ(X.0cp3, X.05Vn):java.lang.Object");
    }
}
