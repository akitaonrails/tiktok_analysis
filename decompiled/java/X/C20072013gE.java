package X;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: X.13gE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20072013gE {
    public static final C20072013gE LIZ = new C20072013gE();

    public static final void LIZ(View view) {
        view.clearViewTranslationCallback();
    }

    public static final void LIZIZ(View view) {
        view.setViewTranslationCallback(new ViewTranslationCallback() { // from class: X.13gF
            /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
            @Override // android.view.translation.ViewTranslationCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onClearTranslation(android.view.View r17) {
                /*
                    r16 = this;
                    r0 = r17
                    androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
                    androidx.compose.ui.contentcapture.AndroidContentCaptureManager r1 = r0.getContentCaptureManager$ui_release()
                    r1.getClass()
                    X.0mjW r0 = X.EnumC1407600mjW.LL
                    r1.LLILZLL = r0
                    X.13Yo r0 = r1.LIZJ()
                    java.lang.Object[] r10 = r0.LIZJ
                    long[] r9 = r0.LIZ
                    int r0 = r9.length
                    int r8 = r0 + (-2)
                    r15 = 1
                    if (r8 < 0) goto L74
                    r7 = 0
                L1e:
                    r1 = r9[r7]
                    long r3 = ~r1
                    r0 = 7
                    long r3 = r3 << r0
                    long r3 = r3 & r1
                    r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r3 = r3 & r5
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 == 0) goto L6f
                    int r0 = r7 - r8
                    int r0 = ~r0
                    int r0 = r0 >>> 31
                    r6 = 8
                    int r5 = 8 - r0
                    r4 = 0
                L38:
                    if (r4 >= r5) goto L6d
                    r13 = 255(0xff, double:1.26E-321)
                    long r13 = r13 & r1
                    r11 = 128(0x80, double:6.3E-322)
                    int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                    if (r0 >= 0) goto L69
                    int r0 = r7 << 3
                    int r0 = r0 + r4
                    r0 = r10[r0]
                    X.13g8 r0 = (X.C20071413g8) r0
                    X.13fc r0 = r0.LIZ
                    X.13WG r3 = r0.LIZLLL
                    X.0heY<java.lang.Boolean> r0 = X.C1696500uFU.LJJIIJ
                    java.lang.Object r0 = X.C20069413fo.LIZ(r3, r0)
                    if (r0 == 0) goto L69
                    X.0heY<X.0uGT<kotlin.jvm.functions.Function0<java.lang.Boolean>>> r0 = X.C1694480uCE.LJIIL
                    java.lang.Object r0 = X.C20069413fo.LIZ(r3, r0)
                    X.0uGT r0 = (X.C1697110uGT) r0
                    if (r0 == 0) goto L69
                    T extends X.05m9<? extends java.lang.Boolean> r0 = r0.LIZIZ
                    kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                    if (r0 == 0) goto L69
                    r0.invoke()
                L69:
                    long r1 = r1 >> r6
                    int r4 = r4 + 1
                    goto L38
                L6d:
                    if (r5 != r6) goto L74
                L6f:
                    if (r7 == r8) goto L74
                    int r7 = r7 + 1
                    goto L1e
                L74:
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewTranslationCallbackC20072113gF.onClearTranslation(android.view.View):boolean");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
            @Override // android.view.translation.ViewTranslationCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onHideTranslation(android.view.View r17) {
                /*
                    r16 = this;
                    r0 = r17
                    androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
                    androidx.compose.ui.contentcapture.AndroidContentCaptureManager r1 = r0.getContentCaptureManager$ui_release()
                    r1.getClass()
                    X.0mjW r0 = X.EnumC1407600mjW.LL
                    r1.LLILZLL = r0
                    X.13Yo r0 = r1.LIZJ()
                    java.lang.Object[] r10 = r0.LIZJ
                    long[] r9 = r0.LIZ
                    int r0 = r9.length
                    int r8 = r0 + (-2)
                    r15 = 1
                    if (r8 < 0) goto L7c
                    r7 = 0
                L1e:
                    r2 = r9[r7]
                    long r0 = ~r2
                    r4 = 7
                    long r0 = r0 << r4
                    long r0 = r0 & r2
                    r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r0 = r0 & r5
                    int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                    if (r4 == 0) goto L77
                    int r0 = r7 - r8
                    int r0 = ~r0
                    int r0 = r0 >>> 31
                    r6 = 8
                    int r5 = 8 - r0
                    r4 = 0
                L38:
                    if (r4 >= r5) goto L75
                    r13 = 255(0xff, double:1.26E-321)
                    long r13 = r13 & r2
                    r11 = 128(0x80, double:6.3E-322)
                    int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                    if (r0 >= 0) goto L71
                    int r0 = r7 << 3
                    int r0 = r0 + r4
                    r0 = r10[r0]
                    X.13g8 r0 = (X.C20071413g8) r0
                    X.13fc r0 = r0.LIZ
                    X.13WG r11 = r0.LIZLLL
                    X.0heY<java.lang.Boolean> r0 = X.C1696500uFU.LJJIIJ
                    java.lang.Object r1 = X.C20069413fo.LIZ(r11, r0)
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L71
                    X.0heY<X.0uGT<kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>>> r0 = X.C1694480uCE.LJIIJJI
                    java.lang.Object r0 = X.C20069413fo.LIZ(r11, r0)
                    X.0uGT r0 = (X.C1697110uGT) r0
                    if (r0 == 0) goto L71
                    T extends X.05m9<? extends java.lang.Boolean> r1 = r0.LIZIZ
                    kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                    if (r1 == 0) goto L71
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r1.invoke(r0)
                L71:
                    long r2 = r2 >> r6
                    int r4 = r4 + 1
                    goto L38
                L75:
                    if (r5 != r6) goto L7c
                L77:
                    if (r7 == r8) goto L7c
                    int r7 = r7 + 1
                    goto L1e
                L7c:
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewTranslationCallbackC20072113gF.onHideTranslation(android.view.View):boolean");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
            @Override // android.view.translation.ViewTranslationCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onShowTranslation(android.view.View r17) {
                /*
                    r16 = this;
                    r0 = r17
                    androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
                    androidx.compose.ui.contentcapture.AndroidContentCaptureManager r1 = r0.getContentCaptureManager$ui_release()
                    r1.getClass()
                    X.0mjW r0 = X.EnumC1407600mjW.LLILLJJLI
                    r1.LLILZLL = r0
                    X.13Yo r0 = r1.LIZJ()
                    java.lang.Object[] r10 = r0.LIZJ
                    long[] r9 = r0.LIZ
                    int r0 = r9.length
                    int r8 = r0 + (-2)
                    r15 = 1
                    if (r8 < 0) goto L7c
                    r7 = 0
                L1e:
                    r2 = r9[r7]
                    long r0 = ~r2
                    r4 = 7
                    long r0 = r0 << r4
                    long r0 = r0 & r2
                    r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r0 = r0 & r5
                    int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                    if (r4 == 0) goto L77
                    int r0 = r7 - r8
                    int r0 = ~r0
                    int r0 = r0 >>> 31
                    r6 = 8
                    int r5 = 8 - r0
                    r4 = 0
                L38:
                    if (r4 >= r5) goto L75
                    r13 = 255(0xff, double:1.26E-321)
                    long r13 = r13 & r2
                    r11 = 128(0x80, double:6.3E-322)
                    int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                    if (r0 >= 0) goto L71
                    int r0 = r7 << 3
                    int r0 = r0 + r4
                    r0 = r10[r0]
                    X.13g8 r0 = (X.C20071413g8) r0
                    X.13fc r0 = r0.LIZ
                    X.13WG r11 = r0.LIZLLL
                    X.0heY<java.lang.Boolean> r0 = X.C1696500uFU.LJJIIJ
                    java.lang.Object r1 = X.C20069413fo.LIZ(r11, r0)
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L71
                    X.0heY<X.0uGT<kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>>> r0 = X.C1694480uCE.LJIIJJI
                    java.lang.Object r0 = X.C20069413fo.LIZ(r11, r0)
                    X.0uGT r0 = (X.C1697110uGT) r0
                    if (r0 == 0) goto L71
                    T extends X.05m9<? extends java.lang.Boolean> r1 = r0.LIZIZ
                    kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                    if (r1 == 0) goto L71
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    r1.invoke(r0)
                L71:
                    long r2 = r2 >> r6
                    int r4 = r4 + 1
                    goto L38
                L75:
                    if (r5 != r6) goto L7c
                L77:
                    if (r7 == r8) goto L7c
                    int r7 = r7 + 1
                    goto L1e
                L7c:
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewTranslationCallbackC20072113gF.onShowTranslation(android.view.View):boolean");
            }
        });
    }
}
