package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS7S0102000_20;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.image.AutoSizeImage;
import com.lynx.tasm.utils.BlurUtils;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1315680kLG implements Drawable.Callback {
    public long LL;
    public final s LLILLJJLI;
    public final C1316190kM5 LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public C1315920kLe LLJI;
    public C1315920kLe LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public String LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public Bitmap.Config LLJJIJI;
    public String LLJJIJIL;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public C1315700kLI LLJLL;
    public C1315700kLI LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public float LLL;
    public float[] LLLF;
    public int LLLFFI;
    public int LLLFZ;
    public boolean LLLII;
    public LynxBaseUI LLLIIII;
    public C1313210kHH LLLIIIIL;
    public final boolean LLLIIL;
    public final C1301580jyW LLLIILIL;
    public final boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public EnumC1300090jw7 LLLL;
    public EnumC1300090jw7 LLLLII;
    public ColorFilter LLLLIIIILLL;
    public C1315700kLI LLLLIIL;
    public C1312750kGX LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public final Map<String, String> LLLLJ;
    public boolean LLLLJI;
    public float LLLLL;
    public boolean LLLLLIL;
    public Rect LLLLLILLIL;
    public final C1316590kMj LLLLLJIL;
    public final C1315940kLg LLLLLJLJLL;
    public final C1316300kMG LLLLLL;
    public AbstractC1316100kLw LLJILLL = InterfaceC1316000kLm.LIZ;
    public boolean LLJJIJIIJIL = true;
    public boolean LLJJJ = true;
    public RectF LLLFF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    public ShadowNode LLLI = null;
    public View LLLIIIL = null;
    public int LLLJIL = -1;
    public int LLLJL = -1;

    public final void LIZJ() {
        LJIILJJIL(this.LLJLL);
        LJIILJJIL(this.LLJLLIL);
        LJIILIIL(this.LLJI);
        LJIILIIL(this.LLJIJIL);
        this.LLJLL = null;
        this.LLJLLIL = null;
        C1315920kLe c1315920kLe = this.LLJI;
        if (c1315920kLe != null) {
            c1315920kLe.LIZIZ();
            this.LLJI = null;
        }
        C1315920kLe c1315920kLe2 = this.LLJIJIL;
        if (c1315920kLe2 != null) {
            c1315920kLe2.LIZIZ();
            this.LLJIJIL = null;
        }
    }

    public final Boolean LIZLLL() {
        return Boolean.valueOf((this.LLJI == null && this.LLJIJIL == null) ? false : true);
    }

    public void LJ() {
        View view;
        LynxBaseUI lynxBaseUI = this.LLLIIII;
        if (lynxBaseUI != null) {
            lynxBaseUI.invalidateMeaningfulPaintingArea();
        }
        C1313210kHH c1313210kHH = this.LLLIIIIL;
        if (c1313210kHH != null) {
            KeyEvent.Callback callback = c1313210kHH.LLILLJJLI;
            if (callback instanceof InterfaceC1314610kJX) {
                ((InterfaceC1314610kJX) callback).invalidateMeaningfulPaintingArea();
            }
        }
        if (C1289620jfE.LIZIZ()) {
            LynxBaseUI lynxBaseUI2 = this.LLLIIII;
            if (lynxBaseUI2 != null) {
                lynxBaseUI2.invalidate();
            }
            C1313210kHH c1313210kHH2 = this.LLLIIIIL;
            if (c1313210kHH2 != null && (view = c1313210kHH2.LLILLJJLI) != null) {
                view.invalidate();
            }
            View view2 = this.LLLIIIL;
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    public final void LJI() {
        LynxBaseUI lynxBaseUI;
        if (this.LLLFFI == 0 || this.LLLFZ == 0 || !this.LLJJI || (lynxBaseUI = this.LLLIIII) == null) {
            return;
        }
        if (this.LLLI == null) {
            this.LLLI = lynxBaseUI.mContext.LJFF(lynxBaseUI.getSign());
        }
        ShadowNode shadowNode = this.LLLI;
        if (shadowNode instanceof AutoSizeImage) {
            ((AutoSizeImage) shadowNode).LJJIIJ(this.LLLFFI, this.LLLFZ, this.LLLIIII.getWidth(), this.LLLIIII.getHeight(), this.LLJJI);
        } else {
            this.LLLII = true;
        }
    }

    public final void LJJ() {
        int i;
        C1315700kLI c1315700kLILIZIZ;
        C1315920kLe c1315920kLe;
        C1315920kLe c1315920kLe2;
        if (LJFF(2048L) && ((this.LLJLILLLLZIIL || this.LLJJI || this.LLIZLLLIL) && this.LLJLL != null)) {
            this.LL &= -2049;
        }
        if (LJFF(16L) && this.LLJI != null) {
            this.LLJI = new C1315920kLe(this.LLJI.LJFF, this.LLJILLL);
        }
        if (LJFF(8L) && (c1315920kLe2 = this.LLJI) != null) {
            String str = this.LLJILJIL;
            String str2 = this.LLJILJILJ;
            c1315920kLe2.LJI = str;
            c1315920kLe2.LJII = str2;
        }
        if (LJFF(128L) && (c1315920kLe = this.LLJI) != null) {
            c1315920kLe.setColorFilter(this.LLLLIIIILLL);
        }
        if (LJFF(4L)) {
            LJIILJJIL(this.LLJLLIL);
            LJIILIIL(this.LLJIJIL);
            C1315920kLe c1315920kLe3 = this.LLJIJIL;
            if (c1315920kLe3 != null) {
                c1315920kLe3.LIZIZ();
                this.LLJIJIL = null;
            }
            this.LLJLLIL = null;
            if (TraceController.isTracingStarted()) {
                TraceEvent.LIZLLL("LynxImageManager.updatePlaceholderSource");
            }
            int i2 = this.LLJJL;
            if (((i2 > 0 && (i = this.LLJJLIIIJLLLLLLLZ) > 0) || ((i2 = this.LLJL) > 0 && (i = this.LLJLIL) > 0)) && this.LLJI == null && (c1315700kLILIZIZ = LIZIZ(i2, i, this.LLILZIL)) != null) {
                this.LLJLLIL = c1315700kLILIZIZ;
                C1316190kM5 c1316190kM5 = this.LLILLL;
                C1315940kLg c1315940kLg = this.LLLLLJLJLL;
                s sVar = this.LLILLJJLI;
                c1316190kM5.getClass();
                TraceEvent.LIZLLL("LynxImageServiceProxy.fetchImage");
                if (c1316190kM5.LIZIZ) {
                    throw null;
                }
                c1316190kM5.LIZ.fetchImage(c1315700kLILIZIZ, c1315940kLg, null, sVar);
                TraceEvent.LJII("LynxImageServiceProxy.fetchImage");
            }
            TraceEvent.LJII("LynxImageManager.updatePlaceholderSource");
        }
        if (LJFF(2L) || LJFF(32L) || LJFF(2048L) || LJFF(8192L)) {
            if (this.LLIZ) {
                this.LLLLIIL = this.LLJLL;
            } else {
                LJIILJJIL(this.LLJLL);
                LJIILIIL(this.LLJI);
                C1315920kLe c1315920kLe4 = this.LLJI;
                if (c1315920kLe4 != null) {
                    c1315920kLe4.LIZIZ();
                    this.LLJI = null;
                }
                this.LLJLL = null;
                this.LLLFFI = 0;
                this.LLLFZ = 0;
            }
            if (TraceController.isTracingStarted()) {
                TraceEvent.LIZLLL("LynxImageManager.updateImageSource");
            }
            int i3 = this.LLJJL;
            if ((i3 <= 0 || (i = this.LLJJLIIIJLLLLLLLZ) <= 0) && ((i3 = this.LLJL) <= 0 || (i = this.LLJLIL) <= 0)) {
                if (this.LLJJI) {
                    i3 = 0;
                    int i4 = 0;
                    LynxEnv.runJavaTaskOnConcurrentLoop(new ARunnableS7S0102000_20(i3, this, i4, 8), 0);
                }
                TraceEvent.LJII("LynxImageManager.updateImageSource");
            } else {
                LynxEnv.runJavaTaskOnConcurrentLoop(new ARunnableS7S0102000_20(i3, this, i4, 8), 0);
                TraceEvent.LJII("LynxImageManager.updateImageSource");
            }
        }
        if (LJFF(512L) || LJFF(1024L) || LJFF(4096L)) {
            LIZ(this.LLJI);
            LIZ(this.LLJIJIL);
            float[] fArr = this.LLLF;
            if (fArr != null && fArr.length > 0) {
                if (this.LLLLIILL == null) {
                    this.LLLLIILL = new C1312750kGX();
                }
                this.LLLLIILL.LIZLLL(new Rect(this.LLJJJIL, this.LLJJJJ, this.LLJJL - this.LLJJJJJIL, this.LLJJLIIIJLLLLLLLZ - this.LLJJJJLIIL), this.LLLF, this.LLLFF, 1.0f, false);
            }
        }
        if (this.LLLII) {
            this.LLLII = false;
            if (this.LLJJI) {
                LJI();
            }
        }
        this.LL = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI() {
        /*
            r6 = this;
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r6.LLLIL
            if (r0 != 0) goto La
            return
        La:
            r0 = 2
            boolean r2 = r6.LJFF(r0)
            r0 = 4
            boolean r3 = r6.LJFF(r0)
            r4 = 0
            if (r2 == 0) goto Lc3
            X.0kM5 r2 = r6.LLILLL
            java.lang.String r1 = r6.LLILZ
            boolean r0 = r2.LIZIZ
            if (r0 != 0) goto Lb7
            com.lynx.tasm.service.ILynxImageService r0 = r2.LIZ
            boolean r0 = r0.canParseUrl(r1)
            if (r0 == 0) goto Lb7
            X.0jw7 r0 = X.EnumC1300090jw7.FALSE
            r6.LLLL = r0
        L2d:
            X.0jw7 r1 = r6.LLLL
            X.0jw7 r0 = X.EnumC1300090jw7.FALSE
            if (r1 == r0) goto Lc3
            X.0jyY r5 = new X.0jyY
            java.lang.String r1 = r6.LLILZ
            X.0jvm r0 = X.EnumC1299880jvm.LynxResourceTypeImage
            r5.<init>(r1, r0)
        L3c:
            if (r3 == 0) goto L61
            X.0kM5 r2 = r6.LLILLL
            java.lang.String r1 = r6.LLILZIL
            boolean r0 = r2.LIZIZ
            if (r0 != 0) goto Lac
            com.lynx.tasm.service.ILynxImageService r0 = r2.LIZ
            boolean r0 = r0.canParseUrl(r1)
            if (r0 == 0) goto Lac
            X.0jw7 r0 = X.EnumC1300090jw7.FALSE
            r6.LLLLII = r0
        L52:
            X.0jw7 r1 = r6.LLLLII
            X.0jw7 r0 = X.EnumC1300090jw7.FALSE
            if (r1 == r0) goto L61
            X.0jyY r4 = new X.0jyY
            java.lang.String r1 = r6.LLILZIL
            X.0jvm r0 = X.EnumC1299880jvm.LynxResourceTypeImage
            r4.<init>(r1, r0)
        L61:
            java.lang.Thread r1 = X.C786410Ut5.u3()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            if (r1 != r0) goto L97
            boolean r0 = r6.LLLIIL
            if (r0 == 0) goto L97
            if (r5 != 0) goto L8d
            if (r4 == 0) goto L8c
        L77:
            long r2 = r6.LL
            r0 = -5
            long r2 = r2 & r0
            r6.LL = r2
        L7e:
            java.util.concurrent.Executor r2 = X.C1301610jyZ.LIZIZ()
            Y.ARunnableS53S0300000_20 r1 = new Y.ARunnableS53S0300000_20
            r0 = 58
            r1.<init>(r6, r4, r5, r0)
            r2.execute(r1)
        L8c:
            return
        L8d:
            long r2 = r6.LL
            r0 = -3
            long r2 = r2 & r0
            r6.LL = r2
            if (r4 == 0) goto L7e
            goto L77
        L97:
            if (r5 == 0) goto La1
            X.0jyW r0 = r6.LLLIILIL
            java.lang.String r0 = r0.LIZJ(r5)
            r6.LLILZ = r0
        La1:
            if (r4 == 0) goto L8c
            X.0jyW r0 = r6.LLLIILIL
            java.lang.String r0 = r0.LIZJ(r4)
            r6.LLILZIL = r0
            return
        Lac:
            X.0jyW r1 = r6.LLLIILIL
            java.lang.String r0 = r6.LLILZIL
            X.0jw7 r0 = r1.LIZIZ(r0)
            r6.LLLLII = r0
            goto L52
        Lb7:
            X.0jyW r1 = r6.LLLIILIL
            java.lang.String r0 = r6.LLILZ
            X.0jw7 r0 = r1.LIZIZ(r0)
            r6.LLLL = r0
            goto L2d
        Lc3:
            r5 = r4
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315680kLG.LJJIFFI():void");
    }

    public final void LJIIJJI() {
        LJJ();
        LJ();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0kLg] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0jyW] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0kLH] */
    public C1315680kLG(final s sVar) {
        this.LLLIL = false;
        EnumC1300090jw7 enumC1300090jw7 = EnumC1300090jw7.UNDEFINED;
        this.LLLL = enumC1300090jw7;
        this.LLLLII = enumC1300090jw7;
        this.LLLLIIIILLL = null;
        this.LLLLIIL = null;
        this.LLLLIILLL = false;
        this.LLLLIL = false;
        this.LLLLILI = false;
        this.LLLLJ = new HashMap();
        this.LLLLJI = false;
        this.LLLLL = 0.0f;
        this.LLLLLIL = false;
        this.LLLLLJIL = new C1316590kMj(new InterfaceC1316540kMe() { // from class: X.0kLH
            @Override // X.InterfaceC1316540kMe
            public final void LIZIZ(JSONObject jSONObject) {
                int sign;
                Object obj;
                C1315680kLG c1315680kLG = this.LIZ;
                if (c1315680kLG.LLLLJI) {
                    LynxBaseUI lynxBaseUI = c1315680kLG.LLLIIII;
                    if (lynxBaseUI != null) {
                        sign = lynxBaseUI.getSign();
                    } else {
                        sign = c1315680kLG.LLLJL;
                    }
                    if (c1315680kLG.LLILLJJLI != null && sign >= 0 && c1315680kLG.LLLLJI && jSONObject != null) {
                        C1289960jfm c1289960jfm = new C1289960jfm(sign, "load");
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            try {
                                obj = jSONObject.get(next);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                                LynxLog.e("LynxImageManager", e.getMessage());
                                obj = null;
                            }
                            c1289960jfm.LIZIZ(obj, next);
                        }
                        int i = c1315680kLG.LLLFFI;
                        int i2 = c1315680kLG.LLLFZ;
                        Bitmap.Config config = c1315680kLG.LLJJIJI;
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        int iLIZ = C1298150jsz.LIZ(i, i2, config);
                        c1289960jfm.LIZIZ(c1315680kLG.LLILZ, "src");
                        c1289960jfm.LIZIZ(Integer.valueOf(c1315680kLG.LLLFFI), "width");
                        c1289960jfm.LIZIZ(Integer.valueOf(c1315680kLG.LLLFZ), "height");
                        c1289960jfm.LIZIZ(Integer.valueOf(c1315680kLG.LLJJL), "view_width");
                        c1289960jfm.LIZIZ(Integer.valueOf(c1315680kLG.LLJJLIIIJLLLLLLLZ), "view_height");
                        c1289960jfm.LIZIZ(Integer.valueOf(iLIZ), "memoryCost");
                        c1315680kLG.LLILLJJLI.LLIZ.LIZIZ(c1289960jfm);
                    }
                }
            }

            @Override // X.InterfaceC1316540kMe
            public final void LIZJ(int i, Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailed src:");
                sbLIZ.append(this.LIZ.LLILZ);
                sbLIZ.append(",with reason:");
                sbLIZ.append(th.getMessage());
                LynxLog.e("LynxImageManager", C2188811AlT.LIZIZ(sbLIZ));
                int iLIZIZ = C846560XIw.LIZIZ(i);
                String message = th.getMessage();
                if (TextUtils.isEmpty(message) && (message = Log.getStackTraceString(th)) != null && message.length() > 200) {
                    message = message.substring(0, 200);
                }
                LynxError lynxError = new LynxError(iLIZIZ, "Android LynxImageManager loading image failed", "", "error");
                lynxError.LJIIIIZZ(message);
                this.LIZ.LJIIIIZZ(lynxError, iLIZIZ, i);
            }

            @Override // X.InterfaceC1316540kMe
            public final void LIZ(C1315930kLf c1315930kLf, C1315700kLI c1315700kLI, C1316350kML c1316350kML) {
                String str;
                String str2 = c1315700kLI.LIZ;
                C1315700kLI c1315700kLI2 = this.LIZ.LLJLL;
                if (c1315700kLI2 != null) {
                    str = c1315700kLI2.LIZ;
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str2, str)) {
                    return;
                }
                if (c1315930kLf != null) {
                    if (this.LIZ.LLLLIILLL) {
                        if (c1315930kLf.LIZLLL) {
                            c1315930kLf.LJIIIZ.setFilterBitmap(false);
                        } else {
                            c1315930kLf.LIZJ.setFilterBitmap(false);
                        }
                    }
                    if (c1316350kML.LIZJ) {
                        C1315680kLG c1315680kLG = this.LIZ;
                        if (!c1315930kLf.LIZLLL) {
                            c1315930kLf.LIZJ.setCallback(c1315680kLG);
                        }
                    }
                }
                C1315680kLG c1315680kLG2 = this.LIZ;
                if (c1315680kLG2.LLIZ) {
                    c1315680kLG2.LJIILJJIL(c1315680kLG2.LLLLIIL);
                    C1315680kLG c1315680kLG3 = this.LIZ;
                    c1315680kLG3.LJIILIIL(c1315680kLG3.LLJI);
                    C1315680kLG c1315680kLG4 = this.LIZ;
                    c1315680kLG4.LLLLIIL = null;
                    C1315920kLe c1315920kLe = c1315680kLG4.LLJI;
                    if (c1315920kLe != null) {
                        c1315920kLe.LIZIZ();
                        this.LIZ.LLJI = null;
                    }
                }
                this.LIZ.LLJI = new C1315920kLe(c1315930kLf, this.LIZ.LLJILLL);
                if (!TextUtils.isEmpty(this.LIZ.LLJILJIL)) {
                    C1315680kLG c1315680kLG5 = this.LIZ;
                    C1315920kLe c1315920kLe2 = c1315680kLG5.LLJI;
                    String str3 = c1315680kLG5.LLJILJIL;
                    String str4 = c1315680kLG5.LLJILJILJ;
                    c1315920kLe2.LJI = str3;
                    c1315920kLe2.LJII = str4;
                }
                C1315680kLG c1315680kLG6 = this.LIZ;
                int i = c1316350kML.LIZ;
                c1315680kLG6.LLLFFI = i;
                int i2 = c1316350kML.LIZIZ;
                c1315680kLG6.LLLFZ = i2;
                InterfaceC1299990jvx interfaceC1299990jvx = c1315680kLG6.LLILLJJLI.LLJJL;
                if (interfaceC1299990jvx != null) {
                    interfaceC1299990jvx.LJIIJ(i, i2, c1315700kLI.LIZ);
                }
                this.LIZ.LJI();
                C1315680kLG c1315680kLG7 = this.LIZ;
                ColorFilter colorFilter = c1315680kLG7.LLLLIIIILLL;
                if (colorFilter != null) {
                    c1315680kLG7.LLJI.setColorFilter(colorFilter);
                }
                C1315680kLG c1315680kLG8 = this.LIZ;
                c1315680kLG8.LIZ(c1315680kLG8.LLJI);
                C1315680kLG c1315680kLG9 = this.LIZ;
                c1315680kLG9.LJIIIZ(c1315680kLG9.LLLFFI, c1315680kLG9.LLLFZ);
                this.LIZ.LJ();
            }
        });
        this.LLLLLJLJLL = new InterfaceC1316540kMe() { // from class: X.0kLg
            @Override // X.InterfaceC1316540kMe
            public final void LIZIZ(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1316540kMe
            public final void LIZJ(int i, Throwable th) {
            }

            @Override // X.InterfaceC1316540kMe
            public final void LIZ(C1315930kLf c1315930kLf, C1315700kLI c1315700kLI, C1316350kML c1316350kML) {
                String str;
                String str2 = c1315700kLI.LIZ;
                C1315700kLI c1315700kLI2 = this.LIZ.LLJLLIL;
                if (c1315700kLI2 != null) {
                    str = c1315700kLI2.LIZ;
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str2, str)) {
                    return;
                }
                this.LIZ.LLJIJIL = new C1315920kLe(c1315930kLf, this.LIZ.LLJILLL);
                C1315680kLG c1315680kLG = this.LIZ;
                c1315680kLG.LIZ(c1315680kLG.LLJIJIL);
                this.LIZ.LJ();
            }
        };
        this.LLLLLL = new C1316300kMG(this);
        this.LLILLJJLI = sVar;
        sVar.getClass();
        this.LLILLL = new C1316190kM5();
        this.LLLIILIL = new AbstractC1301590jyX(sVar) { // from class: X.0jyW
            public final s LIZ;
            public final AbstractC1301590jyX LIZIZ;
            public final boolean LIZJ;
            public final InterfaceC1301330jy7 LIZLLL;

            @Override // X.AbstractC1301590jyX
            public final void LIZ() {
            }

            {
                boolean z;
                this.LIZ = sVar;
                if (sVar.LJIJ() && sVar.LLILZ != null) {
                    z = true;
                } else {
                    z = false;
                }
                this.LIZJ = z;
                this.LIZIZ = sVar.LLLF;
                this.LIZLLL = (InterfaceC1301330jy7) C1285920jZG.LIZJ().LIZ(InterfaceC1301330jy7.class);
            }

            @Override // X.AbstractC1301590jyX
            public final EnumC1300090jw7 LIZIZ(String str) {
                AbstractC1301590jyX abstractC1301590jyX = this.LIZIZ;
                if (abstractC1301590jyX != null) {
                    return abstractC1301590jyX.LIZIZ(str);
                }
                InterfaceC1301330jy7 interfaceC1301330jy7 = this.LIZLLL;
                if (interfaceC1301330jy7 != null) {
                    int iIsLocalResource = interfaceC1301330jy7.isLocalResource(str);
                    if (iIsLocalResource == -1) {
                        return EnumC1300090jw7.UNDEFINED;
                    }
                    if (iIsLocalResource == 1) {
                        return EnumC1300090jw7.TRUE;
                    }
                    if (iIsLocalResource == 0) {
                        return EnumC1300090jw7.FALSE;
                    }
                    return EnumC1300090jw7.UNDEFINED;
                }
                return EnumC1300090jw7.UNDEFINED;
            }

            @Override // X.AbstractC1301590jyX
            public final String LIZJ(C1301600jyY c1301600jyY) {
                AbstractC1301590jyX abstractC1301590jyX = this.LIZIZ;
                if (abstractC1301590jyX != null) {
                    return abstractC1301590jyX.LIZJ(c1301600jyY);
                }
                if (this.LIZJ) {
                    return C1294030jmL.LIZ(this.LIZ, c1301600jyY.LIZ, true);
                }
                return C1294030jmL.LIZ(this.LIZ, c1301600jyY.LIZ, false);
            }
        };
        this.LLLIIL = (sVar.LLLF == null && sVar.LLILZ == null) ? false : true;
        C1310290kCZ c1310290kCZ = sVar.LLLIIII;
        this.LLLIL = c1310290kCZ != null ? c1310290kCZ.LJI : true;
    }

    public final void LIZ(C1315920kLe c1315920kLe) {
        Rect rect = new Rect(0, 0, this.LLJJL, this.LLJJLIIIJLLLLLLLZ);
        rect.left = (int) (rect.left + this.LLJLLL + this.LLJJJIL);
        rect.top = (int) (rect.top + this.LLJZIJLIL + this.LLJJJJ);
        rect.right = (int) ((rect.right - this.LLJZ) - this.LLJJJJJIL);
        rect.bottom = (int) ((rect.bottom - this.LLL) - this.LLJJJJLIIL);
        if (c1315920kLe != null) {
            c1315920kLe.setBounds(rect);
        }
    }

    public final boolean LJFF(long j) {
        if ((j & this.LL) != 0) {
            return true;
        }
        return false;
    }

    public final void LJII(Canvas canvas) {
        Path path;
        this.LLLLLJIL.LJ();
        canvas.save();
        C1312750kGX c1312750kGX = this.LLLLIILL;
        if (c1312750kGX != null && (path = c1312750kGX.LIZJ) != null) {
            canvas.clipPath(path);
        }
        C1315920kLe c1315920kLe = this.LLJIJIL;
        if (c1315920kLe != null) {
            c1315920kLe.draw(canvas);
        }
        C1315920kLe c1315920kLe2 = this.LLJI;
        if (c1315920kLe2 != null) {
            c1315920kLe2.draw(canvas);
        }
        canvas.restore();
    }

    public final void LJIIL(Callback callback) {
        Drawable drawable;
        C1315920kLe c1315920kLe = this.LLJI;
        if (c1315920kLe != null) {
            C1316190kM5 c1316190kM5 = this.LLILLL;
            C1315930kLf c1315930kLf = c1315920kLe.LJFF;
            if (c1315930kLf != null) {
                drawable = c1315930kLf.LIZJ;
            } else {
                drawable = null;
            }
            if (!c1316190kM5.LIZIZ && c1316190kM5.LIZ.pauseAnimation(drawable)) {
                callback.invoke(0, "Animation paused.");
                return;
            }
        }
        callback.invoke(4, "Not support pause yet");
    }

    public final void LJIILIIL(C1315920kLe c1315920kLe) {
        if (c1315920kLe != null) {
            C1316190kM5 c1316190kM5 = this.LLILLL;
            Drawable current = c1315920kLe.getCurrent();
            if (!c1316190kM5.LIZIZ) {
                c1316190kM5.LIZ.releaseAnimDrawable(current);
            }
        }
    }

    public final void LJIILJJIL(C1315700kLI c1315700kLI) {
        if (c1315700kLI != null) {
            C1316190kM5 c1316190kM5 = this.LLILLL;
            if (!c1316190kM5.LIZIZ) {
                c1316190kM5.LIZ.releaseImage(c1315700kLI);
                return;
            }
            throw null;
        }
    }

    public final void LJIILL(Callback callback) {
        Drawable drawable;
        C1315920kLe c1315920kLe = this.LLJI;
        if (c1315920kLe != null) {
            C1316190kM5 c1316190kM5 = this.LLILLL;
            C1315930kLf c1315930kLf = c1315920kLe.LJFF;
            if (c1315930kLf != null) {
                drawable = c1315930kLf.LIZJ;
            } else {
                drawable = null;
            }
            if (!c1316190kM5.LIZIZ && c1316190kM5.LIZ.resumeAnimation(drawable)) {
                callback.invoke(0, "Animation resumed.");
                return;
            }
        }
        callback.invoke(4, "Not support resume yet");
    }

    public final void LJIILLIIL(String str) {
        int sign;
        LynxBaseUI lynxBaseUI = this.LLLIIII;
        if (lynxBaseUI != null) {
            sign = lynxBaseUI.getSign();
        } else {
            sign = this.LLLJL;
        }
        if (this.LLILLJJLI != null && sign >= 0) {
            this.LLILLJJLI.LLIZ.LIZIZ(new C1289960jfm(sign, str));
        }
    }

    public final void LJIIZILJ(RectF rectF) {
        this.LLLFF = rectF;
        float f = rectF.top;
        float f2 = rectF.bottom;
        float f3 = rectF.left;
        float f4 = rectF.right;
        if (this.LLJZIJLIL != f) {
            this.LLJZIJLIL = f;
            this.LL |= 1024;
        }
        if (this.LLJLLL != f3) {
            this.LLJLLL = f3;
            this.LL |= 1024;
        }
        if (this.LLJZ != f4) {
            this.LLJZ = f4;
            this.LL |= 1024;
        }
        if (this.LLL != f2) {
            this.LLL = f2;
            this.LL |= 1024;
        }
    }

    public final void LJIJ(Map<String, C1299120juY> map) {
        if (map == null) {
            return;
        }
        this.LLLILZ = false;
        this.LLLILZJ = false;
        this.LLLILZLLLI = false;
        this.LLLIZZ = false;
        this.LLLJ = false;
        if (map.containsKey("startplay")) {
            this.LLLILZ = true;
        }
        if (map.containsKey("currentloopcomplete")) {
            this.LLLILZJ = true;
        }
        if (map.containsKey("finalloopcomplete")) {
            this.LLLILZLLLI = true;
        }
        if (map.containsKey("load")) {
            this.LLLIZZ = true;
        }
        if (map.containsKey("error")) {
            this.LLLJ = true;
        }
    }

    public final void LJIJI(String str) {
        AbstractC1316100kLw abstractC1316100kLw;
        if ("aspectFit".equals(str)) {
            abstractC1316100kLw = InterfaceC1316000kLm.LIZIZ;
        } else if ("aspectFill".equals(str)) {
            abstractC1316100kLw = InterfaceC1316000kLm.LIZLLL;
        } else if ("center".equals(str)) {
            abstractC1316100kLw = InterfaceC1316000kLm.LIZJ;
        } else {
            abstractC1316100kLw = InterfaceC1316000kLm.LIZ;
        }
        if (!Objects.equals(abstractC1316100kLw, this.LLJILLL)) {
            this.LLJILLL = abstractC1316100kLw;
            this.LL |= 16;
        }
    }

    public final void LJIJJ(String str) {
        if (!TextUtils.equals(str, this.LLILZ)) {
            this.LLILZ = str;
            this.LL |= 2;
        }
    }

    public final void LJIJJLI(Callback callback) {
        Drawable drawable;
        C1315920kLe c1315920kLe = this.LLJI;
        if (c1315920kLe != null) {
            C1316190kM5 c1316190kM5 = this.LLILLL;
            C1315930kLf c1315930kLf = c1315920kLe.LJFF;
            if (c1315930kLf != null) {
                drawable = c1315930kLf.LIZJ;
            } else {
                drawable = null;
            }
            if (!c1316190kM5.LIZIZ && c1316190kM5.LIZ.startAnimation(drawable)) {
                callback.invoke(0, "Animation started.");
                return;
            }
        }
        callback.invoke(4, "Not support start yet");
    }

    public final void LJIL(Callback callback) {
        Drawable drawable;
        C1315920kLe c1315920kLe = this.LLJI;
        if (c1315920kLe != null) {
            C1316190kM5 c1316190kM5 = this.LLILLL;
            C1315930kLf c1315930kLf = c1315920kLe.LJFF;
            if (c1315930kLf != null) {
                drawable = c1315930kLf.LIZJ;
            } else {
                drawable = null;
            }
            if (!c1316190kM5.LIZIZ && c1316190kM5.LIZ.stopAnimation(drawable)) {
                callback.invoke(0, "Animation stopped.");
                return;
            }
        }
        callback.invoke(4, "Not support stop yet");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(com.lynx.react.bridge.ReadableMap r11) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1315680kLG.LJJI(com.lynx.react.bridge.ReadableMap):void");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 324));
    }

    public void LJIIIZ(int i, int i2) {
        int sign;
        int i3 = this.LLLJIL;
        if (i3 >= 0) {
            if ((i3 & 1) == 0) {
                return;
            }
        } else if (!this.LLLIZZ) {
            return;
        }
        LynxBaseUI lynxBaseUI = this.LLLIIII;
        if (lynxBaseUI != null) {
            sign = lynxBaseUI.getSign();
        } else {
            sign = this.LLLJL;
        }
        if (this.LLILLJJLI != null && sign >= 0 && !this.LLLLJI) {
            C1289960jfm c1289960jfm = new C1289960jfm(sign, "load");
            c1289960jfm.LIZIZ(Integer.valueOf(i2), "height");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "width");
            this.LLILLJJLI.LLIZ.LIZIZ(c1289960jfm);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C1289620jfE.LIZ().removeCallbacks(runnable, drawable);
    }

    public final C1315700kLI LIZIZ(int i, int i2, String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C1315860kLY c1315860kLY = new C1315860kLY();
        c1315860kLY.LIZ = str;
        c1315860kLY.LIZIZ = i;
        c1315860kLY.LIZJ = i2;
        c1315860kLY.LIZLLL = this.LLJJIII;
        this.LLILLJJLI.getClass();
        c1315860kLY.LJIIL = null;
        c1315860kLY.LJIIIZ = this.LLJJIJIIJIL;
        if (!this.LLJLILLLLZIIL && !this.LLJJI) {
            z = true;
        } else {
            z = false;
        }
        c1315860kLY.LJIIJ = z;
        c1315860kLY.LJIIIIZZ = this.LLJJJ;
        c1315860kLY.LJFF = this.LLJ;
        c1315860kLY.LJIIJJI = this.LLIZLLLIL;
        c1315860kLY.LJIILL = this.LLLLIL;
        c1315860kLY.LJIILLIIL = this.LLLLILI;
        c1315860kLY.LJIIZILJ = this.LLLLJI;
        c1315860kLY.LJIJ = this.LLLLLIL;
        float f = this.LLLLL;
        if (f > 0.0f) {
            c1315860kLY.LJIJI = f;
        }
        if (!((HashMap) this.LLLLJ).isEmpty()) {
            c1315860kLY.LJI = this.LLLLJ;
        } else {
            Map<String, String> map = this.LLILLJJLI.LLJLLIL;
            if (map != null) {
                c1315860kLY.LJI = map;
            }
        }
        Bitmap.Config config = this.LLJJIJI;
        if (config != null) {
            c1315860kLY.LJ = config;
        }
        this.LLILLJJLI.getClass();
        if (!TextUtils.isEmpty(this.LLJJ)) {
            float fLIZIZ = C1312920kGo.LIZIZ(this.LLJJ, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.LLILLJJLI.LLJJJ);
            if (fLIZIZ > 0.0f) {
                final int i3 = (int) fLIZIZ;
                InterfaceC1291890jit interfaceC1291890jit = new InterfaceC1291890jit(i3) { // from class: X.0kJW
                    public final int LIZ;
                    public String LIZIZ;

                    @Override // X.InterfaceC1291890jit
                    public final String getName() {
                        return C1314600kJW.class.getSimpleName();
                    }

                    @Override // X.InterfaceC1291890jit
                    public final String getPostprocessorCacheKey() {
                        if (this.LIZIZ == null) {
                            this.LIZIZ = String.valueOf(this.LIZ);
                        }
                        return this.LIZIZ;
                    }

                    {
                        this.LIZ = i3;
                    }

                    @Override // X.InterfaceC1291890jit
                    public final void LIZ(Bitmap bitmap) {
                        BlurUtils.iterativeBoxBlur(bitmap, this.LIZ);
                    }
                };
                ArrayList arrayList = new ArrayList();
                arrayList.add(interfaceC1291890jit);
                c1315860kLY.LJII = arrayList;
            }
        }
        Rect rect = this.LLLLLILLIL;
        if (rect != null) {
            c1315860kLY.LJIJJ = rect;
        }
        return new C1315700kLI(c1315860kLY);
    }

    public void LJIIIIZZ(LynxError lynxError, int i, int i2) {
        int sign;
        LynxBaseUI lynxBaseUI = this.LLLIIII;
        if (lynxBaseUI != null) {
            sign = lynxBaseUI.getSign();
        } else {
            sign = this.LLLJL;
        }
        if (this.LLILLJJLI != null && sign >= 0) {
            LynxBaseUI lynxBaseUI2 = this.LLLIIII;
            if (lynxBaseUI2 != null) {
                lynxError.LIZ("node_index", Integer.toString(lynxBaseUI2.mNodeIndex));
            }
            int i3 = this.LLLJIL;
            if (i3 < 0 ? this.LLLJ : (i3 & 2) != 0) {
                C1289960jfm c1289960jfm = new C1289960jfm(sign, "error");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(lynxError.LJ());
                sbLIZ.append(": ");
                sbLIZ.append(lynxError.LIZLLL());
                c1289960jfm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "errMsg");
                c1289960jfm.LIZIZ(Integer.valueOf(i), "lynx_categorized_code");
                c1289960jfm.LIZIZ(Integer.valueOf(i2), "error_code");
                this.LLILLJJLI.LLIZ.LIZIZ(c1289960jfm);
            }
            if (this.LLLIIII != null) {
                lynxError.LIZ("image_categorized_code", String.valueOf(i));
                this.LLILLJJLI.LJJIFFI(this.LLILZ, "image", lynxError);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C786410Ut5.LJLIIIL(C1289620jfE.LIZ(), runnable, drawable, j);
    }

    public final void LJIIJ(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i <= 0 && i2 <= 0) {
            return;
        }
        int i7 = this.LLJJL;
        if (i != i7 || i2 != this.LLJJLIIIJLLLLLLLZ) {
            if (i > i7 || i2 > this.LLJJLIIIJLLLLLLLZ) {
                this.LL |= 2048;
            }
            this.LLJJL = i;
            this.LLJJLIIIJLLLLLLLZ = i2;
            this.LL |= 512;
        }
        if (this.LLJJJJ != i5 || this.LLJJJJJIL != i4 || this.LLJJJJLIIL != i6 || this.LLJJJIL != i3) {
            this.LLJJJJ = i5;
            this.LLJJJJJIL = i4;
            this.LLJJJIL = i3;
            this.LLJJJJLIIL = i6;
            this.LL |= 512;
        }
    }
}
