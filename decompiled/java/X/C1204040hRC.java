package X;

import android.os.SystemClock;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hRC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel$initLoad$1", f = "NearbyContainerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1204040hRC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NearbyContainerViewModel LL;
    public final /* synthetic */ C1203960hR4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204040hRC(NearbyContainerViewModel nearbyContainerViewModel, C1203960hR4 c1203960hR4, InterfaceC1364105Vn<? super C1204040hRC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nearbyContainerViewModel;
        this.LLILLJJLI = c1203960hR4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1204040hRC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        NearbyRevampResponse nearbyRevampResponseLJ;
        int i;
        EnumC1204410hRn enumC1204410hRn;
        C1C7U.LIZ("NearbyContainerViewModel@5125.initLoad$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(AFwS256S0000000_18.get$arr$(959));
        C1203960hR4 c1203960hR4 = this.LLILLJJLI;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c1203960hR4.LIZJ = jElapsedRealtime;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStartReadCacheTs: ");
        sbLIZ.append(jElapsedRealtime);
        C2188811AlT.LIZIZ(sbLIZ);
        C1203930hR1 c1203930hR1 = C1203930hR1.LIZ;
        RoamingLocationInfo roamingLocationInfo = this.LL.LLILLJJLI;
        if (roamingLocationInfo != null) {
            str = roamingLocationInfo.manualRegion;
        } else {
            str = null;
        }
        c1203930hR1.getClass();
        if (C1203930hR1.LJIILIIL(str) && (nearbyRevampResponseLJ = C1203930hR1.LJ()) != null) {
            C1203960hR4 c1203960hR42 = this.LLILLJJLI;
            NearbyContainerViewModel nearbyContainerViewModel = this.LL;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("init use cache data, cacheTime=");
            sbLIZ2.append(nearbyRevampResponseLJ.cacheSaveTime);
            sbLIZ2.append(", hasBeenConsumed=");
            sbLIZ2.append(nearbyRevampResponseLJ.cacheHasBeenConsumed);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1203960hR42.LIZLLL = jElapsedRealtime2;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setEndReadCacheTs: ");
            sbLIZ3.append(jElapsedRealtime2);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (C1203930hR1.LJIIL()) {
                i = 2;
            } else {
                i = 1;
            }
            c1203960hR42.LJIIIZ = i;
            if (C1203930hR1.LJIIL()) {
                enumC1204410hRn = EnumC1204410hRn.PRELOAD;
            } else {
                enumC1204410hRn = EnumC1204410hRn.CACHE;
            }
            c1203960hR42.LJIIJJI = enumC1204410hRn;
            nearbyContainerViewModel.setState(new AwS384S0200000_18(nearbyRevampResponseLJ, c1203960hR42, 248));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("NearbyContainerViewModel@5125.initLoad$1");
            return unit;
        }
        C1203960hR4 c1203960hR43 = this.LLILLJJLI;
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        c1203960hR43.LIZLLL = jElapsedRealtime3;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("setEndReadCacheTs: ");
        sbLIZ4.append(jElapsedRealtime3);
        C2188811AlT.LIZIZ(sbLIZ4);
        this.LL.DQ2(this.LLILLJJLI);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NearbyContainerViewModel@5125.initLoad$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
