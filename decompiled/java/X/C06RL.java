package X;

import Y.AgS283S0100000_2;

/* JADX INFO: renamed from: X.06RL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem$onViewCreated$2$invokeSuspend$$inlined$map$1$2", f = "ChatroomEmojiPanelAssem.kt", l = {224, 223}, m = "emit")
public final class C06RL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS283S0100000_2 LLILZ;
    public boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06RL(AgS283S0100000_2 agS283S0100000_2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS283S0100000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
