package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayerConfig;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutQosMonitor;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.MoltenFfiLinkMicSdk;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngineConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231651CWd {
    public static final LinkMicLayoutLayer LIZIZ(LinkMicLayoutLayerConfig linkMicLayoutLayerConfig) {
        ByteBuffer byteBufferAllocateDirect;
        InputStream c19924412xW;
        Long l;
        AbstractC1283580jVU abstractC1283580jVU = linkMicLayoutLayerConfig.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            C2225981CAi c2225981CAi = new C2225981CAi(Long.valueOf(((C1283590jVV) abstractC1283580jVU).LIZ));
            int iEncodedSize = C2225981CAi.ADAPTER.encodedSize(c2225981CAi);
            if (iEncodedSize > 0) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                c2225981CAi.encode(new C1283530jVP(byteBufferAllocateDirect));
            } else {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
            }
            ByteBuffer byteBufferMoltenFfiNativeCreateLinkMicLayoutLayerX407771019193859557 = MoltenFfiLinkMicSdk.MoltenFfiNativeCreateLinkMicLayoutLayerX407771019193859557(byteBufferAllocateDirect);
            if (byteBufferMoltenFfiNativeCreateLinkMicLayoutLayerX407771019193859557 == null) {
                c19924412xW = new ByteArrayInputStream(new byte[0]);
            } else {
                c19924412xW = new C19924412xW(byteBufferMoltenFfiNativeCreateLinkMicLayoutLayerX407771019193859557);
            }
            try {
                l = C2224191C3l.ADAPTER.decode(c19924412xW).ret;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                l = C2224191C3l.ADAPTER.decode(new byte[0]).ret;
            }
            if (byteBufferMoltenFfiNativeCreateLinkMicLayoutLayerX407771019193859557 != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeCreateLinkMicLayoutLayerX407771019193859557);
            }
            return new LinkMicLayoutLayer(new C1283590jVV(l.longValue()));
        }
        throw new C1954807lC();
    }

    public static final SymphonyEngine LIZJ(SymphonyEngineConfig symphonyEngineConfig) {
        ByteBuffer byteBufferAllocateDirect;
        InputStream c19924412xW;
        Long l;
        AbstractC1283580jVU abstractC1283580jVU = symphonyEngineConfig.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            C2225951CAf c2225951CAf = new C2225951CAf(Long.valueOf(((C1283590jVV) abstractC1283580jVU).LIZ));
            int iEncodedSize = C2225951CAf.ADAPTER.encodedSize(c2225951CAf);
            if (iEncodedSize > 0) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                c2225951CAf.encode(new C1283530jVP(byteBufferAllocateDirect));
            } else {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
            }
            ByteBuffer byteBufferMoltenFfiNativeCreateSymphonyEngineX2956287590445860956 = MoltenFfiLinkMicSdk.MoltenFfiNativeCreateSymphonyEngineX2956287590445860956(byteBufferAllocateDirect);
            if (byteBufferMoltenFfiNativeCreateSymphonyEngineX2956287590445860956 == null) {
                c19924412xW = new ByteArrayInputStream(new byte[0]);
            } else {
                c19924412xW = new C19924412xW(byteBufferMoltenFfiNativeCreateSymphonyEngineX2956287590445860956);
            }
            try {
                l = C2224221C3o.ADAPTER.decode(c19924412xW).ret;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                l = C2224221C3o.ADAPTER.decode(new byte[0]).ret;
            }
            if (byteBufferMoltenFfiNativeCreateSymphonyEngineX2956287590445860956 != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeCreateSymphonyEngineX2956287590445860956);
            }
            return new SymphonyEngine(new C1283590jVV(l.longValue()));
        }
        throw new C1954807lC();
    }

    public static final LinkMicLayoutQosMonitor LJ(LinkMicLayoutLayer linkMicLayoutLayer) {
        ByteBuffer byteBufferAllocateDirect;
        InputStream c19924412xW;
        Long l;
        AbstractC1283580jVU abstractC1283580jVU = linkMicLayoutLayer.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            C2226591CCr c2226591CCr = new C2226591CCr(Long.valueOf(((C1283590jVV) abstractC1283580jVU).LIZ));
            int iEncodedSize = C2226591CCr.ADAPTER.encodedSize(c2226591CCr);
            if (iEncodedSize > 0) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                c2226591CCr.encode(new C1283530jVP(byteBufferAllocateDirect));
            } else {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
            }
            ByteBuffer byteBufferMoltenFfiNativeGetLinkMicLayoutQosMonitorX2948245261822755766 = MoltenFfiLinkMicSdk.MoltenFfiNativeGetLinkMicLayoutQosMonitorX2948245261822755766(byteBufferAllocateDirect);
            if (byteBufferMoltenFfiNativeGetLinkMicLayoutQosMonitorX2948245261822755766 == null) {
                c19924412xW = new ByteArrayInputStream(new byte[0]);
            } else {
                c19924412xW = new C19924412xW(byteBufferMoltenFfiNativeGetLinkMicLayoutQosMonitorX2948245261822755766);
            }
            try {
                l = C2224161C3i.ADAPTER.decode(c19924412xW).ret;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                l = C2224161C3i.ADAPTER.decode(new byte[0]).ret;
            }
            if (byteBufferMoltenFfiNativeGetLinkMicLayoutQosMonitorX2948245261822755766 != null) {
                MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeGetLinkMicLayoutQosMonitorX2948245261822755766);
            }
            return new LinkMicLayoutQosMonitor(new C1283590jVV(l.longValue()));
        }
        throw new C1954807lC();
    }

    public static final C1CIG LJFF(C967790bI9 c967790bI9) {
        return new C1CIG(-415890745726251400L, Long.valueOf(C972890bQN.LIZ.LIZ(new C2231111CUb(c967790bI9))));
    }

    public static final C1CIG LJI(C2181561AZm c2181561AZm) {
        return new C1CIG(-4498150518300827973L, Long.valueOf(C972890bQN.LIZ.LIZ(new C2182671AbZ(c2181561AZm))));
    }

    public static final C1CIG LJII(InterfaceC972880bQM interfaceC972880bQM) {
        return new C1CIG(-6271392629928226551L, Long.valueOf(C972890bQN.LIZ.LIZ(new C2182581AbQ(interfaceC972880bQM))));
    }

    public static final C1CIG LJIIIIZZ(InterfaceC2181451AZb interfaceC2181451AZb) {
        return new C1CIG(2681496822077692678L, Long.valueOf(C972890bQN.LIZ.LIZ(new C2183081AcE(interfaceC2181451AZb))));
    }

    public static final C1CIG LJIIIZ(InterfaceC968200bIo interfaceC968200bIo) {
        return new C1CIG(367333646020188787L, Long.valueOf(C972890bQN.LIZ.LIZ(new C1CMJ(interfaceC968200bIo))));
    }

    public static final C1CIG LJIIJ(C2181391AYv c2181391AYv) {
        return new C1CIG(-6724712122437215380L, Long.valueOf(C972890bQN.LIZ.LIZ(new C2182551AbN(c2181391AYv))));
    }

    public static final C2181531AZj LJIIJJI(C2232721Ca6 c2232721Ca6) {
        C1AZ2 c1az2LJJIFFI;
        C1283230jUv c1283230jUvLJJIJLIJ;
        String str = c2232721Ca6.layout_id;
        String str2 = c2232721Ca6.layout_key;
        long jLongValue = c2232721Ca6.ver.longValue();
        Map<String, C2232531CZn> map = c2232721Ca6.windows;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            C2232531CZn c2232531CZn = (C2232531CZn) entry.getValue();
            String str3 = c2232531CZn.id;
            double dDoubleValue = c2232531CZn.left.doubleValue();
            double dDoubleValue2 = c2232531CZn.top.doubleValue();
            double dDoubleValue3 = c2232531CZn.right.doubleValue();
            double dDoubleValue4 = c2232531CZn.bottom.doubleValue();
            long jLongValue2 = c2232531CZn.z_order.longValue();
            double dDoubleValue5 = c2232531CZn.radius.doubleValue();
            String str4 = c2232531CZn.business_id;
            String str5 = c2232531CZn.config_id;
            C1CW4 c1cw4 = c2232531CZn.ui_pos;
            if (c1cw4 != null) {
                c1283230jUvLJJIJLIJ = LJJIJLIJ(c1cw4);
            } else {
                c1283230jUvLJJIJLIJ = null;
            }
            C2233181Caq c2233181Caq = c2232531CZn.spot_extra;
            linkedHashMap.put(key, new C2181761Aa6(str3, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, jLongValue2, dDoubleValue5, str4, str5, c1283230jUvLJJIJLIJ, new C2182121Aag(c2233181Caq.multi_guest_spot_extra, c2233181Caq.cohost_spot_extra, c2233181Caq.multi_guest_spot_non_sei_extra, c2233181Caq.cohost_spot_non_sei_extra), c2232531CZn.content_link_mic_id, c2232531CZn.spot_id.longValue()));
        }
        double dDoubleValue6 = c2232721Ca6.ratio.doubleValue();
        C2232731Ca7 c2232731Ca7 = c2232721Ca6.link_layout_container;
        C2182211Aap c2182211Aap = new C2182211Aap(c2232731Ca7.mode, c2232731Ca7.has_split_line.booleanValue());
        List<Long> list = c2232721Ca6.consumer_list;
        C2182111Aaf c2182111AafLJJI = LJJI(c2232721Ca6.layout_extra);
        C2232771CaB c2232771CaB = c2232721Ca6.custom_insets;
        if (c2232771CaB != null) {
            c1az2LJJIFFI = LJJIFFI(c2232771CaB);
        } else {
            c1az2LJJIFFI = null;
        }
        return new C2181531AZj(str, str2, jLongValue, linkedHashMap, dDoubleValue6, c2182211Aap, list, c2182111AafLJJI, c1az2LJJIFFI);
    }

    public static final C1CWQ LJIIL(C1CWO c1cwo) {
        int i = C2231771CWp.LIZLLL[c1cwo.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C1CWQ.LinkedState;
                }
                throw new C1954807lC();
            }
            return C1CWQ.PreparingState;
        }
        return C1CWQ.InitState;
    }

    public static final C1AZU LJIILIIL(EnumC2183371Ach enumC2183371Ach) {
        int i = C2231771CWp.LJIJ[enumC2183371Ach.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C1AZU.Cross;
                }
                throw new C1954807lC();
            }
            return C1AZU.Inner;
        }
        return C1AZU.Unknown;
    }

    public static final C968980bK4 LJIILJJIL(C1CB9 c1cb9) {
        C1CX9 c1cx9;
        long jLongValue = c1cb9.position.longValue();
        String str = c1cb9.content_id;
        switch (C2231771CWp.LJI[c1cb9.content_type.ordinal()]) {
            case 1:
                c1cx9 = C1CX9.Undefined;
                break;
            case 2:
                c1cx9 = C1CX9.Stream;
                break;
            case 3:
                c1cx9 = C1CX9.LiveStudioStreamPortrait;
                break;
            case 4:
                c1cx9 = C1CX9.LiveStudioStreamLandscape;
                break;
            case 5:
                c1cx9 = C1CX9.CohostQuickInviteSlot;
                break;
            case 6:
                c1cx9 = C1CX9.JustDance;
                break;
            default:
                throw new C1954807lC();
        }
        return new C968980bK4(jLongValue, str, c1cx9);
    }

    public static final C967910bIL LJIILL(C2231581CVw c2231581CVw) {
        EnumC2231621CWa enumC2231621CWa;
        long jLongValue = c2231581CVw.channel_id.longValue();
        long jLongValue2 = c2231581CVw.group_channel_id.longValue();
        long jLongValue3 = c2231581CVw.rtc_room_id.longValue();
        String str = c2231581CVw.self_link_mic_id;
        List<Long> list = c2231581CVw.link_state;
        EnumC2231871CWz enumC2231871CWzLJJJJ = LJJJJ(c2231581CVw.finish_link_mic_reason);
        int i = C2231771CWp.LJIJI[c2231581CVw.linker_mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        enumC2231621CWa = EnumC2231621CWa.Mixed;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC2231621CWa = EnumC2231621CWa.Cross;
                }
            } else {
                enumC2231621CWa = EnumC2231621CWa.Inner;
            }
        } else {
            enumC2231621CWa = EnumC2231621CWa.Unknown;
        }
        return new C967910bIL(jLongValue, jLongValue2, jLongValue3, str, list, enumC2231871CWzLJJJJ, enumC2231621CWa);
    }

    public static final C968640bJW LJIILLIIL(C2231691CWh c2231691CWh) {
        long jLongValue = c2231691CWh.msg_id.longValue();
        int i = C2231771CWp.LJIILL[c2231691CWh.im_type.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            throw new C1954807lC();
        }
        C2227321CFm c2227321CFm = c2231691CWh.invite_group_model;
        if (c2227321CFm != null) {
            c2227321CFm.group_channel_id.longValue();
            LJJIIZI(c2227321CFm.joiner);
        }
        C2232921CaQ c2232921CaQ = c2231691CWh.reply_group_model;
        if (c2232921CaQ != null) {
            LJIJJLI(c2232921CaQ);
        }
        C2227291CFj c2227291CFj = c2231691CWh.apply_group_model;
        if (c2227291CFj != null) {
            c2227291CFj.group_channel_id.longValue();
            LJJIIZI(c2227291CFj.joiner);
        }
        C2232931CaR c2232931CaR = c2231691CWh.permit_group_model;
        if (c2232931CaR != null) {
            LJIJJ(c2232931CaR);
        }
        c2231691CWh.receive_timestamp.doubleValue();
        return new C968640bJW(jLongValue);
    }

    public static final C966980bGq LJIIZILJ(C1CMV c1cmv) {
        return new C966980bGq(c1cmv.err_code.longValue(), c1cmv.err_msg, c1cmv.prompts, c1cmv.alert, c1cmv.extra);
    }

    public static final EnumC2231911CXd LJIJ(EnumC2231901CXc enumC2231901CXc) {
        int i = C2231771CWp.LJIILLIIL[enumC2231901CXc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC2231911CXd.Rts;
                }
                throw new C1954807lC();
            }
            return EnumC2231911CXd.Recharge;
        }
        return EnumC2231911CXd.Im;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C2231741CWm LJIJI(C2231661CWe c2231661CWe) {
        EnumC2231761CWo enumC2231761CWo;
        C1CXE c1cxe;
        byte[] byteArray;
        C1CZC c1czc;
        C1CZF c1czf;
        C1CZB c1czb;
        C1CZ6 c1cz6;
        C1CZ9 c1cz9;
        C1CZA c1cza;
        C967670bHx c967670bHx;
        C1CZ4 c1cz4;
        C1CZ3 c1cz3;
        C1CZ5 c1cz5;
        C1CZG c1czg;
        C1CZH c1czh;
        C1CZE c1cze;
        Object obj;
        C966220bFc c966220bFcLJIJJLI;
        C1CZ7 c1cz7;
        Object obj2;
        C968090bId c968090bIdLJIJJ;
        C964420bCi c964420bCi;
        C1CZD c1czd;
        C1CZ8 c1cz8;
        C07W8 c07w8;
        long jLongValue = c2231661CWe.msg_id.longValue();
        switch (C2231771CWp.LJIILIIL[c2231661CWe.im_type.ordinal()]) {
            case 1:
                enumC2231761CWo = EnumC2231761CWo.Unknown;
                break;
            case 2:
                enumC2231761CWo = EnumC2231761CWo.CreateChannel;
                break;
            case 3:
                enumC2231761CWo = EnumC2231761CWo.FinishChannel;
                break;
            case 4:
                enumC2231761CWo = EnumC2231761CWo.Invite;
                break;
            case 5:
                enumC2231761CWo = EnumC2231761CWo.CancelInvite;
                break;
            case 6:
                enumC2231761CWo = EnumC2231761CWo.Reply;
                break;
            case 7:
                enumC2231761CWo = EnumC2231761CWo.Apply;
                break;
            case 8:
                enumC2231761CWo = EnumC2231761CWo.CancelApply;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                enumC2231761CWo = EnumC2231761CWo.Permit;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                enumC2231761CWo = EnumC2231761CWo.Leave;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                enumC2231761CWo = EnumC2231761CWo.Kickout;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                enumC2231761CWo = EnumC2231761CWo.ListChange;
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                enumC2231761CWo = EnumC2231761CWo.JoinDirect;
                break;
            case 14:
                enumC2231761CWo = EnumC2231761CWo.LinkState;
                break;
            case 15:
                enumC2231761CWo = EnumC2231761CWo.InviteGroup;
                break;
            case 16:
                enumC2231761CWo = EnumC2231761CWo.CancelInviteGroup;
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                enumC2231761CWo = EnumC2231761CWo.ReplyGroup;
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                enumC2231761CWo = EnumC2231761CWo.ApplyGroup;
                break;
            case 19:
                enumC2231761CWo = EnumC2231761CWo.CancelApplyGroup;
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                enumC2231761CWo = EnumC2231761CWo.PermitGroup;
                break;
            case 21:
                enumC2231761CWo = EnumC2231761CWo.LeaveGroup;
                break;
            case 22:
                enumC2231761CWo = EnumC2231761CWo.GroupListChange;
                break;
            case 23:
                enumC2231761CWo = EnumC2231761CWo.PToPGroupListChange;
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                enumC2231761CWo = EnumC2231761CWo.JoinGroupDirect;
                break;
            case 25:
                enumC2231761CWo = EnumC2231761CWo.JoinRoomDirect;
                break;
            default:
                throw new C1954807lC();
        }
        int i = C2231771CWp.LJIILJJIL[c2231661CWe.sub_type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            c1cxe = C1CXE.ModeratorPermit;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c1cxe = C1CXE.ModeratorReply;
                    }
                } else {
                    c1cxe = C1CXE.ModeratorCancelInvite;
                }
            } else {
                c1cxe = C1CXE.ModeratorInvite;
            }
        } else {
            c1cxe = C1CXE.None;
        }
        EnumC2231911CXd enumC2231911CXdLJIJ = LJIJ(c2231661CWe.mode);
        ByteString byteString = c2231661CWe.business_content;
        if (byteString != null) {
            byteArray = byteString.toByteArray();
        } else {
            byteArray = null;
        }
        double dDoubleValue = c2231661CWe.receive_timestamp.doubleValue();
        C2228211CIx c2228211CIx = c2231661CWe.finish_channel_model;
        if (c2228211CIx != null) {
            c2228211CIx.interrupted_by_co_host.booleanValue();
            LJIILIIL(c2228211CIx.arch_type);
            c1czc = new Object() { // from class: X.1CZC
            };
        } else {
            c1czc = 0;
        }
        C2233011CaZ c2233011CaZ = c2231661CWe.invite_model;
        if (c2233011CaZ != null) {
            LJJIIZI(c2233011CaZ.invitor);
            LJJIIZI(c2233011CaZ.invitee);
            LJJIIZI(c2233011CaZ.operator_p);
            c2233011CaZ.scene_version.longValue();
            c1czf = new Object() { // from class: X.1CZF
            };
        } else {
            c1czf = 0;
        }
        C2233041Cac c2233041Cac = c2231661CWe.cancel_invite_model;
        if (c2233041Cac != null) {
            LJJIIZI(c2233041Cac.invitor);
            LJJIIZI(c2233041Cac.invitee);
            c1czb = new Object() { // from class: X.1CZB
            };
        } else {
            c1czb = 0;
        }
        C2232891CaN c2232891CaN = c2231661CWe.reply_model;
        if (c2232891CaN != null) {
            LJJIIZI(c2232891CaN.invitee);
            LJJIIZI(c2232891CaN.invite_operator);
            c2232891CaN.is_agree.booleanValue();
            c1cz6 = new Object() { // from class: X.1CZ6
            };
        } else {
            c1cz6 = 0;
        }
        C1CFY c1cfy = c2231661CWe.apply_model;
        if (c1cfy != null) {
            LJJIIZI(c1cfy.applier);
            c1cz9 = new Object() { // from class: X.1CZ9
            };
        } else {
            c1cz9 = 0;
        }
        C2227201CFa c2227201CFa = c2231661CWe.cancel_apply_model;
        if (c2227201CFa != null) {
            LJJIIZI(c2227201CFa.applier);
            c1cza = new Object() { // from class: X.1CZA
            };
        } else {
            c1cza = 0;
        }
        C2232981CaW c2232981CaW = c2231661CWe.permit_model;
        if (c2232981CaW != null) {
            C967180bHA c967180bHALJJIIZI = LJJIIZI(c2232981CaW.applier);
            C967180bHA c967180bHALJJIIZI2 = LJJIIZI(c2232981CaW.permiter);
            LJJIIZI(c2232981CaW.operator_p);
            boolean zBooleanValue = c2232981CaW.is_agree.booleanValue();
            long jLongValue2 = c2232981CaW.scene_version.longValue();
            String str = c2232981CaW.layout_id;
            c2232981CaW.is_moderator_handle.booleanValue();
            c967670bHx = new C967670bHx(c967180bHALJJIIZI, c967180bHALJJIIZI2, zBooleanValue, jLongValue2, str);
        } else {
            c967670bHx = null;
        }
        C1CKY c1cky = c2231661CWe.leave_model;
        if (c1cky != null) {
            LJJIIZI(c1cky.leave_user);
            c1cky.is_self_video_mute.booleanValue();
            c1cky.is_self_audio_mute.booleanValue();
            switch (C2231771CWp.LJFF[c1cky.leave_reason.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 14:
                case 15:
                case 16:
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                case 19:
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                case 21:
                case 22:
                case 23:
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                case 35:
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    c1cz4 = new Object() { // from class: X.1CZ4
                    };
                    break;
                default:
                    throw new C1954807lC();
            }
        } else {
            c1cz4 = 0;
        }
        C1CPN c1cpn = c2231661CWe.kickout_model;
        if (c1cpn != null) {
            LJJIIZI(c1cpn.offline_user);
            switch (C2231771CWp.LJII[c1cpn.kickout_reason.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                    c1cz3 = new Object() { // from class: X.1CZ3
                    };
                    break;
                default:
                    throw new C1954807lC();
            }
        } else {
            c1cz3 = 0;
        }
        C1CJO c1cjo = c2231661CWe.list_change_model;
        if (c1cjo != null) {
            c1cjo.list_change_type.longValue();
            c1cz5 = new Object() { // from class: X.1CZ5
            };
        } else {
            c1cz5 = 0;
        }
        C2227241CFe c2227241CFe = c2231661CWe.join_direct_model;
        if (c2227241CFe != null) {
            LJJIIZI(c2227241CFe.joiner);
            c1czg = new Object() { // from class: X.1CZG
            };
        } else {
            c1czg = 0;
        }
        C2227261CFg c2227261CFg = c2231661CWe.join_room_direct_model;
        if (c2227261CFg != null) {
            LJJIIZI(c2227261CFg.joiner);
            c1czh = new Object() { // from class: X.1CZH
            };
        } else {
            c1czh = 0;
        }
        C2227321CFm c2227321CFm = c2231661CWe.invite_group_model;
        if (c2227321CFm != null) {
            c2227321CFm.group_channel_id.longValue();
            LJJIIZI(c2227321CFm.joiner);
            c1cze = new Object() { // from class: X.1CZE
            };
        } else {
            c1cze = 0;
        }
        C1CHQ c1chq = c2231661CWe.cancel_invite_group_model;
        if (c1chq != null) {
            List<C2232021CXo> list = c1chq.leavers;
            final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C2232021CXo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(LJJIIZI(it2.next()));
            }
            LJJIIZI(c1chq.operator_user);
            c1chq.group_channel_id.longValue();
            obj = new Object(arrayList) { // from class: X.1CZ2
                public final List<C967180bHA> LIZ;

                {
                    this.LIZ = arrayList;
                }
            };
        } else {
            obj = null;
        }
        C2232921CaQ c2232921CaQ = c2231661CWe.reply_group_model;
        if (c2232921CaQ != null) {
            c966220bFcLJIJJLI = LJIJJLI(c2232921CaQ);
        } else {
            c966220bFcLJIJJLI = null;
        }
        C2227291CFj c2227291CFj = c2231661CWe.apply_group_model;
        if (c2227291CFj != null) {
            c2227291CFj.group_channel_id.longValue();
            LJJIIZI(c2227291CFj.joiner);
            c1cz7 = new Object() { // from class: X.1CZ7
            };
        } else {
            c1cz7 = 0;
        }
        C1CHN c1chn = c2231661CWe.cancel_apply_group_model;
        if (c1chn != null) {
            List<C2232021CXo> list2 = c1chn.leavers;
            final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C2232021CXo> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(LJJIIZI(it3.next()));
            }
            LJJIIZI(c1chn.operator_user);
            c1chn.group_channel_id.longValue();
            obj2 = new Object(arrayList2) { // from class: X.1CZ1
                public final List<C967180bHA> LIZ;

                {
                    this.LIZ = arrayList2;
                }
            };
        } else {
            obj2 = null;
        }
        C2232931CaR c2232931CaR = c2231661CWe.permit_group_model;
        if (c2232931CaR != null) {
            c968090bIdLJIJJ = LJIJJ(c2232931CaR);
        } else {
            c968090bIdLJIJJ = null;
        }
        C2229461CNs c2229461CNs = c2231661CWe.self_should_leave_group_model;
        if (c2229461CNs != null) {
            c964420bCi = new C964420bCi(LJJIIZI(c2229461CNs.operator_user), c2229461CNs.group_channel_id.longValue(), c2229461CNs.leave_source);
        } else {
            c964420bCi = null;
        }
        if (c2231661CWe.group_list_change_model != null) {
            c1czd = new Object() { // from class: X.1CZD
            };
        } else {
            c1czd = 0;
        }
        if (c2231661CWe.p2p_group_list_change_model != null) {
            c1cz8 = new Object() { // from class: X.1CZ8
            };
        } else {
            c1cz8 = 0;
        }
        C1CFU c1cfu = c2231661CWe.join_group_direct_model;
        if (c1cfu != null) {
            c07w8 = new C07W8(c1cfu.group_channel_id.longValue());
        } else {
            c07w8 = null;
        }
        return new C2231741CWm(jLongValue, enumC2231761CWo, c1cxe, enumC2231911CXdLJIJ, byteArray, dDoubleValue, c1czc, c1czf, c1czb, c1cz6, c1cz9, c1cza, c967670bHx, c1cz4, c1cz3, c1cz5, c1czg, c1czh, c1cze, obj, c966220bFcLJIJJLI, c1cz7, obj2, c968090bIdLJIJJ, c964420bCi, c1czd, c1cz8, c07w8);
    }

    public static final C968090bId LJIJJ(C2232931CaR c2232931CaR) {
        C967180bHA c967180bHALJJIIZI = LJJIIZI(c2232931CaR.approver);
        boolean zBooleanValue = c2232931CaR.is_agree.booleanValue();
        c2232931CaR.group_channel_id.longValue();
        return new C968090bId(c967180bHALJJIIZI, zBooleanValue, LJIJ(c2232931CaR.msg_mode));
    }

    public static final C966220bFc LJIJJLI(C2232921CaQ c2232921CaQ) {
        return new C966220bFc(LJJIIZI(c2232921CaQ.approver), c2232921CaQ.is_agree.booleanValue(), c2232921CaQ.group_channel_id.longValue(), c2232921CaQ.self_group_linkmic_id, c2232921CaQ.target_group_linkmic_id, LJIJ(c2232921CaQ.msg_mode));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1CUf] */
    public static final C2231151CUf LJIL(C1CUI c1cui) {
        int i = C2231771CWp.LJIJJLI[c1cui.anchor_new_layout.ordinal()];
        if (i != 1 && i != 2) {
            throw new C1954807lC();
        }
        int i2 = C2231771CWp.LJIL[c1cui.anchor_new_fix_mic_num.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
            throw new C1954807lC();
        }
        return new Object() { // from class: X.1CUf
        };
    }

    public static final C2182221Aaq LJJ(C2230471CRp c2230471CRp) {
        EnumC2231791CWr enumC2231791CWr;
        switch (C2231771CWp.LJJIL[c2230471CRp.code.ordinal()]) {
            case 1:
                enumC2231791CWr = EnumC2231791CWr.NoError;
                break;
            case 2:
                enumC2231791CWr = EnumC2231791CWr.ImApiLayoutStateInvalid;
                break;
            case 3:
                enumC2231791CWr = EnumC2231791CWr.ImApiSpotListIsEmpty;
                break;
            case 4:
                enumC2231791CWr = EnumC2231791CWr.ImApiLayoutKeyIsEmpty;
                break;
            case 5:
                enumC2231791CWr = EnumC2231791CWr.SameLayoutInfo;
                break;
            case 6:
                enumC2231791CWr = EnumC2231791CWr.NotStartFullScreen;
                break;
            case 7:
                enumC2231791CWr = EnumC2231791CWr.QueryLayoutModelErrorDeserializeFailed;
                break;
            case 8:
                enumC2231791CWr = EnumC2231791CWr.QueryLayoutModelErrorOutOfLifeCycle;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                enumC2231791CWr = EnumC2231791CWr.QueryLayoutModelErrorFileNotFound;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                enumC2231791CWr = EnumC2231791CWr.QueryLayoutModelErrorIoFailed;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                enumC2231791CWr = EnumC2231791CWr.LinkLayoutLayoutKeyBlock;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                enumC2231791CWr = EnumC2231791CWr.LinkLayoutKeyNotMatch;
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                enumC2231791CWr = EnumC2231791CWr.LinkLayoutPipelineCreateFailed;
                break;
            case 14:
                enumC2231791CWr = EnumC2231791CWr.LinkLayoutBizContainerParamsInvalid;
                break;
            case 15:
                enumC2231791CWr = EnumC2231791CWr.LinkLayoutEmptyLayoutContainerConfigs;
                break;
            case 16:
                enumC2231791CWr = EnumC2231791CWr.SeiLayoutKeyIsEmpty;
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                enumC2231791CWr = EnumC2231791CWr.LayoutModelParamsIsInvalid;
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                enumC2231791CWr = EnumC2231791CWr.LayoutModelIsNone;
                break;
            case 19:
                enumC2231791CWr = EnumC2231791CWr.LayoutModelParseFailed;
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                enumC2231791CWr = EnumC2231791CWr.ExtraGeckoResUpdatedFailure;
                break;
            case 21:
                enumC2231791CWr = EnumC2231791CWr.OnlyUpdateLayoutData;
                break;
            case 22:
                enumC2231791CWr = EnumC2231791CWr.LinkIsClose;
                break;
            case 23:
                enumC2231791CWr = EnumC2231791CWr.LinkIsNotConnected;
                break;
            default:
                throw new C1954807lC();
        }
        return new C2182221Aaq(enumC2231791CWr, c2230471CRp.msg);
    }

    public static final C2182111Aaf LJJI(C2233351Cb7 c2233351Cb7) {
        return new C2182111Aaf(c2233351Cb7.multi_guest_layout_extra, c2233351Cb7.cohost_layout_extra, c2233351Cb7.multi_guest_layout_non_sei_extra, c2233351Cb7.cohost_layout_non_sei_extra);
    }

    public static final C1AZ2 LJJIFFI(C2232771CaB c2232771CaB) {
        return new C1AZ2(c2232771CaB.left.doubleValue(), c2232771CaB.top.doubleValue(), c2232771CaB.right.doubleValue(), c2232771CaB.bottom.doubleValue());
    }

    public static final C2181251AYh LJJII(C2233221Cau c2233221Cau) {
        return new C2181251AYh(LJJJJJ(c2233221Cau.spot), c2233221Cau.content_link_mic_id, c2233221Cau.x.doubleValue(), c2233221Cau.y.doubleValue(), c2233221Cau.width.doubleValue(), c2233221Cau.height.doubleValue(), c2233221Cau.z_order_stream.longValue(), c2233221Cau.z_order_round_avatar.longValue(), c2233221Cau.z_order_gauss_bg.longValue(), c2233221Cau.radius.doubleValue());
    }

    public static final C1283980jW8 LJJIII(C2232561CZq c2232561CZq) {
        return new C1283980jW8(c2232561CZq.left.doubleValue(), c2232561CZq.top.doubleValue(), c2232561CZq.right.doubleValue(), c2232561CZq.bottom.doubleValue(), c2232561CZq.radius.doubleValue());
    }

    public static final C2182171Aal LJJIIJ(C1CSA c1csa) {
        C2182241Aas c2182241AasLJJIIZ;
        C2232591CZt c2232591CZt = c1csa.full_info;
        String str = c2232591CZt.layout_key;
        boolean zBooleanValue = c2232591CZt.has_split_line.booleanValue();
        C2182241Aas c2182241AasLJJIIZ2 = LJJIIZ(c2232591CZt.layout_container_view_info);
        List<C1CZJ> list = c2232591CZt.windows_info;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1CZJ> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJJIIJZLJL(it2.next()));
        }
        LJJIII(c2232591CZt.player_frame);
        C2181961AaQ c2181961AaQ = new C2181961AaQ(str, zBooleanValue, c2182241AasLJJIIZ2, arrayList, c2232591CZt.layout_id, LJJI(c2232591CZt.layout_extra));
        C2232601CZu c2232601CZu = c1csa.diff_info;
        String str2 = c2232601CZu.layout_key;
        C2228421CJs c2228421CJs = c2232601CZu.layout_container_view_info;
        C2182111Aaf c2182111AafLJJI = null;
        if (c2228421CJs != null) {
            c2182241AasLJJIIZ = LJJIIZ(c2228421CJs);
        } else {
            c2182241AasLJJIIZ = null;
        }
        List<C1CZJ> list2 = c2232601CZu.new_windows_info;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C1CZJ> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(LJJIIJZLJL(it3.next()));
        }
        List<C2232631CZx> list3 = c2232601CZu.updated_windows_info;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        for (C2232631CZx c2232631CZx : list3) {
            arrayList3.add(new C2182231Aar(LJJIIJZLJL(c2232631CZx.old_window_info), LJJIIJZLJL(c2232631CZx.new_window_info)));
        }
        List<C1CZJ> list4 = c2232601CZu.removed_windows_info;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        Iterator<C1CZJ> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(LJJIIJZLJL(it4.next()));
        }
        C2233351Cb7 c2233351Cb7 = c2232601CZu.layout_extra;
        if (c2233351Cb7 != null) {
            c2182111AafLJJI = LJJI(c2233351Cb7);
        }
        C2233351Cb7 c2233351Cb72 = c2232601CZu.old_layout_extra;
        if (c2233351Cb72 != null) {
            LJJI(c2233351Cb72);
        }
        return new C2182171Aal(c2181961AaQ, new C2181951AaP(str2, c2182241AasLJJIIZ, arrayList2, arrayList3, arrayList4, c2182111AafLJJI));
    }

    public static final C2181741Aa4 LJJIIJZLJL(C1CZJ c1czj) {
        C2182241Aas c2182241AasLJJIIZ;
        String str = c1czj.id;
        long jLongValue = c1czj.spot_id.longValue();
        String str2 = c1czj.content_link_mic_id;
        C2182241Aas c2182241AasLJJIIZ2 = LJJIIZ(c1czj.view_info);
        C2228421CJs c2228421CJs = c1czj.rtc_view_info;
        if (c2228421CJs != null) {
            c2182241AasLJJIIZ = LJJIIZ(c2228421CJs);
        } else {
            c2182241AasLJJIIZ = null;
        }
        C1CWQ c1cwqLJIIL = LJIIL(c1czj.win_state);
        C1CXJ c1cxjLJJIJL = LJJIJL(c1czj.online_state);
        c1czj.video_muted.booleanValue();
        c1czj.audio_muted.booleanValue();
        c1czj.audio_occupied.booleanValue();
        LJJIZ(c1czj.rtc_connection);
        LJJJIL(c1czj.network_state);
        long jLongValue2 = c1czj.z_order.longValue();
        C1283230jUv c1283230jUvLJJIJLIJ = LJJIJLIJ(c1czj.ui_pos);
        boolean zBooleanValue = c1czj.is_self.booleanValue();
        boolean zBooleanValue2 = c1czj.is_room_owner.booleanValue();
        C2233181Caq c2233181Caq = c1czj.extra;
        return new C2181741Aa4(str, jLongValue, str2, c2182241AasLJJIIZ2, c2182241AasLJJIIZ, c1cwqLJIIL, c1cxjLJJIJL, jLongValue2, c1283230jUvLJJIJLIJ, zBooleanValue, zBooleanValue2, new C2182121Aag(c2233181Caq.multi_guest_spot_extra, c2233181Caq.cohost_spot_extra, c2233181Caq.multi_guest_spot_non_sei_extra, c2233181Caq.cohost_spot_non_sei_extra));
    }

    public static final C2182241Aas LJJIIZ(C2228421CJs c2228421CJs) {
        return new C2182241Aas(c2228421CJs.id.longValue(), LJJIII(c2228421CJs.frame));
    }

    public static final C967180bHA LJJIIZI(C2232021CXo c2232021CXo) {
        C1CXI c1cxi;
        long jLongValue = c2232021CXo.room_id.longValue();
        long jLongValue2 = c2232021CXo.channel_id.longValue();
        long jLongValue3 = c2232021CXo.uid.longValue();
        String str = c2232021CXo.link_mic_id;
        long jLongValue4 = c2232021CXo.join_time.longValue();
        long jLongValue5 = c2232021CXo.linked_time.longValue();
        boolean zBooleanValue = c2232021CXo.audio_muted_by_channel.booleanValue();
        boolean zBooleanValue2 = c2232021CXo.audio_switch_on.booleanValue();
        boolean zBooleanValue3 = c2232021CXo.video_switch_on.booleanValue();
        boolean zBooleanValue4 = c2232021CXo.audio_occupied.booleanValue();
        C1CXJ c1cxjLJJIJL = LJJIJL(c2232021CXo.online_user_state);
        long jLongValue6 = c2232021CXo.avatar_id.longValue();
        long jLongValue7 = c2232021CXo.owner_uid.longValue();
        long jLongValue8 = c2232021CXo.owner_room_id.longValue();
        long jLongValue9 = c2232021CXo.owner_channel_id.longValue();
        C1CX5 c1cx5LJJJIL = LJJJIL(c2232021CXo.tx_quality);
        C1CXK c1cxkLJJIZ = LJJIZ(c2232021CXo.rtc_connection_state);
        String str2 = c2232021CXo.app_version;
        long jLongValue10 = c2232021CXo.group_channel_id.longValue();
        String str3 = c2232021CXo.group_link_mic_id;
        int i = C2231771CWp.LJIIJ[c2232021CXo.user_type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c1cxi = C1CXI.Host;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1cxi = C1CXI.Guest;
            }
        } else {
            c1cxi = C1CXI.Unknown;
        }
        return new C967180bHA(jLongValue, jLongValue2, jLongValue3, str, jLongValue4, jLongValue5, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, c1cxjLJJIJL, jLongValue6, jLongValue7, jLongValue8, jLongValue9, c1cx5LJJJIL, c1cxkLJJIZ, str2, jLongValue10, str3, c1cxi);
    }

    public static final C968490bJH LJJIJ(C2231461CVk c2231461CVk) {
        byte[] byteArray;
        c2231461CVk.msg_id.longValue();
        c2231461CVk.group_channel_id.longValue();
        c2231461CVk.receive_timestamp.doubleValue();
        ByteString byteString = c2231461CVk.cohost_resp_extra;
        if (byteString != null) {
            byteArray = byteString.toByteArray();
        } else {
            byteArray = null;
        }
        return new C968490bJH(byteArray);
    }

    public static final EnumC2231411CVf LJJIJIIJI(C1CV7 c1cv7) {
        switch (C2231771CWp.LJIIZILJ[c1cv7.ordinal()]) {
            case 1:
                return EnumC2231411CVf.Unknown;
            case 2:
                return EnumC2231411CVf.ListChangeIm;
            case 3:
                return EnumC2231411CVf.GroupListChangeIm;
            case 4:
                return EnumC2231411CVf.PToPGroupListChangeIm;
            case 5:
                return EnumC2231411CVf.UpdateGroupUserList;
            case 6:
                return EnumC2231411CVf.UserManagerNotify;
            case 7:
                return EnumC2231411CVf.MigrateGroupReq;
            case 8:
                return EnumC2231411CVf.RechargeReq;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2231411CVf.LocalChange;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC2231411CVf.SeiListChange;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC2231411CVf.InnerLinkMicAction;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC2231411CVf.CrossLinkMicAction;
            default:
                throw new C1954807lC();
        }
    }

    public static final EnumC2183041AcA LJJIJIIJIL(EnumC2183061AcC enumC2183061AcC) {
        int i = C2231771CWp.LJJIIZI[enumC2183061AcC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return EnumC2183041AcA.Error;
                        }
                        throw new C1954807lC();
                    }
                    return EnumC2183041AcA.Warn;
                }
                return EnumC2183041AcA.Debug;
            }
            return EnumC2183041AcA.Info;
        }
        return EnumC2183041AcA.Verbose;
    }

    public static final C1276950jKn LJJIJIL(C1CZR c1czr) {
        return new C1276950jKn(c1czr.cap_fps_min.longValue(), c1czr.cap_fps_max.longValue(), c1czr.cap_width.longValue(), c1czr.cap_height.longValue(), c1czr.effect_fps.longValue(), c1czr.effect_width.longValue(), c1czr.effect_height.longValue(), c1czr.codec_fps.longValue(), c1czr.codec_width.longValue(), c1czr.codec_height.longValue(), c1czr.business_id);
    }

    public static final C1CXJ LJJIJL(C1CWW c1cww) {
        int i = C2231771CWp.LJIIIIZZ[c1cww.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C1CXJ.Paused;
                }
                throw new C1954807lC();
            }
            return C1CXJ.Normal;
        }
        return C1CXJ.Undefined;
    }

    public static final C1283230jUv LJJIJLIJ(C1CW4 c1cw4) {
        EnumC1283210jUt enumC1283210jUt;
        int i = C2231771CWp.LIZJ[c1cw4.pos_type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        enumC1283210jUt = EnumC1283210jUt.LiveUserId;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC1283210jUt = EnumC1283210jUt.RtcStreamId;
                }
            } else {
                enumC1283210jUt = EnumC1283210jUt.RtcUserId;
            }
        } else {
            enumC1283210jUt = EnumC1283210jUt.EmptySlot;
        }
        return new C1283230jUv(enumC1283210jUt, c1cw4.value);
    }

    public static final C2183211AcR LJJIL(C2229081CMg c2229081CMg) {
        EnumC2229271CMz enumC2229271CMz;
        String str = c2229081CMg.url;
        int i = C2231771CWp.LJJIIZ[c2229081CMg.method.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC2229271CMz = EnumC2229271CMz.Post;
            } else {
                throw new C1954807lC();
            }
        } else {
            enumC2229271CMz = EnumC2229271CMz.Get;
        }
        return new C2183211AcR(str, enumC2229271CMz, c2229081CMg.invoke_id, c2229081CMg.body.toByteArray());
    }

    public static final C1CXK LJJIZ(C1CWY c1cwy) {
        int i = C2231771CWp.LJIIIZ[c1cwy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C1CXK.Disconnect;
                }
                throw new C1954807lC();
            }
            return C1CXK.Normal;
        }
        return C1CXK.Undefined;
    }

    public static final C1276970jKp LJJJ(C2229011CLz c2229011CLz) {
        EnumC1286760jac enumC1286760jac;
        String str = c2229011CLz.app_channel_type;
        String str2 = c2229011CLz.project_key;
        boolean zBooleanValue = c2229011CLz.force_global_api_server.booleanValue();
        String str3 = c2229011CLz.str_uid;
        String str4 = c2229011CLz.rtc_ext_info;
        C1277240jLG c1277240jLGLJJJI = LJJJI(c2229011CLz.mix_stream_config);
        C1276950jKn c1276950jKnLJJIJIL = LJJIJIL(c2229011CLz.media_param);
        int i = C2231771CWp.LJJIJIIJIL[c2229011CLz.render_view_mode.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC1286760jac = EnumC1286760jac.RenderModeSingle;
            } else {
                throw new C1954807lC();
            }
        } else {
            enumC1286760jac = EnumC1286760jac.RenderModeDefault;
        }
        return new C1276970jKp(str, str2, zBooleanValue, str3, str4, c1277240jLGLJJJI, c1276950jKnLJJIJIL, enumC1286760jac, c2229011CLz.enable_subscript_optimization.booleanValue(), c2229011CLz.link_mic_layout_config);
    }

    public static final C1277240jLG LJJJI(C2229171CMp c2229171CMp) {
        C1CN2 c1cn2;
        C1277010jKt c1277010jKt;
        boolean zBooleanValue = c2229171CMp.should_sync_independent_config.booleanValue();
        String str = c2229171CMp.server_mix_task_id;
        C1CN5 c1cn5 = c2229171CMp.mix_video_stream_config;
        String str2 = c1cn5.codec;
        long jLongValue = c1cn5.b_frame.longValue();
        long jLongValue2 = c1cn5.profile.longValue();
        long jLongValue3 = c1cn5.fps.longValue();
        long jLongValue4 = c1cn5.gop.longValue();
        C1CN8 c1cn8 = c1cn5.layout_info;
        C1282040jT0 c1282040jT0 = new C1282040jT0(str2, jLongValue, jLongValue2, jLongValue3, jLongValue4, new C1282090jT5(c1cn8.width.longValue(), c1cn8.height.longValue(), c1cn8.bitrate.longValue()));
        C2229201CMs c2229201CMs = c2229171CMp.mix_audio_stream_config;
        int i = C2231771CWp.LJJIJ[c2229201CMs.codec.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c1cn2 = C1CN2.Lc;
            } else {
                throw new C1954807lC();
            }
        } else {
            c1cn2 = C1CN2.He;
        }
        C1282080jT4 c1282080jT4 = new C1282080jT4(c1cn2, c2229201CMs.stream_audio_channels.longValue(), c2229201CMs.stream_audio_sample_rate.longValue(), c2229201CMs.stream_audio_bitrate.longValue(), c2229201CMs.stream_audio_aac_profile);
        C1CJK c1cjk = c2229171CMp.resolution_info;
        if (c1cjk != null) {
            c1277010jKt = new C1277010jKt(c1cjk.ratio.doubleValue(), c1cjk.width.longValue(), c1cjk.height.longValue());
        } else {
            c1277010jKt = null;
        }
        return new C1277240jLG(zBooleanValue, str, c1282040jT0, c1282080jT4, c1277010jKt);
    }

    public static final C1CX5 LJJJIL(C1CXN c1cxn) {
        switch (C2231771CWp.LJIIJJI[c1cxn.ordinal()]) {
            case 1:
                return C1CX5.Undefined;
            case 2:
                return C1CX5.Excellent;
            case 3:
                return C1CX5.Good;
            case 4:
                return C1CX5.Poor;
            case 5:
                return C1CX5.Bad;
            case 6:
                return C1CX5.Vbad;
            case 7:
                return C1CX5.Down;
            default:
                throw new C1954807lC();
        }
    }

    public static final EnumC2231871CWz LJJJJ(C1CW2 c1cw2) {
        switch (C2231771CWp.LJIJJ[c1cw2.ordinal()]) {
            case 1:
                return EnumC2231871CWz.Unknown;
            case 2:
                return EnumC2231871CWz.LeaveSelf;
            case 3:
                return EnumC2231871CWz.LeaveMsg;
            case 4:
                return EnumC2231871CWz.RoomClose;
            case 5:
                return EnumC2231871CWz.RtcError;
            case 6:
                return EnumC2231871CWz.LeaveOnlyOne;
            case 7:
                return EnumC2231871CWz.FirstFrameTimeOut;
            case 8:
                return EnumC2231871CWz.LinkedListWithoutMe;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2231871CWz.RtcLost;
            default:
                throw new C1954807lC();
        }
    }

    public static final C1AZI LJJJJI(C2235601Cek c2235601Cek) {
        String str = c2235601Cek.app_data_json_string;
        String str2 = c2235601Cek.regions_json_string;
        c2235601Cek.canvas_width.longValue();
        c2235601Cek.canvas_height.longValue();
        c2235601Cek.app_data_sei_mode.longValue();
        return new C1AZI(str, str2);
    }

    public static final C969260bKW LJJJJIZL(C2228361CJm c2228361CJm) {
        String str = c2228361CJm.key;
        int i = C2231771CWp.LJIIL[c2228361CJm.k_type.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            throw new C1954807lC();
        }
        return new C969260bKW(str);
    }

    public static final C2181811AaB LJJJJJ(C2233171Cap c2233171Cap) {
        C1283230jUv c1283230jUvLJJIJLIJ;
        long jLongValue = c2233171Cap.spot_id.longValue();
        C1CW4 c1cw4 = c2233171Cap.pos_identity;
        C1170604i0 c1170604i0 = null;
        if (c1cw4 != null) {
            c1283230jUvLJJIJLIJ = LJJIJLIJ(c1cw4);
        } else {
            c1283230jUvLJJIJLIJ = null;
        }
        C1CO9 c1co9 = c2233171Cap.pos_identity_extra;
        if (c1co9 != null) {
            c1170604i0 = new C1170604i0(c1co9.content_link_mic_id);
        }
        return new C2181811AaB(jLongValue, c1283230jUvLJJIJLIJ, c1170604i0, c2233171Cap.multi_guest_spot_extra, c2233171Cap.cohost_spot_extra, c2233171Cap.multi_guest_spot_non_sei_extra, c2233171Cap.cohost_spot_non_sei_extra);
    }

    public static final C967830bID LJJJJJL(C1CW6 c1cw6) {
        C968630bJV c968630bJV;
        long jLongValue = c1cw6.channel_id.longValue();
        long jLongValue2 = c1cw6.state_version.longValue();
        String str = c1cw6.layout_id;
        List<C1CW4> list = c1cw6.ui_pos;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1CW4> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJJIJLIJ(it2.next()));
        }
        List<C1CZI> list2 = c1cw6.user_states;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C1CZI c1czi : list2) {
            long jLongValue3 = c1czi.user_room_id.longValue();
            long jLongValue4 = c1czi.user_id.longValue();
            String str2 = c1czi.linkmic_id;
            long jLongValue5 = c1czi.position_type.longValue();
            long jLongValue6 = c1czi.position_link_position.longValue();
            long jLongValue7 = c1czi.position_link_opt.longValue();
            long jLongValue8 = c1czi.linked_time_nano.longValue();
            C1CXJ c1cxjLJJIJL = LJJIJL(c1czi.online_user_state);
            long jLongValue9 = c1czi.audio_muted.longValue();
            long jLongValue10 = c1czi.video_muted.longValue();
            C1CXK c1cxkLJJIZ = LJJIZ(c1czi.rtc_connection);
            C1CX5 c1cx5LJJJIL = LJJJIL(c1czi.network_state);
            C1CJR c1cjr = c1czi.avatar;
            if (c1cjr != null) {
                c968630bJV = new C968630bJV(c1cjr.avatar_id.longValue());
            } else {
                c968630bJV = null;
            }
            arrayList2.add(new C967810bIB(jLongValue3, jLongValue4, str2, jLongValue5, jLongValue6, jLongValue7, jLongValue8, c1cxjLJJIJL, jLongValue9, jLongValue10, c1cxkLJJIZ, c1cx5LJJJIL, c968630bJV));
        }
        return new C967830bID(jLongValue, jLongValue2, str, arrayList, arrayList2, c1cw6.share_bg_sticker_id, c1cw6.background_url, c1cw6.wallpaper_url);
    }

    public static final EnumC2231831CWv LJJJJL(C1CXB c1cxb) {
        switch (C2231771CWp.LJJIJLIJ[c1cxb.ordinal()]) {
            case 1:
                return EnumC2231831CWv.Apply;
            case 2:
                return EnumC2231831CWv.Invite;
            case 3:
                return EnumC2231831CWv.FirstFrameInner;
            case 4:
                return EnumC2231831CWv.FirstFrameCross;
            case 5:
                return EnumC2231831CWv.CompensateIm;
            case 6:
                return EnumC2231831CWv.AudienceStart;
            case 7:
                return EnumC2231831CWv.ForwardStream;
            case 8:
                return EnumC2231831CWv.AuxStream;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC2231831CWv.StateAggregate;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC2231831CWv.PreviewCountDown;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC2231831CWv.WaitCrossData;
            default:
                throw new C1954807lC();
        }
    }

    public static final C954960axS LJJJJLI(C2232861CaK c2232861CaK) {
        return new C954960axS(c2232861CaK.joining_rtc.booleanValue(), c2232861CaK.joined_rtc.booleanValue(), c2232861CaK.push_stream.booleanValue(), c2232861CaK.forward_stream.booleanValue(), c2232861CaK.mix_stream.booleanValue(), c2232861CaK.rtc_error.booleanValue(), c2232861CaK.rtc_lost.booleanValue(), c2232861CaK.forward_stream_error.booleanValue(), c2232861CaK.desc);
    }

    public static final C965210bDz LJJJJLL(C1CZY c1czy) {
        EnumC2231821CWu enumC2231821CWu;
        C914780Zue c914780ZueLJJJLIIL = LJJJLIIL(c1czy.all_link_state);
        C914780Zue c914780ZueLJJJLIIL2 = LJJJLIIL(c1czy.inner_arch_link_state);
        C914780Zue c914780ZueLJJJLIIL3 = LJJJLIIL(c1czy.cross_arch_link_state);
        C954960axS c954960axSLJJJJLI = LJJJJLI(c1czy.new_rtc_state);
        C954960axS c954960axSLJJJJLI2 = LJJJJLI(c1czy.old_rtc_state);
        switch (C2231771CWp.LJJIIJ[c1czy.trigger_source.ordinal()]) {
            case 1:
                enumC2231821CWu = EnumC2231821CWu.StartJoinRtc;
                break;
            case 2:
                enumC2231821CWu = EnumC2231821CWu.OnJoinRtcSuccess;
                break;
            case 3:
                enumC2231821CWu = EnumC2231821CWu.StartPushStream;
                break;
            case 4:
                enumC2231821CWu = EnumC2231821CWu.StartMixStream;
                break;
            case 5:
                enumC2231821CWu = EnumC2231821CWu.StartInteractStream;
                break;
            case 6:
                enumC2231821CWu = EnumC2231821CWu.StartForwardStream;
                break;
            case 7:
                enumC2231821CWu = EnumC2231821CWu.StopForwardStream;
                break;
            case 8:
                enumC2231821CWu = EnumC2231821CWu.LeaveRtc;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                enumC2231821CWu = EnumC2231821CWu.OnRtcError;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                enumC2231821CWu = EnumC2231821CWu.OnRtcLost;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                enumC2231821CWu = EnumC2231821CWu.ForwardStreamError;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                enumC2231821CWu = EnumC2231821CWu.ForwardStreamSuccess;
                break;
            default:
                throw new C1954807lC();
        }
        return new C965210bDz(c914780ZueLJJJLIIL, c914780ZueLJJJLIIL2, c914780ZueLJJJLIIL3, c954960axSLJJJJLI, c954960axSLJJJJLI2, enumC2231821CWu);
    }

    public static final EnumC969200bKQ LJJJJZ(C1CXS c1cxs) {
        int i = C2231771CWp.LJJIFFI[c1cxs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return EnumC969200bKQ.Linked;
                        }
                        throw new C1954807lC();
                    }
                    return EnumC969200bKQ.Connecting;
                }
                return EnumC969200bKQ.Wait;
            }
            return EnumC969200bKQ.Idle;
        }
        return EnumC969200bKQ.Close;
    }

    public static final C954780axA LJJJJZI(C2231851CWx c2231851CWx) {
        EnumC2231781CWq enumC2231781CWq;
        C969700bLE c969700bLELJJLIIIJJIZ;
        C914780Zue c914780ZueLJJJLIIL = LJJJLIIL(c2231851CWx.link_state);
        EnumC969200bKQ enumC969200bKQLJJJJZ = LJJJJZ(c2231851CWx.new_state);
        EnumC969200bKQ enumC969200bKQLJJJJZ2 = LJJJJZ(c2231851CWx.old_state);
        switch (C2231771CWp.LJJIII[c2231851CWx.trigger_event.ordinal()]) {
            case 1:
                enumC2231781CWq = EnumC2231781CWq.RequestCreateChannelSuccess;
                break;
            case 2:
                enumC2231781CWq = EnumC2231781CWq.ReceiveCreateChannelMessage;
                break;
            case 3:
                enumC2231781CWq = EnumC2231781CWq.AudienceInitSuccess;
                break;
            case 4:
                enumC2231781CWq = EnumC2231781CWq.RequestFinishChannelSuccess;
                break;
            case 5:
                enumC2231781CWq = EnumC2231781CWq.ReceiveFinishChannelMessage;
                break;
            case 6:
                enumC2231781CWq = EnumC2231781CWq.UserLinkStateTriggerToWait;
                break;
            case 7:
                enumC2231781CWq = EnumC2231781CWq.WaitCrossDataTriggerToWait;
                break;
            case 8:
                enumC2231781CWq = EnumC2231781CWq.UserLinkStateTriggerToConnecting;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                enumC2231781CWq = EnumC2231781CWq.UserLinkStateTriggerToLinked;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                enumC2231781CWq = EnumC2231781CWq.UserLeaveTriggerToConnecting;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                enumC2231781CWq = EnumC2231781CWq.UserLeaveTriggerToWait;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                enumC2231781CWq = EnumC2231781CWq.UserLeaveTriggerToIdle;
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                enumC2231781CWq = EnumC2231781CWq.ClickLeave;
                break;
            case 14:
                enumC2231781CWq = EnumC2231781CWq.ClickLeaveGroup;
                break;
            case 15:
                enumC2231781CWq = EnumC2231781CWq.ReceiveInnerKickOutMessage;
                break;
            case 16:
                enumC2231781CWq = EnumC2231781CWq.ReceiveLeaveGroupMessage;
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                enumC2231781CWq = EnumC2231781CWq.LeaveOnlyOne;
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                enumC2231781CWq = EnumC2231781CWq.FirstFrameTimeout;
                break;
            case 19:
                enumC2231781CWq = EnumC2231781CWq.LinkedListWithoutMe;
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                enumC2231781CWq = EnumC2231781CWq.RtcLost;
                break;
            case 21:
                enumC2231781CWq = EnumC2231781CWq.RtcError;
                break;
            case 22:
                enumC2231781CWq = EnumC2231781CWq.StartLiveCoreError;
                break;
            case 23:
                enumC2231781CWq = EnumC2231781CWq.Reset;
                break;
            default:
                throw new C1954807lC();
        }
        C1CZO c1czo = c2231851CWx.trigger_user_link_state_context;
        if (c1czo != null) {
            c969700bLELJJLIIIJJIZ = LJJLIIIJJIZ(c1czo);
        } else {
            c969700bLELJJLIIIJJIZ = null;
        }
        return new C954780axA(c914780ZueLJJJLIIL, enumC969200bKQLJJJJZ, enumC969200bKQLJJJJZ2, enumC2231781CWq, c969700bLELJJLIIIJJIZ);
    }

    public static final C914780Zue LJJJLIIL(C2232401CZa c2232401CZa) {
        return new C914780Zue(LJJJJZ(c2232401CZa.state), LJJJJLI(c2232401CZa.rtc_state));
    }

    public static final C2182991Ac5 LJJJLL(C2233101Cai c2233101Cai) {
        String str = c2233101Cai.key;
        int i = C2231771CWp.LIZ[c2233101Cai.k_type.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            throw new C1954807lC();
        }
        return new C2182991Ac5(str, c2233101Cai.default_value);
    }

    public static final C2181851AaF LJJJLZIJ(C2233401CbC c2233401CbC) {
        C2181931AaN c2181931AaN;
        String str = c2233401CbC.switch_id;
        String str2 = c2233401CbC.source_str;
        String str3 = c2233401CbC.source_id;
        C2233611CbX c2233611CbX = c2233401CbC.biz_source;
        if (c2233611CbX != null) {
            c2181931AaN = new C2181931AaN(c2233611CbX.biz_source, c2233611CbX.biz_source_id);
        } else {
            c2181931AaN = null;
        }
        return new C2181851AaF(str, str2, str3, c2181931AaN);
    }

    public static final C20426814wM LJJJZ(C1CQD c1cqd) {
        C20427114wP c20427114wP = new C20427114wP(c1cqd.error.err_code.longValue());
        c1cqd.new_branch_id.longValue();
        C20426214wG c20426214wGLJJLI = LJJLI(c1cqd.new_root_flow);
        c1cqd.new_state_id.longValue();
        return new C20426814wM(c20427114wP, c20426214wGLJJLI);
    }

    public static final C20426914wN LJJL(C1CQC c1cqc) {
        C20427114wP c20427114wP = new C20427114wP(c1cqc.error.err_code.longValue());
        C20426214wG c20426214wGLJJLI = LJJLI(c1cqc.new_root_flow);
        c1cqc.new_state_id.longValue();
        return new C20426914wN(c20427114wP, c20426214wGLJJLI);
    }

    public static final C20426214wG LJJLI(C1CQI c1cqi) {
        long jLongValue = c1cqi.start_at_flow_id.longValue();
        long jLongValue2 = c1cqi.min_app_version.longValue();
        List<C1CQP> list = c1cqi.flows;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1CQP c1cqp : list) {
            arrayList.add(new C20426314wH(c1cqp.id.longValue(), c1cqp.start_at.longValue(), c1cqp.end_at.longValue()));
        }
        List<C1CQM> list2 = c1cqi.states;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C1CQM> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(LJJLIIIIJ(it2.next()));
        }
        return new C20426214wG(arrayList, arrayList2, jLongValue, jLongValue2);
    }

    public static final C20425214w6 LJJLIIIIJ(C1CQM c1cqm) {
        C20425014w4 c20425014w4;
        long jLongValue = c1cqm.id.longValue();
        String str = c1cqm.state_type;
        C1CQV c1cqv = c1cqm.task_state_data;
        C20424914w3 c20424914w3 = null;
        if (c1cqv != null) {
            c20425014w4 = new C20425014w4(c1cqv.next.longValue(), c1cqv.end.booleanValue(), c1cqv.name, c1cqv.comment, c1cqv.prev, c1cqv.version.longValue(), c1cqv.min_app_version.longValue(), c1cqv.parameter, c1cqv.conditions);
        } else {
            c20425014w4 = null;
        }
        C1CQZ c1cqz = c1cqm.parallel_state_data;
        if (c1cqz != null) {
            c20424914w3 = new C20424914w3(c1cqz.next.longValue(), c1cqz.end.booleanValue(), c1cqz.comment, c1cqz.tips, c1cqz.conditions, c1cqz.auto_run_mode, c1cqz.prev, c1cqz.branches);
        }
        return new C20425214w6(jLongValue, str, c20425014w4, c20424914w3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.007S] */
    public static final C007S LJJLIIIJ(C2232831CaH c2232831CaH) {
        final boolean zBooleanValue = c2232831CaH.remote_joined.booleanValue();
        final boolean zBooleanValue2 = c2232831CaH.remote_audio_data.booleanValue();
        final boolean zBooleanValue3 = c2232831CaH.remote_video_data.booleanValue();
        final boolean zBooleanValue4 = c2232831CaH.first_frame_render.booleanValue();
        final boolean zBooleanValue5 = c2232831CaH.remote_leaved.booleanValue();
        final String str = c2232831CaH.desc;
        return new Object(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, str) { // from class: X.007S
            public final boolean LIZ;
            public final boolean LIZIZ;
            public final boolean LIZJ;
            public final boolean LIZLLL;
            public final boolean LJ;
            public final String LJFF;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UserLinkRtcState(remoteJoined=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", remoteAudioData=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", remoteVideoData=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", firstFrameRender=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", remoteLeaved=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", desc=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = zBooleanValue;
                this.LIZIZ = zBooleanValue2;
                this.LIZJ = zBooleanValue3;
                this.LIZLLL = zBooleanValue4;
                this.LJ = zBooleanValue5;
                this.LJFF = str;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1CUe] */
    public static final C2231141CUe LJJLIIIJILLIZJL(C1CZU c1czu) {
        C2232021CXo c2232021CXo = c1czu.user;
        if (c2232021CXo != null) {
            LJJIIZI(c2232021CXo);
        }
        C1CZV c1czv = c1czu.user_link_state;
        c1czv.uid.longValue();
        LJJLIIIJJI(c1czv.state);
        LJJLIIIJ(c1czv.rtc_state);
        LJJLIIIJ(c1czu.new_rtc_state);
        LJJLIIIJ(c1czu.old_rtc_state);
        int i = C2231771CWp.LJJIIJZLJL[c1czu.trigger_source.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            throw new C1954807lC();
        }
        return new Object() { // from class: X.1CUe
        };
    }

    public static final C1CXC LJJLIIIJJI(C1CXW c1cxw) {
        int i = C2231771CWp.LJJI[c1cxw.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return C1CXC.Linked;
                        }
                        throw new C1954807lC();
                    }
                    return C1CXC.Connecting;
                }
                return C1CXC.Wait;
            }
            return C1CXC.Request;
        }
        return C1CXC.Idle;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0bLE] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0bLF] */
    public static final C969700bLE LJJLIIIJJIZ(C1CZO c1czo) {
        C967180bHA c967180bHALJJIIZI;
        EnumC2231721CWk enumC2231721CWk;
        C2232021CXo c2232021CXo = c1czo.user;
        if (c2232021CXo != null) {
            c967180bHALJJIIZI = LJJIIZI(c2232021CXo);
        } else {
            c967180bHALJJIIZI = null;
        }
        C1CZV c1czv = c1czo.user_link_state;
        final long jLongValue = c1czv.uid.longValue();
        final String str = c1czv.link_mic_id;
        final C1CXC c1cxcLJJLIIIJJI = LJJLIIIJJI(c1czv.state);
        final C007S c007sLJJLIIIJ = LJJLIIIJ(c1czv.rtc_state);
        ?? r4 = new Object(jLongValue, str, c1cxcLJJLIIIJJI, c007sLJJLIIIJ) { // from class: X.0bLF
            public final long LIZ;
            public final String LIZIZ;
            public final C1CXC LIZJ;
            public final C007S LIZLLL;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UserLinkStateModel(uid=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", linkMicId=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", state=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", rtcState=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = jLongValue;
                this.LIZIZ = str;
                this.LIZJ = c1cxcLJJLIIIJJI;
                this.LIZLLL = c007sLJJLIIIJ;
            }
        };
        C1CXC c1cxcLJJLIIIJJI2 = LJJLIIIJJI(c1czo.new_state);
        C1CXC c1cxcLJJLIIIJJI3 = LJJLIIIJJI(c1czo.old_state);
        switch (C2231771CWp.LJJII[c1czo.trigger_event.ordinal()]) {
            case 1:
                enumC2231721CWk = EnumC2231721CWk.None;
                break;
            case 2:
                enumC2231721CWk = EnumC2231721CWk.StartRequestInvite;
                break;
            case 3:
                enumC2231721CWk = EnumC2231721CWk.StartRequestInviteBatch;
                break;
            case 4:
                enumC2231721CWk = EnumC2231721CWk.StartRequestApply;
                break;
            case 5:
                enumC2231721CWk = EnumC2231721CWk.StartRequestInviteGroup;
                break;
            case 6:
                enumC2231721CWk = EnumC2231721CWk.StartRequestApplyGroup;
                break;
            case 7:
                enumC2231721CWk = EnumC2231721CWk.RequestInviteSuccess;
                break;
            case 8:
                enumC2231721CWk = EnumC2231721CWk.RequestInviteBatchSuccess;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                enumC2231721CWk = EnumC2231721CWk.RequestApplySuccess;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                enumC2231721CWk = EnumC2231721CWk.RequestInviteGroupSuccess;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                enumC2231721CWk = EnumC2231721CWk.RequestApplyGroupSuccess;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                enumC2231721CWk = EnumC2231721CWk.RequestInviteFailed;
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                enumC2231721CWk = EnumC2231721CWk.RequestInviteOutOfRoom;
                break;
            case 14:
                enumC2231721CWk = EnumC2231721CWk.RequestApplyFailed;
                break;
            case 15:
                enumC2231721CWk = EnumC2231721CWk.RequestInviteGroupFailed;
                break;
            case 16:
                enumC2231721CWk = EnumC2231721CWk.RequestApplyGroupFailed;
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                enumC2231721CWk = EnumC2231721CWk.ReceiveInviteMessage;
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                enumC2231721CWk = EnumC2231721CWk.ReceiveApplyMessage;
                break;
            case 19:
                enumC2231721CWk = EnumC2231721CWk.ReceiveInviteGroupMessage;
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                enumC2231721CWk = EnumC2231721CWk.ReceiveApplyGroupMessage;
                break;
            case 21:
                enumC2231721CWk = EnumC2231721CWk.RequestCancelInviteSuccess;
                break;
            case 22:
                enumC2231721CWk = EnumC2231721CWk.RequestCancelApplySuccess;
                break;
            case 23:
                enumC2231721CWk = EnumC2231721CWk.RequestCancelInviteGroupSuccess;
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                enumC2231721CWk = EnumC2231721CWk.RequestCancelApplyGroupSuccess;
                break;
            case 25:
                enumC2231721CWk = EnumC2231721CWk.RequestReplyRefuseSuccess;
                break;
            case 26:
                enumC2231721CWk = EnumC2231721CWk.RequestApplyDirectRefuseSuccess;
                break;
            case 27:
                enumC2231721CWk = EnumC2231721CWk.RequestReplyGroupRefuseSuccess;
                break;
            case 28:
                enumC2231721CWk = EnumC2231721CWk.RequestPermitRefuseSuccess;
                break;
            case 29:
                enumC2231721CWk = EnumC2231721CWk.RequestPermitGroupRefuseSuccess;
                break;
            case 30:
                enumC2231721CWk = EnumC2231721CWk.ReceivePermitRefuseMessage;
                break;
            case 31:
                enumC2231721CWk = EnumC2231721CWk.ReceivePermitGroupRefuseMessage;
                break;
            case 32:
                enumC2231721CWk = EnumC2231721CWk.ReceiveCancelInviteMessage;
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                enumC2231721CWk = EnumC2231721CWk.ReceiveCancelApplyMessage;
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                enumC2231721CWk = EnumC2231721CWk.ReceiveCancelInviteGroupMessage;
                break;
            case 35:
                enumC2231721CWk = EnumC2231721CWk.ReceiveCancelApplyGroupMessage;
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                enumC2231721CWk = EnumC2231721CWk.ReceiveReplyRefuseMessage;
                break;
            case 37:
                enumC2231721CWk = EnumC2231721CWk.ReceiveReplyGroupRefuseMessage;
                break;
            case 38:
                enumC2231721CWk = EnumC2231721CWk.RequestJoinDirectSuccess;
                break;
            case 39:
                enumC2231721CWk = EnumC2231721CWk.RequestApplyDirectAgreeSuccess;
                break;
            case 40:
                enumC2231721CWk = EnumC2231721CWk.ReceiveJoinDirectMessage;
                break;
            case 41:
                enumC2231721CWk = EnumC2231721CWk.ReceiveJoinGroupDirectMessage;
                break;
            case 42:
                enumC2231721CWk = EnumC2231721CWk.ReceiveJoinRoomDirectMessage;
                break;
            case 43:
                enumC2231721CWk = EnumC2231721CWk.ReceiveListChangeUserJoin;
                break;
            case 44:
                enumC2231721CWk = EnumC2231721CWk.RequestReplyAgreeSuccess;
                break;
            case 45:
                enumC2231721CWk = EnumC2231721CWk.RequestPermitAgreeSuccess;
                break;
            case 46:
                enumC2231721CWk = EnumC2231721CWk.RequestReplyGroupAgreeSuccess;
                break;
            case 47:
                enumC2231721CWk = EnumC2231721CWk.RequestPermitGroupAgreeSuccess;
                break;
            case 48:
                enumC2231721CWk = EnumC2231721CWk.ReceiveReplyAgreeMessage;
                break;
            case 49:
                enumC2231721CWk = EnumC2231721CWk.ReceivePermitAgreeMessage;
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                enumC2231721CWk = EnumC2231721CWk.ReceiveReplyGroupAgreeMessage;
                break;
            case 51:
                enumC2231721CWk = EnumC2231721CWk.ReceivePermitGroupAgreeMessage;
                break;
            case 52:
                enumC2231721CWk = EnumC2231721CWk.ReceiveRemoteFirstFrameRender;
                break;
            case 53:
                enumC2231721CWk = EnumC2231721CWk.ReceiveRemoteAudioFrame;
                break;
            case 54:
                enumC2231721CWk = EnumC2231721CWk.AlreadyReceivedFirstFrame;
                break;
            case 55:
                enumC2231721CWk = EnumC2231721CWk.ReceiveLeaveMessage;
                break;
            case 56:
                enumC2231721CWk = EnumC2231721CWk.ReceiveListChangeUserLeave;
                break;
            case 57:
                enumC2231721CWk = EnumC2231721CWk.ReceiveLeaveGroupMessage;
                break;
            case 58:
                enumC2231721CWk = EnumC2231721CWk.ReceiveRtcKickOutMessage;
                break;
            case 59:
                enumC2231721CWk = EnumC2231721CWk.UserFsmDeleted;
                break;
            case 60:
                enumC2231721CWk = EnumC2231721CWk.Reset;
                break;
            default:
                throw new C1954807lC();
        }
        return new Object(c967180bHALJJIIZI, r4, c1cxcLJJLIIIJJI2, c1cxcLJJLIIIJJI3, enumC2231721CWk) { // from class: X.0bLE
            public final C967180bHA LIZ;
            public final C969710bLF LIZIZ;
            public final C1CXC LIZJ;
            public final C1CXC LIZLLL;
            public final EnumC2231721CWk LJ;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UserLinkStateChangeContext(user=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", userLinkState=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", newState=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", oldState=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", triggerEvent=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = c967180bHALJJIIZI;
                this.LIZIZ = r4;
                this.LIZJ = c1cxcLJJLIIIJJI2;
                this.LIZLLL = c1cxcLJJLIIIJJI3;
                this.LJ = enumC2231721CWk;
            }
        };
    }

    public static final void LJJLIIIJLJLI(C970250bM7 c970250bM7) {
        ByteBuffer byteBufferAllocateDirect;
        C1CIV c1civ = new C1CIV(new C1CIG(-8950620936925558871L, Long.valueOf(C972890bQN.LIZ.LIZ(new C2183411Acl(c970250bM7)))));
        int iEncodedSize = C1CIV.ADAPTER.encodedSize(c1civ);
        if (iEncodedSize > 0) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
            c1civ.encode(new C1283530jVP(byteBufferAllocateDirect));
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        }
        MoltenFfiLinkMicSdk.MoltenFfiNativeSetLiveTrackerProviderX8936323554065951647(byteBufferAllocateDirect);
    }

    public static final ByteBuffer LIZLLL(int i, Function1<? super OutputStream, Unit> function1) {
        if (i > 0) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
            function1.invoke(new C1283530jVP(byteBufferAllocateDirect));
            return byteBufferAllocateDirect;
        }
        return ByteBuffer.allocateDirect(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.1Ca2] */
    public static final C2182301Aay LJJLIIIJL(C2182081Aac c2182081Aac, EnumC2181801AaA enumC2181801AaA) {
        ByteBuffer byteBufferAllocateDirect;
        InputStream c19924412xW;
        C2232681Ca2 c2232681Ca2;
        C2233731Cbj c2233731Cbj = new C2233731Cbj(new C2233701Cbg(c2182081Aac.LIZ.LIZ(), c2182081Aac.LIZIZ.LIZ(), Double.valueOf(c2182081Aac.LIZJ), c2182081Aac.LIZLLL.LIZ()), enumC2181801AaA.into());
        int iEncodedSize = C2233731Cbj.ADAPTER.encodedSize(c2233731Cbj);
        int i = 0;
        if (iEncodedSize > 0) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
            c2233731Cbj.encode(new C1283530jVP(byteBufferAllocateDirect));
        } else {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        }
        ByteBuffer byteBufferMoltenFfiNativeResolveSimplePlayerFrameX6415509463483633938 = MoltenFfiLinkMicSdk.MoltenFfiNativeResolveSimplePlayerFrameX6415509463483633938(byteBufferAllocateDirect);
        if (byteBufferMoltenFfiNativeResolveSimplePlayerFrameX6415509463483633938 == null) {
            c19924412xW = new ByteArrayInputStream(new byte[0]);
        } else {
            c19924412xW = new C19924412xW(byteBufferMoltenFfiNativeResolveSimplePlayerFrameX6415509463483633938);
        }
        try {
            i = C2232801CaE.ADAPTER.decode(c19924412xW).ret;
            c2232681Ca2 = i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c2232681Ca2 = C2232801CaE.ADAPTER.decode(new byte[i]).ret;
        }
        if (byteBufferMoltenFfiNativeResolveSimplePlayerFrameX6415509463483633938 != null) {
            MoltenFfiLinkMicSdk.freeNativeMemory(byteBufferMoltenFfiNativeResolveSimplePlayerFrameX6415509463483633938);
        }
        if (c2232681Ca2 != 0) {
            C1283980jW8 c1283980jW8LJJIII = LJJIII(c2232681Ca2.player_frame);
            LJJIII(c2232681Ca2.layout_container_frame);
            return new C2182301Aay(c1283980jW8LJJIII);
        }
        return null;
    }

    public static final void LIZ(LinkMicMultiLinker linkMicMultiLinker, LinkMicCrossLinker linkMicCrossLinker, LinkMicLayoutLayer linkMicLayoutLayer) {
        Long lValueOf;
        ByteBuffer byteBufferAllocateDirect;
        Long lValueOf2 = null;
        if (linkMicMultiLinker != null) {
            lValueOf = Long.valueOf(linkMicMultiLinker.LJLJI());
        } else {
            lValueOf = null;
        }
        if (linkMicCrossLinker != null) {
            lValueOf2 = Long.valueOf(linkMicCrossLinker.LLIIIL());
        }
        AbstractC1283580jVU abstractC1283580jVU = linkMicLayoutLayer.LL;
        if (abstractC1283580jVU instanceof C1283590jVV) {
            C1CHW c1chw = new C1CHW(lValueOf, lValueOf2, Long.valueOf(((C1283590jVV) abstractC1283580jVU).LIZ));
            int iEncodedSize = C1CHW.ADAPTER.encodedSize(c1chw);
            if (iEncodedSize > 0) {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(iEncodedSize);
                c1chw.encode(new C1283530jVP(byteBufferAllocateDirect));
            } else {
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
            }
            MoltenFfiLinkMicSdk.MoltenFfiNativeBindLayoutLayerX1890126169443502120(byteBufferAllocateDirect);
            return;
        }
        throw new C1954807lC();
    }
}
