package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS44S1400000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18eC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21333418eC {
    public static final /* synthetic */ int LIZLLL = 0;
    public final AbstractC21333318eB<?> LIZ;
    public final HashMap<String, ValueAnimator> LIZIZ = new HashMap<>();
    public final int LIZJ;

    public C21333418eC(AbstractC21333318eB<?> abstractC21333318eB) {
        this.LIZ = abstractC21333318eB;
        this.LIZJ = abstractC21333318eB.getView().getLayerType();
    }

    public final void LIZ(boolean z) {
        if (z) {
            Iterator<Map.Entry<String, ValueAnimator>> it2 = this.LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                String key = it2.next().getKey();
                InterfaceC21334018eI.LIZ.getClass();
                InterfaceC21334018eI interfaceC21334018eI = C21335318eV.LIZIZ.get(key);
                if (interfaceC21334018eI != null) {
                    interfaceC21334018eI.LIZLLL(this.LIZ);
                }
            }
        }
        Iterator it3 = C2097608Jq.LJIIZILJ(this.LIZIZ).entrySet().iterator();
        while (it3.hasNext()) {
            ((ValueAnimator) ((Map.Entry) it3.next()).getValue()).cancel();
        }
        this.LIZIZ.clear();
        if (this.LIZ.getView().getLayerType() != this.LIZJ) {
            this.LIZ.getView().setLayerType(this.LIZJ, null);
        }
    }

    public final void LIZIZ(String str) {
        int iLJ;
        C21335118eT c21335118eTLJIIIIZZ = this.LIZ.LL.LJIIIIZZ(str);
        if (c21335118eTLJIIIIZZ == null) {
            Context contextLJJIJLIJ = this.LIZ.LJJIJLIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("template:");
            sbLIZ.append(this.LIZ.LL.LJIIJJI());
            sbLIZ.append(",does not found animation:");
            sbLIZ.append(str);
            C1325860kbg.LJIIIZ(contextLJJIJLIJ, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        AbstractC21333318eB<?> abstractC21333318eB = this.LIZ;
        if (Intrinsics.LJFF(abstractC21333318eB.LLLLZ, "infinite")) {
            iLJ = -1;
        } else {
            iLJ = C1337850kv1.LJ(1, abstractC21333318eB.LLLLZ);
            if (iLJ > 0) {
                iLJ--;
            }
        }
        Iterator<String> it2 = c21335118eTLJIIIIZZ.LIZJ.iterator();
        while (it2.hasNext()) {
            LJ(it2.next(), c21335118eTLJIIIIZZ, iLJ);
        }
    }

    public final Map<String, Object> LIZJ(String str) {
        return C2097608Jq.LJIIIIZZ(new Pair("animation_name", str), new Pair("element_id", this.LIZ.getElementId()));
    }

    public final void LIZLLL(final String str) {
        TimeInterpolator accelerateDecelerateInterpolator;
        int i;
        int iLJ;
        if (!C1338110kvR.LIZ(this.LIZ)) {
            return;
        }
        Iterator<Map.Entry<String, ValueAnimator>> it2 = this.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().pause();
        }
        this.LIZIZ.clear();
        final C21335118eT c21335118eTLJIIIIZZ = this.LIZ.LL.LJIIIIZZ(str);
        if (c21335118eTLJIIIIZZ == null) {
            Context contextLJJIJLIJ = this.LIZ.LJJIJLIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("template:");
            sbLIZ.append(this.LIZ.LL.LJIIJJI());
            sbLIZ.append(",does not found animation:");
            sbLIZ.append(str);
            C1325860kbg.LJIIIZ(contextLJJIJLIJ, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (c21335118eTLJIIIIZZ.LIZJ.isEmpty()) {
            return;
        }
        for (final String str2 : c21335118eTLJIIIIZZ.LIZJ) {
            AbstractC21333318eB<?> abstractC21333318eB = this.LIZ;
            long j = (long) abstractC21333318eB.LLLLLLZZ;
            long j2 = (long) abstractC21333318eB.LLLLLZ;
            List<Double> list = abstractC21333318eB.LLLLLZL;
            if (list != null && list.size() == 4) {
                accelerateDecelerateInterpolator = new PathInterpolator((float) ((Number) ListProtector.get(list, 0)).doubleValue(), (float) ((Number) ListProtector.get(list, 1)).doubleValue(), (float) ((Number) ListProtector.get(list, 2)).doubleValue(), (float) ((Number) ListProtector.get(list, 3)).doubleValue());
            } else {
                accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            }
            AbstractC21333318eB<?> abstractC21333318eB2 = this.LIZ;
            if (Intrinsics.LJFF(abstractC21333318eB2.LLLLZ, "infinite")) {
                iLJ = -1;
                i = 1;
            } else {
                i = 1;
                iLJ = C1337850kv1.LJ(1, abstractC21333318eB2.LLLLZ);
            }
            final ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setDuration(j);
            valueAnimator.setStartDelay(j2);
            valueAnimator.setInterpolator(accelerateDecelerateInterpolator);
            if (iLJ > 0) {
                iLJ--;
            }
            valueAnimator.setRepeatCount(iLJ);
            if (Intrinsics.LJFF(this.LIZ.LLLLLZIL, "alternate")) {
                i = 2;
            }
            valueAnimator.setRepeatMode(i);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.18eR
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.LL.LIZ.LJIILIIL(valueAnimator2.getAnimatedValue(), str2);
                }
            });
            InterfaceC21334018eI.LIZ.getClass();
            InterfaceC21334018eI interfaceC21334018eI = C21335318eV.LIZIZ.get(str2);
            valueAnimator.pause();
            valueAnimator.addListener(new Animator.AnimatorListener() { // from class: X.18eF
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL.LIZIZ.remove(str2);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object obj;
                    InterfaceC1547330qMt interfaceC1547330qMtLIZ;
                    if (this.LL.LIZIZ.containsKey(str2)) {
                        this.LL.LJ(str2, c21335118eTLJIIIIZZ, valueAnimator.getRepeatCount());
                        this.LL.LIZIZ.remove(str2);
                    }
                    if (this.LL.LIZIZ.isEmpty()) {
                        C21333418eC c21333418eC = this.LL;
                        if (c21333418eC.LIZ.getView().getLayerType() != c21333418eC.LIZJ) {
                            c21333418eC.LIZ.getView().setLayerType(c21333418eC.LIZJ, null);
                        }
                    }
                    Map<String, ? extends Object> map = this.LL.LIZ.LLLLL;
                    if (map != null && (obj = map.get("bind_animation_end")) != null && (interfaceC1547330qMtLIZ = C1547350qMv.LIZ(obj)) != null) {
                        AbstractC21333318eB<?> abstractC21333318eB3 = this.LL.LIZ;
                        abstractC21333318eB3.LL.LJ(interfaceC1547330qMtLIZ, abstractC21333318eB3.getView(), abstractC21333318eB3.LIZJ(), this.LL.LIZJ(str));
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    Object obj;
                    InterfaceC1547330qMt interfaceC1547330qMtLIZ;
                    Map<String, ? extends Object> map = this.LL.LIZ.LLLLL;
                    if (map != null && (obj = map.get("bind_animation_start")) != null && (interfaceC1547330qMtLIZ = C1547350qMv.LIZ(obj)) != null) {
                        AbstractC21333318eB<?> abstractC21333318eB3 = this.LL.LIZ;
                        abstractC21333318eB3.LL.LJ(interfaceC1547330qMtLIZ, abstractC21333318eB3.getView(), abstractC21333318eB3.LIZJ(), this.LL.LIZJ(str));
                    }
                }
            });
            this.LIZIZ.put(str2, valueAnimator);
            C1168320gVa.LIZJ(new AwS44S1400000_32(interfaceC21334018eI, this, valueAnimator, c21335118eTLJIIIIZZ, str2, 2));
        }
        if (Intrinsics.LJFF(this.LIZ.LLLLZI, "both") || Intrinsics.LJFF(this.LIZ.LLLLZI, "backwards")) {
            for (String str3 : c21335118eTLJIIIIZZ.LIZJ) {
                InterfaceC21334018eI.LIZ.getClass();
                InterfaceC21334018eI interfaceC21334018eI2 = C21335318eV.LIZIZ.get(str3);
                if (interfaceC21334018eI2 != null) {
                    interfaceC21334018eI2.LJFF(this.LIZ, c21335118eTLJIIIIZZ);
                }
            }
        }
        C1168320gVa.LIZJ(new AwS576S0100000_32(this, 714));
    }

    public final void LJ(String str, C21335118eT c21335118eT, int i) {
        if (!Intrinsics.LJFF(this.LIZ.LLLLZI, "both") && !Intrinsics.LJFF(this.LIZ.LLLLZI, "forwards")) {
            InterfaceC21334018eI.LIZ.getClass();
            InterfaceC21334018eI interfaceC21334018eI = C21335318eV.LIZIZ.get(str);
            if (interfaceC21334018eI != null) {
                interfaceC21334018eI.LIZLLL(this.LIZ);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LIZ.LLLLLZIL, "alternate") && i % 2 == 1) {
            InterfaceC21334018eI.LIZ.getClass();
            InterfaceC21334018eI interfaceC21334018eI2 = C21335318eV.LIZIZ.get(str);
            if (interfaceC21334018eI2 == null) {
                return;
            }
            interfaceC21334018eI2.LJFF(this.LIZ, c21335118eT);
            return;
        }
        if (i == -1) {
            return;
        }
        InterfaceC21334018eI.LIZ.getClass();
        InterfaceC21334018eI interfaceC21334018eI3 = C21335318eV.LIZIZ.get(str);
        if (interfaceC21334018eI3 == null) {
            return;
        }
        interfaceC21334018eI3.LIZIZ(this.LIZ, c21335118eT);
    }
}
