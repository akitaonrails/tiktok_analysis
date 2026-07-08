package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.service.IIMContactManager;
import com.ss.android.ugc.aweme.im.service.service.ISendingParameterHelper;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ldL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365330ldL {
    public static C1365340ldM LIZIZ;
    public static final C1365330ldL LIZ = new C1365330ldL();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0ldO
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            C1365340ldM c1365340ldM;
            Bundle bundle;
            if (message != null && message.what == 100 && (HandlerHook.getMessageObj(message.obj) instanceof C1365340ldM)) {
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                if ((messageObj instanceof C1365340ldM) && (c1365340ldM = (C1365340ldM) messageObj) != null && c1365340ldM.LIZ == EnumC1365370ldP.SENDING) {
                    SharePackage sharePackage = c1365340ldM.LJFF;
                    if (sharePackage != null && (bundle = sharePackage.extras) != null && bundle.getBoolean("is_create_group_and_share", false)) {
                        C1365330ldL.LIZ.getClass();
                        C1365330ldL.LIZJ(c1365340ldM);
                    } else {
                        C1365330ldL.LIZ.LIZLLL(c1365340ldM);
                        return false;
                    }
                }
            }
            return false;
        }
    });

    public static void LIZJ(C1365340ldM c1365340ldM) {
        SharePackage sharePackage;
        Bundle bundle;
        String string;
        Bundle bundle2;
        final C1365340ldM c1365340ldM2 = c1365340ldM;
        if (c1365340ldM2 == null) {
            if (LIZIZ == null) {
                return;
            } else {
                c1365340ldM2 = LIZIZ;
            }
        }
        if (c1365340ldM2 != null && (sharePackage = c1365340ldM2.LJFF) != null && (bundle = sharePackage.extras) != null && c1365340ldM2.LIZ == EnumC1365370ldP.SENDING && bundle.getBoolean("is_create_group_and_share", false)) {
            c1365340ldM2.LIZ = EnumC1365370ldP.SENT;
            LIZJ.removeMessages(100);
            C1365220ldA.LIZ.getClass();
            List<IMContact> list = c1365340ldM2.LIZLLL;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<IMContact> it2 = list.iterator();
                while (it2.hasNext()) {
                    String uid = it2.next().getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    arrayList.add(uid);
                }
                SharePackage sharePackage2 = c1365340ldM2.LJFF;
                if (sharePackage2 != null && (bundle2 = sharePackage2.extras) != null) {
                    string = bundle2.getString("aid");
                } else {
                    string = null;
                }
                C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "ci", "share_panel").LIZ(new C1229390i65(arrayList, null, EnumC913760Zt0.NORMAL_GROUP_CHAT, null, null, null, null, null, null, 506), new C1229400i66("share", "create_group", C2097608Jq.LJI(new Pair("share_aweme_id", String.valueOf(string))), EnumC1230500i7s.CREATE_GROUP_SHARE_PANEL_SEND), new C1231500i9U() { // from class: X.0lcn
                    @Override // X.C1231500i9U, X.InterfaceC863580XuG
                    /* JADX INFO: renamed from: LIZJ */
                    public final void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
                        C1365340ldM c1365340ldM3;
                        SharePackage sharePackage3;
                        IMConversation iMConversationLJII;
                        super.LJ(c0y8t, c0ymw);
                        if (c0y8t != null && (sharePackage3 = (c1365340ldM3 = c1365340ldM2).LJFF) != null) {
                            sharePackage3.extras.putBoolean("is_create_group_and_share", true);
                            IInternalShareApi.LIZ.getClass();
                            InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
                            IMContact[] iMContactArr = new IMContact[1];
                            IIMContactUtilService.LIZ.getClass();
                            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                            if (iIMContactUtilServiceLIZ != null && (iMConversationLJII = iIMContactUtilServiceLIZ.LJII(c0y8t)) != null) {
                                iMContactArr[0] = iMConversationLJII;
                                interfaceC1364710lcLLIZIZ.LJIIJJI(sharePackage3, C1697810uHb.LJIILJJIL(iMContactArr), c1365340ldM3.LJ, c1365340ldM3.LJIILIIL);
                            }
                        }
                    }
                }, null);
            }
        }
        LIZIZ = null;
    }

    public final void LIZLLL(C1365340ldM c1365340ldM) {
        EnumC1365370ldP enumC1365370ldP = c1365340ldM.LIZ;
        EnumC1365370ldP enumC1365370ldP2 = EnumC1365370ldP.SENT;
        if (enumC1365370ldP != enumC1365370ldP2 && enumC1365370ldP != EnumC1365370ldP.UNDO) {
            c1365340ldM.LIZ = enumC1365370ldP2;
            LIZJ.removeMessages(100);
            LJ(this, c1365340ldM.LIZLLL, c1365340ldM.LJ, c1365340ldM.LJFF, c1365340ldM.LJI, c1365340ldM.LJII, c1365340ldM.LJIIIIZZ, c1365340ldM.LJIIIZ, c1365340ldM.LJIIJ, c1365340ldM.LJIIJJI, c1365340ldM.LIZIZ, c1365340ldM.LJIIL, false, c1365340ldM.LJIILJJIL, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0ldN] */
    public final void LJFF(final C1365340ldM c1365340ldM) {
        Bundle bundle;
        boolean z;
        String string;
        final IMContact iMContact;
        boolean z2;
        String string2;
        String string3;
        String string4;
        boolean z3;
        boolean z4;
        List<String> listLIZIZ;
        EnumC1365370ldP enumC1365370ldP;
        if (c1365340ldM.LIZ == EnumC1365370ldP.DEFAULT) {
            C1365340ldM c1365340ldM2 = LIZIZ;
            boolean z5 = true;
            String string5 = null;
            if (c1365340ldM2 != null && (!Intrinsics.LJFF(c1365340ldM2.LIZIZ, c1365340ldM.LIZIZ)) && ((enumC1365370ldP = c1365340ldM2.LIZ) != EnumC1365370ldP.SENT || enumC1365370ldP != EnumC1365370ldP.UNDO)) {
                LIZ.LIZLLL(c1365340ldM2);
            }
            LIZIZ = c1365340ldM;
            SharePackage sharePackage = c1365340ldM.LJFF;
            if (sharePackage != null) {
                bundle = sharePackage.extras;
            } else {
                bundle = null;
            }
            if (bundle != null && bundle.getBoolean("is_ad")) {
                z = true;
            } else {
                z = false;
                if (bundle == null) {
                    string = null;
                }
                boolean zLJFF = Intrinsics.LJFF("true", string);
                if (z && !zLJFF) {
                    c1365340ldM.LIZ = EnumC1365370ldP.SENDING;
                    BPEAHandler bPEAHandler = LIZJ;
                    Message messageObtainMessage = bPEAHandler.obtainMessage(100);
                    messageObtainMessage.obj = c1365340ldM;
                    C786410Ut5.LJLJLJ(bPEAHandler, messageObtainMessage, 3000L);
                    List<IMContact> list = c1365340ldM.LIZLLL;
                    if (list != null && (iMContact = (IMContact) C13LP.LJJJLL(list)) != null) {
                        IIMContactManager iIMContactManager = (IIMContactManager) PluggableExtentionKt.pluggableSpi$default(IIMContactManager.class, false, false, false, 14, null);
                        if (iIMContactManager != null && (listLIZIZ = iIMContactManager.LIZIZ(list)) != null && listLIZIZ.size() > 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        final SharePackage sharePackage2 = c1365340ldM.LJFF;
                        if (sharePackage2 != null) {
                            string5 = sharePackage2.extras.getString("enter_from");
                            string2 = sharePackage2.extras.getString("enter_method");
                            string3 = sharePackage2.extras.getString("enter_position");
                            string4 = sharePackage2.extras.getString("follow_status");
                            if (sharePackage2.extras.containsKey("sending_message_has_animation")) {
                                z5 = sharePackage2.extras.getBoolean("sending_message_has_animation");
                            }
                            z3 = sharePackage2.extras.getBoolean("is_new_group", false);
                            z4 = sharePackage2.extras.getBoolean("is_create_group_and_share", false);
                            if (z4) {
                                LIZIZ = c1365340ldM;
                            }
                        } else {
                            string2 = null;
                            string3 = null;
                            string4 = null;
                            z3 = false;
                            z4 = false;
                        }
                        final boolean z6 = z5;
                        final boolean z7 = z5;
                        final String str = string2;
                        final boolean z8 = z4;
                        C1440005kM.LIZ(new C1365850leB(c1365340ldM.LIZJ, c1365340ldM.LIZIZ, iMContact, z2, new InterfaceC913660Zsq() { // from class: X.0ldN
                            @Override // X.InterfaceC913660Zsq
                            public final void LIZ() {
                                if (c1365340ldM.LIZ == EnumC1365370ldP.SENDING) {
                                    C1365330ldL.LIZJ.removeMessages(100);
                                    C1365340ldM c1365340ldM3 = c1365340ldM;
                                    c1365340ldM3.LIZ = EnumC1365370ldP.UNDO;
                                    C1365330ldL c1365330ldL = C1365330ldL.LIZ;
                                    boolean z9 = z6;
                                    boolean z10 = z7;
                                    String str2 = str;
                                    boolean z11 = z8;
                                    c1365330ldL.getClass();
                                    C1440005kM.LIZ(new C1365860leC(z9, z10, z11, c1365340ldM3.LIZJ, c1365340ldM3.LIZIZ, str2));
                                    C1365330ldL.LIZIZ(sharePackage2, iMContact, c1365340ldM.LJIIJJI);
                                }
                            }
                        }, string5, string2, z5, z5, z3, string3, string4, z4));
                        return;
                    }
                    return;
                }
                LIZLLL(c1365340ldM);
            }
            string = bundle.getString("cancel_undo_when_send_message");
            boolean zLJFF2 = Intrinsics.LJFF("true", string);
            if (z) {
            }
            LIZLLL(c1365340ldM);
        }
    }

    public static void LIZIZ(SharePackage sharePackage, IMContact iMContact, String str) {
        String uid;
        Bundle bundle;
        HashMap map = new HashMap();
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            map.put("enter_method", bundle.getString("enter_method"));
            map.put("panel_source", bundle.getString("enter_method"));
            map.put("enter_from", bundle.getString("enter_from"));
        }
        map.put("chat_type", "private");
        if (iMContact != null && (iMContact instanceof IMUser) && AnonymousClass0652.LIZ(iMContact.getUid()) && (uid = iMContact.getUid()) != null) {
            map.put("conversation_id", C0YNP.LIZLLL(C2095008Iq.LJIILIIL(uid)));
            map.put("to_user_id", uid);
        }
        map.put("process_id", str);
        map.put("message_type", "share_video");
        C20684815ws.LJIILLIIL("send_message_undo", map);
    }

    public static void LJIIL(BaseContent baseContent, TextContent textContent, SharePackage sharePackage) {
        ISendingParameterHelper iSendingParameterHelper;
        Bundle bundle;
        if (baseContent != null && (iSendingParameterHelper = (ISendingParameterHelper) PluggableExtentionKt.pluggableSpi$default(ISendingParameterHelper.class, false, false, false, 14, null)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(baseContent.hashCode());
            sbLIZ.append("");
            String strLIZ = iSendingParameterHelper.LIZ(C2188811AlT.LIZIZ(sbLIZ), "process_id");
            if (strLIZ != null) {
                String string = null;
                if (AnonymousClass0652.LIZ(strLIZ)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(textContent.hashCode());
                    sbLIZ2.append("");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    iSendingParameterHelper.LIZIZ(strLIZIZ, "process_id", strLIZ);
                    if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                        string = bundle.getString("is_share_pop_up");
                    }
                    iSendingParameterHelper.LIZIZ(strLIZIZ, "is_share_pop_up", string);
                }
            }
        }
    }

    public final void LJIIJ(List list, SharePackage sharePackage, C0U3R c0u3r) {
        String strLJII;
        IIMAnalyticsUtil iIMAnalyticsUtil;
        if (sharePackage == null) {
            return;
        }
        if (Intrinsics.LJFF(sharePackage.itemType, "web") && (iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpi$default(IIMAnalyticsUtil.class, false, false, false, 14, null)) != null) {
            strLJII = iIMAnalyticsUtil.LJII();
        } else {
            strLJII = null;
        }
        LJ(this, list, null, sharePackage, null, null, null, null, null, strLJII, null, null, false, null, 7930);
        c0u3r.run(Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
    
        r16 = r10.subList(0, 2);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(com.ss.android.ugc.aweme.sharer.model.SharePackage r26, java.util.List r27, boolean r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365330ldL.LJIIJJI(com.ss.android.ugc.aweme.sharer.model.SharePackage, java.util.List, boolean, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.ss.android.ugc.aweme.im.message.content.BaseContent.ReferenceSceneType r19, X.InterfaceC714750S1x r20, java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365330ldL.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.im.message.content.BaseContent$ReferenceSceneType, X.0S1x, java.util.Map):java.util.Map");
    }

    public final void LJI(List<? extends IMContact> list, String str, SharePackage sharePackage, BaseContent baseContent, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, String str2, boolean z, InterfaceC1361990lXx interfaceC1361990lXx, InterfaceC1362600lYw interfaceC1362600lYw, List<RichTextInfo> list2) {
        String string;
        LinkedHashMap linkedHashMap;
        Bundle bundle;
        if (sharePackage != null) {
            String string2 = sharePackage.extras.getString("enter_method");
            boolean z2 = sharePackage.extras.getBoolean("is_create_group_and_share", false);
            if (((!Intrinsics.LJFF(string2, "publish_share") && Intrinsics.LJFF(sharePackage.itemType, "aweme")) || z2) && !z) {
                LinkedHashMap linkedHashMap2 = null;
                if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                    string = bundle.getString("aid");
                } else {
                    string = null;
                }
                EnumC1365370ldP enumC1365370ldP = EnumC1365370ldP.DEFAULT;
                String string3 = UUID.randomUUID().toString();
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(map);
                } else {
                    linkedHashMap = null;
                }
                if (map2 != null) {
                    linkedHashMap2 = new LinkedHashMap(map2);
                }
                LJFF(new C1365340ldM(enumC1365370ldP, string3, string, list, str, sharePackage, baseContent, null, linkedHashMap, linkedHashMap2, map3, str2, interfaceC1361990lXx, interfaceC1362600lYw, list2));
                return;
            }
        }
        LJ(this, list, str, sharePackage, baseContent, null, map, map2, map3, str2, null, interfaceC1361990lXx, false, list2, 2576);
    }

    public final void LJIIIZ(C0Y8T c0y8t, Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType, InterfaceC1361990lXx interfaceC1361990lXx, User user, Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z) {
        TextContent textContentObtainShareReplyContent;
        String strLJII;
        IMConversation iMConversationLJII;
        String str6;
        String str7;
        if (aweme == null) {
            return;
        }
        if (str != null) {
            textContentObtainShareReplyContent = TextContent.Companion.obtainShareReplyContent(str, user, aweme, referenceSceneType);
        } else {
            textContentObtainShareReplyContent = null;
        }
        IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpi$default(IIMAnalyticsUtil.class, false, false, false, 14, null);
        if (iIMAnalyticsUtil != null) {
            strLJII = iIMAnalyticsUtil.LJII();
        } else {
            strLJII = null;
        }
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        if (iIMContactUtilServiceLIZ != null && (iMConversationLJII = iIMContactUtilServiceLIZ.LJII(c0y8t)) != null) {
            C1370940lmO c1370940lmO = new C1370940lmO();
            c1370940lmO.LIZ = "text";
            String str8 = "";
            if (str2 == null) {
                str6 = "";
            } else {
                str6 = str2;
            }
            C786410Ut5.LJJJI("enter_from", str6, c1370940lmO.LJII);
            C786410Ut5.LJJJI("enter_method", str3, c1370940lmO.LJII);
            C786410Ut5.LJJJI("aid", aweme.getAid(), c1370940lmO.LJII);
            C786410Ut5.LJJJI("cancel_undo_when_send_message", String.valueOf(bool), c1370940lmO.LJII);
            C786410Ut5.LJJJI("cancel_toast", String.valueOf(z), c1370940lmO.LJII);
            if (str5 == null) {
                str7 = "";
            } else {
                str7 = str5;
            }
            C786410Ut5.LJJJI("interaction_type_enter_method", str7, c1370940lmO.LJII);
            EnumC1365370ldP enumC1365370ldP = EnumC1365370ldP.DEFAULT;
            String string = UUID.randomUUID().toString();
            String aid = aweme.getAid();
            List listSingletonList = Collections.singletonList(iMConversationLJII);
            SharePackage sharePackage = new SharePackage(c1370940lmO);
            if (str2 != null) {
                str8 = str2;
            }
            LJFF(new C1365340ldM(enumC1365370ldP, string, aid, listSingletonList, sharePackage, textContentObtainShareReplyContent, null, null, LIZ(aweme, str8, str3, str4, str5, referenceSceneType, null, null), strLJII, interfaceC1361990lXx));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x023e. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C1365330ldL r28, java.util.List r29, java.lang.String r30, com.ss.android.ugc.aweme.sharer.model.SharePackage r31, com.ss.android.ugc.aweme.im.message.content.BaseContent r32, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r33, java.util.Map r34, java.util.Map r35, java.util.Map r36, java.lang.String r37, java.lang.String r38, X.InterfaceC1361990lXx r39, boolean r40, java.util.List r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365330ldL.LJ(X.0ldL, java.util.List, java.lang.String, com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.im.message.content.BaseContent, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate, java.util.Map, java.util.Map, java.util.Map, java.lang.String, java.lang.String, X.0lXx, boolean, java.util.List, int):void");
    }

    public static void LJIIIIZZ(C1365330ldL c1365330ldL, TextContent textContent, StickerTemplate stickerTemplate, IMContact iMContact, Aweme aweme, String str, String str2, String str3, Boolean bool, boolean z, String str4, BaseContent.ReferenceSceneType referenceSceneType, InterfaceC714750S1x interfaceC714750S1x, Map map, InterfaceC1361990lXx interfaceC1361990lXx, int i) {
        String str5;
        String str6;
        InterfaceC714750S1x interfaceC714750S1x2 = interfaceC714750S1x;
        StickerTemplate stickerTemplate2 = stickerTemplate;
        String strLJII = null;
        if ((i & 2) != 0) {
            stickerTemplate2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            interfaceC714750S1x2 = null;
        }
        c1365330ldL.getClass();
        if (aweme != null) {
            C1370940lmO c1370940lmO = new C1370940lmO();
            c1370940lmO.LIZ = "text";
            String str7 = "";
            if (str == null) {
                str5 = "";
            } else {
                str5 = str;
            }
            C786410Ut5.LJJJI("enter_from", str5, c1370940lmO.LJII);
            C786410Ut5.LJJJI("enter_method", str2, c1370940lmO.LJII);
            C786410Ut5.LJJJI("aid", aweme.getAid(), c1370940lmO.LJII);
            C786410Ut5.LJJJI("cancel_undo_when_send_message", String.valueOf(bool), c1370940lmO.LJII);
            C786410Ut5.LJJJI("cancel_toast", String.valueOf(z), c1370940lmO.LJII);
            if (str4 == null) {
                str6 = "";
            } else {
                str6 = str4;
            }
            C786410Ut5.LJJJI("interaction_type_enter_method", str6, c1370940lmO.LJII);
            EnumC1365370ldP enumC1365370ldP = EnumC1365370ldP.DEFAULT;
            String string = UUID.randomUUID().toString();
            String aid = aweme.getAid();
            List listSingletonList = Collections.singletonList(iMContact);
            SharePackage sharePackage = new SharePackage(c1370940lmO);
            if (str != null) {
                str7 = str;
            }
            Map mapLIZ = LIZ(aweme, str7, str2, str3, str4, referenceSceneType, interfaceC714750S1x2, map);
            IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpi$default(IIMAnalyticsUtil.class, false, false, false, 14, null);
            if (iIMAnalyticsUtil != null) {
                strLJII = iIMAnalyticsUtil.LJII();
            }
            c1365330ldL.LJFF(new C1365340ldM(enumC1365370ldP, string, aid, listSingletonList, sharePackage, textContent, stickerTemplate2, null, mapLIZ, strLJII, interfaceC1361990lXx));
        }
    }
}
