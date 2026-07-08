package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0H1J, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1J {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.service.vo.Image r9, X.C0H1C r10, X.InterfaceC1364105Vn<? super java.lang.Integer> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C0H1I
            if (r0 == 0) goto L72
            r5 = r11
            X.0H1I r5 = (X.C0H1I) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r7 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L37
            if (r0 != r4) goto L79
            java.lang.Object r2 = r5.LL
            X.C155000ia.LIZIZ(r7)
        L25:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L78
            int r0 = r7.intValue()
            X.0NmG<java.lang.String, java.lang.Integer> r1 = X.C0H1L.LIZIZ
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r1.LIZLLL(r2, r0)
            return r7
        L37:
            X.C155000ia.LIZIZ(r7)
            java.lang.String r0 = r9.getUri()
            if (r0 != 0) goto L41
            return r3
        L41:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            java.lang.String r0 = r10.getIdSuffix()
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            X.0NmG<java.lang.String, java.lang.Integer> r0 = X.C0H1L.LIZIZ
            java.lang.Object r0 = r0.LIZJ(r2)
            if (r0 != 0) goto L81
            r5.LL = r2
            r5.LLILZ = r4
            X.1DFH r1 = X.C0PEM.LIZ
            X.0H1A r0 = new X.0H1A
            r0.<init>(r9, r10, r3)
            java.lang.Object r7 = X.C23250099c.LJI(r5, r1, r0)
            if (r7 != r6) goto L25
            return r6
        L72:
            X.0H1I r5 = new X.0H1I
            r5.<init>(r8, r11)
            goto L12
        L78:
            return r3
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H1J.LIZIZ(com.ss.android.ugc.aweme.ecommerce.service.vo.Image, X.0H1C, X.05Vn):java.lang.Object");
    }

    public static InterfaceC469401sC LIZJ(Image image, final float f, final float f2, final float f3, final float f4, final InterfaceC1364105Vn interfaceC1364105Vn) {
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        C03IT imageUrlModel = image.toImageUrlModel();
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
        c1331670kl3LIZLLL.LIZLLL("ImageDarknessHelper");
        c1331670kl3LIZLLL.LJIL = Bitmap.Config.RGB_565;
        return c1331670kl3LIZLLL.LJJIIJZLJL(new InterfaceC1331910klR() { // from class: X.09hR
            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f5) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
                InterfaceC1364105Vn<Pair<Boolean, Boolean>> interfaceC1364105Vn2 = interfaceC1364105Vn;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn2.resumeWith(null);
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                int i;
                int i2;
                Boolean boolValueOf;
                boolean z;
                if (bitmap == null) {
                    InterfaceC1364105Vn<Pair<Boolean, Boolean>> interfaceC1364105Vn2 = interfaceC1364105Vn;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn2.resumeWith(null);
                    return;
                }
                try {
                    int height = bitmap.getHeight();
                    int width = bitmap.getWidth();
                    float f5 = width;
                    float f6 = height;
                    Rect rect = new Rect((int) (f * f5), (int) (f2 * f6), (int) (f3 * f5), (int) (f4 * f6));
                    int i3 = (int) (f * f5);
                    int i4 = (int) (f2 * f6);
                    int i5 = ((int) (f5 * f3)) - i3;
                    int i6 = ((int) (f6 * f4)) - i4;
                    if (i3 >= 0 && i3 <= width && i4 >= 0 && i4 <= height && i5 > 0 && (i = i5 + i3) <= width && i6 > 0 && (i2 = i6 + i4) <= height) {
                        if (i <= bitmap.getWidth() && i2 <= bitmap.getHeight()) {
                            int i7 = 0;
                            while (i3 < i) {
                                for (int i8 = i4; i8 < i2; i8++) {
                                    if (Color.alpha(bitmap.getPixel(i3, i8)) != 0) {
                                        i7++;
                                        if ((((double) i7) * 1.0d) / ((double) (i5 * i6)) >= 1 - 0.6f) {
                                        }
                                    }
                                }
                                i3++;
                            }
                            InterfaceC1364105Vn<Pair<Boolean, Boolean>> interfaceC1364105Vn3 = interfaceC1364105Vn;
                            Pair pair = new Pair(Boolean.FALSE, Boolean.TRUE);
                            C189200o6.m2constructorimpl(pair);
                            interfaceC1364105Vn3.resumeWith(pair);
                            return;
                        }
                        Integer numLIZIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, rect)).LIZIZ();
                        if (numLIZIZ != null) {
                            int iIntValue = numLIZIZ.intValue();
                            if (((double) 1) - ((((((double) Color.red(iIntValue)) * 0.299d) + (((double) Color.green(iIntValue)) * 0.587d)) + (((double) Color.blue(iIntValue)) * 0.114d)) / ((double) 255)) >= 0.5d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        } else {
                            boolValueOf = null;
                        }
                        InterfaceC1364105Vn<Pair<Boolean, Boolean>> interfaceC1364105Vn4 = interfaceC1364105Vn;
                        Pair pair2 = new Pair(boolValueOf, boolValueOf);
                        C189200o6.m2constructorimpl(pair2);
                        interfaceC1364105Vn4.resumeWith(pair2);
                        return;
                    }
                    InterfaceC1364105Vn<Pair<Boolean, Boolean>> interfaceC1364105Vn5 = interfaceC1364105Vn;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn5.resumeWith(null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC1364105Vn<Pair<Boolean, Boolean>> interfaceC1364105Vn6 = interfaceC1364105Vn;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn6.resumeWith(null);
                    EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR85;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("processImage: ");
                    sbLIZ.append(e);
                    C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                InterfaceC1364105Vn<Pair<Boolean, Boolean>> interfaceC1364105Vn2 = interfaceC1364105Vn;
                C189200o6.m2constructorimpl(null);
                interfaceC1364105Vn2.resumeWith(null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(boolean r17, com.ss.android.ugc.aweme.ecommerce.service.vo.Image r18, float r19, float r20, float r21, float r22, boolean r23, X.InterfaceC1364105Vn<? super java.lang.Boolean> r24) {
        /*
            r16 = this;
            r3 = r24
            r5 = r17
            boolean r0 = r3 instanceof X.C0H1K
            if (r0 == 0) goto La4
            r7 = r3
            X.0H1K r7 = (X.C0H1K) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La4
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L16:
            java.lang.Object r0 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r7.LLILZLL
            r8 = 1
            r14 = 0
            if (r1 == 0) goto L51
            if (r1 != r8) goto Lad
            float r3 = r7.LLILLL
            boolean r5 = r7.LL
            java.lang.Object r4 = r7.LLILLJJLI
            X.C155000ia.LIZIZ(r0)
        L2d:
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L4f
            X.0NmG<kotlin.Pair<java.lang.String, java.lang.Float>, kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> r6 = X.C0H1L.LIZJ
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Float r1 = X.C2286608xc.LIZLLL(r3)
            r2.<init>(r4, r1)
            r6.LIZLLL(r2, r0)
        L3f:
            if (r5 == 0) goto L48
            if (r0 == 0) goto L47
            java.lang.Object r14 = r0.getSecond()
        L47:
            return r14
        L48:
            if (r0 == 0) goto L47
            java.lang.Object r14 = r0.getFirst()
            return r14
        L4f:
            r0 = r14
            goto L3f
        L51:
            X.C155000ia.LIZIZ(r0)
            r13 = r18
            java.lang.String r4 = r13.getUri()
            if (r4 != 0) goto L5d
            return r14
        L5d:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r9 = r19
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r2.<init>(r0)
            r1 = 2
            java.math.RoundingMode r0 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r0 = r2.setScale(r1, r0)
            float r3 = r0.floatValue()
            X.0NmG<kotlin.Pair<java.lang.String, java.lang.Float>, kotlin.Pair<java.lang.Boolean, java.lang.Boolean>> r2 = X.C0H1L.LIZJ
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r3)
            r1.<init>(r4, r0)
            java.lang.Object r0 = r2.LIZJ(r1)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L3f
            r7.LLILLJJLI = r4
            r7.LL = r5
            r7.LLILLL = r3
            r7.LLILZLL = r8
            X.1DFH r0 = X.C0PEM.LIZ
            X.09hS r8 = new X.09hS
            r15 = r23
            r12 = r22
            r11 = r21
            r10 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r0 = X.C23250099c.LJI(r7, r0, r8)
            if (r0 != r6) goto L2d
            return r6
        La4:
            X.0H1K r7 = new X.0H1K
            r0 = r16
            r7.<init>(r0, r3)
            goto L16
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H1J.LIZ(boolean, com.ss.android.ugc.aweme.ecommerce.service.vo.Image, float, float, float, float, boolean, X.05Vn):java.lang.Object");
    }
}
