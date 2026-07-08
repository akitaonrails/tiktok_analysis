package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$effectConflictCheck$1", f = "PCSBoardEffectManager.kt", l = {248}, m = "invokeSuspend")
public final class C395601gI extends C09AX implements Function2<C094D<? super LiveEffect>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LiveEffect LLILZ;
    public final /* synthetic */ C389701fL LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C395601gI(Context context, LiveEffect liveEffect, C389701fL c389701fL, InterfaceC1364105Vn<? super C395601gI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = liveEffect;
        this.LLILZIL = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C395601gI c395601gI = new C395601gI(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c395601gI.LLILLJJLI = obj;
        return c395601gI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PCSBoardEffectManager@20d3.effectConflictCheck$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            if (this.LLILLL == null) {
                c094d.LJIIIIZZ(this.LLILZ);
                c094d.LJIIJJI(null);
            }
            Context context = this.LLILLL;
            if (context != null) {
                C389701fL c389701fL = this.LLILZIL;
                LiveEffect liveEffect = this.LLILZ;
                C1828990xhB c1828990xhB = C1828990xhB.LIZ;
                DataChannel dataChannel = c389701fL.LJFF;
                C020Y c020y = new C020Y(c094d, (C094D<? super LiveEffect>) liveEffect, (LiveEffect) 43);
                C5182020e c5182020e = new C5182020e(c094d, (C094D<? super LiveEffect>) 638);
                c1828990xhB.getClass();
                C1828990xhB.LIZ(context, dataChannel, "live_boards", liveEffect, c020y, c5182020e);
            }
            AnonymousClass0206 anonymousClass0206 = AnonymousClass0206.get$arr$(553);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, anonymousClass0206, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectManager@20d3.effectConflictCheck$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.effectConflictCheck$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super LiveEffect> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
