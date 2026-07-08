package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789400wfK extends AbstractC1789510wfV<C1789460wfQ, List<? extends C1789670wfl>> {
    public final InterfaceC1788520wdu LIZJ;
    public final InterfaceC1786800wb8 LIZLLL;
    public final C1788670we9 LJ;
    public final C1787160wbi LJFF;
    public final EnumC1787180wbk LJI;
    public final String LJII;

    @Override // X.AbstractC1789150wev
    public final InterfaceC560980LzM<C1789460wfQ, List<C1789670wfl>> LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1789150wev
    public final /* bridge */ /* synthetic */ EnumC1787180wbk LIZJ() {
        return this.LJI;
    }

    @Override // X.AbstractC1789150wev
    public final InterfaceC560980LzM<Exception, EnumC1787180wbk> LIZLLL() {
        return this.LJFF;
    }

    @Override // X.AbstractC1789510wfV
    public final String LJI() {
        return this.LJII;
    }

    @Override // X.AbstractC1789510wfV
    public final String LJFF(C1789460wfQ c1789460wfQ) throws JSONException {
        C1789460wfQ c1789460wfQ2 = c1789460wfQ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("merchant_id", c1789460wfQ2.LIZIZ);
        jSONObject.put("sub_merchant_id", c1789460wfQ2.LIZJ);
        jSONObject.put("from_user_id", c1789460wfQ2.LIZ);
        jSONObject.put("to_user_id", c1789460wfQ2.LIZLLL);
        return C786410Ut5.J3(jSONObject);
    }

    @Override // X.AbstractC1789510wfV
    public final String LJII(List<? extends C1789670wfl> list) throws JSONException {
        Integer numValueOf;
        String str;
        EnumC1789630wfh enumC1789630wfh;
        C1789670wfl c1789670wfl = (C1789670wfl) C13LP.LJJJLL(list);
        JSONObject jSONObject = new JSONObject();
        List<C0KQE> list2 = null;
        if (c1789670wfl != null && (enumC1789630wfh = c1789670wfl.LIZ) != null) {
            numValueOf = Integer.valueOf(enumC1789630wfh.getCode());
        } else {
            numValueOf = null;
        }
        jSONObject.put("precheck_result", String.valueOf(numValueOf));
        if (c1789670wfl != null) {
            list2 = c1789670wfl.LIZJ;
        }
        jSONObject.put("allow_path", String.valueOf(list2));
        if (c1789670wfl == null || (str = c1789670wfl.LJFF) == null) {
            str = "";
        }
        jSONObject.put("precheck_result_message", str);
        return C786410Ut5.J3(jSONObject);
    }

    @Override // X.AbstractC1789510wfV
    public final void LJIIJ(C1789460wfQ c1789460wfQ) {
        C1789480wfS c1789480wfS = C1789480wfS.LIZJ;
        AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(c1789460wfQ, 1);
        c1789480wfS.getClass();
        this.LIZJ.LJ().LIZ(new C1786590wan(c1789480wfS, awS606S0100000_27));
    }

    public C1789400wfK(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788520wdu interfaceC1788520wdu, InterfaceC1788510wdt interfaceC1788510wdt) {
        super(interfaceC1788520wdu.LJ());
        this.LIZJ = interfaceC1788520wdu;
        this.LIZLLL = interfaceC1786800wb8;
        this.LJ = new C1788670we9(C1787760wcg.LIZ(new C1788670we9(C1787760wcg.LIZ(new C1788670we9(C1787760wcg.LIZ(new InterfaceC560980LzM<C1789460wfQ, Unit>() { // from class: X.0wfO
            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "ValidateRequestParamAction";
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1789460wfQ c1789460wfQ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                C1789460wfQ c1789460wfQ2 = c1789460wfQ;
                if (c1789460wfQ2.LIZIZ.length() != 0 && c1789460wfQ2.LIZ != 0) {
                    return Unit.LIZ;
                }
                throw new IllegalArgumentException("merchantId, productIdList, fromUserId are required");
            }
        }, AFwS314S0000000_27.get$arr$(0)), new C1788590we1(interfaceC1786800wb8, interfaceC1788520wdu.LJ(), interfaceC1788520wdu.getCache())), AFwS314S0000000_27.get$arr$(1)), new C1789610wff(interfaceC1786800wb8.getChannel().getValue(), interfaceC1788510wdt, interfaceC1788520wdu.LJ())), AFwS314S0000000_27.get$arr$(2)), new InterfaceC560980LzM<C1789570wfb, List<? extends C1789670wfl>>() { // from class: X.0wfg
            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "MapSubResponsesAction";
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1789570wfb c1789570wfb, InterfaceC1364105Vn<? super List<? extends C1789670wfl>> interfaceC1364105Vn) {
                C1789750wft c1789750wft;
                C1789570wfb c1789570wfb2 = c1789570wfb;
                C1789780wfw c1789780wfw = c1789570wfb2.LIZIZ;
                Map<String, C1789750wft> map = c1789570wfb2.LIZJ;
                C1789680wfm c1789680wfm = c1789780wfw.LIZ;
                C1789750wft c1789750wft2 = null;
                if (c1789680wfm != null) {
                    String str = c1789680wfm.LJII;
                    if (map != null) {
                        c1789750wft2 = map.get(str);
                    }
                    return Collections.singletonList(LIZIZ(str, c1789780wfw, c1789750wft2));
                }
                if (!c1789570wfb2.LIZ.isEmpty()) {
                    List<String> list = c1789570wfb2.LIZ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (String str2 : list) {
                        if (map != null) {
                            c1789750wft = map.get(str2);
                        } else {
                            c1789750wft = null;
                        }
                        arrayList.add(LIZIZ(str2, c1789780wfw, c1789750wft));
                    }
                    return arrayList;
                }
                throw new IllegalArgumentException("empty productIds");
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
            
                if (r1 == 3) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
            
                r8 = new java.util.ArrayList();
                r1 = r2.LJI;
                X.InterfaceC1789760wfu.LIZ.getClass();
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
            
                if (r1 != 1) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
            
                r8.add(X.C0KQE.PLAN_CHANGE);
                r8.add(X.C0KQE.CANCEL);
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
            
                return new X.C1789670wfl(X.EnumC1789630wfh.SUCCESS, r10, r8, r2.LJIIIIZZ, r2.LJI, null, 32);
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
            
                if (r1 != 2) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
            
                r8.add(X.C0KQE.RESIGN_UP);
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
            
                if (r1 != 3) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
            
                r8.add(X.C0KQE.CANCEL);
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
            
                if (r1 == 0) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
            
                if (r1 != 4) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
            
                r8.add(X.C0KQE.PURCHASES);
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.LJFF(r12.LIZIZ, r2.LJIIIZ) != false) goto L34;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static X.C1789670wfl LIZIZ(java.lang.String r10, X.C1789780wfw r11, X.C1789750wft r12) {
                /*
                    Method dump skipped, instruction units count: 258
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1789620wfg.LIZIZ(java.lang.String, X.0wfw, X.0wft):X.0wfl");
            }
        });
        this.LJFF = new C1787160wbi(interfaceC1788520wdu.LIZIZ());
        this.LJI = EnumC1787180wbk.UNKNOWN_ERROR;
        this.LJII = "SubsPrecheckEngine";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1789510wfV
    public final void LJIIIZ(C1789460wfQ c1789460wfQ, long j, AbstractC1789120wes<List<? extends C1789670wfl>, C1788880weU<EnumC1787180wbk>> abstractC1789120wes) {
        String strValueOf;
        C1786590wan c1786590wan;
        C1789460wfQ c1789460wfQ2 = c1789460wfQ;
        C1789480wfS c1789480wfS = C1789480wfS.LIZJ;
        AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(c1789460wfQ2, 1);
        c1789480wfS.getClass();
        Map<String, String> map = new C1786590wan(c1789480wfS, awS606S0100000_27).LIZIZ;
        if (abstractC1789120wes instanceof C1789100weq) {
            C1789450wfP c1789450wfP = new C1786600wao<C1789430wfN>() { // from class: X.0wfP
                {
                    new C1789430wfN();
                }
            };
            C1789410wfL c1789410wfL = new C1789410wfL(abstractC1789120wes, j, c1789460wfQ2, map, this);
            c1789450wfP.getClass();
            c1786590wan = new C1786590wan(c1789450wfP, c1789410wfL);
        } else if (abstractC1789120wes instanceof C1789110wer) {
            Exception exc = ((C1788880weU) ((C1789110wer) abstractC1789120wes).LIZ).LIZIZ;
            if (exc instanceof C1786910wbJ) {
                strValueOf = String.valueOf(((C1786910wbJ) exc).getErrorCode());
            } else if (exc instanceof C1786680waw) {
                strValueOf = String.valueOf(((C1786680waw) exc).getErrorCode());
            } else {
                strValueOf = "-1";
            }
            C1789450wfP c1789450wfP2 = new C1786600wao<C1789430wfN>() { // from class: X.0wfP
                {
                    new C1789430wfN();
                }
            };
            C1789420wfM c1789420wfM = new C1789420wfM(strValueOf, abstractC1789120wes, j, c1789460wfQ2, map, this);
            c1789450wfP2.getClass();
            c1786590wan = new C1786590wan(c1789450wfP2, c1789420wfM);
        } else {
            throw new C1954807lC();
        }
        this.LIZJ.LJ().LIZ(c1786590wan);
    }
}
