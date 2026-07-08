package X;

import com.bytedance.keva.Keva;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.unreadmuf.ChatListUnreadMUFUpdater$behaviorRegistration$1$1$enterChatList$1", f = "ChatListUnreadMUFUpdater.kt", l = {}, m = "invokeSuspend")
public final class C881120YhS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C881110YhR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C881120YhS(C881110YhR c881110YhR, InterfaceC1364105Vn<? super C881120YhS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c881110YhR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C881120YhS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListUnreadMUFUpdater@bc58.behaviorRegistration$1$1$enterChatList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C881110YhR c881110YhR = this.LL;
        if (c881110YhR.LLJI) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListUnreadMUFUpdater@bc58.behaviorRegistration$1$1$enterChatList$1");
            return unit;
        }
        c881110YhR.LLJI = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Collection<C881130YhT> collectionValues = ((ConcurrentHashMap) this.LL.LLIZLLLIL.getValue()).values();
        C881110YhR c881110YhR2 = this.LL;
        for (C881130YhT c881130YhT : collectionValues) {
            if (c881110YhR2.LJIJJLI()) {
                if (!c881110YhR2.LLJILJIL && (!c881130YhT.LIZLLL.isEmpty())) {
                    c881110YhR2.LLJILJIL = true;
                    Keva keva = (Keva) c881110YhR2.LLJILJILJ.getValue();
                    String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    keva.storeLong(curUserId, jCurrentTimeMillis);
                }
                c881130YhT.LIZIZ = jCurrentTimeMillis;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListUnreadMUFUpdater@bc58.behaviorRegistration$1$1$enterChatList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
