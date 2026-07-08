package X;

import Y.ALAdapterS6S0400000_32;
import android.animation.Animator;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19K2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19K2 implements InterfaceC21604519gp {
    public static final /* synthetic */ int LJIIL = 0;
    public final ViewGroup LIZ;
    public final C19K6 LIZIZ;
    public Interpolator LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public Choreographer LJIIJ;
    public final C21267318Kp LIZJ = new C21267318Kp();
    public final C19K3 LJIIJJI = new Choreographer.FrameCallback() { // from class: X.19K3
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Choreographer choreographer;
            C19K2 c19k2 = this.LL;
            if (c19k2.LJ) {
                long jUptimeMillis = SystemClock.uptimeMillis() - c19k2.LJIIIIZZ;
                int i = c19k2.LJII;
                float interpolation = 1.0f;
                if (i > 0) {
                    interpolation = C13LZ.LIZLLL(jUptimeMillis / i, 0.0f, 1.0f);
                }
                Interpolator interpolator = c19k2.LIZLLL;
                if (interpolator != null) {
                    interpolation = interpolator.getInterpolation(interpolation);
                }
                int i2 = c19k2.LJFF;
                int i3 = c19k2.LJI;
                int i4 = i2 + i3;
                int iRound = i2 + Math.round(i3 * interpolation);
                int i5 = c19k2.LJI;
                if (i5 > 0) {
                    iRound = Math.min(iRound, i4 - 1);
                } else if (i5 < 0) {
                    iRound = Math.max(iRound, i4 + 1);
                }
                c19k2.LJIIIZ = iRound;
                ((C19K4) c19k2.LIZIZ).LIZ.LJJI(iRound);
                if (c19k2.LJ && jUptimeMillis < c19k2.LJII && (choreographer = c19k2.LJIIJ) != null) {
                    choreographer.postFrameCallback(c19k2.LJIIJJI);
                }
            }
        }
    };

    public final void LIZJ() {
        if (this.LJ) {
            Choreographer choreographer = this.LJIIJ;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this.LJIIJJI);
            }
            this.LJ = false;
            this.LIZJ.LIZ(true);
        }
    }

    public final void LIZLLL() {
        if (this.LJ) {
            Choreographer choreographer = this.LJIIJ;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this.LJIIJJI);
            }
            this.LJIIIZ = this.LJFF + this.LJI;
            SystemClock.uptimeMillis();
            C19K6 c19k6 = this.LIZIZ;
            ((C19K4) c19k6).LIZ.LJJI(this.LJIIIZ);
            this.LJ = false;
            this.LIZ.postInvalidateOnAnimation();
        }
    }

    @Override // X.InterfaceC21604519gp
    public final void LIZ() {
        LIZJ();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19K3] */
    public C19K2(ViewGroup viewGroup, C19K4 c19k4) {
        this.LIZ = viewGroup;
        this.LIZIZ = c19k4;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // X.InterfaceC21604519gp
    public final boolean LIZIZ(int i, int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        Method method;
        Animator animator;
        Object[] objArr;
        if (this.LJ) {
            LIZJ();
        }
        this.LIZIZ.getClass();
        EnumC21519919Jt enumC21519919Jt = EnumC21519919Jt.Y;
        C19K4 c19k4 = (C19K4) this.LIZIZ;
        if (c19k4.LIZ.LLJJJJJIL) {
            VerticalViewPager verticalViewPager = c19k4.LIZ;
            if (verticalViewPager.LLLLLL != null || verticalViewPager.LLLLIILLL || verticalViewPager.getChildCount() <= 0 || i4 == 0 || C1969207nW.LIZ == null || C1969207nW.LIZIZ == null || !this.LIZ.isHardwareAccelerated()) {
                return false;
            }
            VerticalViewPager verticalViewPager2 = ((C19K4) this.LIZIZ).LIZ;
            verticalViewPager2.getClass();
            ArrayList<View> arrayList = new ArrayList(verticalViewPager2.getChildCount());
            for (int i7 = 0; i7 < verticalViewPager2.getChildCount(); i7++) {
                View childAt = verticalViewPager2.getChildAt(i7);
                C21601919gP c21601919gP = (C21601919gP) childAt.getLayoutParams();
                if (c21601919gP != null && !c21601919gP.LIZ) {
                    arrayList.add(childAt);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            EnumC21519919Jt enumC21519919Jt2 = EnumC21519919Jt.Y;
            if (enumC21519919Jt == enumC21519919Jt2) {
                i6 = i2 + i4;
            } else {
                i6 = i + i3;
            }
            this.LJ = true;
            this.LJI = i4;
            this.LJFF = i6 - i4;
            this.LJII = i5;
            this.LJIIIIZZ = SystemClock.uptimeMillis();
            this.LJIIIZ = this.LJFF;
            if (enumC21519919Jt == enumC21519919Jt2) {
                this.LIZ.scrollTo(0, i6);
            } else {
                this.LIZ.scrollTo(i6, 0);
            }
            C21267318Kp c21267318Kp = this.LIZJ;
            EnumC21519819Js property = enumC21519919Jt.toProperty();
            float f = i4;
            long j = i5;
            Interpolator interpolator = this.LIZLLL;
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 841);
            c21267318Kp.LIZ(false);
            Constructor<?> constructor = C1969207nW.LIZ;
            if (constructor != null && C1969207nW.LIZIZ != null && 1 != 0 && !arrayList.isEmpty() && f != 0.0f) {
                c21267318Kp.LIZJ = property;
                c21267318Kp.LIZLLL = 0.0f;
                C118300cf c118300cf = new C118300cf();
                C013C c013c = new C013C();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    property.set((View) it2.next(), f);
                }
                for (View view : arrayList) {
                    Constructor<?> constructor2 = C1969207nW.LIZ;
                    if (constructor2 != null && (method = C1969207nW.LIZIZ) != null && view.isHardwareAccelerated()) {
                        try {
                            Object[] objArr2 = new Object[2];
                            try {
                                try {
                                    objArr2[0] = Integer.valueOf(property.renderProperty);
                                    objArr2[1] = Float.valueOf(0.0f);
                                    animator = (Animator) constructor2.newInstance(objArr2);
                                    objArr = new Object[1];
                                    objArr[0] = view;
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            C2204961BRm.a0(method, animator, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvccEnowLs7WO3+Er51y2cwsOdYlxSfj036v9m4=", null));
                        } catch (Throwable th4) {
                            th = th4;
                            TryCatchGuardChecker.doCheck(th);
                        }
                        if (animator != null) {
                            animator.setDuration(j);
                            if (interpolator != null) {
                                animator.setInterpolator(interpolator);
                            }
                            animator.addListener(new ALAdapterS6S0400000_32(c118300cf, c013c, c21267318Kp, awS576S0100000_32, 2));
                            c21267318Kp.LIZ.add(animator);
                            c118300cf.element++;
                        }
                    }
                    property.set(view, 0.0f);
                }
                if (!c21267318Kp.LIZ.isEmpty()) {
                    c21267318Kp.LIZIZ = new ArrayList(arrayList);
                    Iterator<Animator> it3 = c21267318Kp.LIZ.iterator();
                    while (it3.hasNext()) {
                        it3.next().start();
                    }
                    Choreographer choreographerV2 = C786410Ut5.v2();
                    this.LJIIJ = choreographerV2;
                    if (choreographerV2 != null) {
                        choreographerV2.postFrameCallback(this.LJIIJJI);
                    }
                    return true;
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("anim.start: precondition failed (supported=");
                if (constructor != null && C1969207nW.LIZIZ != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(", targets=");
                sbLIZ.append(Integer.valueOf(arrayList.size()));
                sbLIZ.append(", from=");
                sbLIZ.append(f);
                sbLIZ.append(", to=");
                sbLIZ.append(0.0f);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
            }
            LIZLLL();
            return true;
        }
        return false;
    }
}
