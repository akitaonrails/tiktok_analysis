package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06iT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.camera.GroupCameraInlineMsgHandler$createActionClickHandler$1$onClickAction$1", f = "GroupCameraInlineMsgProtocol.kt", l = {}, m = "invokeSuspend")
public final class C1683106iT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Activity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683106iT(long j, Activity activity, InterfaceC1364105Vn<? super C1683106iT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1683106iT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupCameraInlineMsgHandler@645e.createActionClickHandler$1$onClickAction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C869590Y9l c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(this.LL);
        if (c869590Y9lLJJJ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GroupCameraInlineMsgHandler@645e.createActionClickHandler$1$onClickAction$1");
            return unit;
        }
        C1683306iV.LIZIZ(C1683206iU.LIZJ, null, 6);
        IReportUtils.LIZ.getClass();
        IReportUtils iReportUtilsLIZ = C1703106lh.LIZ();
        if (iReportUtilsLIZ != null) {
            iReportUtilsLIZ.LIZ(new C1689106jR(c869590Y9lLJJJ, "dm_inline", null, null, 28), this.LLILLJJLI, "12", null, true);
        }
        IMGroupChatDetailAnalytics.LJIIL("chat", String.valueOf(c869590Y9lLJJJ.getSender()), "im", "inline_message", null, null, 112);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupCameraInlineMsgHandler@645e.createActionClickHandler$1$onClickAction$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
