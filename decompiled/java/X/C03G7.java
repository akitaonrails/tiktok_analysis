package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CCDCIcon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.03G7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03G7 {
    public static final C03G7 LIZ = new C03G7();

    public static Integer LIZLLL(PaymentMethodsData paymentMethodsData) {
        int size;
        if (paymentMethodsData != null) {
            List listLJFF = PaymentMethodsData.LJFF(paymentMethodsData, false, false, 15);
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("ec_osp_view_all_merged_methods_count_settings", true)) {
                return Integer.valueOf(((ArrayList) listLJFF).size());
            }
            List listLIZIZ = C03QF.LIZIZ(C03QF.LIZ(listLJFF));
            if (listLIZIZ != null) {
                size = listLIZIZ.size();
            } else {
                size = ((ArrayList) listLJFF).size();
            }
            return Integer.valueOf(size);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.view.ViewGroup r17, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r18) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03G7.LIZ(android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):void");
    }

    public static void LJ(ConstraintLayout constraintLayout, PaymentMethod paymentMethod) {
        String str = paymentMethod.iconUrl;
        if (str != null) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIIZI(C1308910kAL.LJ(R.attr.c7, constraintLayout.getContext()));
            c1331670kl3LJIIIZ.LJJI((ImageView) constraintLayout.findViewById(R.id.wgd));
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        ((TextView) constraintLayout.findViewById(R.id.wgf)).setText(paymentMethod.displayName);
        C21532619Oq c21532619Oq = (C21532619Oq) constraintLayout.findViewById(R.id.k5d);
        List<CCDCIcon> list = paymentMethod.subIconUrls;
        if (list != null && (!list.isEmpty())) {
            C12ES.LJIILL(0, c21532619Oq);
            C786410Ut5.LJJJJZI(c21532619Oq);
            Iterator<CCDCIcon> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().lightIconUrl;
                if (str2 != null) {
                    int iLIZ = C679280Qkg.LIZ(32);
                    int iLIZ2 = C679280Qkg.LIZ(20);
                    int iLIZ3 = C679280Qkg.LIZ(4);
                    SmartImageView smartImageView = new SmartImageView(constraintLayout.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZ, iLIZ2);
                    layoutParams.setMarginEnd(iLIZ3);
                    C786410Ut5.G6(smartImageView, layoutParams);
                    C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str2);
                    c1331670kl3LJIIIZ2.LJJIIZI(C1308910kAL.LJ(R.attr.c7, smartImageView.getContext()));
                    c1331670kl3LJIIIZ2.LJJI(smartImageView);
                    C786410Ut5.h3(c1331670kl3LJIIIZ2);
                    c21532619Oq.addView(smartImageView);
                }
            }
            return;
        }
        C0H1U.LIZIZ(c21532619Oq);
    }

    public static View LIZJ(C03G7 c03g7, Context context, int i, int i2, int i3) {
        c03g7.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(i, i2));
        C426750GoL.LJIIIZ(frameLayout, Integer.valueOf(i3), 0, 0, 0, false, 16);
        frameLayout.setBackgroundResource(R.drawable.b2j);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C679280Qkg.LIZ(12), C679280Qkg.LIZ(12));
        layoutParams.gravity = 17;
        C786410Ut5.M6(tuxIconView, layoutParams);
        tuxIconView.setIconRes(R.raw.icon_ellipsis_horizontal);
        tuxIconView.setTintColorRes(R.attr.a1j);
        frameLayout.addView(tuxIconView);
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C03G7 r13, android.view.ViewGroup r14, java.util.List r15, java.lang.Integer r16, int r17, X.C1331730kl9 r18, boolean r19, boolean r20, int r21) {
        /*
            r0 = r21 & 4
            r8 = 0
            if (r0 == 0) goto L7
            r16 = r8
        L7:
            r0 = r21 & 32
            r12 = 0
            if (r0 == 0) goto Le
            r19 = 0
        Le:
            r0 = r21 & 64
            if (r0 == 0) goto L14
            r20 = 0
        L14:
            r13.getClass()
            if (r14 == 0) goto Lba
            X.C786410Ut5.LJJJJI(r14)
            X.C12ES.LJIILL(r12, r14)
            if (r16 == 0) goto La4
            int r1 = r16.intValue()
            if (r15 == 0) goto La2
            int r0 = r15.size()
        L2b:
            if (r0 > r1) goto L95
            r0 = r15
            r6 = 0
        L2f:
            if (r0 == 0) goto La5
            r15 = r0
        L32:
            java.util.Iterator r5 = r15.iterator()
            r1 = 0
        L37:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r2 = r5.next()
            int r4 = r1 + 1
            if (r1 < 0) goto La8
            java.lang.String r2 = (java.lang.String) r2
            r0 = 6
            if (r20 == 0) goto L92
            if (r16 != 0) goto L4e
            if (r1 > r0) goto L8c
        L4e:
            com.bytedance.lighten.loader.SmartImageView r7 = new com.bytedance.lighten.loader.SmartImageView
            android.content.Context r0 = r14.getContext()
            r7.<init>(r0)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r0 = 4627898977085921690(0x403999999999999a, double:25.6)
            int r1 = X.C0H9I.LIZ(r0)
            r0 = 16
            int r0 = X.C679280Qkg.LIZ(r0)
            r3.<init>(r1, r0)
            X.C786410Ut5.G6(r7, r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r17)
            r13 = 27
            r9 = r8
            r11 = r8
            X.C426750GoL.LJIIIZ(r7, r8, r9, r10, r11, r12, r13)
            kotlin.jvm.internal.AwS118S1200000_1 r1 = new kotlin.jvm.internal.AwS118S1200000_1
            r0 = 1
            r1.<init>(r2, r14, r7, r0)
            if (r19 == 0) goto L8e
            r1.invoke()
        L84:
            r0 = r18
            r7.setCircleOptions(r0)
            r14.addView(r7)
        L8c:
            r1 = r4
            goto L37
        L8e:
            r1.invoke()
            goto L84
        L92:
            if (r1 <= r0) goto L4e
            goto L8c
        L95:
            r6 = 1
            if (r15 == 0) goto Lae
            int r0 = r16.intValue()
            int r0 = r0 - r6
            java.util.List r0 = X.C13LP.LL(r15, r0)
            goto L2f
        La2:
            r0 = 0
            goto L2b
        La4:
            r6 = 0
        La5:
            if (r15 == 0) goto Lac
            goto L32
        La8:
            X.C1697810uHb.LJIJI()
            throw r8
        Lac:
            if (r6 == 0) goto Lba
        Lae:
            X.03G8 r1 = new X.03G8
            android.content.Context r0 = r14.getContext()
            r1.<init>(r0, r8, r12)
            r14.addView(r1)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03G7.LIZIZ(X.03G7, android.view.ViewGroup, java.util.List, java.lang.Integer, int, X.0kl9, boolean, boolean, int):void");
    }
}
