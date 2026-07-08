package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.next.standardized.template.common.action.FcpStandardActionInterpreter$taskDecode$task$task$1$execute$1", f = "FcpStandardActionInterpreter.kt", l = {119}, m = "invokeSuspend")
public final class C1386905bn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1387005bo LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object> LLILZ;
    public final /* synthetic */ VideoItemParams LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1386905bn(C1387005bo c1387005bo, InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object> interfaceC1631620sYq, VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C1386905bn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1387005bo;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = videoItemParams;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1386905bn c1386905bn = new C1386905bn(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1386905bn.LLILLJJLI = obj;
        return c1386905bn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpStandardActionInterpreter@1070.taskDecode$task$task$1$execute$1");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, C0PEM.LIZ, null, new C1386805bm(this.LLILZ, this.LLILZIL, this.LLILZLL, null), 2);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FcpStandardActionInterpreter@1070.taskDecode$task$task$1$execute$1");
                return objLJFF;
            }
        }
        AbstractC1387105bp abstractC1387105bp = (AbstractC1387105bp) obj;
        if (abstractC1387105bp instanceof C1387205bq) {
            LJ(abstractC1387105bp.LIZ);
        } else if (abstractC1387105bp instanceof C1387305br) {
            onStop();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpStandardActionInterpreter@1070.taskDecode$task$task$1$execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
