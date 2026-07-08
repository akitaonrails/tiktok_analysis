package X;

import com.ss.android.ugc.aweme.social.sendtodm.MultiImageSendToDMComponent;
import com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sendtodm.MultiImageSendToDMComponent$iMEditSharePanelCallback$2$1$quickPublish$2", f = "MultiImageSendToDMComponent.kt", l = {}, m = "invokeSuspend")
public final class C1407520mjO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MultiImageSendToDMComponent LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407520mjO(MultiImageSendToDMComponent multiImageSendToDMComponent, boolean z, boolean z2, InterfaceC1364105Vn<? super C1407520mjO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = multiImageSendToDMComponent;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407520mjO(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiImageSendToDMComponent@9b62.iMEditSharePanelCallback$2$1$quickPublish$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IDMCreativeEditService iDMCreativeEditServiceO2 = this.LL.o2();
        if (iDMCreativeEditServiceO2 != null) {
            iDMCreativeEditServiceO2.LJIIL(this.LL.T2(), C1428470nHB.LJJLIIIJLLLLLLLZ(this.LL.T2()), C2286608xc.LJ(this.LLILLJJLI ? 1 : 0), C2286608xc.LJ(this.LLILLL ? 1 : 0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiImageSendToDMComponent@9b62.iMEditSharePanelCallback$2$1$quickPublish$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
