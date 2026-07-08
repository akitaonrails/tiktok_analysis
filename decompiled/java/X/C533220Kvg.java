package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Kvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533220Kvg extends AbstractC532930KvD {
    public static final List<String> LJFF = C1697810uHb.LJIIJJI("TT", "CC");
    public final C054G LIZJ;
    public final String LIZLLL;
    public final C389400FOo LJ;

    public C533220Kvg() {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LIZLLL = "WuZhuiDownloader LokiHandler";
        this.LJ = C389400FOo.LJFF.getValue();
    }

    @Override // X.AbstractC532930KvD
    public final String LJ() {
        return this.LIZLLL;
    }

    public static C533320Kvq LJIIJ(C297501Dh c297501Dh) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) c297501Dh.LIZIZ;
        String str = (String) linkedHashMap.get("resource_id");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = (String) linkedHashMap.get("panel");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) linkedHashMap.get("effect_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) linkedHashMap.get("app_name");
        if (str5 != null) {
            str2 = str5;
        }
        return new C533320Kvq(str, str3, str4, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0Kvo] */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.0Kvi] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0Kvn] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.ss.android.ugc.effectmanager.EffectManager] */
    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
    public final void LIZ(List list, final C535880Kzy c535880Kzy) {
        Object obj;
        Object obj2;
        ?? r0;
        ArrayList arrayList;
        ArrayList arrayList2;
        final ?? r6 = (EffectManager) this.LIZIZ.getValue();
        if (r6 == 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            C297501Dh c297501Dh = new C297501Dh(str);
            if (!LJIIIIZZ(c297501Dh, "effect_platform", c535880Kzy, str, -2001)) {
                return;
            }
            C533320Kvq c533320KvqLJIIJ = LJIIJ(c297501Dh);
            if (c533320KvqLJIIJ.LIZJ.length() > 0) {
                Collection collection = (Collection) linkedHashMap.get(c533320KvqLJIIJ.LIZLLL);
                if (collection != null) {
                    arrayList = new ArrayList(collection);
                } else {
                    arrayList = new ArrayList();
                }
                linkedHashMap.put(c533320KvqLJIIJ.LIZLLL, C1717206ny.LIZ(str, arrayList));
            } else if (c533320KvqLJIIJ.LIZ.length() > 0 && c533320KvqLJIIJ.LIZIZ.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c533320KvqLJIIJ.LIZLLL);
                sbLIZ.append("****");
                sbLIZ.append(c533320KvqLJIIJ.LIZIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Collection collection2 = (Collection) linkedHashMap2.get(strLIZIZ);
                if (collection2 != null) {
                    arrayList2 = new ArrayList(collection2);
                } else {
                    arrayList2 = new ArrayList();
                }
                linkedHashMap2.put(strLIZIZ, C1717206ny.LIZ(str, arrayList2));
            } else {
                c535880Kzy.onError(str, -2001, "urs needs effect_id or (panel + resource_id)");
            }
        }
        if (!linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                final List<String> list2 = (List) entry.getValue();
                final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                final ArrayList arrayList3 = new ArrayList();
                for (String str3 : list2) {
                    Object obj3 = ((LinkedHashMap) new C297501Dh(str3).LIZIZ).get("effect_id");
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    linkedHashMap3.put(obj3, str3);
                    arrayList3.add(obj3);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                if (a0.LJJJIL(str2)) {
                    C538170L8t.LIZ("TT", linkedHashMap4);
                } else {
                    C538170L8t.LIZ(str2, linkedHashMap4);
                }
                final ?? r1 = new IFetchEffectListListener() { // from class: X.0Kvn
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        String msg;
                        List<String> list3 = list2;
                        InterfaceC531800KtO interfaceC531800KtO = c535880Kzy;
                        for (String str4 : list3) {
                            if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                                msg = "fetchEffectList batch fail";
                            }
                            interfaceC531800KtO.onError(str4, -2003, msg);
                        }
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<Effect> list3) {
                        String effectId;
                        List<Effect> list4 = list3;
                        Set setLLIIIZ = C13LP.LLIIIZ(list2);
                        if (list4 != null) {
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator<Effect> it3 = list4.iterator();
                            while (true) {
                                String resourceId = null;
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Effect next = it3.next();
                                Effect effect = next;
                                if (effect != null) {
                                    resourceId = effect.getResourceId();
                                }
                                if (hashSet.add(resourceId)) {
                                    arrayList4.add(next);
                                }
                            }
                            Map<String, String> map = linkedHashMap3;
                            List<String> list5 = list2;
                            InterfaceC531800KtO interfaceC531800KtO = c535880Kzy;
                            C533220Kvg c533220Kvg = this;
                            int i = 0;
                            for (Object obj4 : arrayList4) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    Effect effect2 = (Effect) obj4;
                                    String str4 = "";
                                    if (effect2 == null || (effectId = effect2.getEffectId()) == null) {
                                        effectId = "";
                                    }
                                    String str5 = map.get(effectId);
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    if (str5.length() == 0) {
                                        String str6 = (String) C13LP.LJJJLZIJ(i, list5);
                                        if (str6 != null) {
                                            str4 = str6;
                                        }
                                        str5 = str4;
                                    }
                                    if (str5.length() != 0 && setLLIIIZ.remove(str5)) {
                                        if (effect2 == null) {
                                            interfaceC531800KtO.onError(str5, -2004, "effect is null");
                                        } else {
                                            c533220Kvg.LIZLLL(str5, effect2.getUnzipPath());
                                            interfaceC531800KtO.LJJI(str5, effect2.getUnzipPath());
                                        }
                                    }
                                    i = i2;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        InterfaceC531800KtO interfaceC531800KtO2 = c535880Kzy;
                        Iterator it4 = setLLIIIZ.iterator();
                        while (it4.hasNext()) {
                            interfaceC531800KtO2.onError((String) it4.next(), -2004, "effect is null");
                        }
                    }
                };
                if (a0.LJJJIL(str2)) {
                    r1 = new IFetchEffectListListener() { // from class: X.0Kvp
                        public final /* synthetic */ boolean LJ = true;

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            String msg;
                            C533220Kvg c533220Kvg = this;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("fetchEffectList TT failed, retry CC: msg=");
                            if (exceptionResult != null) {
                                msg = exceptionResult.getMsg();
                            } else {
                                msg = null;
                            }
                            sbLIZ2.append(msg);
                            c533220Kvg.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            C538170L8t.LIZ("CC", linkedHashMap5);
                            r6.fetchEffectList(arrayList3, this.LJ, linkedHashMap5, r1);
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(List<Effect> list3) {
                            r1.onSuccess(list3);
                        }
                    };
                }
                r6.fetchEffectList(arrayList3, true, linkedHashMap4, r1);
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                String str4 = (String) entry2.getKey();
                List<String> list3 = (List) entry2.getValue();
                final LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                final ArrayList arrayList4 = new ArrayList();
                for (String str5 : list3) {
                    Object obj4 = ((LinkedHashMap) new C297501Dh(str5).LIZIZ).get("resource_id");
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    linkedHashMap5.put(obj4, str5);
                    arrayList4.add(obj4);
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str4, new String[]{"****"}, 2, 2);
                if (listLJJLIIIJILLIZJL.size() <= 0 || 1 == 0) {
                    obj = "";
                } else {
                    obj = ListProtector.get(listLJJLIIIJILLIZJL, 0);
                }
                String str6 = (String) obj;
                if (1 >= listLJJLIIIJILLIZJL.size()) {
                    obj2 = "";
                } else {
                    obj2 = ListProtector.get(listLJJLIIIJILLIZJL, 1);
                }
                final String str7 = (String) obj2;
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("panel", str7);
                if (a0.LJJJIL(str6)) {
                    C538170L8t.LIZ("TT", linkedHashMap6);
                } else {
                    C538170L8t.LIZ(str6, linkedHashMap6);
                }
                final ?? r16 = new IFetchEffectListByIdsListener() { // from class: X.0Kvi
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        String msg;
                        String msg2;
                        C533220Kvg c533220Kvg = this.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetchEffectList fail:  ");
                        if (exceptionResult != null) {
                            msg = exceptionResult.getMsg();
                        } else {
                            msg = null;
                        }
                        sbLIZ2.append(msg);
                        c533220Kvg.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                        List<String> list4 = arrayList4;
                        InterfaceC531800KtO interfaceC531800KtO = c535880Kzy;
                        for (String str8 : list4) {
                            if (exceptionResult == null || (msg2 = exceptionResult.getMsg()) == null) {
                                msg2 = "";
                            }
                            interfaceC531800KtO.onError(str8, -2004, msg2);
                        }
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(EffectListResponse effectListResponse) {
                        List<Effect> effect_list;
                        EffectListResponse effectListResponse2 = effectListResponse;
                        if (effectListResponse2 == null || (effect_list = effectListResponse2.getEffect_list()) == null) {
                            effect_list = C13BV.INSTANCE;
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<Effect> it3 = effect_list.iterator();
                        while (true) {
                            String str8 = "";
                            if (!it3.hasNext()) {
                                break;
                            }
                            Effect next = it3.next();
                            String resourceId = next.getResourceId();
                            if (resourceId != null) {
                                str8 = resourceId;
                            }
                            if (hashSet.add(str8)) {
                                arrayList5.add(next);
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            c535880Kzy.onError("", -2004, "effectList is empty");
                            return;
                        }
                        AtomicLong atomicLong = new AtomicLong(arrayList5.size());
                        C533220Kvg c533220Kvg = this.LIZ;
                        EffectManager effectManager = r6;
                        Map<String, String> map = linkedHashMap5;
                        String str9 = str7;
                        InterfaceC531800KtO interfaceC531800KtO = c535880Kzy;
                        Iterator it4 = arrayList5.iterator();
                        while (it4.hasNext()) {
                            C23250099c.LIZLLL(c533220Kvg.LIZJ, null, null, new C533230Kvh(map, (Effect) it4.next(), c533220Kvg, effectManager, interfaceC531800KtO, atomicLong, str9, null), 3);
                            str9 = str9;
                        }
                    }
                };
                if (a0.LJJJIL(str6)) {
                    r0 = new IFetchEffectListByIdsListener() { // from class: X.0Kvo
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            String msg;
                            C533220Kvg c533220Kvg = this;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("fetchEffectList (panel) TT failed, retry CC: msg=");
                            if (exceptionResult != null) {
                                msg = exceptionResult.getMsg();
                            } else {
                                msg = null;
                            }
                            sbLIZ2.append(msg);
                            c533220Kvg.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                            linkedHashMap7.put("panel", str7);
                            C538170L8t.LIZ("CC", linkedHashMap7);
                            r6.fetchEffectList(arrayList4, linkedHashMap7, r16);
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(EffectListResponse effectListResponse) {
                            r16.onSuccess(effectListResponse);
                        }
                    };
                } else {
                    r0 = r16;
                }
                r6.fetchEffectList(arrayList4, linkedHashMap6, r0);
            }
        }
    }

    @Override // X.AbstractC532930KvD, X.InterfaceC533130KvX
    public final void LIZIZ(String str, InterfaceC531800KtO interfaceC531800KtO) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadResource: ");
        sbLIZ.append(str);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        C297501Dh c297501Dh = new C297501Dh(str);
        if (!LJIIIIZZ(c297501Dh, "effect_platform", interfaceC531800KtO, str, -2001)) {
            return;
        }
        C533320Kvq c533320KvqLJIIJ = LJIIJ(c297501Dh);
        EffectManager effectManager = (EffectManager) this.LIZIZ.getValue();
        if (effectManager == null) {
            interfaceC531800KtO.onError(str, -2003, "effectManager not available");
            return;
        }
        if (c533320KvqLJIIJ.LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && c533320KvqLJIIJ.LIZIZ.length() == 0) {
            if (c533320KvqLJIIJ.LIZJ.length() == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("effectId is empty: ");
                sbLIZ2.append(str);
                LJI(C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC531800KtO.onError(str, -2002, "effect_id is empty");
                return;
            }
            C23250099c.LIZLLL(this.LIZJ, null, null, new C533200Kve(this, c533320KvqLJIIJ, str, interfaceC531800KtO, effectManager, null), 3);
            return;
        }
        if (!LJIIIZ(c533320KvqLJIIJ.LIZIZ, "panel", interfaceC531800KtO, str, -2001)) {
            return;
        }
        C23250099c.LIZLLL(this.LIZJ, null, null, new C533210Kvf(this, c533320KvqLJIIJ, str, interfaceC531800KtO, effectManager, C1697810uHb.LJ(c533320KvqLJIIJ.LIZ), null), 3);
    }

    public static void LJIIJJI(Map map, long j, InterfaceC531800KtO interfaceC531800KtO) {
        if (j <= 0 && !map.isEmpty()) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                String str = (String) ((Map.Entry) it2.next()).getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("effect is null urs=");
                sbLIZ.append(str);
                interfaceC531800KtO.onError(str, -2004, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
