package X;

import Y.ARunnableS89S0200000_20;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMHitSampleDetector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332130kln {
    public static final C1331730kl9 LIZIZ() {
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        return c1331750klB.LIZ();
    }

    public static final void LIZJ(C1331670kl3 c1331670kl3, C06TB c06tb) {
        if (C287740BPo.LIZJ && C1328130kfL.LJIJJLI() && C1328130kfL.LJIILIIL().LJIIIIZZ().containsKey(c06tb.getSpace())) {
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = c06tb.getSpace();
        }
    }

    public static final boolean LJI(Uri uri, Function0<Integer> function0) {
        long jLongValue;
        Long lLJIILIIL;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "x-expires");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = Long.MAX_VALUE;
        }
        if (function0.invoke().intValue() >= jLongValue) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1331670kl3 LIZ(X.C1331670kl3 r5, final android.content.Context r6, final android.net.Uri r7) {
        /*
            if (r7 != 0) goto L3
            return r5
        L3:
            X.01GW r0 = X.C0AK0.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L91
            android.content.ContentResolver r0 = r6.getContentResolver()
            java.lang.String r2 = r0.getType(r7)
            r1 = 0
            if (r2 == 0) goto L22
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r2.toLowerCase(r0)
        L22:
            java.lang.String r0 = "image/heic"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L54
            java.lang.String r0 = "image/heif"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L54
            java.lang.String r1 = r7.toString()
            r0 = 63
            java.lang.String r1 = kotlin.text.a0.LJJLL(r0, r1, r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = ".heic"
            boolean r0 = kotlin.text.u.LJIIZILJ(r1, r0, r3)
            if (r0 != 0) goto L54
            java.lang.String r0 = ".heif"
            boolean r0 = kotlin.text.u.LJIIZILJ(r1, r0, r3)
            if (r0 == 0) goto L91
        L54:
            r5.LJ = r3
            X.0klZ r0 = r5.LJJII
            if (r0 == 0) goto L73
            java.util.List<X.0klG> r4 = r0.LIZ
            if (r4 == 0) goto L73
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L73
            int r0 = r4.size()
            if (r0 != r2) goto L7c
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            boolean r0 = r0 instanceof X.C1331780klE
            if (r0 == 0) goto L7c
            return r5
        L73:
            X.0klE r0 = new X.0klE
            r0.<init>(r6, r7)
            r5.LJJIJIL(r0)
            return r5
        L7c:
            X.0kli r1 = new X.0kli
            X.0klE r0 = new X.0klE
            r0.<init>(r6, r7)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.List r0 = X.C13LP.LJLIL(r4, r0)
            r1.<init>(r0)
            r5.LJJIJIL(r1)
        L91:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1332130kln.LIZ(X.0kl3, android.content.Context, android.net.Uri):X.0kl3");
    }

    public static void LJ(final C1331670kl3 c1331670kl3, final String str, final String str2, int i, boolean z, InterfaceC902220ZaO interfaceC902220ZaO, InterfaceC427850Gq7 interfaceC427850Gq7, int i2) {
        final C1714806na c1714806na;
        final InterfaceC427850Gq7 interfaceC427850Gq72 = interfaceC427850Gq7;
        final InterfaceC902220ZaO interfaceC902220ZaO2 = interfaceC902220ZaO;
        final boolean z2 = z;
        final int i3 = i;
        if ((i2 & 4) != 0) {
            i3 = 2;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        C03IT c03it = null;
        if ((i2 & 16) != 0) {
            IMContactApi.LIZ.getClass();
            c1714806na = new C1714806na(C069P.LIZ().LJ());
        } else {
            c1714806na = null;
        }
        if ((i2 & 32) != 0) {
            InterfaceC902220ZaO.LIZ.getClass();
            interfaceC902220ZaO2 = C902210ZaN.LIZIZ;
        }
        if ((i2 & 64) != 0) {
            interfaceC427850Gq72 = null;
        }
        final Function1 function1 = null;
        if ((interfaceC902220ZaO2 instanceof C0I6G) && C0I6D.LIZIZ(c1331670kl3, interfaceC902220ZaO2)) {
            return;
        }
        if (str2 != null && str2.length() != 0) {
            final C1331510kkn c1331510kknLIZJ = c1331670kl3.LIZJ();
            if (c1331510kknLIZJ != null) {
                c03it = c1331510kknLIZJ.LJJJI;
            }
            C823050WQl.LIZLLL().execute(new ARunnableS89S0200000_20(new InterfaceC442640HXi() { // from class: X.0HZo
                /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
                @Override // X.InterfaceC442640HXi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onResult(java.lang.Object r16) {
                    /*
                        r15 = this;
                        r0 = r16
                        java.lang.String r0 = (java.lang.String) r0
                        int r0 = r0.length()
                        r3 = 0
                        if (r0 <= 0) goto L1d
                        X.0kl3 r0 = r1
                        java.lang.String r1 = r2
                        X.0Gq7 r2 = r3
                        boolean r3 = r4
                        X.0ZaO r4 = r5
                        r5 = 0
                        r7 = 48
                        r6 = r5
                        X.C1332130kln.LJFF(r0, r1, r2, r3, r4, r5, r6, r7)
                    L1c:
                        return
                    L1d:
                        X.0kkn r0 = r6
                        if (r0 == 0) goto L4c
                        X.03IT r2 = r0.LJJJI
                        if (r2 == 0) goto L4c
                        r0 = 594(0x252, float:8.32E-43)
                        kotlin.jvm.internal.AFwS192S0000000_6 r1 = kotlin.jvm.internal.AFwS192S0000000_6.get$arr$(r0)
                        java.util.List<java.lang.String> r0 = r2.LIZ
                        if (r0 == 0) goto L4c
                        java.util.ArrayList r0 = (java.util.ArrayList) r0
                        boolean r0 = r0.isEmpty()
                        if (r0 != 0) goto L4c
                        java.util.List<java.lang.String> r0 = r2.LIZ     // Catch: java.lang.Exception -> La5
                        java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> La5
                        java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> La5
                        java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> La5
                        android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> La5
                        boolean r0 = X.C1332130kln.LJI(r0, r1)     // Catch: java.lang.Exception -> La5
                        if (r0 != 0) goto L4c
                        goto La9
                    L4c:
                        X.0kkn r0 = r6
                        if (r0 == 0) goto L61
                        android.net.Uri r1 = r0.LIZ
                        if (r1 == 0) goto L61
                        r0 = 593(0x251, float:8.31E-43)
                        kotlin.jvm.internal.AFwS192S0000000_6 r0 = kotlin.jvm.internal.AFwS192S0000000_6.get$arr$(r0)
                        boolean r0 = X.C1332130kln.LJI(r1, r0)
                        if (r0 != 0) goto L61
                        goto La9
                    L61:
                        X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
                        r0.getClass()
                        com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
                        X.1BGS r1 = r0.LJ()
                        java.lang.String r0 = r7
                        boolean r0 = r1.LJIJJLI(r0)
                        if (r0 != 0) goto L1c
                        com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
                        X.1BGS r1 = r0.LJ()
                        java.lang.String r0 = r7
                        r1.LJJII(r0)
                        X.0txc<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, X.05qt, kotlin.Unit> r9 = r8
                        java.lang.String r8 = r7
                        r11 = 0
                        java.lang.Boolean r12 = java.lang.Boolean.TRUE
                        java.lang.String r13 = "im_avatar"
                        X.0I6A r0 = new X.0I6A
                        X.0kl3 r1 = r1
                        java.lang.String r2 = r2
                        X.0Gq7 r3 = r3
                        boolean r4 = r4
                        X.0ZaO r5 = r5
                        int r6 = r9
                        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r7 = r10
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                        r10 = r8
                        r14 = r0
                        r9.invoke(r10, r11, r12, r13, r14)
                        return
                    La5:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    La9:
                        X.0kl3 r0 = r1
                        java.lang.String r1 = r2
                        X.0Gq7 r2 = r3
                        boolean r3 = r4
                        X.0ZaO r4 = r5
                        r5 = 0
                        r7 = 48
                        r6 = r5
                        X.C1332130kln.LJFF(r0, r1, r2, r3, r4, r5, r6, r7)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C443220HZo.onResult(java.lang.Object):void");
                }
            }, c03it, 226));
            return;
        }
        LJFF(c1331670kl3, str, null, z2, interfaceC902220ZaO2, null, null, 50);
    }

    public static void LJFF(final C1331670kl3 c1331670kl3, final String str, final InterfaceC427850Gq7 interfaceC427850Gq7, boolean z, final InterfaceC902220ZaO interfaceC902220ZaO, C869590Y9l c869590Y9l, Map map, int i) {
        View view;
        View view2;
        if ((i & 2) != 0) {
            interfaceC427850Gq7 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            InterfaceC902220ZaO.LIZ.getClass();
            interfaceC902220ZaO = C902210ZaN.LIZIZ;
        }
        if ((i & 16) != 0) {
            c869590Y9l = null;
        }
        if ((i & 32) != 0) {
            map = new LinkedHashMap();
        }
        if (C123100dR.LIZ(c1331670kl3.LJJJJJ)) {
            map.put("cache_space", c1331670kl3.LJJJJJ);
        }
        if ((interfaceC902220ZaO instanceof C0I6G) && C0I6D.LIZIZ(c1331670kl3, interfaceC902220ZaO)) {
            if (interfaceC427850Gq7 != null) {
                Uri uri = c1331670kl3.LIZ;
                Object obj = c1331670kl3.LJJIIZI;
                if (obj instanceof View) {
                    view = (View) obj;
                } else {
                    view = null;
                }
                interfaceC427850Gq7.Bh(uri, view);
                Uri uri2 = c1331670kl3.LIZ;
                Object obj2 = c1331670kl3.LJJIIZI;
                if (obj2 instanceof View) {
                    view2 = (View) obj2;
                } else {
                    view2 = null;
                }
                interfaceC427850Gq7.Ad(uri2, view2, null, null);
                return;
            }
            return;
        }
        InterfaceC427850Gq7 interfaceC427850Gq72 = new InterfaceC427850Gq7() { // from class: X.0ZsR
            @Override // X.InterfaceC427850Gq7
            public final void e1(Uri uri3) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.e1(uri3);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void A3(Uri uri3, C428600GrK c428600GrK) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.A3(uri3, c428600GrK);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Bh(Uri uri3, View view3) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.Bh(uri3, view3);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void lg(Uri uri3, Throwable th) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.lg(uri3, th);
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri3, View view3, Throwable th) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.cm(uri3, view3, th);
                }
                if (th != null) {
                    String str2 = str;
                    IMHitSampleDetector.LIZ.getClass();
                    IMHitSampleDetector value = C1493705t1.LIZIZ.getValue();
                    if ((value == null || value.isHitSample("aweme_im_image_show", C21307818a4.LIZIZ(str2))) && !(th instanceof C1494430ozZ) && !(th instanceof IllegalArgumentException)) {
                        Throwable cause = th.getCause();
                        if (cause != null && ((cause instanceof C1494430ozZ) || (cause instanceof IllegalArgumentException))) {
                            return;
                        }
                        C1AF0.LJFF(th, "IMLightenExt");
                    }
                }
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri3, View view3, C428600GrK c428600GrK, Animatable animatable) {
                InterfaceC427850Gq7 interfaceC427850Gq73 = interfaceC427850Gq7;
                if (interfaceC427850Gq73 != null) {
                    interfaceC427850Gq73.Ad(uri3, view3, c428600GrK, animatable);
                }
                InterfaceC902220ZaO interfaceC902220ZaO2 = interfaceC902220ZaO;
                if (interfaceC902220ZaO2 instanceof C0I6G) {
                    if (view3 != null) {
                        ((C0I6G) interfaceC902220ZaO2).LIZ(view3, c1331670kl3.LJJIZ);
                        return;
                    }
                    C1331670kl3 c1331670kl32 = c1331670kl3;
                    ImageView imageView = c1331670kl32.LJJIJ;
                    if (imageView == null) {
                        return;
                    }
                    ((C0I6G) interfaceC902220ZaO2).LIZ(imageView, c1331670kl32.LJJIZ);
                }
            }
        };
        c1331670kl3.LJJJIL = new C21308018a6(str, c869590Y9l, map, 8);
        C1890820zIu.LIZ(c1331670kl3);
        if (z) {
            c1331670kl3.LJIIL(interfaceC427850Gq72);
        } else {
            c1331670kl3.LJIIJ(interfaceC427850Gq72);
        }
    }
}
