package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel$panelStateListener$1$onSelectedSegmentChanged$1", f = "MusicGiftDetailViewModel.kt", l = {}, m = "invokeSuspend")
public final class C592850NNb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MusicGiftDetailViewModel LL;
    public final /* synthetic */ C1142100fpI LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592850NNb(MusicGiftDetailViewModel musicGiftDetailViewModel, C1142100fpI c1142100fpI, InterfaceC1364105Vn<? super C592850NNb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicGiftDetailViewModel;
        this.LLILLJJLI = c1142100fpI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592850NNb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailViewModel@deb0.panelStateListener$1$onSelectedSegmentChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.vQ2(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.panelStateListener$1$onSelectedSegmentChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
