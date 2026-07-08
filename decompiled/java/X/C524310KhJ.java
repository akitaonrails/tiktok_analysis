package X;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSupportTab;
import com.ss.android.ugc.aweme.shortvideo.album.internal.AlbumOpenApiSessionData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524310KhJ {
    public final String LIZ;
    public final C523970Kgl LIZIZ;
    public final Bundle LIZJ;

    public final void LIZ(C19EG c19eg, InterfaceC524330KhL interfaceC524330KhL) {
        C786410Ut5.LJJIJL(this.LIZJ, "_album_open_api_session_data", new AlbumOpenApiSessionData(this.LIZ, interfaceC524330KhL.getKey()));
        this.LIZJ.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        if (interfaceC524330KhL instanceof C524320KhK) {
            C1660680tJi.LIZ().LIZJ(c19eg, this.LIZJ, -1, ((C524320KhK) interfaceC524330KhL).LIZ);
        } else {
            if (Intrinsics.LJFF(interfaceC524330KhL, C524340KhM.LIZ)) {
                String str = MvChoosePhotoActivity._pnsPageId;
                C0MWH.LIZLLL(c19eg, this.LIZJ, -1, null);
                return;
            }
            throw new C1954807lC();
        }
    }

    public final void LIZIZ(final C19EG c19eg, C524320KhK c524320KhK) {
        final C0L91 c0l91;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        final boolean zLJI = true;
        if (creativeToolsPluginService != null) {
            if (creativeToolsPluginService.LIZJ(c19eg, "album_openapi_" + this.LIZ, this.LIZIZ.LJII.showPluginUnreadyTips)) {
                AlbumSupportTab albumSupportTab = this.LIZIZ.LIZJ.supportMediaTab;
                AlbumSupportTab.Companion.getClass();
                if (!albumSupportTab.LIZ(AlbumSupportTab.VIDEO)) {
                    c0l91 = C0L91.IMAGE;
                } else if (!albumSupportTab.LIZ(AlbumSupportTab.PHOTO) && !albumSupportTab.LIZ(AlbumSupportTab.LIVE_PHOTO)) {
                    c0l91 = C0L91.VIDEO;
                } else {
                    c0l91 = C0L91.IMAGE_AND_VIDEO;
                }
                C0LGY c0lgy = C0LGY.LIZ;
                c0lgy.getClass();
                if (!C0LGY.LIZIZ(c0l91)) {
                    C523970Kgl c523970Kgl = this.LIZIZ;
                    if (!c523970Kgl.LIZJ.enableSystemAlbum) {
                        C524120Kh0 c524120Kh0 = C524120Kh0.LIZ;
                        final AlbumEventTrackingConfig albumEventTrackingConfig = c523970Kgl.LJ;
                        final AwS252S0300000_8 awS252S0300000_8 = new AwS252S0300000_8(this, c19eg, c524320KhK, 9);
                        final AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(407);
                        final AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(408);
                        c524120Kh0.getClass();
                        C523800KgU c523800KgU = new C523800KgU();
                        c523800KgU.LIZ = "bpea-tools_request_storage_permission_manual_click_upload_target34";
                        c523800KgU.LIZIZ = "bpea-tools_request_storage_permission_manual_click_upload_target33";
                        c523800KgU.LIZJ = "bpea-tools_request_storage_permission_manual_click_upload";
                        TokenCert tokenCertLIZ = c523800KgU.LIZ().LIZ();
                        if (Build.VERSION.SDK_INT >= 33) {
                            int i = C524390KhR.LIZ[c0l91.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        C19741112Lp.LIZ.getClass();
                                        if (!C19741112Lp.LJI(c19eg, "android.permission.READ_MEDIA_IMAGES", false) && !C19741112Lp.LJI(c19eg, "android.permission.READ_MEDIA_VIDEO", false)) {
                                            zLJI = false;
                                            C524120Kh0.LIZ("asking_permission_show", albumEventTrackingConfig, AFwS239S0000000_8.get$arr$(271));
                                        }
                                        InterfaceC540100LGe interfaceC540100LGe = new InterfaceC540100LGe() { // from class: X.0L5g
                                            @Override // X.InterfaceC540100LGe
                                            public final void LIZ(int[] iArr, String[] strArr) {
                                                if (!zLJI) {
                                                    C524120Kh0 c524120Kh02 = C524120Kh0.LIZ;
                                                    AlbumEventTrackingConfig albumEventTrackingConfig2 = albumEventTrackingConfig;
                                                    AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(272);
                                                    c524120Kh02.getClass();
                                                    C524120Kh0.LIZ("asking_permission_action", albumEventTrackingConfig2, aFwS239S0000000_8);
                                                }
                                                aFwS194S0000000_8.invoke();
                                                C524120Kh0 c524120Kh03 = C524120Kh0.LIZ;
                                                C19EG c19eg2 = c19eg;
                                                AlbumEventTrackingConfig albumEventTrackingConfig3 = albumEventTrackingConfig;
                                                Function0<Unit> function0 = aFwS194S0000000_82;
                                                c524120Kh03.getClass();
                                                C524120Kh0.LIZ("go_to_settings_show", albumEventTrackingConfig3, AFwS239S0000000_8.get$arr$(271));
                                                C1397580mTM c1397580mTM = new C1397580mTM(c19eg2);
                                                c1397580mTM.LJFF(2131849191);
                                                c1397580mTM.LIZ(2131849190);
                                                c1397580mTM.LJII = true;
                                                C985403tE.LIZ(c1397580mTM, new AwS374S0200000_8(albumEventTrackingConfig3, c19eg2, 170));
                                                AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg2, c1397580mTM);
                                                autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(function0, (Function0<Unit>) 615);
                                                autoDismissPermissionDialog.LIZ();
                                            }
                                        };
                                        C0LGZ c0lgz = new C0LGZ() { // from class: X.0KhN
                                            /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
                                            /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
                                            @Override // X.C0LGZ
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final void LIZ(X.C0L9U r6, java.lang.String[] r7, int[] r8) {
                                                /*
                                                    r5 = this;
                                                    boolean r0 = r1
                                                    if (r0 != 0) goto L3f
                                                    X.0LGY r0 = X.C0LGY.LIZ
                                                    X.0L91 r2 = r2
                                                    r0.getClass()
                                                    int r1 = android.os.Build.VERSION.SDK_INT
                                                    r0 = 34
                                                    if (r1 < r0) goto L63
                                                    int[] r1 = X.C524390KhR.LIZ
                                                    int r0 = r2.ordinal()
                                                    r2 = r1[r0]
                                                    java.lang.String r1 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
                                                    r0 = 1
                                                    if (r2 == r0) goto L54
                                                    r0 = 2
                                                    if (r2 == r0) goto L45
                                                    r0 = 3
                                                    if (r2 != r0) goto L66
                                                    boolean r0 = X.C0LGY.LJI()
                                                    if (r0 == 0) goto L63
                                                L2a:
                                                    java.lang.String r4 = "select_photos"
                                                L2c:
                                                    X.0Kh0 r3 = X.C524120Kh0.LIZ
                                                    com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig r2 = r3
                                                    kotlin.jvm.internal.AwS59S1000000_8 r1 = new kotlin.jvm.internal.AwS59S1000000_8
                                                    r0 = 15
                                                    r1.<init>(r4, r0)
                                                    r3.getClass()
                                                    java.lang.String r0 = "asking_permission_action"
                                                    X.C524120Kh0.LIZ(r0, r2, r1)
                                                L3f:
                                                    kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r4
                                                    r0.invoke()
                                                    return
                                                L45:
                                                    boolean r0 = X.C0LGY.LIZLLL(r1)
                                                    if (r0 == 0) goto L63
                                                    java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
                                                    boolean r0 = X.C0LGY.LIZLLL(r0)
                                                    if (r0 != 0) goto L63
                                                    goto L2a
                                                L54:
                                                    boolean r0 = X.C0LGY.LIZLLL(r1)
                                                    if (r0 == 0) goto L63
                                                    java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
                                                    boolean r0 = X.C0LGY.LIZLLL(r0)
                                                    if (r0 != 0) goto L63
                                                    goto L2a
                                                L63:
                                                    java.lang.String r4 = "access_to_all_photo"
                                                    goto L2c
                                                L66:
                                                    X.07lC r0 = new X.07lC
                                                    r0.<init>()
                                                    throw r0
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C524350KhN.LIZ(X.0L9U, java.lang.String[], int[]):void");
                                            }
                                        };
                                        c0lgy.getClass();
                                        C0LGY.LJIIJ(c19eg, tokenCertLIZ, c0l91, interfaceC540100LGe, c0lgz);
                                        return;
                                    }
                                    throw new C1954807lC();
                                }
                                C19741112Lp.LIZ.getClass();
                                zLJI = C19741112Lp.LJI(c19eg, "android.permission.READ_MEDIA_VIDEO", false);
                            } else {
                                C19741112Lp.LIZ.getClass();
                                zLJI = C19741112Lp.LJI(c19eg, "android.permission.READ_MEDIA_IMAGES", false);
                            }
                        } else {
                            C19741112Lp.LIZ.getClass();
                            zLJI = C19741112Lp.LJI(c19eg, "android.permission.READ_EXTERNAL_STORAGE", false);
                        }
                        if (!zLJI) {
                            C524120Kh0.LIZ("asking_permission_show", albumEventTrackingConfig, AFwS239S0000000_8.get$arr$(271));
                        }
                        InterfaceC540100LGe interfaceC540100LGe2 = new InterfaceC540100LGe() { // from class: X.0L5g
                            @Override // X.InterfaceC540100LGe
                            public final void LIZ(int[] iArr, String[] strArr) {
                                if (!zLJI) {
                                    C524120Kh0 c524120Kh02 = C524120Kh0.LIZ;
                                    AlbumEventTrackingConfig albumEventTrackingConfig2 = albumEventTrackingConfig;
                                    AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(272);
                                    c524120Kh02.getClass();
                                    C524120Kh0.LIZ("asking_permission_action", albumEventTrackingConfig2, aFwS239S0000000_8);
                                }
                                aFwS194S0000000_8.invoke();
                                C524120Kh0 c524120Kh03 = C524120Kh0.LIZ;
                                C19EG c19eg2 = c19eg;
                                AlbumEventTrackingConfig albumEventTrackingConfig3 = albumEventTrackingConfig;
                                Function0<Unit> function0 = aFwS194S0000000_82;
                                c524120Kh03.getClass();
                                C524120Kh0.LIZ("go_to_settings_show", albumEventTrackingConfig3, AFwS239S0000000_8.get$arr$(271));
                                C1397580mTM c1397580mTM = new C1397580mTM(c19eg2);
                                c1397580mTM.LJFF(2131849191);
                                c1397580mTM.LIZ(2131849190);
                                c1397580mTM.LJII = true;
                                C985403tE.LIZ(c1397580mTM, new AwS374S0200000_8(albumEventTrackingConfig3, c19eg2, 170));
                                AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg2, c1397580mTM);
                                autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(function0, (Function0<Unit>) 615);
                                autoDismissPermissionDialog.LIZ();
                            }
                        };
                        C0LGZ c0lgz2 = new C0LGZ() { // from class: X.0KhN
                            @Override // X.C0LGZ
                            public final void LIZ(C0L9U v, String[] v2, int[] v3) {
                                /*
                                    this = this;
                                    boolean r0 = r1
                                    if (r0 != 0) goto L3f
                                    X.0LGY r0 = X.C0LGY.LIZ
                                    X.0L91 r2 = r2
                                    r0.getClass()
                                    int r1 = android.os.Build.VERSION.SDK_INT
                                    r0 = 34
                                    if (r1 < r0) goto L63
                                    int[] r1 = X.C524390KhR.LIZ
                                    int r0 = r2.ordinal()
                                    r2 = r1[r0]
                                    java.lang.String r1 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"
                                    r0 = 1
                                    if (r2 == r0) goto L54
                                    r0 = 2
                                    if (r2 == r0) goto L45
                                    r0 = 3
                                    if (r2 != r0) goto L66
                                    boolean r0 = X.C0LGY.LJI()
                                    if (r0 == 0) goto L63
                                L2a:
                                    java.lang.String r4 = "select_photos"
                                L2c:
                                    X.0Kh0 r3 = X.C524120Kh0.LIZ
                                    com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumEventTrackingConfig r2 = r3
                                    kotlin.jvm.internal.AwS59S1000000_8 r1 = new kotlin.jvm.internal.AwS59S1000000_8
                                    r0 = 15
                                    r1.<init>(r4, r0)
                                    r3.getClass()
                                    java.lang.String r0 = "asking_permission_action"
                                    X.C524120Kh0.LIZ(r0, r2, r1)
                                L3f:
                                    kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r4
                                    r0.invoke()
                                    return
                                L45:
                                    boolean r0 = X.C0LGY.LIZLLL(r1)
                                    if (r0 == 0) goto L63
                                    java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
                                    boolean r0 = X.C0LGY.LIZLLL(r0)
                                    if (r0 != 0) goto L63
                                    goto L2a
                                L54:
                                    boolean r0 = X.C0LGY.LIZLLL(r1)
                                    if (r0 == 0) goto L63
                                    java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
                                    boolean r0 = X.C0LGY.LIZLLL(r0)
                                    if (r0 != 0) goto L63
                                    goto L2a
                                L63:
                                    java.lang.String r4 = "access_to_all_photo"
                                    goto L2c
                                L66:
                                    X.07lC r0 = new X.07lC
                                    r0.<init>()
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C524350KhN.LIZ(X.0L9U, java.lang.String[], int[]):void");
                            }
                        };
                        c0lgy.getClass();
                        C0LGY.LJIIJ(c19eg, tokenCertLIZ, c0l91, interfaceC540100LGe2, c0lgz2);
                        return;
                    }
                }
                LIZ(c19eg, c524320KhK);
            }
        }
    }

    public C524310KhJ(String str, C523970Kgl c523970Kgl, Bundle bundle) {
        this.LIZ = str;
        this.LIZIZ = c523970Kgl;
        this.LIZJ = bundle;
    }
}
