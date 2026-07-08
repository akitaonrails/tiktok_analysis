package X;

import Y.AgS287S0100000_6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.InputCameraExtKt$triggerAlbumUpdateGuidePopupView$2", f = "InputCameraExt.kt", l = {359}, m = "invokeSuspend")
public final class C457450Hwl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> LLILLJJLI;
    public final /* synthetic */ C01GW<InterfaceC457470Hwn> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C457450Hwl(AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> assemVMLazy, C01GW<? extends InterfaceC457470Hwn> c01gw, InterfaceC1364105Vn<? super C457450Hwl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = c01gw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C457450Hwl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InputCameraExtKt@82ab.triggerAlbumUpdateGuidePopupView$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy<C457640Hx4, InputPanelSizeViewModel> assemVMLazy = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C457420Hwi.LIZ;
            C2252321DDq c2252321DDq = ((InputPanelSizeViewModel) assemVMLazy.getValue()).LL.LL;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 161);
            this.LL = 1;
            if (c2252321DDq.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("InputCameraExtKt@82ab.triggerAlbumUpdateGuidePopupView$2");
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
