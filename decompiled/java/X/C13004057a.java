package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.057a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailPreloadManager$triggerPreloadWhenAnchorShow$1$5$isProductVisible$1", f = "PoiDetailPreloadManager.kt", l = {196}, m = "invokeSuspend")
public final class C13004057a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13004057a(String str, InterfaceC1364105Vn<? super C13004057a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13004057a(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorShow$1$5$isProductVisible$1");
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
            C1188750h2X c1188750h2X = C1188750h2X.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c1188750h2X.getClass();
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Type type = new TypeToken<Map<String, String>>() { // from class: X.04ZI
                }.getType();
                c1227904rF.getClass();
                c098200Yq = (Map) C1227904rF.LIZJ(str, type);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj2 = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Map map = (Map) c098200Yq;
            if (map != null) {
                obj2 = map.get("is_product_visible");
            }
            obj = Boolean.valueOf(Intrinsics.LJFF(obj2, "1"));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorShow$1$5$isProductVisible$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PoiDetailPreloadManager@18f9.triggerPreloadWhenAnchorShow$1$5$isProductVisible$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
