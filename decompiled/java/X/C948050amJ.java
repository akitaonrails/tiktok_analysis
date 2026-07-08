package X;

import androidx.compose.ui.platform.ComposeView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0amJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingDialog$onCreateContentView$2$1$4$1", f = "MultiGuestPreviewLiveSettingDialog.kt", l = {}, m = "invokeSuspend")
public final class C948050amJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MultiGuestPreviewLiveSettingViewModel LL;
    public final /* synthetic */ ComposeView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C948050amJ(MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel, ComposeView composeView, InterfaceC1364105Vn<? super C948050amJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = multiGuestPreviewLiveSettingViewModel;
        this.LLILLJJLI = composeView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C948050amJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiGuestPreviewLiveSettingDialog@745d.onCreateContentView$2$1$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20441214yg.LJIIIZ("MultiGuestPreviewLiveSettingDialog", "dispatchIntent: (MultiGuestPreviewLiveSettingIntent.LayoutSettingIntent.InitLayoutSetting)");
        this.LL.vQ2(new C948080amM(this.LLILLJJLI.getContext()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingDialog@745d.onCreateContentView$2$1$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
