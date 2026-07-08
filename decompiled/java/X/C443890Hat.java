package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel$collectSetStickersFlow$1", f = "StickerPanelAssemViewModel.kt", l = {155}, m = "invokeSuspend")
public final class C443890Hat extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StickerPanelAssemViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443890Hat(StickerPanelAssemViewModel stickerPanelAssemViewModel, InterfaceC1364105Vn<? super C443890Hat> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerPanelAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C443890Hat(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerPanelAssemViewModel@9b1f.collectSetStickersFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StickerPanelAssemViewModel stickerPanelAssemViewModel = this.LLILLJJLI;
            InterfaceC450290HlD interfaceC450290HlD = stickerPanelAssemViewModel.LLIZ;
            if (interfaceC450290HlD == null) {
                synchronized (stickerPanelAssemViewModel) {
                    interfaceC450290HlD = stickerPanelAssemViewModel.LLIZ;
                    if (interfaceC450290HlD == null) {
                        interfaceC450290HlD = (InterfaceC450290HlD) C1807670x8n.LLLLLZ();
                        stickerPanelAssemViewModel.LLIZ = interfaceC450290HlD;
                    }
                }
            }
            C05YD<AbstractC450030Hkn<List<StickerSetInfo>>> addedStickerSetsFlow = interfaceC450290HlD.getAddedStickerSetsFlow();
            if (addedStickerSetsFlow != null) {
                AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 113);
                this.LL = 1;
                if (addedStickerSetsFlow.collect(agS287S0100000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("StickerPanelAssemViewModel@9b1f.collectSetStickersFlow$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StickerPanelAssemViewModel@9b1f.collectSetStickersFlow$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
