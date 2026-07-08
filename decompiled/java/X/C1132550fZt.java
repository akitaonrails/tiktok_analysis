package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0fZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132550fZt extends C09AY implements Function2<InterfaceC960503pD, AbstractC1252750ihl<? extends CpcPromptResponse>, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ TextView LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1132550fZt(boolean z, C16F5 c16f5, C16F5 c16f52, AwS383S0200000_17 awS383S0200000_17) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = c16f5;
        this.LLILLL = c16f52;
        this.LLILZ = awS383S0200000_17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC960503pD interfaceC960503pD, AbstractC1252750ihl<? extends CpcPromptResponse> abstractC1252750ihl) {
        C1252540ihQ c1252540ihQ;
        AbstractC1252750ihl<? extends CpcPromptResponse> abstractC1252750ihl2 = abstractC1252750ihl;
        if ((abstractC1252750ihl2 instanceof C1252540ihQ) && (c1252540ihQ = (C1252540ihQ) abstractC1252750ihl2) != null && C500260Jjc.LJJIIZ(((CpcPromptResponse) c1252540ihQ.LIZ).prompt)) {
            boolean z = this.LL;
            TextView textView = this.LLILLJJLI;
            TextView textView2 = this.LLILLL;
            Function1<Boolean, Unit> function1 = this.LLILZ;
            CpcPromptResponse cpcPromptResponse = (CpcPromptResponse) c1252540ihQ.LIZ;
            C1132570fZv.LIZJ(z, cpcPromptResponse.prompt, textView, textView2, cpcPromptResponse.redirectLinkText);
            CpcPromptResponse cpcPromptResponse2 = (CpcPromptResponse) c1252540ihQ.LIZ;
            if (C500260Jjc.LJJIIZ(cpcPromptResponse2.prompt)) {
                InterfaceC1106030et7.e6.LJFF(cpcPromptResponse2);
            }
            function1.invoke(Boolean.TRUE);
        } else {
            this.LLILZ.invoke(Boolean.FALSE);
        }
        return Unit.LIZ;
    }
}
