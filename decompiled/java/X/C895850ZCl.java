package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics", f = "IMChatRoomAnalytics.kt", l = {307, 437, 456}, m = "logEnterChat")
public final class C895850ZCl extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public IMUser LLJ;
    public Function1 LLJI;
    public Object LLJIJIL;
    public Object LLJILJIL;
    public Object LLJILJILJ;
    public Object LLJILLL;
    public Object LLJJ;
    public Object LLJJI;
    public Object LLJJIII;
    public Object LLJJIJI;
    public Object LLJJIJIIJIL;
    public Object LLJJIJIL;
    public Object LLJJJ;
    public Object LLJJJIL;
    public Object LLJJJJ;
    public Object LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public /* synthetic */ Object LLJL;
    public final /* synthetic */ IMChatRoomAnalytics LLJLIL;
    public int LLJLILLLLZIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C895850ZCl(IMChatRoomAnalytics iMChatRoomAnalytics, InterfaceC1364105Vn<? super C895850ZCl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJLIL = iMChatRoomAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMChatRoomAnalytics@6d9e.logEnterChat$1");
        this.LLJL = obj;
        this.LLJLILLLLZIIL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLJLIL.LJIIIIZZ(null, null, null, null, null, null, false, null, null, false, false, null, null, this);
        C1C7U.LIZIZ("IMChatRoomAnalytics@6d9e.logEnterChat$1");
        return objLJIIIIZZ;
    }
}
