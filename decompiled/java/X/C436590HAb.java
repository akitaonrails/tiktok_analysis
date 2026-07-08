package X;

import com.ss.android.ugc.aweme.im.messagelist.api.database.IAwemeEffectRepository;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel$markConsumedForVideoRain$1$1", f = "IMEffectNoticeViewModel.kt", l = {226}, m = "invokeSuspend")
public final class C436590HAb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMEffectNoticeViewModel LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436590HAb(IMEffectNoticeViewModel iMEffectNoticeViewModel, List<String> list, InterfaceC1364105Vn<? super C436590HAb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMEffectNoticeViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436590HAb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMEffectNoticeViewModel@2d.markConsumedForVideoRain$1$1");
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
            IAwemeEffectRepository iAwemeEffectRepositoryYQ2 = this.LLILLJJLI.yQ2();
            if (iAwemeEffectRepositoryYQ2 != null) {
                List<String> list = this.LLILLL;
                this.LL = 1;
                if (iAwemeEffectRepositoryYQ2.LJ(list, this) == objLJFF) {
                    C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.markConsumedForVideoRain$1$1");
                    return objLJFF;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markConsumedForVideoRain completed for ");
        sbLIZ.append(this.LLILLL.size());
        sbLIZ.append(" ids");
        C2188811AlT.LIZIZ(sbLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.markConsumedForVideoRain$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
