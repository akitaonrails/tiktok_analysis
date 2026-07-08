package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.model.message.KaraokeSwitchMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.KaraokeMessageHelper$processSwitchMessage$1", f = "KaraokeMessageHelper.kt", l = {}, m = "invokeSuspend")
public final class C338401Ta extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeSwitchMessage LL;
    public final /* synthetic */ C01TY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338401Ta(KaraokeSwitchMessage karaokeSwitchMessage, C01TY c01ty, InterfaceC1364105Vn<? super C338401Ta> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeSwitchMessage;
        this.LLILLJJLI = c01ty;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C338401Ta(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0U0N c0u0n;
        KaraokeViewModel karaokeViewModel;
        C1C7U.LIZ("KaraokeMessageHelper@2a72.processSwitchMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeSwitchMessage karaokeSwitchMessage = this.LL;
        if (karaokeSwitchMessage.type == 0) {
            int i = karaokeSwitchMessage.status;
            if (i == 0) {
                c0u0n = C338901Tf.LIZ;
            } else if (i == 1) {
                c0u0n = C763760Txe.LIZ;
            }
            if (c0u0n != null && (karaokeViewModel = this.LLILLJJLI.LLILLJJLI) != null) {
                karaokeViewModel.cR2(c0u0n);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeMessageHelper@2a72.processSwitchMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
