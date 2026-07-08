package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ux5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723530ux5 {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(Context context) {
        if (context == null) {
            return null;
        }
        if (C1834150xpV.LJI(context)) {
            return C1308910kAL.LIZJ(R.attr.c3, context);
        }
        return C1308910kAL.LIZJ(R.attr.zp, context);
    }

    public static void LJFF(Activity activity) {
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131832644);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LIZIZ(Context context, View... viewArr) {
        Integer numLIZ = LIZ(context);
        if (numLIZ != null) {
            int iIntValue = numLIZ.intValue();
            for (View view : viewArr) {
                view.setBackgroundColor(iIntValue);
            }
        }
    }

    public static void LIZJ(TuxTextView tuxTextView, Integer num) {
        if (num != null && num.intValue() > 0 && tuxTextView != null) {
            tuxTextView.setMaxLines(num.intValue());
        }
    }

    public static void LJI(TuxTextView tuxTextView, Integer num) {
        if (num != null && num.intValue() > 0) {
            tuxTextView.setTextColorRes(R.attr.wf);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJFF = Integer.valueOf(R.attr.wf);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
            return;
        }
        tuxTextView.setTextColorRes(R.attr.a1h);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LJFF = Integer.valueOf(R.attr.ni);
        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        tuxTextView.setBackground(c384050F3z2.LIZ(tuxTextView.getContext()));
    }

    public static void LIZLLL(C428440Gr4 c428440Gr4, String str, final Function0 function0) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C475401tA.LIZ(str, c428440Gr4, C341940Daq.LIZ(164.0d), 0, new InterfaceC475301t9() { // from class: X.0ux1
            @Override // X.InterfaceC475301t9
            public final void onSuccess() {
                C1729570v6p.LIZ("finish", "template_background", Boolean.TRUE, null, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), 8);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // X.InterfaceC475301t9
            public final void onFailed(Throwable th) {
                C1729570v6p.LIZ("finish", "template_background", Boolean.FALSE, th.getMessage(), null, 16);
            }
        }, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x003a A[Catch: all -> 0x0045, CancellationException -> 0x008d, TryCatch #2 {CancellationException -> 0x008d, all -> 0x0045, blocks: (B:23:0x0025, B:26:0x0031, B:30:0x003a, B:28:0x0036), top: B:51:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.bytedance.tux.input.TuxTextView r8, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ColorEntity r9, int r10) {
        /*
            r0 = r10 & 4
            r7 = 0
            if (r0 == 0) goto L23
            r2 = 4
        L6:
            r0 = r10 & 8
            if (r0 == 0) goto L21
            r6 = 1
        Lb:
            r0 = r10 & 16
            if (r0 == 0) goto L1f
            r5 = 1
        L10:
            r0 = r10 & 32
            if (r0 == 0) goto L1d
            r4 = 1
        L15:
            r0 = r10 & 64
            if (r0 == 0) goto L1a
            r7 = 1
        L1a:
            if (r8 == 0) goto L92
            goto L25
        L1d:
            r4 = 0
            goto L15
        L1f:
            r5 = 0
            goto L10
        L21:
            r6 = 0
            goto Lb
        L23:
            r2 = 0
            goto L6
        L25:
            android.content.Context r0 = r8.getContext()     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L8d
            boolean r0 = X.C1834150xpV.LJI(r0)     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L8d
            if (r0 == 0) goto L34
            if (r9 == 0) goto L49
            java.lang.String r0 = r9.darkValue     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L8d
            goto L38
        L34:
            if (r9 == 0) goto L49
            java.lang.String r0 = r9.value     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L8d
        L38:
            if (r0 == 0) goto L49
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L8d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L45 java.util.concurrent.CancellationException -> L8d
            if (r3 != 0) goto L54
            goto L49
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L49:
            android.content.Context r1 = r8.getContext()
            r0 = 2131099676(0x7f06001c, float:1.7811712E38)
            java.lang.Integer r3 = X.C1308910kAL.LIZJ(r0, r1)
        L54:
            double r0 = (double) r2
            int r0 = X.C341940Daq.LIZ(r0)
            float r2 = (float) r0
            X.0F3z r1 = new X.0F3z
            r1.<init>()
            r1.LIZ = r3
            if (r6 == 0) goto L69
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.LJIIIIZZ = r0
        L69:
            if (r5 == 0) goto L71
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.LJIIIZ = r0
        L71:
            if (r4 == 0) goto L79
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.LJIIJ = r0
        L79:
            if (r7 == 0) goto L81
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r1.LJIIJJI = r0
        L81:
            android.content.Context r0 = r8.getContext()
            android.graphics.drawable.Drawable r0 = r1.LIZ(r0)
            r8.setBackground(r0)
            return
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1723530ux5.LJ(com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ColorEntity, int):void");
    }
}
