package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestBottomContainerAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestListAssemV2;
import com.ss.android.ugc.aweme.msg.AwemeCardCenterAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tools.chat.message.component.AiChatMessageInfraComponent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Ztj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914210Ztj extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3, obj4);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(InterfaceC748170TWl interfaceC748170TWl, int i) {
        super(4);
        this.$t = i;
        this.l0 = interfaceC748170TWl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(C0YY6 c0yy6, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0yy6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(C0YYJ c0yyj, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0yyj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(C0YYM c0yym, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0yym;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(C0YYQ c0yyq, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0yyq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(C0YYS c0yys, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0yys;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(C901520ZYg c901520ZYg, int i) {
        super(4);
        this.$t = i;
        this.l0 = c901520ZYg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(MessageRequestBottomContainerAssem messageRequestBottomContainerAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = messageRequestBottomContainerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(MessageRequestListAssemV2 messageRequestListAssemV2, int i) {
        super(4);
        this.$t = i;
        this.l0 = messageRequestListAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(AwemeCardCenterAssem awemeCardCenterAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = awemeCardCenterAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914210Ztj(AiChatMessageInfraComponent aiChatMessageInfraComponent, int i) {
        super(4);
        this.$t = i;
        this.l0 = aiChatMessageInfraComponent;
    }

    public static final Object invoke$0(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        ((C901520ZYg) c914210Ztj.l0).LIZIZ.invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        int size;
        Collection collection = (Collection) obj2;
        Iterable iterable = (Iterable) obj3;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        List listLJLIL = C13LP.LJLIL(iterable, collection);
        MessageRequestBottomContainerAssem messageRequestBottomContainerAssem = (MessageRequestBottomContainerAssem) c914210Ztj.l0;
        messageRequestBottomContainerAssem.getClass();
        if (obj4 == EnumC880850Yh1.MULTI_SELECT) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : (ArrayList) listLJLIL) {
                if (Intrinsics.LJFF(((AbstractC885540Yoa) obj5).LIZLLL(), Boolean.TRUE)) {
                    arrayList.add(obj5);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        if (C885630Yoj.LIZIZ()) {
            if (obj4 == EnumC880850Yh1.MULTI_SELECT) {
                C337180DJs.LIZJ((View) messageRequestBottomContainerAssem.LLJJI.getValue());
                C337180DJs.LIZ((View) messageRequestBottomContainerAssem.LLJJIII.getValue());
                if (size != 0 && size != ((ArrayList) listLJLIL).size()) {
                    messageRequestBottomContainerAssem.lp().setText(C1383370m6R.LJIIJ(2131830295));
                    messageRequestBottomContainerAssem.kp().setText(C1383370m6R.LJIIJ(2131821866));
                } else {
                    messageRequestBottomContainerAssem.lp().setText(C1383370m6R.LJIIJ(2131830296));
                    messageRequestBottomContainerAssem.kp().setText(C1383370m6R.LJIIJ(2131821863));
                }
                if (size > 0) {
                    C786410Ut5.B5((TuxTextView) messageRequestBottomContainerAssem.LLJJJ.getValue(), 1.0f);
                } else {
                    C786410Ut5.B5((TuxTextView) messageRequestBottomContainerAssem.LLJJJ.getValue(), 0.5f);
                }
            } else {
                C337180DJs.LIZJ((View) messageRequestBottomContainerAssem.LLJJIII.getValue());
                C337180DJs.LIZ((View) messageRequestBottomContainerAssem.LLJJI.getValue());
            }
        } else if (obj4 == EnumC880850Yh1.MULTI_SELECT && size > 0) {
            C337180DJs.LIZJ((View) messageRequestBottomContainerAssem.LLJJI.getValue());
            if (size == ((ArrayList) listLJLIL).size()) {
                messageRequestBottomContainerAssem.kp().setText(C1383370m6R.LJIIJ(2131821863));
                messageRequestBottomContainerAssem.lp().setText(C1383370m6R.LJIIJ(2131821864));
            } else {
                messageRequestBottomContainerAssem.kp().setText(C1383370m6R.LJIIJ(2131821866));
                messageRequestBottomContainerAssem.lp().setText(C1383370m6R.LJIIJ(2131821867));
            }
        } else {
            C337180DJs.LIZ((View) messageRequestBottomContainerAssem.LLJJI.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC887940YsS abstractC887940YsS;
        EnumC871430YGn enumC871430YGn;
        List list = (List) obj2;
        EnumC880850Yh1 enumC880850Yh1 = (EnumC880850Yh1) obj3;
        C878960Ydy c878960Ydy = (C878960Ydy) obj4;
        if (list == null) {
            abstractC887940YsS = C887960YsU.LIZ;
        } else if (list.isEmpty()) {
            abstractC887940YsS = C887950YsT.LIZ;
        } else {
            abstractC887940YsS = C887970YsV.LIZ;
        }
        ((MessageRequestListAssemV2) c914210Ztj.l0).Ho(abstractC887940YsS, c878960Ydy);
        if (!C300860Bqm.LIZ()) {
            MessageRequestListAssemV2 messageRequestListAssemV2 = (MessageRequestListAssemV2) c914210Ztj.l0;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            C887750Ys9 c887750Ys9 = (C887750Ys9) messageRequestListAssemV2.LLJILJILJ.getValue();
            if (c887750Ys9 != null && (enumC871430YGn = c887750Ys9.LLILLJJLI) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(((C887820YsG) ((AssemViewModel) messageRequestListAssemV2.LLJIJIL.getValue()).getState()).LLILZLL);
                linkedHashMap.put(enumC871430YGn, Boolean.valueOf(list.isEmpty()));
                AssemViewModel assemViewModel = (AssemViewModel) messageRequestListAssemV2.LLJIJIL.getValue();
                assemViewModel.getClass();
                assemViewModel.setState(new AwS380S0200000_14(enumC880850Yh1, (EnumC880850Yh1) linkedHashMap, (Map<EnumC871430YGn, Boolean>) 75));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        ((AiChatMessageInfraComponent) c914210Ztj.l0).LLJJJJ = new C904970Zep((View) obj, (ViewOnAttachStateChangeListenerC20604515jv) obj2, (LifecycleOwner) obj3, (ViewModelStoreOwner) obj4);
        AiChatMessageInfraComponent aiChatMessageInfraComponent = (AiChatMessageInfraComponent) c914210Ztj.l0;
        aiChatMessageInfraComponent.R80(aiChatMessageInfraComponent.K4());
        return Unit.LIZ;
    }

    public static final Object invoke$3(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        C1584506Ih.LIZ((View) ((AwemeCardCenterAssem) c914210Ztj.l0).LLJLLIL.getValue());
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0YXt] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0YWq] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final Object invoke$4(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        final ?? LJ;
        final String str = (String) obj;
        C0YXO c0yxo = (C0YXO) obj3;
        final CompletionBlock completionBlock = (CompletionBlock) obj4;
        final List<C0YAE> listLJLJJLL = c0yxo.LLILZIL.getPigeonIMClient().LIZIZ.LJFF(((C0YYM) c914210Ztj.l0).getConversationId()).LJLJJLL();
        List<C870400YCo> listLLL = c0yxo.LLILZIL.getPigeonIMClient().LIZIZ.LIZIZ().LLL(((C0YYM) c914210Ztj.l0).getConversationId());
        if (listLLL != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLLL, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (C870400YCo c870400YCo : listLLL) {
                LJ.put(Long.valueOf(c870400YCo.LLILLJJLI), c870400YCo);
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        c0yxo.LLILZIL.m144getConversationListManager().LIZLLL(((C0YYM) c914210Ztj.l0).getConversationId(), new InterfaceC863600XuI<C0Y8T>() { // from class: X.0YXt
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                String statusMsg;
                CompletionBlock<InterfaceC875920YXu> completionBlock2 = completionBlock;
                if (c0ymw == null || (statusMsg = c0ymw.getStatusMsg()) == null) {
                    statusMsg = "unknown error";
                }
                C2382909Vj.LIZ(completionBlock2, 9999, statusMsg, null, 4);
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(C0Y8T c0y8t) {
                Long lValueOf;
                Boolean boolValueOf;
                String strUtf8;
                String name;
                String string;
                Number numberValueOf;
                String desc;
                Map<String, String> ext;
                String icon;
                Map<String, String> mapLJ;
                Number numberValueOf2;
                String secOwner;
                String string2;
                Map<String, String> ext2;
                String str2;
                Map<String, String> ext3;
                String str3;
                C0Y8T c0y8t2 = c0y8t;
                String notice = null;
                if (c0y8t2 == null) {
                    C2382909Vj.LIZ(completionBlock, 1005, "conversation not found", null, 4);
                    return;
                }
                CompletionBlock<InterfaceC875920YXu> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(str, C13LE.LIZ(InterfaceC875920YXu.class));
                List<C0YAE> list = listLJLJJLL;
                String str4 = str;
                Map<Long, C870400YCo> map = LJ;
                InterfaceC875920YXu interfaceC875920YXu = (InterfaceC875920YXu) xBaseModelLIZJ;
                interfaceC875920YXu.setId(c0y8t2.getConversationId());
                interfaceC875920YXu.setShortId(String.valueOf(c0y8t2.getConversationShortId()));
                C0Y8Y coreInfo = c0y8t2.getCoreInfo();
                if (coreInfo != null && (ext3 = coreInfo.getExt()) != null && (str3 = ext3.get("countdown_time")) != null) {
                    lValueOf = Long.valueOf(CastLongProtector.parseLong(str3));
                } else {
                    lValueOf = null;
                }
                interfaceC875920YXu.setCountdownTime(lValueOf);
                C0Y8Y coreInfo2 = c0y8t2.getCoreInfo();
                if (coreInfo2 != null && (ext2 = coreInfo2.getExt()) != null && (str2 = ext2.get("countdown")) != null) {
                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(str2));
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                interfaceC875920YXu.setCountdown(boolValueOf);
                interfaceC875920YXu.setConversationType(Integer.valueOf(c0y8t2.getConversationType()));
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C0YAE c0yae : list) {
                    C0YY5 c0yy5 = (C0YY5) C1549500qQO.LIZJ(str4, C13LE.LIZ(C0YY5.class));
                    C870400YCo c870400YCo2 = map.get(Long.valueOf(c0yae.getUid()));
                    if (c870400YCo2 != null) {
                        string2 = Long.valueOf(c870400YCo2.LLILZ).toString();
                    } else {
                        string2 = null;
                    }
                    c0yy5.setPigeonReadIndex(string2);
                    c0yy5.setBizRole(c0yae.getAlias());
                    c0yy5.setUserId(String.valueOf(c0yae.getUid()));
                    c0yy5.setSortOrder(Long.valueOf(c0yae.getSortOrder()));
                    c0yy5.setSecUserId(c0yae.getSecUid());
                    arrayList.add(c0yy5);
                }
                interfaceC875920YXu.setMembers(arrayList);
                interfaceC875920YXu.setReadIndex(String.valueOf(c0y8t2.getReadIndex()));
                interfaceC875920YXu.setMember(Boolean.valueOf(c0y8t2.isMember()));
                interfaceC875920YXu.setUnreadCount(Long.valueOf(c0y8t2.getUnreadCount()));
                ByteString bizExt = c0y8t2.getBizExt();
                if (bizExt != null) {
                    strUtf8 = bizExt.utf8();
                } else {
                    strUtf8 = null;
                }
                interfaceC875920YXu.setBizExt(strUtf8);
                interfaceC875920YXu.setUpdateAt(Long.valueOf(c0y8t2.getUpdatedTime()));
                InterfaceC875940YXw interfaceC875940YXw = (InterfaceC875940YXw) C1549500qQO.LIZJ(str4, C13LE.LIZ(InterfaceC875940YXw.class));
                C0Y8Y coreInfo3 = c0y8t2.getCoreInfo();
                String str5 = "";
                if (coreInfo3 == null || (name = coreInfo3.getName()) == null) {
                    name = "";
                }
                interfaceC875940YXw.setName(name);
                C0Y8Y coreInfo4 = c0y8t2.getCoreInfo();
                if (coreInfo4 == null || (string = Long.valueOf(coreInfo4.getOwner()).toString()) == null) {
                    string = "";
                }
                interfaceC875940YXw.setOwnerId(string);
                C0Y8Y coreInfo5 = c0y8t2.getCoreInfo();
                if (coreInfo5 != null && (secOwner = coreInfo5.getSecOwner()) != null) {
                    str5 = secOwner;
                }
                interfaceC875940YXw.setSecOwnerId(str5);
                C0Y8Y coreInfo6 = c0y8t2.getCoreInfo();
                if (coreInfo6 != null) {
                    numberValueOf = Long.valueOf(coreInfo6.getVersion());
                } else {
                    numberValueOf = 1;
                }
                interfaceC875940YXw.setVersion(numberValueOf);
                C0Y8Y coreInfo7 = c0y8t2.getCoreInfo();
                if (coreInfo7 != null) {
                    desc = coreInfo7.getDesc();
                } else {
                    desc = null;
                }
                interfaceC875940YXw.setDesc(desc);
                C0Y8Y coreInfo8 = c0y8t2.getCoreInfo();
                if (coreInfo8 != null) {
                    ext = coreInfo8.getExt();
                } else {
                    ext = null;
                }
                interfaceC875940YXw.setExt(ext);
                C0Y8Y coreInfo9 = c0y8t2.getCoreInfo();
                if (coreInfo9 != null) {
                    icon = coreInfo9.getIcon();
                } else {
                    icon = null;
                }
                interfaceC875940YXw.setIcon(icon);
                C0Y8Y coreInfo10 = c0y8t2.getCoreInfo();
                if (coreInfo10 != null) {
                    notice = coreInfo10.getNotice();
                }
                interfaceC875940YXw.setNotice(notice);
                interfaceC875940YXw.setInboxType(Integer.valueOf(c0y8t2.getInboxType()));
                interfaceC875920YXu.setCoreInfo(interfaceC875940YXw);
                C0YY4 c0yy4 = (C0YY4) C1549500qQO.LIZJ(str4, C13LE.LIZ(C0YY4.class));
                C0Y8W settingInfo = c0y8t2.getSettingInfo();
                if (settingInfo == null || (mapLJ = settingInfo.getExt()) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                c0yy4.setExt(mapLJ);
                c0yy4.setReadIndex(String.valueOf(c0y8t2.getReadIndex()));
                c0yy4.setMinIndex(String.valueOf(c0y8t2.getMinIndex()));
                C0Y8W settingInfo2 = c0y8t2.getSettingInfo();
                if (settingInfo2 != null) {
                    numberValueOf2 = Long.valueOf(settingInfo2.getVersion());
                } else {
                    numberValueOf2 = 1;
                }
                c0yy4.setVersion(numberValueOf2);
                interfaceC875920YXu.setSettingInfo(c0yy4);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$5(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) obj2;
        C054G c054g = pigeonConversationDetailContainer.LLILZ;
        GECPigeon.Companion.getClass();
        AbstractC2252651DEx abstractC2252651DEx = C872060YIy.LIZ().LIZJ().LIZJ;
        C23250099c.LIZLLL(c054g, abstractC2252651DEx, null, new C875820YXk(pigeonConversationDetailContainer, (CompletionBlock) obj4, (C0YY6) c914210Ztj.l0, (String) obj, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) obj2;
        CompletionBlock completionBlock = (CompletionBlock) obj4;
        C054G c054g = pigeonConversationDetailContainer.LLILZ;
        C2126408Us c2126408Us = C2126308Ur.LIZ;
        C0YYQ c0yyq = (C0YYQ) c914210Ztj.l0;
        C23250099c.LIZLLL(c054g, c2126408Us, null, new C0YXV(pigeonConversationDetailContainer, completionBlock, c0yyq, (C0YXO) obj3, (String) obj, null), 2).LJII(new AwS592S0100000_13(completionBlock, (CompletionBlock<InterfaceC835900Wqi>) 86));
        return Unit.LIZ;
    }

    public static final Object invoke$7(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        ((C0YXO) obj3).LLILZIL.getPigeonIMClient().LIZIZ.LJFF(((C0YYS) c914210Ztj.l0).getConversationId()).LJJJJLL(new C914110ZtZ((CompletionBlock) obj4, (String) obj, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$8(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) obj2;
        C054G c054g = pigeonConversationDetailContainer.LLILZ;
        C2126408Us c2126408Us = C2126308Ur.LIZ;
        InterfaceC748170TWl interfaceC748170TWl = (InterfaceC748170TWl) c914210Ztj.l0;
        C23250099c.LIZLLL(c054g, c2126408Us, null, new C0YXU(interfaceC748170TWl, (C0YXO) obj3, (CompletionBlock) obj4, (String) obj, pigeonConversationDetailContainer, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(C914210Ztj c914210Ztj, Object obj, Object obj2, Object obj3, Object obj4) {
        PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) obj2;
        C054G c054g = pigeonConversationDetailContainer.LLILZ;
        GECPigeon.Companion.getClass();
        AbstractC2252651DEx abstractC2252651DEx = C872060YIy.LIZ().LIZJ().LIZJ;
        C23250099c.LIZLLL(c054g, abstractC2252651DEx, null, new C875830YXl(pigeonConversationDetailContainer, (CompletionBlock) obj4, (C0YYJ) c914210Ztj.l0, (String) obj, null), 2);
        return Unit.LIZ;
    }
}
