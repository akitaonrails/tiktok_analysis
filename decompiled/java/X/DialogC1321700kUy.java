package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.xelement.overlay.LynxOverlayView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class DialogC1321700kUy extends DialogC19728412Gs {
    public final LynxOverlayView LL;
    public C1321800kV8 LLILLJJLI;
    public String LLILLL;
    public Number LLILZ;
    public final C01GW LLILZIL;

    public final int LJJLIIJ() {
        LynxOverlayView lynxOverlayView = this.LL;
        if (lynxOverlayView.LLILZ && lynxOverlayView.LLILZIL) {
            return 0;
        }
        return -((Number) this.LLILZIL.getValue()).intValue();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        super.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJLJ(android.view.MotionEvent r10) {
        /*
            r9 = this;
            float r5 = r10.getX()
            float r4 = r10.getY()
            com.lynx.xelement.overlay.LynxOverlayView r3 = r9.LL
            boolean r0 = r3.LLILLL
            r2 = 1
            r8 = 0
            if (r0 == 0) goto Lb8
            boolean r0 = r3.LLIZ
            if (r0 != 0) goto L3f
            boolean r0 = r3.eventThrough(r5, r4)
            if (r0 != 0) goto L4a
        L1a:
            com.lynx.xelement.overlay.LynxOverlayView r0 = r9.LL
            int r0 = r0.getLeft()
            float r4 = (float) r0
            com.lynx.xelement.overlay.LynxOverlayView r0 = r9.LL
            int r0 = r0.getTop()
            float r3 = (float) r0
            float r1 = -r4
            float r0 = -r3
            r10.offsetLocation(r1, r0)
            com.lynx.xelement.overlay.LynxOverlayView r1 = r9.LL
            X.0kEK r0 = r1.LLJJJJLIIL
            if (r0 == 0) goto L3d
            boolean r0 = r0.LJIJJ(r10, r1)
            if (r0 != r2) goto L3d
        L39:
            r10.offsetLocation(r4, r3)
            return r2
        L3d:
            r2 = 0
            goto L39
        L3f:
            boolean r0 = r3.LLILZLL
            if (r0 != 0) goto L4a
            boolean r0 = r3.eventThrough(r5, r4)
            if (r0 != 0) goto L4a
            goto L1a
        L4a:
            java.util.List<com.lynx.tasm.behavior.ui.LynxBaseUI> r0 = r3.mChildren
            java.util.Iterator r7 = r0.iterator()
        L50:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r6 = r7.next()
            com.lynx.tasm.behavior.ui.LynxBaseUI r6 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r6
            int r1 = r3.getLeft()
            int r0 = r6.getLeft()
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = r6.getTranslationX()
            float r1 = r1 + r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L50
            int r0 = r3.getLeft()
            float r1 = (float) r0
            int r0 = r6.getLeft()
            float r0 = (float) r0
            float r1 = r1 + r0
            float r0 = r6.getTranslationX()
            float r1 = r1 + r0
            int r0 = r6.getWidth()
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L50
            int r1 = r3.getTop()
            int r0 = r6.getTop()
            int r1 = r1 + r0
            float r1 = (float) r1
            float r0 = r6.getTranslationY()
            float r1 = r1 + r0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L50
            int r0 = r3.getTop()
            float r1 = (float) r0
            int r0 = r6.getTop()
            float r0 = (float) r0
            float r1 = r1 + r0
            float r0 = r6.getTranslationY()
            float r1 = r1 + r0
            int r0 = r6.getHeight()
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L50
            goto L1a
        Lb8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC1321700kUy.LJJLJ(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C19EG c19eg;
        float xVelocity;
        float yVelocity;
        float xVelocity2;
        float yVelocity2;
        boolean z2;
        Boolean boolValueOf;
        boolean z3;
        C1321800kV8 c1321800kV8 = this.LLILLJJLI;
        Fragment fragmentLJJLIIIJLLLLLLLZ = null;
        boolean zDispatchTouchEvent = false;
        if (c1321800kV8 != null) {
            VelocityTracker velocityTracker = c1321800kV8.LIZ.LLJJIJI;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        LynxOverlayView lynxOverlayView = c1321800kV8.LIZ;
                        lynxOverlayView.LLILLJJLI = 1;
                        if (lynxOverlayView.LLJJI && lynxOverlayView.LLJJJ == null && (Math.abs(motionEvent.getY() - c1321800kV8.LIZ.LLJJIJIL) > 0.0f || Math.abs(motionEvent.getX() - c1321800kV8.LIZ.LLJJIJIIJIL) > 0.0f)) {
                            LynxOverlayView lynxOverlayView2 = c1321800kV8.LIZ;
                            if (lynxOverlayView2.LLJILJIL != null) {
                                if (!lynxOverlayView2.LLJILJILJ && motionEvent.getY() - c1321800kV8.LIZ.LLJJIJIL > 0.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                boolValueOf = Boolean.valueOf(z3);
                            } else {
                                if (!lynxOverlayView2.LLJILJILJ && Math.abs(motionEvent.getY() - c1321800kV8.LIZ.LLJJIJIL) > Math.abs(motionEvent.getX() - c1321800kV8.LIZ.LLJJIJIIJIL)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                boolValueOf = Boolean.valueOf(z2);
                            }
                            lynxOverlayView2.LLJJJ = boolValueOf;
                            c1321800kV8.LIZ.LLJJIJIL = motionEvent.getY();
                        }
                    }
                } else {
                    c1321800kV8.LIZ.LLILLJJLI = 2;
                }
            } else {
                LynxOverlayView lynxOverlayView3 = c1321800kV8.LIZ;
                lynxOverlayView3.LLILLJJLI = 0;
                if (lynxOverlayView3.LLJJI) {
                    lynxOverlayView3.LLJILJIL = null;
                    lynxOverlayView3.LLJILJILJ = lynxOverlayView3.LJJIIZI(lynxOverlayView3.hitTest(motionEvent.getX(), motionEvent.getY()));
                    LynxOverlayView lynxOverlayView4 = c1321800kV8.LIZ;
                    lynxOverlayView4.LLJJJ = null;
                    lynxOverlayView4.LLJJIJIIJIL = motionEvent.getX();
                    c1321800kV8.LIZ.LLJJIJIL = motionEvent.getY();
                }
            }
            VelocityTracker velocityTracker2 = c1321800kV8.LIZ.LLJJIJI;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            LynxOverlayView lynxOverlayView5 = c1321800kV8.LIZ;
            if (lynxOverlayView5.LLJJI && !Intrinsics.LJFF(lynxOverlayView5.LLJJJ, Boolean.FALSE)) {
                LynxOverlayView lynxOverlayView6 = c1321800kV8.LIZ;
                float fLJJIJIIJI = lynxOverlayView6.LJJIJIIJI(motionEvent.getX());
                float fLJJIJIIJI2 = c1321800kV8.LIZ.LJJIJIIJI(motionEvent.getY());
                VelocityTracker velocityTracker3 = c1321800kV8.LIZ.LLJJIJI;
                if (velocityTracker3 != null) {
                    xVelocity2 = velocityTracker3.getXVelocity();
                } else {
                    xVelocity2 = 0.0f;
                }
                VelocityTracker velocityTracker4 = c1321800kV8.LIZ.LLJJIJI;
                if (velocityTracker4 != null) {
                    yVelocity2 = velocityTracker4.getYVelocity();
                } else {
                    yVelocity2 = 0.0f;
                }
                lynxOverlayView6.LJJIJIIJIL(fLJJIJIIJI, fLJJIJIIJI2, xVelocity2, yVelocity2, "overlaymoved");
            }
            LynxOverlayView lynxOverlayView7 = c1321800kV8.LIZ;
            if (lynxOverlayView7.LLJJIII) {
                float fLJJIJIIJI3 = lynxOverlayView7.LJJIJIIJI(motionEvent.getRawX());
                float fLJJIJIIJI4 = c1321800kV8.LIZ.LJJIJIIJI(motionEvent.getRawY());
                VelocityTracker velocityTracker5 = c1321800kV8.LIZ.LLJJIJI;
                if (velocityTracker5 != null) {
                    xVelocity = velocityTracker5.getXVelocity();
                } else {
                    xVelocity = 0.0f;
                }
                VelocityTracker velocityTracker6 = c1321800kV8.LIZ.LLJJIJI;
                if (velocityTracker6 != null) {
                    yVelocity = velocityTracker6.getYVelocity();
                } else {
                    yVelocity = 0.0f;
                }
                lynxOverlayView7.LJJIJIIJIL(fLJJIJIIJI3, fLJJIJIIJI4, xVelocity, yVelocity, "overlaytouch");
            }
            Boolean bool = c1321800kV8.LIZ.LLJJJ;
            if (bool != null && bool.booleanValue()) {
                LJJLJ(motionEvent);
                return false;
            }
        }
        if (LJJLJ(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        for (C1321790kV7 c1321790kV7 : (ArrayList) C1321730kV1.LIZ) {
            if (c1321790kV7.LIZIZ.LJJLJ(motionEvent) && !Intrinsics.LJFF(this, c1321790kV7.LIZIZ)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        ArrayList arrayList = (ArrayList) C1321730kV1.LIZ;
        if (!(!arrayList.isEmpty())) {
            return false;
        }
        DialogC1321700kUy dialogC1321700kUy = ((C1321790kV7) ListProtector.get(arrayList, 0)).LIZIZ;
        Activity activityLIZ = C1298530jtb.LIZ(dialogC1321700kUy.LL.mContext);
        String str = dialogC1321700kUy.LLILLL;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                fragmentLJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(c19eg.getSupportFragmentManager(), dialogC1321700kUy.LLILLL, pointF);
            }
            if (!(fragmentLJJLIIIJLLLLLLLZ instanceof Fragment) || fragmentLJJLIIIJLLLLLLLZ == null) {
                return false;
            }
            float fLJJLIIJ = dialogC1321700kUy.LJJLIIJ();
            motionEvent.offsetLocation(-0.0f, -fLJJLIIJ);
            if (fragmentLJJLIIIJLLLLLLLZ instanceof DialogFragment) {
                zDispatchTouchEvent = ((DialogFragment) fragmentLJJLIIIJLLLLLLLZ).getDialog().dispatchTouchEvent(motionEvent);
            } else {
                View view = fragmentLJJLIIIJLLLLLLLZ.getView();
                if (view != null) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    float f = iArr[0];
                    float f2 = iArr[1];
                    motionEvent.offsetLocation(-f, -f2);
                    zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                    motionEvent.offsetLocation(f, f2);
                }
            }
            motionEvent.offsetLocation(0.0f, fLJJLIIJ);
            return zDispatchTouchEvent;
        }
        if (activityLIZ == null) {
            return false;
        }
        float fLJJLIIJ2 = dialogC1321700kUy.LJJLIIJ();
        motionEvent.offsetLocation(-0.0f, -fLJJLIIJ2);
        boolean zDispatchTouchEvent2 = activityLIZ.dispatchTouchEvent(motionEvent);
        motionEvent.offsetLocation(0.0f, fLJJLIIJ2);
        return zDispatchTouchEvent2;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    public DialogC1321700kUy(Context context, LynxOverlayView lynxOverlayView) {
        super(context, R.style.kn);
        this.LL = lynxOverlayView;
        this.LLILZ = 1;
        this.LLILZIL = C452501pT.LIZIZ(new AwS564S0100000_20(this, 34));
    }

    public static Fragment LJJLIIIJLLLLLLLZ(FragmentManager fragmentManager, String str, PointF pointF) {
        Fragment fragmentLJJLIIIJLLLLLLLZ;
        float width;
        List<Fragment> listLJLJJLL = C13LP.LJLJJLL(fragmentManager.LJJLIIIJL());
        for (Fragment fragment : listLJLJJLL) {
            if (fragment.isAdded()) {
                int[] iArr = new int[2];
                View view = fragment.getView();
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                }
                float f = iArr[0];
                float f2 = iArr[1];
                View view2 = fragment.getView();
                float height = 0.0f;
                if (view2 != null) {
                    width = view2.getWidth();
                } else {
                    width = 0.0f;
                }
                View view3 = fragment.getView();
                if (view3 != null) {
                    height = view3.getHeight();
                }
                float f3 = pointF.x;
                if (f3 >= f && f3 <= f + width) {
                    float f4 = pointF.y;
                    if (f4 >= f2 && f4 <= f2 + height) {
                        return fragment;
                    }
                }
            }
        }
        Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(str);
        if (fragmentLJJJJZI != null) {
            return fragmentLJJJJZI;
        }
        for (Fragment fragment2 : listLJLJJLL) {
            if (fragment2.isAdded() && (fragmentLJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ(fragment2.getChildFragmentManager(), str, pointF)) != null) {
                return fragmentLJJLIIIJLLLLLLLZ;
            }
        }
        return null;
    }
}
