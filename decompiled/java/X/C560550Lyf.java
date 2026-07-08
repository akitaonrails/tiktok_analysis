package X;

import Y.AgS76S1200000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundLoadingComponent$observeTaskStatus$1", f = "AIPlaygroundLoadingComponent.kt", l = {182, 184}, m = "invokeSuspend")
public final class C560550Lyf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C560580Lyi LLILLL;
    public final /* synthetic */ CreativeModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C560550Lyf(String str, C560580Lyi c560580Lyi, CreativeModel creativeModel, InterfaceC1364105Vn<? super C560550Lyf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c560580Lyi;
        this.LLILZ = creativeModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C560550Lyf(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI;
        C1C7U.LIZ("AIPlaygroundLoadingComponent@75a3.observeTaskStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIPlaygroundLoadingComponent@75a3.observeTaskStatus$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null) {
                List listSingletonList = Collections.singletonList(this.LLILLJJLI);
                this.LL = 1;
                if (iCreationAsyncTaskManagerLIZ.LJIJJLI("AIPlaygroundLoadingComponent", listSingletonList, this) == objLJFF) {
                    C1C7U.LIZIZ("AIPlaygroundLoadingComponent@75a3.observeTaskStatus$1");
                    return objLJFF;
                }
            }
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ2 = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ2 != null && (interfaceC346201WaLJJJJLI = iCreationAsyncTaskManagerLIZ2.LJJJJLI(this.LLILLJJLI)) != null) {
            AgS76S1200000_8 agS76S1200000_8 = new AgS76S1200000_8(this.LLILLL, this.LLILZ, this.LLILLJJLI, 0);
            this.LL = 2;
            if (interfaceC346201WaLJJJJLI.collect(agS76S1200000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AIPlaygroundLoadingComponent@75a3.observeTaskStatus$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundLoadingComponent@75a3.observeTaskStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
