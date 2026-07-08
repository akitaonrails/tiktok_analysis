package Y;

import X.AbstractC1387200mCc;
import X.AbstractC826920WcE;
import X.C08CT;
import X.C09AJ;
import X.C09JN;
import X.C0ZBH;
import X.C106V;
import X.C10KJ;
import X.C10KK;
import X.C10MB;
import X.C10MD;
import X.C10ME;
import X.C10MF;
import X.C10RO;
import X.C11NZ;
import X.C11S5;
import X.C128Y;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13IQ;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1888830zFh;
import X.C1888900zFo;
import X.C1901110zZV;
import X.C1901130zZX;
import X.C1901570zaF;
import X.C1901580zaG;
import X.C1908390zlF;
import X.C1911410zq7;
import X.C1912370zrf;
import X.C191500oT;
import X.C191859104b;
import X.C191868104k;
import X.C191870104m;
import X.C191871104n;
import X.C191874104q;
import X.C191880104w;
import X.C19241010Pg;
import X.C19290510dT;
import X.C19329210ji;
import X.C19329510jl;
import X.C19329910jp;
import X.C19EG;
import X.C1AH6;
import X.C1C7U;
import X.C20296814bO;
import X.C20476915Ap;
import X.C20477515Av;
import X.C20666215ts;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C259800zU;
import X.C297160Bko;
import X.C500260Jjc;
import X.C611500Nye;
import X.C766270U4b;
import X.C958370b2x;
import X.EnumC1902760zcA;
import X.EnumC1904380zem;
import X.EnumC191875104r;
import X.EnumC19330310jt;
import X.InterfaceC1870050ylP;
import X.InterfaceC1912570zrz;
import X.InterfaceC420801kM;
import X.InterfaceC500500Jk0;
import Y.AfS197S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.util.LruCache;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.wallet.data.model.kyc.KYCIqaIdPhotoResult;
import com.bytedance.android.livesdk.dataChannel.LiveCenterForceRefreshEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganAndConsentFragment;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.api.PaPromptResponse;
import com.ss.android.ugc.tiktok.pns.privacy.setting.paprompt.viewmodel.PaPromptViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.NoPAControlSettings;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.unified.UnifiedDataResponse;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.AnchorLiveJourneyReceiveRewardResp;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.perception.AppealResponse;
import webcast.data.AppealInfo;
import webcast.data.LiveJourneyLevelInfo;
import webcast.data.RealtimeViolationRecord;

