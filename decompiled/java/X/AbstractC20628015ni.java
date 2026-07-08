package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20628015ni extends FrameLayout {
    public static final C20629415nw LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final ValueAnimator LLJIJIL;
    public final C01GW LL;
    public final Map<String, Object> LLILLJJLI;
    public final Map<String, Object> LLILLL;
    public final C20628115nj LLILZ;
    public final C20628115nj LLILZIL;
    public final C20628115nj LLILZLL;
    public final C20628115nj LLIZ;
    public final C20628115nj LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.15nw] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(AbstractC20628015ni.class, "radius", "getRadius()F", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217371BqR, new C2217371BqR(AbstractC20628015ni.class, "placeholderColor", "getPlaceholderColor()I", 0), new C2217371BqR(AbstractC20628015ni.class, "pulsingColor", "getPulsingColor()I", 0), new C2217371BqR(AbstractC20628015ni.class, "isLoading", "isLoading()Z", 0), new C2217371BqR(AbstractC20628015ni.class, "animator", "getAnimator()Landroid/animation/ValueAnimator;", 0)};
        LLJ = new Object() { // from class: X.15nw
        };
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(2);
        LLJIJIL = valueAnimator;
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LLIZ.LIZ(this, LLJI[3])).booleanValue();
    }

    public final ValueAnimator getAnimator() {
        return (ValueAnimator) this.LLIZLLLIL.LIZ(this, LLJI[4]);
    }

    public final int getPlaceholderColor() {
        return ((Number) this.LLILZIL.LIZ(this, LLJI[1])).intValue();
    }

    public final int getPulsingColor() {
        return ((Number) this.LLILZLL.LIZ(this, LLJI[2])).intValue();
    }

    public final float getRadius() {
        return ((Number) this.LLILZ.LIZ(this, LLJI[0])).floatValue();
    }

    public final C20628315nl getThemeConfig() {
        return (C20628315nl) this.LL.getValue();
    }

    public final long getAnimationDuration() {
        return getAnimator().getDuration();
    }

    public final void setAnimationDuration(long j) {
        getAnimator().setDuration(j);
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        this.LLIZLLLIL.LIZIZ(this, LLJI[4], valueAnimator);
    }

    public final void setLoading(boolean z) {
        this.LLIZ.LIZIZ(this, LLJI[3], Boolean.valueOf(z));
    }

    public final void setPlaceholderColor(int i) {
        this.LLILZIL.LIZIZ(this, LLJI[1], Integer.valueOf(i));
    }

    public final void setPulsingColor(int i) {
        this.LLILZLL.LIZIZ(this, LLJI[2], Integer.valueOf(i));
    }

    public final void setRadius(float f) {
        this.LLILZ.LIZIZ(this, LLJI[0], Float.valueOf(f));
    }

    public AbstractC20628015ni(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final <T> T LIZIZ(String str, Function0<? extends T> function0) {
        T t;
        View view = this;
        while (view != null) {
            if ((view instanceof AbstractC20628015ni) && (t = (T) ((LinkedHashMap) ((AbstractC20628015ni) view).LLILLJJLI).get(str)) != null) {
                return t;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return function0.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x001a, B:7:0x0013), top: B:13:0x0005 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVisibilityChanged(android.view.View r3, int r4) {
        /*
            r2 = this;
            super.onVisibilityChanged(r3, r4)
            if (r4 != 0) goto L13
            int r0 = r2.getVisibility()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L13
            android.animation.ValueAnimator r0 = r2.getAnimator()     // Catch: java.lang.Throwable -> L20
            r0.start()     // Catch: java.lang.Throwable -> L20
            goto L1a
        L13:
            android.animation.ValueAnimator r0 = r2.getAnimator()     // Catch: java.lang.Throwable -> L20
            r0.cancel()     // Catch: java.lang.Throwable -> L20
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L20
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L20
            return
        L20:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20628015ni.onVisibilityChanged(android.view.View, int):void");
    }

    public AbstractC20628015ni(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new C20629315nv(context));
        this.LLILLJJLI = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LLILLL = linkedHashMap;
        this.LLILZ = new C20628115nj(new C20628615no(this));
        this.LLILZIL = new C20628115nj(new C20629115nt(this));
        this.LLILZLL = new C20628115nj(new C20629215nu(this));
        this.LLIZ = new C20628115nj(new C20629015ns(this));
        this.LLIZLLLIL = new C20628115nj(new C20628215nk(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SkeletonBaseProps, i, 0);
        int i2 = R$styleable.SkeletonBaseProps_tux_skeletonRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i2);
            setRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(i2, 0));
        }
        int i3 = R$styleable.SkeletonBaseProps_tux_skeletonPlaceholderColor;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i3);
            setPlaceholderColor(typedArrayObtainStyledAttributes.getColor(i3, 0));
        }
        int i4 = R$styleable.SkeletonBaseProps_tux_skeletonPulsingColor;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i4);
            setPulsingColor(typedArrayObtainStyledAttributes.getColor(i4, 0));
        }
        int i5 = R$styleable.SkeletonBaseProps_tux_skeletonLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i5);
            setLoading(typedArrayObtainStyledAttributes.getBoolean(i5, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        linkedHashMap.put(new C2217391BqT(this) { // from class: X.15nf
            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
            public final Object get() {
                return Float.valueOf(((AbstractC20628015ni) this.receiver).getRadius());
            }

            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
            public final void set(Object obj) {
                ((AbstractC20628015ni) this.receiver).setRadius(((Number) obj).floatValue());
            }
        }.getName(), new C20627915nh(this));
        linkedHashMap.put(new C2217391BqT(this) { // from class: X.15nm
            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
            public final Object get() {
                return Integer.valueOf(((AbstractC20628015ni) this.receiver).getPlaceholderColor());
            }

            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
            public final void set(Object obj) {
                ((AbstractC20628015ni) this.receiver).setPlaceholderColor(((Number) obj).intValue());
            }
        }.getName(), new C20628715np(this));
        linkedHashMap.put(new C2217391BqT(this) { // from class: X.15nn
            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
            public final Object get() {
                return Integer.valueOf(((AbstractC20628015ni) this.receiver).getPulsingColor());
            }

            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
            public final void set(Object obj) {
                ((AbstractC20628015ni) this.receiver).setPulsingColor(((Number) obj).intValue());
            }
        }.getName(), new C20628815nq(this));
        linkedHashMap.put(new C2217391BqT(this) { // from class: X.15ng
            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
            public final Object get() {
                return Boolean.valueOf(((AbstractC20628015ni) this.receiver).LIZJ());
            }

            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
            public final void set(Object obj) {
                ((AbstractC20628015ni) this.receiver).setLoading(((Boolean) obj).booleanValue());
            }
        }.getName(), new C20628915nr(this));
    }

    public static void LIZ(View view, String str, Object obj, Object obj2) {
        Function2 function2;
        if (view == null) {
            return;
        }
        boolean z = true;
        if (view instanceof AbstractC20628015ni) {
            AbstractC20628015ni abstractC20628015ni = (AbstractC20628015ni) view;
            if (((LinkedHashMap) abstractC20628015ni.LLILLJJLI).get(str) == null) {
                Object obj3 = ((LinkedHashMap) abstractC20628015ni.LLILLL).get(str);
                if (C19719512Dh.LJFF(2, obj3) && (function2 = (Function2) obj3) != null) {
                    function2.invoke(obj, obj2);
                }
            } else {
                z = false;
            }
        }
        if ((view instanceof ViewGroup) && z) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    LIZ((View) c09re.next(), str, obj, obj2);
                } else {
                    return;
                }
            }
        }
    }
}
