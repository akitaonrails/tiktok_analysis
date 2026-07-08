package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMChatListAnalytics$tryReportMessageRequestSocialChatCellShowOnListHostResume$1", f = "IMChatListAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1530605yy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC885530YoZ LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ InterfaceC1493105sv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530605yy(int i, AbstractC885530YoZ abstractC885530YoZ, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC885530YoZ;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = i;
        this.LLILZ = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1530605yy(this.LLILLL, this.LL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMChatListAnalytics@cbf8.tryReportMessageRequestSocialChatCellShowOnListHostResume$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        AbstractC885530YoZ abstractC885530YoZ = this.LL;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLJJLI;
        int i = this.LLILLL;
        InterfaceC1493105sv interfaceC1493105sv = this.LLILZ;
        c885310YoD.getClass();
        C885310YoD.LJJIIZI(abstractC885530YoZ, interfaceC879010Ye3, i, interfaceC1493105sv);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMChatListAnalytics@cbf8.tryReportMessageRequestSocialChatCellShowOnListHostResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
