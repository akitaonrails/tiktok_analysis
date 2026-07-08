package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$doOnRealApply$2", f = "PCSBoardEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C389801fM extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ C389701fL LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389801fM(C389701fL c389701fL, InterfaceC1364105Vn<? super C389801fM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C389801fM c389801fM = new C389801fM(this.LLILLJJLI, interfaceC1364105Vn);
        c389801fM.LL = ((Number) obj).intValue();
        return c389801fM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        DataChannel dataChannel;
        C1C7U.LIZ("PCSBoardEffectManager@20d3.doOnRealApply$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == 2) {
            C389701fL c389701fL = this.LLILLJJLI;
            c389701fL.getClass();
            if (C500260Jjc.LJJ() && (dataChannel = c389701fL.LJFF) != null) {
                dataChannel.SX0(C768940UEi.class, Boolean.TRUE);
            }
            C389701fL c389701fL2 = this.LLILLJJLI;
            AnonymousClass0956 anonymousClass0956 = c389701fL2.LJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(new CancellationException("ON_START received"));
            }
            c389701fL2.LJI = null;
            C1C7U.LIZIZ("PCSBoardEffectManager@20d3.doOnRealApply$2");
            return true;
        }
        C389701fL c389701fL3 = this.LLILLJJLI;
        new C389901fN(c389701fL3, c389701fL3.LIZIZ, null);
        C1C7U.LIZIZ("PCSBoardEffectManager@20d3.doOnRealApply$2");
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
