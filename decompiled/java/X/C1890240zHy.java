package X;

import Y.AgS211S0200000_28;

/* JADX INFO: renamed from: X.0zHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.common.component.AiChatSaveComponent$saveToGallery$$inlined$transform$1$1", f = "AiChatSaveComponent.kt", l = {226, 229, 232, 233, 235, 238, 242}, m = "emit")
public final class C1890240zHy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS211S0200000_28 LLILLL;
    public Object LLILZ;
    public InterfaceC346701Wf LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890240zHy(AgS211S0200000_28 agS211S0200000_28, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS211S0200000_28;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatSaveComponent@8e0a.saveToGallery$$inlined$transform$1$1$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AiChatSaveComponent@8e0a.saveToGallery$$inlined$transform$1$1$1");
        return objEmit;
    }
}
