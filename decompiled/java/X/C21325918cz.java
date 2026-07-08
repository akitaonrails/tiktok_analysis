package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import com.tiktok.myna.render.render.widget.animation.MynaAnimationKeyframe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21325918cz {
    public static final /* synthetic */ int LJJIIZI = 0;
    public final C21326718d7 LIZ;
    public C1774720wHe LIZIZ;
    public InterfaceC21326118d1 LIZJ;
    public Map<String, ? extends Object> LIZLLL;
    public Map<String, ? extends Object> LJ;
    public boolean LJFF;
    public boolean LJI;
    public MynaTemplateProtocol LJII;
    public C21326518d5 LJIIIIZZ;
    public AbstractC21333318eB<?> LJIIIZ;
    public String LJIILJJIL;
    public int LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public int LJJ;
    public HashMap<String, C21335118eT> LJJIFFI;
    public C1168340gVc LJJII;
    public int LJJIIJ;
    public Map<String, ? extends Object> LJJIIJZLJL;
    public String LJJIIZ;
    public final C21328118dL LJIIJ = new C21328118dL(this);
    public Map<String, ? extends Object> LJIIJJI = C2097608Jq.LJ();
    public Map<String, ? extends Object> LJIIL = C2097608Jq.LJ();
    public Map<String, ? extends Object> LJIILIIL = C2097608Jq.LJ();
    public final C01GW LJIILL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(244));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(245));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(759));
    public final C01GW LJJI = C452501pT.LIZ(EnumC452301pR.NONE, new AwS576S0100000_32(this, 741));
    public final AwS611S0100000_32 LJJIII = new AwS611S0100000_32(this, 346);

    public final C1168340gVc LJIIJ() {
        C1168340gVc c1168340gVc = this.LJJII;
        if (c1168340gVc != null) {
            return c1168340gVc;
        }
        C1168340gVc c1168340gVc2 = this.LIZ.LJIIIIZZ;
        this.LJJII = c1168340gVc2;
        return c1168340gVc2;
    }

    public final String LJIIJJI() {
        String str;
        C1774720wHe c1774720wHe = this.LIZIZ;
        return (c1774720wHe == null || (str = c1774720wHe.LIZIZ) == null) ? "" : str;
    }

    public final String LJIIL() {
        String str;
        C1774720wHe c1774720wHe = this.LIZIZ;
        return (c1774720wHe == null || (str = c1774720wHe.LIZ) == null) ? "" : str;
    }

    public final C1162800gMg LJIILIIL() {
        return (C1162800gMg) this.LJIIZILJ.getValue();
    }

    public final C21319718bz LIZJ() {
        if (C1325860kbg.LJII()) {
            return (C21319718bz) this.LJIILL.getValue();
        }
        return null;
    }

    public final C1545310qJd LIZLLL() {
        if (C1325860kbg.LJII()) {
            return (C1545310qJd) this.LJIILLIIL.getValue();
        }
        return null;
    }

    public static Object LJIILJJIL(C21325918cz c21325918cz) {
        c21325918cz.getClass();
        C1168270gVV.LIZ.getClass();
        InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(c21325918cz.LIZ.LIZIZ);
        if (interfaceC1168310gVZ != null) {
            c21325918cz.LIZ.getClass();
            if (c21325918cz.LJJIIZ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("myna_");
                sbLIZ.append(c21325918cz.LIZ.LIZIZ);
                c21325918cz.LJJIIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            interfaceC1168310gVZ.LJIIIZ();
            return null;
        }
        return null;
    }

    public final AbstractC21333318eB<?> LJII(String str) {
        boolean z;
        AbstractC21333318eB<?> abstractC21333318eB;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (abstractC21333318eB = this.LJIIIZ) == null) {
            return null;
        }
        return abstractC21333318eB.LJJIFFI(str);
    }

    public final C21335118eT LJIIIIZZ(String str) {
        MynaElement mynaElement;
        Map<String, List<MynaAnimationKeyframe>> animations;
        List<MynaAnimationKeyframe> list;
        Map<String, Object> map;
        C21335118eT c21335118eT = null;
        MynaAnimationKeyframe mynaAnimationKeyframe = null;
        c21335118eT = null;
        c21335118eT = null;
        c21335118eT = null;
        c21335118eT = null;
        if (str == null) {
            return null;
        }
        HashMap<String, C21335118eT> map2 = this.LJJIFFI;
        if (map2 == null) {
            map2 = new HashMap<>();
            this.LJJIFFI = map2;
        }
        C21335118eT c21335118eT2 = map2.get(str);
        if (c21335118eT2 == null) {
            AbstractC21333318eB<?> abstractC21333318eB = this.LJIIIZ;
            if (abstractC21333318eB != null && (mynaElement = abstractC21333318eB.LLILZIL) != null && (animations = mynaElement.getAnimations()) != null && (list = animations.get(str)) != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                MynaAnimationKeyframe mynaAnimationKeyframe2 = null;
                for (MynaAnimationKeyframe mynaAnimationKeyframe3 : list) {
                    int iRound = Math.round(mynaAnimationKeyframe3.percent);
                    if (iRound != 0) {
                        if (iRound == 1) {
                            mynaAnimationKeyframe2 = mynaAnimationKeyframe3;
                        }
                    } else {
                        mynaAnimationKeyframe = mynaAnimationKeyframe3;
                    }
                }
                if (mynaAnimationKeyframe != null && (map = mynaAnimationKeyframe.style) != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!arrayList.contains(entry.getKey())) {
                            arrayList.add(entry.getKey());
                        }
                    }
                }
                c21335118eT = new C21335118eT(mynaAnimationKeyframe, mynaAnimationKeyframe2, arrayList);
            }
            map2.put(str, c21335118eT);
            c21335118eT2 = c21335118eT;
        }
        return c21335118eT2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LJIILL(java.util.Map<java.lang.String, ? extends java.lang.Object> r10) {
        /*
            r9 = this;
            X.13DA r3 = new X.13DA
            r3.<init>()
            r3.putAll(r10)
            java.util.Map<java.lang.String, ? extends java.lang.Object> r1 = r9.LJJIIJZLJL
            if (r1 != 0) goto L4a
            X.0gVV r1 = X.C1168270gVV.LIZ
            X.18d7 r0 = r9.LIZ
            java.lang.String r8 = r0.LIZIZ
            android.content.Context r7 = r0.LIZ
            java.util.Map<java.lang.String, ? extends java.lang.Object> r6 = r9.LJ
            java.util.Map<java.lang.String, ? extends java.lang.Object> r5 = r9.LIZLLL
            r1.getClass()
            if (r7 == 0) goto L77
            r1 = r7
        L1e:
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L6a
            r4 = 1
        L23:
            kotlin.jvm.internal.AwS546S0100000_2 r2 = new kotlin.jvm.internal.AwS546S0100000_2
            r0 = 1093(0x445, float:1.532E-42)
            r2.<init>(r7, r0)
            r1 = 0
            java.util.Map r0 = X.C2097608Jq.LJ()
            X.C1325860kbg.LIZLLL(r4, r1, r2, r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r0 = X.C1168270gVV.LJII(r7, r8)
            r1.putAll(r0)
            if (r6 == 0) goto L43
            r1.putAll(r6)
        L43:
            if (r5 == 0) goto L48
            r1.putAll(r5)
        L48:
            r9.LJJIIJZLJL = r1
        L4a:
            java.lang.String r0 = "__globalProps"
            r3.put(r0, r1)
            X.0gMg r0 = r9.LJIILIIL()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r0.LIZ
            java.lang.String r0 = "__variables"
            r3.put(r0, r1)
            X.0gMg r0 = r9.LJIILIIL()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r0.LIZIZ
            java.lang.String r0 = "__action_result"
            r3.put(r0, r1)
            java.util.Map r0 = r3.build()
            return r0
        L6a:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L77
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            if (r1 == 0) goto L77
            goto L1e
        L77:
            r4 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21325918cz.LJIILL(java.util.Map):java.util.Map");
    }

    public C21325918cz(C21326718d7 c21326718d7, C1774720wHe c1774720wHe) {
        this.LIZ = c21326718d7;
        this.LIZIZ = c1774720wHe;
    }

    public final Map<String, Object> LJFF(Map<String, String> map, Map<String, ? extends Object> map2) {
        if (map != null && !map.isEmpty()) {
            HashMap map3 = new HashMap((int) ((map.size() / 0.75f) + 1.0f));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                map3.put(entry.getKey(), this.LIZ.LIZJ.LIZ(entry.getValue(), map2, this, this.LJJIII));
            }
            return map3;
        }
        return null;
    }

    public final Map<String, Object> LJI(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        boolean z;
        String str;
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        HashMap map3 = new HashMap((int) ((map.size() / 0.75f) + 1.0f));
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.length() > 0 && key.charAt(0) == ':') {
                Object value = entry.getValue();
                if ((value instanceof String) && (str = (String) value) != null) {
                    map3.put(entry.getKey().substring(1), this.LIZ.LIZJ.LIZ(str, map2, this, this.LJJIII));
                }
            } else {
                map3.put(entry.getKey(), entry.getValue());
            }
        }
        return map3;
    }

    public final C21326018d0 LIZ(String str, Map map, boolean z) {
        Map mapLIZIZ;
        AbstractC21333318eB<?> abstractC21333318eB;
        C21326018d0 c21326018d0;
        View view;
        Throwable th = null;
        int i = 0;
        try {
            this.LJJIIJ = 0;
            this.LJIILJJIL = str;
            if (z) {
                this.LJIILIIL = map;
            }
            this.LJIIL = map;
            abstractC21333318eB = this.LJIIIZ;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                C1168400gVi.LIZIZ(new AwS581S0100000_2(th2, 609));
                this.LJIJI++;
                new C1338670kwL(EnumC1325870kbh.RENDER_ERROR, 1001, C1325860kbg.LJI(th2), this.LJIIJJI, 8).LIZJ(C21323718cd.LIZ(this));
                mapLIZIZ = this.LJIIJ.LIZIZ(th2, z);
                th = th2;
                i = 1001;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                this.LJIIJ.LIZIZ(null, z);
                throw th3;
            }
        }
        if (abstractC21333318eB == null) {
            c21326018d0 = C21326018d0.LIZLLL;
        } else {
            C21328118dL c21328118dL = this.LJIIJ;
            c21328118dL.getClass();
            C21328218dM c21328218dM = new C21328218dM();
            c21328118dL.LIZJ = c21328218dM;
            c21328218dM.LIZ = Long.valueOf(System.currentTimeMillis());
            c21328118dL.LIZJ.LJ = c21328118dL.LIZ.LJI;
            c21328118dL.LJIIIIZZ = z;
            this.LJIJ++;
            this.LJIIJJI = LJIILL(this.LJIIL);
            abstractC21333318eB.LJIILJJIL(this.LJIIJJI, new C21329718db());
            AbstractC21333318eB<?> abstractC21333318eB2 = this.LJIIIZ;
            if (abstractC21333318eB2 != null && (view = abstractC21333318eB2.getView()) != null) {
                if (this.LJJIIJ > 0) {
                    view.setClickable(true);
                } else if (!view.hasOnClickListeners()) {
                    view.setClickable(false);
                }
                mapLIZIZ = this.LJIIJ.LIZIZ(null, z);
                return new C21326018d0(i, th, mapLIZIZ);
            }
            c21326018d0 = C21326018d0.LIZLLL;
        }
        this.LJIIJ.LIZIZ(null, z);
        return c21326018d0;
    }

    public final AbstractC21333318eB<?> LIZIZ(String str, boolean z, boolean z2) {
        AbstractC21333318eB<?> abstractC21333318eB;
        AbstractC21333318eB<?> abstractC21333318eB2;
        if (!z2) {
            if (z) {
                C21326718d7 c21326718d7 = this.LIZ;
                if (c21326718d7.LJIIZILJ && !this.LJFF) {
                    C21324518cl c21324518cl = c21326718d7.LIZLLL;
                    String str2 = c21326718d7.LIZIZ;
                    if (str == null) {
                        c21324518cl.getClass();
                    } else {
                        C21325818cy c21325818cy = c21324518cl.LIZLLL.get(str);
                        if (c21325818cy != null) {
                            C21326718d7 c21326718d72 = c21324518cl.LIZ;
                            ArrayList<AbstractC21333318eB<?>> arrayList = c21325818cy.LJ;
                            int size = arrayList.size();
                            int i = size - 1;
                            if (i < c21325818cy.LIZLLL && c21325818cy.LIZJ > 0) {
                                C21325918cz c21325918cz = c21326718d72.LJFF;
                                if (!c21325818cy.LJFF) {
                                    c21325818cy.LJFF = true;
                                    C21326718d7 c21326718d73 = c21325918cz.LIZ;
                                    AwS147S1200000_32 awS147S1200000_32 = new AwS147S1200000_32(c21325818cy, str2, c21325918cz, 14);
                                    c21326718d73.getClass();
                                    C1168270gVV.LIZ.getClass();
                                    C1168270gVV.LIZLLL().execute(new RunnableC514801zW(awS147S1200000_32, (Function0<Unit>) 157));
                                }
                            }
                            if (size > 0 && (abstractC21333318eB2 = (AbstractC21333318eB) ListProtector.remove(arrayList, i)) != null) {
                                abstractC21333318eB2.LJJLIIIJLJLI(this);
                                C21328218dM c21328218dM = this.LJIIJ.LIZJ;
                                c21328218dM.LJIIL++;
                                c21328218dM.LJIILIIL++;
                                return abstractC21333318eB2;
                            }
                        }
                    }
                }
            }
            this.LJIIJ.LIZJ.LJIIL++;
            Map<String, AbstractC21324618cm> map = C21325218cs.LIZ;
            String str3 = this.LIZ.LIZIZ;
            if (str == null) {
                str = "";
            }
            return C21325218cs.LIZ(str3, this, str, false);
        }
        if (z) {
            C1168270gVV c1168270gVV = C1168270gVV.LIZ;
            c1168270gVV.getClass();
            if (((Boolean) C1168270gVV.LJIIJJI.getValue()).booleanValue()) {
                C21326718d7 c21326718d74 = this.LIZ;
                if (c21326718d74.LJIIZILJ && !this.LJFF) {
                    C21324518cl c21324518cl2 = c21326718d74.LIZLLL;
                    String str4 = c21326718d74.LIZIZ;
                    if (str == null) {
                        c21324518cl2.getClass();
                    } else {
                        C21325818cy c21325818cy2 = c21324518cl2.LIZLLL.get(str);
                        if (c21325818cy2 != null) {
                            C21326718d7 c21326718d75 = c21324518cl2.LIZ;
                            ArrayList<AbstractC21333318eB<?>> arrayList2 = c21325818cy2.LJIIIIZZ;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList<>(c21325818cy2.LJII);
                                c21325818cy2.LJIIIIZZ = arrayList2;
                            }
                            int size2 = arrayList2.size();
                            if (c21325818cy2.LJII > 0 && size2 - 1 < c21325818cy2.LJI) {
                                C21325918cz c21325918cz2 = c21326718d75.LJFF;
                                if (!c21325818cy2.LJIIIZ) {
                                    c21325818cy2.LJIIIZ = true;
                                    C21326718d7 c21326718d76 = c21325918cz2.LIZ;
                                    AwS147S1200000_32 awS147S1200000_322 = new AwS147S1200000_32(c21325818cy2, str4, c21325918cz2, 13);
                                    c21326718d76.getClass();
                                    c1168270gVV.getClass();
                                    C1168270gVV.LIZLLL().execute(new RunnableC514801zW(awS147S1200000_322, (Function0<Unit>) 157));
                                }
                            }
                            if (size2 > 0 && (abstractC21333318eB = (AbstractC21333318eB) ListProtector.remove(arrayList2, size2 - 1)) != null) {
                                abstractC21333318eB.LJJLIIIJLJLI(this);
                                C21328218dM c21328218dM2 = this.LJIIJ.LIZJ;
                                c21328218dM2.LJIILJJIL++;
                                c21328218dM2.LJIILL++;
                                return abstractC21333318eB;
                            }
                        }
                    }
                }
            }
        }
        this.LJIIJ.LIZJ.LJIILJJIL++;
        Map<String, AbstractC21324618cm> map2 = C21325218cs.LIZ;
        String str5 = this.LIZ.LIZIZ;
        if (str == null) {
            str = "";
        }
        AbstractC21333318eB<?> abstractC21333318eBLIZ = C21325218cs.LIZ(str5, this, str, true);
        if (this.LJFF) {
            abstractC21333318eBLIZ.LJJJI();
        }
        return abstractC21333318eBLIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r7 == null) goto L25;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.07bJ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1547330qMt LJIIIZ(X.InterfaceC1547330qMt r10, java.util.Map<java.lang.String, ? extends java.lang.Object> r11, java.util.Map<java.lang.String, ? extends java.lang.Object> r12) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C1547320qMs
            if (r0 == 0) goto L69
            r3 = r10
            X.0qMs r3 = (X.C1547320qMs) r3
            java.util.Map r7 = r3.getData()
            boolean r0 = r3.getHasDynamicProp()
            r6 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L6d
            if (r11 == 0) goto L6a
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6a
        L1e:
            X.07bJ r2 = new X.07bJ
            java.util.Map r1 = r3.getData()
            X.18d7 r0 = r9.LIZ
            X.18dO r0 = r0.LIZJ
            r2.<init>(r1, r0)
            kotlin.jvm.internal.AwS611S0100000_32 r0 = r9.LJJIII
            java.lang.Object r1 = r2.LIZ(r1, r11, r6, r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L6f
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L6f
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r1)
        L3e:
            if (r12 == 0) goto L60
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L60
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r7)
            java.lang.String r2 = "params"
            java.lang.Object r1 = r7.get(r2)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L58
            r5 = r1
            java.util.Map r5 = (java.util.Map) r5
        L58:
            java.util.Map r0 = X.C1337850kv1.LJIIJJI(r5, r12)
            r3.put(r2, r0)
            r7 = r3
        L60:
            X.0qMu r0 = X.C1547320qMs.Companion
            r0.getClass()
            X.0qMs r10 = X.C1547340qMu.LIZJ(r7, r4)
        L69:
            return r10
        L6a:
            java.util.Map<java.lang.String, ? extends java.lang.Object> r11 = r9.LJIIJJI
            goto L1e
        L6d:
            if (r7 != 0) goto L3e
        L6f:
            java.util.Map r0 = r3.getData()
            if (r0 != 0) goto L9b
            java.lang.String r2 = "null"
        L77:
            X.0kwL r3 = new X.0kwL
            X.0kbh r4 = X.EnumC1325870kbh.ACTION_ERROR
            r5 = 4003(0xfa3, float:5.61E-42)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "empty action evaluation error, actionDatatype:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
            r7 = 0
            r8 = 24
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Map r0 = X.C21323718cd.LIZ(r9)
            r3.LIZJ(r0)
            return r10
        L9b:
            java.util.Map r0 = r3.getData()
            java.lang.Class r0 = r0.getClass()
            X.12Dl r0 = X.C13LE.LIZ(r0)
            java.lang.String r2 = r0.LJI()
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21325918cz.LJIIIZ(X.0qMt, java.util.Map, java.util.Map):X.0qMt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(InterfaceC1547330qMt interfaceC1547330qMt, View view, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        View view2;
        AbstractC21333318eB<?> abstractC21333318eB;
        System.currentTimeMillis();
        Boolean boolValueOf = null;
        if (map == null && ((abstractC21333318eB = this.LJIIIZ) == 0 || (map = abstractC21333318eB.LIZJ()) == null)) {
            map = C2097608Jq.LJ();
        }
        InterfaceC1547330qMt interfaceC1547330qMtLJIIIZ = LJIIIZ(interfaceC1547330qMt, map, map2);
        if (interfaceC1547330qMtLJIIIZ.getDisable()) {
            C21319718bz c21319718bzLIZJ = LIZJ();
            if (c21319718bzLIZJ != null) {
                c21319718bzLIZJ.LIZ(new AwS570S0100000_26(interfaceC1547330qMtLJIIIZ, 1506));
                return;
            }
            return;
        }
        System.currentTimeMillis();
        if (this.LJIIIIZZ != null) {
            C21326718d7 c21326718d7 = this.LIZ;
            if (!c21326718d7.LJJJJZI.isEmpty()) {
                Iterator<InterfaceC21326418d4> it2 = c21326718d7.LJJJJZI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            }
        }
        String type = interfaceC1547330qMtLJIIIZ.getType();
        if (type.length() != 0 && !Intrinsics.LJFF(type, "__MYNA_UNKNOWN__")) {
            C21319718bz c21319718bzLIZJ2 = LIZJ();
            if (c21319718bzLIZJ2 != null) {
                c21319718bzLIZJ2.LIZ(new AwS570S0100000_26(interfaceC1547330qMtLJIIIZ, 1507));
            }
            InterfaceC21326118d1 interfaceC21326118d1 = this.LIZJ;
            if (interfaceC21326118d1 != null) {
                interfaceC21326118d1.LIZJ(this.LJIIIIZZ, interfaceC1547330qMtLJIIIZ, view);
            }
            if (this.LIZJ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("myna_action_handle_null,template name:");
                sbLIZ.append(LJIIJJI());
                sbLIZ.append(",isEmpty:");
                sbLIZ.append(Intrinsics.LJFF(this, this.LIZ.LJFF));
                sbLIZ.append(",hadSet:");
                sbLIZ.append(this.LJIJJ);
                sbLIZ.append(",setNull:");
                sbLIZ.append(this.LJIJJLI);
                sbLIZ.append(",isAttach:");
                AbstractC21333318eB<?> abstractC21333318eB2 = this.LJIIIZ;
                if (abstractC21333318eB2 != null && (view2 = abstractC21333318eB2.getView()) != null) {
                    boolValueOf = Boolean.valueOf(view2.isAttachedToWindow());
                }
                sbLIZ.append(boolValueOf);
                new C1338670kwL(EnumC1325870kbh.ACTION_ERROR, 4001, C2188811AlT.LIZIZ(sbLIZ), null, 24).LIZJ(C21323718cd.LIZ(this));
                return;
            }
            return;
        }
        C21326718d7 c21326718d72 = this.LIZ;
        AwS421S0200000_20 awS421S0200000_20 = new AwS421S0200000_20(interfaceC1547330qMt, this, 11);
        c21326718d72.getClass();
        C1168270gVV.LIZ.getClass();
        C1168270gVV.LIZLLL().execute(new RunnableC514801zW(awS421S0200000_20, (Function0<Unit>) 157));
    }
}
