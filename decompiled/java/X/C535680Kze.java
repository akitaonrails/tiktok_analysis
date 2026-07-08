package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.quota.AILiveQuotaLogicComponent$processQuotaLimit$dialogConfig$1$1", f = "AILiveQuotaLogicComponent.kt", l = {98}, m = "invokeSuspend")
public final class C535680Kze extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C558700Lvg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535680Kze(C558700Lvg c558700Lvg, InterfaceC1364105Vn<? super C535680Kze> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c558700Lvg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535680Kze(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveQuotaLogicComponent@7bd.processQuotaLimit$dialogConfig$1$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManagerX1 = this.LLILLJJLI.X1();
            if (iCreationAsyncTaskManagerX1 != null) {
                this.LL = 1;
                if (iCreationAsyncTaskManagerX1.LJJJJIZL(this) == objLJFF) {
                    C1C7U.LIZIZ("AILiveQuotaLogicComponent@7bd.processQuotaLimit$dialogConfig$1$1");
                    return objLJFF;
                }
            }
        }
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this.LLILLJJLI);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(C0MED.LIZ(C0MEB.POST_TOAST_NOTIFICATIONS, new Object[0]));
        creativeToastBuilder.duration(3000L);
        C1390380mHk.LIZJ(contextLJIIIZ, 8006, creativeToastBuilder);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILiveQuotaLogicComponent@7bd.processQuotaLimit$dialogConfig$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
