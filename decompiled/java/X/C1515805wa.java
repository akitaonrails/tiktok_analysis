package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.typing.ChatListTypingUpdater$onUpdateGroupChat$1$2$1$1$2", f = "ChatListTypingUpdater.kt", l = {}, m = "invokeSuspend")
public final class C1515805wa extends C09AX implements InterfaceC1631620sYq<List<? extends C1808590xAH>, Integer, InterfaceC1364105Vn<? super String>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ int LLILLJJLI;

    public C1515805wa(InterfaceC1364105Vn<? super C1515805wa> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1808590xAH c1808590xAH;
        C1C7U.LIZ("ChatListTypingUpdater@d1d6.onUpdateGroupChat$1$2$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        String str = null;
        if (this.LLILLJJLI != 0 && (c1808590xAH = (C1808590xAH) C13LP.LJJJLL(list)) != null) {
            str = c1808590xAH.LIZ;
        }
        C1C7U.LIZIZ("ChatListTypingUpdater@d1d6.onUpdateGroupChat$1$2$1$1$2");
        return str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends C1808590xAH> list, Integer num, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C1515805wa c1515805wa = new C1515805wa(interfaceC1364105Vn);
        c1515805wa.LL = list;
        c1515805wa.LLILLJJLI = iIntValue;
        return c1515805wa.invokeSuspend(Unit.LIZ);
    }
}
