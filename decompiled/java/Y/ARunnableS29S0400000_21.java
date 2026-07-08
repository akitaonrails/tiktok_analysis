package Y;

import X.AbstractC1388990mFV;
import X.AlertDialogC1377870lxZ;
import X.C013C;
import X.C0DW3;
import X.C12ES;
import X.C1360890lWB;
import X.C1373540lqa;
import X.C1373850lr5;
import X.C1388940mFQ;
import X.C1389910mGz;
import X.C1393550mMr;
import X.C1393570mMt;
import X.C1395690mQJ;
import X.C1895907bh;
import X.C1C7U;
import X.C21616519il;
import X.C2344009Gk;
import X.C384720F6o;
import X.C786410Ut5;
import X.InterfaceC1197120hG2;
import X.InterfaceC1375480lti;
import X.InterfaceC1388980mFU;
import X.InterfaceC1389000mFW;
import X.InterfaceC1393560mMs;
import X.InterfaceC1427630nFp;
import X.InterfaceC634840OvC;
import X.InterfaceC705550Rlx;
import X.ViewOnTouchListenerC1351130lGR;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.ss.android.ugc.aweme.multi.maker.PoiAnchorMaker;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS29S0400000_21 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0mFY, X.0qPp] */
    public final void LIZ$0() {
        C1388940mFQ c1388940mFQ = (C1388940mFQ) this.l0;
        final JSONObject jSONObject = (JSONObject) this.l1;
        c1388940mFQ.getClass();
        InterfaceC1389000mFW interfaceC1389000mFW = new InterfaceC1389000mFW() { // from class: X.0mFT
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                return null;
            }

            @Override // X.InterfaceC1389000mFW
            public final String getBackgroundColor() {
                return jSONObject.optString("backgroundColor");
            }

            @Override // X.InterfaceC1389000mFW
            public final String getFrontColor() {
                return jSONObject.optString("frontColor");
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() {
                return new JSONObject();
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
            public final List<String> provideParamList() {
                return C13BV.INSTANCE;
            }
        };
        ?? r3 = new AbstractC1388990mFV() { // from class: X.0mFY
            public final void LIZJ(InterfaceC1389000mFW interfaceC1389000mFW2, CompletionBlock completionBlock) {
                Activity activityLIZLLL;
                ActivityC2196911AyX activityC2196911AyX;
                TuxNavBar tuxNavBar;
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null && (activityLIZLLL instanceof ActivityC2196911AyX) && (activityC2196911AyX = (ActivityC2196911AyX) activityLIZLLL) != null) {
                    String frontColor = interfaceC1389000mFW2.getFrontColor();
                    String backgroundColor = interfaceC1389000mFW2.getBackgroundColor();
                    MinisFragment minisFragment = activityC2196911AyX.LL;
                    if (minisFragment != null) {
                        try {
                            if (minisFragment.hS() != null) {
                                EnumC993920byI enumC993920byI = minisFragment.LLJZIJLIL.LIZLLL;
                                EnumC993920byI enumC993920byI2 = EnumC993920byI.CUSTOM;
                                if (enumC993920byI != enumC993920byI2 && (tuxNavBar = minisFragment.LLJILJIL) != null) {
                                    tuxNavBar.setNavBackground(Color.parseColor(backgroundColor));
                                }
                                if (Intrinsics.LJFF(frontColor, "#ffffff")) {
                                    TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(minisFragment);
                                    tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(false);
                                    tuxImmersionBarLIZLLL.LJIIIZ(Color.parseColor(backgroundColor));
                                    tuxImmersionBarLIZLLL.LIZLLL();
                                    minisFragment.ZS(EnumC993930byJ.DEFAULT, true, false);
                                } else if (Intrinsics.LJFF(frontColor, "#000000")) {
                                    if (minisFragment.LLJZIJLIL.LIZLLL != enumC993920byI2) {
                                        TuxImmersionBar tuxImmersionBarLIZLLL2 = C1766560w4U.LIZLLL(minisFragment);
                                        tuxImmersionBarLIZLLL2.LIZIZ.LJIIJ(true);
                                        tuxImmersionBarLIZLLL2.LJIIIZ(Color.parseColor(backgroundColor));
                                        tuxImmersionBarLIZLLL2.LIZLLL();
                                    }
                                    minisFragment.ZS(EnumC993930byJ.DEFAULT, false, true);
                                }
                                minisFragment.XS(Color.parseColor(frontColor));
                                int color = Color.parseColor(frontColor);
                                TuxNavBar tuxNavBar2 = minisFragment.LLJILJIL;
                                if (tuxNavBar2 != null) {
                                    tuxNavBar2.LJJ(new AwS127S0101000_19(minisFragment, color, 26), minisFragment.kS(2131840883));
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("setNavigationBarColor, exception:");
                            sbLIZ.append(e);
                            C1720106oR.LIZ("minis-MinisFragment", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1388980mFU.class, null);
                ((InterfaceC1388980mFU) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }

            @Override // X.AbstractC1549150qPp
            public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                LIZJ((InterfaceC1389000mFW) xBaseParamModel, completionBlock);
            }
        };
        final Activity activity = (Activity) this.l2;
        r3.setBridgeContext(new InterfaceC634840OvC() { // from class: X.0mFR
            @Override // X.InterfaceC634840OvC
            public final <T> T LIZIZ(Class<T> cls) {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final C1543410qGZ LIZJ() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final String getContainerID() {
                return "";
            }

            @Override // X.InterfaceC634840OvC
            public final View getView() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final void sendEvent(String str, JSONObject jSONObject2) {
            }

            @Override // X.InterfaceC634840OvC
            public final Activity LIZLLL() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final Context getContext() {
                return activity;
            }
        });
        final C1388940mFQ c1388940mFQ2 = (C1388940mFQ) this.l0;
        final Number number = (Number) this.l3;
        r3.LIZJ(interfaceC1389000mFW, new CompletionBlock<InterfaceC1388980mFU>() { // from class: X.0mFS
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                Boolean boolIsSuccess;
                InterfaceC1388980mFU interfaceC1388980mFU = (InterfaceC1388980mFU) xBaseResultModel;
                C1388940mFQ c1388940mFQ3 = c1388940mFQ2;
                Number number2 = number;
                c1388940mFQ3.getClass();
                JSONObject jSONObject2 = new JSONObject();
                if (interfaceC1388980mFU != null) {
                    boolIsSuccess = interfaceC1388980mFU.isSuccess();
                } else {
                    boolIsSuccess = null;
                }
                jSONObject2.put("is_success", boolIsSuccess);
                c1388940mFQ3.LJFF(number2, jSONObject2);
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                Boolean boolIsSuccess;
                InterfaceC1388980mFU interfaceC1388980mFU = (InterfaceC1388980mFU) xBaseResultModel;
                C1388940mFQ c1388940mFQ3 = c1388940mFQ2;
                Number number2 = number;
                c1388940mFQ3.getClass();
                JSONObject jSONObject2 = new JSONObject();
                if (interfaceC1388980mFU != null) {
                    boolIsSuccess = interfaceC1388980mFU.isSuccess();
                } else {
                    boolIsSuccess = null;
                }
                jSONObject2.put("is_success", boolIsSuccess);
                c1388940mFQ3.LJ(number2, jSONObject2);
            }
        });
    }

    public final void LIZ$1() {
        PoiAnchorMaker poiAnchorMaker = (PoiAnchorMaker) ((InterfaceC1393560mMs) this.l0);
        if (poiAnchorMaker.LLJILJIL) {
            poiAnchorMaker.p1((C2344009Gk) this.l2);
            ((C1393570mMt) this.l3).LJIIIZ((InterfaceC1393560mMs) this.l0);
            return;
        }
        String strLIZLLL = poiAnchorMaker.LIZLLL();
        TextView textViewLJIIJJI = ((InterfaceC705550Rlx) this.l1).LJIIJJI();
        InterfaceC1197120hG2 interfaceC1197120hG2 = ((PoiAnchorMaker) ((InterfaceC1393560mMs) this.l0)).LLJI;
        String strLJJIZ = interfaceC1197120hG2 != null ? interfaceC1197120hG2.LJJIZ() : null;
        C0DW3.LIZ(strLIZLLL, textViewLJIIJJI, strLJJIZ, ((InterfaceC705550Rlx) this.l1).LJIL(), false, new C1393550mMr((C2344009Gk) this.l2, (InterfaceC705550Rlx) this.l1, (InterfaceC1393560mMs) this.l0, (C1393570mMt) this.l3));
    }

    public final void LIZ$2() throws JSONException {
        String string;
        C1895907bh c1895907bh = (C1895907bh) this.l0;
        if (c1895907bh.LIZ) {
            C1395690mQJ c1395690mQJ = (C1395690mQJ) this.l1;
            Activity activity = (Activity) this.l2;
            String str = c1895907bh.LIZIZ;
            c1395690mQJ.getClass();
            if (str == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0) {
                string = activity.getString(2131822364);
            }
            String string2 = activity.getString(2131822377, string);
            C1389910mGz c1389910mGz = new C1389910mGz(activity);
            c1389910mGz.LJI(R.style.y0);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZIZ = 0;
            c1360890lWB.LIZLLL = 3;
            c1389910mGz.LIZIZ(C384720F6o.LIZ(39.3d, C786410Ut5.L3(activity)));
            c1389910mGz.LJIIJ(string2);
            c1389910mGz.LJIIJJI();
        }
        ((C1395690mQJ) this.l1).LJFF((Number) this.l3, new JSONObject());
    }

    public static final void run$0(ARunnableS29S0400000_21 aRunnableS29S0400000_21) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeShareHelper$Companion@b6f8.showShareCancel$1");
        try {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            final Context context = (Context) aRunnableS29S0400000_21.l0;
            final Aweme aweme = (Aweme) aRunnableS29S0400000_21.l1;
            final SharePackage sharePackage = (SharePackage) aRunnableS29S0400000_21.l2;
            final AlertDialogC1377870lxZ alertDialogC1377870lxZ = (AlertDialogC1377870lxZ) aRunnableS29S0400000_21.l3;
            c1373540lqa.getClass();
            if (alertDialogC1377870lxZ != null && alertDialogC1377870lxZ.isShowing()) {
                alertDialogC1377870lxZ.LIZIZ();
                alertDialogC1377870lxZ.LJ((int) C12ES.LIZJ(240.0f, context), context);
                alertDialogC1377870lxZ.LLJI = new InterfaceC1375480lti() { // from class: X.0lth
                    @Override // X.InterfaceC1375480lti
                    public final void LIZ() {
                        Bundle bundle;
                        Bundle bundle2;
                        C1376010luZ.LIZ.getClass();
                        if (C1376010luZ.LIZIZ) {
                            C621180OYa.LIZ.LJJLIIIJLJLI();
                            ((IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class)).LIZ("download_cancel");
                        }
                        C1373540lqa c1373540lqa2 = C1373850lr5.LIZ;
                        Context context2 = context;
                        AlertDialogC1377870lxZ alertDialogC1377870lxZ2 = alertDialogC1377870lxZ;
                        c1373540lqa2.getClass();
                        C1373540lqa.LIZ(context2, alertDialogC1377870lxZ2);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        SharePackage sharePackage2 = sharePackage;
                        String string = null;
                        c2344009Gk.LJIIIIZZ("enter_from", (sharePackage2 == null || (bundle2 = sharePackage2.extras) == null) ? null : bundle2.getString("enter_from"));
                        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                        SharePackage sharePackage3 = sharePackage;
                        if (sharePackage3 != null && (bundle = sharePackage3.extras) != null) {
                            string = bundle.getString("download_method");
                        }
                        c2344009Gk.LJIIIIZZ("download_method", string);
                        C20684815ws.LJIILLIIL("download_cancel", c2344009Gk.LIZ);
                    }
                };
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeShareHelper$Companion@b6f8.showShareCancel$1");
    }

    public static final void run$1(ARunnableS29S0400000_21 aRunnableS29S0400000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MinisSetNavigationBarColorMethodNative@73c1.handle$1");
        try {
            aRunnableS29S0400000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisSetNavigationBarColorMethodNative@73c1.handle$1");
    }

    public static final void run$2(ARunnableS29S0400000_21 aRunnableS29S0400000_21) {
        boolean zLIZ;
        C1C7U.LIZ("QuickCommentDialog@b8b6.dismiss$2$1");
        try {
            C21616519il c21616519il = (C21616519il) aRunnableS29S0400000_21.l0;
            final ViewOnTouchListenerC1351130lGR viewOnTouchListenerC1351130lGR = (ViewOnTouchListenerC1351130lGR) aRunnableS29S0400000_21.l3;
            c21616519il.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0lGS
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f, float f2) {
                    C1440005kM.LIZ(new C453940Hr6(false, false, 4));
                    if (C1388190mED.LIZ(viewOnTouchListenerC1351130lGR.LLIZ) != null) {
                        Activity activityLIZ = C1388190mED.LIZ(viewOnTouchListenerC1351130lGR.LLIZ);
                        if (activityLIZ == null || !activityLIZ.isFinishing()) {
                            try {
                                super/*X.19GU*/.dismiss();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                }
            });
            ((C21616519il) aRunnableS29S0400000_21.l0).LJIIIZ();
            ((C21616519il) aRunnableS29S0400000_21.l1).LJIIIZ();
            C786410Ut5.Pd((ObjectAnimator) aRunnableS29S0400000_21.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("QuickCommentDialog@b8b6.dismiss$2$1");
    }

    public static final void run$3(ARunnableS29S0400000_21 aRunnableS29S0400000_21) {
        boolean zLIZ;
        C1C7U.LIZ("SingleDirectPresenter@e6de.onShowAnchor$3$1$1");
        try {
            aRunnableS29S0400000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SingleDirectPresenter@e6de.onShowAnchor$3$1$1");
    }

    public static final void run$4(ARunnableS29S0400000_21 aRunnableS29S0400000_21) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorBusinessApiImpl@f0d7.enableShowPhotoModeTemplate$1");
        try {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().canSupportAnchorFeatureBits((TemplateScene) aRunnableS29S0400000_21.l0, (ArrayList) aRunnableS29S0400000_21.l1, (ArrayList) aRunnableS29S0400000_21.l2, ((C013C) aRunnableS29S0400000_21.l3).element);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorBusinessApiImpl@f0d7.enableShowPhotoModeTemplate$1");
    }

    public static final void run$5(ARunnableS29S0400000_21 aRunnableS29S0400000_21) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorBusinessApiImpl@f0d7.enableShowTemplate$1");
        try {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().canSupportAnchorFeatureBits((TemplateScene) aRunnableS29S0400000_21.l0, (ArrayList) aRunnableS29S0400000_21.l1, (ArrayList) aRunnableS29S0400000_21.l2, ((C013C) aRunnableS29S0400000_21.l3).element);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorBusinessApiImpl@f0d7.enableShowTemplate$1");
    }

    public static final void run$6(ARunnableS29S0400000_21 aRunnableS29S0400000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MinisReportMissionRewardGrantedMethodNative@4077.handle$1");
        try {
            aRunnableS29S0400000_21.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisReportMissionRewardGrantedMethodNative@4077.handle$1");
    }

    public ARunnableS29S0400000_21(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
        this.l3 = obj4;
    }
}
