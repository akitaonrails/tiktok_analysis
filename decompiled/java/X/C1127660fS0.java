package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127660fS0 implements InterfaceC1124700fNE {
    public final C01GW LIZ;
    public Pair<? extends InterfaceC1127800fSE, ? extends View> LIZIZ;

    public final InterfaceC1127910fSP LIZJ() {
        return (InterfaceC1127910fSP) this.LIZ.getValue();
    }

    public final InterfaceC1127800fSE LIZLLL() {
        Pair<? extends InterfaceC1127800fSE, ? extends View> pair = this.LIZIZ;
        if (pair != null) {
            return pair.getFirst();
        }
        return null;
    }

    public final void LJ() {
        View second;
        Iterator<InterfaceC1127800fSE> it2 = LIZJ().LIZIZ().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ();
        }
        Pair<? extends InterfaceC1127800fSE, ? extends View> pair = this.LIZIZ;
        if (pair != null && (second = pair.getSecond()) != null) {
            C786410Ut5.LJLLLLLL(8, second);
        }
        this.LIZIZ = null;
    }

    public C1127660fS0(AwS146S0400000_17 awS146S0400000_17) {
        this.LIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS561S0100000_17(awS146S0400000_17, 507));
    }

    @Override // X.InterfaceC1124700fNE
    public final void LIZ(C1124680fNC c1124680fNC) {
        InterfaceC1127800fSE next;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Iterator<InterfaceC1127800fSE> it2 = LIZJ().LIZJ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LJFF(c1124680fNC)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1127800fSE interfaceC1127800fSE = next;
        if (interfaceC1127800fSE == null) {
            return;
        }
        View viewLJI = interfaceC1127800fSE.LJI(c1124680fNC, this, null);
        if (viewLJI == null) {
            LIZIZ(c1124680fNC);
        } else {
            LJII(interfaceC1127800fSE, viewLJI, c1124680fNC);
        }
        LJI(c1124680fNC, ((Number) new Pair(Unit.LIZ, Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis)).getSecond()).longValue());
    }

    @Override // X.InterfaceC1124700fNE
    public final void LIZIZ(C1124680fNC c1124680fNC) {
        InterfaceC1127800fSE next;
        Iterator<InterfaceC1127800fSE> it2 = LIZJ().LIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LJFF(c1124680fNC)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1127800fSE interfaceC1127800fSE = next;
        if (interfaceC1127800fSE == null) {
            return;
        }
        View viewLJI = interfaceC1127800fSE.LJI(c1124680fNC, this, null);
        if (viewLJI != null) {
            LJII(interfaceC1127800fSE, viewLJI, c1124680fNC);
        } else {
            C20441214yg.LJ("GiftPanelTopBannerCoordinator", "Failed to find default banner to show");
        }
    }

    public final void LJFF(AwS561S0100000_17 awS561S0100000_17) {
        Iterator<InterfaceC1127800fSE> it2 = LIZJ().LIZIZ().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ();
        }
        if (((Boolean) C1127850fSJ.LIZIZ.getValue()).booleanValue()) {
            List<InterfaceC1127800fSE> listLIZIZ = LIZJ().LIZIZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator<InterfaceC1127800fSE> it3 = listLIZIZ.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().getBannerType().name());
            }
            Map<String, String> map = C1127850fSJ.LIZ;
            map.put("top_banner_list", arrayList.toString());
            InterfaceC1100860ekm interfaceC1100860ekmSg = ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Sg();
            if (interfaceC1100860ekmSg != null) {
                ((C1133970fcB) interfaceC1100860ekmSg).LIZ(map);
            }
        }
    }

    public final void LJI(C1124680fNC c1124680fNC, long j) {
        String strName;
        InterfaceC1127800fSE first;
        EnumC1127500fRk bannerType;
        Pair<? extends InterfaceC1127800fSE, ? extends View> pair = this.LIZIZ;
        if (pair == null || (first = pair.getFirst()) == null || (bannerType = first.getBannerType()) == null || (strName = bannerType.name()) == null) {
            strName = "";
        }
        C1131070fXV.LJIIL(j, strName, c1124680fNC.LJIIIZ.name(), "v2");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[PHI: r4
      0x0074: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:28:0x0072, B:26:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.InterfaceC1127800fSE r7, android.view.View r8, X.C1124680fNC r9) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1127660fS0.LJII(X.0fSE, android.view.View, X.0fNC):void");
    }
}
