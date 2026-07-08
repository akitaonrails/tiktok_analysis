package X;

import com.ss.android.ugc.aweme.pns.consent.collector.PNSConsentCollectorServiceImpl;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914970zvr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1915190zwD LL;
    public final /* synthetic */ InterfaceC1915180zwC LLILLJJLI;
    public final /* synthetic */ CollectConsentParam LLILLL;
    public final /* synthetic */ PNSConsentCollectorServiceImpl LLILZ;
    public final /* synthetic */ EnumC1876780ywG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1914970zvr(InterfaceC1915190zwD interfaceC1915190zwD, InterfaceC1915180zwC interfaceC1915180zwC, CollectConsentParam collectConsentParam, PNSConsentCollectorServiceImpl pNSConsentCollectorServiceImpl, EnumC1876780ywG enumC1876780ywG) {
        super(0);
        this.LL = interfaceC1915190zwD;
        this.LLILLJJLI = interfaceC1915180zwC;
        this.LLILLL = collectConsentParam;
        this.LLILZ = pNSConsentCollectorServiceImpl;
        this.LLILZIL = enumC1876780ywG;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1915190zwD interfaceC1915190zwD = this.LL;
        if (interfaceC1915190zwD != null) {
            interfaceC1915190zwD.LIZIZ();
        }
        this.LLILLJJLI.LIZ();
        CollectConsentParam collectConsentParam = this.LLILLL;
        Integer num = collectConsentParam.consentActionOnDisplay;
        if (num != null) {
            PNSConsentCollectorServiceImpl pNSConsentCollectorServiceImpl = this.LLILZ;
            EnumC1876780ywG enumC1876780ywG = this.LLILZIL;
            InterfaceC1915180zwC interfaceC1915180zwC = this.LLILLJJLI;
            InterfaceC1915190zwD interfaceC1915190zwD2 = this.LL;
            int iIntValue = num.intValue();
            EnumC1876780ywG.Companion.getClass();
            EnumC1876780ywG[] enumC1876780ywGArrValues = EnumC1876780ywG.values();
            int length = enumC1876780ywGArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                EnumC1876780ywG enumC1876780ywG2 = enumC1876780ywGArrValues[i];
                if (enumC1876780ywG2.getI() == iIntValue) {
                    pNSConsentCollectorServiceImpl.LJIIIIZZ(collectConsentParam.consentKey, enumC1876780ywG, enumC1876780ywG2, collectConsentParam.flow, collectConsentParam.scenario, interfaceC1915180zwC, interfaceC1915190zwD2);
                    break;
                }
                i++;
            }
        }
        return Unit.LIZ;
    }
}
