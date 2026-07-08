package X;

import com.ss.android.ugc.aweme.pns.consent.collector.PNSConsentCollectorServiceImpl;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914980zvs extends C09AY implements InterfaceC1631630sYr<String, EnumC1876780ywG, String, String, Unit> {
    public final /* synthetic */ PNSConsentCollectorServiceImpl LL;
    public final /* synthetic */ EnumC1876780ywG LLILLJJLI;
    public final /* synthetic */ InterfaceC1915180zwC LLILLL;
    public final /* synthetic */ InterfaceC1915190zwD LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1914980zvs(PNSConsentCollectorServiceImpl pNSConsentCollectorServiceImpl, EnumC1876780ywG enumC1876780ywG, InterfaceC1915180zwC interfaceC1915180zwC, InterfaceC1915190zwD interfaceC1915190zwD) {
        super(4);
        this.LL = pNSConsentCollectorServiceImpl;
        this.LLILLJJLI = enumC1876780ywG;
        this.LLILLL = interfaceC1915180zwC;
        this.LLILZ = interfaceC1915190zwD;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, EnumC1876780ywG enumC1876780ywG, String str2, String str3) {
        this.LL.LJIIIIZZ(str, this.LLILLJJLI, enumC1876780ywG, str2, str3, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
