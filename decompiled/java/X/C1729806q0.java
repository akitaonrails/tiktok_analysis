package X;

import com.ss.android.ugc.aweme.im.core.chatlist.api.ability.actor.IChatListMultiThreadActor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06q0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1729806q0 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1057));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2122008Ta());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1729906q1());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1730006q2());

    public static C09AE LIZ(InterfaceC879010Ye3 interfaceC879010Ye3, Function2 function2) {
        AnonymousClass0956 anonymousClass0956LIZ;
        if (C880900Yh6.LIZ()) {
            IChatListMultiThreadActor iChatListMultiThreadActor = (IChatListMultiThreadActor) LIZ.getValue();
            if (iChatListMultiThreadActor == null || (anonymousClass0956LIZ = iChatListMultiThreadActor.LIZ(interfaceC879010Ye3, function2)) == null) {
                return C23250099c.LIZLLL((InterfaceC497601wk) LIZLLL.getValue(), null, null, function2, 3);
            }
            return anonymousClass0956LIZ;
        }
        return C23250099c.LIZLLL((InterfaceC497601wk) LIZLLL.getValue(), null, null, function2, 3);
    }

    public static void LIZIZ(Function0 function0, boolean z) {
        if (C880900Yh6.LIZ()) {
            function0.invoke();
        } else if (!z && a0.LJJIIZI(C786410Ut5.u3().getName(), "ChatListActor", false)) {
            function0.invoke();
        } else {
            C23250099c.LIZLLL((InterfaceC497601wk) LIZLLL.getValue(), null, null, new C01LO(function0, null), 3);
        }
    }

    public static void LIZJ(InterfaceC879010Ye3 interfaceC879010Ye3, Function0 function0) {
        IChatListMultiThreadActor iChatListMultiThreadActor;
        if (C880900Yh6.LIZ() && (iChatListMultiThreadActor = (IChatListMultiThreadActor) LIZ.getValue()) != null) {
            iChatListMultiThreadActor.LIZIZ(interfaceC879010Ye3, function0);
        } else if (a0.LJJIIZI(C786410Ut5.u3().getName(), "ChatListActor", false)) {
            function0.invoke();
        } else {
            LIZ(interfaceC879010Ye3, new C05A4(function0, null));
        }
    }
}
