package X;

import Y.AAListenerS86S0400000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: renamed from: X.0HIT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HIT extends FrameLayout {
    public static final List<PointF> LLILLL = C1697810uHb.LJIIJJI(new PointF(-26.0f, -48.0f), new PointF(14.0f, -54.0f), new PointF(54.0f, -48.0f));
    public final List<TuxTextView> LL;
    public final C01GW LLILLJJLI;

    private final int getStatusBarHeight() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    public C0HIT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = C452501pT.LIZIZ(new C0HIV(context));
    }

    public static PointF LIZ(Rect rect, TuxTextView tuxTextView) {
        if (rect == null) {
            return new PointF();
        }
        Rect rect2 = new Rect();
        tuxTextView.getGlobalVisibleRect(rect2);
        Pair pair = new Pair(Integer.valueOf((rect2.left + rect2.right) / 2), Integer.valueOf((rect2.top + rect2.bottom) / 2));
        Pair pair2 = new Pair(Integer.valueOf((rect.left + rect.right) / 2), Integer.valueOf((rect.top + rect.bottom) / 2));
        return new PointF(((Number) pair2.getFirst()).intValue() - ((Number) pair.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue() - ((Number) pair.getSecond()).intValue());
    }

    public final void LIZIZ(String str, PointF pointF, Rect rect, AwS412S0200000_11 awS412S0200000_11) {
        float f;
        pointF.y -= getStatusBarHeight();
        for (int i = 0; i < 3; i++) {
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
            tuxTextView.LJJJJI(32.0f);
            C06WN.LIZ(tuxTextView, 8);
            tuxTextView.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
            tuxTextView.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
            tuxTextView.setGravity(17);
            tuxTextView.setText(str);
            C786410Ut5.Jd(tuxTextView, pointF.x);
            C786410Ut5.Od(tuxTextView, pointF.y);
            addView(tuxTextView);
            ((ArrayList) this.LL).add(tuxTextView);
        }
        int i2 = 0;
        for (Object obj : (ArrayList) this.LL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                TuxTextView tuxTextView2 = (TuxTextView) obj;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView2, "scaleX", 1.4f, 0.9f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextView2, "scaleY", 1.4f, 0.9f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(C1619980sG4.LJIIIZ());
                animatorSet.setDuration(133L);
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                List<PointF> list = LLILLL;
                PointF pointF2 = (PointF) C13LP.LJJJLZIJ(i2, list);
                float f2 = 0.0f;
                if (pointF2 != null) {
                    f = pointF2.x;
                } else {
                    f = 0.0f;
                }
                float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(f));
                PointF pointF3 = (PointF) C13LP.LJJJLZIJ(i2, list);
                if (pointF3 != null) {
                    f2 = pointF3.y;
                }
                float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(f2));
                float f3 = 10;
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C419700Gcy(new PointF(tuxTextView2.getX(), tuxTextView2.getY() + (fLIZIZ2 / f3)), new PointF(tuxTextView2.getX() + ((7 * fLIZIZ) / f3), tuxTextView2.getY() + fLIZIZ2)), new PointF(tuxTextView2.getX(), tuxTextView2.getY()), new PointF(tuxTextView2.getX() + fLIZIZ, tuxTextView2.getY() + fLIZIZ2));
                valueAnimatorOfObject.setInterpolator(C1619980sG4.LJIIIIZZ());
                valueAnimatorOfObject.setDuration(500L);
                valueAnimatorOfObject.setTarget(tuxTextView2);
                valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6(tuxTextView2, 112));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(animatorSet, valueAnimatorOfObject);
                animatorSet2.playTogether(valueAnimatorOfObject);
                animatorSet2.addListener(new AAListenerS86S0400000_6(tuxTextView2, this, rect, i2, awS412S0200000_11, 1));
                animatorSet2.start();
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LIZJ(String str, PointF pointF, final Rect rect, final AwS412S0200000_11 awS412S0200000_11) {
        float f;
        pointF.y -= getStatusBarHeight();
        for (int i = 0; i < 3; i++) {
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
            tuxTextView.LJJJJI(32.0f);
            C06WN.LIZ(tuxTextView, 8);
            tuxTextView.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
            tuxTextView.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
            tuxTextView.setGravity(17);
            tuxTextView.setText(str);
            C786410Ut5.Jd(tuxTextView, pointF.x);
            C786410Ut5.Od(tuxTextView, pointF.y);
            addView(tuxTextView);
            ((ArrayList) this.LL).add(tuxTextView);
        }
        int i2 = 0;
        for (Object obj : (ArrayList) this.LL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                final TuxTextView tuxTextView2 = (TuxTextView) obj;
                C0HU7 c0hu7 = C0HU7.LIZ;
                C21647019ng c21647019ngLIZ = C0HU7.LIZ(c0hu7, tuxTextView2.getContext(), tuxTextView2, C1697810uHb.LJIIJJI(new C19746412Nq("diffuse_scale_x", new C0HIW(1.4f, 0.9f)), new C19746412Nq("diffuse_scale_y", new C0HIX(1.4f, 0.9f))), 0.0f, null, null, null, 248);
                List<PointF> list = LLILLL;
                PointF pointF2 = (PointF) C13LP.LJJJLZIJ(i2, list);
                float f2 = 0.0f;
                if (pointF2 != null) {
                    f = pointF2.x;
                } else {
                    f = 0.0f;
                }
                float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(f));
                PointF pointF3 = (PointF) C13LP.LJJJLZIJ(i2, list);
                if (pointF3 != null) {
                    f2 = pointF3.y;
                }
                C21647019ng c21647019ngLIZ2 = C0HU7.LIZ(c0hu7, tuxTextView2.getContext(), tuxTextView2, C1697810uHb.LJIIJJI(new C19746412Nq("diffuse_translation_x", new C082N(tuxTextView2.getX(), tuxTextView2.getX() + fLIZIZ)), new C19746412Nq("diffuse_translation_y", new C0HV5(tuxTextView2.getY(), tuxTextView2.getY() + C418440Gaw.LIZIZ(Float.valueOf(f2))))), 0.0f, "diffuse_translation_x", null, new InterfaceC442640HXi() { // from class: X.0HIU
                    @Override // X.InterfaceC442640HXi
                    public final void onResult(Object obj2) {
                        C0HU7 c0hu72 = C0HU7.LIZ;
                        Context context = tuxTextView2.getContext();
                        TuxTextView tuxTextView3 = tuxTextView2;
                        List listLJIIJJI = C1697810uHb.LJIIJJI(new C19746412Nq("assemble_scale_x", new C0HIW(0.9f, 0.0f)), new C19746412Nq("assemble_scale_y", new C0HIX(0.9f, 0.0f)));
                        final C0HIT c0hit = this;
                        C21647019ng c21647019ngLIZ3 = C0HU7.LIZ(c0hu72, context, tuxTextView3, listLJIIJJI, 0.0f, "assemble_scale_x", null, new InterfaceC442640HXi() { // from class: X.0HEc
                            @Override // X.InterfaceC442640HXi
                            public final void onResult(Object obj3) {
                                C1440005kM.LIZ(new C453940Hr6(false, false, 4));
                                C0HIT c0hit2 = c0hit;
                                for (View view : (ArrayList) c0hit2.LL) {
                                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0hit2, view);
                                    c0hit2.removeView(view);
                                }
                                ((ArrayList) c0hit.LL).clear();
                            }
                        }, 88);
                        C0HIT c0hit2 = this;
                        TuxTextView tuxTextView4 = tuxTextView2;
                        Rect rect2 = rect;
                        c0hit2.getClass();
                        PointF pointFLIZ = C0HIT.LIZ(rect2, tuxTextView4);
                        float f3 = pointFLIZ.x;
                        float f4 = pointFLIZ.y;
                        Context context2 = tuxTextView2.getContext();
                        TuxTextView tuxTextView5 = tuxTextView2;
                        C21647019ng c21647019ngLIZ4 = C0HU7.LIZ(c0hu72, context2, tuxTextView5, C1697810uHb.LJIIJJI(new C19746412Nq("assemble_translation_x", new C082N(tuxTextView5.getX(), tuxTextView2.getX() + f3)), new C19746412Nq("assemble_translation_y", new C0HV5(tuxTextView2.getY(), tuxTextView2.getY() + f4))), 0.0f, null, null, null, 248);
                        c21647019ngLIZ3.LJI(true);
                        c21647019ngLIZ4.LJI(true);
                        HandlerHook.viewPostDelay(this, new RunnableC514801zW(awS412S0200000_11, (Function0<Unit>) 130), 184L);
                    }
                }, 88);
                c21647019ngLIZ.LJI(true);
                c21647019ngLIZ2.LJI(true);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
