package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownIdleSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestLiveShowTransitionDurationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiCountDownForAllExtra;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryCell;
import com.ss.android.ugc.aweme.minis.report.api.MinisReportGetAuthTokenResponse;
import com.ss.android.ugc.aweme.minis.report.api.MinisUpdateReportResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceAlbumFragment;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vibefeed.feed.interact.digg.VibeFeedDiggTopInfoAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play.CountdownForAllUser;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: renamed from: X.020h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5185020h extends C09AY implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C238400w2 c238400w2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C262100zr c262100zr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c262100zr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C01IT c01it, int i) {
        super(2);
        this.$t = i;
        this.l0 = c01it;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C431201m2 c431201m2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c431201m2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C23260099m c23260099m, int i) {
        super(2);
        this.$t = i;
        this.l0 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C1548590qOv c1548590qOv, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1548590qOv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5185020h(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit> interfaceC1631620sYq2) {
        super(2);
        this.$t = interfaceC1631620sYq2;
        this.l0 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C21306718Zt c21306718Zt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c21306718Zt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C2252611DEt c2252611DEt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestPreviewLiveSettingViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog, int i) {
        super(2);
        this.$t = i;
        this.l0 = countDownForAllV2SettingsDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog, int i) {
        super(2);
        this.$t = i;
        this.l0 = guestShowdownIdleSettingsDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(LiveShowAnchorViewModel liveShowAnchorViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveShowAnchorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5185020h(BaseLiveShowWidget baseLiveShowWidget, BaseLiveShowWidget<T> baseLiveShowWidget2) {
        super(2);
        this.$t = baseLiveShowWidget2;
        this.l0 = baseLiveShowWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(TuxIconView tuxIconView, int i) {
        super(2);
        this.$t = i;
        this.l0 = tuxIconView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(USHalfPageOrderSummaryCell uSHalfPageOrderSummaryCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = uSHalfPageOrderSummaryCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(LocalServiceAlbumFragment localServiceAlbumFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = localServiceAlbumFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(PoiRevisitMapAssem poiRevisitMapAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiRevisitMapAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(VibeFeedDiggTopInfoAssem vibeFeedDiggTopInfoAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = vibeFeedDiggTopInfoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5185020h(WeakReference weakReference, WeakReference<Function2<Integer, String, Unit>> weakReference2) {
        super(2);
        this.$t = weakReference2;
        this.l0 = weakReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5185020h(Map map, Map<String, Object> map2) {
        super(2);
        this.$t = map2;
        this.l0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5185020h(Set set, Set<Pair<String, String>> set2) {
        super(2);
        this.$t = set2;
        this.l0 = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5185020h(Function0 function0, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5185020h(Function1 function1, Function1<? super PTYError, Unit> function12) {
        super(2);
        this.$t = function12;
        this.l0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5185020h(Function2 function2, Function2<? super Boolean, ? super Throwable, Unit> function22) {
        super(2);
        this.$t = function22;
        this.l0 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5185020h(C684370Qst c684370Qst, C2252611DEt c2252611DEt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    public static final Object invoke$0(C5185020h c5185020h, Object obj, Object obj2) {
        int iIntValue;
        Integer num = (Integer) obj2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initData selectSubscribe likeCount:");
        sbLIZ.append(iIntValue);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        TuxTextView tuxTextView = ((VibeFeedDiggTopInfoAssem) c5185020h.l0).LLJJIJIIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(X.C5185020h r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            java.lang.String r4 = ""
            java.lang.String r3 = "/$"
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r2 = "url"
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r2)     // Catch: java.lang.Exception -> L56
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Exception -> L56
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r2)     // Catch: java.lang.Exception -> L56
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L56
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Exception -> L56
            if (r1 == 0) goto L5a
            if (r2 == 0) goto L5a
            java.lang.Object r0 = r5.l0     // Catch: java.lang.Exception -> L56
            X.0qOv r0 = (X.C1548590qOv) r0     // Catch: java.lang.Exception -> L56
            r0.getClass()     // Catch: java.lang.Exception -> L56
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L56
            r0.<init>(r3)     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = r0.replace(r1, r4)     // Catch: java.lang.Exception -> L56
            java.lang.Object r0 = r5.l0     // Catch: java.lang.Exception -> L56
            X.0qOv r0 = (X.C1548590qOv) r0     // Catch: java.lang.Exception -> L56
            r0.getClass()     // Catch: java.lang.Exception -> L56
            kotlin.text.Regex r0 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L56
            r0.<init>(r3)     // Catch: java.lang.Exception -> L56
            java.lang.String r0 = r0.replace(r2, r4)     // Catch: java.lang.Exception -> L56
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L56
            if (r0 == 0) goto L5a
            r0 = 1
            goto L5b
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5a:
            r0 = 0
        L5b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5185020h.invoke$1(X.020h, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(C5185020h c5185020h, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5185020h.l0;
        try {
            Uri uriFromFile = Uri.fromFile(new C0VSJ(str));
            C189200o6.m2constructorimpl(uriFromFile);
            interfaceC20236714Gf.resumeWith(uriFromFile);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(C5185020h c5185020h, Object obj, Object obj2) {
        ((Function1) c5185020h.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$12(C5185020h c5185020h, Object obj, Object obj2) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((C21306718Zt) c5185020h.l0).getClass();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(390));
        Integer numValueOf = Integer.valueOf(iLIZIZ);
        if (iIntValue == 0) {
            i = 0;
        } else {
            i = (int) ((iLIZIZ / iIntValue) * iIntValue2);
        }
        return new Pair(numValueOf, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(C5185020h c5185020h, Object obj, Object obj2) {
        int i;
        Pair pair = (Pair) ((C291001Au) obj2).LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Map Assem observe PoiRevisitPageState updatePoiList, needUpdate=");
        sbLIZ.append(((Boolean) pair.getFirst()).booleanValue());
        sbLIZ.append(", newPoiList=");
        sbLIZ.append(pair.getSecond());
        C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            ((PoiRevisitMapAssem) c5185020h.l0).Lo();
            List list = (List) pair.getSecond();
            if (list != null) {
                int size = list.size();
                PoiRevisitMapAssem poiRevisitMapAssem = (PoiRevisitMapAssem) c5185020h.l0;
                if (size > 3) {
                    i = 400;
                } else {
                    i = (size * 112) + 14 + 34;
                }
                poiRevisitMapAssem.uD0(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(C5185020h c5185020h, Object obj, Object obj2) {
        ((Function2) c5185020h.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()), obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$15(C5185020h c5185020h, Object obj, Object obj2) {
        ((Function2) c5185020h.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()), obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$16(C5185020h c5185020h, Object obj, Object obj2) {
        ((Set) c5185020h.l0).add(new Pair(obj, obj2));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(C5185020h c5185020h, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            C786410Ut5.LJLLLLLL(0, (View) c5185020h.l0);
        } else {
            C786410Ut5.LJLLLLLL(8, (View) c5185020h.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(C5185020h c5185020h, Object obj, Object obj2) {
        List list;
        UrlModel icon;
        LiveEffect liveEffect = (LiveEffect) obj2;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c5185020h.l0;
        if (liveEffect == null || (icon = liveEffect.getIcon()) == null || (list = icon.urlList) == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC1631620sYq.invoke(obj, "", list);
        return Unit.LIZ;
    }

    public static final Object invoke$19(C5185020h c5185020h, Object obj, Object obj2) {
        ((Function2) c5185020h.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()), obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C5185020h c5185020h, Object obj, Object obj2) {
        ((Number) obj).intValue();
        ((Function1) c5185020h.l0).invoke(obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$20(C5185020h c5185020h, Object obj, Object obj2) {
        List list;
        UrlModel icon;
        LiveEffect liveEffect = (LiveEffect) obj2;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c5185020h.l0;
        if (liveEffect == null || (icon = liveEffect.getIcon()) == null || (list = icon.urlList) == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC1631620sYq.invoke(obj, "", list);
        return Unit.LIZ;
    }

    public static final Object invoke$21(C5185020h c5185020h, Object obj, Object obj2) {
        ((Function2) c5185020h.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()), obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$22(C5185020h c5185020h, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.00yb
        });
        Function1 function1 = (Function1) c5185020h.l0;
        if (function1 != null) {
            function1.invoke(obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(C5185020h c5185020h, Object obj, Object obj2) {
        UrlModel icon;
        List<String> list;
        LiveEffect liveEffect = (LiveEffect) obj2;
        if (liveEffect != null && (icon = liveEffect.getIcon()) != null && icon.urlList != null) {
            C431201m2 c431201m2 = (C431201m2) c5185020h.l0;
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            UrlModel icon2 = liveEffect.getIcon();
            if (icon2 != null) {
                list = icon2.urlList;
            } else {
                list = null;
            }
            C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(list);
            c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
            float fLIZIZ = C497740JfY.LIZIZ(3.0f);
            c1324610kZfLIZJ.LJJIIJ = -1;
            c1324610kZfLIZJ.LJJIII = fLIZIZ;
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZJ.LJJI((View) c431201m2.LLILZLL.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(C5185020h c5185020h, Object obj, Object obj2) {
        UrlModel icon;
        List<String> list;
        LiveEffect liveEffect = (LiveEffect) obj2;
        if (liveEffect != null && (icon = liveEffect.getIcon()) != null && (list = icon.urlList) != null) {
            CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = (CountDownForAllV2SettingsDialog) c5185020h.l0;
            C1324720kZq c1324720kZq = countDownForAllV2SettingsDialog.LLLJ;
            if (c1324720kZq != null) {
                C12ES.LJIILL(0, c1324720kZq);
            }
            C1819620xS4.LIZ().LIZJ(list).LJJI(countDownForAllV2SettingsDialog.LLLJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(C5185020h c5185020h, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        if (zBooleanValue) {
            C21578619ce c21578619ce = ((CountDownForAllV2SettingsDialog) c5185020h.l0).LLLII;
            if (c21578619ce != null) {
                c21578619ce.setDescendantFocusability(393216);
            }
            C21578619ce c21578619ce2 = ((CountDownForAllV2SettingsDialog) c5185020h.l0).LLLII;
            if (c21578619ce2 != null) {
                c21578619ce2.fullScroll(130);
            }
            C21578619ce c21578619ce3 = ((CountDownForAllV2SettingsDialog) c5185020h.l0).LLLII;
            if (c21578619ce3 != null) {
                c21578619ce3.setDescendantFocusability(262144);
            }
            C1748440vbG c1748440vbG = ((CountDownForAllV2SettingsDialog) c5185020h.l0).LLLIL;
            if (c1748440vbG != null) {
                c1748440vbG.requestFocus();
            }
        } else {
            C21578619ce c21578619ce4 = ((CountDownForAllV2SettingsDialog) c5185020h.l0).LLLII;
            if (c21578619ce4 != null) {
                c21578619ce4.fullScroll(33);
            }
            View view = ((CountDownForAllV2SettingsDialog) c5185020h.l0).LLJZ;
            if (view != null) {
                view.requestFocus();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(C5185020h c5185020h, Object obj, Object obj2) {
        CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = (CountDownForAllV2SettingsDialog) c5185020h.l0;
        countDownForAllV2SettingsDialog.zS((LiveEffect) obj2, (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$27(C5185020h c5185020h, Object obj, Object obj2) {
        ((Map) c5185020h.l0).put(obj, obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$28(C5185020h c5185020h, Object obj, Object obj2) {
        List<String> list;
        UrlModel icon;
        LiveEffect liveEffect = (LiveEffect) obj2;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5185020h.l0;
        if (liveEffect != null && (icon = liveEffect.getIcon()) != null) {
            list = icon.urlList;
        } else {
            list = null;
        }
        C189200o6.m2constructorimpl(list);
        interfaceC1364105Vn.resumeWith(list);
        return Unit.LIZ;
    }

    public static final Object invoke$29(C5185020h c5185020h, Object obj, Object obj2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        Collection collection = (Collection) obj2;
        if (collection != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) c5185020h.l0) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(collection, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C5185020h c5185020h, Object obj, Object obj2) {
        InterfaceC302601Fg interfaceC302601FgLIZ;
        long j;
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) c5185020h.l0;
        ShowConfig value = liveShowAnchorViewModel.LLILZ.getValue();
        if (value != null && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null) {
            UpdateUserPlaySettingsParams updateUserPlaySettingsParams = new UpdateUserPlaySettingsParams();
            updateUserPlaySettingsParams.settingsMap.put("live_show_duration_per_guest", Long.valueOf(value.durationPerGuest));
            Map<String, Long> map = updateUserPlaySettingsParams.settingsMap;
            if (value.allowOpenMicFreely) {
                j = 1;
            } else {
                j = 0;
            }
            map.put("live_show_guest_open_mic_freely", Long.valueOf(j));
            updateUserPlaySettingsParams.settingsMap.put("live_show_transition_duration", Long.valueOf(value.transitionDurationOfConfig));
            AbstractC19484711Kz<C470590Icr<UpdateUserPlaySettingsResponse.ResponseData>> abstractC19484711KzUpdateUserPlaySettings = interfaceC302601FgLIZ.updateUserPlaySettings(updateUserPlaySettingsParams);
            if (abstractC19484711KzUpdateUserPlaySettings != null) {
                liveShowAnchorViewModel.EQ2().LIZ(abstractC19484711KzUpdateUserPlaySettings.LJIILL(new C09JN() { // from class: X.00KZ
                    @Override // X.C09JN
                    public final void accept(Object obj3) {
                        C1C7U.LIZ("LiveShowAnchorViewModel@f562.updateUserPlaySettings$2");
                        C20441214yg.LIZIZ("LiveShowAnchorViewModel", "updateUserPlaySettings onSuccess");
                        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.updateUserPlaySettings$2");
                    }
                }).LJIIL(new C09JN() { // from class: X.00KY
                    @Override // X.C09JN
                    public final void accept(Object obj3) {
                        C1C7U.LIZ("LiveShowAnchorViewModel@f562.updateUserPlaySettings$3");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateUserPlaySettings onError ");
                        sbLIZ.append(((Throwable) obj3).getMessage());
                        C20441214yg.LIZIZ("LiveShowAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.updateUserPlaySettings$3");
                    }
                }).LJJIIJ());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(C5185020h c5185020h, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        if (((InterfaceC20236714Gf) c5185020h.l0).isActive()) {
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5185020h.l0;
            C189200o6.m2constructorimpl(boolValueOf);
            interfaceC20236714Gf.resumeWith(boolValueOf);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(C5185020h c5185020h, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Function2 function2 = (Function2) c5185020h.l0;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(zBooleanValue), obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(C5185020h c5185020h, Object obj, Object obj2) {
        String str;
        long jLongValue;
        long jLongValue2;
        int iIntValue;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        String str2;
        Long lLJIILIIL;
        long jLongValue6;
        String nickName;
        ImageModel avatarThumb;
        User.EnigmaInfo enigmaInfo;
        String displayId;
        long jLongValue7;
        SeiAppData seiAppData = (SeiAppData) obj;
        SeiCountDownForAllExtra seiCountDownForAllExtra = (SeiCountDownForAllExtra) obj2;
        if (seiCountDownForAllExtra != null) {
            C01IT c01it = (C01IT) c5185020h.l0;
            long j = c01it.LJIJI;
            Long l = seiCountDownForAllExtra.playId;
            if (l == null || j != l.longValue()) {
                if (c01it.LIZIZ == null && !c01it.LJIJ) {
                    c01it.LJIJ = true;
                    Long l2 = seiCountDownForAllExtra.playId;
                    if (l2 != null) {
                        jLongValue7 = l2.longValue();
                    } else {
                        jLongValue7 = 0;
                    }
                    c01it.LJIIL(jLongValue7, "audience_enter_room_first", new C5183020f(c01it, 192));
                }
                ConcurrentHashMap<Long, Integer> concurrentHashMap = c01it.LJIIJ;
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<Long, Integer>> it2 = concurrentHashMap.entrySet().iterator();
                while (true) {
                    str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry<Long, Integer> next = it2.next();
                    long jLongValue8 = next.getKey().longValue();
                    int iIntValue2 = next.getValue().intValue();
                    User userLJIIIIZZ = C01JX.LJIIIIZZ(jLongValue8);
                    CountdownForAllUser countdownForAllUser = new CountdownForAllUser();
                    countdownForAllUser.userId = jLongValue8;
                    Long l3 = c01it.LJIIIZ.get(Long.valueOf(jLongValue8));
                    if (l3 != null) {
                        jLongValue6 = l3.longValue();
                    } else {
                        jLongValue6 = 0;
                    }
                    countdownForAllUser.score = jLongValue6;
                    countdownForAllUser.rank = iIntValue2;
                    countdownForAllUser.user = userLJIIIIZZ;
                    if (userLJIIIIZZ == null || (nickName = userLJIIIIZZ.getNickName()) == null) {
                        nickName = "";
                    }
                    countdownForAllUser.nickname = nickName;
                    if (userLJIIIIZZ != null && (displayId = userLJIIIIZZ.getDisplayId()) != null) {
                        str = displayId;
                    }
                    countdownForAllUser.displayId = str;
                    if (userLJIIIIZZ != null) {
                        avatarThumb = userLJIIIIZZ.getAvatarThumb();
                    } else {
                        avatarThumb = null;
                    }
                    countdownForAllUser.avatarThumb = avatarThumb;
                    if (userLJIIIIZZ != null) {
                        enigmaInfo = userLJIIIIZZ.enigmaInfo;
                    } else {
                        enigmaInfo = null;
                    }
                    countdownForAllUser.enigmaInfo = enigmaInfo;
                    arrayList.add(countdownForAllUser);
                }
                if (arrayList.size() > 1) {
                    C08XD.LJJ(arrayList, new C512401z8(35));
                }
                CountdownForAllContent countdownForAllContent = new CountdownForAllContent();
                countdownForAllContent.roomId = C01JX.LJII();
                if (seiAppData != null && (str2 = seiAppData.channelId) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                countdownForAllContent.channelId = jLongValue;
                Long l4 = seiCountDownForAllExtra.playId;
                if (l4 != null) {
                    jLongValue2 = l4.longValue();
                } else {
                    jLongValue2 = 0;
                }
                countdownForAllContent.playId = jLongValue2;
                Integer num = seiCountDownForAllExtra.status;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                countdownForAllContent.playStatus = iIntValue;
                countdownForAllContent.version = 0L;
                Long l5 = seiCountDownForAllExtra.startTime;
                if (l5 != null) {
                    jLongValue3 = l5.longValue();
                } else {
                    jLongValue3 = 0;
                }
                countdownForAllContent.startTime = jLongValue3;
                countdownForAllContent.endTime = 0L;
                CountdownForAllConfig countdownForAllConfig = new CountdownForAllConfig();
                Long l6 = seiCountDownForAllExtra.duration;
                if (l6 != null) {
                    jLongValue4 = l6.longValue();
                } else {
                    jLongValue4 = 0;
                }
                countdownForAllConfig.duration = jLongValue4;
                Long l7 = seiCountDownForAllExtra.targetScore;
                if (l7 != null) {
                    jLongValue5 = l7.longValue();
                } else {
                    jLongValue5 = 0;
                }
                countdownForAllConfig.targetScore = jLongValue5;
                String str3 = seiCountDownForAllExtra.resourceId;
                if (str3 != null) {
                    str = str3;
                }
                countdownForAllConfig.resourceId = str;
                countdownForAllContent.playConfig = countdownForAllConfig;
                countdownForAllContent.playUsers = arrayList;
                c01it.LJIILIIL(countdownForAllContent, "parse_sei");
            }
        } else {
            C01IT c01it2 = (C01IT) c5185020h.l0;
            c01it2.LJIJ = true;
            c01it2.LJIILIIL(null, "parse_sei");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(C5185020h c5185020h, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        return ((Function1) c5185020h.l0).invoke(obj);
    }

    public static final Object invoke$34(C5185020h c5185020h, Object obj, Object obj2) {
        ((Function2) c5185020h.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()), obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$35(C5185020h c5185020h, Object obj, Object obj2) {
        ((Function2) c5185020h.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()), obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$36(C5185020h c5185020h, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        if (((InterfaceC20236714Gf) c5185020h.l0).isActive()) {
            if (zBooleanValue && u.LJIIZILJ(str, "enteranimation/config.json", false)) {
                InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5185020h.l0;
                Pair pair = new Pair(Boolean.TRUE, a0.LJJJLL("config.json", str));
                C189200o6.m2constructorimpl(pair);
                interfaceC20236714Gf.resumeWith(pair);
            } else {
                InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c5185020h.l0;
                Pair pair2 = new Pair(Boolean.FALSE, "");
                C189200o6.m2constructorimpl(pair2);
                interfaceC20236714Gf2.resumeWith(pair2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$37(C5185020h c5185020h, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        if (((InterfaceC20236714Gf) c5185020h.l0).isActive()) {
            if (zBooleanValue && u.LJIIZILJ(str, "guideanimation/config.json", false)) {
                InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5185020h.l0;
                Pair pair = new Pair(Boolean.TRUE, a0.LJJJLL("config.json", str));
                C189200o6.m2constructorimpl(pair);
                interfaceC20236714Gf.resumeWith(pair);
            } else {
                InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c5185020h.l0;
                Pair pair2 = new Pair(Boolean.FALSE, "");
                C189200o6.m2constructorimpl(pair2);
                interfaceC20236714Gf2.resumeWith(pair2);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$38(C5185020h c5185020h, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((Boolean) c291001Au.LIZ).booleanValue();
            C786410Ut5.LJLLLLLL(0, (View) c5185020h.l0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$39(C5185020h c5185020h, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((Boolean) c291001Au.LIZ).booleanValue();
            C786410Ut5.LJLLLLLL(8, (View) c5185020h.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C5185020h c5185020h, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        ((MultiGuestPreviewLiveSettingViewModel) c5185020h.l0).yQ2(((Number) obj2).intValue(), Integer.valueOf(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$40(C5185020h c5185020h, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((Boolean) c291001Au.LIZ).booleanValue();
            C786410Ut5.LLLLLLZZ((TuxIconView) c5185020h.l0, 8);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$41(C5185020h c5185020h, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((Boolean) c291001Au.LIZ).booleanValue();
            C786410Ut5.LLLLLLZZ((TuxIconView) c5185020h.l0, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$42(C5185020h c5185020h, Object obj, Object obj2) {
        ((C238400w2) c5185020h.l0).element = System.currentTimeMillis();
        return Unit.LIZ;
    }

    public static final Object invoke$43(C5185020h c5185020h, Object obj, Object obj2) {
        ((C238400w2) c5185020h.l0).element = System.currentTimeMillis();
        return Unit.LIZ;
    }

    public static final Object invoke$44(C5185020h c5185020h, Object obj, Object obj2) {
        List list;
        UrlModel icon;
        LiveEffect liveEffect = (LiveEffect) obj2;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c5185020h.l0;
        if (liveEffect == null || (icon = liveEffect.getIcon()) == null || (list = icon.urlList) == null) {
            list = C13BV.INSTANCE;
        }
        interfaceC1631620sYq.invoke(obj, "", list);
        return Unit.LIZ;
    }

    public static final Object invoke$45(C5185020h c5185020h, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            ((Function0) c5185020h.l0).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(C5185020h c5185020h, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        Function2 function2 = (Function2) ((WeakReference) c5185020h.l0).get();
        if (function2 != null) {
            function2.invoke(Integer.valueOf(iIntValue), obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(C5185020h c5185020h, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        Function2 function2 = (Function2) ((WeakReference) c5185020h.l0).get();
        if (function2 != null) {
            function2.invoke(Integer.valueOf(iIntValue), obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(C5185020h c5185020h, Object obj, Object obj2) {
        C1735750vGn authKey;
        MinisReportGetAuthTokenResponse minisReportGetAuthTokenResponse = (MinisReportGetAuthTokenResponse) obj;
        Throwable th = (Throwable) obj2;
        if (th != null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5185020h.l0;
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn.resumeWith(c098200Yq);
        } else if (minisReportGetAuthTokenResponse != null && (authKey = minisReportGetAuthTokenResponse.toAuthKey()) != null) {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c5185020h.l0;
            C189200o6.m2constructorimpl(authKey);
            interfaceC1364105Vn2.resumeWith(authKey);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) c5185020h.l0;
            C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException("auth key parse failed"));
            C189200o6.m2constructorimpl(c098200Yq2);
            interfaceC1364105Vn3.resumeWith(c098200Yq2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(C5185020h c5185020h, Object obj, Object obj2) {
        C1735750vGn authKey;
        MinisReportGetAuthTokenResponse minisReportGetAuthTokenResponse = (MinisReportGetAuthTokenResponse) obj;
        Throwable th = (Throwable) obj2;
        if (th != null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5185020h.l0;
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn.resumeWith(c098200Yq);
        } else if (minisReportGetAuthTokenResponse != null && (authKey = minisReportGetAuthTokenResponse.toAuthKey()) != null) {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c5185020h.l0;
            C189200o6.m2constructorimpl(authKey);
            interfaceC1364105Vn2.resumeWith(authKey);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) c5185020h.l0;
            C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException("material auth key parse failed"));
            C189200o6.m2constructorimpl(c098200Yq2);
            interfaceC1364105Vn3.resumeWith(c098200Yq2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(C5185020h c5185020h, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (MultiGuestLiveShowTransitionDurationSetting.INSTANCE.isGuestShowPreview() && jLongValue == 5) {
            C915980Zwa.LJIIIIZZ();
            if (C921180a4y.LJII()) {
                C020U c020u = new C020U((BaseLiveShowWidget) c5185020h.l0, (BaseLiveShowWidget<BaseLiveShowViewModel>) jLongValue, 0);
                if (C01HT.LIZ() && zBooleanValue) {
                    c020u.invoke();
                } else if (!C01HT.LIZ() && !zBooleanValue) {
                    c020u.invoke();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$50(C5185020h c5185020h, Object obj, Object obj2) {
        String str;
        Integer num;
        MinisUpdateReportResponse minisUpdateReportResponse = (MinisUpdateReportResponse) obj;
        Throwable th = (Throwable) obj2;
        if (th != null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5185020h.l0;
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn.resumeWith(c098200Yq);
        } else if (minisUpdateReportResponse != null && (num = minisUpdateReportResponse.statusCode) != null && num.intValue() == 0) {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c5185020h.l0;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC1364105Vn2.resumeWith(unit);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn3 = (InterfaceC1364105Vn) c5185020h.l0;
            if (minisUpdateReportResponse == null || (str = minisUpdateReportResponse.statusMsg) == null) {
                str = "updateReportV2 failed";
            }
            C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException(str));
            C189200o6.m2constructorimpl(c098200Yq2);
            interfaceC1364105Vn3.resumeWith(c098200Yq2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$51(C5185020h c5185020h, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        ((GuestShowdownIdleSettingsDialog) c5185020h.l0).LLLFZ.LIZIZ(((Number) obj2).intValue(), jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$52(C5185020h c5185020h, Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        View view = ((USHalfPageOrderSummaryCell) c5185020h.l0).itemView;
        if (num != null && num.intValue() > 0) {
            ((TextView) view.findViewById(R.id.us_half_page_order_submit_summary_title)).setText(new SpannableString(u.LJJIFFI(view.getContext().getResources().getQuantityString(2131755288, num.intValue(), num), "{{X}}", num.toString(), false)));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$53(C5185020h c5185020h, Object obj, Object obj2) {
        Boolean bool = (Boolean) ((C291001Au) obj2).LIZ;
        if (bool != null) {
            LocalServiceAlbumFragment localServiceAlbumFragment = (LocalServiceAlbumFragment) c5185020h.l0;
            if (bool.booleanValue()) {
                Context context = localServiceAlbumFragment.getContext();
                String string = null;
                if (context != null) {
                    string = context.getString(2131846618);
                }
                if (C123100dR.LIZ(string) && string != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(localServiceAlbumFragment);
                    c1389890mGx.LJIIJ(string);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(C5185020h c5185020h, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5185020h.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$55(C5185020h c5185020h, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function1 function1 = (Function1) c5185020h.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(C5185020h c5185020h, Object obj, Object obj2) throws JSONException {
        Integer numValueOf;
        String strLJFF;
        JSONObject jSONObject = (JSONObject) obj;
        C766270U4b.LIZLLL(2131840931);
        InterfaceC1107590evd interfaceC1107590evd = ((C262100zr) c5185020h.l0).LIZIZ;
        String str = "";
        if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "taskId", "")) != null) {
            str = strLJFF;
        }
        JSONObject jSONObjectPut = jSONObject.put("taskId", str);
        InterfaceC1107590evd interfaceC1107590evd2 = ((C262100zr) c5185020h.l0).LIZIZ;
        if (interfaceC1107590evd2 != null) {
            numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd2, "isLiving", 0));
        } else {
            numValueOf = null;
        }
        C389001fE.LIZ("gamePartnershipFinishFillAge", jSONObjectPut.put("isLiving", numValueOf), System.currentTimeMillis(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$7(C5185020h c5185020h, Object obj, Object obj2) {
        View view = (View) obj;
        float fFloatValue = ((Number) obj2).floatValue();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) fFloatValue;
            }
            view.requestLayout();
        }
        Function1 function1 = (Function1) c5185020h.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf((int) fFloatValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(C5185020h c5185020h, Object obj, Object obj2) {
        View view = (View) obj;
        float fFloatValue = ((Number) obj2).floatValue();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) fFloatValue;
            }
            view.requestLayout();
        }
        Function1 function1 = (Function1) c5185020h.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf((int) fFloatValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(C5185020h c5185020h, Object obj, Object obj2) {
        if (((String) obj2).length() > 0) {
            ((Function0) c5185020h.l0).invoke();
        }
        return Unit.LIZ;
    }
}
