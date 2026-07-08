package X;

import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageInfo;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS82S1000000_32;

/* JADX INFO: renamed from: X.18KI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18KI extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Object LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18KI(Object obj) {
        super(1);
        this.LL = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C18KG c18kg = C18KG.LIZ;
            do {
                FcpPageNode fcpPageNodePop = c18kg.LIZJ().pop();
                if (fcpPageNodePop != null) {
                    C18KG.LIZIZ(fcpPageNodePop, "back_to_feed");
                }
            } while (c18kg.LIZJ().size() > 0);
        } else {
            C18KJ c18kj = C18KJ.LIZ;
            Object obj = this.LL;
            c18kj.getClass();
            if (obj != null) {
                C18KP c18kp = new C18KP(null, 0, obj, null, null, null);
                final AwS82S1000000_32 awS82S1000000_32 = new AwS82S1000000_32("", 15);
                new C20673615v4(C1697810uHb.LJIIJJI(C18KO.LIZ, new InterfaceC20673715v5<C18KP>() { // from class: X.18KN
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC20673715v5
                    public final void LIZ(C20673615v4 c20673615v4) {
                        FcpPageNode second;
                        T t = c20673615v4.LIZIZ;
                        FcpPageInfo fcpPageInfo = ((C18KP) t).LJI;
                        if (fcpPageInfo == null) {
                            return;
                        }
                        C18KP c18kp2 = (C18KP) t;
                        Pair<Integer, FcpPageNode> pairLIZLLL = C18KG.LIZ.LIZLLL(new AwS611S0100000_32(fcpPageInfo, 339));
                        if (pairLIZLLL != null) {
                            second = pairLIZLLL.getSecond();
                        } else {
                            second = null;
                        }
                        c18kp2.LJII = second;
                        c20673615v4.LIZ();
                    }
                }, new InterfaceC20673715v5<C18KP>(awS82S1000000_32) { // from class: X.18KK
                    public final Function1<FcpPageInfo, Unit> LIZ;

                    {
                        this.LIZ = awS82S1000000_32;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC20673715v5
                    public final void LIZ(C20673615v4 c20673615v4) {
                        C19EG c19eg;
                        FcpPageNode fcpPageNode = ((C18KP) c20673615v4.LIZIZ).LJII;
                        if (fcpPageNode == null || (!fcpPageNode.getFrameIds().isEmpty())) {
                            return;
                        }
                        Object obj2 = ((C18KP) c20673615v4.LIZIZ).LIZ;
                        if (obj2 instanceof C19EG) {
                            c19eg = (C19EG) obj2;
                        } else {
                            c19eg = null;
                        }
                        C18KJ.LIZ.getClass();
                        C18K7 c18k7 = C18KJ.LIZLLL.get(fcpPageNode.getInfo().getPageId());
                        if (c19eg != null && c18k7 != null) {
                            c19eg.getSupportFragmentManager().LLIILZL(c18k7);
                        }
                        FcpPageInfo fcpPageInfo = ((C18KP) c20673615v4.LIZIZ).LJI;
                        if (fcpPageInfo == null) {
                            return;
                        }
                        this.LIZ.invoke(fcpPageInfo);
                        c20673615v4.LIZ();
                    }
                }), 0, c18kp).LIZ();
            }
        }
        return Unit.LIZ;
    }
}
