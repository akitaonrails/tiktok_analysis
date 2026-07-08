package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS468S0200000_33;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AUN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AUN extends C1AUO {
    public static Pair LIZJ(Activity activity) {
        boolean zLJ;
        boolean zLJJIJ = false;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT != null) {
            zLJ = iLocationBaseServiceForMT.LJ(activity);
            zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
        } else {
            zLJ = false;
        }
        return new Pair(Boolean.valueOf(zLJ), Boolean.valueOf(zLJJIJ));
    }

    public final void LIZLLL(Activity activity, CompletionBlock<C1AUR> completionBlock) {
        String containerID;
        String containerID2;
        Pair pairLIZJ = LIZJ(activity);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C1AUW c1auw = (C1AUW) C1909107dp.LIZJ(C1AUW.class, containerID);
        c1auw.setSystemIsNotReduced((Boolean) pairLIZJ.getFirst());
        c1auw.setInAppIsNotReduced((Boolean) pairLIZJ.getSecond());
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        } else {
            containerID2 = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1AUR.class, containerID2);
        C1AUR c1aur = (C1AUR) xBaseModelLIZJ;
        c1aur.setGranted(c1auw);
        c1aur.setDenied(null);
        c1aur.setEnableLocation(Boolean.TRUE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public final void LJ(int i, Integer num, CompletionBlock<C1AUR> completionBlock) {
        String containerID;
        String containerID2;
        Boolean boolValueOf;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C1AUV c1auv = (C1AUV) C1909107dp.LIZJ(C1AUV.class, containerID);
        c1auv.setType(Integer.valueOf(i));
        c1auv.setSubType(num);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        } else {
            containerID2 = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1AUR.class, containerID2);
        C1AUR c1aur = (C1AUR) xBaseModelLIZJ;
        c1aur.setDenied(c1auv);
        c1aur.setGranted(null);
        InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        if (interfaceC1207490hWl != null) {
            boolValueOf = Boolean.valueOf(interfaceC1207490hWl.LJII(0, C1BWL.LIZ()));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        c1aur.setEnableLocation(boolValueOf);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        TokenCert tokenCertWith;
        TokenCert tokenCertWith2;
        Activity activityLIZLLL;
        C19EG c19eg;
        String enterFrom;
        String enterMethod;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        Fragment fragment;
        Map<String, Object> extraParams;
        Boolean needInAppNotReduced;
        Boolean needSystemNotReducedBySelfBuiltPopup;
        Boolean needSystemNotReduced;
        String previousPage;
        View view2;
        C1AUP c1aup = (C1AUP) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        if (!(view instanceof WebView)) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                view2 = interfaceC634840OvC2.getView();
            } else {
                view2 = null;
            }
            if (!(view2 instanceof LynxView)) {
                C2382909Vj.LIZ(completionBlock, 0, "RequestLocationPermission get wrong view", null, 4);
                return;
            }
        }
        String hybridUrl = getHybridUrl(enumC1063300dmC);
        if (hybridUrl == null) {
            C2382909Vj.LIZ(completionBlock, 0, "RequestLocationPermission get wrong url", null, 4);
            return;
        }
        Uri uri = UriProtector.parse(hybridUrl);
        String path = uri.getPath();
        String host = uri.getHost();
        if (!C1AUZ.LIZ(enumC1063300dmC, path, host) && !C1AUZ.LIZIZ(enumC1063300dmC, path, host)) {
            C2382909Vj.LIZ(completionBlock, 0, "RequestLocationPermission get wrong path", null, 4);
            return;
        }
        if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL()) {
            tokenCertWith = TokenCert.Companion.with("bpea-ecom_fe_address_request_coarse_locate_for_not_reduced");
            tokenCertWith2 = TokenCert.Companion.with("bpea-fe_product_detail_coarse_locate_for_not_reduced");
        } else {
            tokenCertWith = TokenCert.Companion.with("bpea-ecom_fe_address_request_coarse_locate");
            tokenCertWith2 = TokenCert.Companion.with("bpea-fe_product_detail_coarse_locate");
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            activityLIZLLL = interfaceC634840OvC3.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (activityLIZLLL instanceof C19EG) {
            c19eg = (C19EG) activityLIZLLL;
        } else {
            c19eg = null;
        }
        String str = "";
        if (c19eg == null) {
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
            return;
        }
        C1AUQ trackParams = c1aup.getTrackParams();
        if (trackParams == null || (enterFrom = trackParams.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C1AUQ trackParams2 = c1aup.getTrackParams();
        if (trackParams2 == null || (enterMethod = trackParams2.getEnterMethod()) == null) {
            enterMethod = "";
        }
        C1AUQ trackParams3 = c1aup.getTrackParams();
        if (trackParams3 != null && (previousPage = trackParams3.getPreviousPage()) != null) {
            str = previousPage;
        }
        C1AUU authorizationParams = c1aup.getAuthorizationParams();
        if (authorizationParams != null && (needSystemNotReduced = authorizationParams.getNeedSystemNotReduced()) != null) {
            zBooleanValue = needSystemNotReduced.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C1AUU authorizationParams2 = c1aup.getAuthorizationParams();
        if (authorizationParams2 != null && (needSystemNotReducedBySelfBuiltPopup = authorizationParams2.getNeedSystemNotReducedBySelfBuiltPopup()) != null) {
            zBooleanValue2 = needSystemNotReducedBySelfBuiltPopup.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        C1AUU authorizationParams3 = c1aup.getAuthorizationParams();
        if (authorizationParams3 != null && (needInAppNotReduced = authorizationParams3.getNeedInAppNotReduced()) != null) {
            zBooleanValue3 = needInAppNotReduced.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
        if (objLJIILLIIL != null) {
            fragment = (Fragment) objLJIILLIIL;
        } else {
            fragment = null;
        }
        C1207520hWo c1207520hWo = new C1207520hWo(enterFrom, enterMethod, null, str, false, false, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), 4);
        if (Intrinsics.LJFF(c1aup.getUseCustomCert(), Boolean.TRUE)) {
            try {
                boolean zLJII = false;
                ILocationService iLocationService = (ILocationService) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
                if (iLocationService != null) {
                    zLJII = iLocationService.LJII(0, C1BWL.LIZ());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1AUQ trackParams4 = c1aup.getTrackParams();
                if (trackParams4 != null && (extraParams = trackParams4.getExtraParams()) != null) {
                    for (Map.Entry<String, Object> entry : extraParams.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                c1207520hWo.LIZJ = linkedHashMap;
                if (!zLJII) {
                    LJII(c19eg, fragment, c1207520hWo, c1aup, completionBlock);
                    return;
                } else if (Intrinsics.LJFF(c1207520hWo.LJI, Boolean.TRUE)) {
                    LJFF(c19eg, fragment, c1207520hWo, c1aup, completionBlock);
                    return;
                } else {
                    LIZLLL(c19eg, completionBlock);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJ(-1, 9999, completionBlock);
                return;
            }
        }
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        String business = c1aup.getBusiness();
        String scene = c1aup.getScene();
        if (Intrinsics.LJFF(c1aup.getBusiness(), "tt_shop")) {
            tokenCertWith2 = tokenCertWith;
        }
        c1207450hWh.LJJI(business, scene, tokenCertWith2, c19eg, c1207520hWo, new AwS468S0200000_33(this, (C1AUN) completionBlock, (CompletionBlock<C1AUR>) 5), new AwS399S0200000_33(this, (C1AUN) completionBlock, (CompletionBlock<C1AUR>) 15), new AwS468S0200000_33(this, (C1AUN) completionBlock, (CompletionBlock<C1AUR>) 6));
    }

    public final void LJFF(final C19EG c19eg, Fragment fragment, C1207520hWo c1207520hWo, C1AUP c1aup, final CompletionBlock completionBlock) {
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        int value = 9999;
        if (iLocationBaseServiceForMT == null) {
            LJ(-1, 9999, completionBlock);
            return;
        }
        Pair pairLIZJ = LIZJ(c19eg);
        if (((Boolean) pairLIZJ.getFirst()).booleanValue() && ((Boolean) pairLIZJ.getSecond()).booleanValue()) {
            LIZLLL(c19eg, completionBlock);
            return;
        }
        TokenCert tokenCertWith = TokenCert.Companion.with(c1aup.getCertName());
        ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
        EnumC1205470hTV enumC1205470hTVLIZIZ = null;
        Context context = null;
        if (iLocationServiceForLS != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            }
            enumC1205470hTVLIZIZ = iLocationServiceForLS.LIZIZ(context, tokenCertWith);
        }
        if (enumC1205470hTVLIZIZ != EnumC1205470hTV.SUCCESS) {
            if (enumC1205470hTVLIZIZ != null) {
                value = enumC1205470hTVLIZIZ.getValue();
            }
            LJ(-1, Integer.valueOf(value), completionBlock);
            return;
        }
        iLocationBaseServiceForMT.LJIL(c19eg, fragment, tokenCertWith, c1207520hWo, new InterfaceC1207170hWF() { // from class: X.1AUS
            @Override // X.InterfaceC1207170hWF
            public final void LIZ(C1208240hXy c1208240hXy) {
            }

            @Override // X.InterfaceC1207170hWF
            public final void LIZIZ(C1208000hXa c1208000hXa) {
                if (c1208000hXa.LIZ == EnumC1207930hXT.Granted) {
                    this.LIZLLL(c19eg, completionBlock);
                } else {
                    this.LJ(-1, 9999, completionBlock);
                }
            }
        });
    }

    public final void LJII(final C19EG c19eg, Fragment fragment, C1207520hWo c1207520hWo, C1AUP c1aup, final CompletionBlock completionBlock) {
        EnumC1205470hTV enumC1205470hTVLIZ;
        final EnumC19358710oT enumC19358710oT;
        int value;
        Context context;
        TokenCert tokenCertWith = TokenCert.Companion.with(c1aup.getCertName());
        InterfaceC19359210oY interfaceC19359210oY = null;
        ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
        if (iLocationServiceForLS != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(context, tokenCertWith, null);
        } else {
            enumC1205470hTVLIZ = null;
        }
        if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
            if (enumC1205470hTVLIZ != null) {
                value = enumC1205470hTVLIZ.getValue();
            } else {
                value = 9999;
            }
            LJ(-1, Integer.valueOf(value), completionBlock);
            return;
        }
        if (Intrinsics.LJFF(tokenCertWith.getToken(), "bpea-fyp_shape_card_popup_android")) {
            enumC19358710oT = EnumC19358710oT.FYP;
        } else {
            enumC19358710oT = null;
        }
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        InterfaceC1207030hW1 interfaceC1207030hW1 = new InterfaceC1207030hW1() { // from class: X.1AUT
            @Override // X.InterfaceC1207030hW1
            public final void LIZ() {
                this.LIZLLL(c19eg, completionBlock);
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZJ(int i) {
                this.LJ(i, 0, completionBlock);
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZIZ(int i, String str) {
                this.LJ(i, 0, completionBlock);
            }
        };
        if (enumC19358710oT != null) {
            interfaceC19359210oY = new InterfaceC19359210oY(enumC19358710oT) { // from class: X.10oX
                public final EnumC19358710oT LIZ;

                {
                    this.LIZ = enumC19358710oT;
                }

                @Override // X.InterfaceC19359210oY
                public final C12Q8 LIZ(Activity activity, AbstractC1207960hXW abstractC1207960hXW) {
                    if ((abstractC1207960hXW instanceof C1207950hXV) || !(abstractC1207960hXW instanceof C1207980hXY)) {
                        return null;
                    }
                    if (C19358810oU.LIZ[this.LIZ.ordinal()] != 1) {
                        return null;
                    }
                    return new C12Q8(activity) { // from class: X.0mKM
                        public final Activity LIZ;
                        public TuxPanel LIZIZ;

                        @Override // X.C12Q8
                        public final void LIZ() {
                            TuxPanel tuxPanel = this.LIZIZ;
                            if (tuxPanel != null) {
                                tuxPanel.dismiss();
                            }
                        }

                        {
                            this.LIZ = activity;
                            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(186));
                        }

                        public static final void LJ(View view, boolean z) {
                            if (view != null) {
                                View viewFindViewById = view.findViewById(R.id.ipc);
                                View viewFindViewById2 = view.findViewById(R.id.ipd);
                                if (viewFindViewById != null) {
                                    viewFindViewById.setBackground(new AbstractC415370GQl(z) { // from class: X.0GHV
                                        {
                                            int i;
                                            this.LIZJ.LIZJ(new RectF(0.0f, 0.0f, 22.0f, 22.0f), 5.0f, 5.0f, Path.Direction.CW);
                                            this.LIZIZ.setStyle(Paint.Style.FILL);
                                            Paint paint = this.LIZIZ;
                                            if (z) {
                                                i = -12367014;
                                            } else {
                                                i = -1117706;
                                            }
                                            paint.setColor(i);
                                            this.LIZ.add(this.LIZIZ);
                                        }

                                        @Override // X.AbstractC415370GQl
                                        public final void LIZ(Canvas canvas) {
                                            LIZIZ(22.0f, 22.0f, canvas);
                                            canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
                                        }
                                    });
                                }
                                if (viewFindViewById2 != null) {
                                    viewFindViewById2.setBackground(new AbstractC415370GQl(z) { // from class: X.0GHW
                                        {
                                            int i;
                                            this.LIZJ.LIZJ(new RectF(0.0f, 0.0f, 168.0f, 15.0f), 4.0f, 4.0f, Path.Direction.CW);
                                            this.LIZIZ.setStyle(Paint.Style.FILL);
                                            Paint paint = this.LIZIZ;
                                            if (z) {
                                                i = -12367014;
                                            } else {
                                                i = -1117706;
                                            }
                                            paint.setColor(i);
                                            this.LIZ.add(this.LIZIZ);
                                        }

                                        @Override // X.AbstractC415370GQl
                                        public final void LIZ(Canvas canvas) {
                                            LIZIZ(168.0f, 15.0f, canvas);
                                            canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
                                        }
                                    });
                                }
                            }
                        }

                        @Override // X.C12Q8
                        public final void LIZLLL(C12QB c12qb, C12QB c12qb2, String str, String str2, String str3) {
                            boolean z;
                            int i;
                            FragmentManager supportFragmentManager;
                            TuxPanel tuxPanel;
                            C1391960mKI c1391960mKI = new C1391960mKI();
                            Activity activity2 = this.LIZ;
                            View view = null;
                            View viewSd = C786410Ut5.Sd(R.layout.dk2, C786410Ut5.ne(activity2), null);
                            if (viewSd instanceof LinearLayout) {
                                view = viewSd;
                            }
                            if (view == null) {
                                view = new View(activity2);
                            } else {
                                TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ip9);
                                ImageView imageView = (ImageView) view.findViewById(R.id.ip_);
                                View viewFindViewById = view.findViewById(R.id.ipa);
                                View viewFindViewById2 = view.findViewById(R.id.ipb);
                                if ((activity2.getResources().getConfiguration().uiMode & 48) == 32) {
                                    z = true;
                                    i = R.drawable.cl2;
                                } else {
                                    z = false;
                                    i = R.drawable.cl3;
                                }
                                tuxIconView.setImageDrawable(new AbstractC415370GQl(z) { // from class: X.0GQc
                                    public final C415290GQd LJ;
                                    public final Paint LJFF;
                                    public final C415290GQd LJI;
                                    public final Paint LJII;
                                    public final C415290GQd LJIIIIZZ;

                                    {
                                        int[] iArr;
                                        int i2;
                                        if (z) {
                                            iArr = new int[]{-12367014, -12367014, 4410202};
                                        } else {
                                            iArr = new int[]{-1117706, -1117706, 15659510};
                                        }
                                        LinearGradient linearGradient = new LinearGradient(130.771f, 0.370605f, 130.771f, 146.0f, iArr, new float[]{0.0f, 0.735893f, 1.0f}, Shader.TileMode.CLAMP);
                                        new Paint();
                                        C415290GQd c415290GQd = new C415290GQd();
                                        this.LJ = c415290GQd;
                                        c415290GQd.LJIIIZ(0.0f, 46.08f);
                                        c415290GQd.LJFF(0.0f, 29.9505f, 0.0f, 21.8857f, 3.13901f, 15.7251f);
                                        c415290GQd.LJFF(5.90017f, 10.306f, 10.306f, 5.90017f, 15.7251f, 3.13901f);
                                        c415290GQd.LJFF(21.8857f, 0.0f, 29.9505f, 0.0f, 46.08f, 0.0f);
                                        c415290GQd.LJII(215.92f);
                                        c415290GQd.LJFF(232.05f, 0.0f, 240.114f, 0.0f, 246.275f, 3.13901f);
                                        c415290GQd.LJFF(251.694f, 5.90017f, 256.1f, 10.306f, 258.861f, 15.7251f);
                                        c415290GQd.LJFF(262.0f, 21.8857f, 262.0f, 29.9505f, 262.0f, 46.08f);
                                        c415290GQd.LJIJI(146.0f);
                                        c415290GQd.LJII(0.0f);
                                        c415290GQd.LJIJI(46.08f);
                                        c415290GQd.LJ();
                                        c415290GQd.LJIJ(Path.FillType.WINDING);
                                        Paint paint = new Paint();
                                        this.LJFF = paint;
                                        C415290GQd c415290GQd2 = new C415290GQd();
                                        this.LJI = c415290GQd2;
                                        c415290GQd2.LJIIIZ(-0.228516f, 45.1706f);
                                        c415290GQd2.LJFF(-0.228516f, 29.4891f, -0.228516f, 21.6484f, 2.8233f, 15.6589f);
                                        c415290GQd2.LJFF(5.50776f, 10.3903f, 9.79121f, 6.10688f, 15.0597f, 3.42242f);
                                        c415290GQd2.LJFF(21.0493f, 0.370605f, 28.89f, 0.370605f, 44.5715f, 0.370605f);
                                        c415290GQd2.LJII(216.971f);
                                        c415290GQd2.LJFF(232.653f, 0.370605f, 240.494f, 0.370605f, 246.483f, 3.42242f);
                                        c415290GQd2.LJFF(251.752f, 6.10688f, 256.035f, 10.3903f, 258.72f, 15.6589f);
                                        c415290GQd2.LJFF(261.771f, 21.6484f, 261.771f, 29.4891f, 261.771f, 45.1706f);
                                        c415290GQd2.LJIJI(146.0f);
                                        c415290GQd2.LJII(-0.228516f);
                                        c415290GQd2.LJIJI(45.1706f);
                                        c415290GQd2.LJ();
                                        c415290GQd2.LJIJ(Path.FillType.WINDING);
                                        paint.setStyle(Paint.Style.FILL);
                                        paint.setShader(linearGradient);
                                        this.LIZ.add(paint);
                                        Paint paint2 = new Paint();
                                        this.LJII = paint2;
                                        C415290GQd c415290GQd3 = new C415290GQd();
                                        this.LJIIIIZZ = c415290GQd3;
                                        c415290GQd3.LJIIIZ(14.2285f, 37.6294f);
                                        c415290GQd3.LJFF(14.2285f, 25.4791f, 24.0783f, 15.6294f, 36.2285f, 15.6294f);
                                        c415290GQd3.LJII(226.229f);
                                        c415290GQd3.LJFF(238.379f, 15.6294f, 248.229f, 25.4791f, 248.229f, 37.6294f);
                                        c415290GQd3.LJIJI(145.629f);
                                        c415290GQd3.LJII(14.2285f);
                                        c415290GQd3.LJIJI(37.6294f);
                                        c415290GQd3.LJ();
                                        c415290GQd3.LJIJ(Path.FillType.WINDING);
                                        paint2.setStyle(Paint.Style.FILL);
                                        if (z) {
                                            i2 = -11116689;
                                        } else {
                                            i2 = -1;
                                        }
                                        paint2.setColor(i2);
                                        this.LIZ.add(paint2);
                                    }

                                    @Override // X.AbstractC415370GQl
                                    public final void LIZ(Canvas canvas) {
                                        float fMin = Math.min(getBounds().width() / 262.0f, getBounds().height() / 146.0f);
                                        canvas.translate(getBounds().left + ((getBounds().width() - (262.0f * fMin)) / 2.0f), getBounds().top + ((getBounds().height() - (146.0f * fMin)) / 2.0f));
                                        canvas.scale(fMin, fMin);
                                        canvas.clipPath(this.LJ.LIZ);
                                        canvas.drawPath(this.LJI.LIZ, this.LJFF);
                                        canvas.drawPath(this.LJIIIIZZ.LIZ, this.LJII);
                                    }
                                });
                                imageView.setImageResource(i);
                                LJ(viewFindViewById, z);
                                LJ(viewFindViewById2, z);
                            }
                            c1391960mKI.LJFF = view;
                            c1391960mKI.LJI = 2;
                            if (str == null) {
                                str = this.LIZ.getString(2131835021);
                            }
                            c1391960mKI.LJII = str;
                            c1391960mKI.LJIIIIZZ = str2;
                            c1391960mKI.LIZIZ(this.LIZ.getString(2131835019), new AwS635S0100000_21(c12qb, 2));
                            c1391960mKI.LIZJ(this.LIZ.getString(2131835020), new AwS635S0100000_21(c12qb2, 3));
                            c1391960mKI.LJIILJJIL = true;
                            c1391960mKI.LIZ = false;
                            TuxPanel tuxPanel2 = c1391960mKI.LIZ().LIZ;
                            tuxPanel2.LLJI = false;
                            tuxPanel2.LLJIJIL = false;
                            tuxPanel2.LLILZLL = new DialogInterfaceOnCancelListenerC1401970maR(c12qb2, 2);
                            this.LIZIZ = tuxPanel2;
                            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
                            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (tuxPanel = this.LIZIZ) != null) {
                                tuxPanel.show(supportFragmentManager, "fyp_open_settings_intro");
                            }
                        }
                    };
                }
            };
        }
        c1207450hWh.LIZLLL(tokenCertWith, c19eg, fragment, c1207520hWo, interfaceC1207030hW1, null, interfaceC19359210oY);
    }
}
