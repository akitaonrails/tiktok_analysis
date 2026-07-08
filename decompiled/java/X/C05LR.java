package X;

import com.ss.android.ugc.aweme.chatroom.GroupSystemNoticeAnalyticsAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05LR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatroom.GroupSystemNoticeAnalyticsAssem$reportInlineMessageShow$1", f = "GroupSystemNoticeAnalyticsAssem.kt", l = {}, m = "invokeSuspend")
public final class C05LR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ GroupSystemNoticeAnalyticsAssem LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LR(String str, String str2, GroupSystemNoticeAnalyticsAssem groupSystemNoticeAnalyticsAssem, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C05LR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = groupSystemNoticeAnalyticsAssem;
        this.LLILZ = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupSystemNoticeAnalyticsAssem@c9a7.reportInlineMessageShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("b2c_report_msg_uuid_prefix");
        sbLIZ.append(this.LL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(C0YNP.LJFF(this.LLILLJJLI, strLIZIZ), "1")) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GroupSystemNoticeAnalyticsAssem@c9a7.reportInlineMessageShow$1");
            return unit;
        }
        C1672306gj.LIZLLL((SessionInfo) this.LLILLL.LLILLL.getValue(), this.LLILZ);
        C0YNP.LJIIIIZZ(this.LLILLJJLI, strLIZIZ, "1");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupSystemNoticeAnalyticsAssem@c9a7.reportInlineMessageShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
