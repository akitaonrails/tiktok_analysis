package X;

import androidx.fragment.app.Fragment;
import com.bytedance.i18n.location.api.LocationClient;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData$fetchLocationOnResume$3", f = "SearchPOIBpeaCert.kt", l = {}, m = "invokeSuspend")
public final class C687790QyP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ Fragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C687790QyP(C19EG c19eg, Fragment fragment, InterfaceC1364105Vn<? super C687790QyP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C687790QyP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0QyR, X.0QyS] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLocationCacheData@bee9.fetchLocationOnResume$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C645500PTo.LIZ();
        SearchLocationCacheData searchLocationCacheData = SearchLocationCacheData.LIZ;
        C19EG c19eg = this.LL;
        searchLocationCacheData.getClass();
        if (SearchLocationCacheData.LJ(c19eg)) {
            final C19EG c19eg2 = this.LL;
            final Fragment fragment = this.LLILLJJLI;
            final ?? r12 = new InterfaceC687820QyS(fragment) { // from class: X.0QyR
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    C19EG c19eg3 = this.LIZ;
                    LocationClient locationClient = C1798550wu5.LIZIZ;
                    int iLJIJI = locationClient.LJIJI(c19eg3);
                    int iLJIIJJI = locationClient.LJIIJJI();
                    SearchLocationCacheData.LIZ.getClass();
                    SearchLocationCacheData.LJFF(locationData, iLJIJI, iLJIIJJI);
                    C645500PTo.LIZ();
                    SearchLocationCacheData.LJFF = 0;
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i, String str) {
                    SearchLocationCacheData.LIZ.getClass();
                    SearchLocationCacheData.LJFF(null, 0, 0);
                    C645500PTo.LIZ();
                    SearchLocationCacheData.LJFF = i;
                }
            };
            if (((Number) C1829207Ek.LIZ.getValue()).longValue() > 0) {
                C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                C688040Qyo.LIZ.getClass();
                c1207450hWh.LJIIL("search", "poi_biz", C688040Qyo.LIZLLL, C688040Qyo.LIZIZ, new InterfaceC687820QyS() { // from class: X.0QyQ
                    @Override // X.InterfaceC687820QyS
                    public final void LIZ(LocationData locationData) {
                        long jCurrentTimeMillis = 0;
                        if (locationData.timestamp > 0) {
                            jCurrentTimeMillis = System.currentTimeMillis() - locationData.timestamp;
                        }
                        if (((Number) C1829207Ek.LIZ.getValue()).longValue() < jCurrentTimeMillis) {
                            C1207450hWh c1207450hWh2 = C1207450hWh.LIZ;
                            C688040Qyo.LIZ.getClass();
                            c1207450hWh2.LJIIL("search", "poi_biz", C688040Qyo.LIZJ, C688040Qyo.LIZIZ, r12, -1L);
                        }
                        r12.LIZ(locationData);
                    }

                    @Override // X.InterfaceC687820QyS
                    public final void onError(int i, String str) {
                        r12.onError(i, str);
                    }
                }, -1L);
            } else {
                C1207450hWh c1207450hWh2 = C1207450hWh.LIZ;
                C688040Qyo.LIZ.getClass();
                c1207450hWh2.LJIIL("search", "poi_biz", C688040Qyo.LIZLLL, C688040Qyo.LIZIZ, r12, -1L);
            }
        } else {
            SearchLocationCacheData.LJFF(null, 0, 0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchLocationCacheData@bee9.fetchLocationOnResume$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
