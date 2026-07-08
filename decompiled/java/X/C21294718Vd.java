package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;

/* JADX INFO: renamed from: X.18Vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatInputFeatureComponent", f = "AiChatInputFeatureComponent.kt", l = {939}, m = "handleFollowInputs")
public final class C21294718Vd extends AbstractC23140094w {
    public AIChatGenNode LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C18VZ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21294718Vd(C18VZ c18vz, InterfaceC1364105Vn<? super C21294718Vd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c18vz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatInputFeatureComponent@26d0.handleFollowInputs$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objP6 = this.LLILLL.P6(null, this);
        C1C7U.LIZIZ("AiChatInputFeatureComponent@26d0.handleFollowInputs$1");
        return objP6;
    }
}
