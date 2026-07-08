package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.0U1E, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$handleSongUserAction$2$success$downloadTask$2", f = "KaraokeViewModel.kt", l = {1190, 1211}, m = "invokeSuspend")
public final class C0U1E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public final /* synthetic */ C765450U0x LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1E(KaraokeViewModel karaokeViewModel, C765450U0x c765450U0x, InterfaceC1364105Vn<? super C0U1E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
        this.LLILLL = c765450U0x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U1E(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$downloadTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$downloadTask$2");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            KaraokeViewModel karaokeViewModel = this.LLILLJJLI;
            C0U33 c0u33 = karaokeViewModel.LLJJJIL;
            C0U22 c0u22 = this.LLILLL.LIZIZ;
            String value = karaokeViewModel.LLILZLL.LIZJ().getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HitchHiking Panel Param: ");
            sbLIZ.append(value);
            C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LJJJI("panel", value, c0u22.LJI);
            AwS617S0100000_3 awS617S0100000_3 = new AwS617S0100000_3(this.LLILLJJLI, 15);
            this.LL = 1;
            obj = c0u33.LIZLLL(c0u22, false, awS617S0100000_3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$downloadTask$2");
                return objLJFF;
            }
        }
        EnumC765560U1i enumC765560U1i = (EnumC765560U1i) obj;
        this.LLILLJJLI.cR2(C765640U1q.LIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("download: ");
        sbLIZ2.append(enumC765560U1i);
        C20441214yg.LIZIZ("KDownloader", C2188811AlT.LIZIZ(sbLIZ2));
        KaraokeViewModel karaokeViewModel2 = this.LLILLJJLI;
        C0U22 c0u222 = this.LLILLL.LIZIZ;
        this.LL = 2;
        obj = karaokeViewModel2.WQ2(enumC765560U1i, c0u222, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$downloadTask$2");
            return objLJFF;
        }
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$downloadTask$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
