package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18yW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21459418yW extends AbstractC21463118z7 {
    public static final String[] LLJJLIIIJLLLLLLLZ = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C19LL LLJL;
    public static final C19LL LLJLIL;
    public static final C19LL LLJLILLLLZIIL;
    public static final C19LL LLJLL;
    public static final C19LL LLJLLIL;

    static {
        final Class<PointF> cls = PointF.class;
        new Property<Drawable, PointF>(cls) { // from class: X.18r3
            public final Rect LIZ = new Rect();

            @Override // android.util.Property
            public final PointF get(Drawable drawable) {
                drawable.copyBounds(this.LIZ);
                Rect rect = this.LIZ;
                return new PointF(rect.left, rect.top);
            }

            @Override // android.util.Property
            public final void set(Drawable drawable, PointF pointF) {
                Drawable drawable2 = drawable;
                PointF pointF2 = pointF;
                drawable2.copyBounds(this.LIZ);
                this.LIZ.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
                drawable2.setBounds(this.LIZ);
            }
        };
        LLJL = new C19LL(PointF.class, 1);
        LLJLIL = new C19LL(PointF.class, 2);
        LLJLILLLLZIIL = new C19LL(PointF.class, 3);
        LLJLL = new C19LL(PointF.class, 4);
        LLJLLIL = new C19LL(PointF.class, 5);
    }

    @Override // X.AbstractC21463118z7
    public final String[] LJIJI() {
        return LLJJLIIIJLLLLLLLZ;
    }

    public static final void LJJIZ(C1489080oqw c1489080oqw) {
        View view = c1489080oqw.LIZIZ;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            ((HashMap) c1489080oqw.LIZ).put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            ((HashMap) c1489080oqw.LIZ).put("android:changeBounds:parent", c1489080oqw.LIZIZ.getParent());
        }
    }

    @Override // X.AbstractC21463118z7
    public final void LIZLLL(C1489080oqw c1489080oqw) {
        LJJIZ(c1489080oqw);
    }

    @Override // X.AbstractC21463118z7
    public final void LJI(C1489080oqw c1489080oqw) {
        LJJIZ(c1489080oqw);
    }

    @Override // X.AbstractC21463118z7
    public Animator LJIIJ(ViewGroup viewGroup, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
        int i;
        Animator animatorOfObject;
        if (c1489080oqw != null && c1489080oqw2 != null) {
            Map<String, Object> map = c1489080oqw.LIZ;
            Map<String, Object> map2 = c1489080oqw2.LIZ;
            Object obj = ((HashMap) map).get("android:changeBounds:parent");
            Object obj2 = ((HashMap) map2).get("android:changeBounds:parent");
            if (obj != null && obj2 != null) {
                View view = c1489080oqw2.LIZIZ;
                Rect rect = (Rect) ((HashMap) c1489080oqw.LIZ).get("android:changeBounds:bounds");
                Rect rect2 = (Rect) ((HashMap) c1489080oqw2.LIZ).get("android:changeBounds:bounds");
                int i2 = rect.left;
                int i3 = rect2.left;
                int i4 = rect.top;
                int i5 = rect2.top;
                int i6 = rect.right;
                int i7 = rect2.right;
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                int i10 = i6 - i2;
                int i11 = i8 - i4;
                int i12 = i7 - i3;
                int i13 = i9 - i5;
                Rect rect3 = (Rect) ((HashMap) c1489080oqw.LIZ).get("android:changeBounds:clip");
                Object obj3 = ((HashMap) c1489080oqw2.LIZ).get("android:changeBounds:clip");
                if ((i10 != 0 && i11 != 0) || (i12 != 0 && i13 != 0)) {
                    if (i2 == i3 && i4 == i5) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    if (i6 != i7 || i8 != i9) {
                        i++;
                    }
                } else {
                    i = 0;
                }
                if (rect3 == null ? obj3 != null : !rect3.equals(obj3)) {
                    i++;
                }
                if (i > 0) {
                    C21461118yn.LIZ(view, i2, i4, i6, i8);
                    if (i == 2) {
                        if (i10 == i12 && i11 == i13) {
                            animatorOfObject = ObjectAnimator.ofObject(view, LLJLLIL, (TypeConverter) null, this.LLJJJJ.LIZ(i2, i4, i3, i5));
                        } else {
                            final C21460018yc c21460018yc = new C21460018yc(view);
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c21460018yc, LLJL, (TypeConverter) null, this.LLJJJJ.LIZ(i2, i4, i3, i5));
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c21460018yc, LLJLIL, (TypeConverter) null, this.LLJJJJ.LIZ(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                            animatorSet.addListener(new AnimatorListenerAdapter(c21460018yc) { // from class: X.18yY
                                public C21460018yc mViewBounds;

                                {
                                    this.mViewBounds = c21460018yc;
                                }
                            });
                            animatorOfObject = animatorSet;
                        }
                    } else if (i2 == i3 && i4 == i5) {
                        animatorOfObject = ObjectAnimator.ofObject(view, LLJLILLLLZIIL, (TypeConverter) null, this.LLJJJJ.LIZ(i6, i8, i7, i9));
                    } else {
                        animatorOfObject = ObjectAnimator.ofObject(view, LLJLL, (TypeConverter) null, this.LLJJJJ.LIZ(i2, i4, i3, i5));
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        final ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                        C21459718yZ.LIZ(viewGroup2, true);
                        LIZ(new C1149100g0a() { // from class: X.18yX
                            public boolean LL;

                            @Override // X.C1149100g0a, X.InterfaceC21462418z0
                            public final void LIZIZ() {
                                C21459718yZ.LIZ(viewGroup2, false);
                            }

                            @Override // X.C1149100g0a, X.InterfaceC21462418z0
                            public final void LIZJ() {
                                C21459718yZ.LIZ(viewGroup2, true);
                            }

                            @Override // X.C1149100g0a, X.InterfaceC21462418z0
                            public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
                                if (!this.LL) {
                                    C21459718yZ.LIZ(viewGroup2, false);
                                }
                                abstractC21463118z7.LJJII(this);
                            }

                            @Override // X.C1149100g0a, X.InterfaceC21462418z0
                            public final void LJFF(AbstractC21460218ye abstractC21460218ye) {
                                C21459718yZ.LIZ(viewGroup2, false);
                                this.LL = true;
                            }
                        });
                    }
                    return animatorOfObject;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
