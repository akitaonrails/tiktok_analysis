package X;

import android.animation.AnimatorSet;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.TakoPhotoPickerPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS393S0200000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem$showPhotoPickerEntrancePanel$1", f = "BottomInputAssem.kt", l = {1011}, m = "invokeSuspend")
public final class C1852130yIV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BottomInputAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852130yIV(BottomInputAssem bottomInputAssem, InterfaceC1364105Vn<? super C1852130yIV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bottomInputAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1852130yIV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1852120yIU photoPickerEntranceView;
        C1C7U.LIZ("BottomInputAssem@df38.showPhotoPickerEntrancePanel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.mp().setState(new AwS36S0010000_24(true, 37));
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("BottomInputAssem@df38.showPhotoPickerEntrancePanel$1");
                return objLJFF;
            }
        }
        C1854760yMk c1854760yMk = this.LLILLJJLI.LLJJJ;
        if (c1854760yMk != null && (photoPickerEntranceView = c1854760yMk.getPhotoPickerEntranceView()) != null && photoPickerEntranceView.getCurrentViewState() == EnumC1852100yIS.PHOTO_PICKER_PANEL_CLOSE) {
            photoPickerEntranceView.LIZ(EnumC1852100yIS.PHOTO_PICKER_PANEL_OPEN);
        }
        BottomInputAssem bottomInputAssem = this.LLILLJJLI;
        if (bottomInputAssem.LLLIL != null) {
            ((AnimatorSet) bottomInputAssem.LLLLLZL.getValue()).start();
        }
        AssemVMLazy assemVMLazy = this.LLILLJJLI.LLLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BottomInputAssem.LLLLZIL;
        TakoPhotoPickerPanelViewModel takoPhotoPickerPanelViewModel = (TakoPhotoPickerPanelViewModel) assemVMLazy.getValue();
        takoPhotoPickerPanelViewModel.setState(new AwS393S0200000_27(takoPhotoPickerPanelViewModel, C1852170yIZ.LIZ, 79));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomInputAssem@df38.showPhotoPickerEntrancePanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
