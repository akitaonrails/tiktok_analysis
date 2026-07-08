package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.BadgeText;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.FontStyle;
import com.bytedance.android.live.base.model.user.PaddingInfo;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestLiveShowPanelEvent;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.hints.LiveGiftApi;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerParamsSettings;
import com.bytedance.android.livesdk.livesetting.clientai.LiveRevenueFeatureIMSettings;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftForceInsertTagEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GuideAnchorTriggerDiscardThresholds;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GuideAnchorTriggerShuffleConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUnusedSettingSolidifyDisableListConfig;
import com.bytedance.android.livesdk.performancetune.perfloadinfo.LivePerfLoadConfigs;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ab.EcSearchPdpOutOfAppDiversionConfigModel;
import com.ss.android.ugc.aweme.ab.HotUpdateDynamicConfig;
import com.ss.android.ugc.aweme.absetting.AddETPropPanelDeliverySourceExperimentConfig;
import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.experiment.UcpNetworkRequestFailedExperimentConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoPollRedirectSchemaModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.aitryon.utils.TryOnNativePrefetchApi;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import com.ss.android.ugc.aweme.ecommerce.ug.earncash.api.LatamInviteEarnCashMsgApi;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.FeedItemTypeCacheOptExpSettingModel;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.ab.FeedResponseFilterRouteGroup;
import com.ss.android.ugc.aweme.feed.ab.FeedResponseFilterRoutingConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geofencing.api.GeoFencingHistoryApi;
import com.ss.android.ugc.aweme.iab.ITtopIABApi;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.exp.FrequencyControlSyncSettingsData;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.GifCardReusedUISlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.rules.GlobalPropsParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.rules.LSPassThroughGlobalPropsSettings;
import com.ss.android.ugc.aweme.nimblecard.tako.vm.NimbleApi;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxConfig;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxPrefetchApi;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.search.pages.visualsearch.smartsearch.core.config.SmartSearchResponseCacheConfig;
import com.ss.android.ugc.aweme.setting.services.ICreatorToolService;
import com.ss.android.ugc.aweme.socialgame.impl.api.SocialGameApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.experiment.feed.AvatarFetchStoryLoadingConfigData;
import com.ss.android.ugc.aweme.upvote.experiment.FifaAnchorIdsConfig;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.StayTimeConfig;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService;
import com.ss.android.ugc.nearby.settings.NearbyTabReasonConfig;
import com.ss.android.ugc.tiktok.pns.upc.config.UPCNetworkReportingConfigData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0206, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0206 extends C09AY implements Function0 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(580);
    public final int $t;

    public static AnonymousClass0206 get$arr$(int i) {
        AnonymousClass0206 anonymousClass0206 = (AnonymousClass0206) arr$.get(i);
        if (anonymousClass0206 != null) {
            return anonymousClass0206;
        }
        arr$.compareAndSet(i, null, new AnonymousClass0206(i));
        return (AnonymousClass0206) arr$.get(i);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$455(AnonymousClass0206 anonymousClass0206) {
        return "";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$67(AnonymousClass0206 anonymousClass0206) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$77(AnonymousClass0206 anonymousClass0206) {
        return "";
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case 120:
                return invoke$120(this);
            case 121:
                return invoke$121(this);
            case 122:
                return invoke$122(this);
            case 123:
                return invoke$123(this);
            case 124:
                return invoke$124(this);
            case 125:
                return invoke$125(this);
            case 126:
                return invoke$126(this);
            case 127:
                return invoke$127(this);
            case 128:
                return invoke$128(this);
            case 129:
                return invoke$129(this);
            case 130:
                return invoke$130(this);
            case 131:
                return invoke$131(this);
            case 132:
                return invoke$132(this);
            case 133:
                return invoke$133(this);
            case 134:
                return invoke$134(this);
            case 135:
                return invoke$135(this);
            case 136:
                return invoke$136(this);
            case 137:
                return invoke$137(this);
            case 138:
                return invoke$138(this);
            case 139:
                return invoke$139(this);
            case 140:
                return invoke$140(this);
            case 141:
                return invoke$141(this);
            case 142:
                return invoke$142(this);
            case 143:
                return invoke$143(this);
            case 144:
                return invoke$144(this);
            case 145:
                return invoke$145(this);
            case 146:
                return invoke$146(this);
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$148(this);
            case 149:
                return invoke$149(this);
            case 150:
                return invoke$150(this);
            case 151:
                return invoke$151(this);
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$153(this);
            case 154:
                return invoke$154(this);
            case 155:
                return invoke$155(this);
            case 156:
                return invoke$156(this);
            case 157:
                return invoke$157(this);
            case 158:
                return invoke$158(this);
            case 159:
                return invoke$159(this);
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            case 162:
                return invoke$162(this);
            case 163:
                return invoke$163(this);
            case 164:
                return invoke$164(this);
            case 165:
                return invoke$165(this);
            case 166:
                return invoke$166(this);
            case 167:
                return invoke$167(this);
            case 168:
                return invoke$168(this);
            case 169:
                return invoke$169(this);
            case 170:
                return invoke$170(this);
            case 171:
                return invoke$171(this);
            case 172:
                return invoke$172(this);
            case 173:
                return invoke$173(this);
            case 174:
                return invoke$174(this);
            case 175:
                return invoke$175(this);
            case 176:
                return invoke$176(this);
            case 177:
                return invoke$177(this);
            case 178:
                return invoke$178(this);
            case 179:
                return invoke$179(this);
            case 180:
                return invoke$180(this);
            case 181:
                return invoke$181(this);
            case 182:
                return invoke$182(this);
            case 183:
                return invoke$183(this);
            case 184:
                return invoke$184(this);
            case 185:
                return invoke$185(this);
            case 186:
                return invoke$186(this);
            case 187:
                return invoke$187(this);
            case 188:
                return invoke$188(this);
            case 189:
                return invoke$189(this);
            case 190:
                return invoke$190(this);
            case 191:
                return invoke$191(this);
            case 192:
                return invoke$192(this);
            case 193:
                return invoke$193(this);
            case 194:
                return invoke$194(this);
            case 195:
                return invoke$195(this);
            case 196:
                return invoke$196(this);
            case 197:
                return invoke$197(this);
            case 198:
                return invoke$198(this);
            case 199:
                return invoke$199(this);
            case 200:
                return invoke$200(this);
            case 201:
                return invoke$201(this);
            case 202:
                return invoke$202(this);
            case 203:
                return invoke$203(this);
            case 204:
                return invoke$204(this);
            case 205:
                return invoke$205(this);
            case 206:
                return invoke$206(this);
            case 207:
                return invoke$207(this);
            case 208:
                return invoke$208(this);
            case 209:
                return invoke$209(this);
            case 210:
                return invoke$210(this);
            case 211:
                return invoke$211(this);
            case 212:
                return invoke$212(this);
            case 213:
                return invoke$213(this);
            case 214:
                return invoke$214(this);
            case 215:
                return invoke$215(this);
            case 216:
                return invoke$216(this);
            case 217:
                return invoke$217(this);
            case 218:
                return invoke$218(this);
            case 219:
                return invoke$219(this);
            case 220:
                return invoke$220(this);
            case 221:
                return invoke$221(this);
            case 222:
                return invoke$222(this);
            case 223:
                return invoke$223(this);
            case 224:
                return invoke$224(this);
            case 225:
                return invoke$225(this);
            case 226:
                return invoke$226(this);
            case 227:
                return invoke$227(this);
            case 228:
                return invoke$228(this);
            case 229:
                return invoke$229(this);
            case 230:
                return invoke$230(this);
            case 231:
                return invoke$231(this);
            case 232:
                return invoke$232(this);
            case 233:
                return invoke$233(this);
            case 234:
                return invoke$234(this);
            case 235:
                return invoke$235(this);
            case 236:
                return invoke$236(this);
            case 237:
                return invoke$237(this);
            case 238:
                return invoke$238(this);
            case 239:
                return invoke$239(this);
            case 240:
                return invoke$240(this);
            case 241:
                return invoke$241(this);
            case 242:
                return invoke$242(this);
            case 243:
                return invoke$243(this);
            case 244:
                return invoke$244(this);
            case 245:
                return invoke$245(this);
            case 246:
                return invoke$246(this);
            case 247:
                return invoke$247(this);
            case 248:
                return invoke$248(this);
            case 249:
                return invoke$249(this);
            case 250:
                return invoke$250(this);
            case 251:
                return invoke$251(this);
            case 252:
                return invoke$252(this);
            case 253:
                return invoke$253(this);
            case 254:
                return invoke$254(this);
            case 255:
                return invoke$255(this);
            case 256:
                return invoke$256(this);
            case 257:
                return invoke$257(this);
            case 258:
                return invoke$258(this);
            case 259:
                return invoke$259(this);
            case 260:
                return invoke$260(this);
            case 261:
                return invoke$261(this);
            case 262:
                return invoke$262(this);
            case 263:
                return invoke$263(this);
            case 264:
                return invoke$264(this);
            case 265:
                return invoke$265(this);
            case 266:
                return invoke$266(this);
            case 267:
                return invoke$267(this);
            case 268:
                return invoke$268(this);
            case 269:
                return invoke$269(this);
            case 270:
                return invoke$270(this);
            case 271:
                return invoke$271(this);
            case 272:
                return invoke$272(this);
            case 273:
                return invoke$273(this);
            case 274:
                return invoke$274(this);
            case 275:
                return invoke$275(this);
            case 276:
                return invoke$276(this);
            case 277:
                return invoke$277(this);
            case 278:
                return invoke$278(this);
            case 279:
                return invoke$279(this);
            case 280:
                return invoke$280(this);
            case 281:
                return invoke$281(this);
            case 282:
                return invoke$282(this);
            case 283:
                return invoke$283(this);
            case 284:
                return invoke$284(this);
            case 285:
                return invoke$285(this);
            case 286:
                return invoke$286(this);
            case 287:
                return invoke$287(this);
            case 288:
                return invoke$288(this);
            case 289:
                return invoke$289(this);
            case 290:
                return invoke$290(this);
            case 291:
                return invoke$291(this);
            case 292:
                return invoke$292(this);
            case 293:
                return invoke$293(this);
            case 294:
                return invoke$294(this);
            case 295:
                return invoke$295(this);
            case 296:
                return invoke$296(this);
            case 297:
                return invoke$297(this);
            case 298:
                return invoke$298(this);
            case 299:
                return invoke$299(this);
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                return invoke$300(this);
            case 301:
                return invoke$301(this);
            case 302:
                return invoke$302(this);
            case 303:
                return invoke$303(this);
            case 304:
                return invoke$304(this);
            case 305:
                return invoke$305(this);
            case 306:
                return invoke$306(this);
            case 307:
                return invoke$307(this);
            case 308:
                return invoke$308(this);
            case 309:
                return invoke$309(this);
            case 310:
                return invoke$310(this);
            case 311:
                return invoke$311(this);
            case 312:
                return invoke$312(this);
            case 313:
                return invoke$313(this);
            case 314:
                return invoke$314(this);
            case 315:
                return invoke$315(this);
            case 316:
                return invoke$316(this);
            case 317:
                return invoke$317(this);
            case 318:
                return invoke$318(this);
            case 319:
                return invoke$319(this);
            case 320:
                return invoke$320(this);
            case 321:
                return invoke$321(this);
            case 322:
                return invoke$322(this);
            case 323:
                return invoke$323(this);
            case 324:
                return invoke$324(this);
            case 325:
                return invoke$325(this);
            case 326:
                return invoke$326(this);
            case 327:
                return invoke$327(this);
            case 328:
                return invoke$328(this);
            case 329:
                return invoke$329(this);
            case 330:
                return invoke$330(this);
            case 331:
                return invoke$331(this);
            case 332:
                return invoke$332(this);
            case 333:
                return invoke$333(this);
            case 334:
                return invoke$334(this);
            case 335:
                return invoke$335(this);
            case 336:
                return invoke$336(this);
            case 337:
                return invoke$337(this);
            case 338:
                return invoke$338(this);
            case 339:
                return invoke$339(this);
            case 340:
                return invoke$340(this);
            case 341:
                return invoke$341(this);
            case 342:
                return invoke$342(this);
            case 343:
                return invoke$343(this);
            case 344:
                return invoke$344(this);
            case 345:
                return invoke$345(this);
            case 346:
                return invoke$346(this);
            case 347:
                return invoke$347(this);
            case 348:
                return invoke$348(this);
            case 349:
                return invoke$349(this);
            case 350:
                return invoke$350(this);
            case 351:
                return invoke$351(this);
            case 352:
                return invoke$352(this);
            case 353:
                return invoke$353(this);
            case 354:
                return invoke$354(this);
            case 355:
                return invoke$355(this);
            case 356:
                return invoke$356(this);
            case 357:
                return invoke$357(this);
            case 358:
                return invoke$358(this);
            case 359:
                return invoke$359(this);
            case 360:
                return invoke$360(this);
            case 361:
                return invoke$361(this);
            case 362:
                return invoke$362(this);
            case 363:
                return invoke$363(this);
            case 364:
                return invoke$364(this);
            case 365:
                return invoke$365(this);
            case 366:
                return invoke$366(this);
            case 367:
                return invoke$367(this);
            case 368:
                return invoke$368(this);
            case 369:
                return invoke$369(this);
            case 370:
                return invoke$370(this);
            case 371:
                return invoke$371(this);
            case 372:
                return invoke$372(this);
            case 373:
                return invoke$373(this);
            case 374:
                return invoke$374(this);
            case 375:
                return invoke$375(this);
            case 376:
                return invoke$376(this);
            case 377:
                return invoke$377(this);
            case 378:
                return invoke$378(this);
            case 379:
                return invoke$379(this);
            case 380:
                return invoke$380(this);
            case 381:
                return invoke$381(this);
            case 382:
                return invoke$382(this);
            case 383:
                return invoke$383(this);
            case 384:
                return invoke$384(this);
            case 385:
                return invoke$385(this);
            case 386:
                return invoke$386(this);
            case 387:
                return invoke$387(this);
            case 388:
                return invoke$388(this);
            case 389:
                return invoke$389(this);
            case 390:
                return invoke$390(this);
            case 391:
                return invoke$391(this);
            case 392:
                return invoke$392(this);
            case 393:
                return invoke$393(this);
            case 394:
                return invoke$394(this);
            case 395:
                return invoke$395(this);
            case 396:
                return invoke$396(this);
            case 397:
                return invoke$397(this);
            case 398:
                return invoke$398(this);
            case 399:
                return invoke$399(this);
            case 400:
                return invoke$400(this);
            case 401:
                return invoke$401(this);
            case 402:
                return invoke$402(this);
            case 403:
                return invoke$403(this);
            case 404:
                return invoke$404(this);
            case 405:
                return invoke$405(this);
            case 406:
                return invoke$406(this);
            case 407:
                return invoke$407(this);
            case 408:
                return invoke$408(this);
            case 409:
                return invoke$409(this);
            case 410:
                return invoke$410(this);
            case 411:
                return invoke$411(this);
            case 412:
                return invoke$412(this);
            case 413:
                return invoke$413(this);
            case 414:
                return invoke$414(this);
            case 415:
                return invoke$415(this);
            case 416:
                return invoke$416(this);
            case 417:
                return invoke$417(this);
            case 418:
                return invoke$418(this);
            case 419:
                return invoke$419(this);
            case 420:
                return invoke$420(this);
            case 421:
                return invoke$421(this);
            case 422:
                return invoke$422(this);
            case 423:
                return invoke$423(this);
            case 424:
                return invoke$424(this);
            case 425:
                return invoke$425(this);
            case 426:
                return invoke$426(this);
            case 427:
                return invoke$427(this);
            case 428:
                return invoke$428(this);
            case 429:
                return invoke$429(this);
            case 430:
                return invoke$430(this);
            case 431:
                return invoke$431(this);
            case 432:
                return invoke$432(this);
            case 433:
                return invoke$433(this);
            case 434:
                return invoke$434(this);
            case 435:
                return invoke$435(this);
            case 436:
                return invoke$436(this);
            case 437:
                return invoke$437(this);
            case 438:
                return invoke$438(this);
            case 439:
                return invoke$439(this);
            case 440:
                return invoke$440(this);
            case 441:
                return invoke$441(this);
            case 442:
                return invoke$442(this);
            case 443:
                return invoke$443(this);
            case 444:
                return invoke$444(this);
            case 445:
                return invoke$445(this);
            case 446:
                return invoke$446(this);
            case 447:
                return invoke$447(this);
            case 448:
                return invoke$448(this);
            case 449:
                return invoke$449(this);
            case 450:
                return invoke$450(this);
            case 451:
                return invoke$451(this);
            case 452:
                return invoke$452(this);
            case 453:
                return invoke$453(this);
            case 454:
                return invoke$454(this);
            case 455:
                return invoke$455(this);
            case 456:
                return invoke$456(this);
            case 457:
                return invoke$457(this);
            case 458:
                return invoke$458(this);
            case 459:
                return invoke$459(this);
            case 460:
                return invoke$460(this);
            case 461:
                return invoke$461(this);
            case 462:
                return invoke$462(this);
            case 463:
                return invoke$463(this);
            case 464:
                return invoke$464(this);
            case 465:
                return invoke$465(this);
            case 466:
                return invoke$466(this);
            case 467:
                return invoke$467(this);
            case 468:
                return invoke$468(this);
            case 469:
                return invoke$469(this);
            case 470:
                return invoke$470(this);
            case 471:
                return invoke$471(this);
            case 472:
                return invoke$472(this);
            case 473:
                return invoke$473(this);
            case 474:
                return invoke$474(this);
            case 475:
                return invoke$475(this);
            case 476:
                return invoke$476(this);
            case 477:
                return invoke$477(this);
            case 478:
                return invoke$478(this);
            case 479:
                return invoke$479(this);
            case 480:
                return invoke$480(this);
            case 481:
                return invoke$481(this);
            case 482:
                return invoke$482(this);
            case 483:
                return invoke$483(this);
            case 484:
                return invoke$484(this);
            case 485:
                return invoke$485(this);
            case 486:
                return invoke$486(this);
            case 487:
                return invoke$487(this);
            case 488:
                return invoke$488(this);
            case 489:
                return invoke$489(this);
            case 490:
                return invoke$490(this);
            case 491:
                return invoke$491(this);
            case 492:
                return invoke$492(this);
            case 493:
                return invoke$493(this);
            case 494:
                return invoke$494(this);
            case 495:
                return invoke$495(this);
            case 496:
                return invoke$496(this);
            case 497:
                return invoke$497(this);
            case 498:
                return invoke$498(this);
            case 499:
                return invoke$499(this);
            case 500:
                return invoke$500(this);
            case 501:
                return invoke$501(this);
            case 502:
                return invoke$502(this);
            case 503:
                return invoke$503(this);
            case 504:
                return invoke$504(this);
            case 505:
                return invoke$505(this);
            case 506:
                return invoke$506(this);
            case 507:
                return invoke$507(this);
            case 508:
                return invoke$508(this);
            case 509:
                return invoke$509(this);
            case 510:
                return invoke$510(this);
            case 511:
                return invoke$511(this);
            case 512:
                return invoke$512(this);
            case 513:
                return invoke$513(this);
            case 514:
                return invoke$514(this);
            case 515:
                return invoke$515(this);
            case 516:
                return invoke$516(this);
            case 517:
                return invoke$517(this);
            case 518:
                return invoke$518(this);
            case 519:
                return invoke$519(this);
            case 520:
                return invoke$520(this);
            case 521:
                return invoke$521(this);
            case 522:
                return invoke$522(this);
            case 523:
                return invoke$523(this);
            case 524:
                return invoke$524(this);
            case 525:
                return invoke$525(this);
            case 526:
                return invoke$526(this);
            case 527:
                return invoke$527(this);
            case 528:
                return invoke$528(this);
            case 529:
                return invoke$529(this);
            case 530:
                return invoke$530(this);
            case 531:
                return invoke$531(this);
            case 532:
                return invoke$532(this);
            case 533:
                return invoke$533(this);
            case 534:
                return invoke$534(this);
            case 535:
                return invoke$535(this);
            case 536:
                return invoke$536(this);
            case 537:
                return invoke$537(this);
            case 538:
                return invoke$538(this);
            case 539:
                return invoke$539(this);
            case 540:
                return invoke$540(this);
            case 541:
                return invoke$541(this);
            case 542:
                return invoke$542(this);
            case 543:
                return invoke$543(this);
            case 544:
                return invoke$544(this);
            case 545:
                return invoke$545(this);
            case 546:
                return invoke$546(this);
            case 547:
                return invoke$547(this);
            case 548:
                return invoke$548(this);
            case 549:
                return invoke$549(this);
            case 550:
                return invoke$550(this);
            case 551:
                return invoke$551(this);
            case 552:
                return invoke$552(this);
            case 553:
                return invoke$553(this);
            case 554:
                return invoke$554(this);
            case 555:
                return invoke$555(this);
            case 556:
                return invoke$556(this);
            case 557:
                return invoke$557(this);
            case 558:
                return invoke$558(this);
            case 559:
                return invoke$559(this);
            case 560:
                return invoke$560(this);
            case 561:
                return invoke$561(this);
            case 562:
                return invoke$562(this);
            case 563:
                return invoke$563(this);
            case 564:
                return invoke$564(this);
            case 565:
                return invoke$565(this);
            case 566:
                return invoke$566(this);
            case 567:
                return invoke$567(this);
            case 568:
                return invoke$568(this);
            case 569:
                return invoke$569(this);
            case 570:
                return invoke$570(this);
            case 571:
                return invoke$571(this);
            case 572:
                return invoke$572(this);
            case 573:
                return invoke$573(this);
            case 574:
                return invoke$574(this);
            case 575:
                return invoke$575(this);
            case 576:
                return invoke$576(this);
            case 577:
                return invoke$577(this);
            case 578:
                return invoke$578(this);
            case 579:
                return invoke$579(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0206(int i) {
        super(0);
        this.$t = i;
    }

    public static final Object invoke$0(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1138320fjC("PostModeABPreload-thread")).plus(C505101xx.LIZIZ));
    }

    public static final Object invoke$1(AnonymousClass0206 anonymousClass0206) {
        return C927810aFf.LIZ();
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AnonymousClass0206 anonymousClass0206) throws JSONException {
        ConcurrentHashMap<String, Map<String, String>> concurrentHashMap = C1896840zSc.LIZ;
        if (!concurrentHashMap.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Map<String, String>> entry : concurrentHashMap.entrySet()) {
                Map<String, String> value = entry.getValue();
                if (value != null && !value.isEmpty()) {
                    jSONObject.put(entry.getKey(), new JSONObject(entry.getValue()));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("compensation_json_str", C786410Ut5.J3(jSONObject));
            C20684815ws.LJIILLIIL("ug_ai_cache_log", linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$100(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("enable_ec_general_search_track", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$101(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_pdp_out_of_app_fix_btm_token", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$102(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_spark_preload_config_reuse_fix", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$103(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_shop_result_pre_code_cache", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$104(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_middle_enable_schema_jump", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$105(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_pdp_out_of_app_pass_through_pdp_params", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$106(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_fix_blankpage_repeat", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$107(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_middle_fix_theme", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$108(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_sug_blue_opt", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$109(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_general_search_prefetch_image", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$11(AnonymousClass0206 anonymousClass0206) {
        return C0C64.LJIILLIIL().LJJ(31744, "share_crowd_pre_shorten_share_url", "", true);
    }

    public static final Object invoke$110(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_result_enable_pre_code_cache", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$111(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_sug_cache_optimized_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$112(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_photo_search_preload_image_key", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$113(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_fix_detail_search_bar_leak", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$114(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_general_search_store_pdp", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$115(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_new_user_refresh_opt", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$116(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue;
        boolean z = false;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_result_tab_page_animation", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue == 1 || iIntValue == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$117(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_middle_keyboard_monitor", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$118(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_general_search_prefetch_image", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$119(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_live_card_disable_poster", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$12(AnonymousClass0206 anonymousClass0206) {
        return Float.valueOf(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
    }

    public static final Object invoke$120(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_photo_search_reuse_bitmap_optimize", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$121(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_middle_page_prefetch_first_screen_data", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$122(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_middle_page_refactor", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$123(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_fix_result_keyboard_open_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$124(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_middle_reuse_param_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$125(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_transfer_font_size_opt", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$126(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_shop_search_enable_async_update", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$127(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_always_use_ec_sug", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$128(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 2, "ec_mix_shop_search_pre_create_count", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final Object invoke$129(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_general_search_dynamic_anchor_log_ab", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$13(AnonymousClass0206 anonymousClass0206) {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "migrate_draft_debug_mock_m1_draft_save_version", "", true);
        if (strLJJ == null) {
            return "";
        }
        return strLJJ;
    }

    public static final Object invoke$130(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_remove_half_page_divide_line", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$131(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_opt_bg_color", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$132(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_shop_search_pre_decode", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$133(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 36;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 36, "ec_photo_search_area_size", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$134(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_general_search_log_ab", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$135(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_remove_set_hint_by_sug_word_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$136(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_shop_search_pre_layout", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$137(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_middle_disable_spark_reuse", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$138(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("ec_search_revert_client_request_id", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$139(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_bar_live_icon_auto_play", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$14(AnonymousClass0206 anonymousClass0206) {
        C0OLA c0ola = C0OLA.LIZ;
        C0OLA.LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01QO(null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$140(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_bottom_button_diversion_new_play_condition", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$141(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("ec_search_sync_preload_client_request_id", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$142(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_shop_search_scroll_pre_create", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$143(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_middle_enable_pre_code_cache", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$144(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_general_sug_blue_opt", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$145(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 10;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 10, "ec_search_bottom_button_diversion_play_duration", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$146(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_shop_search_enable_step_event", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$147(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_middle_fix_memory_leak", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$148(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_half_shop_height_subtract_nav_bar", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$149(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_shop_search_full_chunk_enable_post", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$15(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "friends_push_landing_fallback_to_bottom_tab_fix", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$150(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_mix_container_leak_fix", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$151(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_bottom_button_diversion", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$152(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_show_old_result", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$153(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_deal_skin_anim_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$154(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("ec_search_schema_report_enable", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return Boolean.FALSE;
        }
        return c098200Yq;
    }

    public static final Object invoke$155(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        HotUpdateDynamicConfig hotUpdateDynamicConfig = C00JF.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(HotUpdateDynamicConfig.class, hotUpdateDynamicConfig, "live_hot_update_dynamic_trigger", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return hotUpdateDynamicConfig;
    }

    public static final Object invoke$156(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        C13BV c13bv = C118600ci.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(List.class, c13bv, "studio_autocut_exclude_features", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return c13bv;
    }

    public static final Object invoke$157(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightDbCleanup", "init scope failed", thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final Object invoke$158(AnonymousClass0206 anonymousClass0206) {
        return new AutoSoundCheckService();
    }

    public static final Object invoke$159(AnonymousClass0206 anonymousClass0206) {
        return C0NSL.LIZ().create(TryOnNativePrefetchApi.class);
    }

    public static final Object invoke$16(AnonymousClass0206 anonymousClass0206) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$160(AnonymousClass0206 anonymousClass0206) {
        return C0NSL.LIZ().create(LatamInviteEarnCashMsgApi.class);
    }

    public static final Object invoke$161(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("tt_clear_group_story_cache_for_memory", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$162(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "detail_page_demand_load_page_experiment", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = 0;
        }
        ((Number) c098200Yq).intValue();
        return c098200Yq;
    }

    public static final Object invoke$163(AnonymousClass0206 anonymousClass0206) {
        boolean z = true;
        if (((Number) C00ZN.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$164(AnonymousClass0206 anonymousClass0206) {
        Object obj;
        ArrayList arrayList;
        Object obj2 = null;
        try {
            List list = (List) C0C64.LJIILLIIL().LJJII(List.class, C097100Yf.LIZ, "exposed_friend_information_scene", true);
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((Number) it2.next()).intValue()));
                }
            } else {
                arrayList = null;
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        if (obj2 == null) {
            return C097100Yf.LIZ;
        }
        return obj2;
    }

    public static final Object invoke$165(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "saf_config_changed_empty_disptach_fix", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$166(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_cache_erase_after_use", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$167(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "sticker_input_suggest_scene_exempt", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$168(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "tt_refresh_after_cache_story_click", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$169(AnonymousClass0206 anonymousClass0206) {
        int i = 0;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) C120200cy.LIZ.getValue(), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        for (Object obj : listLJJLIIIJILLIZJL) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair(a0.LJLIIIL((String) obj).toString(), Integer.valueOf(i)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }

    public static final Object invoke$17(AnonymousClass0206 anonymousClass0206) {
        long jLongValue = ((Number) C078600Rc.LIZJ.getValue()).longValue();
        if (jLongValue < 0) {
            return null;
        }
        return C23250099c.LIZLLL(C1309240kAs.LIZLLL, null, null, new C01XT(jLongValue, null), 3);
    }

    public static final Object invoke$170(AnonymousClass0206 anonymousClass0206) {
        String str = "video,collection,music,prop,product,places,favourite_playlist,movies,books,comment,add_yours,challenge,series";
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "feed_collect_tab_order_setting", "video,collection,music,prop,product,places,favourite_playlist,movies,books,comment,add_yours,challenge,series", true);
        if (strLJJ != null) {
            str = strLJJ;
        }
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService != null) {
            iFavoriteService.LJIIIZ(str);
        }
        return str;
    }

    public static final Object invoke$171(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "friends_v3_enable_limit_skylight_initial_fetch_count", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$172(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_cache_save_debounce_ms", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$173(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FeedItemTypeCacheOptExpSettingModel feedItemTypeCacheOptExpSettingModel = C123000dQ.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(FeedItemTypeCacheOptExpSettingModel.class, feedItemTypeCacheOptExpSettingModel, "feed_item_type_cache_opt_exp_setting", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return feedItemTypeCacheOptExpSettingModel;
    }

    public static final Object invoke$174(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(((FeedItemTypeCacheOptExpSettingModel) C123000dQ.LIZIZ.getValue()).viewTypes, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            for (String str : listLJJLIIIJILLIZJL) {
                arrayList.add(new Pair(Integer.valueOf(CastIntegerProtector.parseInt(str)), Integer.valueOf(CastIntegerProtector.parseInt(str))));
            }
            c098200Yq = C2097608Jq.LJIILLIIL(arrayList);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq == null) {
            return C2097608Jq.LJ();
        }
        return c098200Yq;
    }

    public static final Object invoke$175(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("tt_group_social_status_memory_leak_fix", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$176(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_skylight_preload_resume", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$177(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_skylight_preload_resume_v2", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$178(AnonymousClass0206 anonymousClass0206) {
        return C0C64.LJIILLIIL().LJIL(31744, 2, "sidebar_refreshable_section_ids", "", true);
    }

    public static final Object invoke$179(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_callback_null_aweme_guard", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.TRUE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$18(X.AnonymousClass0206 r3) {
        /*
            X.01GW r0 = X.C078600Rc.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L15:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r1 = r2.next()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "init_pitaya_time"
            java.lang.Object r1 = r1.get(r0)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L15
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L15
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L15
            r3.add(r0)
            goto L15
        L46:
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L5e:
            r1 = r2
        L5f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r1.compareTo(r2)
            if (r0 <= 0) goto L5f
            goto L5e
        L7a:
            r2 = -1
            goto L8d
        L7d:
            if (r1 == 0) goto L7a
            int r0 = r1.intValue()
            if (r0 <= 0) goto L7a
            int r0 = r1.intValue()
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L8d:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0206.invoke$18(X.0206):java.lang.Object");
    }

    public static final Object invoke$180(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "safe_handler_leak_fix", true, false));
    }

    public static final Object invoke$181(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "feed_render_thread_settle_enable", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return Boolean.FALSE;
        }
        return c098200Yq;
    }

    public static final Object invoke$182(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "following_feed_skylight_distance_optimize", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$183(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "tt_disallow_legacy_inbox_preload", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$184(AnonymousClass0206 anonymousClass0206) {
        List list = (List) C0C64.LJIILLIIL().LJJII(List.class, C162900jr.LIZ, "studio_editor_pro_create_tab_ai_badge_tools", true);
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString().toLowerCase(Locale.ROOT));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final Object invoke$185(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "feed_skylight_bg_pause", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$186(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "feed_skylight_bg_pause_v2", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$187(AnonymousClass0206 anonymousClass0206) {
        return Keva.getRepo("repo_favorite_tab_counts");
    }

    public static final Object invoke$188(AnonymousClass0206 anonymousClass0206) {
        C010E.LIZ.getClass();
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(GeoFencingHistoryApi.class);
    }

    public static final Object invoke$189(AnonymousClass0206 anonymousClass0206) {
        return Boolean.TRUE;
    }

    public static final Object invoke$19(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Map<String, Map<String, Object>> map = C078600Rc.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(Map.class, map, "starship_pitaya_init_config_list", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return map;
    }

    public static final Object invoke$190(AnonymousClass0206 anonymousClass0206) {
        return Boolean.FALSE;
    }

    public static final Object invoke$191(AnonymousClass0206 anonymousClass0206) {
        return C0T1N.LIZ();
    }

    public static final Object invoke$192(AnonymousClass0206 anonymousClass0206) {
        int iLIZIZ;
        if (((Boolean) C142700gb.LIZ.getValue()).booleanValue()) {
            iLIZIZ = GifCardReusedUISlot.LLL;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
        }
        return Integer.valueOf(iLIZIZ);
    }

    public static final Object invoke$193(AnonymousClass0206 anonymousClass0206) {
        int iLIZIZ;
        if (((Boolean) C142700gb.LIZ.getValue()).booleanValue()) {
            iLIZIZ = GifCardReusedUISlot.LLLF;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
        }
        return Integer.valueOf(iLIZIZ);
    }

    public static final Object invoke$194(AnonymousClass0206 anonymousClass0206) {
        return new DMGeckoCommonChannelManager.Service();
    }

    public static final Object invoke$195(AnonymousClass0206 anonymousClass0206) {
        return SettingsManager.LIZLLL().LJIIIIZZ("local_service_passthrough_global_props_params", GlobalPropsParamsConfig.class, LSPassThroughGlobalPropsSettings.defaultConfig);
    }

    public static final Object invoke$196(AnonymousClass0206 anonymousClass0206) {
        return new LinkedHashMap();
    }

    public static final Object invoke$197(AnonymousClass0206 anonymousClass0206) {
        return new Object() { // from class: X.01aV
        };
    }

    public static final Object invoke$198(AnonymousClass0206 anonymousClass0206) {
        return C1227904rF.LIZ;
    }

    public static final Object invoke$199(AnonymousClass0206 anonymousClass0206) {
        return Keva.getRepo("ogc_lynx_prefetch_cache");
    }

    public static final Object invoke$2(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$20(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_back_top_expand_dynamic_sticky_fix", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$200(AnonymousClass0206 anonymousClass0206) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OgcLynxConfig ogcLynxConfig = C01VR.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ogc_lynx_initial_data_load_config", OgcLynxConfig.class, ogcLynxConfig);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return ogcLynxConfig;
    }

    public static final Object invoke$201(AnonymousClass0206 anonymousClass0206) {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0CQT.LIZJ)) != null) {
            return c1499850p8JCreateBuilder.build().retrofit.LIZ(OgcLynxPrefetchApi.class);
        }
        return null;
    }

    public static final Object invoke$202(AnonymousClass0206 anonymousClass0206) {
        return UUID.randomUUID().toString();
    }

    public static final Object invoke$203(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ).plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 12)));
    }

    public static final Object invoke$204(AnonymousClass0206 anonymousClass0206) {
        return new C496201wW();
    }

    public static final Object invoke$205(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
    }

    public static final Object invoke$206(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJ();
    }

    public static final Object invoke$207(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "lynx_async_pre_layout_with_pre_gecko", true));
    }

    public static final Object invoke$208(AnonymousClass0206 anonymousClass0206) {
        return new LinkedHashMap();
    }

    public static final Object invoke$209(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public static final Object invoke$21(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_background_style_switch", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$210(AnonymousClass0206 anonymousClass0206) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C115300cB.LIZ, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
            if (numLJIIJJI != null) {
                arrayList.add(numLJIIJJI);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final Object invoke$211(AnonymousClass0206 anonymousClass0206) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C115200cA.LIZ, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
            if (numLJIIJJI != null) {
                arrayList.add(numLJIIJJI);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final Object invoke$212(AnonymousClass0206 anonymousClass0206) {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "studio_edit_pre_publish_toolbar_allow_list", "", true);
        if (strLJJ != null && strLJJ.length() != 0) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C0C64.LJIILLIIL().LJJ(31744, "studio_edit_pre_publish_toolbar_allow_list", "", true), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
                if (numLJIIJJI != null) {
                    arrayList.add(numLJIIJJI);
                }
            }
            return C13LP.LLIIJI(arrayList);
        }
        return C08CX.INSTANCE;
    }

    public static final Object invoke$213(AnonymousClass0206 anonymousClass0206) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C115400cC.LIZ, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
            if (numLJIIJJI != null) {
                arrayList.add(numLJIIJJI);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final Object invoke$214(AnonymousClass0206 anonymousClass0206) {
        String str = (String) C118100cd.LIZ.getValue();
        if (str != null && !a0.LJJJIL(str)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    public static final Object invoke$215(AnonymousClass0206 anonymousClass0206) {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C1477305qN.LIZJ)) != null) {
            return c1499850p8JCreateBuilder.build().retrofit.LIZ(SocialGameApi.class);
        }
        return null;
    }

    public static final Object invoke$216(AnonymousClass0206 anonymousClass0206) {
        return new AudioCopyrightDetectAPI();
    }

    public static /* bridge */ /* synthetic */ Object invoke$217(AnonymousClass0206 anonymousClass0206) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C786410Ut5.w2(C844470XAv.LIZ()).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("mix_editing_frames_cache");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj.getAbsolutePath();
    }

    public static final Object invoke$218(AnonymousClass0206 anonymousClass0206) {
        boolean z = true;
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "studio_mix_material_pre_feature_album_scenes", CardStruct.IStatusCode.DEFAULT, true);
        ArrayList arrayList = new ArrayList();
        if (strLJJ != null && strLJJ.length() != 0) {
            z = false;
        }
        if (!z) {
            try {
                Iterator it2 = a0.LJJLIIIJILLIZJL(strLJJ, new String[]{","}, 0, 6).iterator();
                while (it2.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return arrayList;
    }

    public static final Object invoke$219(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    public static final Object invoke$22(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        String[] strArr = C125200dm.LIZ;
        String[] strArr2 = (String[]) c0c64LJIILLIIL.LJJIII("ec_send_page_log_container_destroyed_events", 0, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a0.LJLIIIL(str).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return C13LP.LLIIJI(arrayList2);
    }

    public static final Object invoke$220(AnonymousClass0206 anonymousClass0206) {
        return ServiceManager.get().getService(ICreatorToolService.class);
    }

    public static final Object invoke$221(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_profile_avoid_avatar_redundant_update", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$222(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    public static final Object invoke$223(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "tt_im_streak_sticker_enable", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$224(AnonymousClass0206 anonymousClass0206) {
        return new HashSet();
    }

    public static final Object invoke$225(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        List listAsList;
        Object obj = null;
        try {
            c098200Yq = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("iab_attach_ttclid_block_cid_list", String[].class, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr != null && (listAsList = Arrays.asList(objArr)) != null) {
            return listAsList;
        }
        return C13BV.INSTANCE;
    }

    public static final Object invoke$226(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ogc_article_sticker_entrance_ab", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$227(AnonymousClass0206 anonymousClass0206) {
        return new LinkedHashMap();
    }

    public static final Object invoke$228(AnonymousClass0206 anonymousClass0206) {
        return Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
    }

    public static final Object invoke$229(AnonymousClass0206 anonymousClass0206) {
        return Float.valueOf(C418440Gaw.LIZIZ(106));
    }

    public static final Object invoke$23(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_head_insert_top_padding_fix", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$230(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ad_hybrid_container_instance_null_re_create_exp", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$231(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "multi_live_push_label_setting", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$232(AnonymousClass0206 anonymousClass0206) {
        C00I1.LIZ.getClass();
        return C00I1.LIZIZ;
    }

    public static final Object invoke$233(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_single_request_optimization", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$234(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "smart_search_entity_word_async_parse", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$235(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "smart_search_entity_word_enable", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$236(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SmartSearchResponseCacheConfig smartSearchResponseCacheConfig = C00J5.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(SmartSearchResponseCacheConfig.class, smartSearchResponseCacheConfig, "smart_search_response_cache_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return smartSearchResponseCacheConfig;
    }

    public static final Object invoke$237(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(Intrinsics.LJFF(((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LJIIJ(), Boolean.TRUE));
    }

    public static final Object invoke$238(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("use_app_task_to_initialize_compliance_business_main", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.TRUE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$239(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "privacy_update_right_label_logic_in_setting_page", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$24(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_sticky_inset_throttle_fix", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$240(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.0f))));
    }

    public static final Object invoke$241(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.0f))));
    }

    public static final Object invoke$242(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "visual_search_support_continously_scan", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$243(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "visual_search_qrcode_compliance_block_text_fallback", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$244(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "visual_search_add_qrcode_entrance", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$245(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_publish_response_experiment", true, false));
    }

    public static final Object invoke$246(AnonymousClass0206 anonymousClass0206) {
        return Long.valueOf(C0C64.LJIILLIIL().LJIJJLI(31744, -1L, "creative_tools_album_down_sample_loading_delay", true));
    }

    public static final Object invoke$247(AnonymousClass0206 anonymousClass0206) {
        Set<Map.Entry> setEntrySet = ((Map) C00RV.LIZJ.getValue()).entrySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return C13LP.LJLLLL(new C512401z8(19), arrayList);
    }

    public static final Object invoke$248(AnonymousClass0206 anonymousClass0206) {
        C1EO8[] c1eo8ArrValues = C1EO8.values();
        int iLIZIZ = C2097908Jt.LIZIZ(c1eo8ArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C1EO8 c1eo8 : c1eo8ArrValues) {
            Pair pair = new Pair(c1eo8.getValue(), Integer.valueOf(c1eo8.getIndex()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final Object invoke$249(AnonymousClass0206 anonymousClass0206) {
        C1EO8[] c1eo8ArrValues = C1EO8.values();
        int iLIZIZ = C2097908Jt.LIZIZ(c1eo8ArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C1EO8 c1eo8 : c1eo8ArrValues) {
            linkedHashMap.put(Integer.valueOf(c1eo8.getIndex()), c1eo8);
        }
        return linkedHashMap;
    }

    public static final Object invoke$25(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "visual_search_ai_card_ani_opt", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$250(AnonymousClass0206 anonymousClass0206) {
        C1EO8[] c1eo8ArrValues = C1EO8.values();
        int iLIZIZ = C2097908Jt.LIZIZ(c1eo8ArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C1EO8 c1eo8 : c1eo8ArrValues) {
            linkedHashMap.put(c1eo8.getValue(), c1eo8);
        }
        return linkedHashMap;
    }

    public static final Object invoke$251(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)));
    }

    public static final Object invoke$252(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96)));
    }

    public static final Object invoke$253(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)));
    }

    public static final Object invoke$254(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130)));
    }

    public static final Object invoke$255(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)));
    }

    public static final Object invoke$256(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
    }

    public static final Object invoke$257(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
    }

    public static final Object invoke$258(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)));
    }

    public static final Object invoke$259(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
    }

    public static final Object invoke$26(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "visual_search_stream_card_disable_copy", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return Boolean.valueOf(true ^ ((Boolean) c098200Yq).booleanValue());
    }

    public static final Object invoke$260(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
    }

    public static final Object invoke$261(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$262(AnonymousClass0206 anonymousClass0206) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doExecuteFcpPolicy #2 tread: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$263(AnonymousClass0206 anonymousClass0206) {
        DataChannelGlobal.LLILZ.FQ2(MultiGuestLiveShowPanelEvent.class, new C306601Gu("liveshow_banner"));
        return Unit.LIZ;
    }

    public static final Object invoke$264(AnonymousClass0206 anonymousClass0206) {
        Map map;
        String string;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Map<String, Object> map2 = C00RU.LIZ;
        Map<String, Object> map3 = (Map) c0c64LJIILLIIL.LJJII(Map.class, map2, "ec_img_url_query_config", true);
        if (map3 != null) {
            map2 = map3;
        }
        if (!map2.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : map2.keySet()) {
                Object obj2 = map2.get(obj);
                if ((obj2 instanceof Map) && (map = (Map) obj2) != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Double) {
                            string = String.valueOf((int) ((Number) value).doubleValue());
                        } else {
                            string = value.toString();
                        }
                        linkedHashMap2.put(key, string);
                    }
                    linkedHashMap.put(obj, linkedHashMap2);
                }
            }
            return C2097608Jq.LJIIZILJ(linkedHashMap);
        }
        return C2097608Jq.LJ();
    }

    public static final Object invoke$265(AnonymousClass0206 anonymousClass0206) {
        String strLJIJI = C497740JfY.LJIJI(2131844588);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$266(AnonymousClass0206 anonymousClass0206) {
        String strLJIJI = C497740JfY.LJIJI(2131852721);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$267(AnonymousClass0206 anonymousClass0206) {
        String strLJIJI = C497740JfY.LJIJI(2131843820);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$268(AnonymousClass0206 anonymousClass0206) {
        String strLJIJI = C497740JfY.LJIJI(2131844589);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$269(AnonymousClass0206 anonymousClass0206) {
        String strLJIJI = C497740JfY.LJIJI(2131841897);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$27(AnonymousClass0206 anonymousClass0206) {
        return new C404401hi();
    }

    public static final Object invoke$270(AnonymousClass0206 anonymousClass0206) {
        return Long.valueOf(View.generateViewId());
    }

    public static final Object invoke$271(AnonymousClass0206 anonymousClass0206) {
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LINK_MESSAGE_CENTER");
        if (!(objLJIIIZ instanceof LinkMessageCenter)) {
            return null;
        }
        return objLJIIIZ;
    }

    public static final Object invoke$272(AnonymousClass0206 anonymousClass0206) {
        return AnonymousClass0207.get$arr$(63);
    }

    public static final Object invoke$273(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
    }

    public static final Object invoke$274(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    public static final Object invoke$275(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = a0.LJJLIIIJILLIZJL((String) C098300Yr.LIZ.getValue(), new String[]{","}, 0, 6);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Iterable iterable = (Iterable) c098200Yq;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LLIIJI(iterable);
    }

    public static final Object invoke$276(AnonymousClass0206 anonymousClass0206) {
        return C0C64.LJIILLIIL().LJIL(31744, 2, "feed_interact_component_default_downgrade_exp", "", true);
    }

    public static final Object invoke$277(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = a0.LJJLIIIJILLIZJL((String) C097800Ym.LIZ.getValue(), new String[]{","}, 0, 6);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Iterable iterable = (Iterable) c098200Yq;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LLIIJI(iterable);
    }

    public static final Object invoke$278(AnonymousClass0206 anonymousClass0206) {
        return C0C64.LJIILLIIL().LJIL(31744, 2, "feed_downgrade_component_split_to_msg_fyp_exp", "", true);
    }

    public static final Object invoke$279(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = a0.LJJLIIIJILLIZJL((String) C097900Yn.LIZ.getValue(), new String[]{","}, 0, 6);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Iterable iterable = (Iterable) c098200Yq;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LLIIJI(iterable);
    }

    public static final Object invoke$28(AnonymousClass0206 anonymousClass0206) {
        return new C405801hw();
    }

    public static final Object invoke$280(AnonymousClass0206 anonymousClass0206) {
        return C0C64.LJIILLIIL().LJIL(31744, 2, "feed_downgrade_component_split_to_msg_other_exp", "", true);
    }

    public static final Object invoke$281(AnonymousClass0206 anonymousClass0206) {
        return new ArrayList();
    }

    public static final Object invoke$282(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = (FrequencyControlSyncSettingsData) SettingsManager.LIZLLL().LJIIIIZZ("frequency_control_sync_settings", FrequencyControlSyncSettingsData.class, C143500gj.LIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
            return C143500gj.LIZ;
        }
        return c098200Yq;
    }

    public static final Object invoke$283(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public static final Object invoke$284(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
    }

    public static final Object invoke$285(AnonymousClass0206 anonymousClass0206) {
        return C497740JfY.LJIJI(2131852098);
    }

    public static final Object invoke$286(AnonymousClass0206 anonymousClass0206) {
        return C497740JfY.LJIJI(2131852098);
    }

    public static final Object invoke$287(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "feed_skylight_not_request_in_bg", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$288(AnonymousClass0206 anonymousClass0206) {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static final Object invoke$289(AnonymousClass0206 anonymousClass0206) {
        List listLJJLIIIJ = a0.LJJLIIIJ((String) C196900pL.LIZ.getValue(), new char[]{','}, false, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJ.iterator();
        while (it2.hasNext()) {
            String string = a0.LJLIIIL((String) it2.next()).toString();
            if (string.length() > 0) {
                arrayList.add(string);
            }
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final Object invoke$29(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1138320fjC("TakoABPreloadHelper")));
    }

    public static final Object invoke$290(AnonymousClass0206 anonymousClass0206) {
        String strLJJ;
        try {
            strLJJ = C0C64.LJIILLIIL().LJJ(31744, "search_csi_banner_enforce_empty_uri_check_v3_scenes", "", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (strLJJ == null) {
            return "";
        }
        return strLJJ;
    }

    public static final Object invoke$291(AnonymousClass0206 anonymousClass0206) {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            List<Integer> list = C00JA.LIZ;
            List list2 = (List) c0c64LJIILLIIL.LJJII(List.class, list, "profile_search_creators_banner_show_timeout", true);
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((Number) it2.next()).intValue()));
                }
                return arrayList;
            }
            return list;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C00JA.LIZ;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$292(AnonymousClass0206 anonymousClass0206) {
        String strLJJLIIIJ;
        C1205170hT1.LIZ.getClass();
        if (!C1205170hT1.LIZIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            NearbyTabReasonConfig.NearbyTabReasonModel nearbyTabReasonModel = NearbyTabReasonConfig.LIZ;
            NearbyTabReasonConfig.NearbyTabReasonModel nearbyTabReasonModel2 = (NearbyTabReasonConfig.NearbyTabReasonModel) settingsManagerLIZLLL.LJIIIIZZ("nearby_tab_track_config", NearbyTabReasonConfig.NearbyTabReasonModel.class, nearbyTabReasonModel);
            if (nearbyTabReasonModel2 != null) {
                nearbyTabReasonModel = nearbyTabReasonModel2;
            }
            if (nearbyTabReasonModel.LIZ) {
                strLJJLIIIJ = "no_settings";
            } else {
                List<String> list = nearbyTabReasonModel.reason;
                if (list != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
            }
            linkedHashMap.put("reason", strLJJLIIIJ);
            C20684815ws.LJIILLIIL("ttls_nearby_no_tab_reason", linkedHashMap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$293(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "search_feedback_ad_report", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$294(AnonymousClass0206 anonymousClass0206) {
        return new LinkedHashMap();
    }

    public static final Object invoke$295(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "search_tab_tako_text", true));
    }

    public static final Object invoke$296(AnonymousClass0206 anonymousClass0206) {
        return Keva.getRepo("AutoCutResourceCache");
    }

    public static final Object invoke$297(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) * 5);
    }

    public static final Object invoke$298(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)));
    }

    public static final Object invoke$299(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_register_preload_optimize", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$3(AnonymousClass0206 anonymousClass0206) {
        return Keva.getRepo("session_manager");
    }

    public static final Object invoke$30(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("im_zti_enabled", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$300(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "poi_gallery_preload_image_opt", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$301(X.AnonymousClass0206 r3) {
        /*
            r3 = 0
            X.0C64 r2 = X.C0C64.LJIILLIIL()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "poi_review_btn_touch_preload_enter_methods"
            java.lang.String[] r0 = X.C125300dn.LIZ     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r2.LJJIII(r1, r3, r0)     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.Throwable -> L13
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L13
            goto L1f
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L1f:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            r1 = 0
            if (r0 == 0) goto L27
            r2 = r1
        L27:
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 == 0) goto L36
            int r0 = r2.length
            if (r0 != 0) goto L2f
            r3 = 1
        L2f:
            r0 = r3 ^ 1
            if (r0 == 0) goto L34
            r1 = r2
        L34:
            if (r1 != 0) goto L38
        L36:
            java.lang.String[] r1 = X.C125300dn.LIZ
        L38:
            java.util.Set r0 = X.C13LQ.LJLIIL(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0206.invoke$301(X.0206):java.lang.Object");
    }

    public static final Object invoke$302(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_review_empty_shell_retry", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$303(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_review_load_more_loading_footer", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$304(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_lynx_handle_in_advance", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$305(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_review_load_more_preload_count", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$306(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_lynx_template_do_preload_in_single_thread", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$307(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_detail_ux_optimize_non_regional_reopen", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$308(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_inner_video_not_exit_by_gesture", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$309(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_share_enhance_V2_screenshot", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$31(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "commerce_omsdk_support_carousel", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$310(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_share_enhance_V2_im", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$311(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_detail_stay_time_refactor", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$312(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_comment_review_load_more_preload_count", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$313(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_display_crop_image_opt", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$314(AnonymousClass0206 anonymousClass0206) {
        return C1161920gLG.LIZJ(IHostAppContext.class);
    }

    public static final Object invoke$315(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("story_viewer_list_popup_show_in_country", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return Boolean.FALSE;
        }
        return c098200Yq;
    }

    public static final Object invoke$316(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        C01SZ c01sz = C01SZ.LIZ;
        try {
            boolean z = false;
            if (AbstractC19994813Le.Default.nextInt(100000) < C13LZ.LJ(((Number) C217000sa.LIZ.getValue()).intValue(), 0, 100000)) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$317(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 100000, "studio_aigc_nodes_unavailable_et_sample_rate", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 100000;
        }
        return c098200Yq;
    }

    public static final Object invoke$318(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        C335901Sb c335901Sb = C335901Sb.LIZ;
        try {
            boolean z = false;
            if (AbstractC19994813Le.Default.nextInt(100000) < C13LZ.LJ(((Number) C217100sb.LIZ.getValue()).intValue(), 0, 100000)) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$319(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_aigc_persistence_et_sample_rate", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$32(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("im_disable_public_group_preshown_sticker", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$320(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_search_top1_ls_qa_card_scene", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$321(AnonymousClass0206 anonymousClass0206) {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("google_track_enable", true));
    }

    public static final Object invoke$322(AnonymousClass0206 anonymousClass0206) {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("xiaomi_mini_card_track_enable", true));
    }

    public static final Object invoke$323(AnonymousClass0206 anonymousClass0206) {
        return Float.valueOf(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
    }

    public static final Object invoke$324(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "iab_ssl_error_optimization_experiment", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$325(AnonymousClass0206 anonymousClass0206) {
        return new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 9);
    }

    public static final Object invoke$326(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
    }

    public static final Object invoke$327(AnonymousClass0206 anonymousClass0206) {
        return C2097908Jt.LIZJ(new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)))));
    }

    public static final Object invoke$328(AnonymousClass0206 anonymousClass0206) {
        return C2097908Jt.LIZJ(new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), Integer.valueOf(R.dimen.ag0)));
    }

    public static final Object invoke$329(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJ();
    }

    public static final Object invoke$33(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 30;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 30, "ug_ai_cache_log_delay_time", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$330(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJ();
    }

    public static final Object invoke$331(AnonymousClass0206 anonymousClass0206) {
        return C927810aFf.LIZ();
    }

    public static final Object invoke$332(AnonymousClass0206 anonymousClass0206) {
        return DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
    }

    public static final Object invoke$333(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "visual_search_detail_autoplay_provider_leak_fix", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$334(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 150, "search_aweme_pool_size", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 150;
        }
        return c098200Yq;
    }

    public static final Object invoke$335(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)));
    }

    public static final Object invoke$336(AnonymousClass0206 anonymousClass0206) {
        return C19748512Ol.LIZIZ;
    }

    public static final Object invoke$337(AnonymousClass0206 anonymousClass0206) {
        List list = (List) C2273281DyQ.LIZIZ.getValue();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((String) it2.next()).toLowerCase(Locale.ROOT));
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final Object invoke$338(AnonymousClass0206 anonymousClass0206) {
        BadgeStruct badgeStruct = C00J2.LIZ;
        BadgeStruct badgeStruct2 = new BadgeStruct();
        badgeStruct2.badgeDisplayType = 4;
        badgeStruct2.badgePriorityType = 0;
        badgeStruct2.badgeScene = 12;
        badgeStruct2.position = 2;
        badgeStruct2.display = true;
        CombineBadgeStruct combineBadgeStruct = new CombineBadgeStruct();
        CombineBadgeBackground combineBadgeBackground = new CombineBadgeBackground();
        combineBadgeBackground.backgroundColorCode = "#99252525";
        combineBadgeStruct.backgroundDarkMode = combineBadgeBackground;
        Boolean bool = Boolean.TRUE;
        combineBadgeStruct.bgAutoMirrored = bool;
        combineBadgeStruct.publicScreenShowStyle = 6;
        combineBadgeStruct.personalCardShowStyle = 14;
        BadgeText badgeText = new BadgeText();
        badgeText.key = "pm_mt_hostlabel";
        badgeText.defaultPattern = "Host";
        combineBadgeStruct.text = badgeText;
        CombineBadgeBackground combineBadgeBackground2 = new CombineBadgeBackground();
        combineBadgeBackground2.backgroundColorCode = "#99252525";
        combineBadgeStruct.background = combineBadgeBackground2;
        combineBadgeStruct.iconAutoMirrored = bool;
        FontStyle fontStyle = new FontStyle();
        fontStyle.fontSize = 10;
        fontStyle.fontColor = "#ffffffff";
        combineBadgeStruct.fontStyle = fontStyle;
        PaddingInfo paddingInfo = new PaddingInfo();
        paddingInfo.leftPadding = 6;
        paddingInfo.rightPadding = 6;
        paddingInfo.useSpecific = true;
        paddingInfo.horizontalPaddingRule = 1;
        combineBadgeStruct.paddingNewFont = paddingInfo;
        badgeStruct2.combineBadgeStruct = combineBadgeStruct;
        return badgeStruct2;
    }

    public static final Object invoke$339(AnonymousClass0206 anonymousClass0206) {
        return new C0O84();
    }

    public static final Object invoke$34(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_skylight_out_of_bound_fix", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$340(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_srp_preload_without_prepare", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.TRUE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$341(AnonymousClass0206 anonymousClass0206) {
        return LivePerfLoadConfigs.INSTANCE.getAllConfigs();
    }

    public static final Object invoke$342(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(28.0d))));
    }

    public static final Object invoke$343(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.0d))));
    }

    public static final Object invoke$344(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "move_manage_posts_out_from_ac", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$345(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        List listAsList;
        Object obj = null;
        try {
            c098200Yq = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("iab_slide_1px_block_list", String[].class, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr != null && (listAsList = Arrays.asList(objArr)) != null) {
            return listAsList;
        }
        return C13BV.INSTANCE;
    }

    public static final Object invoke$346(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        C470501sN c470501sN = C470501sN.LIZ;
        try {
            boolean z = false;
            if (AbstractC19994813Le.Default.nextInt(100000) < C13LZ.LJ(((Number) C217200sc.LIZ.getValue()).intValue(), 0, 100000)) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$347(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_aigc_run_catch_et_sample_rate", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$348(AnonymousClass0206 anonymousClass0206) {
        return C2097908Jt.LIZJ(new Pair("page_name", "video"));
    }

    public static final Object invoke$349(AnonymousClass0206 anonymousClass0206) {
        return C2097908Jt.LIZJ(new Pair("page_name", "video"));
    }

    public static final Object invoke$35(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "inbox_skylight_not_request_in_bg", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$350(AnonymousClass0206 anonymousClass0206) {
        return KevaImpl.getRepo("unified_auth_dynamic_text", 1);
    }

    public static final Object invoke$351(AnonymousClass0206 anonymousClass0206) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C358401aI.LIZIZ).build().retrofit.LIZ(NimbleApi.class);
    }

    public static final Object invoke$352(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
    }

    public static final Object invoke$353(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
    }

    public static final Object invoke$354(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
    }

    public static final Object invoke$355(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
    }

    public static final Object invoke$356(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("tt_story_out_push_cold_start_land_inbox", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return Boolean.FALSE;
        }
        return c098200Yq;
    }

    public static final Object invoke$357(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("skylight_user_scroll_negative_feedback_track", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.TRUE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$358(AnonymousClass0206 anonymousClass0206) {
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story_preload_v2_archive_video", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$359(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "story_fix_private_like_tooltip_dark_bg", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$36(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "im_sticker_size_opt", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$360(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("tt_story_highlight_edit_cover_allow_null_src_bitmap", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$361(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$362(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_aep_keep_default_address_ignore_region_cond", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$363(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "shipping_module_route_enable", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$364(AnonymousClass0206 anonymousClass0206) {
        return C0T1N.LIZ();
    }

    public static final Object invoke$365(AnonymousClass0206 anonymousClass0206) {
        return Keva.getRepo("tako_agent_keva_repo");
    }

    public static final Object invoke$366(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJIIIIZZ(new Pair("Icon_Tab_Discover_Hash", Integer.valueOf(R.raw.icon_tab_discover_hash)), new Pair("Icon_Playlist_Fill", Integer.valueOf(R.raw.icon_playlist_fill)), new Pair("Icon_Color_Default_Avatar", Integer.valueOf(R.raw.icon_color_default_avatar)));
    }

    public static final Object invoke$367(AnonymousClass0206 anonymousClass0206) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        C005O c005o = C005P.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("drama_innerfeed_lynxcard_delete_card_on_error_config", C005O.class, c005o);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return c005o;
    }

    public static final Object invoke$368(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_search_brand_zone_lynx_opt", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$369(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJIIIIZZ(new Pair(2131826047, "aicast_create_entry_cast"), new Pair(2131826048, "aicast_create_entry_cast2"), new Pair(2131826046, "aicast_create_entry_aiCast"), new Pair(2131826041, "aicast_chatWindow_pill_aiCast"), new Pair(2131826236, "aicast_stage_topNav_title"), new Pair(2131826187, "aicast_stage_cta_action"), new Pair(2131826083, "aicast_post_privacySettings_whocanview"), new Pair(2131826016, "aicast_castVideosNotPosted_title"), new Pair(2131825994, "aicast_aiselfSettings_appearCast_title"), new Pair(2131825991, "aicast_aiselfSettings_appearCast_ctaCast"), new Pair(2131826060, "aicast_fyp_cast_people"), new Pair(2131826059, "aicast_fyp_castPanel_ctaJoinCast"), new Pair(2131826080, "aicast_post_deletePopup_title"), new Pair(2131826062, "aicast_model_label"), new Pair(2131826063, "aicast_model_label2"), new Pair(2131826071, "aicast_otherprofileCast_title"), new Pair(2131826058, "aicast_fyp_castPanel_ctaCast"));
    }

    public static final Object invoke$37(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "fix_play_time_lost", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return Boolean.FALSE;
        }
        return c098200Yq;
    }

    public static final Object invoke$370(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue;
        boolean z = false;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "fix_ogc_news_anchor_iab_leak", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$371(AnonymousClass0206 anonymousClass0206) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set next time: ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$372(AnonymousClass0206 anonymousClass0206) {
        C972080bP4.LIZLLL("fetchRecordList failed", "TextHeaderListFragment", 2);
        return Unit.LIZ;
    }

    public static final Object invoke$373(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
    }

    public static final Object invoke$374(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
    }

    public static final Object invoke$375(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
    }

    public static final Object invoke$376(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
    }

    public static final Object invoke$377(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    }

    public static final Object invoke$378(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public static final Object invoke$379(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
    }

    public static final Object invoke$38(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("im_ai_bot_info_stale_update_guard_setting", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$380(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
    }

    public static final Object invoke$381(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_common_gecko_preload_check_update", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$382(AnonymousClass0206 anonymousClass0206) {
        return String.valueOf(Math.abs(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId().hashCode()));
    }

    public static final Object invoke$383(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "search_ad_show_create_time_enabled", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$384(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "search_anole_scene_injection_enabled", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$385(AnonymousClass0206 anonymousClass0206) {
        Set<Map.Entry<String, Integer>> setEntrySet = C815350Vyf.LIZJ.entrySet();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(setEntrySet, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Pair pair = new Pair(((String) entry.getKey()).toLowerCase(Locale.ROOT), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final Object invoke$386(AnonymousClass0206 anonymousClass0206) {
        return C927810aFf.LIZ();
    }

    public static final Object invoke$387(AnonymousClass0206 anonymousClass0206) {
        return new C01I8();
    }

    public static final Object invoke$388(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "avoid_redundant_update_by_image_key", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$389(AnonymousClass0206 anonymousClass0206) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843764));
        return Unit.LIZ;
    }

    public static final Object invoke$39(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "smart_reply_fully_managed_mode", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$390(AnonymousClass0206 anonymousClass0206) {
        C01CC.LJ("gift_panel_animation");
        return Unit.LIZ;
    }

    public static final Object invoke$391(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(433)));
    }

    public static final Object invoke$392(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    public static final Object invoke$393(AnonymousClass0206 anonymousClass0206) {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            FeedResponseFilterRoutingConfig feedResponseFilterRoutingConfig = C162700jp.LIZ;
            FeedResponseFilterRoutingConfig feedResponseFilterRoutingConfig2 = (FeedResponseFilterRoutingConfig) c0c64LJIILLIIL.LJJII(FeedResponseFilterRoutingConfig.class, feedResponseFilterRoutingConfig, "feed_response_filter_routing", true);
            if (feedResponseFilterRoutingConfig2 != null) {
                return feedResponseFilterRoutingConfig2;
            }
            return feedResponseFilterRoutingConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C162700jp.LIZ;
        }
    }

    public static final Object invoke$394(AnonymousClass0206 anonymousClass0206) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FeedResponseFilterRouteGroup feedResponseFilterRouteGroup : ((FeedResponseFilterRoutingConfig) C162700jp.LIZIZ.getValue()).groups) {
            int i = 1;
            if (feedResponseFilterRouteGroup.route != 1) {
                i = 0;
            }
            Iterator<String> it2 = feedResponseFilterRouteGroup.diffTypes.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(a0.LJLIIIL(it2.next()).toString().toLowerCase(Locale.ROOT), Integer.valueOf(i));
            }
        }
        return linkedHashMap;
    }

    public static final Object invoke$395(AnonymousClass0206 anonymousClass0206) {
        List list = (List) C123300dT.LIZIZ.getValue();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
        }
        return arrayList;
    }

    public static final Object invoke$396(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        List<String> list = C123300dT.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(List.class, list, "feed_music_title_label_blocklist", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return list;
    }

    public static final Object invoke$397(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AvatarFetchStoryLoadingConfigData avatarFetchStoryLoadingConfigData = C420101kF.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(AvatarFetchStoryLoadingConfigData.class, avatarFetchStoryLoadingConfigData, "tt_avatar_fetch_story_loading_config_v2", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return avatarFetchStoryLoadingConfigData;
    }

    public static final Object invoke$398(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story_avatar_ring_fetch_user_related_info", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$399(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story_fix_duplicate_finish_v2", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$4(AnonymousClass0206 anonymousClass0206) {
        return KevaImpl.getRepo("repo_tt_unified_auth", 1);
    }

    public static final Object invoke$40(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("smart_reply_debug_enable_setting", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$400(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story_inbox_drag_dismiss_morph", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$401(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story_optimize_detail_saf_recycle", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$402(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("story_relocation_to_first_unread_index", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$403(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story_remove_useless_preload", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$404(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story_saf_transition_v2", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$405(AnonymousClass0206 anonymousClass0206) {
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(SettingsManager.LIZ("commerce_profile_page_enable", true));
    }

    public static final Object invoke$406(AnonymousClass0206 anonymousClass0206) {
        return ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever();
    }

    public static final Object invoke$407(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 10)));
    }

    public static final Object invoke$408(AnonymousClass0206 anonymousClass0206) {
        return C1697810uHb.LJIILJJIL("tiktok_live_revenue_normal_1:gbl_treasure_box_dear_push_in_image.png", "tiktok_live_lottie_resource:ttlive_gift_group_combo_button_lottie.zip", "tiktok_live_interaction_demand_1:ttlive_pic_multi_co_host_guide.png", "tiktok_live_interaction_demand_1:ttlive_match_multi_be_invited_group_red_bg.png", "tiktok_live_interaction_demand_1:ttlive_flow_card_low.png", "tiktok_live_interaction_demand_1:ttlive_match_multi_be_invited_group_blue_bg.png", "tiktok_live_interaction_demand_1:ttlive_flow_card_heigh.png", "tiktok_live_interaction_demand_1:ttlive_ic_best_teammate_question.png", "tiktok_live_interaction_demand_1:ttlive_best_teammate_invite_background.png", "tiktok_live_interaction_demand_1:ttlive_flow_card_medium.png", "tiktok_live_interaction_demand_1:ttlive_truth_or_dare/ttlive_truth_or_dare_text_my.png", "tiktok_live_interaction_demand_1:ttlive_truth_or_dare/ttlive_truth_or_dare_icon_my.png", "tiktok_live_interaction_demand_1:ttlive_truth_or_dare/ttlive_truth_or_dare_suggest.png", "tiktok_live_interaction_demand_1:ttlive_truth_or_dare/ttlive_truth_or_dare_pop.png", "tiktok_live_watch_resource_normal_1:live_skylight_icon_anim.webp", "tiktok_live_watch_resource_normal_1:like_after_full_progress_bubbles_lottie.webp", "tiktok_live_game_demand_1:ttlive_game_cast_wired_done_ic.png", "tiktok_live_game_demand_1:ttlive_broadcast_live_studio_preview_page_detail.png", "tiktok_live_game_demand_1:ttlive_widget_preview_cast_done.png", "tiktok_live_game_demand_1:ttlive_ic_game_setting_activities_new.png", "tiktok_live_game_demand_1:ttlive_broadcast_live_studio_preview_page_detail_v2.png", "tiktok_live_revenue_demand_4:ttlive_gift_user_level_unlock_light_group2.webp", "tiktok_live_revenue_demand_4:ttlive_gift_user_level_unlock_group2.webp", "tiktok_live_broadcast_demand_1:ttlive_bg_preview_setting_update.png", "tiktok_live_broadcast_demand_1:subscription_migrate_animation.webp", "tiktok_live_watch_resource_demand_1:ttlive_toolbar_interaction_with_bg.webp", "tiktok_live_watch_resource_demand_1:ttlive_ic_loading_point.webp", "tiktok_live_watch_resource_demand_1:ttlive_subcribe_emote_hi.png", "tiktok_live_watch_resource_demand_1:ttlive_subcribe_emote_laugh.png", "tiktok_live_watch_resource_demand_1:ttlive_toolbar_custom_poll_with_bg.webp", "tiktok_live_watch_resource_demand_1:ttlive_ic_loading_center.webp", "tiktok_live_basic_resource:gbl_treasure_box_dear_push_in_image.png", "tiktok_live_basic_resource:ttlive_subcribe_emote_shoot.png", "tiktok_live_basic_resource:ttlive_flow_card_low.png", "tiktok_live_basic_resource:ttlive_ic_loading_point.webp", "tiktok_live_basic_resource:ttlive_subcribe_emote_hi.png", "tiktok_live_basic_resource:ttlive_flow_card_heigh.png", "tiktok_live_basic_resource:ttlive_subcribe_emote_laugh.png", "tiktok_live_basic_resource:ttlive_flow_card_medium.png", "tiktok_live_basic_resource:ttlive_ic_loading_center.webp", "tiktok_live_basic_resource:ttlive_gift_group_combo_wave.webp", "tiktok_live_basic_resource:ttlive_icon_first_recharge_pack.png", "tiktok_live_interaction_resource:ttlive_pic_multi_co_host_guide.png", "tiktok_live_interaction_resource:ttlive_broadcast_live_studio_preview_page_detail.png", "tiktok_live_interaction_resource:ttlive_ic_best_teammate_question.png", "tiktok_live_interaction_resource:ttlive_broadcast_live_studio_preview_page_detail_v2.png", "tiktok_live_interaction_resource:ttlive_best_teammate_invite_background.png", "tiktok_live_revenue_demand_1:ttlive_gift_group_combo_button_lottie.zip", "tiktok_live_revenue_demand_1:ttlive_gift_group_combo_wave.webp", "tiktok_live_revenue_demand_1:ttlive_icon_first_recharge_pack.png", "tiktok_live_interaction_normal_1:ttlive_bg_v3_random_linkmic_entrance_background.png", "tiktok_live_interaction_normal_1:ttlive_bg_v3_random_linkmic_entrance.png", "tiktok_live_outside_demand_1:ttlive_subcribe_emote_shoot.png", "tiktok_live_outside_demand_1:live_preview_guide_weak_style_bg.png", "tiktok_live_broadcast_resource:ttlive_bg_preview_setting_update.png", "tiktok_live_broadcast_resource:subscription_migrate_animation.webp", "tiktok_live_game_demand_2:ttlive_dual_device_icon_connected.png", "tiktok_live_watch_resource:ttlive_match_multi_be_invited_group_red_bg.png", "tiktok_live_watch_resource:ttlive_bg_v3_random_linkmic_entrance_background.png", "tiktok_live_watch_resource:ttlive_bg_v3_random_linkmic_entrance.png", "tiktok_live_watch_resource:ttlive_toolbar_interaction_with_bg.webp", "tiktok_live_watch_resource:ttlive_match_multi_be_invited_group_blue_bg.png", "tiktok_live_watch_resource:live_preview_guide_weak_style_bg.png", "tiktok_live_watch_resource:ttlive_toolbar_custom_poll_with_bg.webp", "tiktok_live_watch_resource:ttlive_gift_user_level_unlock_light_group2.webp", "tiktok_live_watch_resource:ttlive_gift_user_level_unlock_group2.webp", "tiktok_live_watch_resource:ttlive_truth_or_dare/ttlive_truth_or_dare_text_my.png", "tiktok_live_watch_resource:ttlive_truth_or_dare/ttlive_truth_or_dare_icon_my.png", "tiktok_live_watch_resource:ttlive_truth_or_dare/ttlive_truth_or_dare_suggest.png", "tiktok_live_watch_resource:ttlive_truth_or_dare/ttlive_truth_or_dare_pop.png");
    }

    public static final Object invoke$409(AnonymousClass0206 anonymousClass0206) {
        return Keva.getRepo("creation_event_monitor_repo");
    }

    public static final Object invoke$41(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "smart_reply_share_setting", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$410(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue;
        boolean z = false;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "music_ogc_lynx_initial_data_enable", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$411(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public static final Object invoke$412(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public static final Object invoke$413(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
    }

    public static final Object invoke$414(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
    }

    public static final Object invoke$415(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public static final Object invoke$416(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
    }

    public static final Object invoke$417(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)));
    }

    public static final Object invoke$418(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21)));
    }

    public static final Object invoke$419(AnonymousClass0206 anonymousClass0206) {
        InterfaceC1106030et7.R8.LIZJ("");
        return Unit.LIZ;
    }

    public static final Object invoke$42(AnonymousClass0206 anonymousClass0206) {
        Map mapLIZJ;
        List<InterfaceC2787016b> listJQ0 = ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).jQ0();
        if (listJQ0 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (InterfaceC2787016b interfaceC2787016b : listJQ0) {
                String strLIZIZ = interfaceC2787016b.LIZIZ();
                String featureName = interfaceC2787016b.getFeatureName();
                if (strLIZIZ.length() > 0 && featureName.length() > 0 && interfaceC2787016b.isEnable()) {
                    Map map = (Map) linkedHashMap.get(strLIZIZ);
                    if (map == null || (mapLIZJ = C2097608Jq.LJIILIIL(map, new Pair(featureName, interfaceC2787016b))) == null) {
                        mapLIZJ = C2097908Jt.LIZJ(new Pair(featureName, interfaceC2787016b));
                    }
                    linkedHashMap.put(strLIZIZ, mapLIZJ);
                }
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    public static final Object invoke$420(AnonymousClass0206 anonymousClass0206) {
        return Float.valueOf(C418440Gaw.LIZIZ(200));
    }

    public static final Object invoke$421(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_search_interest_fyp_batch_count_interest", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$422(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_search_interest_fyp_batch_count", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$423(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "im_voice_audit_loading", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$424(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "im_voice_streaming_playback_enable", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$425(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "tt_im_typing_reco_dynamic_delay_enable", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$426(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 60500, "im_album_video_duration_limit", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 60500;
        }
        return c098200Yq;
    }

    public static final Object invoke$427(AnonymousClass0206 anonymousClass0206) {
        try {
            return (StayTimeConfig) C0C64.LJIILLIIL().LJJII(StayTimeConfig.class, C00RW.LIZ, "fcp_stay_time_config", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C00RW.LIZ;
        }
    }

    public static final Object invoke$428(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$429(AnonymousClass0206 anonymousClass0206) {
        return C0T1N.LIZ();
    }

    public static final Object invoke$43(AnonymousClass0206 anonymousClass0206) {
        return ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostClientAiService();
    }

    public static final Object invoke$430(AnonymousClass0206 anonymousClass0206) {
        return C0T1N.LIZ();
    }

    public static final Object invoke$431(AnonymousClass0206 anonymousClass0206) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleBodyResponseUpdate: visibilityObserver registered ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$432(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$433(AnonymousClass0206 anonymousClass0206) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    public static final Object invoke$434(AnonymousClass0206 anonymousClass0206) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    public static final Object invoke$435(AnonymousClass0206 anonymousClass0206) {
        return InterfaceC1094160eZy.k1;
    }

    public static final Object invoke$436(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        C1028330crn.LIZ.getClass();
        String str = "";
        String string = C1028330crn.LIZIZ().getString("ad_land_survey_show_time_map", "");
        if (string != null) {
            str = string;
        }
        if (a0.LJJJIL(str)) {
            return new LinkedHashMap();
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new TypeToken<Map<String, ? extends Long>>() { // from class: X.00WB
            }.getType();
            c1227904rF.getClass();
            c098200Yq = (Map) C1227904rF.LIZJ(str, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Map mapLJ = (Map) c098200Yq;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return new LinkedHashMap(mapLJ);
    }

    public static final Object invoke$437(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        C1028330crn.LIZ.getClass();
        String str = "";
        String string = C1028330crn.LIZIZ().getString("ad_land_survey_submitted_set", "");
        if (string != null) {
            str = string;
        }
        if (a0.LJJJIL(str)) {
            return new LinkedHashSet();
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new TypeToken<Set<? extends String>>() { // from class: X.01VK
            }.getType();
            c1227904rF.getClass();
            c098200Yq = (Set) C1227904rF.LIZJ(str, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Iterable iterable = (Set) c098200Yq;
        if (iterable == null) {
            iterable = C08CX.INSTANCE;
        }
        return C13LP.LLIIIZ(iterable);
    }

    public static final Object invoke$438(AnonymousClass0206 anonymousClass0206) {
        return Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
    }

    public static final Object invoke$439(AnonymousClass0206 anonymousClass0206) {
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(new JSONObject()), "inc_client_touch_point_received"));
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$44(AnonymousClass0206 anonymousClass0206) {
        return Unit.LIZ;
    }

    public static final Object invoke$440(AnonymousClass0206 anonymousClass0206) {
        C01U6.LIZJ(get$arr$(439));
        return Unit.LIZ;
    }

    public static final Object invoke$441(AnonymousClass0206 anonymousClass0206) {
        return Float.valueOf(C418440Gaw.LIZIZ(2));
    }

    public static final Object invoke$442(AnonymousClass0206 anonymousClass0206) {
        return new C292501Bj();
    }

    public static final Object invoke$443(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_story_streak_special_language_font", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$444(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_music_create_frame_package_opt_for_pic", true, false));
    }

    public static final Object invoke$445(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "frame_extraction_opt_for_pic", true, false));
    }

    public static final Object invoke$446(AnonymousClass0206 anonymousClass0206) {
        return SettingsManager.LIZLLL().LJIIIIZZ("upc_network_reporting_config", UPCNetworkReportingConfigData.class, C004H.LIZ);
    }

    public static final Object invoke$447(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Map<String, Object> map = C00YT.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(Map.class, map, "ec_search_fyp_card_bcm_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return map;
    }

    public static final Object invoke$448(AnonymousClass0206 anonymousClass0206) {
        List list;
        List list2;
        try {
            ArrayList arrayList = new ArrayList();
            C01GW c01gw = C00YT.LIZIZ;
            Object obj = ((Map) c01gw.getValue()).get("search_result_list_ab");
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            Object obj2 = ((Map) c01gw.getValue()).get("search_result_list_abc");
            if (obj2 instanceof List) {
                list2 = (List) obj2;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object invoke$449(AnonymousClass0206 anonymousClass0206) {
        final Map map = (Map) C00J1.LIZ.getValue();
        final Map map2 = (Map) C00J1.LIZIZ.getValue();
        return new OnIMMessageListener(map, map2) { // from class: X.00jx
            public final Map<Integer, String> LL;
            public final Map<Integer, String> LLILLJJLI;
            public final AtomicLong LLILLL = new AtomicLong(0);

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "client_ai_im";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.ASYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                if (iMessage == null) {
                    return;
                }
                int intType = iMessage.getIntType();
                if (this.LLILLJJLI.containsKey(Integer.valueOf(intType))) {
                    LIZ(iMessage, this.LLILLJJLI.get(Integer.valueOf(intType)));
                    return;
                }
                if (!this.LL.containsKey(Integer.valueOf(intType))) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long jFrequencyMs = LiveRevenueFeatureIMSettings.INSTANCE.frequencyMs();
                long j = this.LLILLL.get();
                if ((j != 0 && jElapsedRealtime - j < jFrequencyMs) || !this.LLILLL.compareAndSet(j, jElapsedRealtime)) {
                    return;
                }
                LIZ(null, this.LL.get(Integer.valueOf(intType)));
            }

            {
                this.LL = map;
                this.LLILLJJLI = map2;
            }

            public static void LIZ(IMessage iMessage, String str) {
                Object c098200Yq;
                if (str == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("msg_type", str);
                if (iMessage != null) {
                    try {
                        c098200Yq = C19748512Ol.LIZJ.LJIILL(iMessage);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                        linkedHashMap.put("raw_data", c098200Yq);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("report msg: ");
                sbLIZ.append(linkedHashMap);
                C20441214yg.LIZIZ("LiveFeaturesIMMsgListener", C2188811AlT.LIZIZ(sbLIZ));
                C015G.LIZIZ(linkedHashMap, "live_revenue_msg_received", null);
            }
        };
    }

    public static final Object invoke$45(AnonymousClass0206 anonymousClass0206) {
        return AnonymousClass0207.get$arr$(13);
    }

    public static final Object invoke$450(AnonymousClass0206 anonymousClass0206) {
        List<C001A> messageTypes = C001A.getMessageTypes(LiveRevenueFeatureIMSettings.INSTANCE.imList());
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(messageTypes, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C001A c001a : messageTypes) {
            Pair pair = new Pair(Integer.valueOf(c001a.getIntType()), c001a.wsMethod);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final Object invoke$451(AnonymousClass0206 anonymousClass0206) {
        List<C001A> messageTypes = C001A.getMessageTypes(LiveRevenueFeatureIMSettings.INSTANCE.noFreqList());
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(messageTypes, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C001A c001a : messageTypes) {
            Pair pair = new Pair(Integer.valueOf(c001a.getIntType()), c001a.wsMethod);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final Object invoke$452(AnonymousClass0206 anonymousClass0206) {
        C480460Ism.LIZ().getClass();
        return C480460Ism.LIZLLL(LiveGiftApi.class);
    }

    public static final Object invoke$453(AnonymousClass0206 anonymousClass0206) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        HashMap<String, String> map = C200700px.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("incentive_api_cache_key_map", HashMap.class, map);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return map;
    }

    public static final Object invoke$454(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        List<String> list = C01CI.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(List.class, list, "ug_incentive_url_path_list", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return list;
    }

    public static final Object invoke$456(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$457(AnonymousClass0206 anonymousClass0206) {
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIIL;
        return C2097608Jq.LJIIJ(new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 1), "/webcast-va/daily_avatar_top1.png"), new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 2), "/webcast-va/daily_avatar_top2.png"), new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 3), "/webcast-va/daily_avatar_top3.png"), new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 10), "/webcast-va/daily_avatar_top4-10.png"), new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 20), "/webcast-va/daily_avatar_top11-20.png"));
    }

    public static final Object invoke$458(AnonymousClass0206 anonymousClass0206) {
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIIL;
        return C2097608Jq.LJIIJ(new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 1), "https://p16-webcast.tiktokcdn.com/img//webcast-va/daily_avatar_top1.png~tplv-obj.png"), new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 2), "https://p16-webcast.tiktokcdn.com/img//webcast-va/daily_avatar_top2.png~tplv-obj.png"), new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 3), "https://p16-webcast.tiktokcdn.com/img//webcast-va/daily_avatar_top3.png~tplv-obj.png"), new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 10), "https://p16-webcast.tiktokcdn.com/img//webcast-va/daily_avatar_top4-10.png~tplv-obj.png"), new Pair(new Pair(Integer.valueOf(rankTypeV2.type), 20), "https://p16-webcast.tiktokcdn.com/img//webcast-va/daily_avatar_top11-20.png~tplv-obj.png"));
    }

    public static final Object invoke$459(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_revert_bdbtm_params", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$46(AnonymousClass0206 anonymousClass0206) {
        List<LinkUser> listLIZLLL;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        boolean z = false;
        if (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || listLIZLLL.size() <= 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$460(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            boolean z = false;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "visual_search_navigate_push_head_exp", true) == 1) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$461(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_visual_search_no_login", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$462(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            boolean z = false;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "visual_search_saf_push_inc_message_priority", true) == 1) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$463(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_vs_take_photo_minors", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$464(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_vs_take_photo_no_login", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$465(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_products_card_pre_code_cache", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$466(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = (List) C0C64.LJIILLIIL().LJJII(List.class, C098100Yp.LIZ, "ec_search_products_card_pre_code_cache_list", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List<String> list = (List) c098200Yq;
        if (list == null) {
            list = C098100Yp.LIZ;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next() + "&enable_pre_decode=1&spark_perf_biz=ec_search_general_biz&enable_pre_code_cache=1";
                if (!C123100dR.LIZ(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return arrayList;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return arrayList;
        }
    }

    public static final Object invoke$467(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "general_ecom_content_image_opt", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$468(AnonymousClass0206 anonymousClass0206) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }

    public static final Object invoke$469(AnonymousClass0206 anonymousClass0206) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$47(AnonymousClass0206 anonymousClass0206) {
        return new C01I8();
    }

    public static final Object invoke$470(AnonymousClass0206 anonymousClass0206) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
    }

    public static final Object invoke$471(AnonymousClass0206 anonymousClass0206) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$472(AnonymousClass0206 anonymousClass0206) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$473(AnonymousClass0206 anonymousClass0206) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$474(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("enable_snssdk_scheme_in_commerce_jsb", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.TRUE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$475(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean z;
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) C098400Ys.LIZ.getValue(), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            c098200Yq = C13LP.LLIIJI(arrayList);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return C08CX.INSTANCE;
        }
        return c098200Yq;
    }

    public static final Object invoke$476(AnonymousClass0206 anonymousClass0206) {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "profile_to_detail_saf_page_setting", "", true);
        if (strLJJ == null) {
            return "";
        }
        return strLJJ;
    }

    public static final Object invoke$477(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("pgc_subscription_navigation_facade_enable", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.TRUE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$478(AnonymousClass0206 anonymousClass0206) {
        long jLongValue;
        Long lLJIILIIL;
        String serverDeviceId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId();
        if (serverDeviceId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(serverDeviceId)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        return Long.valueOf(jLongValue);
    }

    public static final Object invoke$479(AnonymousClass0206 anonymousClass0206) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        UcpNetworkRequestFailedExperimentConfig ucpNetworkRequestFailedExperimentConfig = C196200pE.LIZIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(UcpNetworkRequestFailedExperimentConfig.class, ucpNetworkRequestFailedExperimentConfig, "ucp_network_request_failed_v2_experiment", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return ucpNetworkRequestFailedExperimentConfig;
    }

    public static final Object invoke$48(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$480(AnonymousClass0206 anonymousClass0206) {
        List<C001A> messageTypes = C001A.getMessageTypes(LiveClientTriggerConfig.INSTANCE.imEventList());
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(messageTypes, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C001A c001a : messageTypes) {
            Pair pair = new Pair(Integer.valueOf(c001a.getIntType()), c001a.wsMethod);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final Object invoke$481(AnonymousClass0206 anonymousClass0206) {
        return LiveClientTriggerParamsSettings.INSTANCE.getTriggerConfigs();
    }

    public static final Object invoke$482(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "visual_search_fix_album_fling_behavior", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$483(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "visual_search_show_search_icon_on_shooting_btn", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$484(AnonymousClass0206 anonymousClass0206) {
        int iLJIJ = 0;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "nimble_gecko_thread_opt", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(iLJIJ);
    }

    public static final Object invoke$485(AnonymousClass0206 anonymousClass0206) {
        boolean z = false;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "search_top1_nimble_gecko_opt", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$486(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
    }

    public static final Object invoke$487(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "cla_thread_priority", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0;
        }
        return Integer.valueOf(C13LZ.LJ(((Number) c098200Yq).intValue(), -20, 19));
    }

    public static final Object invoke$488(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("tt_inbox_custom_load_more_trigger", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$489(AnonymousClass0206 anonymousClass0206) {
        return new LinkedHashMap();
    }

    public static final Object invoke$49(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$490(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = C0C64.LJIILLIIL().LJJ(31744, "top1_detail_h1_font", "", true);
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return "";
        }
        return c098200Yq;
    }

    public static final Object invoke$491(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = C0C64.LJIILLIIL().LJJ(31744, "top1_detail_h2_font", "", true);
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return "";
        }
        return c098200Yq;
    }

    public static final Object invoke$492(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = C0C64.LJIILLIIL().LJJ(31744, "top1_detail_h3_font", "", true);
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return "";
        }
        return c098200Yq;
    }

    public static final Object invoke$493(AnonymousClass0206 anonymousClass0206) {
        int iLJIJ = 0;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_nimble_disable_perf_tracker", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(iLJIJ);
    }

    public static final Object invoke$494(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 112, "top1_surround_media_height", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 112;
        }
        return c098200Yq;
    }

    public static final Object invoke$495(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 84, "top1_surround_media_width", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 84;
        }
        return c098200Yq;
    }

    public static final Object invoke$496(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = C0C64.LJIILLIIL().LJJ(31744, "top1_detail_body_font", "", true);
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return "";
        }
        return c098200Yq;
    }

    public static final Object invoke$497(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "video_surrounded_right_exclusion", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$498(AnonymousClass0206 anonymousClass0206) {
        return new LinkedHashMap();
    }

    public static final Object invoke$499(AnonymousClass0206 anonymousClass0206) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$5(AnonymousClass0206 anonymousClass0206) {
        ((Number) C326401Ok.LIZ.getValue()).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$50(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$500(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(LiveGiftForceInsertTagEnableSetting.INSTANCE.isEnabled());
    }

    public static final Object invoke$501(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
    }

    public static final Object invoke$502(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "detail_redundant_live_data_opt", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return Boolean.FALSE;
        }
        return c098200Yq;
    }

    public static final Object invoke$503(AnonymousClass0206 anonymousClass0206) {
        boolean z = true;
        if (!((Boolean) C140700gH.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$504(AnonymousClass0206 anonymousClass0206) {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) != null) {
            return interfaceC2661011fLIZ.create(ITtopIABApi.class);
        }
        return null;
    }

    public static final Object invoke$505(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_reviews_translate_opt", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$506(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_reviews_no_quality_compress_opt", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$507(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_reviews_upload_image_early", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$508(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = (FifaAnchorIdsConfig) C0C64.LJIILLIIL().LJJII(FifaAnchorIdsConfig.class, null, "social_repost_fifa_anchor_ids", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final Object invoke$509(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_osp_address_popup_copywrite", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$51(AnonymousClass0206 anonymousClass0206) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIIL(get$arr$(56));
        return Unit.LIZ;
    }

    public static final Object invoke$510(AnonymousClass0206 anonymousClass0206) {
        return Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId());
    }

    public static final Object invoke$511(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZJ);
    }

    public static final Object invoke$512(AnonymousClass0206 anonymousClass0206) {
        return new C438101n9();
    }

    public static final Object invoke$513(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue;
        boolean z = false;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ogc_news_anchor_iab_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$514(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "friends_v3_publish_progress_bar_ui_optimize", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$515(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "friends_v3_fg_not_added_crash_fix", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$516(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "friends_v3_fm_destroyed_crash_fix", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$517(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "friends_v3_publish_listener_compensate", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$518(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("friends_v3_release_memory_opt", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$519(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "friends_v3_publish_force_insert", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$52(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$520(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("friends_v3_repo_coroutine_scope_opt", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$521(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_friends_v3_rec_order_enable_story", true));
    }

    public static final Object invoke$522(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("friends_v3_enable_story_distribution", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$523(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "friends_v3_ensure_active_opt", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$524(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "friends_v3_stub_status_view", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$525(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
    }

    public static final Object invoke$526(AnonymousClass0206 anonymousClass0206) {
        return LiveClientTriggerParamsSettings.INSTANCE.getTriggerConfigs();
    }

    public static final Object invoke$527(AnonymousClass0206 anonymousClass0206) {
        return C1161920gLG.LIZJ(IHostAppContext.class);
    }

    public static final Object invoke$528(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enter_inbox_preload_light_interaction_gecko_toggle", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$529(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_shop_search_record_after_play", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$53(AnonymousClass0206 anonymousClass0206) {
        C766270U4b.LIZLLL(2131853845);
        return Unit.LIZ;
    }

    public static final Object invoke$530(AnonymousClass0206 anonymousClass0206) {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            C13BV c13bv = C256700yz.LIZ;
            List list = (List) c0c64LJIILLIIL.LJJII(List.class, c13bv, "photomode_lighten_config_event_type", true);
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((String) it2.next()).toLowerCase(Locale.getDefault()));
                }
                return arrayList;
            }
            return c13bv;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C256700yz.LIZ;
        }
    }

    public static final Object invoke$531(AnonymousClass0206 anonymousClass0206) {
        return new LinkedHashMap();
    }

    public static final Object invoke$532(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$533(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("pgc_sub_container_interceptor_kill_switch", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$534(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("pgc_webcast_subscribe_interceptor_kill_switch", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$535(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "cla_bugfix_one_exp", true, true));
    }

    public static final Object invoke$536(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
    }

    public static final Object invoke$537(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
    }

    public static final Object invoke$538(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
    }

    public static final Object invoke$539(AnonymousClass0206 anonymousClass0206) {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AddETPropPanelDeliverySourceExperimentConfig addETPropPanelDeliverySourceExperimentConfig = C212600rs.LIZ;
            AddETPropPanelDeliverySourceExperimentConfig addETPropPanelDeliverySourceExperimentConfig2 = (AddETPropPanelDeliverySourceExperimentConfig) settingsManagerLIZLLL.LJIIIIZZ("studio_add_et_prop_panel_delivery_source", AddETPropPanelDeliverySourceExperimentConfig.class, addETPropPanelDeliverySourceExperimentConfig);
            if (addETPropPanelDeliverySourceExperimentConfig2 != null) {
                return addETPropPanelDeliverySourceExperimentConfig2;
            }
            return addETPropPanelDeliverySourceExperimentConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C212600rs.LIZ;
        }
    }

    public static final Object invoke$54(AnonymousClass0206 anonymousClass0206) {
        C766270U4b.LIZLLL(2131853846);
        return Unit.LIZ;
    }

    public static final Object invoke$540(AnonymousClass0206 anonymousClass0206) {
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ei().LJIIIIZZ();
        return C1790620whI.LIZ;
    }

    public static final Object invoke$541(AnonymousClass0206 anonymousClass0206) {
        return new C395101gD();
    }

    public static final Object invoke$542(AnonymousClass0206 anonymousClass0206) {
        long ownerUserId;
        long currentUserId;
        boolean z;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = -1;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            currentUserId = interfaceC500940JkiUser.getCurrentUserId();
        } else {
            currentUserId = -2;
        }
        if (ownerUserId == currentUserId) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$543(AnonymousClass0206 anonymousClass0206) {
        return C2296808zG.LIZ(C0PEM.LIZ.plus(C23118094a.LIZ()));
    }

    public static final Object invoke$544(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("tt_im_streak_badge_num_color_fix", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$545(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "dm_streak_enable_invite_card_cache_setting", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$546(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("tt_dm_enable_refresh_streak_pet_info", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$547(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "dm_streak_enable_should_update_setting", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$548(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("streak_pet_disable_http_path_filter", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$549(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "tt_im_streak_pet_data_id_exp", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$55(AnonymousClass0206 anonymousClass0206) {
        C766270U4b.LIZLLL(2131853847);
        return Unit.LIZ;
    }

    public static final Object invoke$550(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "tt_im_streak_time_zone_monitor_enable", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$551(AnonymousClass0206 anonymousClass0206) {
        return C1161920gLG.LIZJ(IPinCardService.class);
    }

    public static final Object invoke$552(AnonymousClass0206 anonymousClass0206) {
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ei().LJIIIIZZ();
        return C1790620whI.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$553(AnonymousClass0206 anonymousClass0206) {
        return Unit.LIZ;
    }

    public static final Object invoke$554(AnonymousClass0206 anonymousClass0206) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$555(AnonymousClass0206 anonymousClass0206) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$556(AnonymousClass0206 anonymousClass0206) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$557(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "unify_commerce_video_view_holder_experiment", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = 0;
        }
        ((Number) c098200Yq).intValue();
        return c098200Yq;
    }

    public static final Object invoke$558(AnonymousClass0206 anonymousClass0206) {
        boolean z;
        C00ZO.LIZ.getClass();
        C01GW c01gw = C00ZO.LIZIZ;
        if (((Number) c01gw.getValue()).intValue() == 0 && C104100aN.LIZ().LJFF()) {
            return Boolean.TRUE;
        }
        if (((Number) c01gw.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$559(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_commerce_lynx_prelayout", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = 0;
        }
        ((Number) c098200Yq).intValue();
        return c098200Yq;
    }

    public static final Object invoke$56(AnonymousClass0206 anonymousClass0206) {
        C766270U4b.LIZLLL(2131853841);
        return Unit.LIZ;
    }

    public static final Object invoke$560(AnonymousClass0206 anonymousClass0206) {
        boolean z = true;
        if (((Number) C00ZE.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$561(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "commerce_mini_card_package_name_match_experiment", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = 0;
        }
        ((Number) c098200Yq).intValue();
        return c098200Yq;
    }

    public static final Object invoke$562(AnonymousClass0206 anonymousClass0206) {
        boolean z;
        if (((Number) C00ZF.LIZ.getValue()).intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$563(AnonymousClass0206 anonymousClass0206) {
        return new ArrayList();
    }

    public static final Object invoke$564(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJIIIIZZ(new Pair(0, 2131821122), new Pair(1, 2131821123));
    }

    public static final Object invoke$565(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJIIIIZZ(new Pair(0, 2131821116), new Pair(1, 2131821117));
    }

    public static final Object invoke$566(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJIIIIZZ(new Pair("effect_tool_NoTriggerAction", Integer.valueOf(R.string.effect_tool_NoTriggerAction)), new Pair("effect_tool_OnStart", Integer.valueOf(R.string.effect_tool_OnStart)), new Pair("effect_tool_ObjectStart", Integer.valueOf(R.string.effect_tool_ObjectStart)), new Pair("effect_tool_Second", Integer.valueOf(R.string.effect_tool_Second)), new Pair("effect_tool_TapScreen", Integer.valueOf(R.string.effect_tool_TapScreen)), new Pair("effect_tool_ObjectEnd", Integer.valueOf(R.string.effect_tool_ObjectEnd)), new Pair("effect_tool_SequenceStop", Integer.valueOf(R.string.effect_tool_SequenceStop)), new Pair("effect_tool_FPS", Integer.valueOf(R.string.effect_tool_FPS)), new Pair("effect_tool_UsePreEndAsStart", Integer.valueOf(R.string.effect_tool_UsePreEndAsStart)), new Pair("effect_tool_Nod", Integer.valueOf(R.string.effect_tool_Nod)), new Pair("effect_tool_ShakeHead", Integer.valueOf(R.string.effect_tool_ShakeHead)), new Pair("effect_tool_OpenMouth", Integer.valueOf(R.string.effect_tool_OpenMouth)), new Pair("effect_tool_PoutMouth", Integer.valueOf(R.string.effect_tool_PoutMouth)), new Pair("effect_tool_RaiseEyebrows", Integer.valueOf(R.string.effect_tool_RaiseEyebrows)), new Pair("effect_tool_WinkEyes", Integer.valueOf(R.string.effect_tool_WinkEyes)), new Pair("effect_tool_Angry", Integer.valueOf(R.string.effect_tool_Angry)), new Pair("effect_tool_Nausea", Integer.valueOf(R.string.effect_tool_Nausea)), new Pair("effect_tool_Fear", Integer.valueOf(R.string.effect_tool_Fear)), new Pair("effect_tool_Happy", Integer.valueOf(R.string.effect_tool_Happy)), new Pair("effect_tool_Sad", Integer.valueOf(R.string.effect_tool_Sad)), new Pair("effect_tool_Surprise", Integer.valueOf(R.string.effect_tool_Surprise)), new Pair("effect_tool_PokerFace", Integer.valueOf(R.string.effect_tool_PokerFace)), new Pair("effect_tool_Beg", Integer.valueOf(R.string.effect_tool_Beg)), new Pair("effect_tool_BigV", Integer.valueOf(R.string.effect_tool_BigV)), new Pair("effect_tool_Cabbage", Integer.valueOf(R.string.effect_tool_Cabbage)), new Pair("effect_tool_FistBow", Integer.valueOf(R.string.effect_tool_FistBow)), new Pair("effect_tool_Fist", Integer.valueOf(R.string.effect_tool_Fist)), new Pair("effect_tool_Four", Integer.valueOf(R.string.effect_tool_Four)), new Pair("effect_tool_HandOpen", Integer.valueOf(R.string.effect_tool_HandOpen)), new Pair("effect_tool_HeartA", Integer.valueOf(R.string.effect_tool_HeartA)), new Pair("effect_tool_HeartB", Integer.valueOf(R.string.effect_tool_HeartB)), new Pair("effect_tool_HeartC", Integer.valueOf(R.string.effect_tool_HeartC)), new Pair("effect_tool_HeartD", Integer.valueOf(R.string.effect_tool_HeartD)), new Pair("effect_tool_HoldFace", Integer.valueOf(R.string.effect_tool_HoldFace)), new Pair("effect_tool_HornA", Integer.valueOf(R.string.effect_tool_HornA)), new Pair("effect_tool_HornB", Integer.valueOf(R.string.effect_tool_HornB)), new Pair("effect_tool_IndexFingerUp", Integer.valueOf(R.string.effect_tool_IndexFingerUp)), new Pair("effect_tool_Namaste", Integer.valueOf(R.string.effect_tool_Namaste)), new Pair("effect_tool_OK", Integer.valueOf(R.string.effect_tool_OK)), new Pair("effect_tool_PalmUp", Integer.valueOf(R.string.effect_tool_PalmUp)), new Pair("effect_tool_PhoneCall", Integer.valueOf(R.string.effect_tool_PhoneCall)), new Pair("effect_tool_Pray", Integer.valueOf(R.string.effect_tool_Pray)), new Pair("effect_tool_Salute", Integer.valueOf(R.string.effect_tool_Salute)), new Pair("effect_tool_ShootA", Integer.valueOf(R.string.effect_tool_ShootA)), new Pair("effect_tool_ShootB", Integer.valueOf(R.string.effect_tool_ShootB)), new Pair("effect_tool_Thanks", Integer.valueOf(R.string.effect_tool_Thanks)), new Pair("effect_tool_Three", Integer.valueOf(R.string.effect_tool_Three)), new Pair("effect_tool_ThumbDown", Integer.valueOf(R.string.effect_tool_ThumbDown)), new Pair("effect_tool_Victory", Integer.valueOf(R.string.effect_tool_Victory)), new Pair("effect_tool_Vow", Integer.valueOf(R.string.effect_tool_Vow)), new Pair("effect_tool_NoAnimation", Integer.valueOf(R.string.effect_tool_NoAnimation)), new Pair("effect_tool_BarrageScrollHorizontal", Integer.valueOf(R.string.effect_tool_BarrageScrollHorizontal)), new Pair("effect_tool_SubtitleScrollVertical", Integer.valueOf(R.string.effect_tool_SubtitleScrollVertical)), new Pair("effect_tool_BarrageScrollHorizontalReverse", Integer.valueOf(R.string.effect_tool_BarrageScrollHorizontalReverse)), new Pair("effect_tool_SubtitleScrollVerticalReverse", Integer.valueOf(R.string.effect_tool_SubtitleScrollVerticalReverse)), new Pair("effect_tool_Flip", Integer.valueOf(R.string.effect_tool_Flip)), new Pair("effect_tool_Wiper", Integer.valueOf(R.string.effect_tool_Wiper)), new Pair("effect_tool_Dance", Integer.valueOf(R.string.effect_tool_Dance)), new Pair("effect_tool_DanceSlightly", Integer.valueOf(R.string.effect_tool_DanceSlightly)), new Pair("effect_tool_Pendulum", Integer.valueOf(R.string.effect_tool_Pendulum)), new Pair("effect_tool_Rotate", Integer.valueOf(R.string.effect_tool_Rotate)), new Pair("effect_tool_Swing", Integer.valueOf(R.string.effect_tool_Swing)), new Pair("effect_tool_Heartbeat", Integer.valueOf(R.string.effect_tool_Heartbeat)), new Pair("effect_tool_Flicker", Integer.valueOf(R.string.effect_tool_Flicker)), new Pair("effect_tool_Tremble", Integer.valueOf(R.string.effect_tool_Tremble)), new Pair("effect_tool_AnimationPlayMode_Once", Integer.valueOf(R.string.effect_tool_AnimationPlayMode_Once)), new Pair("effect_tool_AnimationPlayMode_Loop", Integer.valueOf(R.string.effect_tool_AnimationPlayMode_Loop)), new Pair("effect_tool_Loop", Integer.valueOf(R.string.effect_tool_Loop)), new Pair("effect_tool_Random", Integer.valueOf(R.string.effect_tool_Random)), new Pair("effect_tool_InOrder", Integer.valueOf(R.string.effect_tool_InOrder)), new Pair("effect_tool_Appear", Integer.valueOf(R.string.effect_tool_Appear)), new Pair("effect_tool_Disappear", Integer.valueOf(R.string.effect_tool_Disappear)), new Pair("effect_tool_Toggle", Integer.valueOf(R.string.effect_tool_Toggle)), new Pair("effect_tool_StartPlay", Integer.valueOf(R.string.effect_tool_StartPlay)), new Pair("effect_tool_SwitchFeature", Integer.valueOf(R.string.effect_tool_SwitchFeature)), new Pair("effect_tool_StopPlay", Integer.valueOf(R.string.effect_tool_StopPlay)), new Pair("effect_tool_OpacityIn", Integer.valueOf(R.string.effect_tool_OpacityIn)), new Pair("effect_tool_BounceIn", Integer.valueOf(R.string.effect_tool_BounceIn)), new Pair("effect_tool_FlipOverIn", Integer.valueOf(R.string.effect_tool_FlipOverIn)), new Pair("effect_tool_SlowlyZoomIn", Integer.valueOf(R.string.effect_tool_SlowlyZoomIn)), new Pair("effect_tool_OpacityOut", Integer.valueOf(R.string.effect_tool_OpacityOut)), new Pair("effect_tool_BounceOut", Integer.valueOf(R.string.effect_tool_BounceOut)), new Pair("effect_tool_FlipOverOut", Integer.valueOf(R.string.effect_tool_FlipOverOut)), new Pair("effect_tool_SlowlyZoomOut", Integer.valueOf(R.string.effect_tool_SlowlyZoomOut)), new Pair("effect_tool_RandomAppear", 2131820900), new Pair("effect_tool_CounterclockwiseOut", 2131820899), new Pair("effect_tool_FlyInFromTop", 2131820898), new Pair("effect_tool_ThumbUp", 2131821126));
    }

    public static final Object invoke$567(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJIIIIZZ(new Pair("effect_tool_template_intermediate", Integer.valueOf(R.string.effect_tool_template_intermediate)), new Pair("effect_tool_template_beginner", Integer.valueOf(R.string.effect_tool_template_beginner)), new Pair("effect_tool_template_Advance", Integer.valueOf(R.string.effect_tool_template_Advance)), new Pair("AME_makeup_color", Integer.valueOf(R.string.AME_makeup_color)), new Pair("AME_makeup_finish", Integer.valueOf(R.string.AME_makeup_finish)), new Pair("AME_makeup_style", Integer.valueOf(R.string.AME_makeup_style)), new Pair("AME_greenScreen_templateHint", Integer.valueOf(R.string.AME_makeup_style)));
    }

    public static final Object invoke$568(AnonymousClass0206 anonymousClass0206) {
        return C2097608Jq.LJIIIIZZ(new Pair("AME_editEffect_inspector_bling", Integer.valueOf(R.string.AME_editEffect_inspector_bling)), new Pair("AME_editEffect_inspector_vignette", Integer.valueOf(R.string.AME_editEffect_inspector_vignette)), new Pair("AME_editEffect_inspector_radius", Integer.valueOf(R.string.AME_editEffect_inspector_radius)), new Pair("AME_editEffect_inspector_saturation", Integer.valueOf(R.string.AME_editEffect_inspector_saturation)), new Pair("AME_editEffect_inspector_ridges", Integer.valueOf(R.string.AME_editEffect_inspector_ridges)), new Pair("AME_editEffect_inspector_texture", Integer.valueOf(R.string.AME_editEffect_inspector_texture)), new Pair("AME_editEffect_inspector_degree", Integer.valueOf(R.string.AME_editEffect_inspector_degree)), new Pair("AME_editEffect_inspector_vertical", Integer.valueOf(R.string.AME_editEffect_inspector_vertical)), new Pair("AME_editEffect_inspector_size", Integer.valueOf(R.string.AME_editEffect_inspector_size)), new Pair("AME_editEffect_inspector_lowQuality", Integer.valueOf(R.string.AME_editEffect_inspector_lowQuality)), new Pair("AME_editEffect_inspector_tempo", Integer.valueOf(R.string.AME_editEffect_inspector_tempo)), new Pair("AME_editEffect_inspector_haze", Integer.valueOf(R.string.AME_editEffect_inspector_haze)), new Pair("AME_editEffect_inspector_glare", Integer.valueOf(R.string.AME_editEffect_inspector_glare)), new Pair("AME_editEffect_inspector_definition", Integer.valueOf(R.string.AME_editEffect_inspector_definition)), new Pair("AME_editEffect_inspector_direction", Integer.valueOf(R.string.AME_editEffect_inspector_direction)), new Pair("AME_editEffect_inspector_grain", Integer.valueOf(R.string.AME_editEffect_inspector_grain)), new Pair("AME_editEffect_inspector_width", Integer.valueOf(R.string.AME_editEffect_inspector_width)), new Pair("AME_editEffect_inspector_coolness", Integer.valueOf(R.string.AME_editEffect_inspector_coolness)), new Pair("AME_editEffect_inspector_blur", Integer.valueOf(R.string.AME_editEffect_inspector_blur)), new Pair("AME_editEffect_inspector_ripple", Integer.valueOf(R.string.AME_editEffect_inspector_ripple)), new Pair("AME_editEffect_inspector_offset", Integer.valueOf(R.string.AME_editEffect_inspector_offset)), new Pair("AME_editEffect_inspector_intensity", Integer.valueOf(R.string.AME_editEffect_inspector_intensity)), new Pair("AME_editEffect_inspector_sharpness", Integer.valueOf(R.string.AME_editEffect_inspector_sharpness)), new Pair("AME_editEffect_inspector_aberration", Integer.valueOf(R.string.AME_editEffect_inspector_aberration)), new Pair("AME_editEffect_inspector_horizontal", Integer.valueOf(R.string.AME_editEffect_inspector_horizontal)), new Pair("AME_editEffect_inspector_speed", Integer.valueOf(R.string.AME_editEffect_inspector_speed)), new Pair("AME_editEffect_inspector_opacity", Integer.valueOf(R.string.AME_editEffect_inspector_opacity)), new Pair("AME_editEffect_inspector_bending", Integer.valueOf(R.string.AME_editEffect_inspector_bending)), new Pair("AME_editEffect_inspector_pattern", Integer.valueOf(R.string.AME_editEffect_inspector_pattern)), new Pair("AME_editEffect_inspector_deformation", Integer.valueOf(R.string.AME_editEffect_inspector_deformation)), new Pair("AME_editEffect_inspector_rotation", Integer.valueOf(R.string.AME_editEffect_inspector_rotation)), new Pair("AME_editEffect_inspector_noise", Integer.valueOf(R.string.AME_editEffect_inspector_noise)), new Pair("AME_editEffect_inspector_frequency", Integer.valueOf(R.string.AME_editEffect_inspector_frequency)), new Pair("AME_editEffect_inspector_quantity", Integer.valueOf(R.string.AME_editEffect_inspector_quantity)), new Pair("AME_editEffect_inspector_splitRatio", Integer.valueOf(R.string.AME_editEffect_inspector_splitRatio)), new Pair("AME_editEffect_inspector_ratio", Integer.valueOf(R.string.AME_editEffect_inspector_ratio)), new Pair("AME_editEffect_inspector_position", Integer.valueOf(R.string.AME_editEffect_inspector_position)), new Pair("AME_editEffect_inspector_color", Integer.valueOf(R.string.AME_editEffect_inspector_color)), new Pair("AME_editEffect_inspector_zoom1", Integer.valueOf(R.string.AME_editEffect_inspector_zoom1)), new Pair("AME_editEffect_inspector_zoom2", Integer.valueOf(R.string.AME_editEffect_inspector_zoom2)), new Pair("AME_editEffect_inspector_zoom3", Integer.valueOf(R.string.AME_editEffect_inspector_zoom3)), new Pair("AME_editEffect_inspector_offset1", Integer.valueOf(R.string.AME_editEffect_inspector_offset1)), new Pair("AME_editEffect_inspector_offset2", Integer.valueOf(R.string.AME_editEffect_inspector_offset2)), new Pair("AME_editEffect_inspector_yAxis", Integer.valueOf(R.string.AME_editEffect_inspector_yAxis)), new Pair("AME_editEffect_inspector_xAxis", Integer.valueOf(R.string.AME_editEffect_inspector_xAxis)), new Pair("AME_editEffect_inspector_screenratio", Integer.valueOf(R.string.AME_editEffect_inspector_screenratio)), new Pair("AME_editEffect_inspector_angle", Integer.valueOf(R.string.AME_editEffect_inspector_angle)), new Pair("AME_editEffect_inspector_xaxis", Integer.valueOf(R.string.AME_editEffect_inspector_xaxis)), new Pair("AME_editEffect_inspector_yaxis", Integer.valueOf(R.string.AME_editEffect_inspector_yaxis)), new Pair("AME_editEffect_inspector_diameter", Integer.valueOf(R.string.AME_editEffect_inspector_diameter)), new Pair("AME_editEffect_inspector_brightness", Integer.valueOf(R.string.AME_editEffect_inspector_brightness)), new Pair("AME_editEffect_inspector_material1", Integer.valueOf(R.string.AME_editEffect_inspector_material1)), new Pair("AME_editEffect_inspector_scope", Integer.valueOf(R.string.AME_editEffect_inspector_scope)), new Pair("AME_editEffect_inspector_height", Integer.valueOf(R.string.AME_editEffect_inspector_height)), new Pair("AME_editEffect_inspector_xoffset", Integer.valueOf(R.string.AME_editEffect_inspector_xoffset)), new Pair("AME_editEffect_inspector_yoffset", Integer.valueOf(R.string.AME_editEffect_inspector_yoffset)), new Pair("AME_editEffect_inspector_leftsize", Integer.valueOf(R.string.AME_editEffect_inspector_leftsize)), new Pair("AME_editEffect_inspector_rightsize", Integer.valueOf(R.string.AME_editEffect_inspector_rightsize)), new Pair("AME_editEffect_inspector_displacement1", Integer.valueOf(R.string.AME_editEffect_inspector_displacement1)), new Pair("AME_editEffect_inspector_displacement2", Integer.valueOf(R.string.AME_editEffect_inspector_displacement2)), new Pair("AME_editEffect_inspector_rotationspeed", Integer.valueOf(R.string.AME_editEffect_inspector_rotationspeed)), new Pair("AME_editEffect_inspector_position1", Integer.valueOf(R.string.AME_editEffect_inspector_position1)), new Pair("AME_editEffect_inspector_position2", Integer.valueOf(R.string.AME_editEffect_inspector_position2)), new Pair("AME_editEffect_inspector_border", Integer.valueOf(R.string.AME_editEffect_inspector_border)), new Pair("AME_editEffect_inspector_scratch", Integer.valueOf(R.string.AME_editEffect_inspector_scratch)), new Pair("AME_editEffect_inspector_vibe", Integer.valueOf(R.string.AME_editEffect_inspector_vibe)), new Pair("AME_editEffect_inspector_luminous", Integer.valueOf(R.string.AME_editEffect_inspector_luminous)), new Pair("AME_editEffect_inspector_rate", Integer.valueOf(R.string.AME_editEffect_inspector_rate)), new Pair("AME_editEffect_inspector_roughness", Integer.valueOf(R.string.AME_editEffect_inspector_roughness)), new Pair("AME_editEffect_inspector_leftright", Integer.valueOf(R.string.AME_editEffect_inspector_leftright)), new Pair("AME_editEffect_inspector_updown", Integer.valueOf(R.string.AME_editEffect_inspector_updown)), new Pair("AME_editEffect_inspector_stroke", Integer.valueOf(R.string.AME_editEffect_inspector_stroke)), new Pair("AME_editEffect_inspector_crease", Integer.valueOf(R.string.AME_editEffect_inspector_crease)), new Pair("AME_editEffect_inspector_vortex", Integer.valueOf(R.string.AME_editEffect_inspector_vortex)), new Pair("AME_editEffect_inspector_size1", Integer.valueOf(R.string.AME_editEffect_inspector_size1)), new Pair("AME_editEffect_inspector_size2", Integer.valueOf(R.string.AME_editEffect_inspector_size2)), new Pair("AME_editEffect_inspector_size3", Integer.valueOf(R.string.AME_editEffect_inspector_size3)), new Pair("AME_editEffect_inspector_rotation1", Integer.valueOf(R.string.AME_editEffect_inspector_rotation1)), new Pair("AME_editEffect_inspector_rotation2", Integer.valueOf(R.string.AME_editEffect_inspector_rotation2)), new Pair("AME_editEffect_inspector_count", 2131821012), new Pair("AME_editEffect_inspector_filter", 2131821013), new Pair("AME_editEffect_inspector_hue", 2131825190));
    }

    public static final Object invoke$569(AnonymousClass0206 anonymousClass0206) {
        return new ArrayList();
    }

    public static final Object invoke$57(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(C462601r6.LIZ());
    }

    public static final Object invoke$570(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_inner_back_to_detail_exp_v2", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$571(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "search_async_observe_opt", true));
    }

    public static final Object invoke$572(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_animation_queue_manager", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$573(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "im_hierarchy_data_log_config", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return bool;
        }
        return c098200Yq;
    }

    public static final Object invoke$574(AnonymousClass0206 anonymousClass0206) {
        return PaidSeriesLiveApiService.LIZJ();
    }

    public static final Object invoke$575(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 200;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 200, "fcp_strategy_hit_cache_config", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$576(AnonymousClass0206 anonymousClass0206) {
        return C1234230iDt.LIZIZ;
    }

    public static final Object invoke$577(AnonymousClass0206 anonymousClass0206) {
        return Keva.getRepo("LinkPopupFixed");
    }

    public static final Object invoke$578(AnonymousClass0206 anonymousClass0206) {
        return C451201pG.LJII.getValue();
    }

    public static final Object invoke$579(AnonymousClass0206 anonymousClass0206) {
        return Keva.getRepo("LINK_PRIVACY_DIALOG_SHOWED");
    }

    public static final Object invoke$58(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$59(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$6(AnonymousClass0206 anonymousClass0206) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPipoPollRedirectSchemaModel ecPipoPollRedirectSchemaModel = C214200s8.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_order_pay_schema_pipo_poll_config", EcPipoPollRedirectSchemaModel.class, ecPipoPollRedirectSchemaModel);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return ecPipoPollRedirectSchemaModel;
    }

    public static /* bridge */ /* synthetic */ Object invoke$60(AnonymousClass0206 anonymousClass0206) {
        return C13LQ.LJLIIL(com.bytedance.android.live_settings.SettingsManager.INSTANCE.getStringArrayValue("ttlive_unused_setting_solidify_disable_list", new String[0]));
    }

    public static /* bridge */ /* synthetic */ Object invoke$61(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(com.bytedance.android.live_settings.SettingsManager.INSTANCE.getBooleanValue("ttlive_unused_setting_solidify_enable", false));
    }

    public static final Object invoke$62(AnonymousClass0206 anonymousClass0206) {
        return C1161920gLG.LIZJ(IGamePartnershipService.class);
    }

    public static final Object invoke$63(AnonymousClass0206 anonymousClass0206) {
        Long lValueOf;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null) {
            lValueOf = Long.valueOf(iInteractService.getChannelId());
        } else {
            lValueOf = null;
        }
        return String.valueOf(lValueOf);
    }

    public static final Object invoke$64(AnonymousClass0206 anonymousClass0206) {
        String string;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService == null || (string = Long.valueOf(iInteractService.getBattleId()).toString()) == null) {
            return "";
        }
        return string;
    }

    public static final Object invoke$65(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
    }

    public static final Object invoke$66(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)));
    }

    public static final Object invoke$68(AnonymousClass0206 anonymousClass0206) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$69(AnonymousClass0206 anonymousClass0206) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$7(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "mini_drama_tab_preload_cache_count", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$70(AnonymousClass0206 anonymousClass0206) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$71(AnonymousClass0206 anonymousClass0206) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$72(AnonymousClass0206 anonymousClass0206) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(190)));
    }

    public static final Object invoke$73(AnonymousClass0206 anonymousClass0206) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$74(AnonymousClass0206 anonymousClass0206) {
        return new C237800vw();
    }

    public static final Object invoke$75(AnonymousClass0206 anonymousClass0206) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$76(AnonymousClass0206 anonymousClass0206) {
        return new C11NJ();
    }

    public static final Object invoke$78(AnonymousClass0206 anonymousClass0206) {
        return 3500L;
    }

    public static final Object invoke$79(AnonymousClass0206 anonymousClass0206) {
        return com.bytedance.android.live_settings.SettingsManager.INSTANCE.getValueSafely("anchor_gift_guide_trigger_discard_thresholds", GuideAnchorTriggerDiscardThresholds.DEFAULT);
    }

    public static final Object invoke$8(AnonymousClass0206 anonymousClass0206) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "tako_tracking_async_enabled", true, false));
    }

    public static final Object invoke$80(AnonymousClass0206 anonymousClass0206) {
        return com.bytedance.android.live_settings.SettingsManager.INSTANCE.getValueSafely("anchor_gift_guide_trigger_shuffle_config", GuideAnchorTriggerShuffleConfig.DEFAULT);
    }

    public static final Object invoke$81(AnonymousClass0206 anonymousClass0206) {
        return C13LQ.LJLIIL(LiveUnusedSettingSolidifyDisableListConfig.INSTANCE.value());
    }

    public static final Object invoke$82(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_search_live_card_enable_poster", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$83(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_deal_skin_scene_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$84(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_no_cart_fix_repeat_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$85(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_search_load_more_chunk_enable", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$86(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_input_suggestion_exp", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$87(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_mix_lynx_background_runtime", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$88(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_photo_search_album_preload_number", true);
            if (iLJIJ < 0) {
                iLJIJ = 0;
            }
            c098200Yq = Integer.valueOf(iLJIJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$89(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_search_shutdown_auto_play_by_low_memory", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$9(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tikbot_white_screen_monitor", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return 0;
        }
        return c098200Yq;
    }

    public static final Object invoke$90(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_tab_font_style_refactor", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$91(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_search_video_card_enable_poster", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$92(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_search_enable_overflow_search_id_write_bcm", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$93(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_show_srp_sharer_info", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$94(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_search_widgets_info_shared_data", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$95(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 1;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_search_pdp_out_of_app_pass_did", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$96(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        try {
            c098200Yq = (EcSearchPdpOutOfAppDiversionConfigModel) C0C64.LJIILLIIL().LJJII(EcSearchPdpOutOfAppDiversionConfigModel.class, C097000Ye.LIZ, "ec_search_pdp_out_of_app_diversion_config", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
            return C097000Ye.LIZ;
        }
        return c098200Yq;
    }

    public static final Object invoke$97(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = true;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_spark_item_cell_memory_leak_fix", true, true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$98(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        int iIntValue = 0;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_search_pdp_out_of_app_diversion", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$99(AnonymousClass0206 anonymousClass0206) {
        Object c098200Yq;
        boolean zBooleanValue = false;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_mix_spark_item_cell_weak_ref_fix", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
