package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.CPCState;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132560fZu extends C09AY implements Function2<InterfaceC960503pD, CPCState, Unit> {
    public final /* synthetic */ C259800zU<CountDownTimer> LL;
    public final /* synthetic */ C1133890fc3 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1132560fZu(C259800zU<CountDownTimer> c259800zU, C1133890fc3 c1133890fc3, boolean z, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12) {
        super(2);
        this.LL = c259800zU;
        this.LLILLJJLI = c1133890fc3;
        this.LLILLL = z;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.os.CountDownTimer] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC960503pD interfaceC960503pD, CPCState cPCState) {
        C1252540ihQ c1252540ihQ;
        AbstractC1252750ihl<CpcPromptResponse> task = cPCState.getTask();
        if ((task instanceof C1252540ihQ) && (c1252540ihQ = (C1252540ihQ) task) != null) {
            C259800zU<CountDownTimer> c259800zU = this.LL;
            C1133890fc3 c1133890fc3 = this.LLILLJJLI;
            boolean z = this.LLILLL;
            Function1<Boolean, Unit> function1 = this.LLILZ;
            Function1<Boolean, Unit> function12 = this.LLILZIL;
            EnumC1132600fZy enumC1132600fZy = EnumC1132600fZy.SCENE_1_GIFT_PANEL;
            CpcPromptResponse cpcPromptResponse = (CpcPromptResponse) c1252540ihQ.LIZ;
            c259800zU.element = C1132570fZv.LIZ(c1133890fc3, enumC1132600fZy, cpcPromptResponse.prompt, cpcPromptResponse.redirectLinkText, cpcPromptResponse.giftFaq, z, function1, function12, null);
            CpcPromptResponse cpcPromptResponse2 = (CpcPromptResponse) c1252540ihQ.LIZ;
            if (C500260Jjc.LJJIIZ(cpcPromptResponse2.prompt)) {
                InterfaceC1106030et7.e6.LJFF(cpcPromptResponse2);
            }
        }
        return Unit.LIZ;
    }
}
