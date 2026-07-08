package X;

import Y.ALAdapterS18S0100000_22;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453390nvN implements InterfaceC1454550nxF {
    public static final C0MSQ LJIIZILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIJ;
    public final Function0<Boolean> LIZ;
    public final boolean LIZIZ;
    public int LIZJ;
    public VESize LIZLLL;
    public InterfaceC1453510nvZ LJ;
    public RectF LJIIIZ;
    public final HashMap<String, C1450860nrI> LJFF = new HashMap<>();
    public String LJI = "unset";
    public float LJII = 0.15f;
    public float LJIIIIZZ = 20.0f;
    public CanvasGestureConfig LJIIJ = new CanvasGestureConfig(true, true, true, true, false, 2, false, false, false);
    public final C1450650nqx LJIIJJI = new C1450650nqx();
    public final C1453380nvM LJIIL = new C0NTU<CanvasVideoData>() { // from class: X.0nvM
        {
            super(null);
        }

        @Override // X.C0NTU
        public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
            List<CanvasFilterParam> transformList;
            CanvasExtra canvasExtra;
            CanvasVideoData canvasVideoData = (CanvasVideoData) obj2;
            if (canvasVideoData != null && (canvasExtra = canvasVideoData.extra) != null) {
                C1453390nvN c1453390nvN = this.LLILLJJLI;
                CanvasGestureConfig canvasGestureConfig = canvasExtra.gestureConfig;
                c1453390nvN.LJIIJ = canvasGestureConfig;
                c1453390nvN.LJII = canvasExtra.scaleMinLimit;
                c1453390nvN.LJIIIIZZ = canvasExtra.scaleMaxLimit;
                InterfaceC1453510nvZ interfaceC1453510nvZ = c1453390nvN.LJ;
                if (interfaceC1453510nvZ != null) {
                    interfaceC1453510nvZ.setEnableFakeFeedView(canvasGestureConfig.enableFakeFeedView);
                }
                C1453390nvN c1453390nvN2 = this.LLILLJJLI;
                InterfaceC1453510nvZ interfaceC1453510nvZ2 = c1453390nvN2.LJ;
                if (interfaceC1453510nvZ2 != null) {
                    interfaceC1453510nvZ2.setEnableStoryFakeFeedView(c1453390nvN2.LJIIJ.enableFakeStoryFeedView);
                }
            }
            C1453390nvN c1453390nvN3 = this.LLILLJJLI;
            C1450650nqx c1450650nqx = c1453390nvN3.LJIIJJI;
            String str = c1453390nvN3.LJI;
            CanvasFilterParam canvasFilterParam = null;
            if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
                canvasFilterParam = (CanvasFilterParam) C13LP.LJJJLL(transformList);
            }
            c1450650nqx.LIZIZ(str, canvasFilterParam);
            C1450860nrI c1450860nrILJIILJJIL = this.LLILLJJLI.LJIILJJIL();
            if (c1450860nrILJIILJJIL.LIZ == null) {
                c1450860nrILJIILJJIL.LIZ = this.LLILLJJLI.LIZIZ();
            }
        }
    };
    public final MutableLiveData<Float> LJIILIIL = new MutableLiveData<>();
    public final MutableLiveData<Float> LJIILJJIL = new MutableLiveData<>();
    public final MutableLiveData<Pair<Float, Float>> LJIILL = new MutableLiveData<>();
    public final MutableLiveData<Pair<Pair<Float, Float>, Pair<Float, Float>>> LJIILLIIL = new MutableLiveData<>();

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1453390nvN.class, "canvasVideoData", "getCanvasVideoData()Lcom/ss/android/ugc/aweme/canvas/CanvasVideoData;", 0);
        C13LE.LIZ.getClass();
        LJIJ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LJIIZILJ = new C0MSQ();
    }

    public final PointF[] LIZJ() {
        PointF[] pointFArr = new PointF[4];
        int i = 0;
        int i2 = 0;
        do {
            pointFArr[i2] = new PointF();
            i2++;
        } while (i2 < 4);
        RectF rectF = LJIILJJIL().LIZIZ;
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
        do {
            C121Q.LIZIZ(rectF.centerX(), rectF.centerY(), (float) Math.toRadians(LJIILL().degree), pointFArr[i]);
            i++;
        } while (i < 4);
        return pointFArr;
    }

    @Override // X.InterfaceC1454550nxF
    public final void LJII() {
    }

    @Override // X.InterfaceC1454550nxF
    public final void LJIIJJI() {
        RectF rectFLIZLLL;
        this.LJIIJJI.LJFF.setValue(Boolean.FALSE);
        InterfaceC1453510nvZ interfaceC1453510nvZ = this.LJ;
        if (interfaceC1453510nvZ != null) {
            interfaceC1453510nvZ.LJ();
        }
        Pair<Pair<Float, Float>, Pair<Float, Float>> pairLIZLLL = LIZLLL();
        RectF rectF = new RectF(pairLIZLLL.getFirst().getFirst().floatValue(), pairLIZLLL.getFirst().getSecond().floatValue(), pairLIZLLL.getSecond().getFirst().floatValue(), pairLIZLLL.getSecond().getSecond().floatValue());
        if (this.LIZIZ) {
            float f = LJIILL().degree;
            final float f2 = LJIILL().scaleFactor;
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            rectF.top -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            Matrix matrix = new Matrix();
            matrix.postRotate(f, fCenterX, fCenterY);
            matrix.mapRect(rectF);
            InterfaceC1453510nvZ interfaceC1453510nvZ2 = this.LJ;
            if (interfaceC1453510nvZ2 == null || (rectFLIZLLL = interfaceC1453510nvZ2.LIZLLL(rectF)) == null || rectFLIZLLL.width() <= 0.0f || rectFLIZLLL.height() <= 0.0f) {
                return;
            }
            final float fCenterX2 = rectFLIZLLL.centerX() - rectF.centerX();
            final float fCenterY2 = rectFLIZLLL.centerY() - rectF.centerY();
            final float fWidth = (rectFLIZLLL.width() / rectF.width()) * f2;
            if (fCenterX2 == 0.0f && fCenterY2 == 0.0f && fWidth == f2) {
                return;
            }
            final C817403Hg c817403Hg = new C817403Hg();
            final C817403Hg c817403Hg2 = new C817403Hg();
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0nva
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue;
                    float f3;
                    Float f4;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f4 = (Float) animatedValue) != null) {
                        fFloatValue = f4.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    float f5 = f2;
                    this.LJIILLIIL(f5 + ((fWidth - f5) * fFloatValue));
                    float f6 = fCenterX2;
                    float f7 = 0.0f;
                    if (f6 == 0.0f) {
                        f3 = 0.0f;
                    } else {
                        f3 = (f6 * fFloatValue) - c817403Hg.element;
                    }
                    c817403Hg.element += f3;
                    float f8 = fCenterY2;
                    if (f8 != 0.0f) {
                        f7 = (f8 * fFloatValue) - c817403Hg2.element;
                    }
                    c817403Hg2.element += f7;
                    this.LJFF(f3, f7);
                }
            });
            duration.addListener(new ALAdapterS18S0100000_22(this, 5));
            duration.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Float, java.lang.Float> LIZIZ() {
        /*
            r6 = this;
            com.ss.android.vesdk.VESize r5 = r6.LIZLLL
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r4 = r6.LJ()
            r3 = 0
            if (r5 == 0) goto L44
            if (r4 == 0) goto L44
            com.ss.android.ugc.aweme.canvas.CanvasExtra r0 = r4.extra
            if (r0 == 0) goto L15
            int r0 = r0.width
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L15:
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L48
            com.ss.android.ugc.aweme.canvas.CanvasExtra r0 = r4.extra
            if (r0 == 0) goto L54
            int r0 = r0.width
            if (r0 <= 0) goto L48
        L21:
            float r1 = (float) r0
            com.ss.android.ugc.aweme.canvas.CanvasExtra r0 = r4.extra
            if (r0 == 0) goto L45
            int r0 = r0.height
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.canvas.CanvasExtra r0 = r4.extra
            if (r0 == 0) goto L4b
            int r0 = r0.height
            if (r0 <= 0) goto L45
        L36:
            float r0 = (float) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r0)
        L44:
            return r3
        L45:
            int r0 = r5.height
            goto L36
        L48:
            int r0 = r5.width
            goto L21
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2.toString()
            r0.<init>(r2)
            throw r0
        L54:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1453390nvN.LIZIZ():kotlin.Pair");
    }

    public final Pair<Pair<Float, Float>, Pair<Float, Float>> LIZLLL() {
        C0MSQ c0msq = LJIIZILJ;
        VESize vESize = this.LIZLLL;
        Pair<Float, Float> pair = LJIILJJIL().LIZ;
        Pair pair2 = new Pair(Float.valueOf(LJIILL().transX), Float.valueOf(LJIILL().transY));
        float f = LJIILL().scaleFactor;
        LJ();
        c0msq.getClass();
        if (vESize != null) {
            Pair pair3 = new Pair(Float.valueOf(vESize.width / 2.0f), Float.valueOf(vESize.height / 2.0f));
            float fFloatValue = ((Number) pair2.getFirst()).floatValue() * vESize.width;
            float fFloatValue2 = ((Number) pair2.getSecond()).floatValue() * vESize.height;
            if (pair != null) {
                return new Pair<>(new Pair(Float.valueOf((((Number) pair3.getFirst()).floatValue() + fFloatValue) - ((pair.getFirst().floatValue() * f) / 2.0f)), Float.valueOf((((Number) pair3.getSecond()).floatValue() + fFloatValue2) - ((pair.getSecond().floatValue() * f) / 2.0f))), new Pair(Float.valueOf(((Number) pair3.getFirst()).floatValue() + fFloatValue + ((pair.getFirst().floatValue() * f) / 2.0f)), Float.valueOf(((Number) pair3.getSecond()).floatValue() + fFloatValue2 + ((pair.getSecond().floatValue() * f) / 2.0f))));
            }
        }
        return new Pair<>(new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CanvasVideoData LJ() {
        C1453380nvM c1453380nvM = this.LJIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIJ;
        return (CanvasVideoData) c1453380nvM.LL;
    }

    @Override // X.InterfaceC1454550nxF
    public final void LJIIIZ() {
        this.LJIIJJI.LJFF.setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC1454550nxF
    public final boolean LJIIJ() {
        return this.LIZ.invoke().booleanValue();
    }

    @Override // X.InterfaceC1454550nxF
    public final void LJIIL() {
        EnumC1453440nvS enumC1453440nvS;
        int value;
        EnumC1453440nvS enumC1453440nvS2;
        try {
            JSONObject jSONObject = new JSONObject(this.LJIIJJI.LIZ().animJsonParam);
            C1453660nvo c1453660nvo = EnumC1453440nvS.Companion;
            int i = JSONObjectProtectorUtils.getInt(jSONObject, "iType");
            c1453660nvo.getClass();
            EnumC1453440nvS[] enumC1453440nvSArrValues = EnumC1453440nvS.values();
            int length = enumC1453440nvSArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC1453440nvS = EnumC1453440nvS.TYPE1;
                    break;
                }
                enumC1453440nvS = enumC1453440nvSArrValues[i2];
                if (enumC1453440nvS.getValue() == i) {
                    break;
                } else {
                    i2++;
                }
            }
            C1453400nvO c1453400nvO = new C1453400nvO(enumC1453440nvS, JSONObjectProtectorUtils.getString(jSONObject, "author_username"), JSONObjectProtectorUtils.getString(jSONObject, "caption_text"), JSONObjectProtectorUtils.getBoolean(jSONObject, "use_rtl"), JSONObjectProtectorUtils.getString(jSONObject, "author_avatar_image_path"), JSONObjectProtectorUtils.getString(jSONObject, "font_color_inner"), JSONObjectProtectorUtils.getString(jSONObject, "font_color_outer"), JSONObjectProtectorUtils.getString(jSONObject, "bg_color"));
            EnumC1453440nvS enumC1453440nvS3 = c1453400nvO.LIZ;
            if (enumC1453440nvS3 != null) {
                value = enumC1453440nvS3.getValue();
            } else {
                value = 0;
                if (c1453400nvO == null) {
                    return;
                }
            }
            boolean z = c1453400nvO.LIZJ.length() == 0;
            int i3 = C1453450nvT.LIZ[c1453400nvO.LIZ.ordinal()];
            if (i3 == 1) {
                enumC1453440nvS2 = z ? EnumC1453440nvS.TYPE3 : EnumC1453440nvS.TYPE2;
            } else if (i3 == 2) {
                enumC1453440nvS2 = EnumC1453440nvS.TYPE3;
            } else if (i3 == 3) {
                enumC1453440nvS2 = EnumC1453440nvS.TYPE1;
            } else {
                if (i3 != 4) {
                    throw new C1954807lC();
                }
                enumC1453440nvS2 = EnumC1453440nvS.TYPE8;
            }
            c1453400nvO.LIZ = enumC1453440nvS2;
            this.LJIIJJI.LIZ().animJsonParam = C786410Ut5.J3(c1453400nvO.LIZ());
            C1450650nqx c1450650nqx = this.LJIIJJI;
            String strJ3 = C786410Ut5.J3(c1453400nvO.LIZ());
            VEVideoTransformFilterParam vEVideoTransformFilterParamLIZ = c1450650nqx.LIZ();
            vEVideoTransformFilterParamLIZ.animJsonParam = strJ3;
            c1450650nqx.LJ.setValue(vEVideoTransformFilterParamLIZ);
            this.LJIIJJI.LJI.setValue(new Pair<>(Integer.valueOf(value), Integer.valueOf(c1453400nvO.LIZ.getValue())));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final C1450860nrI LJIILJJIL() {
        HashMap<String, C1450860nrI> map = this.LJFF;
        String str = this.LJI;
        C1450860nrI c1450860nrI = map.get(str);
        if (c1450860nrI == null) {
            c1450860nrI = new C1450860nrI();
            RectF rectF = this.LJIIIZ;
            if (rectF != null) {
                c1450860nrI.LIZIZ.set(rectF);
                VEVideoTransformFilterParam vEVideoTransformFilterParamLIZ = this.LJIIJJI.LIZ();
                c1450860nrI.LIZIZ.offset(vEVideoTransformFilterParamLIZ.transX, vEVideoTransformFilterParamLIZ.transY);
            }
            map.put(str, c1450860nrI);
        }
        return c1450860nrI;
    }

    public final VEVideoTransformFilterParam LJIILL() {
        return this.LJIIJJI.LIZ();
    }

    @Override // X.InterfaceC1454550nxF
    public final boolean LJI() {
        CanvasVideoData canvasVideoDataLJ = LJ();
        if (canvasVideoDataLJ == null || canvasVideoDataLJ.extra == null) {
            return false;
        }
        CanvasVideoData canvasVideoDataLJ2 = LJ();
        if ((canvasVideoDataLJ2 != null ? canvasVideoDataLJ2.extra : null).height == 0) {
            return false;
        }
        CanvasVideoData canvasVideoDataLJ3 = LJ();
        return (canvasVideoDataLJ3 != null ? canvasVideoDataLJ3.extra : null).width != 0;
    }

    @Override // X.InterfaceC1454550nxF
    public final CanvasGestureConfig LJIILIIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1454550nxF
    public final void LIZ(float f) {
        InterfaceC1453510nvZ interfaceC1453510nvZ = this.LJ;
        if (interfaceC1453510nvZ != null) {
            if (4 == interfaceC1453510nvZ.LIZIZ(LIZJ(), true, this.LIZIZ)) {
                f = interfaceC1453510nvZ.LIZ(f);
            }
            float f2 = LJIILL().degree + f;
            C1450650nqx c1450650nqx = this.LJIIJJI;
            if (c1450650nqx.LIZJ != null) {
                VEVideoTransformFilterParam vEVideoTransformFilterParamLIZ = c1450650nqx.LIZ();
                float f3 = f2 % 360.0f;
                if (f3 < 0.0f) {
                    f3 += 360;
                }
                vEVideoTransformFilterParamLIZ.degree = f3;
                c1450650nqx.LJ.setValue(vEVideoTransformFilterParamLIZ);
            }
            this.LJIILJJIL.setValue(Float.valueOf(f2));
            this.LJIILLIIL.setValue(LIZLLL());
        }
    }

    public final void LJIILLIIL(float f) {
        C1450650nqx c1450650nqx = this.LJIIJJI;
        if (c1450650nqx.LIZJ != null) {
            VEVideoTransformFilterParam vEVideoTransformFilterParamLIZ = c1450650nqx.LIZ();
            vEVideoTransformFilterParamLIZ.scaleFactor = f;
            c1450650nqx.LJ.setValue(vEVideoTransformFilterParamLIZ);
        }
        this.LJIILIIL.setValue(Float.valueOf(f));
        this.LJIILLIIL.setValue(LIZLLL());
    }

    public final void LJIIZILJ(CanvasVideoData canvasVideoData) {
        Object objLJJJLL;
        List<CanvasFilterParam> transformList;
        this.LJI = "default";
        setValue(this, LJIJ[0], canvasVideoData);
        this.LJIILIIL.setValue(Float.valueOf(LJIILL().scaleFactor));
        this.LJIILLIIL.setValue(LIZLLL());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateObserver,id:");
        sbLIZ.append("default");
        sbLIZ.append(",currentFilter:");
        if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
            objLJJJLL = C13LP.LJJJLL(transformList);
        } else {
            objLJJJLL = null;
        }
        sbLIZ.append(objLJJJLL);
        sbLIZ.append(",currentState:");
        sbLIZ.append(LJIILJJIL());
        C567850MOx.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1454550nxF
    public final void onScale(float f) {
        if (this.LJ != null) {
            LJIILLIIL(Math.min(Math.max(LJIILL().scaleFactor * f, this.LJII), this.LJIIIIZZ));
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0nvM] */
    public C1453390nvN(C1450760nr8 c1450760nr8, boolean z) {
        this.LIZ = c1450760nr8;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC1454550nxF
    public final void LJFF(float f, float f2) {
        PointF pointF;
        VESize vESize;
        InterfaceC1453510nvZ interfaceC1453510nvZ = this.LJ;
        if (interfaceC1453510nvZ != null) {
            if (3 == interfaceC1453510nvZ.LIZIZ(LIZJ(), false, this.LIZIZ)) {
                PointF[] pointFArrLIZJ = LIZJ();
                int i = 0;
                do {
                    PointF pointF2 = pointFArrLIZJ[i];
                    pointF2.x += f;
                    pointF2.y += f2;
                    i++;
                } while (i < 4);
                pointF = interfaceC1453510nvZ.LIZJ(pointFArrLIZJ, f, f2);
            } else {
                pointF = new PointF(f, f2);
            }
            LJIILJJIL().LIZIZ.offset(pointF.x, pointF.y);
            C1450650nqx c1450650nqx = this.LJIIJJI;
            float f3 = pointF.x;
            float f4 = pointF.y;
            if (c1450650nqx.LIZJ != null) {
                VEVideoTransformFilterParam vEVideoTransformFilterParamLIZ = c1450650nqx.LIZ();
                float f5 = vEVideoTransformFilterParamLIZ.transX;
                VESize vESize2 = c1450650nqx.LIZJ;
                if (vESize2 == null) {
                    vESize = null;
                } else {
                    vESize = vESize2;
                }
                vEVideoTransformFilterParamLIZ.transX = f5 + (f3 / vESize.width);
                float f6 = vEVideoTransformFilterParamLIZ.transY;
                if (vESize2 == null) {
                    vESize2 = null;
                }
                vEVideoTransformFilterParamLIZ.transY = f6 + (f4 / vESize2.height);
                c1450650nqx.LJ.setValue(vEVideoTransformFilterParamLIZ);
            }
            this.LJIILL.setValue(new Pair<>(Float.valueOf(pointF.x), Float.valueOf(pointF.y)));
        }
    }

    @Override // X.InterfaceC1454550nxF
    public final boolean LJIIIIZZ(float f, float f2) {
        Pair<Pair<Float, Float>, Pair<Float, Float>> pairLIZLLL = LIZLLL();
        Pair<Float, Float> first = pairLIZLLL.getFirst();
        Pair<Float, Float> second = pairLIZLLL.getSecond();
        float fFloatValue = first.getFirst().floatValue();
        if (f <= second.getFirst().floatValue() && fFloatValue <= f) {
            float fFloatValue2 = first.getSecond().floatValue();
            float fFloatValue3 = second.getSecond().floatValue();
            float f3 = f2 - this.LIZJ;
            if (fFloatValue2 <= f3 && f3 <= fFloatValue3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
