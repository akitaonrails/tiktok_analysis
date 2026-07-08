package X;

import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMVoicePreloader$addResources$1", f = "IMVoicePreloader.kt", l = {81}, m = "invokeSuspend")
public final class C901620ZYq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<InterfaceC1329505If> LLILLJJLI;
    public final /* synthetic */ C901600ZYo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C901620ZYq(List<? extends InterfaceC1329505If> list, C901600ZYo c901600ZYo, InterfaceC1364105Vn<? super C901620ZYq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c901600ZYo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C901620ZYq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869590Y9l c869590Y9l;
        C1C7U.LIZ("IMVoicePreloader@97ac.addResources$1");
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
            List<InterfaceC1329505If> list = this.LLILLJJLI;
            C901600ZYo c901600ZYo = this.LLILLL;
            for (InterfaceC1329505If interfaceC1329505If : list) {
                c901600ZYo.getClass();
                Map<String, Object> mapLJJIFFI = interfaceC1329505If.LJJIFFI();
                Object obj2 = null;
                if (mapLJJIFFI != null) {
                    obj2 = mapLJJIFFI.get("MESSAGE");
                }
                if ((obj2 instanceof C869590Y9l) && (c869590Y9l = (C869590Y9l) obj2) != null && c869590Y9l.getMsgType() == 1813) {
                    String resourceId = interfaceC1329505If.getResourceId();
                    IMVoiceMessageUtil.LIZ.getClass();
                    C901670ZYv c901670ZYv = new C901670ZYv(c869590Y9l, resourceId, IMVoiceMessageUtil.LIZIZ(c869590Y9l), C901600ZYo.LJFF(c869590Y9l));
                    if (!c901600ZYo.LIZJ.containsKey(c901670ZYv.LIZ)) {
                        c901600ZYo.LIZIZ.push(c901670ZYv);
                    }
                }
            }
            C901600ZYo c901600ZYo2 = this.LLILLL;
            this.LL = 1;
            if (c901600ZYo2.LJIIIZ(this) == objLJFF) {
                C1C7U.LIZIZ("IMVoicePreloader@97ac.addResources$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMVoicePreloader@97ac.addResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
