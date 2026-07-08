package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BatchUpdateMessage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import defpackage.k9;
import defpackage.r2;
import defpackage.w2;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS77S1000000_27;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yWC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$regenerateAnswerMessage$1", f = "MessageViewModel.kt", l = {4615}, m = "invokeSuspend")
public final class C1860620yWC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ Message LLILLL;
    public final /* synthetic */ Message LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860620yWC(MessageViewModel messageViewModel, Message message, Message message2, int i, int i2, Map<String, String> map, Map<String, String> map2, InterfaceC1364105Vn<? super C1860620yWC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = message;
        this.LLILZ = message2;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = map;
        this.LLIZLLLIL = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860620yWC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Long lLJFF;
        Integer numLJ;
        Map mapLIZ;
        C1862900yZs c1862900yZs;
        C1C7U.LIZ("MessageViewModel@9229.regenerateAnswerMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final MessageViewModel messageViewModel = this.LLILLJJLI;
            final Message message = this.LLILLL;
            messageViewModel.LLJLLIL.add(new InterfaceC1861530yXf() { // from class: X.0CoK
                @Override // X.InterfaceC1861530yXf
                public final void LIZ(Message message2) {
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZIZ(Message message2) {
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZJ(Message message2, int i2, String str, Map<String, String> map) {
                    if (message2.LIZIZ == 3) {
                        messageViewModel.LLJLLIL.remove(this);
                        message2.LIZIZ = 6;
                        MessageViewModel.nR2(messageViewModel, message2, false, 6);
                        Message messageLIZLLL = Message.LIZLLL(message, null, 0, false, 0, false, null, false, -536870913, 2097151);
                        MessageViewModel messageViewModel2 = messageViewModel;
                        BatchUpdateMessage batchUpdateMessageLJ = C1855920yOc.LJ(messageLIZLLL, Collections.singletonList(3));
                        List listSingletonList = Collections.singletonList(C1855920yOc.LJ(messageLIZLLL, Collections.singletonList(3)));
                        messageViewModel2.getClass();
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel2), C0PEM.LIZJ, null, new C320090Cgh(messageViewModel2, batchUpdateMessageLJ, listSingletonList, false, null, null), 2);
                        MessageViewModel messageViewModel3 = messageViewModel;
                        messageViewModel3.getClass();
                        messageViewModel3.setState(AFwS269S0000000_27.get$arr$(17));
                    }
                }

                @Override // X.InterfaceC1861530yXf
                public final void LIZLLL(Message message2, int i2, boolean z, String str, int i3, String str2, Extra extra, String str3, String str4, Integer num, Integer num2, String str5, String str6, C1862650yZT c1862650yZT, Map map) {
                    messageViewModel.LLJLLIL.remove(this);
                    if (C1858670yT3.LJFF(message2) && C123100dR.LIZ(message2.replyMsgId) && !Intrinsics.LJFF(message2.replyMsgId, CardStruct.IStatusCode.DEFAULT)) {
                        if (C1858670yT3.LJ(message2)) {
                            MessageViewModel messageViewModel2 = messageViewModel;
                            messageViewModel2.getClass();
                            messageViewModel2.setState(AFwS269S0000000_27.get$arr$(17));
                        }
                        if (C1858670yT3.LJIILLIIL(message2)) {
                            Message messageLIZLLL = Message.LIZLLL(message2, null, 0, true, 0, false, null, false, -536870913, 2097151);
                            Message messageLIZLLL2 = Message.LIZLLL(message, null, 0, false, 0, false, null, false, -536870913, 2097151);
                            MessageViewModel messageViewModel3 = messageViewModel;
                            BatchUpdateMessage batchUpdateMessageLJ = C1855920yOc.LJ(messageLIZLLL2, Collections.singletonList(3));
                            List listLJIIJJI = C1697810uHb.LJIIJJI(C1855920yOc.LJ(messageLIZLLL, Collections.singletonList(3)), C1855920yOc.LJ(messageLIZLLL2, Collections.singletonList(3)));
                            messageViewModel3.getClass();
                            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(messageViewModel3), C0PEM.LIZJ, null, new C320090Cgh(messageViewModel3, batchUpdateMessageLJ, listLJIIJJI, true, null, null), 2);
                            message2.LIZIZ = 9;
                            MessageViewModel.nR2(messageViewModel, messageLIZLLL, true, 2);
                            TakoMixFeed takoMixFeedLJIIIZ = messageLIZLLL2.LJIIIZ();
                            if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 301) {
                                MessageViewModel messageViewModel4 = messageViewModel;
                                String str7 = messageLIZLLL2.uuid;
                                messageViewModel4.getClass();
                                messageViewModel4.setState(new AwS77S1000000_27(str7, 3));
                                return;
                            }
                            return;
                        }
                        MessageViewModel messageViewModel5 = messageViewModel;
                        Message message3 = message;
                        messageViewModel5.getClass();
                        messageViewModel5.HQ2(new w2(w2.a.DELETE, Collections.singletonList(message3), false, false, false, 0, null, null, new k9(null, null, null, 127), 252), true);
                    }
                }
            });
            C1863380yae c1863380yae = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae != null) {
                Message message2 = this.LLILLL;
                Message message3 = this.LLILZ;
                int i2 = this.LLILZIL;
                int i3 = this.LLILZLL;
                this.LL = 1;
                Object objLJIILL = c1863380yae.LJIILL.LJIILL(new r2(16, message3, null, null, null, null, null, null, null, null, 0, 0, null, null, false, c1863380yae, null, null, null, null, null, null, null, null, null, false, null, i2, i3, false, null, message2, 0, null, null, null, false, null, null, false, false, false, false, null, 1744797692, 8191), this);
                if (objLJIILL != C099R.LJFF()) {
                    objLJIILL = Unit.LIZ;
                }
                if (objLJIILL == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.regenerateAnswerMessage$1");
                    return objLJFF;
                }
            }
        }
        C201996141y c201996141y = C201996141y.LIZ;
        C1863380yae c1863380yae2 = this.LLILLJJLI.LLJJJJ;
        if (c1863380yae2 != null) {
            lLJFF = C2286608xc.LJFF(c1863380yae2.LJII);
        } else {
            lLJFF = null;
        }
        C1863380yae c1863380yae3 = this.LLILLJJLI.LLJJJJ;
        if (c1863380yae3 != null) {
            numLJ = C2286608xc.LJ(c1863380yae3.LJIIIIZZ);
        } else {
            numLJ = null;
        }
        c201996141y.getClass();
        String strLJ = C201996141y.LJ(numLJ, lLJFF);
        if (strLJ != null) {
            this.LLIZLLLIL.put("is_memory", strLJ);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Map<String, String> map = this.LLIZ;
        Map<String, String> map2 = this.LLIZLLLIL;
        TakoEnterParams takoEnterParams = this.LLILLJJLI.LLILLL;
        if (takoEnterParams != null) {
            mapLIZ = C1862500yZE.LIZ(takoEnterParams, false);
        } else {
            mapLIZ = null;
        }
        c1862330yYx.getClass();
        C1862330yYx.LJLLI(map, map2, mapLIZ);
        String str = this.LLIZ.get("enter_from");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.LLIZ.get("enter_method");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLIZ.get("process_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.LLIZ.get("sub_process_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.LLIZ.get("action_item_id");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = this.LLIZ.get("bot_id");
        if (str7 == null) {
            str7 = "";
        }
        String str8 = this.LLIZLLLIL.get("message_id");
        if (str8 == null) {
            str8 = "";
        }
        String str9 = this.LLIZLLLIL.get("server_message_id");
        if (str9 == null) {
            str9 = "";
        }
        String str10 = this.LLIZLLLIL.get("log_id");
        if (str10 == null) {
            str10 = "";
        }
        String str11 = this.LLIZLLLIL.get("status_code");
        if (str11 == null) {
            str11 = "";
        }
        String str12 = this.LLIZ.get("search_id");
        if (str12 == null) {
            str12 = "";
        }
        String str13 = this.LLIZLLLIL.get("message_type");
        if (str13 == null) {
            str13 = "";
        }
        String str14 = this.LLIZLLLIL.get("image_info");
        if (str14 == null) {
            str14 = "";
        }
        String str15 = this.LLIZ.get("sub_enter_method");
        if (str15 != null) {
            Map<String, String> map3 = this.LLIZ;
            String str16 = map3.get("sub_process_id");
            if (str16 == null) {
                str16 = "";
            }
            String str17 = map3.get("bot_id");
            if (str17 == null) {
                str17 = "";
            }
            c1862900yZs = new C1862900yZs(str16, str15, str17);
        } else {
            c1862900yZs = null;
        }
        String str18 = this.LLIZ.get("mode");
        if (str18 == null) {
            str18 = "";
        }
        String str19 = this.LLIZ.get("tako_session_id");
        if (str19 == null) {
            str19 = "";
        }
        String str20 = this.LLIZ.get("tako_chat_id");
        if (str20 == null) {
            str20 = "";
        }
        C1862330yYx.LJIJJLI(c1862330yYx, str, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, c1862900yZs, str18, null, str19, str20, 294912);
        String str21 = this.LLIZ.get("enter_from");
        if (str21 == null) {
            str21 = "";
        }
        String str22 = this.LLIZ.get("enter_method");
        if (str22 == null) {
            str22 = "";
        }
        String str23 = this.LLIZ.get("process_id");
        if (str23 == null) {
            str23 = "";
        }
        String str24 = this.LLIZ.get("sub_process_id");
        if (str24 == null) {
            str24 = "";
        }
        String str25 = this.LLIZ.get("action_item_id");
        if (str25 == null) {
            str25 = "";
        }
        String str26 = this.LLIZ.get("bot_id");
        if (str26 == null) {
            str26 = "";
        }
        String str27 = this.LLIZLLLIL.get("message_id");
        if (str27 == null) {
            str27 = "";
        }
        String str28 = this.LLIZLLLIL.get("server_message_id");
        if (str28 == null) {
            str28 = "";
        }
        String str29 = this.LLIZLLLIL.get("log_id");
        if (str29 == null) {
            str29 = "";
        }
        String str30 = this.LLIZLLLIL.get("status_code");
        if (str30 == null) {
            str30 = "";
        }
        String str31 = this.LLIZ.get("search_id");
        if (str31 == null) {
            str31 = "";
        }
        String str32 = this.LLIZLLLIL.get("message_type");
        if (str32 == null) {
            str32 = "";
        }
        String str33 = this.LLIZLLLIL.get("image_info");
        if (str33 == null) {
            str33 = "";
        }
        String str34 = this.LLIZ.get("sub_enter_method");
        if (str34 == null) {
            str34 = "";
        }
        String str35 = this.LLIZ.get("mode");
        if (str35 == null) {
            str35 = "";
        }
        String str36 = this.LLIZ.get("tako_session_id");
        if (str36 == null) {
            str36 = "";
        }
        String str37 = this.LLIZ.get("tako_chat_id");
        if (str37 != null) {
            str2 = str37;
        }
        C1862330yYx.LJIL(c1862330yYx, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.regenerateAnswerMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
