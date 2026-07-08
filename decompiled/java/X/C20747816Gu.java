package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;

/* JADX INFO: renamed from: X.16Gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20747816Gu extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    public static final void onFailed$1(C20747816Gu c20747816Gu, Throwable th) {
    }

    public static final void onFailed$2(C20747816Gu c20747816Gu, Throwable th) {
    }

    public static final void onFailed$3(C20747816Gu c20747816Gu, Throwable th) {
    }

    public static final void onFailed$4(C20747816Gu c20747816Gu, Throwable th) {
    }

    public static final void onFailed$5(C20747816Gu c20747816Gu, Throwable th) {
    }

    public static final void onFailed$6(C20747816Gu c20747816Gu, Throwable th) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
            case 3:
                LIZ$3(this, bitmap);
                break;
            case 4:
                LIZ$4(this, bitmap);
                break;
            case 5:
                LIZ$5(this, bitmap);
                break;
            case 6:
                LIZ$6(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.AbstractC468201s0, X.InterfaceC1331910klR
    public final void onCanceled() {
        if (this.$t != 0) {
            super.onCanceled();
        } else {
            onCanceled$0(this);
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
            case 3:
                onFailed$3(this, th);
                break;
            case 4:
                onFailed$4(this, th);
                break;
            case 5:
                onFailed$5(this, th);
                break;
            case 6:
                onFailed$6(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public static final void onCanceled$0(C20747816Gu c20747816Gu) {
        ((C21279318Pf) c20747816Gu.l0).LJIIJJI = false;
    }

    public C20747816Gu(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(X.C20747816Gu r9, android.graphics.Bitmap r10) {
        /*
            java.lang.Object r1 = r9.l0
            X.18Pf r1 = (X.C21279318Pf) r1
            r0 = 0
            r1.LJIIJJI = r0
            r3 = r10
            if (r3 == 0) goto L36
            java.lang.Object r1 = r9.l0
            X.18Pf r1 = (X.C21279318Pf) r1
            boolean r0 = X.C276490AsZ.LIZ()
            if (r0 == 0) goto L33
            X.18PZ r2 = X.C18PZ.LIZ
            r0 = 22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r2.getClass()
            int r7 = r3.getWidth()     // Catch: java.lang.Throwable -> L78
            int r6 = r3.getHeight()     // Catch: java.lang.Throwable -> L78
            if (r7 != r6) goto L37
            if (r7 != r0) goto L37
        L33:
            r2 = r3
        L34:
            r1.LJIIIIZZ = r2
        L36:
            return
        L37:
            if (r7 < r6) goto L4f
            float r2 = (float) r0     // Catch: java.lang.Throwable -> L78
            float r0 = (float) r6     // Catch: java.lang.Throwable -> L78
            float r2 = r2 / r0
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L78
            r8.<init>()     // Catch: java.lang.Throwable -> L78
            r8.setScale(r2, r2)     // Catch: java.lang.Throwable -> L78
            int r7 = r7 - r6
            int r4 = r7 / 2
            r5 = 0
            r9 = 1
            r7 = r6
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L78
            goto L65
        L4f:
            float r2 = (float) r0     // Catch: java.lang.Throwable -> L78
            float r0 = (float) r7     // Catch: java.lang.Throwable -> L78
            float r2 = r2 / r0
            android.graphics.Matrix r9 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L78
            r9.<init>()     // Catch: java.lang.Throwable -> L78
            r9.setScale(r2, r2)     // Catch: java.lang.Throwable -> L78
            r5 = 0
            int r6 = r6 - r7
            int r6 = r6 / 2
            r10 = 1
            r4 = r3
            r8 = r7
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L78
        L65:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r2)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L34
            boolean r0 = r3.isRecycled()     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L34
            r3.recycle()     // Catch: java.lang.Throwable -> L78
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r3)     // Catch: java.lang.Throwable -> L78
            goto L34
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20747816Gu.LIZ$0(X.16Gu, android.graphics.Bitmap):void");
    }

    public static final void LIZ$1(C20747816Gu c20747816Gu, Bitmap bitmap) {
        ((EmoteEditDialogFragment) c20747816Gu.l0).cS(bitmap);
    }

    public static final void LIZ$2(C20747816Gu c20747816Gu, Bitmap bitmap) {
        ((EmoteEditDialogFragment) c20747816Gu.l0).cS(bitmap);
    }

    public static final void LIZ$3(C20747816Gu c20747816Gu, Bitmap bitmap) {
        ((SpotlightImageListPreviewDialogFragment) c20747816Gu.l0).UR(bitmap);
    }

    public static final void LIZ$4(C20747816Gu c20747816Gu, Bitmap bitmap) {
        ((SpotlightImageListPreviewDialogFragment) c20747816Gu.l0).UR(bitmap);
    }

    public static final void LIZ$5(C20747816Gu c20747816Gu, Bitmap bitmap) {
        ((SpotlightImageEditDialogFragment) c20747816Gu.l0).gS(bitmap);
    }

    public static final void LIZ$6(C20747816Gu c20747816Gu, Bitmap bitmap) {
        ((SpotlightImageEditDialogFragment) c20747816Gu.l0).gS(bitmap);
    }

    public static final void onFailed$0(C20747816Gu c20747816Gu, Throwable th) {
        ((C21279318Pf) c20747816Gu.l0).LJIIJJI = false;
    }
}
