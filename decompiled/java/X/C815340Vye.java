package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815340Vye {
    public static final /* synthetic */ int LIZ = 0;

    public static final Bitmap LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            width = height;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, width, width);
        canvas.drawOval(new RectF(rect), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public static final int LIZIZ(C814730Vxf c814730Vxf) {
        if (c814730Vxf != null && c814730Vxf.extra != null) {
            if (!TextUtils.isEmpty(c814730Vxf.itemType)) {
                if (Intrinsics.LJFF("im_private", c814730Vxf.itemType)) {
                    return 1;
                }
                if (Intrinsics.LJFF("im_group", c814730Vxf.itemType)) {
                    return 2;
                }
            } else {
                Uri uri = UriProtector.parse(c814730Vxf.openUrl);
                if (uri != null) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
                    if (Intrinsics.LJFF("click_push_im", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) || Intrinsics.LJFF("click_push_im_private", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) || Intrinsics.LJFF("click_push_im_msg_req", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        return 1;
                    }
                    if (Intrinsics.LJFF("click_push_im_group", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C814730Vxf r15, android.graphics.Bitmap[] r16, android.graphics.Bitmap[] r17) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C815340Vye.LIZJ(X.0Vxf, android.graphics.Bitmap[], android.graphics.Bitmap[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZLLL(X.C814730Vxf r9, android.graphics.Bitmap[] r10, android.graphics.Bitmap[] r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            boolean r0 = r12 instanceof X.C591570NId
            if (r0 == 0) goto L60
            r7 = r12
            X.0NId r7 = (X.C591570NId) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r8 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 == r4) goto L50
            if (r0 != r5) goto L66
            X.C155000ia.LIZIZ(r2)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r2)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r3 = X.C2296808zG.LIZ(r0)
            X.0Vyc r0 = new X.0Vyc
            r0.<init>(r9, r10, r8)
            r1 = 3
            X.099G r2 = X.C23250099c.LIZIZ(r3, r8, r8, r0, r1)
            X.0Vyd r0 = new X.0Vyd
            r0.<init>(r9, r11, r8)
            X.099G r1 = X.C23250099c.LIZIZ(r3, r8, r8, r0, r1)
            r7.LL = r1
            r7.LLILLL = r4
            java.lang.Object r0 = r2.LJLIIIL(r7)
            if (r0 != r6) goto L55
            return r6
        L50:
            X.099G r1 = r7.LL
            X.C155000ia.LIZIZ(r2)
        L55:
            r7.LL = r8
            r7.LLILLL = r5
            java.lang.Object r0 = r1.LJLIIIL(r7)
            if (r0 != r6) goto L26
            return r6
        L60:
            X.0NId r7 = new X.0NId
            r7.<init>(r12)
            goto L12
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C815340Vye.LIZLLL(X.0Vxf, android.graphics.Bitmap[], android.graphics.Bitmap[], X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bitmap LJ(C814730Vxf c814730Vxf, List<String> list, final EnumC815370Vyh enumC815370Vyh, AtomicReference<String> atomicReference) {
        boolean z;
        Object obj = "loading_failed";
        boolean z2 = false;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (((CharSequence) C13LP.LJJJJZI(list)).length() == 0) {
                z2 = true;
            }
            if (!z2) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference2 = new AtomicReference(null);
                final AtomicReference atomicReference3 = new AtomicReference();
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
                if (MessageShowHandler.LJ(c814730Vxf.latencyAnalytics.getPushLabel()) && enumC815370Vyh == EnumC815370Vyh.COMMON) {
                    C1332130kln.LIZJ(c1331670kl3LJIIJ, C06TB.DEFAULT);
                }
                c1331670kl3LJIIJ.LJJIJL(C786410Ut5.M3(C1BWL.LIZ()));
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                c1331670kl3LJIIJ.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LJIIJ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIJ.LJJII(new AbstractC468201s0() { // from class: X.0Vyg
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        atomicReference2.set(bitmap);
                        countDownLatch.countDown();
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        String message;
                        String strLIZIZ;
                        String message2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("loadBitmapSync onFailed: ");
                        String message3 = null;
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        sbLIZ.append(" scene::");
                        sbLIZ.append(enumC815370Vyh);
                        C2188811AlT.LIZIZ(sbLIZ);
                        atomicReference2.set(null);
                        if (th != null && (message2 = th.getMessage()) != null && message2.length() != 0) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("loading_failed: ");
                            if (th != null) {
                                message3 = th.getMessage();
                            }
                            sbLIZ2.append(message3);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        } else {
                            strLIZIZ = "loading_failed";
                        }
                        atomicReference3.set(strLIZIZ);
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await();
                    Bitmap bitmap = (Bitmap) atomicReference2.get();
                    if (bitmap == null) {
                        Object obj2 = atomicReference3.get();
                        if (obj2 != null) {
                            obj = obj2;
                        }
                        atomicReference.set(obj);
                    }
                    return bitmap;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C786410Ut5.u3().interrupt();
                    atomicReference.set("loading_failed");
                    return null;
                }
            }
        }
        atomicReference.set("img_url_null");
        return null;
    }
}
