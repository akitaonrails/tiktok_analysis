package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS28S0200100_12;
import njp.a;

/* JADX INFO: renamed from: X.0U1F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$processDownloadResultForAudience$2", f = "KaraokeViewModel.kt", l = {639, 645}, m = "invokeSuspend")
public final class C0U1F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ KaraokeViewModel LLILLL;
    public final /* synthetic */ C0U22 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U1F(KaraokeViewModel karaokeViewModel, C0U22 c0u22, InterfaceC1364105Vn<? super C0U1F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = karaokeViewModel;
        this.LLILZ = c0u22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U1F(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        Object objLIZ = obj;
        C1C7U.LIZ("KaraokeViewModel@e9e0.processDownloadResultForAudience$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    zBooleanValue = this.LL;
                    C155000ia.LIZIZ(objLIZ);
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    C1C7U.LIZIZ("KaraokeViewModel@e9e0.processDownloadResultForAudience$2");
                    return boolValueOf;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            C0U2Y c0u2y = this.LLILLL.LL;
            long j = this.LLILZ.LIZ;
            this.LLILLJJLI = 1;
            c0u2y.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Xi2(j, new AwS28S0200100_12(c0u2y, j, c23260099m, 5), new AwS28S0200100_12(c0u2y, j, c23260099m, 6));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.processDownloadResultForAudience$2");
                return objLJFF;
            }
        }
        C0U22 c0u22 = this.LLILZ;
        KaraokeViewModel karaokeViewModel = this.LLILLL;
        Boolean bool = (Boolean) objLIZ;
        if (bool.booleanValue()) {
            C0U1G.LIZJ(c0u22, karaokeViewModel.LLJILJIL, false, karaokeViewModel.HQ2());
            long j2 = c0u22.LIZ;
            long j3 = karaokeViewModel.LLJILJIL;
            C0U1G.LJI.put(Long.valueOf(j2), C0U17.LJIIZILJ(j3).getValue());
        }
        zBooleanValue = bool.booleanValue();
        KaraokeViewModel karaokeViewModel2 = this.LLILLL;
        this.LL = zBooleanValue;
        this.LLILLJJLI = 2;
        if (karaokeViewModel2.PQ2(this) == objLJFF) {
            C1C7U.LIZIZ("KaraokeViewModel@e9e0.processDownloadResultForAudience$2");
            return objLJFF;
        }
        Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.processDownloadResultForAudience$2");
        return boolValueOf2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
