package X;

import Y.AAListenerS343S0100000_33;
import Y.AUListenerS235S0200000_33;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tux.theme.exp.MotionCurveDeviceScoreSettings;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.19ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21647019ng {
    public static float LJIIIIZZ = 8.0f;
    public static float LJIIIZ = 6.6f;
    public static float LJIIJ = 5.5f;
    public static boolean LJIIJJI;
    public final boolean LIZ;
    public final InterfaceC21647119nh LIZIZ;
    public final View LIZJ;
    public final List<C19746412Nq> LIZLLL;
    public final EnumC823140WQu LJ = EnumC823140WQu.DEFAULT;
    public final InterfaceC21647119nh LJFF;
    public InterfaceC21647119nh LJI;
    public final C21647219ni LJII;

    public final void LIZ() {
        this.LIZIZ.cancel();
        this.LJFF.cancel();
        InterfaceC21647119nh interfaceC21647119nh = this.LJI;
        if (interfaceC21647119nh != null) {
            interfaceC21647119nh.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF() throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r7.LIZ
            r6 = 1
            if (r0 != 0) goto L3d
            X.19ni r5 = r7.LJII
            android.content.Context r3 = r5.LIZ
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r0)
            java.lang.String r1 = "android.permission.BATTERY_STATS"
            r0 = 0
            android.content.Intent r4 = X.C786410Ut5.LJIL(r3, r0, r2, r1, r0)
            r3 = -1
            if (r4 == 0) goto L40
            java.lang.String r0 = "status"
            int r2 = r4.getIntExtra(r0, r3)
            java.lang.String r0 = "level"
            int r1 = r4.getIntExtra(r0, r3)
            java.lang.String r0 = "scale"
            int r3 = r4.getIntExtra(r0, r3)
            r0 = 2
            if (r2 != r0) goto L3e
            r2 = 1
        L30:
            if (r1 < 0) goto L40
            if (r3 <= 0) goto L40
            int r1 = r1 * 100
            int r1 = r1 / r3
            r0 = 15
            if (r1 >= r0) goto L40
            if (r2 != 0) goto L40
        L3d:
            return r6
        L3e:
            r2 = 0
            goto L30
        L40:
            android.content.Context r0 = r5.LIZ
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r3 = r0.getDisplayMetrics()
            int r1 = r3.widthPixels
            int r0 = r3.heightPixels
            int r0 = java.lang.Math.max(r1, r0)
            float r2 = (float) r0
            float r1 = r3.density
            r0 = 640(0x280, float:8.97E-43)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3d
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21647019ng.LJFF():boolean");
    }

    public final InterfaceC21647119nh LIZIZ(C19746312Np c19746312Np) {
        int i = C19746212No.LIZIZ[c19746312Np.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    final View view = this.LIZJ;
                    final C1776900wLA c1776900wLA = (C1776900wLA) c19746312Np.LIZIZ;
                    final List<C19746412Nq> list = this.LIZLLL;
                    return new InterfaceC21647119nh(view, c1776900wLA, list) { // from class: X.19mY
                        public final View LIZ;
                        public final C1776900wLA LIZIZ;
                        public final List<C19746412Nq> LIZJ;
                        public long LIZLLL;
                        public Interpolator LJ;
                        public AnimatorSet LJFF;
                        public final Map<String, ObjectAnimator> LJI;
                        public final Map<String, InterfaceC21641019mi> LJII;
                        public final C19746312Np LJIIIIZZ;

                        @Override // X.InterfaceC21647119nh
                        public final void cancel() {
                            this.LJFF.cancel();
                        }

                        @Override // X.InterfaceC21647119nh
                        public final void end() {
                            if (!this.LJFF.isStarted()) {
                                start(false);
                            }
                            this.LJFF.end();
                        }

                        @Override // X.InterfaceC21647119nh
                        public final boolean isPaused() {
                            return this.LJFF.isPaused();
                        }

                        @Override // X.InterfaceC21647119nh
                        public final C19746312Np LIZIZ() {
                            return this.LJIIIIZZ;
                        }

                        @Override // X.InterfaceC21647119nh
                        public final void LIZJ(long j) {
                            this.LIZLLL = j;
                        }

                        public final ObjectAnimator LJFF(String str) {
                            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.LIZ, str, 0, 0);
                            objectAnimatorOfInt.setDuration(this.LIZIZ.LJ);
                            objectAnimatorOfInt.setInterpolator(this.LJ);
                            return objectAnimatorOfInt;
                        }

                        @Override // X.InterfaceC21647119nh
                        public final void start(boolean z) {
                            if (this.LJFF.isRunning()) {
                                this.LJFF.cancel();
                            }
                            if (Build.VERSION.SDK_INT <= 23 && ((LinkedHashMap) this.LJI).values().size() > 1) {
                                this.LJFF = new AnimatorSet();
                            }
                            if (z) {
                                long j = this.LIZLLL;
                                this.LJFF.playTogether(C13LP.LLIIII(((LinkedHashMap) this.LJI).values()));
                                this.LJFF.setStartDelay(j);
                                this.LJFF.start();
                                return;
                            }
                            this.LJFF.playSequentially(C13LP.LLIIII(((LinkedHashMap) this.LJI).values()));
                            this.LJFF.start();
                        }

                        @Override // X.InterfaceC21647119nh
                        public final void LIZ(long j, String str) {
                            ValueAnimator valueAnimator = (ValueAnimator) ((LinkedHashMap) this.LJI).get(str);
                            if (valueAnimator != null) {
                                valueAnimator.setStartDelay(j);
                            }
                        }

                        @Override // X.InterfaceC21647119nh
                        public final void LIZLLL(String str, InterfaceC21641019mi interfaceC21641019mi) {
                            this.LJII.put(str, interfaceC21641019mi);
                            ObjectAnimator objectAnimator = this.LJI.get(str);
                            if (objectAnimator != null) {
                                objectAnimator.addUpdateListener(new AUListenerS235S0200000_33(interfaceC21641019mi, objectAnimator, 12));
                                objectAnimator.addListener(new AAListenerS343S0100000_33(interfaceC21641019mi, 23));
                            }
                        }

                        {
                            boolean z;
                            ObjectAnimator objectAnimatorLJ;
                            float f;
                            float f2;
                            this.LIZ = view;
                            this.LIZIZ = c1776900wLA;
                            this.LIZJ = list;
                            this.LJFF = new AnimatorSet();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            this.LJI = linkedHashMap;
                            this.LJII = new LinkedHashMap();
                            EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.BEZIER;
                            float f3 = c1776900wLA.LIZ.LIZ;
                            float fMax = c1776900wLA.LIZIZ.LIZ;
                            float f4 = c1776900wLA.LIZJ.LIZ;
                            float fMin = c1776900wLA.LIZLLL.LIZ;
                            float f5 = 1;
                            float f6 = f5 - f4;
                            float f7 = f3 + f6;
                            if (f7 > 1.0f) {
                                float f8 = f7 - f5;
                                if (f7 == 0.0f) {
                                    f = 0.5f;
                                } else {
                                    f = f3 / f7;
                                }
                                if (f7 == 0.0f) {
                                    f2 = 0.5f;
                                } else {
                                    f2 = f6 / f7;
                                }
                                f3 -= f * f8;
                                f4 += f8 * f2;
                            }
                            if (fMax == 0.0f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && f3 / fMax < 0.35f) {
                                float f9 = fMax * 0.35f;
                                fMax = Math.max(0.0f, fMax - Math.min(0.3f, Math.abs(f9 - f3) * 0.5f));
                                f3 = f9;
                            }
                            float f10 = f5 - fMin;
                            if (f10 != 0.0f && (f5 - f4) / f10 < 0.35f) {
                                float f11 = f5 - (f10 * 0.35f);
                                fMin = Math.min(1.0f, fMin + Math.min(0.3f, Math.abs(f11 - f4) * 0.5f));
                                f4 = f11;
                            }
                            if (fMax > fMin) {
                                float f12 = (fMax + fMin) / 2;
                                fMin = 0.1f + f12;
                                fMax = f12 - 0.1f;
                            }
                            this.LJIIIIZZ = new C19746312Np(enumC19746112Nn, new C1776900wLA(new C1342130l1v(Math.max(0.0f, Math.min(1.0f, f3))), new C1342130l1v(Math.max(0.0f, Math.min(1.0f, fMax))), new C1342130l1v(Math.max(0.0f, Math.min(1.0f, f4))), new C1342130l1v(Math.max(0.0f, Math.min(1.0f, fMin))), c1776900wLA.LJ), list);
                            if (!list.isEmpty()) {
                                linkedHashMap.clear();
                                this.LJFF = new AnimatorSet();
                                this.LJ = C0GY9.LIZIZ(c1776900wLA.LIZ.LIZ, c1776900wLA.LIZIZ.LIZ, c1776900wLA.LIZJ.LIZ, c1776900wLA.LIZLLL.LIZ);
                                for (C19746412Nq c19746412Nq : list) {
                                    InterfaceC21640319mb interfaceC21640319mb = c19746412Nq.LIZIZ;
                                    if (interfaceC21640319mb instanceof C0HUY) {
                                        C0HUY c0huy = (C0HUY) interfaceC21640319mb;
                                        objectAnimatorLJ = LJ("alpha", c0huy.LIZ, c0huy.LIZIZ);
                                    } else if (interfaceC21640319mb instanceof C19745612Ni) {
                                        C19745612Ni c19745612Ni = (C19745612Ni) interfaceC21640319mb;
                                        objectAnimatorLJ = ObjectAnimator.ofObject(this.LIZ, c19745612Ni.LIZJ, new ArgbEvaluator(), Integer.valueOf(c19745612Ni.LIZ), Integer.valueOf(c19745612Ni.LIZIZ));
                                        objectAnimatorLJ.setDuration(this.LIZIZ.LJ);
                                        objectAnimatorLJ.setInterpolator(this.LJ);
                                    } else if (interfaceC21640319mb instanceof C1891607b0) {
                                        interfaceC21640319mb.getClass();
                                        objectAnimatorLJ = LJFF("scrollX");
                                    } else if (interfaceC21640319mb instanceof C1892707bB) {
                                        interfaceC21640319mb.getClass();
                                        objectAnimatorLJ = LJFF("scrollY");
                                    } else if (interfaceC21640319mb instanceof C082N) {
                                        C082N c082n = (C082N) interfaceC21640319mb;
                                        objectAnimatorLJ = LJ("translationX", c082n.LIZ, c082n.LIZIZ);
                                    } else if (interfaceC21640319mb instanceof C0HV5) {
                                        C0HV5 c0hv5 = (C0HV5) interfaceC21640319mb;
                                        objectAnimatorLJ = LJ("translationY", c0hv5.LIZ, c0hv5.LIZIZ);
                                    } else if (interfaceC21640319mb instanceof C1160040gIE) {
                                        C1160040gIE c1160040gIE = (C1160040gIE) interfaceC21640319mb;
                                        objectAnimatorLJ = LJ("translationZ", c1160040gIE.LIZ, c1160040gIE.LIZIZ);
                                    } else if (interfaceC21640319mb instanceof C1880107Xz) {
                                        C1880107Xz c1880107Xz = (C1880107Xz) interfaceC21640319mb;
                                        objectAnimatorLJ = LJ("rotation", c1880107Xz.LIZ, c1880107Xz.LIZIZ);
                                    } else if (interfaceC21640319mb instanceof C1880007Xy) {
                                        interfaceC21640319mb.getClass();
                                        objectAnimatorLJ = LJ("rotationX", 0.0f, 0.0f);
                                    } else if (interfaceC21640319mb instanceof C07Y0) {
                                        C07Y0 c07y0 = (C07Y0) interfaceC21640319mb;
                                        objectAnimatorLJ = LJ("rotationY", c07y0.LIZ, c07y0.LIZIZ);
                                    } else if (interfaceC21640319mb instanceof C0HIW) {
                                        C0HIW c0hiw = (C0HIW) interfaceC21640319mb;
                                        objectAnimatorLJ = LJ("scaleX", c0hiw.LIZ, c0hiw.LIZIZ);
                                    } else if (interfaceC21640319mb instanceof C0HIX) {
                                        C0HIX c0hix = (C0HIX) interfaceC21640319mb;
                                        objectAnimatorLJ = LJ("scaleY", c0hix.LIZ, c0hix.LIZIZ);
                                    } else {
                                        throw new C1954807lC();
                                    }
                                    this.LJI.put(c19746412Nq.LIZ, objectAnimatorLJ);
                                    InterfaceC21641019mi interfaceC21641019mi = (InterfaceC21641019mi) ((LinkedHashMap) this.LJII).get(c19746412Nq.LIZ);
                                    if (interfaceC21641019mi != null) {
                                        LIZLLL(c19746412Nq.LIZ, interfaceC21641019mi);
                                    }
                                }
                            }
                        }

                        public final ObjectAnimator LJ(String str, float f, float f2) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZ, str, f, f2);
                            objectAnimatorOfFloat.setDuration(this.LIZIZ.LJ);
                            objectAnimatorOfFloat.setInterpolator(this.LJ);
                            return objectAnimatorOfFloat;
                        }
                    };
                }
                throw new C1954807lC();
            }
            final View view2 = this.LIZJ;
            final C621560OZm c621560OZm = (C621560OZm) c19746312Np.LIZIZ;
            final List<C19746412Nq> list2 = this.LIZLLL;
            return new C21639919mX(view2, c621560OZm, list2) { // from class: X.19mZ
                public Pair<Double, Double> LJIILIIL;

                @Override // X.C21639919mX
                public final float LJFF() {
                    if (this.LJIILIIL == null) {
                        C621560OZm c621560OZm2 = (C621560OZm) this.LIZIZ;
                        this.LJIILIIL = C08LN.LIZ(c621560OZm2.LIZ.LIZ, c621560OZm2.LIZIZ.LIZ);
                    }
                    Pair<Double, Double> pair = this.LJIILIIL;
                    if (pair != null) {
                        return (float) pair.getSecond().doubleValue();
                    }
                    return 0.0f;
                }

                @Override // X.C21639919mX
                public final float LJII() {
                    if (this.LJIILIIL == null) {
                        C621560OZm c621560OZm2 = (C621560OZm) this.LIZIZ;
                        this.LJIILIIL = C08LN.LIZ(c621560OZm2.LIZ.LIZ, c621560OZm2.LIZIZ.LIZ);
                    }
                    Pair<Double, Double> pair = this.LJIILIIL;
                    if (pair != null) {
                        return (float) pair.getFirst().doubleValue();
                    }
                    return 0.0f;
                }

                @Override // X.C21639919mX
                public final float LJI() {
                    return LJFF() / (2 * ((float) Math.sqrt(LJII())));
                }
            };
        }
        return new C21639919mX(this.LIZJ, c19746312Np.LIZIZ, this.LIZLLL);
    }

    public final void LIZLLL(long j) {
        this.LIZIZ.LIZJ(j);
        this.LJFF.LIZJ(j);
        InterfaceC21647119nh interfaceC21647119nh = this.LJI;
        if (interfaceC21647119nh != null) {
            interfaceC21647119nh.LIZJ(j);
        }
    }

    public final void LJI(boolean z) {
        if (LJIIIIZZ > LJIIIZ) {
            if (LJFF()) {
                InterfaceC21647119nh interfaceC21647119nh = this.LJI;
                if (interfaceC21647119nh == null) {
                    interfaceC21647119nh = this.LJFF;
                }
                interfaceC21647119nh.start(z);
                return;
            }
            this.LIZIZ.start(z);
            return;
        }
        int i = C19746212No.LIZ[this.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.LIZIZ.end();
                return;
            } else {
                if (LJIIIIZZ <= LJIIJ) {
                    return;
                }
                InterfaceC21647119nh interfaceC21647119nh2 = this.LJI;
                if (interfaceC21647119nh2 == null) {
                    interfaceC21647119nh2 = this.LJFF;
                }
                interfaceC21647119nh2.start(z);
                return;
            }
        }
        InterfaceC21647119nh interfaceC21647119nh3 = this.LJI;
        if (interfaceC21647119nh3 == null) {
            interfaceC21647119nh3 = this.LJFF;
        }
        interfaceC21647119nh3.start(z);
    }

    public final void LIZJ(String str, InterfaceC21641019mi interfaceC21641019mi) {
        this.LIZIZ.LIZLLL(str, interfaceC21641019mi);
        this.LJFF.LIZLLL(str, interfaceC21641019mi);
        InterfaceC21647119nh interfaceC21647119nh = this.LJI;
        if (interfaceC21647119nh != null) {
            interfaceC21647119nh.LIZLLL(str, interfaceC21641019mi);
        }
    }

    public final void LJ(long j, String str) {
        this.LIZIZ.LIZ(j, str);
        this.LJFF.LIZ(j, str);
        InterfaceC21647119nh interfaceC21647119nh = this.LJI;
        if (interfaceC21647119nh != null) {
            interfaceC21647119nh.LIZ(j, str);
        }
    }

    public C21647019ng(Context context, View view, C19746312Np c19746312Np, boolean z) {
        Float f;
        this.LIZ = z;
        this.LIZJ = view;
        this.LIZLLL = c19746312Np.LIZJ;
        InterfaceC21647119nh interfaceC21647119nhLIZIZ = LIZIZ(c19746312Np);
        this.LIZIZ = interfaceC21647119nhLIZIZ;
        this.LJFF = LIZIZ(interfaceC21647119nhLIZIZ.LIZIZ());
        this.LJII = new C21647219ni(context);
        if (!z && !LJIIJJI) {
            C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(((IAppContextService) ServiceManager.get().getService(IAppContextService.class)).getAppId());
            C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
            C1300610jwx[] c1300610jwxArr = {c1300610jwx};
            Bundle bundle = new Bundle();
            if (c09gaLIZIZ != null) {
                c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
            }
            String str = c1300610jwx.LIZ;
            Object obj = null;
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if ((obj instanceof Float) && (f = (Float) obj) != null) {
                LJIIIIZZ = f.floatValue();
                LJIIJJI = true;
            }
            MotionCurveDeviceScoreSettings motionCurveDeviceScoreSettings = MotionCurveDeviceScoreSettings.INSTANCE;
            LJIIIZ = motionCurveDeviceScoreSettings.getLowPerfScore();
            LJIIJ = motionCurveDeviceScoreSettings.getVeryLowPerfScore();
        }
    }
}
