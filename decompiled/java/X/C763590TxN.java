package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.view.KaraokeSoundEffectAdapter$onBindViewHolder$1$1", f = "KaraokeSoundEffectAdapter.kt", l = {}, m = "invokeSuspend")
public final class C763590TxN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C761720TuM LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763590TxN(C761720TuM c761720TuM, LiveEffect liveEffect, InterfaceC1364105Vn<? super C763590TxN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c761720TuM;
        this.LLILLJJLI = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C763590TxN(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeSoundEffectAdapter@875f.onBindViewHolder$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeViewModel karaokeViewModel = this.LL.LLILZ;
        if (karaokeViewModel != null) {
            karaokeViewModel.cR2(new C763600TxO(this.LLILLJJLI));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeSoundEffectAdapter@875f.onBindViewHolder$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
