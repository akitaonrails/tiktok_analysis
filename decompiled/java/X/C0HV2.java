package X;

import Y.AgS165S0300000_6;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HV2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.StickerPanelAssemViewModel$setupAiMoji$1", f = "StickerPanelAssemViewModel.kt", l = {395}, m = "invokeSuspend")
public final class C0HV2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IIMSocialAvatarService LLILLJJLI;
    public final /* synthetic */ C259800zU<IMSocialAvatarStatus> LLILLL;
    public final /* synthetic */ C259800zU<IMSocialAvatarStatus> LLILZ;
    public final /* synthetic */ StickerPanelAssemViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HV2(IIMSocialAvatarService iIMSocialAvatarService, C259800zU<IMSocialAvatarStatus> c259800zU, C259800zU<IMSocialAvatarStatus> c259800zU2, StickerPanelAssemViewModel stickerPanelAssemViewModel, InterfaceC1364105Vn<? super C0HV2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iIMSocialAvatarService;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = stickerPanelAssemViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HV2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerPanelAssemViewModel@9b1f.setupAiMoji$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<IMSocialAvatarStatus> c05ydLJJLI = this.LLILLJJLI.LJJLI(null, false);
            AgS165S0300000_6 agS165S0300000_6 = new AgS165S0300000_6(this.LLILLL, this.LLILZ, this.LLILZIL, 3);
            this.LL = 1;
            if (c05ydLJJLI.collect(agS165S0300000_6, this) == objLJFF) {
                C1C7U.LIZIZ("StickerPanelAssemViewModel@9b1f.setupAiMoji$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
