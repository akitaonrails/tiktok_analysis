package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordDeleteResponse;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.BattleGamePlayContent;
import com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.k;
import com.ss.android.ugc.aweme.comment.poll.repository.PollOption;
import com.ss.android.ugc.aweme.creatoredit.CreatorEditedTranslatedCaptions;
import com.ss.android.ugc.aweme.creatoredit.SubtitleEditInfo;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusFeature;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusFeaturesResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ActivityConfigItem;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.PromotionConfig;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxActivityItem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.spi.ICreatorPlusViewContractDiff;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.lang.ref.Reference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;
import webcast.data.RankUser;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: renamed from: X.0207, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0207 extends C09AY implements Function1 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(205);
    public final int $t;

    public static AnonymousClass0207 get$arr$(int i) {
        AnonymousClass0207 anonymousClass0207 = (AnonymousClass0207) arr$.get(i);
        if (anonymousClass0207 != null) {
            return anonymousClass0207;
        }
        arr$.compareAndSet(i, null, new AnonymousClass0207(i));
        return (AnonymousClass0207) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            case 71:
                return invoke$71(this, obj);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj);
            case 73:
                return invoke$73(this, obj);
            case 74:
                return invoke$74(this, obj);
            case 75:
                return invoke$75(this, obj);
            case 76:
                return invoke$76(this, obj);
            case 77:
                return invoke$77(this, obj);
            case 78:
                return invoke$78(this, obj);
            case 79:
                return invoke$79(this, obj);
            case 80:
                return invoke$80(this, obj);
            case 81:
                return invoke$81(this, obj);
            case 82:
                return invoke$82(this, obj);
            case 83:
                return invoke$83(this, obj);
            case 84:
                return invoke$84(this, obj);
            case 85:
                return invoke$85(this, obj);
            case 86:
                return invoke$86(this, obj);
            case 87:
                return invoke$87(this, obj);
            case 88:
                return invoke$88(this, obj);
            case 89:
                return invoke$89(this, obj);
            case 90:
                return invoke$90(this, obj);
            case 91:
                return invoke$91(this, obj);
            case 92:
                return invoke$92(this, obj);
            case 93:
                return invoke$93(this, obj);
            case 94:
                return invoke$94(this, obj);
            case 95:
                return invoke$95(this, obj);
            case 96:
                return invoke$96(this, obj);
            case 97:
                return invoke$97(this, obj);
            case 98:
                return invoke$98(this, obj);
            case 99:
                return invoke$99(this, obj);
            case 100:
                return invoke$100(this, obj);
            case 101:
                return invoke$101(this, obj);
            case 102:
                return invoke$102(this, obj);
            case 103:
                return invoke$103(this, obj);
            case 104:
                return invoke$104(this, obj);
            case 105:
                return invoke$105(this, obj);
            case 106:
                return invoke$106(this, obj);
            case 107:
                return invoke$107(this, obj);
            case 108:
                return invoke$108(this, obj);
            case 109:
                return invoke$109(this, obj);
            case 110:
                return invoke$110(this, obj);
            case 111:
                return invoke$111(this, obj);
            case 112:
                return invoke$112(this, obj);
            case 113:
                return invoke$113(this, obj);
            case 114:
                return invoke$114(this, obj);
            case 115:
                return invoke$115(this, obj);
            case 116:
                return invoke$116(this, obj);
            case 117:
                return invoke$117(this, obj);
            case 118:
                return invoke$118(this, obj);
            case 119:
                return invoke$119(this, obj);
            case 120:
                return invoke$120(this, obj);
            case 121:
                return invoke$121(this, obj);
            case 122:
                return invoke$122(this, obj);
            case 123:
                return invoke$123(this, obj);
            case 124:
                return invoke$124(this, obj);
            case 125:
                return invoke$125(this, obj);
            case 126:
                return invoke$126(this, obj);
            case 127:
                return invoke$127(this, obj);
            case 128:
                return invoke$128(this, obj);
            case 129:
                return invoke$129(this, obj);
            case 130:
                return invoke$130(this, obj);
            case 131:
                return invoke$131(this, obj);
            case 132:
                return invoke$132(this, obj);
            case 133:
                return invoke$133(this, obj);
            case 134:
                return invoke$134(this, obj);
            case 135:
                return invoke$135(this, obj);
            case 136:
                return invoke$136(this, obj);
            case 137:
                return invoke$137(this, obj);
            case 138:
                return invoke$138(this, obj);
            case 139:
                return invoke$139(this, obj);
            case 140:
                return invoke$140(this, obj);
            case 141:
                return invoke$141(this, obj);
            case 142:
                return invoke$142(this, obj);
            case 143:
                return invoke$143(this, obj);
            case 144:
                return invoke$144(this, obj);
            case 145:
                return invoke$145(this, obj);
            case 146:
                return invoke$146(this, obj);
            case 147:
                return invoke$147(this, obj);
            case 148:
                return invoke$148(this, obj);
            case 149:
                return invoke$149(this, obj);
            case 150:
                return invoke$150(this, obj);
            case 151:
                return invoke$151(this, obj);
            case 152:
                return invoke$152(this, obj);
            case 153:
                return invoke$153(this, obj);
            case 154:
                return invoke$154(this, obj);
            case 155:
                return invoke$155(this, obj);
            case 156:
                return invoke$156(this, obj);
            case 157:
                return invoke$157(this, obj);
            case 158:
                return invoke$158(this, obj);
            case 159:
                return invoke$159(this, obj);
            case 160:
                return invoke$160(this, obj);
            case 161:
                return invoke$161(this, obj);
            case 162:
                return invoke$162(this, obj);
            case 163:
                return invoke$163(this, obj);
            case 164:
                return invoke$164(this, obj);
            case 165:
                return invoke$165(this, obj);
            case 166:
                return invoke$166(this, obj);
            case 167:
                return invoke$167(this, obj);
            case 168:
                return invoke$168(this, obj);
            case 169:
                return invoke$169(this, obj);
            case 170:
                return invoke$170(this, obj);
            case 171:
                return invoke$171(this, obj);
            case 172:
                return invoke$172(this, obj);
            case 173:
                return invoke$173(this, obj);
            case 174:
                return invoke$174(this, obj);
            case 175:
                return invoke$175(this, obj);
            case 176:
                return invoke$176(this, obj);
            case 177:
                return invoke$177(this, obj);
            case 178:
                return invoke$178(this, obj);
            case 179:
                return invoke$179(this, obj);
            case 180:
                return invoke$180(this, obj);
            case 181:
                return invoke$181(this, obj);
            case 182:
                return invoke$182(this, obj);
            case 183:
                return invoke$183(this, obj);
            case 184:
                return invoke$184(this, obj);
            case 185:
                return invoke$185(this, obj);
            case 186:
                return invoke$186(this, obj);
            case 187:
                return invoke$187(this, obj);
            case 188:
                return invoke$188(this, obj);
            case 189:
                return invoke$189(this, obj);
            case 190:
                return invoke$190(this, obj);
            case 191:
                return invoke$191(this, obj);
            case 192:
                return invoke$192(this, obj);
            case 193:
                return invoke$193(this, obj);
            case 194:
                return invoke$194(this, obj);
            case 195:
                return invoke$195(this, obj);
            case 196:
                return invoke$196(this, obj);
            case 197:
                return invoke$197(this, obj);
            case 198:
                return invoke$198(this, obj);
            case 199:
                return invoke$199(this, obj);
            case 200:
                return invoke$200(this, obj);
            case 201:
                return invoke$201(this, obj);
            case 202:
                return invoke$202(this, obj);
            case 203:
                return invoke$203(this, obj);
            case 204:
                return invoke$204(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0207(int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(u.LJJIIJZLJL((String) obj, "item_", false));
    }

    public static final Object invoke$1(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Integer.valueOf(((Number) obj).intValue());
    }

    public static final Object invoke$10(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Long.valueOf(((Room) obj).getId());
    }

    public static final Object invoke$100(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((ViewGroup.LayoutParams) obj).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
        return Unit.LIZ;
    }

    public static final Object invoke$101(AnonymousClass0207 anonymousClass0207, Object obj) {
        if (((TextHeaderRecordDeleteResponse.ResponseData) obj).success) {
            C766270U4b.LIZLLL(2131854340);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$102(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append(':');
        sbLIZ.append(((Number) entry.getValue()).intValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$103(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((Number) obj).intValue() >= 100) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$104(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).intValue();
        return Boolean.TRUE;
    }

    public static final Object invoke$105(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).longValue();
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$106(X.AnonymousClass0207 r2, java.lang.Object r3) {
        /*
            com.bytedance.android.livesdk.model.Gift r3 = (com.bytedance.android.livesdk.model.Gift) r3
            java.util.List<java.lang.Integer> r1 = r3.giftVerticalScenarios
            r2 = 0
            if (r1 == 0) goto L3b
            r0 = 28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L15:
            boolean r0 = X.C176600m4.LIZIZ(r0)
            if (r0 != 0) goto L39
            java.util.List<java.lang.Integer> r1 = r3.giftVerticalScenarios
            if (r1 == 0) goto L2d
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L2d:
            boolean r0 = X.C176600m4.LIZIZ(r2)
            if (r0 != 0) goto L39
            r0 = 0
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L39:
            r0 = 1
            goto L34
        L3b:
            r0 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0207.invoke$106(X.0207, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$107(AnonymousClass0207 anonymousClass0207, Object obj) {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = ((C01AL) obj).LJJI;
        if (abstractC1126600fQI != null) {
            return Long.valueOf(abstractC1126600fQI.LJFF());
        }
        return null;
    }

    public static final Object invoke$108(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((Number) obj).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$109(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (System.currentTimeMillis() - ((Number) obj).longValue() > 60000) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$11(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((User) obj).getId() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$110(AnonymousClass0207 anonymousClass0207, Object obj) {
        return a0.LJJLIIIJILLIZJL((String) obj, new String[]{"="}, 0, 6);
    }

    public static final Object invoke$111(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\'');
        sbLIZ.append((String) obj);
        sbLIZ.append('\'');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$112(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map map = (Map) obj;
        map.put("page_name", "live_take_page");
        map.put("bubble_position", "product_icon");
        map.put("bubble_type_info", "live_pin_education");
        map.put("is_bubble_clickable", CardStruct.IStatusCode.DEFAULT);
        map.put("is_bubble_text_show", "1");
        return Unit.LIZ;
    }

    public static final Object invoke$113(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_recordings_");
        sbLIZ.append((String) obj);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$114(AnonymousClass0207 anonymousClass0207, Object obj) {
        Pair pair = (Pair) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"gift_id\":");
        sbLIZ.append(((Number) pair.getFirst()).longValue());
        sbLIZ.append(",\"send_time\":");
        sbLIZ.append(((Number) pair.getSecond()).longValue());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$115(AnonymousClass0207 anonymousClass0207, Object obj) {
        Pair pair = (Pair) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((Number) pair.getFirst()).longValue());
        sbLIZ.append(',');
        sbLIZ.append(((Number) pair.getSecond()).longValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$117(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
        sbLIZ.append('=');
        sbLIZ.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$118(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append('=');
        sbLIZ.append((String) entry.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$119(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
        sbLIZ.append('=');
        sbLIZ.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Long.valueOf(((User) obj).getId());
    }

    public static final Object invoke$120(AnonymousClass0207 anonymousClass0207, Object obj) {
        return String.valueOf(((ECBillboard) obj).billboardType);
    }

    public static final Object invoke$121(AnonymousClass0207 anonymousClass0207, Object obj) {
        List<ActivityConfigItem> list;
        PromotionConfig promotionConfig = ((ECBillboard) obj).promotionConfig;
        if (promotionConfig != null && (list = promotionConfig.activityConfigItems) != null) {
            ArrayList arrayList = new ArrayList();
            for (ActivityConfigItem activityConfigItem : list) {
                if (Intrinsics.LJFF(activityConfigItem.chosen, Boolean.TRUE)) {
                    arrayList.add(activityConfigItem);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, get$arr$(122), 30);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$122(AnonymousClass0207 anonymousClass0207, Object obj) {
        return String.valueOf(((ActivityConfigItem) obj).text);
    }

    public static final Object invoke$123(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).intValue();
        return Float.valueOf(C418440Gaw.LIZIZ(2));
    }

    public static final Object invoke$124(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append(':');
        sbLIZ.append(((Number) entry.getValue()).longValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$125(AnonymousClass0207 anonymousClass0207, Object obj) {
        C2868019e.LIZIZ = ((C2850018m) obj).LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$126(AnonymousClass0207 anonymousClass0207, Object obj) {
        return ((String) ListProtector.get(((MatchResult) obj).LIZ(), 1)).toUpperCase(Locale.ROOT);
    }

    public static final Object invoke$127(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Integer.valueOf(C814420VxA.LIZIZ((((((Number) obj).intValue() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))) / 3.0f));
    }

    public static final Object invoke$128(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((ViewGroup.LayoutParams) obj).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        return Unit.LIZ;
    }

    public static final Object invoke$129(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$13(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1CC2.LIZ("StateApi", (Throwable) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$130(AnonymousClass0207 anonymousClass0207, Object obj) {
        return String.valueOf(((ECBillboard) obj).billboardType);
    }

    public static final Object invoke$131(AnonymousClass0207 anonymousClass0207, Object obj) {
        List<ActivityConfigItem> list;
        PromotionConfig promotionConfig = ((ECBillboard) obj).promotionConfig;
        if (promotionConfig != null && (list = promotionConfig.activityConfigItems) != null) {
            ArrayList arrayList = new ArrayList();
            for (ActivityConfigItem activityConfigItem : list) {
                if (Intrinsics.LJFF(activityConfigItem.chosen, Boolean.TRUE)) {
                    arrayList.add(activityConfigItem);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, get$arr$(133), 30);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
            return "";
        }
        return "";
    }

    public static final Object invoke$132(AnonymousClass0207 anonymousClass0207, Object obj) {
        return String.valueOf(((ActivityConfigItem) obj).text);
    }

    public static final Object invoke$133(AnonymousClass0207 anonymousClass0207, Object obj) {
        return String.valueOf(((ActivityConfigItem) obj).text);
    }

    public static final Object invoke$134(AnonymousClass0207 anonymousClass0207, Object obj) {
        return ((Map.Entry) obj).getKey();
    }

    public static final Object invoke$136(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((Number) obj).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$137(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
    }

    public static final Object invoke$138(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).intValue();
        return Float.valueOf(C418440Gaw.LIZIZ(3));
    }

    public static final Object invoke$139(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(100 * 0.73f);
        sbLIZ.append('%');
        ((SparkContext) obj).LJJJZ("height", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$14(AnonymousClass0207 anonymousClass0207, Object obj) {
        if (((Number) obj).intValue() == 4) {
            C766270U4b.LIZLLL(2131852933);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$140(AnonymousClass0207 anonymousClass0207, Object obj) {
        return a0.LJLIIIL((String) obj).toString();
    }

    public static final Object invoke$141(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((String) obj).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$142(AnonymousClass0207 anonymousClass0207, Object obj) {
        return ((BattleGamePlayContent.TeamUser) obj).userId.toString();
    }

    public static final Object invoke$143(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append('=');
        sbLIZ.append((String) entry.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$144(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).intValue();
        return Boolean.FALSE;
    }

    public static final Object invoke$145(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$147(AnonymousClass0207 anonymousClass0207, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append(jLongValue);
        sbLIZ.append('\"');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$148(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((Reference) ((Map.Entry) obj).getValue()).get() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$149(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (C123100dR.LIZ((String) entry.getValue())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append('=');
            sbLIZ.append((String) entry.getValue());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public static final Object invoke$15(AnonymousClass0207 anonymousClass0207, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                C766270U4b.LIZLLL(2131852905);
            }
        } else {
            C766270U4b.LIZLLL(2131852906);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$150(AnonymousClass0207 anonymousClass0207, Object obj) {
        return ((String) ListProtector.get(((MatchResult) obj).LIZ(), 1)).toUpperCase(Locale.ROOT);
    }

    public static final Object invoke$151(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\'');
        sbLIZ.append(u.LJJIFFI((String) obj, "'", "''", false));
        sbLIZ.append('\'');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$152(AnonymousClass0207 anonymousClass0207, Object obj) {
        List<SubtitleEditInfo> subtitleEditInfos = ((CreatorEditedTranslatedCaptions) obj).getSubtitleEditInfos();
        if (subtitleEditInfos == null) {
            return C13BV.INSTANCE;
        }
        return subtitleEditInfos;
    }

    public static final Object invoke$153(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((BaseResponse) obj).data != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$154(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((Number) obj).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$155(AnonymousClass0207 anonymousClass0207, Object obj) {
        ArrayList arrayList;
        boolean z;
        List<CreatorPlusFeature> list;
        CreatorPlusFeaturesResponse creatorPlusFeaturesResponse = (CreatorPlusFeaturesResponse) obj;
        if (creatorPlusFeaturesResponse != null && (list = creatorPlusFeaturesResponse.features) != null) {
            arrayList = new ArrayList();
            for (CreatorPlusFeature creatorPlusFeature : list) {
                ICreatorPlusViewContractDiff iCreatorPlusViewContractDiff = (ICreatorPlusViewContractDiff) PluggableExtentionKt.pluggableSpi$default(ICreatorPlusViewContractDiff.class, false, false, false, 14, null);
                if (iCreatorPlusViewContractDiff != null) {
                    iCreatorPlusViewContractDiff.LIZ();
                }
                arrayList.add(creatorPlusFeature);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(true ^ z);
    }

    public static final Object invoke$156(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((List) obj).size() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$158(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).longValue();
        return Boolean.TRUE;
    }

    public static final Object invoke$159(AnonymousClass0207 anonymousClass0207, Object obj) {
        return new C231000uq(((C231000uq) obj).LL, new C291001Au(C00CU.EDIT_CLICK));
    }

    public static final Object invoke$16(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).intValue();
        C766270U4b.LIZLLL(2131852907);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$160(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$161(AnonymousClass0207 anonymousClass0207, Object obj) {
        return new C1939607ik(((RandomMatchContent.UserGroup) obj).userInfo);
    }

    public static final Object invoke$162(AnonymousClass0207 anonymousClass0207, Object obj) {
        String message;
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clean file Cache complete -> ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$163(AnonymousClass0207 anonymousClass0207, Object obj) {
        C443120HZe c443120HZe = (C443120HZe) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(c443120HZe.getFirst());
        sbLIZ.append(", ");
        sbLIZ.append(((Boolean) c443120HZe.getSecond()).booleanValue());
        sbLIZ.append(", ");
        sbLIZ.append((String) c443120HZe.getThird());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$164(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((RankListV2Response.RankInfo) obj).user == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$165(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((RankListV2Response.RankInfo) obj).user == null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$166(AnonymousClass0207 anonymousClass0207, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(th.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$167(AnonymousClass0207 anonymousClass0207, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(th.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$168(AnonymousClass0207 anonymousClass0207, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(th.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$169(AnonymousClass0207 anonymousClass0207, Object obj) {
        List list = (List) obj;
        return new Pair(ListProtector.get(list, 0), ListProtector.get(list, 1));
    }

    public static final Object invoke$17(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z = true;
        if (((PlaybookTagAggregation) obj).playbookFirstLevelTagType != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$170(AnonymousClass0207 anonymousClass0207, Object obj) {
        List list = (List) obj;
        return new C443120HZe(ListProtector.get(list, 0), ListProtector.get(list, 1), ListProtector.get(list, 2));
    }

    public static final Object invoke$171(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(URLEncoder.encode(str, "UTF-8"));
        sbLIZ.append('=');
        sbLIZ.append(URLEncoder.encode(value.toString(), "UTF-8"));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$172(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append('=');
        sbLIZ.append((String) entry.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$173(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append((String) obj);
        sbLIZ.append('\"');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$174(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append((String) obj);
        sbLIZ.append('\"');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$175(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append((String) obj);
        sbLIZ.append('\"');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$176(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append((String) obj);
        sbLIZ.append('\"');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$177(AnonymousClass0207 anonymousClass0207, Object obj) {
        List list = (List) obj;
        return new Pair(((k) ListProtector.get(list, 0)).LJIL(), Integer.valueOf(((k) ListProtector.get(list, 1)).LJIIJJI()));
    }

    public static final Object invoke$178(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        CharSequence charSequence = (CharSequence) ((Map.Entry) obj).getKey();
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$179(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        Collection collection = (Collection) ((Map.Entry) obj).getValue();
        if (collection != null && !collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$18(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((PlaybookTagInfo) obj).tagType == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$180(AnonymousClass0207 anonymousClass0207, Object obj) {
        Object objLJJJLL;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object obj2 = "";
        if (key == null) {
            key = "";
        }
        List list = (List) entry.getValue();
        if (list != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
            obj2 = objLJJJLL;
        }
        return new Pair(key, obj2);
    }

    public static final Object invoke$181(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return new Pair(entry.getKey(), Collections.singletonList(entry.getValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$182(X.AnonymousClass0207 r2, java.lang.Object r3) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto L22
            boolean r0 = r3 instanceof org.json.JSONObject
            if (r0 == 0) goto L1e
            r0 = r3
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "record_id"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L1e
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: org.json.JSONException -> L1a
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r3, r1)     // Catch: org.json.JSONException -> L1a
            goto L1f
        L1a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L22
            return r0
        L22:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0207.invoke$182(X.0207, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$183(AnonymousClass0207 anonymousClass0207, Object obj) {
        String str;
        EmoteModel emoteModel = ((EmoteWithIndex) obj).emoteModel;
        if (emoteModel != null && (str = emoteModel.emoteId) != null) {
            return str;
        }
        return "";
    }

    public static final Object invoke$184(AnonymousClass0207 anonymousClass0207, Object obj) {
        String absolutePath;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            String strLIZLLL = c1533790q13.LIZLLL();
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            File parentFile = new C0VSJ(strLIZLLL).getParentFile();
            if (parentFile != null) {
                absolutePath = parentFile.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            DMGeckoCommonChannelManager.LJIIZILJ = absolutePath;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("im_easter_egg_for_share_text_image");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$185(AnonymousClass0207 anonymousClass0207, Object obj) {
        String absolutePath;
        File parentFile;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            C2252321DDq c2252321DDq = DMGeckoCommonChannelManager.LJIILJJIL;
            String strLIZLLL = c1533790q13.LIZLLL();
            if (strLIZLLL != null && (parentFile = new C0VSJ(strLIZLLL).getParentFile()) != null) {
                absolutePath = parentFile.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            c2252321DDq.setValue(absolutePath);
        } else {
            c1533790q13.LIZLLL.toString();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$186(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (!c1533790q13.LIZIZ || c1533790q13.LIZLLL() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("im_easter_egg_for_share_text_image");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$187(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJIILL = c1533790q13.LIZLLL();
        } else {
            c1533790q13.LIZLLL.toString();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$188(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            String str = DMGeckoCommonChannelManager.LJIJ;
            if (str == null || str.length() == 0) {
                DMGeckoCommonChannelManager.LJIJ = c1533790q13.LIZLLL();
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StoryReveal /story_reveal/story_reveal_dm_promotion.png ");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$189(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJIILLIIL = c1533790q13.LIZLLL();
        } else {
            c1533790q13.LIZLLL.toString();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AnonymousClass0207 anonymousClass0207, Object obj) {
        String str = ((TextHeaderBoardTextFontStyleData) obj).fontIdentifier;
        if (str == null) {
            return "error effect resource";
        }
        return str;
    }

    public static final Object invoke$190(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJIILIIL = c1533790q13.LIZLLL();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/streaks_push_reminder/Streak_Grey_Dark.png");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$191(AnonymousClass0207 anonymousClass0207, Object obj) {
        String absolutePath;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            String strLIZLLL = c1533790q13.LIZLLL();
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            File parentFile = new C0VSJ(strLIZLLL).getParentFile();
            if (parentFile != null) {
                absolutePath = parentFile.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            DMGeckoCommonChannelManager.LJIIJ.setValue(absolutePath);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/fortune_cookie/icon_popup.png");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$192(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJIIL = c1533790q13.LIZLLL();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/streaks_push_reminder/Streak_Gray.png");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$193(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJI = c1533790q13.LIZLLL();
        } else {
            c1533790q13.LIZLLL.toString();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$194(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJFF = c1533790q13.LIZLLL();
        } else {
            c1533790q13.LIZLLL.toString();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$195(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LIZLLL = c1533790q13.LIZLLL();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/game_challenge/emoji_lottie.json");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$196(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJ = c1533790q13.LIZLLL();
        } else {
            c1533790q13.LIZLLL.toString();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$197(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJIIIIZZ = c1533790q13.LIZLLL();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/group_share_post_banner/group_share_banner_light.png");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$198(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJIIIZ = c1533790q13.LIZLLL();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/group_share_post_banner/group_share_banner_dark.png");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$199(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJII = c1533790q13.LIZLLL();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/photo_swap_lottie/social_basic_confetti.json");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Integer.valueOf(((Number) obj).intValue());
    }

    public static final Object invoke$20(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickCloseAllGuestMedia onError: ");
        sbLIZ.append((String) obj);
        C20441214yg.LJ("MultiLiveAsAnchorListDialogV2", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$200(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (!c1533790q13.LIZIZ || c1533790q13.LIZLLL() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/public_group_create_onboarding/ ");
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$201(AnonymousClass0207 anonymousClass0207, Object obj) {
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        layoutParams.width = -1;
        return Unit.LIZ;
    }

    public static final Object invoke$202(AnonymousClass0207 anonymousClass0207, Object obj) {
        C291001Au c291001Au = new C291001Au(Unit.LIZ);
        obj.getClass();
        return new C232500v5(c291001Au);
    }

    public static final Object invoke$203(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((Number) entry.getKey()).intValue());
        sbLIZ.append(':');
        sbLIZ.append(((Number) entry.getValue()).intValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$204(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append(':');
        sbLIZ.append(((Number) entry.getValue()).intValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(X.AnonymousClass0207 r0, java.lang.Object r1) {
        /*
            com.bytedance.android.livesdk.gift.model.GiftPageByCreator r1 = (com.bytedance.android.livesdk.gift.model.GiftPageByCreator) r1
            boolean r0 = r1.display
            if (r0 == 0) goto L1a
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftStructByCreator> r0 = r1.gifts
            if (r0 != 0) goto Lc
            X.13BV r0 = X.C13BV.INSTANCE
        Lc:
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L1a
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L1a:
            r1 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0207.invoke$21(X.0207, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$26(AnonymousClass0207 anonymousClass0207, Object obj) {
        C389001fE.LIZJ("multi_window_mode_change", new Pair[]{new Pair("isInMultiWindowMode", Boolean.valueOf(((Boolean) obj).booleanValue()))});
        return Unit.LIZ;
    }

    public static final Object invoke$27(AnonymousClass0207 anonymousClass0207, Object obj) {
        String str = ((PollOption) obj).text;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final Object invoke$28(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append(':');
        sbLIZ.append((String) entry.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$29(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append(':');
        sbLIZ.append((String) entry.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Boolean) obj).booleanValue();
        return Boolean.FALSE;
    }

    public static final Object invoke$30(AnonymousClass0207 anonymousClass0207, Object obj) {
        return a0.LJLIIIL((String) obj).toString();
    }

    public static final Object invoke$31(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((String) obj).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$32(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$33(AnonymousClass0207 anonymousClass0207, Object obj) {
        return ((String) obj).toLowerCase(Locale.ROOT);
    }

    public static final Object invoke$34(AnonymousClass0207 anonymousClass0207, Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131830306);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AnonymousClass0207 anonymousClass0207, Object obj) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131830306);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-6)));
    }

    public static final Object invoke$37(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)));
    }

    public static final Object invoke$38(AnonymousClass0207 anonymousClass0207, Object obj) {
        obj.getClass();
        return new C0146002m(true);
    }

    public static final Object invoke$39(AnonymousClass0207 anonymousClass0207, Object obj) {
        return ((OgcLynxActivityItem) obj).activityId;
    }

    public static final Object invoke$4(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getValue());
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!((Set) it3.next()).isEmpty()) {
                        return map;
                    }
                }
            }
        }
        return C697090RVz.LIZ();
    }

    public static final Object invoke$40(AnonymousClass0207 anonymousClass0207, Object obj) {
        List<String> list;
        PoiListApi.PoiUrlStruct poiUrlStruct = (PoiListApi.PoiUrlStruct) obj;
        if (poiUrlStruct != null && (list = poiUrlStruct.urlList) != null) {
            return C13LP.LJJJLL(list);
        }
        return null;
    }

    public static final Object invoke$41(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$42(AnonymousClass0207 anonymousClass0207, Object obj) {
        MediaModel mediaModel = (MediaModel) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(mediaModel.width);
        sbLIZ.append('*');
        sbLIZ.append(mediaModel.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$43(AnonymousClass0207 anonymousClass0207, Object obj) {
        long j;
        if (((Boolean) obj).booleanValue()) {
            j = 60000;
        } else {
            j = 15000;
        }
        return Long.valueOf(j);
    }

    public static final Object invoke$44(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Integer.valueOf(((Number) obj).intValue());
    }

    public static final Object invoke$46(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$47(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$48(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$49(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$5(AnonymousClass0207 anonymousClass0207, Object obj) {
        if (!(obj instanceof Integer)) {
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof String) {
                return C2095008Iq.LJIIJJI((String) obj);
            }
            return null;
        }
        return obj;
    }

    public static final Object invoke$50(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$51(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$52(AnonymousClass0207 anonymousClass0207, Object obj) {
        return C2095008Iq.LJIIJJI(((MatchResult) obj).getValue());
    }

    public static final Object invoke$53(AnonymousClass0207 anonymousClass0207, Object obj) {
        int i;
        boolean z;
        String string = obj.toString();
        boolean z2 = true;
        int length = string.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length) {
            if (!z3) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.LJI(string.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z3) {
                if (!z) {
                    z3 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        String string2 = string.subSequence(i2, length + 1).toString();
        if (!TextUtils.isEmpty(string2) && !a0.LJJIIZI(string2, e3.g, false)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$54(AnonymousClass0207 anonymousClass0207, Object obj) {
        String str = (String) obj;
        if (a0.LJJIIZI(str, "live_boards_sei", false)) {
            C456101q3 c456101q3 = C456101q3.LIZ;
            C456101q3.LIZ(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append(':');
        sbLIZ.append(((Number) entry.getValue()).intValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$56(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.TRUE;
    }

    public static final Object invoke$57(AnonymousClass0207 anonymousClass0207, Object obj) {
        return C13BV.INSTANCE;
    }

    public static final Object invoke$58(AnonymousClass0207 anonymousClass0207, Object obj) {
        return ListProtector.get(((MatchResult) obj).LIZ(), 1);
    }

    public static final Object invoke$59(AnonymousClass0207 anonymousClass0207, Object obj) {
        return ((RankUser) obj).avatarThumb;
    }

    public static final Object invoke$6(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append(": ");
        sbLIZ.append(((Number) entry.getValue()).intValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$60(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$61(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$62(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        BannerInRoom bannerInRoom = (BannerInRoom) obj;
        if (bannerInRoom.imageContent == null && bannerInRoom.extendImage == null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$63(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map<String, Object> map = C1338270kvh.LIZ;
        C1CC2.LIZ("StateApi", (Throwable) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$64(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) entry.getKey());
        sbLIZ.append(':');
        sbLIZ.append(((Number) entry.getValue()).intValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$65(AnonymousClass0207 anonymousClass0207, Object obj) {
        int i;
        boolean z;
        String string = obj.toString();
        boolean z2 = true;
        int length = string.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length) {
            if (!z3) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.LJI(string.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z3) {
                if (!z) {
                    z3 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        String string2 = string.subSequence(i2, length + 1).toString();
        if (!TextUtils.isEmpty(string2) && !a0.LJJIIZI(string2, e3.g, false)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T extends X.00bX, X.00bZ] */
    public static final Object invoke$66(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((C062P) obj).LIZ = new InterfaceC111300bX() { // from class: X.00bZ
            public final String LL = "";

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C111500bZ) && Intrinsics.LJFF(this.LL, ((C111500bZ) obj2).LL);
            }

            public final int hashCode() {
                return this.LL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CCDCAddCardHierarchyData(placeHolder=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
        return Unit.LIZ;
    }

    public static final Object invoke$67(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((ViewGroup.LayoutParams) obj).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        return Unit.LIZ;
    }

    public static final Object invoke$68(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((ViewGroup.LayoutParams) obj).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
        return Unit.LIZ;
    }

    public static final Object invoke$69(AnonymousClass0207 anonymousClass0207, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        C249200xm.LIZ.getClass();
        Object[] objArr = new Object[1];
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        objArr[0] = C786410Ut5.k4(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jLongValue / 3600000), Long.valueOf((jLongValue % 3600000) / 60000), Long.valueOf((jLongValue % 60000) / 1000)}, 3));
        return C497740JfY.LJIJJ(2131853596, objArr);
    }

    public static final Object invoke$7(AnonymousClass0207 anonymousClass0207, Object obj) {
        List<Integer> list = ((Gift) obj).giftVerticalScenarios;
        if (list != null && list.contains(37)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final Object invoke$70(AnonymousClass0207 anonymousClass0207, Object obj) {
        return C497740JfY.LJIJJ(2131836652, Long.valueOf(((Number) obj).longValue() / 1000));
    }

    public static final Object invoke$71(AnonymousClass0207 anonymousClass0207, Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        if (matchResult.LIZ().size() >= 2) {
            return ListProtector.get(matchResult.LIZ(), 1);
        }
        return "";
    }

    public static final Object invoke$72(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('=');
        sbLIZ.append(value);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$73(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("album_ai_");
        sbLIZ.append((String) obj);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$74(AnonymousClass0207 anonymousClass0207, Object obj) {
        return C002L.LIZ((RecommendedRoom) obj);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$75(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Unit.LIZ;
    }

    public static final Object invoke$76(AnonymousClass0207 anonymousClass0207, Object obj) {
        C01FD.LIZ("start_live_show");
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853818, obj));
        return Unit.LIZ;
    }

    public static final Object invoke$77(AnonymousClass0207 anonymousClass0207, Object obj) {
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        layoutParams.width = -1;
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        return Unit.LIZ;
    }

    public static final Object invoke$78(AnonymousClass0207 anonymousClass0207, Object obj) {
        return Boolean.valueOf(!a0.LJJJIL((String) obj));
    }

    public static final Object invoke$79(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  ");
        sbLIZ.append(str);
        sbLIZ.append(" = ");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AnonymousClass0207 anonymousClass0207, Object obj) {
        return new C1939607ik(((Gift.ColorGroup) obj).colorInfos);
    }

    public static final Object invoke$80(AnonymousClass0207 anonymousClass0207, Object obj) {
        if (obj == null) {
            return "";
        }
        return obj;
    }

    public static final Object invoke$81(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append((String) obj);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$82(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append((String) obj);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$83(AnonymousClass0207 anonymousClass0207, Object obj) {
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ != null) {
            interfaceC924740aAiLIZ.LIZ("live_show");
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIL(C01EL.START, "live_show");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$84(AnonymousClass0207 anonymousClass0207, Object obj) {
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ != null) {
            interfaceC924740aAiLIZ.LIZIZ("live_show");
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIL(C01EL.END, "live_show");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$85(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((Number) obj).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$86(AnonymousClass0207 anonymousClass0207, Object obj) {
        Pair pair = (Pair) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) pair.getFirst());
        sbLIZ.append('[');
        sbLIZ.append(((Number) pair.getSecond()).intValue());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$87(AnonymousClass0207 anonymousClass0207, Object obj) {
        String strValueOf;
        String str = (String) obj;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = str.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                String strValueOf2 = String.valueOf(cCharAt);
                Locale locale = Locale.ROOT;
                strValueOf = strValueOf2.toUpperCase(locale);
                if (strValueOf.length() > 1) {
                    if (cCharAt != 329) {
                        char cCharAt2 = strValueOf.charAt(0);
                        String lowerCase = strValueOf.substring(1).toLowerCase(locale);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(cCharAt2);
                        sbLIZ.append(lowerCase);
                        strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                    }
                } else {
                    strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                }
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb.append((Object) strValueOf);
            sb.append(str.substring(1));
            return sb.toString();
        }
        return str;
    }

    public static final Object invoke$88(AnonymousClass0207 anonymousClass0207, Object obj) {
        return new C1939607ik(((Gift.ColorGroup) obj).colorInfos);
    }

    public static final Object invoke$89(AnonymousClass0207 anonymousClass0207, Object obj) {
        return new C1939607ik(((Gift.ColorGroup) obj).colorInfos);
    }

    public static final Object invoke$9(AnonymousClass0207 anonymousClass0207, Object obj) {
        boolean z;
        if (((Number) obj).longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$90(AnonymousClass0207 anonymousClass0207, Object obj) {
        return new C1939607ik(((Gift.ColorGroup) obj).colorInfos);
    }

    public static final Object invoke$91(AnonymousClass0207 anonymousClass0207, Object obj) {
        C291001Au c291001Au = new C291001Au(Boolean.TRUE);
        obj.getClass();
        return new C232000v0(c291001Au);
    }

    public static final Object invoke$92(AnonymousClass0207 anonymousClass0207, Object obj) {
        return C2095008Iq.LJIILIIL((String) obj);
    }

    public static final Object invoke$93(AnonymousClass0207 anonymousClass0207, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        long jLongValue = ((Number) entry.getKey()).longValue();
        long jLongValue2 = ((Number) entry.getValue()).longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jLongValue);
        sbLIZ.append(':');
        sbLIZ.append(jLongValue2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$94(AnonymousClass0207 anonymousClass0207, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get sound wave activity content error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("MultiLiveAnchorSettingDialog", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$95(AnonymousClass0207 anonymousClass0207, Object obj) {
        C426750GoL.LJIIIZ((View) obj, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 0, 0, false, 16);
        return Unit.LIZ;
    }

    public static final Object invoke$96(AnonymousClass0207 anonymousClass0207, Object obj) {
        C426750GoL.LJIIIZ((View) obj, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)))), 0, 0, false, 16);
        return Unit.LIZ;
    }

    public static final Object invoke$97(AnonymousClass0207 anonymousClass0207, Object obj) {
        Pair pair = (Pair) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) pair.getFirst());
        sbLIZ.append('=');
        sbLIZ.append((String) pair.getSecond());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$98(AnonymousClass0207 anonymousClass0207, Object obj) {
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadBusinessGeckoResource, isPreloaded: ");
            sbLIZ.append(c1533790q13.LJJIJIIJI);
            sbLIZ.append(", path: ");
            sbLIZ.append(c1533790q13.LIZLLL());
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preloadBusinessGeckoResource, ");
            sbLIZ2.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$99(AnonymousClass0207 anonymousClass0207, Object obj) {
        ((ViewGroup.LayoutParams) obj).width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$116(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$135(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }

    public static final Object invoke$146(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }

    public static final Object invoke$157(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }

    public static final Object invoke$45(AnonymousClass0207 anonymousClass0207, Object obj) {
        return obj;
    }
}
