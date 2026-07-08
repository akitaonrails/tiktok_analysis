package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wY0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784860wY0 extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ PcsServiceBioContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784860wY0(PcsServiceBioContentAssem pcsServiceBioContentAssem) {
        super(1);
        this.LL = pcsServiceBioContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        C1782070wTV c1782070wTV;
        Long l2;
        long jLongValue = l.longValue();
        List<? extends InterfaceC1782150wTd> list = this.LL.ip().LLJI;
        InterfaceC1822900xXM interfaceC1822900xXMLIZIZ = C1822530xWl.LIZIZ(list);
        if ((interfaceC1822900xXMLIZIZ instanceof C1782070wTV) && (l2 = (c1782070wTV = (C1782070wTV) interfaceC1822900xXMLIZIZ).LJIIIIZZ) != null && l2.longValue() == jLongValue) {
            ArrayList arrayList = new ArrayList(list);
            ListProtector.set(arrayList, 0, new C1782070wTV(c1782070wTV.LIZ, c1782070wTV.LIZIZ, c1782070wTV.LIZJ, c1782070wTV.LIZLLL, 2131855826, c1782070wTV.LJFF, c1782070wTV.LJI, c1782070wTV.LJII, c1782070wTV.LJIIIIZZ, c1782070wTV.LJIIIZ, c1782070wTV.LJIIJ, c1782070wTV.LJIIJJI, c1782070wTV.LJIIL));
            list = arrayList;
        }
        C1784870wY1 c1784870wY1 = this.LL.ip().getState().LLILLJJLI;
        if (c1784870wY1 != null) {
            C1784870wY1 c1784870wY12 = new C1784870wY1(list, c1784870wY1.LIZIZ, c1784870wY1.LIZJ);
            PcsServiceBioContentAssem pcsServiceBioContentAssem = this.LL;
            pcsServiceBioContentAssem.ip().setState(new C0KUX(c1784870wY12));
            pcsServiceBioContentAssem.sp(c1784870wY12);
        }
        return Unit.LIZ;
    }
}
