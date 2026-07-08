package X;

import com.bytedance.globalpayment.iap.model.IapCommonProduct;
import com.bytedance.globalpayment.iap.model.SKUInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864900yd6 implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Map<String, IapCommonProduct>> c09aj) throws JSONException {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
        }
    }

    public C1864900yd6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C1864900yd6 c1864900yd6, C09AJ c09aj) throws JSONException {
        C1C7U.LIZ("QueryCommonProductTask@c9cc.execute$1");
        Collection<SKUInfo> collectionValues = ((C1792400wkA) c1864900yd6.l0).LIZ.values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SKUInfo) it2.next()).skuId);
        }
        final C1792400wkA c1792400wkA = (C1792400wkA) c1864900yd6.l0;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        InterfaceC1792890wkx interfaceC1792890wkx = new InterfaceC1792890wkx() { // from class: X.0wk9
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1792890wkx
            public final void LIZ(C1792840wks c1792840wks, List list) throws JSONException {
                Object next;
                String str;
                String str2 = "Empty Product Info";
                if (c1792840wks.LIZIZ() && list != null && (!((ArrayList) list).isEmpty())) {
                    C1792400wkA c1792400wkA2 = c1792400wkA;
                    c1792400wkA2.getClass();
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (Object obj : (ArrayList) list) {
                        linkedHashMap.put(((AbstractC1791620wiu) obj).LIZ, obj);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, SKUInfo> entry : c1792400wkA2.LIZ.entrySet()) {
                        AbstractC1791620wiu abstractC1791620wiu = (AbstractC1791620wiu) linkedHashMap.get(entry.getValue().skuId);
                        if (abstractC1791620wiu != null) {
                            List listSingletonList = C13BV.INSTANCE;
                            if (Intrinsics.LJFF(abstractC1791620wiu.LIZIZ, "inapp")) {
                                C1791650wix c1791650wix = abstractC1791620wiu.LJ;
                                str = c1791650wix.LIZIZ;
                                listSingletonList = Collections.singletonList(c1791650wix);
                            } else {
                                Iterator it3 = ((ArrayList) abstractC1791620wiu.LJFF).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        C1791630wiv c1791630wiv = (C1791630wiv) next;
                                        if (Intrinsics.LJFF(c1791630wiv.LIZIZ, entry.getValue().basePlanId) && Intrinsics.LJFF(c1791630wiv.LIZJ, entry.getValue().offerId)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                C1791630wiv c1791630wiv2 = (C1791630wiv) next;
                                if (c1791630wiv2 != null) {
                                    listSingletonList = c1791630wiv2.LIZLLL;
                                    str = c1791630wiv2.LJFF;
                                } else {
                                    str = "";
                                }
                            }
                            if (str.length() > 0 && (!listSingletonList.isEmpty())) {
                                linkedHashMap2.put(entry.getKey(), new IapCommonProduct(abstractC1791620wiu.LIZIZ, abstractC1791620wiu.LIZJ, abstractC1791620wiu.LIZLLL, listSingletonList, str));
                            }
                        }
                    }
                    if (!linkedHashMap2.isEmpty()) {
                        c19482611Ke.onNext(linkedHashMap2);
                        C1792410wkB c1792410wkB = c1792400wkA.LIZIZ;
                        c1792410wkB.getClass();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String strLJIILL = new Gson().LJIILL(linkedHashMap2);
                            strLJIILL.toString();
                            jSONObject.put("sku_list", strLJIILL);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c1792410wkB.LJ(jSONObject);
                    } else {
                        C1792400wkA c1792400wkA3 = c1792400wkA;
                        c1792400wkA3.getClass();
                        int i = c1792840wks.LIZ;
                        if (!c1792840wks.LIZIZ()) {
                            str2 = c1792840wks.LJ;
                        }
                        C1792840wks c1792840wks2 = new C1792840wks(211, i, str2);
                        c1792400wkA3.LIZIZ.LIZJ(c1792840wks2, null);
                        c19482611Ke.onError(new C1792490wkJ(c1792840wks2));
                    }
                    c19482611Ke.onComplete();
                    return;
                }
                C1792400wkA c1792400wkA4 = c1792400wkA;
                c1792400wkA4.getClass();
                int i2 = c1792840wks.LIZ;
                if (!c1792840wks.LIZIZ()) {
                    str2 = c1792840wks.LJ;
                }
                C1792840wks c1792840wks3 = new C1792840wks(211, i2, str2);
                c1792400wkA4.LIZIZ.LIZJ(c1792840wks3, null);
                C1792490wkJ c1792490wkJ = new C1792490wkJ(c1792840wks3);
                LIZJ(c1792840wks3, null);
                c19482611Ke.onError(c1792490wkJ);
            }
        };
        C1792410wkB c1792410wkB = c1792400wkA.LIZIZ;
        c1792410wkB.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sku_id", arrayList.toString());
        c1792410wkB.LIZLLL(jSONObject);
        ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
        C1794520wna.LIZLLL(EnumC1791830wjF.GOOGLE, arrayList, true, interfaceC1792890wkx);
        C1C7U.LIZIZ("QueryCommonProductTask@c9cc.execute$1");
    }

    public static final void subscribe$1(C1864900yd6 c1864900yd6, C09AJ c09aj) {
        C1C7U.LIZ("QueryPurchasesTask@71a.execute$1");
        final C1792550wkP c1792550wkP = (C1792550wkP) c1864900yd6.l0;
        final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        InterfaceC1794730wnv interfaceC1794730wnv = new InterfaceC1794730wnv() { // from class: X.0wkO
            @Override // X.InterfaceC1794730wnv
            public final void LIZ() {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LIZJ(EnumC1791830wjF enumC1791830wjF, String str) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJ(C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJI(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJII(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks) {
            }

            @Override // X.InterfaceC1794730wnv
            public final void LJIIIZ(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
            }

            @Override // X.InterfaceC1794730wnv
            public final /* synthetic */ void LJIIJ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List list) {
            }

            @Override // X.InterfaceC1794730wnv
            public final void LJIIIIZZ(C1792840wks c1792840wks, List list) throws JSONException {
                C1792840wks c1792840wks2;
                AbstractC1792180wjo abstractC1792180wjo = (AbstractC1792180wjo) c1792550wkP.LIZ.getValue();
                if (c1792840wks == null) {
                    c1792550wkP.getClass();
                    c1792840wks2 = new C1792840wks();
                } else {
                    c1792840wks2 = c1792840wks;
                }
                abstractC1792180wjo.getClass();
                JSONObject jSONObject = new JSONObject();
                ArrayList arrayList = null;
                if (c1792840wks2.LIZIZ()) {
                    if (list != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((AbstractC1794600wni) it2.next()).LJFF);
                        }
                    }
                    jSONObject.put("purchase_list", arrayList);
                    abstractC1792180wjo.LJ(jSONObject);
                } else {
                    abstractC1792180wjo.LIZJ(c1792840wks2, null);
                }
                if (!c19482611Ke.isDisposed()) {
                    if (c1792840wks != null && c1792840wks.LIZIZ()) {
                        C09AJ<List<AbstractC1794600wni>> c09aj2 = c19482611Ke;
                        if (list == null) {
                            list = C13BV.INSTANCE;
                        }
                        c09aj2.onNext((List<AbstractC1794600wni>) list);
                        return;
                    }
                    if (c1792840wks == null) {
                        c1792550wkP.getClass();
                        c1792840wks = new C1792840wks();
                    }
                    c19482611Ke.onError(new C1792490wkJ(c1792840wks));
                }
            }
        };
        ((AbstractC1792180wjo) c1792550wkP.LIZ.getValue()).LIZLLL(null);
        ((C1794180wn2) C1794180wn2.LIZJ()).LIZ();
        C1794520wna.LIZJ(EnumC1791830wjF.GOOGLE, interfaceC1794730wnv);
        C1C7U.LIZIZ("QueryPurchasesTask@71a.execute$1");
    }
}
