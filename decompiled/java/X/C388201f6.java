package X;

import android.content.Context;
import com.bytedance.android.live.effect.api.IEffectService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01f6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.queue.QueueBoardPresent$createBoardAndApply$1", f = "QueueBoardPresent.kt", l = {61}, m = "invokeSuspend")
public final class C388201f6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C388101f5 LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C388101f5 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C388201f6(Context context, C388101f5 c388101f5, InterfaceC1364105Vn<? super C388201f6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = context;
        this.LLILZIL = c388101f5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C388201f6(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        C388101f5 c388101f5;
        C1C7U.LIZ("QueueBoardPresent@5aad.createBoardAndApply$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c388101f5 = this.LLILLJJLI;
                context = (Context) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
            if (effectBoardService != null) {
                context = this.LLILZ;
                c388101f5 = this.LLILZIL;
                EnumC389301fH enumC389301fH = EnumC389301fH.QUEUE;
                this.LL = context;
                this.LLILLJJLI = c388101f5;
                this.LLILLL = 1;
                obj = effectBoardService.LJIIIZ(context, enumC389301fH, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("QueueBoardPresent@5aad.createBoardAndApply$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("QueueBoardPresent@5aad.createBoardAndApply$1");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            c388101f5.LIZ(0L, context);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("QueueBoardPresent@5aad.createBoardAndApply$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
