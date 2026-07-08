package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05sM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1489605sM extends C09AY implements InterfaceC1631620sYq<Long, Boolean, String, Unit> {
    public final /* synthetic */ C1322390kW5 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1324680kZm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489605sM(C1322390kW5 c1322390kW5, String str, InterfaceC1324680kZm interfaceC1324680kZm) {
        super(3);
        this.LL = c1322390kW5;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1324680kZm;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, Boolean bool, String str) {
        C1322390kW5 c1322390kW5 = this.LL;
        String str2 = this.LLILLJJLI;
        String string = this.LLILLL.toString();
        c1322390kW5.getClass();
        C1018703yb.LIZLLL("rd_tiktokec_lynx_image_preload", new C1489505sL(l.longValue(), str2, bool.booleanValue(), string, str));
        return Unit.LIZ;
    }
}
