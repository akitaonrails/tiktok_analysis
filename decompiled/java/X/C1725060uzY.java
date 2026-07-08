package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionButton;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionResponse;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionUIData;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorSdkClientVeData;
import com.ss.android.ugc.aweme.pipo.errorsdk.ab.ErrorCodeSdkConfig;
import com.ss.android.ugc.aweme.pipo.errorsdk.fragment.ErrorCodeSdkBottomSheetFragment;
import com.ss.android.ugc.aweme.pipo.errorsdk.fragment.ErrorCodeSdkFullPageArgs;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS64S2100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725060uzY implements InterfaceC921603iw {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1457));
    public volatile ErrorSdkClientVeData LJFF;

    public final C1725050uzX LJ() {
        return (C1725050uzX) this.LJ.getValue();
    }

    public static void LJIIIZ(Function0 function0) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C1321505Fd(function0, null), 2);
    }

    @Override // X.InterfaceC921603iw
    public final void LIZIZ(String str, C921303it c921303it) throws JSONException {
        C1725050uzX c1725050uzXLJ = LJ();
        c1725050uzXLJ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", "fetch_client_ve");
        linkedHashMap.put("step", "start");
        c1725050uzXLJ.LIZJ(linkedHashMap);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1725000uzS(this, str, c921303it, System.currentTimeMillis(), null), 2);
    }

    @Override // X.InterfaceC921603iw
    public final String LIZJ(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("product", this.LIZ);
        jSONObject.put("locale", this.LIZIZ);
        jSONObject.put("mid", this.LIZJ);
        jSONObject.put("muid", this.LIZLLL);
        jSONObject.put("device_platform", "android");
        jSONObject.put("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
        jSONObject.put("page", str);
        jSONObject.put("extra", str2);
        return C786410Ut5.J3(jSONObject);
    }

    public static void LJFF(C1710940ucm c1710940ucm, String str, InterfaceC1725110uzd interfaceC1725110uzd) {
        Activity activity = c1710940ucm.LIZJ;
        Fragment fragment = c1710940ucm.LIZIZ;
        View view = c1710940ucm.LIZLLL;
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        } else if (fragment != null) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(fragment);
            c1389890mGx2.LJIIJ(str);
            c1389890mGx2.LIZ(true);
            c1389890mGx2.LJIIJJI();
        } else if (view != null) {
            C1389890mGx c1389890mGx3 = new C1389890mGx(view);
            c1389890mGx3.LJIIJ(str);
            c1389890mGx3.LIZ(true);
            c1389890mGx3.LJIIJJI();
        } else {
            InterfaceC1724930uzL interfaceC1724930uzLLJIIIZ = C1717770unn.LIZJ().LJIIIZ(c1710940ucm.LIZ);
            interfaceC1724930uzLLJIIIZ.LIZ(str);
            interfaceC1724930uzLLJIIIZ.show();
        }
        if (interfaceC1725110uzd != null) {
            interfaceC1725110uzd.LIZ(C03XW.ON_TOAST, null);
        }
    }

    public static void LJI(C1710940ucm c1710940ucm, String str, InterfaceC1725110uzd interfaceC1725110uzd) {
        if (str == null || str.length() == 0) {
            str = c1710940ucm.LIZ.getString(2131835079);
        }
        LJFF(c1710940ucm, str, interfaceC1725110uzd);
    }

    @Override // X.InterfaceC921603iw
    public final void LIZLLL(C1710940ucm c1710940ucm, String str, InterfaceC1725110uzd interfaceC1725110uzd) throws JSONException {
        try {
            C1227904rF.LIZ.getClass();
            ErrorActionResponse errorActionResponse = (ErrorActionResponse) C1227904rF.LIZIZ(str, ErrorActionResponse.class);
            if (errorActionResponse != null) {
                LJIIIZ(new AwS154S0400000_26(this, c1710940ucm, errorActionResponse, interfaceC1725110uzd, 24));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        LJ().LIZIZ("handle_action_string", EnumC1725040uzW.PARSE_JSON_STRING_ERROR, null);
        LJIIIZ(new AwS270S0300000_26(this, c1710940ucm, interfaceC1725110uzd, 130));
    }

    public C1725060uzY(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }

    public final void LJIIIIZZ(String str, C1710940ucm c1710940ucm, ErrorActionResponse errorActionResponse, final InterfaceC1725110uzd interfaceC1725110uzd) {
        boolean z;
        String str2;
        boolean z2;
        String str3;
        FragmentManager supportFragmentManager;
        final ErrorActionUIData errorActionUIData = errorActionResponse.uiData;
        if (errorActionUIData == null) {
            LJ().LIZIZ(str, EnumC1725040uzW.UI_DATA_NULL_ERROR, null);
            LJI(c1710940ucm, errorActionResponse.oeMessage, interfaceC1725110uzd);
            return;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ErrorCodeSdkConfig errorCodeSdkConfig = C1725130uzf.LIZ;
        ErrorCodeSdkConfig errorCodeSdkConfig2 = (ErrorCodeSdkConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_error_sdk_config", ErrorCodeSdkConfig.class, errorCodeSdkConfig);
        if (errorCodeSdkConfig2 != null) {
            errorCodeSdkConfig = errorCodeSdkConfig2;
        }
        List<String> list = errorCodeSdkConfig.disableUiTypes;
        if (list != null && C13LP.LJJJJ(errorActionUIData.type, list)) {
            LJ().LIZIZ(str, EnumC1725040uzW.DISABLED_ERROR_UI_TYPE, null);
            LJI(c1710940ucm, errorActionResponse.oeMessage, interfaceC1725110uzd);
            return;
        }
        String str4 = errorActionUIData.type;
        if (Intrinsics.LJFF(str4, EnumC1722720uvm.TOAST.getValue())) {
            LJFF(c1710940ucm, errorActionUIData.errorText, interfaceC1725110uzd);
        } else if (Intrinsics.LJFF(str4, EnumC1722720uvm.DIALOG.getValue())) {
            Context context = c1710940ucm.LIZ;
            C1725070uzZ c1725070uzZ = new C1725070uzZ(context, this.LIZ, LJ());
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(errorActionUIData.errorTitle);
            c1397580mTM.LIZIZ(errorActionUIData.errorText);
            c1397580mTM.LJIIIIZZ = Intrinsics.LJFF(errorActionUIData.showClose, Boolean.TRUE);
            c1397580mTM.LJII = false;
            Integer numLIZIZ = C1411110mpB.LIZIZ(errorActionUIData.iconType);
            if (numLIZIZ != null) {
                C1235760iGM.LIZ(c1397580mTM, numLIZIZ.intValue(), Integer.valueOf(R.attr.a1h), 4);
            }
            c1397580mTM.LIZLLL(new AwS392S0200000_26(errorActionUIData, interfaceC1725110uzd, 173));
            C985403tE.LIZ(c1397580mTM, new AwS235S0300000_26(errorActionUIData, c1725070uzZ, interfaceC1725110uzd, 50));
            new C1397510mTF(c1397580mTM).LIZLLL();
        } else if (Intrinsics.LJFF(str4, EnumC1722720uvm.BOTTOM_SHEET.getValue())) {
            Context context2 = c1710940ucm.LIZ;
            C1725050uzX c1725050uzXLJ = LJ();
            ErrorCodeSdkBottomSheetFragment errorCodeSdkBottomSheetFragment = new ErrorCodeSdkBottomSheetFragment();
            errorCodeSdkBottomSheetFragment.LL = errorActionUIData;
            errorCodeSdkBottomSheetFragment.LLILLJJLI = errorCodeSdkBottomSheetFragment.LLILLJJLI;
            errorCodeSdkBottomSheetFragment.LLILLL = interfaceC1725110uzd;
            errorCodeSdkBottomSheetFragment.LLILZ = c1725050uzXLJ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(396));
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = errorCodeSdkBottomSheetFragment;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = iLIZIZ;
            tuxSheet2.LL = new DialogInterface.OnCancelListener() { // from class: X.0uzb
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    InterfaceC1725110uzd interfaceC1725110uzd2 = interfaceC1725110uzd;
                    if (interfaceC1725110uzd2 != null) {
                        interfaceC1725110uzd2.LIZ(C03XW.ON_CLOSE, C1411110mpB.LIZ(errorActionUIData.type, "cancel"));
                    }
                }
            };
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context2);
            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                tuxSheet2.show(supportFragmentManager, "error_sdk_bottom_sheet");
            } else {
                getClass();
                LJI(c1710940ucm, null, interfaceC1725110uzd);
            }
        } else if (Intrinsics.LJFF(str4, EnumC1722720uvm.FULL_PAGE.getValue())) {
            Context context3 = c1710940ucm.LIZ;
            final C1725070uzZ c1725070uzZ2 = new C1725070uzZ(context3, this.LIZ, LJ());
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context3, "//pipo/infra/error_code_sdk/full_page");
            String str5 = errorActionUIData.errorTitle;
            String str6 = errorActionUIData.errorText;
            String str7 = errorActionUIData.iconType;
            ErrorActionButton errorActionButton = errorActionUIData.primaryButton;
            if (errorActionButton != null) {
                z = true;
                str2 = errorActionButton.btnText;
            } else {
                z = false;
                str2 = null;
            }
            ErrorActionButton errorActionButton2 = errorActionUIData.secondaryButton;
            if (errorActionButton2 != null) {
                z2 = true;
                str3 = errorActionButton2.btnText;
            } else {
                z2 = false;
                str3 = null;
            }
            smartRouteBuildRoute.withNavArg(new ErrorCodeSdkFullPageArgs(str5, str6, str7, z, str2, z2, str3, errorActionUIData.showBack));
            smartRouteBuildRoute.open(101, new OnActivityResultCallback() { // from class: X.0uza
                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i, int i2, Intent intent) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                InterfaceC1725110uzd interfaceC1725110uzd2 = interfaceC1725110uzd;
                                if (interfaceC1725110uzd2 != null) {
                                    interfaceC1725110uzd2.LIZ(C03XW.ON_CLOSE, C1411110mpB.LIZ(errorActionUIData.type, "cancel"));
                                    return;
                                }
                                return;
                            }
                            InterfaceC1725110uzd interfaceC1725110uzd3 = interfaceC1725110uzd;
                            if (interfaceC1725110uzd3 == null) {
                                return;
                            }
                            interfaceC1725110uzd3.LIZ(C03XW.ON_CLOSE, C1411110mpB.LIZ(errorActionUIData.type, "button_back"));
                            return;
                        }
                        ErrorActionUIData errorActionUIData2 = errorActionUIData;
                        ErrorActionButton errorActionButton3 = errorActionUIData2.secondaryButton;
                        if (errorActionButton3 == null) {
                            return;
                        }
                        C1725070uzZ c1725070uzZ3 = c1725070uzZ2;
                        InterfaceC1725110uzd interfaceC1725110uzd4 = interfaceC1725110uzd;
                        String str8 = errorActionUIData2.type;
                        String str9 = errorActionButton3.actionType;
                        String str10 = errorActionButton3.actionParams;
                        c1725070uzZ3.getClass();
                        c1725070uzZ3.LIZ(str8, str9, str10, interfaceC1725110uzd4, new AwS64S2100000_26(interfaceC1725110uzd4, str9, str8, 1));
                        return;
                    }
                    ErrorActionUIData errorActionUIData3 = errorActionUIData;
                    ErrorActionButton errorActionButton4 = errorActionUIData3.primaryButton;
                    if (errorActionButton4 == null) {
                        return;
                    }
                    C1725070uzZ c1725070uzZ4 = c1725070uzZ2;
                    InterfaceC1725110uzd interfaceC1725110uzd5 = interfaceC1725110uzd;
                    String str11 = errorActionUIData3.type;
                    String str12 = errorActionButton4.actionType;
                    String str13 = errorActionButton4.actionParams;
                    c1725070uzZ4.getClass();
                    c1725070uzZ4.LIZ(str11, str12, str13, interfaceC1725110uzd5, new AwS64S2100000_26(interfaceC1725110uzd5, str12, str11, 1));
                }
            });
        } else {
            LJ().LIZIZ(str, EnumC1725040uzW.UNKNOWN_UI_TYPE_ERROR, null);
            String str8 = errorActionResponse.oeMessage;
            getClass();
            LJI(c1710940ucm, str8, null);
            return;
        }
        C1725050uzX c1725050uzXLJ2 = LJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ui_type", errorActionUIData.type);
        jSONObject.put("oe_code", errorActionResponse.oeCode);
        jSONObject.put("page", errorActionResponse.page);
        jSONObject.put("extra", errorActionResponse.extra);
        c1725050uzXLJ2.LIZ(null, str, jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0124, code lost:
    
        if (r12 != null) goto L35;
     */
    @Override // X.InterfaceC921603iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1710940ucm r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.C921403iu r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725060uzY.LIZ(X.0ucm, java.lang.String, java.lang.String, java.lang.String, X.03iu):void");
    }
}
