package X;

import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import Y.ACListenerS91S0300000_27;
import Y.ARunnableS38S0101000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.otherpage.image.edit.TakoImageEditSelectAndPreviewSelectItemCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852780yJY extends LinearLayout {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final LinearLayout LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final TuxTextView LLILZ;
    public final FrameLayout LLILZIL;
    public final SmartImageView LLILZLL;
    public final ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public final FrameLayout LLIZLLLIL;
    public boolean LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final View LLJILJIL;
    public final View LLJILJILJ;
    public final View LLJILLL;
    public boolean LLJJ;
    public BaseImage LLJJI;
    public final List<C1852770yJX> LLJJIII;
    public Function1<? super Boolean, Unit> LLJJIJI;
    public Function1<? super Integer, Unit> LLJJIJIIJIL;

    private final float getWidthHeightRation() {
        C1854260yLw c1854260yLw = C1854260yLw.LIZ;
        Float fValueOf = Float.valueOf(this.LLJJI != null ? r0.width : 3.0f);
        Float fValueOf2 = Float.valueOf(this.LLJJI != null ? r0.height : 4.0f);
        c1854260yLw.getClass();
        int iLIZLLL = C1854260yLw.LIZLLL(fValueOf, fValueOf2);
        if (iLIZLLL == 1) {
            return 1.0f;
        }
        if (iLIZLLL == 2) {
            return 0.75f;
        }
        if (iLIZLLL == 3) {
            return 1.3333334f;
        }
        if (iLIZLLL != 4) {
            return iLIZLLL == 5 ? 1.7777778f : 0.75f;
        }
        return 0.5625f;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r8 = this;
            android.widget.FrameLayout r0 = r8.LLILZIL
            r5 = 0
            if (r0 == 0) goto Lbc
            int r0 = r0.getVisibility()
            r7 = 1
            if (r0 != 0) goto Lbc
        Lc:
            android.view.View r2 = r8.LLJI
            r3 = 12
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r2 == 0) goto L38
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto Lb9
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto Lb9
            boolean r0 = r8.LLJJ
            if (r0 == 0) goto Lab
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
        L31:
            r1.height = r0
            r1.weight = r4
        L35:
            X.C786410Ut5.W5(r2, r1)
        L38:
            android.view.View r2 = r8.LLJIJIL
            r5 = 0
            if (r2 == 0) goto L67
            if (r7 == 0) goto La7
            X.C0DSB.LIZJ(r2)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto La5
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto La5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r1.height = r0
            boolean r0 = r8.LLJJ
            if (r0 == 0) goto La3
            r0 = 1065353216(0x3f800000, float:1.0)
        L62:
            r1.weight = r0
        L64:
            X.C786410Ut5.W5(r2, r1)
        L67:
            android.view.View r3 = r8.LLJILJIL
            if (r3 == 0) goto L91
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r0 = r2 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L8e
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            if (r2 == 0) goto L8e
            boolean r1 = r8.LLJJ
            r0 = 16
            if (r1 == 0) goto L92
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r2.height = r0
            r2.weight = r5
        L8d:
            r6 = r2
        L8e:
            X.C786410Ut5.W5(r3, r6)
        L91:
            return
        L92:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r2.height = r0
            r2.weight = r4
            goto L8d
        La3:
            r0 = 0
            goto L62
        La5:
            r1 = r6
            goto L64
        La7:
            X.C0DSB.LIZIZ(r2)
            goto L67
        Lab:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            goto L31
        Lb9:
            r1 = r6
            goto L35
        Lbc:
            r7 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1852780yJY.LIZJ():void");
    }

    public final void LJI() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        View view = this.LLJI;
        LinearLayout.LayoutParams layoutParams3 = null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if (!(layoutParams4 instanceof LinearLayout.LayoutParams) || (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) == null) {
                layoutParams2 = null;
            } else {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                layoutParams2.weight = 1.0f;
            }
            C786410Ut5.W5(view, layoutParams2);
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            C0DSB.LIZIZ(view2);
        }
        View view3 = this.LLJILJIL;
        if (view3 != null) {
            ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
            if ((layoutParams5 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams5) != null) {
                layoutParams.height = this.LLJJ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) : 0;
                layoutParams.weight = 1.0f;
                layoutParams3 = layoutParams;
            }
            C786410Ut5.W5(view3, layoutParams3);
        }
    }

    public final int getNewPreviewImageIndex() {
        C1854260yLw c1854260yLw = C1854260yLw.LIZ;
        c1854260yLw.getClass();
        List<BaseImage> list = C1854260yLw.LIZJ;
        int iIndexOf = ((ArrayList) list).indexOf(this.LLJJI);
        c1854260yLw.getClass();
        return iIndexOf >= ((ArrayList) list).size() + (-1) ? iIndexOf - 1 : iIndexOf;
    }

    public final Pair<Integer, Integer> LIZ(int i) {
        boolean z;
        float widthHeightRation;
        boolean z2 = this.LLJJ;
        FrameLayout frameLayout = this.LLILZIL;
        int measuredHeight = 0;
        boolean z3 = true;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            z = true;
            widthHeightRation = getWidthHeightRation();
        } else {
            z = false;
            widthHeightRation = 0.75f;
        }
        C1854260yLw.LIZ.getClass();
        if (C1854260yLw.LJI()) {
            if (this.LLJJ) {
                LinearLayout linearLayout = this.LL;
                if (linearLayout != null) {
                    measuredHeight = linearLayout.getMeasuredHeight();
                }
                measuredHeight = (measuredHeight - i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                i = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                LinearLayout linearLayout2 = this.LL;
                if (linearLayout2 != null) {
                    measuredHeight = linearLayout2.getMeasuredHeight();
                }
            }
        } else {
            boolean z4 = this.LLJJ;
            FrameLayout frameLayout2 = this.LLILZIL;
            if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
                z3 = false;
            }
            if (z4) {
                if (z3) {
                    LinearLayout linearLayout3 = this.LL;
                    if (linearLayout3 != null) {
                        measuredHeight = linearLayout3.getMeasuredHeight();
                    }
                    measuredHeight = ((measuredHeight - i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    i = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    LinearLayout linearLayout4 = this.LL;
                    if (linearLayout4 != null) {
                        measuredHeight = linearLayout4.getMeasuredHeight();
                    }
                    measuredHeight = (measuredHeight - i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    i = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
            } else if (z3) {
                LinearLayout linearLayout5 = this.LL;
                if (linearLayout5 != null) {
                    measuredHeight = linearLayout5.getMeasuredHeight();
                }
                measuredHeight = (((measuredHeight - i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                i = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                LinearLayout linearLayout6 = this.LL;
                if (linearLayout6 != null) {
                    measuredHeight = linearLayout6.getMeasuredHeight();
                }
            }
        }
        int i2 = measuredHeight - i;
        if (z2) {
            if (z) {
                int screenWidth = ScreenUtils.getScreenWidth(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) * 2);
                if (widthHeightRation <= 1.0f) {
                    float f = i2 * widthHeightRation;
                    float f2 = screenWidth;
                    if (f <= f2) {
                        return new Pair<>(Integer.valueOf((int) f), Integer.valueOf(i2));
                    }
                    return new Pair<>(Integer.valueOf(screenWidth), Integer.valueOf((int) (f2 / widthHeightRation)));
                }
                float f3 = screenWidth / widthHeightRation;
                float f4 = i2;
                if (f3 <= f4) {
                    return new Pair<>(Integer.valueOf(screenWidth), Integer.valueOf((int) f3));
                }
                return new Pair<>(Integer.valueOf((int) (f4 * widthHeightRation)), Integer.valueOf(i2));
            }
            return new Pair<>(Integer.valueOf((i2 * 3) / 4), Integer.valueOf(i2));
        }
        int screenWidth2 = ScreenUtils.getScreenWidth(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)) * 2);
        if (z) {
            float f5 = screenWidth2 / widthHeightRation;
            float f6 = i2;
            if (f5 <= f6) {
                return new Pair<>(Integer.valueOf(screenWidth2), Integer.valueOf((int) f5));
            }
            return new Pair<>(Integer.valueOf((int) (f6 * widthHeightRation)), Integer.valueOf(i2));
        }
        int i3 = (screenWidth2 * 4) / 3;
        if (i3 <= i2) {
            return new Pair<>(Integer.valueOf(screenWidth2), Integer.valueOf(i3));
        }
        return new Pair<>(Integer.valueOf((i2 * 3) / 4), Integer.valueOf(i2));
    }

    public final void LJFF(BaseImage baseImage) {
        String str;
        C20600815jK<InterfaceC1891350zJl> state;
        C1854260yLw.LIZ.getClass();
        List<BaseImage> list = C1854260yLw.LIZJ;
        if (baseImage == null) {
            C1852670yJN.LIZ.getClass();
            if (C1852670yJN.LIZ()) {
                baseImage = (BaseImage) C13LP.LJJJLL(list);
            } else {
                baseImage = (BaseImage) C13LP.LJJLIIIJL(list);
            }
        }
        this.LLJJI = baseImage;
        ((ArrayList) this.LLJJIII).clear();
        List<C1852770yJX> list2 = this.LLJJIII;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            str = null;
            if (!it2.hasNext()) {
                break;
            }
            BaseImage baseImage2 = (BaseImage) it2.next();
            String str2 = baseImage2.imageUuid;
            BaseImage baseImage3 = this.LLJJI;
            if (baseImage3 != null) {
                str = baseImage3.imageUuid;
            }
            arrayList.add(new C1852770yJX(baseImage2, Intrinsics.LJFF(str2, str), new AwS393S0200000_27(this, baseImage2, 58)));
        }
        ((ArrayList) list2).addAll(arrayList);
        if (((ArrayList) this.LLJJIII).size() < C20189513zB.LJI(null)) {
            ((ArrayList) this.LLJJIII).add(new C1852770yJX(null, false, new AwS606S0100000_27(this, 264)));
        }
        if (this.LLJJI == null) {
            FrameLayout frameLayout = this.LLILZIL;
            if (frameLayout != null) {
                C0DSB.LIZIZ(frameLayout);
            }
            FrameLayout frameLayout2 = this.LLIZLLLIL;
            if (frameLayout2 != null) {
                C0DSB.LIZIZ(frameLayout2);
            }
            FrameLayout frameLayout3 = this.LLILLL;
            if (frameLayout3 != null) {
                C0DSB.LIZJ(frameLayout3);
            }
            Function1<? super Boolean, Unit> function1 = this.LLJJIJI;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        } else {
            FrameLayout frameLayout4 = this.LLILLL;
            if (frameLayout4 != null) {
                C0DSB.LIZIZ(frameLayout4);
            }
            FrameLayout frameLayout5 = this.LLILZIL;
            if (frameLayout5 != null) {
                C0DSB.LIZJ(frameLayout5);
            }
            SmartImageView smartImageView = this.LLILZLL;
            if (smartImageView != null) {
                C1854260yLw c1854260yLw = C1854260yLw.LIZ;
                BaseImage baseImage4 = this.LLJJI;
                c1854260yLw.getClass();
                C1854260yLw.LJIIJJI(smartImageView, baseImage4);
            }
            C1854260yLw.LIZ.getClass();
            if (C1854260yLw.LJFF()) {
                FrameLayout frameLayout6 = this.LLIZLLLIL;
                if (frameLayout6 != null) {
                    C0DSB.LIZJ(frameLayout6);
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZ;
                if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                    state.LJIILL(this.LLJJIII, null);
                }
            }
            C1852670yJN.LIZ.getClass();
            if (C1852670yJN.LIZ()) {
                BaseImage baseImage5 = this.LLJJI;
                if (baseImage5 != null) {
                    str = baseImage5.imageSource;
                }
                if (!Intrinsics.LJFF(str, "template")) {
                    View view = this.LLJILJILJ;
                    if (view != null) {
                        C0DSB.LIZIZ(view);
                    }
                } else {
                    View view2 = this.LLJILJILJ;
                    if (view2 != null) {
                        C0DSB.LIZJ(view2);
                    }
                }
            }
            Function1<? super Boolean, Unit> function12 = this.LLJJIJI;
            if (function12 != null) {
                function12.invoke(Boolean.TRUE);
            }
        }
        C1854260yLw.LIZ.getClass();
        if (C1854260yLw.LJI()) {
            LJI();
        } else {
            LIZJ();
        }
        LJ(0, false);
    }

    public final void setImageSelectedChangedListener(Function1<? super Boolean, Unit> function1) {
        this.LLJJIJI = function1;
    }

    public final void setModuleClickListener(Function1<? super Integer, Unit> function1) {
        this.LLJJIJIIJIL = function1;
    }

    public C1852780yJY(Context context, AttributeSet attributeSet) {
        Integer numLIZJ;
        int i;
        Drawable drawableLIZ;
        Integer numLIZJ2;
        ViewGroup viewGroup;
        super(context, attributeSet, 0);
        this.LLJJIII = new ArrayList();
        LinearLayout.inflate(context, R.layout.frl, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.x9q);
        C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), linearLayout);
        C786410Ut5.R7(linearLayout, new ACListenerS129S0200000_27(linearLayout, this, 19));
        this.LL = linearLayout;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.x9d);
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(Double.valueOf(1.87d));
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(Double.valueOf(9.37d));
        if (C960203pA.LIZIZ(context)) {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zi, C1385040m98.LIZ(context, false));
            if (numLIZJ3 != null) {
                numLIZJ = Integer.valueOf(C1857690yRT.LJIIIZ(0.07f, numLIZJ3.intValue()));
            } else {
                numLIZJ = null;
            }
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.f511p1, context);
        }
        c19659111vp.LJFF = numLIZJ;
        c19659111vp.LIZ = C418440Gaw.LIZIZ(16);
        frameLayout.setBackground(c19659111vp.LIZ(context));
        ViewParent parent = frameLayout.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(false);
        }
        this.LLILLJJLI = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.x9a);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0o);
        frameLayout2.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.O7(frameLayout2, new ACListenerS91S0300000_27(this, context, frameLayout2, 3));
        this.LLILLL = frameLayout2;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.x9c);
        if (!this.LLJJ) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(tuxTextView, i);
        tuxTextView.setText(context.getString(2131849911));
        this.LLILZ = tuxTextView;
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.x9b);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_image_plus;
        c419910GdJ.LJ = Integer.valueOf(R.attr.te);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        tuxIconView.setTuxIcon(c419910GdJ);
        this.LLILZIL = (FrameLayout) findViewById(R.id.x9m);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.x9i);
        if (smartImageView != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS91S0300000_27(this, context, smartImageView, 4));
        } else {
            smartImageView = null;
        }
        this.LLILZLL = smartImageView;
        TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.x9h);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_trash_bin_fill;
        c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a0o, C1385040m98.LIZ(context, false));
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        tuxIconView2.setTuxIcon(c419910GdJ2);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(14));
        int iLIZJ = C1308910kAL.LIZJ(R.attr.zg, C1385040m98.LIZ(context, false));
        c384050F3z2.LIZ = iLIZJ == null ? 0 : iLIZJ;
        tuxIconView2.setBackground(c384050F3z2.LIZ(context));
        C786410Ut5.a9(tuxIconView2, new ACListenerS161S0100000_27(this, 101));
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.x9n);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.x9p);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
        viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
        viewOnAttachStateChangeListenerC20604515jv.getState().LIZLLL = C0Q4Y.BUFFER;
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoImageEditSelectAndPreviewSelectItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C1767006w0(context, 5));
        this.LLIZ = viewOnAttachStateChangeListenerC20604515jv;
        View viewFindViewById = findViewById(R.id.x9o);
        if (C426750GoL.LIZLLL(context)) {
            drawableLIZ = C14MI.LIZ(context, R.drawable.dea);
        } else {
            drawableLIZ = C14MI.LIZ(context, R.drawable.de_);
        }
        viewFindViewById.setBackground(drawableLIZ);
        this.LLJILLL = viewFindViewById;
        this.LLJI = findViewById(R.id.x9j);
        this.LLJIJIL = findViewById(R.id.x9k);
        this.LLJILJIL = findViewById(R.id.x9l);
        View viewFindViewById2 = findViewById(R.id.x9e);
        if (viewFindViewById2 != null) {
            C1852670yJN.LIZ.getClass();
            if (C1852670yJN.LIZ()) {
                C1857690yRT.LJIILJJIL(viewFindViewById2, Float.valueOf(C418440Gaw.LIZIZ(14)));
            }
        } else {
            viewFindViewById2 = null;
        }
        this.LLJILJILJ = viewFindViewById2;
        TextView textView = (TextView) findViewById(R.id.x9g);
        if (textView != null) {
            C1852670yJN.LIZ.getClass();
            if (C1852670yJN.LIZ() && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, C1385040m98.LIZ(context, false))) != null) {
                textView.setTextColor(numLIZJ2.intValue());
            }
        }
        TuxIconView tuxIconView3 = (TuxIconView) findViewById(R.id.x9f);
        if (tuxIconView3 != null) {
            C1852670yJN.LIZ.getClass();
            if (C1852670yJN.LIZ()) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = R.raw.icon_arrow_double_direction_fill;
                c419910GdJ3.LIZLLL = C1308910kAL.LIZJ(R.attr.a0o, C1385040m98.LIZ(context, false));
                c419910GdJ3.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ3.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                tuxIconView3.setTuxIcon(c419910GdJ3);
                C786410Ut5.Fb(tuxIconView3, -90.0f);
            }
        }
        LJFF(null);
    }

    public final void LIZIZ(C1852750yJV c1852750yJV, boolean z) {
        if (z) {
            C1854260yLw c1854260yLw = C1854260yLw.LIZ;
            BaseImage baseImage = this.LLJJI;
            BaseImage baseImage2 = c1852750yJV.LIZIZ;
            c1854260yLw.getClass();
            if (baseImage != null && baseImage2 != null) {
                int i = 0;
                for (Object obj : (ArrayList) C1854260yLw.LIZJ) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (Intrinsics.LJFF(((BaseImage) obj).imageUuid, baseImage.imageUuid)) {
                            ListProtector.set(C1854260yLw.LIZJ, i, baseImage2);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        } else {
            C1854260yLw c1854260yLw2 = C1854260yLw.LIZ;
            BaseImage baseImage3 = c1852750yJV.LIZIZ;
            c1854260yLw2.getClass();
            if (baseImage3 != null) {
                List<BaseImage> list = C1854260yLw.LIZJ;
                baseImage3.setStdSize(C1854260yLw.LIZLLL(Float.valueOf(baseImage3.width), Float.valueOf(baseImage3.height)));
                ((ArrayList) list).add(baseImage3);
            }
        }
        LJFF(c1852750yJV.LIZIZ);
        this.LLJ = false;
    }

    public final void LIZLLL(int i, boolean z) {
        float fLIZIZ;
        this.LLJJ = z;
        if (z) {
            C1854260yLw.LIZ.getClass();
            if (C1854260yLw.LJI()) {
                fLIZIZ = C418440Gaw.LIZIZ(44);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(14);
            }
            int iLIZIZ = C814420VxA.LIZIZ(fLIZIZ);
            LinearLayout linearLayout = this.LL;
            if (linearLayout != null) {
                C1857750yRZ.LJIILL(iLIZIZ, linearLayout);
            }
        } else {
            LinearLayout linearLayout2 = this.LL;
            if (linearLayout2 != null) {
                C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), linearLayout2);
            }
        }
        C1854260yLw.LIZ.getClass();
        if (C1854260yLw.LJI()) {
            LJI();
        } else {
            LIZJ();
        }
        HandlerHook.viewPost(this, new ARunnableS38S0101000_27(i, this, 3));
    }

    public final void LJ(int i, final boolean z) {
        final FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            final int measuredWidth = frameLayout.getMeasuredWidth();
            final int measuredHeight = frameLayout.getMeasuredHeight();
            final int iIntValue = LIZ(i).getFirst().intValue();
            final int iIntValue2 = LIZ(i).getSecond().intValue();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0yJZ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i2 = (int) (measuredWidth + ((iIntValue - r2) * animatedFraction));
                    int i3 = (int) (measuredHeight + ((iIntValue2 - r2) * animatedFraction));
                    FrameLayout frameLayout2 = frameLayout;
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    layoutParams.width = i2;
                    layoutParams.height = i3;
                    C786410Ut5.a6(frameLayout2, layoutParams);
                    if (z) {
                        C1852780yJY c1852780yJY = this;
                        float f2 = 1.0f;
                        if (c1852780yJY.LLJJ) {
                            f = 1.0f;
                            f2 = 0.0f;
                        } else {
                            f = 0.0f;
                        }
                        float f3 = f + ((f2 - f) * animatedFraction);
                        TuxTextView tuxTextView = c1852780yJY.LLILZ;
                        if (tuxTextView != null) {
                            C786410Ut5.B5(tuxTextView, f3);
                        }
                        if (f3 > 0.1d) {
                            TuxTextView tuxTextView2 = this.LLILZ;
                            if (tuxTextView2 != null) {
                                C0DSB.LIZJ(tuxTextView2);
                                return;
                            }
                            return;
                        }
                        TuxTextView tuxTextView3 = this.LLILZ;
                        if (tuxTextView3 == null) {
                            return;
                        }
                        C0DSB.LIZIZ(tuxTextView3);
                    }
                }
            });
            valueAnimatorOfFloat.start();
        }
    }
}
