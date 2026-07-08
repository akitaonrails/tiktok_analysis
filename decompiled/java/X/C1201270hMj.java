package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS78S0500000_18;

/* JADX INFO: renamed from: X.0hMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201270hMj {
    public C20515215Pi LIZJ;
    public PageFinder LIZLLL;
    public final String LIZ = "PoiPermissionManager";
    public int LIZIZ = -1;
    public final WeakReference<C1201270hMj> LJ = new WeakReference<>(this);

    public final void LJ() {
        C20515215Pi c20515215Pi = this.LIZJ;
        if (c20515215Pi != null) {
            c20515215Pi.LIZIZ();
        }
        this.LIZJ = null;
        this.LIZIZ = -1;
        this.LIZLLL = null;
    }

    public static C1207520hWo LIZ(C1185410gx9 c1185410gx9, boolean z) {
        String str;
        String enterFrom;
        if (z) {
            str = "click_show";
        } else {
            str = "direct_show";
        }
        if (c1185410gx9 != null) {
            enterFrom = c1185410gx9.getEnterFrom();
        } else {
            enterFrom = null;
        }
        return new C1207520hWo("poi_detail", str, null, enterFrom, false, false, null, null, null, 500);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment r15, int r16, final X.C1185410gx9 r17) {
        /*
            r14 = this;
            com.bytedance.bpea.cert.token.TokenCert r7 = X.C1195930hE7.LIZ()
            X.0ip6 r0 = X.C1257300ip6.LIZ
            r6 = r15
            android.content.Context r2 = r6.getContext()
            r0.getClass()
            X.0hMy r0 = X.C1201420hMy.LIZIZ
            boolean r0 = r0.LIZIZ()
            r13 = 0
            if (r0 != 0) goto L86
            boolean r0 = X.C300190Bph.LIZ()
            if (r0 == 0) goto L71
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS> r8 = com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS.class
            r9 = 0
            r12 = 14
            r10 = r9
            r11 = r9
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS r1 = (com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS) r1
            if (r1 == 0) goto L6f
            java.lang.String r0 = "poi_detail"
            X.0hTV r1 = r1.LIZ(r2, r7, r0)
        L32:
            X.0hTV r0 = X.EnumC1205470hTV.SUCCESS
            if (r1 != r0) goto L86
        L36:
            r2 = 1
        L37:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestGPSPermission canShowPopup:"
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            r8 = r17
            r4 = r14
            if (r2 == 0) goto L88
            X.19EG r5 = r6.getActivity()
            if (r5 == 0) goto L6e
            boolean r0 = r6.isDetached()
            if (r0 != 0) goto L6e
            X.1AzA r2 = X.C2197301AzA.LIZ
            X.0gzv r1 = new X.0gzv
            X.0P0C r0 = new X.0P0C
            r0.<init>()
            X.0h7z r3 = new X.0h7z
            r3.<init>()
            r1.<init>(r0, r3)
            r2.getClass()
            X.C2197301AzA.LIZLLL(r6, r1, r13)
        L6e:
            return
        L6f:
            r1 = r13
            goto L32
        L71:
            X.0hH4 r0 = X.C1197760hH4.LIZ
            r0.getClass()
            boolean r0 = X.C1197760hH4.LIZ()
            if (r0 == 0) goto L36
            X.0hWW r0 = X.C1207340hWW.LIZ
            r0.getClass()
            boolean r2 = X.C1207340hWW.LJIIIZ(r7)
            goto L37
        L86:
            r2 = 0
            goto L37
        L88:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT> r0 = com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT r0 = (com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT) r0
            boolean r0 = r0.LJIILJJIL()
            if (r0 == 0) goto Lad
            com.bytedance.bpea.cert.token.TokenCert$Companion r1 = com.bytedance.bpea.cert.token.TokenCert.Companion
            java.lang.String r0 = "bpea-poi_detail_float_notice_auto_for_precise"
            com.bytedance.bpea.cert.token.TokenCert r3 = r1.with(r0)
        La2:
            X.0hMo r5 = X.EnumC1201320hMo.GPS
            r2 = r16
            r0 = r4
            r1 = r6
            r4 = r8
            r0.LJFF(r1, r2, r3, r4, r5)
            return
        Lad:
            com.bytedance.bpea.cert.token.TokenCert$Companion r1 = com.bytedance.bpea.cert.token.TokenCert.Companion
            java.lang.String r0 = "bpea-poi_detail_float_notice_auto"
            com.bytedance.bpea.cert.token.TokenCert r3 = r1.with(r0)
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201270hMj.LIZIZ(com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment, int, X.0gx9):void");
    }

    public final void LIZLLL(final PoiDetailSlashFragment poiDetailSlashFragment, int i, final C1185410gx9 c1185410gx9) {
        EnumC1205470hTV enumC1205470hTVLIZIZ;
        final C19EG activity = poiDetailSlashFragment.getActivity();
        if ((activity instanceof Activity) && activity != null) {
            boolean zLJIILL = false;
            final TokenCert tokenCertLIZIZ = C1195930hE7.LIZIZ(false);
            if (C300190Bph.LIZ()) {
                ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                if (iLocationServiceForLS != null) {
                    enumC1205470hTVLIZIZ = iLocationServiceForLS.LIZIZ(activity, tokenCertLIZIZ);
                } else {
                    enumC1205470hTVLIZIZ = null;
                }
                if (enumC1205470hTVLIZIZ == EnumC1205470hTV.SUCCESS) {
                    zLJIILL = true;
                }
            } else {
                C1197760hH4.LIZ.getClass();
                if (!C1197760hH4.LIZIZ(activity)) {
                    return;
                }
                C1207340hWW.LIZ.getClass();
                zLJIILL = C1207340hWW.LIZLLL().LJIILL(tokenCertLIZIZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestPromotePreciseGPSPermission needPromoteWithAutoCert:");
            sbLIZ.append(zLJIILL);
            C2188811AlT.LIZIZ(sbLIZ);
            if (zLJIILL) {
                C2197301AzA c2197301AzA = C2197301AzA.LIZ;
                C1187130gzv c1187130gzv = new C1187130gzv(new InterfaceC20660615sy() { // from class: X.0P0B
                    @Override // X.InterfaceC20660615sy
                    public final boolean t2() {
                        return true;
                    }

                    @Override // X.InterfaceC20658015sY
                    public final boolean Xu() {
                        return poiDetailSlashFragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
                    }

                    @Override // X.InterfaceC20658015sY
                    public final C688120Qyw i2() {
                        return new C688120Qyw(activity, poiDetailSlashFragment, null);
                    }

                    @Override // X.InterfaceC20658015sY
                    public final String getSceneId() {
                        return C634060Otw.LIZ(this);
                    }
                }, new InterfaceC1187150gzx() { // from class: X.0h38
                    @Override // X.InterfaceC1187150gzx
                    public final void LIZ(C20656615sK c20656615sK) {
                        C1201270hMj c1201270hMj = this.LIZ;
                        Activity activity2 = activity;
                        Fragment fragment = poiDetailSlashFragment;
                        TokenCert tokenCert = tokenCertLIZIZ;
                        C1185410gx9 c1185410gx92 = c1185410gx9;
                        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                        if (iLocationBaseServiceForMT != null) {
                            iLocationBaseServiceForMT.LJIL(activity2, fragment, tokenCert, C1201270hMj.LIZ(c1185410gx92, false), new InterfaceC1207170hWF(c1201270hMj.LJ) { // from class: X.0h37
                                public final WeakReference<C1201270hMj> LIZ;

                                @Override // X.InterfaceC1207170hWF
                                public final void LIZ(C1208240hXy c1208240hXy) {
                                }

                                {
                                    this.LIZ = weakReference;
                                }

                                @Override // X.InterfaceC1207170hWF
                                public final void LIZIZ(C1208000hXa c1208000hXa) {
                                    if (this.LIZ.get() != null) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("requestPromotePreciseGPSPermission resultType:");
                                        sbLIZ2.append(c1208000hXa.LIZ);
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                    }
                                }
                            });
                        }
                        c20656615sK.LIZ();
                    }
                });
                c2197301AzA.getClass();
                C2197301AzA.LIZLLL(poiDetailSlashFragment, c1187130gzv, null);
                return;
            }
            LJFF(poiDetailSlashFragment, i, C1195930hE7.LIZIZ(true), c1185410gx9, EnumC1201320hMo.PROMOTE_PRECISE_GPS);
        }
    }

    public final void LJFF(PoiDetailSlashFragment poiDetailSlashFragment, int i, TokenCert tokenCert, C1185410gx9 c1185410gx9, EnumC1201320hMo enumC1201320hMo) {
        SpannableString spannableString;
        AbstractC1201400hMw abstractC1201400hMw;
        C1201380hMu c1201380hMu;
        String strLIZJ;
        int i2;
        String string;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryRequestPermissionWithFloatNotice floatNoticeType:");
        sbLIZ.append(enumC1201320hMo);
        C2188811AlT.LIZIZ(sbLIZ);
        C1257300ip6 c1257300ip6 = C1257300ip6.LIZ;
        Context context = poiDetailSlashFragment.getContext();
        c1257300ip6.getClass();
        int i3 = C1201340hMq.LIZ[enumC1201320hMo.ordinal()];
        EnumC1205470hTV enumC1205470hTVLIZ = null;
        if (i3 != 1) {
            if (i3 == 2) {
                try {
                    C1201350hMr c1201350hMr = C1201350hMr.LIZIZ;
                    if (!c1201350hMr.LIZIZ()) {
                        if (C300190Bph.LIZ()) {
                            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                            if (iLocationServiceForLS != null) {
                                enumC1205470hTVLIZ = iLocationServiceForLS.LIZIZ(context, tokenCert);
                            }
                            if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                                return;
                            }
                        } else if (!c1201350hMr.LIZIZ()) {
                            C1207340hWW.LIZ.getClass();
                            if (!C1207340hWW.LJIIJ(tokenCert)) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("needShowPromotePreciseFloatNotice return false, reason: isPopupEnabled false, cert:");
                                sbLIZ2.append(tokenCert);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                C1201260hMi.LIZ.LIZJ("request_location_config_unable", null);
                                return;
                            }
                            C1201390hMv c1201390hMvLIZ = C1201370hMt.LIZ();
                            if (c1201390hMvLIZ.LIZ == null || c1201390hMvLIZ.LIZIZ == null || c1201390hMvLIZ.LIZJ == null) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            } else {
                throw new C1954807lC();
            }
        } else if (C1201430hMz.LIZIZ().showFloatNotice && !C1201360hMs.LIZIZ.LIZIZ()) {
            if (C300190Bph.LIZ()) {
                ILocationServiceForLS iLocationServiceForLS2 = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                if (iLocationServiceForLS2 != null) {
                    enumC1205470hTVLIZ = iLocationServiceForLS2.LIZ(context, tokenCert, "poi_detail");
                }
                if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                    return;
                }
            } else {
                C1207340hWW.LIZ.getClass();
                if (!C1207340hWW.LJI("poi", "poi_detail_float_notice")) {
                    C1201260hMi.LIZ.LIZJ("request_location_config_unable", null);
                    return;
                }
            }
        } else {
            return;
        }
        int i4 = this.LIZIZ;
        if (i4 != -1 && i > i4) {
            LJ();
            return;
        }
        this.LIZIZ = i;
        C20515215Pi c20515215Pi = new C20515215Pi(poiDetailSlashFragment);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_location_north_east;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c20515215Pi.LJFF(c419910GdJ);
        C1257300ip6 c1257300ip62 = C1257300ip6.LIZ;
        Context context2 = poiDetailSlashFragment.getContext();
        AwS78S0500000_18 awS78S0500000_18 = new AwS78S0500000_18(enumC1201320hMo, this, poiDetailSlashFragment, tokenCert, c1185410gx9, 3);
        c1257300ip62.getClass();
        try {
            int[] iArr = C1201340hMq.LIZ;
            int i5 = iArr[enumC1201320hMo.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    if (context2 == null || (strLIZJ = context2.getString(2131857093)) == null) {
                        strLIZJ = "";
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                strLIZJ = C1201430hMz.LIZJ(context2, C1201430hMz.LIZIZ().starlingKey.floatNoticeStarlingKey);
            }
            if (iArr[enumC1201320hMo.ordinal()] == 1) {
                i2 = 2131836184;
            } else {
                i2 = 2131857094;
            }
            if (context2 == null || (string = context2.getString(i2)) == null) {
                string = "";
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZJ);
            sbLIZ3.append(' ');
            sbLIZ3.append(string);
            spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ3));
            int length = strLIZJ.length() + 1;
            int length2 = spannableString.length();
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(-65536), length, length2, 33);
            C786410Ut5.p2(spannableString, new StyleSpan(1), length, length2, 33);
            C786410Ut5.p2(spannableString, new C1208610hYZ(awS78S0500000_18, 1), length, length2, 33);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX.getClass();
            String string2 = null;
            C1205490hTX.LIZLLL(c1emr, "get_float_notice_message", null, e2);
            if (context2 != null) {
                string2 = context2.getString(2131836188);
            }
            spannableString = new SpannableString(string2);
        }
        c20515215Pi.LIZ.LJFF = spannableString;
        C1257300ip6 c1257300ip63 = C1257300ip6.LIZ;
        Context context3 = poiDetailSlashFragment.getContext();
        c1257300ip63.getClass();
        int iLIZ = C1257300ip6.LIZ(context3) + i;
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJIIIZ = iLIZ;
        c1057450dcl.LIZJ = false;
        this.LIZJ = c20515215Pi;
        c20515215Pi.LIZ.LJIILJJIL = new AwS384S0200000_18(this, enumC1201320hMo, 276);
        C20515215Pi c20515215Pi2 = this.LIZJ;
        if (c20515215Pi2 != null) {
            c20515215Pi2.LIZLLL();
        }
        if (enumC1201320hMo == EnumC1201320hMo.GPS) {
            abstractC1201400hMw = C1201360hMs.LIZIZ;
        } else {
            abstractC1201400hMw = C1201350hMr.LIZIZ;
        }
        abstractC1201400hMw.getClass();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string3 = abstractC1201400hMw.LIZ.getString(abstractC1201400hMw.LIZLLL(), "");
            if (string3 != null && string3.length() != 0) {
                Object objLIZ = C1058250de3.LIZ(string3, C1201380hMu.class);
                C1201380hMu c1201380hMu2 = (C1201380hMu) objLIZ;
                c1201380hMu2.LIZ = jCurrentTimeMillis;
                c1201380hMu2.LIZJ++;
                c1201380hMu = (C1201380hMu) objLIZ;
            } else {
                c1201380hMu = new C1201380hMu(1, jCurrentTimeMillis, 6);
            }
            abstractC1201400hMw.LIZ.storeString(abstractC1201400hMw.LIZLLL(), C1058250de3.LIZLLL(c1201380hMu));
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C1205490hTX c1205490hTX2 = C1205490hTX.LIZ;
            C1EMR c1emr2 = C1EMR.POI_DETAIL_LOCATION;
            c1205490hTX2.getClass();
            C1205490hTX.LIZLLL(c1emr2, "float_notice_store_show_frequency", null, e3);
        }
        C1201280hMk.LIZ(enumC1201320hMo, EnumC1201300hMm.SHOW, this.LIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.content.Context r22, androidx.fragment.app.Fragment r23, java.lang.String r24, final java.lang.String r25, com.bytedance.bpea.cert.token.TokenCert r26, X.C1185410gx9 r27) {
        /*
            r21 = this;
            if (r22 == 0) goto Lb9
            X.19EG r17 = X.C1388190mED.LIZIZ(r22)
            if (r17 == 0) goto Lb9
            r16 = r26
            java.lang.String r2 = r16.getToken()
            java.lang.String r0 = "anchor"
            r1 = r25
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lad
            com.ss.android.ugc.tiktok.location_api.service.experiment.PoiDetailGPSConfigModel r0 = X.C1201430hMz.LIZIZ()
            java.util.List<java.lang.String> r0 = r0.openSettingsCertTokenList
            boolean r0 = X.C13LP.LJJJJ(r2, r0)
            if (r0 == 0) goto Laa
            com.ss.android.ugc.tiktok.location_api.service.experiment.PoiDetailGPSConfigModel r0 = X.C1201430hMz.LIZIZ()
            java.util.List<java.lang.String> r0 = r0.prePopupCertTokenList
            boolean r0 = X.C13LP.LJJJJ(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto Laa
        L32:
            java.lang.String r7 = ""
        L34:
            r8 = 0
            if (r27 == 0) goto La8
            java.lang.String r9 = r27.getEnterFrom()
            java.lang.String r3 = r27.getPoiId()
            if (r3 == 0) goto L52
            int r0 = r3.length()
            if (r0 <= 0) goto L52
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "cur_page_id"
            r2.<init>(r0, r3)
            java.util.Map r8 = X.C2097908Jt.LIZJ(r2)
        L52:
            X.0hWo r5 = new X.0hWo
            java.lang.String r6 = "poi_detail"
            r10 = 0
            r12 = 0
            r15 = 496(0x1f0, float:6.95E-43)
            r11 = r10
            r13 = r12
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r14 = r24
            r2.append(r14)
            r0 = 43
            r2.append(r0)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r16.certToken()
            r2.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r2)
            X.0hMi r3 = X.C1201260hMi.LIZ
            r3.getClass()
            kotlin.jvm.internal.AwS5S1010000_18 r2 = new kotlin.jvm.internal.AwS5S1010000_18
            r0 = 2
            r2.<init>(r4, r0)
            java.lang.String r0 = "request_location_permission"
            r3.LIZJ(r0, r2)
            X.0hWh r3 = X.C1207450hWh.LIZ
            X.0hMh r2 = new X.0hMh
            r0 = r21
            java.lang.ref.WeakReference<X.0hMj> r0 = r0.LJ
            r2.<init>(r0, r1, r4)
            r3.getClass()
            r18 = r23
            r15 = r1
            r19 = r5
            r20 = r2
            X.C1207450hWh.LJJIFFI(r14, r15, r16, r17, r18, r19, r20)
            return
        La8:
            r9 = r8
            goto L52
        Laa:
            java.lang.String r7 = "click_pre_popup"
            goto L34
        Lad:
            java.lang.String r0 = "poi_detail_float_notice"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L32
            java.lang.String r7 = "click_banner"
            goto L34
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201270hMj.LIZJ(android.content.Context, androidx.fragment.app.Fragment, java.lang.String, java.lang.String, com.bytedance.bpea.cert.token.TokenCert, X.0gx9):void");
    }
}
