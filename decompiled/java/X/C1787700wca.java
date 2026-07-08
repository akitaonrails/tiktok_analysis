package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787700wca extends AbstractC1789510wfV<InterfaceC1788090wdD, InterfaceC1787320wby> {
    public final InterfaceC1787780wci LIZJ;
    public final String LIZLLL;
    public final C1788670we9 LJ;
    public final C1788670we9 LJFF;
    public final EnumC1787180wbk LJI;

    @Override // X.AbstractC1789150wev
    public final InterfaceC560980LzM<InterfaceC1788090wdD, InterfaceC1787320wby> LIZIZ() {
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
        return this.LIZLLL;
    }

    @Override // X.AbstractC1789510wfV
    public final String LJFF(InterfaceC1788090wdD interfaceC1788090wdD) throws JSONException {
        InterfaceC1788090wdD interfaceC1788090wdD2 = interfaceC1788090wdD;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", interfaceC1788090wdD2.getUserId());
        if (interfaceC1788090wdD2 instanceof C1788120wdG) {
            jSONObject.put("payload", ((C1788120wdG) interfaceC1788090wdD2).LJ);
        } else if (interfaceC1788090wdD2 instanceof C1788110wdF) {
            C1788110wdF c1788110wdF = (C1788110wdF) interfaceC1788090wdD2;
            jSONObject.put("merchant_id", c1788110wdF.LJ);
            jSONObject.put("merchant_order_id", c1788110wdF.LJFF);
        } else if (!(interfaceC1788090wdD2 instanceof C1788080wdC)) {
            throw new C1954807lC();
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // X.AbstractC1789510wfV
    public final String LJII(InterfaceC1787320wby interfaceC1787320wby) {
        if (interfaceC1787320wby instanceof C1157590gEH) {
            return "SUCCESS";
        }
        if (Intrinsics.LJFF(interfaceC1787320wby, C1787330wbz.LIZ)) {
            return "PENDING";
        }
        if (Intrinsics.LJFF(interfaceC1787320wby, C1787310wbx.LIZ)) {
            return "CANCELLED";
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // X.AbstractC1789510wfV, X.AbstractC1789150wev, X.InterfaceC1789330wfD
    /* JADX INFO: renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1788090wdD r6, X.InterfaceC1364105Vn<? super X.AbstractC1789120wes<X.InterfaceC1787320wby, X.C1788880weU<X.EnumC1787180wbk>>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1787710wcb
            if (r0 == 0) goto L3a
            r4 = r7
            X.0wcb r4 = (X.C1787710wcb) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L40
            X.C155000ia.LIZIZ(r3)
        L22:
            r1 = r3
            X.0wes r1 = (X.AbstractC1789120wes) r1
            X.0wci r0 = r5.LIZJ
            X.C1789130wet.LIZ(r1)
            r0.LIZIZ()
            return r3
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            java.lang.Object r3 = X.AbstractC1789510wfV.LJIIIIZZ(r5, r6, r4)
            if (r3 != r2) goto L22
            return r2
        L3a:
            X.0wcb r4 = new X.0wcb
            r4.<init>(r5, r7)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1787700wca.LIZ(X.0wdD, X.05Vn):java.lang.Object");
    }

    public C1787700wca(final InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1788510wdt interfaceC1788510wdt, InterfaceC1788520wdu interfaceC1788520wdu, final InterfaceC1787390wc5 interfaceC1787390wc5, InterfaceC1788350wdd interfaceC1788350wdd, InterfaceC1787890wct interfaceC1787890wct, final InterfaceC1787780wci interfaceC1787780wci) {
        super(interfaceC1788520wdu.LJ());
        this.LIZJ = interfaceC1787780wci;
        this.LIZLLL = "payment";
        final C1788670we9 c1788670we9 = new C1788670we9(new C1788670we9(C1787760wcg.LIZ(new C1788670we9(new C1788930weZ(new C1787580wcO(), AFwS269S0000000_27.get$arr$(476)), new C1788690weB(interfaceC1786800wb8, interfaceC1788520wdu, interfaceC1788520wdu.LJ())), AFwS314S0000000_27.get$arr$(25)), new C1788250wdT(interfaceC1786800wb8, interfaceC1788520wdu)), new C1787220wbo(interfaceC1788520wdu));
        C1787580wcO c1787580wcO = new C1787580wcO();
        final InterfaceC1786480wac interfaceC1786480wacLJ = interfaceC1788520wdu.LJ();
        C1788670we9 c1788670we92 = new C1788670we9(new C1788670we9(new C1788670we9(c1787580wcO, new C1788570wdz(new C1788670we9(new C1788840weQ(new C1788670we9(C1787760wcg.LIZ(new C1788670we9(new C1788930weZ(new C1787580wcO(), AFwS269S0000000_27.get$arr$(477)), new InterfaceC560980LzM<C1787830wcn, C1787830wcn>(interfaceC1787390wc5) { // from class: X.0wb1
            public final InterfaceC1787390wc5 LIZ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "unmark_payment";
            }

            {
                this.LIZ = interfaceC1787390wc5;
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
                C1787830wcn c1787830wcn2 = c1787830wcn;
                this.LIZ.LIZ().remove(c1787830wcn2.LJFF.LJIIJJI.getValue());
                return c1787830wcn2;
            }
        }), AFwS314S0000000_27.get$arr$(26)), new C1787160wbi(interfaceC1788520wdu.LIZIZ()))), new C1787030wbV(interfaceC1786800wb8, interfaceC1788520wdu)), new C1788670we9(new C1788670we9(new C1788670we9(new C1788670we9(new C1788670we9(new C1788670we9(new InterfaceC560980LzM<C1787830wcn, C1787830wcn>(interfaceC1786480wacLJ, interfaceC1786800wb8, interfaceC1787390wc5) { // from class: X.0wcB
            public final InterfaceC1786480wac LIZ;
            public final InterfaceC1786800wb8 LIZIZ;
            public final InterfaceC1787390wc5 LIZJ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "check_and_lock_payment";
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) throws Exception {
                C1787830wcn c1787830wcn2 = c1787830wcn;
                Map mapLJIIL = C2097608Jq.LJIIL(c1787830wcn2.LIZIZ(), this.LIZIZ.getCommonEventInfo());
                InterfaceC1786480wac interfaceC1786480wac = this.LIZ;
                C1796650wr1 c1796650wr1 = new C1786600wao<InterfaceC1796690wr5>() { // from class: X.0wr1
                    {
                        InterfaceC1796690wr5.LIZ.getClass();
                        C1796700wr6 c1796700wr6 = C1796680wr4.LIZIZ;
                    }
                };
                AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(mapLJIIL, (Map<String, String>) 157);
                c1796650wr1.getClass();
                interfaceC1786480wac.LIZ(new C1786590wan(c1796650wr1, awS582S0100000_3));
                if (this.LIZJ.LIZIZ().compareAndSet(false, true)) {
                    return c1787830wcn2;
                }
                InterfaceC1786480wac interfaceC1786480wac2 = this.LIZ;
                C1796640wr0 c1796640wr0 = new C1786600wao<InterfaceC1796690wr5>() { // from class: X.0wr0
                    {
                        InterfaceC1796690wr5.LIZ.getClass();
                        C1796700wr6 c1796700wr6 = C1796680wr4.LIZIZ;
                    }
                };
                AwS582S0100000_3 awS582S0100000_32 = new AwS582S0100000_3(mapLJIIL, (Map<String, String>) 158);
                c1796640wr0.getClass();
                interfaceC1786480wac2.LIZ(new C1786590wan(c1796640wr0, awS582S0100000_32));
                throw new Exception() { // from class: X.0wbh
                };
            }

            {
                this.LIZ = interfaceC1786480wacLJ;
                this.LIZIZ = interfaceC1786800wb8;
                this.LIZJ = interfaceC1787390wc5;
            }
        }, new InterfaceC560980LzM<C1787830wcn, C1787830wcn>(interfaceC1787390wc5) { // from class: X.0wb0
            public final InterfaceC1787390wc5 LIZ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "mark_payment";
            }

            {
                this.LIZ = interfaceC1787390wc5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
                C1787830wcn c1787830wcn2 = c1787830wcn;
                this.LIZ.LIZ().add(c1787830wcn2.LJFF.LJIIJJI.getValue());
                return c1787830wcn2;
            }
        }), new C1788160wdK(interfaceC1786800wb8, interfaceC1788520wdu, interfaceC1787890wct)), new C1788980wee(new C1788670we9(new C1788670we9(new C1786580wam(interfaceC1786800wb8, interfaceC1788520wdu), new C1786850wbD(interfaceC1786800wb8, interfaceC1788520wdu, interfaceC1787390wc5)), new InterfaceC560980LzM<C1787830wcn, C1787830wcn>(interfaceC1787780wci) { // from class: X.0wcf
            public final InterfaceC1787780wci LIZ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "tooling_store_purchase_token";
            }

            {
                this.LIZ = interfaceC1787780wci;
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
                C1787830wcn c1787830wcn2 = c1787830wcn;
                this.LIZ.LIZ();
                return c1787830wcn2;
            }
        }), new InterfaceC1789000weg() { // from class: X.0wcP
            @Override // X.InterfaceC1789000weg
            public final String getName() {
                return "internal_error_retry";
            }

            @Override // X.InterfaceC1789000weg
            public final Object LIZ(int i, C1788990wef c1788990wef) {
                return Unit.LIZ;
            }

            @Override // X.InterfaceC1789000weg
            public final boolean LIZIZ(int i, Exception exc) {
                if ((exc instanceof C1786860wbE) && ((C1786860wbE) exc).getCanRetry() && i <= 3) {
                    return true;
                }
                return false;
            }
        })), new InterfaceC560980LzM<T, T>(interfaceC1787390wc5) { // from class: X.0wce
            public final InterfaceC1787390wc5 LIZ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "unlock_payment";
            }

            {
                this.LIZ = interfaceC1787390wc5;
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(T t, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
                if (!(t instanceof C1787150wbh)) {
                    this.LIZ.LIZIZ().set(false);
                }
                return t;
            }
        }), new C1788980wee(new C1787850wcp(interfaceC1788510wdt, interfaceC1788520wdu, interfaceC1787890wct), new C1787600wcQ(0.0d, 3))), new C1788980wee(new C1787960wd0(interfaceC1788510wdt, interfaceC1788520wdu), new C1787600wcQ(0.5d, 1))))), new C1786970wbP(interfaceC1786800wb8, interfaceC1788520wdu)), new InterfaceC560980LzM<C1787830wcn, C1787830wcn>(interfaceC1787390wc5) { // from class: X.0wb1
            public final InterfaceC1787390wc5 LIZ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "unmark_payment";
            }

            {
                this.LIZ = interfaceC1787390wc5;
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
                C1787830wcn c1787830wcn2 = c1787830wcn;
                this.LIZ.LIZ().remove(c1787830wcn2.LJFF.LJIIJJI.getValue());
                return c1787830wcn2;
            }
        });
        C054G c054g = C352701Yn.LIZ;
        final C561000LzO c561000LzO = new C561000LzO(c1788670we92, c054g, new C1786640was(interfaceC1786800wb8, interfaceC1788520wdu));
        InterfaceC560980LzM<InterfaceC1788090wdD, InterfaceC1788090wdD> interfaceC560980LzM = new InterfaceC560980LzM<InterfaceC1788090wdD, InterfaceC1788090wdD>() { // from class: X.0wcc
            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "validate_payment_input";
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(InterfaceC1788090wdD interfaceC1788090wdD, InterfaceC1364105Vn<? super InterfaceC1788090wdD> interfaceC1364105Vn) {
                InterfaceC1788090wdD interfaceC1788090wdD2 = interfaceC1788090wdD;
                if (interfaceC1788090wdD2 instanceof C1788120wdG) {
                    if (((C1788120wdG) interfaceC1788090wdD2).LJ.length() <= 0) {
                        "Failed requirement.".toString();
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (interfaceC1788090wdD2 instanceof C1788110wdF) {
                    C1788110wdF c1788110wdF = (C1788110wdF) interfaceC1788090wdD2;
                    if (c1788110wdF.LJ.length() > 0) {
                        if (c1788110wdF.LJFF.length() <= 0) {
                            "Failed requirement.".toString();
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    } else {
                        "Failed requirement.".toString();
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported request type");
                }
                return interfaceC1788090wdD2;
            }
        };
        final InterfaceC1788280wdW interfaceC1788280wdWLIZIZ = interfaceC1788520wdu.LIZIZ();
        this.LJ = new C1788670we9(new C1788930weZ(new C561000LzO(C1787760wcg.LIZ(new C1788670we9(new C1788670we9(new C1788670we9(new C1788670we9(interfaceC560980LzM, new InterfaceC560980LzM<InterfaceC1788090wdD, InterfaceC1788090wdD>(interfaceC1788280wdWLIZIZ) { // from class: X.0wdE
            public final InterfaceC1788280wdW LIZ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "add_prefix_to_biz_tracking";
            }

            {
                this.LIZ = interfaceC1788280wdWLIZIZ;
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(InterfaceC1788090wdD interfaceC1788090wdD, InterfaceC1364105Vn<? super InterfaceC1788090wdD> interfaceC1364105Vn) {
                InterfaceC1788090wdD interfaceC1788090wdD2 = interfaceC1788090wdD;
                Set<String> setLJI = this.LIZ.LJI();
                Map<String, String> trackingMap = interfaceC1788090wdD2.getTrackingMap();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(trackingMap.size()));
                Iterator<T> it2 = trackingMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String strLIZIZ = (String) entry.getKey();
                    if (!setLJI.contains(strLIZIZ)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("biz_");
                        sbLIZ.append(strLIZIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    linkedHashMap.put(strLIZIZ, entry.getValue());
                }
                if (interfaceC1788090wdD2 instanceof C1788120wdG) {
                    C1788120wdG c1788120wdG = (C1788120wdG) interfaceC1788090wdD2;
                    return new C1788120wdG(c1788120wdG.LIZ, c1788120wdG.LIZIZ, linkedHashMap, c1788120wdG.LIZLLL, c1788120wdG.LJ);
                }
                if (interfaceC1788090wdD2 instanceof C1788110wdF) {
                    C1788110wdF c1788110wdF = (C1788110wdF) interfaceC1788090wdD2;
                    return new C1788110wdF(c1788110wdF.LIZ, c1788110wdF.LIZIZ, linkedHashMap, c1788110wdF.LIZLLL, c1788110wdF.LJ, c1788110wdF.LJFF);
                }
                if (interfaceC1788090wdD2 instanceof C1788080wdC) {
                    return interfaceC1788090wdD2;
                }
                throw new C1954807lC();
            }
        }), new C1788400wdi(interfaceC1786800wb8, interfaceC1788520wdu, interfaceC1788510wdt)), new C1788570wdz(new C1788670we9(C1787760wcg.LIZ(new C561000LzO(C1787760wcg.LIZ(new C1788670we9(new C1788930weZ(new C1787580wcO(), AFwS269S0000000_27.get$arr$(474)), new C1787160wbi(interfaceC1788520wdu.LIZIZ())), AFwS314S0000000_27.get$arr$(22)), c054g, new C1788240wdS(interfaceC1788520wdu, interfaceC1788350wdd)), AFwS314S0000000_27.get$arr$(23)), new C1787110wbd(interfaceC1786800wb8, interfaceC1788520wdu)), new InterfaceC560980LzM<C1787830wcn, C1787830wcn>(c561000LzO, c1788670we9) { // from class: X.0wck
            public final InterfaceC560980LzM<C1787830wcn, C1787830wcn> LIZ;
            public final InterfaceC560980LzM<C1787830wcn, C1787830wcn> LIZIZ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "switch_payment";
            }

            {
                this.LIZ = c561000LzO;
                this.LIZIZ = c1788670we9;
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787830wcn> interfaceC1364105Vn) {
                C1787830wcn c1787830wcn2 = c1787830wcn;
                if (c1787830wcn2.LJFF.LIZIZ() == EnumC993970byN.WEB) {
                    return this.LIZIZ.LIZ(c1787830wcn2, interfaceC1364105Vn);
                }
                return this.LIZ.LIZ(c1787830wcn2, interfaceC1364105Vn);
            }
        })), new C1787090wbb(interfaceC1786800wb8, interfaceC1788520wdu)), AFwS314S0000000_27.get$arr$(24)), c054g, new C1788240wdS(interfaceC1788520wdu, interfaceC1788350wdd)), AFwS269S0000000_27.get$arr$(475)), new InterfaceC560980LzM<C1787830wcn, InterfaceC1787320wby>() { // from class: X.0wbw
            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "map_payment_result";
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super InterfaceC1787320wby> interfaceC1364105Vn) {
                C1787830wcn c1787830wcn2 = c1787830wcn;
                int i = C1787050wbX.LIZ[c1787830wcn2.LJ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new IllegalArgumentException("order state is invalid. should not reach here without error");
                        }
                        C993960byM c993960byM = c1787830wcn2.LJFF;
                        return new C1157590gEH(c993960byM.LIZIZ, c993960byM.LIZJ);
                    }
                    return C1787310wbx.LIZ;
                }
                return C1787330wbz.LIZ;
            }
        });
        this.LJFF = new C1788670we9(new InterfaceC560980LzM<T, T>(interfaceC1787390wc5) { // from class: X.0wce
            public final InterfaceC1787390wc5 LIZ;

            @Override // X.InterfaceC560980LzM
            public final String getName() {
                return "unlock_payment";
            }

            {
                this.LIZ = interfaceC1787390wc5;
            }

            @Override // X.InterfaceC560980LzM
            public final Object LIZ(T t, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
                if (!(t instanceof C1787150wbh)) {
                    this.LIZ.LIZIZ().set(false);
                }
                return t;
            }
        }, new C1787160wbi(interfaceC1788520wdu.LIZIZ()));
        this.LJI = EnumC1787180wbk.UNKNOWN_ERROR;
    }
}
