package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageKt;
import com.ss.android.ugc.tools.chat.message.compact.AiChatReadStateHandler;
import com.ss.android.ugc.tools.chat.message.compact.IMEventProtocolDispatcher;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0ZeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904770ZeV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final C904800ZeY LIZ;
    public final C904840Zec LIZIZ;
    public final C903950ZdB LIZJ = new C903950ZdB();
    public final C904790ZeX LIZLLL;
    public final C01GW LJ;
    public AiChatReadStateHandler LJFF;
    public final C904630ZeH LJI;
    public final IMEventProtocolDispatcher LJII;
    public C904680ZeM LJIIIIZZ;
    public volatile C21373518kf LJIIIZ;
    public volatile C0Z1W LJIIJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C904770ZeV.class, "conversationRepository", "getConversationRepository()Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C904770ZeV.class, "loadMoreAbility", "getLoadMoreAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/DefaultLoadMoreAbilityFactory;", 0);
        c09r3.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public C904770ZeV(C904800ZeY c904800ZeY, C904840Zec c904840Zec) {
        this.LIZ = c904800ZeY;
        this.LIZIZ = c904840Zec;
        C904790ZeX c904790ZeX = new C904790ZeX(this);
        this.LIZLLL = c904790ZeX;
        this.LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1306));
        this.LJI = new C904630ZeH(c904800ZeY.LIZIZ, C788920Ux8.LIZ);
        this.LJII = new IMEventProtocolDispatcher();
        c904790ZeX.get().refresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0Zf8] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.0Z1W] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final C904680ZeM LIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, LifecycleOwner lifecycleOwner, C905120Zf4 c905120Zf4, C905180ZfA c905180ZfA) {
        C899930ZSd c899930ZSd = new InterfaceC904830Zeb() { // from class: X.0ZSd
            @Override // X.InterfaceC904830Zeb
            public final InterfaceC899940ZSe get() {
                return new C899950ZSf() { // from class: X.0ZSc
                    @Override // X.InterfaceC899940ZSe
                    public final boolean LIZ(InterfaceC904740ZeS interfaceC904740ZeS, List list, AwS582S0100000_3 awS582S0100000_3, boolean z) {
                        if (interfaceC904740ZeS instanceof C06SA) {
                            C06SA c06sa = (C06SA) interfaceC904740ZeS;
                            if (!((Boolean) awS582S0100000_3.invoke(c06sa.LIZJ)).booleanValue() && c06sa.LIZJ.getMsgStatus() != 2 && c06sa.LIZJ.getMsgStatus() != 3) {
                                return true;
                            }
                            return false;
                        }
                        if (interfaceC904740ZeS instanceof C15626069w) {
                            C15626069w c15626069w = (C15626069w) interfaceC904740ZeS;
                            if (!FakeMessageKt.isFakeMessage(c15626069w.LIZIZ) && !((Boolean) awS582S0100000_3.invoke(c15626069w.LIZIZ)).booleanValue()) {
                                return true;
                            }
                            C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLZIJ(0, list);
                            if (c869590Y9l != null) {
                                if (C0ZDX.LJJIJL(c869590Y9l) || c869590Y9l.getMsgType() == 1813) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        if (interfaceC904740ZeS instanceof C06P6) {
                            return ((C06P6) interfaceC904740ZeS).LIZ;
                        }
                        return false;
                    }
                };
            }
        };
        C904840Zec c904840Zec = this.LIZIZ;
        C904780ZeW c904780ZeW = new C904780ZeW(c904840Zec.LIZIZ, c904840Zec.LIZJ, Collections.singletonList(this.LJII), Collections.singletonList(this.LJII));
        C0Z1W c0z1w = this.LJIIJ;
        ?? r8 = c0z1w;
        if (c0z1w == null) {
            synchronized (this) {
                C0Z1W c0z1w2 = this.LJIIJ;
                r8 = c0z1w2;
                if (c0z1w2 == null) {
                    final InterfaceC1755906uD interfaceC1755906uD = (InterfaceC1755906uD) this.LJ.getValue();
                    ?? r82 = new InterfaceC905160Zf8(interfaceC1755906uD) { // from class: X.0Z1W
                        public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
                        public final InterfaceC1755906uD LIZ;
                        public volatile C0Z1V LIZIZ;

                        static {
                            C2217381BqS c2217381BqS = new C2217381BqS(C0Z1W.class, "provider", "getProvider()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/DefaultLoadMoreAbility;", 0);
                            C13LE.LIZ.getClass();
                            LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
                        }

                        /* JADX WARN: Type inference failed for: r0v4, types: [X.0Z1V, X.0ZeO] */
                        @Override // X.InterfaceC905160Zf8
                        public final InterfaceC904700ZeO get() {
                            C0Z1V c0z1v = this.LIZIZ;
                            if (c0z1v == null) {
                                synchronized (this) {
                                    c0z1v = this.LIZIZ;
                                    if (c0z1v == null) {
                                        ?? r0 = new InterfaceC904700ZeO(this.LIZ) { // from class: X.0Z1V
                                            public final InterfaceC1755906uD LIZ;
                                            public final C2252321DDq LIZIZ;
                                            public final C2252321DDq LIZJ;
                                            public int LIZLLL;

                                            @Override // X.InterfaceC904700ZeO
                                            public final void C() {
                                                if (this.LIZ.LJJJJI()) {
                                                    return;
                                                }
                                                this.LIZ.LJ();
                                            }

                                            @Override // X.InterfaceC904700ZeO
                                            public final void Fj() {
                                                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LIZ.getConversationId());
                                                boolean zHasMore = c0y8tLIZ != null ? c0y8tLIZ.isStranger() ? false : c0y8tLIZ.hasMore() : true;
                                                if (!this.LIZ.LJIJ() || zHasMore) {
                                                    LJ(this.LIZ.LJJJJIZL());
                                                }
                                            }

                                            @Override // X.InterfaceC904700ZeO
                                            public final boolean LIZ() {
                                                return this.LIZ.LJIJ();
                                            }

                                            @Override // X.InterfaceC904700ZeO
                                            public final boolean LIZIZ() {
                                                return this.LIZ.LJJJJI();
                                            }

                                            @Override // X.InterfaceC904700ZeO
                                            public final void LIZJ() {
                                                int iLJJJJIZL = this.LIZ.LJJJJIZL();
                                                if (50 >= iLJJJJIZL) {
                                                    iLJJJJIZL = 50;
                                                }
                                                LJ(iLJJJJIZL + 1);
                                            }

                                            {
                                                this.LIZ = interfaceC1755906uD;
                                                C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC2006307tV.NORMAL_STATE);
                                                this.LIZIZ = c2252321DDqLIZ;
                                                this.LIZJ = c2252321DDqLIZ;
                                            }

                                            public final void LJ(int i) {
                                                Object value = this.LIZJ.getValue();
                                                EnumC2006307tV enumC2006307tV = EnumC2006307tV.LOAD_MORE_STATE;
                                                if (value == enumC2006307tV) {
                                                    return;
                                                }
                                                this.LIZLLL = this.LIZ.LJJJJIZL();
                                                this.LIZ.LJIIJJI(i);
                                                this.LIZIZ.setValue(enumC2006307tV);
                                                this.LIZ.LJIIJ();
                                            }

                                            @Override // X.InterfaceC904700ZeO
                                            public final void LIZLLL(List list, AwS558S0100000_14 awS558S0100000_14) {
                                                int i;
                                                if ((list instanceof Collection) && list.isEmpty()) {
                                                    return;
                                                }
                                                for (Object obj : list) {
                                                    if ((obj instanceof C1762006vC) || (obj instanceof C07U1)) {
                                                        if (this.LIZJ.getValue() == EnumC2006307tV.LOAD_MORE_STATE && (i = this.LIZLLL) > 0 && i != this.LIZ.LJJJJIZL()) {
                                                            this.LIZLLL = 0;
                                                            this.LIZ.LJIIJJI(0);
                                                        }
                                                        this.LIZIZ.setValue(EnumC2006307tV.NORMAL_STATE);
                                                        return;
                                                    }
                                                }
                                            }
                                        };
                                        this.LIZIZ = r0;
                                        return r0;
                                    }
                                }
                            }
                            return c0z1v;
                        }

                        {
                            this.LIZ = interfaceC1755906uD;
                        }
                    };
                    this.LJIIJ = r82;
                    r8 = r82;
                }
            }
        }
        C904680ZeM c904680ZeM = new C904680ZeM(c905120Zf4, c904780ZeW, c899930ZSd, r8, C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(356)));
        if (c905180ZfA != null) {
            c905180ZfA.LJIIIIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(c904680ZeM, 1046));
            c904680ZeM.LJFF.add((IMessageEventProtocol) c905180ZfA.LJII.getValue());
        }
        ((InterfaceC903650Zch) c904680ZeM.LJII.getValue()).init();
        C1558520qew.LJII(C1558360qeg.LJ(viewOnAttachStateChangeListenerC20604515jv, null), c904680ZeM.LIZ(), MessageListScrollAbility.class, null, lifecycleOwner);
        C1558520qew.LJII(C1558360qeg.LJ(viewOnAttachStateChangeListenerC20604515jv, null), c904680ZeM.LIZ(), ChatroomEventAbility.class, null, lifecycleOwner);
        return c904680ZeM;
    }
}
