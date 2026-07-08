package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2249871D4f extends AbstractC707180Roa implements InterfaceC2249881D4g {
    public final C2249861D4e LLILZ;

    public abstract InterfaceC2249881D4g getAnchorBusiness();

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
        C2249861D4e c2249861D4e = this.LLILZ;
        if (c2249861D4e.LJFF) {
            c2249861D4e.LIZIZ.LJJI(c2249861D4e);
            IEventCenter iEventCenter = c2249861D4e.LJII;
            if (iEventCenter != null) {
                iEventCenter.LIZJ("ec_page_quit", c2249861D4e.LJIIIIZZ);
            }
            c2249861D4e.LJII = null;
            c2249861D4e.LJFF = false;
        }
        c2249861D4e.LJ = false;
        c2249861D4e.LIZLLL = false;
        c2249861D4e.LJI = false;
        getAnchorBusiness().LIZ();
    }

    @Override // X.AbstractC707180Roa
    public final void LJIIIZ() {
        getAnchorBusiness().LJIIIZ();
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC2249881D4g
    public final boolean LJIIJJI() {
        return getAnchorBusiness().LJIIJJI();
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC1392510mLB
    public C1400390mXt getAnchorMobConfiguration() {
        return getAnchorBusiness().getAnchorMobConfiguration();
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC2249881D4g
    public HashMap<String, String> getShowContentInfo() {
        return getAnchorBusiness().getShowContentInfo();
    }

    public AbstractC2249871D4f(Context context) {
        super(context);
        this.LLILZ = new C2249861D4e(0);
    }

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        C2249861D4e c2249861D4e = this.LLILZ;
        c2249861D4e.getClass();
        C2249561D3a c2249561D3a = C2249561D3a.LIZ;
        boolean z = c2249861D4e.LJI;
        c2249561D3a.getClass();
        if (C2249561D3a.LIZIZ(z) && !c2249861D4e.LJFF) {
            c2249861D4e.LIZIZ.LJIJJ(c2249861D4e);
            IEventCenter iEventCenterInvoke = c2249861D4e.LIZ.invoke();
            c2249861D4e.LJII = iEventCenterInvoke;
            if (iEventCenterInvoke != null) {
                iEventCenterInvoke.LIZLLL("ec_page_quit", c2249861D4e.LJIIIIZZ);
            }
            c2249861D4e.LJFF = true;
        }
        getAnchorBusiness().LIZJ(c2344009Gk);
        return true;
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC2249881D4g
    public final void LJI(int i) {
        getAnchorBusiness().LJI(i);
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC2249881D4g
    public final String LJIIJ(C2344009Gk c2344009Gk) {
        return getAnchorBusiness().LJIIJ(c2344009Gk);
    }

    @Override // X.AbstractC707180Roa
    public final void LJIIL(double d) {
        this.LLILLJJLI = d;
        getAnchorBusiness().LJIIL(d);
    }

    @Override // X.InterfaceC713230RyL
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        getAnchorBusiness().LJ(c2344009Gk, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.InterfaceC713230RyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4, X.InterfaceC1392640mLO r5, int r6, kotlin.jvm.functions.Function0 r7) {
        /*
            r3 = this;
            X.1D4g r0 = r3.getAnchorBusiness()
            r0.LJIIIIZZ(r4, r5, r6, r7)
            X.1D4e r2 = r3.LLILZ
            r2.getClass()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LJJLIIIJJIZ()
            if (r0 == 0) goto L1c
            boolean r1 = r0.isAd()
            r0 = 1
            if (r1 != r0) goto L1c
        L19:
            r2.LJI = r0
            return
        L1c:
            r0 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2249871D4f.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, X.0mLO, int, kotlin.jvm.functions.Function0):void");
    }
}
