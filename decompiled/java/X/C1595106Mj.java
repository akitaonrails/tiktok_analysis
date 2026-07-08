package X;

import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1595106Mj implements InterfaceC1769890w9r {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1265));

    @Override // X.InterfaceC1769890w9r
    public final boolean LIZIZ(String str) {
        if (((ILiveStreamAdaptService) this.LIZ.getValue()).LIZIZ(str) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // X.InterfaceC1769890w9r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.hybrid.spark.SparkContext r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            java.lang.String r2 = r0.getHost()
            java.lang.String r1 = "lynxview_popup"
            r0 = 1
            boolean r0 = kotlin.text.u.LJIJI(r1, r2, r0)
            if (r0 != 0) goto L12
            return
        L12:
            X.01GW r0 = r5.LIZ
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService r0 = (com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService) r0
            java.lang.String r4 = r0.LIZIZ(r8)
            if (r4 != 0) goto L21
            return
        L21:
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)
            java.lang.String r0 = "height_percent"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
            if (r1 != 0) goto L41
            java.lang.String r0 = "height"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
            if (r1 != 0) goto L41
        L35:
            r1 = 1060320051(0x3f333333, float:0.7)
        L38:
            X.06Mk r0 = new X.06Mk
            r0.<init>()
            r6.LJJLIIIJJIZ(r0)
            return
        L41:
            java.lang.String r0 = "%"
            java.lang.String r0 = kotlin.text.a0.LJJJLL(r0, r1)
            java.lang.Float r0 = X.C2327809Ae.LJIIIIZZ(r0)
            if (r0 == 0) goto L35
            float r3 = r0.floatValue()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5a
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r0
        L5a:
            r2 = 0
            float r0 = X.C13LZ.LIZLLL(r3, r2, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            float r0 = r1.floatValue()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L35
            float r1 = r1.floatValue()
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1595106Mj.LIZ(com.bytedance.hybrid.spark.SparkContext, java.lang.String, java.lang.String):void");
    }

    public final void LIZJ(SparkPopup sparkPopup, String str, float f, boolean z) {
        if (sparkPopup.getContext() == null) {
            return;
        }
        ((ILiveStreamAdaptService) this.LIZ.getValue()).LIZ((int) (r0.getResources().getDisplayMetrics().heightPixels * f), str, z);
    }
}
