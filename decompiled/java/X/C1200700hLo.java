package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimFragmentAbility;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimMapAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0hLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.claim.view.PoiClaimMapAssem$initObserver$4$1", f = "PoiClaimMapAssem.kt", l = {172}, m = "invokeSuspend")
public final class C1200700hLo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PoiClaimMapAssem LL;
    public PoiData LLILLJJLI;
    public PoiData LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ PoiData LLILZLL;
    public final /* synthetic */ PoiClaimMapAssem LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200700hLo(PoiData poiData, PoiClaimMapAssem poiClaimMapAssem, InterfaceC1364105Vn<? super C1200700hLo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = poiData;
        this.LLIZ = poiClaimMapAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1200700hLo c1200700hLo = new C1200700hLo(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1200700hLo.LLILZIL = obj;
        return c1200700hLo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        PoiData poiData;
        PoiClaimMapAssem poiClaimMapAssem;
        int iHashCode;
        PoiData poiData2;
        IPoiClaimFragmentAbility iPoiClaimFragmentAbility;
        View viewRJ1;
        C0GUL c0gul;
        int iHashCode2;
        Unit unit;
        View viewRJ12;
        C0GUL c0gul2;
        C1C7U.LIZ("PoiClaimMapAssem@161b.initObserver$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                poiData2 = this.LLILLL;
                poiData = this.LLILLJJLI;
                poiClaimMapAssem = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILZIL;
            poiData = this.LLILZLL;
            if (poiData != null) {
                poiClaimMapAssem = this.LLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("this.googleMap=");
                sbLIZ.append(poiClaimMapAssem.LLJ);
                sbLIZ.append(", hash=");
                InterfaceC1177250gjz interfaceC1177250gjz = poiClaimMapAssem.LLJ;
                if (interfaceC1177250gjz != null) {
                    iHashCode = interfaceC1177250gjz.hashCode();
                } else {
                    iHashCode = 0;
                }
                sbLIZ.append(iHashCode);
                C2188811AlT.LIZIZ(sbLIZ);
                C099F c099f = poiClaimMapAssem.LLJIJIL;
                this.LLILZIL = obj2;
                this.LL = poiClaimMapAssem;
                this.LLILLJJLI = poiData;
                this.LLILLL = poiData;
                this.LLILZ = 1;
                obj = c099f.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PoiClaimMapAssem@161b.initObserver$4$1");
                    return objLJFF;
                }
                poiData2 = poiData;
            }
            PoiClaimMapAssem poiClaimMapAssem2 = this.LLIZ;
            iPoiClaimFragmentAbility = (IPoiClaimFragmentAbility) poiClaimMapAssem2.LLJJ.getValue();
            if (iPoiClaimFragmentAbility != null && (viewRJ1 = iPoiClaimFragmentAbility.RJ1()) != null && (c0gul = poiClaimMapAssem2.LLJI) != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0gul, viewRJ1);
                c0gul.removeView(viewRJ1);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PoiClaimMapAssem@161b.initObserver$4$1");
            return unit2;
        }
        InterfaceC1177250gjz interfaceC1177250gjz2 = (InterfaceC1177250gjz) obj;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("googleMap=");
        sbLIZ2.append(interfaceC1177250gjz2);
        sbLIZ2.append(", hash=");
        sbLIZ2.append(interfaceC1177250gjz2.hashCode());
        sbLIZ2.append(" ===this.googleMap=");
        sbLIZ2.append(poiClaimMapAssem.LLJ);
        sbLIZ2.append(", hash=");
        InterfaceC1177250gjz interfaceC1177250gjz3 = poiClaimMapAssem.LLJ;
        if (interfaceC1177250gjz3 != null) {
            iHashCode2 = interfaceC1177250gjz3.hashCode();
        } else {
            iHashCode2 = 0;
        }
        sbLIZ2.append(iHashCode2);
        C2188811AlT.LIZIZ(sbLIZ2);
        IPoiClaimFragmentAbility iPoiClaimFragmentAbility2 = (IPoiClaimFragmentAbility) poiClaimMapAssem.LLJJ.getValue();
        if (iPoiClaimFragmentAbility2 != null && (viewRJ12 = iPoiClaimFragmentAbility2.RJ1()) != null && (c0gul2 = poiClaimMapAssem.LLJI) != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0gul2, viewRJ12);
            c0gul2.removeView(viewRJ12);
        }
        C1177960gl8 c1177960gl8 = new C1177960gl8(poiData2.latitude, poiData2.longitude);
        if (poiClaimMapAssem.LLJILJILJ && Intrinsics.LJFF(poiData.poiId, poiClaimMapAssem.LLJILLL)) {
            poiClaimMapAssem.LLJILJILJ = false;
            interfaceC1177250gjz2.LIZIZ(c1177960gl8, C2286608xc.LIZLLL(15.0f), null);
            poiClaimMapAssem.Go(poiData2);
            unit = Unit.LIZ;
        } else {
            C1178480gly c1178480gly = new C1178480gly();
            c1178480gly.LIZ = true;
            c1178480gly.LIZIZ = C2286608xc.LJFF(300L);
            c1178480gly.LIZJ = new AwS419S0200000_18(poiClaimMapAssem, poiData2, 138);
            c1178480gly.LIZLLL = new AwS562S0100000_18(poiData, 2579);
            c1178480gly.LJ = true;
            interfaceC1177250gjz2.LIZIZ(c1177960gl8, C2286608xc.LIZLLL(15.0f), c1178480gly);
            unit = Unit.LIZ;
        }
        if (unit == null) {
            PoiClaimMapAssem poiClaimMapAssem22 = this.LLIZ;
            iPoiClaimFragmentAbility = (IPoiClaimFragmentAbility) poiClaimMapAssem22.LLJJ.getValue();
            if (iPoiClaimFragmentAbility != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0gul, viewRJ1);
                c0gul.removeView(viewRJ1);
            }
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("PoiClaimMapAssem@161b.initObserver$4$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
