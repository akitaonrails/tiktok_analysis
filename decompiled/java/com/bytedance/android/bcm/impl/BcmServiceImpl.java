package com.bytedance.android.bcm.impl;

import X.AbstractC21243518Bl;
import X.AnonymousClass1891;
import X.AnonymousClass1892;
import X.C1397705dX;
import X.C13BV;
import X.C13LP;
import X.C1766940w56;
import X.C1766990w5B;
import X.C189M;
import X.C18A2;
import X.C18AE;
import X.C18AN;
import X.C18AO;
import X.C18AQ;
import X.C18AX;
import X.C18AY;
import X.C18B9;
import X.C18BG;
import X.C18BK;
import X.C18BM;
import X.C18BP;
import X.C18BQ;
import X.C18BS;
import X.C18BT;
import X.C18BU;
import X.C18BV;
import X.C18BX;
import X.C18BY;
import X.C18BZ;
import X.C18C6;
import X.C18CJ;
import X.C18CK;
import X.C18CM;
import X.C18CS;
import X.C18DA;
import X.C18E3;
import X.C18GU;
import X.C18IP;
import X.C1972007ny;
import X.C1C7U;
import X.C2097608Jq;
import X.C212367188v;
import X.C212369188x;
import X.C21240218Ae;
import X.C21240318Af;
import X.C21240818Ak;
import X.C21241518Ar;
import X.C21242718Bd;
import X.C21242818Be;
import X.C21243218Bi;
import X.C21243818Bo;
import X.C21244118Br;
import X.C21244418Bu;
import X.C21246718Cr;
import X.C21248618Dk;
import X.C21248718Dl;
import X.C21268218Ky;
import X.C2188811AlT;
import X.C677080Qh8;
import X.EnumC21242418Ba;
import X.InterfaceC21241218Ao;
import X.InterfaceC21243018Bg;
import X.InterfaceC21243418Bk;
import X.InterfaceC21244018Bq;
import Y.ARunnableS105S0000000_32;
import Y.ARunnableS132S0100000_32;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.android.btm.impl.setting.BtmSettingModel;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS115S1200000_32;
import kotlin.jvm.internal.AwS146S1200000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes33.dex */
public final class BcmServiceImpl extends AbstractC21243518Bl implements C18BS {
    public static final BcmServiceImpl INSTANCE = new BcmServiceImpl();
    public static int initPrerequisites = 3;
    public static int initStatus;
    public static InterfaceC21244018Bq updateParamsCallback;

    public static /* synthetic */ void lambda$semisugar$init$lambda$2$0() {
        C1C7U.LIZ("BcmServiceImpl@1b66.init$1L");
        init$lambda$2();
        C1C7U.LIZIZ("BcmServiceImpl@1b66.init$1L");
    }

    public final InterfaceC21244018Bq getUpdateParamsCallback() {
        return null;
    }

    public void setPageParams(PageFinder pageFinder, Map<String, ? extends BcmParams> map) {
    }

    public void setUnitParams(PageFinder pageFinder, Map<String, ? extends BcmParams> map) {
    }

    public final void setUpdateParamsCallback(InterfaceC21244018Bq interfaceC21244018Bq) {
    }

    public static final void init$lambda$2() {
        if (C18CS.LIZ.LIZJ().LIZJ().LIZ() == 1) {
            C18AQ.LIZ.LIZIZ();
        } else if (C18CS.LIZ.LIZJ().LIZIZ()) {
            C21240318Af.LJII();
        }
        C18A2.LIZ();
    }

