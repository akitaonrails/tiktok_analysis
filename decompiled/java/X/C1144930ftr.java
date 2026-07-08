package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleSpecialEffectDebuffChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ftr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem$calculateAndRemoveRivalSpecialEffect$1", f = "MatchItemAssem.kt", l = {2415}, m = "invokeSuspend")
public final class C1144930ftr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ MatchItemAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144930ftr(long j, MatchItemAssem matchItemAssem, InterfaceC1364105Vn<? super C1144930ftr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = matchItemAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1144930ftr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchItemAssem@d26e.calculateAndRemoveRivalSpecialEffect$1");
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
            long j = this.LLILLJJLI;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("MatchItemAssem@d26e.calculateAndRemoveRivalSpecialEffect$1");
                    return objLJFF;
                }
            }
        }
        DataChannel dataChannel = this.LLILLL.LLJJIJI;
        if (dataChannel != null) {
            dataChannel.zW(BattleSpecialEffectDebuffChannel.class, EnumC919030a1V.NORMAL);
        }
        C20441214yg.LJ("MatchItemAssem", "try to stop rival special effect card ");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchItemAssem@d26e.calculateAndRemoveRivalSpecialEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
