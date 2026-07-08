package X;

import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.profile.api.InteractionApi;
import com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileInteractionSchemaSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS586S0100000_7;
import njp.a;

/* JADX INFO: renamed from: X.0Jdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.widget.subview.vh.SubviewViewHolder$openInteractPanel$1", f = "SubviewViewHolder.kt", l = {163}, m = "invokeSuspend")
public final class C496620Jdk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1113470f57 LLILZ;
    public final /* synthetic */ C1109770ez9 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496620Jdk(long j, long j2, C1113470f57 c1113470f57, C1109770ez9 c1109770ez9, InterfaceC1364105Vn<? super C496620Jdk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = c1113470f57;
        this.LLILZIL = c1109770ez9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496620Jdk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GetUserInteractionSummaryResponse.ResponseData responseData;
        C1C7U.LIZ("SubviewViewHolder@e013.openInteractPanel$1");
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
                C480460Ism.LIZ().getClass();
                C19476611Hw c19476611HwLJL = ((InteractionApi) C480460Ism.LIZLLL(InteractionApi.class)).getUserInteractionSummary(this.LLILLJJLI, this.LLILLL).LJL(C11S5.LIZ());
                this.LL = 1;
                obj = C500260Jjc.LJJJJL(c19476611HwLJL, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SubviewViewHolder@e013.openInteractPanel$1");
                    return objLJFF;
                }
            }
            responseData = ((GetUserInteractionSummaryResponse) obj).data;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            responseData = null;
        }
        this.LLILZ.LJIIIIZZ = false;
        if (responseData != null) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.LLILZIL.LIZ, LiveProfileInteractionSchemaSetting.INSTANCE.get(), new AwS586S0100000_7(responseData, 591));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubviewViewHolder@e013.openInteractPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
