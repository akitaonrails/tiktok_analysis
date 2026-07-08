package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS26S0201000_20;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.core.LynxLayoutProxy;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.lynx.tasm.image.AutoSizeImage;
import com.lynx.tasm.service.ILynxImageService;
import j27.s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315720kLK {
    public static final Bitmap.Config LJJLJ = Bitmap.Config.ARGB_8888;
    public static final ConcurrentHashMap<String, C1316270kMD> LJJLJLI = new ConcurrentHashMap<>();
    public static final Method LJJLL;
    public final s LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public ShadowNode LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILLIIL;
    public C1289600jfC LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public String LJIJJLI;
    public int LJIL;
    public C089P LJJ;
    public C089P LJJI;
    public InterfaceC1316380kMO LJJIFFI;
    public final InterfaceC1315950kLh LJJII;
    public final Context LJJIII;
    public ReadableMap LJJIIJ;
    public boolean LJJIIJZLJL;
    public LynxBaseUI LJJIIZ;
    public final boolean LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final boolean LJJIJIL;
    public final boolean LJJIJL;
    public final AbstractC1301590jyX LJJIJLIJ;
    public boolean LJJJ;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public C1331070kk5 LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public final boolean LJJLIIIJILLIZJL;
    public Rect LJJLIIIJJIZ;
    public EnumC1300090jw7 LJJLIIIJLLLLLLLZ;
    public EnumC1300090jw7 LJJLIIJ;
    public final ILynxImageService LJJLIL;
    public Bitmap.Config LJIILL = LJJLJ;
    public EnumC1316020kLo LJIIZILJ = EnumC1316020kLo.RESIZE;
    public final Map<String, String> LJJIIZI = new HashMap();
    public boolean LJJIJ = false;
    public int LJJIL = 0;
    public boolean LJJIZ = false;
    public boolean LJJJI = false;
    public boolean LJJJJLI = false;
    public float LJJJJLL = 0.0f;
    public boolean LJJJJZ = false;
    public boolean LJJJJZI = false;
    public int LJJJLIIL = 0;
    public int LJJJLL = 0;
    public int LJJJLZIJ = 0;
    public String LJJJZ = null;
    public String LJJL = null;
    public int LJJLI = 1;
    public boolean LJJLIIIJJI = false;
    public boolean LJJLIIIJL = false;
    public final C1315990kLl LJJLIIIJLJLI = new C0I9J() { // from class: X.0kLl
        @Override // X.C0I9J, X.InterfaceC1331000kjy
        public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
            C1315720kLK c1315720kLK = this.LIZ;
            if (c1315720kLK.LJJJIL) {
                c1315720kLK.LJIILJJIL("startplay");
            }
        }

        @Override // X.C0I9J, X.InterfaceC1331000kjy
        public final void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
            if (this.LIZ.LJJJJ && animatedDrawable2.isRunning()) {
                this.LIZ.LJIILJJIL("currentloopcomplete");
            }
        }

        @Override // X.C0I9J, X.InterfaceC1331000kjy
        public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
            if (this.LIZ.LJJJJI && animatedDrawable2.isRunning()) {
                this.LIZ.LJIILJJIL("currentloopcomplete");
                this.LIZ.LJIILJJIL("finalloopcomplete");
            }
        }
    };

    static {
        try {
            LJJLL = AbstractC1327750kej.class.getMethod("isHitBitmapMemoryCache", new Class[0]);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.d("ImageDelegate", "Current Fresco version dose not support isHitBitmapMemoryCache");
            LJJLL = null;
        }
    }

    public final void LJIIIIZZ() {
        final int i;
        final int i2;
        LynxBaseUI lynxBaseUI = this.LJJIIZ;
        if (lynxBaseUI == null || (i = this.LIZLLL) == 0 || (i2 = this.LJ) == 0) {
            return;
        }
        final boolean z = this.LJIIL;
        final int width = lynxBaseUI.getWidth();
        final int height = this.LJJIIZ.getHeight();
        if (!this.LJJIJL) {
            if (this.LJIILIIL == null) {
                LynxBaseUI lynxBaseUI2 = this.LJJIIZ;
                this.LJIILIIL = lynxBaseUI2.mContext.LJFF(lynxBaseUI2.getSign());
            }
            ShadowNode shadowNode = this.LJIILIIL;
            if (shadowNode instanceof AutoSizeImage) {
                ((AutoSizeImage) shadowNode).LJJIIJ(i, i2, width, height, z);
                return;
            } else {
                this.LJJJJJL = true;
                return;
            }
        }
        LynxBaseUI lynxBaseUI3 = this.LJJIIZ;
        s sVar = lynxBaseUI3.mContext;
        int sign = lynxBaseUI3.getSign();
        InterfaceC1309740kBg interfaceC1309740kBg = new InterfaceC1309740kBg() { // from class: X.0kM4
            @Override // X.InterfaceC1309740kBg
            public final void LIZ(ShadowNode shadowNode2) {
                boolean z2 = z;
                int i3 = i;
                int i4 = i2;
                int i5 = width;
                int i6 = height;
                if (!(shadowNode2 instanceof AutoSizeImage)) {
                    LynxLog.e("ImageDelegate", "ShadowNode is not an instance of AutoSizeImage.");
                } else {
                    ((AutoSizeImage) shadowNode2).LJJIIJ(i3, i4, i5, i6, z2);
                }
            }
        };
        sVar.getClass();
        ARunnableS26S0201000_20 aRunnableS26S0201000_20 = new ARunnableS26S0201000_20(sVar, sign, interfaceC1309740kBg, 9);
        LynxLayoutProxy lynxLayoutProxy = sVar.LLJILJIL.get();
        if (lynxLayoutProxy != null) {
            lynxLayoutProxy.LIZIZ(aRunnableS26S0201000_20);
        }
    }

    public final void LJIIL() {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 70);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aRunnableS120S0100000_20.run();
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), aRunnableS120S0100000_20);
        }
    }

    public static boolean LJFF(AbstractC1327750kej abstractC1327750kej) {
        Method method = LJJLL;
        if (method != null && abstractC1327750kej != null) {
            try {
                return Boolean.TRUE.equals(C2204961BRm.a0(method, abstractC1327750kej, new Object[0], new C0WZX("dzBzEg4jUdKSQVYySFyRb1ZfUZ4WkTRDPc5cPTqyVW8Q8pGe", null)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.d("ImageDelegate", "Invoke isHitBitmapMemoryCache failed: " + e);
            }
        }
        return false;
    }

    public final C1325700kbQ LIZLLL(Uri uri) {
        Map<String, String> map;
        Bitmap.Config config = this.LJIILL;
        boolean z = this.LJJJJJ;
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        C1315790kLR.LIZIZ(c1325700kbQLIZLLL, config, z);
        if (!((HashMap) this.LJJIIZI).isEmpty()) {
            C1315790kLR.LJ(c1325700kbQLIZLLL, this.LJJIIZI);
        } else {
            s sVar = this.LIZ;
            if (sVar != null && (map = sVar.LLJLLIL) != null) {
                C1315790kLR.LJ(c1325700kbQLIZLLL, map);
                return c1325700kbQLIZLLL;
            }
        }
        return c1325700kbQLIZLLL;
    }

    public final boolean LJIILIIL(String str) {
        if (str != null && str.equals(this.LJIJJLI) && str.startsWith("http")) {
            int i = this.LJIL;
            this.LJIL = i - 1;
            if (i > 0) {
                LJJI(str);
                this.LJJII.LIZ();
                this.LJJII.LIZJ();
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIILJJIL(String str) {
        LynxBaseUI lynxBaseUI;
        if (this.LIZ != null && (lynxBaseUI = this.LJJIIZ) != null) {
            this.LIZ.LLIZ.LIZIZ(new C1289960jfm(lynxBaseUI.getSign(), str));
        }
    }

    public final void LJIIZILJ(int i) {
        if (i == 0) {
            this.LJIJ = null;
        } else {
            try {
                this.LJIJ = new C1289600jfC(i, this.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setBlurRadius failed: ");
                sbLIZ.append(th.getMessage());
                LynxLog.e("ImageDelegate", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LJJII.LIZ();
    }

    public final void LJIJ(ReadableMap readableMap) {
        if (!((HashMap) this.LJJIIZI).isEmpty()) {
            ((HashMap) this.LJJIIZI).clear();
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                ((HashMap) this.LJJIIZI).put(strNextKey, readableMap.getString(strNextKey, ""));
            }
        }
    }

    public final void LJIJI(Map<String, C1299120juY> map) {
        this.LJJJIL = false;
        this.LJJJJ = false;
        this.LJJJJI = false;
        if (map.containsKey("startplay")) {
            this.LJJJIL = true;
        }
        if (map.containsKey("currentloopcomplete")) {
            this.LJJJJ = true;
        }
        if (map.containsKey("finalloopcomplete")) {
            this.LJJJJI = true;
        }
        if (map.containsKey("load")) {
            this.LJJJJIZL = true;
        }
    }

    public final void LJIJJ(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("type");
            if ("preview".equalsIgnoreCase(string)) {
                this.LJJJJZ = true;
            } else if ("blur".equalsIgnoreCase(string)) {
                this.LJJJJZI = true;
            } else {
                this.LJJJJZ = false;
                this.LJJJJZI = false;
            }
            if (this.LJJJJZ || this.LJJJJZI) {
                this.LJJJLIIL = Math.round(C1312920kGo.LIZJ(readableMap.getString("width"), this.LIZ.LLJILJILJ.mFontSize, this.LJJIIZ.mFontSize, r2.getWidth(), this.LIZ.LLJILJILJ.getHeight(), this.LIZ.LLJJJ));
                this.LJJJLL = Math.round(C1312920kGo.LIZJ(readableMap.getString("height"), this.LIZ.LLJILJILJ.mFontSize, this.LJJIIZ.mFontSize, r2.getWidth(), this.LIZ.LLJILJILJ.getHeight(), this.LIZ.LLJJJ));
                this.LJJJLZIJ = Math.round(C1312920kGo.LIZJ(readableMap.getString("radius"), this.LIZ.LLJILJILJ.mFontSize, this.LJJIIZ.mFontSize, r2.getWidth(), this.LIZ.LLJILJILJ.getHeight(), this.LIZ.LLJJJ));
                this.LJJJZ = readableMap.getString("hash");
                this.LJJL = readableMap.getString("metaData");
                this.LJJLI = readableMap.getInt("iterations", 1);
            }
        }
    }

    public final void LJIJJLI(String str) {
        C089P c089p = this.LJJI;
        if (c089p != null && c089p.LIZIZ.equals(str)) {
            return;
        }
        this.LJJI = null;
        if (str != null && !str.isEmpty()) {
            C089P c089p2 = new C089P(this.LJJIII, str, 0);
            this.LJJI = c089p2;
            if (Uri.EMPTY.equals(c089p2.LIZIZ())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Warning: Image source \"");
                sbLIZ.append(str);
                sbLIZ.append("\" doesn't exist");
                LynxLog.w("Lynx", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LJJII.LIZ();
    }

    public final void LJJI(String str) {
        C089P c089p = this.LJJ;
        if (c089p != null && c089p.LIZIZ.equals(str)) {
            return;
        }
        this.LJJ = null;
        if (str != null && !str.isEmpty()) {
            C089P c089p2 = new C089P(this.LJJIII, str, 0);
            this.LJJ = c089p2;
            if (Uri.EMPTY.equals(c089p2.LIZIZ())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Warning: Image source \"");
                sbLIZ.append(str);
                sbLIZ.append("\" doesn't exist");
                LynxLog.w("Lynx", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            this.LJJII.clear();
        }
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJJII.LJII();
        this.LJJII.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0kLl] */
    public C1315720kLK(Context context, InterfaceC1315950kLh interfaceC1315950kLh) {
        boolean z;
        boolean z2;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = false;
        this.LJJIJL = false;
        this.LJJIJLIJ = null;
        this.LJJJJL = false;
        this.LJJLIIIJ = false;
        this.LJJLIIIJILLIZJL = false;
        EnumC1300090jw7 enumC1300090jw7 = EnumC1300090jw7.UNDEFINED;
        this.LJJLIIIJLLLLLLLZ = enumC1300090jw7;
        this.LJJLIIJ = enumC1300090jw7;
        this.LJJIII = context;
        this.LJJII = interfaceC1315950kLh;
        s sVarLIZIZ = C1298530jtb.LIZIZ(context);
        this.LIZ = sVarLIZIZ;
        this.LJJLIIIJ = true;
        this.LJJLIL = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class);
        if (sVarLIZIZ != null) {
            this.LJFF = this.LJFF;
            this.LJIJI = false;
            C1310290kCZ c1310290kCZ = sVarLIZIZ.LLLIIII;
            if (c1310290kCZ != null) {
                z = c1310290kCZ.LJI;
            } else {
                z = true;
            }
            this.LJJIJIIJIL = z;
            this.LJJIJIIJI = LynxEnv.inst().enableImageEventReport();
            AbstractC1301590jyX abstractC1301590jyX = sVarLIZIZ.LLLF;
            this.LJJIJLIJ = abstractC1301590jyX;
            if (abstractC1301590jyX != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJJIJIL = z2;
            this.LJJJJL = (LynxEnv.inst().enableImageAsyncRedirect() && (z2 || sVarLIZIZ.LLILZ != null)) || sVarLIZIZ.LJIJ();
        }
        this.LJJLIIIJILLIZJL = LynxEnv.inst().enableImageAsyncRedirectOnCreate();
        this.LJJIJL = LynxEnv.inst().enableImageAsyncLayout();
    }

    public final int LIZ(int i, int i2) {
        Bitmap.Config config = this.LJIILL;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return C1298150jsz.LIZ(i, i2, config);
    }

    public final String LJ(s sVar, String str) {
        if (!this.LJJIJIL) {
            if (this.LJJJJL) {
                return C1294030jmL.LIZ(sVar, str, true);
            }
            return C1294030jmL.LIZ(sVar, str, false);
        }
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("url", str);
            TraceEvent.LIZJ("MediaFetcher.shouldRedirectImageUrl", map);
        }
        String strLIZJ = this.LJJIJLIJ.LIZJ(new C1301600jyY(str, EnumC1299880jvm.LynxResourceTypeImage));
        if (!TraceController.isTracingStarted()) {
            return strLIZJ;
        }
        TraceEvent.LJII("MediaFetcher.shouldRedirectImageUrl");
        return strLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r3 = 1
            r2 = 0
            r5 = r11
            r4 = r10
            if (r5 == 0) goto L15
            r4.LJIJJLI = r5
            boolean r0 = r4.LJJIJIIJIL
            if (r0 == 0) goto L38
            X.0jw7 r1 = r4.LJJLIIIJLLLLLLLZ
            X.0jw7 r0 = X.EnumC1300090jw7.FALSE
            if (r1 != r0) goto L2e
            r4.LJJI(r5)
        L15:
            r7 = 0
        L16:
            r6 = r12
            if (r6 == 0) goto L26
            boolean r0 = r4.LJJIJIIJIL
            if (r0 == 0) goto L2c
            X.0jw7 r1 = r4.LJJLIIJ
            X.0jw7 r0 = X.EnumC1300090jw7.FALSE
            if (r1 != r0) goto L2c
            r4.LJIJJLI(r6)
        L26:
            r9 = 0
        L27:
            if (r7 != 0) goto L3a
            if (r9 != 0) goto L3a
            return
        L2c:
            r9 = 1
            goto L27
        L2e:
            X.0jw7 r0 = X.EnumC1300090jw7.TRUE
            if (r1 == r0) goto L36
            X.0jw7 r0 = X.EnumC1300090jw7.UNDEFINED
            if (r1 != r0) goto L38
        L36:
            r4.LJIL = r3
        L38:
            r7 = 1
            goto L16
        L3a:
            android.content.Context r0 = r4.LJJIII
            j27.s r8 = X.C1298530jtb.LIZIZ(r0)
            boolean r0 = r4.LJJLIIIJ
            if (r0 == 0) goto L63
            r4.LJJLIIIJ = r2
            boolean r0 = r4.LJJLIIIJILLIZJL
            if (r0 == 0) goto L63
            boolean r0 = X.C1289620jfE.LIZIZ()
            if (r0 != 0) goto L63
        L50:
            if (r7 == 0) goto L59
            java.lang.String r0 = r4.LJ(r8, r5)
            r4.LJJI(r0)
        L59:
            if (r9 == 0) goto L62
            java.lang.String r0 = r4.LJ(r8, r6)
            r4.LJIJJLI(r0)
        L62:
            return
        L63:
            boolean r0 = r4.LJJJJL
            if (r0 == 0) goto L50
            j27.s r0 = r4.LIZ
            if (r0 == 0) goto L72
            r1 = 82
            int r0 = r0.LLJLILLLLZIIL
            com.lynx.tasm.featurecount.LynxFeatureCounter.LIZ(r1, r0)
        L72:
            java.util.concurrent.Executor r0 = X.C1301610jyZ.LIZIZ()
            X.0kLZ r3 = new X.0kLZ
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.execute(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315720kLK.LJIL(java.lang.String, java.lang.String):void");
    }

    public final void LJJ(String str, boolean z) {
        if (z) {
            LJIL(str, null);
        } else {
            this.LJIJJLI = str;
            LJJI(str);
        }
    }

    public final void LJJIFFI(int i, int i2) {
        C089P c089p = this.LJJ;
        if (c089p != null && c089p.LIZIZ != null && this.LJIJI && this.LJJIII != null) {
            TraceEvent.LIZLLL("ImageDelegate.tryFetchImageFromLocalCache");
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str = this.LJJ.LIZIZ;
            Context context = this.LJJIII;
            float f = i;
            float f2 = i2;
            C1316330kMJ c1316330kMJ = new C1316330kMJ(this, str, i, i2, jCurrentTimeMillis);
            s sVarLIZIZ = C1298530jtb.LIZIZ(context);
            if (sVarLIZIZ == null) {
                LynxLog.e("ImageUrlRedirectUtils", "load image failed due to no context available");
            } else {
                InterfaceC1294040jmM interfaceC1294040jmM = sVarLIZIZ.LLILLL;
                if (interfaceC1294040jmM != null) {
                    interfaceC1294040jmM.LIZJ(sVarLIZIZ, str, f, f2, c1316330kMJ);
                } else {
                    try {
                        LJIIL();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("localCache image is not CloseableReference and the url is: ");
                        sbLIZ.append(str);
                        LynxLog.w("ImageDelegate", C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c1316330kMJ.LIZ.LJIIL();
                    }
                }
            }
            TraceEvent.LJII("ImageDelegate.tryFetchImageFromLocalCache");
        }
    }

    public final boolean LJJII(int i, int i2) {
        C089P c089p = this.LJJ;
        if (c089p != null && c089p.LIZIZ != null && this.LJIJI && this.LIZ != null) {
            TraceEvent.LIZLLL("ImageDelegate.tryFetchImageFromMediaFetcher");
            System.currentTimeMillis();
            this.LJJIJLIJ.LIZ();
            TraceEvent.LJII("ImageDelegate.tryFetchImageFromMediaFetcher");
            return true;
        }
        return false;
    }

    public final JSONObject LJI(int i, int i2, int i3, int i4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewWidth", i);
            jSONObject.put("viewHeight", i2);
            jSONObject.put("width", i3);
            jSONObject.put("height", i4);
            Bitmap.Config config = this.LJIILL;
            if (config == null) {
                config = LJJLJ;
            }
            jSONObject.put("config", config);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJJIII(String str, String str2, boolean z, boolean z2) {
        EnumC1300090jw7 enumC1300090jw7;
        EnumC1300090jw7 enumC1300090jw72;
        if (!this.LJJIJIIJIL) {
            return;
        }
        if (z || z2) {
            if (!this.LJJIJIL) {
                InterfaceC1301330jy7 interfaceC1301330jy7 = (InterfaceC1301330jy7) C1285920jZG.LIZJ().LIZ(InterfaceC1301330jy7.class);
                if (interfaceC1301330jy7 == null) {
                    LynxLog.e("ImageDelegate", "Unable to update redirect because ILynxResourceService cannot be obtained.");
                    return;
                }
                if (z) {
                    int iIsLocalResource = interfaceC1301330jy7.isLocalResource(str);
                    if (iIsLocalResource == -1) {
                        enumC1300090jw72 = EnumC1300090jw7.UNDEFINED;
                    } else if (iIsLocalResource == 1) {
                        enumC1300090jw72 = EnumC1300090jw7.TRUE;
                    } else if (iIsLocalResource == 0) {
                        enumC1300090jw72 = EnumC1300090jw7.FALSE;
                    } else {
                        enumC1300090jw72 = EnumC1300090jw7.UNDEFINED;
                    }
                    this.LJJLIIIJLLLLLLLZ = enumC1300090jw72;
                }
                if (z2) {
                    int iIsLocalResource2 = interfaceC1301330jy7.isLocalResource(str2);
                    if (iIsLocalResource2 == -1) {
                        enumC1300090jw7 = EnumC1300090jw7.UNDEFINED;
                    } else if (iIsLocalResource2 == 1) {
                        enumC1300090jw7 = EnumC1300090jw7.TRUE;
                    } else if (iIsLocalResource2 == 0) {
                        enumC1300090jw7 = EnumC1300090jw7.FALSE;
                    } else {
                        enumC1300090jw7 = EnumC1300090jw7.UNDEFINED;
                    }
                    this.LJJLIIJ = enumC1300090jw7;
                    return;
                }
                return;
            }
            TraceEvent.LIZLLL("ImageDelegate.isLocalResource");
            if (z) {
                ILynxImageService iLynxImageService = this.LJJLIL;
                if (iLynxImageService != null && iLynxImageService.canParseUrl(str)) {
                    this.LJJLIIIJLLLLLLLZ = EnumC1300090jw7.FALSE;
                } else {
                    this.LJJLIIIJLLLLLLLZ = this.LJJIJLIJ.LIZIZ(str);
                }
            }
            if (z2) {
                ILynxImageService iLynxImageService2 = this.LJJLIL;
                if (iLynxImageService2 != null && iLynxImageService2.canParseUrl(str2)) {
                    this.LJJLIIJ = EnumC1300090jw7.FALSE;
                } else {
                    this.LJJLIIJ = this.LJJIJLIJ.LIZIZ(str2);
                }
            }
            TraceEvent.LJII("ImageDelegate.isLocalResource");
        }
    }

    public final void LJIIIZ(final String str, final boolean z, final long j, long j2, final int i, final JSONObject jSONObject) {
        boolean zEnableImageMemoryReport = LynxEnv.inst().enableImageMemoryReport();
        final s sVarLIZIZ = C1298530jtb.LIZIZ(this.LJJIII);
        if (zEnableImageMemoryReport) {
            LynxBaseUI lynxBaseUI = this.LJJIIZ;
            if (lynxBaseUI != null) {
                lynxBaseUI.getSign();
            }
            if (!TextUtils.isEmpty(str) && j > 0 && j2 > 0) {
                final long j3 = j2 - j;
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final long j4 = jCurrentTimeMillis - j;
                LynxEventReporter.runOnReportThread(new Runnable() { // from class: X.0kMU
                    public final void LIZ() {
                        InterfaceC1316470kMX interfaceC1316470kMX;
                        s sVar = sVarLIZIZ;
                        if (sVar == null || sVar.LJIILJJIL() == null || (interfaceC1316470kMX = (InterfaceC1316470kMX) C1285920jZG.LIZJ().LIZ(InterfaceC1316470kMX.class)) == null) {
                            return;
                        }
                        C1316450kMV c1316450kMV = new C1316450kMV();
                        c1316450kMV.LJI = "image";
                        c1316450kMV.LJIILIIL = str;
                        c1316450kMV.LJII = i;
                        c1316450kMV.LIZIZ = jCurrentTimeMillis;
                        c1316450kMV.LIZ = j3;
                        c1316450kMV.LIZJ = j4;
                        c1316450kMV.LIZLLL = j;
                        c1316450kMV.LJIILJJIL = z ? 1 : 0;
                        s sVar2 = sVarLIZIZ;
                        if (sVar2 != null && sVar2.LJIILJJIL() != null) {
                            c1316450kMV.LJ = sVarLIZIZ.LJIILJJIL().getRenderPhase();
                            String str2 = sVarLIZIZ.LLJJIII;
                            if (TextUtils.isEmpty(str2)) {
                                c1316450kMV.LJFF = "";
                            } else {
                                c1316450kMV.LJFF = str2;
                            }
                        }
                        JSONObject jSONObject2 = jSONObject;
                        if (jSONObject2 != null) {
                            long jOptLong = jSONObject2.optLong("viewWidth");
                            long jOptLong2 = jSONObject.optLong("viewHeight");
                            long jOptLong3 = jSONObject.optLong("width");
                            long jOptLong4 = jSONObject.optLong("height");
                            String strOptString = jSONObject.optString("config");
                            int iOptInt = jSONObject.optInt("isFlattenAnim");
                            c1316450kMV.LJIIIZ = jOptLong2;
                            c1316450kMV.LJIIIIZZ = jOptLong;
                            c1316450kMV.LJIIJ = jOptLong3;
                            c1316450kMV.LJIIJJI = jOptLong4;
                            c1316450kMV.LJIIL = strOptString;
                            c1316450kMV.LJIILL = iOptInt;
                        }
                        interfaceC1316470kMX.reportMemoryUsage(new C1316430kMT(c1316450kMV));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FrescoEventHelper@1f31.monitorReporterV2$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FrescoEventHelper@1f31.monitorReporterV2$1");
                    }
                });
                return;
            }
            return;
        }
        if (!this.LJJIJIIJI || TextUtils.isEmpty(str) || j <= 0 || j2 <= 0) {
            return;
        }
        final long j5 = j2 - j;
        final long jCurrentTimeMillis2 = System.currentTimeMillis();
        final long j6 = jCurrentTimeMillis2 - j;
        C1301610jyZ.LIZIZ().execute(new Runnable() { // from class: X.0kLa
            public final /* synthetic */ boolean LLILZ = false;

            public final void LIZ() {
                JSONObject jSONObjectLIZ = C1316420kMS.LIZ(sVarLIZIZ, str, z, this.LLILZ, j, j5, j6, jCurrentTimeMillis2, i, jSONObject);
                if (jSONObjectLIZ != null) {
                    Iterator<InterfaceC1316340kMK> it2 = C1316310kMH.LIZ.LIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                    InterfaceC1289820jfY interfaceC1289820jfY = (InterfaceC1289820jfY) C1285920jZG.LIZJ().LIZ(InterfaceC1289820jfY.class);
                    if (interfaceC1289820jfY != null) {
                        interfaceC1289820jfY.reportImageStatus("lynx_image_status", jSONObjectLIZ);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FrescoEventHelper@1f31.monitorReporter$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FrescoEventHelper@1f31.monitorReporter$1");
            }
        });
    }

    public final void LJIIJJI(final int i, final int i2, final long j, final long j2, final String str, final boolean z, final boolean z2) {
        final s sVarLIZIZ = C1298530jtb.LIZIZ(this.LJJIII);
        if (this.LJJIJIIJI) {
            C1301610jyZ.LIZIZ().execute(new Runnable() { // from class: X.0kW2
                public final void LIZ() {
                    LynxView lynxViewLJIILJJIL;
                    InterfaceC1289820jfY interfaceC1289820jfY;
                    s sVar = sVarLIZIZ;
                    if (sVar == null || (lynxViewLJIILJJIL = sVar.LJIILJJIL()) == null || (interfaceC1289820jfY = (InterfaceC1289820jfY) C1285920jZG.LIZJ().LIZ(InterfaceC1289820jfY.class)) == null) {
                        return;
                    }
                    C1322380kW4 c1322380kW4 = new C1322380kW4();
                    c1322380kW4.LIZ = j;
                    c1322380kW4.LIZIZ = j2;
                    c1322380kW4.LIZJ = z;
                    c1322380kW4.LIZLLL = str;
                    c1322380kW4.LJ = i2;
                    c1322380kW4.LJFF = i;
                    c1322380kW4.LJI = lynxViewLJIILJJIL;
                    c1322380kW4.LJII = z2;
                    interfaceC1289820jfY.reportImageInfo(new C1322370kW3(c1322380kW4));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FrescoEventHelper@1f31.reportImageInfo$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FrescoEventHelper@1f31.reportImageInfo$1");
                }
            });
        }
    }

    public final void LJIILLIIL(int i, int i2, int i3, int i4, long j, long j2, int i5) {
        LynxBaseUI lynxBaseUI;
        if (this.LJJJJIZL && this.LIZ != null && (lynxBaseUI = this.LJJIIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(lynxBaseUI.getSign(), "load");
            int iLIZ = LIZ(i3, i4);
            c1289960jfm.LIZIZ(this.LJIJJLI, "src");
            c1289960jfm.LIZIZ(Long.valueOf(j), "load_start");
            c1289960jfm.LIZIZ(Long.valueOf(j2), "load_finish");
            c1289960jfm.LIZIZ(Long.valueOf(j2 - j), "cost");
            c1289960jfm.LIZIZ(Integer.valueOf(i3), "width");
            c1289960jfm.LIZIZ(Integer.valueOf(i4), "height");
            c1289960jfm.LIZIZ(Integer.valueOf(iLIZ), "memory_cost");
            c1289960jfm.LIZIZ(Integer.valueOf(i5), "origin");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "view_width");
            c1289960jfm.LIZIZ(Integer.valueOf(i2), "view_height");
            this.LIZ.LLIZ.LIZIZ(c1289960jfm);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(int r30, int r31, X.InterfaceC1330440kj4 r32, android.graphics.drawable.Animatable r33, long r34, boolean r36, int r37, X.C1315960kLi r38) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315720kLK.LJII(int, int, X.0kj4, android.graphics.drawable.Animatable, long, boolean, int, X.0kLi):void");
    }

    public final void LJIILL(boolean z, int i, long j, long j2, int i2, int i3, int i4, int i5) {
        String str;
        Object obj;
        String str2;
        if (this.LJJJJIZL && this.LIZ != null && this.LJJIIZ != null) {
            int iLIZ = LIZ(i3, i4);
            long j3 = j2 - j;
            if (this.LJJ != null && (str2 = this.LJIJJLI) != null) {
                if (str2.startsWith("data")) {
                    str = "base64";
                } else if (this.LJIJJLI.startsWith("http") && this.LJJ.LIZIZ.equals(this.LJIJJLI)) {
                    str = "cdn";
                } else {
                    str = "local resource";
                }
            } else {
                str = "";
            }
            JSONObject jSONObjectLIZ = C1316420kMS.LIZ(this.LIZ, this.LJIJJLI, true, z, j, j3, j3, j2, iLIZ, LJI(i, i2, i3, i4));
            if (jSONObjectLIZ != null) {
                C1289960jfm c1289960jfm = new C1289960jfm(this.LJJIIZ.getSign(), "load");
                Iterator<String> itKeys = jSONObjectLIZ.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        obj = jSONObjectLIZ.get(next);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    }
                    c1289960jfm.LIZIZ(obj, next);
                }
                c1289960jfm.LIZIZ(str, "resourceFrom");
                c1289960jfm.LIZIZ(Integer.valueOf(i3), "width");
                c1289960jfm.LIZIZ(Integer.valueOf(i4), "height");
                c1289960jfm.LIZIZ(Integer.valueOf(i5), "origin");
                this.LIZ.LLIZ.LIZIZ(c1289960jfm);
            }
        }
    }

    public final C1316290kMF LIZIZ(C089P c089p, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final float[] fArr, final InterfaceC1320380kSq interfaceC1320380kSq) throws Throwable {
        char c;
        int i7;
        boolean z;
        ILynxImageService iLynxImageService;
        ILynxImageService iLynxImageService2;
        ILynxImageService iLynxImageService3;
        Uri uriLIZIZ;
        String scheme;
        ILynxImageService iLynxImageService4;
        String[] strArr;
        Object[] objArr;
        InterfaceC1291910jiv interfaceC1291910jiv;
        ILynxImageService iLynxImageService5;
        C1324630kZh c1324630kZh = null;
        if (c089p == null) {
            return null;
        }
        TraceEvent.LIZLLL("ImageDelegate.createImageRequest");
        C1325700kbQ c1325700kbQLJ = this.LJJII.LJ(c089p.LIZIZ());
        c1325700kbQLJ.getClass();
        c1325700kbQLJ.LJ = C1324670kZl.LIZJ;
        c1325700kbQLJ.LJII = this.LJIILJJIL;
        if (!this.LJFF && !this.LJJJJLI && !this.LJJLIIIJL && this.LJJLIIIJJIZ == null) {
            if (C1316170kM3.LIZ(c089p, this.LJIIZILJ) && !this.LJIIL) {
                int i8 = this.LIZIZ;
                int i9 = this.LIZJ;
                c1324630kZh = (i8 <= 0 || i9 <= 0 || Math.abs(i - i8) > 1 || Math.abs(i2 - i9) > 1) ? new C1324630kZh(i, i2) : new C1324630kZh(i8, i9);
            }
            c1325700kbQLJ.LIZJ = c1324630kZh;
        }
        if (this.LJJIJ) {
            c1325700kbQLJ.LJIIL = EnumC1331380kka.HIGH;
        }
        boolean zLJI = this.LJJII.LJI();
        final LinkedList linkedList = new LinkedList();
        if (this.LJJJJLI && (iLynxImageService5 = this.LJJLIL) != null) {
            linkedList.add(iLynxImageService5.getImageSRPostProcessor());
            float f = this.LJJJJLL;
            if (f > 0.0f) {
                this.LJJLIL.setImageSRSize(c1325700kbQLJ, (int) (i * f), (int) (i2 * f));
            }
        }
        if (zLJI && i > 0 && i2 > 0 && !this.LJJIIJZLJL) {
            final String string = c089p.LIZIZ().toString();
            final String str = this.LJI;
            final String str2 = this.LJII;
            final Bitmap.Config config = this.LJIILL;
            final boolean z2 = this.LJIIJ;
            linkedList.add(new C1315900kLc(string, i, i2, i3, i4, i5, i6, fArr, interfaceC1320380kSq, str, str2, config, z2) { // from class: X.0kLb
                public final String LIZ;

                @Override // X.C1315900kLc, X.AbstractC1291220jho, X.InterfaceC1291910jiv
                public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
                    ConcurrentHashMap<String, C1316270kMD> concurrentHashMap = C1315720kLK.LJJLJLI;
                    if (!concurrentHashMap.containsKey(this.LIZ)) {
                        concurrentHashMap.put(this.LIZ, new C1316270kMD(bitmap.getWidth(), bitmap.getHeight()));
                    }
                    return super.process(bitmap, abstractC1301670jyf);
                }

                {
                    super(string, i, i2, i3, i4, i5, i6, fArr, interfaceC1320380kSq, str, str2, config, z2);
                    this.LIZ = string;
                }
            });
        }
        C1289600jfC c1289600jfC = this.LJIJ;
        if (c1289600jfC != null) {
            linkedList.add(c1289600jfC);
        }
        this.LJJII.LIZLLL(linkedList);
        int size = linkedList.size();
        if (size != 0) {
            i7 = 1;
            if (size != 1) {
                interfaceC1291910jiv = new InterfaceC1291910jiv(linkedList) { // from class: X.0jiu
                    public final List<InterfaceC1291910jiv> LIZ;

                    @Override // X.InterfaceC1291910jiv
                    public final String getName() {
                        StringBuilder sb = new StringBuilder();
                        for (InterfaceC1291910jiv interfaceC1291910jiv2 : this.LIZ) {
                            if (sb.length() > 0) {
                                sb.append(",");
                            }
                            sb.append(interfaceC1291910jiv2.getName());
                        }
                        sb.insert(0, "MultiPostProcessor (");
                        sb.append(")");
                        return sb.toString();
                    }

                    @Override // X.InterfaceC1291910jiv
                    public final InterfaceC1324680kZm getPostprocessorCacheKey() {
                        LinkedList linkedList2 = new LinkedList();
                        Iterator<InterfaceC1291910jiv> it2 = this.LIZ.iterator();
                        while (it2.hasNext()) {
                            linkedList2.push(it2.next().getPostprocessorCacheKey());
                        }
                        return new C1296510jqL(linkedList2);
                    }

                    {
                        this.LIZ = new LinkedList(linkedList);
                    }

                    @Override // X.InterfaceC1291910jiv
                    public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
                        Bitmap bitmap2;
                        C1323050kX9<Bitmap> c1323050kX9Process = null;
                        try {
                            C1323050kX9 c1323050kX9LJFF = null;
                            for (InterfaceC1291910jiv interfaceC1291910jiv2 : this.LIZ) {
                                if (c1323050kX9LJFF != null) {
                                    bitmap2 = (Bitmap) c1323050kX9LJFF.get();
                                } else {
                                    bitmap2 = bitmap;
                                }
                                c1323050kX9Process = interfaceC1291910jiv2.process(bitmap2, abstractC1301670jyf);
                                C1323050kX9.LJII(c1323050kX9LJFF);
                                c1323050kX9LJFF = C1323050kX9.LJFF(c1323050kX9Process);
                            }
                            C1323050kX9<Bitmap> c1323050kX9LJFF2 = C1323050kX9.LJFF(c1323050kX9Process);
                            C1323050kX9.LJII(c1323050kX9Process);
                            return c1323050kX9LJFF2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1323050kX9.LJII(c1323050kX9Process);
                            throw th;
                        }
                    }
                };
                c = 0;
            } else {
                c = 0;
                interfaceC1291910jiv = (InterfaceC1291910jiv) ListProtector.get(linkedList, 0);
                if (interfaceC1291910jiv != null) {
                }
            }
            C089P c089p2 = this.LJJ;
            if (c089p2 != null) {
                String lowerCase = c089p2.LIZIZ().toString().toLowerCase();
                if (!lowerCase.endsWith(".gif") && !lowerCase.endsWith(".apng")) {
                    c1325700kbQLJ.LJIILIIL = interfaceC1291910jiv;
                }
            }
        } else {
            c = 0;
            i7 = 1;
        }
        if (!TextUtils.isEmpty(this.LJIIIIZZ)) {
            if ("high".equalsIgnoreCase(this.LJIIIIZZ)) {
                c1325700kbQLJ.LJIIL = EnumC1331380kka.HIGH;
            } else if ("low".equalsIgnoreCase(this.LJIIIIZZ)) {
                c1325700kbQLJ.LJIIL = EnumC1331380kka.LOW;
            } else {
                c1325700kbQLJ.LJIIL = EnumC1331380kka.MEDIUM;
            }
        }
        boolean z3 = this.LJJLIIIJJI;
        if (z3) {
            Method method = C1315790kLR.LIZLLL;
            if (method != null) {
                try {
                    objArr = new Object[i7];
                    objArr[c] = Boolean.valueOf(z3);
                    strArr = null;
                } catch (IllegalAccessException e) {
                    e = e;
                    strArr = null;
                } catch (InvocationTargetException e2) {
                    e = e2;
                    strArr = null;
                }
                try {
                    C2204961BRm.a0(method, c1325700kbQLJ, objArr, new C0WZX("dzBzEg4jUdKSQVYySFyRb1ZfUZ4WkTRiNcNLPQz5e3Pvxz6WbaRX2H6OOs8x5dJHhMg=", null));
                } catch (IllegalAccessException e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    LynxLog.e("Fresco", Log.getStackTraceString(e));
                } catch (InvocationTargetException e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                    LynxLog.e("Fresco", Log.getStackTraceString(e));
                }
            } else {
                strArr = null;
            }
            boolean z4 = this.LJJLIIIJJI;
            c1325700kbQLJ.LJII = z4;
            Method method2 = C1315790kLR.LJ;
            if (method2 != null) {
                try {
                    Object[] objArr2 = new Object[i7];
                    objArr2[c] = Boolean.valueOf(z4);
                    C2204961BRm.a0(method2, c1325700kbQLJ, objArr2, new C0WZX("dzBzEg4jUdKSQVYySFyRb1ZfUZ4WkTRiNcNLPQz5e3Pvxz6WbaRX2H6OOs8x5dJHhMg=", strArr));
                } catch (IllegalAccessException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    LynxLog.e("Fresco", Log.getStackTraceString(e5));
                } catch (InvocationTargetException e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    LynxLog.e("Fresco", Log.getStackTraceString(e6));
                }
            }
        }
        if (!TextUtils.isEmpty(this.LJIIIZ) && (iLynxImageService4 = this.LJJLIL) != null) {
            iLynxImageService4.setImageCacheChoice(this.LJIIIZ, c1325700kbQLJ);
        }
        if (this.LJIIJJI && this.LJJLIL != null && (scheme = (uriLIZIZ = c089p.LIZIZ()).getScheme()) != null && scheme.startsWith("http")) {
            String path = uriLIZIZ.getPath();
            if (!TextUtils.isEmpty(path)) {
                this.LJJLIL.setCacheKeyUri(c1325700kbQLJ, UriProtector.parse(path));
            }
        }
        if (this.LJJLIIIJL && (iLynxImageService3 = this.LJJLIL) != null) {
            iLynxImageService3.setSampleSize(c1325700kbQLJ, i7);
        }
        Rect rect = this.LJJLIIIJJIZ;
        if (rect != null && (iLynxImageService2 = this.LJJLIL) != null) {
            iLynxImageService2.setImageDecodeRegion(c1325700kbQLJ, rect);
        }
        C1316290kMF c1316290kMF = new C1316290kMF(c1325700kbQLJ, this.LJJIIJ);
        if (!TextUtils.isEmpty(this.LJJJZ) && (((z = this.LJJJJZ) || this.LJJJJZI) && (iLynxImageService = this.LJJLIL) != null)) {
            iLynxImageService.setImagePlaceHolderHash(this.LJJLIIIIJ, c1316290kMF, interfaceC1320380kSq, this.LJJJZ, this.LJJL, this.LJJJLIIL, this.LJJJLL, this.LJJJLZIJ, this.LJJLI, z);
        }
        TraceEvent.LJII("ImageDelegate.createImageRequest");
        return c1316290kMF;
    }

    public final C1325710kbR LIZJ(C089P c089p, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC1320380kSq interfaceC1320380kSq) {
        C1316290kMF c1316290kMFLIZIZ;
        try {
            c1316290kMFLIZIZ = LIZIZ(c089p, i, i2, i3, i4, i5, i6, fArr, interfaceC1320380kSq);
            if (c1316290kMFLIZIZ != null) {
                try {
                    if (C1326230kcH.LJIILL(c1316290kMFLIZIZ.LIZIZ.getHost())) {
                        return C1326230kcH.LIZIZ(c1316290kMFLIZIZ);
                    }
                    if (C1326230kcH.LJIILJJIL(c1316290kMFLIZIZ.LIZIZ)) {
                        return C1326230kcH.LIZIZ(c1316290kMFLIZIZ);
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c1316290kMFLIZIZ = null;
        }
        return c1316290kMFLIZIZ;
    }

    public final void LJIIJ(String str, int i, boolean z, int i2, long j, long j2, boolean z2, int i3, int i4) {
        if (this.LJJIJIIJI && str.startsWith("http")) {
            s sVarLIZIZ = C1298530jtb.LIZIZ(this.LJJIII);
            Map<String, String> map = this.LJJIIZI;
            if (sVarLIZIZ != null) {
                try {
                    HashMap map2 = new HashMap();
                    map2.put("load_start", Long.valueOf(j));
                    map2.put("load_finish", Long.valueOf(j2));
                    map2.put("cost", Long.valueOf(j2 - j));
                    map2.put("src", str);
                    map2.put("memory", Boolean.valueOf(z));
                    map2.put("origin", Integer.valueOf(i2));
                    map2.put("error_code", Integer.valueOf(i));
                    map2.put("flatten", Boolean.valueOf(z2));
                    map2.put("width", Integer.valueOf(i3));
                    map2.put("height", Integer.valueOf(i4));
                    if (map != null) {
                        map2.putAll(map);
                    }
                    LynxEventReporter.onEvent("lynxsdk_image_event", map2, sVarLIZIZ.LLJLILLLLZIIL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reportImageEvent got exception:");
                    sbLIZ.append(e);
                    LynxLog.e("FrescoEventHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }
}
