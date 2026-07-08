package X;

import Y.ALAdapterS3S0100000_6;
import Y.ATListenerS450S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Looper;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.ToolbarTipsVisibilityChannel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import wh6.AbS329S0300000_17;

/* JADX INFO: renamed from: X.0ej1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099770ej1 implements InterfaceC1102150emr, InterfaceC512840K9i, InterfaceC1102160ems {
    public static C1099960ejK LLILLJJLI;
    public static C1099800ej4 LLILLL;
    public static C1099810ej5 LLILZ;
    public static C1099780ej2 LLILZIL;
    public static final C1099770ej1 LL = new C1099770ej1();
    public static final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public static final C1099740eiy LLIZ = new InterfaceC1096630edx() { // from class: X.0eiy
        @Override // X.InterfaceC1096630edx
        public final boolean LIZIZ() {
            return true;
        }

        @Override // X.InterfaceC1096630edx
        public final Map<Integer, List<String>> LIZJ() {
            return null;
        }

        @Override // X.InterfaceC1096630edx
        public final int LIZLLL() {
            return 16;
        }

        @Override // X.InterfaceC1096630edx
        public final void LJI() {
        }

        @Override // X.InterfaceC1096630edx
        public final void LIZ() {
            C1099770ej1.LL.getClass();
            C1099770ej1.LIZJ(false);
        }

        @Override // X.InterfaceC1096630edx
        public final boolean LJ(boolean z) {
            PopupWindow popupWindow;
            C1099810ej5 c1099810ej5 = C1099770ej1.LLILZ;
            if (c1099810ej5 == null || (popupWindow = c1099810ej5.LIZ) == null || !popupWindow.isShowing()) {
                return false;
            }
            return true;
        }

        @Override // X.InterfaceC1096630edx
        public final boolean LJFF(String str, Object obj) {
            PopupWindow popupWindow;
            DataChannel dataChannel;
            C1099810ej5 c1099810ej5 = C1099770ej1.LLILZ;
            if (c1099810ej5 == null || (popupWindow = c1099810ej5.LIZ) == null || !popupWindow.isShowing()) {
                return false;
            }
            C1102070emj c1102070emj = C1102070emj.LIZ;
            C1099960ejK c1099960ejK = C1099770ej1.LLILLJJLI;
            if (c1099960ejK != null) {
                dataChannel = c1099960ejK.LIZJ;
            } else {
                dataChannel = null;
            }
            C1099770ej1 c1099770ej1 = C1099770ej1.LL;
            C1102070emj.LJIJI(c1102070emj, dataChannel, c1099770ej1, C1099770ej1.LLILZIL, this);
            c1099770ej1.getClass();
            C1099770ej1.LIZIZ(false, null);
            return true;
        }
    };

    @Override // X.InterfaceC1102150emr
    public final List<String> Q0() {
        return null;
    }

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return true;
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 16;
    }

    @Override // X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return null;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.TIPS;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 161) {
                return "Links";
            }
            if (num.intValue() == 162) {
                return "Leads";
            }
            if (num.intValue() == 163) {
                return "DM";
            }
            if (num.intValue() == 164) {
                return "Shop";
            }
            if (num.intValue() == 165) {
                return "Game";
            }
            if (num.intValue() == 166) {
                return "Subscription";
            }
            if (num.intValue() == 167) {
                return "Multi";
            }
            if (num.intValue() == 168) {
                return "Rose";
            }
            if (num.intValue() == 169) {
                return "Gift";
            }
            if (num.intValue() == 171) {
                return "Share";
            }
            return "";
        }
        return "";
    }

    public static void LIZJ(boolean z) {
        DataChannel dataChannel;
        Function0<Unit> function0;
        Context context;
        EnumC1102740eno enumC1102740enoLJ;
        TBViewModel viewModel;
        C1102690enj c1102690enjHy0;
        View viewLJI;
        Window window;
        View decorView;
        int measuredHeight;
        LiveIconView liveIconView;
        View viewFindViewById;
        C1099960ejK c1099960ejK = LLILLJJLI;
        if (c1099960ejK != null && (dataChannel = c1099960ejK.LIZJ) != null) {
            if (z) {
                C1099800ej4 c1099800ej4 = LLILLL;
                if (c1099800ej4 != null && (context = c1099960ejK.LIZ) != null && (enumC1102740enoLJ = C1103080eoM.LJ(c1099800ej4.LIZ)) != null && (viewModel = enumC1102740enoLJ.getViewModel(dataChannel)) != null && viewModel.isVisible() && (c1102690enjHy0 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).hy0(dataChannel)) != null && (viewLJI = c1102690enjHy0.LJI(enumC1102740enoLJ)) != null) {
                    C1099790ej3 c1099790ej3 = new C1099790ej3(context);
                    View rootView = viewLJI.getRootView();
                    ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
                    if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
                        rootView.getWindowVisibleDisplayFrame(c1099790ej3.LLILLJJLI);
                    } else {
                        Context context2 = viewLJI.getContext();
                        while (true) {
                            if (!(context2 instanceof ContextWrapper)) {
                                break;
                            }
                            if (context2 instanceof Activity) {
                                C19EG c19egLIZ = C1124140fMK.LIZ(context2);
                                if (c19egLIZ != null && (window = c19egLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                                    decorView.getWindowVisibleDisplayFrame(c1099790ej3.LLILLJJLI);
                                }
                            } else {
                                context2 = ((ContextWrapper) context2).getBaseContext();
                            }
                        }
                    }
                    int[] iArr = new int[2];
                    viewLJI.getLocationOnScreen(iArr);
                    Rect rect = c1099790ej3.LLILLL;
                    int i = iArr[0];
                    rect.left = i;
                    rect.top = iArr[1];
                    rect.right = i + viewLJI.getWidth();
                    c1099790ej3.LLILLL.bottom = iArr[1] + viewLJI.getHeight();
                    View viewSd = C786410Ut5.Sd(R.layout.hwg, C786410Ut5.ne(c1099790ej3.getContext()), null);
                    TextView textView = (TextView) viewSd.findViewById(R.id.y84);
                    if (textView != null) {
                        textView.setText(c1099800ej4.LIZIZ);
                    }
                    if (c1099800ej4.LJ && (viewFindViewById = viewSd.findViewById(R.id.y81)) != null) {
                        C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    }
                    if (c1099800ej4.LIZLLL > 0 && (liveIconView = (LiveIconView) viewSd.findViewById(R.id.y83)) != null) {
                        C786410Ut5.LLJJIJIL(liveIconView, 0);
                        liveIconView.setIcon(c1099800ej4.LIZLLL);
                    }
                    C418980Gbo c418980Gbo = c1099790ej3.LL;
                    Rect rect2 = c1099790ej3.LLILLJJLI;
                    Rect rect3 = c1099790ej3.LLILLL;
                    c418980Gbo.LLIZLLLIL = viewLJI;
                    c418980Gbo.LLJ = viewSd;
                    c418980Gbo.LLJI.set(rect2);
                    c418980Gbo.LLJIJIL.set(rect3);
                    c418980Gbo.LLJILJILJ.setColor(C20736316Cj.LIZIZ(R.attr.c9i, c418980Gbo.getContext()));
                    c418980Gbo.LLJILLL.setFillType(Path.FillType.WINDING);
                    c418980Gbo.setWillNotDraw(false);
                    c418980Gbo.addView(c418980Gbo.LLJ, -1, -1);
                    C418980Gbo c418980Gbo2 = c1099790ej3.LL;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams2.setMarginStart(C497740JfY.LJIIIZ(R.dimen.b01));
                    layoutParams2.topMargin = C497740JfY.LJIIIZ(R.dimen.b04);
                    layoutParams2.setMarginEnd(C497740JfY.LJIIIZ(R.dimen.b03));
                    layoutParams2.bottomMargin = C497740JfY.LJIIIZ(R.dimen.azy);
                    c1099790ej3.addView(c418980Gbo2, layoutParams2);
                    Rect windowRect = c1099790ej3.getWindowRect();
                    c1099790ej3.measure(View.MeasureSpec.makeMeasureSpec(windowRect.width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(windowRect.height(), Integer.MIN_VALUE));
                    PopupWindow popupWindow = new PopupWindow((View) c1099790ej3, c1099790ej3.getMeasuredWidth(), c1099790ej3.getMeasuredHeight(), true);
                    final float pivotX = c1099790ej3.getPivotX();
                    final float pivotY = c1099790ej3.getPivotY();
                    final EnumC429030Gs1 enumC429030Gs1 = EnumC429030Gs1.ENTER;
                    popupWindow.setEnterTransition(new Transition(pivotX, pivotY, enumC429030Gs1) { // from class: X.0GiG
                        public final float LL;
                        public final float LLILLJJLI;
                        public final EnumC429030Gs1 LLILLL;

                        @Override // android.transition.Transition
                        public final Transition addTarget(View view) {
                            view.setPivotX(this.LL);
                            view.setPivotY(this.LLILLJJLI);
                            return super.addTarget(view);
                        }

                        @Override // android.transition.Transition
                        public final void captureEndValues(TransitionValues transitionValues) {
                            int i2 = C422990GiH.LIZ[this.LLILLL.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    transitionValues.values.put("scaleX", Float.valueOf(0.0f));
                                    transitionValues.values.put("scaleY", Float.valueOf(0.0f));
                                    transitionValues.values.put("alpha", Float.valueOf(0.0f));
                                    return;
                                }
                                throw new C1954807lC();
                            }
                            transitionValues.values.put("scaleX", Float.valueOf(1.0f));
                            transitionValues.values.put("scaleY", Float.valueOf(1.0f));
                            transitionValues.values.put("alpha", Float.valueOf(1.0f));
                        }

                        @Override // android.transition.Transition
                        public final void captureStartValues(TransitionValues transitionValues) {
                            int i2 = C422990GiH.LIZ[this.LLILLL.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    transitionValues.values.put("scaleX", Float.valueOf(1.0f));
                                    transitionValues.values.put("scaleY", Float.valueOf(1.0f));
                                    transitionValues.values.put("alpha", Float.valueOf(1.0f));
                                    return;
                                }
                                throw new C1954807lC();
                            }
                            transitionValues.values.put("scaleX", Float.valueOf(0.0f));
                            transitionValues.values.put("scaleY", Float.valueOf(0.0f));
                            transitionValues.values.put("alpha", Float.valueOf(0.0f));
                        }

                        {
                            this.LL = pivotX;
                            this.LLILLJJLI = pivotY;
                            this.LLILLL = enumC429030Gs1;
                        }

                        @Override // android.transition.Transition
                        public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
                            Object obj;
                            Float f;
                            Float f2;
                            Float f3;
                            Object obj2;
                            Float f4;
                            Float f5;
                            Float f6;
                            Map map;
                            Map map2;
                            if (transitionValues != null && (map2 = transitionValues.values) != null) {
                                obj = map2.get("scaleX");
                            } else {
                                obj = null;
                            }
                            if ((obj instanceof Float) && (f = (Float) obj) != null) {
                                float fFloatValue = f.floatValue();
                                Object obj3 = transitionValues.values.get("scaleY");
                                if ((obj3 instanceof Float) && (f2 = (Float) obj3) != null) {
                                    float fFloatValue2 = f2.floatValue();
                                    Object obj4 = transitionValues.values.get("alpha");
                                    if ((obj4 instanceof Float) && (f3 = (Float) obj4) != null) {
                                        float fFloatValue3 = f3.floatValue();
                                        if (transitionValues2 != null && (map = transitionValues2.values) != null) {
                                            obj2 = map.get("scaleX");
                                        } else {
                                            obj2 = null;
                                        }
                                        if ((obj2 instanceof Float) && (f4 = (Float) obj2) != null) {
                                            float fFloatValue4 = f4.floatValue();
                                            Object obj5 = transitionValues2.values.get("scaleY");
                                            if ((obj5 instanceof Float) && (f5 = (Float) obj5) != null) {
                                                float fFloatValue5 = f5.floatValue();
                                                Object obj6 = transitionValues2.values.get("alpha");
                                                if ((obj6 instanceof Float) && (f6 = (Float) obj6) != null) {
                                                    float fFloatValue6 = f6.floatValue();
                                                    View view = transitionValues.view;
                                                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, fFloatValue, fFloatValue4);
                                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, fFloatValue2, fFloatValue5);
                                                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, fFloatValue3, fFloatValue6);
                                                    objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                                                    AnimatorSet animatorSet = new AnimatorSet();
                                                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                                                    animatorSet.addListener(new ALAdapterS3S0100000_6(view, 63));
                                                    return animatorSet;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                    });
                    final float pivotX2 = c1099790ej3.getPivotX();
                    final float pivotY2 = c1099790ej3.getPivotY();
                    final EnumC429030Gs1 enumC429030Gs12 = EnumC429030Gs1.EXIT;
                    popupWindow.setExitTransition(new Transition(pivotX2, pivotY2, enumC429030Gs12) { // from class: X.0GiG
                        public final float LL;
                        public final float LLILLJJLI;
                        public final EnumC429030Gs1 LLILLL;

                        @Override // android.transition.Transition
                        public final Transition addTarget(View view) {
                            view.setPivotX(this.LL);
                            view.setPivotY(this.LLILLJJLI);
                            return super.addTarget(view);
                        }

                        @Override // android.transition.Transition
                        public final void captureEndValues(TransitionValues transitionValues) {
                            int i2 = C422990GiH.LIZ[this.LLILLL.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    transitionValues.values.put("scaleX", Float.valueOf(0.0f));
                                    transitionValues.values.put("scaleY", Float.valueOf(0.0f));
                                    transitionValues.values.put("alpha", Float.valueOf(0.0f));
                                    return;
                                }
                                throw new C1954807lC();
                            }
                            transitionValues.values.put("scaleX", Float.valueOf(1.0f));
                            transitionValues.values.put("scaleY", Float.valueOf(1.0f));
                            transitionValues.values.put("alpha", Float.valueOf(1.0f));
                        }

                        @Override // android.transition.Transition
                        public final void captureStartValues(TransitionValues transitionValues) {
                            int i2 = C422990GiH.LIZ[this.LLILLL.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    transitionValues.values.put("scaleX", Float.valueOf(1.0f));
                                    transitionValues.values.put("scaleY", Float.valueOf(1.0f));
                                    transitionValues.values.put("alpha", Float.valueOf(1.0f));
                                    return;
                                }
                                throw new C1954807lC();
                            }
                            transitionValues.values.put("scaleX", Float.valueOf(0.0f));
                            transitionValues.values.put("scaleY", Float.valueOf(0.0f));
                            transitionValues.values.put("alpha", Float.valueOf(0.0f));
                        }

                        {
                            this.LL = pivotX2;
                            this.LLILLJJLI = pivotY2;
                            this.LLILLL = enumC429030Gs12;
                        }

                        @Override // android.transition.Transition
                        public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
                            Object obj;
                            Float f;
                            Float f2;
                            Float f3;
                            Object obj2;
                            Float f4;
                            Float f5;
                            Float f6;
                            Map map;
                            Map map2;
                            if (transitionValues != null && (map2 = transitionValues.values) != null) {
                                obj = map2.get("scaleX");
                            } else {
                                obj = null;
                            }
                            if ((obj instanceof Float) && (f = (Float) obj) != null) {
                                float fFloatValue = f.floatValue();
                                Object obj3 = transitionValues.values.get("scaleY");
                                if ((obj3 instanceof Float) && (f2 = (Float) obj3) != null) {
                                    float fFloatValue2 = f2.floatValue();
                                    Object obj4 = transitionValues.values.get("alpha");
                                    if ((obj4 instanceof Float) && (f3 = (Float) obj4) != null) {
                                        float fFloatValue3 = f3.floatValue();
                                        if (transitionValues2 != null && (map = transitionValues2.values) != null) {
                                            obj2 = map.get("scaleX");
                                        } else {
                                            obj2 = null;
                                        }
                                        if ((obj2 instanceof Float) && (f4 = (Float) obj2) != null) {
                                            float fFloatValue4 = f4.floatValue();
                                            Object obj5 = transitionValues2.values.get("scaleY");
                                            if ((obj5 instanceof Float) && (f5 = (Float) obj5) != null) {
                                                float fFloatValue5 = f5.floatValue();
                                                Object obj6 = transitionValues2.values.get("alpha");
                                                if ((obj6 instanceof Float) && (f6 = (Float) obj6) != null) {
                                                    float fFloatValue6 = f6.floatValue();
                                                    View view = transitionValues.view;
                                                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, fFloatValue, fFloatValue4);
                                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, fFloatValue2, fFloatValue5);
                                                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, fFloatValue3, fFloatValue6);
                                                    objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                                                    AnimatorSet animatorSet = new AnimatorSet();
                                                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                                                    animatorSet.addListener(new ALAdapterS3S0100000_6(view, 63));
                                                    return animatorSet;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                    });
                    popupWindow.setAnimationStyle(0);
                    int measuredWidth = (-(c1099790ej3.getMeasuredWidth() - viewLJI.getWidth())) / 2;
                    int height = (-c1099790ej3.getMeasuredHeight()) - viewLJI.getHeight();
                    Rect anchorRect = c1099790ej3.getAnchorRect();
                    int i2 = anchorRect.left;
                    int i3 = i2 + measuredWidth;
                    int i4 = windowRect.left;
                    if (i3 < i4) {
                        measuredWidth = i4 - i2;
                    } else {
                        int measuredWidth2 = i3 + c1099790ej3.getMeasuredWidth();
                        int i5 = windowRect.right;
                        if (measuredWidth2 > i5) {
                            measuredWidth = (i5 - anchorRect.left) - c1099790ej3.getMeasuredWidth();
                        }
                    }
                    int i6 = anchorRect.bottom;
                    int i7 = i6 + height;
                    int i8 = windowRect.top;
                    if (i7 < i8) {
                        measuredHeight = i8 - i6;
                    } else {
                        int measuredHeight2 = i7 + c1099790ej3.getMeasuredHeight();
                        int i9 = windowRect.bottom;
                        if (measuredHeight2 > i9) {
                            measuredHeight = (i9 - anchorRect.bottom) - c1099790ej3.getMeasuredHeight();
                        } else {
                            measuredHeight = height;
                        }
                    }
                    viewLJI.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0ej0
                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewAttachedToWindow(View view) {
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewDetachedFromWindow(View view) {
                            C1099770ej1 c1099770ej1 = C1099770ej1.LL;
                            C0KAJ c0kaj = C0KAJ.AUTO_TERMINATE;
                            c1099770ej1.getClass();
                            C1099770ej1.LIZIZ(true, c0kaj);
                        }
                    });
                    popupWindow.setFocusable(false);
                    popupWindow.setOutsideTouchable(true);
                    popupWindow.setTouchInterceptor(new ATListenerS450S0100000_17(anchorRect, 11));
                    C786410Ut5.I7(new AbS329S0300000_17(c1099800ej4, dataChannel, enumC1102740enoLJ, 1), c1099790ej3);
                    LLILZ = new C1099810ej5(popupWindow, c1099800ej4, viewLJI, measuredWidth, measuredHeight);
                }
                C1099800ej4 c1099800ej42 = LLILLL;
                if (c1099800ej42 != null && (function0 = c1099800ej42.LJI) != null) {
                    function0.invoke();
                }
            }
            C1099810ej5 c1099810ej5 = LLILZ;
            if (c1099810ej5 != null) {
                BPEAHandler bPEAHandler = LLILZLL;
                bPEAHandler.removeCallbacksAndMessages(null);
                C786410Ut5.LJLIIL(c1099810ej5.LIZIZ.LIZJ, bPEAHandler, new Runnable() { // from class: X.0eiz
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ToolbarTipsController@9acb.showInternal$1$1");
                        try {
                            C1099770ej1 c1099770ej1 = C1099770ej1.LL;
                            C0KAJ c0kaj = C0KAJ.AUTO_TIMEOUT;
                            c1099770ej1.getClass();
                            C1099770ej1.LIZIZ(true, c0kaj);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ToolbarTipsController@9acb.showInternal$1$1");
                    }
                });
                C786410Ut5.j3(c1099810ej5.LIZ, c1099810ej5.LIZJ, c1099810ej5.LIZLLL, c1099810ej5.LJ, 3);
                dataChannel.zW(ToolbarTipsVisibilityChannel.class, Boolean.TRUE);
            }
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        boolean z;
        DataChannel dataChannel;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZJ(z);
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C1099960ejK c1099960ejK = LLILLJJLI;
        if (c1099960ejK != null) {
            dataChannel = c1099960ejK.LIZJ;
        } else {
            dataChannel = null;
        }
        c1102070emj.LJIIJ(dataChannel, this, LLILZIL, null);
    }

    public static void LIZIZ(boolean z, C0KAJ c0kaj) {
        DataChannel dataChannel;
        PopupWindow popupWindow;
        DataChannel dataChannel2;
        C1099810ej5 c1099810ej5;
        C1099800ej4 c1099800ej4;
        Function1<C0KAJ, Unit> function1;
        DataChannel dataChannel3;
        C1099810ej5 c1099810ej52;
        C1099800ej4 c1099800ej42;
        Function1<C0KAJ, Unit> function12;
        C1099960ejK c1099960ejK;
        C1099810ej5 c1099810ej53;
        C1099800ej4 c1099800ej43;
        Function1<C0KAJ, Unit> function13;
        if (z && c0kaj == null) {
            throw new IllegalArgumentException("parameter \"consume method\" is necessary when lifecycle ended");
        }
        LLILZLL.removeCallbacksAndMessages(null);
        C1099810ej5 c1099810ej54 = LLILZ;
        if (c1099810ej54 != null && (popupWindow = c1099810ej54.LIZ) != null && popupWindow.isShowing()) {
            try {
                try {
                    popupWindow.dismiss();
                    if (c0kaj != null && (c1099810ej53 = LLILZ) != null && (c1099800ej43 = c1099810ej53.LIZIZ) != null && (function13 = c1099800ej43.LJIIIIZZ) != null) {
                        function13.invoke(c0kaj);
                    }
                    c1099960ejK = LLILLJJLI;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (c0kaj != null && (c1099810ej52 = LLILZ) != null && (c1099800ej42 = c1099810ej52.LIZIZ) != null && (function12 = c1099800ej42.LJIIIIZZ) != null) {
                        function12.invoke(c0kaj);
                    }
                    C1099960ejK c1099960ejK2 = LLILLJJLI;
                    if (c1099960ejK2 != null && (dataChannel3 = c1099960ejK2.LIZJ) != null) {
                    }
                }
                if (c1099960ejK != null && (dataChannel3 = c1099960ejK.LIZJ) != null) {
                    dataChannel3.zW(ToolbarTipsVisibilityChannel.class, Boolean.FALSE);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (c0kaj != null && (c1099810ej5 = LLILZ) != null && (c1099800ej4 = c1099810ej5.LIZIZ) != null && (function1 = c1099800ej4.LJIIIIZZ) != null) {
                    function1.invoke(c0kaj);
                }
                C1099960ejK c1099960ejK3 = LLILLJJLI;
                if (c1099960ejK3 != null && (dataChannel2 = c1099960ejK3.LIZJ) != null) {
                    dataChannel2.zW(ToolbarTipsVisibilityChannel.class, Boolean.FALSE);
                }
                throw th;
            }
        }
        if (z) {
            if (c0kaj != null) {
                C1102070emj c1102070emj = C1102070emj.LIZ;
                C1099960ejK c1099960ejK4 = LLILLJJLI;
                if (c1099960ejK4 != null) {
                    dataChannel = c1099960ejK4.LIZJ;
                } else {
                    dataChannel = null;
                }
                C1102070emj.LJIILJJIL(c1102070emj, dataChannel, LL, LLILZIL, c0kaj, null, null, 112);
            }
            LLILLL = null;
            LLILZ = null;
            LLILZIL = null;
        }
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) {
        LLFFF(i);
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        C0KAJ c0kaj;
        C1099810ej5 c1099810ej5;
        PopupWindow popupWindow;
        C1099800ej4 c1099800ej4 = LLILLL;
        if (c1099800ej4 != null && !c1099800ej4.LJFF && (c1099810ej5 = LLILZ) != null && (popupWindow = c1099810ej5.LIZ) != null && popupWindow.isShowing()) {
            LIZIZ(true, C0KAJ.NON_RESUMABLE);
            return;
        }
        int i3 = c1102130emp.LIZJ;
        if (i3 != 1) {
            if (i3 != 3) {
                c0kaj = C0KAJ.REACH_MAX_ACTIVE_COUNT;
            } else {
                c0kaj = C0KAJ.SHORT_REMAIN_TIME;
            }
        } else {
            c0kaj = C0KAJ.NON_RESUMABLE;
        }
        LIZIZ(z, c0kaj);
    }
}
