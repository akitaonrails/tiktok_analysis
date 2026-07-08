package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0Ogq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.feedcard.OfflineModeLowNetRecorder$recordLowSpeedDay$1", f = "OfflineModeLowNetRecorder.kt", l = {}, m = "invokeSuspend")
public final class C625940Ogq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C607310Nrt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625940Ogq(C607310Nrt c607310Nrt, InterfaceC1364105Vn<? super C625940Ogq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c607310Nrt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C625940Ogq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Integer numLJIIJJI;
        int iIntValue;
        C625960Ogs c625960Ogs;
        C1C7U.LIZ("OfflineModeLowNetRecorder@70d2.recordLowSpeedDay$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
        boolean z2 = true;
        if (effectiveConnectionType <= ((Number) C261750ANp.LIZ.getValue()).intValue() && effectiveConnectionType != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZJ = C036E.LIZ.LIZJ();
        if (((Boolean) C0BMD.LIZ.getValue()).booleanValue() && C625950Ogr.LIZ != null) {
            if (this.LL.LIZLLL == null || (c625960Ogs = this.LL.LIZLLL) == null || c625960Ogs.LIZ != ((int) (System.currentTimeMillis() / ((long) 86400000)))) {
                C607310Nrt c607310Nrt = this.LL;
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 86400000));
                c607310Nrt.LIZLLL = new C625960Ogs(iCurrentTimeMillis, C625720OgU.LIZIZ().getInt(C625950Ogr.LIZIZ(iCurrentTimeMillis, "day_low_net_request_count_"), 0), C625720OgU.LIZIZ().getInt(C625950Ogr.LIZIZ(iCurrentTimeMillis, "day_low_net_low_net_request_count_"), 0), C625720OgU.LIZIZ().getInt(C625950Ogr.LIZIZ(iCurrentTimeMillis, "day_low_net_wifi_request_count_"), 0));
            }
            C625960Ogs c625960Ogs2 = this.LL.LIZLLL;
            if (c625960Ogs2 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("OfflineModeLowNetRecorder@70d2.recordLowSpeedDay$1");
                return unit;
            }
            c625960Ogs2.LIZIZ++;
            if (z) {
                c625960Ogs2.LIZJ++;
            }
            if (zLIZJ) {
                c625960Ogs2.LIZLLL++;
            }
            int i = c625960Ogs2.LIZ;
            synchronized (C625950Ogr.LIZIZ) {
                try {
                    C625720OgU.LIZIZ().LIZJ(C625950Ogr.LIZIZ(i, "day_low_net_request_count_"), c625960Ogs2.LIZIZ);
                    C625720OgU.LIZIZ().LIZJ(C625950Ogr.LIZIZ(i, "day_low_net_wifi_request_count_"), c625960Ogs2.LIZLLL);
                    C625720OgU.LIZIZ().LIZJ(C625950Ogr.LIZIZ(i, "day_low_net_low_net_request_count_"), c625960Ogs2.LIZJ);
                    C625950Ogr.LIZLLL();
                    if (!C625950Ogr.LIZJ) {
                        C625950Ogr.LIZJ = true;
                    } else {
                        z2 = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z2) {
                Set setLJJIIJ = C09RB.LJJIIJ(C09RB.LJIJI(new C1939607ik(C625950Ogr.LIZ()), AFwS229S0000000_2.get$arr$(628)));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str : C625720OgU.LIZIZ().getAll().keySet()) {
                    if (u.LJJIIJZLJL(str, "day_low_net_request_count_", false)) {
                        numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJJJJZ("day_low_net_request_count_", str));
                    } else if (u.LJJIIJZLJL(str, "day_low_net_wifi_request_count_", false)) {
                        numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJJJJZ("day_low_net_wifi_request_count_", str));
                    } else if (u.LJJIIJZLJL(str, "day_low_net_low_net_request_count_", false)) {
                        numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJJJJZ("day_low_net_low_net_request_count_", str));
                    }
                    if (numLJIIJJI != null && (iIntValue = numLJIIJJI.intValue()) != i && !setLJJIIJ.contains(Integer.valueOf(iIntValue))) {
                        linkedHashSet.add(Integer.valueOf(iIntValue));
                    }
                }
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = ((Number) it2.next()).intValue();
                    C625720OgU.LIZIZ().LIZ(C625950Ogr.LIZIZ(iIntValue2, "day_low_net_request_count_"));
                    C625720OgU.LIZIZ().LIZ(C625950Ogr.LIZIZ(iIntValue2, "day_low_net_wifi_request_count_"));
                    C625720OgU.LIZIZ().LIZ(C625950Ogr.LIZIZ(iIntValue2, "day_low_net_low_net_request_count_"));
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("OfflineModeLowNetRecorder@70d2.recordLowSpeedDay$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeLowNetRecorder@70d2.recordLowSpeedDay$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
