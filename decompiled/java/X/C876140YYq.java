package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.spark.interceptor.EcomPigeonSparkInterceptor$thisOnActivityPrePaused$2$1", f = "EcomPigeonSparkInterceptor.kt", l = {145}, m = "invokeSuspend")
public final class C876140YYq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PigeonConversationDetailContainer LLILLJJLI;
    public final /* synthetic */ SparkContext LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876140YYq(PigeonConversationDetailContainer pigeonConversationDetailContainer, SparkContext sparkContext, InterfaceC1364105Vn<? super C876140YYq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonConversationDetailContainer;
        this.LLILLL = sparkContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876140YYq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomPigeonSparkInterceptor@4fb1.thisOnActivityPrePaused$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C414301jJ c414301jJLJJIII = ((PigeonMessageListComponentApi) this.LLILLJJLI.LJJJJL(C13LE.LIZ(PigeonMessageListComponentApi.class))).LJJIII();
                this.LL = 1;
                obj = C09IC.LJIIZILJ(c414301jJLJJIII, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EcomPigeonSparkInterceptor@4fb1.thisOnActivityPrePaused$2$1");
                    return objLJFF;
                }
            }
            List listSubList = (List) obj;
            if (!listSubList.isEmpty()) {
                if (listSubList.size() > 20) {
                    listSubList = listSubList.subList(0, 20);
                }
                C2146308az c2146308az = C2146308az.LIZ;
                String strLJIJI = this.LLILLL.LJIJI();
                c2146308az.getClass();
                String strLIZIZ = C2146308az.LIZIZ(strLJIJI);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                Iterator it2 = listSubList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C876170YYt.LIZIZ((C869590Y9l) it2.next()));
                }
                C2146308az.LIZJ(strLIZIZ, String.valueOf(C876100YYm.LLJILJILJ.LLILZIL.getPigeonIMClient().LIZ.LJ().LJ().getUid()), C13LP.LJLJJLL(arrayList));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomPigeonSparkInterceptor@4fb1.thisOnActivityPrePaused$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
