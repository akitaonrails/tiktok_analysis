package X;

import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0edK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.normal.NormalPanel$setHeartMeUgTaskText$1", f = "NormalPanel.kt", l = {}, m = "invokeSuspend")
public final class C1096240edK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1124780fNM LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096240edK(C1124780fNM c1124780fNM, String str, InterfaceC1364105Vn<? super C1096240edK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1124780fNM;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1096240edK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("NormalPanel@5c77.setHeartMeUgTaskText$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C16F5 giftDescriptionTv$livegift_impl_release = this.LL.getGiftDescriptionTv$livegift_impl_release();
        if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
            i = 2131856859;
        } else {
            i = 2131856858;
        }
        giftDescriptionTv$livegift_impl_release.setText(C497740JfY.LJIJJ(i, this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NormalPanel@5c77.setHeartMeUgTaskText$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
