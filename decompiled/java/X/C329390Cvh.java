package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.repos.LandscapeCacheRepo$operator$1$checkAwemeData$2", f = "LandscapeCacheRepo.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITH_TEXT, LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT}, m = "invokeSuspend")
public final class C329390Cvh extends C09AX implements Function2<InterfaceC346701Wf<? super BatchDetailList>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329390Cvh(List<String> list, InterfaceC1364105Vn<? super C329390Cvh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329390Cvh c329390Cvh = new C329390Cvh(this.LLILLL, interfaceC1364105Vn);
        c329390Cvh.LLILLJJLI = obj;
        return c329390Cvh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("LandscapeCacheRepo@a952.operator$1$checkAwemeData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LandscapeCacheRepo@a952.operator$1$checkAwemeData$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            InterfaceC329400Cvi.LIZ.getClass();
            InterfaceC329400Cvi value = C329410Cvj.LIZIZ.getValue();
            String string = this.LLILLL.toString();
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = value.LIZ(string, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LandscapeCacheRepo@a952.operator$1$checkAwemeData$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("LandscapeCacheRepo@a952.operator$1$checkAwemeData$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LandscapeCacheRepo@a952.operator$1$checkAwemeData$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super BatchDetailList> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
