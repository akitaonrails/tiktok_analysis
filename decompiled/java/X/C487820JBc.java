package X;

import com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse;
import com.ss.android.ugc.aweme.ttsvoice.viewmodel.TTSVoiceDetailsViewModel;
import com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import njp.a;

/* JADX INFO: renamed from: X.0JBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ttsvoice.viewmodel.TTSVoiceDetailsViewModel$fetchVoiceDetails$1", f = "TTSVoiceDetailsViewModel.kt", l = {64}, m = "invokeSuspend")
public final class C487820JBc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TTSVoiceDetailsViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487820JBc(TTSVoiceDetailsViewModel tTSVoiceDetailsViewModel, String str, InterfaceC1364105Vn<? super C487820JBc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tTSVoiceDetailsViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C487820JBc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSVoiceDetailsViewModel@703f.fetchVoiceDetails$1");
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
            InterfaceC487830JBd interfaceC487830JBd = (InterfaceC487830JBd) this.LLILLJJLI.LL.getValue().getOperator();
            String str = this.LLILLL;
            this.LL = 1;
            obj = interfaceC487830JBd.LJIILL(str, true, true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTSVoiceDetailsViewModel@703f.fetchVoiceDetails$1");
                return objLJFF;
            }
        }
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            TTSVoiceDetailsViewModel tTSVoiceDetailsViewModel = this.LLILLJJLI;
            tTSVoiceDetailsViewModel.setState(new AwS373S0200000_7(abstractC1623806Xk, (AbstractC1623806Xk<TTSVoiceDetailsResponse>) tTSVoiceDetailsViewModel, (TTSVoiceDetailsViewModel) 99));
        } else if (abstractC1623806Xk instanceof C491001vg) {
            this.LLILLJJLI.setState(new AwS586S0100000_7(abstractC1623806Xk, (AbstractC1623806Xk<VoiceConversionDetailsResponse>) 589));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSVoiceDetailsViewModel@703f.fetchVoiceDetails$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
