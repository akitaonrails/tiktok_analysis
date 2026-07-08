package X;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import com.tiktok.myna.render.render.widget.animation.MynaAnimationKeyframe;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18eV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21335318eV {
    public static final /* synthetic */ C21335318eV LIZ = new C21335318eV();
    public static final HashMap<String, InterfaceC21334018eI> LIZIZ = C2097608Jq.LJI(new Pair("opacity", new InterfaceC21334018eI() { // from class: X.18eU
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            C786410Ut5.T4(abstractC21333318eB.getView(), C1337850kv1.LIZIZ(1.0f, abstractC21333318eB.LLLIIIIL));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            C786410Ut5.T4(abstractC21333318eB.getView(), C1337850kv1.LIZIZ(C1337850kv1.LIZIZ(1.0f, abstractC21333318eB.LLLIIIIL), C21335318eV.LIZ(map, "opacity", abstractC21333318eB)));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            float fFloatValue;
            View view = abstractC21333318eB.getView();
            Float fLIZLLL = C1337850kv1.LIZLLL(obj);
            if (fLIZLLL != null) {
                fFloatValue = fLIZLLL.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.T4(view, fFloatValue);
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            C786410Ut5.T4(abstractC21333318eB.getView(), C1337850kv1.LIZIZ(C1337850kv1.LIZIZ(1.0f, abstractC21333318eB.LLLIIIIL), C21335318eV.LIZ(map, "opacity", abstractC21333318eB)));
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            float fLIZIZ = C1337850kv1.LIZIZ(abstractC21333318eB.getView().getAlpha(), C21335318eV.LIZ(map, "opacity", abstractC21333318eB));
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            valueAnimator.setFloatValues(fLIZIZ, C1337850kv1.LIZIZ(abstractC21333318eB.getView().getAlpha(), C21335318eV.LIZ(map2, "opacity", abstractC21333318eB)));
            return true;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            valueAnimator.setFloatValues(abstractC21333318eB.getView().getAlpha(), C1337850kv1.LIZIZ(1.0f, obj));
            return true;
        }
    }), new Pair(":opacity", new InterfaceC21334018eI() { // from class: X.18eU
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            C786410Ut5.T4(abstractC21333318eB.getView(), C1337850kv1.LIZIZ(1.0f, abstractC21333318eB.LLLIIIIL));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            C786410Ut5.T4(abstractC21333318eB.getView(), C1337850kv1.LIZIZ(C1337850kv1.LIZIZ(1.0f, abstractC21333318eB.LLLIIIIL), C21335318eV.LIZ(map, "opacity", abstractC21333318eB)));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            float fFloatValue;
            View view = abstractC21333318eB.getView();
            Float fLIZLLL = C1337850kv1.LIZLLL(obj);
            if (fLIZLLL != null) {
                fFloatValue = fLIZLLL.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.T4(view, fFloatValue);
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            C786410Ut5.T4(abstractC21333318eB.getView(), C1337850kv1.LIZIZ(C1337850kv1.LIZIZ(1.0f, abstractC21333318eB.LLLIIIIL), C21335318eV.LIZ(map, "opacity", abstractC21333318eB)));
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            float fLIZIZ = C1337850kv1.LIZIZ(abstractC21333318eB.getView().getAlpha(), C21335318eV.LIZ(map, "opacity", abstractC21333318eB));
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            valueAnimator.setFloatValues(fLIZIZ, C1337850kv1.LIZIZ(abstractC21333318eB.getView().getAlpha(), C21335318eV.LIZ(map2, "opacity", abstractC21333318eB)));
            return true;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            valueAnimator.setFloatValues(abstractC21333318eB.getView().getAlpha(), C1337850kv1.LIZIZ(1.0f, obj));
            return true;
        }
    }), new Pair("translate", new InterfaceC21334018eI() { // from class: X.18eb
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            abstractC21333318eB.LJLJJI(abstractC21333318eB.LLLLLIL, abstractC21333318eB.LLLLLILLIL);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            List list;
            Object objLJJJLZIJ;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            Object objLJJJLZIJ2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "translate", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            } else {
                list = null;
            }
            C21325918cz c21325918cz = abstractC21333318eB.LL;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            C1337880kv4 c1337880kv4LIZLLL = C1337960kvC.LIZLLL(c21325918cz, objLJJJLZIJ);
            if (c1337880kv4LIZLLL == null) {
                c1337880kv4LIZLLL = abstractC21333318eB.LLLLLIL;
            }
            C21325918cz c21325918cz2 = abstractC21333318eB.LL;
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            }
            C1337880kv4 c1337880kv4LIZLLL2 = C1337960kvC.LIZLLL(c21325918cz2, objLJJJLZIJ2);
            if (c1337880kv4LIZLLL2 == null) {
                c1337880kv4LIZLLL2 = abstractC21333318eB.LLLLLILLIL;
            }
            abstractC21333318eB.LJLJJI(c1337880kv4LIZLLL, c1337880kv4LIZLLL2);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            List list;
            C1337880kv4 c1337880kv4;
            C1337880kv4 c1337880kv42 = null;
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            View view = abstractC21333318eB.getView();
            if (list != null) {
                c1337880kv4 = (C1337880kv4) C13LP.LJJJLZIJ(0, list);
            } else {
                c1337880kv4 = null;
            }
            float fLJJIIZ = abstractC21333318eB.LJJIIZ(c1337880kv4);
            if (list != null) {
                c1337880kv42 = (C1337880kv4) C13LP.LJJJLZIJ(1, list);
            }
            float fLJJIIZI = abstractC21333318eB.LJJIIZI(c1337880kv42);
            C786410Ut5.Jc(view, fLJJIIZ);
            C786410Ut5.ed(view, fLJJIIZI);
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            List list;
            Object objLJJJLZIJ;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Object objLJJJLZIJ2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "translate", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            } else {
                list = null;
            }
            C21325918cz c21325918cz = abstractC21333318eB.LL;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            C1337880kv4 c1337880kv4LIZLLL = C1337960kvC.LIZLLL(c21325918cz, objLJJJLZIJ);
            if (c1337880kv4LIZLLL == null) {
                c1337880kv4LIZLLL = abstractC21333318eB.LLLLLIL;
            }
            C21325918cz c21325918cz2 = abstractC21333318eB.LL;
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            }
            C1337880kv4 c1337880kv4LIZLLL2 = C1337960kvC.LIZLLL(c21325918cz2, objLJJJLZIJ2);
            if (c1337880kv4LIZLLL2 == null) {
                c1337880kv4LIZLLL2 = abstractC21333318eB.LLLLLILLIL;
            }
            abstractC21333318eB.LJLJJI(c1337880kv4LIZLLL, c1337880kv4LIZLLL2);
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            List list;
            float fLJJIIZ;
            float fLJJIIZI;
            float fLJJIIZ2;
            List list2;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "translate", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            } else {
                list = null;
            }
            float fLJJIIZI2 = 0.0f;
            if (list != null) {
                fLJJIIZ = abstractC21333318eB.LJJIIZ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C13LP.LJJJLZIJ(0, list)));
            } else {
                fLJJIIZ = 0.0f;
            }
            if (list != null) {
                fLJJIIZI = abstractC21333318eB.LJJIIZI(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C13LP.LJJJLZIJ(1, list)));
            } else {
                fLJJIIZI = 0.0f;
            }
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            Object objLIZ2 = C21335318eV.LIZ(map2, "translate", abstractC21333318eB);
            if ((objLIZ2 instanceof List) && (list2 = (List) objLIZ2) != null) {
                fLJJIIZ2 = abstractC21333318eB.LJJIIZ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C13LP.LJJJLZIJ(0, list2)));
                fLJJIIZI2 = abstractC21333318eB.LJJIIZI(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C13LP.LJJJLZIJ(1, list2)));
            } else {
                fLJJIIZ2 = 0.0f;
            }
            List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(fLJJIIZ), Float.valueOf(fLJJIIZI));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(fLJJIIZ2), Float.valueOf(fLJJIIZI2));
            valueAnimator.setObjectValues(listLJIIJJI, listLJIIJJI2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18eh
                /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
                @Override // android.animation.TypeEvaluator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object evaluate(float r9, java.lang.Object r10, java.lang.Object r11) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof java.util.List
                        r7 = 0
                        if (r0 == 0) goto L73
                        java.util.List r10 = (java.util.List) r10
                    L7:
                        boolean r0 = r11 instanceof java.util.List
                        if (r0 == 0) goto Le
                        r7 = r11
                        java.util.List r7 = (java.util.List) r7
                    Le:
                        r6 = 0
                        r5 = 0
                        if (r10 == 0) goto L71
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r10)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L71
                        float r4 = r0.floatValue()
                    L1e:
                        r3 = 1
                        if (r10 == 0) goto L6f
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r10)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L6f
                        float r2 = r0.floatValue()
                    L2d:
                        if (r7 == 0) goto L6b
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r7)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L6b
                        float r1 = r0.floatValue()
                    L3b:
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r7)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L47
                        float r6 = r0.floatValue()
                    L47:
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 == 0) goto L4e
                        float r1 = r1 - r4
                        float r1 = r1 * r9
                        float r4 = r4 + r1
                    L4e:
                        int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                        if (r0 == 0) goto L55
                        float r6 = r6 - r2
                        float r6 = r6 * r9
                        float r2 = r2 + r6
                    L55:
                        r0 = 2
                        X.0kv4[] r1 = new X.C1337880kv4[r0]
                        X.0kv4 r0 = new X.0kv4
                        r0.<init>(r4, r3)
                        r1[r5] = r0
                        X.0kv4 r0 = new X.0kv4
                        r0.<init>(r2, r3)
                        r1[r3] = r0
                        java.util.List r0 = X.C1697810uHb.LJIIJJI(r1)
                        return r0
                    L6b:
                        r1 = 0
                        if (r7 == 0) goto L47
                        goto L3b
                    L6f:
                        r2 = 0
                        goto L2d
                    L71:
                        r4 = 0
                        goto L1e
                    L73:
                        r10 = r7
                        goto L7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21336518eh.evaluate(float, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
            if (!Intrinsics.LJFF(listLJIIJJI, listLJIIJJI2)) {
                return true;
            }
            C1168400gVi.LIZ(AFwS278S0000000_32.get$arr$(161));
            return false;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            List list;
            C1337880kv4 c1337880kv4;
            float translationX = abstractC21333318eB.getView().getTranslationX();
            float translationY = abstractC21333318eB.getView().getTranslationY();
            C1337880kv4 c1337880kv42 = null;
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            if (list != null) {
                c1337880kv4 = (C1337880kv4) C13LP.LJJJLZIJ(0, list);
            } else {
                c1337880kv4 = null;
            }
            float fLJJIIZ = abstractC21333318eB.LJJIIZ(c1337880kv4);
            if (list != null) {
                c1337880kv42 = (C1337880kv4) C13LP.LJJJLZIJ(1, list);
            }
            float fLJJIIZI = abstractC21333318eB.LJJIIZI(c1337880kv42);
            List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(translationX), Float.valueOf(translationY));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(fLJJIIZ), Float.valueOf(fLJJIIZI));
            if (Intrinsics.LJFF(listLJIIJJI, listLJIIJJI2)) {
                return false;
            }
            valueAnimator.setObjectValues(listLJIIJJI, listLJIIJJI2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18ej
                /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
                @Override // android.animation.TypeEvaluator
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object evaluate(float r9, java.lang.Object r10, java.lang.Object r11) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof java.util.List
                        r7 = 0
                        if (r0 == 0) goto L73
                        java.util.List r10 = (java.util.List) r10
                    L7:
                        boolean r0 = r11 instanceof java.util.List
                        if (r0 == 0) goto Le
                        r7 = r11
                        java.util.List r7 = (java.util.List) r7
                    Le:
                        r6 = 0
                        r5 = 0
                        if (r10 == 0) goto L71
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r10)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L71
                        float r4 = r0.floatValue()
                    L1e:
                        r3 = 1
                        if (r10 == 0) goto L6f
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r10)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L6f
                        float r2 = r0.floatValue()
                    L2d:
                        if (r7 == 0) goto L6b
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r7)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L6b
                        float r1 = r0.floatValue()
                    L3b:
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r7)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L47
                        float r6 = r0.floatValue()
                    L47:
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 == 0) goto L4e
                        float r1 = r1 - r4
                        float r1 = r1 * r9
                        float r4 = r4 + r1
                    L4e:
                        int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                        if (r0 == 0) goto L55
                        float r6 = r6 - r2
                        float r6 = r6 * r9
                        float r2 = r2 + r6
                    L55:
                        r0 = 2
                        X.0kv4[] r1 = new X.C1337880kv4[r0]
                        X.0kv4 r0 = new X.0kv4
                        r0.<init>(r4, r3)
                        r1[r5] = r0
                        X.0kv4 r0 = new X.0kv4
                        r0.<init>(r2, r3)
                        r1[r3] = r0
                        java.util.List r0 = X.C1697810uHb.LJIIJJI(r1)
                        return r0
                    L6b:
                        r1 = 0
                        if (r7 == 0) goto L47
                        goto L3b
                    L6f:
                        r2 = 0
                        goto L2d
                    L71:
                        r4 = 0
                        goto L1e
                    L73:
                        r10 = r7
                        goto L7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21336718ej.evaluate(float, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
            return true;
        }
    }), new Pair(":translate", new InterfaceC21334018eI() { // from class: X.18eb
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            abstractC21333318eB.LJLJJI(abstractC21333318eB.LLLLLIL, abstractC21333318eB.LLLLLILLIL);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            List list;
            Object objLJJJLZIJ;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            Object objLJJJLZIJ2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "translate", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            } else {
                list = null;
            }
            C21325918cz c21325918cz = abstractC21333318eB.LL;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            C1337880kv4 c1337880kv4LIZLLL = C1337960kvC.LIZLLL(c21325918cz, objLJJJLZIJ);
            if (c1337880kv4LIZLLL == null) {
                c1337880kv4LIZLLL = abstractC21333318eB.LLLLLIL;
            }
            C21325918cz c21325918cz2 = abstractC21333318eB.LL;
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            }
            C1337880kv4 c1337880kv4LIZLLL2 = C1337960kvC.LIZLLL(c21325918cz2, objLJJJLZIJ2);
            if (c1337880kv4LIZLLL2 == null) {
                c1337880kv4LIZLLL2 = abstractC21333318eB.LLLLLILLIL;
            }
            abstractC21333318eB.LJLJJI(c1337880kv4LIZLLL, c1337880kv4LIZLLL2);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            List list;
            C1337880kv4 c1337880kv4;
            C1337880kv4 c1337880kv42 = null;
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            View view = abstractC21333318eB.getView();
            if (list != null) {
                c1337880kv4 = (C1337880kv4) C13LP.LJJJLZIJ(0, list);
            } else {
                c1337880kv4 = null;
            }
            float fLJJIIZ = abstractC21333318eB.LJJIIZ(c1337880kv4);
            if (list != null) {
                c1337880kv42 = (C1337880kv4) C13LP.LJJJLZIJ(1, list);
            }
            float fLJJIIZI = abstractC21333318eB.LJJIIZI(c1337880kv42);
            C786410Ut5.Jc(view, fLJJIIZ);
            C786410Ut5.ed(view, fLJJIIZI);
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            List list;
            Object objLJJJLZIJ;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Object objLJJJLZIJ2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "translate", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            } else {
                list = null;
            }
            C21325918cz c21325918cz = abstractC21333318eB.LL;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            C1337880kv4 c1337880kv4LIZLLL = C1337960kvC.LIZLLL(c21325918cz, objLJJJLZIJ);
            if (c1337880kv4LIZLLL == null) {
                c1337880kv4LIZLLL = abstractC21333318eB.LLLLLIL;
            }
            C21325918cz c21325918cz2 = abstractC21333318eB.LL;
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            }
            C1337880kv4 c1337880kv4LIZLLL2 = C1337960kvC.LIZLLL(c21325918cz2, objLJJJLZIJ2);
            if (c1337880kv4LIZLLL2 == null) {
                c1337880kv4LIZLLL2 = abstractC21333318eB.LLLLLILLIL;
            }
            abstractC21333318eB.LJLJJI(c1337880kv4LIZLLL, c1337880kv4LIZLLL2);
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            List list;
            float fLJJIIZ;
            float fLJJIIZI;
            float fLJJIIZ2;
            List list2;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "translate", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            } else {
                list = null;
            }
            float fLJJIIZI2 = 0.0f;
            if (list != null) {
                fLJJIIZ = abstractC21333318eB.LJJIIZ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C13LP.LJJJLZIJ(0, list)));
            } else {
                fLJJIIZ = 0.0f;
            }
            if (list != null) {
                fLJJIIZI = abstractC21333318eB.LJJIIZI(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C13LP.LJJJLZIJ(1, list)));
            } else {
                fLJJIIZI = 0.0f;
            }
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            Object objLIZ2 = C21335318eV.LIZ(map2, "translate", abstractC21333318eB);
            if ((objLIZ2 instanceof List) && (list2 = (List) objLIZ2) != null) {
                fLJJIIZ2 = abstractC21333318eB.LJJIIZ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C13LP.LJJJLZIJ(0, list2)));
                fLJJIIZI2 = abstractC21333318eB.LJJIIZI(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C13LP.LJJJLZIJ(1, list2)));
            } else {
                fLJJIIZ2 = 0.0f;
            }
            List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(fLJJIIZ), Float.valueOf(fLJJIIZI));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(fLJJIIZ2), Float.valueOf(fLJJIIZI2));
            valueAnimator.setObjectValues(listLJIIJJI, listLJIIJJI2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18eh
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float v, Object v2, Object v3) {
                    /*
                        this = this;
                        boolean r0 = r10 instanceof java.util.List
                        r7 = 0
                        if (r0 == 0) goto L73
                        java.util.List r10 = (java.util.List) r10
                    L7:
                        boolean r0 = r11 instanceof java.util.List
                        if (r0 == 0) goto Le
                        r7 = r11
                        java.util.List r7 = (java.util.List) r7
                    Le:
                        r6 = 0
                        r5 = 0
                        if (r10 == 0) goto L71
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r10)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L71
                        float r4 = r0.floatValue()
                    L1e:
                        r3 = 1
                        if (r10 == 0) goto L6f
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r10)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L6f
                        float r2 = r0.floatValue()
                    L2d:
                        if (r7 == 0) goto L6b
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r7)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L6b
                        float r1 = r0.floatValue()
                    L3b:
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r7)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L47
                        float r6 = r0.floatValue()
                    L47:
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 == 0) goto L4e
                        float r1 = r1 - r4
                        float r1 = r1 * r9
                        float r4 = r4 + r1
                    L4e:
                        int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                        if (r0 == 0) goto L55
                        float r6 = r6 - r2
                        float r6 = r6 * r9
                        float r2 = r2 + r6
                    L55:
                        r0 = 2
                        X.0kv4[] r1 = new X.C1337880kv4[r0]
                        X.0kv4 r0 = new X.0kv4
                        r0.<init>(r4, r3)
                        r1[r5] = r0
                        X.0kv4 r0 = new X.0kv4
                        r0.<init>(r2, r3)
                        r1[r3] = r0
                        java.util.List r0 = X.C1697810uHb.LJIIJJI(r1)
                        return r0
                    L6b:
                        r1 = 0
                        if (r7 == 0) goto L47
                        goto L3b
                    L6f:
                        r2 = 0
                        goto L2d
                    L71:
                        r4 = 0
                        goto L1e
                    L73:
                        r10 = r7
                        goto L7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21336518eh.evaluate(float, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
            if (!Intrinsics.LJFF(listLJIIJJI, listLJIIJJI2)) {
                return true;
            }
            C1168400gVi.LIZ(AFwS278S0000000_32.get$arr$(161));
            return false;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            List list;
            C1337880kv4 c1337880kv4;
            float translationX = abstractC21333318eB.getView().getTranslationX();
            float translationY = abstractC21333318eB.getView().getTranslationY();
            C1337880kv4 c1337880kv42 = null;
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            if (list != null) {
                c1337880kv4 = (C1337880kv4) C13LP.LJJJLZIJ(0, list);
            } else {
                c1337880kv4 = null;
            }
            float fLJJIIZ = abstractC21333318eB.LJJIIZ(c1337880kv4);
            if (list != null) {
                c1337880kv42 = (C1337880kv4) C13LP.LJJJLZIJ(1, list);
            }
            float fLJJIIZI = abstractC21333318eB.LJJIIZI(c1337880kv42);
            List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(translationX), Float.valueOf(translationY));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(fLJJIIZ), Float.valueOf(fLJJIIZI));
            if (Intrinsics.LJFF(listLJIIJJI, listLJIIJJI2)) {
                return false;
            }
            valueAnimator.setObjectValues(listLJIIJJI, listLJIIJJI2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18ej
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float v, Object v2, Object v3) {
                    /*
                        this = this;
                        boolean r0 = r10 instanceof java.util.List
                        r7 = 0
                        if (r0 == 0) goto L73
                        java.util.List r10 = (java.util.List) r10
                    L7:
                        boolean r0 = r11 instanceof java.util.List
                        if (r0 == 0) goto Le
                        r7 = r11
                        java.util.List r7 = (java.util.List) r7
                    Le:
                        r6 = 0
                        r5 = 0
                        if (r10 == 0) goto L71
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r10)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L71
                        float r4 = r0.floatValue()
                    L1e:
                        r3 = 1
                        if (r10 == 0) goto L6f
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r10)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L6f
                        float r2 = r0.floatValue()
                    L2d:
                        if (r7 == 0) goto L6b
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r7)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L6b
                        float r1 = r0.floatValue()
                    L3b:
                        java.lang.Object r0 = X.C13LP.LJJJLZIJ(r3, r7)
                        java.lang.Float r0 = (java.lang.Float) r0
                        if (r0 == 0) goto L47
                        float r6 = r0.floatValue()
                    L47:
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 == 0) goto L4e
                        float r1 = r1 - r4
                        float r1 = r1 * r9
                        float r4 = r4 + r1
                    L4e:
                        int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                        if (r0 == 0) goto L55
                        float r6 = r6 - r2
                        float r6 = r6 * r9
                        float r2 = r2 + r6
                    L55:
                        r0 = 2
                        X.0kv4[] r1 = new X.C1337880kv4[r0]
                        X.0kv4 r0 = new X.0kv4
                        r0.<init>(r4, r3)
                        r1[r5] = r0
                        X.0kv4 r0 = new X.0kv4
                        r0.<init>(r2, r3)
                        r1[r3] = r0
                        java.util.List r0 = X.C1697810uHb.LJIIJJI(r1)
                        return r0
                    L6b:
                        r1 = 0
                        if (r7 == 0) goto L47
                        goto L3b
                    L6f:
                        r2 = 0
                        goto L2d
                    L71:
                        r4 = 0
                        goto L1e
                    L73:
                        r10 = r7
                        goto L7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21336718ej.evaluate(float, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            });
            return true;
        }
    }), new Pair("rotate", new InterfaceC21334018eI() { // from class: X.18eg
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            abstractC21333318eB.LJLI(C1337850kv1.LIZIZ(0.0f, abstractC21333318eB.LLLIL));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            abstractC21333318eB.LJLI(C1337850kv1.LIZIZ(C1337850kv1.LIZIZ(0.0f, abstractC21333318eB.LLLIL), C21335318eV.LIZ(map, "rotate", abstractC21333318eB)));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            abstractC21333318eB.LJLI(C1337850kv1.LIZIZ(0.0f, obj));
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            abstractC21333318eB.LJLI(C1337850kv1.LIZIZ(C1337850kv1.LIZIZ(0.0f, abstractC21333318eB.LLLIL), C21335318eV.LIZ(map, "rotate", abstractC21333318eB)));
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            float fLIZIZ = C1337850kv1.LIZIZ(abstractC21333318eB.getView().getRotation(), C21335318eV.LIZ(map, "rotate", abstractC21333318eB));
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            valueAnimator.setFloatValues(fLIZIZ, C1337850kv1.LIZIZ(abstractC21333318eB.getView().getRotation(), C21335318eV.LIZ(map2, "rotate", abstractC21333318eB)));
            return true;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            valueAnimator.setFloatValues(abstractC21333318eB.getView().getRotation(), C1337850kv1.LIZIZ(0.0f, obj));
            return true;
        }
    }), new Pair(":rotate", new InterfaceC21334018eI() { // from class: X.18eg
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            abstractC21333318eB.LJLI(C1337850kv1.LIZIZ(0.0f, abstractC21333318eB.LLLIL));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            abstractC21333318eB.LJLI(C1337850kv1.LIZIZ(C1337850kv1.LIZIZ(0.0f, abstractC21333318eB.LLLIL), C21335318eV.LIZ(map, "rotate", abstractC21333318eB)));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            abstractC21333318eB.LJLI(C1337850kv1.LIZIZ(0.0f, obj));
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            abstractC21333318eB.LJLI(C1337850kv1.LIZIZ(C1337850kv1.LIZIZ(0.0f, abstractC21333318eB.LLLIL), C21335318eV.LIZ(map, "rotate", abstractC21333318eB)));
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            float fLIZIZ = C1337850kv1.LIZIZ(abstractC21333318eB.getView().getRotation(), C21335318eV.LIZ(map, "rotate", abstractC21333318eB));
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            valueAnimator.setFloatValues(fLIZIZ, C1337850kv1.LIZIZ(abstractC21333318eB.getView().getRotation(), C21335318eV.LIZ(map2, "rotate", abstractC21333318eB)));
            return true;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            valueAnimator.setFloatValues(abstractC21333318eB.getView().getRotation(), C1337850kv1.LIZIZ(0.0f, obj));
            return true;
        }
    }), new Pair("scale", new InterfaceC21334018eI() { // from class: X.18ef
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            List list;
            Object obj = abstractC21333318eB.LLLIILIL;
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            abstractC21333318eB.LJLIIIL(C1337960kvC.LJ(list), C1337960kvC.LJFF(list, 1.0f));
        }

        public static float LJI(AbstractC21333318eB abstractC21333318eB, List list) {
            Object objLJJJLZIJ;
            float scaleX = abstractC21333318eB.getView().getScaleX();
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            return C1337850kv1.LIZIZ(scaleX, objLJJJLZIJ);
        }

        public static float LJII(AbstractC21333318eB abstractC21333318eB, List list) {
            return C1337960kvC.LJFF(list, abstractC21333318eB.getView().getScaleY());
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            List list = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "scale", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            }
            abstractC21333318eB.LJLIIIL(LJI(abstractC21333318eB, list), LJII(abstractC21333318eB, list));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            List list;
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            abstractC21333318eB.LJLIIIL(LJI(abstractC21333318eB, list), LJII(abstractC21333318eB, list));
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            List list = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "scale", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            }
            abstractC21333318eB.LJLIIIL(LJI(abstractC21333318eB, list), LJII(abstractC21333318eB, list));
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            List list;
            Map<String, Object> map2;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            List list2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "scale", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            } else {
                list = null;
            }
            float fLJI = LJI(abstractC21333318eB, list);
            float fLJII = LJII(abstractC21333318eB, list);
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            } else {
                map2 = null;
            }
            Object objLIZ2 = C21335318eV.LIZ(map2, "scale", abstractC21333318eB);
            if (objLIZ2 instanceof List) {
                list2 = (List) objLIZ2;
            }
            float fLJI2 = LJI(abstractC21333318eB, list2);
            float fLJII2 = LJII(abstractC21333318eB, list2);
            List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(fLJI), Float.valueOf(fLJII));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(fLJI2), Float.valueOf(fLJII2));
            valueAnimator.setObjectValues(listLJIIJJI, listLJIIJJI2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18ei
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    List list3;
                    List list4 = null;
                    if (obj instanceof List) {
                        list3 = (List) obj;
                    } else {
                        list3 = null;
                    }
                    if (obj2 instanceof List) {
                        list4 = (List) obj2;
                    }
                    float fLJ = C1337960kvC.LJ(list3);
                    float fLJFF = C1337960kvC.LJFF(list3, 1.0f);
                    float fLJ2 = C1337960kvC.LJ(list4);
                    float fLJFF2 = C1337960kvC.LJFF(list4, 1.0f);
                    if (fLJ != fLJ2) {
                        fLJ += (fLJ2 - fLJ) * f;
                    }
                    if (fLJFF != fLJFF2) {
                        fLJFF += (fLJFF2 - fLJFF) * f;
                    }
                    return C1697810uHb.LJIIJJI(Float.valueOf(fLJ), Float.valueOf(fLJFF));
                }
            });
            if (!Intrinsics.LJFF(listLJIIJJI, listLJIIJJI2)) {
                return true;
            }
            C1168400gVi.LIZ(AFwS278S0000000_32.get$arr$(159));
            return false;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            List list;
            float scaleX = abstractC21333318eB.getView().getScaleX();
            float scaleY = abstractC21333318eB.getView().getScaleY();
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            float fLJI = LJI(abstractC21333318eB, list);
            float fLJII = LJII(abstractC21333318eB, list);
            List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(scaleX), Float.valueOf(scaleY));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(fLJI), Float.valueOf(fLJII));
            valueAnimator.setObjectValues(listLJIIJJI, listLJIIJJI2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18ek
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj2, Object obj3) {
                    List list2;
                    List list3 = null;
                    if (obj2 instanceof List) {
                        list2 = (List) obj2;
                    } else {
                        list2 = null;
                    }
                    if (obj3 instanceof List) {
                        list3 = (List) obj3;
                    }
                    float fLJ = C1337960kvC.LJ(list2);
                    float fLJFF = C1337960kvC.LJFF(list2, 1.0f);
                    float fLJ2 = C1337960kvC.LJ(list3);
                    float fLJFF2 = C1337960kvC.LJFF(list3, 1.0f);
                    if (fLJ != fLJ2) {
                        fLJ += (fLJ2 - fLJ) * f;
                    }
                    if (fLJFF != fLJFF2) {
                        fLJFF += (fLJFF2 - fLJFF) * f;
                    }
                    return C1697810uHb.LJIIJJI(Float.valueOf(fLJ), Float.valueOf(fLJFF));
                }
            });
            if (!Intrinsics.LJFF(listLJIIJJI, listLJIIJJI2)) {
                return true;
            }
            C1168400gVi.LIZ(AFwS278S0000000_32.get$arr$(160));
            return false;
        }
    }), new Pair(":scale", new InterfaceC21334018eI() { // from class: X.18ef
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            List list;
            Object obj = abstractC21333318eB.LLLIILIL;
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            abstractC21333318eB.LJLIIIL(C1337960kvC.LJ(list), C1337960kvC.LJFF(list, 1.0f));
        }

        public static float LJI(AbstractC21333318eB abstractC21333318eB, List list) {
            Object objLJJJLZIJ;
            float scaleX = abstractC21333318eB.getView().getScaleX();
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            return C1337850kv1.LIZIZ(scaleX, objLJJJLZIJ);
        }

        public static float LJII(AbstractC21333318eB abstractC21333318eB, List list) {
            return C1337960kvC.LJFF(list, abstractC21333318eB.getView().getScaleY());
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            List list = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "scale", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            }
            abstractC21333318eB.LJLIIIL(LJI(abstractC21333318eB, list), LJII(abstractC21333318eB, list));
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            List list;
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            abstractC21333318eB.LJLIIIL(LJI(abstractC21333318eB, list), LJII(abstractC21333318eB, list));
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            List list = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "scale", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            }
            abstractC21333318eB.LJLIIIL(LJI(abstractC21333318eB, list), LJII(abstractC21333318eB, list));
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            List list;
            Map<String, Object> map2;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            List list2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "scale", abstractC21333318eB);
            if (objLIZ instanceof List) {
                list = (List) objLIZ;
            } else {
                list = null;
            }
            float fLJI = LJI(abstractC21333318eB, list);
            float fLJII = LJII(abstractC21333318eB, list);
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            } else {
                map2 = null;
            }
            Object objLIZ2 = C21335318eV.LIZ(map2, "scale", abstractC21333318eB);
            if (objLIZ2 instanceof List) {
                list2 = (List) objLIZ2;
            }
            float fLJI2 = LJI(abstractC21333318eB, list2);
            float fLJII2 = LJII(abstractC21333318eB, list2);
            List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(fLJI), Float.valueOf(fLJII));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(fLJI2), Float.valueOf(fLJII2));
            valueAnimator.setObjectValues(listLJIIJJI, listLJIIJJI2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18ei
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    List list3;
                    List list4 = null;
                    if (obj instanceof List) {
                        list3 = (List) obj;
                    } else {
                        list3 = null;
                    }
                    if (obj2 instanceof List) {
                        list4 = (List) obj2;
                    }
                    float fLJ = C1337960kvC.LJ(list3);
                    float fLJFF = C1337960kvC.LJFF(list3, 1.0f);
                    float fLJ2 = C1337960kvC.LJ(list4);
                    float fLJFF2 = C1337960kvC.LJFF(list4, 1.0f);
                    if (fLJ != fLJ2) {
                        fLJ += (fLJ2 - fLJ) * f;
                    }
                    if (fLJFF != fLJFF2) {
                        fLJFF += (fLJFF2 - fLJFF) * f;
                    }
                    return C1697810uHb.LJIIJJI(Float.valueOf(fLJ), Float.valueOf(fLJFF));
                }
            });
            if (!Intrinsics.LJFF(listLJIIJJI, listLJIIJJI2)) {
                return true;
            }
            C1168400gVi.LIZ(AFwS278S0000000_32.get$arr$(159));
            return false;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            List list;
            float scaleX = abstractC21333318eB.getView().getScaleX();
            float scaleY = abstractC21333318eB.getView().getScaleY();
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            float fLJI = LJI(abstractC21333318eB, list);
            float fLJII = LJII(abstractC21333318eB, list);
            List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(scaleX), Float.valueOf(scaleY));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(fLJI), Float.valueOf(fLJII));
            valueAnimator.setObjectValues(listLJIIJJI, listLJIIJJI2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18ek
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj2, Object obj3) {
                    List list2;
                    List list3 = null;
                    if (obj2 instanceof List) {
                        list2 = (List) obj2;
                    } else {
                        list2 = null;
                    }
                    if (obj3 instanceof List) {
                        list3 = (List) obj3;
                    }
                    float fLJ = C1337960kvC.LJ(list2);
                    float fLJFF = C1337960kvC.LJFF(list2, 1.0f);
                    float fLJ2 = C1337960kvC.LJ(list3);
                    float fLJFF2 = C1337960kvC.LJFF(list3, 1.0f);
                    if (fLJ != fLJ2) {
                        fLJ += (fLJ2 - fLJ) * f;
                    }
                    if (fLJFF != fLJFF2) {
                        fLJFF += (fLJFF2 - fLJFF) * f;
                    }
                    return C1697810uHb.LJIIJJI(Float.valueOf(fLJ), Float.valueOf(fLJFF));
                }
            });
            if (!Intrinsics.LJFF(listLJIIJJI, listLJIIJJI2)) {
                return true;
            }
            C1168400gVi.LIZ(AFwS278S0000000_32.get$arr$(160));
            return false;
        }
    }), new Pair("width", new InterfaceC21334018eI() { // from class: X.18ec
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            C1337990kvF.LJIILL(abstractC21333318eB, abstractC21333318eB.LLJILJIL);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "width", abstractC21333318eB);
            if (objLIZ == null) {
                objLIZ = abstractC21333318eB.LLJILJIL;
            }
            C1337990kvF.LJIILL(abstractC21333318eB, objLIZ);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            if (obj instanceof Number) {
                C1337990kvF.LJIILL(abstractC21333318eB, new C1337880kv4(C1337850kv1.LIZIZ(0.0f, obj), 1));
            } else {
                C1325860kbg.LIZLLL(false, null, AFwS223S0000000_32.get$arr$(232), C2097608Jq.LJ());
            }
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "width", abstractC21333318eB);
            if (objLIZ == null) {
                objLIZ = abstractC21333318eB.LLJILJIL;
            }
            C1337990kvF.LJIILL(abstractC21333318eB, objLIZ);
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            int iLJJIJ = abstractC21333318eB.LJJIJ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C21335318eV.LIZ(map, "width", abstractC21333318eB)));
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            int iLJJIJ2 = abstractC21333318eB.LJJIJ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C21335318eV.LIZ(map2, "width", abstractC21333318eB)));
            if (iLJJIJ == iLJJIJ2) {
                C1168400gVi.LIZ(new AwS611S0100000_32(abstractC21333318eB, (AbstractC21333318eB<?>) 344));
                return false;
            }
            valueAnimator.setObjectValues(Integer.valueOf(iLJJIJ), Integer.valueOf(iLJJIJ2));
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18em
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    Integer num;
                    int iRound;
                    Integer num2;
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    int iIntValue = 0;
                    if (num != null) {
                        iRound = num.intValue();
                    } else {
                        iRound = 0;
                    }
                    if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null) {
                        iIntValue = num2.intValue();
                    }
                    if (iRound != iIntValue) {
                        iRound = Math.round(iRound + ((iIntValue - iRound) * f));
                    }
                    return Integer.valueOf(iRound);
                }
            });
            return true;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            int width = abstractC21333318eB.getView().getWidth();
            int iLJJIJ = abstractC21333318eB.LJJIJ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, obj));
            if (width == iLJJIJ) {
                C1168400gVi.LIZ(new AwS611S0100000_32(abstractC21333318eB, (AbstractC21333318eB<?>) 345));
                return false;
            }
            valueAnimator.setIntValues(width, iLJJIJ);
            return true;
        }
    }), new Pair(":width", new InterfaceC21334018eI() { // from class: X.18ec
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            C1337990kvF.LJIILL(abstractC21333318eB, abstractC21333318eB.LLJILJIL);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "width", abstractC21333318eB);
            if (objLIZ == null) {
                objLIZ = abstractC21333318eB.LLJILJIL;
            }
            C1337990kvF.LJIILL(abstractC21333318eB, objLIZ);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            if (obj instanceof Number) {
                C1337990kvF.LJIILL(abstractC21333318eB, new C1337880kv4(C1337850kv1.LIZIZ(0.0f, obj), 1));
            } else {
                C1325860kbg.LIZLLL(false, null, AFwS223S0000000_32.get$arr$(232), C2097608Jq.LJ());
            }
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "width", abstractC21333318eB);
            if (objLIZ == null) {
                objLIZ = abstractC21333318eB.LLJILJIL;
            }
            C1337990kvF.LJIILL(abstractC21333318eB, objLIZ);
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            int iLJJIJ = abstractC21333318eB.LJJIJ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C21335318eV.LIZ(map, "width", abstractC21333318eB)));
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            int iLJJIJ2 = abstractC21333318eB.LJJIJ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C21335318eV.LIZ(map2, "width", abstractC21333318eB)));
            if (iLJJIJ == iLJJIJ2) {
                C1168400gVi.LIZ(new AwS611S0100000_32(abstractC21333318eB, (AbstractC21333318eB<?>) 344));
                return false;
            }
            valueAnimator.setObjectValues(Integer.valueOf(iLJJIJ), Integer.valueOf(iLJJIJ2));
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18em
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    Integer num;
                    int iRound;
                    Integer num2;
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    int iIntValue = 0;
                    if (num != null) {
                        iRound = num.intValue();
                    } else {
                        iRound = 0;
                    }
                    if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null) {
                        iIntValue = num2.intValue();
                    }
                    if (iRound != iIntValue) {
                        iRound = Math.round(iRound + ((iIntValue - iRound) * f));
                    }
                    return Integer.valueOf(iRound);
                }
            });
            return true;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            int width = abstractC21333318eB.getView().getWidth();
            int iLJJIJ = abstractC21333318eB.LJJIJ(C1337960kvC.LIZLLL(abstractC21333318eB.LL, obj));
            if (width == iLJJIJ) {
                C1168400gVi.LIZ(new AwS611S0100000_32(abstractC21333318eB, (AbstractC21333318eB<?>) 345));
                return false;
            }
            valueAnimator.setIntValues(width, iLJJIJ);
            return true;
        }
    }), new Pair("height", new InterfaceC21334018eI() { // from class: X.18ed
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            C1337990kvF.LJIIIZ(abstractC21333318eB, abstractC21333318eB.LLJILJILJ);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "height", abstractC21333318eB);
            if (objLIZ == null) {
                objLIZ = abstractC21333318eB.LLJILJILJ;
            }
            C1337990kvF.LJIIIZ(abstractC21333318eB, objLIZ);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            if (obj instanceof Number) {
                C1337990kvF.LJIIIZ(abstractC21333318eB, new C1337880kv4(C1337850kv1.LIZIZ(0.0f, obj), 1));
            } else {
                C1325860kbg.LIZLLL(false, null, AFwS223S0000000_32.get$arr$(231), C2097608Jq.LJ());
            }
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "height", abstractC21333318eB);
            if (objLIZ == null) {
                objLIZ = abstractC21333318eB.LLJILJILJ;
            }
            C1337990kvF.LJIIIZ(abstractC21333318eB, objLIZ);
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            int iLJJIIJZLJL = abstractC21333318eB.LJJIIJZLJL(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C21335318eV.LIZ(map, "height", abstractC21333318eB)));
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            int iLJJIIJZLJL2 = abstractC21333318eB.LJJIIJZLJL(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C21335318eV.LIZ(map2, "height", abstractC21333318eB)));
            if (iLJJIIJZLJL == iLJJIIJZLJL2) {
                C1168400gVi.LIZ(new AwS611S0100000_32(abstractC21333318eB, (AbstractC21333318eB<?>) 342));
                return false;
            }
            valueAnimator.setIntValues(iLJJIIJZLJL, iLJJIIJZLJL2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18el
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    Integer num;
                    int iRound;
                    Integer num2;
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    int iIntValue = 0;
                    if (num != null) {
                        iRound = num.intValue();
                    } else {
                        iRound = 0;
                    }
                    if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null) {
                        iIntValue = num2.intValue();
                    }
                    if (iRound != iIntValue) {
                        iRound = Math.round(iRound + ((iIntValue - iRound) * f));
                    }
                    return Integer.valueOf(iRound);
                }
            });
            return true;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            int height = abstractC21333318eB.getView().getHeight();
            int iLJJIIJZLJL = abstractC21333318eB.LJJIIJZLJL(C1337960kvC.LIZLLL(abstractC21333318eB.LL, obj));
            if (height == iLJJIIJZLJL) {
                C1168400gVi.LIZ(new AwS611S0100000_32(abstractC21333318eB, (AbstractC21333318eB<?>) 343));
                return false;
            }
            valueAnimator.setIntValues(height, iLJJIIJZLJL);
            return true;
        }
    }), new Pair(":height", new InterfaceC21334018eI() { // from class: X.18ed
        @Override // X.InterfaceC21334018eI
        public final void LIZLLL(AbstractC21333318eB<?> abstractC21333318eB) {
            C1337990kvF.LJIIIZ(abstractC21333318eB, abstractC21333318eB.LLJILJILJ);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZIZ(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "height", abstractC21333318eB);
            if (objLIZ == null) {
                objLIZ = abstractC21333318eB.LLJILJILJ;
            }
            C1337990kvF.LJIIIZ(abstractC21333318eB, objLIZ);
        }

        @Override // X.InterfaceC21334018eI
        public final void LIZJ(AbstractC21333318eB<?> abstractC21333318eB, Object obj) {
            if (obj instanceof Number) {
                C1337990kvF.LJIIIZ(abstractC21333318eB, new C1337880kv4(C1337850kv1.LIZIZ(0.0f, obj), 1));
            } else {
                C1325860kbg.LIZLLL(false, null, AFwS223S0000000_32.get$arr$(231), C2097608Jq.LJ());
            }
        }

        @Override // X.InterfaceC21334018eI
        public final void LJFF(AbstractC21333318eB<?> abstractC21333318eB, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            Object objLIZ = C21335318eV.LIZ(map, "height", abstractC21333318eB);
            if (objLIZ == null) {
                objLIZ = abstractC21333318eB.LLJILJILJ;
            }
            C1337990kvF.LJIIIZ(abstractC21333318eB, objLIZ);
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LIZ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, C21335118eT c21335118eT) {
            Map<String, Object> map;
            C21335318eV c21335318eV = InterfaceC21334018eI.LIZ;
            MynaAnimationKeyframe mynaAnimationKeyframe = c21335118eT.LIZ;
            Map<String, Object> map2 = null;
            if (mynaAnimationKeyframe != null) {
                map = mynaAnimationKeyframe.style;
            } else {
                map = null;
            }
            c21335318eV.getClass();
            int iLJJIIJZLJL = abstractC21333318eB.LJJIIJZLJL(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C21335318eV.LIZ(map, "height", abstractC21333318eB)));
            MynaAnimationKeyframe mynaAnimationKeyframe2 = c21335118eT.LIZIZ;
            if (mynaAnimationKeyframe2 != null) {
                map2 = mynaAnimationKeyframe2.style;
            }
            int iLJJIIJZLJL2 = abstractC21333318eB.LJJIIJZLJL(C1337960kvC.LIZLLL(abstractC21333318eB.LL, C21335318eV.LIZ(map2, "height", abstractC21333318eB)));
            if (iLJJIIJZLJL == iLJJIIJZLJL2) {
                C1168400gVi.LIZ(new AwS611S0100000_32(abstractC21333318eB, (AbstractC21333318eB<?>) 342));
                return false;
            }
            valueAnimator.setIntValues(iLJJIIJZLJL, iLJJIIJZLJL2);
            valueAnimator.setEvaluator(new TypeEvaluator() { // from class: X.18el
                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    Integer num;
                    int iRound;
                    Integer num2;
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    int iIntValue = 0;
                    if (num != null) {
                        iRound = num.intValue();
                    } else {
                        iRound = 0;
                    }
                    if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null) {
                        iIntValue = num2.intValue();
                    }
                    if (iRound != iIntValue) {
                        iRound = Math.round(iRound + ((iIntValue - iRound) * f));
                    }
                    return Integer.valueOf(iRound);
                }
            });
            return true;
        }

        @Override // X.InterfaceC21334018eI
        public final boolean LJ(AbstractC21333318eB<?> abstractC21333318eB, ValueAnimator valueAnimator, Object obj) {
            int height = abstractC21333318eB.getView().getHeight();
            int iLJJIIJZLJL = abstractC21333318eB.LJJIIJZLJL(C1337960kvC.LIZLLL(abstractC21333318eB.LL, obj));
            if (height == iLJJIIJZLJL) {
                C1168400gVi.LIZ(new AwS611S0100000_32(abstractC21333318eB, (AbstractC21333318eB<?>) 343));
                return false;
            }
            valueAnimator.setIntValues(height, iLJJIIJZLJL);
            return true;
        }
    }));

    public static Object LIZ(Map map, String str, AbstractC21333318eB abstractC21333318eB) {
        if (map == null) {
            return null;
        }
        Object obj = map.get(str);
        if (obj != null) {
            return obj;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(':');
        sbLIZ.append(str);
        Object obj2 = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (obj2 == null) {
            return null;
        }
        C21325918cz c21325918cz = abstractC21333318eB.LL;
        return c21325918cz.LIZ.LIZJ.LIZ(obj2.toString(), abstractC21333318eB.LIZJ(), c21325918cz, c21325918cz.LJJIII);
    }
}
