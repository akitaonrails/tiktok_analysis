package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS573S0100000_29;
import njp.a;

/* JADX INFO: renamed from: X.12Mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment$onResume$1", f = "LongPressAwemeFragment.kt", l = {331, 332}, m = "invokeSuspend")
public final class C19743812Mq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LongPressAwemeFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19743812Mq(LongPressAwemeFragment longPressAwemeFragment, InterfaceC1364105Vn<? super C19743812Mq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = longPressAwemeFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19743812Mq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float fWidth;
        float fHeight;
        int i;
        int width;
        float fWidth2;
        float fExactCenterX;
        float fExactCenterY;
        float fHeight2;
        float f;
        float f2;
        float f3;
        ViewGroup.LayoutParams layoutParams;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        Object objCollect;
        C1C7U.LIZ("LongPressAwemeFragment@a3a.onResume$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        int scaledTouchSlop = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LongPressAwemeFragment@a3a.onResume$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C19743712Mp c19743712MpWR = this.LLILLJJLI.WR();
            if (c19743712MpWR != null && (interfaceC1484830ok5 = c19743712MpWR.LIZJ) != null) {
                interfaceC1484830ok5.resume();
            }
            LongPressAwemeFragment longPressAwemeFragment = this.LLILLJJLI;
            this.LL = 1;
            longPressAwemeFragment.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            if (!longPressAwemeFragment.LLJLLL) {
                longPressAwemeFragment.LLJLLL = true;
                AwS573S0100000_29 awS573S0100000_29 = longPressAwemeFragment.LLJLLIL;
                if (awS573S0100000_29 != null) {
                    awS573S0100000_29.invoke();
                }
            }
            Rect rect = longPressAwemeFragment.LLJLILLLLZIIL;
            if (rect != null) {
                fWidth = rect.width();
            } else {
                fWidth = 0.0f;
            }
            Rect rect2 = longPressAwemeFragment.LLJLILLLLZIIL;
            if (rect2 != null) {
                fHeight = rect2.height();
            } else {
                fHeight = 0.0f;
            }
            LinearLayout linearLayout = longPressAwemeFragment.LLIZLLLIL;
            if (linearLayout != null) {
                linearLayout.setPivotX(fWidth / 2.0f);
            }
            LinearLayout linearLayout2 = longPressAwemeFragment.LLIZLLLIL;
            if (linearLayout2 != null) {
                linearLayout2.setPivotY(fHeight / 2.0f);
            }
            ViewGroup viewGroup = longPressAwemeFragment.LLJILLL;
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            Integer numLJ = C2286608xc.LJ(i);
            if (numLJ.intValue() > 0) {
                width = numLJ.intValue();
            } else {
                ViewGroup viewGroup2 = longPressAwemeFragment.LLJILLL;
                if (viewGroup2 != null) {
                    width = viewGroup2.getWidth();
                } else {
                    width = 0;
                }
            }
            ViewGroup viewGroup3 = longPressAwemeFragment.LLJILLL;
            if (viewGroup3 != null) {
                viewGroup3.setPivotX(width / 2.0f);
            }
            ViewGroup viewGroup4 = longPressAwemeFragment.LLJILLL;
            if (viewGroup4 != null) {
                viewGroup4.setPivotY(0.0f);
            }
            C19745412Ng.LIZ.getClass();
            C1776900wLA c1776900wLALIZ = C19745412Ng.LIZ(0.2f, 0.3f, 0.3f, 210L);
            C0HU6 c0hu6 = new C0HU6(new C1342130l1v(1387.0f), new C1342130l1v(59.0f));
            ViewGroup viewGroup5 = longPressAwemeFragment.LLIZ;
            if (viewGroup5 != null) {
                Integer numVR = LongPressAwemeFragment.VR(0.0f, viewGroup5.getContext());
                Integer numVR2 = LongPressAwemeFragment.VR(0.95f, viewGroup5.getContext());
                if (numVR != null && numVR2 != null) {
                    C19745412Ng.LJIIIIZZ(viewGroup5, c1776900wLALIZ, 0L, new AwS546S0100000_2(viewGroup5, 1087), new AwS553S0100000_9(c2252611DEt, 1751), C19745412Ng.LIZJ(numVR.intValue(), numVR2.intValue(), viewGroup5));
                }
            }
            if (longPressAwemeFragment.LLJLILLLLZIIL != null) {
                fWidth2 = longPressAwemeFragment.LLJJIJI.width() / r3.width();
            } else {
                fWidth2 = 0.0f;
            }
            float fCenterX = longPressAwemeFragment.LLJJIJI.centerX();
            Rect rect3 = longPressAwemeFragment.LLJLILLLLZIIL;
            if (rect3 != null) {
                fExactCenterX = rect3.exactCenterX();
            } else {
                fExactCenterX = 0.0f;
            }
            float f4 = fCenterX - fExactCenterX;
            float fCenterY = longPressAwemeFragment.LLJJIJI.centerY();
            Rect rect4 = longPressAwemeFragment.LLJLILLLLZIIL;
            if (rect4 != null) {
                fExactCenterY = rect4.exactCenterY();
            } else {
                fExactCenterY = 0.0f;
            }
            float f5 = fCenterY - fExactCenterY;
            Rect rect5 = longPressAwemeFragment.LLJLILLLLZIIL;
            if (rect5 != null) {
                fHeight2 = rect5.height();
            } else {
                fHeight2 = 0.0f;
            }
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(36)));
            float fCenterY2 = longPressAwemeFragment.LLJJIJI.centerY() + (((fHeight2 / 2.0f) + fLIZIZ) * fWidth2);
            Rect rect6 = longPressAwemeFragment.LLJLILLLLZIIL;
            if (rect6 != null) {
                f = rect6.top;
            } else {
                f = 0.0f;
            }
            float f6 = fCenterY2 - ((f + fHeight2) + fLIZIZ);
            LinearLayout linearLayout3 = longPressAwemeFragment.LLIZLLLIL;
            if (linearLayout3 != null) {
                f2 = 1.0f;
                C19745412Ng.LJIIIZ(linearLayout3, c1776900wLALIZ, C19745412Ng.LJFF(f4, 0.0f), C19745412Ng.LJI(f5, 0.0f), C19745412Ng.LIZLLL(fWidth2, 1.0f), C19745412Ng.LJ(fWidth2, 1.0f));
            } else {
                f2 = 1.0f;
            }
            SmartImageView smartImageView = longPressAwemeFragment.LLJIJIL;
            if (smartImageView != null) {
                f3 = 0.0f;
                C19745412Ng.LJIIIZ(smartImageView, c1776900wLALIZ, C19745412Ng.LIZIZ(0.0f, f2));
            } else {
                f3 = 0.0f;
            }
            FrameLayout frameLayout = longPressAwemeFragment.LLJILJIL;
            if (frameLayout != null) {
                C19745412Ng.LJIIIZ(frameLayout, c1776900wLALIZ, C19745412Ng.LIZIZ(f3, f2));
            }
            ViewGroup viewGroup6 = longPressAwemeFragment.LLJILLL;
            if (viewGroup6 != null) {
                C19745412Ng.LJIIIZ(viewGroup6, c1776900wLALIZ, C19745412Ng.LIZIZ(f3, f2), C19745412Ng.LJFF(f4, f3), C19745412Ng.LJI(f6, f3), C19745412Ng.LIZLLL(fWidth2, f2), C19745412Ng.LJ(fWidth2, f2));
            }
            ImageView imageView = longPressAwemeFragment.LLJJI;
            if (imageView != null) {
                C786410Ut5.Qb(imageView, f2);
                C786410Ut5.rc(imageView, f2);
                C19745412Ng.LJIIIZ(imageView, c1776900wLALIZ, C19745412Ng.LJFF(0.0f, -f4), C19745412Ng.LJI(0.0f, -f5));
                C19745412Ng.LJIIIZ(imageView, c0hu6, C19745412Ng.LIZIZ(f2, 0.0f));
            }
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ != C099R.LJFF()) {
                objLJIJ = Unit.LIZ;
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("LongPressAwemeFragment@a3a.onResume$1");
                return objLJFF;
            }
        }
        final LongPressAwemeFragment longPressAwemeFragment2 = this.LLILLJJLI;
        this.LL = 2;
        longPressAwemeFragment2.getClass();
        final Rect rect7 = new Rect();
        Context context = longPressAwemeFragment2.getContext();
        if (context != null) {
            scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        }
        final int i3 = scaledTouchSlop * 10;
        final C817403Hg c817403Hg = new C817403Hg();
        final C817403Hg c817403Hg2 = new C817403Hg();
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        InterfaceC346201Wa<MotionEvent> interfaceC346201Wa = longPressAwemeFragment2.LLJLIL;
        if (interfaceC346201Wa == null || (objCollect = interfaceC346201Wa.collect(new InterfaceC346701Wf() { // from class: X.0Gvp
            @Override // X.InterfaceC346701Wf
            public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                MotionEvent motionEvent = (MotionEvent) obj2;
                int actionMasked = motionEvent.getActionMasked();
                if (!c013c.element) {
                    c817403Hg.element = motionEvent.getRawX();
                    c817403Hg2.element = motionEvent.getRawY();
                    c013c.element = true;
                }
                float fHypot = (float) Math.hypot(motionEvent.getRawX() - c817403Hg.element, motionEvent.getRawY() - c817403Hg2.element);
                if (actionMasked == 2) {
                    C013C c013c3 = c013c2;
                    if (!c013c3.element && fHypot > i3) {
                        c013c3.element = true;
                    }
                }
                ViewGroup viewGroup7 = longPressAwemeFragment2.LLJILLL;
                if (viewGroup7 != null) {
                    C09RD c09rd = new C09RD(viewGroup7);
                    Rect rect8 = rect7;
                    C013C c013c4 = c013c2;
                    Iterator<View> it2 = c09rd.iterator();
                    while (true) {
                        C09RE c09re = (C09RE) it2;
                        if (!c09re.hasNext()) {
                            break;
                        }
                        View view = (View) c09re.next();
                        view.getGlobalVisibleRect(rect8);
                        boolean zContains = rect8.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        boolean z = false;
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                if (actionMasked != 3) {
                                }
                            } else {
                                if (c013c4.element && zContains) {
                                    z = true;
                                }
                                view.setPressed(z);
                            }
                        }
                        view.setPressed(false);
                        if (zContains && c013c4.element) {
                            view.performClick();
                        }
                    }
                }
                return Unit.LIZ;
            }
        }, this)) != C099R.LJFF()) {
            objCollect = Unit.LIZ;
        }
        if (objCollect == objLJFF) {
            C1C7U.LIZIZ("LongPressAwemeFragment@a3a.onResume$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LongPressAwemeFragment@a3a.onResume$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
