package X;

import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel$roomMatchCallback$1$handleSignal$1", f = "MultiTopLiveRandomMatchViewModel.kt", l = {96}, m = "invokeSuspend")
public final class C481520IuU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MultiTopLiveRandomMatchViewModel LLILLJJLI;
    public final /* synthetic */ MultiTopLiveRoomMatchScene.DownLinkRoomMatchData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481520IuU(MultiTopLiveRandomMatchViewModel multiTopLiveRandomMatchViewModel, MultiTopLiveRoomMatchScene.DownLinkRoomMatchData downLinkRoomMatchData, InterfaceC1364105Vn<? super C481520IuU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiTopLiveRandomMatchViewModel;
        this.LLILLL = downLinkRoomMatchData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C481520IuU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveRandomMatchViewModel@ffcf.roomMatchCallback$1$handleSignal$1");
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
            C2252321DDq c2252321DDq = this.LLILLJJLI.LL;
            C481540IuW c481540IuW = new C481540IuW(this.LLILLL);
            this.LL = 1;
            c2252321DDq.setValue(c481540IuW);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("MultiTopLiveRandomMatchViewModel@ffcf.roomMatchCallback$1$handleSignal$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveRandomMatchViewModel@ffcf.roomMatchCallback$1$handleSignal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
