package X;

import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;
import com.ss.android.ugc.aweme.voiceconversion.viewmodel.VoiceConversionConversionDetailsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import njp.a;

/* JADX INFO: renamed from: X.0JBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.voiceconversion.viewmodel.VoiceConversionConversionDetailsViewModel$fetchVoiceDetails$1", f = "VoiceConversionConversionDetailsViewModel.kt", l = {68}, m = "invokeSuspend")
public final class C487840JBe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VoiceConversionConversionDetailsViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487840JBe(VoiceConversionConversionDetailsViewModel voiceConversionConversionDetailsViewModel, String str, InterfaceC1364105Vn<? super C487840JBe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = voiceConversionConversionDetailsViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C487840JBe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceConversionConversionDetailsViewModel@65c6.fetchVoiceDetails$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC487850JBf interfaceC487850JBf = (InterfaceC487850JBf) this.LLILLJJLI.LL.getValue().getOperator();
            String str = this.LLILLL;
            this.LL = 1;
            obj = interfaceC487850JBf.LJIILL(str, true, true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VoiceConversionConversionDetailsViewModel@65c6.fetchVoiceDetails$1");
                return objLJFF;
            }
        }
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            VoiceConversionConversionDetailsViewModel voiceConversionConversionDetailsViewModel = this.LLILLJJLI;
            voiceConversionConversionDetailsViewModel.setState(new AwS373S0200000_7(abstractC1623806Xk, (AbstractC1623806Xk<VoiceConversionDetailsResponse>) voiceConversionConversionDetailsViewModel, (VoiceConversionConversionDetailsViewModel) 34));
        } else if (abstractC1623806Xk instanceof C491001vg) {
            this.LLILLJJLI.setState(new AwS586S0100000_7(abstractC1623806Xk, (AbstractC1623806Xk<VoiceConversionDetailsResponse>) 335));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceConversionConversionDetailsViewModel@65c6.fetchVoiceDetails$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
