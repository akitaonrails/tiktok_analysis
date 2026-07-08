package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSelfDiagnosisSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS205S0000000_17;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0frH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143330frH {
    public static final LinkedList<AbstractC1143340frI> LIZ;
    public static final ConcurrentLinkedQueue<AbstractC1143570frf> LIZIZ;
    public static final AtomicBoolean LIZJ;
    public static boolean LIZLLL;
    public static final C01GW LJ;

    static {
        LinkedList<AbstractC1143340frI> linkedList = new LinkedList<>();
        linkedList.add(new AbstractC1143340frI() { // from class: X.0frL
            public int LIZLLL;
            public int LJ;
            public int LJFF;

            @Override // X.AbstractC1143340frI
            public final String LIZ() {
                return "Panel";
            }

            @Override // X.AbstractC1143340frI
            public final void LIZIZ() throws JSONException {
                Map<String, Object> map = C1338270kvh.LIZ;
                if (this.LJFF > this.LIZLLL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("all:");
                    sbLIZ.append(this.LJFF);
                    sbLIZ.append(" open:");
                    sbLIZ.append(this.LIZLLL);
                    LIZLLL(302, C2188811AlT.LIZIZ(sbLIZ));
                }
                int i = this.LIZLLL;
                if (i > 0 && this.LJ / i < this.LIZIZ.panelOpenSuccessRate) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("1_4:");
                    sbLIZ2.append(this.LJ);
                    sbLIZ2.append(" open:");
                    sbLIZ2.append(this.LIZLLL);
                    LIZLLL(301, C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.LIZLLL = 0;
                this.LJ = 0;
                this.LJFF = 0;
            }

            @Override // X.AbstractC1143340frI
            public final void LIZJ(AbstractC1143570frf abstractC1143570frf) throws JSONException {
                if (abstractC1143570frf instanceof C1143520fra) {
                    this.LIZLLL++;
                } else if (abstractC1143570frf instanceof C1143460frU) {
                    int i = ((C1143460frU) abstractC1143570frf).LIZ;
                    if (i == 1 || i == 4) {
                        this.LJ++;
                    }
                    this.LJFF++;
                } else if (abstractC1143570frf instanceof C1143450frT) {
                    C1143450frT c1143450frT = (C1143450frT) abstractC1143570frf;
                    if (c1143450frT.LIZ > this.LIZIZ.panelOpenDur) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("dur:");
                        sbLIZ.append(c1143450frT.LIZ);
                        LIZLLL(303, C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                Map<String, Object> map = C1338270kvh.LIZ;
            }
        });
        linkedList.add(new AbstractC1143340frI() { // from class: X.0frK
            public int LIZLLL;
            public int LJ;
            public int LJFF;
            public int LJI;
            public int LJII;
            public int LJIIIIZZ;

            @Override // X.AbstractC1143340frI
            public final String LIZ() {
                return "Tray";
            }

            @Override // X.AbstractC1143340frI
            public final void LIZIZ() throws JSONException {
                Map<String, Object> map = C1338270kvh.LIZ;
                if (this.LJFF + this.LJII > this.LIZLLL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(" drop:");
                    sbLIZ.append(this.LJII);
                    sbLIZ.append(" suc:");
                    sbLIZ.append(this.LJFF);
                    sbLIZ.append("resp:");
                    sbLIZ.append(this.LIZLLL);
                    LIZLLL(103, C2188811AlT.LIZIZ(sbLIZ));
                }
                int i = this.LIZLLL;
                if (i > 0 && (this.LJFF + this.LJII) / i < this.LIZIZ.selfTrayShowSuccessRate) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" drop:");
                    sbLIZ2.append(this.LJII);
                    sbLIZ2.append(" suc:");
                    sbLIZ2.append(this.LJFF);
                    sbLIZ2.append("resp:");
                    sbLIZ2.append(this.LIZLLL);
                    LIZLLL(101, C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (this.LJII > this.LIZIZ.selfTrayMsgDrop) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("drop:");
                    sbLIZ3.append(this.LJII);
                    LIZLLL(107, C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (this.LJI + this.LJIIIIZZ > this.LJ) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(" drop:");
                    sbLIZ4.append(this.LJIIIIZZ);
                    sbLIZ4.append(" suc:");
                    sbLIZ4.append(this.LJI);
                    sbLIZ4.append("rec:");
                    sbLIZ4.append(this.LJ);
                    LIZLLL(104, C2188811AlT.LIZIZ(sbLIZ4));
                }
                int i2 = this.LJ;
                if (i2 > 0 && (this.LJI + this.LJIIIIZZ) / i2 < this.LIZIZ.anchorTrayShowSuccessRate) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(" drop:");
                    sbLIZ5.append(this.LJIIIIZZ);
                    sbLIZ5.append(" suc:");
                    sbLIZ5.append(this.LJI);
                    sbLIZ5.append("rec:");
                    sbLIZ5.append(this.LJ);
                    LIZLLL(102, C2188811AlT.LIZIZ(sbLIZ5));
                }
                if (this.LJIIIIZZ > this.LIZIZ.anchorTrayMsgDrop) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("drop:");
                    sbLIZ6.append(this.LJIIIIZZ);
                    LIZLLL(108, C2188811AlT.LIZIZ(sbLIZ6));
                }
                this.LIZLLL = 0;
                this.LJ = 0;
                this.LJFF = 0;
                this.LJI = 0;
                this.LJII = 0;
                this.LJIIIIZZ = 0;
            }

            @Override // X.AbstractC1143340frI
            public final void LIZJ(AbstractC1143570frf abstractC1143570frf) throws JSONException {
                if (abstractC1143570frf instanceof C1143500frY) {
                    this.LIZLLL += ((C1143500frY) abstractC1143570frf).LIZ;
                } else if (abstractC1143570frf instanceof C1143430frR) {
                    this.LJ += ((C1143430frR) abstractC1143570frf).LIZ;
                } else if (abstractC1143570frf instanceof C1143390frN) {
                    C1143390frN c1143390frN = (C1143390frN) abstractC1143570frf;
                    this.LJFF += c1143390frN.LIZ;
                    if (c1143390frN.LIZIZ > this.LIZIZ.selfTrayShowDur) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("dur:");
                        sbLIZ.append(c1143390frN.LIZIZ);
                        LIZLLL(105, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (abstractC1143570frf instanceof C1143380frM) {
                    C1143380frM c1143380frM = (C1143380frM) abstractC1143570frf;
                    this.LJI += c1143380frM.LIZ;
                    if (c1143380frM.LIZIZ > this.LIZIZ.anchorTrayShowDur) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("dur:");
                        sbLIZ2.append(c1143380frM.LIZIZ);
                        LIZLLL(106, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else if (abstractC1143570frf instanceof C1143480frW) {
                    this.LJII += ((C1143480frW) abstractC1143570frf).LIZ;
                } else if (abstractC1143570frf instanceof C1143410frP) {
                    this.LJIIIIZZ += ((C1143410frP) abstractC1143570frf).LIZ;
                }
                Map<String, Object> map = C1338270kvh.LIZ;
            }
        });
        linkedList.add(new AbstractC1143340frI() { // from class: X.0frJ
            public int LIZLLL;
            public int LJ;
            public int LJFF;
            public int LJI;

            @Override // X.AbstractC1143340frI
            public final void LIZIZ() throws JSONException {
                Map<String, Object> map = C1338270kvh.LIZ;
                if (this.LJFF > this.LIZLLL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("status:");
                    sbLIZ.append(this.LJFF);
                    sbLIZ.append(" resp:");
                    sbLIZ.append(this.LIZLLL);
                    LIZLLL(203, C2188811AlT.LIZIZ(sbLIZ));
                }
                int i = this.LIZLLL;
                if (i > 0 && this.LJFF / i < this.LIZIZ.selfEffectSuccessRate) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("status:");
                    sbLIZ2.append(this.LJFF);
                    sbLIZ2.append(" resp:");
                    sbLIZ2.append(this.LIZLLL);
                    LIZLLL(201, C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (this.LJI > this.LJ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("status:");
                    sbLIZ3.append(this.LJI);
                    sbLIZ3.append(" rec:");
                    sbLIZ3.append(this.LJ);
                    LIZLLL(204, C2188811AlT.LIZIZ(sbLIZ3));
                }
                int i2 = this.LJ;
                if (i2 > 0 && this.LJI / i2 < this.LIZIZ.anchorEffectSuccessRate) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("status:");
                    sbLIZ4.append(this.LJI);
                    sbLIZ4.append(" rec:");
                    sbLIZ4.append(this.LJ);
                    LIZLLL(202, C2188811AlT.LIZIZ(sbLIZ4));
                }
                this.LIZLLL = 0;
                this.LJ = 0;
                this.LJFF = 0;
                this.LJI = 0;
            }

            @Override // X.AbstractC1143340frI
            public final void LIZJ(AbstractC1143570frf abstractC1143570frf) throws JSONException {
                if (abstractC1143570frf instanceof C1143470frV) {
                    this.LIZLLL += ((C1143470frV) abstractC1143570frf).LIZ;
                } else if (abstractC1143570frf instanceof C1143400frO) {
                    this.LJ += ((C1143400frO) abstractC1143570frf).LIZ;
                } else if (abstractC1143570frf instanceof C1143530frb) {
                    this.LJFF++;
                } else if (abstractC1143570frf instanceof C1143510frZ) {
                    this.LJI++;
                } else if (abstractC1143570frf instanceof C1143490frX) {
                    C1143490frX c1143490frX = (C1143490frX) abstractC1143570frf;
                    if (c1143490frX.LIZ > this.LIZIZ.selfEffectDur) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("dur:");
                        sbLIZ.append(c1143490frX.LIZ);
                        LIZLLL(205, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (abstractC1143570frf instanceof C1143420frQ) {
                    C1143420frQ c1143420frQ = (C1143420frQ) abstractC1143570frf;
                    if (c1143420frQ.LIZ > this.LIZIZ.anchorEffectDur) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("dur:");
                        sbLIZ2.append(c1143420frQ.LIZ);
                        LIZLLL(206, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                Map<String, Object> map = C1338270kvh.LIZ;
            }
        });
        LIZ = linkedList;
        LIZIZ = new ConcurrentLinkedQueue<>();
        LIZJ = new AtomicBoolean(false);
        LJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(385));
    }

    public static void LIZ(AbstractC1143570frf abstractC1143570frf) {
        if (abstractC1143570frf instanceof C1143550frd) {
            LIZLLL = false;
        }
        if (!LIZLLL && ((LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis) LJ.getValue()).enable) {
            float score = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().getScore();
            Map<String, Object> map = C1338270kvh.LIZ;
            if (((score > -100.0f && score < 0.0f) || (score > 0.0f && score < 100.0f)) && score < ((LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis) LJ.getValue()).highTrafficRoomScoreLimit) {
                C20441214yg.LJ("GiftDiagnosis", "overloaded skip triggered");
                LIZLLL = true;
                LIZIZ.clear();
                return;
            }
            try {
                ConcurrentLinkedQueue<AbstractC1143570frf> concurrentLinkedQueue = LIZIZ;
                concurrentLinkedQueue.add(abstractC1143570frf);
                if (((abstractC1143570frf instanceof C1143550frd) || (abstractC1143570frf instanceof C1143560fre) || (abstractC1143570frf instanceof C1143540frc) || concurrentLinkedQueue.size() > ((LiveGiftSelfDiagnosisSetting.LiveGiftSelfDiagnosis) LJ.getValue()).queueRetainSize) && LIZJ.compareAndSet(false, true)) {
                    C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0frG
                        public static void LIZ() {
                            LinkedList<AbstractC1143340frI> linkedList = C1143330frH.LIZ;
                            while (true) {
                                try {
                                    AbstractC1143570frf abstractC1143570frfPoll = C1143330frH.LIZIZ.poll();
                                    if (abstractC1143570frfPoll == null) {
                                        break;
                                    }
                                    Map<String, Object> map2 = C1338270kvh.LIZ;
                                    Iterator<AbstractC1143340frI> it2 = C1143330frH.LIZ.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().onEvent(abstractC1143570frfPoll);
                                    }
                                } finally {
                                    try {
                                    } catch (Throwable th) {
                                    }
                                }
                            }
                            C1143330frH.LIZJ.set(false);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("GiftDiagnosis@a85c.onEvent$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("GiftDiagnosis@a85c.onEvent$1");
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "GiftDiagnosis thread pool issue");
            }
        }
    }
}
