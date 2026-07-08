package X;

import com.bytedance.android.live.effect.api.IEffectService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel$tryDownloadEffect$1", f = "MatchHammerViewModel.kt", l = {1116}, m = "invokeSuspend")
public final class C755800Tko extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C755800Tko(String str, InterfaceC1364105Vn<? super C755800Tko> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C755800Tko(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchHammerViewModel@6ded.tryDownloadEffect$1");
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
            C0UEA liveEffectController = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController();
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = liveEffectController.LJI(str, "livehorizontaleffects", "all", this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MatchHammerViewModel@6ded.tryDownloadEffect$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pre download resource success ");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LIZIZ("MatchItemHammerVM", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C20441214yg.LIZIZ("MatchItemHammerVM", "pre download Failed");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchHammerViewModel@6ded.tryDownloadEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
