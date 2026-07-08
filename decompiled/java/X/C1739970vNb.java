package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.ug.prefetch.api.NativePrefetchApi;
import com.ss.android.ugc.aweme.ecommerce.ug.prefetch.bean.NativePrefetchResponse;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.prefetch.manager.NativePrefetchNetworkManager$prefetchRequest$response$1", f = "NativePrefetchNetworkManager.kt", l = {26, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1739970vNb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<NativePrefetchResponse<Map<String, ?>>>>, Object> {
    public int LL;
    public final /* synthetic */ C1739980vNc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739970vNb(C1739980vNc c1739980vNc, InterfaceC1364105Vn<? super C1739970vNb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1739980vNc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739970vNb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NativePrefetchNetworkManager@869.prefetchRequest$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (Intrinsics.LJFF(this.LLILLJJLI.LIZIZ.toUpperCase(Locale.ROOT), "GET")) {
                NativePrefetchApi.LIZ.getClass();
                NativePrefetchApi value = C1740000vNe.LIZIZ.getValue();
                C1739980vNc c1739980vNc = this.LLILLJJLI;
                String str = c1739980vNc.LIZ;
                Map<String, String> mapLJ = c1739980vNc.LIZLLL;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                Map<String, String> mapLJ2 = this.LLILLJJLI.LIZJ;
                if (mapLJ2 == null) {
                    mapLJ2 = C2097608Jq.LJ();
                }
                n nVar = this.LLILLJJLI.LJ;
                if (nVar == null) {
                    nVar = new n();
                }
                this.LL = 1;
                obj = value.prefetchForGet(str, mapLJ, mapLJ2, nVar, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("NativePrefetchNetworkManager@869.prefetchRequest$response$1");
                    return objLJFF;
                }
            } else {
                NativePrefetchApi.LIZ.getClass();
                NativePrefetchApi value2 = C1740000vNe.LIZIZ.getValue();
                C1739980vNc c1739980vNc2 = this.LLILLJJLI;
                String str2 = c1739980vNc2.LIZ;
                Map<String, String> mapLJ3 = c1739980vNc2.LIZLLL;
                if (mapLJ3 == null) {
                    mapLJ3 = C2097608Jq.LJ();
                }
                Map<String, String> mapLJ4 = this.LLILLJJLI.LIZJ;
                if (mapLJ4 == null) {
                    mapLJ4 = C2097608Jq.LJ();
                }
                n nVar2 = this.LLILLJJLI.LJ;
                if (nVar2 == null) {
                    nVar2 = new n();
                }
                this.LL = 2;
                obj = value2.prefetchForPost(str2, mapLJ3, mapLJ4, nVar2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("NativePrefetchNetworkManager@869.prefetchRequest$response$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("NativePrefetchNetworkManager@869.prefetchRequest$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<NativePrefetchResponse<Map<String, ?>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
