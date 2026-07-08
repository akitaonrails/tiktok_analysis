package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01kV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C421701kV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC927510aFB LL;
    public final /* synthetic */ C299601Ec LLILLJJLI;
    public final /* synthetic */ BaseVmWidget<VM> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C421701kV(InterfaceC927510aFB interfaceC927510aFB, C299601Ec c299601Ec, BaseVmWidget<VM> baseVmWidget) {
        super(0);
        this.LL = interfaceC927510aFB;
        this.LLILLJJLI = c299601Ec;
        this.LLILLL = baseVmWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC927510aFB interfaceC927510aFB = this.LL;
        String strLJIILIIL = interfaceC927510aFB != null ? interfaceC927510aFB.LJIILIIL() : null;
        C299601Ec c299601Ec = this.LLILLJJLI;
        if (c299601Ec.LJIIIZ.autoExpand && !Intrinsics.LJFF(c299601Ec.LIZJ, strLJIILIIL)) {
            InterfaceC927510aFB interfaceC927510aFB2 = this.LL;
            if (interfaceC927510aFB2 != null) {
                interfaceC927510aFB2.LJIIL();
            }
            String strA1 = this.LLILLL.A1();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("compensateEnlargeImLoss, linkMicId = ");
            sbLIZ.append(this.LLILLJJLI.LIZJ);
            C1AZW.LJIILL(strA1, C2188811AlT.LIZIZ(sbLIZ), null, null);
        }
        return Unit.LIZ;
    }
}
