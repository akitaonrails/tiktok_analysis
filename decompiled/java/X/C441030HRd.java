package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.StaticLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441030HRd extends AbstractC435540H6a {
    public final Context LJFF;
    public final InterfaceC497601wk LJI;
    public final C05YD<C0HOM<? extends List<C440440HOw>>> LJII;
    public final boolean LJIIIIZZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public Bitmap LJIIL;
    public Bitmap LJIILIIL;
    public Bitmap LJIILJJIL;
    public Bitmap LJIILL;
    public Bitmap LJIILLIIL;
    public Bitmap LJIIZILJ;
    public Float LJIJJ;
    public Float LJIJJLI;
    public Bitmap LJJIFFI;
    public C1295950jpR LJJIJIIJIL;
    public StaticLayout LJJIJL;
    public final Paint LJJIZ;
    public EnumC441100HRk LJIIIZ = EnumC441100HRk.LLILLJJLI;
    public final C01GW LJIJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(276));
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(275));
    public final Path LJIL = new Path();
    public final Path LJJ = new Path();
    public final Path LJJI = new Path();
    public final Rect LJJII = new Rect();
    public final Rect LJJIII = new Rect();
    public final Rect LJJIIJ = new Rect();
    public final Rect LJJIIJZLJL = new Rect();
    public final Rect LJJIIZ = new Rect();
    public final Rect LJJIIZI = new Rect();
    public final Rect LJJIJ = new Rect();
    public String LJJIJIIJI = "";
    public final C01GW LJJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 629));
    public final int LJJIJLIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public final int LJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));

    @Override // X.C0H6M
    public final boolean LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0H6M
    public final void LJII(Canvas canvas) {
        int iSave;
        int iSave2;
        Bitmap bitmap;
        if (!this.LJIIJ) {
            Bitmap bitmap2 = this.LJIILL;
            if (bitmap2 != null) {
                this.LJIIIZ = EnumC441100HRk.LL;
                this.LJIIL = bitmap2;
            } else {
                Bitmap bitmap3 = this.LJIILLIIL;
                if (bitmap3 != null && (bitmap = this.LJIIZILJ) != null) {
                    this.LJIIIZ = EnumC441100HRk.LLILZ;
                    this.LJIILIIL = bitmap3;
                    this.LJIILJJIL = bitmap;
                } else {
                    return;
                }
            }
        }
        if (C440480HPa.LIZ() == -1) {
            canvas.drawPath(this.LJJI, this.LJJIZ);
        }
        Bitmap bitmap4 = this.LJIILLIIL;
        if (bitmap4 != null) {
            iSave2 = canvas.save();
            try {
                float f = this.LIZ;
                float f2 = this.LIZIZ;
                float f3 = 2;
                float f4 = f / f3;
                float f5 = f2 / f3;
                canvas.clipPath(this.LJJI);
                canvas.scale(0.9f, 0.9f, f4, f5);
                canvas.rotate(-8.0f, f4, f5);
                Float f6 = this.LJIJJLI;
                if (f6 != null) {
                    float fFloatValue = f6.floatValue();
                    Rect rect = this.LJJIIZ;
                    rect.left = (int) (rect.right - (f * fFloatValue));
                    rect.top = (int) (rect.bottom - (f2 * fFloatValue));
                }
                canvas.drawBitmap(bitmap4, (Rect) null, this.LJJIIZ, (Paint) this.LJIJI.getValue());
                canvas.restoreToCount(iSave2);
            } finally {
            }
        }
        Bitmap bitmap5 = this.LJIIZILJ;
        if (bitmap5 != null) {
            iSave = canvas.save();
            try {
                float f7 = this.LIZ;
                float f8 = this.LIZIZ;
                float f9 = 2;
                float f10 = f7 / f9;
                float f11 = f8 / f9;
                canvas.clipPath(this.LJJI);
                canvas.scale(0.9f, 0.9f, f10, f11);
                canvas.rotate(-8.0f, f10, f11);
                Float f12 = this.LJIJJLI;
                if (f12 != null) {
                    float fFloatValue2 = f12.floatValue();
                    Rect rect2 = this.LJJIIZI;
                    rect2.left = (int) (rect2.right - (f7 * fFloatValue2));
                    rect2.top = (int) (rect2.bottom - (f8 * fFloatValue2));
                }
                canvas.drawBitmap(bitmap5, (Rect) null, this.LJJIIZI, (Paint) this.LJIJI.getValue());
                canvas.restoreToCount(iSave);
            } finally {
            }
        }
        Bitmap bitmap6 = this.LJIILL;
        if (bitmap6 != null) {
            iSave2 = canvas.save();
            try {
                float f13 = this.LIZ;
                float f14 = this.LIZIZ;
                float f15 = 2;
                float f16 = f13 / f15;
                float f18 = f14 / f15;
                canvas.clipPath(this.LJIL);
                canvas.scale(1.2f, 1.2f, f16, f18);
                canvas.rotate(-9.0f, f16, f18);
                Float f19 = this.LJIJJLI;
                if (f19 != null) {
                    float fFloatValue3 = f19.floatValue();
                    Rect rect3 = this.LJJIIJZLJL;
                    rect3.left = (int) (f13 - (f13 * fFloatValue3));
                    rect3.top = (int) (f14 - (fFloatValue3 * f14));
                }
                canvas.drawBitmap(bitmap6, (Rect) null, this.LJJIIJZLJL, (Paint) this.LJIJI.getValue());
                canvas.restoreToCount(iSave2);
            } finally {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave2);
            }
        }
        int iOrdinal = this.LJIIIZ.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        Bitmap bitmap7 = this.LJIILIIL;
                        if (bitmap7 != null) {
                            int iSave3 = canvas.save();
                            try {
                                float f20 = this.LIZ;
                                float f21 = this.LIZIZ;
                                float f22 = 2;
                                float f23 = f20 / f22;
                                float f24 = f21 / f22;
                                canvas.clipPath(this.LJJI);
                                canvas.scale(0.9f, 0.9f, f23, f24);
                                canvas.rotate(-8.0f, f23, f24);
                                Float f25 = this.LJIJJ;
                                if (f25 != null) {
                                    float fFloatValue4 = f25.floatValue();
                                    Rect rect4 = this.LJJIII;
                                    rect4.left = (int) (rect4.right - (f20 * fFloatValue4));
                                    rect4.top = (int) (rect4.bottom - (f21 * fFloatValue4));
                                }
                                canvas.drawBitmap(bitmap7, (Rect) null, this.LJJIII, (Paint) this.LJIJ.getValue());
                                canvas.restoreToCount(iSave3);
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                                canvas.restoreToCount(iSave3);
                            }
                        }
                        Bitmap bitmap8 = this.LJIILJJIL;
                        if (bitmap8 != null) {
                            int iSave4 = canvas.save();
                            try {
                                float f26 = this.LIZ;
                                float f27 = this.LIZIZ;
                                float f28 = 2;
                                float f29 = f26 / f28;
                                float f30 = f27 / f28;
                                canvas.clipPath(this.LJJI);
                                canvas.scale(0.9f, 0.9f, f29, f30);
                                canvas.rotate(-8.0f, f29, f30);
                                Float f31 = this.LJIJJ;
                                if (f31 != null) {
                                    float fFloatValue5 = f31.floatValue();
                                    Rect rect5 = this.LJJIIJ;
                                    rect5.left = (int) (rect5.right - (f26 * fFloatValue5));
                                    rect5.top = (int) (rect5.bottom - (f27 * fFloatValue5));
                                }
                                canvas.drawBitmap(bitmap8, (Rect) null, this.LJJIIJ, (Paint) this.LJIJ.getValue());
                                canvas.restoreToCount(iSave4);
                                return;
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                                canvas.restoreToCount(iSave4);
                            }
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                C1295950jpR c1295950jpR = this.LJJIJIIJIL;
                if (c1295950jpR != null) {
                    c1295950jpR.draw(canvas);
                }
                int iSave5 = canvas.save();
                try {
                    float f32 = 2;
                    float f33 = this.LIZ / f32;
                    float f34 = this.LIZIZ / f32;
                    StaticLayout staticLayout = this.LJJIJL;
                    if (staticLayout != null) {
                        canvas.translate(f33 - (staticLayout.getWidth() / 2), f34 - (staticLayout.getHeight() / 2));
                        staticLayout.draw(canvas);
                    }
                    canvas.restoreToCount(iSave5);
                    return;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave5);
                }
            }
            Bitmap bitmap9 = this.LJJIFFI;
            if (bitmap9 != null) {
                iSave = canvas.save();
                try {
                    canvas.clipPath(this.LJIL);
                    canvas.drawBitmap(bitmap9, (Rect) null, this.LJJIJ, (Paint) null);
                    canvas.restoreToCount(iSave);
                    return;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Bitmap bitmap10 = this.LJIIL;
        if (bitmap10 != null) {
            int iSave6 = canvas.save();
            try {
                float f35 = this.LIZ;
                float f36 = this.LIZIZ;
                float f37 = 2;
                float f38 = f35 / f37;
                float f39 = f36 / f37;
                if (this.LJIIJJI == 1) {
                    canvas.clipPath(this.LJJ);
                } else {
                    canvas.clipPath(this.LJIL);
                }
                canvas.scale(1.2f, 1.2f, f38, f39);
                canvas.rotate(-9.0f, f38, f39);
                Float f40 = this.LJIJJ;
                if (f40 != null) {
                    float fFloatValue6 = f40.floatValue();
                    Rect rect6 = this.LJJII;
                    rect6.left = (int) (f35 - (f35 * fFloatValue6));
                    rect6.top = (int) (f36 - (fFloatValue6 * f36));
                }
                canvas.drawBitmap(bitmap10, (Rect) null, this.LJJII, (Paint) this.LJIJ.getValue());
                canvas.restoreToCount(iSave6);
            } finally {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave6);
            }
        }
    }

    public final String LJIIJJI(C440440HOw c440440HOw) {
        if (c440440HOw.LIZ.length() == 0 && !C10EU.LJIIZILJ(c440440HOw.LIZJ)) {
            if (C960203pA.LIZIZ(this.LJFF)) {
                return MixStudioSettings.INSTANCE.useFriendsIdEmptyPreviewPlaceholderDark();
            }
            return MixStudioSettings.INSTANCE.useFriendsIdEmptyPreviewPlaceholderLight();
        }
        return c440440HOw.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C441080HRi
            if (r0 == 0) goto L22
            r4 = r6
            X.0HRi r4 = (X.C441080HRi) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            X.0HRd r0 = r4.LL
            goto L4e
        L22:
            X.0HRi r4 = new X.0HRi
            r4.<init>(r5, r6)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            android.graphics.Bitmap r0 = r5.LJJIFFI     // Catch: X.C0H04 -> L5a
            if (r0 != 0) goto L55
            com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings r0 = com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings.INSTANCE     // Catch: X.C0H04 -> L5a
            java.lang.String r1 = r0.socialAvatarIdPlaceholder()     // Catch: X.C0H04 -> L5a
            if (r1 == 0) goto L55
            android.content.Context r0 = r5.LJFF     // Catch: X.C0H04 -> L5a
            r4.LL = r5     // Catch: X.C0H04 -> L5a
            r4.LLILZ = r2     // Catch: X.C0H04 -> L5a
            java.lang.Object r1 = X.C0H05.LIZJ(r0, r1, r4)     // Catch: X.C0H04 -> L5a
            if (r1 != r3) goto L4c
            return r3
        L4c:
            r0 = r5
            goto L51
        L4e:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C0H04 -> L5a
        L51:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: X.C0H04 -> L5a
            r0.LJJIFFI = r1     // Catch: X.C0H04 -> L5a
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C441030HRd.LJIILJJIL(X.05Vn):java.lang.Object");
    }

    @Override // X.C0H6M
    public final void LJIIIIZZ(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LJJII.set(0, 0, i, i2);
        this.LJJIIJZLJL.set(0, 0, i, i2);
        int i3 = -((i * 24) / 100);
        int i4 = (i2 * 4) / 100;
        int i5 = (i * 76) / 100;
        int i6 = (i2 * 104) / 100;
        this.LJJIII.set(i3, i4, i5, i6);
        int i7 = (i * 18) / 100;
        int i8 = (i2 * 10) / 100;
        int i9 = (i * 118) / 100;
        int i10 = (i2 * 110) / 100;
        this.LJJIIJ.set(i7, i8, i9, i10);
        this.LJJIIZ.set(i3, i4, i5, i6);
        this.LJJIIZI.set(i7, i8, i9, i10);
        float f = i;
        float f2 = i2;
        float f3 = (10 * f) / 23;
        Path path = this.LJIL;
        path.reset();
        float f4 = (3 * f2) / 4;
        path.moveTo(f, f4);
        float f5 = f2 - f3;
        path.lineTo(f, f5);
        float f6 = f - f3;
        path.arcTo(f6, f5, f, f2, 0.0f, 90.0f, false);
        path.lineTo(f3, f2);
        path.arcTo(0.0f, f5, f3, f2, 90.0f, 90.0f, false);
        path.lineTo(0.0f, f4);
        path.lineTo(-1000.0f, f4);
        path.lineTo(-1000.0f, -1000.0f);
        path.lineTo(1000.0f, -1000.0f);
        path.lineTo(1000.0f, f4);
        path.close();
        Path path2 = this.LJJ;
        path2.reset();
        path2.moveTo(f, f2 / 2);
        path2.lineTo(f, f5);
        path2.arcTo(f6, f5, f, f2, 0.0f, 90.0f, false);
        path2.lineTo(f3, f2);
        path2.arcTo(0.0f, f5, f3, f2, 90.0f, 90.0f, false);
        path2.lineTo(0.0f, f3);
        path2.arcTo(0.0f, 0.0f, f3, f3, 180.0f, 90.0f, false);
        path2.lineTo(f6, 0.0f);
        path2.arcTo(f6, 0.0f, f, f3, 270.0f, 90.0f, false);
        path2.close();
        Path path3 = this.LJJI;
        path3.reset();
        float f7 = f2 * (-0.15f);
        path3.moveTo((-0.125f) * f, f7);
        path3.lineTo(1.125f * f, f7);
        float f8 = f2 * 0.75f;
        path3.lineTo(f, f8);
        path3.quadTo(f, f2, 0.75f * f, f2);
        path3.lineTo(f * 0.25f, f2);
        path3.quadTo(0.0f, f2, 0.0f, f8);
        path3.close();
        this.LJJIJ.set(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) + i, i2);
        C1295950jpR c1295950jpR = this.LJJIJIIJIL;
        if (c1295950jpR != null) {
            c1295950jpR.setBounds(0, 0, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.util.List<X.C440440HOw> r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C441070HRh
            if (r0 == 0) goto L28
            r7 = r11
            X.0HRh r7 = (X.C441070HRh) r7
            int r2 = r7.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.LLILZIL = r2
        L12:
            java.lang.Object r1 = r7.LLILLL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZIL
            r6 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L3d
            if (r0 == r4) goto L36
            if (r0 != r5) goto L2e
            java.lang.Object r0 = r7.LL
            X.0HRd r0 = (X.C441030HRd) r0
            goto L86
        L28:
            X.0HRh r7 = new X.0HRh
            r7.<init>(r9, r11)
            goto L12
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.0HRd r0 = r7.LLILLJJLI
            java.lang.Object r3 = r7.LL
            java.lang.String r3 = (java.lang.String) r3
            goto L69
        L3d:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r10, r6)     // Catch: X.C0H04 -> L92
            X.0HOw r0 = (X.C440440HOw) r0     // Catch: X.C0H04 -> L92
            java.lang.String r2 = r9.LJIIJJI(r0)     // Catch: X.C0H04 -> L92
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r10, r4)     // Catch: X.C0H04 -> L92
            X.0HOw r0 = (X.C440440HOw) r0     // Catch: X.C0H04 -> L92
            java.lang.String r3 = r9.LJIIJJI(r0)     // Catch: X.C0H04 -> L92
            android.content.Context r1 = r9.LJFF     // Catch: X.C0H04 -> L92
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZJ(r2)     // Catch: X.C0H04 -> L92
            r7.LL = r3     // Catch: X.C0H04 -> L92
            r7.LLILLJJLI = r9     // Catch: X.C0H04 -> L92
            r7.LLILZIL = r4     // Catch: X.C0H04 -> L92
            java.lang.Object r1 = X.C0H05.LIZIZ(r1, r0, r7)     // Catch: X.C0H04 -> L92
            if (r1 != r8) goto L67
            return r8
        L67:
            r0 = r9
            goto L6c
        L69:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C0H04 -> L92
        L6c:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: X.C0H04 -> L92
            r0.LJIILIIL = r1     // Catch: X.C0H04 -> L92
            android.content.Context r2 = r9.LJFF     // Catch: X.C0H04 -> L92
            com.ss.android.ugc.aweme.base.ImageUrlModel r1 = X.C438710HIf.LIZJ(r3)     // Catch: X.C0H04 -> L92
            r7.LL = r9     // Catch: X.C0H04 -> L92
            r0 = 0
            r7.LLILLJJLI = r0     // Catch: X.C0H04 -> L92
            r7.LLILZIL = r5     // Catch: X.C0H04 -> L92
            java.lang.Object r1 = X.C0H05.LIZIZ(r2, r1, r7)     // Catch: X.C0H04 -> L92
            if (r1 != r8) goto L84
            return r8
        L84:
            r0 = r9
            goto L89
        L86:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C0H04 -> L92
        L89:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: X.C0H04 -> L92
            r0.LJIILJJIL = r1     // Catch: X.C0H04 -> L92
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L92:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C441030HRd.LJIIL(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.C440440HOw r6, X.InterfaceC1364105Vn<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C441060HRg
            if (r0 == 0) goto L24
            r4 = r7
            X.0HRg r4 = (X.C441060HRg) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            X.0HRd r0 = r4.LLILLJJLI
            X.0HOw r6 = r4.LL
            goto L4e
        L24:
            X.0HRg r4 = new X.0HRg
            r4.<init>(r5, r7)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = r5.LJIIJJI(r6)     // Catch: X.C0H04 -> L5e
            android.content.Context r1 = r5.LJFF     // Catch: X.C0H04 -> L5e
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZJ(r0)     // Catch: X.C0H04 -> L5e
            r4.LL = r6     // Catch: X.C0H04 -> L5e
            r4.LLILLJJLI = r5     // Catch: X.C0H04 -> L5e
            r4.LLILZIL = r2     // Catch: X.C0H04 -> L5e
            java.lang.Object r1 = X.C0H05.LIZIZ(r1, r0, r4)     // Catch: X.C0H04 -> L5e
            if (r1 != r3) goto L4c
            return r3
        L4c:
            r0 = r5
            goto L51
        L4e:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C0H04 -> L5e
        L51:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: X.C0H04 -> L5e
            r0.LJIIL = r1     // Catch: X.C0H04 -> L5e
            int r0 = r6.LJ     // Catch: X.C0H04 -> L5e
            r5.LJIIJJI = r0     // Catch: X.C0H04 -> L5e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C441030HRd.LJIILIIL(X.0HOw, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C441030HRd(Context context, InterfaceC497601wk interfaceC497601wk, C05YD<? extends C0HOM<? extends List<C440440HOw>>> c05yd, C435590H6f c435590H6f) {
        this.LJFF = context;
        this.LJI = interfaceC497601wk;
        this.LJII = c05yd;
        this.LJIIIIZZ = c435590H6f.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C441050HRf(this, null), 3);
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(1));
        this.LJJIZ = paint;
    }
}
