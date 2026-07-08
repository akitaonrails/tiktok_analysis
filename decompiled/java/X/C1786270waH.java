package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import com.ss.android.ugc.aweme.contactselect.ContactSelectPanel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.templateselect.TemplateSelectionPanel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0waH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786270waH {
    public static final C1786270waH LIZ = new C1786270waH();

    public static void LIZIZ(C19EG c19eg, IMAiGroupShotConfig iMAiGroupShotConfig, Fragment fragment) {
        IMAiGroupShotConfig.TemplateConfig.Selected selected;
        final String str;
        IMAiGroupShotConfig.ContactSelectConfig.Selected selected2;
        IMAiGroupShotConfig.ContactSelectConfig.ContactData contactData;
        IMAiGroupShotConfig.TemplateConfig.Selecting selecting;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("moveToNext: ");
        sbLIZ.append(iMAiGroupShotConfig);
        C2188811AlT.LIZIZ(sbLIZ);
        C1783520wVq.LL.LIZJ();
        IMAiGroupShotConfig.TemplateConfig templateConfig = iMAiGroupShotConfig.templateConfig;
        boolean z = true;
        String str2 = null;
        if (!(templateConfig instanceof IMAiGroupShotConfig.TemplateConfig.Selected)) {
            if ((templateConfig instanceof IMAiGroupShotConfig.TemplateConfig.Selecting) && (selecting = (IMAiGroupShotConfig.TemplateConfig.Selecting) templateConfig) != null) {
                InterfaceC1493505sz interfaceC1493505sz = C1785060wYK.LIZ;
                String str3 = selecting.enterFrom;
                AIGroupShotEntry aIGroupShotEntry = iMAiGroupShotConfig.entry;
                Integer num = selecting.chatType;
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("enter_from", str3);
                pairArr[1] = new Pair("enter_method", aIGroupShotEntry.LIZ());
                if (num != null) {
                    if (num.intValue() == 0) {
                        str2 = "private";
                    } else if (num.intValue() == 3) {
                        str2 = "group";
                    }
                }
                pairArr[2] = new Pair("chat_type", str2);
                C1785060wYK.LIZ.sendEvent("open_ai_group_shot_template_panel", C2097608Jq.LJIIIIZZ(pairArr));
                String str4 = TemplateSelectionPanel._pnsPageId;
                if (fragment == null) {
                    z = false;
                }
                TemplateSelectionPanel templateSelectionPanel = new TemplateSelectionPanel();
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIJL(bundle, "config", iMAiGroupShotConfig);
                bundle.putBoolean("enable_back_button", z);
                templateSelectionPanel.setArguments(bundle);
                LIZJ(c19eg, fragment, templateSelectionPanel);
                return;
            }
            return;
        }
        if (!(iMAiGroupShotConfig.contactSelectConfig instanceof IMAiGroupShotConfig.ContactSelectConfig.Selected)) {
            String str5 = ContactSelectPanel._pnsPageId;
            if (fragment == null) {
                z = false;
            }
            ContactSelectPanel contactSelectPanel = new ContactSelectPanel();
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJIJL(bundle2, "config", iMAiGroupShotConfig);
            bundle2.putBoolean("enable_back_button", z);
            contactSelectPanel.setArguments(bundle2);
            LIZJ(c19eg, fragment, contactSelectPanel);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("apply action: ");
        sbLIZ2.append(C13LE.LIZ(iMAiGroupShotConfig.contactSelectConfig.LIZ().getClass()).LJI());
        C2188811AlT.LIZIZ(sbLIZ2);
        if (fragment != null) {
            String str6 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
        }
        IMAiGroupShotConfig.TemplateConfig templateConfig2 = iMAiGroupShotConfig.templateConfig;
        if ((templateConfig2 instanceof IMAiGroupShotConfig.TemplateConfig.Selected) && (selected = (IMAiGroupShotConfig.TemplateConfig.Selected) templateConfig2) != null && (str = selected.templateId) != null) {
            IMAiGroupShotConfig.ContactSelectConfig contactSelectConfig = iMAiGroupShotConfig.contactSelectConfig;
            if ((contactSelectConfig instanceof IMAiGroupShotConfig.ContactSelectConfig.Selected) && (selected2 = (IMAiGroupShotConfig.ContactSelectConfig.Selected) contactSelectConfig) != null && (contactData = selected2.contacts) != null) {
                IMAiGroupShotConfig.Action actionLIZ = contactSelectConfig.LIZ();
                if (actionLIZ instanceof IMAiGroupShotConfig.Action.TakePhotoAndSend) {
                    if (!(contactData instanceof IMAiGroupShotConfig.ContactSelectConfig.ContactData.NoAction) && !(contactData instanceof IMAiGroupShotConfig.ContactSelectConfig.ContactData.UserIds)) {
                        if (contactData instanceof IMAiGroupShotConfig.ContactSelectConfig.ContactData.ConversationIds) {
                            InterfaceC911930Zq3 interfaceC911930Zq3LJIIZILJ = C912070ZqH.LIZIZ.LJIIZILJ();
                            List<String> list = ((IMAiGroupShotConfig.ContactSelectConfig.ContactData.ConversationIds) contactData).conversationIds;
                            C1786280waI c1786280waI = EnumC1786290waJ.Companion;
                            String strLIZ = iMAiGroupShotConfig.entry.LIZ();
                            c1786280waI.getClass();
                            IMAiGroupShotConfig.Action.TakePhotoAndSend takePhotoAndSend = (IMAiGroupShotConfig.Action.TakePhotoAndSend) actionLIZ;
                            interfaceC911930Zq3LJIIZILJ.LJIIJJI(c19eg, list, str, C1786280waI.LIZ(strLIZ), EnumC1711006my.INITIATE, takePhotoAndSend.enterFrom, 0, takePhotoAndSend.showToast, null, null, null);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("wrong contact type for take photo and send: ");
                    sbLIZ3.append(C13LE.LIZ(contactData.getClass()).LJI());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    return;
                }
                if (actionLIZ instanceof IMAiGroupShotConfig.Action.CreateNewGroup) {
                    if (!(contactData instanceof IMAiGroupShotConfig.ContactSelectConfig.ContactData.NoAction) && !(contactData instanceof IMAiGroupShotConfig.ContactSelectConfig.ContactData.ConversationIds)) {
                        if (contactData instanceof IMAiGroupShotConfig.ContactSelectConfig.ContactData.UserIds) {
                            final Context contextP3 = C786410Ut5.P3(c19eg);
                            List<String> list2 = ((IMAiGroupShotConfig.ContactSelectConfig.ContactData.UserIds) contactData).userIds;
                            final String str7 = ((IMAiGroupShotConfig.Action.CreateNewGroup) actionLIZ).enterFrom;
                            AIGroupShotEntry aIGroupShotEntry2 = iMAiGroupShotConfig.entry;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("createNewGroupChat start: ");
                            sbLIZ4.append(C13LP.LJJLIIIJ(list2, " ", null, null, 0, null, null, 62));
                            C2188811AlT.LIZIZ(sbLIZ4);
                            C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "im", "select_user_panel").LIZ(new C1229390i65(list2, null, EnumC913760Zt0.AI_SHOT_GROUP, null, null, null, null, null, null, 506), new C1229400i66(str7, "group_shot_create_group", (Map<String, String>) C2097908Jt.LIZJ(new Pair("position", aIGroupShotEntry2.LIZ())), EnumC1230500i7s.CREATE_GROUP_AI_SHOT), new C1231500i9U() { // from class: X.0ZqP
                                @Override // X.C1231500i9U, X.InterfaceC863580XuG, X.InterfaceC863600XuI
                                public final void LIZIZ(C0YMW c0ymw) {
                                    super.LIZIZ(c0ymw);
                                    C1786270waH c1786270waH = C1786270waH.LIZ;
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("failure: ");
                                    sbLIZ5.append(c0ymw);
                                    C2188811AlT.LIZIZ(sbLIZ5);
                                    c1786270waH.getClass();
                                }

                                @Override // X.C1231500i9U, X.InterfaceC863580XuG
                                /* JADX INFO: renamed from: LIZJ */
                                public final void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
                                    IMContact iMContactLJI;
                                    super.LJ(c0y8t, c0ymw);
                                    C1786270waH c1786270waH = C1786270waH.LIZ;
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("onSuccessWithInfo: ");
                                    sbLIZ5.append(c0ymw);
                                    C2188811AlT.LIZIZ(sbLIZ5);
                                    c1786270waH.getClass();
                                    if (c0y8t != null) {
                                        String str8 = str;
                                        Context context = contextP3;
                                        String str9 = str7;
                                        C911450ZpH c911450ZpH = C911450ZpH.LIZ;
                                        String conversationId = c0y8t.getConversationId();
                                        c911450ZpH.getClass();
                                        C911450ZpH.LJI(new C911460ZpI(conversationId, str8, null));
                                        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                                        IIMContactUtilService.LIZ.getClass();
                                        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                                        if (iIMContactUtilServiceLIZ != null && (iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8t)) != null) {
                                            EnterChatParams enterChatParams = new EnterChatParams(context, iMContactLJI);
                                            enterChatParams.setNewGroupChat(true);
                                            enterChatParams.setChatType(3);
                                            enterChatParams.setEnterMethodForMob("group_shot_create_group");
                                            enterChatParams.setSessionId(c0y8t.getConversationId());
                                            enterChatParams.setEnterFromForMob(str9);
                                            enterChatParams.setExtras(C2097608Jq.LJIIJ(new Pair("ai_group_shot_extras", str8)));
                                            imChatService.LJIILLIIL(enterChatParams, null);
                                        }
                                    }
                                }
                            }, null);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("wrong contact type for create group: ");
                    sbLIZ5.append(C13LE.LIZ(contactData.getClass()).LJI());
                    C2188811AlT.LIZIZ(sbLIZ5);
                    return;
                }
                if (actionLIZ instanceof IMAiGroupShotConfig.Action.Dismiss) {
                    ((IMAiGroupShotConfig.Action.Dismiss) actionLIZ).action.invoke(iMAiGroupShotConfig);
                    return;
                }
                throw new C1954807lC();
            }
            "must be ContactSelectConfig.Selected".toString();
            throw new IllegalStateException("must be ContactSelectConfig.Selected");
        }
        "must be TemplateConfig.Selected".toString();
        throw new IllegalStateException("must be TemplateConfig.Selected");
    }

    public static void LIZJ(C19EG c19eg, Fragment fragment, BaseFragment baseFragment) {
        if (fragment == null) {
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = baseFragment;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            c1390920mIc.LIZ.LLJLL = true;
            c1390920mIc.LJI(53);
            c1390920mIc.LIZ.LLILZIL = true;
            int iLIZ = (int) (((double) C497820Jfg.LIZ(c19eg)) * 0.9d);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = iLIZ;
            tuxSheet2.show(supportFragmentManager, "IMAiGroupShotFlowController");
            return;
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIJI(fragment, baseFragment, true, null, 8);
    }

    public static void LIZ(IMAiGroupShotConfig.CustomClick customClick, C19EG c19eg, Fragment fragment, IMAiGroupShotConfig iMAiGroupShotConfig) {
        EnumC1786290waJ enumC1786290waJ;
        if (customClick instanceof IMAiGroupShotConfig.CustomClick.MoveToNext) {
            IMAiGroupShotConfig.CustomClick.MoveToNext moveToNext = (IMAiGroupShotConfig.CustomClick.MoveToNext) customClick;
            IMAiGroupShotConfig.TemplateConfig templateConfig = moveToNext.newTemplateConfig;
            if (templateConfig == null) {
                templateConfig = iMAiGroupShotConfig.templateConfig;
            }
            IMAiGroupShotConfig.ContactSelectConfig contactSelectConfig = moveToNext.newContactSelectConfig;
            if (contactSelectConfig == null) {
                contactSelectConfig = iMAiGroupShotConfig.contactSelectConfig;
            }
            LIZIZ(c19eg, IMAiGroupShotConfig.LIZ(iMAiGroupShotConfig, templateConfig, contactSelectConfig, 1), fragment);
            return;
        }
        if (customClick instanceof IMAiGroupShotConfig.CustomClick.DismissPanel) {
            final Context contextP3 = C786410Ut5.P3(c19eg);
            IMAiGroupShotConfig.CustomClick.DismissPanel dismissPanel = (IMAiGroupShotConfig.CustomClick.DismissPanel) customClick;
            String str = dismissPanel.createQrGroup.enterFrom;
            AIGroupShotEntry aIGroupShotEntry = iMAiGroupShotConfig.entry;
            aIGroupShotEntry.getClass();
            if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.InChat.InChatAnchor.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.IN_CHAT_ANCHOR;
            } else if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.InChat.InlineMessage.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.INLINE_MSG;
            } else if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.InChat.ActionBar.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.ACTION_BAR;
            } else if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.InChat.MessageCardTryDetail.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.TRY_DETAIL_PAGE;
            } else if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.InChat.MessageCardTryGroupShot.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.TRY_GROUP_SHOT_BUTTON;
            } else if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.InChat.GroupShotCard.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.GROUP_SHOT_CARD;
            } else if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.OutChat.InboxBottomPopup.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.INBOX_POPUP;
            } else if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.OutChat.InboxTopBanner.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.INBOX_BANNER;
            } else if (Intrinsics.LJFF(aIGroupShotEntry, AIGroupShotEntry.OutChat.OutChatAnchor.INSTANCE)) {
                enumC1786290waJ = EnumC1786290waJ.OUT_CHAT_ANCHOR;
            } else {
                throw new C1954807lC();
            }
            final String str2 = dismissPanel.createQrGroup.selectedEffectTemplateId;
            C1231470i9R c1231470i9RLIZIZ = C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "im", "select_user_panel");
            C13BV c13bv = C13BV.INSTANCE;
            EnumC913760Zt0 enumC913760Zt0 = EnumC913760Zt0.QR_CODE_GROUP;
            EnumC1229430i69 enumC1229430i69 = EnumC1229430i69.QR_CODE_GROUP_SHOT_GROUP;
            c1231470i9RLIZIZ.LIZ(new C1229390i65(c13bv, null, enumC913760Zt0, null, null, C2097908Jt.LIZJ(new Pair("a:et_group_type", enumC1229430i69.getValue())), null, null, null, 474), new C1229400i66(str, "group_shot_qr_group", (Map<String, String>) C2097608Jq.LJIIIIZZ(new Pair("position", enumC1786290waJ.getEntranceValue()), new Pair("group_type", enumC1229430i69.getValue())), EnumC1230500i7s.CREATE_GROUP_AI_SHOT), new C1231500i9U() { // from class: X.0ZqO
                @Override // X.C1231500i9U, X.InterfaceC863580XuG
                /* JADX INFO: renamed from: LIZJ */
                public final void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
                    super.LJ(c0y8t, c0ymw);
                    if (c0y8t == null) {
                        return;
                    }
                    C911450ZpH c911450ZpH = C911450ZpH.LIZ;
                    String conversationId = c0y8t.getConversationId();
                    String str3 = str2;
                    c911450ZpH.getClass();
                    IMContact iMContactLJI = null;
                    C911450ZpH.LJI(new C911460ZpI(conversationId, str3, null));
                    IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                    Context context = contextP3;
                    IIMContactUtilService.LIZ.getClass();
                    IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                    if (iIMContactUtilServiceLIZ != null) {
                        iMContactLJI = iIMContactUtilServiceLIZ.LJI(c0y8t);
                    }
                    EnterChatParams enterChatParams = new EnterChatParams(context, iMContactLJI);
                    String str4 = str2;
                    enterChatParams.setChatType(3);
                    enterChatParams.setEnterMethodForMob("group_shot");
                    enterChatParams.setSessionId(c0y8t.getConversationId());
                    enterChatParams.setEnterFromForMob("group_shot");
                    enterChatParams.setExtras(C2097608Jq.LJIIJ(new Pair("ai_group_shot_extras", str4)));
                    imChatService.LJIILLIIL(enterChatParams, null);
                }
            }, null);
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragment, C343970De7.LIZ);
            return;
        }
        throw new C1954807lC();
    }
}
