package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseIntArray;
import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21392318nh {
    public static final SparseIntArray LIZJ;
    public static final Constructor LIZLLL;
    public static final Method LJ;
    public final View LIZ;
    public final ArrayList<C21392518nj> LIZIZ = new ArrayList<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        LIZJ = sparseIntArray;
        sparseIntArray.put(1, 0);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(4, 2);
        sparseIntArray.put(8, 3);
        sparseIntArray.put(16, 4);
        sparseIntArray.put(32, 5);
        sparseIntArray.put(64, 6);
        sparseIntArray.put(128, 7);
        sparseIntArray.put(256, 8);
        sparseIntArray.put(512, 9);
        sparseIntArray.put(1024, 10);
        sparseIntArray.put(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, 11);
        LIZLLL = null;
        LJ = null;
        try {
            Class<?> cls = Class.forName("android.view.RenderNodeAnimator");
            Constructor<?> constructor = cls.getConstructor(Integer.TYPE, Float.TYPE);
            LIZLLL = constructor;
            constructor.setAccessible(true);
            LJ = cls.getMethod("setTarget", View.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean LIZIZ() {
        return (LIZLLL == null || LJ == null) ? false : true;
    }

    public final List<Animator> LIZJ() {
        if (!LIZIZ()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        new AnimatorListenerAdapter() { // from class: X.18ni
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.LL.LIZ.setHasTransientState(false);
                this.LL.getClass();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                this.LL.LIZ.setHasTransientState(true);
                this.LL.getClass();
            }
        };
        for (C21392518nj c21392518nj : this.LIZIZ) {
            try {
                Animator animator = (Animator) LIZLLL.newInstance(Integer.valueOf(LIZJ.get(c21392518nj.LIZ)), Float.valueOf(c21392518nj.LIZIZ + c21392518nj.LIZJ));
                C2204961BRm.a0(LJ, animator, new Object[]{this.LIZ}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOumapKA7jfgReBcu4sEJtdWJbkgn+wXEr1tHXOLkg==", null));
                arrayList.add(animator);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return arrayList;
    }

    public C21392318nh(View view) {
        this.LIZ = view;
    }

    public final void LIZ(float f, int i) {
        float translationX;
        float left;
        float translationX2;
        View view = this.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                if (i != 64) {
                                    if (i != 128) {
                                        if (i != 256) {
                                            if (i != 512) {
                                                if (i != 1024) {
                                                    if (i != 2048) {
                                                        translationX = 0.0f;
                                                    } else {
                                                        translationX = view.getAlpha();
                                                    }
                                                } else {
                                                    left = view.getElevation();
                                                    translationX2 = view.getTranslationZ();
                                                }
                                            } else {
                                                left = view.getTop();
                                                translationX2 = view.getTranslationY();
                                            }
                                        } else {
                                            left = view.getLeft();
                                            translationX2 = view.getTranslationX();
                                        }
                                        translationX = translationX2 + left;
                                    } else {
                                        translationX = view.getRotationY();
                                    }
                                } else {
                                    translationX = view.getRotationX();
                                }
                            } else {
                                translationX = view.getRotation();
                            }
                        } else {
                            translationX = view.getScaleY();
                        }
                    } else {
                        translationX = view.getScaleX();
                    }
                } else {
                    translationX = view.getTranslationZ();
                }
            } else {
                translationX = view.getTranslationY();
            }
        } else {
            translationX = view.getTranslationX();
        }
        this.LIZIZ.add(new C21392518nj(i, translationX, f - translationX));
    }
}
