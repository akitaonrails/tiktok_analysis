package X;

import Y.ARunnableS106S0100000_6;
import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.business.live.cell.LiveSkylightBigAvatarCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.business.live.cell.LiveSkylightBigAvatarCell$bindRelationButton$1$3$1$1", f = "LiveSkylightBigAvatarCell.kt", l = {346}, m = "invokeSuspend")
public final class C432980GyO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSkylightBigAvatarCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432980GyO(LiveSkylightBigAvatarCell liveSkylightBigAvatarCell, InterfaceC1364105Vn<? super C432980GyO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSkylightBigAvatarCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432980GyO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSkylightBigAvatarCell@40ab.bindRelationButton$1$3$1$1");
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
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("LiveSkylightBigAvatarCell@40ab.bindRelationButton$1$3$1$1");
                return objLJFF;
            }
        }
        ViewPropertyAnimator duration = this.LLILLJJLI.V5().animate().scaleX(0.3f).scaleY(0.3f).setDuration(150L);
        ViewPropertyAnimator startDelay = this.LLILLJJLI.V5().animate().alpha(0.0f).setDuration(100L).setStartDelay(50L);
        duration.start();
        startDelay.withEndAction(new ARunnableS106S0100000_6(this.LLILLJJLI, 262)).start();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSkylightBigAvatarCell@40ab.bindRelationButton$1$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
