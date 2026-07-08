package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS591S0100000_12;
import njp.a;

/* JADX INFO: renamed from: X.0U19, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$handleSongUserAction$2$success$2", f = "KaraokeViewModel.kt", l = {1250, 1256}, m = "invokeSuspend")
public final class C0U19 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ KaraokeViewModel LLILLJJLI;
    public final /* synthetic */ C765450U0x LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U19(KaraokeViewModel karaokeViewModel, C765450U0x c765450U0x, InterfaceC1364105Vn<? super C0U19> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = karaokeViewModel;
        this.LLILLL = c765450U0x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U19(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            C0U2Y c0u2y = this.LLILLJJLI.LL;
            C765450U0x c765450U0x = this.LLILLL;
            C0U22 c0u22 = c765450U0x.LIZIZ;
            C0U2X c0u2x = c0u22.LJIILLIIL;
            long j = c0u22.LIZ;
            boolean z = ((C0U13) c765450U0x).LIZJ;
            this.LL = 1;
            c0u2y.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (c0u2x != null) {
                ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Bw2(c0u2x.LIZIZ, j, c0u2x.LIZ, new AwS585S0100000_6(c23260099m, 435), new AwS591S0100000_12(c23260099m, 1204), z);
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$2");
                return objLJFF;
            }
        }
        if (((Boolean) objLIZ).booleanValue()) {
            KaraokeViewModel karaokeViewModel = this.LLILLJJLI;
            this.LL = 2;
            if (karaokeViewModel.PQ2(this) == objLJFF) {
                C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeViewModel@e9e0.handleSongUserAction$2$success$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
