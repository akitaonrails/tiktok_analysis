package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.SuggestedQuestionsResponse;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Ap3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper.BaAutoMessageServiceImpl$fetchSuggestedQuestion$1", f = "BaAutoMessageServiceImpl.kt", l = {354}, m = "invokeSuspend")
public final class C2191031Ap3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaAutoMessageServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191031Ap3(BaAutoMessageServiceImpl baAutoMessageServiceImpl, InterfaceC1364105Vn<? super C2191031Ap3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baAutoMessageServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191031Ap3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int size;
        C1C7U.LIZ("BaAutoMessageServiceImpl@649f.fetchSuggestedQuestion$1");
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
                C2191381Apc.LIZ.getClass();
                C099F c099fLIZ = C23183096n.LIZ(C2191381Apc.LIZJ());
                this.LL = 1;
                obj = c099fLIZ.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchSuggestedQuestion$1");
                    return objLJFF;
                }
            }
            SuggestedQuestionsResponse suggestedQuestionsResponse = (SuggestedQuestionsResponse) obj;
            if (suggestedQuestionsResponse.status_code != 0) {
                BaAutoMessageServiceImpl baAutoMessageServiceImpl = this.LLILLJJLI;
                baAutoMessageServiceImpl.LJIIIZ = null;
                baAutoMessageServiceImpl.LJIIIIZZ = null;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchSuggestedQuestion$1");
                return unit;
            }
            int i2 = suggestedQuestionsResponse.totalQuestionsNum;
            List<Object> list = suggestedQuestionsResponse.suggestedQuestionStatus;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            this.LLILLJJLI.LJIIIZ = new C483830IyD(i2, size);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchSuggestedQuestion$1");
            return unit2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LJIIIIZZ = null;
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("BaAutoMessageServiceImpl@649f.fetchSuggestedQuestion$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
