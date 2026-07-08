package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.Advertiser;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AgeGateResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.CommercialComplianceSettings;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscribeResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.UnsubscribeResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.ComplianceVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.ThirdPartyAdvertiserList;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty.ThirdPartyVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.viewmodel.AdTopicsViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdSettingsData;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Usq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786260Usq implements InterfaceC594300NSq {
    public final int $t;
    public Object l0;

    public static final void onFailure$0(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
    }

    @Override // X.InterfaceC594300NSq
    public final void onFailure(C0X9S<Advertiser> c0x9s, Throwable th) {
        switch (this.$t) {
            case 0:
                onFailure$0(this, c0x9s, th);
                break;
            case 1:
                onFailure$1(this, c0x9s, th);
                break;
            case 2:
                onFailure$2(this, c0x9s, th);
                break;
            case 3:
                onFailure$3(this, c0x9s, th);
                break;
            case 4:
                onFailure$4(this, c0x9s, th);
                break;
            case 5:
                onFailure$5(this, c0x9s, th);
                break;
            case 6:
                onFailure$6(this, c0x9s, th);
                break;
            case 7:
                onFailure$7(this, c0x9s, th);
                break;
            case 8:
                onFailure$8(this, c0x9s, th);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onFailure$9(this, c0x9s, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onFailure$10(this, c0x9s, th);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onFailure$11(this, c0x9s, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onFailure$12(this, c0x9s, th);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onFailure$13(this, c0x9s, th);
                break;
            case 14:
                onFailure$14(this, c0x9s, th);
                break;
            case 15:
                onFailure$15(this, c0x9s, th);
                break;
        }
    }

    @Override // X.InterfaceC594300NSq
    public final void onResponse(C0X9S<Advertiser> c0x9s, C0X52<Advertiser> c0x52) {
        switch (this.$t) {
            case 0:
                onResponse$0(this, c0x9s, c0x52);
                break;
            case 1:
                onResponse$1(this, c0x9s, c0x52);
                break;
            case 2:
                onResponse$2(this, c0x9s, c0x52);
                break;
            case 3:
                onResponse$3(this, c0x9s, c0x52);
                break;
            case 4:
                onResponse$4(this, c0x9s, c0x52);
                break;
            case 5:
                onResponse$5(this, c0x9s, c0x52);
                break;
            case 6:
                onResponse$6(this, c0x9s, c0x52);
                break;
            case 7:
                onResponse$7(this, c0x9s, c0x52);
                break;
            case 8:
                onResponse$8(this, c0x9s, c0x52);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onResponse$9(this, c0x9s, c0x52);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onResponse$10(this, c0x9s, c0x52);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onResponse$11(this, c0x9s, c0x52);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onResponse$12(this, c0x9s, c0x52);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onResponse$13(this, c0x9s, c0x52);
                break;
            case 14:
                onResponse$14(this, c0x9s, c0x52);
                break;
            case 15:
                onResponse$15(this, c0x9s, c0x52);
                break;
        }
    }

    public C786260Usq(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFailure$1(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        int i = ComplianceVM.LLJI;
        if (i > 0) {
            ComplianceVM.LLJI = i - 1;
            ((ComplianceVM) c786260Usq.l0).wQ2();
        }
    }

    public static final void onFailure$10(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        C1389890mGx c1389890mGx = new C1389890mGx((AdSettingsActivity) c786260Usq.l0);
        c1389890mGx.LJIIJ("Request Failed");
        c1389890mGx.LJIIJJI();
    }

    public static final void onFailure$11(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        ((ComplianceVM) c786260Usq.l0).LLILLL.setValue(Boolean.FALSE);
    }

    public static final void onFailure$12(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        ((InterfaceC746190TOv) c786260Usq.l0).onFail();
    }

    public static final void onFailure$13(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        ((InterfaceC746140TOq) c786260Usq.l0).onFail();
    }

    public static final void onFailure$14(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        C0TGK c0tgk = (C0TGK) c786260Usq.l0;
        if (c0tgk != null) {
            c0tgk.onFailed();
        }
    }

    public static final void onFailure$15(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        C0TGK c0tgk = (C0TGK) c786260Usq.l0;
        if (c0tgk != null) {
            c0tgk.onFailed();
        }
    }

    public static final void onFailure$2(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBenefits");
        sbLIZ.append(th);
        C1022620cia.LIZ("SubscriptionVM", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onFailure$3(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        ((SubscriptionVM) c786260Usq.l0).LLILLJJLI.setValue(null);
    }

    public static final void onFailure$4(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        ((C0TGR) c786260Usq.l0).onFail();
    }

    public static final void onFailure$5(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        ((ThirdPartyVM) c786260Usq.l0).LLILLJJLI.setValue(new ThirdPartyAdvertiserList(new ArrayList(), false, ""));
    }

    public static final void onFailure$6(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSensitiveTopics onFailure: ");
        sbLIZ.append(th.getStackTrace());
        C1022620cia.LIZ("AdTopicsViewModel", C2188811AlT.LIZIZ(sbLIZ));
        int i = AdTopicsViewModel.LLILZLL;
        if (i > 0) {
            AdTopicsViewModel.LLILZLL = i - 1;
            ((AdTopicsViewModel) c786260Usq.l0).vQ2();
        }
    }

    public static final void onFailure$7(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        C786410Ut5.LJIIJ((DialogC1389620mGW) ((AdSettingsActivity) c786260Usq.l0).LLJJIII.getValue());
        ((AdSettingsActivity) c786260Usq.l0).finish();
    }

    public static final void onFailure$8(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        C1389890mGx c1389890mGx = new C1389890mGx((AdSettingsActivity) c786260Usq.l0);
        c1389890mGx.LJIIJ("Request Failed");
        c1389890mGx.LJIIJJI();
    }

    public static final void onFailure$9(C786260Usq c786260Usq, C0X9S c0x9s, Throwable th) {
        C1389890mGx c1389890mGx = new C1389890mGx((AdSettingsActivity) c786260Usq.l0);
        c1389890mGx.LJIIJ("Request Failed");
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onResponse$0(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52 != null && c0x52.LIZJ()) {
            ((AdvertiserVM) c786260Usq.l0).LLILLJJLI.setValue(c0x52.LIZIZ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onResponse$1(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((ComplianceVM) c786260Usq.l0).LLIZLLLIL.setValue(c0x52.LIZIZ);
            ComplianceVM.LLJI = 3;
            return;
        }
        int i = ComplianceVM.LLJI;
        if (i <= 0) {
            return;
        }
        ComplianceVM.LLJI = i - 1;
        ((ComplianceVM) c786260Usq.l0).wQ2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$10(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        T t;
        n nVarLLLZIL;
        k kVarLJJIIZ;
        if (c0x52 != null && c0x52.LIZJ() && (t = c0x52.LIZIZ) != 0 && (nVarLLLZIL = ((AdSettingsActivity) c786260Usq.l0).LLLZIL((String) t)) != null && (kVarLJJIIZ = nVarLLLZIL.LJJIIZ("status_code")) != null) {
            int iLJIIJJI = kVarLJJIIZ.LJIIJJI();
            if (iLJIIJJI != 4016) {
                if (iLJIIJJI == 4017) {
                    AdSettingsActivity adSettingsActivity = (AdSettingsActivity) c786260Usq.l0;
                    adSettingsActivity.LLLZLZ(adSettingsActivity.getResources().getString(2131845630), ((AdSettingsActivity) c786260Usq.l0).getResources().getString(R.string.gm7), ((AdSettingsActivity) c786260Usq.l0).getResources().getString(2131845631), new AwS556S0100000_12((AdSettingsActivity) c786260Usq.l0, 766), true);
                    return;
                }
                return;
            }
            AdSettingsActivity adSettingsActivity2 = (AdSettingsActivity) c786260Usq.l0;
            adSettingsActivity2.LLLZLZ(adSettingsActivity2.getResources().getString(2131845629), ((AdSettingsActivity) c786260Usq.l0).getResources().getString(2131830645), "", AFwS199S0000000_12.get$arr$(290), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$11(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((ComplianceVM) c786260Usq.l0).LLILLJJLI.setValue(((CommercialComplianceSettings) c0x52.LIZIZ).getTherePartyData());
            ((ComplianceVM) c786260Usq.l0).LLILLL.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$12(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ() && Intrinsics.LJFF(((AgeGateResponse) c0x52.LIZIZ).isAdult(), Boolean.TRUE)) {
            ((InterfaceC746190TOv) c786260Usq.l0).onSuccess();
        } else {
            ((InterfaceC746190TOv) c786260Usq.l0).onFail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$13(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((InterfaceC746140TOq) c786260Usq.l0).LIZ((SubscribeResponse) c0x52.LIZIZ);
        } else {
            ((InterfaceC746140TOq) c786260Usq.l0).onFail();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$14(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        T t;
        int iLJIIJJI;
        n nVar;
        k kVarLJJIIZ;
        if (c0x52 != null && c0x52.LIZJ() && (t = c0x52.LIZIZ) != 0) {
            n nVarLIZ = C0TGH.LIZ((String) t);
            k kVarLJJIIJZLJL = null;
            if (nVarLIZ != null) {
                try {
                    h hVarLJJIIZI = nVarLIZ.LJJIIZI("settings");
                    if (hVarLJJIIZI != null) {
                        kVarLJJIIJZLJL = hVarLJJIIZI.LJJIIJZLJL(0);
                    }
                } catch (UnsupportedOperationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0TGK c0tgk = (C0TGK) c786260Usq.l0;
                    if (c0tgk != null) {
                        c0tgk.onFailed();
                    }
                    C1AF0.LJ(e);
                    return;
                }
            }
            if ((kVarLJJIIJZLJL instanceof n) && (nVar = (n) kVarLJJIIJZLJL) != null && (kVarLJJIIZ = nVar.LJJIIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) != null) {
                iLJIIJJI = kVarLJJIIZ.LJIIJJI();
            } else {
                iLJIIJJI = -1;
            }
            C501801xQ.LIZIZ.storeInt("ai_studio_status", iLJIIJJI);
            C0TGK c0tgk2 = (C0TGK) c786260Usq.l0;
            if (c0tgk2 != null) {
                c0tgk2.LIZIZ(iLJIIJJI);
                return;
            }
            return;
        }
        C0TGK c0tgk3 = (C0TGK) c786260Usq.l0;
        if (c0tgk3 != null) {
            c0tgk3.onFailed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onResponse$15(X.C786260Usq r2, X.C0X9S r3, X.C0X52 r4) {
        /*
            if (r4 == 0) goto L3e
            boolean r0 = r4.LIZJ()
            if (r0 == 0) goto L3e
            T r0 = r4.LIZIZ
            if (r0 == 0) goto L3e
            java.lang.String r0 = (java.lang.String) r0
            com.google.gson.n r1 = X.C0TGH.LIZ(r0)
            if (r1 == 0) goto L48
            java.lang.String r0 = "status"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.UnsupportedOperationException -> L2d
            if (r0 == 0) goto L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.UnsupportedOperationException -> L2d
            if (r0 == 0) goto L48
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r0)     // Catch: java.lang.UnsupportedOperationException -> L2d
            if (r0 == 0) goto L48
            int r1 = r0.intValue()     // Catch: java.lang.UnsupportedOperationException -> L2d
            goto L49
        L2d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.Object r0 = r2.l0
            X.0TGK r0 = (X.C0TGK) r0
            if (r0 == 0) goto L3a
            r0.onFailed()
        L3a:
            X.C1AF0.LJ(r1)
            return
        L3e:
            java.lang.Object r0 = r2.l0
            X.0TGK r0 = (X.C0TGK) r0
            if (r0 == 0) goto L52
            r0.onFailed()
            return
        L48:
            r1 = -1
        L49:
            java.lang.Object r0 = r2.l0
            X.0TGK r0 = (X.C0TGK) r0
            if (r0 == 0) goto L52
            r0.LIZIZ(r1)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C786260Usq.onResponse$15(X.0Usq, X.0X9S, X.0X52):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onResponse$2(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((SubscriptionVM) c786260Usq.l0).LLILLL.setValue(c0x52.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onResponse$3(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        AdFreeSubscription adFreeSubscription;
        SubscriptionStatusInfo subscriptionStatusInfo;
        SubscriptionStatusInfo subscriptionStatusInfo2;
        C0TOM.LIZ.getClass();
        AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
        Integer num = null;
        if (adPersonalitySettingsLIZIZ != null) {
            adFreeSubscription = adPersonalitySettingsLIZIZ.subscription;
        } else {
            adFreeSubscription = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSubscriptionStatus: ");
        sbLIZ.append(c0x52.LIZIZ);
        C1022620cia.LIZ("SubscriptionVM", C2188811AlT.LIZIZ(sbLIZ));
        if (c0x52.LIZJ()) {
            ((SubscriptionVM) c786260Usq.l0).LLILLJJLI.setValue(c0x52.LIZIZ);
        }
        if (adFreeSubscription != null && (subscriptionStatusInfo2 = adFreeSubscription.subscriptionStatusInfo) != null) {
            num = subscriptionStatusInfo2.subscriptionPhase;
        }
        if (!Intrinsics.LJFF(num, ((SubscriptionStatusResponse) c0x52.LIZIZ).getSubscriptionPhase()) && adFreeSubscription != null && (subscriptionStatusInfo = adFreeSubscription.subscriptionStatusInfo) != null) {
            subscriptionStatusInfo.setSubscriptionPhase(((SubscriptionStatusResponse) c0x52.LIZIZ).getSubscriptionPhase());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$4(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        Integer cancelSubscribeCode;
        if (c0x52.LIZJ() && (cancelSubscribeCode = ((UnsubscribeResponse) c0x52.LIZIZ).getCancelSubscribeCode()) != null && cancelSubscribeCode.intValue() == 1) {
            ((C0TGR) c786260Usq.l0).onSuccess();
        } else {
            ((C0TGR) c786260Usq.l0).onFail();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onResponse$5(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        if (c0x52.LIZJ()) {
            ((ThirdPartyVM) c786260Usq.l0).LLILLJJLI.setValue(c0x52.LIZIZ);
        } else {
            ((ThirdPartyVM) c786260Usq.l0).LLILLJJLI.setValue(new ThirdPartyAdvertiserList(new ArrayList(), false, ""));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onResponse$6(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSensitiveTopics onResponse: ");
        sbLIZ.append(c0x52.LIZIZ);
        C1022620cia.LIZ("AdTopicsViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (c0x52.LIZJ()) {
            ((AdTopicsViewModel) c786260Usq.l0).LLILLJJLI.setValue(c0x52.LIZIZ);
            AdTopicsViewModel.LLILZLL = 3;
            return;
        }
        int i = AdTopicsViewModel.LLILZLL;
        if (i <= 0) {
            return;
        }
        AdTopicsViewModel.LLILZLL = i - 1;
        ((AdTopicsViewModel) c786260Usq.l0).vQ2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$7(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        AdSettingsData adSettingsData;
        Integer num;
        boolean zBooleanValue;
        int iIntValue;
        long jLongValue;
        long jLongValue2;
        C786410Ut5.LJIIJ((DialogC1389620mGW) ((AdSettingsActivity) c786260Usq.l0).LLJJIII.getValue());
        if (c0x52 != null && c0x52.LIZJ() && c0x52.LIZIZ != 0) {
            String str = null;
            try {
                adSettingsData = (AdSettingsData) C7740030o.LIZ().getGson().LJII((String) c0x52.LIZIZ, AdSettingsData.class);
                int i = 0;
                boolean z = true;
                if (adSettingsData != null && (num = adSettingsData.statusCode) != null && num.intValue() == 0) {
                    AdSettingsActivity adSettingsActivity = (AdSettingsActivity) c786260Usq.l0;
                    adSettingsActivity.getClass();
                    if (adSettingsData != null) {
                        Boolean bool = adSettingsData.promotable;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        C11GO c11go = (C11GO) adSettingsActivity.LLLLLZL().getAccessory();
                        Integer num2 = adSettingsData.darkPostSource;
                        if (num2 != null && num2.intValue() == 1) {
                            c11go.LJIILJJIL(true);
                            String string = adSettingsActivity.getString(2131850845);
                            String string2 = adSettingsActivity.getString(2131850846);
                            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) string2);
                            int iLJJJ = a0.LJJJ(spannableStringBuilderAppend, string2, 0, false, 6);
                            C786410Ut5.q2(spannableStringBuilderAppend, new C346230Dhl(adSettingsActivity, 0), iLJJJ, string2.length() + iLJJJ, 33);
                            adSettingsActivity.LLLLLZL().setSubtitle(new SpannableStringBuilder(adSettingsActivity.LLLLLZL().getSubtitle()).append((CharSequence) "\n").append((CharSequence) spannableStringBuilderAppend));
                            adSettingsActivity.LLLLLZL().setOnClickListener(new AwS583S0100000_4(adSettingsActivity, 240));
                        } else {
                            Integer num3 = adSettingsData.darkPostStatus;
                            if (num3 == null || num3.intValue() != 1) {
                                z = false;
                            }
                            c11go.LJIILJJIL(z);
                        }
                        ((C11GO) adSettingsActivity.LLLLZI().getAccessory()).LJIILJJIL(zBooleanValue);
                        adSettingsActivity.LLLLZIL().setChecked(zBooleanValue);
                        LinearLayout linearLayoutLLLLZLL = adSettingsActivity.LLLLZLL();
                        if (!zBooleanValue) {
                            i = 8;
                        }
                        C786410Ut5.LJZL(i, linearLayoutLLLLZLL);
                        String str2 = adSettingsData.videoCode;
                        Integer num4 = adSettingsData.codeStatus;
                        if (num4 != null) {
                            iIntValue = num4.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        Long l = adSettingsData.startTime;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Long l2 = adSettingsData.endTime;
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        adSettingsActivity.LLZ(iIntValue, jLongValue, jLongValue2, str2);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                adSettingsData = null;
            }
            C786410Ut5.LJIIJ((DialogC1389620mGW) ((AdSettingsActivity) c786260Usq.l0).LLJJIII.getValue());
            ((AdSettingsActivity) c786260Usq.l0).finish();
            if (adSettingsData != null) {
                str = adSettingsData.statusMsg;
            }
            if (TextUtils.isEmpty(str)) {
                str = "Request Failed";
            }
            C1389890mGx c1389890mGx = new C1389890mGx((AdSettingsActivity) c786260Usq.l0);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$8(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        T t;
        n nVarLLLZIL;
        if (c0x52 != null && c0x52.LIZJ() && (t = c0x52.LIZIZ) != 0 && (nVarLLLZIL = ((AdSettingsActivity) c786260Usq.l0).LLLZIL((String) t)) != null) {
            k kVarLJJIIZ = nVarLLLZIL.LJJIIZ("status_msg");
            if (kVarLJJIIZ != null) {
                kVarLJJIIZ.LJIL();
            }
            k kVarLJJIIZ2 = nVarLLLZIL.LJJIIZ("status_code");
            if (kVarLJJIIZ2 != null && kVarLJJIIZ2.LJIIJJI() == 0) {
                C1389890mGx c1389890mGx = new C1389890mGx((AdSettingsActivity) c786260Usq.l0);
                c1389890mGx.LJIIJ(((AdSettingsActivity) c786260Usq.l0).getResources().getString(2131830547));
                c1389890mGx.LJIIJJI();
                ((AdSettingsActivity) c786260Usq.l0).LLZ(-1, 0L, 0L, "");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onResponse$9(C786260Usq c786260Usq, C0X9S c0x9s, C0X52 c0x52) {
        T t;
        n nVarLLLZIL;
        k kVarLJJIIZ;
        if (c0x52 != null && c0x52.LIZJ() && (t = c0x52.LIZIZ) != 0 && (nVarLLLZIL = ((AdSettingsActivity) c786260Usq.l0).LLLZIL((String) t)) != null && (kVarLJJIIZ = nVarLLLZIL.LJJIIZ("status_code")) != null && kVarLJJIIZ.LJIIJJI() == 0) {
            C1389890mGx c1389890mGx = new C1389890mGx((AdSettingsActivity) c786260Usq.l0);
            c1389890mGx.LJIIJ(((AdSettingsActivity) c786260Usq.l0).getResources().getString(2131845635));
            c1389890mGx.LJIIJJI();
            AdSettingsActivity adSettingsActivity = (AdSettingsActivity) c786260Usq.l0;
            String str = adSettingsActivity.LLJIJIL;
            if (str != null) {
                adSettingsActivity.LLJJI.LIZIZ(str).enqueue(new C786260Usq(adSettingsActivity, 7));
            }
        }
    }
}
