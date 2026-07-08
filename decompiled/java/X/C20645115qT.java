package X;

import Y.ARunnableS35S1100000_31;
import android.app.Dialog;
import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.report.ClickReportInfo;
import com.ss.android.ugc.aweme.report.IOutreachFlowReport;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.aweme.report.ShowReportInfo;
import com.ss.android.ugc.feed.platform.popup.component.FeedPopupAbilityWrapper;
import com.ss.android.ugc.feed.platform.popup.dynamic.DynamicPopupInfo;
import com.ss.android.ugc.feed.platform.popup.dynamic.InteractionConfig;
import com.ss.android.ugc.feed.platform.popup.exp.FeedDynamicBugfixConfig;
import java.util.List;

/* JADX INFO: renamed from: X.15qT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20647615qs("feed_dynamic_popup_task")
public final class C20645115qT extends AbstractC20659715sp<Dialog> implements InterfaceC20660415sw, C0TXP {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final C19EG LL;
    public final C20644815qQ LLILLJJLI;
    public final C20645815qa LLILLL;
    public final DynamicPopupInfo LLILZ;
    public final C20646415qg LLILZIL;
    public DialogC20589315hT LLILZLL;
    public String LLIZ;
    public final int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public String LLJIJIL;

    @Override // X.AbstractC20656215sG
    public final boolean enableDuplication() {
        return true;
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        C20645815qa c20645815qa = this.LLILLL;
        if (c20645815qa != null) {
            C20645815qa.LIZ(c20645815qa, EnumC20645715qZ.TRIGGER, EnumC20645615qY.ON_TASK_RUN);
        }
        List<String> list = this.LLILZ.blockPageList;
        if (list != null) {
            String popupEnterFrom = this.LLIZ;
            if (popupEnterFrom == null || popupEnterFrom.length() == 0) {
                popupEnterFrom = getPopupEnterFrom();
            }
            if (C13LP.LJJJJ(popupEnterFrom, list)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("canShow: block page, info=");
                sbLIZ.append(this.LLILZ.LIZ());
                sbLIZ.append(", enterFrom=");
                sbLIZ.append(this.LLIZ);
                C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                C1877490yxP c1877490yxP = C1877490yxP.LIZ;
                EnumC20645715qZ enumC20645715qZ = EnumC20645715qZ.TRIGGER;
                DynamicPopupInfo dynamicPopupInfo = this.LLILZ;
                String str = dynamicPopupInfo.popupKey;
                String str2 = dynamicPopupInfo.triggerId;
                String str3 = dynamicPopupInfo.LIZ;
                String str4 = dynamicPopupInfo.triggerTiming;
                c1877490yxP.getClass();
                C1877490yxP.LIZ(enumC20645715qZ, "block_page", str, str2, str3, str4, null);
                return false;
            }
        }
        C20644815qQ c20644815qQ = this.LLILLJJLI;
        if (c20644815qQ.LIZJ == null || c20644815qQ.LIZLLL != EnumC20574215f2.LL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("canShow: spark not ready, info=");
            sbLIZ2.append(this.LLILZ.LIZ());
            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C1877490yxP c1877490yxP2 = C1877490yxP.LIZ;
            EnumC20645715qZ enumC20645715qZ2 = EnumC20645715qZ.TRIGGER;
            DynamicPopupInfo dynamicPopupInfo2 = this.LLILZ;
            String str5 = dynamicPopupInfo2.popupKey;
            String str6 = dynamicPopupInfo2.triggerId;
            String str7 = dynamicPopupInfo2.LIZ;
            String str8 = dynamicPopupInfo2.triggerTiming;
            c1877490yxP2.getClass();
            C1877490yxP.LIZ(enumC20645715qZ2, "spark_no_ready", str5, str6, str7, str8, null);
            return false;
        }
        if (!C1906580ziK.LJI()) {
            if (!this.LLJ) {
                return true;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("canShow: load failed, info=");
            sbLIZ3.append(this.LLILZ.LIZ());
            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("canShow: inBackground, info=");
        sbLIZ4.append(this.LLILZ.LIZ());
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
        C1877490yxP c1877490yxP3 = C1877490yxP.LIZ;
        EnumC20645715qZ enumC20645715qZ3 = EnumC20645715qZ.TRIGGER;
        DynamicPopupInfo dynamicPopupInfo3 = this.LLILZ;
        String str9 = dynamicPopupInfo3.popupKey;
        String str10 = dynamicPopupInfo3.triggerId;
        String str11 = dynamicPopupInfo3.LIZ;
        String str12 = dynamicPopupInfo3.triggerTiming;
        c1877490yxP3.getClass();
        C1877490yxP.LIZ(enumC20645715qZ3, "in_background", str9, str10, str11, str12, null);
        return false;
    }

    @Override // X.AbstractC20656215sG
    public final String getPopupEnterFrom() {
        String strLJIIIZ = C849850XVn.LIZIZ.LIZJ().LJIIIZ(this.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPopupEnterFrom: enterFrom=");
        sbLIZ.append(strLJIIIZ);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LLILZ.LIZ());
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZ = strLJIIIZ;
        return strLJIIIZ;
    }

    @Override // X.C0TXP
    public final String getSparkContainerId() {
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI.LIZJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) == null) {
            return null;
        }
        return sparkContext.containerId;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void onPopupDismiss() {
        SparkContext sparkContext;
        String str = this.LLJIJIL;
        if (str == null) {
            str = "on_popup_dismiss";
        }
        DialogC20589315hT dialogC20589315hT = this.LLILZLL;
        boolean z = dialogC20589315hT != null && dialogC20589315hT.LLILZIL;
        if (this.LLJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("task: duplicate doDismiss clickAction=");
            sbLIZ.append(str);
            sbLIZ.append(" dismissFromBackKey=");
            sbLIZ.append(z);
            C20589415hU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("task: doDismiss clickAction=");
            sbLIZ2.append(str);
            sbLIZ2.append(" dismissFromBackKey=");
            sbLIZ2.append(z);
            C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            this.LLJI = true;
            C20644815qQ c20644815qQ = this.LLILLJJLI;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c20644815qQ.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
                sparkContext.LJJIII(C0TXP.class);
            }
            c20644815qQ.LIZJ("dismiss");
            IOutreachFlowReport iOutreachFlowReport = (IOutreachFlowReport) PluggableExtentionKt.pluggableSpi$default(IOutreachFlowReport.class, false, false, false, 14, null);
            if (iOutreachFlowReport != null) {
                iOutreachFlowReport.LIZLLL(this.LLILZIL);
            }
        }
        if (((Boolean) C266130Abr.LIZ.getValue()).booleanValue()) {
            this.LL.setRequestedOrientation(-1);
        }
        InteractionConfig interactionConfig = this.LLILZ.interactionConfig;
        if (interactionConfig != null && interactionConfig.pauseVideo) {
            C0CAU.LIZIZ(new Runnable() { // from class: X.15hP
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedDynamicPopupTask@29be.onPopupDismiss$1");
                    try {
                        if (((FeedDynamicBugfixConfig) C20589115hR.LIZIZ.getValue()).enablePlayerPanel) {
                            C20588615hM.LIZ.getClass();
                            C20588615hM.LJ = false;
                            FeedPopupAbilityWrapper.LL.LJJLIIJ();
                        } else {
                            C1483410ohn.LJLJJI().LJIILLIIL();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedDynamicPopupTask@29be.onPopupDismiss$1");
                }
            });
        }
        C20645815qa c20645815qa = this.LLILLL;
        if (c20645815qa != null) {
            C20645815qa.LIZ(c20645815qa, EnumC20645715qZ.SHOW, EnumC20645615qY.ON_POPUP_DISMISS);
        }
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        SparkContext sparkContext;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPopupVisible, info=");
        sbLIZ.append(this.LLILZ.LIZ());
        C20589415hU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C20645815qa c20645815qa = this.LLILLL;
        if (c20645815qa != null) {
            C20645815qa.LIZ(c20645815qa, EnumC20645715qZ.SHOW, EnumC20645615qY.ON_TASK_SHOW);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI.LIZJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            sparkContext.LJJ(C0TXP.class, this);
        }
        IOutreachFlowReport iOutreachFlowReport = (IOutreachFlowReport) PluggableExtentionKt.pluggableSpi$default(IOutreachFlowReport.class, false, false, false, 14, null);
        if (iOutreachFlowReport != null) {
            C20646415qg c20646415qg = this.LLILZIL;
            String typeName = EnumC20654715s1.POPUP.getTypeName();
            DynamicPopupInfo dynamicPopupInfo = this.LLILZ;
            OutreachInfo outreachInfo = new OutreachInfo(typeName, dynamicPopupInfo.popupKey, dynamicPopupInfo.triggerId);
            String str = this.LLILZ.triggerTiming;
            iOutreachFlowReport.LIZJ(c20646415qg, outreachInfo, (str == null || str.length() == 0) ? this.LLILZ.LIZ : this.LLILZ.triggerTiming, this.LLIZ, new ShowReportInfo(String.valueOf(System.currentTimeMillis())));
        }
        InteractionConfig interactionConfig = this.LLILZ.interactionConfig;
        if (interactionConfig != null && interactionConfig.pauseVideo) {
            C0CAU.LIZIZ(new Runnable() { // from class: X.15hQ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedDynamicPopupTask@29be.onPopupVisible$1");
                    try {
                        if (((FeedDynamicBugfixConfig) C20589115hR.LIZIZ.getValue()).enablePlayerPanel) {
                            C20588615hM.LIZ.getClass();
                            C20588615hM.LJ = true;
                            FeedPopupAbilityWrapper.LL.pauseVideo();
                        } else {
                            C1483410ohn.LJLJJI().LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedDynamicPopupTask@29be.onPopupVisible$1");
                }
            });
        }
        if (((Boolean) C266130Abr.LIZ.getValue()).booleanValue()) {
            this.LL.setRequestedOrientation(14);
        }
    }

    public final void LJIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFail, info=");
        sbLIZ.append(this.LLILZ.LIZ());
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJ = true;
        LJIIJ("on_receive_error");
        C1877490yxP c1877490yxP = C1877490yxP.LIZ;
        EnumC20645715qZ enumC20645715qZ = EnumC20645715qZ.TRIGGER;
        DynamicPopupInfo dynamicPopupInfo = this.LLILZ;
        String str = dynamicPopupInfo.popupKey;
        String str2 = dynamicPopupInfo.triggerId;
        String str3 = dynamicPopupInfo.LIZ;
        String str4 = dynamicPopupInfo.triggerTiming;
        c1877490yxP.getClass();
        C1877490yxP.LIZ(enumC20645715qZ, "spark_receive_error_when_showing", str, str2, str3, str4, null);
    }

    @Override // X.C0TXP
    public final DynamicPopupInfo LJI() {
        return this.LLILZ;
    }

    @Override // X.C0TXP
    public final String getEnterFrom() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        MutableContextWrapper mutableContextWrapper;
        C20644815qQ c20644815qQ = this.LLILLJJLI;
        Context context = c688120Qyw.LIZ;
        if (c20644815qQ.LIZLLL != EnumC20574215f2.LLILLJJLI && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c20644815qQ.LIZJ) != null) {
            Context context2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext();
            if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
                mutableContextWrapper.setBaseContext(context);
            }
            DialogC20589315hT dialogC20589315hT = new DialogC20589315hT(this.LL, c688120Qyw.LIZ, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this);
            this.LLILZLL = dialogC20589315hT;
            return dialogC20589315hT;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkView is null, info=");
        sbLIZ.append(this.LLILZ.LIZ());
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    @Override // X.C0TXP
    public final void LJIIJ(String str) {
        C0CAU.LIZIZ(new ARunnableS35S1100000_31(this, str, 5));
    }

    @Override // X.C0TXP
    public final void LIZLLL(String str, boolean z) {
        IOutreachFlowReport iOutreachFlowReport = (IOutreachFlowReport) PluggableExtentionKt.pluggableSpi$default(IOutreachFlowReport.class, false, false, false, 14, null);
        if (iOutreachFlowReport != null) {
            iOutreachFlowReport.LIZIZ(this.LLILZIL, new ClickReportInfo(String.valueOf(System.currentTimeMillis()), null, str));
        }
        InterfaceC1589330rSd interfaceC1589330rSdLIZJ = C849850XVn.LIZIZ.LIZJ();
        DynamicPopupInfo dynamicPopupInfo = this.LLILZ;
        String str2 = dynamicPopupInfo.popupKey;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = dynamicPopupInfo.triggerId;
        if (str4 != null) {
            str3 = str4;
        }
        interfaceC1589330rSdLIZJ.LJJIIJZLJL(str2, str3, str, z);
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPopupFailed, errCode=");
        sbLIZ.append(i);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(str);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LLILZ.LIZ());
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C20644815qQ c20644815qQ = this.LLILLJJLI;
        c20644815qQ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onPopupShowFail, info=");
        sbLIZ2.append(c20644815qQ.LIZ.LIZ());
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        c20644815qQ.LIZJ("show_fail");
        C1877490yxP c1877490yxP = C1877490yxP.LIZ;
        EnumC20645715qZ enumC20645715qZ = EnumC20645715qZ.TRIGGER;
        DynamicPopupInfo dynamicPopupInfo = this.LLILZ;
        String str2 = dynamicPopupInfo.popupKey;
        String str3 = dynamicPopupInfo.triggerId;
        String str4 = dynamicPopupInfo.LIZ;
        String str5 = dynamicPopupInfo.triggerTiming;
        String strValueOf = String.valueOf(i);
        c1877490yxP.getClass();
        C1877490yxP.LIZ(enumC20645715qZ, "popup_show_failed", str2, str3, str4, str5, strValueOf);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.15qg] */
    public C20645115qT(C19EG c19eg, C20644815qQ c20644815qQ, int i, C20645815qa c20645815qa, InterfaceC20658015sY interfaceC20658015sY) {
        super(interfaceC20658015sY);
        this.LL = c19eg;
        this.LLILLJJLI = c20644815qQ;
        this.LLILLL = c20645815qa;
        c20644815qQ.LJI = this;
        this.LLILZ = c20644815qQ.LIZ;
        EnumC20654715s1.POPUP.getTypeName();
        System.currentTimeMillis();
        this.LLILZIL = new Object() { // from class: X.15qg
        };
        this.LLIZLLLIL = i;
    }
}