    @Override // X.C18BS
    public void init() {
        if (C18CS.LIZ.LIZ() != 1) {
            setInitPrerequisites(getInitPrerequisites() & (-5));
            return;
        }
        setInitPrerequisites((getInitPrerequisites() & (-5)) | 4);
        setInitStatus(1);
        C18CK.LIZIZ(AFwS223S0000000_32.get$arr$(28));
        if (C18IP.LIZ.LIZLLL()) {
            try {
                Class<?> cls = Class.forName("com.bytedance.android.bcm.devtool.BcmDevTool");
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                Method method = cls.getMethod("init", new Class[0]);
                method.setAccessible(true);
                method.invoke(objNewInstance, new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C18CK.LIZIZ(new AwS573S0100000_29(th, 31));
            }
        }
        BtmServiceImpl btmServiceImpl = BtmServiceImpl.INSTANCE;
        if (!btmServiceImpl.getOpenPerfOpt()) {
            C21248718Dl c21248718Dl = PageInfoStack.Companion;
            C21243218Bi c21243218Bi = C21243218Bi.LIZ;
            c21248718Dl.getClass();
            PageInfoStack.pageInfoFactory$delegate.setValue(c21248718Dl, C21248718Dl.LIZ[0], c21243218Bi);
            C18CM c18cm = C18CM.LIZ;
            C21243818Bo c21243818Bo = new C21243818Bo();
            c18cm.getClass();
            C18CM.LJ.setValue(c18cm, C18CM.LIZIZ[0], c21243818Bo);
            C21246718Cr c21246718Cr = C21246718Cr.LIZ;
            AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
            c21246718Cr.getClass();
            C21246718Cr.LIZJ.setValue(c21246718Cr, C21246718Cr.LIZIZ[0], anonymousClass1891);
            C21244418Bu c21244418Bu = C21244418Bu.LIZ;
            C18BM c18bm = new C18BM();
            c21244418Bu.getClass();
            ((CopyOnWriteArrayList) C21244418Bu.LIZJ.getValue(c21244418Bu, C21244418Bu.LIZIZ[0])).add(c18bm);
            C21241518Ar chainRecorderExp = btmServiceImpl.getChainRecorderExp();
            chainRecorderExp.LJII.setValue(chainRecorderExp, C21241518Ar.LJIIIIZZ[0], new C18BG());
            C18DA c18da = C18DA.LIZ;
            C18BK c18bk = new C18BK();
            c18da.getClass();
            C18DA.LIZJ.setValue(c18da, C18DA.LIZIZ[0], c18bk);
            btmServiceImpl.setSaveCacheCallback(new AnonymousClass1892());
        }
        C18E3.LJII(this);
        C18GU.LIZ.LIZ(new ARunnableS105S0000000_32(8), true);
        setInitStatus(2);
    }

    @Override // X.C18HZ
    public int getInitPrerequisites() {
        return initPrerequisites;
    }

    @Override // X.C18HZ
    public int getInitStatus() {
        return initStatus;
    }

    public InterfaceC21243018Bg<?> getFormatter(String str) {
        BtmSettingModel btmSettingModel = C18CS.LIZ;
        if (C18CS.LIZ.LIZ() != 1 || str == null || str.length() == 0) {
            return null;
        }
        return (InterfaceC21243018Bg) ((LinkedHashMap) C21268218Ky.LIZ).get(str);
    }

    @Override // X.C18BS
    public Map<String, Object> getPageParams(PageFinder pageFinder) {
        C18BX c18bx;
        BcmParams bcmParams;
        Map<String, Object> map;
        C21244118Br c21244118BrLIZ = C18BP.LIZ.LIZ(pageFinder, Collections.singletonList("ecom_entrance"), 1, false, null);
        C18BU c18bu = c21244118BrLIZ.LIZIZ;
        if (c18bu != null) {
            c18bx = c18bu.LIZ;
        } else {
            c18bx = null;
        }
        if (c18bx == C18BX.TOP_PAGE) {
            return C2097608Jq.LJ();
        }
        C1766940w56 c1766940w56 = (C1766940w56) C13LP.LJJJLZIJ(0, c21244118BrLIZ.LIZ);
        if (c1766940w56 == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
        if (c1766990w5B != null && (bcmParams = c1766990w5B.LIZ) != null && (map = bcmParams.toMap()) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC21243518Bl, X.C18HS
    public void onPageDestroyed(Object obj) {
        BcmPageInfo bcmPageInfo;
        AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(obj);
        if ((pageInfoLJIIIIZZ instanceof BcmPageInfo) && (bcmPageInfo = (BcmPageInfo) pageInfoLJIIIIZZ) != null) {
            bcmPageInfo.setPageParamsProvider(null);
        }
    }

    @Override // X.AbstractC21243518Bl, X.C18HS
    public void onPagePaused(Object obj) {
        BcmPageInfo bcmPageInfo;
        BcmPageInfo bcmPageInfo2;
        Map<String, ? extends BcmParams> map;
        Map<String, ? extends BcmParams> map2;
        final BcmParams bcmParamsCopy;
        BcmParams bcmParams;
        BcmPageInfo bcmPageInfo3;
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(obj);
        if (pageInfoLJIIIIZZ == null) {
            return;
        }
        if (C18CS.LIZ.LIZIZ().LJII() != 1 && (pageInfoLJIIIIZZ instanceof BcmPageInfo) && (bcmPageInfo3 = (BcmPageInfo) pageInfoLJIIIIZZ) != null) {
            bcmPageInfo3.setPageParamsByProvider(obj);
        }
        boolean z = pageInfoLJIIIIZZ instanceof BcmPageInfo;
        if (z && (bcmPageInfo2 = (BcmPageInfo) pageInfoLJIIIIZZ) != null) {
            if (C18CS.LIZ.LIZJ().LIZJ().LIZ() == 1) {
                C21240218Ae c21240218Ae = C18AQ.LIZ;
                Map<String, BcmParams> pageParams = bcmPageInfo2.getPageParams();
                if (pageParams != null && (bcmParams = pageParams.get("ecom_entrance")) != null) {
                    bcmParamsCopy = bcmParams.copy();
                } else {
                    bcmParamsCopy = null;
                }
                final String pageBtm = bcmPageInfo2.getPageBtm();
                if (pageBtm == null) {
                    pageBtm = "";
                }
                final String classSimpleName = bcmPageInfo2.getClassSimpleName();
                C18AQ.LIZ(new C18AO(pageBtm, classSimpleName, bcmParamsCopy) { // from class: X.18AP
                    public final String LIZ;
                    public final String LIZIZ;
                    public final String LIZJ;
                    public final BcmParams LIZLLL;

                    @Override // X.C18AZ
                    public final BcmParams getBcmParams() {
                        return this.LIZLLL;
                    }

                    @Override // X.C18AZ
                    public final String getBtm() {
                        return this.LIZJ;
                    }

                    @Override // X.C18AO
                    public final void LIZ(C18AD c18ad) {
                        C18AE.LIZLLL(3015, c18ad, this.LIZ, null, this.LIZIZ, 104);
                    }

                    {
                        BcmParams bcmParamsCopy2;
                        this.LIZ = pageBtm;
                        this.LIZIZ = classSimpleName;
                        this.LIZJ = u.LJJIFFI(pageBtm, ".c0.d0", "", false);
                        if (bcmParamsCopy != null) {
                            bcmParamsCopy2 = bcmParamsCopy.copy();
                        } else {
                            bcmParamsCopy2 = null;
                        }
                        this.LIZLLL = bcmParamsCopy2;
                    }
                });
            } else if (C18CS.LIZ.LIZJ().LIZIZ()) {
                boolean z2 = C21240318Af.LIZ;
                BcmPageInfo bcmPageInfoCopy = bcmPageInfo2.copy();
                if (bcmPageInfoCopy != null) {
                    String latestBtmId = bcmPageInfoCopy.getLatestBtmId();
                    if (latestBtmId == null) {
                        latestBtmId = bcmPageInfoCopy.getLatestPageBtmId();
                    }
                    AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
                    C212369188x c212369188xLIZJ = AnonymousClass1891.LIZJ(latestBtmId);
                    if (c212369188xLIZJ != null) {
                        map = c212369188xLIZJ.LIZ;
                        map2 = c212369188xLIZJ.LIZIZ;
                    } else {
                        map = null;
                        map2 = null;
                    }
                    C18GU.LIZ.LIZ(new ARunnableS132S0100000_32(new C21240818Ak(bcmPageInfoCopy.getBtmPre(), latestBtmId, bcmPageInfoCopy.getPageBtm(), map, map2), 98), false);
                }
            }
        }
        AnonymousClass1891 anonymousClass18912 = AnonymousClass1891.LIZ;
        if (z && (bcmPageInfo = (BcmPageInfo) pageInfoLJIIIIZZ) != null) {
            bcmPageInfo.setUnitParamsV1(new LinkedHashMap());
        }
        pageInfoLJIIIIZZ.setLatestPageBtmId(null);
        pageInfoLJIIIIZZ.setLatestBtmId(null);
    }

    public void registerBcmParamsChecker(C18AN c18an) {
        C21240218Ae c21240218Ae = C18AQ.LIZ;
        C18AQ.LIZIZ.add(c18an);
    }

    public void registerExtraChecker(InterfaceC21241218Ao interfaceC21241218Ao) {
        boolean z = C21240318Af.LIZ;
        C21240318Af.LJIIIIZZ.add(interfaceC21241218Ao);
    }

    public void registerFormatter(InterfaceC21243018Bg<?> interfaceC21243018Bg) {
        if (C18CS.LIZ.LIZ() != 1) {
            return;
        }
        C21268218Ky.LIZ.put(interfaceC21243018Bg.id(), interfaceC21243018Bg);
    }

    @Override // X.C18HZ
    public void setInitPrerequisites(int i) {
        initPrerequisites = i;
    }

    @Override // X.C18HZ
    public void setInitStatus(int i) {
        initStatus = i;
    }

    @Override // X.C18BS
    public void clearBcmPageParams(PageFinder pageFinder, List<String> list) {
        Map<String, BcmParams> pageParams;
        BcmParams bcmParams;
        if (C18CS.LIZ.LIZ() == 1 && !list.isEmpty()) {
            C18B9 c18b9 = C18B9.LIZ;
            Object objLIZ = C18B9.LIZ(pageFinder);
            C21248618Dk.LIZ.getClass();
            PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
            if (pageInfoLJIIIIZZ == null) {
                monitorPageInfoNotFind("clear_page", pageFinder, "ecom_entrance", null, objLIZ);
            }
            checkThread("clear_page", pageFinder, "ecom_entrance", null, pageInfoLJIIIIZZ);
            if ((pageInfoLJIIIIZZ instanceof BcmPageInfo) && (pageParams = ((BcmPageInfo) pageInfoLJIIIIZZ).getPageParams()) != null && (bcmParams = pageParams.get("ecom_entrance")) != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    bcmParams.remove(it2.next());
                }
            }
            C18CK.LIZ("BcmServiceImpl_clearPageParams", new AwS432S0200000_31(pageInfoLJIIIIZZ, list, 31), false);
        }
    }

    @Override // X.C18BS
    public void configBusiness(String str, C21242718Bd c21242718Bd) {
        if (C18CS.LIZ.LIZ() != 1) {
            return;
        }
        C18BT c18bt = C18BT.LIZ;
        c18bt.getClass();
        if (str != null && c21242718Bd != null) {
            Map map = (Map) C18BT.LIZJ.getValue(c18bt, C18BT.LIZIZ[0]);
            C21242718Bd c21242718Bd2 = new C21242718Bd();
            c21242718Bd2.LIZ = c21242718Bd.LIZ;
            InterfaceC21243018Bg<?> interfaceC21243018Bg = c21242718Bd.LIZIZ;
            if (interfaceC21243018Bg != null) {
                interfaceC21243018Bg.id();
            }
            c21242718Bd2.LIZIZ = interfaceC21243018Bg;
            map.put(str, c21242718Bd2);
        }
    }

    public List<Object> getBcmParamValues(String str, String str2) {
        C18AX next;
        List<Object> listLJFF = null;
        if (C18CS.LIZ.LIZJ().LIZJ().LIZ() == 1) {
            C18AY c18ayLIZ = C18AQ.LIZ.LIZ(str);
            if (c18ayLIZ == null) {
                return null;
            }
            Iterator<C18AX> it2 = c18ayLIZ.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ(), str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C18AX c18ax = next;
            if (c18ax == null) {
                return null;
            }
            return c18ax.LIZIZ();
        }
        String strLJIIJ = C21240318Af.LJIIJ(str);
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJIIJ, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 4 || (listLJFF = C21240318Af.LJFF(strLJIIJ, str2, C21240318Af.LJFF)) == null) {
            if (listLJJLIIIJILLIZJL.size() >= 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                sbLIZ.append('.');
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                sbLIZ.append('.');
                sbLIZ.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 2));
                listLJFF = C21240318Af.LJFF(C2188811AlT.LIZIZ(sbLIZ), str2, C21240318Af.LJI);
                if (listLJFF != null) {
                    return listLJFF;
                }
            }
            if (listLJJLIIIJILLIZJL.size() >= 2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                sbLIZ2.append('.');
                sbLIZ2.append((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                sbLIZ2.append(".c0.d0");
                return C21240318Af.LJFF(C2188811AlT.LIZIZ(sbLIZ2), str2, C21240318Af.LJ);
            }
        }
        return listLJFF;
    }

    public boolean registerPageParamsProvider(PageFinder pageFinder, InterfaceC21243418Bk interfaceC21243418Bk) {
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(pageFinder);
        c21248618Dk.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        if (pageInfoLJIIIIZZ instanceof BcmPageInfo) {
            ((BcmPageInfo) pageInfoLJIIIIZZ).setPageParamsProvider(interfaceC21243418Bk);
            return true;
        }
        return false;
    }

    public boolean setBcmParams(PageFinder pageFinder, Map<String, ? extends Object> map) {
        String str;
        String str2;
        C18CK.LIZLLL("FE_setBcmParams", new AwS546S0100000_2(map, (Map<String, C1397705dX>) 1234));
        if (!pageFinder.isEmpty()) {
            Object obj = map.get("param_type");
            Map map2 = null;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            Object obj2 = map.get("update_type");
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            } else {
                str2 = null;
            }
            Object obj3 = map.get("content");
            if (obj3 instanceof Map) {
                map2 = (Map) obj3;
            }
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && map2 != null && !map2.isEmpty()) {
                boolean zLJFF = Intrinsics.LJFF(str, "unit");
                boolean zLJFF2 = Intrinsics.LJFF(str2, "append");
                try {
                    JSONObject jSONObject = new JSONObject(map2);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        next.toString();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        if (zLJFF) {
                            if (zLJFF2) {
                                BcmParams bcmParams = new BcmParams();
                                bcmParams.merge(jSONObjectOptJSONObject);
                                C18BV.LIZ.appendUnitParams(pageFinder, next, bcmParams);
                            } else {
                                BcmParams bcmParams2 = new BcmParams();
                                bcmParams2.merge(jSONObjectOptJSONObject);
                                C18BV.LIZ.setUnitParams(pageFinder, next, bcmParams2);
                            }
                        } else if (zLJFF2) {
                            BcmParams bcmParams3 = new BcmParams();
                            bcmParams3.merge(jSONObjectOptJSONObject);
                            C18BV.LIZ.appendPageParams(pageFinder, next, bcmParams3);
                        } else {
                            BcmParams bcmParams4 = new BcmParams();
                            bcmParams4.merge(jSONObjectOptJSONObject);
                            C18BV.LIZ.setPageParams(pageFinder, next, bcmParams4);
                        }
                    }
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return false;
    }

    @Override // X.C18BS
    public C21242818Be<Unit> setBcmParamsJSB(PageFinder pageFinder, Map<String, ? extends Object> map) {
        return C18BQ.LIZ(pageFinder, map);
    }

    public boolean setBcmParamsV2(PageFinder pageFinder, Map<String, ? extends Object> map) {
        return C18BQ.LIZ(pageFinder, map).LIZ;
    }

    public void setPageParamsV2(PageFinder pageFinder, Map<String, ? extends Object> map) {
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof BcmParams) {
                    INSTANCE.setPageParams(pageFinder, entry.getKey(), (BcmParams) value);
                } else if (value instanceof JSONObject) {
                    BcmServiceImpl bcmServiceImpl = INSTANCE;
                    String key = entry.getKey();
                    BcmParams.Companion.getClass();
                    bcmServiceImpl.setPageParams(pageFinder, key, C212367188v.LIZIZ((JSONObject) value));
                } else if (value instanceof Map) {
                    BcmServiceImpl bcmServiceImpl2 = INSTANCE;
                    String key2 = entry.getKey();
                    BcmParams.Companion.getClass();
                    bcmServiceImpl2.setPageParams(pageFinder, key2, C212367188v.LIZJ((Map) value));
                }
            }
        }
    }

    public void setUnitParamsV2(PageFinder pageFinder, Map<String, ? extends Object> map) {
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof BcmParams) {
                    INSTANCE.setUnitParams(pageFinder, entry.getKey(), (BcmParams) value);
                } else if (value instanceof JSONObject) {
                    BcmServiceImpl bcmServiceImpl = INSTANCE;
                    String key = entry.getKey();
                    BcmParams.Companion.getClass();
                    bcmServiceImpl.setUnitParams(pageFinder, key, C212367188v.LIZIZ((JSONObject) value));
                } else if (value instanceof Map) {
                    BcmServiceImpl bcmServiceImpl2 = INSTANCE;
                    String key2 = entry.getKey();
                    BcmParams.Companion.getClass();
                    bcmServiceImpl2.setUnitParams(pageFinder, key2, C212367188v.LIZJ((Map) value));
                }
            }
        }
    }

    @Override // X.C18BS
    public void appendPageParams(PageFinder pageFinder, String str, BcmParams bcmParams) {
        BcmParams bcmParams2;
        if (C18CS.LIZ.LIZ() != 1) {
            return;
        }
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(pageFinder);
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        if (pageInfoLJIIIIZZ == null) {
            monitorPageInfoNotFind("append_page", pageFinder, str, bcmParams, objLIZ);
        }
        checkThread("append_page", pageFinder, str, bcmParams, pageInfoLJIIIIZZ);
        if ((pageInfoLJIIIIZZ instanceof BcmPageInfo) && bcmParams != null && str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('\n');
            sbLIZ.append(bcmParams);
            checkPageState(objLIZ, pageInfoLJIIIIZZ, "append_page", C2188811AlT.LIZIZ(sbLIZ));
            checkBcmBizAndKey(pageInfoLJIIIIZZ, str, bcmParams, "appendBcmPageParams");
            BcmPageInfo bcmPageInfo = (BcmPageInfo) pageInfoLJIIIIZZ;
            if (bcmPageInfo.getPageParams() == null) {
                bcmPageInfo.setPageParams(new LinkedHashMap());
            }
            Map<String, BcmParams> pageParams = bcmPageInfo.getPageParams();
            if (pageParams != null && (bcmParams2 = pageParams.get(str)) != null) {
                bcmParams2.merge(bcmParams);
            } else {
                Map<String, BcmParams> pageParams2 = bcmPageInfo.getPageParams();
                if (pageParams2 != null) {
                    pageParams2.put(str, bcmParams);
                }
            }
        }
        C18CK.LIZ("BcmServiceImpl_appendPageParams", new AwS146S1200000_31(pageInfoLJIIIIZZ, str, bcmParams, 0), false);
    }

    @Override // X.C18BS
    public void appendUnitParams(PageFinder pageFinder, String str, BcmParams bcmParams) {
        BcmParams bcmParams2;
        if (C18CS.LIZ.LIZ() != 1) {
            return;
        }
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(pageFinder);
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        if (pageInfoLJIIIIZZ == null) {
            monitorPageInfoNotFind("append_unit", pageFinder, str, bcmParams, objLIZ);
        }
        checkThread("append_unit", pageFinder, str, bcmParams, pageInfoLJIIIIZZ);
        if ((pageInfoLJIIIIZZ instanceof BcmPageInfo) && bcmParams != null && str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('\n');
            sbLIZ.append(bcmParams);
            checkPageState(objLIZ, pageInfoLJIIIIZZ, "append_unit", C2188811AlT.LIZIZ(sbLIZ));
            checkBcmBizAndKey(pageInfoLJIIIIZZ, str, bcmParams, "appendBcmUnitParams");
            BcmPageInfo bcmPageInfo = (BcmPageInfo) pageInfoLJIIIIZZ;
            if (bcmPageInfo.getUnitParamsV1() == null) {
                bcmPageInfo.setUnitParamsV1(new LinkedHashMap());
            }
            Map<String, BcmParams> unitParamsV1 = bcmPageInfo.getUnitParamsV1();
            if (unitParamsV1 != null && (bcmParams2 = unitParamsV1.get(str)) != null) {
                bcmParams2.merge(bcmParams);
            } else {
                Map<String, BcmParams> unitParamsV12 = bcmPageInfo.getUnitParamsV1();
                if (unitParamsV12 != null) {
                    unitParamsV12.put(str, bcmParams);
                }
            }
        }
        C18CK.LIZ("BcmServiceImpl_appendUnitParams", new AwS146S1200000_31(pageInfoLJIIIIZZ, str, bcmParams, 1), false);
    }

    public final void merge(Map<String, Object> map, Map<String, ? extends Object> map2, EnumC21242418Ba enumC21242418Ba) {
        if (map2 == null) {
            return;
        }
        for (Map.Entry<String, ? extends Object> entry : map2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            int i = C18BY.LIZIZ[enumC21242418Ba.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && !map.containsKey(key)) {
                        map.put(key, value);
                    }
                } else if (!Intrinsics.LJFF(value, "") || !map.containsKey(key)) {
                    map.put(key, value);
                }
            } else {
                map.put(key, value);
            }
        }
    }

    @Override // X.C18BS
    public void setBcmPageParams(PageFinder pageFinder, BcmParams bcmParams, Boolean bool) {
        boolean zLJIL;
        if (bool != null) {
            zLJIL = bool.booleanValue();
        } else {
            BtmSettingModel btmSettingModel = C18CS.LIZ;
            zLJIL = C18CS.LIZ.LIZLLL().LJIL();
        }
        if (zLJIL) {
            setPageParams(pageFinder, "ecom_entrance", bcmParams);
        } else {
            appendPageParams(pageFinder, "ecom_entrance", bcmParams);
        }
    }

    @Override // X.C18BS
    public void setPageParams(PageFinder pageFinder, String str, BcmParams bcmParams) {
        if (C18CS.LIZ.LIZ() != 1) {
            return;
        }
        if (C18CS.LIZ.LIZJ().LIZ() > 0) {
            C18CK.LIZLLL("BcmServiceImpl_setPageParams", new AwS575S0100000_31(new Throwable(), 84));
        }
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(pageFinder);
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        if (pageInfoLJIIIIZZ == null) {
            monitorPageInfoNotFind("set_page", pageFinder, str, bcmParams, objLIZ);
        }
        checkThread("set_page", pageFinder, str, bcmParams, pageInfoLJIIIIZZ);
        if ((pageInfoLJIIIIZZ instanceof BcmPageInfo) && bcmParams != null && str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('\n');
            sbLIZ.append(bcmParams);
            checkPageState(objLIZ, pageInfoLJIIIIZZ, "set_page", C2188811AlT.LIZIZ(sbLIZ));
            checkBcmBizAndKey(pageInfoLJIIIIZZ, str, bcmParams, "setBcmPageParams");
            BcmPageInfo bcmPageInfo = (BcmPageInfo) pageInfoLJIIIIZZ;
            if (bcmPageInfo.getPageParams() == null) {
                bcmPageInfo.setPageParams(new LinkedHashMap());
            }
            Map<String, BcmParams> pageParams = bcmPageInfo.getPageParams();
            if (pageParams != null) {
                pageParams.put(str, bcmParams);
            }
        }
        C18CK.LIZ("BcmServiceImpl_setPageParams", new AwS146S1200000_31(pageInfoLJIIIIZZ, str, bcmParams, 2), false);
    }

    @Override // X.C18BS
    public void setUnitParams(PageFinder pageFinder, String str, BcmParams bcmParams) {
        if (C18CS.LIZ.LIZ() != 1) {
            return;
        }
        if (C18CS.LIZ.LIZJ().LIZ() > 0) {
            C18CK.LIZLLL("BcmServiceImpl_setUnitParams", new AwS575S0100000_31(new Throwable(), 85));
        }
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(pageFinder);
        if (objLIZ == null) {
            objLIZ = C18CJ.LIZ();
        }
        C21248618Dk.LIZ.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        if (pageInfoLJIIIIZZ == null) {
            monitorPageInfoNotFind("set_unit", pageFinder, str, bcmParams, objLIZ);
        }
        checkThread("set_unit", pageFinder, str, bcmParams, pageInfoLJIIIIZZ);
        if ((pageInfoLJIIIIZZ instanceof BcmPageInfo) && bcmParams != null && str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('\n');
            sbLIZ.append(bcmParams);
            checkPageState(objLIZ, pageInfoLJIIIIZZ, "set_unit", C2188811AlT.LIZIZ(sbLIZ));
            checkBcmBizAndKey(pageInfoLJIIIIZZ, str, bcmParams, "setBcmUnitParams");
            BcmPageInfo bcmPageInfo = (BcmPageInfo) pageInfoLJIIIIZZ;
            if (bcmPageInfo.getUnitParamsV1() == null) {
                bcmPageInfo.setUnitParamsV1(new LinkedHashMap());
            }
            Map<String, BcmParams> unitParamsV1 = bcmPageInfo.getUnitParamsV1();
            if (unitParamsV1 != null) {
                unitParamsV1.put(str, bcmParams);
            }
        }
        C18CK.LIZ("BcmServiceImpl_setUnitParams", new AwS146S1200000_31(pageInfoLJIIIIZZ, str, bcmParams, 3), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[PHI: r2
      0x0041: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:16:0x003f, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:16:0x003f, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void checkPageState(java.lang.Object r17, com.bytedance.android.btm.impl.page.model.PageInfo r18, java.lang.String r19, java.lang.String r20) {
        /*
            r16 = this;
            com.bytedance.android.btm.impl.setting.BtmSettingModel r0 = X.C18CS.LIZ
            com.bytedance.android.btm.impl.setting.OptimizeModel r0 = r0.LIZLLL()
            int r1 = r0.LJIIIIZZ()
            r0 = 1
            if (r1 == r0) goto Le
            return
        Le:
            X.18Dk r2 = X.C21248618Dk.LIZ
            r2.getClass()
            com.bytedance.android.btm.impl.page.model.PageInfoStack r4 = X.C21248618Dk.LJIIIZ(r17)
            if (r4 == 0) goto L29
            com.bytedance.android.btm.api.BtmPageLifecycle$State r1 = r4.getPageState()
            com.bytedance.android.btm.api.BtmPageLifecycle$State r0 = com.bytedance.android.btm.api.BtmPageLifecycle.State.RESUMED
            if (r1 == r0) goto L6d
            com.bytedance.android.btm.api.BtmPageLifecycle$State r1 = r4.getPageState()
            com.bytedance.android.btm.api.BtmPageLifecycle$State r0 = com.bytedance.android.btm.api.BtmPageLifecycle.State.CREATED
            if (r1 == r0) goto L6d
        L29:
            java.lang.Object r0 = X.C18CJ.LIZ()
            r2.getClass()
            com.bytedance.android.btm.impl.page.model.PageInfo r0 = X.C21248618Dk.LJIIIIZZ(r0)
            java.lang.String r3 = "null"
            if (r0 == 0) goto L3e
            java.lang.String r2 = r0.getPageBtm()
            if (r2 != 0) goto L41
        L3e:
            r2 = r3
            if (r0 == 0) goto L47
        L41:
            java.lang.String r1 = r0.getClassName()
            if (r1 != 0) goto L48
        L47:
            r1 = r3
        L48:
            if (r4 == 0) goto L51
            com.bytedance.android.btm.api.BtmPageLifecycle$State r0 = r4.getPageState()
            if (r0 == 0) goto L51
            r3 = r0
        L51:
            X.18CE r4 = X.C18CE.LIZ
            r5 = 3004(0xbbc, float:4.21E-42)
            java.lang.String r6 = java.lang.String.valueOf(r20)
            r7 = 0
            r9 = 0
            X.18Bc r14 = new X.18Bc
            r0 = r19
            r14.<init>(r0, r3, r2, r1)
            r15 = 500(0x1f4, float:7.0E-43)
            r8 = r18
            r10 = r9
            r11 = r7
            r12 = r9
            r13 = r7
            X.C18CE.LJII(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.bcm.impl.BcmServiceImpl.checkPageState(java.lang.Object, com.bytedance.android.btm.impl.page.model.PageInfo, java.lang.String, java.lang.String):void");
    }

    public final void checkBcmBizAndKey(PageInfo pageInfo, String str, BcmParams bcmParams, String str2) {
        boolean z;
        if (C18CS.LIZ.LIZLLL().LJIIIIZZ() != 1) {
            return;
        }
        List<String> list = C18A2.LIZ.bcmAllowList;
        if ((!list.isEmpty()) && bcmParams != null) {
            FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
            featureModelLIZJ.getClass();
            C1972007ny.LIZLLL(featureModelLIZJ.getLazyDataRootKey(), featureModelLIZJ.getLazyDataKey(), featureModelLIZJ.bcmBizKeyWhitelist, "bcm_biz_key_allowlist");
            if (featureModelLIZJ.bcmBizKeyWhitelist.LIZ() != 0) {
                z = true;
            } else {
                z = false;
            }
            Iterator<Map.Entry<String, Object>> it2 = bcmParams.toMap().entrySet().iterator();
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                Map.Entry<String, Object> next = it2.next();
                if (!list.contains(next.getKey())) {
                    if (z) {
                        it2.remove();
                    }
                    arrayList.add(next.getKey());
                }
            }
            if (!arrayList.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" call failed! these keys are not registered：");
                sbLIZ.append(arrayList);
                C18AE.LIZJ(3013, C2188811AlT.LIZIZ(sbLIZ), null, null, null, null, null, null, new AwS115S1200000_32(pageInfo, str2, arrayList, 0), 1020);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    @Override // X.C18BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C18C6 getBcmChainByBtmModel(X.C21244318Bt r15, java.util.List<java.lang.String> r16, int r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.bcm.impl.BcmServiceImpl.getBcmChainByBtmModel(X.18Bt, java.util.List, int, boolean):X.18C6");
    }

    @Override // X.C18BS
    public C18C6 getBcmChainByFinder(PageFinder pageFinder, List<String> list, int i, boolean z) {
        if (C18CS.LIZ.LIZ() != 1) {
            C21244118Br c21244118Br = new C21244118Br();
            c21244118Br.LIZIZ = null;
            return c21244118Br;
        }
        C21244118Br c21244118BrLIZ = C18BP.LIZ.LIZ(pageFinder, list, i, false, null);
        if (z) {
            C189M.LIZIZ(c21244118BrLIZ);
            return c21244118BrLIZ;
        }
        C189M.LIZ(c21244118BrLIZ);
        return c21244118BrLIZ;
    }

    @Override // X.C18BS
    public C18C6 getBcmChainByToken(String str, List<String> list, int i, boolean z) {
        boolean z2;
        C21244118Br c21244118BrLIZ;
        int i2 = i;
        if (C18CS.LIZ.LIZ() != 1) {
            C21244118Br c21244118Br = new C21244118Br();
            c21244118Br.LIZIZ = null;
            return c21244118Br;
        }
        C18BP c18bp = C18BP.LIZ;
        if (BtmServiceImpl.INSTANCE.getChainRecorderExp().LIZIZ(str) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (str != null && str.length() != 0 && !z2) {
            if (i2 <= 0) {
                i2 = 20;
            }
            c18bp.getClass();
            c21244118BrLIZ = C18BP.LIZJ(str, list, i2, null, false);
        } else {
            C18BU c18bu = new C18BU();
            c18bu.LIZJ = str;
            c21244118BrLIZ = c18bp.LIZ(null, list, i2, false, c18bu);
        }
        if (z) {
            C189M.LIZIZ(c21244118BrLIZ);
            return c21244118BrLIZ;
        }
        C189M.LIZ(c21244118BrLIZ);
        return c21244118BrLIZ;
    }

    @Override // X.C18BS
    public List<C677080Qh8> getBcmParamsWithBtm(PageFinder pageFinder, List<String> list, int i, boolean z) {
        BcmParams bcmParams;
        Map<String, Object> map;
        BcmParams bcmParams2;
        BcmParams bcmParams3;
        Map<String, Object> map2;
        if (C18CS.LIZ.LIZ() != 1) {
            return C13BV.INSTANCE;
        }
        List<C1766940w56> list2 = C18BP.LIZ.LIZ(pageFinder, Collections.singletonList("ecom_entrance"), i, z, null).LIZ;
        if (list2.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (C1766940w56 c1766940w56 : list2) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String next = it2.next();
                        String str = c1766940w56.LIZIZ;
                        if (str != null && a0.LJJIIZI(str, next, false)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
                            if (c1766990w5B != null && (bcmParams3 = c1766990w5B.LIZ) != null && (map2 = bcmParams3.toMap()) != null) {
                                linkedHashMap.putAll(map2);
                            }
                            Map<String, Object> map3 = null;
                            if (z) {
                                BcmServiceImpl bcmServiceImpl = INSTANCE;
                                C1766990w5B c1766990w5B2 = c1766940w56.LJIIIZ;
                                if (c1766990w5B2 != null && (bcmParams2 = c1766990w5B2.LIZJ) != null) {
                                    map = bcmParams2.toMap();
                                } else {
                                    map = null;
                                }
                                bcmServiceImpl.merge(linkedHashMap, map, EnumC21242418Ba.EMPTY);
                            }
                            BcmServiceImpl bcmServiceImpl2 = INSTANCE;
                            C1766990w5B c1766990w5B3 = c1766940w56.LJIIIZ;
                            if (c1766990w5B3 != null && (bcmParams = c1766990w5B3.LIZIZ) != null) {
                                map3 = bcmParams.toMap();
                            }
                            bcmServiceImpl2.merge(linkedHashMap, map3, EnumC21242418Ba.EMPTY);
                            arrayList.add(new C677080Qh8(linkedHashMap));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[PHI: r14
      0x002e: PHI (r14v2 java.lang.String) = (r14v0 java.lang.String), (r14v3 java.lang.String) binds: [B:12:0x002c, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void checkThread(java.lang.String r17, com.bytedance.android.btm.api.model.PageFinder r18, java.lang.String r19, com.bytedance.android.bcm.api.model.BcmParams r20, com.bytedance.android.btm.impl.page.model.PageInfo r21) {
        /*
            r16 = this;
            com.bytedance.android.btm.impl.setting.BtmSettingModel r0 = X.C18CS.LIZ
            com.bytedance.android.btm.impl.setting.OptimizeModel r0 = r0.LIZLLL()
            int r1 = r0.LJIIIIZZ()
            r0 = 1
            if (r1 == r0) goto Le
            return
        Le:
            boolean r0 = X.C20321214fK.LIZ()
            if (r0 != 0) goto L55
            X.18Dk r1 = X.C21248618Dk.LIZ
            java.lang.Object r0 = X.C18CJ.LIZ()
            r1.getClass()
            com.bytedance.android.btm.impl.page.model.PageInfo r0 = X.C21248618Dk.LJIIIIZZ(r0)
            java.lang.String r15 = "null"
            if (r0 == 0) goto L2b
            java.lang.String r14 = r0.getPageBtm()
            if (r14 != 0) goto L2e
        L2b:
            r14 = r15
            if (r0 == 0) goto L35
        L2e:
            java.lang.String r0 = r0.getClassName()
            if (r0 == 0) goto L35
            r15 = r0
        L35:
            X.18CE r0 = X.C18CE.LIZ
            java.lang.String r2 = java.lang.String.valueOf(r20)
            r1 = 2027(0x7eb, float:2.84E-42)
            r3 = 0
            r5 = 0
            X.18BW r10 = new X.18BW
            r13 = r19
            r11 = r18
            r12 = r17
            r10.<init>(r11, r12, r13, r14, r15)
            r11 = 500(0x1f4, float:7.0E-43)
            r4 = r21
            r6 = r5
            r7 = r3
            r8 = r5
            r9 = r3
            X.C18CE.LJII(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.bcm.impl.BcmServiceImpl.checkThread(java.lang.String, com.bytedance.android.btm.api.model.PageFinder, java.lang.String, com.bytedance.android.bcm.api.model.BcmParams, com.bytedance.android.btm.impl.page.model.PageInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r5
      0x0027: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:12:0x0025, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void monitorPageInfoNotFind(java.lang.String r16, com.bytedance.android.btm.api.model.PageFinder r17, java.lang.String r18, com.bytedance.android.bcm.api.model.BcmParams r19, java.lang.Object r20) {
        /*
            r15 = this;
            if (r20 == 0) goto L4a
            java.lang.Class r0 = r20.getClass()
            java.lang.String r3 = r0.getCanonicalName()
        La:
            java.lang.String r6 = "null"
            if (r3 != 0) goto Lf
            r3 = r6
        Lf:
            X.18Dk r1 = X.C21248618Dk.LIZ
            java.lang.Object r0 = X.C18CJ.LIZ()
            r1.getClass()
            com.bytedance.android.btm.impl.page.model.PageInfo r0 = X.C21248618Dk.LJIIIIZZ(r0)
            if (r0 == 0) goto L24
            java.lang.String r5 = r0.getPageBtm()
            if (r5 != 0) goto L27
        L24:
            r5 = r6
            if (r0 == 0) goto L2e
        L27:
            java.lang.String r0 = r0.getClassName()
            if (r0 == 0) goto L2e
            r6 = r0
        L2e:
            X.18CE r8 = X.C18CE.LIZ
            java.lang.String r10 = java.lang.String.valueOf(r19)
            r11 = 0
            kotlin.jvm.internal.AwS0S5100000_32 r0 = new kotlin.jvm.internal.AwS0S5100000_32
            r7 = 0
            r4 = r18
            r1 = r17
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13 = 0
            r9 = 3007(0xbbf, float:4.214E-42)
            r12 = r11
            r14 = r0
            r8.LIZIZ(r9, r10, r11, r12, r13, r14)
            return
        L4a:
            r3 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.bcm.impl.BcmServiceImpl.monitorPageInfoNotFind(java.lang.String, com.bytedance.android.btm.api.model.PageFinder, java.lang.String, com.bytedance.android.bcm.api.model.BcmParams, java.lang.Object):void");
    }

    @Override // X.C18BS
    public Map<String, Object> getFullBcmParams(PageFinder pageFinder, EnumC21242418Ba enumC21242418Ba, C18BZ c18bz, int i, boolean z) {
        List<String> listLIZIZ;
        Map<String, Object> map;
        BcmParams bcmParams;
        Map<String, Object> map2;
        BcmParams bcmParams2;
        BcmParams bcmParams3;
        if (C18CS.LIZ.LIZ() != 1) {
            return C2097608Jq.LJ();
        }
        List<C1766940w56> listSubList = C18BP.LIZ.LIZ(pageFinder, Collections.singletonList("ecom_entrance"), i, z, null).LIZ;
        if (listSubList.isEmpty()) {
            return C2097608Jq.LJ();
        }
        int i2 = C18BY.LIZ[c18bz.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                listLIZIZ = C13BV.INSTANCE;
            } else {
                FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
                featureModelLIZJ.getClass();
                C1972007ny.LIZLLL(featureModelLIZJ.getLazyDataRootKey(), featureModelLIZJ.getLazyDataKey(), featureModelLIZJ.longChainGetParamsConfig, "long_chain_get_params_config");
                listLIZIZ = featureModelLIZJ.longChainGetParamsConfig.LIZ().LIZ();
            }
        } else {
            FeatureModel featureModelLIZJ2 = C18CS.LIZ.LIZJ();
            featureModelLIZJ2.getClass();
            C1972007ny.LIZLLL(featureModelLIZJ2.getLazyDataRootKey(), featureModelLIZJ2.getLazyDataKey(), featureModelLIZJ2.longChainGetParamsConfig, "long_chain_get_params_config");
            listLIZIZ = featureModelLIZJ2.longChainGetParamsConfig.LIZ().LIZIZ();
        }
        Iterator<C1766940w56> it2 = listSubList.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1766940w56 next = it2.next();
            if (!(listLIZIZ instanceof Collection) || !listLIZIZ.isEmpty()) {
                for (String str : listLIZIZ) {
                    String str2 = next.LIZIZ;
                    if (str2 != null && a0.LJJIIZI(str2, str, false)) {
                        if (i3 >= 0) {
                            listSubList = listSubList.subList(0, i3 + 1);
                        }
                    }
                }
            }
            i3++;
        }
        List<C1766940w56> listLJLJJLL = C13LP.LJLJJLL(listSubList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1766940w56 c1766940w56 : listLJLJJLL) {
            BcmServiceImpl bcmServiceImpl = INSTANCE;
            C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
            Map<String, Object> map3 = null;
            if (c1766990w5B != null && (bcmParams3 = c1766990w5B.LIZ) != null) {
                map = bcmParams3.toMap();
            } else {
                map = null;
            }
            bcmServiceImpl.merge(linkedHashMap, map, enumC21242418Ba);
            if (z) {
                C1766990w5B c1766990w5B2 = c1766940w56.LJIIIZ;
                if (c1766990w5B2 != null && (bcmParams2 = c1766990w5B2.LIZJ) != null) {
                    map2 = bcmParams2.toMap();
                } else {
                    map2 = null;
                }
                bcmServiceImpl.merge(linkedHashMap, map2, enumC21242418Ba);
            }
            C1766990w5B c1766990w5B3 = c1766940w56.LJIIIZ;
            if (c1766990w5B3 != null && (bcmParams = c1766990w5B3.LIZIZ) != null) {
                map3 = bcmParams.toMap();
            }
            bcmServiceImpl.merge(linkedHashMap, map3, enumC21242418Ba);
        }
        return linkedHashMap;
    }

    @Override // X.C18BS
    public Map<String, Object> getBcmParamsWithKey(PageFinder pageFinder, List<String> list, EnumC21242418Ba enumC21242418Ba, C18BZ c18bz, int i, boolean z) {
        Map<String, Object> fullBcmParams = getFullBcmParams(pageFinder, enumC21242418Ba, c18bz, i, z);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : fullBcmParams.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
