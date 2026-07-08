package Y;

import X.AbstractC1791620wiu;
import X.AbstractC1796840wrK;
import X.AbstractC1801820wzM;
import X.AbstractC1841200y0s;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0VI0;
import X.C0VIN;
import X.C1161920gLG;
import X.C1208540hYS;
import X.C13LP;
import X.C14J2;
import X.C1576600r86;
import X.C1792840wks;
import X.C1793950wmf;
import X.C1794640wnm;
import X.C1798380wto;
import X.C1798420wts;
import X.C1798620wuC;
import X.C1801000wy2;
import X.C1801790wzJ;
import X.C1801840wzO;
import X.C1802820x0y;
import X.C1803800x2Y;
import X.C1803830x2b;
import X.C1804840x4E;
import X.C1806690x7D;
import X.C1834790xqX;
import X.C1840650xzz;
import X.C1842360y2k;
import X.C1842470y2v;
import X.C1846390y9F;
import X.C1846400y9G;
import X.C1856450yPT;
import X.C1857080yQU;
import X.C1858060yS4;
import X.C1858660yT2;
import X.C1862330yYx;
import X.C19744212Mu;
import X.C1C7U;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C259800zU;
import X.C385340F8y;
import X.C426160GnO;
import X.C427690Gpr;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C631370Opb;
import X.C786410Ut5;
import X.EnumC1208550hYT;
import X.EnumC1791830wjF;
import X.EnumC1834800xqY;
import X.EnumC1834820xqa;
import X.InterfaceC1796870wrN;
import X.InterfaceC1801800wzK;
import X.InterfaceC1801830wzN;
import X.InterfaceC1804390x3V;
import X.InterfaceC634840OvC;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.live.walletnew.event.WalletRechargePanelRendered;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetProvider;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS60S0300000_27 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$1() {
        try {
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (SettingsManager.LJ("bonus_widget_enabled", 0) == 1) {
                Map<String, Bitmap> map = C1840650xzz.LIZ;
                C1840650xzz.LJ((Context) this.l1);
                C0VIN.LIZ((Context) this.l1, "bonus_widget_refresh_immediate", 0L, C0VI0.KEEP);
            } else {
                ((BonusWidgetProvider) this.l0).getClass();
                Map<String, Bitmap> map2 = C1840650xzz.LIZ;
                C1840650xzz.LIZLLL(C2097608Jq.LJ());
                C1840650xzz.LJ((Context) this.l1);
            }
        } finally {
            try {
            } catch (Throwable th2) {
            }
        }
        ((BroadcastReceiver.PendingResult) this.l2).finish();
    }

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
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int iOR = ((RechargeDialogNew) this.l0).OR();
        C1806690x7D value = ((RechargeDialogNew) this.l0).qS().LLLLJ.getValue();
        if (C500260Jjc.LJJIJIIJIL(value != null ? Boolean.valueOf(value.LIZ) : null)) {
            int iLIZIZ = ((int) (((iOR * 1.0f) / ((int) C497740JfY.LIZIZ(68.0f))) + 0.2f)) * 3;
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            List<Diamond> listLJIIJ = ((C1804840x4E) this.l1).LJIIJ(((RechargeDialogNew) this.l0).qS().g60());
            int size = listLJIIJ != null ? listLJIIJ.size() : 0;
            if (iLIZIZ > size) {
                iLIZIZ = size;
            }
            RechargeViewModel rechargeViewModelQS = ((RechargeDialogNew) this.l0).qS();
            RechargeDialogNew rechargeDialogNew = (RechargeDialogNew) this.l0;
            DataChannel dataChannel = rechargeDialogNew.LLJZ;
            C1803830x2b c1803830x2b = rechargeDialogNew.LLJLLL;
            Map<String, String> map = (c1803830x2b != null ? c1803830x2b : null).LIZJ;
            c1803800x2Y.getClass();
            C1803800x2Y.LJJJJIZL(iLIZIZ, rechargeViewModelQS, dataChannel, map);
        }
        DataChannel dataChannel2 = ((RechargeDialogNew) this.l0).LLJZ;
        if (dataChannel2 != null) {
            dataChannel2.zW(WalletRechargePanelRendered.class, new Pair(Boolean.TRUE, (InterfaceC1804390x3V) this.l2));
        }
    }

    public final void LIZ$2() {
        TakoAnswerBaseAssem takoAnswerBaseAssem = (TakoAnswerBaseAssem) this.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("step: doOnPreDraw:");
        sbLIZ.append(((C1858660yT2) C631370Opb.LIZ((TakoAnswerBaseAssem) this.l1)).LLILLJJLI);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        takoAnswerBaseAssem.getClass();
        HandlerHook.viewPostDelay((View) this.l2, new ARunnableS127S0100000_27((TakoAnswerBaseAssem) this.l1, 28), 200L);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.0wtr] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0wtr] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0wtr] */
    public final void LIZ$3() {
        final String strCertToken = ((Cert) this.l0).certToken();
        if (strCertToken == null) {
            strCertToken = "Unknown";
        }
        int i = C1798420wts.LIZ[((EnumC1208550hYT) this.l1).ordinal()];
        final int i2 = 1;
        if (i == 1) {
            C1798380wto c1798380wto = ((C1208540hYS) this.l2).LIZIZ;
            c1798380wto.getClass();
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            C1798620wuC.LJ("NetworkManager", "uploadConsentRecordForPopup", null);
            ?? r4 = new Object(i2, strCertToken) { // from class: X.0wtr
                public final String LIZ;
                public final int LIZIZ;
                public final String LIZJ;
                public final long LIZLLL;

                public final JSONObject LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Scene.SCENE_SERVICE, this.LIZ);
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZIZ);
                    jSONObject.put("timestamp", this.LIZLLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    jSONObject.put("certificate", this.LIZJ);
                    return jSONObject;
                }

                {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.LIZ = "gps_permission_downgrade";
                    this.LIZIZ = i2;
                    this.LIZJ = strCertToken;
                    this.LIZLLL = jCurrentTimeMillis;
                }
            };
            c1798380wto.LIZ(c1798380wto.LIZ.LIZ, c1798380wto.LIZIZ, r4.LIZ(), C2097908Jt.LIZJ(new Pair("sdk_version", "3.4.0-alpha.3-perm")));
            return;
        }
        final int i3 = 2;
        if (i == 2) {
            C1798380wto c1798380wto2 = ((C1208540hYS) this.l2).LIZIZ;
            c1798380wto2.getClass();
            C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
            C1798620wuC.LJ("NetworkManager", "uploadConsentRecordForConfirm", null);
            ?? r42 = new Object(i3, strCertToken) { // from class: X.0wtr
                public final String LIZ;
                public final int LIZIZ;
                public final String LIZJ;
                public final long LIZLLL;

                public final JSONObject LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Scene.SCENE_SERVICE, this.LIZ);
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZIZ);
                    jSONObject.put("timestamp", this.LIZLLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    jSONObject.put("certificate", this.LIZJ);
                    return jSONObject;
                }

                {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.LIZ = "gps_permission_downgrade";
                    this.LIZIZ = i3;
                    this.LIZJ = strCertToken;
                    this.LIZLLL = jCurrentTimeMillis;
                }
            };
            c1798380wto2.LIZ(c1798380wto2.LIZ.LIZ, c1798380wto2.LIZIZ, r42.LIZ(), C2097908Jt.LIZJ(new Pair("sdk_version", "3.4.0-alpha.3-perm")));
            return;
        }
        final int i4 = 3;
        if (i == 3) {
            C1798380wto c1798380wto3 = ((C1208540hYS) this.l2).LIZIZ;
            c1798380wto3.getClass();
            C1798620wuC c1798620wuC3 = C1798620wuC.LIZ;
            C1798620wuC.LJ("NetworkManager", "uploadConsentRecordForCancel", null);
            ?? r43 = new Object(i4, strCertToken) { // from class: X.0wtr
                public final String LIZ;
                public final int LIZIZ;
                public final String LIZJ;
                public final long LIZLLL;

                public final JSONObject LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Scene.SCENE_SERVICE, this.LIZ);
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZIZ);
                    jSONObject.put("timestamp", this.LIZLLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    jSONObject.put("certificate", this.LIZJ);
                    return jSONObject;
                }

                {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.LIZ = "gps_permission_downgrade";
                    this.LIZIZ = i4;
                    this.LIZJ = strCertToken;
                    this.LIZLLL = jCurrentTimeMillis;
                }
            };
            c1798380wto3.LIZ(c1798380wto3.LIZ.LIZ, c1798380wto3.LIZIZ, r43.LIZ(), C2097908Jt.LIZJ(new Pair("sdk_version", "3.4.0-alpha.3-perm")));
        }
    }

    public final void LIZ$4() throws JSONException {
        C1857080yQU c1857080yQU;
        TakoSug takoSug;
        C786410Ut5.LJJJJZ((C426160GnO) this.l0);
        final C1576600r86 c1576600r86 = (C1576600r86) this.l1;
        String str = c1576600r86.LLILLJJLI;
        List<C1856450yPT> list = (List) this.l2;
        String str2 = null;
        if (list != null) {
            C426160GnO c426160GnO = (C426160GnO) this.l0;
            for (final C1856450yPT c1856450yPT : list) {
                Context context = c1576600r86.getContext();
                if (context != null) {
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                    tuxTextView.setTextColorRes(R.attr.a1h);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView.setTuxFont(51);
                    tuxTextView.setText(c1856450yPT.LIZ());
                    final C14J2 c14j2 = new C14J2(0, 14, context, null);
                    c14j2.setGravity(16);
                    c14j2.addView(tuxTextView);
                    c426160GnO.addView(c14j2);
                    c14j2.setUI(new AwS606S0100000_27(c1576600r86, 345));
                    C427690Gpr.LJI(c14j2, null);
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0ySE
                        @Override // X.AbstractViewOnClickListenerC1173120gdK
                        public final void LIZ(View view) {
                            IMessageAbility messageAbility = c1576600r86.getMessageAbility();
                            if (messageAbility != null && messageAbility.oj()) {
                                C1858060yS4.LJ(c1856450yPT, C1558360qeg.LJ(c1576600r86, null), c14j2, null, null, null, 28);
                            }
                        }
                    }, c14j2);
                    if (str == null || str.length() == 0 || !Intrinsics.LJFF(str, c1856450yPT.LLILLJJLI.replyUuid)) {
                        final Map<String, String> mapLIZ = C1858060yS4.LIZ(c1856450yPT, null, null);
                        if (!c14j2.isLaidOut() || c14j2.isLayoutRequested()) {
                            c14j2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0ySF
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws JSONException {
                                    Map<String, String> commonParams;
                                    view.removeOnLayoutChangeListener(this);
                                    if (view.getWidth() > 0 && view.getHeight() > 0) {
                                        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                                        Map<String, String> map = mapLIZ;
                                        ITakoContextAbility contextAbility = c1576600r86.getContextAbility();
                                        if (contextAbility != null) {
                                            commonParams = contextAbility.getCommonParams();
                                        } else {
                                            commonParams = null;
                                        }
                                        c1862330yYx.mobTikbotQuickInteractionShow(map, commonParams);
                                    }
                                }
                            });
                        } else if (c14j2.getWidth() > 0 && c14j2.getHeight() > 0) {
                            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                            ITakoContextAbility contextAbility = c1576600r86.getContextAbility();
                            c1862330yYx.mobTikbotQuickInteractionShow(mapLIZ, contextAbility != null ? contextAbility.getCommonParams() : null);
                        }
                    }
                }
            }
        }
        C1576600r86 c1576600r862 = (C1576600r86) this.l1;
        List list2 = (List) this.l2;
        if (list2 != null && (c1857080yQU = (C1857080yQU) C13LP.LJJJLL(list2)) != null && (takoSug = c1857080yQU.LLILLJJLI) != null) {
            str2 = takoSug.replyUuid;
        }
        c1576600r862.LLILLJJLI = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$5() {
        if (((C1834790xqX) this.l0).LIZJ) {
            C786410Ut5.c2((C385340F8y) ((C259800zU) this.l1).element, 0);
            ((LiveHighLightPageFragment) this.l2).hT(EnumC1834820xqa.TEXT_STICKER, true, EnumC1834800xqY.PROCESSED);
        } else {
            C786410Ut5.c2((C385340F8y) ((C259800zU) this.l1).element, 8);
            ((LiveHighLightPageFragment) this.l2).hT(EnumC1834820xqa.TEXT_STICKER, true, EnumC1834800xqY.NORMAL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$6() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS60S0300000_27.LIZ$6():void");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0qPp, X.0wxu] */
    public final void LIZ$7() {
        ((C1801000wy2) this.l0).getClass();
        ?? r3 = new AbstractC1796840wrK() { // from class: X.0wxu
            public final void LIZJ(CompletionBlock completionBlock) {
                String containerID;
                InterfaceC634840OvC interfaceC634840OvC;
                SchemaParserData schemaParserData;
                String str;
                TiktokMinisQueryParams tiktokMinisQueryParams;
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null) {
                    abstractC1387200mCcLIZIZ.LIZIZ();
                }
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID = null;
                }
                SparkContext.Companion.getClass();
                C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
                if (((c1537480q70LIZIZ != null && (schemaParserData = (SchemaParserData) c1537480q70LIZIZ.LJFF(SchemaParserData.class)) != null) || ((interfaceC634840OvC = this.IBridgeSdkContext) != null && (schemaParserData = (SchemaParserData) interfaceC634840OvC.LIZIZ(SchemaParserData.class)) != null)) && (tiktokMinisQueryParams = schemaParserData.tiktokMinisParams) != null) {
                    str = tiktokMinisQueryParams.enterFrom;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "desktop_shortcut")) {
                    InterfaceC1796870wrN interfaceC1796870wrN = (InterfaceC1796870wrN) C1909107dp.LIZJ(InterfaceC1796870wrN.class, null);
                    Boolean bool = Boolean.TRUE;
                    interfaceC1796870wrN.setSuccess(bool);
                    interfaceC1796870wrN.setCanReceiveReward(bool);
                    interfaceC1796870wrN.setErrorCode(0);
                    completionBlock.onSuccess(interfaceC1796870wrN, "");
                    return;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1796870wrN.class, null);
                InterfaceC1796870wrN interfaceC1796870wrN2 = (InterfaceC1796870wrN) xBaseModelLIZJ;
                interfaceC1796870wrN2.setSuccess(Boolean.TRUE);
                interfaceC1796870wrN2.setCanReceiveReward(Boolean.FALSE);
                interfaceC1796870wrN2.setErrorCode(0);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }

            @Override // X.AbstractC1549150qPp
            public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                LIZJ(completionBlock);
            }
        };
        final Activity activity = (Activity) this.l1;
        r3.setBridgeContext(new InterfaceC634840OvC() { // from class: X.0wy5
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
            public final void sendEvent(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC634840OvC
            public final Activity LIZLLL() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final Context getContext() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final <T> T LIZIZ(Class<T> cls) {
                if (SchemaParserData.class.isAssignableFrom(cls)) {
                    return cls.cast(C2195221Avo.LJII);
                }
                return null;
            }
        });
        final C1801000wy2 c1801000wy2 = (C1801000wy2) this.l0;
        final Number number = (Number) this.l2;
        r3.LIZJ(new CompletionBlock<InterfaceC1796870wrN>() { // from class: X.0wy1
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                C1801000wy2 c1801000wy22 = c1801000wy2;
                Number number2 = number;
                c1801000wy22.getClass();
                c1801000wy22.LJFF(number2, C1801000wy2.LJII((InterfaceC1796870wrN) xBaseResultModel));
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                C1801000wy2 c1801000wy22 = c1801000wy2;
                Number number2 = number;
                c1801000wy22.getClass();
                c1801000wy22.LJ(number2, C1801000wy2.LJII((InterfaceC1796870wrN) xBaseResultModel));
            }
        });
    }

    public final void LIZ$8() {
        C1846390y9F c1846390y9F;
        int height = ((C1846400y9G) this.l0).LJFF().getHeight();
        TextView textViewLJFF = ((C1846400y9G) this.l0).LJFF();
        SpannableString spannableString = (SpannableString) this.l1;
        if (textViewLJFF.getWidth() <= 0) {
            c1846390y9F = new C1846390y9F(-1);
        } else {
            TuxTextView tuxTextView = new TuxTextView(textViewLJFF.getContext(), null, 6, 0);
            tuxTextView.setTextSize(0, textViewLJFF.getTextSize());
            tuxTextView.setLineSpacing(textViewLJFF.getLineSpacingExtra(), textViewLJFF.getLineSpacingMultiplier());
            tuxTextView.setTypeface(textViewLJFF.getTypeface());
            tuxTextView.setIncludeFontPadding(textViewLJFF.getIncludeFontPadding());
            tuxTextView.setText(spannableString);
            tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(textViewLJFF.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            tuxTextView.getMeasuredWidth();
            Integer numValueOf = Integer.valueOf(tuxTextView.getMeasuredHeight());
            tuxTextView.getLineCount();
            c1846390y9F = new C1846390y9F(numValueOf);
        }
        Integer num = c1846390y9F.LIZ;
        if (height != (num != null ? num.intValue() : height)) {
            ((C1846400y9G) this.l0).LIZLLL().setSelected(true);
            C786410Ut5.Q7(((C1846400y9G) this.l0).LIZLLL(), new ACListenerS91S0300000_27((C1846400y9G) this.l0, (SpannableString) this.l1, (SpannableString) this.l2, 13));
        } else {
            ((C1846400y9G) this.l0).LJFF().setText((SpannableString) this.l1);
            C786410Ut5.LLIL(((C1846400y9G) this.l0).LJ(), 8);
            C786410Ut5.LJZI(8, ((C1846400y9G) this.l0).LIZLLL());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$9() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            X.0wt0 r0 = (X.C1797880wt0) r0
            java.lang.Object r4 = r0.LJIIIIZZ
            java.lang.Object r3 = r5.l1
            X.0wt3 r3 = (X.C1797910wt3) r3
            java.lang.Object r1 = r5.l2
            X.00zU r1 = (X.C259800zU) r1
            monitor-enter(r4)
            boolean r0 = r0.LJFF(r3)     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L27
            java.lang.Runnable r2 = r3.LJIIIIZZ     // Catch: java.lang.Throwable -> L37
            T r1 = r1.element     // Catch: java.lang.Throwable -> L37
            r0 = 0
            if (r1 != 0) goto L1d
            goto L20
        L1d:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L37
            goto L21
        L20:
            r1 = r0
        L21:
            if (r2 != r1) goto L27
            r3.LJIIIIZZ = r0     // Catch: java.lang.Throwable -> L37
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            monitor-exit(r4)
            if (r0 == 0) goto L36
            java.lang.Object r1 = r5.l0
            X.0wt0 r1 = (X.C1797880wt0) r1
            java.lang.Object r0 = r5.l1
            X.0wt3 r0 = (X.C1797910wt3) r0
            r1.LJIIIZ(r0)
        L36:
            return
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS60S0300000_27.LIZ$9():void");
    }

    public static final void run$0(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("RechargeDialogNew@383d.onProductLoadSuccess$2");
        try {
            aRunnableS60S0300000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RechargeDialogNew@383d.onProductLoadSuccess$2");
    }

    public static final void run$1(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BonusWidgetProvider@bbff.onUpdate$1");
        try {
            aRunnableS60S0300000_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BonusWidgetProvider@bbff.onUpdate$1");
    }

    public static final void run$10(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHighLightPageFragment@5404.subscribeData$25$1");
        try {
            aRunnableS60S0300000_27.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPageFragment@5404.subscribeData$25$1");
    }

    public static final void run$11(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BottomInputAssem@df38.initVM$4$1");
        try {
            aRunnableS60S0300000_27.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomInputAssem@df38.initVM$4$1");
    }

    public static final void run$12(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        C1794640wnm c1794640wnm = (C1794640wnm) aRunnableS60S0300000_27.l0;
        C1792840wks c1792840wks = (C1792840wks) aRunnableS60S0300000_27.l1;
        C1793950wmf c1793950wmf = (C1793950wmf) aRunnableS60S0300000_27.l2;
        c1794640wnm.getClass();
        C1C7U.LIZ("IapObserverServiceImpl@105b.notifyPayCallback$1L");
        c1794640wnm.LIZJ(c1792840wks, c1793950wmf);
        C1C7U.LIZIZ("IapObserverServiceImpl@105b.notifyPayCallback$1L");
    }

    public static final void run$13(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        C1794640wnm c1794640wnm = (C1794640wnm) aRunnableS60S0300000_27.l0;
        EnumC1791830wjF enumC1791830wjF = (EnumC1791830wjF) aRunnableS60S0300000_27.l1;
        C1792840wks c1792840wks = (C1792840wks) aRunnableS60S0300000_27.l2;
        c1794640wnm.getClass();
        C1C7U.LIZ("IapObserverServiceImpl@105b.notifyInitCallback$1L");
        c1794640wnm.LIZIZ(enumC1791830wjF, c1792840wks);
        C1C7U.LIZIZ("IapObserverServiceImpl@105b.notifyInitCallback$1L");
    }

    public static final void run$14(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        C1794640wnm c1794640wnm = (C1794640wnm) aRunnableS60S0300000_27.l0;
        C1792840wks c1792840wks = (C1792840wks) aRunnableS60S0300000_27.l1;
        List<AbstractC1791620wiu> list = (List) aRunnableS60S0300000_27.l2;
        c1794640wnm.getClass();
        C1C7U.LIZ("IapObserverServiceImpl@105b.notifyQuerySubscriptionCallback$1L");
        c1794640wnm.LJI(c1792840wks, list);
        C1C7U.LIZIZ("IapObserverServiceImpl@105b.notifyQuerySubscriptionCallback$1L");
    }

    public static final void run$15(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MinisGetShortcutMissionRewardMethodNative@b872.handle$1");
        try {
            aRunnableS60S0300000_27.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisGetShortcutMissionRewardMethodNative@b872.handle$1");
    }

    public static final void run$16(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("ExpandableDescriptionViewStubDelegate@4cac.bindDescription$2");
        try {
            aRunnableS60S0300000_27.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExpandableDescriptionViewStubDelegate@4cac.bindDescription$2");
    }

    public static final void run$17(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceMusicUtils@e6e.addFullVisibilityListener$1");
        try {
            C19744212Mu.LIZ((LinearLayoutManager) aRunnableS60S0300000_27.l0, (List) aRunnableS60S0300000_27.l1, (Function2) aRunnableS60S0300000_27.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceMusicUtils@e6e.addFullVisibilityListener$1");
    }

    public static final void run$18(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("PrivacyDataManager@85c5.scheduleRetry$1");
        try {
            aRunnableS60S0300000_27.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrivacyDataManager@85c5.scheduleRetry$1");
    }

    public static final void run$2(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAnswerBaseAssem@27d.exposureViewForStart$2$invoke$lambda$2$$inlined$doOnPreDraw$1");
        try {
            aRunnableS60S0300000_27.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAnswerBaseAssem@27d.exposureViewForStart$2$invoke$lambda$2$$inlined$doOnPreDraw$1");
    }

    public static final void run$3(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("ConsentSession@23a9.reportConsent$1");
        try {
            aRunnableS60S0300000_27.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConsentSession@23a9.reportConsent$1");
    }

    public static final void run$4(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoSugFlowLayout@f932.bind$1$1");
        try {
            aRunnableS60S0300000_27.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoSugFlowLayout@f932.bind$1$1");
    }

    public static final void run$5(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("DialogExceptionHandler@424.openRechargePanel$1");
        try {
            FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(((C1802820x0y) aRunnableS60S0300000_27.l0).LIZ, true);
            if (fragmentManagerLJIL != null) {
                C1802820x0y c1802820x0y = (C1802820x0y) aRunnableS60S0300000_27.l0;
                DialogFragment dialogFragmentCreateRechargeDialogFragment = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).createRechargeDialogFragment(c1802820x0y.LIZ, null, (Bundle) aRunnableS60S0300000_27.l1, (C1803830x2b) aRunnableS60S0300000_27.l2);
                if (dialogFragmentCreateRechargeDialogFragment != null) {
                    dialogFragmentCreateRechargeDialogFragment.show(fragmentManagerLJIL, "RechargeDialog");
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DialogExceptionHandler@424.openRechargePanel$1");
    }

    public static final void run$6(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MinisOpenBalanceMethodNative@964d.handle$1");
        try {
            C1801790wzJ c1801790wzJ = (C1801790wzJ) aRunnableS60S0300000_27.l0;
            final JSONObject jSONObject = (JSONObject) aRunnableS60S0300000_27.l1;
            c1801790wzJ.getClass();
            InterfaceC1801830wzN interfaceC1801830wzN = new InterfaceC1801830wzN() { // from class: X.07Pm
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final Map<String, Object> convert() {
                    return null;
                }

                @Override // X.InterfaceC1801830wzN
                public final String getType() {
                    return jSONObject.optString("type");
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
            new AbstractC1801820wzM() { // from class: X.0wzO
                /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static void LIZJ(X.InterfaceC1801830wzN r11, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r12) {
                    /*
                        Method dump skipped, instruction units count: 240
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1801840wzO.LIZJ(X.0wzN, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock):void");
                }

                @Override // X.AbstractC1549150qPp
                public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                    LIZJ((InterfaceC1801830wzN) xBaseParamModel, completionBlock);
                }
            };
            final C1801790wzJ c1801790wzJ2 = (C1801790wzJ) aRunnableS60S0300000_27.l0;
            final Number number = (Number) aRunnableS60S0300000_27.l2;
            C1801840wzO.LIZJ(interfaceC1801830wzN, new CompletionBlock<InterfaceC1801800wzK>() { // from class: X.0wzL
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                    C1801790wzJ c1801790wzJ3 = c1801790wzJ2;
                    Number number2 = number;
                    c1801790wzJ3.getClass();
                    c1801790wzJ3.LJFF(number2, C1801790wzJ.LJII((InterfaceC1801800wzK) xBaseResultModel));
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                    C1801790wzJ c1801790wzJ3 = c1801790wzJ2;
                    Number number2 = number;
                    c1801790wzJ3.getClass();
                    c1801790wzJ3.LJ(number2, C1801790wzJ.LJII((InterfaceC1801800wzK) xBaseResultModel));
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisOpenBalanceMethodNative@964d.handle$1");
    }

    public static final void run$7(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("AnimationManager@8c7d.play$1");
        try {
            C20441214yg.LIZIZ("Ranking Entrance Unification", "Game live is foreground， continue play animation");
            ((C1842360y2k) aRunnableS60S0300000_27.l0).LJFF((C1842470y2v) aRunnableS60S0300000_27.l1, (C1842470y2v) aRunnableS60S0300000_27.l2);
            ((C1842360y2k) aRunnableS60S0300000_27.l0).LJIIZILJ = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnimationManager@8c7d.play$1");
    }

    public static final void run$8(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("AnimationManager@8c7d.play$2");
        try {
            ((C1842360y2k) aRunnableS60S0300000_27.l0).LJFF((C1842470y2v) aRunnableS60S0300000_27.l1, (C1842470y2v) aRunnableS60S0300000_27.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnimationManager@8c7d.play$2");
    }

    public static final void run$9(ARunnableS60S0300000_27 aRunnableS60S0300000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BaseAppWidgetProvider@f288.onUpdate$1");
        try {
            ((AbstractC1841200y0s) aRunnableS60S0300000_27.l0).LJ((Context) aRunnableS60S0300000_27.l1, false, (int[]) aRunnableS60S0300000_27.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseAppWidgetProvider@f288.onUpdate$1");
    }

    public ARunnableS60S0300000_27(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public ARunnableS60S0300000_27(C1801000wy2 c1801000wy2, JSONObject jSONObject, Activity activity, Number number, int i) {
        this.$t = i;
        this.l0 = c1801000wy2;
        this.l1 = activity;
        this.l2 = number;
    }
}
