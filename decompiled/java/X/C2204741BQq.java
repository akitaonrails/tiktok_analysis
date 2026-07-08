package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204741BQq implements C1BRJ {
    public final C19919812wm LIZ;
    public final C2204731BQp LIZIZ;
    public final Map<String, C1BRD> LIZJ = new HashMap();
    public final Map<String, InterfaceC1059630dgH> LIZLLL = new HashMap();
    public final List<C2204761BQs> LJ = new ArrayList();
    public final Set<AbstractC1835360xrS> LJFF = new HashSet();
    public final Set<C1BRF> LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final AbstractC2204751BQr LJIIIZ;

    @Override // X.C1BRJ
    public final void LIZ() {
        ArrayList arrayList = new ArrayList();
        LinkedList<C2204761BQs> linkedList = new LinkedList(this.LJ);
        ((ArrayList) this.LJ).clear();
        for (C2204761BQs c2204761BQs : linkedList) {
            this.LJIIIZ.LJI(c2204761BQs);
            arrayList.add(c2204761BQs.toString());
        }
        C2204811BQx c2204811BQx = new C2204811BQx();
        c2204811BQx.LIZJ(arrayList, "list");
        c2204811BQx.LIZ("label_pending_call_list", C2204711BQn.LJII);
    }

    public final void LJFF() {
        for (AbstractC1835360xrS abstractC1835360xrS : this.LJFF) {
            abstractC1835360xrS.LJIIIZ();
            abstractC1835360xrS.LJIIIIZZ();
        }
        this.LJFF.clear();
        this.LIZJ.clear();
        this.LIZLLL.clear();
        C2204701BQm c2204701BQm = this.LIZIZ.LIZJ;
        if (c2204701BQm != null) {
            ((CopyOnWriteArraySet) c2204701BQm.LIZLLL).remove(this);
        }
    }

    public final Object LIZLLL(String str, C1BRD c1brd) {
        C19919812wm c19919812wm = this.LIZ;
        Type genericSuperclass = c1brd.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            c19919812wm.getClass();
            C19919812wm.LIZ(str);
            if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
                return new JSONObject(str);
            }
            return c19919812wm.LIZ.LIZIZ(str, type);
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    public final C1BRB LJ(final C2204761BQs c2204761BQs, C2204771BQt c2204771BQt) throws JSONException, C1BRG {
        String str;
        String str2;
        C1BRD c1brd = (C1BRD) ((HashMap) this.LIZJ).get(c2204761BQs.LIZLLL);
        C1543850qHH c1543850qHH = c2204761BQs.LJIIJJI;
        c1543850qHH.LJIIIZ = c2204771BQt.LIZLLL;
        c1543850qHH.LIZ = c2204761BQs.LIZLLL;
        c1543850qHH.LIZIZ = c2204771BQt.LIZIZ;
        c1543850qHH.LJI = "JSBridge2";
        c1543850qHH.LIZJ = Integer.valueOf(c2204761BQs.LJIIJ);
        c2204761BQs.LJIIJJI.getClass();
        C1543850qHH c1543850qHH2 = c2204761BQs.LJIIJJI;
        c1543850qHH2.LJIIJJI = c2204761BQs.LJII;
        c1543850qHH2.LIZ();
        try {
            String str3 = c2204771BQt.LIZIZ;
            if (TextUtils.isEmpty(str3) || "about:blank".equals(str3)) {
                String strLJFF = this.LJIIIZ.LJFF();
                if (!TextUtils.isEmpty(strLJFF)) {
                    c2204771BQt.LIZIZ = strLJFF;
                    C2204811BQx c2204811BQx = new C2204811BQx();
                    c2204811BQx.LIZJ(strLJFF, "url");
                    c2204811BQx.LIZ("label_call_new_url", c2204761BQs.LJIIL);
                }
            }
            if (c1brd != null) {
                EnumC1062390dkj enumC1062390dkjLIZJ = LIZJ(c1brd, c2204761BQs.LJIIJJI, c2204771BQt.LIZIZ, c2204761BQs.LJIIL);
                if (enumC1062390dkjLIZJ == null) {
                    if (!TextUtils.isEmpty(c2204771BQt.LIZIZ) && !"about:blank".equals(c2204771BQt.LIZIZ)) {
                        str2 = "permission_empty_1";
                    } else {
                        str2 = "about_blank_1";
                    }
                    C2204811BQx c2204811BQx2 = new C2204811BQx();
                    c2204811BQx2.LIZJ("permission_empty_1", "reason");
                    c2204811BQx2.LIZ("label_call_handler_reject", c2204761BQs.LJIIL);
                    LIZIZ(1, c2204771BQt.LIZIZ, c2204761BQs.LIZLLL, str2, c2204761BQs.LJIIL);
                    Iterator<C1BRF> it2 = this.LJI.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(c2204761BQs, 1);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Permission denied, call: ");
                    sbLIZ.append(c2204761BQs);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c2204761BQs.LJIIJJI.LIZIZ(0, "jsb_auth_error_event_v2", null);
                    throw new C1BRG();
                }
                new C2204811BQx().LIZ("label_pre_handle_origin_url", c2204761BQs.LJIIL);
                if (c1brd instanceof AbstractC1835370xrT) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Processing stateless call: ");
                    sbLIZ2.append(c2204761BQs);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    AbstractC1835370xrT abstractC1835370xrT = (AbstractC1835370xrT) c1brd;
                    LIZLLL(c2204761BQs.LJ, abstractC1835370xrT);
                    Object objLJ = abstractC1835370xrT.LJ();
                    if (objLJ instanceof JSONObject) {
                        try {
                            ((JSONObject) objLJ).put("code", 1);
                            JSONObject jSONObject = (JSONObject) objLJ;
                            if (jSONObject != null) {
                                return new C1BRB(jSONObject);
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    return new C1BRB(true, C1699620uKW.LIZIZ(this.LIZ, objLJ));
                }
                if (c1brd instanceof C1BRC) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Processing raw call: ");
                    sbLIZ3.append(c2204761BQs);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    ((C1BRC) c1brd).LJ(c2204761BQs, new C1BRA(c2204761BQs.LIZLLL, enumC1062390dkjLIZJ, new C1BRE(this, c2204761BQs)));
                    return new C1BRB(false, "");
                }
            }
            InterfaceC1059630dgH interfaceC1059630dgH = (InterfaceC1059630dgH) ((HashMap) this.LIZLLL).get(c2204761BQs.LIZLLL);
            if (interfaceC1059630dgH != null) {
                final AbstractC1835360xrS abstractC1835360xrSLIZ = interfaceC1059630dgH.LIZ();
                abstractC1835360xrSLIZ.LL = c2204761BQs.LIZLLL;
                if (LIZJ(abstractC1835360xrSLIZ, c2204761BQs.LJIIJJI, c2204771BQt.LIZIZ, c2204761BQs.LJIIL) == null) {
                    if (!TextUtils.isEmpty(c2204771BQt.LIZIZ) && !"about:blank".equals(c2204771BQt.LIZIZ)) {
                        str = "permission_empty_2";
                    } else {
                        str = "about_blank_2";
                    }
                    C2204811BQx c2204811BQx3 = new C2204811BQx();
                    c2204811BQx3.LIZJ("permission_empty_2", "reason");
                    c2204811BQx3.LIZ("label_call_handler_reject", c2204761BQs.LJIIL);
                    LIZIZ(1, c2204771BQt.LIZIZ, c2204761BQs.LIZLLL, str, c2204761BQs.LJIIL);
                    Iterator<C1BRF> it3 = this.LJI.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZIZ(c2204761BQs, 1);
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Permission denied, call: ");
                    sbLIZ4.append(c2204761BQs);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    abstractC1835360xrSLIZ.LJIIIIZZ();
                    c2204761BQs.LJIIJJI.LIZIZ(0, "jsb_auth_error_event_v2", null);
                    throw new C1BRG();
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Processing stateful call: ");
                sbLIZ5.append(c2204761BQs);
                C2188811AlT.LIZIZ(sbLIZ5);
                new C2204811BQx().LIZ("label_pre_handle_origin_url", c2204761BQs.LJIIL);
                ((HashSet) this.LJFF).add(abstractC1835360xrSLIZ);
                Object objLIZLLL = LIZLLL(c2204761BQs.LJ, abstractC1835360xrSLIZ);
                InterfaceC1807620x8i interfaceC1807620x8i = new InterfaceC1807620x8i() { // from class: X.1BQy
                    @Override // X.InterfaceC1807620x8i
                    public final void onFailed() {
                        AbstractC2204751BQr abstractC2204751BQr = this.LIZJ.LJIIIZ;
                        if (abstractC2204751BQr == null) {
                            return;
                        }
                        abstractC2204751BQr.LIZJ(C1699620uKW.LIZ(null), c2204761BQs);
                        ((HashSet) this.LIZJ.LJFF).remove(abstractC1835360xrSLIZ);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
                    @Override // X.InterfaceC1807620x8i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(java.lang.Object r4) {
                        /*
                            r3 = this;
                            X.1BQq r0 = r3.LIZJ
                            X.1BQr r0 = r0.LJIIIZ
                            if (r0 != 0) goto L7
                            return
                        L7:
                            boolean r0 = r4 instanceof org.json.JSONObject
                            if (r0 == 0) goto L1e
                            r2 = r4
                            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: org.json.JSONException -> L1a
                            java.lang.String r1 = "code"
                            r0 = 1
                            r2.put(r1, r0)     // Catch: org.json.JSONException -> L1a
                            r2 = r4
                            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: org.json.JSONException -> L1a
                            if (r2 == 0) goto L1e
                            goto L2e
                        L1a:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        L1e:
                            X.1BQq r0 = r3.LIZJ
                            X.1BQr r2 = r0.LJIIIZ
                            X.12wm r0 = r0.LIZ
                            java.lang.String r1 = X.C1699620uKW.LIZIZ(r0, r4)
                            X.1BQs r0 = r2
                            r2.LIZJ(r1, r0)
                            goto L37
                        L2e:
                            X.1BQq r0 = r3.LIZJ
                            X.1BQr r1 = r0.LJIIIZ
                            X.1BQs r0 = r2
                            r1.LIZLLL(r2, r0)
                        L37:
                            X.1BQq r0 = r3.LIZJ
                            java.util.Set<X.0xrS> r1 = r0.LJFF
                            X.0xrS r0 = r3
                            java.util.HashSet r1 = (java.util.HashSet) r1
                            r1.remove(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2204821BQy.LIZ(java.lang.Object):void");
                    }

                    @Override // X.InterfaceC1807620x8i
                    public final void LIZIZ(JSONObject jSONObject2) {
                        AbstractC2204751BQr abstractC2204751BQr = this.LIZJ.LJIIIZ;
                        if (abstractC2204751BQr == null) {
                            return;
                        }
                        abstractC2204751BQr.LIZLLL(jSONObject2, c2204761BQs);
                        ((HashSet) this.LIZJ.LJFF).remove(abstractC1835360xrSLIZ);
                    }
                };
                abstractC1835360xrSLIZ.LLILZ = c2204771BQt;
                abstractC1835360xrSLIZ.LLILLL = interfaceC1807620x8i;
                abstractC1835360xrSLIZ.LJII(objLIZLLL, c2204771BQt);
                return new C1BRB(false, "");
            }
            C2204811BQx c2204811BQx4 = new C2204811BQx();
            c2204811BQx4.LIZJ("not_registered_2", "reason");
            c2204811BQx4.LIZ("label_call_handler_reject", c2204761BQs.LJIIL);
            LIZIZ(2, c2204771BQt.LIZIZ, c2204761BQs.LIZLLL, "not_registered_2", c2204761BQs.LJIIL);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Received call: ");
            sbLIZ6.append(c2204761BQs);
            sbLIZ6.append(", but not registered.");
            C2188811AlT.LIZIZ(sbLIZ6);
            return null;
        } catch (C2204681BQk e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("No remote permission config fetched, call pending: ");
            sbLIZ7.append(c2204761BQs);
            C2188811AlT.LIZIZ(sbLIZ7);
            C2204811BQx c2204811BQx5 = new C2204811BQx();
            c2204811BQx5.LIZJ(C2204681BQk.class.getSimpleName(), "exception_name");
            c2204811BQx5.LIZJ(e2.getMessage(), "exception_message");
            c2204811BQx5.LIZ("label_call_pending", c2204761BQs.LJIIL);
            ((ArrayList) this.LJ).add(c2204761BQs);
            return new C1BRB(false, "");
        }
    }

    public C2204741BQq(C2203421BLo c2203421BLo, AbstractC2204751BQr abstractC2204751BQr, C2204651BQh c2204651BQh) {
        boolean z;
        this.LJIIIZ = abstractC2204751BQr;
        this.LIZ = c2203421BLo.LIZLLL;
        C2204731BQp c2204731BQp = new C2204731BQp(c2204651BQh, c2203421BLo.LJIIJ, c2203421BLo.LJIIJJI);
        this.LIZIZ = c2204731BQp;
        C2204701BQm c2204701BQm = c2204731BQp.LIZJ;
        if (c2204701BQm != null) {
            ((CopyOnWriteArraySet) c2204701BQm.LIZLLL).add(this);
        }
        this.LJI = c2203421BLo.LJII;
        this.LJII = c2203421BLo.LJI;
        this.LJIIIIZZ = c2203421BLo.LJIIL;
        C2204811BQx c2204811BQx = new C2204811BQx();
        if (c2204651BQh != null) {
            z = true;
        } else {
            z = false;
        }
        c2204811BQx.LIZJ(Boolean.valueOf(z), "config");
        c2204811BQx.LIZ("label_create_call_handler", c2203421BLo.LJIILIIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0187 A[Catch: all -> 0x01a4, TryCatch #1 {, blocks: (B:8:0x0048, B:10:0x0081, B:12:0x0085, B:13:0x0088, B:15:0x00a1, B:16:0x00a7, B:20:0x00bd, B:22:0x00d0, B:24:0x00d4, B:27:0x00de, B:29:0x00e6, B:30:0x00ec, B:32:0x00f2, B:34:0x0102, B:36:0x0118, B:39:0x013b, B:41:0x015a, B:44:0x0162, B:46:0x0166, B:51:0x0187, B:52:0x0189, B:55:0x0194, B:56:0x019d, B:48:0x0181, B:49:0x0184), top: B:64:0x0048, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1062390dkj LIZJ(X.C1BRD r11, X.C1543850qHH r12, java.lang.String r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2204741BQq.LIZJ(X.1BRD, X.0qHH, java.lang.String, java.util.List):X.0dkj");
    }

    public final void LIZIZ(int i, String str, String str2, String str3, List list) {
        Iterator<C1BRF> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(str, str2, i, str3, new C1BM2(C2204711BQn.LJII, this.LJIIIZ.LJIIIZ, list));
        }
    }
}
