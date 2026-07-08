package X;

import com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent;
import com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent$iMEditSharePanelCallback$1$quickPublish$2", f = "SendToDMComponent.kt", l = {}, m = "invokeSuspend")
public final class C1407530mjP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SendToDMComponent LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407530mjP(SendToDMComponent sendToDMComponent, boolean z, boolean z2, InterfaceC1364105Vn<? super C1407530mjP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sendToDMComponent;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407530mjP(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendToDMComponent@496a.iMEditSharePanelCallback$1$quickPublish$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IDMCreativeEditService iDMCreativeEditServiceG2 = this.LL.G2();
        if (iDMCreativeEditServiceG2 != null) {
            iDMCreativeEditServiceG2.LJIIL(this.LL.m3(), C1428470nHB.LJJLIIIJLLLLLLLZ(this.LL.m3()), C2286608xc.LJ(this.LLILLJJLI ? 1 : 0), C2286608xc.LJ(this.LLILLL ? 1 : 0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendToDMComponent@496a.iMEditSharePanelCallback$1$quickPublish$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
