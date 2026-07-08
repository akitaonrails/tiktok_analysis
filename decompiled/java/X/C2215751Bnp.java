package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Bnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215751Bnp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C2215851Bnz c2215851Bnz, List list) {
        InterfaceC2215771Bnr interfaceC2215771Bnr;
        C2215851Bnz c2215851Bnz2 = c2215851Bnz.LIZJ;
        if (c2215851Bnz2 != null) {
            LIZ(c2215851Bnz2, list);
        }
        C2215851Bnz c2215851Bnz3 = c2215851Bnz.LIZLLL;
        if (c2215851Bnz3 != null) {
            LIZ(c2215851Bnz3, list);
        }
        switch (C2215841Bny.LIZ[c2215851Bnz.LIZ.ordinal()]) {
            case 1:
                final String str = (String) c2215851Bnz.LIZIZ;
                interfaceC2215771Bnr = new InterfaceC2215771Bnr(str) { // from class: X.1Bno
                    public final String LIZ;

                    {
                        this.LIZ = str;
                    }

                    @Override // X.InterfaceC2215771Bnr
                    public final void LIZ(C2215781Bns c2215781Bns, Map<String, ? extends Object> map) {
                        Object obj = ((LinkedHashMap) map).get(this.LIZ);
                        if (obj == null) {
                            ((LinkedList) c2215781Bns.LIZ).push("epi_unknown");
                        } else {
                            ((LinkedList) c2215781Bns.LIZ).push(obj);
                        }
                    }
                };
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                final Object obj = c2215851Bnz.LIZIZ;
                interfaceC2215771Bnr = new InterfaceC2215771Bnr(obj) { // from class: X.1Bnq
                    public final Object LIZ;

                    {
                        this.LIZ = obj;
                    }

                    @Override // X.InterfaceC2215771Bnr
                    public final void LIZ(C2215781Bns c2215781Bns, Map<String, ? extends Object> map) {
                        ((LinkedList) c2215781Bns.LIZ).push(this.LIZ);
                    }
                };
                break;
            case 8:
                interfaceC2215771Bnr = new InterfaceC2215771Bnr() { // from class: X.1Bnl
                    public static final boolean LIZIZ(C2215781Bns c2215781Bns) {
                        if (!c2215781Bns.LIZ.isEmpty()) {
                            Object objPop = ((LinkedList) c2215781Bns.LIZ).pop();
                            if (objPop instanceof Boolean) {
                                return ((Boolean) objPop).booleanValue();
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("express execute failed, and operation value is ");
                            sbLIZ.append(objPop);
                            throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ), null);
                        }
                        throw new C2215701Bnk("express execute failed, and operation value is null", null);
                    }

                    @Override // X.InterfaceC2215771Bnr
                    public final void LIZ(C2215781Bns c2215781Bns, Map<String, ? extends Object> map) {
                        boolean z;
                        boolean zLIZIZ = LIZIZ(c2215781Bns);
                        boolean zLIZIZ2 = LIZIZ(c2215781Bns);
                        Deque<Object> deque = c2215781Bns.LIZ;
                        if (zLIZIZ2 && zLIZIZ) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ((LinkedList) deque).push(Boolean.valueOf(z));
                    }
                };
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                interfaceC2215771Bnr = new InterfaceC2215771Bnr() { // from class: X.1Bnn
                    public static final boolean LIZIZ(C2215781Bns c2215781Bns) {
                        if (!c2215781Bns.LIZ.isEmpty()) {
                            Object objPop = ((LinkedList) c2215781Bns.LIZ).pop();
                            if (objPop instanceof Boolean) {
                                return ((Boolean) objPop).booleanValue();
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("express execute failed, or operation value is ");
                            sbLIZ.append(objPop);
                            throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ), null);
                        }
                        throw new C2215701Bnk("express execute failed, or operation value is null", null);
                    }

                    @Override // X.InterfaceC2215771Bnr
                    public final void LIZ(C2215781Bns c2215781Bns, Map<String, ? extends Object> map) {
                        boolean z;
                        boolean zLIZIZ = LIZIZ(c2215781Bns);
                        boolean zLIZIZ2 = LIZIZ(c2215781Bns);
                        Deque<Object> deque = c2215781Bns.LIZ;
                        if (!zLIZIZ2 && !zLIZIZ) {
                            z = false;
                        } else {
                            z = true;
                        }
                        ((LinkedList) deque).push(Boolean.valueOf(z));
                    }
                };
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                final String str2 = (String) c2215851Bnz.LIZIZ;
                interfaceC2215771Bnr = new InterfaceC2215771Bnr(str2) { // from class: X.1Bnj
                    public final String LIZ;

                    {
                        this.LIZ = str2;
                    }

                    public final Object LIZIZ(C2215781Bns c2215781Bns) {
                        if (!c2215781Bns.LIZ.isEmpty()) {
                            Object objPop = ((LinkedList) c2215781Bns.LIZ).pop();
                            if (objPop != null) {
                                return objPop;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("express execute failed, ");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(" operation value is ");
                            sbLIZ.append(objPop);
                            throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ), null);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("express execute failed, ");
                        sbLIZ2.append(this.LIZ);
                        sbLIZ2.append(" operation value is null");
                        throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ2), null);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
                    @Override // X.InterfaceC2215771Bnr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.C2215781Bns r10, java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
                        /*
                            Method dump skipped, instruction units count: 369
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2215691Bnj.LIZ(X.1Bns, java.util.Map):void");
                    }
                };
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                interfaceC2215771Bnr = new InterfaceC2215771Bnr() { // from class: X.1Bnm
                    public static long LIZIZ(C2215781Bns c2215781Bns) {
                        Boolean boolValueOf;
                        if (!c2215781Bns.LIZ.isEmpty()) {
                            Object objPop = ((LinkedList) c2215781Bns.LIZ).pop();
                            if (!(objPop instanceof Integer)) {
                                if (!(objPop instanceof Long)) {
                                    if (objPop != null) {
                                        boolValueOf = Boolean.valueOf(objPop.equals("epi_unknown"));
                                    } else {
                                        boolValueOf = null;
                                    }
                                    if (C500260Jjc.LJJJI(boolValueOf)) {
                                        return 1L;
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("express execute failed, or operation value is ");
                                    sbLIZ.append(objPop);
                                    throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ), null);
                                }
                                return ((Long) objPop).longValue();
                            }
                            return ((Number) objPop).intValue();
                        }
                        throw new C2215701Bnk("express execute failed, or operation value is null", null);
                    }

                    @Override // X.InterfaceC2215771Bnr
                    public final void LIZ(C2215781Bns c2215781Bns, Map<String, ? extends Object> map) {
                        long jLIZIZ = LIZIZ(c2215781Bns);
                        long jLIZIZ2 = LIZIZ(c2215781Bns);
                        ((LinkedList) c2215781Bns.LIZ).push(Long.valueOf(jLIZIZ2 % jLIZIZ));
                    }
                };
                break;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create operation failed, unknown type ");
                sbLIZ.append(c2215851Bnz.LIZ);
                throw new C2215701Bnk(C2188811AlT.LIZIZ(sbLIZ), null);
        }
        ((ArrayList) list).add(interfaceC2215771Bnr);
    }
}
