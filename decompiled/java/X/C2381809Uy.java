package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.aiself.AiSelfEditEffectComponent$showToast$1", f = "AiSelfEditEffectComponent.kt", l = {138}, m = "invokeSuspend")
public final class C2381809Uy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1416230mxR LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2381809Uy(C1416230mxR c1416230mxR, InterfaceC1364105Vn<? super C2381809Uy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1416230mxR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2381809Uy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiSelfEditEffectComponent@76b1.showToast$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("AiSelfEditEffectComponent@76b1.showToast$1");
                return objLJFF;
            }
        }
        Activity activityLIZ = C06MM.LIZ(C1664590tQ1.LJIIIZ(this.LLILLJJLI));
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(activityLIZ.getString(2131829499));
            c1389890mGx.LJIIJJI();
        }
        IAIMEServices iAIMEServicesT4 = this.LLILLJJLI.T4();
        if (iAIMEServicesT4 != null) {
            iAIMEServicesT4.LJIIIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiSelfEditEffectComponent@76b1.showToast$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
