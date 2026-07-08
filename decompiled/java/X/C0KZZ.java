package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KZZ {
    public static final C0KZZ LIZ = new C0KZZ();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.android.live.base.model.ImageModel r6, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C519540KZc
            if (r0 == 0) goto L33
            r4 = r7
            X.0KZc r4 = (X.C519540KZc) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L23
            if (r0 != r1) goto L39
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            X.11Kf r0 = X.C1121670fIL.LJ(r6)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r4)
            if (r3 != r2) goto L22
            return r2
        L33:
            X.0KZc r4 = new X.0KZc
            r4.<init>(r5, r7)
            goto L12
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KZZ.LIZ(com.bytedance.android.live.base.model.ImageModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(java.lang.Integer r10, java.lang.Integer r11, java.util.List r12) {
        /*
            if (r10 == 0) goto L9f
            if (r11 == 0) goto L9f
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r12, r0)
            r6.<init>(r0)
            java.util.Iterator r9 = r12.iterator()
        L13:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r7 = r9.next()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            int r1 = r7.getWidth()
            int r0 = r10.intValue()
            if (r0 != r1) goto L37
            int r1 = r7.getHeight()
            int r0 = r11.intValue()
            if (r0 != r1) goto L37
        L33:
            r6.add(r7)
            goto L13
        L37:
            int r1 = r10.intValue()
            int r0 = r11.intValue()
            r8 = 0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r7, r1, r0, r8)
            int r0 = X.C497740JfY.LIZ
            int r2 = r5.getWidth()
            int r1 = r5.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r7)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r2.<init>(r8, r8, r1, r0)
            r0 = 1
            r3.setAntiAlias(r0)
            r4.drawARGB(r8, r8, r8, r8)
            r0 = -12434878(0xffffffffff424242, float:-2.5821426E38)
            r3.setColor(r0)
            int r0 = r5.getWidth()
            int r0 = r0 / 2
            float r8 = (float) r0
            int r0 = r5.getHeight()
            int r0 = r0 / 2
            float r1 = (float) r0
            int r0 = r5.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            r4.drawCircle(r8, r1, r0, r3)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r0)
            r3.setXfermode(r1)
            r4.drawBitmap(r5, r2, r2, r3)
            goto L33
        L9e:
            return r6
        L9f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KZZ.LJFF(java.lang.Integer, java.lang.Integer, java.util.List):java.util.List");
    }

    public static void LIZLLL(final C1295960jpS c1295960jpS, String str, final List list, final List list2, final Integer num, final Integer num2, boolean z, boolean z2, String str2) {
        Integer numValueOf;
        int i;
        Integer numValueOf2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        if (list2 != null) {
            numValueOf2 = Integer.valueOf(list2.size());
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2) || c1295960jpS == null) {
            return;
        }
        c1295960jpS.setMaintainOriginalImageBounds(true);
        c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0J9K
            @Override // X.InterfaceC1296230jpt
            public final void LIZ(C1294720jnS c1294720jnS) {
                List listLJFF;
                String str3;
                List<Bitmap> list3 = list2;
                if (list3 != null && (listLJFF = C0KZZ.LJFF(num, num2, list3)) != null) {
                    C1295960jpS c1295960jpS2 = c1295960jpS;
                    List<String> list4 = list;
                    int i2 = 0;
                    for (Object obj : listLJFF) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            Bitmap bitmap = (Bitmap) obj;
                            if (list4 != null) {
                                str3 = (String) C13LP.LJJJLZIJ(i2, list4);
                            } else {
                                str3 = null;
                            }
                            c1295960jpS2.updateBitmap(str3, bitmap);
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
        });
        if (z) {
            i = Integer.MAX_VALUE;
        } else {
            i = 0;
        }
        c1295960jpS.setRepeatCount(i);
        C1143680frq.LJIILJJIL(c1295960jpS, str2, str, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1295960jpS r17, java.lang.String r18, java.util.List<java.lang.String> r19, java.util.List<android.graphics.Bitmap> r20, java.lang.Integer r21, java.lang.Integer r22, boolean r23, boolean r24, java.lang.String r25, X.InterfaceC1364105Vn<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KZZ.LIZIZ(X.0jpS, java.lang.String, java.util.List, java.util.List, java.lang.Integer, java.lang.Integer, boolean, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0jpS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.0KZZ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b4 -> B:18:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1295960jpS r24, java.lang.String r25, java.util.List<java.lang.String> r26, java.util.List<? extends com.bytedance.android.live.base.model.ImageModel> r27, java.lang.Integer r28, java.lang.Integer r29, boolean r30, boolean r31, java.lang.String r32, X.InterfaceC1364105Vn<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KZZ.LIZJ(X.0jpS, java.lang.String, java.util.List, java.util.List, java.lang.Integer, java.lang.Integer, boolean, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }
}
