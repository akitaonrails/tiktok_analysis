package X;

import Y.AfS187S0100000_18;
import Y.AfS3S1200100_18;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.nearby.container.repo.INearbyApi;
import com.ss.android.ugc.nearby.container.repo.NearbyApi;
import com.ss.android.ugc.nearby.settings.NearbyChunkOptExperiment;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS562S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.repo.NearbyRepository$operator$1$fetchNearbyDataChunk$1", f = "NearbyRepository.kt", l = {352}, m = "invokeSuspend")
public final class C1203780hQm extends C09AX implements Function2<C094D<? super AbstractC1203920hR0>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ C1203960hR4 LLILZ;
    public final /* synthetic */ LocationRegion LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1203780hQm(Integer num, C1203960hR4 c1203960hR4, LocationRegion locationRegion, String str, InterfaceC1364105Vn<? super C1203780hQm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = num;
        this.LLILZ = c1203960hR4;
        this.LLILZIL = locationRegion;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1203780hQm c1203780hQm = new C1203780hQm(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1203780hQm.LLILLJJLI = obj;
        return c1203780hQm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        C1C7U.LIZ("NearbyRepository@94f4.operator$1$fetchNearbyDataChunk$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C094D c094d = (C094D) this.LLILLJJLI;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchNearbyDataChunk startTs=");
            sbLIZ.append(jElapsedRealtime);
            sbLIZ.append(", page=0, count=");
            sbLIZ.append(this.LLILLL);
            C2188811AlT.LIZIZ(sbLIZ);
            if (ComplianceServiceProvider.LJI().LJIIJ(false)) {
                bool = (Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue();
            } else {
                bool = null;
            }
            C01GW c01gw = NearbyChunkOptExperiment.LIZIZ;
            INearbyApi.ChunkParams chunkParams = new INearbyApi.ChunkParams(C2286608xc.LJ(((NearbyChunkOptExperiment.NearbyChunkOptConfig) c01gw.getValue()).firstChunkCount), C2286608xc.LJ(((NearbyChunkOptExperiment.NearbyChunkOptConfig) c01gw.getValue()).secondChunkCount), C2286608xc.LJ(((NearbyChunkOptExperiment.NearbyChunkOptConfig) c01gw.getValue()).thirdChunkCount));
            C1203960hR4 c1203960hR4 = this.LLILZ;
            if (c1203960hR4 != null) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                c1203960hR4.LJ = jElapsedRealtime2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setStartNetTs: ");
                sbLIZ2.append(jElapsedRealtime2);
                C2188811AlT.LIZIZ(sbLIZ2);
                c1203960hR4.LJIIL = 1;
            }
            NearbyApi nearbyApi = NearbyApi.LIZIZ;
            LocationRegion locationRegion = this.LLILZIL;
            Integer numLJ = C2286608xc.LJ(0);
            Integer num = this.LLILLL;
            C20019113Un.LIZ.getClass();
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((C11JF) nearbyApi.fetchNearbyDataChunk(new INearbyApi.NearbyRequestBodyForChunk(locationRegion, numLJ, num, bool, C20019113Un.LIZ(), chunkParams), null).LJL(C11S5.LIZ()).LJJLL(new AfS3S1200100_18(c094d, this.LLILZLL, jElapsedRealtime, this.LLILZ, 0), new AfS187S0100000_18(c094d, 47)), 2355);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS562S0100000_18, this) == objLJFF) {
                C1C7U.LIZIZ("NearbyRepository@94f4.operator$1$fetchNearbyDataChunk$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NearbyRepository@94f4.operator$1$fetchNearbyDataChunk$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super AbstractC1203920hR0> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
