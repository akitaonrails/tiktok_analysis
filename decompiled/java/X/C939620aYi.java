package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiContainerInfo;
import com.bytedance.android.livesdk.sei.TicketInfo;
import com.bytedance.android.livesdk.sei.TicketInfoExtra;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.SocialGameLayoutExtra;

/* JADX INFO: renamed from: X.0aYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939620aYi extends C09AY implements Function1<TicketInfoExtra, Unit> {
    public final /* synthetic */ C939600aYg LL;
    public final /* synthetic */ C945320ahu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C939620aYi(C939600aYg c939600aYg, C945320ahu c945320ahu) {
        super(1);
        this.LL = c939600aYg;
        this.LLILLJJLI = c945320ahu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TicketInfoExtra ticketInfoExtra) {
        C939740aYu c939740aYu;
        C939740aYu c939740aYu2;
        final TicketInfoExtra ticketInfoExtra2 = ticketInfoExtra;
        if (ticketInfoExtra2 == null) {
            if (this.LL.LLJILJILJ && System.currentTimeMillis() - this.LL.LLJILJIL > Mp4ScreenVideoLoadTimeout.CONTROL) {
                C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindowHandler", "onLiveSeiData clear iconTicket");
                C939600aYg c939600aYg = this.LL;
                c939600aYg.LLJILJILJ = false;
                for (Map.Entry<String, AbstractC940410aZz> entry : c939600aYg.LLILLJJLI.entrySet()) {
                    entry.getKey();
                    AbstractC940410aZz value = entry.getValue();
                    if ((value instanceof C939740aYu) && (c939740aYu2 = (C939740aYu) value) != null) {
                        c939740aYu2.LJJIIZI(false);
                    }
                }
            }
        } else {
            Map<String, TicketInfo> map = ticketInfoExtra2.map;
            if (map != null && !map.isEmpty()) {
                C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindowHandler", "onLiveSeiData updateIconTicket");
                this.LL.LLJILJIL = System.currentTimeMillis();
                this.LL.LLJILJILJ = true;
            } else {
                for (Map.Entry<String, AbstractC940410aZz> entry2 : this.LL.LLILLJJLI.entrySet()) {
                    entry2.getKey();
                    AbstractC940410aZz value2 = entry2.getValue();
                    if ((value2 instanceof C939740aYu) && (c939740aYu = (C939740aYu) value2) != null) {
                        c939740aYu.LJJIIZI(false);
                    }
                }
            }
            Map<String, TicketInfo> map2 = ticketInfoExtra2.map;
            if (map2 != null) {
                final C939600aYg c939600aYg2 = this.LL;
                final C945320ahu c945320ahu = this.LLILLJJLI;
                map2.forEach(new BiConsumer() { // from class: X.0aYy
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        C939740aYu c939740aYu3;
                        long jLongValue;
                        int iIntValue;
                        Context context;
                        C1AGN c1agn;
                        int iIntValue2;
                        LiveSeiStruct liveSeiStruct;
                        SeiAppData seiAppData;
                        SeiContainerInfo seiContainerInfo;
                        String str;
                        MultiGuestLayoutExtra multiGuestLayoutExtraLJFF;
                        SocialGameLayoutExtra socialGameLayoutExtra;
                        TicketInfo ticketInfo = (TicketInfo) obj2;
                        AbstractC940410aZz abstractC940410aZz = c939600aYg2.LLILLJJLI.get(obj);
                        if ((abstractC940410aZz instanceof C939740aYu) && (c939740aYu3 = (C939740aYu) abstractC940410aZz) != null) {
                            C945320ahu c945320ahu2 = c945320ahu;
                            TicketInfoExtra ticketInfoExtra3 = ticketInfoExtra2;
                            if (MultiGuestSocialGameLetsDanceSetting.config().participantLetsDanceEnabled) {
                                if ((c945320ahu2 != null && (liveSeiStruct = c945320ahu2.LIZ) != null && (seiAppData = liveSeiStruct.LIZ) != null && (seiContainerInfo = seiAppData.linkMicContainer) != null && (str = seiContainerInfo.multiGuestLayoutExtra) != null && (multiGuestLayoutExtraLJFF = C942200acs.LJFF(str)) != null && (socialGameLayoutExtra = multiGuestLayoutExtraLJFF.socialGame) != null && socialGameLayoutExtra.gameJustDanceStatus == 2) || c939740aYu3.LLJJIII) {
                                    c939740aYu3.LJJIIZI(false);
                                } else {
                                    c939740aYu3.LJJIIZI(true);
                                }
                            }
                            LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = LinkMicTicketIconUrlSetting.INSTANCE;
                            String str2 = ticketInfo.styleName;
                            String str3 = "";
                            if (str2 == null) {
                                str2 = "";
                            }
                            String iconValueByName = linkMicTicketIconUrlSetting.getIconValueByName(str2);
                            Long l = ticketInfo.ticketValue;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            String str4 = ticketInfo.animId;
                            String str5 = ticketInfo.styleName;
                            if (str5 != null) {
                                str3 = str5;
                            }
                            Integer iconBgColorByName = linkMicTicketIconUrlSetting.getIconBgColorByName(str3);
                            int i = ticketInfoExtra3.scoreType;
                            String str6 = ticketInfo.styleName;
                            String str7 = ticketInfo.ticketUiStyleV2;
                            Integer num = ticketInfo.rank;
                            long j = jLongValue;
                            C939950aZF c939950aZF = new C939950aZF(i, jLongValue, iconBgColorByName, num, iconValueByName, str4, str6, str7);
                            if (!c939740aYu3.LLJJIII && c939740aYu3.LLIZLLLIL != EnumC940090aZT.SEARCH) {
                                if (!MultiGuestSocialGameLetsDanceSetting.config().participantLetsDanceEnabled) {
                                    c939740aYu3.LJJIIZI(true);
                                }
                                if (str4 != null && (c1agn = (C1AGN) c939740aYu3.LLLL.getValue()) != null) {
                                    if (c1agn.LIZJ(c939950aZF.LIZLLL, c939950aZF.LIZ, c939950aZF.LIZJ, c939950aZF.LJFF)) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("updateTicket source=");
                                        sbLIZ.append(c939950aZF);
                                        sbLIZ.append(".source, interactId=");
                                        sbLIZ.append(c939740aYu3.LLJILLL);
                                        sbLIZ.append(" return as expressionHelper consume");
                                        C20441214yg.LJIIIZ("MultiGuestV3FeedMaskWindow", C2188811AlT.LIZIZ(sbLIZ));
                                        long j2 = c939950aZF.LIZIZ;
                                        int i2 = c939950aZF.LJ;
                                        if (num != null) {
                                            iIntValue2 = num.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        c939740aYu3.LJJIII(i2, iIntValue2, j2, "onLiveSeiData");
                                        return;
                                    }
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("updateTicket linkMicId=");
                                sbLIZ2.append(c939740aYu3.LLJILLL);
                                sbLIZ2.append(" iconUrl=");
                                sbLIZ2.append(iconValueByName);
                                sbLIZ2.append(", ticketCount=");
                                sbLIZ2.append(j);
                                sbLIZ2.append(", source=");
                                sbLIZ2.append("onLiveSeiData");
                                C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindow", C2188811AlT.LIZIZ(sbLIZ2));
                                C1813460xI8.LIZIZ(c939740aYu3.LLLLIILLL, new AwS594S0100000_15(c939950aZF, 1094));
                                if (!Intrinsics.LJFF(str7, c939740aYu3.LLLLIL)) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("update ticketUiStyle: ");
                                    sbLIZ3.append(str7);
                                    C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindow", C2188811AlT.LIZIZ(sbLIZ3));
                                    if (!Intrinsics.LJFF(str7, "playing_rank_only") && !Intrinsics.LJFF(str7, "playing_show_rank")) {
                                        FrameLayout frameLayout = c939740aYu3.LLLIZZ;
                                        if (frameLayout != null) {
                                            C786410Ut5.LJZ(8, frameLayout);
                                        }
                                        View view = c939740aYu3.LLLILZLLLI;
                                        if (view != null) {
                                            C786410Ut5.LJLLLLLL(0, view);
                                        }
                                    } else {
                                        boolean zLJFF = Intrinsics.LJFF(str7, "playing_show_rank");
                                        FrameLayout frameLayout2 = c939740aYu3.LLLIZZ;
                                        if (frameLayout2 != null) {
                                            C786410Ut5.LJJJJIZL(frameLayout2);
                                        }
                                        FrameLayout frameLayout3 = c939740aYu3.LLLIZZ;
                                        if (frameLayout3 != null) {
                                            C786410Ut5.LJZ(0, frameLayout3);
                                        }
                                        View view2 = c939740aYu3.LLLILZLLLI;
                                        if (view2 != null) {
                                            C786410Ut5.LJLLLLLL(8, view2);
                                        }
                                        FrameLayout frameLayout4 = c939740aYu3.LLLIZZ;
                                        ViewGroup viewGroup = c939740aYu3.LL;
                                        if (viewGroup != null) {
                                            context = viewGroup.getContext();
                                        } else {
                                            context = null;
                                        }
                                        if (frameLayout4 != null && context != null) {
                                            ComposeView composeView = new ComposeView(context, null, 6);
                                            C20174413wk.LIZIZ(composeView, new C19719212De(179664775, new AwS155S0110000_15(c939740aYu3, zLJFF, 3), true));
                                            frameLayout4.addView(composeView);
                                        }
                                    }
                                    c939740aYu3.LLLLIL = str7;
                                }
                                c939740aYu3.LJJIFFI(iconValueByName);
                                c939740aYu3.LJJIIZ(str6);
                                long j3 = c939950aZF.LIZIZ;
                                int i3 = c939950aZF.LJ;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                c939740aYu3.LJJIII(i3, iIntValue, j3, "onLiveSeiData");
                            }
                        }
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
