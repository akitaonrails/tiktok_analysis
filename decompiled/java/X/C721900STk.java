package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.graphics.Point;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Pair;
import android.util.Property;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0STk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721900STk implements InterfaceC721960STq {
    public static final C721900STk LIZ = new C721900STk();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(540));

    @Override // X.InterfaceC721960STq
    public final Bundle LIZJ(C19EG c19eg, View[] viewArr) {
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            return null;
        }
        if (viewArr.length == 0) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("StoryAnimationManager", "anchor is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(viewArr.length);
        int length = viewArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            View view = viewArr[i2];
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("story_fyp_transition_anchor-");
            sbLIZ.append(i3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C14K9.LJIJJLI(view, strLIZIZ);
            arrayList.add(new Pair(view, strLIZIZ));
            i2++;
            i3++;
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return ActivityOptions.makeSceneTransitionAnimation(c19eg, (Pair[]) Arrays.copyOf(pairArr, pairArr.length)).toBundle();
    }

    public static TransitionSet LIZLLL(final boolean z, int i, final InterfaceC1631620sYq interfaceC1631620sYq) {
        TransitionSet transitionSet = new TransitionSet();
        if (z && i == 2) {
            return null;
        }
        AbstractC422960GiE abstractC422960GiE = new AbstractC422960GiE() { // from class: X.0GiB
            @Override // X.AbstractC422960GiE
            public final boolean LIZIZ(View view) {
                if (view != null) {
                    return Intrinsics.LJFF(view.getTag(R.id.w9b), Boolean.TRUE);
                }
                return false;
            }

            @Override // X.AbstractC422960GiE
            public final void LIZJ(TransitionValues transitionValues, boolean z2) {
                View view = transitionValues.view;
                transitionValues.values.put("custom_view_size", new Size(view.getWidth(), view.getHeight()));
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                transitionValues.values.put("custom_view_coordinator", new Point(iArr[0], iArr[1]));
            }

            @Override // android.transition.Transition
            public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
                View view;
                Object obj;
                Size size;
                Object obj2;
                Size size2;
                Object obj3;
                Point point;
                Object obj4;
                Point point2;
                Map map;
                Map map2;
                Map map3;
                Map map4;
                if (transitionValues2 != null) {
                    view = transitionValues2.view;
                } else {
                    view = null;
                }
                if (transitionValues != null && (map4 = transitionValues.values) != null) {
                    obj = map4.get("custom_view_size");
                } else {
                    obj = null;
                }
                if (obj instanceof Size) {
                    size = (Size) obj;
                } else {
                    size = null;
                }
                if (transitionValues2 != null && (map3 = transitionValues2.values) != null) {
                    obj2 = map3.get("custom_view_size");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Size) {
                    size2 = (Size) obj2;
                } else {
                    size2 = null;
                }
                if (transitionValues != null && (map2 = transitionValues.values) != null) {
                    obj3 = map2.get("custom_view_coordinator");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof Point) {
                    point = (Point) obj3;
                } else {
                    point = null;
                }
                if (transitionValues2 != null && (map = transitionValues2.values) != null) {
                    obj4 = map.get("custom_view_coordinator");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof Point) {
                    point2 = (Point) obj4;
                } else {
                    point2 = null;
                }
                if (!LIZIZ(view)) {
                    return null;
                }
                if (view != null && size != null && size2 != null && point != null && point2 != null) {
                    float width = size.getWidth() / size2.getWidth();
                    float height = size.getHeight() / size2.getHeight();
                    float f = point.x - point2.x;
                    float f2 = point.y - point2.y;
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create scale animation from [");
                    sbLIZ.append(width);
                    sbLIZ.append(", ");
                    sbLIZ.append(height);
                    sbLIZ.append("] to [1, 1].  [");
                    sbLIZ.append(f);
                    sbLIZ.append(", ");
                    sbLIZ.append(f2);
                    sbLIZ.append("] to [0, 0]");
                    C1720106oR.LJI("Story-Transition", C2188811AlT.LIZIZ(sbLIZ));
                    view.setPivotX(0.0f);
                    view.setPivotY(0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, C422910Gi9.LIZ(1.0f, Float.valueOf(width)), 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, C422910Gi9.LIZ(1.0f, Float.valueOf(height)), 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, C422910Gi9.LIZ(0.0f, Float.valueOf(f)), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, C422910Gi9.LIZ(0.0f, Float.valueOf(f2)), 0.0f));
                    return animatorSet;
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("scale transition ignored due to null values: ");
                sbLIZ2.append(view);
                sbLIZ2.append(", ");
                sbLIZ2.append(size);
                sbLIZ2.append(", ");
                sbLIZ2.append(size2);
                sbLIZ2.append(", ");
                sbLIZ2.append(point);
                sbLIZ2.append(", ");
                sbLIZ2.append(point2);
                C1720106oR.LIZ("Story-Transition", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
        };
        abstractC422960GiE.LL = z;
        transitionSet.addTransition(abstractC422960GiE);
        AbstractC422960GiE abstractC422960GiE2 = new AbstractC422960GiE() { // from class: X.0Gi5
            public static final float LLILLJJLI = C339190DRl.LIZ(37);
            public static final float LLILLL = C339190DRl.LIZ(14);

            @Override // X.AbstractC422960GiE
            public final boolean LIZIZ(View view) {
                if (view != null) {
                    return Intrinsics.LJFF(view.getTag(R.id.w9b), Boolean.TRUE);
                }
                return false;
            }

            @Override // X.AbstractC422960GiE
            public final void LIZJ(TransitionValues transitionValues, boolean z2) {
                float f;
                Map map = transitionValues.values;
                if (z2 ^ this.LL) {
                    f = LLILLJJLI;
                } else {
                    f = LLILLL;
                }
                map.put("custom_radius_layout_corner_radius", Float.valueOf(f));
            }

            @Override // android.transition.Transition
            public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
                View view;
                Object obj;
                Float f;
                Object obj2;
                Float f2;
                Map map;
                Map map2;
                if (transitionValues2 != null) {
                    view = transitionValues2.view;
                } else {
                    view = null;
                }
                if (transitionValues != null && (map2 = transitionValues.values) != null) {
                    obj = map2.get("custom_radius_layout_corner_radius");
                } else {
                    obj = null;
                }
                if (obj instanceof Float) {
                    f = (Float) obj;
                } else {
                    f = null;
                }
                if (transitionValues2 != null && (map = transitionValues2.values) != null) {
                    obj2 = map.get("custom_radius_layout_corner_radius");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Float) {
                    f2 = (Float) obj2;
                } else {
                    f2 = null;
                }
                if (!LIZIZ(view)) {
                    return null;
                }
                if (view != null && f != null && f2 != null) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create reversed: ");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(" radius animation through ");
                    sbLIZ.append(f);
                    sbLIZ.append(" -> ");
                    sbLIZ.append(f2);
                    C1720106oR.LJI("Story-Transition", C2188811AlT.LIZIZ(sbLIZ));
                    view.setClipToOutline(true);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f.floatValue(), f2.floatValue());
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 4));
                    return valueAnimatorOfFloat;
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("radius transition ignored due to null values: ");
                sbLIZ2.append(view);
                sbLIZ2.append(", ");
                sbLIZ2.append(f);
                sbLIZ2.append(", ");
                sbLIZ2.append(f2);
                C1720106oR.LIZ("Story-Transition", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
        };
        abstractC422960GiE2.LL = z;
        transitionSet.addTransition(abstractC422960GiE2);
        if (z) {
            if (i == 1) {
                AbstractC422960GiE abstractC422960GiE3 = new AbstractC422960GiE() { // from class: X.0Gi6
                    @Override // X.AbstractC422960GiE
                    public final boolean LIZIZ(View view) {
                        if (view != null) {
                            return Intrinsics.LJFF(view.getTag(R.id.w9b), Boolean.TRUE);
                        }
                        return false;
                    }

                    @Override // X.AbstractC422960GiE
                    public final void LIZJ(TransitionValues transitionValues, boolean z2) {
                        float f;
                        Map map = transitionValues.values;
                        if (z2 ^ this.LL) {
                            f = 0.0f;
                        } else {
                            f = 1.0f;
                        }
                        map.put("custom_key_alpha", Float.valueOf(f));
                    }

                    @Override // android.transition.Transition
                    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
                        View view;
                        Object obj;
                        Float f;
                        Object obj2;
                        Float f2;
                        Map map;
                        Map map2;
                        if (transitionValues2 != null) {
                            view = transitionValues2.view;
                        } else {
                            view = null;
                        }
                        if (transitionValues != null && (map2 = transitionValues.values) != null) {
                            obj = map2.get("custom_key_alpha");
                        } else {
                            obj = null;
                        }
                        if (obj instanceof Float) {
                            f = (Float) obj;
                        } else {
                            f = null;
                        }
                        if (transitionValues2 != null && (map = transitionValues2.values) != null) {
                            obj2 = map.get("custom_key_alpha");
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof Float) {
                            f2 = (Float) obj2;
                        } else {
                            f2 = null;
                        }
                        if (view != null && f != null && f2 != null) {
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("create reversed:");
                            sbLIZ.append(this.LL);
                            sbLIZ.append(" fade transition from ");
                            sbLIZ.append(f);
                            sbLIZ.append(" -> ");
                            sbLIZ.append(f2);
                            C1720106oR.LJI("Story-Transition", C2188811AlT.LIZIZ(sbLIZ));
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f.floatValue(), f2.floatValue());
                            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIL());
                            return objectAnimatorOfFloat;
                        }
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fade transition ignored due to null values: ");
                        sbLIZ2.append(view);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(f);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(f2);
                        C1720106oR.LIZ("Story-Transition", C2188811AlT.LIZIZ(sbLIZ2));
                        return null;
                    }
                };
                abstractC422960GiE3.LL = z;
                transitionSet.addTransition(abstractC422960GiE3);
            }
        } else if (i == 2) {
            transitionSet.addTransition(new AbstractC422960GiE() { // from class: X.0Gi8
                @Override // X.AbstractC422960GiE
                public final boolean LIZIZ(View view) {
                    if (view != null) {
                        return Intrinsics.LJFF(view.getTag(R.id.w9d), Boolean.TRUE);
                    }
                    return false;
                }

                @Override // X.AbstractC422960GiE
                public final void LIZJ(TransitionValues transitionValues, boolean z2) {
                    if (z2) {
                        transitionValues.view.getLocationOnScreen(new int[2]);
                        transitionValues.values.put("custom_translation_Y", Float.valueOf(r2[1]));
                        return;
                    }
                    transitionValues.values.put("custom_translation_Y", Float.valueOf(transitionValues.view.getHeight()));
                }

                @Override // android.transition.Transition
                public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
                    View view;
                    Object obj;
                    Float f;
                    Object obj2;
                    Float f2;
                    Map map;
                    Map map2;
                    if (transitionValues2 != null) {
                        view = transitionValues2.view;
                    } else {
                        view = null;
                    }
                    if (transitionValues != null && (map2 = transitionValues.values) != null) {
                        obj = map2.get("custom_translation_Y");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Float) {
                        f = (Float) obj;
                    } else {
                        f = null;
                    }
                    if (transitionValues2 != null && (map = transitionValues2.values) != null) {
                        obj2 = map.get("custom_translation_Y");
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof Float) {
                        f2 = (Float) obj2;
                    } else {
                        f2 = null;
                    }
                    if (!LIZIZ(view)) {
                        return null;
                    }
                    if (view != null && f != null && f2 != null) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("slide out animator ");
                        sbLIZ.append(view);
                        sbLIZ.append(", ");
                        sbLIZ.append(f);
                        sbLIZ.append(", ");
                        sbLIZ.append(f2);
                        C1720106oR.LJI("Story-Transition", C2188811AlT.LIZIZ(sbLIZ));
                        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, C422910Gi9.LIZ(0.0f, f), C422910Gi9.LIZ(view.getHeight(), f2));
                    }
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("slide out transition ignored due to null values. ");
                    sbLIZ2.append(view);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(f);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(f2);
                    C1720106oR.LIZ("Story-Transition", C2188811AlT.LIZIZ(sbLIZ2));
                    return null;
                }
            });
        }
        transitionSet.setDuration(((Number) C0BHU.LIZ.getValue()).longValue());
        transitionSet.addListener((Transition.TransitionListener) new C721930STn() { // from class: X.0STl
            @Override // X.C721930STn, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                super.onTransitionEnd(transition);
                InterfaceC1631620sYq<Boolean, Boolean, Transition, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(Boolean.valueOf(!z), Boolean.FALSE, transition);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                InterfaceC1631620sYq<Boolean, Boolean, Transition, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(Boolean.valueOf(!z), Boolean.TRUE, transition);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
        return transitionSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        if (r5 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.transition.Transition LJ(int r3, boolean r4, boolean r5) {
        /*
            r2 = 0
            if (r3 == 0) goto L7
            if (r4 != 0) goto L8
            if (r5 == 0) goto Lb
        L7:
            return r2
        L8:
            r4 = r4 ^ r5
            if (r4 != 0) goto Lf
        Lb:
            r0 = 2
            if (r3 != r0) goto Lf
            return r2
        Lf:
            android.transition.Fade r2 = new android.transition.Fade
            r2.<init>()
            X.01GW r0 = X.C0BHU.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r2.setDuration(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C721900STk.LJ(int, boolean, boolean):android.transition.Transition");
    }

    @Override // X.InterfaceC721960STq
    public final void LIZIZ(C19EG c19eg, View[] viewArr, int i, final InterfaceC1631620sYq interfaceC1631620sYq) {
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            return;
        }
        int length = viewArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            View view = viewArr[i2];
            int i4 = i3 + 1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("story_fyp_transition_anchor-");
            sbLIZ.append(i3);
            C14K9.LJIJJLI(view, C2188811AlT.LIZIZ(sbLIZ));
            if (i3 != 0) {
                if (i3 == 1) {
                    view.setTag(R.id.w9d, Boolean.TRUE);
                }
            } else {
                view.setTag(R.id.w9b, Boolean.TRUE);
            }
            i2++;
            i3 = i4;
        }
        c19eg.getWindow().setSharedElementsUseOverlay(false);
        Window window = c19eg.getWindow();
        LIZ.getClass();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setDuration(((Number) C0BHU.LIZ.getValue()).longValue());
        transitionSet.addListener((Transition.TransitionListener) new C721930STn() { // from class: X.0STm
            public final /* synthetic */ boolean LIZJ = true;

            {
                super(0);
            }

            @Override // X.C721930STn, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                super.onTransitionEnd(transition);
                InterfaceC1631620sYq<Boolean, Boolean, Transition, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(Boolean.valueOf(this.LIZJ), Boolean.FALSE, transition);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition) {
                InterfaceC1631620sYq<Boolean, Boolean, Transition, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                if (interfaceC1631620sYq2 != null) {
                    interfaceC1631620sYq2.invoke(Boolean.valueOf(this.LIZJ), Boolean.TRUE, transition);
                }
            }
        });
        window.setSharedElementReenterTransition(transitionSet);
        c19eg.getWindow().setReenterTransition(LJ(i, true, true));
        C13LE.LIZ(c19eg.getClass()).LJI();
        c19eg.setExitSharedElementCallback(new SharedElementCallbackC721950STp(null));
        C13LE.LIZ(c19eg.getClass()).LJI();
        c19eg.setEnterSharedElementCallback(new SharedElementCallbackC721950STp(null));
    }

    @Override // X.InterfaceC721960STq
    public final void LIZ(Activity activity, View[] viewArr, int i, InterfaceC1631620sYq<? super Boolean, ? super List<String>, ? super Map<String, View>, Unit> interfaceC1631620sYq, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super Transition, Unit> interfaceC1631620sYq2) {
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            return;
        }
        if (activity == null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("configContentTransition return due to null parameters. ");
            sbLIZ.append(activity);
            C1720106oR.LIZ("StoryAnimationManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int length = viewArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            View view = viewArr[i3];
            int i5 = i4 + 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("story_fyp_transition_anchor-");
            sbLIZ2.append(i4);
            C14K9.LJIJJLI(view, C2188811AlT.LIZIZ(sbLIZ2));
            if (i4 != 0) {
                if (i4 == 1) {
                    view.setTag(R.id.w9d, Boolean.TRUE);
                }
            } else {
                view.setTag(R.id.w9b, Boolean.TRUE);
            }
            i3++;
            i4 = i5;
        }
        Window window = activity.getWindow();
        LIZ.getClass();
        window.setSharedElementReturnTransition(LIZLLL(true, i, interfaceC1631620sYq2));
        activity.getWindow().setAllowReturnTransitionOverlap(true);
        activity.getWindow().setReturnTransition(LJ(i, false, false));
        activity.getWindow().setSharedElementEnterTransition(LIZLLL(false, i, interfaceC1631620sYq2));
        activity.getWindow().setEnterTransition(LJ(i, false, true));
        activity.getWindow().setAllowEnterTransitionOverlap(true);
        C13LE.LIZ(activity.getClass()).LJI();
        activity.setExitSharedElementCallback(new SharedElementCallbackC721950STp(new AwS625S0100000_11((InterfaceC1631620sYq) interfaceC1631620sYq, (InterfaceC1631620sYq<? super Boolean, ? super List<String>, ? super Map<String, View>, Unit>) 163)));
        C13LE.LIZ(activity.getClass()).LJI();
        activity.setEnterSharedElementCallback(new SharedElementCallbackC721950STp(new AwS625S0100000_11((InterfaceC1631620sYq) interfaceC1631620sYq, (InterfaceC1631620sYq<? super Boolean, ? super List<String>, ? super Map<String, View>, Unit>) 164)));
    }
}
