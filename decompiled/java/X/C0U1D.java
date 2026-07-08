package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0U1D, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$songListManager$2$1$1$start$2", f = "KaraokeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0U1D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0U1H LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1D(C0U1H c0u1h, KaraokeViewModel karaokeViewModel, InterfaceC1364105Vn<? super C0U1D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0u1h;
        this.LLILLJJLI = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U1D(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeViewModel@e9e0.songListManager$2$1$1$start$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0U22 c0u22LJIIJJI = this.LL.LJIIJJI();
        if (c0u22LJIIJJI != null) {
            KaraokeViewModel karaokeViewModel = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Really Start, checkPanel: ");
            sbLIZ.append(c0u22LJIIJJI.LJIIIZ());
            C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C0U17 c0u17 = C0U17.LIZ;
            long j = c0u22LJIIJJI.LIZ;
            c0u22LJIIJJI.LJIIIZ();
            boolean z = true;
            if (!(!a0.LJJJIL(c0u22LJIIJJI.LJII.LIZIZ)) || !karaokeViewModel.GQ2()) {
                z = false;
            }
            boolean zKQ2 = karaokeViewModel.KQ2();
            boolean z2 = karaokeViewModel.LLJJL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_play");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_vocal");
            c474500IjALIZ.LJJII(C0U17.LJIJ(zKQ2), "user_type");
            c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_h5_entry");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C0U17.LIZJ)) ? 1 : 0), "is_remembered");
            C0U17.LIZ(c0u17, c474500IjALIZ);
            c474500IjALIZ.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.songListManager$2$1$1$start$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
