package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS652S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08We, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2130208We {
    public static final C01GW<C2130208We> LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1242));
    public final ConcurrentHashMap<String, C2130808Wk> LIZ = new ConcurrentHashMap<>();
    public final C080X LIZIZ;

    public C2130208We() {
        new C2128608Vo(new AwS582S0100000_3(this, 125));
        this.LIZIZ = new C080X(new AwS652S0100000_3(this, 5));
        C18E3.LJII(new C18HS() { // from class: X.08Wo
            @Override // X.C18HS
            public final void onPageCreated(Object obj) {
            }

            @Override // X.C18HS
            public final void onPagePaused(Object obj) {
            }

            @Override // X.C18HS
            public final void onPageResumed(Object obj) {
            }

            @Override // X.C18HS
            public final void onPageDestroyed(Object obj) {
                String str;
                Object obj2;
                Object next;
                String str2;
                boolean zLJFF;
                C21246818Cs btmPageInfoV2 = BtmSDK.INSTANCE.getBtmPageInfoV2(PageFinder.via(obj));
                if (btmPageInfoV2 != null && (str = btmPageInfoV2.LIZIZ) != null) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
                    if (listLJJLIIIJILLIZJL.size() > 2) {
                        obj2 = ListProtector.get(listLJJLIIIJILLIZJL, 1);
                    } else {
                        obj2 = null;
                    }
                    if (C770702zh.LIZIZ((String) obj2)) {
                        Iterator it2 = ((ArrayList) C2131308Wp.LIZJ.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                ECPreloadEntry eCPreloadEntry = (ECPreloadEntry) next;
                                List<String> list = eCPreloadEntry.btmV2;
                                if (list != null) {
                                    zLJFF = list.contains(obj2);
                                } else {
                                    zLJFF = Intrinsics.LJFF(obj2, eCPreloadEntry.btm);
                                }
                                if (zLJFF) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        ECPreloadEntry eCPreloadEntry2 = (ECPreloadEntry) next;
                        if (eCPreloadEntry2 != null && (str2 = eCPreloadEntry2.pageName) != null) {
                            this.LIZ.LIZ(str2);
                            C2132108Wx c2132108WxLIZ = C2130608Wi.LIZ();
                            synchronized (c2132108WxLIZ.LIZ) {
                                try {
                                    List<AbstractC2132008Ww> list2 = c2132108WxLIZ.LIZ;
                                    ArrayList arrayList = new ArrayList();
                                    for (AbstractC2132008Ww abstractC2132008Ww : list2) {
                                        if (Intrinsics.LJFF(abstractC2132008Ww.LJFF().pageName, str2)) {
                                            arrayList.add(abstractC2132008Ww);
                                        }
                                    }
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        ((AbstractC2132008Ww) it3.next()).LIZ();
                                    }
                                    c2132108WxLIZ.LIZ.removeAll(C13LP.LLIIJI(arrayList));
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    public final synchronized void LIZ(String str) {
        ConcurrentHashMap<String, C2130808Wk> concurrentHashMap = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C2130808Wk> entry : concurrentHashMap.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue().LIZ.pageName, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            LIZIZ((C2130808Wk) ((Map.Entry) it2.next()).getValue());
        }
    }

    public final void LIZIZ(C2130808Wk c2130808Wk) throws JSONException {
        AnonymousClass0956 anonymousClass0956;
        c2130808Wk.getClass();
        c2130808Wk.LJII = EnumC2131008Wm.CANCEL;
        C08W0 c08w0 = c2130808Wk.LJI;
        if (c08w0 != null && (anonymousClass0956 = c08w0.LIZLLL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C2131808Wu c2131808Wu = c2130808Wk.LJIIIIZZ;
        if (c2131808Wu != null) {
            C2132108Wx c2132108WxLIZ = C2130608Wi.LIZ();
            c2132108WxLIZ.getClass();
            c2131808Wu.LIZ();
            c2131808Wu.LJIIJ = System.currentTimeMillis();
            C1505950pI9.LJ(c2131808Wu, "cancel", null);
            c2132108WxLIZ.LIZ.remove(c2131808Wu);
        }
        C19719512Dh.LIZJ(this.LIZ).remove(c2130808Wk.LIZ.entryId);
    }

    public static void LIZJ(String str, boolean z) {
        C2130508Wh next;
        C2130508Wh c2130508Wh;
        C2132108Wx c2132108WxLIZ = C2130608Wi.LIZ();
        c2132108WxLIZ.getClass();
        try {
            synchronized (c2132108WxLIZ.LIZIZ) {
                try {
                    Iterator<C2130508Wh> it2 = c2132108WxLIZ.LIZIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.LJ.contains(str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    c2130508Wh = next;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c2130508Wh != null && C1505950pI9.LJFF()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stage", "hit");
                jSONObject.put("is_cache", z ? 1 : 0);
                jSONObject.put("resource_id", str);
                String str2 = c2130508Wh.LIZ;
                String str3 = c2130508Wh.LIZIZ;
                String str4 = "unknown";
                if (str3 == null) {
                    str3 = "unknown";
                }
                String str5 = c2130508Wh.LIZJ;
                if (str5 == null) {
                    str5 = "unknown";
                }
                String str6 = c2130508Wh.LIZLLL;
                if (str6 != null) {
                    str4 = str6;
                }
                C1505950pI9.LIZ(jSONObject, str2, str3, str5, str4, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR100, e, null);
        }
    }

    public final synchronized void LJ(AbstractC1931807hU abstractC1931807hU, Map<String, ? extends Object> map, String str) {
        String str2 = abstractC1931807hU.LIZ;
        if (str2 == null) {
            return;
        }
        C2130808Wk c2130808WkLIZ = this.LIZ.get(str2);
        if (c2130808WkLIZ != null) {
            AbstractC1903507cv abstractC1903507cvLIZ = c2130808WkLIZ.LIZ(abstractC1931807hU);
            if (abstractC1903507cvLIZ != null) {
                if (abstractC1903507cvLIZ.LIZ) {
                    LIZIZ(c2130808WkLIZ);
                    ECPreloadEntry eCPreloadEntryLIZIZ = C2131308Wp.LIZIZ(str2);
                    if (eCPreloadEntryLIZIZ != null && (c2130808WkLIZ = C2130308Wf.LIZ(eCPreloadEntryLIZIZ, str)) != null) {
                        this.LIZ.put(str2, c2130808WkLIZ);
                        AbstractC1903507cv abstractC1903507cvLIZ2 = c2130808WkLIZ.LIZ(abstractC1931807hU);
                        if (abstractC1903507cvLIZ2 != null) {
                            abstractC1903507cvLIZ2.LIZ(map);
                        }
                    }
                } else {
                    abstractC1903507cvLIZ.LIZ(map);
                }
            }
        } else {
            ECPreloadEntry eCPreloadEntryLIZIZ2 = C2131308Wp.LIZIZ(str2);
            if (eCPreloadEntryLIZIZ2 != null && (c2130808WkLIZ = C2130308Wf.LIZ(eCPreloadEntryLIZIZ2, str)) != null) {
                this.LIZ.put(str2, c2130808WkLIZ);
                AbstractC1903507cv abstractC1903507cvLIZ3 = c2130808WkLIZ.LIZ(abstractC1931807hU);
                if (abstractC1903507cvLIZ3 != null) {
                    abstractC1903507cvLIZ3.LIZ(map);
                }
            }
        }
        ConcurrentHashMap<String, C2130808Wk> concurrentHashMap = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C2130808Wk> entry : concurrentHashMap.entrySet()) {
            EnumC2131008Wm enumC2131008Wm = entry.getValue().LJII;
            if (enumC2131008Wm == EnumC2131008Wm.SUCCESS || enumC2131008Wm == EnumC2131008Wm.FAIL || enumC2131008Wm == EnumC2131008Wm.CANCEL) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            LIZIZ((C2130808Wk) ((Map.Entry) it2.next()).getValue());
        }
        C2130808Wk c2130808Wk = c2130808WkLIZ;
        if (c2130808Wk != null) {
            c2130808Wk.LIZJ();
        }
    }

    public static void LIZLLL(C2130208We c2130208We, String str, Map map, n nVar, String str2, int i) {
        String str3 = str2;
        n nVar2 = nVar;
        if ((i & 4) != 0) {
            nVar2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if (c2130208We.LIZIZ.LIZIZ().contains(str)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08VV(c2130208We, str, map, nVar2, str3, null), 3);
        }
    }
}
