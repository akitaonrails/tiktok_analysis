package X;

import android.os.SystemClock;
import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y59, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y59 implements InterfaceC863630XuL {
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final InterfaceC863850Xuh LIZJ;
    public final C0D2S<SendMessageResponseBody> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new C0Y53(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C0Y5I(this));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1805));
    public final C01GW LJII = C452501pT.LIZIZ(new C0Y5H(this));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C0Y5K(this));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C0Y5A(this));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C0Y54(this));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C0Y5F(this));
    public final C01GW LJIIL = C452501pT.LIZIZ(new C0Y58(this));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new C0Y5E(this));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C0Y5D(this));
    public final C01GW LJIILL = C452501pT.LIZIZ(new C0Y56(this));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new C0Y5O(this));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new C0Y5N(this));
    public final C01GW LJIJ = C452501pT.LIZIZ(new C0Y5B(this));
    public final C01GW LJIJI = C452501pT.LIZIZ(new C0Y5C(this));
    public final C01GW LJIJJ = C452501pT.LIZIZ(new C0Y5M(this));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(new C0Y5L(this));
    public final C01GW LJIL = C452501pT.LIZIZ(new C0Y5G(this));
    public final C01GW LJJ = C452501pT.LIZIZ(new C0Y57(this));
    public final C01GW LJJI = C452501pT.LIZIZ(new C0Y55(this));
    public final C01GW LJJIFFI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1810));
    public final C01GW LJJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1811));
    public final C01GW LJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1806));
    public final C01GW LJJIIJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1809));
    public final C01GW LJJIIJZLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1808));
    public final C01GW LJJIIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1807));
    public final C01GW LJJIIZI = C452501pT.LIZIZ(new C0Y5J(this));
    public final C01GW LJJIJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1804));
    public final C01GW LJJIJIIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1803));
    public final Map<Integer, InterfaceC871300YGa> LJJIJIIJIL = new LinkedHashMap();

    @Override // X.InterfaceC863630XuL
    public final C864700Xw4 LIZ() {
        return (C864700Xw4) this.LJ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0Y77 LIZIZ() {
        return (C0Y77) this.LJFF.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C867340Y0u LIZJ() {
        return (C867340Y0u) this.LJIILL.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final InterfaceC873460YOi LIZLLL() {
        return (InterfaceC873460YOi) this.LJIJJLI.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C864350XvV LJ() {
        return (C864350XvV) this.LJJIIJ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0Y4D LJFF() {
        return (C0Y4D) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final InterfaceC863720XuU LJI() {
        return (InterfaceC863720XuU) this.LJIIZILJ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C869090Y7n LJII() {
        return (C869090Y7n) this.LJJIIJZLJL.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0VS9 LJIIIIZZ() {
        return (C0VS9) this.LJIILLIIL.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C869080Y7m LJIIIZ() {
        return (C869080Y7m) this.LJJIJIIJI.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C873220YNk LJIIJ() {
        return (C873220YNk) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0YMY LJIIJJI() {
        return (C0YMY) this.LJIILJJIL.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0Y3S LJIILIIL() {
        return (C0Y3S) this.LJIJ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C873140YNc LJIILJJIL() {
        return (C873140YNc) this.LJJIFFI.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C864340XvU LJIILL() {
        return (C864340XvU) this.LJJI.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final InterfaceC863890Xul LJIIZILJ() {
        return (InterfaceC863890Xul) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0Y8C LJIJ() {
        return (C0Y8C) this.LJJIIZ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0YCE LJIJI() {
        return (C0YCE) this.LJJIJ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C871440YGo LJIJJ() {
        return (C871440YGo) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0YGW LJIJJLI() {
        return (C0YGW) this.LJII.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C867910Y2z LJIL() {
        return (C867910Y2z) this.LJIIL.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final InterfaceC862620Xsi LJJ() {
        return (InterfaceC862620Xsi) this.LJIJJ.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final C0YD1 LJJI() {
        return (C0YD1) this.LJIL.getValue();
    }

    @Override // X.InterfaceC863630XuL
    public final void clear() {
        Iterator it2 = ((LinkedHashMap) this.LJJIJIIJIL).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC871300YGa) ((Map.Entry) it2.next()).getValue()).clear();
        }
        ((LinkedHashMap) this.LJJIJIIJIL).clear();
    }

    @Override // X.InterfaceC863630XuL
    public final C0D2S<SendMessageResponseBody> LJIIL() {
        return this.LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.0Y8M] */
    @Override // X.InterfaceC863630XuL
    public final InterfaceC871300YGa LJIILLIIL(int i, final InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Boolean, ? super C0YK7, Unit> interfaceC1631630sYr) {
        Map<Integer, InterfaceC871300YGa> map = this.LJJIJIIJIL;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c872150YJh = linkedHashMap.get(numValueOf);
        if (c872150YJh == null) {
            final C0YEM c0yem = this.LIZIZ;
            final C0Y77 c0y77LIZIZ = LIZIZ();
            final C0Y7J c0y7j = (C0Y7J) this.LJI.getValue();
            final C0YKU c0yku = (C0YKU) this.LJIIIZ.getValue();
            final InterfaceC497601wk interfaceC497601wkLIZJ = this.LIZIZ.LIZJ();
            C1DFH c1dfh = C0PEM.LIZ;
            final AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            final C868200Y4c c868200Y4c = c0yem.LJIIZILJ().getDomain().LIZ;
            final C0Y60 c0y60LIZ = c0yem.LJIIZILJ().LIZLLL().LIZ();
            final C0Y1U c0y1uLIZLLL = c0yem.LJIIZILJ().LIZLLL().LIZLLL();
            final C0Y8O c0y8o = new C0Y8O(c0yem, i, interfaceC497601wkLIZJ);
            c872150YJh = new C872150YJh(c0yem, i, new InterfaceC872250YJr(c0yem, abstractC2238408pq, interfaceC497601wkLIZJ, c0y77LIZIZ, c0yku, c868200Y4c, c0y60LIZ, c0y1uLIZLLL, interfaceC1631630sYr, c0y8o, c0y7j) { // from class: X.0Y8M
                public final C0YEM LIZ;
                public final AbstractC2252651DEx LIZIZ;
                public final InterfaceC497601wk LIZJ;
                public final C0Y77 LIZLLL;
                public final C0YKU LJ;
                public final C868200Y4c LJFF;
                public final InterfaceC866720XzK LJI;
                public final C0Y1U LJII;
                public final InterfaceC1631630sYr<Integer, Integer, Boolean, C0YK7, Unit> LJIIIIZZ;
                public final C0Y8O LJIIIZ;
                public final C0Y7J LJIIJ;
                public final InterfaceC872010YIt LJIIJJI;

                @Override // X.InterfaceC872250YJr
                public final AbstractC2252651DEx LJI() {
                    return this.LIZ.LJIIIIZZ().LIZIZ();
                }

                @Override // X.InterfaceC872250YJr
                public final InterfaceC869500Y9c LJIIL() {
                    return this.LIZ.LJIIZILJ().LIZIZ().LIZJ();
                }

                @Override // X.InterfaceC872250YJr
                public final InterfaceC866720XzK LIZ() {
                    return this.LJI;
                }

                @Override // X.InterfaceC872250YJr
                public final C0Y77 LIZIZ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC872250YJr
                public final InterfaceC497601wk LIZJ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC872250YJr
                public final C0YKU LIZLLL() {
                    return this.LJ;
                }

                @Override // X.InterfaceC872250YJr
                public final C868200Y4c LJFF() {
                    return this.LJFF;
                }

                @Override // X.InterfaceC872250YJr
                public final AbstractC2252651DEx LJIIIIZZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC872250YJr
                public final InterfaceC872010YIt LJIILLIIL() {
                    return this.LJIIJJI;
                }

                @Override // X.InterfaceC872250YJr
                public final C0Y1U LJIJJ() {
                    return this.LJII;
                }

                @Override // X.InterfaceC872250YJr
                public final C0Y7J LJIJJLI() {
                    return this.LJIIJ;
                }

                @Override // X.InterfaceC872250YJr
                public final C869590Y9l LJIIIZ(C869590Y9l c869590Y9l) {
                    C0YEM c0yem2 = this.LIZ;
                    if (c869590Y9l == null || c0yem2.LJIIZILJ().LIZLLL().LIZLLL().LJJIJLIJ(c869590Y9l.getConversationId()) || c869590Y9l.isSelf(c0yem2.getUid())) {
                        return null;
                    }
                    return c869590Y9l;
                }

                @Override // X.InterfaceC872250YJr
                public final C0Y8T LJIIJJI(String str) {
                    return this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true);
                }

                @Override // X.InterfaceC872250YJr
                public final boolean LJIILL(int i2) {
                    return this.LIZ.LJIIZILJ().getDomain().LIZIZ.LJI(i2);
                }

                @Override // X.InterfaceC872250YJr
                public final void LJIIZILJ(Set<String> set) {
                    this.LIZ.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJLLI(set);
                }

                @Override // X.InterfaceC872250YJr
                public final void LJIJI(boolean z) {
                    this.LIZ.LJIIZILJ().getDomain().LIZIZ.LIZJ(z);
                }

                @Override // X.InterfaceC872250YJr
                public final void LJII(int i2, int i3) {
                    C0Y8O c0y8o2 = this.LJIIIZ;
                    if (c0y8o2.LJ.isEnabled()) {
                        if ((!c0y8o2.LJ.supportedReceiveTypes.isEmpty()) && !c0y8o2.LJ.supportedReceiveTypes.contains("ws")) {
                            return;
                        }
                        if (((!c0y8o2.LJ.supportedInboxTypes.isEmpty()) && !c0y8o2.LJ.supportedInboxTypes.contains(Integer.valueOf(c0y8o2.LIZIZ))) || SystemClock.uptimeMillis() - c0y8o2.LIZ.LJIIZILJ().LIZIZ().LIZJ().LJJIL(c0y8o2.LIZIZ) < c0y8o2.LJII) {
                            return;
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        while ((!c0y8o2.LJIIIZ.isEmpty()) && jUptimeMillis - c0y8o2.LJIIIZ.first().longValue() > c0y8o2.LJFF) {
                            c0y8o2.LJIIIZ.removeFirst();
                        }
                        c0y8o2.LJIIIZ.addLast(Long.valueOf(jUptimeMillis));
                        int size = c0y8o2.LJIIIZ.size();
                        if (!c0y8o2.LJIIJ && size > c0y8o2.LJI) {
                            C868780Y6i c868780Y6iLIZLLL = c0y8o2.LIZ.LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Burst detected: ");
                            sbLIZ.append(size);
                            sbLIZ.append(" messages in ");
                            sbLIZ.append(c0y8o2.LJFF);
                            sbLIZ.append("ms");
                            C868780Y6i.LJ(c868780Y6iLIZLLL, "WsMsgBurstGate", C2188811AlT.LIZIZ(sbLIZ), 4);
                            c0y8o2.LJIIIIZZ = SystemClock.uptimeMillis();
                            c0y8o2.LJIIJ = true;
                            c0y8o2.LJIIJJI = c0y8o2.LJIIIZ.size();
                            c0y8o2.LJIIL = i2;
                            c0y8o2.LJIILIIL = i3;
                            c0y8o2.LJIILJJIL = c0y8o2.LIZ.LJIIZILJ().LIZLLL().LJI().LJIIZILJ();
                            c0y8o2.LJIILL = ((ConcurrentHashMap) c0y8o2.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ).size();
                            ReceiveMsgPerfTracker receiveMsgPerfTracker = c0y8o2.LIZLLL;
                            if (receiveMsgPerfTracker != null) {
                                receiveMsgPerfTracker.LIZJ(c0y8o2.LIZIZ, "ws");
                            }
                            C23250099c.LIZLLL(c0y8o2.LIZJ, null, null, new C0Y8N(c0y8o2, null), 3);
                        }
                        if (!c0y8o2.LJIIJ) {
                            return;
                        }
                        c0y8o2.LJIIJJI++;
                        c0y8o2.LJIIL = Math.max(c0y8o2.LJIIL, i2);
                        c0y8o2.LJIILIIL = Math.max(c0y8o2.LJIILIIL, i3);
                        c0y8o2.LJIILJJIL = Math.max(c0y8o2.LJIILJJIL, c0y8o2.LIZ.LJIIZILJ().LIZLLL().LJI().LJIIZILJ());
                        c0y8o2.LJIILL = Math.max(c0y8o2.LJIILL, ((ConcurrentHashMap) c0y8o2.LIZ.LJIIZILJ().LIZLLL().LIZ().LIZ).size());
                    }
                }

                @Override // X.InterfaceC872250YJr
                public final void LJIILJJIL(C869590Y9l c869590Y9l, int i2) {
                    C868140Y3w c868140Y3w = this.LIZ.LJIIZILJ().getDomain().LIZIZ;
                    c868140Y3w.getClass();
                    if (c869590Y9l != null) {
                        C872660YLg c872660YLg = new C872660YLg();
                        c872660YLg.LIZLLL = c869590Y9l.getConversationId();
                        c872660YLg.LJII = Long.valueOf(c869590Y9l.getConversationShortId());
                        c872660YLg.LJ = Integer.valueOf(c869590Y9l.getConversationType());
                        c872660YLg.LJIIL = Long.valueOf(c869590Y9l.getCreatedAt());
                        c868140Y3w.LIZIZ(i2, c872660YLg.build());
                    }
                }

                @Override // X.InterfaceC872250YJr
                public final void LJIJ(int i2, int i3) {
                    this.LIZ.LJIIZILJ().getDomain().LIZIZ.LJIIL(i2, i3);
                }

                @Override // X.InterfaceC872250YJr
                public final void LJIIJ(int i2, int i3, boolean z, C0YK7 c0yk7) {
                    this.LJIIIIZZ.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), c0yk7);
                }

                @Override // X.InterfaceC872250YJr
                public final C0Y8T LJIILIIL(int i2, int i3, long j, C869590Y9l c869590Y9l) {
                    return C867450Y1f.LJIL(this.LIZ, i2, c869590Y9l.getConversationId(), c869590Y9l.getConversationShortId(), c869590Y9l.getConversationType(), c869590Y9l.getCreatedAt(), i3, j, c869590Y9l);
                }

                @Override // X.InterfaceC872250YJr
                public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l, long j, int i2, String str, String str2, boolean z, boolean z2) {
                    C0Y2U.LJFF(this.LIZ, c0y8t, c869590Y9l, Long.valueOf(j), Integer.valueOf(i2), str, str2, z, z2);
                }

                {
                    final InterfaceC869500Y9c interfaceC869500Y9cLIZJ = c0yem.LJIIZILJ().LIZIZ().LIZJ();
                    InterfaceC872010YIt interfaceC872010YIt = new InterfaceC872010YIt(c0yem, interfaceC869500Y9cLIZJ) { // from class: X.0YIp
                        public final C0YEM LIZ;
                        public final InterfaceC869500Y9c LIZIZ;

                        {
                            this.LIZ = c0yem;
                            this.LIZIZ = interfaceC869500Y9cLIZJ;
                        }

                        @Override // X.InterfaceC872010YIt
                        public final EnumC871980YIq LIZ(int i2, C0YFV c0yfv, NewMessageNotify newMessageNotify) {
                            long jLongValue;
                            long jLongValue2;
                            if (this.LIZ.LJIIIZ().LIZIZ && this.LIZ.LJIILL().LIZ.LIZ.invoke().skipCursorValidation) {
                                C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "CursorValidator", "Cursor validation skipped by experiment config", 4);
                                return EnumC871980YIq.SKIP_CURSOR_CHECK;
                            }
                            if (Intrinsics.LJFF(newMessageNotify.cross_region_push, true)) {
                                C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), "CursorValidator", "Skipping cursor check for cross-region push message", 4);
                                return EnumC871980YIq.SKIP_CURSOR_CHECK;
                            }
                            Long l = newMessageNotify.previous_cursor;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            Long l2 = newMessageNotify.next_cursor;
                            if (l2 != null) {
                                jLongValue2 = l2.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            long jLJJJJLI = this.LIZIZ.LJJJJLI(i2, c0yfv);
                            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("validateCursor, start processing. inbox ");
                            sbLIZ.append(i2);
                            sbLIZ.append(" prevCursor ");
                            sbLIZ.append(jLongValue);
                            sbLIZ.append(" nextCursor ");
                            sbLIZ.append(jLongValue2);
                            sbLIZ.append(" localCursor ");
                            sbLIZ.append(jLJJJJLI);
                            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "CursorValidator", C2188811AlT.LIZIZ(sbLIZ), 4);
                            if (jLongValue == 0) {
                                return EnumC871980YIq.PREV_CURSOR_IS_ZERO;
                            }
                            if (jLongValue != jLJJJJLI) {
                                C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("cursor mismatch inbox ");
                                sbLIZ2.append(i2);
                                sbLIZ2.append(" prevCursor ");
                                sbLIZ2.append(jLongValue);
                                sbLIZ2.append(" nextCursor ");
                                sbLIZ2.append(jLongValue2);
                                sbLIZ2.append(" localCursor ");
                                sbLIZ2.append(jLJJJJLI);
                                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "CursorValidator", C2188811AlT.LIZIZ(sbLIZ2), 4);
                                if (jLongValue < jLJJJJLI) {
                                    return EnumC871980YIq.CURSOR_TOO_OLD;
                                }
                                return EnumC871980YIq.CURSOR_TOO_NEW;
                            }
                            return EnumC871980YIq.COMPLETED;
                        }
                    };
                    this.LIZ = c0yem;
                    this.LIZIZ = abstractC2238408pq;
                    this.LIZJ = interfaceC497601wkLIZJ;
                    this.LIZLLL = c0y77LIZIZ;
                    this.LJ = c0yku;
                    this.LJFF = c868200Y4c;
                    this.LJI = c0y60LIZ;
                    this.LJII = c0y1uLIZLLL;
                    this.LJIIIIZZ = interfaceC1631630sYr;
                    this.LJIIIZ = c0y8o;
                    this.LJIIJ = c0y7j;
                    this.LJIIJJI = interfaceC872010YIt;
                }
            });
            linkedHashMap.put(numValueOf, c872150YJh);
        }
        return (InterfaceC871300YGa) c872150YJh;
    }

    public C0Y59(C0YI6 c0yi6, C0YEM c0yem, InterfaceC863850Xuh interfaceC863850Xuh, C0D2I c0d2i) {
        this.LIZ = c0yi6;
        this.LIZIZ = c0yem;
        this.LIZJ = interfaceC863850Xuh;
        this.LIZLLL = c0d2i;
    }
}
