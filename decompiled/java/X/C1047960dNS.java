package X;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebMultiTabModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentNodeStatusModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.web.experiment.IABPaymentConfigExp;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AwS6S3100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047960dNS implements InterfaceC1041400dCs {
    public final SparkContext LIZ;
    public final JSONObject LIZIZ;
    public final JSONArray LIZJ;
    public final Pattern LIZLLL;
    public final C1035880d3y LJ;
    public Boolean LJFF;
    public String LJI;
    public String LJII;
    public Boolean LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public PaymentNodeStatusModel LJIIJJI;

    public final boolean LJ() {
        PaymentModel paymentModel;
        C1035880d3y c1035880d3y = this.LJ;
        return c1035880d3y == null || (paymentModel = c1035880d3y.getPaymentModel()) == null || paymentModel.nodeStatus == null;
    }

    public final void LJI() {
        this.LJIIIIZZ = Boolean.TRUE;
        this.LJIIIZ = "first_party";
        this.LJIIJ = "first_party";
    }

    public final void LJII() {
        String str;
        PaymentModel paymentModel;
        PaymentModel paymentModel2;
        PaymentModel paymentModel3;
        PaymentModel paymentModel4;
        PaymentNodeStatusModel paymentNodeStatusModel;
        AdWebMultiTabModel multiTapModel;
        PaymentModel paymentModel5;
        PaymentModel paymentModel6;
        PaymentModel paymentModel7;
        C1035880d3y c1035880d3y = this.LJ;
        if (c1035880d3y != null && (paymentModel7 = c1035880d3y.getPaymentModel()) != null) {
            paymentModel7.setPaymentId(null);
        }
        C1035880d3y c1035880d3y2 = this.LJ;
        if (c1035880d3y2 != null && (paymentModel6 = c1035880d3y2.getPaymentModel()) != null) {
            paymentModel6.setNodeStatus(new PaymentNodeStatusModel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        C1035880d3y c1035880d3y3 = this.LJ;
        if (c1035880d3y3 != null && (paymentModel5 = c1035880d3y3.getPaymentModel()) != null) {
            paymentModel5.setTriggerSource("url_change");
        }
        C1035880d3y c1035880d3y4 = this.LJ;
        if (c1035880d3y4 != null && (paymentModel4 = c1035880d3y4.getPaymentModel()) != null && (paymentNodeStatusModel = paymentModel4.nodeStatus) != null) {
            C1035880d3y c1035880d3y5 = this.LJ;
            paymentNodeStatusModel.setInCheckoutProcess(((c1035880d3y5 == null || (multiTapModel = c1035880d3y5.getMultiTapModel()) == null) ? 0 : multiTapModel.getCurrentPageOrder()) + 1);
        }
        C1035880d3y c1035880d3y6 = this.LJ;
        if (c1035880d3y6 != null && (paymentModel3 = c1035880d3y6.getPaymentModel()) != null) {
            paymentModel3.setNodeNumber(0);
        }
        C1035880d3y c1035880d3y7 = this.LJ;
        if (c1035880d3y7 == null || (paymentModel2 = c1035880d3y7.getPaymentModel()) == null) {
            str = null;
        } else {
            str = null;
            paymentModel2.setPaymentMethod(null);
        }
        C1035880d3y c1035880d3y8 = this.LJ;
        if (c1035880d3y8 != null && (paymentModel = c1035880d3y8.getPaymentModel()) != null) {
            paymentModel.setPaymentType(str);
        }
        LJFF("in_checkout_process", "url_change", str);
    }

    public final void LJIIIIZZ() {
        C1035880d3y c1035880d3y;
        PaymentModel paymentModel;
        PaymentModel paymentModel2;
        PaymentModel paymentModel3;
        PaymentNodeStatusModel paymentNodeStatusModel;
        AdWebMultiTabModel multiTapModel;
        PaymentModel paymentModel4;
        PaymentModel paymentModel5;
        PaymentModel paymentModel6;
        PaymentModel paymentModel7;
        C1035880d3y c1035880d3y2 = this.LJ;
        if (c1035880d3y2 != null && (paymentModel6 = c1035880d3y2.getPaymentModel()) != null && paymentModel6.nodeNumber > 4) {
            C1035880d3y c1035880d3y3 = this.LJ;
            if (Intrinsics.LJFF((c1035880d3y3 == null || (paymentModel7 = c1035880d3y3.getPaymentModel()) == null) ? null : paymentModel7.paymentMethod, this.LJIIJ)) {
                return;
            }
        }
        C1035880d3y c1035880d3y4 = this.LJ;
        if ((c1035880d3y4 == null || (paymentModel5 = c1035880d3y4.getPaymentModel()) == null || paymentModel5.nodeStatus == null) && (c1035880d3y = this.LJ) != null && (paymentModel = c1035880d3y.getPaymentModel()) != null) {
            paymentModel.setNodeStatus(new PaymentNodeStatusModel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        C1035880d3y c1035880d3y5 = this.LJ;
        if (c1035880d3y5 != null && (paymentModel4 = c1035880d3y5.getPaymentModel()) != null) {
            paymentModel4.setTriggerSource("url_change");
        }
        C1035880d3y c1035880d3y6 = this.LJ;
        if (c1035880d3y6 != null && (paymentModel3 = c1035880d3y6.getPaymentModel()) != null && (paymentNodeStatusModel = paymentModel3.nodeStatus) != null) {
            C1035880d3y c1035880d3y7 = this.LJ;
            paymentNodeStatusModel.setHasPaymentIntention(((c1035880d3y7 == null || (multiTapModel = c1035880d3y7.getMultiTapModel()) == null) ? 0 : multiTapModel.getCurrentPageOrder()) + 1);
        }
        C1035880d3y c1035880d3y8 = this.LJ;
        if (c1035880d3y8 != null && (paymentModel2 = c1035880d3y8.getPaymentModel()) != null) {
            paymentModel2.setNodeNumber(4);
        }
        LJFF("has_payment_intention", "url_change", null);
    }

    public final void LJIIIZ() {
        C1035880d3y c1035880d3y;
        PaymentModel paymentModel;
        PaymentModel paymentModel2;
        PaymentModel paymentModel3;
        PaymentNodeStatusModel paymentNodeStatusModel;
        AdWebMultiTabModel multiTapModel;
        PaymentModel paymentModel4;
        PaymentModel paymentModel5;
        PaymentModel paymentModel6;
        C1035880d3y c1035880d3y2 = this.LJ;
        if (c1035880d3y2 != null && (paymentModel5 = c1035880d3y2.getPaymentModel()) != null && paymentModel5.nodeNumber > 4) {
            C1035880d3y c1035880d3y3 = this.LJ;
            if (Intrinsics.LJFF((c1035880d3y3 == null || (paymentModel6 = c1035880d3y3.getPaymentModel()) == null) ? null : paymentModel6.paymentMethod, this.LJIIJ)) {
                return;
            }
        }
        C1035880d3y c1035880d3y4 = this.LJ;
        if ((c1035880d3y4 == null || (paymentModel4 = c1035880d3y4.getPaymentModel()) == null || paymentModel4.nodeStatus == null) && (c1035880d3y = this.LJ) != null && (paymentModel = c1035880d3y.getPaymentModel()) != null) {
            paymentModel.setNodeStatus(new PaymentNodeStatusModel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        C1035880d3y c1035880d3y5 = this.LJ;
        if (c1035880d3y5 != null && (paymentModel3 = c1035880d3y5.getPaymentModel()) != null && (paymentNodeStatusModel = paymentModel3.nodeStatus) != null) {
            C1035880d3y c1035880d3y6 = this.LJ;
            paymentNodeStatusModel.setPaymentFinish(((c1035880d3y6 == null || (multiTapModel = c1035880d3y6.getMultiTapModel()) == null) ? 0 : multiTapModel.getCurrentPageOrder()) + 1);
        }
        C1035880d3y c1035880d3y7 = this.LJ;
        if (c1035880d3y7 != null && (paymentModel2 = c1035880d3y7.getPaymentModel()) != null) {
            paymentModel2.setNodeNumber(4);
        }
        LJFF("payment_finish", "url_change", null);
        C1035880d3y c1035880d3y8 = this.LJ;
        if (c1035880d3y8 != null) {
            c1035880d3y8.setPaymentModel(new PaymentModel(null, null, null, null, null, 0, null));
        }
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
    }

    public final void LJIIJ() {
        this.LJIIIIZZ = this.LJFF;
        this.LJIIIZ = this.LJI;
        this.LJIIJ = this.LJII;
    }

    public C1047960dNS(SparkContext sparkContext) {
        JSONArray jSONArrayNames;
        C1035880d3y c1035880d3y;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        this.LIZ = sparkContext;
        try {
            String str = ((IABPaymentConfigExp.IABPaymentConfig) IABPaymentConfigExp.LIZIZ.getValue()).thirdRegulars;
            this.LIZIZ = new JSONObject(str == null ? "" : str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        JSONObject jSONObject = this.LIZIZ;
        View viewE1 = null;
        if (jSONObject != null) {
            jSONArrayNames = jSONObject.names();
        } else {
            jSONArrayNames = null;
        }
        this.LIZJ = jSONArrayNames;
        String str2 = ((IABPaymentConfigExp.IABPaymentConfig) IABPaymentConfigExp.LIZIZ.getValue()).firstRegulars;
        if (str2 != null) {
            this.LIZLLL = PatternProtector.compile(str2);
        }
        SparkContext sparkContext2 = this.LIZ;
        if (sparkContext2 != null) {
            c1035880d3y = (C1035880d3y) sparkContext2.LJFF(C1035880d3y.class);
        } else {
            c1035880d3y = null;
        }
        this.LJ = c1035880d3y;
        SparkContext sparkContext3 = this.LIZ;
        if (sparkContext3 != null && (interfaceC1541990qEHLJIJJ = sparkContext3.LJIJJ()) != null) {
            viewE1 = interfaceC1541990qEHLJIJJ.e1();
        }
        boolean z = viewE1 instanceof WebView;
    }

    @Override // X.InterfaceC1041400dCs
    public final void LIZLLL(String str) {
        String str2;
        C1035880d3y c1035880d3y;
        PaymentModel paymentModel;
        String str3;
        PaymentModel paymentModel2;
        PaymentModel paymentModel3;
        PaymentModel paymentModel4;
        PaymentModel paymentModel5;
        PaymentNodeStatusModel paymentNodeStatusModel;
        int currentPageOrder;
        AdWebMultiTabModel multiTapModel;
        PaymentModel paymentModel6;
        String str4;
        String str5;
        String str6;
        PaymentModel paymentModel7;
        PaymentModel paymentModel8;
        PaymentModel paymentModel9;
        PaymentModel paymentModel10;
        PaymentModel paymentModel11;
        String str7;
        PaymentModel paymentModel12;
        String str8 = str;
        C1035880d3y c1035880d3y2 = this.LJ;
        if (c1035880d3y2 != null && (paymentModel11 = c1035880d3y2.getPaymentModel()) != null && paymentModel11.nodeNumber >= 3) {
            C1035880d3y c1035880d3y3 = this.LJ;
            if (c1035880d3y3 != null && (paymentModel12 = c1035880d3y3.getPaymentModel()) != null) {
                str7 = paymentModel12.paymentMethod;
            } else {
                str7 = null;
            }
            if (str8 == null) {
                str8 = this.LJII;
            }
            if (Intrinsics.LJFF(str7, str8)) {
                return;
            }
        }
        C1035880d3y c1035880d3y4 = this.LJ;
        if (c1035880d3y4 != null && (paymentModel10 = c1035880d3y4.getPaymentModel()) != null) {
            str2 = paymentModel10.nodeName;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, "first_party_payment_start")) {
            C1035880d3y c1035880d3y5 = this.LJ;
            if (c1035880d3y5 != null && (paymentModel9 = c1035880d3y5.getPaymentModel()) != null) {
                str4 = paymentModel9.nodeName;
            } else {
                str4 = null;
            }
            if (!Intrinsics.LJFF(str4, "third_party_payment_start")) {
                C1035880d3y c1035880d3y6 = this.LJ;
                if (c1035880d3y6 != null && (paymentModel8 = c1035880d3y6.getPaymentModel()) != null) {
                    str5 = paymentModel8.nodeName;
                } else {
                    str5 = null;
                }
                if (!Intrinsics.LJFF(str5, "has_payment_intention")) {
                    C1035880d3y c1035880d3y7 = this.LJ;
                    if (c1035880d3y7 != null && (paymentModel7 = c1035880d3y7.getPaymentModel()) != null) {
                        str6 = paymentModel7.nodeName;
                    } else {
                        str6 = null;
                    }
                    if (!Intrinsics.LJFF(str6, "payment_finish")) {
                        return;
                    }
                }
            }
        }
        C1035880d3y c1035880d3y8 = this.LJ;
        if ((c1035880d3y8 == null || (paymentModel6 = c1035880d3y8.getPaymentModel()) == null || paymentModel6.nodeStatus == null) && (c1035880d3y = this.LJ) != null && (paymentModel = c1035880d3y.getPaymentModel()) != null) {
            paymentModel.setNodeStatus(new PaymentNodeStatusModel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        C1035880d3y c1035880d3y9 = this.LJ;
        if (c1035880d3y9 != null && (paymentModel5 = c1035880d3y9.getPaymentModel()) != null && (paymentNodeStatusModel = paymentModel5.nodeStatus) != null) {
            C1035880d3y c1035880d3y10 = this.LJ;
            if (c1035880d3y10 != null && (multiTapModel = c1035880d3y10.getMultiTapModel()) != null) {
                currentPageOrder = multiTapModel.getCurrentPageOrder();
            } else {
                currentPageOrder = 0;
            }
            paymentNodeStatusModel.setPaymentSubmit(currentPageOrder + 1);
        }
        C1035880d3y c1035880d3y11 = this.LJ;
        if (c1035880d3y11 != null && (paymentModel4 = c1035880d3y11.getPaymentModel()) != null) {
            paymentModel4.setNodeNumber(3);
        }
        String str9 = null;
        LJFF("payment_submit", "js_callback", null);
        C1035880d3y c1035880d3y12 = this.LJ;
        if (c1035880d3y12 != null && (paymentModel3 = c1035880d3y12.getPaymentModel()) != null) {
            str3 = paymentModel3.paymentType;
        } else {
            str3 = null;
        }
        C1035880d3y c1035880d3y13 = this.LJ;
        if (c1035880d3y13 != null && (paymentModel2 = c1035880d3y13.getPaymentModel()) != null) {
            str9 = paymentModel2.paymentMethod;
        }
        this.LJIIIZ = str3;
        this.LJIIJ = str9;
        this.LJIIIIZZ = Boolean.TRUE;
    }

    @Override // X.InterfaceC1041400dCs
    public final void checkUrl(String str) {
        PaymentModel paymentModel;
        Pattern pattern;
        String string;
        String str2;
        C1035880d3y c1035880d3y;
        PaymentNodeStatusModel paymentNodeStatusModel;
        PaymentModel paymentModel2;
        C1035880d3y c1035880d3y2;
        PaymentModel paymentModel3;
        String str3 = null;
        if (!LJ()) {
            C1035880d3y c1035880d3y3 = this.LJ;
            if ((c1035880d3y3 != null && c1035880d3y3.isBack() == 1) || ((c1035880d3y = this.LJ) != null && c1035880d3y.isGoForward() == 1)) {
                PaymentNodeStatusModel paymentNodeStatusModel2 = new PaymentNodeStatusModel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                PaymentNodeStatusModel paymentNodeStatusModel3 = this.LJIIJJI;
                if (paymentNodeStatusModel3 != null && (c1035880d3y2 = this.LJ) != null) {
                    String str4 = this.LJIIJ;
                    String str5 = this.LJIIIZ;
                    c1035880d3y2.getPaymentModel().setNodeNumber(0);
                    this.LJIIIIZZ = null;
                    this.LJIIIZ = null;
                    this.LJIIJ = null;
                    if (paymentNodeStatusModel3.inCheckoutProcessTab <= c1035880d3y2.getMultiTapModel().getCurrentTabIndex() && paymentNodeStatusModel3.inCheckoutProcess <= c1035880d3y2.getMultiTapModel().getCurrentPageOrder()) {
                        paymentNodeStatusModel2.setInCheckoutProcess(paymentNodeStatusModel3.inCheckoutProcess);
                        paymentNodeStatusModel2.setInCheckoutProcessTab(paymentNodeStatusModel3.inCheckoutProcessTab);
                        if (paymentNodeStatusModel2.inCheckoutProcessTab > 0 || paymentNodeStatusModel2.inCheckoutProcess > 0) {
                            c1035880d3y2.getPaymentModel().setNodeNumber(0);
                            LJI();
                        }
                    } else {
                        paymentNodeStatusModel2.setInCheckoutProcess(0);
                        paymentNodeStatusModel2.setInCheckoutProcessTab(0);
                    }
                    if (paymentNodeStatusModel3.firstPartyPaymentInputClickTab <= c1035880d3y2.getMultiTapModel().getCurrentTabIndex() && paymentNodeStatusModel3.firstPartyPaymentInputClick <= c1035880d3y2.getMultiTapModel().getCurrentPageOrder()) {
                        paymentNodeStatusModel2.setFirstPartyPaymentInputClick(paymentNodeStatusModel3.firstPartyPaymentInputClick);
                        paymentNodeStatusModel2.setFirstPartyPaymentInputClickTab(paymentNodeStatusModel3.firstPartyPaymentInputClickTab);
                        if (paymentNodeStatusModel2.firstPartyPaymentInputClickTab > 0 || paymentNodeStatusModel2.inCheckoutProcess > 0) {
                            c1035880d3y2.getPaymentModel().setNodeNumber(1);
                            LJI();
                        }
                    } else {
                        paymentNodeStatusModel2.setFirstPartyPaymentInputClick(0);
                        paymentNodeStatusModel2.setFirstPartyPaymentInputClickTab(0);
                    }
                    if (paymentNodeStatusModel3.firstPartyPaymentStartTab <= c1035880d3y2.getMultiTapModel().getCurrentTabIndex() && paymentNodeStatusModel3.firstPartyPaymentStart <= c1035880d3y2.getMultiTapModel().getCurrentPageOrder()) {
                        paymentNodeStatusModel2.setFirstPartyPaymentStart(paymentNodeStatusModel3.firstPartyPaymentStart);
                        paymentNodeStatusModel2.setFirstPartyPaymentStartTab(paymentNodeStatusModel3.firstPartyPaymentStartTab);
                        if (paymentNodeStatusModel2.firstPartyPaymentStartTab > 0 || paymentNodeStatusModel2.firstPartyPaymentStart > 0) {
                            c1035880d3y2.getPaymentModel().setNodeNumber(2);
                            LJI();
                        }
                    } else {
                        paymentNodeStatusModel2.setFirstPartyPaymentStart(0);
                        paymentNodeStatusModel2.setFirstPartyPaymentStartTab(0);
                    }
                    if (paymentNodeStatusModel3.thirdPartyPaymentStartTab <= c1035880d3y2.getMultiTapModel().getCurrentTabIndex() && paymentNodeStatusModel3.thirdPartyPaymentStart <= c1035880d3y2.getMultiTapModel().getCurrentPageOrder()) {
                        paymentNodeStatusModel2.setThirdPartyPaymentStart(paymentNodeStatusModel3.thirdPartyPaymentStart);
                        paymentNodeStatusModel2.setThirdPartyPaymentStartTab(paymentNodeStatusModel3.thirdPartyPaymentStartTab);
                        if (paymentNodeStatusModel2.thirdPartyPaymentStartTab > 0 || paymentNodeStatusModel2.thirdPartyPaymentStart > 0) {
                            c1035880d3y2.getPaymentModel().setNodeNumber(2);
                            this.LJIIIIZZ = Boolean.TRUE;
                            this.LJIIIZ = "third_party";
                            this.LJIIJ = str4;
                        }
                    } else {
                        paymentNodeStatusModel2.setThirdPartyPaymentStart(0);
                        paymentNodeStatusModel2.setThirdPartyPaymentStartTab(0);
                    }
                    if (paymentNodeStatusModel3.paymentSubmitTab <= c1035880d3y2.getMultiTapModel().getCurrentTabIndex() && paymentNodeStatusModel3.paymentSubmit <= c1035880d3y2.getMultiTapModel().getCurrentPageOrder()) {
                        paymentNodeStatusModel2.setPaymentSubmit(paymentNodeStatusModel3.paymentSubmit);
                        paymentNodeStatusModel2.setPaymentSubmitTab(paymentNodeStatusModel3.paymentSubmitTab);
                        if (paymentNodeStatusModel2.paymentSubmitTab > 0 || paymentNodeStatusModel2.paymentSubmit > 0) {
                            c1035880d3y2.getPaymentModel().setNodeNumber(3);
                            if (Intrinsics.LJFF(str5, "first_party")) {
                                LJI();
                            } else {
                                this.LJIIIIZZ = Boolean.TRUE;
                                this.LJIIIZ = "third_party";
                                this.LJIIJ = str4;
                            }
                        }
                    } else {
                        paymentNodeStatusModel2.setPaymentSubmit(0);
                        paymentNodeStatusModel2.setPaymentSubmitTab(0);
                    }
                    if (paymentNodeStatusModel3.hasPaymentIntentionTab <= c1035880d3y2.getMultiTapModel().getCurrentTabIndex() && paymentNodeStatusModel3.hasPaymentIntention <= c1035880d3y2.getMultiTapModel().getCurrentPageOrder()) {
                        paymentNodeStatusModel2.setHasPaymentIntention(paymentNodeStatusModel3.hasPaymentIntention);
                        paymentNodeStatusModel2.setHasPaymentIntentionTab(paymentNodeStatusModel3.hasPaymentIntentionTab);
                        if (paymentNodeStatusModel2.hasPaymentIntentionTab > 0 || paymentNodeStatusModel2.hasPaymentIntention > 0) {
                            c1035880d3y2.getPaymentModel().setNodeNumber(4);
                            if (Intrinsics.LJFF(str5, "first_party")) {
                                LJI();
                            } else {
                                this.LJIIIIZZ = Boolean.TRUE;
                                this.LJIIIZ = "third_party";
                                this.LJIIJ = str4;
                            }
                        }
                    } else {
                        paymentNodeStatusModel2.setHasPaymentIntention(0);
                        paymentNodeStatusModel2.setHasPaymentIntentionTab(0);
                    }
                    if (paymentNodeStatusModel3.paymentFinishTab <= c1035880d3y2.getMultiTapModel().getCurrentTabIndex() && paymentNodeStatusModel3.paymentFinish <= c1035880d3y2.getMultiTapModel().getCurrentPageOrder()) {
                        paymentNodeStatusModel2.setPaymentFinish(paymentNodeStatusModel3.paymentFinish);
                        paymentNodeStatusModel2.setPaymentFinishTab(paymentNodeStatusModel3.paymentFinishTab);
                        if (paymentNodeStatusModel2.paymentFinishTab > 0 || paymentNodeStatusModel2.paymentFinish > 0) {
                            c1035880d3y2.getPaymentModel().setNodeNumber(4);
                            if (Intrinsics.LJFF(str5, "first_party")) {
                                LJI();
                            } else {
                                this.LJIIIIZZ = Boolean.TRUE;
                                this.LJIIIZ = "third_party";
                                this.LJIIJ = str4;
                            }
                        }
                    } else {
                        paymentNodeStatusModel2.setPaymentFinish(0);
                        paymentNodeStatusModel2.setPaymentSubmitTab(0);
                    }
                    C1035880d3y c1035880d3y4 = this.LJ;
                    if (c1035880d3y4 != null && (paymentModel3 = c1035880d3y4.getPaymentModel()) != null) {
                        paymentModel3.setNodeStatus(paymentNodeStatusModel2);
                        return;
                    }
                    return;
                }
                return;
            }
            C1035880d3y c1035880d3y5 = this.LJ;
            if (c1035880d3y5 != null && (paymentModel2 = c1035880d3y5.getPaymentModel()) != null) {
                paymentNodeStatusModel = paymentModel2.nodeStatus;
            } else {
                paymentNodeStatusModel = null;
            }
            this.LJIIJJI = paymentNodeStatusModel;
        }
        if (!a0.LJJJIL(str)) {
            this.LJFF = null;
            this.LJI = null;
            this.LJII = null;
            String path = UriProtector.parse(str).getPath();
            if (path == null) {
                path = "";
            }
            String host = UriProtector.parse(str).getHost();
            if (host == null) {
                host = "";
            }
            if (Intrinsics.LJFF(this.LJIIIZ, "third_party") && (str2 = this.LJIIJ) != null && a0.LJJIIZI(host, str2, false)) {
                this.LJFF = this.LJIIIIZZ;
                this.LJI = this.LJIIIZ;
                this.LJII = this.LJIIJ;
            } else {
                JSONArray jSONArray = this.LIZJ;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    loop0: for (int i = 0; i < length; i++) {
                        if (a0.LJJIIZI(host, JSONArrayProtectorUtils.getString(jSONArray, i), false)) {
                            try {
                                JSONObject jSONObject = this.LIZIZ;
                                if (jSONObject == null || (string = JSONObjectProtectorUtils.getString(jSONObject, JSONArrayProtectorUtils.getString(jSONArray, i))) == null) {
                                    string = "";
                                }
                                JSONArray jSONArray2 = new JSONArray(string);
                                int length2 = jSONArray2.length();
                                for (int i2 = 0; i2 < length2; i2++) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(host);
                                    sbLIZ.append(path);
                                    if (a0.LJJIIZI(C2188811AlT.LIZIZ(sbLIZ), JSONArrayProtectorUtils.getString(jSONArray2, i2), false)) {
                                        this.LJFF = Boolean.TRUE;
                                        this.LJI = "third_party";
                                        this.LJII = JSONArrayProtectorUtils.getString(jSONArray, i);
                                        break loop0;
                                    }
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    pattern = this.LIZLLL;
                    if (pattern != null && pattern.matcher(str).find()) {
                        this.LJFF = Boolean.TRUE;
                        this.LJI = "first_party";
                        this.LJII = "first_party";
                    }
                } else {
                    pattern = this.LIZLLL;
                    if (pattern != null) {
                        this.LJFF = Boolean.TRUE;
                        this.LJI = "first_party";
                        this.LJII = "first_party";
                    }
                }
            }
        }
        if (LJ()) {
            if (!Intrinsics.LJFF(this.LJFF, Boolean.TRUE)) {
                return;
            }
            if (Intrinsics.LJFF(this.LJI, "first_party")) {
                LJII();
                return;
            } else if (Intrinsics.LJFF(this.LJI, "third_party")) {
                LIZIZ(null, null, "url_change");
                return;
            }
        }
        if (!LJ()) {
            if (!Intrinsics.LJFF(this.LJFF, Boolean.TRUE)) {
                if (Intrinsics.LJFF(this.LJIIIZ, "first_party")) {
                    PaymentNodeStatusModel paymentNodeStatusModel4 = this.LJIIJJI;
                    if (paymentNodeStatusModel4 != null && paymentNodeStatusModel4.paymentSubmit == 0) {
                        if (paymentNodeStatusModel4.firstPartyPaymentStart != 0) {
                            LJIIIIZZ();
                        }
                    } else {
                        LJIIIZ();
                        LJIIIIZZ();
                    }
                    LJIIJ();
                    return;
                }
                if (Intrinsics.LJFF(this.LJIIIZ, "third_party")) {
                    C1035880d3y c1035880d3y6 = this.LJ;
                    if (c1035880d3y6 != null && (paymentModel = c1035880d3y6.getPaymentModel()) != null) {
                        str3 = paymentModel.triggerSource;
                    }
                    if (Intrinsics.LJFF(str3, "js_callback")) {
                        LJIIIIZZ();
                    }
                    LJIIIZ();
                    LJIIJ();
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(this.LJI, "first_party")) {
                if (Intrinsics.LJFF(this.LJIIIZ, "first_party")) {
                    PaymentNodeStatusModel paymentNodeStatusModel5 = this.LJIIJJI;
                    if (paymentNodeStatusModel5 == null || paymentNodeStatusModel5.firstPartyPaymentStart != 0) {
                        LJII();
                    }
                    LJIIJ();
                    return;
                }
                if (Intrinsics.LJFF(this.LJIIIZ, "third_party")) {
                    LJIIIZ();
                    LJII();
                    LJIIJ();
                    return;
                } else {
                    LJII();
                    LJIIJ();
                    return;
                }
            }
            if (Intrinsics.LJFF(this.LJI, "third_party")) {
                if (Intrinsics.LJFF(this.LJIIIZ, "first_party")) {
                    LIZIZ(null, null, "url_change");
                    LJIIJ();
                } else {
                    if (Intrinsics.LJFF(this.LJIIIZ, "third_party")) {
                        if (Intrinsics.LJFF(this.LJII, this.LJIIJ)) {
                            LJIIIIZZ();
                            LJIIJ();
                            return;
                        } else {
                            LJIIIZ();
                            LIZIZ(null, null, "url_change");
                            LJIIJ();
                            return;
                        }
                    }
                    LIZIZ(null, null, "url_change");
                }
            }
        }
    }

    @Override // X.InterfaceC1041400dCs
    public final void LIZJ(String str, String str2) {
        C1035880d3y c1035880d3y;
        PaymentModel paymentModel;
        PaymentModel paymentModel2;
        PaymentModel paymentModel3;
        PaymentNodeStatusModel paymentNodeStatusModel;
        int currentPageOrder;
        AdWebMultiTabModel multiTapModel;
        PaymentModel paymentModel4;
        PaymentModel paymentModel5;
        PaymentModel paymentModel6;
        PaymentModel paymentModel7;
        PaymentModel paymentModel8;
        String str3;
        PaymentModel paymentModel9;
        C1035880d3y c1035880d3y2 = this.LJ;
        if (c1035880d3y2 != null && (paymentModel8 = c1035880d3y2.getPaymentModel()) != null && paymentModel8.nodeNumber >= 1) {
            C1035880d3y c1035880d3y3 = this.LJ;
            if (c1035880d3y3 != null && (paymentModel9 = c1035880d3y3.getPaymentModel()) != null) {
                str3 = paymentModel9.paymentMethod;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, str2)) {
                return;
            }
        }
        C1035880d3y c1035880d3y4 = this.LJ;
        if ((c1035880d3y4 == null || (paymentModel7 = c1035880d3y4.getPaymentModel()) == null || paymentModel7.nodeStatus == null) && (c1035880d3y = this.LJ) != null && (paymentModel = c1035880d3y.getPaymentModel()) != null) {
            paymentModel.setNodeStatus(new PaymentNodeStatusModel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        C1035880d3y c1035880d3y5 = this.LJ;
        if (c1035880d3y5 != null && (paymentModel6 = c1035880d3y5.getPaymentModel()) != null) {
            paymentModel6.setPaymentType(str);
        }
        C1035880d3y c1035880d3y6 = this.LJ;
        if (c1035880d3y6 != null && (paymentModel5 = c1035880d3y6.getPaymentModel()) != null) {
            paymentModel5.setPaymentMethod(str2);
        }
        C1035880d3y c1035880d3y7 = this.LJ;
        if (c1035880d3y7 != null && (paymentModel4 = c1035880d3y7.getPaymentModel()) != null) {
            String strLIZ = C1017903yT.LIZ();
            strLIZ.toString();
            paymentModel4.setPaymentId(strLIZ);
        }
        C1035880d3y c1035880d3y8 = this.LJ;
        if (c1035880d3y8 != null && (paymentModel3 = c1035880d3y8.getPaymentModel()) != null && (paymentNodeStatusModel = paymentModel3.nodeStatus) != null) {
            C1035880d3y c1035880d3y9 = this.LJ;
            if (c1035880d3y9 != null && (multiTapModel = c1035880d3y9.getMultiTapModel()) != null) {
                currentPageOrder = multiTapModel.getCurrentPageOrder();
            } else {
                currentPageOrder = 0;
            }
            paymentNodeStatusModel.setFirstPartyPaymentInputClick(currentPageOrder + 1);
        }
        C1035880d3y c1035880d3y10 = this.LJ;
        if (c1035880d3y10 != null && (paymentModel2 = c1035880d3y10.getPaymentModel()) != null) {
            paymentModel2.setNodeNumber(1);
        }
        LJFF("first_party_payment_input_click", "js_callback", null);
        this.LJIIIZ = str;
        this.LJIIJ = str2;
        this.LJIIIIZZ = Boolean.TRUE;
    }

    @Override // X.InterfaceC1041400dCs
    public final void LIZ(String str, String str2, String str3) {
        C1035880d3y c1035880d3y;
        PaymentModel paymentModel;
        PaymentModel paymentModel2;
        PaymentModel paymentModel3;
        PaymentNodeStatusModel paymentNodeStatusModel;
        int currentPageOrder;
        AdWebMultiTabModel multiTapModel;
        PaymentModel paymentModel4;
        PaymentModel paymentModel5;
        PaymentModel paymentModel6;
        PaymentModel paymentModel7;
        PaymentModel paymentModel8;
        C1035880d3y c1035880d3y2 = this.LJ;
        String str4 = null;
        if (c1035880d3y2 != null && (paymentModel7 = c1035880d3y2.getPaymentModel()) != null && paymentModel7.nodeNumber >= 2) {
            C1035880d3y c1035880d3y3 = this.LJ;
            if (c1035880d3y3 != null && (paymentModel8 = c1035880d3y3.getPaymentModel()) != null) {
                str4 = paymentModel8.paymentMethod;
            }
            if (Intrinsics.LJFF(str4, str2)) {
                return;
            }
        }
        C1035880d3y c1035880d3y4 = this.LJ;
        if ((c1035880d3y4 == null || (paymentModel6 = c1035880d3y4.getPaymentModel()) == null || paymentModel6.nodeStatus == null) && (c1035880d3y = this.LJ) != null && (paymentModel = c1035880d3y.getPaymentModel()) != null) {
            paymentModel.setNodeStatus(new PaymentNodeStatusModel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        C1035880d3y c1035880d3y5 = this.LJ;
        if (c1035880d3y5 != null && (paymentModel5 = c1035880d3y5.getPaymentModel()) != null) {
            paymentModel5.setPaymentType(str);
        }
        C1035880d3y c1035880d3y6 = this.LJ;
        if (c1035880d3y6 != null && (paymentModel4 = c1035880d3y6.getPaymentModel()) != null) {
            paymentModel4.setPaymentMethod(str2);
        }
        C1035880d3y c1035880d3y7 = this.LJ;
        if (c1035880d3y7 != null && (paymentModel3 = c1035880d3y7.getPaymentModel()) != null && (paymentNodeStatusModel = paymentModel3.nodeStatus) != null) {
            C1035880d3y c1035880d3y8 = this.LJ;
            if (c1035880d3y8 != null && (multiTapModel = c1035880d3y8.getMultiTapModel()) != null) {
                currentPageOrder = multiTapModel.getCurrentPageOrder();
            } else {
                currentPageOrder = 0;
            }
            paymentNodeStatusModel.setFirstPartyPaymentStart(currentPageOrder + 1);
        }
        C1035880d3y c1035880d3y9 = this.LJ;
        if (c1035880d3y9 != null && (paymentModel2 = c1035880d3y9.getPaymentModel()) != null) {
            paymentModel2.setNodeNumber(2);
        }
        LJFF("first_party_payment_start", "js_callback", str3);
        this.LJIIIZ = str;
        this.LJIIJ = str2;
        this.LJIIIIZZ = Boolean.TRUE;
    }

    @Override // X.InterfaceC1041400dCs
    public final void LIZIZ(String str, String str2, String str3) {
        int i;
        int i2;
        int i3;
        PaymentModel paymentModel;
        PaymentModel paymentModel2;
        PaymentNodeStatusModel paymentNodeStatusModel;
        PaymentModel paymentModel3;
        PaymentNodeStatusModel paymentNodeStatusModel2;
        PaymentModel paymentModel4;
        PaymentNodeStatusModel paymentNodeStatusModel3;
        PaymentModel paymentModel5;
        PaymentNodeStatusModel paymentNodeStatusModel4;
        int currentPageOrder;
        AdWebMultiTabModel multiTapModel;
        PaymentModel paymentModel6;
        PaymentModel paymentModel7;
        String str4;
        PaymentModel paymentModel8;
        String str5;
        PaymentModel paymentModel9;
        PaymentModel paymentModel10;
        PaymentModel paymentModel11;
        PaymentNodeStatusModel paymentNodeStatusModel5;
        PaymentModel paymentModel12;
        PaymentNodeStatusModel paymentNodeStatusModel6;
        PaymentModel paymentModel13;
        PaymentNodeStatusModel paymentNodeStatusModel7;
        PaymentModel paymentModel14;
        String str6;
        PaymentModel paymentModel15;
        String str7 = str2;
        String str8 = str;
        String str9 = str3;
        C1035880d3y c1035880d3y = this.LJ;
        if (c1035880d3y != null && (paymentModel14 = c1035880d3y.getPaymentModel()) != null && paymentModel14.nodeNumber >= 2) {
            C1035880d3y c1035880d3y2 = this.LJ;
            if (c1035880d3y2 != null && (paymentModel15 = c1035880d3y2.getPaymentModel()) != null) {
                str6 = paymentModel15.paymentMethod;
            } else {
                str6 = null;
            }
            if (Intrinsics.LJFF(str6, str7)) {
                return;
            }
        }
        C1035880d3y c1035880d3y3 = this.LJ;
        if (c1035880d3y3 != null && (paymentModel13 = c1035880d3y3.getPaymentModel()) != null && (paymentNodeStatusModel7 = paymentModel13.nodeStatus) != null) {
            i = paymentNodeStatusModel7.inCheckoutProcess;
        } else {
            i = 0;
        }
        C1035880d3y c1035880d3y4 = this.LJ;
        if (c1035880d3y4 != null && (paymentModel12 = c1035880d3y4.getPaymentModel()) != null && (paymentNodeStatusModel6 = paymentModel12.nodeStatus) != null) {
            i2 = paymentNodeStatusModel6.firstPartyPaymentInputClick;
        } else {
            i2 = 0;
        }
        C1035880d3y c1035880d3y5 = this.LJ;
        if (c1035880d3y5 != null && (paymentModel11 = c1035880d3y5.getPaymentModel()) != null && (paymentNodeStatusModel5 = paymentModel11.nodeStatus) != null) {
            i3 = paymentNodeStatusModel5.firstPartyPaymentStart;
        } else {
            i3 = 0;
        }
        C1035880d3y c1035880d3y6 = this.LJ;
        if (c1035880d3y6 != null && (paymentModel10 = c1035880d3y6.getPaymentModel()) != null) {
            paymentModel10.setNodeStatus(new PaymentNodeStatusModel(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        }
        C1035880d3y c1035880d3y7 = this.LJ;
        if (c1035880d3y7 != null && (paymentModel9 = c1035880d3y7.getPaymentModel()) != null) {
            String strLIZ = C1017903yT.LIZ();
            strLIZ.toString();
            paymentModel9.setPaymentId(strLIZ);
        }
        C1035880d3y c1035880d3y8 = this.LJ;
        if (c1035880d3y8 != null && (paymentModel8 = c1035880d3y8.getPaymentModel()) != null) {
            if (str8 == null) {
                str5 = this.LJI;
            } else {
                str5 = str8;
            }
            paymentModel8.setPaymentType(str5);
        }
        C1035880d3y c1035880d3y9 = this.LJ;
        if (c1035880d3y9 != null && (paymentModel7 = c1035880d3y9.getPaymentModel()) != null) {
            if (str7 == null) {
                str4 = this.LJII;
            } else {
                str4 = str7;
            }
            paymentModel7.setPaymentMethod(str4);
        }
        C1035880d3y c1035880d3y10 = this.LJ;
        if (c1035880d3y10 != null && (paymentModel6 = c1035880d3y10.getPaymentModel()) != null) {
            paymentModel6.setTriggerSource(str9);
        }
        C1035880d3y c1035880d3y11 = this.LJ;
        if (c1035880d3y11 != null && (paymentModel5 = c1035880d3y11.getPaymentModel()) != null && (paymentNodeStatusModel4 = paymentModel5.nodeStatus) != null) {
            C1035880d3y c1035880d3y12 = this.LJ;
            if (c1035880d3y12 != null && (multiTapModel = c1035880d3y12.getMultiTapModel()) != null) {
                currentPageOrder = multiTapModel.getCurrentPageOrder();
            } else {
                currentPageOrder = 0;
            }
            paymentNodeStatusModel4.setThirdPartyPaymentStart(currentPageOrder + 1);
        }
        C1035880d3y c1035880d3y13 = this.LJ;
        if (c1035880d3y13 != null && (paymentModel4 = c1035880d3y13.getPaymentModel()) != null && (paymentNodeStatusModel3 = paymentModel4.nodeStatus) != null) {
            paymentNodeStatusModel3.setInCheckoutProcess(i);
        }
        C1035880d3y c1035880d3y14 = this.LJ;
        if (c1035880d3y14 != null && (paymentModel3 = c1035880d3y14.getPaymentModel()) != null && (paymentNodeStatusModel2 = paymentModel3.nodeStatus) != null) {
            paymentNodeStatusModel2.setFirstPartyPaymentInputClick(i2);
        }
        C1035880d3y c1035880d3y15 = this.LJ;
        if (c1035880d3y15 != null && (paymentModel2 = c1035880d3y15.getPaymentModel()) != null && (paymentNodeStatusModel = paymentModel2.nodeStatus) != null) {
            paymentNodeStatusModel.setFirstPartyPaymentStart(i3);
        }
        C1035880d3y c1035880d3y16 = this.LJ;
        if (c1035880d3y16 != null && (paymentModel = c1035880d3y16.getPaymentModel()) != null) {
            paymentModel.setNodeNumber(2);
        }
        if (str9 == null) {
            str9 = "url_change";
        }
        LJFF("third_party_payment_start", str9, null);
        if (str8 == null) {
            str8 = this.LJI;
        }
        if (str7 == null) {
            str7 = this.LJII;
        }
        this.LJIIIZ = str8;
        this.LJIIJ = str7;
        this.LJIIIIZZ = Boolean.TRUE;
    }

    public final void LJFF(String str, String str2, String str3) {
        PaymentNodeStatusModel paymentNodeStatusModel;
        AwemeRawAd awemeRawAd;
        WebView webView;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        PaymentModel paymentModel;
        PaymentModel paymentModel2;
        PaymentModel paymentModel3;
        C1035880d3y c1035880d3y = this.LJ;
        View viewE1 = null;
        if (c1035880d3y != null && (paymentModel3 = c1035880d3y.getPaymentModel()) != null) {
            paymentNodeStatusModel = paymentModel3.nodeStatus;
        } else {
            paymentNodeStatusModel = null;
        }
        this.LJIIJJI = paymentNodeStatusModel;
        C1035880d3y c1035880d3y2 = this.LJ;
        if (c1035880d3y2 != null && (paymentModel2 = c1035880d3y2.getPaymentModel()) != null) {
            paymentModel2.setNodeName(str);
        }
        C1035880d3y c1035880d3y3 = this.LJ;
        if (c1035880d3y3 != null && (paymentModel = c1035880d3y3.getPaymentModel()) != null) {
            paymentModel.setTriggerSource(str2);
        }
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(this.LJ);
        C1023960ckk c1023960ckk = C2265821DmO.LIZ;
        C1035880d3y c1035880d3y4 = this.LJ;
        if (c1035880d3y4 != null) {
            awemeRawAd = c1035880d3y4.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        adWebEventLogger.logAd(c1023960ckk, awemeRawAd, new AwS6S3100000_16(str, this, str2, str3, 3));
        SparkContext sparkContext = this.LIZ;
        if (sparkContext != null && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null) {
            viewE1 = interfaceC1541990qEHLJIJJ.e1();
        }
        if ((viewE1 instanceof WebView) && (webView = (WebView) viewE1) != null) {
            C1544770qIl.LIZ(webView, new AbstractC843740X8a() { // from class: X.0dNR
                @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                public final String LJFF(Uri uri, WebView webView2) throws JSONException {
                    String str4;
                    String str5;
                    String str6;
                    PaymentModel paymentModel4;
                    PaymentNodeStatusModel paymentNodeStatusModel2;
                    PaymentModel paymentModel5;
                    PaymentModel paymentModel6;
                    PaymentModel paymentModel7;
                    JSONObject jSONObject = new JSONObject();
                    C1035880d3y c1035880d3y5 = this.LIZ.LJ;
                    Object obj = "";
                    if (c1035880d3y5 == null || (paymentModel7 = c1035880d3y5.getPaymentModel()) == null || (str4 = paymentModel7.paymentId) == null) {
                        str4 = "";
                    }
                    jSONObject.put("payment_id", str4);
                    C1035880d3y c1035880d3y6 = this.LIZ.LJ;
                    if (c1035880d3y6 == null || (paymentModel6 = c1035880d3y6.getPaymentModel()) == null || (str5 = paymentModel6.paymentType) == null) {
                        str5 = "";
                    }
                    jSONObject.put("payment_type", str5);
                    C1035880d3y c1035880d3y7 = this.LIZ.LJ;
                    if (c1035880d3y7 == null || (paymentModel5 = c1035880d3y7.getPaymentModel()) == null || (str6 = paymentModel5.paymentMethod) == null) {
                        str6 = "";
                    }
                    jSONObject.put("payment_method", str6);
                    C1035880d3y c1035880d3y8 = this.LIZ.LJ;
                    if (c1035880d3y8 != null && (paymentModel4 = c1035880d3y8.getPaymentModel()) != null && (paymentNodeStatusModel2 = paymentModel4.nodeStatus) != null) {
                        obj = paymentNodeStatusModel2;
                    }
                    jSONObject.put("node_status", obj);
                    return C786410Ut5.J3(jSONObject);
                }
            });
        }
    }
}
