package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.ur.camera.ICameraService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0imR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255650imR {
    public static final C01GW<C1910890zpH> LJIIJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(653));
    public final Activity LIZ;
    public final Fragment LIZIZ;
    public final WeakHandler LIZJ;
    public final InterfaceC1254900ilE LIZLLL;
    public int LJ;
    public final InterfaceC1255580imK LJFF;
    public final Resources LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final IComplianceBusinessService LJIIIZ = (IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class);

    public static int LIZLLL(int i) {
        if (i == 0) {
            return 10004;
        }
        if (i == 3) {
            return 10009;
        }
        if (i == 5) {
            return 10011;
        }
        switch (i) {
            case BdTuring.TYPE_ECAF /* 9 */:
                return 10017;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 10018;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 10030;
            default:
                return 10004;
        }
    }

    public final boolean LJ() {
        if (!TextUtils.isEmpty(this.LJII)) {
            return false;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIIZ(2131847054);
        c1389890mGx.LJIIJJI();
        C2344809Gs.LJI(new Exception("SD card is not available"));
        return true;
    }

    public final boolean LJIIIIZZ() {
        if (!TextUtils.isEmpty(this.LJII)) {
            return false;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIIZ(2131847054);
        c1389890mGx.LJIIJJI();
        C2344809Gs.LJI(new Exception("SD card is not available"));
        return true;
    }

    public final void LJIIJ() {
        this.LJFF.LIZLLL(EnumC1255610imN.UPLOAD_PHOTO, true);
        C810650Vr5.LIZ(this.LIZ, "live_image_popup", "album");
        C545570LaV c545570LaV = C545570LaV.LIZ;
        Activity activity = this.LIZ;
        Fragment fragment = this.LIZIZ;
        c545570LaV.getClass();
        C545570LaV.LIZ(activity, fragment, 1, 250, 250, 10020, false, false);
    }

    public final void LJIILL() {
        String[] strArr;
        TokenCert tokenCertWith;
        this.LJFF.LIZ(EnumC1255610imN.UPLOAD_PHOTO);
        C545570LaV.LIZ.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
            tokenCertWith = TokenCert.Companion.with("bpea-edit_avatar_start_gallery_photo_low_version_below_10");
        } else if (i < 33) {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
            tokenCertWith = TokenCert.Companion.with("bpea-edit_avatar_start_gallery_photo_low_version");
        } else if (i < 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
            tokenCertWith = TokenCert.Companion.with("bpea-edit_avatar_start_gallery_photo");
        } else {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
            tokenCertWith = TokenCert.Companion.with("bpea-edit_avatar_start_gallery_photo_split");
        }
        try {
            C19514711Wn.LIZIZ.LIZIZ(this.LIZ, tokenCertWith).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C1266130j3L(this, strArr, 2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJFF.LIZLLL(EnumC1255610imN.UPLOAD_PHOTO, false);
        }
    }

    public final C0VSJ LJFF() {
        if (!C2354709Kn.LJIILLIIL() || !C2354709Kn.LJIIZILJ() || TextUtils.isEmpty("head")) {
            return null;
        }
        File fileX2 = C786410Ut5.x2(this.LIZ);
        if (fileX2 == null) {
            fileX2 = C786410Ut5.W3();
            C1AF0.LIZJ("HeadUploadHelper: cache dir == null");
        }
        C0VSJ c0vsj = new C0VSJ(fileX2, "head");
        C2354709Kn.LJI(c0vsj);
        return c0vsj;
    }

    public final String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJII);
        sbLIZ.append('/');
        sbLIZ.append(this.LJIIIIZZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(int i) {
        if (LJIIIIZZ()) {
            return;
        }
        LJIILJJIL(i);
    }

    public final void LIZJ(InterfaceC1916320zy2 interfaceC1916320zy2) {
        Context context;
        Fragment fragment = this.LIZIZ;
        if (fragment != null && (context = fragment.getContext()) != null) {
            this.LIZIZ.getLifecycle().addObserver(this.LJIIIZ.LJJJJLI(context, 2131833820, "", "", "", interfaceC1916320zy2));
        }
    }

    public final Uri LJII(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            try {
                C0VSJ c0vsj2 = new C0VSJ(this.LJII);
                if (!c0vsj2.exists()) {
                    c0vsj2.mkdirs();
                }
                c0vsj.createNewFile();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return Uri.fromFile(c0vsj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r10) throws java.lang.Throwable {
        /*
            r9 = this;
            X.0imK r1 = r9.LJFF
            X.0imN r0 = X.EnumC1255610imN.UPLOAD_PHOTO
            r3 = 1
            r1.LIZLLL(r0, r3)
            android.app.Activity r0 = r9.LIZ
            java.lang.String r2 = "live_image_popup"
            java.lang.String r1 = "album"
            X.C810650Vr5.LIZ(r0, r2, r1)
            if (r10 == 0) goto L2b
            if (r10 == r3) goto L4e
            r0 = 2
            if (r10 == r0) goto L4b
            r0 = 3
            if (r10 == r0) goto L48
            r0 = 5
            if (r10 == r0) goto L45
            r0 = 6
            if (r10 == r0) goto L42
            r0 = 7
            if (r10 == r0) goto L3f
            r0 = 40
            if (r10 == r0) goto L3c
            switch(r10) {
                case 9: goto L39;
                case 10: goto L36;
                case 11: goto L33;
                default: goto L2b;
            }
        L2b:
            r6 = 10003(0x2713, float:1.4017E-41)
        L2d:
            android.app.Activity r0 = r9.LIZ
            X.C810650Vr5.LIZ(r0, r2, r1)
            goto L51
        L33:
            r6 = 10031(0x272f, float:1.4056E-41)
            goto L2d
        L36:
            r6 = 10019(0x2723, float:1.404E-41)
            goto L2d
        L39:
            r6 = 10016(0x2720, float:1.4035E-41)
            goto L2d
        L3c:
            r6 = 10040(0x2738, float:1.4069E-41)
            goto L2d
        L3f:
            r6 = 10014(0x271e, float:1.4033E-41)
            goto L2d
        L42:
            r6 = 10013(0x271d, float:1.4031E-41)
            goto L2d
        L45:
            r6 = 10010(0x271a, float:1.4027E-41)
            goto L2d
        L48:
            r6 = 10008(0x2718, float:1.4024E-41)
            goto L2d
        L4b:
            r6 = 10007(0x2717, float:1.4023E-41)
            goto L2d
        L4e:
            r6 = 10006(0x2716, float:1.4021E-41)
            goto L2d
        L51:
            X.0LaV r0 = X.C545570LaV.LIZ     // Catch: java.lang.Exception -> L63
            android.app.Activity r1 = r9.LIZ     // Catch: java.lang.Exception -> L63
            androidx.fragment.app.Fragment r2 = r9.LIZIZ     // Catch: java.lang.Exception -> L63
            r4 = 250(0xfa, float:3.5E-43)
            r7 = 0
            r0.getClass()     // Catch: java.lang.Exception -> L63
            r5 = r4
            r8 = r7
            X.C545570LaV.LIZ(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L63
            return
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C2344809Gs.LIZ(r0)
            android.app.Activity r1 = r9.LIZ
            androidx.fragment.app.Fragment r0 = r9.LIZIZ
            X.C2431009fo.LJFF(r6, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255650imR.LJIIIZ(int):void");
    }

    public final void LJIIL(final int i) {
        this.LJFF.LIZ(EnumC1255610imN.TAKE_PHOTO);
        C19514711Wn.LIZIZ.LIZIZ(this.LIZ, TokenCert.Companion.with("bpea-profile_avatar_take_photo")).LIZIZ("android.permission.CAMERA").LIZJ(new InterfaceC19515111Wr() { // from class: X.0imS
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO... c0hwoArr) {
                if (c0hwoArr.length > 0 && c0hwoArr[0].LIZIZ == EnumC442280HVy.GRANTED) {
                    C810650Vr5.LIZ(this.LIZ.LIZ, "live_image_popup", "take_photo");
                    this.LIZ.LJFF.LIZLLL(EnumC1255610imN.TAKE_PHOTO, true);
                    C1255650imR c1255650imR = this.LIZ;
                    int i2 = i;
                    if (c1255650imR.LIZIZ == null) {
                        if (((Boolean) C268260AfI.LIZ.getValue()).booleanValue()) {
                            C1255650imR.LJIIJ.getValue().LJI("HeadUploadHelper", "Use UR camera service");
                            ICameraService iCameraService = (ICameraService) PluggableExtentionKt.pluggableSpi$default(ICameraService.class, false, false, false, 14, null);
                            if (iCameraService != null) {
                                iCameraService.LLZZZZ(c1255650imR.LIZ, C1255650imR.LIZLLL(i2), c1255650imR.LJII(c1255650imR.LJI()));
                            }
                        } else {
                            C1255650imR.LJIIJ.getValue().LJI("HeadUploadHelper", "Use LIVE camera service");
                            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                            if (iLiveOuterService != null) {
                                iLiveOuterService.LLZZZZ(c1255650imR.LIZ, C1255650imR.LIZLLL(i2), c1255650imR.LJII(c1255650imR.LJI()));
                            }
                        }
                        C786410Ut5.ae(0, c1255650imR.LIZ, 0);
                        return;
                    }
                    if (((Boolean) C268260AfI.LIZ.getValue()).booleanValue()) {
                        C1255650imR.LJIIJ.getValue().LJI("HeadUploadHelper", "Use UR camera service");
                        ICameraService iCameraService2 = (ICameraService) PluggableExtentionKt.pluggableSpi$default(ICameraService.class, false, false, false, 14, null);
                        if (iCameraService2 != null) {
                            iCameraService2.b(c1255650imR.LIZIZ, C1255650imR.LIZLLL(i2), c1255650imR.LJII(c1255650imR.LJI()));
                        }
                    } else {
                        C1255650imR.LJIIJ.getValue().LJI("HeadUploadHelper", "Use LIVE camera service");
                        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                        if (iLiveOuterService2 != null) {
                            iLiveOuterService2.b(c1255650imR.LIZIZ, C1255650imR.LIZLLL(i2), c1255650imR.LJII(c1255650imR.LJI()));
                        }
                    }
                    C19EG activity = c1255650imR.LIZIZ.getActivity();
                    if (activity == null) {
                        return;
                    }
                    C786410Ut5.ce(activity, 0, 0);
                    return;
                }
                if (c0hwoArr.length > 0) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startCameraActivity permission failure: ");
                    sbLIZ.append(c0hwoArr[0].LIZIZ);
                    C1720106oR.LJI("HeadUploadHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
                InterfaceC1255580imK interfaceC1255580imK = this.LIZ.LJFF;
                EnumC1255610imN enumC1255610imN = EnumC1255610imN.TAKE_PHOTO;
                interfaceC1255580imK.LIZLLL(enumC1255610imN, false);
                if (!C0VE9.LJIIJ(this.LIZ.LIZ, "android.permission.CAMERA")) {
                    this.LIZ.LJIIJJI(2131850441, 2131828359, enumC1255610imN);
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ.LIZ);
                c1389890mGx.LJIIJ(this.LIZ.LIZ.getString(2131839203));
                c1389890mGx.LJIIJJI();
            }
        });
    }

    public final void LJIILJJIL(final int i) {
        final String[] strArr;
        String str;
        this.LJFF.LIZ(EnumC1255610imN.UPLOAD_PHOTO);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
            str = "bpea-profile_avatar_start_gallery";
        } else if (i2 < 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
            str = "bpea-profile_header_image_download_target_33";
        } else {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
            str = "bpea-profile_avatar_start_gallery_target_33";
        }
        try {
            C19514711Wn.LIZIZ.LIZIZ(this.LIZ, TokenCert.Companion.with(str)).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new InterfaceC19515111Wr() { // from class: X.0imT
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
                
                    if (X.C1255710imX.LIZ(r1, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED", (X.C0HWO[]) java.util.Arrays.copyOf(r8, r8.length)) != false) goto L11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
                
                    if (r9 < 33) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
                
                    if (r0 != false) goto L11;
                 */
                @Override // X.InterfaceC19515111Wr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.C0HWO... r11) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 249
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1255670imT.LIZ(X.0HWO[]):void");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJFF.LIZLLL(EnumC1255610imN.UPLOAD_PHOTO, false);
        }
    }

    public final void LIZ(int i, Activity activity) {
        if (LJIIIIZZ()) {
            return;
        }
        if (activity != null && ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(activity)) {
            C786410Ut5.re(Toast.makeText(activity, activity.getString(2131832497), 0));
        } else {
            LJIIL(i);
        }
    }

    public final void LJIIJJI(int i, int i2, final EnumC1255610imN enumC1255610imN) {
        ContextThemeWrapper contextThemeWrapper;
        final Activity activity = this.LIZ;
        if (activity != null) {
            if (C960203pA.LIZIZ(activity)) {
                contextThemeWrapper = new ContextThemeWrapper(activity, R.style.y0);
            } else {
                contextThemeWrapper = new ContextThemeWrapper(activity, R.style.xm);
            }
            C21566919al c21566919al = new C21566919al(contextThemeWrapper);
            c21566919al.LJFF(i);
            c21566919al.LIZ(i2);
            c21566919al.LJII(R.string.f1_, null, false);
            c21566919al.LJIIJ(2131835118, new DialogInterface.OnClickListener() { // from class: X.0Hfi
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) throws Throwable {
                    int i4;
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("package:");
                        sbLIZ.append(activity.getPackageName());
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                        intent.addFlags(268435456);
                        if (enumC1255610imN == EnumC1255610imN.UPLOAD_PHOTO) {
                            this.getClass();
                            i4 = 20001;
                        } else {
                            this.getClass();
                            i4 = 20002;
                        }
                        Activity activity2 = activity;
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                        C1701330uNH.LIZ(intent, activity2);
                        C2204961BRm.LJIIZILJ(i4, activity2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDi/kqzfRNb7yBVAhTCBZfroCS5OK2zw==", null));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C0W79.LIZLLL(activity);
                    }
                }
            }, false);
            new C21566519ah(c21566919al).LIZLLL();
        }
    }

    public C1255650imR(Activity activity, Fragment fragment, WeakHandler weakHandler, InterfaceC1254900ilE interfaceC1254900ilE, int i, InterfaceC1255580imK interfaceC1255580imK) {
        String path;
        this.LIZ = activity;
        this.LIZIZ = fragment;
        this.LIZJ = weakHandler;
        this.LIZLLL = interfaceC1254900ilE;
        this.LJ = i;
        this.LJFF = interfaceC1255580imK;
        C0VSJ c0vsjLJFF = LJFF();
        if (c0vsjLJFF != null) {
            path = c0vsjLJFF.getPath();
        } else {
            path = "";
        }
        this.LJII = path;
        this.LJIIIIZZ = "head.data";
        this.LJI = activity.getResources();
    }

    public final void LJIILIIL(Uri uri, boolean z, int i, Intent intent, boolean z2, String str) {
        Context context;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        float f;
        Bundle bundle;
        C1255590imL c1255590imL;
        if (uri == null) {
            return;
        }
        Fragment fragment = this.LIZIZ;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = this.LIZ;
        }
        if (context == null) {
            return;
        }
        if (i != 10003 && i != 10004) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i != 10018 && i != 10019) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i != 10030 && i != 10031) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z3 && !z4 && !z5) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (i != 10016 && i != 10017) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z3) {
            i2 = 0;
        } else if (z7) {
            i2 = 32;
        } else if (z4) {
            i2 = 6;
        } else if (z5) {
            i2 = 7;
        } else {
            i2 = -1;
        }
        if (!z6 && !z7 && i != 10009 && i != 10008 && i != 10010 && i != 10011) {
            f = 0.5625f;
        } else {
            f = 1.0f;
        }
        int iLIZJ = (int) C12ES.LIZJ(16.0f, context);
        if (intent == null || (bundle = C786410Ut5.g3(intent, "extras_info")) == null) {
            bundle = new Bundle();
            bundle.putBoolean("is_from_camera", z);
        }
        bundle.putBoolean("is_from_aigc_flow", z2);
        C786410Ut5.LJJJI("path_mode", str, bundle);
        bundle.putInt("avatar_upload_scene", this.LJ);
        InterfaceC1255580imK interfaceC1255580imK = this.LJFF;
        if ((interfaceC1255580imK instanceof C1255590imL) && (c1255590imL = (C1255590imL) interfaceC1255580imK) != null) {
            C786410Ut5.LJJIZ(bundle, "avatar_upload_track_param", c1255590imL.LIZIZ);
        }
        boolean z8 = !C1697810uHb.LJIIJJI(10018, 10019, 10030, 10031).contains(Integer.valueOf(i));
        Fragment fragment2 = this.LIZIZ;
        if (fragment2 == null) {
            C1260090itb.LIZIZ.gotoCropActivity(this.LIZ, uri.toString(), z6, f, iLIZJ, 10002, 250, 250, i2, !z7, bundle, z8);
        } else {
            C1260090itb.LIZIZ.gotoCropActivity(fragment2, uri.toString(), z6, f, iLIZJ, 10002, 250, 250, i2, bundle, z8);
        }
    }
}
