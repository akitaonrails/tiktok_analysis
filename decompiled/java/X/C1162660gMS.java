package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.preload.MynaGeckoChannelPreloadInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162660gMS {
    public static void LIZ(String str, List list, C997290c3j c997290c3j) {
        if (!a0.LJJJIL(str)) {
            if (!list.isEmpty()) {
                C21322218cO c21322218cO = C21322218cO.LIZ;
                C998400c5W.LIZ.getClass();
                MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfoLIZ = C998400c5W.LIZ(list);
                C989960bru c989960bru = new C989960bru(c997290c3j);
                c21322218cO.getClass();
                C21322218cO.LJIIIIZZ(str, mynaGeckoChannelPreloadInfoLIZ, true, c989960bru);
                return;
            }
            "MynaViewWrapper.preloadMynaTemplate: items must not be empty".toString();
            throw new IllegalArgumentException("MynaViewWrapper.preloadMynaTemplate: items must not be empty");
        }
        "MynaViewWrapper.preloadMynaTemplate: biz must not be blank".toString();
        throw new IllegalArgumentException("MynaViewWrapper.preloadMynaTemplate: biz must not be blank");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1162670gMT LIZJ(android.view.ViewGroup r10, java.lang.String r11, kotlin.jvm.functions.Function1 r12) {
        /*
            android.content.Context r0 = r10.getContext()
            X.0gMz r2 = new X.0gMz
            r2.<init>(r0)
            X.0gCq r1 = new X.0gCq
            X.0gJU r0 = new X.0gJU
            r0.<init>(r2, r12)
            r1.<init>(r0)
            r2.LJFF = r1
            boolean r0 = r2.LJIIIIZZ
            r0 = r0 ^ 1
            if (r0 == 0) goto L8c
            r4 = 0
            r2.LIZIZ = r4
            X.011C r1 = new X.011C
            r1.<init>(r11)
            java.lang.String r0 = r1.LIZJ
            r8 = 0
            if (r0 != 0) goto L29
            r0 = r8
        L29:
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L81
            java.lang.String r0 = r1.LIZLLL
            if (r0 != 0) goto L36
            r0 = r8
        L36:
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L81
            r2.LIZJ(r1)
            X.18d7 r5 = r2.LJ
            if (r5 != 0) goto L46
            r5 = r8
        L46:
            X.0gMv r1 = r2.LIZJ
            java.lang.String r0 = "url"
            java.lang.Object r6 = r1.LIZ(r0)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map r7 = X.C2097608Jq.LJ()
            java.util.Map r9 = X.C2097608Jq.LJ()
            java.util.Map r10 = X.C2097608Jq.LJ()
            X.0gCq r12 = r2.LJFF
            if (r12 != 0) goto L61
            r12 = r8
        L61:
            r11 = r8
            X.18d5 r3 = r5.LIZ(r6, r7, r8, r9, r10, r11, r12)
            r2.LIZLLL = r3
            X.0gD6 r1 = new X.0gD6
            r1.<init>(r2)
            X.18cz r0 = r3.LIZ
            X.18dL r0 = r0.LJIIJ
            r0.LJIIIZ = r1
            java.util.Map<java.lang.String, ? extends java.lang.Object> r0 = r2.LJII
            r3.LIZJ = r0
            r3.LIZLLL = r8
            r3.LJ = r4
        L7b:
            X.0gMT r0 = new X.0gMT
            r0.<init>(r2)
            return r0
        L81:
            kotlin.jvm.internal.AwS53S1000000_2 r1 = new kotlin.jvm.internal.AwS53S1000000_2
            r0 = 11
            r1.<init>(r11, r0)
            X.C1168400gVi.LIZIZ(r1)
            goto L7b
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MynaView has been released"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1162660gMS.LIZJ(android.view.ViewGroup, java.lang.String, kotlin.jvm.functions.Function1):X.0gMT");
    }

    public static void LIZIZ(String str, Context context, List list, InterfaceC1165460gQy interfaceC1165460gQy, C997300c3k c997300c3k) {
        C1168340gVc c1168340gVcLIZ;
        Object c098200Yq;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Float fLJIIIIZZ;
        Float fLJIIIIZZ2;
        Float fLJIIIIZZ3;
        if (!a0.LJJJIL(str)) {
            if (!list.isEmpty()) {
                C998400c5W.LIZ.getClass();
                C1168270gVV.LIZ.getClass();
                if (C1168270gVV.LJIIIIZZ().get(str) == null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        c1168340gVcLIZ = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str2 = ((C990550bsr) it2.next()).LIZLLL;
                        if (str2 != null) {
                            C998400c5W.LIZ.getClass();
                            try {
                                c098200Yq = UriProtector.parse(Uri.decode(str2));
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            Uri uri = (Uri) c098200Yq;
                            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "base_on_width_dp")) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                                float fFloatValue = fLJIIIIZZ.floatValue();
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "view_scale");
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
                                    float fFloatValue2 = fLJIIIIZZ2.floatValue();
                                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "font_scale");
                                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
                                        float fFloatValue3 = fLJIIIIZZ3.floatValue();
                                        C1168340gVc c1168340gVc = C1168340gVc.LIZJ;
                                        c1168340gVcLIZ = C1168330gVb.LIZ(fFloatValue, fFloatValue2, fFloatValue3);
                                        if (c1168340gVcLIZ != null) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C1168270gVV.LIZ.LJIIJJI(new C1165450gQx(str, interfaceC1165460gQy, c1168340gVcLIZ), str);
                }
                C21322218cO c21322218cO = C21322218cO.LIZ;
                Context contextN3 = C786410Ut5.N3(context);
                C998400c5W.LIZ.getClass();
                MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfoLIZ = C998400c5W.LIZ(list);
                C989960bru c989960bru = new C989960bru(c997300c3k);
                c21322218cO.getClass();
                C21322218cO.LJI(str, contextN3, mynaGeckoChannelPreloadInfoLIZ, true, c989960bru);
                return;
            }
            "MynaViewWrapper.preloadMynaView: items must not be empty".toString();
            throw new IllegalArgumentException("MynaViewWrapper.preloadMynaView: items must not be empty");
        }
        "MynaViewWrapper.preloadMynaView: biz must not be blank".toString();
        throw new IllegalArgumentException("MynaViewWrapper.preloadMynaView: biz must not be blank");
    }
}
