package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0kVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1322110kVd extends C1322100kVc {
    public static InterfaceC1322160kVi sDefaultDraweePlaceHolderConfig;
    public static InterfaceC1320070kSL<? extends AbstractC1320720kTO> sDraweecontrollerbuildersupplier;
    public static boolean sEnableLazySize;
    public static boolean sEnableVisibleOpt;
    public static InterfaceC1321370kUR sIDraweecontrollerbuildersupplier;
    public C1322150kVh<AbstractC1320720kTO> mControllerBuilder;

    private void setDefaultPlaceHolder(TypedArray typedArray) {
    }

    public static void shutDown() {
        sDraweecontrollerbuildersupplier = null;
    }

    public void com_facebook_drawee_view_SimpleDraweeView__onDraw$___twin___(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        com_facebook_drawee_view_SimpleDraweeView_com_ss_android_ugc_aweme_lancet_SimpleDraweeViewLancet_onDraw(this, canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onVisibilityAggregated(boolean z) {
        com_facebook_drawee_view_SimpleDraweeView_com_ss_android_ugc_aweme_lancet_FrescoSimpleDrawableLancet_onVisibilityAggregated(this, z);
    }

    static {
        C1322140kVg.LIZJ.getClass();
        C01GW c01gw = C1322140kVg.LIZIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1322140kVg.LIZ;
        sDraweecontrollerbuildersupplier = (InterfaceC1320070kSL) c01gw.getValue();
        sEnableVisibleOpt = true;
    }

    public AbstractC1320720kTO getControllerBuilder() {
        return this.mControllerBuilder.LIZ();
    }

    public Uri getImageUri() {
        InterfaceC1320850kTb controller = getController();
        if (!(controller instanceof AbstractC1320710kTN)) {
            return null;
        }
        C1325710kbR c1325710kbR = ((AbstractC1320710kTN) controller).LJIJJLI;
        if (c1325710kbR instanceof C1325710kbR) {
            return c1325710kbR.LIZIZ;
        }
        return null;
    }

    public C1322110kVd(Context context) {
        super(context);
        this.mControllerBuilder = new C1322150kVh<AbstractC1320720kTO>() { // from class: X.0kVf
            @Override // X.C1322150kVh
            public final AbstractC1320720kTO LIZIZ() {
                if (this.LIZJ.isInEditMode()) {
                    return null;
                }
                if (C1322110kVd.sDraweecontrollerbuildersupplier == null) {
                    C1322350kW1.LIZLLL(C1322110kVd.sIDraweecontrollerbuildersupplier, "SimpleDraweeView was not initialized!");
                    C1322350kW1.LIZLLL(((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ(), "SimpleDraweeView was not initialized!");
                    C1322110kVd.sDraweecontrollerbuildersupplier = ((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ();
                }
                return C1322110kVd.sDraweecontrollerbuildersupplier.get();
            }
        };
        init(context, null);
    }

    public static void enableLazySize(boolean z) {
        sEnableLazySize = z;
    }

    public static void enableVisibleOpt(boolean z) {
        sEnableVisibleOpt = z;
    }

    public static void initialize(InterfaceC1320070kSL<? extends AbstractC1320720kTO> interfaceC1320070kSL) {
        sDraweecontrollerbuildersupplier = interfaceC1320070kSL;
        interfaceC1320070kSL.get().getClass();
    }

    public void com_facebook_drawee_view_SimpleDraweeView__onVisibilityAggregated$___twin___(final boolean z) {
        C822690WPb.LIZ().execute(new Runnable() { // from class: X.0kVe
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                Drawable drawable;
                C1C7U.LIZ("SimpleDraweeView@8317.onVisibilityAggregated$1");
                try {
                    super/*android.widget.ImageView*/.onVisibilityAggregated(z);
                    if (C1322110kVd.sEnableVisibleOpt && ((z || !C1328730kgJ.LJIIL) && (drawable = this.LLILLJJLI.getDrawable()) != null)) {
                        drawable.setVisible(true, false);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SimpleDraweeView@8317.onVisibilityAggregated$1");
            }
        });
    }

    public void setActualImageResource(int i) {
        setActualImageResource(i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageRequest(C1325710kbR c1325710kbR) {
        AbstractC1320720kTO abstractC1320720kTOLIZ = this.mControllerBuilder.LIZ();
        abstractC1320720kTOLIZ.LIZLLL = c1325710kbR;
        abstractC1320720kTOLIZ.LJIILJJIL = getController();
        setController(abstractC1320720kTOLIZ.LIZ());
    }

    @Override // X.C1322090kVb, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // X.C1322090kVb, android.widget.ImageView
    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public static void initialize(InterfaceC1321370kUR interfaceC1321370kUR) {
        sIDraweecontrollerbuildersupplier = interfaceC1321370kUR;
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public C1322110kVd(Context context, C1331070kk5 c1331070kk5) {
        super(context, c1331070kk5);
        this.mControllerBuilder = new C1322150kVh<AbstractC1320720kTO>() { // from class: X.0kVf
            @Override // X.C1322150kVh
            public final AbstractC1320720kTO LIZIZ() {
                if (this.LIZJ.isInEditMode()) {
                    return null;
                }
                if (C1322110kVd.sDraweecontrollerbuildersupplier == null) {
                    C1322350kW1.LIZLLL(C1322110kVd.sIDraweecontrollerbuildersupplier, "SimpleDraweeView was not initialized!");
                    C1322350kW1.LIZLLL(((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ(), "SimpleDraweeView was not initialized!");
                    C1322110kVd.sDraweecontrollerbuildersupplier = ((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ();
                }
                return C1322110kVd.sDraweecontrollerbuildersupplier.get();
            }
        };
        init(context, null);
    }

    public static void com_facebook_drawee_view_SimpleDraweeView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(C1322110kVd c1322110kVd, Canvas canvas) {
        try {
            c1322110kVd.com_facebook_drawee_view_SimpleDraweeView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, c1322110kVd);
            throw e;
        }
    }

    public static void com_facebook_drawee_view_SimpleDraweeView_com_ss_android_ugc_aweme_lancet_FrescoSimpleDrawableLancet_onVisibilityAggregated(C1322110kVd c1322110kVd, boolean z) {
        if (((Boolean) C0ADE.LIZ.getValue()).booleanValue() && !z) {
            try {
                try {
                    if (C1322180kVk.LIZ == null) {
                        Field fieldLIZJ = C1959307lv.LIZJ(ImageView.class, "sCompatDrawableVisibilityDispatch");
                        C1322180kVk.LIZ = fieldLIZJ;
                        fieldLIZJ.setAccessible(true);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                Field field = C1322180kVk.LIZ;
                if (field != null) {
                    field.setBoolean(c1322110kVd, true);
                }
                c1322110kVd.com_facebook_drawee_view_SimpleDraweeView__onVisibilityAggregated$___twin___(z);
                Field field2 = C1322180kVk.LIZ;
                if (field2 != null) {
                    field2.setBoolean(c1322110kVd, false);
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C805380Via.LIZJ(e, "onVisibilityAggregated");
                return;
            }
        }
        c1322110kVd.com_facebook_drawee_view_SimpleDraweeView__onVisibilityAggregated$___twin___(z);
    }

    public static void com_facebook_drawee_view_SimpleDraweeView_com_ss_android_ugc_aweme_lancet_SimpleDraweeViewLancet_onDraw(C1322110kVd c1322110kVd, Canvas canvas) throws Exception {
        if (((Number) C260960AKo.LIZ.getValue()).intValue() != 0) {
            try {
                com_facebook_drawee_view_SimpleDraweeView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(c1322110kVd, canvas);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if ((c1322110kVd instanceof C1322110kVd) && c1322110kVd != null) {
                    C20602085g.LIZ(c1322110kVd, String.valueOf(c1322110kVd.getImageUri()));
                }
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZJ("SimpleDraweeViewLancet", e);
                throw e;
            }
        }
        com_facebook_drawee_view_SimpleDraweeView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(c1322110kVd, canvas);
    }

    private void init(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            C1336010ks3.LIZIZ();
            if (isInEditMode()) {
                getHierarchy().LJJIII(null);
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SimpleDraweeView);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SimpleDraweeView_actualImageUri)) {
                        setImageURI(Uri.parse(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.SimpleDraweeView_actualImageUri)), (Object) null);
                    } else if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SimpleDraweeView_actualImageResource) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SimpleDraweeView_actualImageResource, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    setDefaultPlaceHolder(typedArrayObtainStyledAttributes);
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            C1336010ks3.LIZIZ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1336010ks3.LIZIZ();
            throw th2;
        }
    }

    private void setDefaultFailureImage(TypedArray typedArray, InterfaceC1322160kVi interfaceC1322160kVi) {
        InterfaceC1320380kSq interfaceC1320380kSqLIZLLL;
        if (typedArray.hasValue(R$styleable.SimpleDraweeView_failureImage)) {
            return;
        }
        if (interfaceC1322160kVi.LIZLLL() == null) {
            interfaceC1320380kSqLIZLLL = InterfaceC1320380kSq.LIZ;
        } else {
            interfaceC1320380kSqLIZLLL = interfaceC1322160kVi.LIZLLL();
        }
        Drawable drawableLJI = interfaceC1322160kVi.LJI();
        if (drawableLJI != null) {
            getHierarchy().LJIJJLI(drawableLJI, interfaceC1320380kSqLIZLLL);
        } else if (interfaceC1322160kVi.LIZ() != 0) {
            getHierarchy().LJIJJ(interfaceC1322160kVi.LIZ(), interfaceC1320380kSqLIZLLL);
        } else if (interfaceC1322160kVi.LJFF() != 0) {
            getHierarchy().LJIJJ(interfaceC1322160kVi.LJFF(), interfaceC1320380kSqLIZLLL);
        }
    }

    private void setDefaultPlaceHolderImage(TypedArray typedArray, InterfaceC1322160kVi interfaceC1322160kVi) {
        InterfaceC1320380kSq interfaceC1320380kSqLJ;
        if (typedArray.hasValue(R$styleable.SimpleDraweeView_placeholderImage)) {
            return;
        }
        if (interfaceC1322160kVi.LJ() == null) {
            interfaceC1320380kSqLJ = InterfaceC1320380kSq.LIZ;
        } else {
            interfaceC1320380kSqLJ = interfaceC1322160kVi.LJ();
        }
        Drawable drawableLJI = interfaceC1322160kVi.LJI();
        if (drawableLJI != null) {
            getHierarchy().LJJIFFI(drawableLJI, interfaceC1320380kSqLJ);
        } else if (interfaceC1322160kVi.LIZJ() != 0) {
            getHierarchy().LJJI(interfaceC1322160kVi.LIZJ(), interfaceC1320380kSqLJ);
        } else if (interfaceC1322160kVi.LIZIZ() != 0) {
            getHierarchy().LJJI(interfaceC1322160kVi.LIZIZ(), interfaceC1320380kSqLJ);
        }
    }

    public void setActualImageResource(int i, Object obj) {
        setImageURI(C1325880kbi.LIZIZ(i), obj);
    }

    public void setBlurHashImage(String str, C1318160kPG c1318160kPG) {
        if (TextUtils.isEmpty(str)) {
            C1328570kg3.LIZIZ("SimpleDraweeView", "setBlurHashImage, blurHash is null!");
            return;
        }
        InterfaceC1320850kTb controller = getController();
        C1325710kbR c1325710kbR = null;
        if (controller instanceof AbstractC1320710kTN) {
            C1325710kbR c1325710kbR2 = ((AbstractC1320710kTN) controller).LJIJJLI;
            if (c1325710kbR2 instanceof C1325710kbR) {
                c1325710kbR = c1325710kbR2;
            }
        }
        if (c1325710kbR != null) {
            c1325710kbR.LJJIJ = true;
            c1325710kbR.LJJIJIIJI = 1;
        }
        new C1318150kPF(str, c1318160kPG, new C1321980kVQ(this, c1318160kPG, SystemClock.uptimeMillis(), c1325710kbR, str));
    }

    public void setImageURI(Uri uri, Object obj) {
        if (sEnableLazySize && uri != null) {
            AbstractC1320720kTO abstractC1320720kTOLIZ = this.mControllerBuilder.LIZ();
            abstractC1320720kTOLIZ.LIZJ = obj;
            abstractC1320720kTOLIZ.LJIILJJIL = getController();
            setLazySizeAttach(new C1322080kVa(C1325700kbQ.LIZLLL(uri), abstractC1320720kTOLIZ, this));
            return;
        }
        AbstractC1320720kTO abstractC1320720kTOLIZ2 = this.mControllerBuilder.LIZ();
        abstractC1320720kTOLIZ2.LIZJ = obj;
        C1320810kTX c1320810kTX = (C1320810kTX) abstractC1320720kTOLIZ2;
        c1320810kTX.LJI(uri);
        c1320810kTX.LJIILJJIL = getController();
        setController(c1320810kTX.LIZ());
    }

    public void setPreviewHashImage(String str, C1316650kMp c1316650kMp) {
        setPreviewHashImage(str, c1316650kMp, (InterfaceC1321950kVN) null);
    }

    public C1322110kVd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mControllerBuilder = new C1322150kVh<AbstractC1320720kTO>() { // from class: X.0kVf
            @Override // X.C1322150kVh
            public final AbstractC1320720kTO LIZIZ() {
                if (this.LIZJ.isInEditMode()) {
                    return null;
                }
                if (C1322110kVd.sDraweecontrollerbuildersupplier == null) {
                    C1322350kW1.LIZLLL(C1322110kVd.sIDraweecontrollerbuildersupplier, "SimpleDraweeView was not initialized!");
                    C1322350kW1.LIZLLL(((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ(), "SimpleDraweeView was not initialized!");
                    C1322110kVd.sDraweecontrollerbuildersupplier = ((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ();
                }
                return C1322110kVd.sDraweecontrollerbuildersupplier.get();
            }
        };
        init(context, attributeSet);
    }

    public void setImageURI(String str, Object obj) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setImageURI(uri, obj);
    }

    public C1322110kVd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mControllerBuilder = new C1322150kVh<AbstractC1320720kTO>() { // from class: X.0kVf
            @Override // X.C1322150kVh
            public final AbstractC1320720kTO LIZIZ() {
                if (this.LIZJ.isInEditMode()) {
                    return null;
                }
                if (C1322110kVd.sDraweecontrollerbuildersupplier == null) {
                    C1322350kW1.LIZLLL(C1322110kVd.sIDraweecontrollerbuildersupplier, "SimpleDraweeView was not initialized!");
                    C1322350kW1.LIZLLL(((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ(), "SimpleDraweeView was not initialized!");
                    C1322110kVd.sDraweecontrollerbuildersupplier = ((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ();
                }
                return C1322110kVd.sDraweecontrollerbuildersupplier.get();
            }
        };
        init(context, attributeSet);
    }

    public void setController(InterfaceC1320850kTb interfaceC1320850kTb, String str, C1318160kPG c1318160kPG) {
        setController(interfaceC1320850kTb);
        if (!TextUtils.isEmpty(str)) {
            setBlurHashImage(str, c1318160kPG);
            if (interfaceC1320850kTb instanceof AbstractC1320710kTN) {
                ((AbstractC1320710kTN) interfaceC1320850kTb).LIZ = false;
            }
        }
    }

    public void setImageURI(Uri uri, Object obj, boolean z) {
        if (sEnableLazySize && uri != null) {
            AbstractC1320720kTO abstractC1320720kTOLIZ = this.mControllerBuilder.LIZ();
            abstractC1320720kTOLIZ.LIZJ = obj;
            abstractC1320720kTOLIZ.LJIILJJIL = getController();
            abstractC1320720kTOLIZ.LJIILL = z;
            setLazySizeAttach(new C1322080kVa(C1325700kbQ.LIZLLL(uri), abstractC1320720kTOLIZ, this));
            return;
        }
        AbstractC1320720kTO abstractC1320720kTOLIZ2 = this.mControllerBuilder.LIZ();
        abstractC1320720kTOLIZ2.LIZJ = obj;
        abstractC1320720kTOLIZ2.LJIILL = z;
        C1320810kTX c1320810kTX = (C1320810kTX) abstractC1320720kTOLIZ2;
        c1320810kTX.LJI(uri);
        c1320810kTX.LJIILJJIL = getController();
        setController(c1320810kTX.LIZ());
    }

    public void setImageURIWithBlur(Uri uri, String str, C1316650kMp c1316650kMp) {
        setImageURI(uri, (Object) null, false);
        if (!TextUtils.isEmpty(str)) {
            setPreviewHashImage(str, c1316650kMp, (InterfaceC1321950kVN) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPreviewHashImage(final java.lang.String r15, X.C1316650kMp r16, X.InterfaceC1321950kVN r17) {
        /*
            r14 = this;
            r7 = r15
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "SimpleDraweeView"
            java.lang.String r0 = "setPreviewHashImage, base64data is null!"
            X.C1328570kg3.LIZIZ(r1, r0)
            return
        Lf:
            r2 = r14
            X.0kTb r1 = r2.getController()
            boolean r0 = r1 instanceof X.AbstractC1320710kTN
            if (r0 == 0) goto L43
            X.0kTN r1 = (X.AbstractC1320710kTN) r1
            X.0kbR r6 = r1.LJIJJLI
            boolean r0 = r6 instanceof X.C1325710kbR
            if (r0 == 0) goto L43
        L20:
            if (r6 == 0) goto L28
            r0 = 1
            r6.LJJIJ = r0
            r0 = 2
            r6.LJJIJIIJI = r0
        L28:
            long r3 = android.os.SystemClock.uptimeMillis()
            X.0kPE r8 = new X.0kPE
            X.0kVL r1 = new X.0kVL
            r5 = r16
            r1.<init>(r2, r3, r5, r6, r7)
            X.0kVM r13 = new X.0kVM
            r13.<init>(r7)
            java.lang.String r10 = X.C1318140kPE.LJII
            r9 = r7
            r11 = r5
            r12 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            return
        L43:
            r6 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1322110kVd.setPreviewHashImage(java.lang.String, X.0kMp, X.0kVN):void");
    }

    public void setImageURI(Uri uri, String str, C1318160kPG c1318160kPG) {
        setImageURI(uri, (Object) null, false);
        if (!TextUtils.isEmpty(str)) {
            setBlurHashImage(str, c1318160kPG);
        }
    }

    public void setPreviewHashImage(String str, String str2, C1316650kMp c1316650kMp) {
        setPreviewHashImage(str, str2, c1316650kMp, null);
    }

    public void setImageURI(String str, String str2, C1318160kPG c1318160kPG) {
        setImageURI(str, (Object) null);
        if (!TextUtils.isEmpty(str2)) {
            setBlurHashImage(str2, c1318160kPG);
        }
    }

    public void setImageURI(String str, String str2, String str3) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setImageURI(uri, str2, str3, null);
    }

    public void setImageURI(Uri uri, String str, String str2) {
        setImageURI(uri, str, str2, null);
    }

    public C1322110kVd(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mControllerBuilder = new C1322150kVh<AbstractC1320720kTO>() { // from class: X.0kVf
            @Override // X.C1322150kVh
            public final AbstractC1320720kTO LIZIZ() {
                if (this.LIZJ.isInEditMode()) {
                    return null;
                }
                if (C1322110kVd.sDraweecontrollerbuildersupplier == null) {
                    C1322350kW1.LIZLLL(C1322110kVd.sIDraweecontrollerbuildersupplier, "SimpleDraweeView was not initialized!");
                    C1322350kW1.LIZLLL(((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ(), "SimpleDraweeView was not initialized!");
                    C1322110kVd.sDraweecontrollerbuildersupplier = ((C1321360kUQ) C1322110kVd.sIDraweecontrollerbuildersupplier).LIZ();
                }
                return C1322110kVd.sDraweecontrollerbuildersupplier.get();
            }
        };
        init(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [REQUEST, X.0kbR] */
    public void setImageURI(Uri uri, String str, String str2, Object obj) {
        if (sEnableLazySize && uri != null) {
            AbstractC1320720kTO abstractC1320720kTOLIZ = this.mControllerBuilder.LIZ();
            abstractC1320720kTOLIZ.LIZJ = obj;
            abstractC1320720kTOLIZ.LJIILJJIL = getController();
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
            c1325700kbQLIZLLL.LJJ = str;
            c1325700kbQLIZLLL.LJJI = str2;
            setLazySizeAttach(new C1322080kVa(c1325700kbQLIZLLL, abstractC1320720kTOLIZ, this));
            return;
        }
        AbstractC1320720kTO abstractC1320720kTOLIZ2 = this.mControllerBuilder.LIZ();
        abstractC1320720kTOLIZ2.LIZJ = obj;
        if (uri == null) {
            abstractC1320720kTOLIZ2.LIZLLL = null;
        } else {
            C1325700kbQ c1325700kbQLIZLLL2 = C1325700kbQ.LIZLLL(uri);
            c1325700kbQLIZLLL2.LJJ = str;
            c1325700kbQLIZLLL2.LJJI = str2;
            c1325700kbQLIZLLL2.LJ = C1324670kZl.LJ;
            abstractC1320720kTOLIZ2.LIZLLL = c1325700kbQLIZLLL2.LIZ();
        }
        abstractC1320720kTOLIZ2.LJIILJJIL = getController();
        setController(abstractC1320720kTOLIZ2.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPreviewHashImage(java.lang.String r15, final java.lang.String r16, X.C1316650kMp r17, X.InterfaceC1321950kVN r18) {
        /*
            r14 = this;
            r7 = r16
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L10
            java.lang.String r1 = "SimpleDraweeView"
            java.lang.String r0 = "setPreviewHashImage, base64data is null!"
            X.C1328570kg3.LIZIZ(r1, r0)
            return
        L10:
            r2 = r14
            X.0kTb r1 = r2.getController()
            boolean r0 = r1 instanceof X.AbstractC1320710kTN
            if (r0 == 0) goto L43
            X.0kTN r1 = (X.AbstractC1320710kTN) r1
            X.0kbR r6 = r1.LJIJJLI
            boolean r0 = r6 instanceof X.C1325710kbR
            if (r0 == 0) goto L43
        L21:
            if (r6 == 0) goto L29
            r0 = 1
            r6.LJJIJ = r0
            r0 = 2
            r6.LJJIJIIJI = r0
        L29:
            long r3 = android.os.SystemClock.uptimeMillis()
            X.0kPE r8 = new X.0kPE
            X.0kVO r1 = new X.0kVO
            r5 = r17
            r1.<init>(r2, r3, r5, r6, r7)
            X.0kVP r13 = new X.0kVP
            r13.<init>(r7)
            r9 = r7
            r11 = r5
            r12 = r1
            r10 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            return
        L43:
            r6 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1322110kVd.setPreviewHashImage(java.lang.String, java.lang.String, X.0kMp, X.0kVN):void");
    }
}
