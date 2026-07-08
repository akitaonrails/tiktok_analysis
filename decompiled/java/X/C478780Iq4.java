package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendAckReq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem$recommendAck$1", f = "HangoutInteractModuleV2Assem.kt", l = {759}, m = "invokeSuspend")
public final class C478780Iq4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<Long> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478780Iq4(String str, List<Long> list, InterfaceC1364105Vn<? super C478780Iq4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C478780Iq4 c478780Iq4 = new C478780Iq4(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c478780Iq4.LLILLJJLI = obj;
        return c478780Iq4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJIIJJI;
        Object c098200Yq;
        C1C7U.LIZ("HangoutInteractModuleV2Assem@14fa.recommendAck$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                strLJIIJJI = (String) this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C477500Io0 c477500Io0 = C477500Io0.LIZ;
            String str = this.LLILLL;
            if (str == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("HangoutInteractModuleV2Assem@14fa.recommendAck$1");
                return unit;
            }
            c477500Io0.getClass();
            strLJIIJJI = C477500Io0.LJIIJJI(str);
            List<Long> list = this.LLILZ;
            try {
                RecommendAckReq recommendAckReq = new RecommendAckReq();
                recommendAckReq.reqFrom = strLJIIJJI;
                recommendAckReq.genTime = System.currentTimeMillis();
                recommendAckReq.idList = list;
                this.LLILLJJLI = strLJIIJJI;
                this.LL = 1;
                obj = C478550Iph.LIZJ(recommendAckReq, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("HangoutInteractModuleV2Assem@14fa.recommendAck$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = (C470590Icr) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        List<Long> list2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recommendAck success, roomIdList=");
            sbLIZ.append(list2);
            sbLIZ.append(", reqFrom=");
            sbLIZ.append(strLJIIJJI);
            C20441214yg.LIZIZ("InteractModuleV2Assem", C2188811AlT.LIZIZ(sbLIZ));
        }
        List<Long> list3 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("recommendAck error, roomIdList=");
            sbLIZ2.append(list3);
            sbLIZ2.append(", reqFrom=");
            sbLIZ2.append(strLJIIJJI);
            C20441214yg.LJFF("InteractModuleV2Assem", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
            C501530Jlf.LIZ(C176600m4.LIZ(), thM5exceptionOrNullimpl, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("HangoutInteractModuleV2Assem@14fa.recommendAck$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
