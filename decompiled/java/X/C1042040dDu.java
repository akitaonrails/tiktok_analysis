package X;

import Y.ARunnableS2S3300000_16;
import android.content.Context;
import android.os.Looper;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.ad.recording.settings.RecordingBOCRule;
import com.ss.android.ugc.aweme.ad.recording.settings.RecordingBOCRuleModel;
import com.ss.android.ugc.aweme.ad.recording.settings.RecordingBOCRulesModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042040dDu implements InterfaceC1035480d3K {
    public final C1035880d3y LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public String LIZJ = "";
    public String LIZLLL = "";
    public final AtomicLong LJ = new AtomicLong(0);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public final Map<String, AtomicLong> LJII = new LinkedHashMap();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 967));

    @Override // X.InterfaceC1035480d3K
    public final void onHide() {
        this.LIZIZ.set(false);
        Iterator it2 = ((LinkedHashMap) this.LJII).entrySet().iterator();
        while (it2.hasNext()) {
            ((AtomicLong) ((Map.Entry) it2.next()).getValue()).set(0L);
        }
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils != null && iAdWebUtils.nr(this.LIZ)) {
            this.LJ.set(0L);
        }
        this.LJFF.set(true);
    }

    @Override // X.InterfaceC1035480d3K
    public final void onShow() {
        this.LJFF.set(false);
    }

    public C1042040dDu(C1035880d3y c1035880d3y) {
        this.LIZ = c1035880d3y;
    }

    @Override // X.InterfaceC1035480d3K
    public final void LIZ(SparkContext sparkContext, String str, String str2, WebView webView, String str3) {
        Integer num;
        if (!this.LJFF.get() && !this.LIZIZ.get() && (num = ((RecordingBOCRulesModel) this.LJIIIIZZ.getValue()).enableEffectType) != null) {
            if (num.intValue() != 2 && (num.intValue() != 1 || this.LIZ.getIabType() != 1)) {
                return;
            }
            if (C1039940dAW.LIZ("load_url", str2)) {
                if ((!a0.LJJJIL(this.LIZLLL)) && Intrinsics.LJFF(this.LIZLLL, str)) {
                    return;
                }
                this.LIZJ = this.LIZLLL;
                this.LIZLLL = str;
                if (this.LJ.incrementAndGet() <= 1) {
                    return;
                }
            }
            C1042130dE3 c1042130dE3 = C1042130dE3.LIZ;
            String str4 = this.LIZLLL;
            c1042130dE3.getClass();
            C1042120dE2 c1042120dE2LIZ = C1042130dE3.LIZIZ.LIZ(str4);
            if (c1042120dE2LIZ != null) {
                C1042130dE3.LJIIJ(c1042120dE2LIZ);
            }
            if (C1042130dE3.LJFF == null) {
                String str5 = this.LIZLLL;
                AwemeRawAd awemeRawAd = this.LIZ.getAwemeRawAd();
                C1042060dDw c1042060dDw = new C1042060dDw(this, sparkContext, str, str2, webView, str3);
                C1042300dEK c1042300dEK = new C1042300dEK(awemeRawAd, str5);
                c1042300dEK.LL = c1042060dDw;
                C1042130dE3.LJ.LIZ(c1042300dEK);
                return;
            }
            LIZIZ(webView, sparkContext, str, this.LIZLLL, str2, str3);
        }
    }

    public final void LIZJ(C1023960ckk c1023960ckk, SSPResponse.Rule rule, String str, String str2, String str3) {
        new AdWebEventLogger(this.LIZ).logAd(c1023960ckk, this.LIZ.getAwemeRawAd(), new C1042080dDy(rule, str2, this, str, str3));
    }

    public final void LIZIZ(final WebView webView, final SparkContext sparkContext, String str, String str2, String str3, final String str4) {
        List<SSPResponse.Rule> list;
        List list2;
        int iIntValue;
        String str5;
        List<String> list3;
        FeatureCenterModel feature;
        C1042130dE3.LIZ.getClass();
        C1042120dE2 c1042120dE2LIZ = C1042130dE3.LIZIZ.LIZ(str2);
        if (c1042120dE2LIZ != null) {
            C1042130dE3.LJIIJ(c1042120dE2LIZ);
        }
        C1042120dE2 c1042120dE2 = C1042130dE3.LJFF;
        if (c1042120dE2 == null) {
            return;
        }
        String strLJFF = C1042130dE3.LJFF(str2);
        Locale locale = Locale.ROOT;
        String lowerCase = str3.toLowerCase(locale);
        if (Intrinsics.LJFF(lowerCase, "POST".toLowerCase(locale))) {
            list = c1042120dE2.LIZLLL;
        } else if (Intrinsics.LJFF(lowerCase, "GET".toLowerCase(locale))) {
            list = c1042120dE2.LIZJ;
        } else {
            list = c1042120dE2.LJ;
        }
        ArrayList<SSPResponse.Rule> arrayList = new ArrayList();
        for (SSPResponse.Rule rule : list) {
            if (C1039940dAW.LIZ(rule.type, str3)) {
                arrayList.add(rule);
            }
        }
        List<RecordingBOCRuleModel> list4 = ((RecordingBOCRulesModel) C1042050dDv.LIZIZ.getValue()).rules;
        if (list4 == null) {
            return;
        }
        AwemeRawAd awemeRawAd = this.LIZ.getAwemeRawAd();
        if (awemeRawAd == null || (feature = awemeRawAd.getFeature()) == null || (list2 = feature.bocJumpRuleTypeAllowList) == null) {
            list2 = C13BV.INSTANCE;
        }
        for (final SSPResponse.Rule rule2 : arrayList) {
            for (final RecordingBOCRuleModel recordingBOCRuleModel : list4) {
                if (recordingBOCRuleModel.ruleMatchList != null && list2.contains(recordingBOCRuleModel.ruleType)) {
                    if ((!a0.LJJJIL(strLJFF)) && (list3 = recordingBOCRuleModel.blackList) != null && (!list3.isEmpty())) {
                        Iterator<String> it2 = recordingBOCRuleModel.blackList.iterator();
                        while (it2.hasNext()) {
                            if (a0.LJJIIZI(strLJFF, it2.next(), false)) {
                                break;
                            }
                        }
                    }
                    for (RecordingBOCRule recordingBOCRule : recordingBOCRuleModel.ruleMatchList) {
                        if (C1039940dAW.LIZ(recordingBOCRule.ruleMethod, str3) && Intrinsics.LJFF(recordingBOCRule.ruleNames, rule2.name) && new Regex(rule2.regex).containsMatchIn(str)) {
                            AtomicLong atomicLong = (AtomicLong) ((LinkedHashMap) this.LJII).get(recordingBOCRuleModel.ruleType);
                            if (atomicLong == null) {
                                atomicLong = new AtomicLong(0L);
                            }
                            long jIncrementAndGet = atomicLong.incrementAndGet();
                            Integer num = recordingBOCRuleModel.recoTimes;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            long j = iIntValue;
                            if (1 <= j && j <= jIncrementAndGet) {
                                final String str6 = c1042120dE2.LJFF;
                                LIZJ(C2274611E1j.LIZ, rule2, str, str6, str4);
                                this.LIZIZ.set(true);
                                Integer num2 = recordingBOCRuleModel.jumpUrlType;
                                if (num2 != null && num2.intValue() == 1) {
                                    str5 = this.LIZJ;
                                } else {
                                    str5 = this.LIZLLL;
                                }
                                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                                    LIZLLL(sparkContext, webView, str5, rule2, recordingBOCRuleModel, str6, str4);
                                    return;
                                } else {
                                    final String str7 = str5;
                                    C786410Ut5.LJJZZIII(this.LJI, new Runnable() { // from class: X.0d8L
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("RecordingBOCRuleMatcher@5430.onRuleHit$1");
                                            try {
                                                this.LL.LIZLLL(sparkContext, webView, str7, rule2, recordingBOCRuleModel, str6, str4);
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("RecordingBOCRuleMatcher@5430.onRuleHit$1");
                                        }
                                    });
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void LIZLLL(SparkContext sparkContext, WebView webView, String str, SSPResponse.Rule rule, RecordingBOCRuleModel recordingBOCRuleModel, String str2, String str3) {
        Context contextLIZ;
        Boolean boolValueOf;
        InterfaceC1036370d4l interfaceC1036370d4l;
        C1038280d7q c1038280d7qLIZJ;
        if (webView == null || (contextLIZ = webView.getContext()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        ARunnableS2S3300000_16 aRunnableS2S3300000_16 = new ARunnableS2S3300000_16(str, this, str2, str3, contextLIZ, rule, 0);
        Integer num = recordingBOCRuleModel.ruleTextType;
        if (num != null && num.intValue() == 1) {
            if (sparkContext != null && (interfaceC1036370d4l = (InterfaceC1036370d4l) sparkContext.LJFF(InterfaceC1036370d4l.class)) != null && (c1038280d7qLIZJ = interfaceC1036370d4l.LIZJ(AdExternalGuideTriggerCondition.Type.LOGIN, new C1038290d7r(sparkContext, aRunnableS2S3300000_16))) != null) {
                boolValueOf = Boolean.valueOf(c1038280d7qLIZJ.LIZ());
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                return;
            }
        }
        PopupManager.LJIIZILJ(new C1072310e0j(webView, recordingBOCRuleModel, new AwS560S0100000_16(aRunnableS2S3300000_16, 968)), new C1668306g5("m10n_recording_boc_pop_up"));
    }
}
