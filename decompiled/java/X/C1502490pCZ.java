package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.SeaPdpCommunicationService;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.SeaPdpCommunicationService$registerAction$1", f = "SeaPdpCommunicationService.kt", l = {68}, m = "invokeSuspend")
public final class C1502490pCZ extends C09AX implements InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SeaPdpCommunicationService LLILZ;
    public final /* synthetic */ Function0<InterfaceC1502430pCT> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1502490pCZ(SeaPdpCommunicationService seaPdpCommunicationService, Function0<? extends InterfaceC1502430pCT> function0, InterfaceC1364105Vn<? super C1502490pCZ> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = seaPdpCommunicationService;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, ? extends Object> map;
        Object obj2;
        C1757320vpa c1757320vpa;
        Object c1470005pC;
        C1C7U.LIZ("SeaPdpCommunicationService@dc30.registerAction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                map = (Map) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Map<String, ? extends Object> map2 = (Map) this.LLILLJJLI;
            map = (Map) this.LLILLL;
            if (map != null) {
                obj2 = map.get("__sea_pdp_communication_context");
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof C1757320vpa) || (c1757320vpa = (C1757320vpa) obj2) == null) {
                c1757320vpa = new C1757320vpa(null);
            }
            c1757320vpa.LIZLLL = new WeakReference<>(this.LLILZ);
            InterfaceC1502430pCT interfaceC1502430pCTInvoke = this.LLILZIL.invoke();
            this.LLILLJJLI = map;
            this.LL = 1;
            obj = interfaceC1502430pCTInvoke.LIZ(map2, map, c1757320vpa, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SeaPdpCommunicationService@dc30.registerAction$1");
                return objLJFF;
            }
        }
        C1502470pCX c1502470pCX = (C1502470pCX) obj;
        EnumC1502480pCY enumC1502480pCY = c1502470pCX.LIZ;
        if (enumC1502480pCY == EnumC1502480pCY.SUCCESS) {
            c1470005pC = new C1470305pF((Map<String, ? extends Object>) c1502470pCX.LIZJ, map);
        } else {
            int value = enumC1502480pCY.getValue();
            String str = c1502470pCX.LIZIZ;
            if (str == null) {
                str = "";
            }
            c1470005pC = new C1470005pC(value, str, c1502470pCX.LIZJ);
        }
        C1C7U.LIZIZ("SeaPdpCommunicationService@dc30.registerAction$1");
        return c1470005pC;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super AbstractC1470205pE> interfaceC1364105Vn) {
        C1502490pCZ c1502490pCZ = new C1502490pCZ(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1502490pCZ.LLILLJJLI = map;
        c1502490pCZ.LLILLL = map2;
        return c1502490pCZ.invokeSuspend(Unit.LIZ);
    }
}
