package X;

import Y.AObjectS373S0100000_30;
import android.app.Activity;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCameraSetting;
import com.bytedance.android.livesdk.utils.crop.CropFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.147l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202139147l implements InterfaceC773010UTz {
    public static SimpleDateFormat LJIJ;
    public boolean LIZ;
    public final Activity LIZIZ;
    public final Resources LIZJ;
    public final Fragment LIZLLL;
    public final String LJFF;
    public String LJI;
    public final InterfaceC202141147n LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILJJIL;
    public DialogC780480UjW LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final Map<String, String> LJIILIIL = new HashMap();
    public final String LJ = C08P1.LIZ();

    public final void LIZ() {
        DialogC780480UjW dialogC780480UjW = this.LJIILL;
        if (dialogC780480UjW != null) {
            dialogC780480UjW.dismiss();
            C785410UrT.LIZ(dialogC780480UjW);
        }
    }

    public final void LJIIIIZZ() {
        if (this.LIZIZ == null) {
            return;
        }
        this.LJI = String.valueOf(System.currentTimeMillis());
        String[] strArr = {this.LIZJ.getString(2131844045), this.LIZJ.getString(2131844046), this.LIZJ.getString(2131844044)};
        C21560119Zf c21560119Zf = new C21560119Zf(this.LIZIZ);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.147m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C202139147l c202139147l = this.LL;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            c202139147l.getClass();
                            return;
                        }
                        InterfaceC202141147n interfaceC202141147n = c202139147l.LJII;
                        if (interfaceC202141147n == null) {
                            return;
                        }
                        interfaceC202141147n.onCanceled();
                        return;
                    }
                    C202139147l.LJIIJ(1.0f, c202139147l.LIZIZ, c202139147l.LIZLLL, Boolean.valueOf(c202139147l.LIZ), Boolean.valueOf(c202139147l.LJIIZILJ), c202139147l.LJ, c202139147l.LIZIZ());
                    return;
                }
                C202139147l.LJIILIIL(c202139147l.LIZIZ, c202139147l.LIZLLL);
            }
        };
        C21560219Zg c21560219Zg = c21560119Zf.LIZ;
        c21560219Zg.LJIILLIIL = strArr;
        c21560219Zg.LJIJ = onClickListener;
        c21560219Zg.LJIIL = true;
        C786410Ut5.D4(c21560119Zf.LIZ());
    }

    public final void LJIIIZ() {
        Activity activity = this.LIZIZ;
        if (activity == null) {
            return;
        }
        if (this.LJIILL == null) {
            C780470UjV c780470UjV = new C780470UjV(activity);
            c780470UjV.LIZIZ = activity.getString(2131853534);
            c780470UjV.LIZJ = true;
            this.LJIILL = c780470UjV.LIZ();
        }
        if (this.LJIILL.isShowing()) {
            return;
        }
        C786410Ut5.B4(this.LJIILL);
    }

    public final void LJIIJJI() {
        int i;
        if (this.LJIILLIIL || this.LJIIZILJ) {
            ((HashMap) this.LJIILIIL).put(this.LJI, String.valueOf(System.currentTimeMillis()));
            C202142147o.LIZ = new AObjectS373S0100000_30(this, 7);
        }
        this.LIZ = true;
        int i2 = this.LJIIIIZZ;
        float f = 1.0f;
        if (i2 > 0 && (i = this.LJIIIZ) > 0) {
            f = i2 / (i * 1.0f);
        }
        LJIIJ(f, this.LIZIZ, this.LIZLLL, Boolean.valueOf(this.LJIILLIIL), Boolean.valueOf(this.LJIIZILJ), this.LJ, LIZIZ());
    }

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJFF);
        sbLIZ2.append("_");
        sbLIZ2.append(this.LJI);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(".jpeg");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Uri LIZJ() {
        String strLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJ);
        sbLIZ.append("/");
        sbLIZ.append(strLIZIZ);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            try {
                C0VSJ c0vsj2 = new C0VSJ(this.LJ);
                if (!c0vsj2.exists()) {
                    c0vsj2.mkdirs();
                }
                c0vsj.createNewFile();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        Activity activity = this.LIZIZ;
        if (activity == null) {
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZIZ.getPackageName());
        sbLIZ2.append(".ttlive_provider");
        return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(activity, C2188811AlT.LIZIZ(sbLIZ2), c0vsj);
    }

    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJFF);
        sbLIZ.append("_");
        sbLIZ.append(this.LJI);
        sbLIZ.append(this.LJIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(android.net.Uri r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202139147l.LJIIL(android.net.Uri):void");
    }

    public static boolean LJI(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void LJIILIIL(final Activity activity, final Fragment fragment) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        } else if (i < 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
        } else {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        }
        new C0UT9(activity, TokenCert.with("bpea-start_gallery_activity")).LIZ(new C142V() { // from class: X.13zM
            public final /* synthetic */ int LIZJ = 4000300;

            @Override // X.C142V
            public final void LIZ(String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LIZIZ(String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LIZLLL(String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LJ(String str, String... strArr2) {
            }

            @Override // X.C142V
            public final /* synthetic */ void LJFF(String... strArr2) {
            }

            @Override // X.C142V
            public final void LIZJ(String... strArr2) throws Throwable {
                if (!"mounted".equals(C786410Ut5.X3())) {
                    C12ES.LJI(2131851934, activity);
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if ((i2 <= 32 && C202139147l.LJI("android.permission.READ_EXTERNAL_STORAGE", strArr2)) || C202139147l.LJI("android.permission.READ_MEDIA_IMAGES", strArr2) || (i2 >= 34 && C202139147l.LJI("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", strArr2))) {
                    Intent intent = new Intent();
                    intent.setType("image/*");
                    intent.setAction("android.intent.action.GET_CONTENT");
                    intent.putExtra("pns.sandbox.dataflow_id", 1207965186);
                    try {
                        Fragment fragment2 = fragment;
                        if (fragment2 != null) {
                            int i3 = this.LIZJ;
                            C1701330uNH.LIZ(intent, fragment2);
                            C2204961BRm.LLJL(fragment2, intent, i3, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQryNvJ5sNXQ2NpEz9BE1lmQx", null));
                        } else {
                            Activity activity2 = activity;
                            int i4 = this.LIZJ;
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                            C1701330uNH.LIZ(intent, activity2);
                            C2204961BRm.LJIIZILJ(i4, activity2, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQryNvJ5sNXQ2NpEz9BE1lmQx", null));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C12ES.LJI(2131851933, activity);
                    }
                }
            }
        }, true, strArr);
    }

    public final void LJFF(boolean z, Uri uri) throws Throwable {
        if (uri == null) {
            return;
        }
        if (!z) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                if (!C2093608Ic.LJ(lastPathSegment) && lastPathSegment.contains(":")) {
                    lastPathSegment = lastPathSegment.split(":")[1];
                }
                try {
                    uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, CastLongProtector.parseLong(lastPathSegment));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        if (this.LJIILJJIL) {
            CropFragment cropFragment = new CropFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "arg_origin_uri", uri);
            bundle.putBoolean("arg_is_for_live_cover", false);
            cropFragment.setArguments(bundle);
            cropFragment.LLIZ = new AObjectS373S0100000_30(this, 6);
            cropFragment.show(this.LIZLLL.getChildFragmentManager(), this.LJFF);
            return;
        }
        LJIIL(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(int r13, int r14, android.content.Intent r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202139147l.LJII(int, int, android.content.Intent):boolean");
    }

    public static void LJIIJ(final float f, final Activity activity, final Fragment fragment, final Boolean bool, final Boolean bool2, final String str, final String str2) {
        if (!"mounted".equals(C786410Ut5.X3())) {
            C12ES.LJ(activity, R.drawable.ec6, activity.getString(2131851934));
        } else {
            new C0UT9(activity, TokenCert.with("bpea-start_camera_activity")).LIZ(new C142V() { // from class: X.09gc
                public final /* synthetic */ int LJ = 4000400;

                @Override // X.C142V
                public final void LIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZLLL(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJ(String str3, String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJFF(String... strArr) {
                }

                @Override // X.C142V
                public final void LIZJ(String... strArr) throws Throwable {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    C0VSJ c0vsj = new C0VSJ(str);
                    if (!c0vsj.exists()) {
                        c0vsj.mkdirs();
                    }
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj, str2);
                    Activity activity2 = activity;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(activity.getPackageName());
                    sbLIZ.append(".ttlive_provider");
                    Uri uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(activity2, C2188811AlT.LIZIZ(sbLIZ), c0vsj2);
                    intent.putExtra("output", uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile);
                    intent.putExtra("pns.sandbox.dataflow_id", 1207965441);
                    try {
                        if (fragment != null) {
                            if (LiveCoverCameraSetting.INSTANCE.enable()) {
                                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openCamera(fragment.getActivity(), this.LJ, uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, bool, bool2, f);
                                return;
                            }
                            Fragment fragment2 = fragment;
                            int i = this.LJ;
                            C1701330uNH.LIZ(intent, fragment2);
                            C2204961BRm.LLJL(fragment2, intent, i, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQryNvJ5sNXQ2NpEz9BE1lmQx", null));
                            return;
                        }
                        if (LiveCoverCameraSetting.INSTANCE.enable()) {
                            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openCamera(activity, this.LJ, uriAndroidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile, bool, bool2, f);
                            return;
                        }
                        Activity activity3 = activity;
                        int i2 = this.LJ;
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity3, intent, "Activity_startActivityForResult_2");
                        C1701330uNH.LIZ(intent, activity3);
                        C2204961BRm.LJIIZILJ(i2, activity3, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQryNvJ5sNXQ2NpEz9BE1lmQx", null));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C12ES.LJI(2131851932, activity);
                    }
                }
            }, false, "android.permission.CAMERA");
        }
    }

    public C202139147l(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, InterfaceC202141147n interfaceC202141147n, boolean z, boolean z2, boolean z3) {
        this.LIZIZ = activity;
        this.LIZLLL = fragment;
        this.LJII = interfaceC202141147n;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = i3;
        this.LJIIJJI = i4;
        this.LJIILJJIL = z;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = z3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".data");
        this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
        if (activity == null && fragment != null) {
            this.LIZIZ = fragment.getActivity();
        }
        Activity activity2 = this.LIZIZ;
        if (activity2 != null) {
            this.LIZJ = activity2.getResources();
        } else {
            this.LIZJ = C497740JfY.LJIILJJIL();
        }
        this.LJIIL = "";
    }

    public static C202139147l LJ(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, InterfaceC202141147n interfaceC202141147n, boolean z, boolean z2, boolean z3) {
        return new C202139147l(activity, fragment, str, i, i2, i3, i4, interfaceC202141147n, z, z2, z3);
    }
}
