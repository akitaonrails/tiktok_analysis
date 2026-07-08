package X;

import Y.ARunnableS0S1401000_20;
import Y.ARunnableS13S0301000_20;
import Y.ARunnableS16S1300000_20;
import Y.ARunnableS26S0201000_20;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.utils.CallStackUtil;
import j27.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301090jxj {
    public final Map<String, C1301070jxh> LIZ = new ConcurrentHashMap();
    public final Object LIZIZ = new Object();
    public final Map<String, C1301140jxo> LIZJ = new HashMap();
    public final Map<C00AV, Typeface> LIZLLL = Collections.synchronizedMap(new LinkedHashMap<C00AV, Typeface>() { // from class: X.0jw1
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<C00AV, Typeface> entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    });

    public final C1301140jxo LIZJ(C1301160jxq c1301160jxq) {
        Object obj;
        Object obj2;
        for (Pair pair : (ArrayList) c1301160jxq.LIZ) {
            if (pair != null && (obj = pair.first) != null && (obj2 = pair.second) != null) {
                C1301140jxo c1301140jxo = (C1301140jxo) ((HashMap) this.LIZJ).get(LJIILIIL((EnumC1301150jxp) obj, (String) obj2));
                if (c1301140jxo != null) {
                    return c1301140jxo;
                }
            }
        }
        return null;
    }

    public final C1301070jxh LIZLLL(C1301160jxq c1301160jxq) {
        Object obj;
        Object obj2;
        for (Pair pair : (ArrayList) c1301160jxq.LIZ) {
            if (pair != null && (obj = pair.first) != null && (obj2 = pair.second) != null) {
                C1301070jxh c1301070jxh = (C1301070jxh) ((ConcurrentHashMap) this.LIZ).get(LJIILIIL((EnumC1301150jxp) obj, (String) obj2));
                if (c1301070jxh != null) {
                    return c1301070jxh;
                }
            }
        }
        return null;
    }

    public final void LJIIIZ(C1301140jxo c1301140jxo) {
        synchronized (this.LIZIZ) {
            try {
                LJIILJJIL(c1301140jxo);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILJJIL(C1301140jxo c1301140jxo) {
        Iterator it2 = ((HashMap) this.LIZJ).entrySet().iterator();
        while (it2.hasNext()) {
            if (((Map.Entry) it2.next()).getValue() == c1301140jxo) {
                it2.remove();
            }
        }
    }

    public static String LJIILIIL(EnumC1301150jxp enumC1301150jxp, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1301150jxp.name());
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(Typeface typeface, String str) {
        C1301070jxh c1301070jxh = new C1301070jxh(typeface);
        ((ConcurrentHashMap) this.LIZ).put(LJIILIIL(EnumC1301150jxp.URL, str), c1301070jxh);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefetchFont success: ");
        sbLIZ.append(str);
        LynxLog.i("FontFaceManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(C1301160jxq c1301160jxq, C1301070jxh c1301070jxh) {
        Object obj;
        Object obj2;
        for (Pair pair : (ArrayList) c1301160jxq.LIZ) {
            if (pair != null && (obj = pair.first) != null && (obj2 = pair.second) != null) {
                ((ConcurrentHashMap) this.LIZ).put(LJIILIIL((EnumC1301150jxp) obj, (String) obj2), c1301070jxh);
            }
        }
    }

    public static Typeface LJI(s sVar, EnumC1301150jxp enumC1301150jxp, String str) {
        if (!TextUtils.isEmpty(str) && enumC1301150jxp != EnumC1301150jxp.LOCAL) {
            int iIndexOf = str.indexOf("base64,");
            if (str.startsWith("data:") && iIndexOf != -1) {
                try {
                    return C08JN.LIZIZ(sVar, Base64.decode(str.substring(iIndexOf + 7), 0));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJIIL(30203, "Error when parsing base64 resource", str, e, sVar);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final void LJIIJ(s sVar, String str, C1301180jxs c1301180jxs) {
        if (TextUtils.isEmpty(str)) {
            if (c1301180jxs != null) {
                ((C1301260jy0) c1301180jxs.LIZ).LIZ(32101, "url is empty");
                return;
            }
            return;
        }
        C1301610jyZ.LIZIZ().execute(new ARunnableS16S1300000_20(this, sVar, c1301180jxs, str, 4));
    }

    public final void LJIIJJI(s sVar, String str, InterfaceC1301170jxr interfaceC1301170jxr) {
        String strLIZIZ;
        int i = 32101;
        try {
            AbstractC1301120jxm abstractC1301120jxm = sVar.LLJJJJ;
            if (abstractC1301120jxm == null) {
                abstractC1301120jxm = C1301200jxu.LIZ;
            }
            Typeface typefaceLIZ = abstractC1301120jxm.LIZ(sVar, EnumC1301150jxp.URL, str);
            if (typefaceLIZ != null) {
                LIZ(typefaceLIZ, str);
                i = 0;
                strLIZIZ = "";
            } else {
                strLIZIZ = "loadFontFace failed";
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prefetchFont with loader failed: ");
            sbLIZ.append(e.getMessage());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LynxLog.e("FontFaceManager", strLIZIZ);
        }
        if (interfaceC1301170jxr != null) {
            ((C1301260jy0) ((C1301180jxs) interfaceC1301170jxr).LIZ).LIZ(i, strLIZIZ);
        }
    }

    public static void LJFF(Handler handler, InterfaceC1301080jxi interfaceC1301080jxi, C1301070jxh c1301070jxh, int i) {
        C1289620jfE.LIZLLL(new ARunnableS13S0301000_20(i, c1301070jxh, handler, interfaceC1301080jxi, 5));
    }

    public final Typeface LJ(final s sVar, String str, final int i, final InterfaceC1301080jxi interfaceC1301080jxi) {
        final C1301160jxq c1301160jxqLJIIJ = sVar.LJIIJ(str);
        if (c1301160jxqLJIIJ == null) {
            return null;
        }
        C1301070jxh c1301070jxhLIZLLL = LIZLLL(c1301160jxqLJIIJ);
        if (c1301070jxhLIZLLL != null && c1301070jxhLIZLLL.LIZIZ[i] != null) {
            return c1301070jxhLIZLLL.LIZ(i);
        }
        C1301070jxh c1301070jxh = c1301160jxqLJIIJ.LIZIZ;
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.myLooper());
        if (c1301070jxh != null) {
            if (interfaceC1301080jxi != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS0S1401000_20(this, i, interfaceC1301080jxi, c1301070jxh, bPEAHandler, str, 2));
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return c1301070jxh.LIZ(i);
            }
            return c1301070jxh.LIZ(0);
        }
        C1301610jyZ.LIZIZ().execute(new Runnable() { // from class: X.0jxk
            public final void LIZ() {
                Object obj;
                Object obj2;
                C1301090jxj c1301090jxj = this.LLILZLL;
                s sVar2 = sVar;
                C1301160jxq c1301160jxq = c1301160jxqLJIIJ;
                int i2 = i;
                InterfaceC1301080jxi interfaceC1301080jxi2 = interfaceC1301080jxi;
                Handler handler = bPEAHandler;
                C1301070jxh c1301070jxhLIZLLL2 = c1301090jxj.LIZLLL(c1301160jxq);
                if (c1301070jxhLIZLLL2 != null) {
                    c1301160jxq.LIZIZ = c1301070jxhLIZLLL2;
                    c1301090jxj.LIZIZ(c1301160jxq, c1301070jxhLIZLLL2);
                    if (interfaceC1301080jxi2 != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            C786410Ut5.LJJZZIII(handler, new ARunnableS26S0201000_20(interfaceC1301080jxi2, i2, c1301070jxhLIZLLL2.LIZ(i2), 7));
                            return;
                        } else {
                            C1301090jxj.LJFF(handler, interfaceC1301080jxi2, c1301070jxhLIZLLL2, i2);
                            return;
                        }
                    }
                    return;
                }
                synchronized (c1301090jxj.LIZIZ) {
                    try {
                        C1301070jxh c1301070jxhLIZLLL3 = c1301090jxj.LIZLLL(c1301160jxq);
                        if (c1301070jxhLIZLLL3 != null) {
                            c1301160jxq.LIZIZ = c1301070jxhLIZLLL3;
                            c1301090jxj.LIZIZ(c1301160jxq, c1301070jxhLIZLLL3);
                            if (interfaceC1301080jxi2 == null) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 28) {
                                C786410Ut5.LJJZZIII(handler, new ARunnableS26S0201000_20(interfaceC1301080jxi2, i2, c1301070jxhLIZLLL3.LIZ(i2), 8));
                            } else {
                                C1301090jxj.LJFF(handler, interfaceC1301080jxi2, c1301070jxhLIZLLL3, i2);
                            }
                            return;
                        }
                        C1301140jxo c1301140jxoLIZJ = c1301090jxj.LIZJ(c1301160jxq);
                        if (c1301140jxoLIZJ != null) {
                            c1301140jxoLIZJ.LIZIZ.add(c1301160jxq);
                            c1301140jxoLIZJ.LIZ.offer(new Pair<>(interfaceC1301080jxi2, Integer.valueOf(i2)));
                            return;
                        }
                        C1301140jxo c1301140jxo = new C1301140jxo();
                        c1301140jxo.LIZ.offer(new Pair<>(interfaceC1301080jxi2, Integer.valueOf(i2)));
                        c1301140jxo.LIZIZ.add(c1301160jxq);
                        for (Pair pair : (ArrayList) c1301160jxq.LIZ) {
                            if (pair != null && (obj = pair.first) != null && (obj2 = pair.second) != null) {
                                ((HashMap) c1301090jxj.LIZJ).put(C1301090jxj.LJIILIIL((EnumC1301150jxp) obj, (String) obj2), c1301140jxo);
                            }
                        }
                        Iterator<Pair<EnumC1301150jxp, String>> it2 = ((ArrayList) c1301160jxq.LIZ).iterator();
                        Iterator<Pair<EnumC1301150jxp, String>> it3 = ((ArrayList) c1301160jxq.LIZ).iterator();
                        if (sVar2.LLL == null) {
                            TraceEvent.LIZLLL("FontFaceManager.loadTypeface");
                            c1301090jxj.LJII(sVar2, c1301140jxo, it2, handler);
                            TraceEvent.LJII("FontFaceManager.loadTypeface");
                        } else {
                            TraceEvent.LIZLLL("FontFaceManager.loadTypefaceWithGenericLynxResourceFetcher");
                            LynxLog.i("FontFaceManager", "Try to loadTypeface with GenericLynxResourceFetcher.");
                            c1301090jxj.LJIIIIZZ(sVar2, c1301140jxo, it2, it3, handler);
                            TraceEvent.LJII("FontFaceManager.loadTypefaceWithGenericLynxResourceFetcher");
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FontFaceManager@c8f5.getTypeface$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FontFaceManager@c8f5.getTypeface$2");
            }
        });
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(final j27.s r15, X.C1301140jxo r16, java.util.Iterator<android.util.Pair<X.EnumC1301150jxp, java.lang.String>> r17, android.os.Handler r18) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1301090jxj.LJII(j27.s, X.0jxo, java.util.Iterator, android.os.Handler):void");
    }

    public static void LJIIL(int i, String str, String str2, Exception exc, s sVar) {
        LynxError lynxError = new LynxError(i, str);
        if (exc != null) {
            lynxError.LJII(CallStackUtil.LIZ(exc));
            LynxLog.e("FontFaceManager", exc.getMessage());
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(",src:");
            sbLIZ.append(str2);
            LynxLog.e("FontFaceManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        sVar.LJJIFFI(str2, "font", lynxError);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(final j27.s r19, X.C1301140jxo r20, java.util.Iterator<android.util.Pair<X.EnumC1301150jxp, java.lang.String>> r21, java.util.Iterator<android.util.Pair<X.EnumC1301150jxp, java.lang.String>> r22, android.os.Handler r23) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1301090jxj.LJIIIIZZ(j27.s, X.0jxo, java.util.Iterator, java.util.Iterator, android.os.Handler):void");
    }
}
