package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.model.message.KaraokeRedDotMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.KaraokeMessageHelper$processRedDotMessage$1", f = "KaraokeMessageHelper.kt", l = {}, m = "invokeSuspend")
public final class C338501Tb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C01TY LL;
    public final /* synthetic */ KaraokeRedDotMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338501Tb(C01TY c01ty, KaraokeRedDotMessage karaokeRedDotMessage, InterfaceC1364105Vn<? super C338501Tb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c01ty;
        this.LLILLJJLI = karaokeRedDotMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C338501Tb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeMessageHelper@2a72.processRedDotMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModel = this.LL.LLILLJJLI;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C338801Te(this.LLILLJJLI.hostSingReqCumulativeCount));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeMessageHelper@2a72.processRedDotMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
