package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSuggestedStickersAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.preshown.PreshownStickerBannerReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.AIMojiStickerConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerSceneConfig;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I9W, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0I9W extends C2217421BqW implements Function1<PreshownStickerItem, Unit> {
    public C0I9W(Object obj) {
        super(1, obj, PreshownStickerBannerReusedUISlotAssem.class, "onItemClicked", "onItemClicked(Lcom/ss/android/ugc/aweme/im/strategy/businessconfig/PreshownStickerItem;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.im.saas.host.api.im.IIMUserPortraitManager] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PreshownStickerItem preshownStickerItem) {
        AssemVMLazy assemVMLazy;
        String singleChatFromUserId;
        EnumC1644606cG enumC1644606cG;
        String str;
        int size;
        Set setLIZ;
        ReferenceInfo referenceInfoLJII;
        String strLJJLIIIJ;
        CharSequence charSequence;
        List<String> list;
        C869590Y9l c869590Y9l;
        List<PreshownStickerItem> list2;
        PreshownStickerItem preshownStickerItem2 = preshownStickerItem;
        PreshownStickerBannerReusedUISlotAssem preshownStickerBannerReusedUISlotAssem = (PreshownStickerBannerReusedUISlotAssem) this.receiver;
        preshownStickerBannerReusedUISlotAssem.getClass();
        Fragment fragmentLIZIZ = C897460ZIq.LIZIZ(preshownStickerBannerReusedUISlotAssem.LJJIJL());
        if (fragmentLIZIZ != null) {
            InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageListFooterViewModel.class);
            C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 214);
            AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(412);
            if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragmentLIZIZ, true), new C338490DOt(fragmentLIZIZ, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragmentLIZIZ, 1095), aFwS236S0000000_6, new C451460Hn6(fragmentLIZIZ, true), new C451620HnM(fragmentLIZIZ, true), new C987103tV(fragmentLIZIZ, true));
            } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                assemVMLazy = C451650HnP.LIZ(fragmentLIZIZ, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), c5182020e, new AwS550S0100000_6(fragmentLIZIZ, 1096), aFwS236S0000000_6, null, null, null);
            } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZIZ, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragmentLIZIZ), C724750Sbp.LJIIIZ(fragmentLIZIZ), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragmentLIZIZ, 1097), aFwS236S0000000_6, new C451460Hn6(fragmentLIZIZ, false), new C451620HnM(fragmentLIZIZ, false), new C987103tV(fragmentLIZIZ, false));
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PreshownStickerBannerReusedUISlotAssem.LLJZIJLIL;
            ((MessageListFooterViewModel) assemVMLazy.getValue()).aO1(EnumC1707006mK.CLICK_STICKER);
            IMSuggestedStickersAnalytics iMSuggestedStickersAnalytics = IMSuggestedStickersAnalytics.LIZIZ;
            String conversationId = preshownStickerBannerReusedUISlotAssem.op().getConversationId();
            SessionInfo sessionInfoOp = preshownStickerBannerReusedUISlotAssem.op();
            ?? r15 = 0;
            charSequence = null;
            CharSequence charSequence2 = null;
            charSequence = null;
            CharSequence charSequence3 = null;
            if ((sessionInfoOp instanceof C909290Zln) && sessionInfoOp != null) {
                singleChatFromUserId = sessionInfoOp.getSingleChatFromUserId();
            } else {
                singleChatFromUserId = null;
            }
            if (preshownStickerBannerReusedUISlotAssem.op() instanceof C909290Zln) {
                enumC1644606cG = EnumC1644606cG.SINGLE;
            } else {
                enumC1644606cG = EnumC1644606cG.GROUP;
            }
            PreshownStickerSceneConfig preshownStickerSceneConfig = preshownStickerBannerReusedUISlotAssem.LLJLLL;
            if (preshownStickerSceneConfig != null) {
                str = preshownStickerSceneConfig.sceneId;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (preshownStickerSceneConfig != null && (list2 = preshownStickerSceneConfig.preshownStickerItem) != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            C454460Hrw c454460Hrw = EnumC454450Hrv.Companion;
            Integer num = preshownStickerItem2.stickerType;
            c454460Hrw.getClass();
            EnumC454450Hrv enumC454450HrvLIZ = C454460Hrw.LIZ(num);
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            C1645806cS c1645806cS = new C1645806cS(enumC454450HrvLIZ, c454640HsE.LIZIZ().getImStickerMessageService().LJIIIIZZ(preshownStickerItem2));
            PreshownStickerSceneConfig preshownStickerSceneConfig2 = preshownStickerBannerReusedUISlotAssem.LLJLLL;
            if (preshownStickerSceneConfig2 != null) {
                setLIZ = C0I9X.LIZ(preshownStickerSceneConfig2);
            } else {
                setLIZ = C08CX.INSTANCE;
            }
            C1645406cO.LIZ(conversationId, singleChatFromUserId, enumC1644606cG, str, size, c1645806cS, setLIZ, false, 384);
            try {
                if (C946803n0.LIZ(preshownStickerBannerReusedUISlotAssem.LJJIJL()) != null) {
                    C736950SvV c736950SvV = new C736950SvV(C13LE.LIZ(MessageReplyVM.class), new AwS547S0100000_3(new AwS550S0100000_6(preshownStickerBannerReusedUISlotAssem, 1098), (Function0<Unit>) 95), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZIZ), C1220000hqw.LIZ(fragmentLIZIZ), AFwS236S0000000_6.get$arr$(413), null, null, null);
                    C454980Hsm c454980Hsm = (C454980Hsm) ((MessageReplyVM) c736950SvV.getValue()).LLILZ.getValue();
                    if (c454980Hsm != null) {
                        c869590Y9l = c454980Hsm.LIZ;
                    } else {
                        c869590Y9l = null;
                    }
                    ((MessageReplyVM) c736950SvV.getValue()).At1();
                    C0ZDT.LIZ.getClass();
                    referenceInfoLJII = C0ZDT.LJII(c869590Y9l);
                } else {
                    referenceInfoLJII = null;
                }
                InterfaceC454710HsL imStickerMessageService = c454640HsE.LIZIZ().getImStickerMessageService();
                String conversationId2 = preshownStickerBannerReusedUISlotAssem.op().getConversationId();
                EnumC454490Hrz enumC454490Hrz = EnumC454490Hrz.SUGGESTED_STICKER;
                preshownStickerBannerReusedUISlotAssem.op().getEnterFromForMob();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(ChatRoomEventTrackingStore.LIZIZ.LIZIZ(preshownStickerBannerReusedUISlotAssem.op().getUuid()));
                LightInteractionStickerSetMessage lightInteractionStickerSetMessage = preshownStickerItem2.template;
                if (lightInteractionStickerSetMessage != null) {
                    Integer num2 = lightInteractionStickerSetMessage.stickerType;
                    int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
                    if (num2 != null && num2.intValue() == type) {
                        AIMojiStickerConfig aIMojiStickerConfig = preshownStickerItem2.aimoji;
                        if (aIMojiStickerConfig == null || (list = aIMojiStickerConfig.expressions) == null) {
                            strLJJLIIIJ = "";
                            charSequence = charSequence2;
                            linkedHashMap.put("aimoji_expression", strLJJLIIIJ);
                            charSequence3 = charSequence;
                        } else {
                            CharSequence charSequence4 = null;
                            strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63);
                            charSequence = charSequence4;
                            if (strLJJLIIIJ == null) {
                                charSequence2 = charSequence4;
                                strLJJLIIIJ = "";
                                charSequence = charSequence2;
                            }
                            linkedHashMap.put("aimoji_expression", strLJJLIIIJ);
                            charSequence3 = charSequence;
                        }
                    }
                    Integer num3 = lightInteractionStickerSetMessage.stickerType;
                    int type2 = EnumC451180Hme.AISELF_STICKER.getType();
                    r15 = charSequence3;
                    if (num3 != null) {
                        r15 = charSequence3;
                        if (num3.intValue() == type2) {
                            AIMojiStickerConfig aIMojiStickerConfig2 = preshownStickerItem2.aimoji;
                            ?? r152 = charSequence3;
                            if (aIMojiStickerConfig2 != null) {
                                List<String> list3 = aIMojiStickerConfig2.expressions;
                                r152 = charSequence3;
                                if (list3 != null) {
                                    CharSequence charSequence5 = charSequence3;
                                    CharSequence charSequence6 = charSequence3;
                                    CharSequence charSequence7 = charSequence3;
                                    CharSequence charSequence8 = charSequence3;
                                    ?? r153 = charSequence3;
                                    String strLJJLIIIJ2 = C13LP.LJJLIIIJ(list3, charSequence5, charSequence6, charSequence7, 0, charSequence8, r153, 63);
                                    r152 = r153;
                                    if (strLJJLIIIJ2 != null) {
                                        str2 = strLJJLIIIJ2;
                                        r152 = r153;
                                    }
                                }
                            }
                            linkedHashMap.put("ai_self_sticker_meme", str2);
                            r15 = r152;
                        }
                    }
                }
                linkedHashMap.put("enter_method", enumC454490Hrz.getValue());
                Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(linkedHashMap);
                C0I0B c0i0b = C0I0B.LJFF;
                imStickerMessageService.LJIJJ(preshownStickerItem2, conversationId2, mapLJIIZILJ, C894660Z7w.LIZ(), referenceInfoLJII);
                if (C296660Bk0.LIZ()) {
                    IIMUserPortraitManager.LIZ.getClass();
                    ?? LIZ = C0Z5R.LIZ();
                    if (LIZ != 0) {
                        IMHostApi.LIZ.getClass();
                        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
                        ?? ValueOf = r15;
                        if (iMHostApiLIZ != null) {
                            ValueOf = Long.valueOf(iMHostApiLIZ.LIZIZ());
                        }
                        LIZ.LJIIIIZZ(ValueOf, ((C1400340mXo) c0i0b.LIZ()).getCurUserId());
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }
}
