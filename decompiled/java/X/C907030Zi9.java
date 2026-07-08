package X;

import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zi9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907030Zi9 {
    public static final C907050ZiB LJFF = new C907050ZiB();
    public static final C01GW<C907030Zi9> LJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(419));
    public final Function1<InterfaceC908170Zjz, Unit> LIZ;
    public final Function1<C1758406uc, InterfaceC1755906uD> LIZIZ;
    public final ConcurrentHashMap<String, InterfaceC1755906uD> LIZJ;
    public final AtomicBoolean LIZLLL;
    public final C907040ZiA LJ;

    public C907030Zi9() {
        this(null);
    }

    public final void LIZLLL() {
        if (this.LIZLLL.compareAndSet(false, true)) {
            this.LIZ.invoke(this.LJ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ZiA] */
    public C907030Zi9(Object obj) {
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(430);
        C1757906uX c1757906uX = new C1757906uX(LJFF);
        this.LIZ = aFwS248S0000000_14;
        this.LIZIZ = c1757906uX;
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new InterfaceC908170Zjz() { // from class: X.0ZiA
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (!z) {
                    return;
                }
                if (i != 2 && i != 3) {
                    return;
                }
                this.LL.LIZJ.clear();
            }
        };
    }

    public final void LIZJ(EnterChatParams enterChatParams) {
        boolean z;
        LIZLLL();
        String sessionId = enterChatParams.getSessionId();
        if (sessionId == null) {
            return;
        }
        boolean zContainsKey = this.LIZJ.containsKey(sessionId);
        ConcurrentHashMap<String, InterfaceC1755906uD> concurrentHashMap = this.LIZJ;
        InterfaceC1755906uD interfaceC1755906uDInvoke = concurrentHashMap.get(sessionId);
        if (interfaceC1755906uDInvoke == null) {
            Function1<C1758406uc, InterfaceC1755906uD> function1 = this.LIZIZ;
            String sessionId2 = enterChatParams.getSessionId();
            String str = "";
            if (sessionId2 == null) {
                sessionId2 = "";
            }
            boolean z2 = false;
            if (enterChatParams.getChatType() == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean zIsReportPage = enterChatParams.isReportPage();
            Long searchTargetIndex = enterChatParams.getSearchTargetIndex();
            if (enterChatParams.getEntranceType() == 2) {
                z2 = true;
            }
            String uuid = enterChatParams.getUuid();
            IMAIServiceAPI.LIZ.getClass();
            InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
            String sessionId3 = enterChatParams.getSessionId();
            if (sessionId3 != null) {
                str = sessionId3;
            }
            interfaceC1755906uDInvoke = function1.invoke(new C1758406uc(sessionId2, z, zIsReportPage, searchTargetIndex, z2, uuid, interfaceC1693306k7LIZ.LJIL(str), enterChatParams.isPreviewMode()));
            InterfaceC1755906uD interfaceC1755906uDPutIfAbsent = concurrentHashMap.putIfAbsent(sessionId, interfaceC1755906uDInvoke);
            if (interfaceC1755906uDPutIfAbsent != null) {
                interfaceC1755906uDInvoke = interfaceC1755906uDPutIfAbsent;
            }
        }
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MModelTrace prepare key=");
            sbLIZ.append(sessionId);
            sbLIZ.append(" cacheHit=");
            sbLIZ.append(zContainsKey);
            sbLIZ.append(" model=");
            sbLIZ.append(System.identityHashCode(interfaceC1755906uDInvoke));
            iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final InterfaceC1755906uD LIZ(SessionInfo sessionInfo, boolean z) {
        boolean z2;
        Integer numValueOf;
        LIZLLL();
        if (sessionInfo.isFromSearch() && (Intrinsics.LJFF(sessionInfo.getInboxSearchTabName(), "history") || Intrinsics.LJFF(sessionInfo.getInboxSearchTabName(), "detail_media_grid"))) {
            return this.LIZIZ.invoke(new C1758406uc(sessionInfo));
        }
        InterfaceC1755906uD interfaceC1755906uDInvoke = this.LIZJ.get(sessionInfo.getConversationId());
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sb = new StringBuilder("MModelTrace getOrCreate(sessionInfo) key=");
            sb.append(sessionInfo.getConversationId());
            sb.append(" cacheHit=");
            if (interfaceC1755906uDInvoke != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            sb.append(" model=");
            if (interfaceC1755906uDInvoke != null) {
                numValueOf = Integer.valueOf(System.identityHashCode(interfaceC1755906uDInvoke));
            } else {
                numValueOf = null;
            }
            sb.append(numValueOf);
            iMALogApiLIZ.LIZ(4, "IM-Chatroom", sb.toString());
        }
        if (interfaceC1755906uDInvoke == null) {
            interfaceC1755906uDInvoke = this.LIZIZ.invoke(new C1758406uc(sessionInfo));
            if (z) {
                this.LIZJ.put(sessionInfo.getConversationId(), interfaceC1755906uDInvoke);
            }
        }
        return interfaceC1755906uDInvoke;
    }

    public final InterfaceC1755906uD LIZIZ(String str, int i, boolean z, Long l, boolean z2) {
        boolean z3;
        Integer numValueOf;
        LIZLLL();
        InterfaceC1755906uD interfaceC1755906uDInvoke = this.LIZJ.get(str);
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        boolean z4 = true;
        if (iMALogApiLIZ != null) {
            StringBuilder sb = new StringBuilder("MModelTrace getOrCreate(convId) key=");
            sb.append(str);
            sb.append(" cacheHit=");
            if (interfaceC1755906uDInvoke != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            sb.append(z3);
            sb.append(" model=");
            if (interfaceC1755906uDInvoke != null) {
                numValueOf = Integer.valueOf(System.identityHashCode(interfaceC1755906uDInvoke));
            } else {
                numValueOf = null;
            }
            sb.append(numValueOf);
            iMALogApiLIZ.LIZ(4, "IM-Chatroom", sb.toString());
        }
        if (interfaceC1755906uDInvoke == null) {
            Function1<C1758406uc, InterfaceC1755906uD> function1 = this.LIZIZ;
            if (i != 3) {
                z4 = false;
            }
            IMAIServiceAPI.LIZ.getClass();
            interfaceC1755906uDInvoke = function1.invoke(new C1758406uc(str, z4, z, l, false, "", AnonymousClass0629.LIZ().LIZ().LJIL(str), false));
            if (z2) {
                this.LIZJ.put(str, interfaceC1755906uDInvoke);
            }
        }
        return interfaceC1755906uDInvoke;
    }
}
