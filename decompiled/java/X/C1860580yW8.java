package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.ActionDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.EntryDoc;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoEditInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoReferenceInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.request.ExtraRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS122S0400000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yW8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$retryAnswerMessage$1", f = "MessageViewModel.kt", l = {3427}, m = "invokeSuspend")
public final class C1860580yW8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MessageViewModel LL;
    public C1863380yae LLILLJJLI;
    public Message LLILLL;
    public int LLILZ;
    public final /* synthetic */ MessageViewModel LLILZIL;
    public final /* synthetic */ Message LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860580yW8(MessageViewModel messageViewModel, Message message, InterfaceC1364105Vn<? super C1860580yW8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = messageViewModel;
        this.LLILZLL = message;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860580yW8(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        MessageViewModel messageViewModel;
        C1863380yae c1863380yae;
        Object next;
        Message messageLJIILL;
        String str;
        Long lLJFF;
        String enterSearchId;
        TakoReferenceAskInfo takoReferenceAskInfoLJFF;
        TakoEditAskInfo takoEditAskInfoLJ;
        Long lLJFF2;
        Integer numLJ;
        Map<String, String> map;
        String str2;
        ExtraRequestInfo extraRequestInfo;
        TakoReferenceAskInfo takoReferenceAskInfoLJFF2;
        TakoEditAskInfo takoEditAskInfoLJ2;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        int iIntValue;
        int iIntValue2;
        String str3;
        String str4;
        String str5;
        C1C7U.LIZ("MessageViewModel@9229.retryAnswerMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                messageLJIILL = this.LLILLL;
                c1863380yae = this.LLILLJJLI;
                messageViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            messageViewModel = this.LLILZIL;
            c1863380yae = messageViewModel.LLJJJJ;
            if (c1863380yae != null) {
                Message message = this.LLILZLL;
                Iterator<T> it2 = messageViewModel.getState().LL.LIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Message messageLIZ = C321970Cjj.LIZ((InterfaceC1858000yRy) next);
                        if (messageLIZ != null) {
                            str = messageLIZ.msgId;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, message.replyMsgId)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InterfaceC1858000yRy interfaceC1858000yRy = (InterfaceC1858000yRy) next;
                if ((interfaceC1858000yRy != null && (messageLJIILL = C321970Cjj.LIZ(interfaceC1858000yRy)) != null) || (messageLJIILL = c1863380yae.LJIILL(message.replyMsgId)) != null) {
                    List<Message> listLJIIJJI = C1697810uHb.LJIIJJI(messageLJIILL, message);
                    this.LL = messageViewModel;
                    this.LLILLJJLI = c1863380yae;
                    this.LLILLL = messageLJIILL;
                    this.LLILZ = 1;
                    if (c1863380yae.LJII(messageLJIILL, listLJIIJJI, this) == objLJFF) {
                        C1C7U.LIZIZ("MessageViewModel@9229.retryAnswerMessage$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageViewModel@9229.retryAnswerMessage$1");
                    return unit;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageViewModel@9229.retryAnswerMessage$1");
            return unit2;
        }
        TakoMixFeed takoMixFeedLJIIIZ = messageLJIILL.LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            C830490Whz c830490Whz = new C830490Whz();
            EntryDoc entryDocInvoke = c1863380yae.LIZ.invoke();
            String str6 = entryDocInvoke.enterFrom;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            c830490Whz.put("enter_from", str6);
            String str8 = entryDocInvoke.enterMethod;
            if (str8 == null) {
                str8 = "";
            }
            c830490Whz.put("enter_method", str8);
            String str9 = c1863380yae.LJ;
            if (str9 == null) {
                str9 = "";
            }
            c830490Whz.put("process_id", str9);
            ActionDoc actionDocInvoke = c1863380yae.LIZIZ.invoke();
            c830490Whz.put("sub_process_id", actionDocInvoke.subSessionId);
            c830490Whz.put("action_item_id", String.valueOf(C0R2Q.LIZIZ(C2286608xc.LJFF(actionDocInvoke.actionId))));
            C1863380yae c1863380yae2 = messageViewModel.LLJJJJ;
            if (c1863380yae2 != null) {
                lLJFF = C2286608xc.LJFF(c1863380yae2.LJII);
            } else {
                lLJFF = null;
            }
            c830490Whz.put("bot_id", String.valueOf(lLJFF));
            TakoEnterParams takoEnterParams = messageViewModel.LLILLL;
            if (takoEnterParams != null) {
                enterSearchId = takoEnterParams.getEnterSearchId();
            } else {
                enterSearchId = null;
            }
            c830490Whz.put("search_id", enterSearchId);
            C830490Whz c830490Whz2 = new C830490Whz();
            c830490Whz2.put("is_resend", "1");
            c830490Whz2.put("interaction_type", "quick_reaction");
            c830490Whz2.put("message_content", takoMixFeedLJIIIZ.text);
            c830490Whz2.put("message_id", messageLJIILL.uuid);
            int i2 = messageLJIILL.msgType;
            if (i2 == 7) {
                List<BaseVideo> list = takoMixFeedLJIIIZ.videos;
                if (!((Boolean) C0AXO.LIZ.getValue()).booleanValue() && takoMixFeedLJIIIZ.fromVideoSug && list != null && !list.isEmpty()) {
                    String str10 = takoMixFeedLJIIIZ.text;
                    if (str10 == null) {
                        str10 = "";
                    }
                    BaseVideo baseVideo = (BaseVideo) C13LP.LJJJJZI(list);
                    BaseImage baseImage = (BaseImage) C13LP.LJJJLL(takoMixFeedLJIIIZ.images);
                    Map<String, String> map2 = takoMixFeedLJIIIZ.msgExt;
                    if (map2 != null && (str5 = map2.get("video_sug_msg_id")) != null) {
                        lLJIILIIL = C2095008Iq.LJIILIIL(str5);
                    } else {
                        lLJIILIIL = null;
                    }
                    Map<String, String> map3 = takoMixFeedLJIIIZ.msgExt;
                    if (map3 != null && (str4 = map3.get("video_sug_query_msg_id")) != null) {
                        lLJIILIIL2 = C2095008Iq.LJIILIIL(str4);
                    } else {
                        lLJIILIIL2 = null;
                    }
                    ExtraRequestInfo extraRequestInfo2 = new ExtraRequestInfo(null, null, null, null, lLJIILIIL, lLJIILIIL2, true);
                    Integer numLJ2 = C2286608xc.LJ(messageLJIILL.LJFF);
                    if (numLJ2.intValue() == -1) {
                        iIntValue = 202;
                    } else {
                        iIntValue = numLJ2.intValue();
                    }
                    Integer numLJ3 = C2286608xc.LJ(2);
                    Map<String, String> map4 = takoMixFeedLJIIIZ.msgExt;
                    if (map4 != null && (str3 = map4.get("multi_language_interfere_key")) != null) {
                        str7 = str3;
                    }
                    MessageExt messageExt = messageLJIILL.ext;
                    String str11 = messageExt.imageStyleName;
                    Integer num = messageExt.aigcStandardRatio;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    messageViewModel.zQ2(str10, baseVideo, baseImage, extraRequestInfo2, iIntValue, 6, numLJ3, "image_to_video", str7, UUID.randomUUID().toString(), null, str11, iIntValue2);
                } else {
                    String str12 = takoMixFeedLJIIIZ.text;
                    List<BaseImage> list2 = takoMixFeedLJIIIZ.images;
                    List<ConvertStyleItem> list3 = takoMixFeedLJIIIZ.style;
                    EnumC1858090yS7 enumC1858090yS7 = EnumC1858090yS7.RETRY;
                    MessageExt messageExt2 = messageLJIILL.ext;
                    String str13 = messageExt2.imageTemplateId;
                    String str14 = messageExt2.modeSource;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (!a0.LJJJIL(str13)) {
                        linkedHashMap.put("image_template_id", str13);
                        linkedHashMap.put("is_unchanged_tako_template", Boolean.valueOf(messageLJIILL.ext.isUnchangedTakoTemplate));
                    }
                    if (!a0.LJJJIL(str14)) {
                        linkedHashMap.put("mode_source", str14);
                    }
                    Integer num2 = messageLJIILL.ext.activeTemplateType;
                    if (num2 != null) {
                        linkedHashMap.put("aigc_type", Integer.valueOf(num2.intValue()));
                    }
                    if (linkedHashMap.isEmpty()) {
                        extraRequestInfo = null;
                    } else {
                        extraRequestInfo = new ExtraRequestInfo(null, null, null, linkedHashMap, null, null, false);
                    }
                    TakoReferenceInfo takoReferenceInfo = messageLJIILL.referenceInfo;
                    if (takoReferenceInfo != null) {
                        takoReferenceAskInfoLJFF2 = C1855050yND.LJFF(takoReferenceInfo);
                    } else {
                        takoReferenceAskInfoLJFF2 = null;
                    }
                    TakoEditInfo takoEditInfo = messageLJIILL.editInfo;
                    if (takoEditInfo != null) {
                        takoEditAskInfoLJ2 = C1855050yND.LJ(takoEditInfo);
                    } else {
                        takoEditAskInfoLJ2 = null;
                    }
                    messageViewModel.xQ2(str12, list2, list3, true, UUID.randomUUID().toString(), enumC1858090yS7, 0, null, 0, "", "", new AwS122S0400000_27(c830490Whz2, takoMixFeedLJIIIZ, messageViewModel, c830490Whz, 2), false, extraRequestInfo, new LinkedHashMap(), takoReferenceAskInfoLJFF2, takoEditAskInfoLJ2);
                }
            } else if (i2 == 6) {
                MessageViewModel.cR2(messageViewModel, takoMixFeedLJIIIZ.videoList, takoMixFeedLJIIIZ.text);
            } else if (i2 == 8) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel), C0PEM.LIZJ, null, new C1857860yRk(takoMixFeedLJIIIZ.videoList, messageViewModel, messageLJIILL.uuid, takoMixFeedLJIIIZ.text, null), 2);
            } else {
                Map mapLIZ = null;
                String str15 = takoMixFeedLJIIIZ.text;
                EnumC1858090yS7 enumC1858090yS72 = EnumC1858090yS7.RETRY;
                TakoMixFeed takoMixFeedLJIIIZ2 = messageLJIILL.LJIIIZ();
                if (takoMixFeedLJIIIZ2 != null && (map = takoMixFeedLJIIIZ2.msgExt) != null && (str2 = map.get("multi_language_interfere_key")) != null) {
                    str7 = str2;
                }
                TakoReferenceInfo takoReferenceInfo2 = messageLJIILL.referenceInfo;
                if (takoReferenceInfo2 != null) {
                    takoReferenceAskInfoLJFF = C1855050yND.LJFF(takoReferenceInfo2);
                } else {
                    takoReferenceAskInfoLJFF = null;
                }
                TakoEditInfo takoEditInfo2 = messageLJIILL.editInfo;
                if (takoEditInfo2 != null) {
                    takoEditAskInfoLJ = C1855050yND.LJ(takoEditInfo2);
                } else {
                    takoEditAskInfoLJ = null;
                }
                messageViewModel.vQ2(str15, true, UUID.randomUUID().toString(), enumC1858090yS72, new LinkedHashMap(), null, null, str7, 0, null, 0, -1, null, takoReferenceAskInfoLJFF, takoEditAskInfoLJ);
                C201996141y c201996141y = C201996141y.LIZ;
                C1863380yae c1863380yae3 = messageViewModel.LLJJJJ;
                if (c1863380yae3 != null) {
                    lLJFF2 = C2286608xc.LJFF(c1863380yae3.LJII);
                } else {
                    lLJFF2 = null;
                }
                C1863380yae c1863380yae4 = messageViewModel.LLJJJJ;
                if (c1863380yae4 != null) {
                    numLJ = C2286608xc.LJ(c1863380yae4.LJIIIIZZ);
                } else {
                    numLJ = null;
                }
                c201996141y.getClass();
                String strLJ = C201996141y.LJ(numLJ, lLJFF2);
                if (strLJ != null) {
                    c830490Whz2.put("is_memory", strLJ);
                }
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                Map mapLJIIL = C2097608Jq.LJIIL(c830490Whz, C2097908Jt.LIZJ(new Pair("mode", messageViewModel.FQ2())));
                TakoEnterParams takoEnterParams2 = messageViewModel.LLILLL;
                if (takoEnterParams2 != null) {
                    mapLIZ = C1862500yZE.LIZ(takoEnterParams2, false);
                }
                c1862330yYx.getClass();
                C1862330yYx.LJLLI(mapLJIIL, c830490Whz2, mapLIZ);
            }
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.retryAnswerMessage$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
