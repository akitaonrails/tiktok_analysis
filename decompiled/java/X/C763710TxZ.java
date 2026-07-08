package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.KaraokeUtil$openDefaultPage$1", f = "KaraokeUtil.kt", l = {}, m = "invokeSuspend")
public final class C763710TxZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DataChannel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763710TxZ(DataChannel dataChannel, InterfaceC1364105Vn<? super C763710TxZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763710TxZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeUtil@b118.openDefaultPage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModelLIZJ = C765700U1w.LIZJ(this.LL);
        if (karaokeViewModelLIZJ != null) {
            karaokeViewModelLIZJ.cR2(C764130TyF.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeUtil@b118.openDefaultPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
