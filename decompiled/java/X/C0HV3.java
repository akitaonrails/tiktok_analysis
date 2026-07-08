package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HV3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel$setupAiMoji$2", f = "StickerPanelAssemViewModel.kt", l = {415}, m = "invokeSuspend")
public final class C0HV3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StickerPanelAssemViewModel LLILLJJLI;
    public final /* synthetic */ IIMSocialAvatarService LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HV3(StickerPanelAssemViewModel stickerPanelAssemViewModel, IIMSocialAvatarService iIMSocialAvatarService, InterfaceC1364105Vn<? super C0HV3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = stickerPanelAssemViewModel;
        this.LLILLL = iIMSocialAvatarService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HV3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerPanelAssemViewModel@9b1f.setupAiMoji$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01S9 c01s9 = (C01S9) this.LLILLJJLI.LLILZLL.getValue();
            if (c01s9 != null) {
                AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 101);
                this.LL = 1;
                if (c01s9.collect(agS287S0100000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("StickerPanelAssemViewModel@9b1f.setupAiMoji$2");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StickerPanelAssemViewModel@9b1f.setupAiMoji$2");
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
