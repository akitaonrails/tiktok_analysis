package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521410Kcd extends C09AY implements Function2<C03H5, AbstractC521460Kci, Unit> {
    public final /* synthetic */ IPcsLoadingAbility LL;
    public final /* synthetic */ PcsServiceBioFragmentV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521410Kcd(IPcsLoadingAbility iPcsLoadingAbility, PcsServiceBioFragmentV2 pcsServiceBioFragmentV2) {
        super(2);
        this.LL = iPcsLoadingAbility;
        this.LLILLJJLI = pcsServiceBioFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, AbstractC521460Kci abstractC521460Kci) {
        int iIntValue;
        Integer num;
        AbstractC521460Kci abstractC521460Kci2 = abstractC521460Kci;
        if (abstractC521460Kci2 instanceof C521440Kcg) {
            IPcsLoadingAbility iPcsLoadingAbility = this.LL;
            if (iPcsLoadingAbility != null) {
                iPcsLoadingAbility.LJLJLJ();
            }
        } else if (!(abstractC521460Kci2 instanceof C1156490gCV) && (abstractC521460Kci2 instanceof C521420Kce)) {
            IPcsLoadingAbility iPcsLoadingAbility2 = this.LL;
            if (iPcsLoadingAbility2 != null) {
                iPcsLoadingAbility2.Ly2(C1734970vFX.LIZIZ(R.drawable.n7, 2131851924, 2131851936, new C521300KcS(this.LLILLJJLI)), new C521400Kcc(this.LLILLJJLI), Float.valueOf(160.0f));
            }
            C521420Kce c521420Kce = (C521420Kce) abstractC521460Kci2;
            int i = c521420Kce.LIZ;
            Throwable th = c521420Kce.LIZIZ;
            C1822330xWR c1822330xWRNR = this.LLILLJJLI.NR();
            if (c1822330xWRNR != null && (num = c1822330xWRNR.LLJJL) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
            if (interfaceC517590KRpLIZJ != null) {
                interfaceC517590KRpLIZJ.LJI(new C0JOM(iIntValue, String.valueOf(i), th));
            }
        }
        return Unit.LIZ;
    }
}
