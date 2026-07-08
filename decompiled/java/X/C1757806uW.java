package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06uW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1757806uW implements InterfaceC1755906uD {
    public final InterfaceC1755906uD LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public C1758306ub LJ;
    public boolean LJFF;
    public final C1DW7 LJI;
    public final boolean LJII;

    @Override // X.InterfaceC1755906uD
    public final Object LIZIZ(C912530Zr1 c912530Zr1) {
        return this.LIZIZ.LIZIZ(c912530Zr1);
    }

    @Override // X.InterfaceC1755906uD
    public final void LIZJ(long j) {
        this.LIZIZ.LIZJ(j);
    }

    @Override // X.InterfaceC1755906uD
    public final List<C869590Y9l> LIZLLL() {
        return this.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJ() {
        this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJI() {
        return this.LIZIZ.LJI();
    }

    @Override // X.InterfaceC1755906uD
    public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
        return this.LIZIZ.LJII(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1755906uD
    public final C869590Y9l LJIIIIZZ() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJIIIZ() {
        return this.LIZIZ.LJIIIZ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIJ() {
        this.LIZIZ.LJIIJ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIJJI(int i) {
        this.LIZIZ.LJIIJJI(i);
    }

    @Override // X.InterfaceC1755906uD
    public final void LJIIL() {
        this.LIZIZ.LJIIL();
    }

    @Override // X.InterfaceC1755906uD
    public final C869590Y9l LJIILJJIL() {
        return this.LIZIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJIJ() {
        return this.LIZIZ.LJIJ();
    }

    @Override // X.InterfaceC1755906uD
    public final void LJJIZ() {
        this.LJ = null;
        if (this.LJII) {
            LJFF(this.LJI);
        }
        this.LIZIZ.LJJIZ();
    }

    @Override // X.InterfaceC1755906uD
    public final boolean LJJJJI() {
        return this.LIZIZ.LJJJJI();
    }

    @Override // X.InterfaceC1755906uD
    public final int LJJJJIZL() {
        return this.LIZIZ.LJJJJIZL();
    }

    @Override // X.InterfaceC1755906uD
    public final String getConversationId() {
        return this.LIZIZ.getConversationId();
    }

    @Override // X.InterfaceC1755906uD
    public final void refresh() {
        this.LIZIZ.refresh();
    }

    @Override // X.InterfaceC1755906uD
    public final void resume() {
        this.LIZIZ.resume();
    }

    @Override // X.InterfaceC1755906uD
    public final void stop() {
        this.LIZIZ.stop();
    }

    @Override // X.InterfaceC1755906uD
    public final void LIZ(C1DW6 c1dw6) {
        Long lValueOf;
        final String str;
        if (this.LJII) {
            this.LIZIZ.LIZ(c1dw6);
        } else {
            ((CopyOnWriteArrayList) this.LJI.LLILLJJLI).add(c1dw6);
        }
        C1758306ub c1758306ub = this.LJ;
        if (c1758306ub != null) {
            c1dw6.a(c1758306ub.LIZIZ, c1758306ub.LIZJ, new ArrayList(this.LIZIZ.LIZLLL()), c1758306ub.LIZLLL);
        }
        if (!this.LIZJ && !this.LJFF) {
            this.LJFF = true;
            String conversationId = getConversationId();
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId);
            if (c0y8tLIZ != null) {
                lValueOf = Long.valueOf(c0y8tLIZ.getUnreadCount());
            } else {
                lValueOf = null;
            }
            final String strValueOf = String.valueOf(lValueOf);
            C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
            C1512805w6 c1512805w6 = new C1512805w6("message_model_refresh2register", conversationId);
            if (this.LJ != null) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c1366690lfX.LIZJ(c1512805w6, new AbstractC1493005su(str, strValueOf) { // from class: X.00jI
                public final String LIZLLL;
                public final String LJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C159400jI)) {
                        return false;
                    }
                    C159400jI c159400jI = (C159400jI) obj;
                    return Intrinsics.LJFF(this.LIZLLL, c159400jI.LIZLLL) && Intrinsics.LJFF(this.LJ, c159400jI.LJ);
                }

                public final int hashCode() {
                    int iHashCode = this.LIZLLL.hashCode() * 31;
                    String str2 = this.LJ;
                    return iHashCode + (str2 == null ? 0 : str2.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MessageModelFirstRegisterEvent(isOnQueryMessageEventFired=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", unreadCount=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    super(C2097608Jq.LJIIIIZZ(new Pair("isFirstOnQueryMessageEventFire", str), new Pair("unreadCount", strValueOf)), null, null, 6);
                    this.LIZLLL = str;
                    this.LJ = strValueOf;
                }
            });
        }
    }

    @Override // X.InterfaceC1755906uD
    public final void LJFF(C1DW6 c1dw6) {
        this.LJ = null;
        this.LIZIZ.LJFF(c1dw6);
    }

    public C1757806uW(InterfaceC1755906uD interfaceC1755906uD, boolean z, String str) {
        this.LIZIZ = interfaceC1755906uD;
        this.LIZJ = z;
        this.LIZLLL = str;
        C1DW7 c1dw7 = new C1DW7(new C1DW6() { // from class: X.06uZ
            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Jk(C869590Y9l c869590Y9l, int i) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void LLILZ(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Re(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
            }

            @Override // X.C1DW6
            public final void VD0(C1DW6 c1dw6) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void mf(C869590Y9l c869590Y9l) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void nc(List<? extends C869590Y9l> list) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void ns(String str2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void su(C869590Y9l c869590Y9l, boolean z2) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void u6(List<C869590Y9l> list, boolean z2) {
            }

            @Override // X.C1DW6
            public final void yf1(C1DW6 c1dw6) {
            }

            @Override // X.C1DW6, X.InterfaceC868420Y4y
            public final void a(int i, String str2, List list, Long l) {
                C1757806uW c1757806uW = this.LL;
                if (!c1757806uW.LIZJ && c1757806uW.LJ == null) {
                    DurationPerfMon.LIZ.LIZJ(new C1512805w6("message_model_refresh2first_on_query_msg_event", c1757806uW.getConversationId()), new AbstractC1493005su(this.LL.LIZLLL) { // from class: X.00jF
                        public final String LIZLLL;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C159100jF) && Intrinsics.LJFF(this.LIZLLL, ((C159100jF) obj).LIZLLL);
                        }

                        public final int hashCode() {
                            return this.LIZLLL.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("MessageModelReceivedEvent(unreadCount=");
                            sbLIZ.append(this.LIZLLL);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            super(C2097908Jt.LIZJ(new Pair("unreadCount", str)), null, null, 6);
                            this.LIZLLL = str;
                        }
                    });
                }
                C1757806uW c1757806uW2 = this.LL;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                c1757806uW2.LJ = new C1758306ub(i, str2, list, l);
            }
        });
        this.LJI = c1dw7;
        this.LJII = ((Boolean) C1758806ug.LIZ.getValue()).booleanValue();
        interfaceC1755906uD.LIZ(c1dw7);
    }
}