/* JADX INFO: loaded from: classes29.dex */
public class AfS162S0200000_28 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("NewAgeGateComponent@c039.completeAfterSignupActivityFinished$4");
        if (((C13IQ) afS162S0200000_28.l0).LIZIZ(((AbstractC1387200mCc) obj).LIZIZ())) {
            ((C10RO) afS162S0200000_28.l1).LJ();
        }
        C1C7U.LIZIZ("NewAgeGateComponent@c039.completeAfterSignupActivityFinished$4");
    }

    public static final void accept$1(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C1C7U.LIZ("AnimationExecutor@6000.startAnimationGroup$10$1");
        C20476915Ap c20476915Ap = (C20476915Ap) afS162S0200000_28.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animationGroup:");
        sbLIZ.append((C20477515Av) afS162S0200000_28.l1);
        sbLIZ.append(" is show more than:");
        sbLIZ.append(C20476915Ap.LJIIJ);
        sbLIZ.append(" disposable:");
        InterfaceC420801kM interfaceC420801kM = ((C20476915Ap) afS162S0200000_28.l0).LJII;
        if (interfaceC420801kM != null) {
            boolValueOf = Boolean.valueOf(interfaceC420801kM.isDisposed());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        c20476915Ap.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), true);
        InterfaceC420801kM interfaceC420801kM2 = ((C20476915Ap) afS162S0200000_28.l0).LJII;
        if (interfaceC420801kM2 != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC420801kM2.isDisposed());
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf2)) {
            InterfaceC420801kM interfaceC420801kM3 = ((C20476915Ap) afS162S0200000_28.l0).LJII;
            if (interfaceC420801kM3 != null) {
                interfaceC420801kM3.dispose();
            }
            if (C958370b2x.LIZJ()) {
                StringBuilder sb = new StringBuilder();
                sb.append(((C20477515Av) afS162S0200000_28.l1).LIZ);
                sb.append(' ');
                Set<String> setKeySet = ((C20477515Av) afS162S0200000_28.l1).LJFF.keySet();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
                Iterator<T> it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                sb.append(arrayList);
                sb.append(" is leak please check");
                C766270U4b.LJIIJJI(sb.toString());
            }
            ((C20476915Ap) afS162S0200000_28.l0).LJIILIIL(null);
        }
        C1C7U.LIZIZ("AnimationExecutor@6000.startAnimationGroup$10$1");
    }

    public static final void accept$10(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        Map<String, PrivacySettingsRestrictionItem> map;
        int iIntValue;
        Integer num;
        Integer num2;
        C1C7U.LIZ("PaPromptViewModel@f269.submitChoice$1");
        PaPromptResponse paPromptResponse = (PaPromptResponse) obj;
        if (paPromptResponse.getPrivacySettingsRestriction() != null && paPromptResponse.getPrivacyUserSettings() != null) {
            ((PaPromptViewModel) afS162S0200000_28.l0).getClass();
            C106V.LIZ.getClass();
            C106V.LIZIZ().getClass();
            PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
            if (privacyUserSettingsV2LJIIL == null) {
                privacyUserSettingsV2LJIIL = new PrivacyUserSettingsV2(0);
            }
            for (String str : C1697810uHb.LJIIJJI("private_account", "duet", "stitch", "comment", "direct_message", "content_reuse_permission", "dm_setting_friends", "dm_setting_potential_connection", "dm_setting_others")) {
                Map<String, Integer> privacyUserSettings = paPromptResponse.getPrivacyUserSettings();
                if (privacyUserSettings != null && (num2 = privacyUserSettings.get(str)) != null) {
                    privacyUserSettingsV2LJIIL.LIZIZ(num2.intValue(), str);
                }
            }
            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
            if (iPrivacySettingsDepService != null) {
                Map<String, Integer> privacyUserSettings2 = paPromptResponse.getPrivacyUserSettings();
                if (privacyUserSettings2 != null && (num = privacyUserSettings2.get("private_account")) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                iPrivacySettingsDepService.LJIJJLI(iIntValue);
            }
            C191880104w.LIZ.getClass();
            C191871104n.LJ().getClass();
            C191859104b.LJ(privacyUserSettingsV2LJIIL);
            PrivacySettingsRestriction privacySettingsRestriction = paPromptResponse.getPrivacySettingsRestriction();
            if (privacySettingsRestriction != null && (map = privacySettingsRestriction.account) != null) {
                C106V.LIZ.getClass();
                C106V.LIZIZ().getClass();
                C191871104n.LIZIZ().getClass();
                C191874104q.LJFF(0, map);
            }
        }
        ((PaPromptViewModel) afS162S0200000_28.l0).LLILLJJLI.postValue(Boolean.FALSE);
        ((Function0) afS162S0200000_28.l1).invoke();
        C1C7U.LIZIZ("PaPromptViewModel@f269.submitChoice$1");
    }

    public static final void accept$11(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("PaPromptViewModel@f269.submitChoice$2");
        ((PaPromptViewModel) afS162S0200000_28.l0).LLILLJJLI.postValue(Boolean.FALSE);
        ((Function1) afS162S0200000_28.l1).invoke(obj);
        C1C7U.LIZIZ("PaPromptViewModel@f269.submitChoice$2");
    }

    public static final void accept$12(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("UnifiedApiManager@2745.fetchDataBackground$3");
        C191868104k.LIZ((EnumC191875104r) afS162S0200000_28.l0);
        C191870104m.LIZ.getClass();
        C191870104m.LIZ((UnifiedDataResponse) obj);
        Function0 function0 = (Function0) afS162S0200000_28.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("UnifiedApiManager@2745.fetchDataBackground$3");
    }

    public static final void accept$13(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("InnerPushApi@7661.markStatus$1");
        C19329510jl.LIZ.getClass();
        C19329510jl.LIZ().LJ();
        if (((BaseResponse) obj).status_code == 0 && ((InnerPushMessage) afS162S0200000_28.l0).getHasAvoidanceWaited() && ((EnumC19330310jt) afS162S0200000_28.l1) != EnumC19330310jt.WAIT) {
            C19329210ji.LJII(((InnerPushMessage) afS162S0200000_28.l0).getId(), false);
        }
        C1C7U.LIZIZ("InnerPushApi@7661.markStatus$1");
    }

    public static final void accept$14(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        List<RealtimeViolationRecord> list;
        List<RealtimeViolationRecord> list2;
        Long lValueOf;
        Long lValueOf2;
        AppealInfo appealInfo;
        AppealResponse.ResponseData responseData;
        List<Long> list3;
        String str;
        Activity activityLIZ;
        C1C7U.LIZ("LiveCenterMainView@9a36.requestPerceptionAppeal$1");
        AppealResponse appealResponse = (AppealResponse) obj;
        C1AH6 c1ah6 = (C1AH6) afS162S0200000_28.l0;
        c1ah6.LLIZLLLIL = false;
        Context context = c1ah6.getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131844163);
            c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
            c1389890mGx.LJII(R.attr.eyp);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData = ((C1AH6) afS162S0200000_28.l0).LLJILLL;
        String str2 = null;
        if (realtimeLiveCenterDetailData != null) {
            list = realtimeLiveCenterDetailData.violationRecords;
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        RealtimeLiveCenterDetailData realtimeLiveCenterDetailData2 = ((C1AH6) afS162S0200000_28.l0).LLJILLL;
        if (realtimeLiveCenterDetailData2 != null && (list2 = realtimeLiveCenterDetailData2.violationRecords) != null) {
            for (RealtimeViolationRecord realtimeViolationRecordLIZ : list2) {
                PunishEventInfo punishEventInfo = realtimeViolationRecordLIZ.punishInfo;
                if (punishEventInfo != null && (str = punishEventInfo.punishId) != null) {
                    lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
                } else {
                    lValueOf = null;
                }
                AppealResponse.ResponseData responseData2 = appealResponse.data;
                if (responseData2 != null) {
                    lValueOf2 = Long.valueOf(responseData2.appealPunishId);
                } else {
                    lValueOf2 = null;
                }
                if ((Intrinsics.LJFF(lValueOf2, lValueOf) || ((responseData = appealResponse.data) != null && (list3 = responseData.relatedPunishIdList) != null && C13LP.LJJJJ(lValueOf, list3))) && (appealInfo = (realtimeViolationRecordLIZ = realtimeViolationRecordLIZ.LIZ()).appealInfo) != null) {
                    appealInfo.appealStatus = 1;
                }
                arrayList.add(realtimeViolationRecordLIZ);
            }
        }
        ((C1AH6) afS162S0200000_28.l0).LIZLLL(list, arrayList);
        DataChannel dataChannel = ((C1AH6) afS162S0200000_28.l0).LLILLL;
        PunishEventInfo punishEventInfo2 = ((RealtimeViolationRecord) afS162S0200000_28.l1).punishInfo;
        if (punishEventInfo2 != null) {
            str2 = punishEventInfo2.punishId;
        }
        C191500oT.LIZ(dataChannel, str2, "appeal_submitted");
        C1C7U.LIZIZ("LiveCenterMainView@9a36.requestPerceptionAppeal$1");
    }

    public static final void accept$15(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("NewLoginComponent@ac04.waitForSignupActivityFinishThenComplete$1");
        if (((C13IQ) afS162S0200000_28.l0).LIZIZ(((AbstractC1387200mCc) obj).LIZIZ())) {
            C1911410zq7.LIZ("LoginComponent", "signup Activity destroyed, calling complete()");
            ((C19241010Pg) afS162S0200000_28.l1).LJ();
        }
        C1C7U.LIZIZ("NewLoginComponent@ac04.waitForSignupActivityFinishThenComplete$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$16(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        List<Long> list;
        C1C7U.LIZ("RewardsItemViewHolder@7fc8.onBind$2$1");
        AnchorLiveJourneyReceiveRewardResp.Data data = (AnchorLiveJourneyReceiveRewardResp.Data) ((com.bytedance.android.live.network.response.BaseResponse) obj).data;
        if (data != null && (list = data.successLevelList) != null && list.contains(Long.valueOf(((LiveJourneyLevelInfo) afS162S0200000_28.l0).level))) {
            DataChannel dataChannel = ((C1888830zFh) afS162S0200000_28.l1).LL.getDataChannel();
            if (dataChannel != null) {
                dataChannel.FQ2(LiveCenterForceRefreshEvent.class);
            }
            C766270U4b.LIZLLL(2131842061);
        } else {
            C766270U4b.LIZLLL(2131842060);
        }
        ((C1888830zFh) afS162S0200000_28.l1).LLJ = false;
        C1C7U.LIZIZ("RewardsItemViewHolder@7fc8.onBind$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.ss.android.ugc.aweme.configuration.dialogs.ConsentBoxDialogAbility$registerObserver$lifeCycleObserver$1] */
    public static final void accept$17(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C10MD c10md;
        InterfaceC1912570zrz interfaceC1912570zrz;
        C10MD c10md2;
        C1C7U.LIZ("ConsentBoxDialogAbility@35d3.realShow$2");
        C10ME c10me = (C10ME) obj;
        InterfaceC420801kM interfaceC420801kM = null;
        if (c10me.LIZIZ) {
            C128Y c128yLIZ = ((C10MB) afS162S0200000_28.l0).LIZLLL.LIZ.LIZ();
            if ((c128yLIZ instanceof C10MD) && (c10md2 = (C10MD) c128yLIZ) != null) {
                c10md2.At();
            }
            C1912370zrf.LIZ.getClass();
            if (C1912370zrf.LJ()) {
                C1911410zq7.LIZ("NUJR_Slogan", "dismissDualBallLoading: dismissing loading in slogan consent fragment");
                WeakReference<InterfaceC1912570zrz> weakReference = C1912370zrf.LIZIZ;
                if (weakReference != null && (interfaceC1912570zrz = weakReference.get()) != null && (interfaceC1912570zrz instanceof SloganAndConsentFragment)) {
                    ((SloganAndConsentFragment) interfaceC1912570zrz).hS();
                }
            }
            final C10MB c10mb = (C10MB) afS162S0200000_28.l0;
            c10mb.getClass();
            ?? r3 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.configuration.dialogs.ConsentBoxDialogAbility$registerObserver$lifeCycleObserver$1
                /* JADX WARN: Type inference failed for: r0v11, types: [T, X.01kM] */
                /* JADX WARN: Type inference failed for: r0v5, types: [T, X.01kM] */
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    C10MD c10md3;
                    int i = C08CT.LIZ[event.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                C128Y c128yLIZ2 = c10mb.LIZLLL.LIZ.LIZ();
                                if ((c128yLIZ2 instanceof C10MD) && (c10md3 = (C10MD) c128yLIZ2) != null) {
                                    c10md3.lz(this);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        C259800zU c259800zU = new C259800zU();
                        c259800zU.element = C11NZ.LJLLILLLL(C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()), C2214201BlK.LIZJ(), new InterfaceC500500Jk0() { // from class: X.10MC
                            @Override // X.InterfaceC500500Jk0
                            public final Object apply(Object obj2, Object obj3) {
                                new WeakReference(obj3);
                                return new C10ME((ITpcConsentService) obj2);
                            }
                        }).LJL(C11S5.LIZ()).LJJLJLI(new AfS197S0100000_28(c259800zU, 11));
                        return;
                    }
                    C259800zU c259800zU2 = new C259800zU();
                    c259800zU2.element = C11NZ.LJJJJZ(ComplianceServiceProvider.LJJIII()).LJL(C11S5.LIZ()).LJJLJLI(new AfS197S0100000_28(c259800zU2, 10));
                }
            };
            C128Y c128yLIZ2 = c10mb.LIZLLL.LIZ.LIZ();
            if ((c128yLIZ2 instanceof C10MD) && (c10md = (C10MD) c128yLIZ2) != 0) {
                c10md.A3(r3);
            }
            final C19EG c19egLIZIZ = ((C10MB) afS162S0200000_28.l0).LIZLLL.LIZ.LIZIZ();
            final C10MB c10mb2 = (C10MB) afS162S0200000_28.l0;
            ITpcConsentService iTpcConsentService = c10me.LIZ;
            c10mb2.LIZLLL.LIZ.LIZIZ();
            iTpcConsentService.LIZ("interest_selection");
            IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) c10mb2.LJFF.getValue();
            if (iPNSDeviceConsentService != null) {
                iPNSDeviceConsentService.LJIIJJI(new AbstractC826920WcE() { // from class: X.10MA
                    @Override // X.InterfaceC1915870zxJ
                    public final void LIZ(EnumC1876780ywG enumC1876780ywG) {
                        if (EnumC1876780ywG.APPROVE == enumC1876780ywG) {
                            C1912370zrf.LIZ.getClass();
                            C1912370zrf.LIZJ();
                            C10MF c10mf = c10mb2.LIZJ;
                            if (c10mf != null) {
                                c10mf.onEnd();
                            }
                            IPNSDeviceConsentService iPNSDeviceConsentService2 = (IPNSDeviceConsentService) c10mb2.LJFF.getValue();
                            if (iPNSDeviceConsentService2 != null) {
                                iPNSDeviceConsentService2.LJIIIZ(this);
                            }
                        }
                        C1912370zrf.LIZ.getClass();
                        if (C1912370zrf.LJ() && EnumC1876780ywG.NOTDETERMINED == enumC1876780ywG) {
                            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ), null, null, new C10M9(c10mb2, this, null), 3);
                        }
                    }
                });
            }
            ((C10MB) afS162S0200000_28.l0).LIZIZ = true;
        } else {
            C10MF c10mf = ((C10MB) afS162S0200000_28.l0).LIZJ;
            if (c10mf != null) {
                c10mf.onEnd();
            }
        }
        T t = ((C259800zU) afS162S0200000_28.l1).element;
        if (t != 0) {
            interfaceC420801kM = (InterfaceC420801kM) t;
        }
        interfaceC420801kM.dispose();
        C1C7U.LIZIZ("ConsentBoxDialogAbility@35d3.realShow$2");
    }

    public static final void accept$18(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("RelationLabelTextBuilder@18ec.update$1$1$1");
        Bitmap bitmap = (Bitmap) obj;
        C10KK c10kk = (C10KK) afS162S0200000_28.l0;
        SpannableStringBuilder spannableStringBuilder = c10kk.LJIIL;
        C09AJ c09aj = (C09AJ) afS162S0200000_28.l1;
        synchronized (spannableStringBuilder) {
            try {
                c10kk.LJI(c10kk.LJIIL, bitmap);
                c09aj.onNext(c10kk.LJIIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("RelationLabelTextBuilder@18ec.update$1$1$1");
    }

    public static final void accept$19(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("RelationLabelTextBuilder@18ec.update$1$1$2");
        ((C10KK) afS162S0200000_28.l0).LJIILIIL = "avatar_union_exception";
        ((C09AJ) afS162S0200000_28.l1).onError((Throwable) obj);
        C1C7U.LIZIZ("RelationLabelTextBuilder@18ec.update$1$1$2");
    }

    public static final void accept$2(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("AnimationExecutor@6000.startAnimationGroup$6");
        if (((C20477515Av) afS162S0200000_28.l0).LIZJ) {
            ((C20476915Ap) afS162S0200000_28.l1).LJIIIIZZ = null;
        } else {
            ((C20476915Ap) afS162S0200000_28.l1).LJIILIIL(null);
        }
        ((C20476915Ap) afS162S0200000_28.l1).LIZ((C20477515Av) afS162S0200000_28.l0, true);
        C1C7U.LIZIZ("AnimationExecutor@6000.startAnimationGroup$6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$20(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        Integer num;
        C1C7U.LIZ("PrivacyContentReuseSettingNotificationManager@e73.showAccountPromptSheet$3$2$1");
        C191880104w.LIZ.getClass();
        C191880104w.LJIILL(2, "unified_toggle_popup");
        Integer num2 = (Integer) ((MutableLiveData) afS162S0200000_28.l0).getValue();
        if (num2 != null) {
            if (num2.intValue() == 1) {
                num = 0;
            } else if (num2.intValue() == 4) {
                num = 1;
            } else if (num2.intValue() == 5) {
                num = 3;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                C191871104n.LIZ().getClass();
                NoPAControlSettings noPAControlSettingsLIZ = C1888900zFo.LIZ();
                if (noPAControlSettingsLIZ != null) {
                    C1888900zFo.LIZJ(new NoPAControlSettings(noPAControlSettingsLIZ.download, iIntValue, iIntValue, noPAControlSettingsLIZ.contentReusePermission));
                }
            }
        }
        ((Function0) afS162S0200000_28.l1).invoke();
        C1C7U.LIZIZ("PrivacyContentReuseSettingNotificationManager@e73.showAccountPromptSheet$3$2$1");
    }

    public static final void accept$3(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("AnimationExecutor@6000.startAnimationGroup$7");
        C20476915Ap c20476915Ap = (C20476915Ap) afS162S0200000_28.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAnimationGroup doOnError ");
        sbLIZ.append((C20477515Av) afS162S0200000_28.l1);
        sbLIZ.append(" t:");
        sbLIZ.append(((Throwable) obj).getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C20476915Ap c20476915Ap2 = (C20476915Ap) afS162S0200000_28.l0;
        C20477515Av c20477515Av = (C20477515Av) afS162S0200000_28.l1;
        c20476915Ap2.getClass();
        c20476915Ap.LJIIJ(strLIZIZ, C20476915Ap.LJIIJJI(c20477515Av));
        if (((C20477515Av) afS162S0200000_28.l1).LIZJ) {
            ((C20476915Ap) afS162S0200000_28.l0).LJIIIIZZ = null;
        } else {
            ((C20476915Ap) afS162S0200000_28.l0).LJIILIIL(null);
        }
        ((C20476915Ap) afS162S0200000_28.l0).LIZ((C20477515Av) afS162S0200000_28.l1, false);
        C1C7U.LIZIZ("AnimationExecutor@6000.startAnimationGroup$7");
    }

    public static final void accept$4(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("AnimationExecutor@6000.startAnimationGroup$9");
        C20476915Ap c20476915Ap = (C20476915Ap) afS162S0200000_28.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAnimationGroup subscribe onError: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C20476915Ap c20476915Ap2 = (C20476915Ap) afS162S0200000_28.l0;
        C20477515Av c20477515Av = (C20477515Av) afS162S0200000_28.l1;
        c20476915Ap2.getClass();
        c20476915Ap.LJIIJ(strLIZIZ, C20476915Ap.LJIIJJI(c20477515Av));
        C1C7U.LIZIZ("AnimationExecutor@6000.startAnimationGroup$9");
    }

    public static final void accept$5(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("KYCCameraManager@32ab.upLoadIaqVerify$disposable$2");
        KYCIqaIdPhotoResult kYCIqaIdPhotoResult = (KYCIqaIdPhotoResult) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upLoadIaqVerify success, valid? : ");
        if (kYCIqaIdPhotoResult != null) {
            boolValueOf = Boolean.valueOf(kYCIqaIdPhotoResult.isValid);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append('.');
        Logger.e("KYCCameraManager", C2188811AlT.LIZIZ(sbLIZ));
        if (kYCIqaIdPhotoResult != null && kYCIqaIdPhotoResult.isValid) {
            InterfaceC1870050ylP interfaceC1870050ylP = ((C20296814bO) afS162S0200000_28.l0).LIZJ;
            if (interfaceC1870050ylP != null) {
                interfaceC1870050ylP.LIZ((byte[]) afS162S0200000_28.l1);
            }
        } else {
            ((C20296814bO) afS162S0200000_28.l0).LIZLLL();
        }
        C1C7U.LIZIZ("KYCCameraManager@32ab.upLoadIaqVerify$disposable$2");
    }

    public static final void accept$6(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        InboxEntranceCell inboxEntranceCell;
        NoticeItems noticeItems;
        InboxEntranceCell next;
        C1C7U.LIZ("PreloadManager@c224.realRequest$1$observable$1");
        InboxEntranceResponse inboxEntranceResponse = (InboxEntranceResponse) obj;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("PreloadManager", "requestCache success");
        C1901570zaF.LIZ(inboxEntranceResponse);
        C0ZBH.LIZ(inboxEntranceResponse, (List) ((Pair) afS162S0200000_28.l0).getSecond(), EnumC1902760zcA.PRELOAD, false);
        C1901130zZX.LJII(C1901130zZX.LIZJ, inboxEntranceResponse.getEntranceCells());
        FollowerPreCacheManager followerPreCacheManager = FollowerPreCacheManager.LIZ;
        List<InboxEntranceCell> entranceCells = inboxEntranceResponse.getEntranceCells();
        followerPreCacheManager.getClass();
        FollowerPreCacheManager.LJ(entranceCells);
        if (C297160Bko.LIZ()) {
            List<InboxEntranceCell> entranceCells2 = inboxEntranceResponse.getEntranceCells();
            List<? extends MusNotice> list = null;
            if (entranceCells2 != null) {
                Iterator<InboxEntranceCell> it2 = entranceCells2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.cellId == 1) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                inboxEntranceCell = next;
            } else {
                inboxEntranceCell = null;
            }
            C611500Nye c611500Nye = C611500Nye.LIZ;
            if (inboxEntranceCell != null && (noticeItems = inboxEntranceCell.noticePreloadItem) != null) {
                list = noticeItems.items;
            }
            c611500Nye.LIZLLL(list);
        }
        EnumC1904380zem.ENTRANCE_LIST_NETWORK_TIME.intervalEnd();
        PreloadManager.LIZIZ.set(false);
        PreloadManager.LIZJ.set(new NoticeList(null, inboxEntranceResponse.getNoticeCounts(), null, 0L, null, inboxEntranceResponse.getGroups(), null, null, null, null, 0L));
        C1901580zaG c1901580zaG = C1901580zaG.LIZ;
        List<InboxEntranceCell> entranceCells3 = inboxEntranceResponse.getEntranceCells();
        c1901580zaG.getClass();
        C1901580zaG.LJIIL(entranceCells3);
        C1901580zaG.LJIILIIL(inboxEntranceResponse.getLatestNoticeTime());
        ((C1901110zZV) afS162S0200000_28.l1).LJII(inboxEntranceResponse);
        C1C7U.LIZIZ("PreloadManager@c224.realRequest$1$observable$1");
    }

    public static final void accept$7(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("InnerPushPreloadManager@e21f.onMessageEnqueue$1$2");
        Aweme aweme = (Aweme) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAweme success aweme aid:");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(' ');
        C19290510dT.LIZ("InnerPushPreloadManager", C2188811AlT.LIZIZ(sbLIZ));
        ((InnerPushMessage) afS162S0200000_28.l0).getTracker().LJ = 1;
        ((LruCache) ((C1908390zlF) afS162S0200000_28.l1).LIZ.getValue()).put(aweme.getAid(), aweme);
        C20666215ts tracker = ((InnerPushMessage) afS162S0200000_28.l0).getTracker();
        C19329910jp.LIZ.getClass();
        tracker.LJI = System.currentTimeMillis() - ((InnerPushMessage) afS162S0200000_28.l0).getTracker().LJFF;
        ((C1908390zlF) afS162S0200000_28.l1).LJ((InnerPushMessage) afS162S0200000_28.l0);
        C1C7U.LIZIZ("InnerPushPreloadManager@e21f.onMessageEnqueue$1$2");
    }

    public static final void accept$8(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("InnerPushPreloadManager@e21f.onMessageEnqueue$1$5");
        List<Aweme> list = (List) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAweme success aweme size:");
        sbLIZ.append(list.size());
        sbLIZ.append(' ');
        C19290510dT.LIZ("InnerPushPreloadManager", C2188811AlT.LIZIZ(sbLIZ));
        ((InnerPushMessage) afS162S0200000_28.l0).getTracker().LJ = 1;
        C1908390zlF c1908390zlF = (C1908390zlF) afS162S0200000_28.l1;
        for (Aweme aweme : list) {
            ((LruCache) c1908390zlF.LIZ.getValue()).put(aweme.getAid(), aweme);
        }
        C20666215ts tracker = ((InnerPushMessage) afS162S0200000_28.l0).getTracker();
        C19329910jp.LIZ.getClass();
        tracker.LJI = System.currentTimeMillis() - ((InnerPushMessage) afS162S0200000_28.l0).getTracker().LJFF;
        ((C1908390zlF) afS162S0200000_28.l1).LJ((InnerPushMessage) afS162S0200000_28.l0);
        C1C7U.LIZIZ("InnerPushPreloadManager@e21f.onMessageEnqueue$1$5");
    }

    public static final void accept$9(AfS162S0200000_28 afS162S0200000_28, Object obj) {
        C1C7U.LIZ("RelationLabelTextView@f9a7.paint$3");
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        if (((RelationLabelTextView) afS162S0200000_28.l0).LLJJJJJIL != null && (!r0.isDisposed())) {
            ((RelationLabelTextView) afS162S0200000_28.l0).setText(spannableStringBuilder);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((RelationLabelTextView) afS162S0200000_28.l0).getViewId());
            sbLIZ.append(" set subscribe text ");
            sbLIZ.append((Object) spannableStringBuilder);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (((C10KJ) afS162S0200000_28.l1).LJII) {
            ((RelationLabelTextView) afS162S0200000_28.l0).LLJJJJLIIL = spannableStringBuilder;
        }
        C1C7U.LIZIZ("RelationLabelTextView@f9a7.paint$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS162S0200000_28(X.C20476915Ap r2, X.C20477515Av r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 1: goto Le;
                case 2: goto L5;
                case 3: goto Le;
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS162S0200000_28.<init>(X.15Ap, X.15Av, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS162S0200000_28(Object obj, MutableLiveData<Integer> mutableLiveData, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = mutableLiveData;
    }
}
