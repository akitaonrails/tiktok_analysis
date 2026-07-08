package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.detail.operator.TakoInnerDetailRepository$operator$1$queryBatchAweme$2", f = "TakoInnerDetailRepository.kt", l = {32, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C329140CvI extends C09AX implements Function2<InterfaceC346701Wf<? super BatchDetailList>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C329170CvL LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329140CvI(C329170CvL c329170CvL, String str, int i, InterfaceC1364105Vn<? super C329140CvI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c329170CvL;
        this.LLILZ = str;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329140CvI c329140CvI = new C329140CvI(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c329140CvI.LLILLJJLI = obj;
        return c329140CvI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("TakoInnerDetailRepository@d882.operator$1$queryBatchAweme$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoInnerDetailRepository@d882.operator$1$queryBatchAweme$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            TakoInnerApi takoInnerApi = (TakoInnerApi) this.LLILLL.LL.getValue();
            String str = this.LLILZ;
            int i2 = this.LLILZIL;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = takoInnerApi.queryBatchAweme(str, i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoInnerDetailRepository@d882.operator$1$queryBatchAweme$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("TakoInnerDetailRepository@d882.operator$1$queryBatchAweme$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoInnerDetailRepository@d882.operator$1$queryBatchAweme$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super BatchDetailList> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
