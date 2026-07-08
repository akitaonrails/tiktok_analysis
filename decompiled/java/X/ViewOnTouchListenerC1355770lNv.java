package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPagerAbility;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ViewOnTouchListenerC1355770lNv extends FrameLayout implements View.OnTouchListener {
    public final Matrix LL;
    public C1355780lNw LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public String LLILZIL;

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        C1355780lNw c1355780lNw = this.LLILLJJLI;
        if (c1355780lNw == null || !c1355780lNw.LJII().computeScrollOffset()) {
            return;
        }
        float currX = c1355780lNw.LJII().getCurrX() - c1355780lNw.LJIILIIL;
        float currY = c1355780lNw.LJII().getCurrY() - c1355780lNw.LJIILJJIL;
        c1355780lNw.LJIILIIL = c1355780lNw.LJII().getCurrX();
        c1355780lNw.LJIILJJIL = c1355780lNw.LJII().getCurrY();
        if (currX != 0.0f || currY != 0.0f) {
            c1355780lNw.LJII.postTranslate(currX, currY);
            c1355780lNw.LIZJ.setDisplayMatrix(c1355780lNw.LJII);
            c1355780lNw.LJ();
        }
        c1355780lNw.LIZJ.postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1355780lNw c1355780lNw = this.LLILLJJLI;
        if (c1355780lNw != null) {
            ValueAnimator valueAnimator = c1355780lNw.LJIIJJI;
            c1355780lNw.LJIIJJI = null;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c1355780lNw.LJII().forceFinished(true);
            c1355780lNw.LJIIJ = 1.0f;
            c1355780lNw.LJII.reset();
            c1355780lNw.LIZJ.setDisplayMatrix(c1355780lNw.LJII);
            C424580Gkq c424580Gkq = c1355780lNw.LIZLLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424580Gkq);
            c424580Gkq.setAlpha(1.0f);
            if (C294430BgP.LIZIZ) {
                c1355780lNw.LIZLLL.setCornerRadius(0.0f);
            }
            c1355780lNw.LJIILLIIL = false;
            c1355780lNw.LJIILL = false;
            c1355780lNw.LJJIIJZLJL = false;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouch(this, motionEvent);
    }

    public final void setDisplayMatrix(Matrix matrix) {
        this.LL.set(matrix);
        invalidate();
    }

    public final void setLongPressEnabled(boolean z) {
        this.LLILZ = z;
    }

    public final void setPinchEnabled(boolean z) {
        this.LLILLL = z;
    }

    public ViewOnTouchListenerC1355770lNv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Matrix();
        this.LLILZIL = "";
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ValueAnimator valueAnimator;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C1344550l5p c1344550l5p;
        boolean z;
        float yVelocity;
        float fMax;
        InterfaceC665370Q7z interfaceC665370Q7z2;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ3;
        C1344550l5p c1344550l5p2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        InterfaceC665370Q7z interfaceC665370Q7z3;
        CommentInnerPagerAbility commentInnerPagerAbility;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ4;
        C1344550l5p c1344550l5p3;
        ViewGroup viewGroup3;
        InterfaceC665370Q7z interfaceC665370Q7z4;
        CommentInnerPagerAbility commentInnerPagerAbility2;
        InterfaceC665370Q7z interfaceC665370Q7z5;
        CommentInnerPagerAbility commentInnerPagerAbility3;
        InterfaceC665370Q7z interfaceC665370Q7z6;
        CommentInnerPagerAbility commentInnerPagerAbility4;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ5;
        float fLIZLLL;
        Pair pair;
        ViewGroup viewGroup4;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ6;
        InterfaceC665370Q7z interfaceC665370Q7z7;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ7;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ8;
        C1344550l5p c1344550l5p4;
        ViewGroup viewGroup5;
        boolean z2;
        ViewGroup viewGroup6;
        ValueAnimator valueAnimator2;
        EnumC1355810lNz enumC1355810lNz;
        C1355780lNw c1355780lNw = this.LLILLJJLI;
        if (c1355780lNw != null) {
            c1355780lNw.LJJIJIIJI = this.LLILLL;
            c1355780lNw.LJJIJIIJIL = this.LLILZ;
        }
        if (c1355780lNw == null) {
            return false;
        }
        if (!c1355780lNw.LJIILLIIL && ((enumC1355810lNz = c1355780lNw.LJI) == EnumC1355810lNz.PINCH || (enumC1355810lNz == EnumC1355810lNz.DRAG && c1355780lNw.LJIIJ > 1.0f && c1355780lNw.LJJIJIIJI))) {
            ((ScaleGestureDetector) c1355780lNw.LJJIFFI.getValue()).onTouchEvent(motionEvent);
        }
        ((GestureDetector) c1355780lNw.LJJIII.getValue()).onTouchEvent(motionEvent);
        C01GW c01gw = C259000ADa.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0 && c1355780lNw.LJIL == null) {
            c1355780lNw.LJIL = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = c1355780lNw.LJIL;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                c1355780lNw.LJII().forceFinished(true);
                if (c1355780lNw.LJI == EnumC1355810lNz.DOUBLE_TAP_ZOOM) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c1355780lNw.LJJIIJZLJL && !z2 && (valueAnimator2 = ((C1350850lFz) c1355780lNw.LJJIIJ.getValue()).LIZ.LJIIJJI) != null) {
                    valueAnimator2.cancel();
                }
                ViewParent parent = c1355780lNw.LIZJ.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup6 = (ViewGroup) parent) != null) {
                    viewGroup6.requestDisallowInterceptTouchEvent(true);
                }
                c1355780lNw.LJI = EnumC1355810lNz.DRAG;
                c1355780lNw.LJIJJLI = false;
                c1355780lNw.LJJIJ = false;
                c1355780lNw.LJIJI = motionEvent.getRawX();
                c1355780lNw.LJIJJ = motionEvent.getRawY();
                c1355780lNw.LJIIZILJ = c1355780lNw.LJIIIIZZ();
                c1355780lNw.LJIJ = c1355780lNw.LJIIIZ();
                c1355780lNw.LJJ = false;
                return true;
            case 1:
            case 3:
            case 4:
            case 6:
                if (!c1355780lNw.LJJIJ && motionEvent.getPointerCount() <= 1) {
                    float rawX = motionEvent.getRawX() - c1355780lNw.LJIJI;
                    float rawY = motionEvent.getRawY() - c1355780lNw.LJIJJ;
                    int i = C1355820lO0.LIZ[c1355780lNw.LJI.ordinal()];
                    if (i != 1) {
                        if (i == 2 && c1355780lNw.LJJIIZI && !c1355780lNw.LJJIIZ) {
                            C1389880mGw c1389880mGw = new C1389880mGw(c1355780lNw.LJ);
                            c1389880mGw.LJIIIIZZ(2131843906);
                            c1389880mGw.LJIIJ();
                            c1355780lNw.LJJIIZ = true;
                            ViewParent parent2 = c1355780lNw.LIZJ.getParent();
                            if ((parent2 instanceof ViewGroup) && (viewGroup5 = (ViewGroup) parent2) != null) {
                                viewGroup5.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    } else if (c1355780lNw.LJIJJLI) {
                        if (Math.abs(rawX) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)) && Math.abs(rawY) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50))) {
                            c1355780lNw.LJIIJJI();
                            InterfaceC665370Q7z interfaceC665370Q7z8 = c1355780lNw.LIZIZ;
                            if ((interfaceC665370Q7z8 == null || (interfaceC1555100qZQLIZIZ8 = C1554960qZC.LIZIZ(interfaceC665370Q7z8, "source_default_key", C1344550l5p.class, null)) == null || (c1344550l5p4 = (C1344550l5p) interfaceC1555100qZQLIZIZ8.getSource()) == null || c1344550l5p4.getDragState() != 2) && (interfaceC665370Q7z7 = c1355780lNw.LIZIZ) != null && (interfaceC1555100qZQLIZIZ7 = C1554960qZC.LIZIZ(interfaceC665370Q7z7, "source_default_key", C1344550l5p.class, null)) != null) {
                                interfaceC1555100qZQLIZIZ7.LIZIZ(AFwS259S0000000_21.get$arr$(460));
                            }
                        } else {
                            InterfaceC665370Q7z interfaceC665370Q7z9 = c1355780lNw.LIZIZ;
                            if (interfaceC665370Q7z9 != null && (interfaceC1555100qZQLIZIZ6 = C1554960qZC.LIZIZ(interfaceC665370Q7z9, "source_default_key", C1344550l5p.class, null)) != null) {
                                interfaceC1555100qZQLIZIZ6.LIZIZ(AFwS259S0000000_21.get$arr$(463));
                            }
                        }
                    }
                    VelocityTracker velocityTracker2 = c1355780lNw.LJIL;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                    }
                    c1355780lNw.LJIL = null;
                    c1355780lNw.LJI = EnumC1355810lNz.NONE;
                }
                return true;
            case 2:
                if (!c1355780lNw.LJJIJ && motionEvent.getPointerCount() <= 1) {
                    if (c1355780lNw.LJJ && c1355780lNw.LJI == EnumC1355810lNz.DRAG && motionEvent.getPointerCount() == 1) {
                        c1355780lNw.LJIJI = motionEvent.getRawX();
                        c1355780lNw.LJIJJ = motionEvent.getRawY();
                        c1355780lNw.LJIIZILJ = c1355780lNw.LJIIIIZZ();
                        c1355780lNw.LJIJ = c1355780lNw.LJIIIZ();
                        c1355780lNw.LJJ = false;
                    } else {
                        EnumC1355810lNz enumC1355810lNz2 = c1355780lNw.LJI;
                        EnumC1355810lNz enumC1355810lNz3 = EnumC1355810lNz.DRAG;
                        if (enumC1355810lNz2 == enumC1355810lNz3 && c1355780lNw.LJIIJ > 1.0f) {
                            float rawX2 = c1355780lNw.LJIIZILJ + (motionEvent.getRawX() - c1355780lNw.LJIJI);
                            float rawY2 = c1355780lNw.LJIJ + (motionEvent.getRawY() - c1355780lNw.LJIJJ);
                            Pair<PointF, PointF> pairLJIIJ = c1355780lNw.LJIIJ();
                            float f = pairLJIIJ.getFirst().x;
                            float f2 = pairLJIIJ.getSecond().x;
                            if (f < f2) {
                                fLIZLLL = C13LZ.LIZLLL(rawX2, f, f2);
                            } else {
                                fLIZLLL = C13LZ.LIZLLL(rawX2, f2, f);
                            }
                            if (pairLJIIJ.getFirst().y < pairLJIIJ.getSecond().y) {
                                pair = new Pair(Float.valueOf(pairLJIIJ.getFirst().y), Float.valueOf(pairLJIIJ.getSecond().y));
                            } else {
                                pair = new Pair(Float.valueOf(pairLJIIJ.getSecond().y), Float.valueOf(pairLJIIJ.getFirst().y));
                            }
                            float fFloatValue = ((Number) pair.getFirst()).floatValue();
                            float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
                            float fLIZLLL2 = C13LZ.LIZLLL(rawY2, fFloatValue, fFloatValue2);
                            float fLJIIIIZZ = fLIZLLL - c1355780lNw.LJIIIIZZ();
                            float fLJIIIZ = fLIZLLL2 - c1355780lNw.LJIIIZ();
                            if (fLJIIIIZZ != 0.0f || fLJIIIZ != 0.0f) {
                                c1355780lNw.LJII.postTranslate(fLJIIIIZZ, fLJIIIZ);
                                c1355780lNw.LIZJ.setDisplayMatrix(c1355780lNw.LJII);
                            }
                            if (rawY2 < fFloatValue || rawY2 > fFloatValue2) {
                                ViewParent parent3 = c1355780lNw.LIZJ.getParent();
                                if ((parent3 instanceof ViewGroup) && (viewGroup4 = (ViewGroup) parent3) != null) {
                                    viewGroup4.requestDisallowInterceptTouchEvent(false);
                                }
                            }
                        } else if (enumC1355810lNz2 == enumC1355810lNz3 && c1355780lNw.LJIIJ <= 1.0f) {
                            float rawX3 = motionEvent.getRawX() - c1355780lNw.LJIJI;
                            float rawY3 = motionEvent.getRawY() - c1355780lNw.LJIJJ;
                            float scaledTouchSlop = ViewConfiguration.get(c1355780lNw.LJ.getContext()).getScaledTouchSlop();
                            if (Math.abs(rawX3) <= scaledTouchSlop && Math.abs(rawY3) <= scaledTouchSlop) {
                                z = false;
                            } else {
                                z = true;
                            }
                            VelocityTracker velocityTracker3 = c1355780lNw.LJIL;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                            }
                            VelocityTracker velocityTracker4 = c1355780lNw.LJIL;
                            if (velocityTracker4 != null) {
                                yVelocity = velocityTracker4.getYVelocity();
                            } else {
                                yVelocity = 0.0f;
                            }
                            if (((Number) c01gw.getValue()).intValue() != 0 && (interfaceC665370Q7z6 = c1355780lNw.LIZIZ) != null && (commentInnerPagerAbility4 = (CommentInnerPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z6, CommentInnerPagerAbility.class, null)) != null && !commentInnerPagerAbility4.zz2(1) && c1355780lNw.LJJIIZ && yVelocity < ((Number) c01gw.getValue()).intValue()) {
                                InterfaceC665370Q7z interfaceC665370Q7z10 = c1355780lNw.LIZIZ;
                                if (interfaceC665370Q7z10 != null && (interfaceC1555100qZQLIZIZ5 = C1554960qZC.LIZIZ(interfaceC665370Q7z10, "source_default_key", C1344550l5p.class, null)) != null) {
                                    interfaceC1555100qZQLIZIZ5.LIZIZ(AFwS259S0000000_21.get$arr$(462));
                                }
                            } else if (c1355780lNw.LJIJJLI || (z && (Math.abs(rawX3) > Math.abs(rawY3) || ((rawY3 < 0.0f && (interfaceC665370Q7z5 = c1355780lNw.LIZIZ) != null && (commentInnerPagerAbility3 = (CommentInnerPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z5, CommentInnerPagerAbility.class, null)) != null && !commentInnerPagerAbility3.zz2(1) && c1355780lNw.LJJIIZ) || (rawY3 > 0.0f && (interfaceC665370Q7z4 = c1355780lNw.LIZIZ) != null && (commentInnerPagerAbility2 = (CommentInnerPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z4, CommentInnerPagerAbility.class, null)) != null && !commentInnerPagerAbility2.zz2(-1)))))) {
                                ViewParent parent4 = c1355780lNw.LIZJ.getParent();
                                if ((parent4 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent4) != null) {
                                    viewGroup.requestDisallowInterceptTouchEvent(true);
                                }
                                c1355780lNw.LJIJJLI = true;
                                float fMax2 = Math.max(Math.abs(rawX3), Math.abs(rawY3));
                                boolean z3 = C294430BgP.LIZIZ;
                                if (z3) {
                                    fMax = Math.max(0.5f, Math.min(1.0f, 1 - (fMax2 / ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)));
                                } else {
                                    fMax = Math.max(0.75f, Math.min(1.0f, 1 - (fMax2 / ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)));
                                }
                                c1355780lNw.LJII.reset();
                                c1355780lNw.LJII.setScale(fMax, fMax, c1355780lNw.LIZLLL.getWidth() / 2.0f, c1355780lNw.LIZLLL.getHeight() / 2.0f);
                                c1355780lNw.LJII.postTranslate(rawX3, rawY3);
                                c1355780lNw.LJII.getValues(c1355780lNw.LJIIIIZZ);
                                c1355780lNw.LJIIJ = c1355780lNw.LJIIIIZZ[0];
                                c1355780lNw.LIZJ.setDisplayMatrix(c1355780lNw.LJII);
                                if (z3) {
                                    c1355780lNw.LIZLLL.setCornerRadius(C418440Gaw.LIZIZ(10));
                                } else {
                                    float fMax3 = Math.max(0.3f, Math.min(1.0f, 1 - (fMax2 / 800)));
                                    C424580Gkq c424580Gkq = c1355780lNw.LIZLLL;
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424580Gkq);
                                    c424580Gkq.setAlpha(fMax3);
                                }
                                InterfaceC1355840lO2 interfaceC1355840lO2 = c1355780lNw.LJFF;
                                if (interfaceC1355840lO2 != null) {
                                    interfaceC1355840lO2.bb(false);
                                }
                                InterfaceC665370Q7z interfaceC665370Q7z11 = c1355780lNw.LIZIZ;
                                if ((interfaceC665370Q7z11 == null || (interfaceC1555100qZQLIZIZ3 = C1554960qZC.LIZIZ(interfaceC665370Q7z11, "source_default_key", C1344550l5p.class, null)) == null || (c1344550l5p2 = (C1344550l5p) interfaceC1555100qZQLIZIZ3.getSource()) == null || c1344550l5p2.getDragState() != 1) && (interfaceC665370Q7z2 = c1355780lNw.LIZIZ) != null && (interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(interfaceC665370Q7z2, "source_default_key", C1344550l5p.class, null)) != null) {
                                    interfaceC1555100qZQLIZIZ2.LIZIZ(AFwS259S0000000_21.get$arr$(461));
                                }
                            } else if (rawY3 < 0.0f && (interfaceC665370Q7z3 = c1355780lNw.LIZIZ) != null && (commentInnerPagerAbility = (CommentInnerPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z3, CommentInnerPagerAbility.class, null)) != null && !commentInnerPagerAbility.zz2(1) && !c1355780lNw.LJJIIZ) {
                                c1355780lNw.LJI = EnumC1355810lNz.REACH_END;
                                ViewParent parent5 = c1355780lNw.LIZJ.getParent();
                                if ((parent5 instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent5) != null) {
                                    viewGroup3.requestDisallowInterceptTouchEvent(false);
                                }
                                InterfaceC1355840lO2 interfaceC1355840lO22 = c1355780lNw.LJFF;
                                if (interfaceC1355840lO22 != null) {
                                    interfaceC1355840lO22.bb(true);
                                }
                                InterfaceC665370Q7z interfaceC665370Q7z12 = c1355780lNw.LIZIZ;
                                if (interfaceC665370Q7z12 != null && (interfaceC1555100qZQLIZIZ4 = C1554960qZC.LIZIZ(interfaceC665370Q7z12, "source_default_key", C1344550l5p.class, null)) != null && (c1344550l5p3 = (C1344550l5p) interfaceC1555100qZQLIZIZ4.getSource()) != null && Intrinsics.LJFF(c1344550l5p3.isRequesting(), Boolean.FALSE)) {
                                    c1355780lNw.LJJIIZI = true;
                                }
                            } else {
                                ViewParent parent6 = c1355780lNw.LIZJ.getParent();
                                if ((parent6 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent6) != null) {
                                    viewGroup2.requestDisallowInterceptTouchEvent(false);
                                }
                            }
                        }
                    }
                }
                return true;
            case 5:
                if (!c1355780lNw.LJJIJ && c1355780lNw.LJJIJIIJI && motionEvent.getPointerCount() == 2 && ((interfaceC665370Q7z = c1355780lNw.LIZIZ) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1344550l5p.class, null)) == null || (c1344550l5p = (C1344550l5p) interfaceC1555100qZQLIZIZ.getSource()) == null || c1344550l5p.getDragState() != 1)) {
                    if (c1355780lNw.LJIILL && (valueAnimator = c1355780lNw.LJIIJJI) != null) {
                        valueAnimator.cancel();
                    }
                    c1355780lNw.LJI = EnumC1355810lNz.PINCH;
                    c1355780lNw.LJJ = false;
                    c1355780lNw.LJJI = true;
                }
                return true;
            default:
                VelocityTracker velocityTracker5 = c1355780lNw.LJIL;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                }
                c1355780lNw.LJIL = null;
                return true;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.LL.isIdentity()) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.concat(this.LL);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }
}
